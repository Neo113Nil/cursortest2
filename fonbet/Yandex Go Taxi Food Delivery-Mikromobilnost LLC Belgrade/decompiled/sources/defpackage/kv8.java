package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.SslErrorHandler;
import java.util.HashMap;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.sdk.webview.impl.ui.b;
import ru.yandex.taxi.logistics.sdk.webview.api.WebViewState;
import yads.oa1;

/* loaded from: classes5.dex */
public final class kv8 implements sdq0, cl11, eev, sl60, bm41, p181 {
    public final /* synthetic */ int a;
    public final Object b;

    public kv8(bgc bgcVar, tls tlsVar, bgc bgcVar2) {
        this.a = 2;
        this.b = tlsVar;
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }

    @Override // defpackage.sdq0
    public void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((zsa) obj).r(new jv8(0));
                break;
            case 1:
            case 2:
            case 5:
            default:
                ((cpw) obj).i();
                break;
            case 3:
                SslErrorHandler sslErrorHandler = (SslErrorHandler) obj;
                if (sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                    break;
                }
                break;
            case 4:
                pj pjVar = (pj) ((dvh) obj).c.b;
                pjVar.getClass();
                pjVar.a.a("CopypastApprovalCard.Contacts.CloseButtonTapped", new HashMap(), 1, new HashMap());
                break;
            case 6:
                b1 b1Var = (b1) ((w4p) obj).e.c;
                b1Var.getClass();
                b1Var.a.a("ExtraPhoneContact.CloseButtonTapped", new HashMap(), 1, new HashMap());
                break;
            case 7:
                ((xmw) obj).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.bm41
    public void b(boolean z) {
        b bVar = (b) this.b;
        if (z) {
            ku41 ku41Var = bVar.x;
            WebViewState webViewState = WebViewState.ERROR;
            r0 r0Var = ku41Var.a;
            r0Var.getClass();
            r0Var.m(null, webViewState);
        }
        bVar.c.b.getClass();
    }

    @Override // defpackage.p181
    public void c(Context context, oa1 oa1Var) {
    }

    @Override // defpackage.eev
    public void d(m9o m9oVar) {
    }

    @Override // defpackage.bm41
    public void f() {
        ((b) this.b).c.a.dismiss();
    }

    @Override // defpackage.sdq0
    public void h() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
            case 4:
            case 6:
                break;
            case 7:
                ((xmw) obj).r(new qu(9));
                break;
            default:
                ((cpw) obj).i();
                break;
        }
    }

    @Override // defpackage.bm41
    public void j(String str, boolean z) {
        b bVar = (b) this.b;
        if (z) {
            ku41 ku41Var = bVar.x;
            WebViewState webViewState = WebViewState.ERROR;
            r0 r0Var = ku41Var.a;
            r0Var.getClass();
            r0Var.m(null, webViewState);
        }
        bVar.c.b.getClass();
    }

    @Override // defpackage.eev
    public void k(t3v0 t3v0Var) {
        Bitmap a = vac.a(t3v0Var);
        if (a != null) {
            ((tls) this.b).invoke(a);
        }
    }

    @Override // defpackage.p181
    public void onAttachedToWindow() {
        int i = cs71.b;
        j471 j471Var = (j471) this.b;
        if (cs71.b(j471Var)) {
            return;
        }
        j471.class.toString();
        j471Var.G.a(j471Var);
    }

    @Override // defpackage.eev
    public void onCancel() {
    }

    @Override // defpackage.p181
    public void onDetachedFromWindow() {
        int i = cs71.b;
        j471 j471Var = (j471) this.b;
        if (cs71.b(j471Var)) {
            return;
        }
        j471.class.toString();
        j471Var.G.b(j471Var);
    }

    @Override // defpackage.bm41
    public void onFinish() {
        b bVar = (b) this.b;
        ku41 ku41Var = bVar.x;
        if (((WebViewState) ku41Var.b.a.getValue()) != WebViewState.ERROR) {
            WebViewState webViewState = WebViewState.READY;
            r0 r0Var = ku41Var.a;
            r0Var.getClass();
            r0Var.m(null, webViewState);
        }
        bVar.c.b.getClass();
    }

    @Override // defpackage.cl11
    public void onPause() {
        g09 g09Var = (g09) this.b;
        h09 h09Var = g09Var.i;
        if (h09Var != null) {
            g09Var.a.Hg(h09Var);
        }
    }

    @Override // defpackage.cl11
    public void onResume() {
        g09 g09Var = (g09) this.b;
        h09 h09Var = g09Var.i;
        if (h09Var != null) {
            an8 an8Var = g09Var.a.w;
            an8Var.getClass();
            an8Var.u(new o09(h09Var));
        }
    }

    @Override // defpackage.eev
    public void onStart() {
        switch (this.a) {
            case 2:
                break;
            default:
                b bVar = (b) this.b;
                ku41 ku41Var = bVar.x;
                WebViewState webViewState = WebViewState.LOADING;
                r0 r0Var = ku41Var.a;
                r0Var.getClass();
                r0Var.m(null, webViewState);
                bVar.c.b.getClass();
                break;
        }
    }

    @Override // defpackage.sl60
    public void r() {
        SslErrorHandler sslErrorHandler = (SslErrorHandler) this.b;
        if (sslErrorHandler != null) {
            sslErrorHandler.proceed();
        }
    }

    public /* synthetic */ kv8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
