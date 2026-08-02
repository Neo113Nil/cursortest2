package xsna;

import androidx.media3.datasource.g;
import java.io.File;

/* compiled from: VideoDiskCacheConfig.kt */
/* loaded from: classes8.dex */
public final class bhs0 {
    public final File a;
    public final long b;
    public final g.a c;
    public final dhs0 d;

    /* compiled from: VideoDiskCacheConfig.kt */
    public static final class a {
        public static bhs0 a(File file, long j, dhs0 dhs0Var, g.a aVar) {
            return new bhs0(file, j, aVar, dhs0Var, new egi());
        }
    }

    public bhs0(File file, long j, g.a aVar, dhs0 dhs0Var, egi egiVar) {
        this.a = file;
        this.b = j;
        this.c = aVar;
        this.d = dhs0Var;
    }
}
