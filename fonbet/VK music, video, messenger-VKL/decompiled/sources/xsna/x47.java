package xsna;

import android.os.Handler;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import xsna.ghr;

/* compiled from: BiometricFragment.java */
/* loaded from: classes11.dex */
public final class x47 implements fr70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Fragment c;

    public /* synthetic */ x47(Fragment fragment, int i) {
        this.b = i;
        this.c = fragment;
    }

    @Override // xsna.fr70
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                q47 q47Var = (q47) this.c;
                if (((Boolean) obj).booleanValue()) {
                    q47Var.tn(1);
                    q47Var.dismiss();
                    o57 o57Var = q47Var.i;
                    if (o57Var.v == null) {
                        o57Var.v = new ug50<>();
                    }
                    o57.n(o57Var.v, Boolean.FALSE);
                    break;
                }
                break;
            default:
                CharSequence charSequence = (CharSequence) obj;
                ghr ghrVar = (ghr) this.c;
                Handler handler = ghrVar.x;
                ghr.a aVar = ghrVar.y;
                handler.removeCallbacks(aVar);
                TextView textView = ghrVar.D;
                if (textView != null) {
                    textView.setText(charSequence);
                }
                handler.postDelayed(aVar, 2000L);
                break;
        }
    }
}
