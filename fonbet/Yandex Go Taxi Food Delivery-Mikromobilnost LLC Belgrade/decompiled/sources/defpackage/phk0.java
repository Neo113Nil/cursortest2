package defpackage;

import android.graphics.Canvas;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes11.dex */
public final class phk0 extends pa90 {
    public final long y;
    public final /* synthetic */ UiStateDrawableWrapper z;

    public phk0(UiStateDrawableWrapper uiStateDrawableWrapper) {
        this.z = uiStateDrawableWrapper;
        int intrinsicWidth = uiStateDrawableWrapper.getIntrinsicWidth();
        float f = intrinsicWidth >= 0 ? intrinsicWidth : Float.NaN;
        int intrinsicHeight = uiStateDrawableWrapper.getIntrinsicHeight();
        float f2 = intrinsicHeight >= 0 ? intrinsicHeight : Float.NaN;
        this.y = (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f) << 32);
    }

    @Override // defpackage.pa90
    public final long i() {
        return this.y;
    }

    @Override // defpackage.pa90
    public final void j(qam qamVar) {
        i28 q = qamVar.N().q();
        int b = m810.b(Float.intBitsToFloat((int) (qamVar.c() >> 32)));
        int b2 = m810.b(Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        UiStateDrawableWrapper uiStateDrawableWrapper = this.z;
        uiStateDrawableWrapper.setBounds(0, 0, b, b2);
        Canvas canvas = t72.a;
        uiStateDrawableWrapper.draw(((s72) q).a);
    }
}
