package defpackage;

import com.yandex.messenger.websdk.api.UserUnreadCounters;

/* loaded from: classes12.dex */
public final /* synthetic */ class ec01 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ ec01(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(new yb01((String) obj));
                break;
            case 1:
                tlsVar.invoke(new vb01((String) obj));
                break;
            case 2:
                h7p h7pVar = (h7p) obj;
                if (!jl40.l(h7pVar, e7p.a)) {
                    if (!(h7pVar instanceof f7p)) {
                        if (!jl40.l(h7pVar, g7p.a)) {
                            w511.b();
                            break;
                        } else {
                            tlsVar.invoke(aa11.a);
                            break;
                        }
                    } else {
                        tlsVar.invoke(new z911(((f7p) h7pVar).a));
                        break;
                    }
                } else {
                    tlsVar.invoke(new u911());
                    break;
                }
            case 3:
                tlsVar.invoke(new ca11((h711) obj));
                break;
            case 4:
                tlsVar.invoke(new ea11((bzy0) obj));
                break;
            case 5:
                tlsVar.invoke(new da11((ee01) obj));
                break;
            case 6:
                tlsVar.invoke(new fa11((ge01) obj));
                break;
            case 7:
                tlsVar.invoke(new xa11((String) obj));
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                w221 w221Var = (w221) obj;
                Integer num = w221Var.a;
                int intValue = num != null ? num.intValue() : 0;
                Integer num2 = w221Var.c;
                tlsVar.invoke(new UserUnreadCounters(intValue, num2 != null ? num2.intValue() : 0, w221Var.b, w221Var.d, w221Var.e));
                break;
            case 12:
                break;
            case 13:
                n70 n70Var = (n70) obj;
                n70Var.W(new ms3(10, n70Var, tlsVar));
                break;
            case 14:
                tlsVar.invoke(new rd31((String) obj));
                break;
            case 15:
                tlsVar.invoke(new md31((zxu) obj));
                break;
            case 16:
                tlsVar.invoke(new ud31((i1v) obj));
                break;
            case 17:
                tlsVar.invoke(new rd31((String) obj));
                break;
            case 18:
                tlsVar.invoke((wu60) obj);
                break;
            default:
                tlsVar.invoke(((ga3) obj).b.a);
                break;
        }
        return zy11Var;
    }
}
