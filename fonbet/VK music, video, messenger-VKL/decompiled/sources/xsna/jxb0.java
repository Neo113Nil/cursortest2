package xsna;

import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import kotlin.NoWhenBranchMatchedException;
import xsna.cbv;
import xsna.mbv;

/* compiled from: PopupScheduler.kt */
@ozl
/* loaded from: classes2.dex */
public final class jxb0 implements erh0, io.reactivex.rxjava3.functions.c {
    public Object b;

    public /* synthetic */ jxb0(Object obj) {
        this.b = obj;
    }

    @Override // xsna.erh0
    public void a() {
        zuq zuqVar = (zuq) this.b;
        zuqVar.j = true;
        FragmentActivity activity = zuqVar.a.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        zuqVar.j = false;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        mbv mbvVar = (mbv) obj;
        ((cbv) this.b).getClass();
        if (mbvVar instanceof mbv.b) {
            return new cbv.a.C2656a(intValue);
        }
        if ((mbvVar instanceof mbv.d) || (mbvVar instanceof mbv.e) || (mbvVar instanceof mbv.c)) {
            return cbv.a.b.a;
        }
        if (epx.f(mbvVar, mbv.a.a)) {
            return cbv.a.c.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public void b() {
        ((cvi) this.b).getClass();
    }

    public jxb0(int i) {
        switch (i) {
            case 5:
                this.b = new pgm0();
                break;
            default:
                this.b = new Handler();
                break;
        }
    }
}
