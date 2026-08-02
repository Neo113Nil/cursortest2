package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.debugview.b;

/* loaded from: classes11.dex */
public final /* synthetic */ class dxg implements f1k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dxg(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        switch (this.a) {
            case 0:
                b bVar = (b) this.b;
                bVar.h.remove((tls) this.c);
                return;
            case 1:
                l6o l6oVar = (l6o) this.b;
                wls wlsVar = (wls) this.c;
                synchronized (l6oVar.d) {
                    l6oVar.e.b(wlsVar);
                }
                return;
            case 2:
                tsu tsuVar = (tsu) this.b;
                tsuVar.f.b((tls) this.c);
                return;
            default:
                ((RecyclerView) this.b).removeOnScrollListener((mtx) this.c);
                return;
        }
    }
}
