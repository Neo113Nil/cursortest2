package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vkontakte.android.R;
import xsna.eeu0;
import xsna.wbu0;
import xsna.x65;

/* compiled from: DefaultAuthView.kt */
/* loaded from: classes15.dex */
public class jbl implements x65 {
    public final Activity b;
    public xpu0 c;

    public jbl(Activity activity) {
        this.b = activity;
    }

    @Override // xsna.dhg
    public final ehg Mb() {
        return new wcl(this.b);
    }

    @Override // xsna.x65
    public final void S(boolean z) {
        if (this.c == null) {
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            if (superappUiRouterBridge == null) {
                superappUiRouterBridge = null;
            }
            this.c = new xpu0(superappUiRouterBridge.u(this.b, true));
        }
        if (z) {
            xpu0 xpu0Var = this.c;
            if (xpu0Var != null) {
                xpu0Var.show();
                return;
            }
            return;
        }
        xpu0 xpu0Var2 = this.c;
        if (xpu0Var2 != null) {
            xpu0Var2.dismiss();
        }
    }

    @Override // xsna.x65
    public final void U2(String str, String str2, String str3, gzs<s3q0> gzsVar, String str4, gzs<s3q0> gzsVar2, boolean z, final gzs<s3q0> gzsVar3, gzs<s3q0> gzsVar4) {
        eeu0.a aVar = new eeu0.a(this.b);
        aVar.c = z;
        aVar.setTitle(str);
        AlertController.b bVar = aVar.a;
        bVar.f = str2;
        aVar.j(str3, new qdf(gzsVar, 2));
        bVar.n = new DialogInterface.OnCancelListener() { // from class: xsna.ibl
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                gzs gzsVar5 = gzs.this;
                if (gzsVar5 != null) {
                    gzsVar5.invoke();
                }
            }
        };
        aVar.i(new ua6(gzsVar4, 1));
        if (str4 != null) {
            aVar.f(str4, new exa(gzsVar2, 1));
        }
        aVar.m();
    }

    @Override // xsna.x65
    public final void qi(String str) {
        Toast.makeText(this.b, str, 1).show();
    }

    @Override // xsna.x65
    public final void vf(wbu0.a aVar) {
        x65.a.b(this, aVar);
    }

    @Override // xsna.x65
    public final void wa(String str, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        Activity activity = this.b;
        x65.a.a(this, activity.getString(R.string.vk_auth_error), str, activity.getString(R.string.vk_ok), gzsVar, null, null, true, gzsVar2, null, 256);
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
    }
}
