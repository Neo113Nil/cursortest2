package xsna;

import androidx.annotation.Nullable;

/* compiled from: Track.java */
/* loaded from: classes12.dex */
public final class vep0 {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final androidx.media3.common.a g;
    public final int h;

    @Nullable
    public final long[] i;

    @Nullable
    public final long[] j;
    public final int k;

    @Nullable
    public final lfp0[] l;

    public vep0(int i, int i2, long j, long j2, long j3, long j4, androidx.media3.common.a aVar, int i3, @Nullable lfp0[] lfp0VarArr, int i4, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = aVar;
        this.h = i3;
        this.l = lfp0VarArr;
        this.k = i4;
        this.i = jArr;
        this.j = jArr2;
    }

    public final vep0 a(androidx.media3.common.a aVar) {
        return new vep0(this.a, this.b, this.c, this.d, this.e, this.f, aVar, this.h, this.l, this.k, this.i, this.j);
    }
}
