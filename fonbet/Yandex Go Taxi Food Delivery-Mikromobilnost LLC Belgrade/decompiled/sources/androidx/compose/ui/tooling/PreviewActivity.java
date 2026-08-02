package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.material3.e;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import defpackage.agc0;
import defpackage.an91;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.dkm0;
import defpackage.epb1;
import defpackage.evu0;
import defpackage.f530;
import defpackage.fid;
import defpackage.i4a1;
import defpackage.j690;
import defpackage.kq5;
import defpackage.nad;
import defpackage.o990;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.r5y;
import defpackage.sls;
import defpackage.t240;
import defpackage.v0d;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.yx40;
import defpackage.z910;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "composableFqn", "Lzy11;", "setComposableContent", "(Ljava/lang/String;)V", "className", "methodName", "parameterProvider", "setParameterizedContent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "TAG", "Ljava/lang/String;", "ui-tooling"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PreviewActivity extends ComponentActivity {
    public static final int $stable = 8;
    private final String TAG = "PreviewActivity";

    private final void setComposableContent(String composableFqn) {
        String h0 = evu0.h0('.', composableFqn, composableFqn);
        String e0 = evu0.e0('.', composableFqn, composableFqn);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra != null) {
            setParameterizedContent(h0, e0, stringExtra);
        } else {
            v0d.a(this, new a(-840626948, new kq5(h0, e0, 11), true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setComposableContent$lambda$1(String str, String str2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            epb1.d(str, str2, btsVar, new Object[0]);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final void setParameterizedContent(String className, String methodName, String parameterProvider) {
        int i = 27;
        v0d.a(this, new a(-1901447514, new t240(i, methodName, i4a1.h(getIntent().getIntExtra("parameterProviderIndex", -1), i4a1.g(parameterProvider)), className), true));
    }

    private static final zy11 setParameterizedContent$lambda$0(Object[] objArr, String str, String str2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = f.g(0);
                btsVar.o0(Q);
            }
            yx40 yx40Var = (yx40) Q;
            dkm0.a(null, null, null, null, wwg.S(-531963740, true, new o990(6, objArr, yx40Var), btsVar), 0, 0L, 0L, null, wwg.S(993072492, true, new r5y(str, str2, objArr, yx40Var, 13), btsVar), btsVar, 805330944, 495);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setParameterizedContent$lambda$0$1(Object[] objArr, yx40 yx40Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            boolean e = btsVar.e(objArr);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new agc0(10, yx40Var, objArr);
                btsVar.o0(Q);
            }
            nad.a.getClass();
            e.a((sls) Q, null, null, 0L, 0L, null, nad.b, btsVar, 12582912);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setParameterizedContent$lambda$0$1$0$0(yx40 yx40Var, Object[] objArr) {
        yx40Var.setIntValue((yx40Var.getIntValue() + 1) % objArr.length);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setParameterizedContent$lambda$0$2(String str, String str2, Object[] objArr, yx40 yx40Var, j690 j690Var, fid fidVar, int i) {
        if ((i & 6) == 0) {
            i |= ((bts) fidVar).k(j690Var) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 19) != 18)) {
            f530 j = an91.j(c530.a, j690Var);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, j);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.y(btsVar, Integer.valueOf(hashCode), d.g);
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            epb1.d(str, str2, btsVar, objArr[yx40Var.getIntValue()]);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setParameterizedContent$lambda$1(String str, String str2, Object[] objArr, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            epb1.d(str, str2, btsVar, Arrays.copyOf(objArr, objArr.length));
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        String stringExtra;
        super.onCreate(savedInstanceState);
        if ((getApplicationInfo().flags & 2) == 0) {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        setComposableContent(stringExtra);
    }
}
