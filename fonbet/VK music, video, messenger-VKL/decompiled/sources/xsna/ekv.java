package xsna;

/* compiled from: HttpRequestBodyBinary.kt */
/* loaded from: classes2.dex */
public final class ekv implements dkv {
    public final byte[] b;
    public final String c;

    public ekv(byte[] bArr, String str) {
        this.b = bArr;
        this.c = str;
    }

    @Override // xsna.dkv
    public final byte[] getContent() {
        return this.b;
    }

    @Override // xsna.dkv
    public final int getContentLength() {
        return this.b.length;
    }

    @Override // xsna.dkv
    public final String getContentType() {
        return this.c;
    }
}
