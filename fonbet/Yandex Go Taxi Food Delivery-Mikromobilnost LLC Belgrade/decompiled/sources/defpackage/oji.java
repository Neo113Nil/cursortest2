package defpackage;

import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.go.taxi.order.ui.recenter.TaxiOrderTrackingRecenterButton;
import java.util.Iterator;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.ShimmeringPaint;
import yads.ve3;

/* loaded from: classes5.dex */
public final class oji extends iq60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oji(js81 js81Var) {
        super(r0);
        this.a = 9;
        ve3 ve3Var = ve3.b;
        this.b = js81Var;
    }

    @Override // defpackage.iq60
    public final void afterChange(kgx kgxVar, Object obj, Object obj2) {
        ShimmeringPaint shimmeringPaint;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                nji njiVar = ((pji) obj3).d;
                f4c0 f4c0Var = njiVar.a;
                if (f4c0Var != null) {
                    f4c0Var.i(booleanValue);
                }
                f4c0 f4c0Var2 = njiVar.b;
                if (f4c0Var2 != null) {
                    f4c0Var2.i(booleanValue);
                    break;
                }
                break;
            case 1:
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                rji rjiVar = (rji) obj3;
                for (pji pjiVar : rjiVar.b.values()) {
                    Boolean bool = (Boolean) rjiVar.c.getValue(rjiVar, rji.d[0]);
                    bool.booleanValue();
                    pjiVar.c.setValue(pjiVar, pji.f[0], bool);
                }
                break;
            case 2:
                t1w t1wVar = (t1w) obj2;
                if (t1wVar != null) {
                    Iterator it = ((z1w) obj3).a.iterator();
                    while (it.hasNext()) {
                        ((tls) it.next()).invoke(t1wVar);
                    }
                    break;
                }
                break;
            case 3:
                PlaceholderView placeholderView = (PlaceholderView) obj3;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                if (booleanValue2) {
                    shimmeringPaint = placeholderView.getShimmeringPaint();
                    shimmeringPaint.updateOffset(placeholderView);
                    placeholderView.invalidate();
                    break;
                }
                break;
            case 4:
                zxd0 zxd0Var = (zxd0) obj3;
                zxd0Var.x = false;
                if (zxd0Var.isAttached()) {
                    zxd0Var.r();
                    break;
                }
                break;
            case 5:
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                qfl0 qfl0Var = (qfl0) obj3;
                w4e0 w4e0Var = qfl0Var.g;
                if (w4e0Var != null) {
                    w4e0Var.i(((Boolean) qfl0Var.f.getValue(qfl0Var, qfl0.l[0])).booleanValue());
                    break;
                }
                break;
            case 6:
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                ((TaxiOrderTrackingRecenterButton) obj3).updateVisibility();
                break;
            case 7:
                ((qv71) obj3).d.w = (ip71) obj2;
                break;
            case 8:
                ym81 ym81Var = (ym81) obj3;
                vd71 vd71Var = (vd71) obj2;
                vd71 vd71Var2 = (vd71) obj;
                if (!jl40.l(vd71Var, vd71Var2)) {
                    r581 r581Var = ym81Var.g;
                    kgx[] kgxVarArr = ym81.k;
                    kgx kgxVar2 = kgxVarArr[0];
                    CustomizableMediaView customizableMediaView = (CustomizableMediaView) r581Var.a.get();
                    if (customizableMediaView != null) {
                        r581 r581Var2 = ym81Var.h;
                        int i2 = 1;
                        kgx kgxVar3 = kgxVarArr[1];
                        d171 d171Var = (d171) r581Var2.a.get();
                        if (d171Var != null) {
                            vd71Var2.g(customizableMediaView);
                            customizableMediaView.post(new ju61(i2, vd71Var, customizableMediaView, d171Var));
                            break;
                        }
                    }
                }
                break;
            default:
                ((js81) obj3).a.add((ve3) obj2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oji(i681 i681Var, ym81 ym81Var) {
        super(i681Var);
        this.a = 8;
        this.b = ym81Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oji(int i, Object obj) {
        super(null);
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oji(pji pjiVar) {
        super(r0);
        this.a = 0;
        Boolean bool = Boolean.TRUE;
        this.b = pjiVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oji(rji rjiVar) {
        super(r0);
        this.a = 1;
        Boolean bool = Boolean.TRUE;
        this.b = rjiVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oji(qfl0 qfl0Var) {
        super(r0);
        this.a = 5;
        Boolean bool = Boolean.TRUE;
        this.b = qfl0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oji(TaxiOrderTrackingRecenterButton taxiOrderTrackingRecenterButton) {
        super(r0);
        this.a = 6;
        Boolean bool = Boolean.TRUE;
        this.b = taxiOrderTrackingRecenterButton;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oji(PlaceholderView placeholderView) {
        super(r0);
        this.a = 3;
        Boolean bool = Boolean.FALSE;
        this.b = placeholderView;
    }
}
