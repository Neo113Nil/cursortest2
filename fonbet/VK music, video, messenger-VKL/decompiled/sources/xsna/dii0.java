package xsna;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.vk.writebar.WriteBar;

/* compiled from: SendPopup.kt */
/* loaded from: classes7.dex */
public final class dii0 {
    public final View a;
    public final ViewGroup b;
    public final ezt0 c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public boolean e;

    public dii0(View view, ViewGroup viewGroup, ezt0 ezt0Var) {
        this.a = view;
        this.b = viewGroup;
        this.c = ezt0Var;
    }

    public final void a() {
        vlp0 duration = new a0k0(48).setDuration(200L);
        ViewGroup viewGroup = this.b;
        zmp0.a(viewGroup, duration);
        viewGroup.removeView(this.a);
        this.e = false;
        WriteBar writeBar = ((kz30) this.c.b).t;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.q0(false);
    }

    public final void b() {
        this.e = true;
        vlp0 duration = new a0k0(80).setDuration(200L);
        ViewGroup viewGroup = this.b;
        zmp0.a(viewGroup, duration);
        viewGroup.addView(this.a);
        WriteBar writeBar = ((kz30) this.c.b).t;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.q0(true);
    }
}
