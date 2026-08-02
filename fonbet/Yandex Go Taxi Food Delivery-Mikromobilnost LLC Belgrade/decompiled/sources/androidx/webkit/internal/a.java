package androidx.webkit.internal;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import defpackage.aj31;
import defpackage.di6;
import defpackage.ei6;
import defpackage.gh41;
import defpackage.hh41;
import defpackage.ih41;
import defpackage.kh41;
import defpackage.mq41;
import defpackage.qp41;
import defpackage.un2;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes10.dex */
public final class a extends kh41 {
    public WebMessagePort a;
    public WebMessagePortBoundaryInterface b;

    public a(InvocationHandler invocationHandler) {
        this.b = (WebMessagePortBoundaryInterface) ei6.a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    public static WebMessage f(ih41 ih41Var) {
        WebMessagePort[] webMessagePortArr;
        ih41Var.a(0);
        String str = ih41Var.b;
        kh41[] kh41VarArr = ih41Var.a;
        if (kh41VarArr == null) {
            webMessagePortArr = null;
        } else {
            int length = kh41VarArr.length;
            WebMessagePort[] webMessagePortArr2 = new WebMessagePort[length];
            for (int i = 0; i < length; i++) {
                webMessagePortArr2[i] = kh41VarArr[i].b();
            }
            webMessagePortArr = webMessagePortArr2;
        }
        return new WebMessage(str, webMessagePortArr);
    }

    public static kh41[] i(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        kh41[] kh41VarArr = new kh41[webMessagePortArr.length];
        for (int i = 0; i < webMessagePortArr.length; i++) {
            kh41VarArr[i] = new a(webMessagePortArr[i]);
        }
        return kh41VarArr;
    }

    @Override // defpackage.kh41
    public final void a() {
        qp41.t.getClass();
        h().close();
    }

    @Override // defpackage.kh41
    public final WebMessagePort b() {
        return h();
    }

    @Override // defpackage.kh41
    public final InvocationHandler c() {
        return Proxy.getInvocationHandler(g());
    }

    @Override // defpackage.kh41
    public final void d(ih41 ih41Var) {
        un2 un2Var = qp41.s;
        un2Var.getClass();
        int i = ih41Var.d;
        if (i == 0) {
            h().postMessage(f(ih41Var));
        } else {
            if (!un2Var.a() || !gh41.a(i)) {
                throw qp41.a();
            }
            g().postMessage(new di6(new gh41(ih41Var)));
        }
    }

    @Override // defpackage.kh41
    public final void e(final kh41.a aVar) {
        if (qp41.v.a()) {
            g().setWebMessageCallback(new di6(new hh41(aVar)));
        } else {
            h().setWebMessageCallback(new WebMessagePort.WebMessageCallback() { // from class: androidx.webkit.internal.ApiHelperForM$1
                @Override // android.webkit.WebMessagePort.WebMessageCallback
                public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
                    kh41.a.this.onMessage(new a(webMessagePort), new ih41(webMessage.getData(), a.i(webMessage.getPorts())));
                }
            });
        }
    }

    public final WebMessagePortBoundaryInterface g() {
        if (this.b == null) {
            aj31 aj31Var = mq41.a;
            this.b = (WebMessagePortBoundaryInterface) ei6.a(WebMessagePortBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) aj31Var.b).convertWebMessagePort(this.a));
        }
        return this.b;
    }

    public final WebMessagePort h() {
        if (this.a == null) {
            aj31 aj31Var = mq41.a;
            this.a = (WebMessagePort) ((WebkitToCompatConverterBoundaryInterface) aj31Var.b).convertWebMessagePort(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }

    public a(WebMessagePort webMessagePort) {
        this.a = webMessagePort;
    }
}
