package defpackage;

import android.content.Context;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.sd1;
import yads.vd1;

/* loaded from: classes7.dex */
public final class cf81 {
    public final Context a;
    public final a081 b;
    public final uh61 c;
    public final im71 d;
    public final q881 e;

    public cf81(Context context) {
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        uh61 uh61Var = new uh61(context);
        im71 b = gea1.b();
        q881 q881Var = new q881(context);
        this.a = context;
        this.b = a081Var2;
        this.c = uh61Var;
        this.d = b;
        this.e = q881Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        if (r0 == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        if (r11.a(r1) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0092, code lost:
    
        if (r11 != r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0061, code lost:
    
        if (r11 == r2) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        sd1 sd1Var;
        Object obj;
        int i;
        String str;
        Object s;
        Object obj2 = zy11.a;
        if (continuationImpl instanceof sd1) {
            sd1Var = (sd1) continuationImpl;
            int i2 = sd1Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sd1Var.d = i2 - Integer.MIN_VALUE;
                obj = sd1Var.b;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sd1Var.d;
                Object obj4 = null;
                if (i != 0) {
                    b.b(obj);
                    im71 im71Var = this.d;
                    sd1Var.d = 1;
                    fyc fycVar = im71Var.a;
                    if (fycVar == null || (r11 = fycVar.s(sd1Var)) != obj3) {
                        Object obj5 = obj2;
                    }
                } else if (i == 1) {
                    b.b(obj);
                } else if (i == 2) {
                    b.b(obj);
                    String str2 = (String) obj;
                    if (str2 != null) {
                        return str2;
                    }
                    q881 q881Var = this.e;
                    sd1Var.d = 3;
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                b.b(obj);
                                return obj;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        sd1Var.d = 5;
                        gg81 a = this.b.a(this.a);
                        String str3 = a != null ? a.y : null;
                        if (str3 != null && str3.length() != 0) {
                            uh61 uh61Var = this.c;
                            uh61Var.getClass();
                            sjh sjhVar = uyj.a;
                            obj4 = tje.k0(mdh.b, new vd1(uh61Var, null), sd1Var);
                        }
                        return obj4 == obj3 ? obj3 : obj4;
                    }
                    b.b(obj);
                    im71 im71Var2 = this.d;
                    sd1Var.d = 4;
                    fyc fycVar2 = im71Var2.a;
                    if (fycVar2 != null && (s = fycVar2.s(sd1Var)) == obj3) {
                        obj2 = s;
                    }
                }
                sd1Var.d = 2;
                gg81 a2 = this.b.a(this.a);
                str = a2 == null ? a2.y : null;
                if (str != null || str.length() == 0) {
                    obj = null;
                } else {
                    uh61 uh61Var2 = this.c;
                    uh61Var2.getClass();
                    sjh sjhVar2 = uyj.a;
                    obj = tje.k0(mdh.b, new vd1(uh61Var2, null), sd1Var);
                }
            }
        }
        sd1Var = new sd1(this, continuationImpl);
        obj = sd1Var.b;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sd1Var.d;
        Object obj42 = null;
        if (i != 0) {
        }
        sd1Var.d = 2;
        gg81 a22 = this.b.a(this.a);
        if (a22 == null) {
        }
        if (str != null) {
        }
        obj = null;
    }
}
