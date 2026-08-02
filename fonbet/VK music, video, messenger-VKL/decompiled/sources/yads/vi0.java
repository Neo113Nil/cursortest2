package yads;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import xsna.dbg0;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class vi0 extends Lambda implements gzs {
    public final /* synthetic */ wi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi0(wi0 wi0Var) {
        super(0);
        this.b = wi0Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Typeface typeface;
        Typeface typeface2;
        Typeface typeface3;
        Typeface typeface4;
        Context context = this.b.a;
        qu2 a = gx2.a().a(context);
        String str = a != null ? a.Y : null;
        if (str == null) {
            return null;
        }
        try {
            ax0 valueOf = ax0.valueOf(str);
            if (bx0.a[valueOf.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                typeface = dbg0.a(valueOf.b, context);
            } catch (Throwable unused) {
                typeface = null;
            }
            try {
                typeface2 = dbg0.a(valueOf.c, context);
            } catch (Throwable unused2) {
                typeface2 = null;
            }
            try {
                typeface3 = dbg0.a(valueOf.d, context);
            } catch (Throwable unused3) {
                typeface3 = null;
            }
            try {
                typeface4 = dbg0.a(valueOf.e, context);
            } catch (Throwable unused4) {
                typeface4 = null;
            }
            return new zw0(typeface, typeface2, typeface3, typeface4);
        } catch (Throwable unused5) {
            return null;
        }
    }
}
