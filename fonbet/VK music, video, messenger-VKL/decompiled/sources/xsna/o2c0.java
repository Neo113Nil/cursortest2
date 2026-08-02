package xsna;

import android.net.Uri;
import android.os.Parcelable;
import com.vk.api.generated.wall.dto.WallActionButtonTypeDto;
import com.vk.api.generated.wall.dto.WallPostingSettingsActionButtonVkTicketDto;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.photo.Photo;
import com.vk.dto.tags.Tag;
import com.vk.newsfeed.posting.api.analytics.PostingAttachmentInfo;
import com.vk.newsfeed.posting.api.analytics.PrivacyPostTypeMetricModel;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageCropResult;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.impl.domain.model.CropCarouselType;
import com.vk.newsfeed.posting.impl.domain.model.EmptyCropArea;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTag;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTagRequestParam;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$Editing$CropPhoto$AddCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$Editing$CropPhoto$NewRatioSet;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$Editing$CropPhoto$RecalculateRatio;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$Editing$CropPhoto$RemoveCrops;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$Editing$CropPhoto$SetCurrentRatio;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$Editing$CropPhoto$UpdateSmallCrop;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingHints;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.RelativeImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageButton;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.domain.model.music.MusicAttachDto;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.domain.request.ParsedAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoTagsData;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.efc0;
import xsna.fic0;
import xsna.fmc0;
import xsna.h3k0;
import xsna.hic0;
import xsna.ibc0;
import xsna.wic0;

