package xsna;

import android.graphics.Bitmap;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StoriesEvent.kt */
/* loaded from: classes6.dex */
public interface asl0 {

    /* compiled from: StoriesEvent.kt */
    public static final class a implements asl0 {
        public final Bitmap a;
        public final UserId b;

        public a(Bitmap bitmap, UserId userId) {
            this.a = bitmap;
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
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnimationBitmap(bitmap=");
            sb.append(this.a);
            sb.append(", author=");
            return gp.b(sb, this.b, ')');
        }
    }

    /* compiled from: StoriesEvent.kt */
    public static final class b implements asl0 {
        public static final b a = new b();
    }

    /* compiled from: StoriesEvent.kt */
    public static final class c implements asl0 {
        public final List<StoriesContainer> a;

        public c(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Invalidate(containers="), this.a);
        }
    }
}
