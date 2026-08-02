package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkImage;

/* compiled from: MiniAppCatalogViewControllerFactory.kt */
/* loaded from: classes6.dex */
public final class jp20 implements VkCell.d {
    public static final float c = iah0.b(0.5f);
    public final Context a;
    public final bpn0 b = new bpn0(new u110(this, 2));

    /* compiled from: MiniAppCatalogViewControllerFactory.kt */
    public static final class a implements VkCell.f {
        public final String a;

        public a(String str) {
            this.a = str;
        }
    }

    public jp20(Context context) {
        this.a = context;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        a aVar = fVar instanceof a ? (a) fVar : null;
        if (aVar == null) {
            return;
        }
        ((VkImage) this.b.getValue()).o0(aVar.a, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jp20) && epx.f(this.a, ((jp20) obj).a);
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return (VkImage) this.b.getValue();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MiniAppIconViewController(context=" + this.a + ')';
    }
}
