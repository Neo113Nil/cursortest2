package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: PathParser.kt */
/* loaded from: classes11.dex */
public final class sq90 {
    public Object a;
    public Object b;

    public sq90(int i) {
        switch (i) {
            case 1:
                this.a = new PostingPreviewRatio(2, 3, false, false, 12, null);
                this.b = new PostingPreviewRatio(16, 9, false, false, 12, null);
                break;
            case 2:
                this.a = new LinkedHashMap();
                this.b = new LinkedHashMap();
                break;
            default:
                this.b = new float[64];
                break;
        }
    }

    public static String c(PostingPreviewRatio postingPreviewRatio) {
        if (postingPreviewRatio.d) {
            return "original";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(postingPreviewRatio.b);
        sb.append('_');
        return h5s.c(postingPreviewRatio.c, "_auto", sb);
    }

    public PostingPreviewRatio a(float f) {
        PostingPreviewRatio postingPreviewRatio = (PostingPreviewRatio) this.b;
        PostingPreviewRatio postingPreviewRatio2 = (PostingPreviewRatio) this.a;
        if (f < w65.d(postingPreviewRatio2)) {
            return postingPreviewRatio2;
        }
        if (f > w65.d(postingPreviewRatio)) {
            return postingPreviewRatio;
        }
        Pair pair = new Pair(Integer.valueOf((int) 10000.0f), Integer.valueOf((int) ((100.0f / f) * 100.0f)));
        return new PostingPreviewRatio(((Number) pair.i()).intValue(), ((Number) pair.j()).intValue(), true, false, 8, null);
    }

    public Pair b(PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData, List list) {
        String str = photoVideoAttachmentsCropData.d;
        PostingPreviewRatio postingPreviewRatio = photoVideoAttachmentsCropData.e;
        PostingAttachment postingAttachment = (PostingAttachment) j5g.a0(list);
        Attachment nb = postingAttachment != null ? postingAttachment.nb() : null;
        if (nb instanceof PhotoAttachment) {
            PhotoAttachment photoAttachment = (PhotoAttachment) nb;
            ImageSize imageSize = photoAttachment.l.K;
            r1 = imageSize != null ? Float.valueOf(imageSize.E0()) : null;
            PostingPreviewRatio a = a(r1 != null ? r1.floatValue() : photoAttachment.E0());
            return new Pair(a, c(a));
        }
        if (!(nb instanceof VideoAttachment)) {
            return new Pair(postingPreviewRatio, str);
        }
        VideoAttachment videoAttachment = (VideoAttachment) nb;
        VideoFile videoFile = videoAttachment.k;
        if (videoFile.getWidth() > 0 && videoFile.getHeight() > 0) {
            r1 = Float.valueOf(videoFile.getWidth() / videoFile.getHeight());
        } else if (videoAttachment.getHeight() > 0) {
            r1 = Float.valueOf(videoAttachment.getWidth() / videoAttachment.getHeight());
        }
        if (r1 == null) {
            return new Pair(postingPreviewRatio, str);
        }
        PostingPreviewRatio a2 = a(r1.floatValue());
        return new Pair(a2, c(a2));
    }

    public void d(String str) {
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.a = arrayList;
        } else {
            arrayList.clear();
        }
        e(str, arrayList);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public void e(java.lang.String r23, java.util.ArrayList r24) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.sq90.e(java.lang.String, java.util.ArrayList):void");
    }

    public List f() {
        ArrayList arrayList = (ArrayList) this.a;
        return arrayList != null ? arrayList : EmptyList.b;
    }
}
