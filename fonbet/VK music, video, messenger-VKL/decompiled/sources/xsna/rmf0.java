package xsna;

import android.os.Parcelable;
import com.vk.dto.common.Attachment;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.PostingTechMetrics;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingFileType;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: ReducerUploadDelegate.kt */
/* loaded from: classes4.dex */
public final class rmf0 {
    public final wj50<fmc0> a;
    public final gql b = new gql();

    public rmf0(vpc0 vpc0Var, wj50<fmc0> wj50Var) {
        this.a = wj50Var;
    }

    public static UploadDto a(PostingState.Editing editing, int i) {
        Object obj;
        UploadDto.UploadState I4;
        UploadDto.UploadState I42;
        PostEditableData postEditableData = editing.i;
        FileDto fileDto = postEditableData.m;
        if (fileDto != null && (I42 = fileDto.I4()) != null && I42.d == i) {
            return postEditableData.m;
        }
        Iterator<T> it = postEditableData.p.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            PostingAttachment postingAttachment = (PostingAttachment) obj;
            UploadDto uploadDto = postingAttachment instanceof UploadDto ? (UploadDto) postingAttachment : null;
            if (uploadDto != null && (I4 = uploadDto.I4()) != null && I4.d == i) {
                break;
            }
        }
        if (obj instanceof UploadDto) {
            return (UploadDto) obj;
        }
        return null;
    }

    public static UploadDto.UploadState c(UploadDto.UploadState uploadState, e.h hVar) {
        if (hVar instanceof e.h.C1430e) {
            return UploadDto.UploadState.a(uploadState, UploadDto.UploadStep.Uploading.b, ((e.h.C1430e) hVar).c, 0, 0, null, false, 250);
        }
        if (hVar instanceof e.h.d) {
            e.h.d dVar = (e.h.d) hVar;
            return UploadDto.UploadState.a(uploadState, UploadDto.UploadStep.Uploading.b, 0, dVar.c, dVar.d, null, false, 230);
        }
        if (hVar instanceof e.h.b) {
            return UploadDto.UploadState.a(uploadState, UploadDto.UploadStep.Uploaded.b, 0, 0, 0, ((e.h.b) hVar).c, false, 166);
        }
        if (hVar instanceof e.h.c) {
            return UploadDto.UploadState.a(uploadState, new UploadDto.UploadStep.Failed(((e.h.c) hVar).c), 0, 0, 0, null, false, 230);
        }
        if (hVar instanceof e.h.a) {
            return uploadState.d() ? UploadDto.UploadState.a(uploadState, UploadDto.UploadStep.Idle.b, 0, 0, 0, null, false, 230) : uploadState;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final PostingState.Editing b(PostingState.Editing editing, UploadDto uploadDto, e.h hVar) {
        boolean z = uploadDto instanceof FileDto;
        Throwable th = null;
        gql gqlVar = this.b;
        if (z) {
            FileDto fileDto = (FileDto) uploadDto;
            boolean f = epx.f(fileDto.I4().b, UploadDto.UploadStep.Uploading.b);
            if (((hVar instanceof e.h.C1430e) || (hVar instanceof e.h.d)) && !f) {
                fileDto = FileDto.a(fileDto, Integer.valueOf(R.string.picker_loading), null, 123);
            } else if (hVar instanceof e.h.b) {
                fileDto = FileDto.a(fileDto, null, null, 123);
            } else if (hVar instanceof e.h.c) {
                fileDto = FileDto.a(fileDto, Integer.valueOf(R.string.file_download_error), null, 123);
            }
            UploadDto.UploadState c = c(fileDto.I4(), hVar);
            Pair a = gqlVar.a(editing, c, hVar, MobileOfficialAppsFeedStat$PostingFileType.DOCUMENT);
            return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, null, null, FileDto.a(fileDto, null, c, 63), null, null, null, null, null, null, null, null, null, null, false, null, 268433407), null, null, null, null, false, null, false, null, null, null, PostingTechMetrics.a(editing.t, null, null, null, null, null, null, (Map) a.d(), (List) a.g(), 127), null, 786303);
        }
        if (!(uploadDto instanceof PhotoDto)) {
            if (!(uploadDto instanceof VideoDto)) {
                return editing;
            }
            VideoDto videoDto = (VideoDto) uploadDto;
            UploadDto.UploadState uploadState = videoDto.f;
            VideoDto a2 = VideoDto.a(videoDto, c(uploadState, hVar));
            Pair a3 = gqlVar.a(editing, uploadState, hVar, MobileOfficialAppsFeedStat$PostingFileType.VIDEO);
            Map map = (Map) a3.d();
            List list = (List) a3.g();
            PostEditableData postEditableData = editing.i;
            List<PostingAttachment> list2 = postEditableData.p;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (PostingAttachment postingAttachment : list2) {
                if (epx.f(postingAttachment, uploadDto)) {
                    postingAttachment = a2;
                }
                arrayList.add(postingAttachment);
            }
            return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(postEditableData, null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, false, null, 268419071), null, null, null, null, false, null, false, null, null, null, PostingTechMetrics.a(editing.t, null, null, null, null, null, null, map, list, 127), null, 786303);
        }
        PhotoDto photoDto = (PhotoDto) uploadDto;
        UploadDto.UploadState uploadState2 = photoDto.f;
        Attachment attachment = photoDto.c;
        UploadDto.UploadState c2 = c(uploadState2, hVar);
        Parcelable parcelable = c2.h;
        PhotoDto a4 = PhotoDto.a(photoDto, null, c2, 47);
        PostEditableData postEditableData2 = editing.i;
        List<ImageCropArea> list3 = postEditableData2.j.b;
        ArrayList arrayList2 = list3 != null ? new ArrayList(list3) : null;
        if (arrayList2 != null && epx.f(c2.b, UploadDto.UploadStep.Uploaded.b) && (parcelable instanceof PhotoAttachment) && (attachment instanceof PhotoAttachment)) {
            int i = 0;
            for (Object obj : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    Throwable th2 = th;
                    e43.t();
                    throw th2;
                }
                ImageCropArea imageCropArea = (ImageCropArea) obj;
                Throwable th3 = th;
                if (agc0.d(imageCropArea, (PhotoAttachment) attachment)) {
                    arrayList2.set(i, ImageCropArea.a(imageCropArea, ((PhotoAttachment) parcelable).Hb(), 0, 0, 0, 0, null, 254));
                }
                i = i2;
                th = th3;
            }
        }
        Pair a5 = gqlVar.a(editing, c2, hVar, MobileOfficialAppsFeedStat$PostingFileType.PHOTO);
        Map map2 = (Map) a5.d();
        List list4 = (List) a5.g();
        List<PostingAttachment> list5 = postEditableData2.p;
        ArrayList arrayList3 = new ArrayList(c5g.u(list5, 10));
        for (PostingAttachment postingAttachment2 : list5) {
            if (epx.f(postingAttachment2, photoDto)) {
                postingAttachment2 = a4;
            }
            arrayList3.add(postingAttachment2);
        }
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(postEditableData2, null, null, null, null, null, null, null, PhotoVideoAttachmentsCropData.a(postEditableData2.j, arrayList2, null, null, null, 14), null, null, null, null, null, arrayList3, null, null, null, null, null, null, null, false, null, 268418815), null, null, null, null, false, null, false, null, null, null, PostingTechMetrics.a(editing.t, null, null, null, null, null, null, map2, list4, 127), null, 786303);
    }
}
