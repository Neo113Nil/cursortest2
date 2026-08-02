package xsna;

import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.PickerItem;

/* compiled from: PickingState.kt */
/* loaded from: classes17.dex */
public interface hja0 extends km50 {

    /* compiled from: PickingState.kt */
    public static final class a implements hja0 {
        public static final a b = new a();
    }

    /* compiled from: PickingState.kt */
    public static final class b implements hja0 {
        public final xow<PickerItem> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(xow<? extends PickerItem> xowVar) {
            this.b = xowVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Loaded(items=" + this.b + ')';
        }
    }
}
