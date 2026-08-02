package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.network.eventhub.impl.EventHubServiceClient;
import com.vk.network.eventhub.impl.a;
import com.vk.network.eventhub.impl.backoff.BackoffType;
import com.vk.network.eventhub.impl.exception.FloodControlException;
import com.vk.network.eventhub.impl.exception.HandshakeException;
import com.vk.network.eventhub.impl.exception.InvalidTokenException;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;

/* compiled from: SelfRecoveringConnectionCallback.kt */
/* loaded from: classes3.dex */
public final class nfi0 implements com.vk.network.eventhub.impl.a {
    public final Queue<Result<Runnable>> a;
    public final laq b;
    public final laq c;
    public final BackoffType d;
    public final gzs<s3q0> e;
    public final EventHubServiceClient.b f;
    public final EventHubServiceClient.c g;
    public final dof h;
    public final boolean i;

    /* compiled from: SelfRecoveringConnectionCallback.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BackoffType.values().length];
            try {
                iArr[BackoffType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BackoffType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BackoffType.FLOOD_CONTROL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public nfi0(LinkedTransferQueue linkedTransferQueue, laq laqVar, laq laqVar2, BackoffType backoffType, gzs gzsVar, EventHubServiceClient.b bVar, EventHubServiceClient.c cVar, dof dofVar, boolean z) {
        this.a = linkedTransferQueue;
        this.b = laqVar;
        this.c = laqVar2;
        this.d = backoffType;
        this.e = gzsVar;
        this.f = bVar;
        this.g = cVar;
        this.h = dofVar;
        this.i = z;
    }

    @Override // com.vk.network.eventhub.impl.a
    public final void N0() {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"EventHubServiceClient: closed"});
        }
        this.e.invoke();
        this.a.add(new Result<>(new Result.Failure(EventHubServiceClient.t)));
    }

    @Override // com.vk.network.eventhub.impl.a
    public final void O0() {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"EventHubServiceClient: connected"});
    }

    @Override // com.vk.network.eventhub.impl.a
    public final a.c P0(Throwable th) {
        a.c cVar;
        if (th != null) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.w, new Object[]{"EventHubServiceClient", ": interrupted " + th.getClass().getName() + ": " + th.getMessage()});
            }
        } else {
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.d, new Object[]{"EventHubServiceClient: interrupted"});
            }
        }
        if (th instanceof IOException) {
            cVar = new a.f(th);
        } else if (th instanceof HandshakeException) {
            com.vk.metrics.eventtracking.b.a.a(th);
            cVar = new a.f(th);
        } else if (th instanceof InvalidTokenException) {
            com.vk.metrics.eventtracking.b.a.a(th);
            boolean z = this.i;
            EventHubServiceClient.b bVar = this.f;
            if (z) {
                this.h.invoke();
                try {
                    bVar.invoke();
                    cVar = a.e.a;
                } catch (Throwable th2) {
                    com.vk.metrics.eventtracking.b.a.a(th2);
                    cVar = new a.d(th);
                }
            } else {
                bVar.invoke();
                cVar = new a.d(th);
            }
        } else if (th instanceof FloodControlException) {
            cVar = new a.C1362a(th);
        } else {
            if (th != null) {
                com.vk.metrics.eventtracking.b.a.a(th);
            }
            cVar = a.e.a;
        }
        boolean z2 = cVar instanceof a.C1362a;
        EventHubServiceClient.c cVar2 = this.g;
        if (z2) {
            this.c.b();
            cVar2.invoke(BackoffType.FLOOD_CONTROL);
        } else {
            this.b.b();
            cVar2.invoke(BackoffType.DEFAULT);
        }
        return cVar;
    }

    @Override // com.vk.network.eventhub.impl.a
    public final void Q0() {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"EventHubServiceClient: connecting... "});
        }
        int i = a.$EnumSwitchMapping$0[this.d.ordinal()];
        laq laqVar = this.c;
        laq laqVar2 = this.b;
        if (i == 1) {
            laqVar.c();
            laqVar2.c();
            laqVar = null;
        } else if (i == 2) {
            laqVar.c();
            laqVar = laqVar2;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            laqVar2.c();
        }
        if (laqVar != null) {
            laqVar.e();
        }
    }

    @Override // com.vk.network.eventhub.impl.a
    public final void R0() {
        this.b.c();
        this.c.c();
    }
}
