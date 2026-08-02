package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.a;
import com.yandex.go.superapp.web.modal.WebModalView;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes5.dex */
public final class jg41 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jg41(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        sh41 sh41Var;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                gcn gcnVar = (gcn) obj2;
                WebModalView webModalView = (WebModalView) ((eg01) ((la41) obj3)).a;
                Context context = webModalView.getContext();
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", ((imr0) obj).a);
                intent.setType("text/plain");
                Intent createChooser = Intent.createChooser(intent, null);
                if (!(webModalView.getContext() instanceof Activity)) {
                    createChooser.addFlags(SelfTester_JCP.IMITA);
                }
                context.startActivity(createChooser);
                gcnVar.a(new ck7(zy11Var, null));
                break;
            case 1:
                jg41 jg41Var = (jg41) obj3;
                jg41Var.invoke(vmx.a.a().b(imr0.Companion.serializer(), (String) obj), (gcn) obj2);
                break;
            case 2:
                gcn gcnVar2 = (gcn) obj2;
                p32 p32Var = (p32) obj;
                sh41Var = ((WebModalView) ((aj31) ((ja41) obj3)).b).webMetricaReporter;
                String str = p32Var.a;
                if (str == null) {
                    str = "";
                }
                ((j) sh41Var).u(new k52(str, p32Var.b));
                gcnVar2.a(new ck7(zy11Var, null));
                break;
            case 3:
                jg41 jg41Var2 = (jg41) obj3;
                jg41Var2.invoke(vmx.a.a().b(p32.Companion.serializer(), (String) obj), (gcn) obj2);
                break;
            case 4:
                kg41 kg41Var = (kg41) obj3;
                kg41Var.invoke(vmx.a.a().b(rwq0.Companion.serializer(), (String) obj), (gcn) obj2);
                break;
            case 5:
                kg41 kg41Var2 = (kg41) obj3;
                kg41Var2.invoke(vmx.a.a().b(dz11.b, (String) obj), (gcn) obj2);
                break;
            case 6:
                xh41 xh41Var = (xh41) obj3;
                xh41Var.invoke(vmx.a.a().b(dz11.b, (String) obj), (gcn) obj2);
                break;
            case 7:
                xh41 xh41Var2 = (xh41) obj3;
                xh41Var2.invoke(vmx.a.a().b(dz11.b, (String) obj), (gcn) obj2);
                break;
            case 8:
                xh41 xh41Var3 = (xh41) obj3;
                xh41Var3.invoke(vmx.a.a().b(dz11.b, (String) obj), (gcn) obj2);
                break;
            case 9:
                xh41 xh41Var4 = (xh41) obj3;
                xh41Var4.invoke(vmx.a.a().b(f8o.Companion.serializer(), (String) obj), (gcn) obj2);
                break;
            case 10:
                xh41 xh41Var5 = (xh41) obj3;
                xh41Var5.invoke(vmx.a.a().b(iti0.Companion.serializer(), (String) obj), (gcn) obj2);
                break;
            case 11:
                xh41 xh41Var6 = (xh41) obj3;
                xh41Var6.invoke(vmx.a.a().b(dz11.b, (String) obj), (gcn) obj2);
                break;
            default:
                fid fidVar = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                ((a) obj3).invoke(fidVar, 0);
                break;
        }
        return zy11Var;
    }
}
