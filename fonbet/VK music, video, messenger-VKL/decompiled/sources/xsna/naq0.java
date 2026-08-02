package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;

/* compiled from: UploadContentSuccessData.kt */
/* loaded from: classes4.dex */
public abstract class naq0 {

    /* compiled from: UploadContentSuccessData.kt */
    public static final class a extends naq0 {
        public final int a;
        public final int b = R.string.feed_content_uploaded_snackbar_action;
        public final UserId c;

        public a(int i, UserId userId) {
            this.a = i;
            this.c = userId;
        }

        @Override // xsna.naq0
        public final int a() {
            return this.b;
        }

        @Override // xsna.naq0
        public final int b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return Long.hashCode(this.c.b) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Clip(messageResId=");
            sb.append(this.a);
            sb.append(", buttonTextResId=");
            sb.append(this.b);
            sb.append(", ownerId=");
            return gp.b(sb, this.c, ')');
        }
    }

    /* compiled from: UploadContentSuccessData.kt */
    public static final class b extends naq0 {
        public final int a;
        public final int b = R.string.feed_content_uploaded_snackbar_action;
        public final UserId c;
        public final VideoFile d;

        public b(VideoFile videoFile, int i, UserId userId) {
            this.a = i;
            this.c = userId;
            this.d = videoFile;
        }

        @Override // xsna.naq0
        public final int a() {
            return this.b;
        }

        @Override // xsna.naq0
        public final int b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + bh10.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Video(messageResId=");
            sb.append(this.a);
            sb.append(", buttonTextResId=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", video=");
            return lq.a(sb, this.d, ')');
        }
    }

    public abstract int a();

    public abstract int b();
}
