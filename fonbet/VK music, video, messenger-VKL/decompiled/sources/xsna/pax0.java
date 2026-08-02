package xsna;

import android.net.Uri;
import com.vk.api.base.Document;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.apps.dto.AppsMiniAppAttachButtonDto;
import com.vk.api.generated.apps.dto.AppsMiniAppAttachDto;
import com.vk.api.generated.articles.dto.ArticlesArticleDto;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioCuratorDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseLinkButtonStyleDto;
import com.vk.api.generated.base.dto.BaseLinkDto;
import com.vk.api.generated.base.dto.BaseOwnerButtonActionTargetDto;
import com.vk.api.generated.base.dto.BaseStickerDto;
import com.vk.api.generated.docs.dto.DocsDocDto;
import com.vk.api.generated.docs.dto.DocsDocPreviewDto;
import com.vk.api.generated.donut.dto.DonutAttachDonatorsInfoDto;
import com.vk.api.generated.donut.dto.DonutDonutLinkAttachDto;
import com.vk.api.generated.events.dto.EventsEventAttachDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullMemberStatusDto;
import com.vk.api.generated.market.dto.MarketMarketAlbumDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.media.dto.MediaRestrictionDto;
import com.vk.api.generated.narratives.dto.NarrativesNarrativeDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderTextDto;
import com.vk.api.generated.notes.dto.NotesNoteDto;
import com.vk.api.generated.pages.dto.PagesWikipageFullDto;
import com.vk.api.generated.photos.dto.PhotosPhotoAlbumDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.polls.dto.PollsPollDto;
import com.vk.api.generated.prettyCards.dto.PrettyCardsPrettyCardDto;
import com.vk.api.generated.prettyCards.dto.PrettyCardsPrettyCardsDto;
import com.vk.api.generated.situationalSuggests.dto.SituationalSuggestsThemeDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.wall.dto.WallActionButtonDto;
import com.vk.api.generated.wall.dto.WallActionButtonProgressDto;
import com.vk.api.generated.wall.dto.WallGraffitiDto;
import com.vk.api.generated.wall.dto.WallPostedPhotoDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentTypeDto;
import com.vk.common.links.AwayLink;
import com.vk.dto.action_button.ActionButtonDonutGoal;
import com.vk.dto.action_button.ActionButtonDonutLevel;
import com.vk.dto.action_button.ActionButtonProgress;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionEmpty;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Curator;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistOwner;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickerItem;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioArtistAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioCuratorAttachment;
import com.vkontakte.android.attachments.AudioMessageAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.DonutLinkAttachment;
import com.vkontakte.android.attachments.EventAttachment;
import com.vkontakte.android.attachments.GraffitiAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.MiniAppAttachment;
import com.vkontakte.android.attachments.NarrativeAttachment;
import com.vkontakte.android.attachments.NoteAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import com.vkontakte.android.attachments.SituationalThemeAttachment;
import com.vkontakte.android.attachments.StickerAttachment;
import com.vkontakte.android.attachments.VideoSnippetAttachment;
import com.vkontakte.android.attachments.WikiAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WallWallpostAttachmentDtoToAttachmentMapper.kt */
/* loaded from: classes3.dex */
public final class pax0 {
    public final it4 a;
    public final ppt0 b;

