package xsna;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.my.target.common.MyTargetActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.hjz0;
import xsna.hox;
import xsna.ijg0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class euy0 implements hjz0, MyTargetActivity.a {
    public final hjz0.a a;
    public final hjz0.b b;
    public final ff6 c;
    public boolean d;
    public boolean e;
    public WeakReference f;
    public boolean g;
    public ijg0.c i;
    public boolean h = false;
    public boolean j = true;

    public euy0(hjz0.a aVar, ff6 ff6Var, hjz0.b bVar) {
        this.a = aVar;
        this.c = ff6Var;
        this.b = bVar;
    }

    public static euy0 n(ff6 ff6Var, ArrayList arrayList, ikz0 ikz0Var, boolean z, hjz0.a aVar, hox.f fVar) {
        if (arrayList.size() == 1) {
            return o(ff6Var, (hkz0) arrayList.get(0), ikz0Var, z, aVar, fVar);
        }
        if (arrayList.size() <= 1) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hkz0 hkz0Var = (hkz0) it.next();
            if (hkz0Var instanceof tez0) {
                tez0 tez0Var = (tez0) hkz0Var;
                if (tez0Var.i0 == 3) {
                    arrayList2.add(tez0Var);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return o(ff6Var, (hkz0) arrayList.get(0), ikz0Var, z, aVar, fVar);
        }
        if (arrayList2.size() == 1) {
            return o(ff6Var, (hkz0) arrayList2.get(0), ikz0Var, z, aVar, fVar);
        }
        p4z0 p4z0Var = new p4z0(aVar, ff6Var, fVar);
        p4z0Var.k = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            tez0 tez0Var2 = (tez0) it2.next();
            p4z0Var.k.add(new m6z0(tez0Var2, suy0.a(tez0Var2.a, new an6(aVar, tez0Var2)), z));
        }
        return p4z0Var;
    }

    public static euy0 o(ff6 ff6Var, hkz0 hkz0Var, ikz0 ikz0Var, boolean z, hjz0.a aVar, hjz0.b bVar) {
        if (hkz0Var instanceof tez0) {
            return new igz0(ff6Var, (tez0) hkz0Var, ikz0Var, z, aVar, bVar);
        }
        if (hkz0Var instanceof nxy0) {
            return new xyy0(ff6Var, (nxy0) hkz0Var, ikz0Var, aVar, bVar);
        }
        if (hkz0Var instanceof p0z0) {
            return new r2z0(ff6Var, (p0z0) hkz0Var, aVar);
        }
        if (hkz0Var instanceof s4z0) {
            return new t6z0(ff6Var, (s4z0) hkz0Var, aVar, bVar);
        }
        return null;
    }

    @Override // xsna.hjz0
    public final void a(Context context) {
        boolean z = this.g;
        hjz0.a aVar = this.a;
        if (z) {
            aVar.c();
            gu8.c(null, "InterstitialAdEngine: Unable to open Interstitial Ad twice, please dismiss currently showing ad first");
            return;
        }
        if (this.h) {
            aVar.c();
            gu8.c(null, "InterstitialAdEngine: Unable to open Interstitial Ad twice, please use another ad object");
            this.c.a.j.a(1, 1, IronSourceConstants.errorCode_loadInProgress, null, null);
            return;
        }
        aVar.d();
        this.g = true;
        MyTargetActivity.f = this;
        Intent intent = new Intent(context, (Class<?>) MyTargetActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final boolean d() {
        return r() && this.j;
    }

    @Override // xsna.hjz0
    public final void destroy() {
        q();
    }

    public void e(xey0 xey0Var) {
        xey0Var.T.d(1, IronSourceConstants.errorCode_showInProgress);
        h8z0.e(xey0Var.a, "closedByUser", 1, new mn6(this, xey0Var));
        q();
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public void g(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        myTargetActivity.setTheme(R.style.Theme.NoTitleBar);
        this.f = new WeakReference(myTargetActivity);
        this.a.e();
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final void i(MyTargetActivity myTargetActivity) {
        DisplayCutout displayCutout;
        Window window = myTargetActivity.getWindow();
        if (window == null) {
            return;
        }
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(-16777216);
        View decorView = window.getDecorView();
        if (decorView == null) {
            window.setFlags(1024, 1024);
            return;
        }
        decorView.setBackgroundColor(-16777216);
        if (Build.VERSION.SDK_INT >= 29) {
            Display display = decorView.getDisplay();
            if (display == null) {
                window.setFlags(1024, 1024);
                return;
            }
            displayCutout = display.getCutout();
        } else {
            WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
            if (rootWindowInsets == null) {
                window.setFlags(1024, 1024);
                return;
            }
            displayCutout = rootWindowInsets.getDisplayCutout();
        }
        if (displayCutout == null) {
            window.setFlags(1024, 1024);
        }
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public void l() {
        this.g = false;
        this.f = null;
        this.a.b();
    }

    public final void p(double d) {
        if (d >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            this.a.f();
        }
    }

    public final void q() {
        this.g = false;
        this.h = true;
        WeakReference weakReference = this.f;
        MyTargetActivity myTargetActivity = weakReference == null ? null : (MyTargetActivity) weakReference.get();
        if (myTargetActivity != null) {
            myTargetActivity.finish();
        }
    }

    public abstract boolean r();

    @Override // com.my.target.common.MyTargetActivity.a
    public void c() {
    }

    public final void a(boolean z) {
        this.j = z;
    }
}
