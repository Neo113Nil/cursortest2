package xsna;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.q7c0;

/* compiled from: PostStickerFactory.kt */
/* loaded from: classes15.dex */
public final class t7c0 {
    public static p7c0 a(Context context, u7c0 u7c0Var, izs izsVar, gzs gzsVar) {
        List<q7c0> list = u7c0Var.g.a;
        List<q7c0> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((q7c0) it.next()) instanceof q7c0.b) {
                    break;
                }
            }
        }
        if (!list.isEmpty()) {
            return new o7c0(context, u7c0Var, izsVar, gzsVar);
        }
        return u7c0Var.h != null ? new air0(bwt0.u(context), u7c0Var, gzsVar, 4) : u7c0Var.i != null ? new p8b(bwt0.u(context), u7c0Var, gzsVar, 4) : new z7c0(bwt0.u(context), u7c0Var, gzsVar, 4);
    }
}
