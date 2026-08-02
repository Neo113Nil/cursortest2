package xsna;

import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.util.Objects;
import xsna.baz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ycz0 extends n7z0 implements r3z0 {
    public cez0 p;
    public loy0 q;
    public dvy0 r;

    @Override // xsna.n7z0
    public final void e(m6z0 m6z0Var) {
        kiw kiwVar;
        baz0 baz0Var = this.o;
        baz0.a aVar = new baz0.a(baz0Var);
        cez0 cez0Var = this.p;
        FrameLayout frameLayout = this.h;
        if (cez0Var == null) {
            boolean z = m6z0Var.e;
            dvy0 dvy0Var = new dvy0(getContext());
            this.p = new cez0(kqz0.a(dvy0Var.getContext(), z), dvy0Var, getContext(), aVar);
            frameLayout.setBackground(b(new rvy0(getContext())));
            frameLayout.setClipToOutline(true);
            frameLayout.addView(this.p, 0);
            hdg0 hdg0Var = new hdg0(1, this, aVar);
            this.p.getVideoControlView().getVideoControlButton().setOnClickListener(hdg0Var);
            this.p.getVideoControlView().getSoundControlButton().setOnClickListener(hdg0Var);
        }
        if (this.q == null) {
            this.q = this.p.getVideoPlayer();
        }
        if (this.r == null) {
            this.r = this.p.getVideoView();
        }
        cez0 cez0Var2 = this.p;
        baz0Var.getClass();
        baz0Var.c = cez0Var2.getVideoPlayer();
        baz0Var.d = cez0Var2.getVideoView();
        baz0Var.b = cez0Var2;
        baz0Var.c.x(baz0Var);
        baz0Var.d.setAdVideoViewListener(baz0Var);
        baz0Var.c(m6z0Var, this);
        this.j.setOnClickListener(this);
        lgz0 lgz0Var = m6z0Var.a.c0;
        if (lgz0Var == null || (kiwVar = lgz0Var.Z) == null) {
            return;
        }
        this.p.getPreviewView().setImageBitmap(kiwVar.a());
        frameLayout.post(new ugr(10, this, kiwVar));
    }

    @Override // xsna.r3z0
    @NonNull
    public cez0 getVideoContent() {
        cez0 cez0Var = this.p;
        Objects.requireNonNull(cez0Var);
        return cez0Var;
    }

    @Override // xsna.r3z0
    @NonNull
    public loy0 getVideoPlayer() {
        loy0 loy0Var = this.q;
        Objects.requireNonNull(loy0Var);
        return loy0Var;
    }

    @Override // xsna.r3z0
    @NonNull
    public dvy0 getVideoView() {
        dvy0 dvy0Var = this.r;
        Objects.requireNonNull(dvy0Var);
        return dvy0Var;
    }
}
