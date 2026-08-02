package defpackage;

import com.yandex.mapkit.transport.masstransit.Route;
import java.util.function.Consumer;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes13.dex */
public final /* synthetic */ class jx6 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ jx6(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(fx6.b);
                break;
            case 1:
                Promotion promotion = (Promotion) obj;
                if (promotion == null) {
                    tlsVar.invoke(fx6.b);
                    break;
                } else {
                    tlsVar.invoke(new gx6(promotion));
                    break;
                }
            case 2:
                tlsVar.invoke((String) obj);
                break;
            default:
                tlsVar.invoke((Route) obj);
                break;
        }
    }
}
