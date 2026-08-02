package xsna;

import androidx.recyclerview.widget.t0;
import com.vk.core.ui.themes.VKTheme;
import java.util.concurrent.ConcurrentHashMap;
import xsna.dhr0;

/* compiled from: RecyclerViewPoolThemeHelper.kt */
/* loaded from: classes17.dex */
public final class ckf0 implements t0.a {
    public static final ckf0 a = new ckf0();
    public static final ConcurrentHashMap<Object, a> b = new ConcurrentHashMap<>();

    /* compiled from: RecyclerViewPoolThemeHelper.kt */
    public static final class a implements dhr0.e {
        public final t0.d b;

        public a(t0.d dVar) {
            this.b = dVar;
        }

        public final boolean equals(Object obj) {
            a aVar = obj instanceof a ? (a) obj : null;
            return this.b == (aVar != null ? aVar.b : null);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        @Override // xsna.dhr0.e
        public final void sb(VKTheme vKTheme) {
            this.b.a(vKTheme.c);
        }
    }

    @Override // androidx.recyclerview.widget.t0.a
    public final void a(t0.d dVar) {
        a aVar = new a(dVar);
        b.put(dVar, aVar);
        dhr0.f(aVar);
    }

    @Override // androidx.recyclerview.widget.t0.a
    public final void b(t0.d dVar) {
        a remove = b.remove(dVar);
        if (remove != null) {
            dhr0.a.getClass();
            dhr0.X(remove);
        }
    }
}
