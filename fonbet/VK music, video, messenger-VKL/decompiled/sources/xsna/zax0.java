package xsna;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.ArrayMap;
import android.util.SparseArray;
import com.vk.api.generated.ads.dto.AdsAdvertiserInfoDto;
import com.vk.api.generated.badges.dto.BadgesDonutInfoDto;
import com.vk.api.generated.badges.dto.BadgesObjectEntriesCounterDto;
import com.vk.api.generated.badges.dto.BadgesObjectInfoDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseCommentsInfoDto;
import com.vk.api.generated.base.dto.BaseLikesInfoDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseLinkButtonStyleDto;
import com.vk.api.generated.base.dto.BaseRepostsInfoDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemWallpostFeedbackDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemCaptionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemColorDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderActionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderButtonDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderDescriptionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderImageDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderOverlayImageDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderTextDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderTitleDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.api.generated.wall.dto.WallCoownerDto;
import com.vk.api.generated.wall.dto.WallCoownerRequestDto;
import com.vk.api.generated.wall.dto.WallCoownersDto;
import com.vk.api.generated.wall.dto.WallGeoDto;
import com.vk.api.generated.wall.dto.WallPostActivityDto;
import com.vk.api.generated.wall.dto.WallPostCopyrightDto;
import com.vk.api.generated.wall.dto.WallPostIdDto;
import com.vk.api.generated.wall.dto.WallPostSourceDto;
import com.vk.api.generated.wall.dto.WallPostTypeDto;
import com.vk.api.generated.wall.dto.WallPosterDto;
import com.vk.api.generated.wall.dto.WallViewsDto;
import com.vk.api.generated.wall.dto.WallWallItemDto;
import com.vk.api.generated.wall.dto.WallWallpostAdsEasyPromoteDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentCompactButtonDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentCompactDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentMetaDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentStyleDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentsMetaDto;
import com.vk.api.generated.wall.dto.WallWallpostCommentsDonutDto;
import com.vk.api.generated.wall.dto.WallWallpostCommentsDonutPlaceholderDto;
import com.vk.api.generated.wall.dto.WallWallpostDonutDto;
import com.vk.api.generated.wall.dto.WallWallpostFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.badges.BadgePostItem;
import com.vk.dto.badges.BadgesSet;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.ThemedColor;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.CommentsInfo;
import com.vk.dto.newsfeed.Counters;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.entries.Copyright;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Poster;
import com.vk.dto.newsfeed.entries.post.AttachmentsMeta;
import com.vk.dto.newsfeed.entries.post.DonutBadgeInfo;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionSet;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.EntryTitle;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.actions.ActionOpenModal;
import com.vk.feed.core.models.actions.HeaderAction;
import com.vk.feed.core.models.ads.EasyPromote;
import com.vk.feed.core.models.attachment.AttachmentStyle;
import com.vk.feed.core.models.attachment.AudioPlaylistAttachmentPayload;
import com.vk.feed.core.models.attachment.CompactAttachmentStyle;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.attachment.EntryAttachmentMeta;
import com.vk.feed.core.models.attachment.EntryPhotoStyle;
import com.vk.feed.core.models.attachment.FullAttachmentStyle;
import com.vk.feed.core.models.feedback.Feedback;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ej90;
import xsna.uij0;
import xsna.wax0;

/* compiled from: WallpostFullDtoToPostMapper.kt */
/* loaded from: classes3.dex */
public final class zax0 {
    public final b25 a;
    public final cpu b;
    public final yax0 c;
    public final u9x0 d;
    public final mb6 e;

