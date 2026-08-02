package xsna;

import android.os.MessageQueue;
import com.vk.metrics.performance.appstart.IdleStateHandler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class vvv implements MessageQueue.IdleHandler {
    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        CopyOnWriteArrayList<IdleStateHandler.AppStartListener> copyOnWriteArrayList = IdleStateHandler.b;
        if (IdleStateHandler.c) {
            Iterator<IdleStateHandler.AppStartListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().a(IdleStateHandler.AppStartListener.StartType.COLD);
            }
            IdleStateHandler.c = false;
        }
        if (IdleStateHandler.d) {
            Iterator<IdleStateHandler.AppStartListener> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().a(IdleStateHandler.AppStartListener.StartType.WARM);
            }
            IdleStateHandler.d = false;
        }
        copyOnWriteArrayList.clear();
        return false;
    }
}
