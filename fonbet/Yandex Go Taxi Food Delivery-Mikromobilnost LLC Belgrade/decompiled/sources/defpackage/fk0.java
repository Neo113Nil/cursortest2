package defpackage;

import com.yandex.div.core.expression.variables.a;
import com.yandex.go.places.models.data.entities.network.actions.AddVideoInQueueAction;
import java.util.concurrent.ConcurrentLinkedDeque;

/* loaded from: classes13.dex */
public final class fk0 implements dw {
    public final a a;
    public final ConcurrentLinkedDeque b = new ConcurrentLinkedDeque();
    public String c;

    public fk0(a aVar) {
        this.a = aVar;
    }

    public final void a(String str) {
        if (this.c != null) {
            return;
        }
        String str2 = (String) kotlin.collections.a.Q(this.b);
        this.c = str2;
        if (str2 == null) {
            str2 = "";
        }
        this.a.i(new z131(str, str2));
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        AddVideoInQueueAction addVideoInQueueAction = (AddVideoInQueueAction) krVar;
        AddVideoInQueueAction.Operation operation = addVideoInQueueAction.c;
        String str = addVideoInQueueAction.b;
        String str2 = addVideoInQueueAction.a;
        int i = ek0.a[operation.ordinal()];
        ConcurrentLinkedDeque concurrentLinkedDeque = this.b;
        if (i == 1) {
            concurrentLinkedDeque.remove(str);
            concurrentLinkedDeque.add(str);
            a(str2);
        } else {
            if (i == 2) {
                concurrentLinkedDeque.remove(str);
                if (jl40.l(this.c, str)) {
                    this.c = null;
                }
                a(str2);
                return;
            }
            if (i != 3) {
                w511.b();
                return;
            }
            concurrentLinkedDeque.remove(str);
            concurrentLinkedDeque.add(str);
            if (jl40.l(this.c, str)) {
                this.c = null;
            }
            a(str2);
        }
    }
}
