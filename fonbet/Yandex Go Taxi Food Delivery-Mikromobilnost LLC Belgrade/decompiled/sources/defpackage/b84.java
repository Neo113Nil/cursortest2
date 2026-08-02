package defpackage;

import android.content.Context;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class b84 implements AutoCloseable {
    public final r0r A;
    public final Executor B;
    public final e9e C;
    public final boolean D;
    public final boolean E;
    public final long F;
    public final c29 a;
    public final AtomicBoolean b;
    public final AtomicReference c;
    public final AtomicReference w;
    public final AtomicReference x;
    public final AtomicBoolean y;
    public final qz40 z;

    public b84(r0r r0rVar, Executor executor, e9e e9eVar, boolean z, boolean z2, long j) {
        int i = 24;
        this.a = Build.VERSION.SDK_INT >= 30 ? new c29(i, new y4c()) : new c29(i, new r501(13));
        this.b = new AtomicBoolean(false);
        this.c = new AtomicReference(null);
        this.w = new AtomicReference(null);
        this.x = new AtomicReference(new sbj(6));
        this.y = new AtomicBoolean(false);
        this.z = new qz40(Boolean.FALSE);
        this.A = r0rVar;
        this.B = executor;
        this.C = e9eVar;
        this.D = z;
        this.E = z2;
        this.F = j;
    }

    public final void a(Uri uri) {
        if (this.b.get()) {
            c((e9e) this.x.getAndSet(null), uri);
        }
    }

    public final void c(e9e e9eVar, Uri uri) {
        if (e9eVar == null) {
            quz.t("Recording ", this, " has already been finalized");
        } else {
            ((z4c) this.a.b).close();
            e9eVar.accept(uri);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a(Uri.EMPTY);
    }

    public final void d(Context context) {
        if (this.b.getAndSet(true)) {
            quz.t("Recording ", this, " has already been initialized");
            return;
        }
        ((z4c) this.a.b).c("finalizeRecording");
        this.c.set(new kii0(this.A));
        if (this.D) {
            int i = Build.VERSION.SDK_INT;
            AtomicReference atomicReference = this.w;
            if (i >= 31) {
                atomicReference.set(new lii0(this, context));
            } else {
                atomicReference.set(new mii0(this));
            }
        }
    }

    public final MediaMuxer e(int i, k9b k9bVar) {
        if (!this.b.get()) {
            quz.t("Recording ", this, " has not been initialized");
            return null;
        }
        kii0 kii0Var = (kii0) this.c.getAndSet(null);
        if (kii0Var == null) {
            d7g0.j(this, "One-time media muxer creation has already occurred for recording ");
            return null;
        }
        try {
            return kii0Var.a(i, k9bVar);
        } catch (RuntimeException e) {
            throw new IOException("Failed to create MediaMuxer by " + e, e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b84)) {
            return false;
        }
        b84 b84Var = (b84) obj;
        if (!this.A.equals(b84Var.A)) {
            return false;
        }
        Executor executor = b84Var.B;
        Executor executor2 = this.B;
        if (executor2 == null) {
            if (executor != null) {
                return false;
            }
        } else if (!executor2.equals(executor)) {
            return false;
        }
        e9e e9eVar = b84Var.C;
        e9e e9eVar2 = this.C;
        if (e9eVar2 == null) {
            if (e9eVar != null) {
                return false;
            }
        } else if (!e9eVar2.equals(e9eVar)) {
            return false;
        }
        return this.D == b84Var.D && this.E == b84Var.E && this.F == b84Var.F;
    }

    public final void finalize() {
        try {
            ((z4c) this.a.b).e();
            e9e e9eVar = (e9e) this.x.getAndSet(null);
            if (e9eVar != null) {
                c(e9eVar, Uri.EMPTY);
            }
        } finally {
            super.finalize();
        }
    }

    public final int hashCode() {
        int hashCode = (this.A.b.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.B;
        int hashCode2 = (hashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        e9e e9eVar = this.C;
        int hashCode3 = (((hashCode2 ^ (e9eVar != null ? e9eVar.hashCode() : 0)) * 1000003) ^ (this.D ? 1231 : 1237)) * 1000003;
        int i = this.E ? 1231 : 1237;
        long j = this.F;
        return ((int) ((j >>> 32) ^ j)) ^ ((hashCode3 ^ i) * 1000003);
    }

    public final void k(in31 in31Var, boolean z) {
        int i;
        r0r r0rVar = in31Var.a;
        r0r r0rVar2 = this.A;
        if (!Objects.equals(r0rVar, r0rVar2)) {
            throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + r0rVar + ", Expected: " + r0rVar2 + "]");
        }
        if (z) {
            if ((in31Var instanceof dn31) && (i = ((dn31) in31Var).c) != 0) {
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unknown(");
                        sb.append(i);
                        sb.append(Extension.C_BRAKE);
                        break;
                }
            }
            sgb1.g(3, "Recorder");
        }
        boolean z2 = in31Var instanceof gn31;
        qz40 qz40Var = this.z;
        if (z2 || (in31Var instanceof fn31)) {
            qz40Var.t(Boolean.TRUE);
        } else if ((in31Var instanceof en31) || (in31Var instanceof dn31)) {
            qz40Var.t(Boolean.FALSE);
        }
        Executor executor = this.B;
        if (executor == null || this.C == null) {
            return;
        }
        try {
            executor.execute(new xmf0(13, this, in31Var));
        } catch (RejectedExecutionException e) {
            sgb1.e("Recorder", "The callback executor is invalid.", e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordingRecord{getOutputOptions=");
        sb.append(this.A);
        sb.append(", getCallbackExecutor=");
        sb.append(this.B);
        sb.append(", getEventListener=");
        sb.append(this.C);
        sb.append(", hasAudioEnabled=");
        sb.append(this.D);
        sb.append(", isPersistent=");
        sb.append(this.E);
        sb.append(", getRecordingId=");
        return oyr.n(this.F, "}", sb);
    }
}
