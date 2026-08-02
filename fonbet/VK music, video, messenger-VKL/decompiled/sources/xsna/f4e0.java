package xsna;

/* compiled from: Projection.java */
/* loaded from: classes12.dex */
public final class f4e0 {
    public final a a;
    public final a b;
    public final int c;
    public final boolean d;

    /* compiled from: Projection.java */
    public static final class a {
        public final b[] a;

        public a(b... bVarArr) {
            this.a = bVarArr;
        }
    }

    /* compiled from: Projection.java */
    public static final class b {
        public final int a;
        public final int b;
        public final float[] c;
        public final float[] d;

        public b(int i, int i2, float[] fArr, float[] fArr2) {
            this.a = i;
            fxc0.p(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.c = fArr;
            this.d = fArr2;
            this.b = i2;
        }
    }

    public f4e0(a aVar, a aVar2, int i) {
        this.a = aVar;
        this.b = aVar2;
        this.c = i;
        this.d = aVar == aVar2;
    }
}
