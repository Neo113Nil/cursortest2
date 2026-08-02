package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.c;

/* compiled from: BroadcastSettingsStreamCover.kt */
/* loaded from: classes16.dex */
public final class hj8 implements VkCell.e {

    /* compiled from: BroadcastSettingsStreamCover.kt */
    public final class a implements VkCell.d {
        public final gj8 a;

        public a(Context context) {
            this.a = new gj8(context);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            if (fVar instanceof rom0) {
                rom0 rom0Var = (rom0) fVar;
                String str = rom0Var.b;
                baf0 baf0Var = rom0Var.a;
                gj8 gj8Var = this.a;
                gj8Var.getClass();
                gj8Var.t.setContent((str == null || str.length() == 0) ? new c.a(new eko(baf0Var), (cut0) null) : new c.d(str, new eko(baf0Var)));
                gj8Var.setIsBadgeVisible(rom0Var.c);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        return new a(context);
    }
}