    /* compiled from: WallWallpostAttachmentDtoToAttachmentMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WallWallpostAttachmentTypeDto.values().length];
            try {
                iArr[WallWallpostAttachmentTypeDto.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.GRAFFITI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.POSTED_PHOTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.ALBUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.APP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.AUDIO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.MARKET_ALBUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.VIDEO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.DOC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.LINK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.ARTICLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.POLL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.NOTE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.PAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.STICKER.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.AUDIO_PLAYLIST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.ARTIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.CURATOR.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.PRETTY_CARDS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.PODCAST.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.NARRATIVE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.EVENT.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.MINI_APP.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.DONUT_LINK.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.SITUATIONAL_THEME.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.GEO.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.PHOTOS_LIST.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.GROUP.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[WallWallpostAttachmentTypeDto.ACTION_BUTTON.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public pax0(it4 it4Var, ppt0 ppt0Var) {
        this.a = it4Var;
        this.b = ppt0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Attachment a(WallWallpostAttachmentDto wallWallpostAttachmentDto, Map<UserId, Owner> map) {
        Photo photo;
        String str;
        ButtonAction buttonAction;
        Owner owner;
        Collection<Owner> values;
        ArrayList arrayList;
        ArrayList arrayList2;
        LinkButton linkButton;
        Action b;
        Owner owner2;
        r9 = null;
        Owner owner3 = null;
        switch (a.$EnumSwitchMapping$0[wallWallpostAttachmentDto.H0().ordinal()]) {
            case 1:
                MarketMarketItemDto F = wallWallpostAttachmentDto.F();
                if (F != null) {
                    return new MarketAttachment(b210.c(F));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 2:
                PhotosPhotoDto Z = wallWallpostAttachmentDto.Z();
                if (Z != null) {
                    return new PhotoAttachment(xfa0.a(Z), map);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 3:
                WallGraffitiDto C = wallWallpostAttachmentDto.C();
                if (C == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Integer f = C.f();
                if (f == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int intValue = f.intValue();
                UserId q = C.q();
                if (q == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String url = C.getUrl();
                if (url == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Integer g = C.g();
                if (g == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int intValue2 = g.intValue();
                Integer e = C.e();
                if (e == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int intValue3 = e.intValue();
                String d = C.d();
                if (d != null) {
                    return new GraffitiAttachment(intValue, q, url, intValue2, intValue3, d);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 4:
                WallPostedPhotoDto v0 = wallWallpostAttachmentDto.v0();
                if (v0 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ArrayList arrayList3 = new ArrayList(2);
                String e2 = v0.e();
                if (e2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ImageSizeKey imageSizeKey = ImageSizeKey.SIZE_M_0130;
                arrayList3.add(new ImageSize(e2, imageSizeKey.getWidth(), 98, null, imageSizeKey.i(), false, 40, null));
                String f2 = v0.f();
                if (f2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ImageSizeKey imageSizeKey2 = ImageSizeKey.SIZE_X_0604;
                arrayList3.add(new ImageSize(f2, imageSizeKey2.getWidth(), 480, null, imageSizeKey2.i(), false, 40, null));
                Photo photo2 = new Photo(new Image(arrayList3));
                UserId q2 = v0.q();
                if (q2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                photo2.e = q2;
                Integer d2 = v0.d();
                photo2.c = d2 != null ? d2.intValue() : 0;
                photo2.d = Integer.MIN_VALUE;
                if (photo2.f.b == 100) {
                    photo2.f = photo2.e;
                }
                return new PhotoAttachment(photo2, map);
            case 5:
                PhotosPhotoAlbumDto e3 = wallWallpostAttachmentDto.e();
                if (e3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                PhotosPhotoDto e4 = e3.e();
                if (e4 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                MediaRestrictionDto M = e4.M();
                if (e4.R() != null) {
                    photo = xfa0.a(e4);
                } else {
                    ArrayList arrayList4 = new ArrayList(3);
                    arrayList4.add(new ImageSize(null, 135, 100, null, ImageSizeKey.SIZE_M_0130.i(), false, 40, null));
                    String W = e4.W();
                    if (W == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    arrayList4.add(new ImageSize(W, 320, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, null, ImageSizeKey.SIZE_Q_0320.i(), false, 40, null));
                    arrayList4.add(new ImageSize(null, 604, 480, null, ImageSizeKey.SIZE_X_0604.i(), false, 40, null));
                    photo = new Photo(new Image(arrayList4));
                }
                photo.d = e3.getId();
                photo.e = e3.q();
                photo.u = e3.getTitle();
                if (photo.f.b == 100) {
                    photo.f = photo.e;
                }
                photo.L = sv1.v(M);
                return new AlbumAttachment(photo, e3.d(), e3.getDescription(), true);
            case 6:
                if (wallWallpostAttachmentDto.f() == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ArrayList arrayList5 = new ArrayList(1);
                arrayList5.add(new ImageSize(null, 135, 100, null, ImageSizeKey.SIZE_M_0130.i(), false, 40, null));
                return new PhotoAttachment(new Photo(new Image(arrayList5)));
            case 7:
                AudioAudioDto j = wallWallpostAttachmentDto.j();
                if (j != null) {
                    return new AudioAttachment(oc4.d(j));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 8:
                MarketMarketAlbumDto G = wallWallpostAttachmentDto.G();
                if (G == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                PhotosPhotoDto e5 = G.e();
                Photo a2 = e5 != null ? xfa0.a(e5) : GoodAlbum.zb();
                MarketMarketAlbumDto.TypeDto f3 = G.f();
                if (f3 == null) {
                    f3 = MarketMarketAlbumDto.TypeDto.MARKET;
                }
                int id = G.getId();
                UserId q3 = G.q();
                String title = G.getTitle();
                int count = G.getCount();
                int g2 = G.g();
                int i = f3.i();
                Boolean j2 = G.j();
                boolean booleanValue = j2 != null ? j2.booleanValue() : false;
                Boolean i2 = G.i();
                return new MarketAlbumAttachment(new GoodAlbum(id, q3, title, a2, count, g2, i, booleanValue, i2 != null ? i2.booleanValue() : false));
            case 9:
                VideoVideoFullDto K0 = wallWallpostAttachmentDto.K0();
                if (K0 != null) {
                    return this.b.a(K0, map);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 10:
                DocsDocDto o = wallWallpostAttachmentDto.o();
                if (o == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Document k = ao8.k(o);
                DocsDocPreviewDto g3 = o.g();
                return g3 == null ? new DocumentAttachment(k) : g3.e() != null ? new GraffitiAttachment(k) : g3.d() != null ? new AudioMessageAttachment(k) : new DocumentAttachment(k);
            case 11:
                BaseLinkDto D = wallWallpostAttachmentDto.D();
                if (D == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (D.u() == null) {
                    if (D.i() != null || D.g() != null || D.B() != null || D.o() != null) {
                        return aqw.j(D, map);
                    }
                    AwayLink awayLink = new AwayLink(D.getUrl(), null);
                    String title2 = D.getTitle();
                    String str2 = title2 == null ? "" : title2;
                    String k2 = D.k();
                    String str3 = k2 == null ? "" : k2;
                    BaseOwnerButtonActionTargetDto p = D.p();
                    String i3 = p != null ? p.i() : null;
                    String str4 = i3 == null ? "" : i3;
                    BaseLinkButtonDto e6 = D.e();
                    return new LinkAttachment(awayLink, str2, str3, str4, xf6.a(e6 != null ? e6.e() : null), null);
                }
                VideoVideoFullDto u = D.u();
                if (u == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                VideoFileOld d3 = ums0.d(ums0.a, u, null, null, null, 30);
                if (map != null && (owner = map.get(d3.b)) != null) {
                    d3.f1(owner);
                }
                String description = D.getDescription();
                String str5 = description == null ? "" : description;
                BaseLinkButtonDto e7 = D.e();
                if (e7 != null) {
                    String title3 = e7.getTitle();
                    if (title3 == null) {
                        title3 = "";
                    }
                    buttonAction = xf6.a(e7.e());
                    str = title3;
                } else {
                    str = "";
                    buttonAction = null;
                }
                AwayLink awayLink2 = new AwayLink(D.getUrl(), null);
                BaseOwnerButtonActionTargetDto p2 = D.p();
                String i4 = p2 != null ? p2.i() : null;
                String str6 = i4 == null ? "" : i4;
                String title4 = D.getTitle();
                String f4 = D.f();
                if (f4 == null || f4.length() == 0) {
                    f4 = Uri.parse(awayLink2.b).getAuthority();
                }
                return new VideoSnippetAttachment(d3, awayLink2, title4, str5, f4, str6, str, "", buttonAction);
            case 12:
                ArticlesArticleDto g4 = wallWallpostAttachmentDto.g();
                if (g4 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                UserId q4 = g4.q();
                if (q4 != null && map != null) {
                    owner3 = map.get(q4);
                }
                return new ArticleAttachment(ne7.B(g4, owner3));
            case 13:
                PollsPollDto l0 = wallWallpostAttachmentDto.l0();
                if (l0 != null) {
                    return new PollAttachment(new eub0().a(l0, map));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 14:
                NotesNoteDto T = wallWallpostAttachmentDto.T();
                if (T != null) {
                    return new NoteAttachment(T.getTitle(), T.q().b, T.getId());
                }
                throw new IllegalArgumentException("Required value was null.");
            case 15:
                PagesWikipageFullDto W2 = wallWallpostAttachmentDto.W();
                if (W2 != null) {
                    return new WikiAttachment(W2.getTitle(), "", fkq0.e(W2.d()).b, W2.getId());
                }
                throw new IllegalArgumentException("Required value was null.");
            case 16:
                BaseStickerDto D0 = wallWallpostAttachmentDto.D0();
                if (D0 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                StickerItem a3 = bo6.a(D0);
                Integer j3 = D0.j();
                return new StickerAttachment(a3, j3 != null ? j3.intValue() : 0, null, 4, null);
            case 17:
                AudioPlaylistDto k3 = wallWallpostAttachmentDto.k();
                if (k3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                it4 it4Var = this.a;
                it4Var.getClass();
                jt4.a.getClass();
                Playlist a4 = jt4.a(k3);
                UserId c = it4Var.a.c();
                List singletonList = Collections.singletonList(a4);
                dlv dlvVar = new dlv();
                if (map != null && (values = map.values()) != null) {
                    for (Owner owner4 : values) {
                        UserId userId = owner4.b;
                        String str7 = owner4.c;
                        ((LinkedHashMap) dlvVar.b).put(fkq0.a(owner4.b), new PlaylistOwner(userId, str7 == null ? "" : str7, null, str7, owner4.l, null, null, 100, null));
                    }
                }
                dlvVar.d(c, singletonList);
                return new AudioPlaylistAttachment(a4);
            case 18:
                AudioArtistDto i5 = wallWallpostAttachmentDto.i();
                if (i5 != null) {
                    return new AudioArtistAttachment(sp.n(i5, false));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 19:
                AudioCuratorDto n = wallWallpostAttachmentDto.n();
                if (n == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Integer e8 = n.e();
                String num = e8 != null ? e8.toString() : null;
                String str8 = num == null ? "" : num;
                String f5 = n.f();
                String str9 = f5 == null ? "" : f5;
                String description2 = n.getDescription();
                String str10 = description2 == null ? "" : description2;
                new ne6();
                Image a5 = ne6.a(n.g());
                String url2 = n.getUrl();
                if (url2 == null) {
                    url2 = Curator.a.a(str8);
                }
                String str11 = url2;
                Boolean i6 = n.i();
                boolean booleanValue2 = i6 != null ? i6.booleanValue() : false;
                Boolean d4 = n.d();
                boolean booleanValue3 = d4 != null ? d4.booleanValue() : false;
                String r = n.r();
                return new AudioCuratorAttachment(new Curator(str8, str9, str10, a5, str11, booleanValue2, booleanValue3, r == null ? "" : r));
            case 20:
                PrettyCardsPrettyCardsDto w0 = wallWallpostAttachmentDto.w0();
                if (w0 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                List<PrettyCardsPrettyCardDto> d5 = w0.d();
                ArrayList arrayList6 = new ArrayList(c5g.u(d5, 10));
                for (PrettyCardsPrettyCardDto prettyCardsPrettyCardDto : d5) {
                    String e9 = prettyCardsPrettyCardDto.e();
                    String d6 = prettyCardsPrettyCardDto.d();
                    String str12 = d6 == null ? "" : d6;
                    PrettyCardsPrettyCardDto.LinkUrlTargetDto i7 = prettyCardsPrettyCardDto.i();
                    String i8 = i7 != null ? i7.i() : null;
                    String str13 = i8 == null ? "" : i8;
                    AwayLink awayLink3 = new AwayLink(prettyCardsPrettyCardDto.g(), null);
                    String title5 = prettyCardsPrettyCardDto.getTitle();
                    String j4 = prettyCardsPrettyCardDto.j();
                    String str14 = j4 == null ? "" : j4;
                    String k4 = prettyCardsPrettyCardDto.k();
                    String str15 = k4 == null ? "" : k4;
                    new ne6();
                    arrayList6.add(new PrettyCardAttachment.Card(e9, str12, str13, awayLink3, title5, null, ne6.a(prettyCardsPrettyCardDto.f()), str14, str15, null, null));
                }
                return new PrettyCardAttachment(arrayList6);
            case 21:
                AudioAudioDto a0 = wallWallpostAttachmentDto.a0();
                if (a0 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                MusicTrack d7 = oc4.d(a0);
                return new PodcastAttachment(d7, map != null ? map.get(d7.c) : null);
            case 22:
                NarrativesNarrativeDto R = wallWallpostAttachmentDto.R();
                if (R != null) {
                    return new NarrativeAttachment(f370.F(R, map, null, null));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 23:
                EventsEventAttachDto u2 = wallWallpostAttachmentDto.u();
                if (u2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (map != null) {
                    Owner owner5 = map.get(fkq0.e(fkq0.a(u2.g())));
                    if (owner5 == null) {
                        throw new IllegalArgumentException("null owner");
                    }
                    List<UserId> f6 = u2.f();
                    ArrayList arrayList7 = new ArrayList();
                    Iterator<T> it = f6.iterator();
                    while (it.hasNext()) {
                        Owner owner6 = map.get((UserId) it.next());
                        if (owner6 != null) {
                            arrayList7.add(owner6);
                        }
                    }
                    ArrayList arrayList8 = !arrayList7.isEmpty() ? arrayList7 : null;
                    Integer k5 = u2.k();
                    int intValue4 = k5 != null ? k5.intValue() : 0;
                    String d8 = u2.d();
                    String str16 = d8 == null ? "" : d8;
                    GroupsGroupFullMemberStatusDto i9 = u2.i();
                    return new EventAttachment(owner5, intValue4, str16, i9 != null ? i9.i() : 0, u2.l(), u2.j(), u2.e(), arrayList8);
                }
                return null;
            case 24:
                AppsMiniAppAttachDto M2 = wallWallpostAttachmentDto.M();
                if (M2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                AppsAppMinDto d9 = M2.d();
                if (d9 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ApiApplication b2 = e13.b(d9);
                List<BaseImageDto> g5 = M2.g();
                if (g5 != null) {
                    List<BaseImageDto> list = g5;
                    arrayList = new ArrayList(c5g.u(list, 10));
                    for (BaseImageDto baseImageDto : list) {
                        arrayList.add(new NotificationImage.ImageInfo(baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.getUrl()));
                    }
                } else {
                    arrayList = null;
                }
                NotificationImage notificationImage = new NotificationImage(arrayList);
                AppsMiniAppAttachButtonDto e10 = M2.e();
                MiniAppAttachment.Button button = e10 != null ? new MiniAppAttachment.Button(e10.d(), e10.e().i(), new MiniAppAttachment.Action.OpenApp()) : null;
                String title6 = M2.getTitle();
                String description3 = M2.getDescription();
                String f7 = M2.f();
                return new MiniAppAttachment(b2, title6, description3, f7 == null ? "" : f7, notificationImage, button);
            case 25:
                DonutDonutLinkAttachDto p3 = wallWallpostAttachmentDto.p();
                if (p3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                DonutAttachDonatorsInfoDto f8 = p3.f();
                if (f8.d().isEmpty()) {
                    arrayList2 = null;
                } else {
                    ArrayList arrayList9 = new ArrayList();
                    for (UserId userId2 : f8.d()) {
                        if (map != null && (owner2 = map.get(userId2)) != null) {
                            arrayList9.add(owner2);
                        }
                    }
                    arrayList2 = arrayList9;
                }
                BaseLinkButtonDto e11 = p3.e();
                BaseLinkButtonActionDto e12 = e11.e();
                if (e12 == null || (b = wf6.b(e12)) == null) {
                    linkButton = null;
                } else {
                    String title7 = e11.getTitle();
                    String str17 = title7 != null ? title7 : "";
                    BaseLinkButtonStyleDto o2 = e11.o();
                    linkButton = new LinkButton(str17, b, o2 != null ? o2.name() : null);
                }
                if (linkButton == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                BaseLinkButtonActionDto d10 = p3.d();
                if (d10 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Action b3 = wf6.b(d10);
                if (b3 != null) {
                    return new DonutLinkAttachment(map != null ? map.get(p3.q()) : null, p3.q(), p3.g(), f8.getCount(), f8.e(), arrayList2, linkButton, b3);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 26:
                SituationalSuggestsThemeDto y0 = wallWallpostAttachmentDto.y0();
                if (y0 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int id2 = y0.getId();
                String title8 = y0.getTitle();
                String str18 = title8 == null ? "" : title8;
                String description4 = y0.getDescription();
                String str19 = description4 == null ? "" : description4;
                String d11 = y0.d();
                String str20 = d11 == null ? "" : d11;
                Boolean f9 = y0.f();
                return new SituationalThemeAttachment(id2, str18, str19, str20, f9 != null ? f9.booleanValue() : false);
            case 27:
                return l9x0.a(wallWallpostAttachmentDto.B());
            case 28:
            case 29:
                return null;
            case 30:
                WallActionButtonDto d12 = wallWallpostAttachmentDto.d();
                if (d12 != null) {
                    String j5 = d12.j().j();
                    String title9 = d12.getTitle();
                    NewsfeedNewsfeedItemHeaderTextDto i10 = d12.i();
                    Action b4 = wf6.b(d12.d());
                    if (b4 == null) {
                        b4 = new ActionEmpty();
                    }
                    Action action = b4;
                    WallActionButtonProgressDto g6 = d12.g();
                    return new ActionButtonAttachment(j5, title9, action, g6 != null ? new ActionButtonProgress(g6.d()) : null, d12.e() != null ? new ActionButtonDonutGoal(r2.d()) : null, d12.f() != null ? new ActionButtonDonutLevel(r2.d()) : null, i10, null, null, d12.k(), 384, null);
                }
                return null;
            default:
                com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Unknown type " + wallWallpostAttachmentDto.H0() + " while mapping attach " + wallWallpostAttachmentDto));
                return null;
        }
    }
}
