package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.k86;

/* compiled from: StoryEditorVolumeController.kt */
/* loaded from: classes16.dex */
public final class f2m0 {
    public final k86.a a;
    public boolean b;
    public boolean c;

    public f2m0(k86.a aVar) {
        this.a = aVar;
    }

    public final void a(boolean z) {
        mat0 d;
        this.b = z;
        float f = (z || this.c) ? 0.0f : 1.0f;
        u440 u440Var = this.a.a;
        V v = u440Var.s;
        boolean z2 = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        v.getStickersDrawingView().setVideoStickersVolume(f);
        v.getStickersDrawingView().setNeedRequestAudioFocus(!z2);
        tam0 tam0Var = u440Var.B0;
        if (tam0Var != null && (d = tam0Var.d()) != null) {
            d.e = z2;
        }
        z4p z4pVar = u440Var.t;
        if (z4pVar != null) {
            z4pVar.setMuteBtnImage(z2);
        }
    }

    public final void b(boolean z) {
        this.a.a.B.a.setVolume(z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
        c(z);
    }

    public final void c(boolean z) {
        mat0 d;
        this.c = z;
        float f = (this.b || z) ? 0.0f : 1.0f;
        u440 u440Var = this.a.a;
        V v = u440Var.s;
        boolean z2 = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        v.getStickersDrawingView().setVideoStickersVolume(f);
        v.getStickersDrawingView().setNeedRequestAudioFocus(!z2);
        tam0 tam0Var = u440Var.B0;
        if (tam0Var != null && (d = tam0Var.d()) != null) {
            d.e = z2;
        }
        z4p z4pVar = u440Var.t;
        if (z4pVar != null) {
            z4pVar.setMuteBtnImage(z2);
        }
    }
}