/* compiled from: PostEditingFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class o2c0 {
    public final efc0.a a;
    public final wgc0 b;
    public final wj50<fmc0> c;
    public final h7v d;
    public final h3k0 e;
    public final q1t f;
    public final rj01 g;
    public final qs9 h;
    public final ibc0 i;
    public final vba0 j;
    public final b24 k;

    /* compiled from: PostEditingFeatureDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CropCarouselType.values().length];
            try {
                iArr[CropCarouselType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropCarouselType.FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o2c0(efc0.a aVar, wgc0 wgc0Var, nbq0 nbq0Var, wj50 wj50Var, qvn qvnVar, h7v h7vVar, h3k0 h3k0Var, q1t q1tVar) {
        this.a = aVar;
        this.b = wgc0Var;
        this.c = wj50Var;
        this.d = h7vVar;
        this.e = h3k0Var;
        this.f = q1tVar;
        this.g = qvnVar.c;
        this.h = qvnVar.d;
        ibc0 ibc0Var = qvnVar.i;
        this.i = ibc0Var;
        this.j = vba0.a;
        this.k = new b24(aVar, nbq0Var, ibc0Var);
    }

    public static fmc0.p e(PostingUserMessageText postingUserMessageText) {
        return new fmc0.p(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_negative), postingUserMessageText, null, 4, null));
    }

    public static ImageCropArea f(PostingAttachment postingAttachment, PostingPreviewRatio postingPreviewRatio) {
        PhotoAttachment photoAttachment;
        ImageSize k;
        Uri uri;
        Attachment nb = postingAttachment.nb();
        if (nb instanceof LocalPhotoAttachment) {
            LocalPhotoAttachment localPhotoAttachment = (LocalPhotoAttachment) nb;
            return com.vk.newsfeed.posting.impl.domain.model.c.a(localPhotoAttachment.Hb(), localPhotoAttachment.getUri(), postingPreviewRatio, localPhotoAttachment.z, localPhotoAttachment.A);
        }
        if (!(nb instanceof PhotoAttachment) || (k = his0.k((photoAttachment = (PhotoAttachment) nb))) == null) {
            return null;
        }
        Image image = k.d;
        String Hb = photoAttachment.Hb();
        String str = image.d;
        if (str == null || (uri = Uri.parse(str)) == null) {
            uri = Uri.EMPTY;
        }
        return com.vk.newsfeed.posting.impl.domain.model.c.a(Hb, uri, postingPreviewRatio, image.b, image.c);
    }

    public static Tag g(PhotoAttachment photoAttachment, PhotoTag photoTag) {
        Photo photo = photoAttachment.l;
        Object obj = null;
        if (photo.c != photoTag.g) {
            return null;
        }
        Iterator<T> it = photo.x.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Tag) next).a == photoTag.b) {
                obj = next;
                break;
            }
        }
        return (Tag) obj;
    }

    public final void a(PostingState.Editing editing, PrivacyPostType privacyPostType) {
        PrivacyPostType privacyPostType2 = editing.i.i;
        boolean equals = privacyPostType.equals(PrivacyPostType.AllUsers.b);
        ibc0 ibc0Var = this.i;
        if (equals) {
            if (x19.G(privacyPostType2)) {
                ibc0Var.x().c(false);
            }
            ibc0Var.x().b(PrivacyPostTypeMetricModel.ALL_USERS);
            return;
        }
        if (privacyPostType.equals(PrivacyPostType.BestFriends.b)) {
            if (x19.G(privacyPostType2)) {
                ibc0Var.x().c(false);
            }
            ibc0Var.x().b(PrivacyPostTypeMetricModel.BEST_FRIENDS);
        } else if (privacyPostType.equals(PrivacyPostType.FriendsOnly.b)) {
            if (x19.G(privacyPostType2)) {
                ibc0Var.x().c(false);
            }
            ibc0Var.x().b(PrivacyPostTypeMetricModel.FRIENDS_ONLY);
        } else if (privacyPostType.equals(PrivacyPostType.AllDonuts.b)) {
            ibc0Var.x().c(true);
        } else {
            if (!(privacyPostType instanceof PrivacyPostType.SingleDonutLevel)) {
                throw new NoWhenBranchMatchedException();
            }
            ibc0Var.x().c(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:316:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:331:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Object, xsna.o2c0] */
    /* JADX WARN: Type inference failed for: r2v127 */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v129 */
    /* JADX WARN: Type inference failed for: r2v178, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v8, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(PostingState postingState, PostingAction.Editing editing) {
        String c;
        Object obj;
        String str;
        ?? r7;
        Iterable iterable;
        int size;
        boolean z;
        Uri uri;
        boolean z2;
        Object obj2;
        PostEditableData postEditableData;
        s3q0 s3q0Var;
        String url;
        com.vk.dto.common.Image image;
        ImageSize Cb;
        PhotoTag photoTag;
        Photo photo;
        Map<Integer, List<PhotoTag>> map;
        Collection<List<PhotoTag>> values;
        Object obj3;
        Photo photo2;
        ?? r2;
        UploadDto.UploadState I4;
        ParsedAttachment parsedAttachment;
        efc0.a aVar = this.a;
        efc0 efc0Var = aVar.a;
        boolean z3 = postingState instanceof PostingState.Editing;
        if (!z3) {
            return;
        }
        int i = 3;
        if (editing instanceof PostingAction.Editing.Text) {
            PostingAction.Editing.Text text = (PostingAction.Editing.Text) editing;
            wgc0 wgc0Var = this.b;
            efc0.a aVar2 = wgc0Var.a;
            if (z3) {
                if (text instanceof PostingAction.Editing.Text.Changed) {
                    PostingAction.Editing.Text.Changed changed = (PostingAction.Editing.Text.Changed) text;
                    aVar2.a(new wic0.a(changed.b));
                    if (changed.c) {
                        wgc0Var.b.onNext(fmc0.w.a.a);
                        return;
                    }
                    return;
                }
                if (text instanceof PostingAction.Editing.Text.ParseLinks) {
                    PostingState.Editing editing2 = (PostingState.Editing) postingState;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str2 : ((PostingAction.Editing.Text.ParseLinks) text).b) {
                        if (!editing2.i.w.b.contains(str2)) {
                            arrayList.add(str2);
                        }
                        if (!arrayList2.contains(str2)) {
                            arrayList2.add(str2);
                        }
                    }
                    aVar2.a(new wic0.b(arrayList2));
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    l730 l730Var = new l730("wall.parseAttachedLink");
                    l730Var.K("links", kvf.a(arrayList2).toString());
                    l730Var.K("fields", "video_files");
                    l730Var.K("extended", "1");
                    l730Var.K("parsing_type", "posting_v2");
                    aVar2.a.e.b(rsg0.T(l730Var).subscribe(new tk40(new gib0(wgc0Var, 3), 13), new m5y(new rvq(20), 19)));
                    return;
                }
                if (text instanceof PostingAction.Editing.Text.RemoveLinks) {
                    aVar2.a(new wic0.c(((PostingAction.Editing.Text.RemoveLinks) text).b));
                    return;
                }
                if (!(text instanceof PostingAction.Editing.Text.ParsedAttachmentsByLinks)) {
                    throw new NoWhenBranchMatchedException();
                }
                PostingState.Editing editing3 = (PostingState.Editing) postingState;
                List<ParsedAttachment> list = ((PostingAction.Editing.Text.ParsedAttachmentsByLinks) text).b;
                PostEditableData postEditableData2 = editing3.i;
                List<ParsedAttachment> list2 = postEditableData2.w.c;
                ArrayList arrayList3 = new ArrayList(postEditableData2.p);
                List<ParsedAttachment> list3 = list;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list3) {
                    ParsedAttachment parsedAttachment2 = (ParsedAttachment) obj4;
                    Attachment attachment = parsedAttachment2.b;
                    if ((attachment instanceof PhotoAttachment) || (attachment instanceof VideoAttachment)) {
                        List<ParsedAttachment> list4 = list2;
                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                if (((ParsedAttachment) it.next()).c.equals(parsedAttachment2.c)) {
                                    break;
                                }
                            }
                        }
                        arrayList4.add(obj4);
                    }
                }
                int i2 = editing3.d.c;
                if (!arrayList3.isEmpty()) {
                    wgc0Var.a(i2, arrayList3, arrayList4);
                    return;
                }
                if (!arrayList4.isEmpty()) {
                    wgc0Var.a(i2, arrayList3, arrayList4);
                    return;
                }
                for (?? r22 : list3) {
                    Attachment attachment2 = ((ParsedAttachment) r22).b;
                    if ((attachment2 instanceof SnippetAttachment) || (attachment2 instanceof ArticleAttachment)) {
                        parsedAttachment = r22;
                        break;
                    }
                }
                parsedAttachment = null;
                ParsedAttachment parsedAttachment3 = parsedAttachment;
                if (parsedAttachment3 != null) {
                    aVar2.a(new e.b.h.a(parsedAttachment3));
                    return;
                }
                return;
            }
            return;
        }
        if (editing instanceof PostingAction.Editing.AdditionalSettingsChanged) {
            PostingAction.Editing.AdditionalSettingsChanged additionalSettingsChanged = (PostingAction.Editing.AdditionalSettingsChanged) editing;
            aVar.a(new xic0(additionalSettingsChanged.b, additionalSettingsChanged.c, additionalSettingsChanged.d));
            return;
        }
        if (editing instanceof PostingAction.Editing.Attach) {
            PostingAction.Editing.Attach attach = (PostingAction.Editing.Attach) editing;
            b24 b24Var = this.k;
            nbq0 nbq0Var = b24Var.b;
            nbq0 nbq0Var2 = b24Var.b;
            ibc0 ibc0Var = b24Var.c;
            efc0.a aVar3 = b24Var.a;
            if (attach instanceof PostingAction.Editing.Attach.SetPoll) {
                PostingPollDto postingPollDto = ((PostingAction.Editing.Attach.SetPoll) attach).b;
                ibc0Var.u().N(new PostingAttachmentInfo(postingPollDto.c.b, postingPollDto.b, null, null, null, 28, null));
                aVar3.a(new fic0.j(postingPollDto));
                return;
            }
            if (attach instanceof PostingAction.Editing.Attach.RemovePoll) {
                if (z3) {
                    PostingPollDto postingPollDto2 = ((PostingState.Editing) postingState).i.e;
                    if (postingPollDto2 != null) {
                        ibc0Var.u().H(new PostingAttachmentInfo(postingPollDto2.c.b, postingPollDto2.b, null, null, null, 28, null));
                    }
                    aVar3.a(fic0.e.b);
                    return;
                }
                return;
            }
            if (attach instanceof PostingAction.Editing.Attach.SetPlace) {
                PostingAction.Editing.Attach.SetPlace setPlace = (PostingAction.Editing.Attach.SetPlace) attach;
                PostingPlaceDto postingPlaceDto = setPlace.b;
                ibc0Var.u().I(new PostingAttachmentInfo(0L, postingPlaceDto.b, null, null, null, 28, null), setPlace.c);
                aVar3.a(new fic0.a(postingPlaceDto));
                return;
            }
            if (attach instanceof PostingAction.Editing.Attach.RemovePlace) {
                if (z3) {
                    if (((PostingState.Editing) postingState).i.f != null) {
                        ibc0Var.u().L(new PostingAttachmentInfo(0L, r1.b, null, null, null, 28, null));
                    }
                    aVar3.a(fic0.d.b);
                    return;
                }
                return;
            }
            if (attach instanceof PostingAction.Editing.Attach.SetMusicPlaylist) {
                PostingAction.Editing.Attach.SetMusicPlaylist setMusicPlaylist = (PostingAction.Editing.Attach.SetMusicPlaylist) attach;
                MusicDto musicDto = setMusicPlaylist.b;
                if (musicDto.n.e()) {
                    nbq0Var2.c(setMusicPlaylist.b, null, true);
                }
                aVar3.a(new fic0.g(musicDto));
                return;
            }
            if (attach instanceof PostingAction.Editing.Attach.SetMusicTracks) {
                List<MusicDto> list5 = ((PostingAction.Editing.Attach.SetMusicTracks) attach).b;
                for (MusicDto musicDto2 : list5) {
                    if (musicDto2.n.e()) {
                        nbq0Var2.c(musicDto2, null, true);
                    }
                }
                aVar3.a(new fic0.i(list5));
                return;
            }
            if (attach instanceof PostingAction.Editing.Attach.SetMusicSnippet) {
                MusicDto musicDto3 = ((PostingAction.Editing.Attach.SetMusicSnippet) attach).b;
                if (musicDto3.n.e()) {
                    nbq0Var2.c(musicDto3, null, true);
                }
                aVar3.a(new fic0.h(musicDto3));
                return;
            }
            if (attach instanceof PostingAction.Editing.Attach.RemoveMusic) {
                if (z3) {
                    MusicAttachDto musicAttachDto = ((PostingState.Editing) postingState).i.l;
                    if (musicAttachDto instanceof MusicAttachDto.MusicPlaylistDto) {
                        MusicAttachDto.MusicPlaylistDto musicPlaylistDto = (MusicAttachDto.MusicPlaylistDto) musicAttachDto;
                        ibc0Var.u().v(kbc0.h(musicPlaylistDto.b));
                        nbq0Var.a(musicPlaylistDto.b.n.d);
                    } else if (musicAttachDto instanceof MusicAttachDto.MusicTracksDto) {
                        for (MusicDto musicDto4 : ((MusicAttachDto.MusicTracksDto) musicAttachDto).b) {
                            ibc0Var.u().v(kbc0.h(musicDto4));
                            nbq0Var.a(musicDto4.n.d);
                        }
                    }
                    aVar3.a(fic0.c.b);
                    return;
                }
                return;
            }
            if (attach instanceof PostingAction.Editing.Attach.SetFile) {
                PostingAction.Editing.Attach.SetFile setFile = (PostingAction.Editing.Attach.SetFile) attach;
                FileDto fileDto = setFile.b;
                aVar3.a(new fic0.f(fileDto));
                if (fileDto.I4().e()) {
                    nbq0Var2.c(setFile.b, null, true);
                }
                aVar3.a(new e.i(EmptyList.b));
                return;
            }
            if (!(attach instanceof PostingAction.Editing.Attach.RemoveFile)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z3) {
                FileDto fileDto2 = ((PostingState.Editing) postingState).i.m;
                if (fileDto2 != null && (I4 = fileDto2.I4()) != null) {
                    nbq0Var.a(I4.d);
                }
                aVar3.a(fic0.b.b);
                return;
            }
            return;
        }
        boolean z4 = editing instanceof PostingAction.Editing.SetPostponePublish;
        ibc0 ibc0Var2 = this.i;
        if (z4) {
            Date date = ((PostingAction.Editing.SetPostponePublish) editing).b;
            if (date != null) {
                ibc0Var2.x().i(date.getTime() / 1000);
            }
            aVar.a(new uic0(date));
            return;
        }
        if (editing instanceof PostingAction.Editing.PrivacySettingsChanged) {
            PostPrivacyData postPrivacyData = ((PostingAction.Editing.PrivacySettingsChanged) editing).b;
            if (z3) {
                a((PostingState.Editing) postingState, postPrivacyData.d);
                aVar.a(new cjc0(postPrivacyData));
                return;
            }
            return;
        }
        if (editing instanceof PostingAction.Editing.PrivacySelectedPrivacyTypeChanged) {
            PrivacyPostType privacyPostType = ((PostingAction.Editing.PrivacySelectedPrivacyTypeChanged) editing).b;
            if (z3) {
                a((PostingState.Editing) postingState, privacyPostType);
                aVar.a(new yic0(privacyPostType));
                return;
            }
            return;
        }
        if (editing instanceof PostingAction.Editing.DonutTeaserTextChanged) {
            aVar.a(new zic0(((PostingAction.Editing.DonutTeaserTextChanged) editing).b));
            return;
        }
        if (editing instanceof PostingAction.Editing.CoauthorsSelected) {
            aVar.a(new gic0(((PostingAction.Editing.CoauthorsSelected) editing).b));
            return;
        }
        if (editing instanceof PostingAction.Editing.RemoveCoauthors) {
            aVar.a(oic0.b);
            return;
        }
        if (editing instanceof PostingAction.Editing.RemoveCustomDonutTeaser) {
            aVar.a(pic0.b);
            return;
        }
        boolean z5 = true;
        if (editing instanceof PostingAction.Editing.SetPhotoVideoDisplayMode) {
            PostingAction.Editing.SetPhotoVideoDisplayMode setPhotoVideoDisplayMode = (PostingAction.Editing.SetPhotoVideoDisplayMode) editing;
            if (z3) {
                ibc0.g x = ibc0Var2.x();
                PhotoVideoDisplayMode photoVideoDisplayMode = setPhotoVideoDisplayMode.b;
                x.a(photoVideoDisplayMode == PhotoVideoDisplayMode.Carousel, setPhotoVideoDisplayMode.c);
                PostEditableData postEditableData3 = ((PostingState.Editing) postingState).i;
                List<PostingAttachment> list6 = postEditableData3.p;
                if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                    for (PostingAttachment postingAttachment : list6) {
                        if (postingAttachment instanceof PhotoDto) {
                            Attachment attachment3 = ((PhotoDto) postingAttachment).c;
                            PhotoAttachment photoAttachment = attachment3 instanceof PhotoAttachment ? (PhotoAttachment) attachment3 : null;
                            if (photoAttachment != null && (photo2 = photoAttachment.l) != null && photo2.r) {
                                r2 = true;
                                break;
                            }
                        }
                    }
                }
                r2 = false;
                PhotoTagsData photoTagsData = postEditableData3.r;
                Map<Integer, List<PhotoTag>> map2 = photoTagsData != null ? photoTagsData.b : null;
                r10 = map2 == null || map2.isEmpty();
                if (photoVideoDisplayMode == PhotoVideoDisplayMode.Grid && (r2 != false || !r10)) {
                    aVar.e(fmc0.t.a);
                }
                aVar.a(new tic0(photoVideoDisplayMode));
                return;
            }
            return;
        }
        if (editing instanceof PostingAction.Editing.SetPhotoVideoCropData) {
            aVar.a(new hic0.g(((PostingAction.Editing.SetPhotoVideoCropData) editing).b));
            return;
        }
        if (editing instanceof PostingAction.Editing.MovePhotoVideo) {
            PostingAction.Editing.MovePhotoVideo movePhotoVideo = (PostingAction.Editing.MovePhotoVideo) editing;
            aVar.a(new lic0(movePhotoVideo.b, movePhotoVideo.c));
            return;
        }
        if (editing instanceof PostingAction.Editing.RemoveTagsForPhoto) {
            aVar.a(new ric0(Collections.singleton(Integer.valueOf(((PostingAction.Editing.RemoveTagsForPhoto) editing).b))));
            return;
        }
        if (!(editing instanceof PostingAction.Editing.RemovePhotoTag)) {
            if (editing instanceof PostingAction.Editing.RemovePhotoTags) {
                PostingState.Editing editing4 = (PostingState.Editing) postingState;
                Iterator<PhotoTag> it2 = ((PostingAction.Editing.RemovePhotoTags) editing).b.iterator();
                while (it2.hasNext()) {
                    c(editing4, it2.next());
                }
                return;
            }
            int i3 = 4;
            int i4 = 2;
            if (editing instanceof PostingAction.Editing.UpdatePhoto) {
                PostingState.Editing editing5 = (PostingState.Editing) postingState;
                PostingAction.Editing.UpdatePhoto updatePhoto = (PostingAction.Editing.UpdatePhoto) editing;
                ArrayList a2 = n2c0.a(editing5.i);
                ArrayList arrayList5 = new ArrayList(c5g.u(a2, 10));
                Iterator it3 = a2.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(Integer.valueOf(((Photo) it3.next()).c));
                }
                Photo photo3 = updatePhoto.b;
                if (arrayList5.contains(Integer.valueOf(photo3.c))) {
                    if (photo3.r && !photo3.m) {
                        io.reactivex.rxjava3.internal.operators.single.y l = this.g.f(Collections.singletonList(new PhotoTagRequestParam(photo3.c, photo3.e, photo3.v))).q(asu0.a.c()).l(new xhb0(new fv90(photo3, 9), 2));
                        fv70 fv70Var = new fv70(new ogd(this, photo3, editing5, 4), i3);
                        int i5 = kwg0.a;
                        efc0Var.e.b(l.subscribe(fv70Var, new iwg0()));
                        return;
                    }
                    List<Tag> list7 = photo3.x;
                    ArrayList arrayList6 = new ArrayList(c5g.u(list7, 10));
                    for (Tag tag : list7) {
                        this.j.getClass();
                        int i6 = tag.a;
                        UserId userId = tag.d;
                        n0o0 n0o0Var = tag.f;
                        Integer x2 = f870.x(n0o0Var.b);
                        String str3 = n0o0Var.c;
                        Photo photo4 = n0o0Var.d;
                        arrayList6.add(new PhotoTag(i6, userId, x2, str3, (photo4 == null || (image = photo4.y) == null || (Cb = image.Cb(vba0.b, z5, r10)) == null) ? null : Cb.d.d, tag.e, Float.valueOf((float) tag.g), Float.valueOf((float) tag.h)));
                        z5 = z5;
                        r10 = false;
                    }
                    aVar.a(new ajc0(photo3, arrayList6));
                    i(editing5, arrayList6);
                    h(editing5, !arrayList6.isEmpty());
                    return;
                }
                return;
            }
            if (editing instanceof PostingAction.Editing.SetActionButton) {
                d(postingState, ((PostingAction.Editing.SetActionButton) editing).b);
                return;
            }
            if (editing instanceof PostingAction.Editing.SelectVkTicketMiniAppActionButton) {
                ActionButton actionButton = ((PostingAction.Editing.SelectVkTicketMiniAppActionButton) editing).b;
                if (actionButton != null) {
                    WallPostingSettingsActionButtonVkTicketDto g = actionButton.b.g();
                    if (g == null || (url = g.getUrl()) == null) {
                        s3q0Var = null;
                    } else {
                        ibc0Var2.u().u(kbc0.g(actionButton, ((PostingState.Editing) postingState).c.b.b.b));
                        aVar.e(new fmc0.j.m(url));
                        gs80 gs80Var = new gs80(i4, this, postingState);
                        q1t q1tVar = this.f;
                        q1tVar.b = actionButton;
                        r3y.c("tickets_posting_select");
                        r3y.a("tickets_posting_select", new i2s0(1, gs80Var, q1tVar));
                        s3q0Var = s3q0.a;
                    }
                    if (s3q0Var != null) {
                        return;
                    }
                }
                d(postingState, null);
                return;
            }
            if (editing instanceof PostingAction.Editing.RememberActionButton) {
                if (z3) {
                    PostingState.Editing editing6 = (PostingState.Editing) postingState;
                    ActionButton actionButton2 = editing6.i.t;
                    if (actionButton2 != null) {
                        ibc0Var2.u().E(kbc0.g(actionButton2, editing6.c.b.b.b));
                        aVar.a(nic0.b);
                        return;
                    }
                }
                PostingState.Editing editing7 = z3 ? (PostingState.Editing) postingState : null;
                ibc0Var2.u().m(kbc0.g((editing7 == null || (postEditableData = editing7.i) == null) ? null : postEditableData.u, ((PostingState.Editing) postingState).c.b.b.b));
                aVar.a(nic0.b);
                return;
            }
            boolean z6 = editing instanceof PostingAction.Editing.CropEditorResult;
            wj50<fmc0> wj50Var = this.c;
            if (z6) {
                PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData = ((PostingState.Editing) postingState).i.j;
                ImageCropResult imageCropResult = ((PostingAction.Editing.CropEditorResult) editing).b;
                ImageLink imageLink = imageCropResult.b;
                Iterator it4 = com.vk.newsfeed.posting.impl.domain.model.c.d(photoVideoAttachmentsCropData, imageCropResult.c).iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj2 = it4.next();
                        if (agc0.a(imageLink, (ImageCropArea) obj2)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                ImageCropArea imageCropArea = (ImageCropArea) obj2;
                boolean z7 = imageCropResult.g;
                ImageCropArea imageCropArea2 = imageCropResult.d;
                if (z7) {
                    aVar.a(new hic0.c(imageLink));
                    ibc0Var2.j().e(kbc0.a(imageLink, imageCropArea, null));
                } else {
                    aVar.a(new hic0.f(e43.m(imageCropArea2)));
                    ibc0Var2.j().e(kbc0.a(imageLink, imageCropArea, imageCropArea2));
                }
                wj50Var.b(new fmc0.n(imageCropResult));
                return;
            }
            if (editing instanceof PostingAction$Editing$CropPhoto$RemoveCrops) {
                aVar.a(new hic0.a(((PostingAction$Editing$CropPhoto$RemoveCrops) editing).b));
                return;
            }
            if (editing instanceof PostingAction$Editing$CropPhoto$AddCropArea) {
                PostingAction$Editing$CropPhoto$AddCropArea postingAction$Editing$CropPhoto$AddCropArea = (PostingAction$Editing$CropPhoto$AddCropArea) editing;
                aVar.a(new hic0.e(postingAction$Editing$CropPhoto$AddCropArea.b, postingAction$Editing$CropPhoto$AddCropArea.c, postingAction$Editing$CropPhoto$AddCropArea.d));
                return;
            }
            if (editing instanceof PostingAction$Editing$CropPhoto$SetCurrentRatio) {
                PostEditableData postEditableData4 = ((PostingState.Editing) postingState).i;
                PostingAction$Editing$CropPhoto$SetCurrentRatio postingAction$Editing$CropPhoto$SetCurrentRatio = (PostingAction$Editing$CropPhoto$SetCurrentRatio) editing;
                PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData2 = postEditableData4.j;
                PostingPreviewRatio postingPreviewRatio = photoVideoAttachmentsCropData2.e;
                ArrayList arrayList7 = new ArrayList(com.vk.newsfeed.posting.impl.domain.model.c.d(photoVideoAttachmentsCropData2, postingPreviewRatio));
                List<EmptyCropArea> list8 = postEditableData4.j.c;
                if (list8 != null) {
                    r7 = new ArrayList();
                    for (Object obj5 : list8) {
                        if (Math.abs(w65.d(((EmptyCropArea) obj5).d) - w65.d(postingPreviewRatio)) <= 0.04f) {
                            r7.add(obj5);
                        }
                    }
                } else {
                    r7 = EmptyList.b;
                }
                ArrayList arrayList8 = new ArrayList((Collection) r7);
                List<PostingAttachment> list9 = postEditableData4.p;
                PhotoVideoDisplayMode photoVideoDisplayMode2 = postEditableData4.k;
                CropCarouselType cropCarouselType = postingAction$Editing$CropPhoto$SetCurrentRatio.b;
                if (list9.isEmpty()) {
                    iterable = EmptyList.b;
                } else if (list9.size() == 1 && photoVideoDisplayMode2 == PhotoVideoDisplayMode.Carousel) {
                    iterable = Collections.singletonList(f((PostingAttachment) j5g.Y(list9), postingPreviewRatio));
                } else if (photoVideoDisplayMode2 == PhotoVideoDisplayMode.Carousel) {
                    int i7 = a.$EnumSwitchMapping$0[cropCarouselType.ordinal()];
                    if (i7 == 1) {
                        size = list9.size();
                    } else {
                        if (i7 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        size = 1;
                    }
                    ArrayList arrayList9 = new ArrayList();
                    for (int i8 = 0; i8 < size; i8++) {
                        arrayList9.add(f(list9.get(i8), postingPreviewRatio));
                    }
                    iterable = arrayList9;
                } else {
                    iterable = photoVideoDisplayMode2 == PhotoVideoDisplayMode.Grid ? EmptyList.b : EmptyList.b;
                }
                int i9 = 0;
                for (Object obj6 : iterable) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        e43.t();
                        throw null;
                    }
                    ImageCropArea imageCropArea3 = (ImageCropArea) obj6;
                    if (imageCropArea3 != null) {
                        if (!arrayList7.isEmpty()) {
                            Iterator it5 = arrayList7.iterator();
                            while (it5.hasNext()) {
                                if (agc0.c((ImageCropArea) it5.next(), imageCropArea3)) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        if (!arrayList8.isEmpty()) {
                            Iterator it6 = arrayList8.iterator();
                            while (it6.hasNext()) {
                                EmptyCropArea emptyCropArea = (EmptyCropArea) it6.next();
                                String str4 = emptyCropArea.b;
                                if ((!agc0.e(str4) && str4.equals(imageCropArea3.b)) || ((uri = emptyCropArea.c) != null && uri.equals(imageCropArea3.c))) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        boolean z8 = i9 == 0;
                        if (!z && (!z2 || z8)) {
                            arrayList7.add(imageCropArea3);
                        }
                    }
                    i9 = i10;
                }
                aVar.a(new hic0.f(arrayList7));
                aVar.d(PostingAction.Stats.SendWaitingAnalytics.b);
                wj50Var.b(new fmc0.k(new vdc0(postingPreviewRatio, arrayList7, null, 12)));
                return;
            }
            if (editing instanceof PostingAction.Editing.EnableAuthorSign) {
                PostingAction.Editing.EnableAuthorSign enableAuthorSign = (PostingAction.Editing.EnableAuthorSign) editing;
                if (z3) {
                    List<CoauthorDto> list10 = ((PostingState.Editing) postingState).i.n;
                    if (list10 == null || list10.isEmpty()) {
                        aVar.a(new iic0(enableAuthorSign.b));
                        return;
                    } else {
                        wj50Var.b(new fmc0.p(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_signature_outline_28, R.attr.vk_ui_icon_accent_themed), new PostingUserMessageText.ResText(R.string.additional_settings_no_sign_with_coauthors), null, 4, null)));
                        return;
                    }
                }
                return;
            }
            if (editing instanceof PostingAction.Editing.MakeProfileOpen) {
                PostingContext postingContext = ((PostingState.Editing) postingState).c;
                zlc0 zlc0Var = (zlc0) this.h.b;
                efc0Var.e.b((fkq0.b(postingContext.b.b) ? zlc0Var.a(postingContext.b.b.b) : zlc0Var.b()).q(asu0.a.c()).subscribe(new bpk(this, i), new jsv(new bbw(this, 22), 14)));
                return;
            }
            if (!(editing instanceof PostingAction$Editing$CropPhoto$UpdateSmallCrop)) {
                if (editing instanceof PostingAction$Editing$CropPhoto$NewRatioSet) {
                    PostingState.Editing editing8 = (PostingState.Editing) postingState;
                    PostingPreviewRatio postingPreviewRatio2 = new PostingPreviewRatio(2, 3, false, false, 12, null);
                    PostingPreviewRatio postingPreviewRatio3 = new PostingPreviewRatio(16, 9, false, false, 12, null);
                    float f = ((PostingAction$Editing$CropPhoto$NewRatioSet) editing).b;
                    if (f >= w65.d(postingPreviewRatio2)) {
                        if (f > w65.d(postingPreviewRatio3)) {
                            postingPreviewRatio2 = postingPreviewRatio3;
                        } else {
                            Pair pair = new Pair(Integer.valueOf((int) 10000.0f), Integer.valueOf((int) ((100.0f / f) * 100.0f)));
                            postingPreviewRatio2 = new PostingPreviewRatio(((Number) pair.i()).intValue(), ((Number) pair.j()).intValue(), true, false, 8, null);
                        }
                    }
                    if (postingPreviewRatio2.d) {
                        c = "original";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(postingPreviewRatio2.b);
                        sb.append('_');
                        c = h5s.c(postingPreviewRatio2.c, "_manual", sb);
                    }
                    aVar.a(new hic0.d(postingPreviewRatio2, c));
                    List<ImageCropArea> d = com.vk.newsfeed.posting.impl.domain.model.c.d(editing8.i.j, postingPreviewRatio2);
                    wj50Var.b(new fmc0.k(new vdc0(postingPreviewRatio2, d.isEmpty() ? null : d, c, 4)));
                    return;
                }
                if (editing instanceof PostingAction$Editing$CropPhoto$RecalculateRatio) {
                    sq90 sq90Var = new sq90(1);
                    PostEditableData postEditableData5 = ((PostingState.Editing) postingState).i;
                    Pair b = sq90Var.b(postEditableData5.j, postEditableData5.p);
                    aVar.a(new hic0.d((PostingPreviewRatio) b.d(), (String) b.g()));
                    return;
                }
                if (editing instanceof PostingAction.Editing.EnableStoryRepost) {
                    boolean z9 = ((PostingAction.Editing.EnableStoryRepost) editing).b;
                    if (z3) {
                        aVar.a(new jic0(z9));
                        ibc0Var2.x().f(z9);
                        return;
                    }
                    return;
                }
                if (!(editing instanceof PostingAction.Editing.HideStoryRepostSwitchOnboarding)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z3) {
                    aVar.a(kic0.b);
                    return;
                }
                return;
            }
            PostingAction$Editing$CropPhoto$UpdateSmallCrop postingAction$Editing$CropPhoto$UpdateSmallCrop = (PostingAction$Editing$CropPhoto$UpdateSmallCrop) editing;
            if (z3) {
                boolean z10 = postingAction$Editing$CropPhoto$UpdateSmallCrop.c;
                MediaPickerSelectedItem mediaPickerSelectedItem = postingAction$Editing$CropPhoto$UpdateSmallCrop.b;
                if (!z10) {
                    aVar.a(new hic0.b(mediaPickerSelectedItem));
                    return;
                }
                PostingState.Editing editing9 = (PostingState.Editing) postingState;
                if (mediaPickerSelectedItem instanceof MediaPickerSelectedItem.LocalMedia) {
                    LocalMediaEntry localMediaEntry = ((MediaPickerSelectedItem.LocalMedia) mediaPickerSelectedItem).b;
                    Pair pair2 = new Pair(localMediaEntry.ba().f(), new Pair(Integer.valueOf(localMediaEntry.ba().getWidth()), Integer.valueOf(localMediaEntry.ba().getHeight())));
                    Uri uri2 = (Uri) pair2.d();
                    Pair pair3 = (Pair) pair2.g();
                    Iterator it7 = editing9.i.p.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it7.next();
                        PostingAttachment postingAttachment2 = (PostingAttachment) obj;
                        if (postingAttachment2 instanceof PhotoDto) {
                            Attachment attachment4 = ((PhotoDto) postingAttachment2).c;
                            LocalPhotoAttachment localPhotoAttachment = attachment4 instanceof LocalPhotoAttachment ? (LocalPhotoAttachment) attachment4 : null;
                            if (epx.f(localPhotoAttachment != null ? localPhotoAttachment.getUri() : null, uri2)) {
                                break;
                            }
                        }
                    }
                    PhotoDto photoDto = (PhotoDto) obj;
                    if (photoDto == null) {
                        return;
                    }
                    Attachment attachment5 = photoDto.c;
                    h3k0.a a3 = this.e.a(((Number) pair3.i()).intValue(), ((Number) pair3.j()).intValue());
                    if (a3.c == ((Number) pair3.i()).intValue() && a3.d == ((Number) pair3.j()).intValue()) {
                        return;
                    }
                    ibc0Var2.d().a();
                    RelativeImageCropArea relativeImageCropArea = new RelativeImageCropArea(a3.e, a3.f, a3.g, a3.h, a3.i, a3.j);
                    str = "";
                    if (attachment5 instanceof LocalPhotoAttachment) {
                        Parcelable parcelable = photoDto.f.h;
                        PhotoAttachment photoAttachment2 = parcelable instanceof PhotoAttachment ? (PhotoAttachment) parcelable : null;
                        str = photoAttachment2 != null ? photoAttachment2.Hb() : "";
                        if (agc0.e(str)) {
                            str = ((LocalPhotoAttachment) attachment5).Hb();
                        }
                    } else if (attachment5 instanceof PhotoAttachment) {
                        str = ((PhotoAttachment) attachment5).Hb();
                    }
                    String str5 = str;
                    LocalPhotoAttachment localPhotoAttachment2 = attachment5 instanceof LocalPhotoAttachment ? (LocalPhotoAttachment) attachment5 : null;
                    aVar.a(new hic0.e(new ImageCropArea(str5, localPhotoAttachment2 != null ? localPhotoAttachment2.getUri() : null, a3.a, a3.b, a3.c, a3.d, relativeImageCropArea, null, 128, null), attachment5, true));
                    return;
                }
                return;
            }
            return;
        }
        PostingState.Editing editing10 = (PostingState.Editing) postingState;
        PostEditableData postEditableData6 = editing10.i;
        PhotoTagsData photoTagsData2 = postEditableData6.r;
        if (photoTagsData2 != null && (map = photoTagsData2.b) != null && (values = map.values()) != null) {
            Iterator it8 = values.iterator();
            while (true) {
                if (it8.hasNext()) {
                    obj3 = it8.next();
                    if (!((List) obj3).isEmpty()) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            List list11 = (List) obj3;
            if (list11 != null) {
                photoTag = (PhotoTag) j5g.a0(list11);
                if (photoTag == null) {
                    Iterator it9 = n2c0.a(postEditableData6).iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            photo = null;
                            break;
                        }
                        ?? next = it9.next();
                        if (((Photo) next).c == photoTag.g) {
                            photo = next;
                            break;
                        }
                    }
                    Photo photo5 = photo;
                    if (photo5 == null) {
                        return;
                    }
                    aVar.d(new PostingAction.Stats.SendRemoveTag(photo5, photoTag));
                    c(editing10, photoTag);
                    return;
                }
                return;
            }
        }
        photoTag = null;
        if (photoTag == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[EDGE_INSN: B:17:0x004a->B:18:0x004a BREAK  A[LOOP:0: B:2:0x0008->B:34:0x0008], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0008 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(PostingState.Editing editing, PhotoTag photoTag) {
        Object obj;
        Tag tag;
        Iterator<PostingAttachment> it = editing.i.p.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                tag = null;
                break;
            }
            PostingAttachment next = it.next();
            if (next instanceof PhotoDto) {
                PhotoDto photoDto = (PhotoDto) next;
                Attachment attachment = photoDto.c;
                if (attachment instanceof LocalPhotoAttachment) {
                    Parcelable parcelable = photoDto.f.h;
                    PhotoAttachment photoAttachment = parcelable instanceof PhotoAttachment ? (PhotoAttachment) parcelable : null;
                    if (photoAttachment != null && photoAttachment.f == photoTag.g) {
                        tag = g(photoAttachment, photoTag);
                        if (tag == null) {
                            break;
                        }
                    }
                    tag = null;
                    if (tag == null) {
                    }
                } else {
                    if (attachment instanceof PhotoAttachment) {
                        tag = g((PhotoAttachment) attachment, photoTag);
                        if (tag == null) {
                        }
                    }
                    tag = null;
                    if (tag == null) {
                    }
                }
            }
        }
        Iterator it2 = n2c0.a(editing.i).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((Photo) next2).c == photoTag.g) {
                obj = next2;
                break;
            }
        }
        Photo photo = (Photo) obj;
        if (photo == null) {
            return;
        }
        qic0 qic0Var = new qic0(photoTag);
        efc0.a aVar = this.a;
        aVar.a(qic0Var);
        io.reactivex.rxjava3.internal.operators.completable.y q = rsg0.Z(yfb.x(((xba0) this.g.b).a.a(photoTag.g, photoTag.b, photo.e, Tag.ContentType.PHOTO.h(), photo.v))).q(asu0.a.c());
        int i = kwg0.a;
        aVar.a.e.b(q.subscribe(io.reactivex.rxjava3.internal.functions.a.c, new n3t(new jsg(this, editing, photoTag, tag, 3), 16)));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(PostingState postingState, ActionButton actionButton) {
        PostingUserMessageButton postingUserMessageButton;
        PostEditableData postEditableData;
        PostEditableData postEditableData2;
        PostingAttachmentInfo g = kbc0.g(actionButton, postingState.getContext().b.b.b);
        ibc0 ibc0Var = this.i;
        ActionButton actionButton2 = null;
        if (actionButton == null) {
            PostingState.Editing editing = postingState instanceof PostingState.Editing ? (PostingState.Editing) postingState : null;
            ibc0Var.u().z(kbc0.g((editing == null || (postEditableData2 = editing.i) == null) ? null : postEditableData2.t, postingState.getContext().b.b.b));
        } else {
            ibc0Var.u().G(g);
        }
        sic0 sic0Var = new sic0(actionButton);
        efc0.a aVar = this.a;
        aVar.a(sic0Var);
        boolean z = postingState instanceof PostingState.Editing;
        if (z) {
            PostingState.Editing editing2 = (PostingState.Editing) postingState;
            if (epx.f(editing2.i.t, actionButton)) {
                return;
            }
            boolean z2 = editing2.c.m != null;
            if (postingState.x().h == null) {
                return;
            }
            if (!z2) {
                if ((actionButton != null ? actionButton.f : null) != ActionButton.Type.VkTicket) {
                    postingUserMessageButton = new PostingUserMessageButton(new PostingUserMessageText.ResText(R.string.posting_step2_remember_action_button), PostingAction.Editing.RememberActionButton.b, null, false, 12, null);
                    if (!z) {
                        editing2 = null;
                    }
                    if (editing2 != null && (postEditableData = editing2.i) != null) {
                        actionButton2 = postEditableData.t;
                    }
                    aVar.e(new fmc0.p(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_check_circle_outline_28, R.attr.vk_ui_icon_positive), new PostingUserMessageText.ResText(actionButton2 != null ? R.string.posting_step2_action_button_added : actionButton == null ? R.string.posting_step2_action_button_removed : R.string.posting_step2_action_button_changed), postingUserMessageButton)));
                }
            }
            postingUserMessageButton = null;
            if (!z) {
            }
            if (editing2 != null) {
                actionButton2 = postEditableData.t;
            }
            aVar.e(new fmc0.p(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_check_circle_outline_28, R.attr.vk_ui_icon_positive), new PostingUserMessageText.ResText(actionButton2 != null ? R.string.posting_step2_action_button_added : actionButton == null ? R.string.posting_step2_action_button_removed : R.string.posting_step2_action_button_changed), postingUserMessageButton)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (((r7 == null || (r7 = r7.b) == null) ? null : r7.f()) != r5) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(PostingState postingState, boolean z) {
        HintId hintId;
        Hint p;
        if ((postingState instanceof PostingState.Editing) && z) {
            PostingState.Editing editing = (PostingState.Editing) postingState;
            PostingSettings x = editing.x();
            PostingHints postingHints = editing.o;
            if (x.g == null || (hintId = HintId.FEED_POSTING_ACTIONS_PROFILE) == null) {
                hintId = HintId.FEED_POSTING_ACTIONS_COMMUNITY;
            }
            h7v h7vVar = this.d;
            if (h7vVar.m(hintId) && postingHints.c == null && postingHints.d == null) {
                List<ActionButton> list = editing.d.i;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        WallActionButtonTypeDto f = ((ActionButton) it.next()).b.f();
                        WallActionButtonTypeDto wallActionButtonTypeDto = WallActionButtonTypeDto.OPEN_MARKET;
                        if (f == wallActionButtonTypeDto) {
                            ActionButton actionButton = editing.i.t;
                        }
                    }
                }
            }
            hintId = null;
            this.a.a(new e.a.k(PostingHints.a(postingHints, (hintId == null || (p = h7vVar.p(hintId.getId())) == null) ? null : p.d, null, false, 1015)));
        }
    }

    public final void i(PostingState postingState, List<PhotoTag> list) {
        if (postingState instanceof PostingState.Editing) {
            boolean isEmpty = list.isEmpty();
            if (((PostingState.Editing) postingState).i.k != PhotoVideoDisplayMode.Grid || isEmpty) {
                return;
            }
            this.a.e(fmc0.t.a);
        }
    }
}
