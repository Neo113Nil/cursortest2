package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import java.util.List;

/* compiled from: HolderUpdatePayload.kt */
/* loaded from: classes16.dex */
public interface jav {

    /* compiled from: HolderUpdatePayload.kt */
    public static final class a implements jav {
        public static final a a = new a();
    }

    /* compiled from: HolderUpdatePayload.kt */
    public static final class b implements jav {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public b() {
            this(7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActionInProgress(positiveRequestLoading=");
            sb.append(this.a);
            sb.append(", cancelPositiveRequestLoading=");
            sb.append(this.b);
            sb.append(", negativeRequestLoading=");
            return defpackage.q0.a(sb, this.c, ')');
        }

        public b(int i) {
            boolean z = (i & 1) == 0;
            boolean z2 = (i & 2) == 0;
            boolean z3 = (i & 4) == 0;
            this.a = z;
            this.b = z2;
            this.c = z3;
        }
    }

    /* compiled from: HolderUpdatePayload.kt */
    public static final class c implements jav {
        public static final c a = new c();
    }

    /* compiled from: HolderUpdatePayload.kt */
    public static final class d implements jav {
        public static final d a = new d();
    }

    /* compiled from: HolderUpdatePayload.kt */
    public static final class e implements jav {
        public final String a;
        public final List<StoriesContainer> b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(String str, List<? extends StoriesContainer> list) {
            this.a = str;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowStories(referrer=");
            sb.append(this.a);
            sb.append(", stories=");
            return ms9.a(')', sb, this.b);
        }
    }
}
