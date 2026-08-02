package defpackage;

/* loaded from: classes10.dex */
public final class e67 implements m43 {
    @Override // defpackage.m43
    public final int a(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // defpackage.m43
    public final int b() {
        return 1;
    }

    @Override // defpackage.m43
    public final String getTag() {
        return "ByteArrayPool";
    }

    @Override // defpackage.m43
    public final Object newArray(int i) {
        return new byte[i];
    }
}
