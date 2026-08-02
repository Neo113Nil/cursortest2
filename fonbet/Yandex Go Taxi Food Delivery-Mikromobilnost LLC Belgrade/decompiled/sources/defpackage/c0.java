package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;
import ru.yandex.logistics.care.camera.ui.c;

/* loaded from: classes11.dex */
public final /* synthetic */ class c0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ oz40 c;

    public /* synthetic */ c0(oz40 oz40Var, tls tlsVar) {
        this.a = 0;
        this.c = oz40Var;
        this.b = tlsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        vr8 vr8Var = vr8.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                bmb1.c(oz40Var, "");
                tlsVar.invoke("");
                break;
            case 1:
                tlsVar.invoke((Drawable) oz40Var.getValue());
                break;
            case 2:
                tlsVar.invoke(new dv7((String) oz40Var.getValue()));
                break;
            case 3:
                c.b(oz40Var, true);
                tlsVar.invoke(vr8Var);
                break;
            case 4:
                c.b(oz40Var, true);
                tlsVar.invoke(vr8Var);
                break;
            case 5:
                tlsVar.invoke(new au9(((hoy0) oz40Var.getValue()).a.b));
                break;
            case 6:
                tlsVar.invoke(new rca0((String) oz40Var.getValue()));
                break;
            case 7:
                tlsVar.invoke(new rca0((String) oz40Var.getValue()));
                break;
            case 8:
                tlsVar.invoke(new sca0((String) oz40Var.getValue()));
                break;
            case 9:
                w7b0 w7b0Var = (w7b0) oz40Var.getValue();
                tlsVar.invoke(new p4b0(w7b0Var != null ? w7b0Var.a : null));
                break;
            case 10:
                if (!((Boolean) oz40Var.getValue()).booleanValue()) {
                    oz40Var.setValue(Boolean.TRUE);
                    tlsVar.invoke(jys0.a);
                    break;
                }
                break;
            default:
                tlsVar.invoke(new ryx0((List) oz40Var.getValue()));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ c0(tls tlsVar, oz40 oz40Var, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = oz40Var;
    }
}
