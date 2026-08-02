package xsna;

import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.PickerItem;
import xsna.hja0;

/* compiled from: PickingViewState.kt */
/* loaded from: classes17.dex */
public final class ija0 implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: PickingViewState.kt */
    public interface a<S extends hja0> extends fm50<hja0> {

        /* compiled from: PickingViewState.kt */
        /* renamed from: xsna.ija0$a$a, reason: collision with other inner class name */
        public static final class C3056a implements a<hja0.a> {
            public static final C3056a a = new C3056a();
        }

        /* compiled from: PickingViewState.kt */
        public static final class b implements a<hja0.b> {
            public final yzt0<xow<PickerItem>> a;

            public b(h0u0 h0u0Var) {
                this.a = h0u0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tr.c(new StringBuilder("Loaded(items="), this.a, ')');
            }
        }
    }

    public ija0(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
