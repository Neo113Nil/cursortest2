package defpackage;

import androidx.webkit.internal.a;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: classes10.dex */
public final class gh41 implements WebMessageBoundaryInterface {
    public static final String[] b = {"WEB_MESSAGE_ARRAY_BUFFER"};
    public final ih41 a;

    public gh41(ih41 ih41Var) {
        this.a = ih41Var;
    }

    public static boolean a(int i) {
        return i == 0 || (i == 1 && qp41.u.a());
    }

    public static ih41 b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        kh41[] kh41VarArr = new kh41[ports.length];
        for (int i = 0; i < ports.length; i++) {
            kh41VarArr[i] = new a(ports[i]);
        }
        if (!qp41.u.a()) {
            return new ih41(webMessageBoundaryInterface.getData(), kh41VarArr);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) ei6.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new ih41(webMessagePayloadBoundaryInterface.getAsString(), kh41VarArr);
        }
        if (type != 1) {
            return null;
        }
        return new ih41(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), kh41VarArr);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final String getData() {
        ih41 ih41Var = this.a;
        ih41Var.a(0);
        return ih41Var.b;
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final InvocationHandler getMessagePayload() {
        jh41 jh41Var;
        ih41 ih41Var = this.a;
        int i = ih41Var.d;
        if (i == 0) {
            ih41Var.a(0);
            jh41Var = new jh41(ih41Var.b);
        } else {
            if (i != 1) {
                throw new IllegalStateException("Unknown web message payload type: " + i);
            }
            ih41Var.a(1);
            byte[] bArr = ih41Var.c;
            Objects.requireNonNull(bArr);
            jh41Var = new jh41(bArr);
        }
        return new di6(jh41Var);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final InvocationHandler[] getPorts() {
        kh41[] kh41VarArr = this.a.a;
        if (kh41VarArr == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[kh41VarArr.length];
        for (int i = 0; i < kh41VarArr.length; i++) {
            invocationHandlerArr[i] = kh41VarArr[i].c();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return b;
    }
}
