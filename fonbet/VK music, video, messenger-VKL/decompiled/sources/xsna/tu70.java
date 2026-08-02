package xsna;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: OfflinePlaybackErrorResolver.kt */
/* loaded from: classes2.dex */
public final class tu70 implements owp {
    public final a a;
    public final mm80 b;
    public final AtomicInteger c = new AtomicInteger(0);

    /* compiled from: OfflinePlaybackErrorResolver.kt */
    public static abstract class a {
        public final izs<Integer, s3q0> a;

        /* compiled from: OfflinePlaybackErrorResolver.kt */
        /* renamed from: xsna.tu70$a$a, reason: collision with other inner class name */
        public static final class C3775a extends a {
            public static final C3775a b = new C3775a(new e420(7));
        }

        /* compiled from: OfflinePlaybackErrorResolver.kt */
        public static final class b extends a {
            public final int b;
            public final long c;

            public b(int i, long j, een0 een0Var) {
                super(een0Var);
                this.b = i;
                this.c = j;
            }
        }

        public a(izs izsVar) {
            this.a = izsVar;
        }
    }

    public tu70(a aVar, mm80 mm80Var) {
        this.a = aVar;
        this.b = mm80Var;
    }

    @Override // xsna.owp
    public final List<avp> a(Throwable th, m7q m7qVar, long j) {
        String str;
        if (th instanceof OneVideoPlaybackException) {
            DownloadInfo.State state = null;
            sht0 e = m7qVar != null ? jgz.e(m7qVar) : null;
            mv70 mv70Var = e instanceof mv70 ? (mv70) e : null;
            if (mv70Var != null && (str = mv70Var.d) != null) {
                mm80 mm80Var = this.b;
                DownloadInfo c = mm80Var != null ? mm80Var.c(str) : bu70.a.d(str);
                if (c != null) {
                    state = c.c;
                }
            }
            if (state == DownloadInfo.State.STATE_COMPLETED) {
                a aVar = this.a;
                if (!(aVar instanceof a.b)) {
                    if (aVar.equals(a.C3775a.b)) {
                        return EmptyList.b;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                a.b bVar = (a.b) aVar;
                int i = bVar.b;
                long j2 = bVar.c;
                boolean z = j2 == 0;
                long j3 = m7qVar != null ? m7qVar.k : -1;
                AtomicInteger atomicInteger = this.c;
                if (atomicInteger.get() >= i) {
                    this.c.set(0);
                    return EmptyList.b;
                }
                if (z || j3 > 0) {
                    atomicInteger.getAndAdd(1);
                    return Collections.singletonList(new pva0(j + j2));
                }
                this.c.set(0);
                return EmptyList.b;
            }
        }
        return EmptyList.b;
    }

    @Override // xsna.owp
    public final void reset() {
        a aVar = this.a;
        if (aVar instanceof a.b) {
            AtomicInteger atomicInteger = this.c;
            if (atomicInteger.get() > 0) {
                aVar.a.invoke(Integer.valueOf(atomicInteger.get()));
                this.c.set(0);
            }
        }
    }
}
