package defpackage;

import android.nfc.NfcAdapter;
import com.yandex.go.superapp.web.modal.m;

/* loaded from: classes5.dex */
public final class kg41 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ kg41(m mVar, int i) {
        this.a = i;
        this.b = mVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                mVar.a((rwq0) obj);
                ((gcn) obj2).a(new ck7(zy11Var, null));
                break;
            default:
                ((gcn) obj2).a(new ck7(new ka60(NfcAdapter.getDefaultAdapter(mVar.a) != null), null));
                break;
        }
        return zy11Var;
    }
}
