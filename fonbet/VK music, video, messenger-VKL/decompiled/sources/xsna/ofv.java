package xsna;

/* compiled from: Ruler.kt */
/* loaded from: classes11.dex */
public final class ofv extends qrg0 {
    @Override // xsna.qrg0
    public final float a(float f, tny tnyVar, tny tnyVar2) {
        return Float.intBitsToFloat((int) (tnyVar2.w(tnyVar, (Float.floatToRawIntBits(((int) (tnyVar.a() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)) & 4294967295L));
    }
}
