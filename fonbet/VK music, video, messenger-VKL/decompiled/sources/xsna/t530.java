package xsna;

import android.content.Context;

/* compiled from: ModerationWrapperFactoryImpl.kt */
/* loaded from: classes18.dex */
public final class t530 implements s530 {
    public final k530 a;
    public final y330 b;
    public final a530 c;

    public t530(k530 k530Var, y330 y330Var, a530 a530Var) {
        this.a = k530Var;
        this.b = y330Var;
        this.c = a530Var;
    }

    @Override // xsna.s530
    public final w530 a(Context context, boolean z) {
        return new x530(context, this.a, this.b, z, this.c);
    }

    @Override // xsna.s530
    public final q530 b(Context context, f5z f5zVar, boolean z) {
        return new v530(context, f5zVar, this.a, this.b, z, this.c);
    }
}
