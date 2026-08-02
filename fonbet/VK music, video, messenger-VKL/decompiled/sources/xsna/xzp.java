package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.network.eventhub.api.ConnectionState;
import com.vk.network.eventhub.api.Message;
import com.vk.network.eventhub.impl.EventHubServiceClient;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.osx0;
import xsna.woi0;

/* compiled from: EventHubServiceRegistryImpl.kt */
/* loaded from: classes3.dex */
public final class xzp implements wzp {
    public final qzp a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final CopyOnWriteArraySet<xoi0> c = new CopyOnWriteArraySet<>();
    public final a d = new a();
    public boolean e;

    /* compiled from: EventHubServiceRegistryImpl.kt */
    public static final class a implements osx0.a {
        public boolean a;
        public boolean b;

        /* compiled from: EventHubServiceRegistryImpl.kt */
        /* renamed from: xsna.xzp$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C4062a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ConnectionState.values().length];
                try {
                    iArr[ConnectionState.CONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ConnectionState.DISCONNECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ConnectionState.CONNECTING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a() {
        }

        @Override // xsna.osx0.a
        public final void a(ConnectionState connectionState) {
            int i = C4062a.$EnumSwitchMapping$0[connectionState.ordinal()];
            xzp xzpVar = xzp.this;
            if (i == 1) {
                if (this.b) {
                    this.b = false;
                    xzpVar.d(woi0.b.a);
                }
                this.a = true;
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (this.a) {
                    this.b = true;
                    xzpVar.d(woi0.a.a);
                }
                this.a = false;
            }
        }
    }

    public xzp(qzp qzpVar) {
        this.a = qzpVar;
        if (qzpVar instanceof EventHubServiceClient) {
            ((EventHubServiceClient) qzpVar).c = this;
        }
    }

    @Override // xsna.wzp
    public final synchronized void a() {
        this.b.remove(new yni0((byte) 1));
        this.a.d();
        if (this.b.isEmpty()) {
            if (this.e) {
                this.e = false;
                this.a.a(this.d);
            }
            this.a.g();
        }
    }

    @Override // xsna.wzp
    public final synchronized void b(ozp ozpVar) {
        boolean isEmpty = this.b.isEmpty();
        this.b.put(new yni0(ozpVar.a()), ozpVar);
        this.a.j(ozpVar);
        if (isEmpty) {
            if (!this.e) {
                this.e = true;
                this.a.h(this.d);
            }
            this.a.c(new sv0(15));
        }
    }

    @Override // xsna.wzp
    public final void c(xoi0 xoi0Var) {
        this.c.add(xoi0Var);
    }

    public final void d(woi0 woi0Var) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"EventHubServiceRegistry", "Broadcasting connection event: " + woi0Var});
        }
        Iterator<xoi0> it = this.c.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(woi0Var);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable unused) {
            }
        }
    }

    public final void e(byte b, Exception exc, Message message) {
        Object failure;
        try {
            failure = Long.valueOf(message.a().optLong("id", Long.MIN_VALUE));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = Long.MIN_VALUE;
        }
        if (((Number) failure).longValue() == Long.MIN_VALUE) {
            failure = null;
        }
        Long l = (Long) failure;
        Iterator<xoi0> it = this.c.iterator();
        while (it.hasNext()) {
            try {
                it.next().b(b, exc, l);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable unused) {
            }
        }
    }
}
