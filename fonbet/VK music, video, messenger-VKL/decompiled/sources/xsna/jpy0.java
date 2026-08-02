package xsna;

import android.R;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.my.target.common.MyTargetActivity;
import java.lang.ref.WeakReference;
import xsna.fkz0;
import xsna.ocz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class jpy0 implements MyTargetActivity.a {
    public final ocz0 a;
    public WeakReference b;
    public mxy0 c;
    public final mez0 d;
    public boolean e = false;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public final class a {
        public a() {
        }
    }

    public jpy0(ocz0 ocz0Var, fkz0 fkz0Var, fkz0.a aVar) {
        this.a = ocz0Var;
        this.d = mez0.a(ocz0Var.U.a);
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final void a() {
        mxy0 mxy0Var;
        if (!this.e || (mxy0Var = this.c) == null) {
            return;
        }
        this.e = false;
        if (mxy0Var.g != 1) {
            return;
        }
        mxy0Var.b();
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final boolean d() {
        mxy0 mxy0Var = this.c;
        if (mxy0Var != null) {
            if (mxy0Var.a.e.getVisibility() != 0) {
                return false;
            }
            int i = mxy0Var.g;
            if (i != 2 && (i != 1 || mxy0Var.c.Z != null)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final void g(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        myTargetActivity.setTheme(R.style.Theme.NoTitleBar);
        this.b = new WeakReference(myTargetActivity);
        mxy0 mxy0Var = new mxy0(this.a, new a(), frameLayout.getContext());
        this.c = mxy0Var;
        frameLayout.addView(mxy0Var.a);
        mxy0 mxy0Var2 = this.c;
        ocz0 ocz0Var = mxy0Var2.c;
        bjy0 bjy0Var = mxy0Var2.a;
        int i = mxy0Var2.g;
        if (i != 0) {
            return;
        }
        if (i == 0) {
            mxy0Var2.g = 1;
            ocz0.c cVar = ocz0Var.W;
            if (cVar == null) {
                mxy0Var2.b();
            } else {
                e5z0 e5z0Var = cVar.a;
                if (ocz0Var.Z != null) {
                    bjy0Var.f.setVisibility(0);
                } else {
                    bjy0Var.f.setVisibility(8);
                    bjy0Var.e.setVisibility(0);
                }
                duy0 interactiveView = bjy0Var.getInteractiveView();
                interactiveView.setPlayableStartInteractiveListener(mxy0Var2);
                String str = cVar.U;
                String str2 = cVar.V;
                WebView webView = interactiveView.getWebView();
                if (!TextUtils.isEmpty(str2)) {
                    webView.loadUrl(str2);
                } else if (TextUtils.isEmpty(str)) {
                    mxy0Var2.b();
                } else {
                    webView.loadDataWithBaseURL("https://ad.mail.ru/", str, "text/html", C.UTF8_NAME, null);
                }
                duy0 duy0Var = bjy0Var.b;
                if (duy0Var.getParent() == null) {
                    bjy0Var.g.addView(duy0Var, -1, -1);
                }
                izy0 b = izy0.b(cVar.b, e5z0Var, null);
                mxy0Var2.d = b;
                b.f(interactiveView);
                suy0 a2 = suy0.a(e5z0Var, null);
                mxy0Var2.e = a2;
                a2.b(interactiveView);
                mxy0Var2.e.c();
            }
        }
        wty0 wty0Var = ocz0Var.L;
        if (wty0Var == null) {
            return;
        }
        bjy0Var.getAdChoicesButton().setOnClickListener(new w2v0(2, mxy0Var2, wty0Var));
        if (wty0Var.c == null) {
            return;
        }
        fvy0 fvy0Var = new fvy0(wty0Var, new mnh0());
        mxy0Var2.f = fvy0Var;
        fvy0Var.d = new tj60(mxy0Var2, 25);
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final void l() {
        this.b = null;
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final void c() {
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final void m() {
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final void i(MyTargetActivity myTargetActivity) {
    }
}
