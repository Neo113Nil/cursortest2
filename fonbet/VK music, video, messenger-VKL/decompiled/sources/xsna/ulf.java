package xsna;

import com.vk.clips.upload.model.ClipUploadData;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipsUploadingInteractor.kt */
/* loaded from: classes17.dex */
public interface ulf {

    /* compiled from: ClipsUploadingInteractor.kt */
    public static final class a {
        public final int a;
        public final UserId b;

        public a(int i, UserId userId) {
            this.a = i;
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoData(videoId=");
            sb.append(this.a);
            sb.append(", authorId=");
            return gp.b(sb, this.b, ')');
        }
    }

    void a(ClipUploadData clipUploadData);

    void c(ClipUploadData clipUploadData);

    void d(int i, String str);

    izg0 e(int i);
}
