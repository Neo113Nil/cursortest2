package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.reporters.CancelReason;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: MsgSendReporter.kt */
/* loaded from: classes2.dex */
public interface ry30 {
    void a(long j, List<? extends Attach> list);

    void b(long j);

    void c(Collection<? extends Msg> collection);

    void d(xy30 xy30Var);

    void e(Collection<? extends Msg> collection);

    void f(int i, long j);

    void g(ArrayList arrayList);

    void h(int i, long j);

    void i(Collection<? extends Msg> collection, CancelReason cancelReason);

    void j(long j, int i, ArrayList arrayList);

    void k(int i, long j, Throwable th);
}
