package xsna;

import android.content.Context;
import com.vk.im.engine.di.ImCmdDirectExecutorComponent;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import kotlin.NoWhenBranchMatchedException;
import xsna.pdg0;

/* compiled from: MessagesSyncDelayedJob.kt */
/* loaded from: classes2.dex */
public final class zg20 extends tsl implements w8i {
    public final fyx c;

    /* compiled from: MessagesSyncDelayedJob.kt */
    public static final class a {
        public static zg20 a(fyx fyxVar) {
            return new zg20(fyxVar);
        }
    }

    /* compiled from: MessagesSyncDelayedJob.kt */
    public static final class b extends le6<s3q0> {
        public final Long b;

        public b(Long l) {
            this.b = l;
        }

        @Override // xsna.le6
        public final s3q0 e(w2w w2wVar) {
            w2wVar.P0().b(this.b);
            return s3q0.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        @Override // xsna.le6, xsna.e1w
        public final int hashCode() {
            Long l = this.b;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        @Override // xsna.e1w
        public final String toString() {
            return iq.b(new StringBuilder("InternalEngineSyncCmd(peerId="), this.b, ')');
        }
    }

    public zg20(fyx fyxVar) {
        super(fyxVar);
        this.c = fyxVar;
    }

    @Override // xsna.tsl
    public final void a(Context context) {
        ((ImReportersComponent) ((k7m) m7m.f(this)).a(fpf0.a(ImReportersComponent.class))).K().t().b().b();
        long j = this.c.a.getLong("data_key_peer_id");
        Long valueOf = Long.valueOf(j);
        if (j == 0) {
            valueOf = null;
        }
        pdg0 a2 = ((ImCmdDirectExecutorComponent) ((k7m) m7m.f(this)).a(fpf0.a(ImCmdDirectExecutorComponent.class))).g().a(this, new b(valueOf));
        if (a2 instanceof pdg0.b) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{"MessagesSyncDelayedJob finished with success result"});
            return;
        }
        if (!(a2 instanceof pdg0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        L l2 = L.a;
        l2.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l2, L.LogType.e, new Object[]{"MessagesSyncDelayedJob finished with error " + ((pdg0.a) a2).a});
    }
}
