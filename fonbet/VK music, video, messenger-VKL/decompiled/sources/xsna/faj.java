package xsna;

import com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView;
import com.vk.dto.common.AppState;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.libvideo.storage.CachedVideoPosition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class faj implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ faj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((kaj) this.c).a(AppState.FOREGROUND);
                return s3q0.a;
            case 1:
                return new HorizontalPagerView.c(((dg50) this.c).c, (b2a) obj);
            case 2:
                t260 t260Var = (t260) this.c;
                if (((NetworkClient.ClientType) obj) == NetworkClient.ClientType.CLIENT_API) {
                    w6l w6lVar = t260Var.e;
                    if (w6lVar.d.invoke().booleanValue()) {
                        return new b4y0(w6lVar.e.getValue(), w6lVar.f.getValue(), w6lVar.g);
                    }
                }
                return null;
            default:
                t5t0 t5t0Var = (t5t0) this.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (((CachedVideoPosition) obj2).getTimestamp() > t5t0.f) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    CachedVideoPosition cachedVideoPosition = (CachedVideoPosition) it.next();
                    t5t0Var.c.putIfAbsent(cachedVideoPosition.zb(), new Pair<>(Long.valueOf(cachedVideoPosition.Ab()), Long.valueOf(cachedVideoPosition.getTimestamp())));
                }
                t5t0Var.d.onNext(Boolean.TRUE);
                return s3q0.a;
        }
    }
}
