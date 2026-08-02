package xsna;

import android.view.View;
import android.widget.ImageButton;
import com.vk.music.player.PlayerMode;
import com.vk.toggle.Features;
import com.vk.toggle.b;

/* compiled from: MusicLongTapSeeker.kt */
/* loaded from: classes3.dex */
public final class dn40 {
    public final View a;
    public final u2b0 b;
    public final int c;
    public final gk40 d;
    public io.reactivex.rxjava3.disposables.c e;
    public final b.d f = com.vk.toggle.b.A.i(Features.Type.FEATURE_LONG_TAP_REWIND);
    public boolean g = true;
    public final cn40 h = new cn40(this);

    public dn40(ImageButton imageButton, u2b0 u2b0Var, int i) {
        this.a = imageButton;
        this.b = u2b0Var;
        this.c = i;
        this.d = new gk40(imageButton.getContext());
    }

    public final void a() {
        if (p1p0.a(this.f)) {
            bn40.f("ltseek: attach");
            this.a.setOnTouchListener(this.d);
            c(true);
            this.b.P0(this.h, false);
        }
    }

    public final float b() {
        u2b0 u2b0Var = this.b;
        if (u2b0Var.T0() || u2b0Var.E0() || u2b0Var.c1() || (u2b0Var.z1() && u2b0Var.x1() != PlayerMode.RADIO)) {
            return u2b0Var.l();
        }
        return 1.0f;
    }

    public final void c(boolean z) {
        this.g = z;
        gk40 gk40Var = this.d;
        if (z && this.e == null) {
            this.e = gk40Var.b.subscribe(new ff3(new hs00(this, 10), 22));
            return;
        }
        if (z || this.e == null) {
            return;
        }
        gk40Var.a();
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
        this.e = null;
        this.b.s(b(), false);
    }
}
