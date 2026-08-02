package com.vk.writebar;

import com.unity3d.services.UnityAdsConstants;
import com.vk.writebar.a;
import xsna.h1y0;
import xsna.iah0;

/* compiled from: WriteBarAudioHolder.kt */
/* loaded from: classes7.dex */
public final class e implements a.d {
    public final int a = iah0.a(70.0f);
    public int b = Integer.MIN_VALUE;
    public final /* synthetic */ g c;

    public e(g gVar) {
        this.c = gVar;
    }

    @Override // com.vk.writebar.a.d
    public final void a() {
        g gVar = this.c;
        gVar.g();
        gVar.c().setVisibility(0);
        gVar.e().setVisibility(4);
    }

    @Override // com.vk.writebar.a.d
    public final void b() {
        h1y0 h1y0Var = this.c.d;
        if (h1y0Var != null) {
            h1y0Var.H0();
        }
    }

    @Override // com.vk.writebar.a.d
    public final void c(float f, int i) {
        g gVar = this.c;
        gVar.g();
        if (this.b == Integer.MIN_VALUE) {
            int[] iArr = new int[2];
            gVar.e().getLocationOnScreen(iArr);
            int width = gVar.e().getWidth() + iArr[0];
            gVar.d().getLocationOnScreen(iArr);
            this.b = iArr[0] - width;
        }
        int i2 = this.b < this.a ? 1 : 3;
        long j = i;
        gVar.d().animate().translationX(f).setDuration(j).start();
        gVar.e().animate().translationX(f / i2).setDuration(j).start();
        gVar.e().setAlpha(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 255.0f - Math.min(255.0f, Math.abs(f / 1.5f))) / 255.0f);
    }

    @Override // com.vk.writebar.a.d
    public final void d() {
        g gVar = this.c;
        gVar.b.k0();
        h1y0 h1y0Var = gVar.d;
        if (h1y0Var != null) {
            h1y0Var.U1();
        }
    }

    @Override // com.vk.writebar.a.d
    public final void onCancel() {
        g gVar = this.c;
        gVar.b.G();
        h1y0 h1y0Var = gVar.d;
        if (h1y0Var != null) {
            h1y0Var.b0();
        }
    }
}
