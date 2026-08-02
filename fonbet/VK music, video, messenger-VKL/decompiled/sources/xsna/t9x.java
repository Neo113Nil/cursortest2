package xsna;

/* compiled from: IntegerArrayAdapter.java */
/* loaded from: classes12.dex */
public final class t9x implements fk3<int[]> {
    @Override // xsna.fk3
    public final int a(int[] iArr) {
        return iArr.length;
    }

    @Override // xsna.fk3
    public final int b() {
        return 4;
    }

    @Override // xsna.fk3
    public final String getTag() {
        return "IntegerArrayPool";
    }

    @Override // xsna.fk3
    public final int[] newArray(int i) {
        return new int[i];
    }
}
