package xsna;

import com.vk.tabbar.settings.impl.mvi.InteractSource;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TabbarSettingsMvi.kt */
/* loaded from: classes6.dex */
public interface t0j0 {

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class b implements t0j0 {
        public static final b a = new b();
    }

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class a implements t0j0 {
        public final boolean a;
        public final List<uun0> b;
        public final InteractSource c;

        public a(boolean z, List<uun0> list, InteractSource interactSource) {
            this.a = z;
            this.b = list;
            this.c = interactSource;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(a aVar, boolean z, ArrayList arrayList, InteractSource interactSource, int i) {
            if ((i & 1) != 0) {
                z = aVar.a;
            }
            List list = arrayList;
            if ((i & 2) != 0) {
                list = aVar.b;
            }
            aVar.getClass();
            return new a(z, list, interactSource);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + fw3.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return "Content(isEnabled=" + this.a + ", items=" + this.b + ", interactSource=" + this.c + ')';
        }

        public /* synthetic */ a(ArrayList arrayList, boolean z) {
            this(z, arrayList, InteractSource.NOT_USER_INTERACT);
        }
    }
}
