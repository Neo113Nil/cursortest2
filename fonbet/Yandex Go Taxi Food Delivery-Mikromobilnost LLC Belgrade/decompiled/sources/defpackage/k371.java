package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.db0;
import yads.gm2;

/* loaded from: classes7.dex */
public final class k371 {
    public final st81 a;
    public final vw81 b;
    public final xb81 c;

    public k371(fe81 fe81Var, v981 v981Var, d881 d881Var, vmn0 vmn0Var, st81 st81Var, hn71 hn71Var, vw81 vw81Var) {
        xb81 xb81Var = new xb81(fe81Var, v981Var, d881Var, hn71Var, vmn0Var);
        this.a = st81Var;
        this.b = vw81Var;
        this.c = xb81Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, wr81 wr81Var, ContinuationImpl continuationImpl) {
        db0 db0Var;
        int i;
        ms71 ms71Var;
        xz4 xz4Var;
        if (continuationImpl instanceof db0) {
            db0Var = (db0) continuationImpl;
            int i2 = db0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                db0Var.e = i2 - Integer.MIN_VALUE;
                Object obj = db0Var.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = db0Var.e;
                int i3 = 1;
                xz4 xz4Var2 = null;
                if (i != 0) {
                    b.b(obj);
                    List list = wr81Var.d;
                    db0Var.b = wr81Var;
                    db0Var.e = 1;
                    obj = this.c.a(context, list, db0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wr81Var = db0Var.b;
                    b.b(obj);
                }
                ms71Var = (ms71) obj;
                if (ms71Var == null) {
                    st81 st81Var = this.a;
                    d391 d391Var = st81Var.a;
                    d391Var.a.post(new c391(d391Var, i3));
                    ((hlx0) st81Var.b.z).n();
                } else {
                    String str = wr81Var.b;
                    List list2 = wr81Var.c;
                    if (list2 == null) {
                        list2 = EmptyList.a;
                    }
                    Map f = kotlin.collections.b.f();
                    vw81 vw81Var = this.b;
                    vw81Var.getClass();
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        gr81 gr81Var = vw81Var.a;
                        String a = ((jj71) gr81Var.c).a(str, kotlin.collections.b.f());
                        xz4Var = a.length() > 0 ? ((vmn0) gr81Var.b).a(a) : new r481(gm2.e);
                    } else {
                        xz4Var = null;
                    }
                    vw81Var.b.l(list2, un61.b(null, xz4Var), f);
                    xz4Var2 = xz4Var;
                }
                return new bk61(ms71Var, xz4Var2);
            }
        }
        db0Var = new db0(this, continuationImpl);
        Object obj2 = db0Var.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = db0Var.e;
        int i32 = 1;
        xz4 xz4Var22 = null;
        if (i != 0) {
        }
        ms71Var = (ms71) obj2;
        if (ms71Var == null) {
        }
        return new bk61(ms71Var, xz4Var22);
    }
}
