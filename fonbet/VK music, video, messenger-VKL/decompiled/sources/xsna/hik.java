package xsna;

/* compiled from: CropTool.kt */
/* loaded from: classes4.dex */
public final class hik implements iik {
    public final /* synthetic */ gik a;

    public hik(gik gikVar) {
        this.a = gikVar;
    }

    @Override // xsna.iik
    public final void d(boolean z) {
        hfk hfkVar;
        hfk hfkVar2;
        gik gikVar = this.a;
        if (z) {
            efk efkVar = gikVar.m;
            if (efkVar != null) {
                efkVar.setClippingEnabled(true);
            }
            uik uikVar = gikVar.n;
            if (uikVar != null && (hfkVar2 = uikVar.e) != null) {
                hfkVar2.setVisibility(0);
            }
            gikVar.K();
            return;
        }
        efk efkVar2 = gikVar.m;
        if (efkVar2 != null) {
            efkVar2.setClippingEnabled(false);
        }
        efk efkVar3 = gikVar.m;
        if (efkVar3 != null) {
            efkVar3.requestLayout();
        }
        uik uikVar2 = gikVar.n;
        if (uikVar2 == null || (hfkVar = uikVar2.e) == null) {
            return;
        }
        hfkVar.setVisibility(8);
    }
}
