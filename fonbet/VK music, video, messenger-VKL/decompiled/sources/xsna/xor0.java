package xsna;

/* compiled from: Ruler.kt */
/* loaded from: classes11.dex */
public final class xor0 extends qrg0 {
    @Override // xsna.qrg0
    public final float a(float f, tny tnyVar, tny tnyVar2) {
        float a = ((int) (tnyVar.a() & 4294967295L)) / 2.0f;
        return Float.intBitsToFloat((int) (tnyVar2.w(tnyVar, (Float.floatToRawIntBits(a) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
    }
}
