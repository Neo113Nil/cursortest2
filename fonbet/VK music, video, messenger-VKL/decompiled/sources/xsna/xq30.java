package xsna;

import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.attaches.AttachGift;

/* compiled from: MsgPartGiftHolder.kt */
/* loaded from: classes2.dex */
public final class xq30 implements b780 {
    public final /* synthetic */ wq30 b;
    public final /* synthetic */ AttachGift c;

    public xq30(wq30 wq30Var, AttachGift attachGift) {
        this.b = wq30Var;
        this.c = attachGift;
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        AttachGift attachGift = this.c;
        wq30 wq30Var = this.b;
        wq30Var.x(attachGift);
        VKEnhancedImageView vKEnhancedImageView = wq30Var.f;
        if (vKEnhancedImageView == null) {
            vKEnhancedImageView = null;
        }
        vKEnhancedImageView.setOnLoadCallback(null);
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
    }
}
