package xsna;

import android.content.Context;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.TextParsedResult;
import com.vk.qrcode.QRTypes$Type;
import com.vkontakte.android.R;

/* compiled from: QRTypes.kt */
/* loaded from: classes5.dex */
public final class jme0 extends q76 {
    public final TextParsedResult c;

    public jme0(ParsedResult parsedResult) {
        super(parsedResult);
        this.c = (TextParsedResult) parsedResult;
    }

    @Override // xsna.q76
    public final <T> io.reactivex.rxjava3.core.q<T> a() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        fvr.l(context, this.c.getText());
        cvk.u(R.string.text_copied, false);
        return null;
    }

    @Override // xsna.q76
    public final String g() {
        return this.c.getText();
    }

    @Override // xsna.q76
    public final boolean i() {
        return !drm0.N(this.c.getText());
    }

    @Override // xsna.q76
    public final QRTypes$Type q() {
        return QRTypes$Type.TEXT;
    }
}
