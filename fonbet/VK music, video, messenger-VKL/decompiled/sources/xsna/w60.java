package xsna;

import android.view.View;
import android.widget.ImageView;
import com.vkontakte.android.R;
import xsna.k9d0;

/* compiled from: ActionWhiteboard.kt */
/* loaded from: classes7.dex */
public final class w60 extends vu<k9d0.h> {
    public final q290 e;
    public q2x0 f;
    public final boolean g;

    public w60(ld ldVar) {
        super(null, ldVar);
        this.e = new q290();
        this.g = true;
    }

    @Override // xsna.ku
    public final boolean c() {
        return this.g;
    }

    @Override // xsna.ku
    public final void f() {
        q2x0 q2x0Var = this.f;
        if (q2x0Var != null) {
            s2x0 s2x0Var = q2x0Var.e;
            com.vk.core.tips.b bVar = s2x0Var.g;
            if (bVar != null) {
                bVar.b(false);
            }
            s2x0Var.g = null;
            q2x0Var.d.d.dispose();
        }
        this.f = null;
        this.e.a.removeCallbacksAndMessages(null);
    }

    @Override // xsna.ku
    public final void g(View view, Object obj) {
        ImageView imageView = (ImageView) view;
        boolean z = ((k9d0.h) obj).a;
        if (this.f == null) {
            this.f = new q2x0(imageView.getContext(), "whiteboard-opened", R.string.voip_whiteboard_opened_tip, new sua(), R.color.vk_black, R.color.vk_white, 3000L, imageView);
        }
        boolean z2 = !bwt0.K(imageView) && z;
        bwt0.p0(imageView, z);
        q290 q290Var = this.e;
        if (z2) {
            q290Var.a(imageView.getContext(), new n0(2, imageView, this));
        }
        if (bwt0.K(imageView)) {
            return;
        }
        q2x0 q2x0Var = this.f;
        if (q2x0Var != null) {
            s2x0 s2x0Var = q2x0Var.e;
            com.vk.core.tips.b bVar = s2x0Var.g;
            if (bVar != null) {
                bVar.b(false);
            }
            s2x0Var.g = null;
            q2x0Var.d.d.dispose();
        }
        this.f = null;
        q290Var.a.removeCallbacksAndMessages(null);
    }

    @Override // xsna.wu
    public final int k() {
        return R.drawable.vk_icon_write_28;
    }

    @Override // xsna.wu, xsna.ku
    /* renamed from: p */
    public final void h(ImageView imageView) {
        super.h(imageView);
        imageView.setId(R.id.btn_primary_whiteboard);
    }
}
