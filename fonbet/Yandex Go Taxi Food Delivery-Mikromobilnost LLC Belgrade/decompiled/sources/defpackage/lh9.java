package defpackage;

import android.content.Context;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class lh9 extends kh9 {
    public final gmr b;
    public final Context c;
    public final pat d;

    public lh9(gmr gmrVar, Context context, pat patVar) {
        this.b = gmrVar;
        this.c = context;
        this.d = patVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [gmr] */
    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        Iterable iterable;
        List W;
        jh9 jh9Var = (jh9) obj;
        boolean l = jl40.l(jh9Var.b(), "clear");
        Context context = this.c;
        ?? r7 = this.b;
        if (!l) {
            String c = jh9Var.c();
            String a = jh9Var.a();
            this.d.getClass();
            if (a == null || evu0.J(a)) {
                iterable = EmptyList.a;
            } else {
                W = evu0.W(a, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
                iterable = new ArrayList();
                for (Object obj2 : W) {
                    if (!evu0.J((String) obj2)) {
                        iterable.add(obj2);
                    }
                }
            }
            if (c == null || evu0.J(c)) {
                Toast.makeText(context, "Tovarisch host is null or blank!", 1).show();
            } else {
                if (!iterable.isEmpty()) {
                    Iterable iterable2 = iterable;
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it = iterable2.iterator();
                        while (it.hasNext()) {
                            if (!evu0.J((String) it.next())) {
                                if (r7.a(c, iterable)) {
                                    hst hstVar = jst.e;
                                    iterable.toString();
                                    hstVar.getClass();
                                    Toast.makeText(context, "Tovarisch host saved", 1).show();
                                }
                            }
                        }
                    }
                }
                Toast.makeText(context, "Tovarisch's paths are empty or blank!", 1).show();
            }
        } else if (r7.clear()) {
            jst.e.getClass();
            Toast.makeText(context, "Tovarisch hosts cleared", 1).show();
        }
        return zy11.a;
    }
}
