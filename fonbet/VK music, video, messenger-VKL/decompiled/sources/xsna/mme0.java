package xsna;

import android.content.Context;
import android.content.Intent;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.WifiParsedResult;
import com.vk.qrcode.QRTypes$Type;
import java.util.regex.Pattern;
import xsna.h660;

/* compiled from: QRTypes.kt */
/* loaded from: classes5.dex */
public final class mme0 extends q76 {
    public final Context c;
    public final WifiParsedResult d;
    public final String e;
    public final String f;
    public final boolean g;

    public mme0(Context context, ParsedResult parsedResult) {
        super(parsedResult);
        this.c = context;
        WifiParsedResult wifiParsedResult = (WifiParsedResult) parsedResult;
        this.d = wifiParsedResult;
        this.e = wifiParsedResult.getSsid();
        this.f = wifiParsedResult.getPassword();
        this.g = gz80.a(29);
    }

    @Override // xsna.q76
    public final <T> io.reactivex.rxjava3.core.q<T> a() {
        if (!this.g) {
            WifiParsedResult wifiParsedResult = this.d;
            h660.d dVar = new h660.d(wifiParsedResult.getSsid(), wifiParsedResult.getNetworkEncryption(), wifiParsedResult.getPassword(), wifiParsedResult.isHidden());
            Pattern pattern = h660.a;
            asu0.a.getClass();
            asu0.h().execute(new gc3(4, this.c, dVar));
            return null;
        }
        Intent intent = new Intent("android.net.wifi.PICK_WIFI_NETWORK");
        intent.addFlags(268435456);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        context.startActivity(intent);
        return null;
    }

    @Override // xsna.q76
    public final String g() {
        return this.e;
    }

    @Override // xsna.q76
    public final boolean i() {
        return true;
    }

    @Override // xsna.q76
    public final QRTypes$Type q() {
        return QRTypes$Type.WIFI;
    }
}
