package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkImage;

/* compiled from: ThirdPartyHolder.kt */
/* loaded from: classes5.dex */
public final class gqo0 implements VkCell.e {
    public final /* synthetic */ iqo0 a;

    public gqo0(iqo0 iqo0Var) {
        this.a = iqo0Var;
    }

    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        return new a(this.a);
    }

    /* compiled from: ThirdPartyHolder.kt */
    public static final class a implements VkCell.d {
        public final VkImage a;

        public a(iqo0 iqo0Var) {
            this.a = iqo0Var.q;
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
