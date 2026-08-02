package xsna;

import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.TelParsedResult;
import com.vk.qrcode.QRTypes$Type;

/* compiled from: QRTypes.kt */
/* loaded from: classes5.dex */
public final class ime0 extends q76 {
    public final TelParsedResult c;

    public ime0(ParsedResult parsedResult) {
        super(parsedResult);
        this.c = (TelParsedResult) parsedResult;
    }

    @Override // xsna.q76
    public final <T> io.reactivex.rxjava3.core.q<T> a() {
        return null;
    }

    @Override // xsna.q76
    public final boolean i() {
        return true;
    }

    @Override // xsna.q76
    public final QRTypes$Type q() {
        return QRTypes$Type.TEL;
    }
}
