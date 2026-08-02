package xsna;

import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.wi8;

/* compiled from: BroadcastSettingsFeature.kt */
/* loaded from: classes3.dex */
public final class ej8 extends dm50<oj8, wi8, fj8> {
    @Override // xsna.dm50
    public final fj8 c(fj8 fj8Var, wi8 wi8Var) {
        Pair pair;
        fj8 fj8Var2 = fj8Var;
        wi8 wi8Var2 = wi8Var;
        if (wi8Var2 instanceof wi8.a) {
            return fj8.a(fj8Var2, null, null, null, null, null, false, true, 63);
        }
        if (wi8Var2 instanceof wi8.d) {
            return fj8.a(fj8Var2, null, null, null, null, null, true, false, 63);
        }
        if (wi8Var2 instanceof wi8.b) {
            return fj8.a(fj8Var2, null, null, null, null, ((wi8.b) wi8Var2).b, false, false, 63);
        }
        if (wi8Var2 instanceof wi8.e) {
            return fj8.a(fj8Var2, ((wi8.e) wi8Var2).b, BroadcastStream.New.b, null, null, null, false, false, 179);
        }
        if (wi8Var2 instanceof wi8.f) {
            return fj8.a(fj8Var2, null, ((wi8.f) wi8Var2).b, null, null, null, false, false, 183);
        }
        if (!(wi8Var2 instanceof wi8.c)) {
            throw new NoWhenBranchMatchedException();
        }
        wi8.c cVar = (wi8.c) wi8Var2;
        BroadcastAuthor broadcastAuthor = fj8Var2.d;
        BroadcastStream broadcastStream = fj8Var2.e;
        BroadcastAuthor broadcastAuthor2 = cVar.d;
        HashMap hashMap = cVar.c;
        ArrayList arrayList = cVar.b;
        BroadcastStream broadcastStream2 = cVar.e;
        if (epx.f(broadcastAuthor, broadcastAuthor2) && epx.f(broadcastStream, broadcastStream2)) {
            pair = new Pair(broadcastAuthor2, broadcastStream2);
        } else if (j5g.P(arrayList, broadcastAuthor)) {
            List list = (List) hashMap.get(broadcastAuthor);
            if (list == null) {
                throw new IllegalStateException("Stream data must exists for all authors");
            }
            pair = !j5g.P(list, broadcastStream) ? new Pair(broadcastAuthor2, broadcastStream2) : new Pair(broadcastAuthor, broadcastStream);
        } else {
            pair = new Pair(broadcastAuthor2, broadcastStream2);
        }
        return fj8.a(fj8Var2, (BroadcastAuthor) pair.d(), (BroadcastStream) pair.g(), arrayList, hashMap, null, false, false, 3);
    }

    @Override // xsna.dm50
    public final oj8 d() {
        return new oj8(e(new tb4(3)), e(new qt0(8)), e(new sa(this, 14)));
    }

    @Override // xsna.dm50
    public final void h(fj8 fj8Var, oj8 oj8Var) {
        fj8 fj8Var2 = fj8Var;
        oj8 oj8Var2 = oj8Var;
        if (fj8Var2.h != null) {
            f(oj8Var2.b, fj8Var2);
        } else if (fj8Var2.j) {
            f(oj8Var2.a, fj8Var2);
        } else {
            f(oj8Var2.c, fj8Var2);
        }
    }
}
