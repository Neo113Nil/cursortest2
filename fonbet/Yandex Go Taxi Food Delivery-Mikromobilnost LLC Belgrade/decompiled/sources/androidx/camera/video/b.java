package androidx.camera.video;

import android.content.Context;
import androidx.camera.video.VideoOutput$SourceState;
import androidx.camera.video.g;
import defpackage.b84;
import defpackage.d6z;
import defpackage.e9e;
import defpackage.grb1;
import defpackage.k74;
import defpackage.ny61;
import defpackage.r0r;
import defpackage.sgb1;
import defpackage.th91;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class b {
    public final g a;
    public final r0r b;
    public final Context c;
    public e9e d;
    public Executor e;
    public boolean f;
    public boolean g;
    public boolean h;

    public b(Context context, g gVar, r0r r0rVar) {
        this.a = gVar;
        this.b = r0rVar;
        this.c = grb1.b(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h a(Executor executor, e9e e9eVar) {
        long j;
        int i;
        IOException iOException;
        b84 b84Var;
        this.e = executor;
        this.d = e9eVar;
        final g gVar = this.a;
        synchronized (gVar.h) {
            try {
                long j2 = gVar.q + 1;
                gVar.q = j2;
                final int i2 = 0;
                switch (gVar.l.ordinal()) {
                    case 0:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        Recorder$State recorder$State = gVar.l;
                        Recorder$State recorder$State2 = Recorder$State.IDLING;
                        final int i3 = 1;
                        if (recorder$State == recorder$State2) {
                            d6z.y("Expected recorder to be idle but a recording is either pending or in progress.", gVar.o == null && gVar.p == null);
                        }
                        try {
                            j = j2;
                            try {
                                b84 b84Var2 = new b84(this.b, this.e, this.d, this.f, this.h, j);
                                b84Var2.y.set(this.g);
                                b84Var2.d(this.c);
                                gVar.p = b84Var2;
                                Recorder$State recorder$State3 = gVar.l;
                                if (recorder$State3 == recorder$State2) {
                                    gVar.C(Recorder$State.PENDING_RECORDING);
                                    gVar.d.execute(new Runnable() { // from class: hii0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            b84 b84Var3;
                                            int i4;
                                            RuntimeException runtimeException;
                                            b84 b84Var4;
                                            int i5 = i2;
                                            boolean z = false;
                                            g gVar2 = gVar;
                                            switch (i5) {
                                                case 0:
                                                    synchronized (gVar2.h) {
                                                        try {
                                                            Objects.toString(gVar2.l);
                                                            sgb1.g(3, "Recorder");
                                                            int ordinal = gVar2.l.ordinal();
                                                            boolean z2 = true;
                                                            b84Var3 = null;
                                                            if (ordinal == 1) {
                                                                z2 = false;
                                                            } else if (ordinal != 2) {
                                                                i4 = 0;
                                                                b84Var4 = null;
                                                                runtimeException = null;
                                                            }
                                                            if (gVar2.b0 == VideoOutput$SourceState.INACTIVE) {
                                                                b84 b84Var5 = gVar2.p;
                                                                gVar2.p = null;
                                                                gVar2.y();
                                                                i4 = 4;
                                                                b84Var4 = b84Var5;
                                                                z = z2;
                                                                runtimeException = g.s0;
                                                            } else {
                                                                b84 b84Var6 = gVar2.o;
                                                                if (b84Var6 == null && !gVar2.d0) {
                                                                    if (gVar2.G != null) {
                                                                        i4 = 0;
                                                                        z = z2;
                                                                        runtimeException = null;
                                                                        b84Var3 = gVar2.q(gVar2.l);
                                                                        b84Var4 = null;
                                                                    }
                                                                    i4 = 0;
                                                                    z = z2;
                                                                    b84Var4 = null;
                                                                    runtimeException = null;
                                                                }
                                                                Objects.toString(b84Var6);
                                                                sgb1.g(5, "Recorder");
                                                                i4 = 0;
                                                                z = z2;
                                                                b84Var4 = null;
                                                                runtimeException = null;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                    }
                                                    if (b84Var3 != null) {
                                                        gVar2.G(b84Var3, z);
                                                        return;
                                                    } else {
                                                        if (b84Var4 != null) {
                                                            gVar2.j(b84Var4, i4, runtimeException);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                default:
                                                    znw0 znw0Var = gVar2.z;
                                                    if (znw0Var != null) {
                                                        gVar2.h(znw0Var, gVar2.A, false);
                                                        return;
                                                    } else {
                                                        ny61.f("surface request is required to retry initialization.");
                                                        return;
                                                    }
                                            }
                                        }
                                    });
                                } else if (recorder$State3 == Recorder$State.ERROR) {
                                    gVar.C(Recorder$State.PENDING_RECORDING);
                                    gVar.d.execute(new Runnable() { // from class: hii0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            b84 b84Var3;
                                            int i4;
                                            RuntimeException runtimeException;
                                            b84 b84Var4;
                                            int i5 = i3;
                                            boolean z = false;
                                            g gVar2 = gVar;
                                            switch (i5) {
                                                case 0:
                                                    synchronized (gVar2.h) {
                                                        try {
                                                            Objects.toString(gVar2.l);
                                                            sgb1.g(3, "Recorder");
                                                            int ordinal = gVar2.l.ordinal();
                                                            boolean z2 = true;
                                                            b84Var3 = null;
                                                            if (ordinal == 1) {
                                                                z2 = false;
                                                            } else if (ordinal != 2) {
                                                                i4 = 0;
                                                                b84Var4 = null;
                                                                runtimeException = null;
                                                            }
                                                            if (gVar2.b0 == VideoOutput$SourceState.INACTIVE) {
                                                                b84 b84Var5 = gVar2.p;
                                                                gVar2.p = null;
                                                                gVar2.y();
                                                                i4 = 4;
                                                                b84Var4 = b84Var5;
                                                                z = z2;
                                                                runtimeException = g.s0;
                                                            } else {
                                                                b84 b84Var6 = gVar2.o;
                                                                if (b84Var6 == null && !gVar2.d0) {
                                                                    if (gVar2.G != null) {
                                                                        i4 = 0;
                                                                        z = z2;
                                                                        runtimeException = null;
                                                                        b84Var3 = gVar2.q(gVar2.l);
                                                                        b84Var4 = null;
                                                                    }
                                                                    i4 = 0;
                                                                    z = z2;
                                                                    b84Var4 = null;
                                                                    runtimeException = null;
                                                                }
                                                                Objects.toString(b84Var6);
                                                                sgb1.g(5, "Recorder");
                                                                i4 = 0;
                                                                z = z2;
                                                                b84Var4 = null;
                                                                runtimeException = null;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                    }
                                                    if (b84Var3 != null) {
                                                        gVar2.G(b84Var3, z);
                                                        return;
                                                    } else {
                                                        if (b84Var4 != null) {
                                                            gVar2.j(b84Var4, i4, runtimeException);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                default:
                                                    znw0 znw0Var = gVar2.z;
                                                    if (znw0Var != null) {
                                                        gVar2.h(znw0Var, gVar2.A, false);
                                                        return;
                                                    } else {
                                                        ny61.f("surface request is required to retry initialization.");
                                                        return;
                                                    }
                                            }
                                        }
                                    });
                                } else {
                                    gVar.C(Recorder$State.PENDING_RECORDING);
                                }
                                b84Var = null;
                                i = 0;
                                iOException = null;
                            } catch (IOException e) {
                                e = e;
                                i = 5;
                                iOException = e;
                                b84Var = null;
                                if (b84Var == null) {
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                            j = j2;
                        }
                        break;
                    case 1:
                    case 2:
                        b84Var = gVar.p;
                        b84Var.getClass();
                        i = 0;
                        j = j2;
                        iOException = null;
                        break;
                    case 4:
                    case 5:
                        b84Var = gVar.o;
                        i = 0;
                        j = j2;
                        iOException = null;
                        break;
                    default:
                        j = j2;
                        b84Var = null;
                        i = 0;
                        iOException = null;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b84Var == null) {
            ny61.r("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
            return null;
        }
        if (i == 0) {
            return new h(this.a, j, this.b, false);
        }
        sgb1.d("Recorder", "Recording was started when the Recorder had encountered error " + iOException);
        b84 b84Var3 = new b84(this.b, this.e, this.d, this.f, this.h, j);
        b84Var3.y.set(this.g);
        gVar.j(b84Var3, i, iOException);
        return new h(this.a, j, this.b, true);
    }

    public final void b(boolean z) {
        if (th91.e(this.c, "android.permission.RECORD_AUDIO") == -1) {
            ny61.z("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
            return;
        }
        d6z.y("The Recorder this recording is associated to doesn't support audio.", ((k74) g.l(this.a.E)).b.e != 0);
        this.f = true;
        this.g = z;
    }
}
