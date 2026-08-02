package defpackage;

import androidx.camera.camera2.internal.a;
import androidx.camera.camera2.internal.l;
import androidx.concurrent.futures.b;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes10.dex */
public final /* synthetic */ class mm7 implements el7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ mm7(l lVar, int i) {
        this.a = i;
        this.b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.el7
    public Object j(b bVar) {
        int i = this.a;
        Object[] objArr = 0;
        l lVar = this.b;
        switch (i) {
            case 1:
                d6z.y("Camera can only be released once, so release completer should be null on creation.", lVar.I == null);
                lVar.I = bVar;
                return "Release[camera=" + lVar + "]";
            case 2:
                try {
                    lVar.c.execute(new nm7(objArr == true ? 1 : 0, lVar, bVar));
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    bVar.d(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
            default:
                lVar.c.execute(new a(2, lVar, bVar));
                return "Release[request=" + lVar.G.getAndIncrement() + "]";
        }
    }
}
