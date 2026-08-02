package xsna;

import com.vk.libvideo.api.onboarding.QueueItem$Priority;
import java.util.UUID;

/* compiled from: OnboardingQueue.kt */
/* loaded from: classes2.dex */
public interface ih80 {
    static /* synthetic */ void b(ih80 ih80Var, String str, izs izsVar, int i) {
        if ((i & 1) != 0) {
            UUID.randomUUID().toString();
        }
        QueueItem$Priority queueItem$Priority = QueueItem$Priority.LOW;
        ih80Var.a(izsVar);
    }

    void a(izs izsVar);
}
