package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.identity.e;
import com.google.android.gms.wallet.internal.a;

/* loaded from: classes.dex */
public final class b091 extends jm2 {
    public final /* synthetic */ int a;

    public /* synthetic */ b091(int i) {
        this.a = i;
    }

    @Override // defpackage.jm2
    public om2 b(Context context, Looper looper, y2c y2cVar, Object obj, t4e t4eVar, yx60 yx60Var) {
        switch (this.a) {
            case 0:
                return new f091(context, looper, y2cVar, (qdy0) obj, t4eVar, yx60Var);
            case 1:
            default:
                return super.b(context, looper, y2cVar, obj, t4eVar, yx60Var);
            case 2:
                return new e(context, looper, y2cVar, t4eVar, yx60Var);
            case 3:
                return new xg91(context, looper, 300, y2cVar, t4eVar, yx60Var);
        }
    }

    @Override // defpackage.jm2
    public om2 c(Context context, Looper looper, y2c y2cVar, Object obj, wst wstVar, xst xstVar) {
        switch (this.a) {
            case 1:
                w741 w741Var = (w741) obj;
                if (w741Var == null) {
                    w741Var = new w741(new v741());
                }
                return new a(context, looper, y2cVar, wstVar, xstVar, w741Var.a, w741Var.b);
            default:
                return super.c(context, looper, y2cVar, obj, wstVar, xstVar);
        }
    }
}