    public zax0(b25 b25Var, cpu cpuVar, yax0 yax0Var, u9x0 u9x0Var, mb6 mb6Var) {
        this.a = b25Var;
        this.b = cpuVar;
        this.c = yax0Var;
        this.d = u9x0Var;
        this.e = mb6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x036c  */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r5v73, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v74, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Post a(zax0 zax0Var, WallWallItemDto.WallWallpostFullDto wallWallpostFullDto, ArrayMap arrayMap, SparseArray sparseArray, Map map) {
        int intValue;
        Integer num;
        Integer num2;
        EntryHeader entryHeader;
        boolean z;
        DonutBadgeInfo donutBadgeInfo;
        uij0.c cVar;
        Owner owner;
        String str;
        WallPostTypeDto wallPostTypeDto;
        NewsEntryWithAttachments.Cut cut;
        SparseArray sparseArray2;
        BadgeItem badgeItem;
        Object obj;
        Integer num3;
        CommentsInfo commentsInfo;
        Integer num4;
        ItemReactions itemReactions;
        Owner owner2;
        String str2;
        Integer num5;
        BadgesSet badgesSet;
        int i;
        Integer num6;
        Activity activity;
        String str3;
        Caption caption;
        EasyPromote easyPromote;
        boolean z2;
        Poster poster;
        float f;
        Copyright copyright;
        EntryHeader entryHeader2;
        Bundle bundle;
        UserId userId;
        Counters counters;
        PostDonut postDonut;
        WallPostTypeDto wallPostTypeDto2;
        Float f2;
        AttachmentsMeta attachmentsMeta;
        UserId userId2;
        ej90 ej90Var;
        UserId userId3;
        Feedback feedback;
        NewsfeedCoowners newsfeedCoowners;
        EmptyList emptyList;
        List list;
        Owner owner3;
        Owner owner4;
        Owner owner5;
        Feedback feedback2;
        boolean z3;
        AttachmentsMeta.PrimaryMode primaryMode;
        AttachmentsMeta.CarouselLayout carouselLayout;
        Copyright.Type type;
        int i2;
        int i3;
        int i4;
        BadgesSet badgesSet2;
        PostDonut postDonut2;
        PostDonut.Placeholder placeholder;
        LinkButton linkButton;
        BaseLinkButtonActionDto e;
        Action b;
        WallGeoDto H0;
        GeoAttachment a;
        BadgeItem badgeItem2;
        Object obj2;
        BaseBoolIntDto e2;
        String d;
        BaseRepostsInfoDto z1;
        BaseBoolIntDto e3;
        Iterator it;
        EntryAttachment entryAttachment;
        yax0 yax0Var;
        int i5;
        WallWallpostAttachmentCompactDto wallWallpostAttachmentCompactDto;
        int i6;
        String str4;
        ArrayList arrayList;
        WallPostTypeDto wallPostTypeDto3;
        ActionOpenModal.ModalButton modalButton;
        EntryTitle entryTitle;
        AttachmentStyle compactAttachmentStyle;
        Text text;
        String str5;
        VerifyInfo verifyInfo;
        ThemedColor themedColor;
        Text text2;
        ThemedColor themedColor2;
        NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto d2;
        NewsfeedNewsfeedItemHeaderButtonDto d3;
        NewsfeedNewsfeedItemColorDto e4;
        ThemedColor themedColor3;
        int i7;
        int i8;
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto;
        Owner owner6;
        EntryAttachmentMeta.Layout layout;
        EntryAttachmentMeta entryAttachmentMeta;
        AudioPlaylistAttachmentPayload audioPlaylistAttachmentPayload;
        Owner owner7;
        Integer d4;
        Integer f3;
        Integer i9;
        Integer d5;
        uij0.c cVar2 = uij0.c.a;
        zax0Var.getClass();
        WallPostTypeDto n1 = wallWallpostFullDto.n1();
        if (n1 == null) {
            n1 = WallPostTypeDto.POST;
        }
        WallPostTypeDto wallPostTypeDto4 = n1;
        UserId F0 = wallWallpostFullDto.F0();
        if (F0 == null && (F0 = wallWallpostFullDto.q()) == null && (F0 = wallWallpostFullDto.L1()) == null) {
            F0 = UserId.d;
        }
        Owner owner8 = map != null ? (Owner) map.get(F0) : null;
        Owner d6 = owner8 != null ? owner8.d() : new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
        if (owner8 != null) {
            d6.x = owner8.x;
        }
        UserId q = wallWallpostFullDto.q();
        if (q == null && (q = wallWallpostFullDto.V1()) == null && (q = wallWallpostFullDto.L1()) == null) {
            q = F0;
        }
        if (wallPostTypeDto4 == WallPostTypeDto.REPLY) {
            Integer y1 = wallWallpostFullDto.y1();
            intValue = (y1 == null && (y1 = wallWallpostFullDto.b1()) == null) ? -1 : y1.intValue();
            Integer P0 = wallWallpostFullDto.P0();
            List<Integer> V0 = wallWallpostFullDto.V0();
            num = P0;
            num2 = V0 != null ? (Integer) j5g.a0(V0) : null;
        } else {
            Integer P02 = wallWallpostFullDto.P0();
            intValue = (P02 == null && (P02 = wallWallpostFullDto.b1()) == null) ? -1 : P02.intValue();
            num = null;
            num2 = null;
        }
        int i10 = intValue;
        if (!fkq0.c(q) && i10 == 0) {
            return null;
        }
        Owner owner9 = map != null ? (Owner) map.get(q) : null;
        NewsEntry.TrackData trackData = new NewsEntry.TrackData(wallWallpostFullDto.r(), 0, 0L, false, false, null, null, 0, 254, null);
        UserId W = wallWallpostFullDto.W();
        if (!fkq0.b(q)) {
            W = null;
        }
        if (W == null) {
            W = UserId.d;
        }
        UserId userId4 = W;
        boolean z4 = wallWallpostFullDto.U0() == BaseBoolIntDto.YES;
        AdsAdvertiserInfoDto i11 = wallWallpostFullDto.i();
        String e5 = i11 != null ? i11.e() : null;
        String d7 = i11 != null ? i11.d() : null;
        NewsfeedNewsfeedItemCaptionDto D = wallWallpostFullDto.D();
        Caption P = D != null ? x19.P(D, map) : null;
        NewsfeedNewsfeedItemHeaderDto K0 = wallWallpostFullDto.K0();
        EntryHeader j = K0 != null ? skd.j(K0, map) : null;
        Boolean N1 = wallWallpostFullDto.N1();
        if (N1 != null) {
            entryHeader = j;
            z = N1.booleanValue();
        } else {
            entryHeader = j;
            z = false;
        }
        BadgesDonutInfoDto l0 = wallWallpostFullDto.l0();
        String str6 = "";
        if (l0 != null) {
            String d8 = l0.d();
            String e6 = l0.e();
            String f4 = l0.f();
            if (f4 == null) {
                f4 = "";
            }
            donutBadgeInfo = new DonutBadgeInfo(d8, e6, f4);
        } else {
            donutBadgeInfo = null;
        }
        zax0Var.c.getClass();
        BaseLikesInfoDto S0 = wallWallpostFullDto.S0();
        int count = S0 != null ? S0.getCount() : 0;
        BaseRepostsInfoDto z12 = wallWallpostFullDto.z1();
        int count2 = z12 != null ? z12.getCount() : 0;
        WallViewsDto l2 = wallWallpostFullDto.l2();
        int intValue2 = (l2 == null || (d5 = l2.d()) == null) ? 0 : d5.intValue();
        BaseCommentsInfoDto G = wallWallpostFullDto.G();
        int intValue3 = (G == null || (i9 = G.i()) == null) ? 0 : i9.intValue();
        BaseRepostsInfoDto z13 = wallWallpostFullDto.z1();
        int intValue4 = (z13 == null || (f3 = z13.f()) == null) ? 0 : f3.intValue();
        BaseRepostsInfoDto z14 = wallWallpostFullDto.z1();
        Counters counters2 = new Counters(count, count2, intValue2, intValue3, intValue4, (z14 == null || (d4 = z14.d()) == null) ? 0 : d4.intValue());
        Integer B1 = wallWallpostFullDto.B1();
        int intValue5 = B1 != null ? B1.intValue() : -1;
        Integer K = wallWallpostFullDto.K();
        int intValue6 = K != null ? K.intValue() : -1;
        Float D1 = wallWallpostFullDto.D1();
        NewsEntryWithAttachments.Cut cut2 = new NewsEntryWithAttachments.Cut(intValue5, intValue6, D1 != null ? D1.floatValue() : 1.0f, false, 8, null);
        yax0 yax0Var2 = zax0Var.c;
        yax0Var2.getClass();
        ArrayList arrayList2 = new ArrayList();
        List<WallWallpostAttachmentDto> f5 = wallWallpostFullDto.f();
        if (f5 != null) {
            List<WallWallpostAttachmentDto> list2 = f5;
            cVar = cVar2;
            owner = d6;
            ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                WallWallpostAttachmentDto wallWallpostAttachmentDto = (WallWallpostAttachmentDto) it2.next();
                Attachment a2 = yax0Var2.a.a.a(wallWallpostAttachmentDto, map);
                if (a2 == null) {
                    it = it2;
                    yax0Var = yax0Var2;
                    str4 = str6;
                    wallPostTypeDto3 = wallPostTypeDto4;
                    entryAttachment = null;
                } else {
                    it = it2;
                    WallWallpostAttachmentStyleDto F02 = wallWallpostAttachmentDto.F0();
                    if (F02 == null) {
                        yax0Var = yax0Var2;
                        i5 = -1;
                    } else {
                        yax0Var = yax0Var2;
                        i5 = tax0.$EnumSwitchMapping$0[F02.ordinal()];
                    }
                    if (i5 == 1) {
                        WallWallpostAttachmentCompactDto l = wallWallpostAttachmentDto.l();
                        if (l == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        List<NewsfeedNewsfeedItemHeaderImageDto> f6 = l.f();
                        if (f6 != null) {
                            wallWallpostAttachmentCompactDto = l;
                            i6 = f6.size();
                        } else {
                            wallWallpostAttachmentCompactDto = l;
                            i6 = 0;
                        }
                        str4 = str6;
                        ArrayList arrayList4 = new ArrayList(i6);
                        EntryPhotoStyle entryPhotoStyle = EntryPhotoStyle.Square;
                        int i12 = 0;
                        String str7 = null;
                        while (i12 < i6) {
                            if (f6 == null || (newsfeedNewsfeedItemHeaderImageDto = f6.get(i12)) == null) {
                                i7 = i12;
                                i8 = i6;
                            } else {
                                List<PhotosPhotoSizesDto> g = newsfeedNewsfeedItemHeaderImageDto.g();
                                i7 = i12;
                                Image image = (map == null || (owner6 = (Owner) map.get(newsfeedNewsfeedItemHeaderImageDto.i())) == null) ? null : owner6.g;
                                if (g != null) {
                                    image = elg.a(g);
                                } else if (image == null) {
                                    String e7 = newsfeedNewsfeedItemHeaderImageDto.e();
                                    if (e7 == null || e7.length() == 0) {
                                        i8 = i6;
                                        image = null;
                                    } else {
                                        i8 = i6;
                                        image = new Image((List<ImageSize>) Collections.singletonList(new ImageSize(e7, -1, -1, null, (char) 0, false, 56, null)));
                                    }
                                    if (image != null) {
                                        arrayList4.add(image);
                                    }
                                    if (str7 == null) {
                                        str7 = newsfeedNewsfeedItemHeaderImageDto.f();
                                    }
                                    NewsfeedNewsfeedItemHeaderImageDto.StyleDto k = newsfeedNewsfeedItemHeaderImageDto.k();
                                    int i13 = k != null ? -1 : tax0.$EnumSwitchMapping$1[k.ordinal()];
                                    entryPhotoStyle = i13 == 1 ? i13 != 2 ? EntryPhotoStyle.Square : EntryPhotoStyle.Squircle : EntryPhotoStyle.Circle;
                                }
                                i8 = i6;
                                if (image != null) {
                                }
                                if (str7 == null) {
                                }
                                NewsfeedNewsfeedItemHeaderImageDto.StyleDto k2 = newsfeedNewsfeedItemHeaderImageDto.k();
                                if (k2 != null) {
                                }
                                entryPhotoStyle = i13 == 1 ? i13 != 2 ? EntryPhotoStyle.Square : EntryPhotoStyle.Squircle : EntryPhotoStyle.Circle;
                            }
                            i12 = i7 + 1;
                            i6 = i8;
                        }
                        WallWallpostAttachmentCompactButtonDto d9 = wallWallpostAttachmentCompactDto.d();
                        if (d9 != null) {
                            NewsfeedNewsfeedItemHeaderTextDto e8 = d9.e();
                            if (e8 != null) {
                                String e9 = e8.e();
                                NewsfeedNewsfeedItemColorDto d10 = e8.d();
                                arrayList = arrayList4;
                                if (d10 != null) {
                                    String e10 = d10.e();
                                    Integer a3 = e10 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", e10) : null;
                                    String d11 = d10.d();
                                    themedColor3 = new ThemedColor(a3, d11 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", d11) : null);
                                } else {
                                    themedColor3 = null;
                                }
                                text2 = new Text(e9, themedColor3);
                            } else {
                                arrayList = arrayList4;
                                text2 = null;
                            }
                            NewsfeedNewsfeedItemHeaderActionDto d12 = d9.d();
                            HeaderAction a4 = d12 != null ? ju60.a(d12, map) : null;
                            NewsfeedNewsfeedItemHeaderActionDto d13 = d9.d();
                            if (d13 == null || (d2 = d13.d()) == null || (d3 = d2.d()) == null || (e4 = d3.e()) == null) {
                                wallPostTypeDto3 = wallPostTypeDto4;
                                themedColor2 = null;
                            } else {
                                String e11 = e4.e();
                                Integer a5 = e11 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", e11) : null;
                                String d14 = e4.d();
                                wallPostTypeDto3 = wallPostTypeDto4;
                                themedColor2 = new ThemedColor(a5, d14 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", d14) : null);
                            }
                            modalButton = new ActionOpenModal.ModalButton(text2, a4, themedColor2);
                        } else {
                            arrayList = arrayList4;
                            wallPostTypeDto3 = wallPostTypeDto4;
                            modalButton = null;
                        }
                        NewsfeedNewsfeedItemHeaderTitleDto i14 = wallWallpostAttachmentCompactDto.i();
                        if (i14 != null) {
                            UserId d15 = i14.d();
                            Owner owner10 = (d15 == null || map == null) ? null : (Owner) map.get(d15);
                            NewsfeedNewsfeedItemHeaderTextDto f7 = i14.f();
                            if (f7 != null) {
                                String e12 = f7.e();
                                NewsfeedNewsfeedItemColorDto d16 = f7.d();
                                if (d16 != null) {
                                    String e13 = d16.e();
                                    Integer a6 = e13 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", e13) : null;
                                    String d17 = d16.d();
                                    themedColor = new ThemedColor(a6, d17 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", d17) : null);
                                } else {
                                    themedColor = null;
                                }
                                text = new Text(e12, themedColor);
                            } else {
                                text = (owner10 == null || (str5 = owner10.c) == null) ? null : new Text(str5, null);
                            }
                            entryTitle = new EntryTitle(text, (owner10 == null || (verifyInfo = owner10.f) == null || !verifyInfo.b) ? false : true);
                        } else {
                            entryTitle = null;
                        }
                        NewsfeedNewsfeedItemHeaderDescriptionDto e14 = wallWallpostAttachmentCompactDto.e();
                        Description w = e14 != null ? rdi.w(e14, map) : null;
                        NewsfeedNewsfeedItemHeaderOverlayImageDto g2 = wallWallpostAttachmentCompactDto.g();
                        compactAttachmentStyle = new CompactAttachmentStyle(null, modalButton, arrayList, entryPhotoStyle, str7, entryTitle, w, g2 != null ? nr2.D(g2, map) : null);
                    } else if (i5 != 2) {
                        str4 = str6;
                        wallPostTypeDto3 = wallPostTypeDto4;
                        compactAttachmentStyle = null;
                    } else {
                        compactAttachmentStyle = new FullAttachmentStyle();
                        str4 = str6;
                        wallPostTypeDto3 = wallPostTypeDto4;
                    }
                    WallWallpostAttachmentMetaDto K2 = wallWallpostAttachmentDto.K();
                    if (K2 == null) {
                        entryAttachmentMeta = null;
                    } else {
                        WallWallpostAttachmentMetaDto.LayoutDto e15 = K2.e();
                        int i15 = e15 == null ? -1 : vax0.$EnumSwitchMapping$0[e15.ordinal()];
                        if (i15 == -1) {
                            layout = EntryAttachmentMeta.Layout.ROUNDED;
                        } else if (i15 == 1) {
                            layout = EntryAttachmentMeta.Layout.WIDE;
                        } else {
                            if (i15 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            layout = EntryAttachmentMeta.Layout.ROUNDED;
                        }
                        Boolean d18 = K2.d();
                        entryAttachmentMeta = new EntryAttachmentMeta(layout, d18 != null ? d18.booleanValue() : true);
                    }
                    if (a2 instanceof AudioPlaylistAttachment) {
                        AudioPlaylistAttachment audioPlaylistAttachment = (AudioPlaylistAttachment) a2;
                        if (map != null && (owner7 = (Owner) map.get(audioPlaylistAttachment.f.c)) != null) {
                            audioPlaylistAttachmentPayload = new AudioPlaylistAttachmentPayload(owner7.h, owner7.i);
                            entryAttachment = new EntryAttachment(a2, compactAttachmentStyle, entryAttachmentMeta, audioPlaylistAttachmentPayload);
                        }
                    }
                    audioPlaylistAttachmentPayload = null;
                    entryAttachment = new EntryAttachment(a2, compactAttachmentStyle, entryAttachmentMeta, audioPlaylistAttachmentPayload);
                }
                arrayList3.add(entryAttachment);
                it2 = it;
                yax0Var2 = yax0Var;
                str6 = str4;
                wallPostTypeDto4 = wallPostTypeDto3;
            }
            str = str6;
            wallPostTypeDto = wallPostTypeDto4;
            j5g.W(arrayList3, arrayList2);
        } else {
            cVar = cVar2;
            owner = d6;
            str = "";
            wallPostTypeDto = wallPostTypeDto4;
        }
        y64.a(arrayList2, cut2);
        boolean e16 = p6c0.e(cut2, arrayList2);
        Flags flags = new Flags(0L, 1, null);
        BaseCommentsInfoDto G2 = wallWallpostFullDto.G();
        if (G2 != null) {
            BaseBoolIntDto f8 = G2.f();
            if (f8 == null) {
                f8 = BaseBoolIntDto.YES;
            }
            BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
            boolean z5 = f8 == baseBoolIntDto;
            Boolean k3 = G2.k();
            boolean booleanValue = k3 != null ? k3.booleanValue() : false;
            BaseBoolIntDto e17 = G2.e();
            if (e17 == null) {
                e17 = BaseBoolIntDto.NO;
            }
            boolean z6 = e17 == baseBoolIntDto;
            BaseBoolIntDto d19 = G2.d();
            if (d19 == null) {
                d19 = BaseBoolIntDto.NO;
            }
            boolean z7 = d19 == baseBoolIntDto;
            BaseBoolIntDto g3 = G2.g();
            if (g3 == null) {
                g3 = baseBoolIntDto;
            }
            boolean z8 = g3 == baseBoolIntDto;
            cut = cut2;
            flags.Ab(2L, z5);
            flags.Ab(PlaybackStateCompat.ACTION_PREPARE_FROM_URI, booleanValue);
            flags.Ab(16777216L, z6);
            flags.Ab(33554432L, z7);
            flags.Ab(4294967296L, z8);
        } else {
            cut = cut2;
        }
        BaseLikesInfoDto S02 = wallWallpostFullDto.S0();
        long j2 = 1;
        if (S02 != null) {
            BaseBoolIntDto f9 = S02.f();
            if (f9 == null) {
                f9 = BaseBoolIntDto.NO;
            }
            BaseBoolIntDto baseBoolIntDto2 = BaseBoolIntDto.YES;
            boolean z9 = f9 == baseBoolIntDto2;
            boolean z10 = S02.i() == baseBoolIntDto2;
            Boolean g4 = S02.g();
            boolean booleanValue2 = g4 != null ? g4.booleanValue() : false;
            flags.Ab(1L, z9);
            flags.Ab(8L, z10);
            flags.Ab(274877906944L, booleanValue2);
            j2 = 1;
        }
        if (!flags.zb(j2) && (z1 = wallWallpostFullDto.z1()) != null && (e3 = z1.e()) != null) {
            flags.Ab(j2, e3 == BaseBoolIntDto.YES);
        }
        BaseBoolIntDto u = wallWallpostFullDto.u();
        if (u == null) {
            u = BaseBoolIntDto.NO;
        }
        BaseBoolIntDto baseBoolIntDto3 = BaseBoolIntDto.YES;
        flags.Ab(128L, u == baseBoolIntDto3);
        flags.Ab(64L, wallWallpostFullDto.o() == baseBoolIntDto3);
        flags.Ab(512L, wallWallpostFullDto.D0() == baseBoolIntDto3);
        flags.Ab(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH, wallWallpostFullDto.B() == baseBoolIntDto3);
        BaseBoolIntDto y2 = wallWallpostFullDto.y2();
        if (y2 == null) {
            y2 = BaseBoolIntDto.NO;
        }
        flags.Ab(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, y2 == baseBoolIntDto3);
        flags.Ab(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, wallWallpostFullDto.y0() == baseBoolIntDto3);
        if (wallWallpostFullDto.n1() == WallPostTypeDto.POSTPONE) {
            flags.Ab(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH, true);
            Integer i22 = wallWallpostFullDto.i2();
            flags.Ab(PlaybackStateCompat.ACTION_PLAY_FROM_URI, i22 != null && i22.intValue() == 1);
            Integer v0 = wallWallpostFullDto.v0();
            flags.Ab(PlaybackStateCompat.ACTION_PREPARE, v0 != null && v0.intValue() == 1);
        }
        flags.Ab(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM, wallWallpostFullDto.n1() == WallPostTypeDto.SUGGEST);
        WallPostSourceDto d1 = wallWallpostFullDto.d1();
        if (d1 != null && (d = d1.d()) != null && d.equals("profile_photo")) {
            flags.Ab(256L, true);
        }
        Boolean N12 = wallWallpostFullDto.N1();
        Boolean bool = Boolean.TRUE;
        flags.Ab(PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED, epx.f(N12, bool));
        flags.Ab(8388608L, epx.f(wallWallpostFullDto.X1(), bool));
        flags.Ab(67108864L, epx.f(wallWallpostFullDto.r2(), bool));
        flags.Ab(536870912L, wallWallpostFullDto.C() == baseBoolIntDto3);
        flags.Ab(134217728L, epx.f(wallWallpostFullDto.o2(), bool));
        flags.Ab(268435456L, epx.f(wallWallpostFullDto.n(), bool));
        flags.Ab(16L, epx.f(wallWallpostFullDto.p(), bool));
        WallWallpostDonutDto a0 = wallWallpostFullDto.a0();
        if (a0 != null) {
            flags.Ab(1073741824L, epx.f(a0.d(), bool));
        }
        flags.Ab(2147483648L, wallWallpostFullDto.l() == baseBoolIntDto3);
        flags.Ab(34359738368L, epx.f(wallWallpostFullDto.N0(), bool));
        BaseRepostsInfoDto z15 = wallWallpostFullDto.z1();
        if (z15 != null && (e2 = z15.e()) != null) {
            flags.Ab(4L, e2 == baseBoolIntDto3 && !q.equals(z230.b.c()) && q.equals(F0));
            s3q0 s3q0Var = s3q0.a;
        }
        if (!flags.zb(64L)) {
            flags.Ab(64L, zax0Var.b.D().g0(q));
        }
        Integer j3 = wallWallpostFullDto.j();
        int intValue7 = j3 != null ? j3.intValue() : 0;
        WallPostTypeDto wallPostTypeDto5 = wallPostTypeDto;
        if (wallPostTypeDto5 != WallPostTypeDto.REPLY || intValue7 == 0) {
            sparseArray2 = sparseArray;
            badgeItem = null;
        } else {
            if (sparseArray != null) {
                int size = sparseArray.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size) {
                        sparseArray2 = sparseArray;
                        obj2 = null;
                        break;
                    }
                    sparseArray2 = sparseArray;
                    obj2 = sparseArray2.valueAt(i16);
                    if (((BadgeItem) obj2).b == intValue7) {
                        break;
                    }
                    i16++;
                }
                badgeItem2 = (BadgeItem) obj2;
            } else {
                sparseArray2 = sparseArray;
                badgeItem2 = null;
            }
            flags.Ab(4294967296L, true);
            badgeItem = badgeItem2;
        }
        String R1 = wallWallpostFullDto.R1();
        if (R1 == null) {
            R1 = str;
        }
        Boolean m2 = wallWallpostFullDto.m2();
        boolean booleanValue3 = m2 != null ? m2.booleanValue() : false;
        Integer Z = wallWallpostFullDto.Z();
        int intValue8 = Z != null ? Z.intValue() : 0;
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (((EntryAttachment) obj).b instanceof GeoAttachment) {
                break;
            }
        }
        if (obj == null && (H0 = wallWallpostFullDto.H0()) != null && (a = l9x0.a(H0)) != null) {
            if (e16) {
                a.l = 1;
            }
            arrayList2.add(new EntryAttachment(a, null, null, null, 14, null));
        }
        UserId E1 = wallWallpostFullDto.E1();
        if (E1 == null) {
            E1 = UserId.d;
        }
        Owner owner11 = (!fkq0.c(E1) || map == null) ? null : (Owner) map.get(E1);
        BaseCommentsInfoDto G3 = wallWallpostFullDto.G();
        if (G3 != null) {
            zax0Var.e.getClass();
            WallWallpostCommentsDonutDto j4 = G3.j();
            if (j4 != null) {
                WallWallpostCommentsDonutPlaceholderDto d20 = j4.d();
                if (d20 != null) {
                    String e18 = d20.e();
                    BaseLinkButtonDto d21 = d20.d();
                    if (d21 == null || (e = d21.e()) == null || (b = wf6.b(e)) == null) {
                        linkButton = null;
                    } else {
                        String title = d21.getTitle();
                        if (title == null) {
                            title = str;
                        }
                        BaseLinkButtonStyleDto o = d21.o();
                        linkButton = new LinkButton(title, b, o != null ? o.name() : null);
                    }
                    placeholder = new PostDonut.Placeholder(e18, linkButton);
                } else {
                    placeholder = null;
                }
                postDonut2 = new PostDonut(false, placeholder, null, null, null, null, null, null, null, null, 64, null);
            } else {
                postDonut2 = null;
            }
            num3 = num;
            commentsInfo = new CommentsInfo(postDonut2);
        } else {
            num3 = num;
            commentsInfo = null;
        }
        ReactionSet reactionSet = arrayMap != null ? (ReactionSet) arrayMap.get(wallWallpostFullDto.s1()) : null;
        LikesItemReactionsDto t1 = wallWallpostFullDto.t1();
        if (t1 != null) {
            num4 = num3;
            itemReactions = l370.D(t1, reactionSet);
        } else {
            num4 = num3;
            itemReactions = null;
        }
        BadgesObjectInfoDto k4 = wallWallpostFullDto.k();
        if (k4 != null) {
            List<BadgesObjectEntriesCounterDto> d22 = k4.d();
            ArrayList arrayList5 = new ArrayList();
            if (d22 != null) {
                int i17 = 0;
                int i18 = 0;
                for (BadgesObjectEntriesCounterDto badgesObjectEntriesCounterDto : d22) {
                    BadgesObjectEntriesCounterDto.TypeDto e19 = badgesObjectEntriesCounterDto.e();
                    if (e19 == null) {
                        e19 = BadgesObjectEntriesCounterDto.TypeDto.TOTAL;
                    }
                    int f10 = badgesObjectEntriesCounterDto.f();
                    owner2 = owner11;
                    int i19 = nz5.$EnumSwitchMapping$0[e19.ordinal()];
                    str2 = R1;
                    if (i19 == 1) {
                        Integer d23 = badgesObjectEntriesCounterDto.d();
                        int intValue9 = d23 != null ? d23.intValue() : 0;
                        if (sparseArray2 != null) {
                            u4q0 u4q0Var = zik0.a;
                            BadgeItem badgeItem3 = (BadgeItem) sparseArray2.get(intValue9);
                            if (badgeItem3 != null) {
                                arrayList5.add(new BadgePostItem(badgeItem3, f10));
                            }
                        }
                        badgesSet2 = null;
                        break;
                    }
                    if (i19 == 2) {
                        i17 = f10;
                    } else {
                        if (i19 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i18 = f10;
                    }
                    owner11 = owner2;
                    R1 = str2;
                }
                i3 = i17;
                i4 = i18;
            } else {
                i3 = 0;
                i4 = 0;
            }
            owner2 = owner11;
            str2 = R1;
            int id = k4.getId();
            UserId q2 = k4.q();
            if (q2 == null) {
                q2 = UserId.d;
            }
            badgesSet2 = new BadgesSet(id, q2, k4.e(), arrayList5, i3, i4, false, 64, null);
            num5 = num4;
            badgesSet = badgesSet2;
        } else {
            owner2 = owner11;
            str2 = R1;
            num5 = num4;
            badgesSet = null;
        }
        WallPostActivityDto d24 = wallWallpostFullDto.d();
        if (d24 != null) {
            i = 0;
            num6 = num2;
            activity = zax0Var.d.a(d24, reactionSet, map, false);
        } else {
            i = 0;
            num6 = num2;
            activity = null;
        }
        List<WallWallpostFullDto> R = wallWallpostFullDto.R();
        if (R != null) {
            if (((WallWallpostFullDto) j5g.b0(i, R)) != null) {
                i2 = 1;
                flags.Ab(32L, true);
                s3q0 s3q0Var2 = s3q0.a;
            } else {
                i2 = 1;
            }
            if (((WallWallpostFullDto) j5g.b0(i2, R)) != null) {
                s3q0 s3q0Var3 = s3q0.a;
            }
        }
        UserId x1 = wallWallpostFullDto.x1();
        if (x1 != null) {
            String str8 = "https://" + a0a.d + "/wall" + x1 + '_' + wallWallpostFullDto.y1();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            str3 = str;
            arrayList2.add(new EntryAttachment(new LinkAttachment(str8, context.getResources().getString(R.string.wall_post_reply), str3), null, null, null, 14, null));
        } else {
            str3 = str;
        }
        WallWallpostAdsEasyPromoteDto e20 = wallWallpostFullDto.e();
        if (e20 != null) {
            int i20 = e20.g().i();
            Integer d25 = e20.d();
            caption = P;
            easyPromote = new EasyPromote(i20, d25 != null ? d25.intValue() : i, e20.f(), e20.e());
        } else {
            caption = P;
            easyPromote = null;
        }
        WallPosterDto o1 = wallWallpostFullDto.o1();
        if (o1 != null) {
            z2 = booleanValue3;
            poster = aax0.a(o1, map);
        } else {
            z2 = booleanValue3;
            poster = null;
        }
        WallPostCopyrightDto T = wallWallpostFullDto.T();
        if (T != null) {
            UserId d26 = T.d();
            if (d26 == null) {
                d26 = UserId.d;
            }
            try {
                type = Copyright.Type.valueOf(T.getType().toUpperCase(Locale.ROOT));
            } catch (Exception unused) {
                type = Copyright.Type.UNKNOWN;
            }
            f = 1.0f;
            copyright = new Copyright(T.e(), d26, T.f(), map != null ? (Owner) map.get(d26) : null, type, T.f());
        } else {
            f = 1.0f;
            copyright = null;
        }
        Boolean r2 = wallWallpostFullDto.r2();
        flags.Ab(67108864L, r2 != null ? r2.booleanValue() : false);
        Boolean q22 = wallWallpostFullDto.q2();
        flags.Ab(549755813888L, q22 != null ? q22.booleanValue() : false);
        String str9 = str3;
        UserId userId5 = q;
        ReactionSet reactionSet2 = reactionSet;
        NewsEntryWithAttachments.Cut cut3 = cut;
        Integer num7 = num5;
        String str10 = str2;
        ej90.b bVar = new ej90.b(null, cut.d, cVar, zax0Var.a.i().U, new zg90(cn70.b(6)), 0, 0, null, null, 480);
        ej90.c cVar3 = new ej90.c(0);
        ej90 a7 = ej90.a.a(str10, bVar, cVar3);
        flags.Ab(68719476736L, cVar3.a);
        NewsfeedItemWallpostFeedbackDto w0 = wallWallpostFullDto.w0();
        Feedback a8 = w0 != null ? nn60.a(w0) : null;
        WallWallpostDonutDto a02 = wallWallpostFullDto.a0();
        if (a02 != null) {
            entryHeader2 = entryHeader;
            bundle = null;
            userId = userId4;
            counters = counters2;
            postDonut = xax0.a(a02);
        } else {
            entryHeader2 = entryHeader;
            bundle = null;
            userId = userId4;
            counters = counters2;
            postDonut = null;
        }
        Integer F = wallWallpostFullDto.F();
        int intValue10 = F != null ? F.intValue() : 0;
        Float U1 = wallWallpostFullDto.U1();
        if (U1 != null) {
            float floatValue = U1.floatValue();
            if (floatValue < 1.0E-4f) {
                floatValue = 1.0E-4f;
            }
            f2 = Float.valueOf(floatValue);
            wallPostTypeDto2 = wallPostTypeDto5;
        } else {
            wallPostTypeDto2 = wallPostTypeDto5;
            f2 = null;
        }
        String W1 = wallWallpostFullDto.W1();
        if (W1 == null) {
            W1 = str9;
        }
        WallWallpostAttachmentsMetaDto g5 = wallWallpostFullDto.g();
        if (g5 != null) {
            WallWallpostAttachmentsMetaDto.PrimaryModeDto f11 = g5.f();
            if (f11 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int i21 = wax0.a.$EnumSwitchMapping$0[f11.ordinal()];
            if (i21 == 1) {
                primaryMode = AttachmentsMeta.PrimaryMode.SINGLE;
            } else if (i21 == 2) {
                primaryMode = AttachmentsMeta.PrimaryMode.GRID;
            } else {
                if (i21 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                primaryMode = AttachmentsMeta.PrimaryMode.CAROUSEL;
            }
            AttachmentsMeta.PrimaryMode primaryMode2 = primaryMode;
            Float e21 = g5.e();
            float floatValue2 = e21 != null ? e21.floatValue() : f;
            WallWallpostAttachmentsMetaDto.CarouselLayoutDto d27 = g5.d();
            if (d27 == null) {
                d27 = WallWallpostAttachmentsMetaDto.CarouselLayoutDto.ROUNDED;
            }
            int i23 = wax0.a.$EnumSwitchMapping$1[d27.ordinal()];
            if (i23 == 1) {
                carouselLayout = AttachmentsMeta.CarouselLayout.ROUNDED;
            } else {
                if (i23 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                carouselLayout = AttachmentsMeta.CarouselLayout.WIDE;
            }
            attachmentsMeta = new AttachmentsMeta(primaryMode2, floatValue2, carouselLayout, null, 8, null);
        } else {
            attachmentsMeta = null;
        }
        WallCoownersDto M = wallWallpostFullDto.M();
        if (M != null) {
            boolean i24 = M.i();
            boolean g6 = M.g();
            WallPostIdDto d28 = M.d();
            UserId q3 = d28 != null ? d28.q() : null;
            WallPostIdDto d29 = M.d();
            Integer valueOf = d29 != null ? Integer.valueOf(d29.d()) : null;
            List<WallCoownerDto> e22 = M.e();
            if (e22 != null) {
                List<WallCoownerDto> list3 = e22;
                userId2 = userId5;
                ej90Var = a7;
                ?? arrayList6 = new ArrayList(c5g.u(list3, 10));
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    WallCoownerDto wallCoownerDto = (WallCoownerDto) it4.next();
                    Iterator it5 = it4;
                    if (map == null || (owner5 = (Owner) map.get(wallCoownerDto.q())) == null) {
                        owner5 = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
                    }
                    WallCoownerDto.StatusDto e23 = wallCoownerDto.e();
                    UserId userId6 = userId;
                    String a9 = cqm0.a(e23 != null ? e23.i() : null);
                    Boolean d30 = wallCoownerDto.d();
                    if (d30 != null) {
                        boolean booleanValue4 = d30.booleanValue();
                        feedback2 = a8;
                        z3 = booleanValue4;
                    } else {
                        feedback2 = a8;
                        z3 = false;
                    }
                    Boolean f12 = wallCoownerDto.f();
                    arrayList6.add(new NewsfeedCoowners.CoownerStatus(owner5, a9, z3, f12 != null ? f12.booleanValue() : false));
                    it4 = it5;
                    userId = userId6;
                    a8 = feedback2;
                }
                userId3 = userId;
                emptyList = arrayList6;
            } else {
                userId2 = userId5;
                ej90Var = a7;
                userId3 = userId;
                emptyList = null;
            }
            feedback = a8;
            if (emptyList == null) {
                emptyList = EmptyList.b;
            }
            EmptyList emptyList2 = emptyList;
            List<WallCoownerRequestDto> f13 = M.f();
            if (f13 != null) {
                List<WallCoownerRequestDto> list4 = f13;
                list = new ArrayList(c5g.u(list4, 10));
                for (WallCoownerRequestDto wallCoownerRequestDto : list4) {
                    if (map == null || (owner3 = (Owner) map.get(wallCoownerRequestDto.q())) == null) {
                        owner3 = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
                    }
                    if (map == null || (owner4 = (Owner) map.get(wallCoownerRequestDto.d())) == null) {
                        owner4 = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
                    }
                    list.add(new NewsfeedCoowners.CoownerRequest(owner3, owner4, wallCoownerRequestDto.e()));
                }
            } else {
                list = 0;
            }
            if (list == 0) {
                list = EmptyList.b;
            }
            newsfeedCoowners = new NewsfeedCoowners(i24, g6, q3, valueOf, emptyList2, list);
        } else {
            userId2 = userId5;
            ej90Var = a7;
            userId3 = userId;
            feedback = a8;
            newsfeedCoowners = null;
        }
        Serializer.c<Post> cVar4 = Post.CREATOR;
        flags.Ab(137438953472L, Post.a.a(arrayList2, attachmentsMeta, wallPostTypeDto2.i()));
        AttachmentsMeta attachmentsMeta2 = attachmentsMeta;
        UserId userId7 = userId2;
        boolean z11 = z2;
        NewsfeedCoowners newsfeedCoowners2 = newsfeedCoowners;
        UserId userId8 = userId3;
        Post post = new Post(flags, userId7, i10, owner, userId8, owner2, intValue8, str10, wallPostTypeDto2.i(), num7, num6, z11, caption, entryHeader2 == null ? pwu.b(owner) : entryHeader2, arrayList2, attachmentsMeta2, commentsInfo, activity, null, counters, z4, e5, d7, easyPromote, z, bundle, trackData, poster, cut3, copyright, ej90Var, owner9, postDonut, intValue10, f2, null, reactionSet2, itemReactions, badgesSet, null, W1, cVar, badgeItem, donutBadgeInfo, null, null, newsfeedCoowners2, null, 0, 45184, null);
        post.g = feedback;
        return post;
    }
}
