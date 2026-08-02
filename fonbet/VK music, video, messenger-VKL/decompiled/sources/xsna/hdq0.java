package xsna;

import com.mbridge.msdk.config.component.load.downloader.database.c;
import java.util.concurrent.CountDownLatch;
import xsna.uon0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class hdq0 implements uon0.a, c.a {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hdq0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c.a
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        ((com.mbridge.msdk.config.component.load.downloader.core.g) this.b).a((CountDownLatch) this.c, bVar);
    }

    @Override // xsna.uon0.a
    public Object execute() {
        qdq0 qdq0Var = (qdq0) this.b;
        return qdq0Var.c.l((eo5) this.c);
    }
}
