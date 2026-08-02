package defpackage;

import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public final /* synthetic */ class dv9 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ dv9(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onAdLabelClickListener$lambda$1;
        zy11 onLinkClickListener$lambda$0;
        zy11 hyperLinkOnClickListener$lambda$6;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(new rv9(((nwa) obj).a));
                return zy11Var;
            case 1:
                tlsVar.invoke(new qv9((gs9) obj));
                return zy11Var;
            case 2:
                tlsVar.invoke(new f0a((yy9) obj));
                return zy11Var;
            case 3:
                tlsVar.invoke(new y9a((uj9) obj));
                return zy11Var;
            case 4:
                tlsVar.invoke(new baa((String) obj));
                return zy11Var;
            case 5:
                tlsVar.invoke((jaa) obj);
                return zy11Var;
            case 6:
                tlsVar.invoke(new gaa((vwa) obj));
                return zy11Var;
            case 7:
                tlsVar.invoke(new haa((uj9) obj));
                return zy11Var;
            case 8:
                tlsVar.invoke(new w9a((qo9) obj));
                return zy11Var;
            case 9:
                tlsVar.invoke(new x9a((uj9) obj));
                return zy11Var;
            case 10:
                tlsVar.invoke(new faa((String) obj));
                return zy11Var;
            case 11:
                tlsVar.invoke(((nwa) obj).a);
                return zy11Var;
            case 12:
                tlsVar.invoke(new dga((ila) obj));
                return zy11Var;
            case 13:
                tlsVar.invoke(new cla((String) obj));
                return zy11Var;
            case 14:
                tlsVar.invoke(new xka((String) obj));
                return zy11Var;
            case 15:
                tlsVar.invoke(new tha((ila) obj));
                return zy11Var;
            case 16:
                tlsVar.invoke((ila) obj);
                return zy11Var;
            case 17:
                tlsVar.invoke(new xka((String) obj));
                return zy11Var;
            case 18:
                tlsVar.invoke(obj);
                return zy11Var;
            case 19:
                tlsVar.invoke(Integer.valueOf((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                return zy11Var;
            case 20:
                tlsVar.invoke((String) obj);
                return zy11Var;
            case 21:
                onAdLabelClickListener$lambda$1 = CommunicationFullScreenView.setOnAdLabelClickListener$lambda$1(tlsVar, (String) obj);
                return onAdLabelClickListener$lambda$1;
            case 22:
                onLinkClickListener$lambda$0 = CommunicationFullScreenView.setOnLinkClickListener$lambda$0(tlsVar, (String) obj);
                return onLinkClickListener$lambda$0;
            case 23:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                tlsVar.invoke(bool);
                return zy11Var;
            case 24:
                n70 n70Var = (n70) obj;
                n70Var.W(new ms3(2, n70Var, tlsVar));
                return zy11Var;
            case 25:
                tlsVar.invoke((String) obj);
                return zy11Var;
            case 26:
                tlsVar.invoke(new l21((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & ((rzx) obj).e())));
                return zy11Var;
            case 27:
                String str = (String) obj;
                tlsVar.invoke(evu0.g0(str, "\n", str));
                return zy11Var;
            case 28:
                tlsVar.invoke(new e3l0((List) obj));
                return zy11Var;
            default:
                hyperLinkOnClickListener$lambda$6 = ErrorView.setHyperLinkOnClickListener$lambda$6(tlsVar, (String) obj);
                return hyperLinkOnClickListener$lambda$6;
        }
    }
}
