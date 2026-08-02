package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import com.vk.core.view.components.context.menu.VkContextMenu;

/* compiled from: PreviewMenuDialogStackHelper.kt */
/* loaded from: classes4.dex */
public final class v4d0 {
    public VkContextMenu a;
    public ww50<?> b;
    public final a c;

    /* compiled from: PreviewMenuDialogStackHelper.kt */
    public static final class a implements fcn {
        public a() {
        }

        @Override // xsna.fcn
        public final boolean M4() {
            return false;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return false;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            VkContextMenu vkContextMenu = v4d0.this.a;
            if (vkContextMenu != null) {
                vkContextMenu.b();
            }
        }

        @Override // xsna.fcn
        public final void dismiss() {
            b(false);
        }

        @Override // xsna.fcn
        public final boolean v6() {
            return true;
        }
    }

    public v4d0(Context context) {
        ComponentCallbacks2 h = e3m.h(context);
        ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
        this.b = ey50Var != null ? ey50Var.Y() : null;
        this.c = new a();
    }
}
