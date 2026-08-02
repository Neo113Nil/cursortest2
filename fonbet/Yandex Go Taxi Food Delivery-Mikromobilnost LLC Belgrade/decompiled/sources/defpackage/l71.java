package defpackage;

import java.util.List;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.text_input_screen.ui.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class l71 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ tls c;

    public /* synthetic */ l71(List list, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = list;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        List list = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                apa1.a(list, tlsVar, fidVar, vng.O(9));
                break;
            case 1:
                oab1.f(list, tlsVar, fidVar, vng.O(1));
                break;
            case 2:
                oab1.f(list, tlsVar, fidVar, vng.O(1));
                break;
            default:
                a.c(list, tlsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
