package defpackage;

import android.view.View;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.semantics.g;
import com.yandex.payment.sdk.ui.view.ProgressResultView;
import com.ybsdk.widgets.common.ToolbarView;
import kotlin.Result;

/* loaded from: classes2.dex */
public final /* synthetic */ class e350 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ e350(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onCloseButtonVisible$lambda$0;
        zy11 onProgressBarVisible$lambda$0;
        zy11 onImageClickListener$lambda$6$lambda$5;
        zy11 onRightImageClickListener$lambda$9$lambda$8;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                Object value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    if (slsVar != null) {
                        slsVar.invoke();
                    }
                }
                Throwable a = Result.a(value);
                if (a != null) {
                    xby.l(jst.e, "MainActivity", null, a, "authorization failed", 2);
                    break;
                }
                break;
            case 1:
                slsVar.invoke();
                break;
            case 2:
                ((Boolean) obj).booleanValue();
                slsVar.invoke();
                break;
            case 3:
                slsVar.invoke();
                break;
            case 4:
                ((Boolean) obj).booleanValue();
                slsVar.invoke();
                break;
            case 5:
                ((Boolean) obj).booleanValue();
                slsVar.invoke();
                break;
            case 6:
                ((Boolean) obj).booleanValue();
                slsVar.invoke();
                break;
            case 7:
                slsVar.invoke();
                break;
            case 8:
                ((Boolean) obj).booleanValue();
                slsVar.invoke();
                break;
            case 9:
                ((Boolean) obj).booleanValue();
                slsVar.invoke();
                break;
            case 10:
                mnq0 mnq0Var = (mnq0) obj;
                Object invoke = slsVar.invoke();
                if (Float.isNaN(((Number) invoke).floatValue())) {
                    invoke = null;
                }
                Float f = (Float) invoke;
                cif0 cif0Var = new cif0(f != null ? f.floatValue() : 0.0f, new r5c(0.0f, 1.0f));
                kgx[] kgxVarArr = f.a;
                g gVar = d.c;
                kgx kgxVar = f.a[1];
                mnq0Var.a(gVar, cif0Var);
                break;
            case 11:
                onCloseButtonVisible$lambda$0 = ProgressResultView.setOnCloseButtonVisible$lambda$0(slsVar, (View) obj);
                break;
            case 12:
                onProgressBarVisible$lambda$0 = ProgressResultView.setOnProgressBarVisible$lambda$0(slsVar, (View) obj);
                break;
            case 13:
                ((Boolean) obj).booleanValue();
                slsVar.invoke();
                break;
            case 14:
                slsVar.invoke();
                break;
            case 15:
                slsVar.invoke();
                break;
            case 16:
                ((Boolean) obj).booleanValue();
                slsVar.invoke();
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                onImageClickListener$lambda$6$lambda$5 = ToolbarView.setOnImageClickListener$lambda$6$lambda$5(slsVar, (View) obj);
                break;
            case 20:
                onRightImageClickListener$lambda$9$lambda$8 = ToolbarView.setOnRightImageClickListener$lambda$9$lambda$8(slsVar, (View) obj);
                break;
            case 21:
                ((Boolean) obj).booleanValue();
                slsVar.invoke();
                break;
            case 22:
                n70 n70Var = (n70) obj;
                n70Var.W(new q70(n70Var, slsVar, 3));
                break;
            case 23:
                slsVar.invoke();
                break;
            default:
                slsVar.invoke();
                break;
        }
        return zy11Var;
    }
}
