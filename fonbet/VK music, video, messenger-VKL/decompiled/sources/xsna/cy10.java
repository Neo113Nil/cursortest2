package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.domain.model.LinksParsingMetaData;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalVideoAttachment;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingArticleDto;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingLinkDto;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.domain.request.ParsedAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.fmc0;

/* compiled from: MediaSelectionReducerDelegate.kt */
/* loaded from: classes4.dex */
public final class cy10 {
    public final wj50<fmc0> a;
    public final com.vk.newsfeed.posting.impl.domain.model.upload.a b;
    public final ibc0 c;

    public cy10(wj50<fmc0> wj50Var, com.vk.newsfeed.posting.impl.domain.model.upload.a aVar, ibc0 ibc0Var) {
        this.a = wj50Var;
        this.b = aVar;
        this.c = ibc0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0 A[LOOP:0: B:30:0x00ea->B:32:0x00f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PostingState a(cy10 cy10Var, PostingState postingState, MediaPickerSelectedItem mediaPickerSelectedItem, boolean z, ParsedAttachment parsedAttachment, Integer num, int i) {
        AttachmentWithMedia videoAttachment;
        Integer num2;
        Iterable iterable;
        boolean z2;
        PostingLinkDto postingLinkDto;
        PhotoVideoDisplayMode photoVideoDisplayMode;
        PhotoVideoDisplayMode photoVideoDisplayMode2;
        Iterator it;
        ParsedAttachment parsedAttachment2 = (i & 8) != 0 ? null : parsedAttachment;
        Integer num3 = (i & 16) != 0 ? null : num;
        com.vk.newsfeed.posting.impl.domain.model.upload.a aVar = cy10Var.b;
        wj50<fmc0> wj50Var = cy10Var.a;
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        MediaPickerState mediaPickerState = editing.f;
        PostEditableData postEditableData = editing.i;
        List<PostingAttachment> list = postEditableData.p;
        LinksParsingMetaData linksParsingMetaData = postEditableData.w;
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(linksParsingMetaData.c);
        if (mediaPickerSelectedItem instanceof MediaPickerSelectedItem.LocalMedia) {
            LocalMediaEntry localMediaEntry = ((MediaPickerSelectedItem.LocalMedia) mediaPickerSelectedItem).b;
            if (localMediaEntry instanceof LocalMediaEntry.Image) {
                videoAttachment = new LocalPhotoAttachment(localMediaEntry);
            } else {
                if (!(localMediaEntry instanceof LocalMediaEntry.Video)) {
                    throw new NoWhenBranchMatchedException();
                }
                Serializer.c<LocalVideoAttachment> cVar = LocalVideoAttachment.CREATOR;
                videoAttachment = LocalVideoAttachment.a.a((LocalMediaEntry.Video) localMediaEntry);
            }
        } else if (mediaPickerSelectedItem instanceof MediaPickerSelectedItem.VkPhoto) {
            videoAttachment = new PhotoAttachment(((MediaPickerSelectedItem.VkPhoto) mediaPickerSelectedItem).b.b);
        } else {
            if (!(mediaPickerSelectedItem instanceof MediaPickerSelectedItem.VkVideo)) {
                throw new NoWhenBranchMatchedException();
            }
            videoAttachment = new VideoAttachment(((MediaPickerSelectedItem.VkVideo) mediaPickerSelectedItem).b.b);
        }
        if (z) {
            PostingAttachment b = com.vk.newsfeed.posting.impl.presentation.model.a.b(videoAttachment);
            if (b != null) {
                boolean a = icc0.a(editing, videoAttachment);
                PostingContext postingContext = editing.c;
                if (a) {
                    UserId userId = fkq0.b(postingContext.b.b) ? postingContext.b.b : null;
                    boolean z3 = !(editing.h instanceof PostEditingReason.EditRemoteDraft);
                    if (b instanceof UploadDto) {
                        UploadDto uploadDto = (UploadDto) b;
                        if (aVar.b(uploadDto, editing)) {
                            num2 = num3;
                            wj50Var.b(new qmc0(uploadDto, userId, z3));
                            List<PostingAttachment> list2 = postEditableData.p;
                            aVar.getClass();
                            it = rli0.A(rli0.j(rli0.j(new i5g(list2), jbq0.c), new eni0(8))).iterator();
                            while (it.hasNext()) {
                                wj50Var.b(new qmc0((UploadDto) it.next(), userId, z3));
                            }
                            if (num2 != null || arrayList.isEmpty()) {
                                arrayList.add(b);
                            } else {
                                arrayList.add(swe0.g(num2.intValue(), 0, arrayList.size()), b);
                            }
                            if (parsedAttachment2 != null) {
                                Attachment attachment = parsedAttachment2.b;
                                arrayList2.add(parsedAttachment2);
                                boolean z4 = attachment instanceof VideoAttachment;
                                if (z4 || (attachment instanceof PhotoAttachment)) {
                                    wj50Var.b(new fmc0.w.b(parsedAttachment2.c));
                                }
                                if (z4) {
                                    wj50Var.b(new fmc0.h.f(((VideoAttachment) attachment).k, true));
                                } else if (attachment instanceof PhotoAttachment) {
                                    wj50Var.b(new fmc0.h.e(((PhotoAttachment) attachment).l, true));
                                }
                            }
                        }
                    }
                    num2 = num3;
                    List<PostingAttachment> list22 = postEditableData.p;
                    aVar.getClass();
                    it = rli0.A(rli0.j(rli0.j(new i5g(list22), jbq0.c), new eni0(8))).iterator();
                    while (it.hasNext()) {
                    }
                    if (num2 != null) {
                    }
                    arrayList.add(b);
                    if (parsedAttachment2 != null) {
                    }
                }
            }
            num2 = num3;
            z2 = false;
            ArrayList arrayList3 = new ArrayList(mediaPickerState.e);
            if (z || !z2 || arrayList3.contains(mediaPickerSelectedItem)) {
                if (!z) {
                    arrayList3.remove(mediaPickerSelectedItem);
                }
            } else if (num2 == null || arrayList3.isEmpty()) {
                arrayList3.add(mediaPickerSelectedItem);
            } else {
                arrayList3.add(swe0.g(num2.intValue(), 0, arrayList3.size()), mediaPickerSelectedItem);
            }
            PostingLinkDto postingLinkDto2 = postEditableData.h;
            PostingArticleDto postingArticleDto = postEditableData.g;
            PostingLinkDto postingLinkDto3 = linksParsingMetaData.d;
            List<String> list3 = linksParsingMetaData.b;
            PostingArticleDto postingArticleDto2 = linksParsingMetaData.e;
            if (arrayList.isEmpty()) {
                if (postingArticleDto != null) {
                    postingArticleDto2 = j5g.P(list3, postingArticleDto.c) ? postingArticleDto : null;
                    arrayList2.removeIf(new jdg(new frp(1, postingArticleDto.b), 1));
                }
                if (postingLinkDto2 != null) {
                    postingLinkDto3 = j5g.P(list3, postingLinkDto2.c) ? postingLinkDto2 : null;
                    arrayList2.removeIf(new jdg(new frp(1, postingLinkDto2.b), 1));
                }
                postingLinkDto = postingLinkDto3;
                postingArticleDto = null;
                postingLinkDto3 = null;
            } else {
                if (postingLinkDto2 == null && postingArticleDto == null && (postingArticleDto2 != null || postingLinkDto3 != null)) {
                    postingArticleDto = postingArticleDto2;
                } else {
                    postingLinkDto3 = postingLinkDto2;
                }
                postingLinkDto = null;
                postingArticleDto2 = null;
            }
            Pair b2 = new sq90(1).b(postEditableData.j, arrayList);
            PostingPreviewRatio postingPreviewRatio = (PostingPreviewRatio) b2.d();
            String str = (String) b2.g();
            int size = arrayList.size();
            photoVideoDisplayMode = postEditableData.k;
            photoVideoDisplayMode2 = size != 1 ? PhotoVideoDisplayMode.Carousel : photoVideoDisplayMode;
            if (photoVideoDisplayMode != photoVideoDisplayMode2) {
                cy10Var.c.x().a(photoVideoDisplayMode2 == PhotoVideoDisplayMode.Carousel, false);
            }
            return PostingState.Editing.a(editing, null, null, null, MediaPickerState.a(mediaPickerState, null, null, 0, arrayList3, null, null, null, null, null, 503), null, PostEditableData.a(postEditableData, null, null, null, null, postingArticleDto, postingLinkDto3, null, PhotoVideoAttachmentsCropData.a(postEditableData.j, null, null, str, postingPreviewRatio, 3), photoVideoDisplayMode2, null, null, null, null, arrayList, null, null, null, null, LinksParsingMetaData.a(postEditableData.w, null, arrayList2, postingLinkDto, postingArticleDto2, 1), null, null, false, null, 266321055), null, null, null, null, false, null, false, null, null, null, null, null, 1048431);
        }
        num2 = num3;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            PostingAttachment postingAttachment = (PostingAttachment) it2.next();
            if (epx.f(postingAttachment.nb(), videoAttachment) && (postingAttachment instanceof UploadDto)) {
                wj50Var.b(new rmc0((UploadDto) postingAttachment));
            }
        }
        arrayList.removeIf(new by10(new cww(videoAttachment, 7), 0));
        aVar.getClass();
        if (arrayList.size() == 1) {
            PostingAttachment postingAttachment2 = (PostingAttachment) j5g.Y(arrayList);
            iterable = (!(postingAttachment2 instanceof VideoDto) || aVar.a((VideoDto) postingAttachment2, editing)) ? EmptyList.b : Collections.singletonList(postingAttachment2);
        } else {
            iterable = EmptyList.b;
        }
        Iterator it3 = iterable.iterator();
        while (it3.hasNext()) {
            wj50Var.b(new rmc0((UploadDto) it3.next()));
        }
        arrayList2.removeIf(new jdg(new frp(1, videoAttachment), 1));
        z2 = true;
        ArrayList arrayList32 = new ArrayList(mediaPickerState.e);
        if (z) {
        }
        if (!z) {
        }
        PostingLinkDto postingLinkDto22 = postEditableData.h;
        PostingArticleDto postingArticleDto3 = postEditableData.g;
        PostingLinkDto postingLinkDto32 = linksParsingMetaData.d;
        List<String> list32 = linksParsingMetaData.b;
        PostingArticleDto postingArticleDto22 = linksParsingMetaData.e;
        if (arrayList.isEmpty()) {
        }
        Pair b22 = new sq90(1).b(postEditableData.j, arrayList);
        PostingPreviewRatio postingPreviewRatio2 = (PostingPreviewRatio) b22.d();
        String str2 = (String) b22.g();
        int size2 = arrayList.size();
        photoVideoDisplayMode = postEditableData.k;
        if (size2 != 1) {
        }
        if (photoVideoDisplayMode != photoVideoDisplayMode2) {
        }
        return PostingState.Editing.a(editing, null, null, null, MediaPickerState.a(mediaPickerState, null, null, 0, arrayList32, null, null, null, null, null, 503), null, PostEditableData.a(postEditableData, null, null, null, null, postingArticleDto3, postingLinkDto32, null, PhotoVideoAttachmentsCropData.a(postEditableData.j, null, null, str2, postingPreviewRatio2, 3), photoVideoDisplayMode2, null, null, null, null, arrayList, null, null, null, null, LinksParsingMetaData.a(postEditableData.w, null, arrayList2, postingLinkDto, postingArticleDto22, 1), null, null, false, null, 266321055), null, null, null, null, false, null, false, null, null, null, null, null, 1048431);
    }
}
