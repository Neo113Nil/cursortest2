package xsna;

import android.graphics.Point;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Iterator;
import ru.ok.android.webrtc.animoji.render.AnimojiRenderDispatch;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class as2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ as2(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                AnimojiRenderDispatch.a((AnimojiRenderDispatch) this.c, (HashMap) this.d, (Point) this.e);
                break;
            default:
                hra0 hra0Var = (hra0) this.c;
                RecyclerView.e0 e0Var = (RecyclerView.e0) this.d;
                Iterator it = hra0Var.b.iterator();
                while (it.hasNext()) {
                    ((yjf0) it.next()).d(e0Var, this.e);
                }
                break;
        }
    }
}
