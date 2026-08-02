package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkImage;

/* compiled from: SecondaryHolder.kt */
/* loaded from: classes5.dex */
public final class t0i0 implements VkCell.e {
    public final /* synthetic */ v0i0 a;

    public t0i0(v0i0 v0i0Var) {
        this.a = v0i0Var;
    }

    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        return new a(this.a);
    }

    /* compiled from: SecondaryHolder.kt */
    public static final class a implements VkCell.d {
        public final VkImage a;

        public a(v0i0 v0i0Var) {
            this.a = v0i0Var.q;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
        }
    }
}
