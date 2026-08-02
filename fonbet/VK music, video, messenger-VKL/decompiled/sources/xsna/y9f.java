package xsna;

import com.vk.cameraui.utils.TipsPriority;
import com.vk.content.design.view.camera.CameraUIView;
import java.util.PriorityQueue;
import xsna.j40;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class y9f implements Runnable {
    public final /* synthetic */ CameraUIView b;
    public final /* synthetic */ baf c;
    public final /* synthetic */ CameraUIView d;

    public y9f(CameraUIView cameraUIView, baf bafVar, CameraUIView cameraUIView2) {
        this.b = cameraUIView;
        this.c = bafVar;
        this.d = cameraUIView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j40.a poll;
        baf bafVar = this.c;
        j40 j40Var = bafVar.a;
        j40.a aVar = new j40.a(TipsPriority.DURATION_CHANGED.ordinal(), new aaf(this.b, bafVar, this.d));
        PriorityQueue<j40.a> priorityQueue = j40Var.b;
        priorityQueue.add(aVar);
        if (j40Var.a != null || (poll = priorityQueue.poll()) == null) {
            return;
        }
        j40Var.a = poll;
        poll.c.invoke();
    }
}
