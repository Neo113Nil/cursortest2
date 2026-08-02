package xsna;

import one.video.controls20.SimpleControlsView;
import one.video.transform.TransformController;

/* compiled from: ConfigurationState.kt */
/* loaded from: classes8.dex */
public final class fzi {
    public static final fzi m = new fzi(yqj.e, rs8.i, null, null, null, null, null, null, null, null, null, new SimpleControlsView.e(0));
    public final yqj a;
    public final rs8 b;
    public final gzs<s3q0> c;
    public final y5r d;
    public final TransformController e;
    public final txs f;
    public final gzs<s3q0> g;
    public final gzs<s3q0> h;
    public final gzs<s3q0> i;
    public final owo0 j;
    public final sox k;
    public final SimpleControlsView.e l;

    public fzi(yqj yqjVar, rs8 rs8Var, gzs gzsVar, y5r y5rVar, TransformController transformController, txs txsVar, gzs gzsVar2, gzs gzsVar3, gzs gzsVar4, owo0 owo0Var, sox soxVar, SimpleControlsView.e eVar) {
        this.a = yqjVar;
        this.b = rs8Var;
        this.c = gzsVar;
        this.d = y5rVar;
        this.e = transformController;
        this.f = txsVar;
        this.g = gzsVar2;
        this.h = gzsVar3;
        this.i = gzsVar4;
        this.j = owo0Var;
        this.k = soxVar;
        this.l = eVar;
    }

    public static fzi a(fzi fziVar, yqj yqjVar, rs8 rs8Var, gzs gzsVar, y5r y5rVar, TransformController transformController, txs txsVar, gzs gzsVar2, gzs gzsVar3, gzs gzsVar4, owo0 owo0Var, sox soxVar, SimpleControlsView.e eVar, int i) {
        if ((i & 1) != 0) {
            yqjVar = fziVar.a;
        }
        yqj yqjVar2 = yqjVar;
        if ((i & 2) != 0) {
            rs8Var = fziVar.b;
        }
        rs8 rs8Var2 = rs8Var;
        gzs gzsVar5 = (i & 4) != 0 ? fziVar.c : gzsVar;
        y5r y5rVar2 = (i & 8) != 0 ? fziVar.d : y5rVar;
        if ((i & 16) != 0) {
            fziVar.getClass();
        }
        if ((i & 32) != 0) {
            fziVar.getClass();
        }
        TransformController transformController2 = (i & 64) != 0 ? fziVar.e : transformController;
        txs txsVar2 = (i & 128) != 0 ? fziVar.f : txsVar;
        gzs gzsVar6 = (i & 256) != 0 ? fziVar.g : gzsVar2;
        gzs gzsVar7 = (i & 512) != 0 ? fziVar.h : gzsVar3;
        gzs gzsVar8 = (i & 1024) != 0 ? fziVar.i : gzsVar4;
        owo0 owo0Var2 = (i & 2048) != 0 ? fziVar.j : owo0Var;
        sox soxVar2 = (i & 4096) != 0 ? fziVar.k : soxVar;
        SimpleControlsView.e eVar2 = (i & 8192) != 0 ? fziVar.l : eVar;
        fziVar.getClass();
        return new fzi(yqjVar2, rs8Var2, gzsVar5, y5rVar2, transformController2, txsVar2, gzsVar6, gzsVar7, gzsVar8, owo0Var2, soxVar2, eVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzi)) {
            return false;
        }
        fzi fziVar = (fzi) obj;
        return epx.f(this.a, fziVar.a) && epx.f(this.b, fziVar.b) && epx.f(this.c, fziVar.c) && epx.f(this.d, fziVar.d) && epx.f(this.e, fziVar.e) && epx.f(this.f, fziVar.f) && epx.f(this.g, fziVar.g) && epx.f(this.h, fziVar.h) && epx.f(this.i, fziVar.i) && epx.f(this.j, fziVar.j) && epx.f(this.k, fziVar.k) && epx.f(this.l, fziVar.l);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        gzs<s3q0> gzsVar = this.c;
        int hashCode2 = (hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
        y5r y5rVar = this.d;
        int hashCode3 = (hashCode2 + (y5rVar == null ? 0 : y5rVar.hashCode())) * 29791;
        TransformController transformController = this.e;
        int hashCode4 = (hashCode3 + (transformController == null ? 0 : transformController.hashCode())) * 31;
        txs txsVar = this.f;
        int hashCode5 = (hashCode4 + (txsVar == null ? 0 : txsVar.hashCode())) * 31;
        gzs<s3q0> gzsVar2 = this.g;
        int hashCode6 = (hashCode5 + (gzsVar2 == null ? 0 : gzsVar2.hashCode())) * 31;
        gzs<s3q0> gzsVar3 = this.h;
        int hashCode7 = (hashCode6 + (gzsVar3 == null ? 0 : gzsVar3.hashCode())) * 31;
        gzs<s3q0> gzsVar4 = this.i;
        int hashCode8 = (hashCode7 + (gzsVar4 == null ? 0 : gzsVar4.hashCode())) * 31;
        owo0 owo0Var = this.j;
        int hashCode9 = (hashCode8 + (owo0Var == null ? 0 : owo0Var.hashCode())) * 31;
        sox soxVar = this.k;
        return this.l.hashCode() + ((hashCode9 + (soxVar != null ? soxVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ConfigurationState(controlsStyle=" + this.a + ", buttonsVisibilityState=" + this.b + ", techBugReportHandler=" + this.c + ", feedbackController=" + this.d + ", castController=null, pipController=null, transformController=" + this.e + ", fullscreenController=" + this.f + ", vkLogoHandler=" + this.g + ", prevVideoHandler=" + this.h + ", nextVideoHandler=" + this.i + ", timelineImages=" + this.j + ", intervals=" + this.k + ", currentIntervalConfig=" + this.l + ")";
    }
}
