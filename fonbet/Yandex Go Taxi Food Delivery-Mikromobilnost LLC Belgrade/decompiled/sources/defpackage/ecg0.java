package defpackage;

import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderFragment;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ecg0 implements vpr {
    public final /* synthetic */ QrReaderFragment A;
    public final /* synthetic */ float B;
    public final /* synthetic */ float C;
    public final /* synthetic */ int D;
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float w;
    public final /* synthetic */ float x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public ecg0(float f, float f2, float f3, float f4, float f5, int i, int i2, QrReaderFragment qrReaderFragment, float f6, float f7, int i3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.w = f4;
        this.x = f5;
        this.y = i;
        this.z = i2;
        this.A = qrReaderFragment;
        this.B = f6;
        this.C = f7;
        this.D = i3;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Integer num = (Integer) obj;
        zy11 zy11Var = zy11.a;
        if (num != null) {
            float f = this.a;
            float f2 = this.b;
            if (f <= f2) {
                float c = (y6i0.c(num.intValue(), f, f2) - f) / this.c;
                float f3 = this.w * c;
                float f4 = this.x;
                float f5 = 1.0f - c;
                float f6 = ((1.0f - f4) * f5) + f4;
                float f7 = ((this.z - r2) * f5) + this.y;
                QrReaderFragment qrReaderFragment = this.A;
                float f8 = -f3;
                QrReaderFragment.access$getBinding(qrReaderFragment).b.setTranslationY(f8);
                QrReaderFragment.access$getBinding(qrReaderFragment).b.setScaleX(f6);
                QrReaderFragment.access$getBinding(qrReaderFragment).b.setScaleY(f6);
                QrReaderFragment.access$getBinding(qrReaderFragment).e.setTranslationY(f8);
                QrReaderFragment.access$getBinding(qrReaderFragment).j.setTranslationY(f8 - (((1.0f - f6) * this.B) / 2.0f));
                QrReaderFragment.access$getBinding(qrReaderFragment).j.setAlpha(f5);
                QrReaderFragment.access$getBinding(qrReaderFragment).c.setTranslationY(-(c * this.C));
                float f9 = f5 * this.D;
                QrReaderFragment.access$getBinding(qrReaderFragment).n.setTranslationY(f9);
                QrReaderFragment.access$getBinding(qrReaderFragment).m.setTextSize(0, f7);
                QrReaderFragment.access$getBinding(qrReaderFragment).l.setTranslationY(f9);
                return zy11Var;
            }
        }
        return zy11Var;
    }
}
