package yads;

import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes10.dex */
public final class j20 implements cl3 {
    public final b20 a;
    public final al3 b;
    public final qi3 c;
    public final gb1 d = new gb1(new c20());
    public boolean e;

    public j20(b20 b20Var, al3 al3Var, qi3 qi3Var) {
        this.a = b20Var;
        this.b = al3Var;
        this.c = qi3Var;
    }

    @Override // yads.cl3
    public final void a(float f) {
    }

    @Override // yads.cl3
    public final void b() {
        this.b.a(this.a, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
    }

    @Override // yads.cl3
    public final void c() {
        this.b.a(this.a, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    @Override // yads.cl3
    public final void d() {
        this.b.a(this.a, "pause");
    }

    @Override // yads.cl3
    public final void h() {
        this.b.a(this.a, "creativeView");
    }

    @Override // yads.cl3
    public final void i() {
        this.b.a(new g20(this.a), "creativeRenderingStart");
    }

    @Override // yads.cl3
    public final void k() {
        this.e = false;
    }

    @Override // yads.cl3
    public final void l() {
        this.b.a(this.a, "mute");
    }

    @Override // yads.cl3
    public final void m() {
        if (!this.e) {
            this.e = true;
            this.b.a(this.a, "start");
        }
        this.b.a(this.a, "clickTracking");
    }

    @Override // yads.cl3
    public final void a(View view, List list) {
    }

    @Override // yads.cl3
    public final void a(ng3 ng3Var) {
    }

    @Override // yads.cl3
    public final void a(bl3 bl3Var) {
        String str;
        int ordinal = bl3Var.ordinal();
        if (ordinal == 0) {
            str = "firstQuartile";
        } else if (ordinal == 1) {
            str = CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT;
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "thirdQuartile";
        }
        this.b.a(this.a, str);
    }

    @Override // yads.cl3
    public final void a(float f, long j) {
        if (this.e) {
            return;
        }
        this.e = true;
        this.b.a(this.a, "start");
    }

    @Override // yads.cl3
    public final void a() {
        this.b.a(this.a, "unmute");
    }

    @Override // yads.cl3
    public final void f() {
    }

    @Override // yads.cl3
    public final void g() {
    }

    @Override // yads.cl3
    public final void j() {
    }

    @Override // yads.cl3
    public final void n() {
    }
}
