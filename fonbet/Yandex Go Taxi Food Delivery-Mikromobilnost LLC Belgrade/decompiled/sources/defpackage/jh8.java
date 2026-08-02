package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.a;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.contract.CardNetwork;
import java.util.Locale;

/* loaded from: classes12.dex */
public final /* synthetic */ class jh8 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ jh8(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        a aVar = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                CardNetwork cardNetwork = aVar.e.a(str).a;
                if (cardNetwork == CardNetwork.UNKNOWN) {
                    cardNetwork = null;
                }
                if (cardNetwork != null) {
                    return cardNetwork.getStringCode();
                }
                return null;
            default:
                return (pj8) aVar.u.get(str.toLowerCase(Locale.ROOT));
        }
    }
}
