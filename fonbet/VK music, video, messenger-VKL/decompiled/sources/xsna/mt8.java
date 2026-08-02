package xsna;

/* compiled from: ByteArrayAdapter.java */
/* loaded from: classes12.dex */
public final class mt8 implements fk3<byte[]> {
    @Override // xsna.fk3
    public final int a(byte[] bArr) {
        return bArr.length;
    }

    @Override // xsna.fk3
    public final int b() {
        return 1;
    }

    @Override // xsna.fk3
    public final String getTag() {
        return "ByteArrayPool";
    }

    @Override // xsna.fk3
    public final byte[] newArray(int i) {
        return new byte[i];
    }
}
