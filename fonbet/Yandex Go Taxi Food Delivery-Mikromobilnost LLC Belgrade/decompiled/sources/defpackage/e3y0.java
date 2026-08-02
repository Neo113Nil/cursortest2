package defpackage;

import android.net.Uri;
import com.yandex.go.taxi.order.chat.domain.model.MessagePresentationModel$State;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import java.util.Date;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* loaded from: classes14.dex */
public final class e3y0 {
    public final int a;
    public final rs2 b;
    public int c = Integer.MIN_VALUE;
    public final a3y0 d = new a3y0(TaxiOrderLogGroup.ORDER_CHAT.getTag(), "TaxiOrderMessageModelMapper");

    public e3y0(int i, rs2 rs2Var) {
        this.a = i;
        this.b = rs2Var;
    }

    public final jv10 a(isa0 isa0Var, MessagePresentationModel$State messagePresentationModel$State) {
        Date date = new Date(isa0Var.b);
        zzs zzsVar = isa0Var.w;
        if (zzsVar != null) {
            gv10 gv10Var = new gv10(isa0Var.a, jv10.y, date, b(zzsVar), messagePresentationModel$State);
            gv10Var.E = isa0Var;
            return gv10Var;
        }
        String str = isa0Var.x;
        if (str == null) {
            str = "";
        }
        hv10 hv10Var = new hv10(isa0Var.a, jv10.x, date, str, messagePresentationModel$State);
        hv10Var.E = isa0Var;
        return hv10Var;
    }

    public final String b(zzs zzsVar) {
        return Uri.parse("https://static-maps.yandex.ru/v1").buildUpon().appendQueryParameter("ll", zzsVar.b + "," + zzsVar.a).appendQueryParameter("l", PolicyMappingsExtension.MAP).appendQueryParameter("size", this.c + "," + this.a).appendQueryParameter("z", "17").appendQueryParameter("apikey", this.b.g()).appendQueryParameter("lg", "0").appendQueryParameter("scale", "1.5").build().toString();
    }
}
