package xsna;

import com.ironsource.X3;

/* compiled from: DMatch.java */
/* loaded from: classes8.dex */
public final class yrk {
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public float d = Float.MAX_VALUE;

    public final String toString() {
        StringBuilder sb = new StringBuilder("DMatch [queryIdx=");
        sb.append(this.a);
        sb.append(", trainIdx=");
        sb.append(this.b);
        sb.append(", imgIdx=");
        sb.append(this.c);
        sb.append(", distance=");
        return shy.c(this.d, X3.j.e, sb);
    }
}
