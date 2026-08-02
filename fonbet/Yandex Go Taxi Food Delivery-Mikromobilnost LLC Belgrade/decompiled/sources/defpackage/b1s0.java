package defpackage;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.j;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes.dex */
public final /* synthetic */ class b1s0 implements f1k {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b1s0(j jVar, View view) {
        this.a = 1;
        this.c = jVar;
        this.b = view;
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        int i = this.a;
        Object obj = this.c;
        View view = this.b;
        switch (i) {
            case 0:
                view.removeOnLayoutChangeListener((lp2) obj);
                break;
            case 1:
                j jVar = (j) obj;
                Set set = (Set) jVar.c.remove(view);
                Iterator it = (set != null ? set : EmptySet.a).iterator();
                while (it.hasNext()) {
                    jVar.a((f9l) it.next());
                }
                break;
            default:
                ((Div2View) view).removePersistentDivDataObserver$div_release((xe11) obj);
                break;
        }
    }

    public /* synthetic */ b1s0(Object obj, int i, View view) {
        this.a = i;
        this.b = view;
        this.c = obj;
    }
}
