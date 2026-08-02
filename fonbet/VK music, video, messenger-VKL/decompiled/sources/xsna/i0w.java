package xsna;

import android.content.Context;
import io.requery.android.database.SlowQueryLogger;

/* compiled from: ImDbInstanceFactoryImpl.kt */
/* loaded from: classes.dex */
public final class i0w implements h0w {
    public final Context a;
    public final boolean b;
    public final boolean c;
    public final SlowQueryLogger d;
    public final n2w e;

    public i0w(Context context, boolean z, boolean z2, g0w g0wVar, n2w n2wVar) {
        this.a = context;
        this.b = z;
        this.c = z2;
        this.d = g0wVar;
        this.e = n2wVar;
    }

    @Override // xsna.h0w
    public final f0w a(String str, d2l d2lVar, b2l b2lVar) {
        return new f0w(this.a, str, d2lVar, b2lVar, this.b, this.c, this.d, this.e);
    }
}
