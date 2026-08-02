package xsna;

import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.clips.uploader.api.model.ClipUploaderParams;

/* compiled from: ClipsUploaderStatusListener.kt */
/* loaded from: classes17.dex */
public interface rlf {

    /* compiled from: ClipsUploaderStatusListener.kt */
    public static final class a {
        public final ClipUploaderParams a;
        public final ClipUploaderData.Author b;
        public final ClipUploadJob c;
        public final ded d;

        public a(ClipUploaderParams clipUploaderParams, ClipUploaderData.Author author, ClipUploadJob clipUploadJob, ded dedVar) {
            this.a = clipUploaderParams;
            this.b = author;
            this.c = clipUploadJob;
            this.d = dedVar;
        }
    }

    void a(a aVar);

    void b(led ledVar);
}
