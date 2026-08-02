package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;
import xsna.dw20;

/* compiled from: MusicBottomSheet.kt */
/* loaded from: classes3.dex */
public abstract class dc40 implements dcn {
    public final boolean b;
    public hc40 c;
    public int d;

    public dc40(boolean z) {
        this.b = z;
    }

    public abstract List<RecyclerView.Adapter<?>> a(AppCompatActivity appCompatActivity);

    public String c() {
        return getClass().getSimpleName();
    }

    public void d(Activity activity) {
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity != null) {
            Context u = this.b ? bwt0.u(appCompatActivity) : appCompatActivity;
            List<RecyclerView.Adapter<?>> a = a(appCompatActivity);
            hc40 hc40Var = new hc40(a, this.d, new ob0(this, 20));
            String c = c();
            RecyclerView.Adapter[] adapterArr = (RecyclerView.Adapter[]) a.toArray(new RecyclerView.Adapter[0]);
            hc40Var.d = new dw20.b(u, null).i(d920.y0((RecyclerView.Adapter[]) Arrays.copyOf(adapterArr, adapterArr.length)), true, false).f0(new iou(hc40Var, 17)).Y(new g6b(hc40Var)).I0(c);
            this.c = hc40Var;
        }
    }

    @Override // xsna.dcn
    public final void dismiss() {
        hc40 hc40Var = this.c;
        if (hc40Var != null) {
            dw20 dw20Var = hc40Var.d;
            if (dw20Var != null) {
                dw20Var.tn();
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
