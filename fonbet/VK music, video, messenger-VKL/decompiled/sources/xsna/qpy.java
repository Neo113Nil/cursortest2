package xsna;

import android.os.MessageQueue;
import java.util.HashMap;
import java.util.LinkedList;
import xsna.ppy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qpy implements MessageQueue.IdleHandler {
    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        ppy.a<Integer, ppy.b> aVar = ppy.a;
        ppy.a<Integer, ppy.b> aVar2 = ppy.a;
        Object obj = aVar2.a;
        HashMap<Integer, LinkedList<ppy.b>> hashMap = aVar2.b;
        synchronized (obj) {
            hashMap.clear();
            s3q0 s3q0Var = s3q0.a;
        }
        ppy.b.dispose();
        ppy.c = true;
        return false;
    }
}
