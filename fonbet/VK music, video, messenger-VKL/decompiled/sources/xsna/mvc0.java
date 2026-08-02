package xsna;

import android.graphics.Bitmap;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import xsna.gij;
import xsna.h8z0;
import xsna.hjz0;
import xsna.m7h0;
import xsna.z0x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mvc0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.i, io.reactivex.rxjava3.functions.c, e380, h8z0.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mvc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.h8z0.b
    public void a() {
        r2z0 r2z0Var = (r2z0) this.c;
        hjz0.a aVar = r2z0Var.a;
        String str = r2z0Var.k.F;
        yil0.d(aVar);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (mwc0) ((c230) this.c).invoke(obj);
            case 1:
                return (m7h0.b) ((c230) this.c).invoke(obj);
            case 2:
                return (List) ((tei0) this.c).invoke(obj);
            case 3:
                return (String) ((kl60) this.c).invoke(obj);
            case 4:
                return (Set) ((t3v) this.c).invoke(obj);
            case 5:
                return (j5n0) ((bjm0) this.c).invoke(obj);
            case 6:
                return (Result) ((q520) this.c).invoke(obj);
            case 7:
                return (gij.a) ((kl60) this.c).invoke(obj);
            case 8:
                return (Bitmap) ((ogr0) this.c).invoke(obj);
            case 9:
                return (List) ((bjm0) this.c).invoke(obj);
            case 10:
                return (ncq0) ((bjm0) this.c).invoke(obj);
            case 11:
            case 12:
            default:
                return (Boolean) ((wgm0) this.c).invoke(obj);
            case 13:
                return (z0x0.b.C4149b) ((qm90) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.i
    public Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.b) {
            case 11:
                return (VoipActionsFeatureState.x) ((ocw0) this.c).invoke(obj, obj2, obj3, obj4, obj5);
            default:
                return (ybx0) ((wbx0) this.c).invoke(obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // xsna.e380
    public void onComplete(Throwable th) {
        ((fwj0) this.c).dispose();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Pair) ((wzs) this.c).invoke(obj, obj2);
    }
}
