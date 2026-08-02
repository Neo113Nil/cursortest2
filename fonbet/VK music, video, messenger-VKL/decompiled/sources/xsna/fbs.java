package xsna;

import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;
import java.io.PrintWriter;

/* compiled from: FragmentHostCallback.kt */
/* loaded from: classes.dex */
public abstract class fbs<H> extends uas {
    public final FragmentActivity b;
    public final FragmentActivity c;
    public final Handler d;
    public final wbs e;

    public fbs(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.b = fragmentActivity;
        this.c = fragmentActivity;
        this.d = handler;
        this.e = new wbs();
    }

    public abstract void d(PrintWriter printWriter, String[] strArr);

    public abstract FragmentActivity e();

    public abstract LayoutInflater f();

    public abstract boolean g(String str);

    public abstract void h();
}
