package xsna;

import com.vk.log.L;
import com.vk.voip.api.id.CallId;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class vsw implements gzs {
    public final /* synthetic */ wsw b;
    public final /* synthetic */ com.vk.voip.b c;
    public final /* synthetic */ String d;
    public final /* synthetic */ dhw0 e;
    public final /* synthetic */ CallId f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ vsw(wsw wswVar, com.vk.voip.b bVar, String str, dhw0 dhw0Var, CallId callId, boolean z) {
        this.b = wswVar;
        this.c = bVar;
        this.d = str;
        this.e = dhw0Var;
        this.f = callId;
        this.g = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        StringBuilder sb = new StringBuilder("incomingCallListeners: ");
        CopyOnWriteArraySet<tsw> copyOnWriteArraySet = this.b.b;
        L.e("IncomingCallListenerProxy", fw3.d(copyOnWriteArraySet, sb));
        Iterator<tsw> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            it.next().m(this.c, this.d, this.e, this.f, this.g);
        }
        return s3q0.a;
    }
}
