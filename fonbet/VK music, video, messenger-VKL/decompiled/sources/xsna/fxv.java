package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.internal.sync.longpoll.LongPollSyncManager$InitialSyncState;
import com.vk.im.engine.models.sync.ImBgSyncMode;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.im.log.LogLevel;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.time.DurationUnit;
import xsna.n3w;
import xsna.zno;

/* compiled from: ImBgSyncManagerImpl.kt */
/* loaded from: classes.dex */
public final class fxv implements exv {
    public final w2w a;
    public final n3w.a b;
    public ImBgSyncMode c;
    public String d;
    public io.reactivex.rxjava3.disposables.c e = EmptyDisposable.INSTANCE;
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new qx2(this, 3));
    public final yo g;
    public final l1r0 h;
    public final cv30 i;
    public final fpz j;
    public final lts0 k;
    public final eng l;

    /* compiled from: ImBgSyncManagerImpl.kt */
    /* loaded from: classes2.dex */
    public final class a {
        public a() {
        }

        public final void a(whc whcVar) {
            agx agxVar = n3w.this.w;
            if (agxVar != null) {
                try {
                    agxVar.a(whcVar);
                } catch (Exception e) {
                    f9w f9wVar = n3w.z;
                    f9wVar.getClass();
                    if (f9wVar.d(LogLevel.ERROR)) {
                        return;
                    }
                    String str = f9wVar.a;
                    L l = L.a;
                    l.getClass();
                    if (L.m(LoggerOutputTarget.NONE)) {
                        return;
                    }
                    L.w(l, L.LogType.e, e, new Object[]{str, "Unable to invoke InternalCallback#onClearCacheRequested"}, null, null, 24);
                }
            }
        }
    }

    /* compiled from: ImBgSyncManagerImpl.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ImBgSyncMode.values().length];
            try {
                iArr[ImBgSyncMode.LITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImBgSyncMode.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LongPollSyncManager$InitialSyncState.values().length];
            try {
                iArr2[LongPollSyncManager$InitialSyncState.SYNCED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[LongPollSyncManager$InitialSyncState.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LongPollSyncManager$InitialSyncState.INTERRUPTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LongPollSyncManager$InitialSyncState.STOPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public fxv(w2w w2wVar, ExecutorService executorService, n3w.a aVar) {
        this.a = w2wVar;
        this.b = aVar;
        this.g = new yo(w2wVar);
        new HashSet();
        new HashSet();
        this.h = new l1r0(w2wVar);
        this.i = new cv30(w2wVar, executorService);
        this.j = new fpz(w2wVar);
        this.k = new lts0(w2wVar);
        this.l = new eng(w2wVar);
    }

    @Override // xsna.exv
    public final boolean a() {
        boolean z;
        l1r0 l1r0Var = this.h;
        synchronized (l1r0Var) {
            z = l1r0Var.d;
        }
        return z;
    }

    @Override // xsna.exv
    public final void b(Long l) {
        c().c(l);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final f840 c() {
        return (f840) this.f.getValue();
    }

    public final synchronized void d(LongPollSyncManager$InitialSyncState longPollSyncManager$InitialSyncState) {
        try {
            L.e("ImBgSyncManager", "onInitialSyncStateChanged: newState=" + longPollSyncManager$InitialSyncState + ", primaryBgSyncMode=" + this.c);
            int i = b.$EnumSwitchMapping$1[longPollSyncManager$InitialSyncState.ordinal()];
            if (i == 1) {
                ImBgSyncMode imBgSyncMode = this.c;
                int i2 = imBgSyncMode == null ? -1 : b.$EnumSwitchMapping$0[imBgSyncMode.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        this.a.K().n().b().a();
                        this.a.K().t().j().a();
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str = this.d;
                        if (str == null) {
                            str = "ImBgSyncManager";
                        }
                        e(str);
                        this.a.K().t().s().a();
                    }
                }
            } else if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.a.K().t().s().a();
                } else if (this.c == ImBgSyncMode.LITE) {
                    this.a.K().n().b().c();
                } else {
                    this.a.K().t().s().a();
                }
            } else if (this.c == ImBgSyncMode.LITE) {
                this.a.K().n().b().b();
            } else {
                this.a.K().t().s().b();
            }
        } finally {
        }
    }

    public final void e(String str) {
        L.e("ImBgSyncManager", "startFullSyncManagers: started");
        boolean z = true;
        if (this.a.getConfig().N) {
            yo yoVar = this.g;
            synchronized (yoVar) {
                try {
                    if (yoVar.b == null) {
                        yoVar.b = yoVar.a.J0(str, k9q0.p(yoVar.a) ? new tpu(Collections.singletonList(yoVar.a.Q0()), Source.ACTUAL, z, 8) : new vo(Source.ACTUAL, true));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        l1r0 l1r0Var = this.h;
        synchronized (l1r0Var) {
            if (!l1r0Var.b) {
                l1r0Var.b = true;
                l1r0Var.c = vre0.e(l1r0Var.a.i0(), new mrs(com.vk.dto.common.a.b(l1r0Var.a.H0())), null, new nyy(l1r0Var), new k1r0(l1r0Var), new yam(l1r0Var, 2), null, 70);
            }
        }
        cv30 cv30Var = this.i;
        synchronized (cv30Var) {
            if (!cv30Var.c) {
                cv30Var.e.a(cv30Var.d);
                cv30Var.c = true;
            }
        }
        fpz fpzVar = this.j;
        synchronized (fpzVar) {
            if (((fz3) fpzVar.b) == null) {
                fpzVar.b = ((w2w) fpzVar.a).J0(fpzVar, new dfp(Source.ACTUAL));
            }
        }
        this.k.a();
        this.l.a();
        L.e("ImBgSyncManager", "startFullSyncManagers: finished");
    }

    public final synchronized void f(ImBgSyncMode imBgSyncMode, String str) {
        try {
            if (this.c != imBgSyncMode) {
                this.c = imBgSyncMode;
                this.d = str;
                int i = b.$EnumSwitchMapping$0[imBgSyncMode.ordinal()];
                if (i == 1) {
                    L.e("ImBgSyncManager", "startPrimarySyncLite: cause=".concat(str));
                    c().h(str);
                    h("startPrimarySyncLite");
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    L.e("ImBgSyncManager", "startPrimarySyncFull: cause=".concat(str));
                    c().g(str);
                    LongPollSyncManager$InitialSyncState d = c().d();
                    LongPollSyncManager$InitialSyncState longPollSyncManager$InitialSyncState = LongPollSyncManager$InitialSyncState.SYNCED;
                    if (d == longPollSyncManager$InitialSyncState) {
                        d(longPollSyncManager$InitialSyncState);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final a540 g(String str, boolean z) {
        a540 i;
        L.e("ImBgSyncManager", zhy0.a("stopAllInternal: destroy=", z));
        synchronized (this) {
            try {
                L.e("ImBgSyncManager", "stopPrimarySync: destroy=" + z);
                this.c = null;
                this.d = null;
                g8i i2 = this.f.isInitialized() ? i(c().i(z), str) : null;
                a540 h = h(str);
                if (z) {
                    this.e.dispose();
                }
                i = k7b0.i(rl3.I(new g8i[]{i2, h}));
            } catch (Throwable th) {
                throw th;
            }
        }
        return k7b0.i(Collections.singletonList(i));
    }

    public final a540 h(String str) {
        e8i h;
        g8i h2;
        e8i h3;
        e8i h4;
        CountDownLatch cancel;
        L.e("ImBgSyncManager", "stopFullSyncManagers: started");
        yo yoVar = this.g;
        synchronized (yoVar) {
            try {
                fz3 fz3Var = yoVar.b;
                if (fz3Var != null) {
                    fz3Var.dispose();
                }
                yoVar.b = null;
                h = k7b0.h("AccountInfoSyncManager");
            } finally {
            }
        }
        g8i i = i(h, str);
        l1r0 l1r0Var = this.h;
        synchronized (l1r0Var) {
            try {
                l1r0Var.b = false;
                sq9 sq9Var = l1r0Var.c;
                h2 = (sq9Var == null || (cancel = sq9Var.cancel()) == null) ? k7b0.h("UsersOnlineSyncManager") : k7b0.l(cancel);
            } finally {
            }
        }
        g8i i2 = i(h2, str);
        cv30 cv30Var = this.i;
        cv30Var.getClass();
        g8i i3 = i(k7b0.j(new gzv(cv30Var, 15)), str);
        fpz fpzVar = this.j;
        synchronized (fpzVar) {
            try {
                fz3 fz3Var2 = (fz3) fpzVar.b;
                if (fz3Var2 != null) {
                    fz3Var2.dispose();
                }
                fpzVar.b = null;
                h3 = k7b0.h("StickersSuggestionSyncManager");
            } finally {
            }
        }
        g8i i4 = i(h3, str);
        lts0 lts0Var = this.k;
        synchronized (lts0Var) {
            try {
                fz3 fz3Var3 = lts0Var.b;
                if (fz3Var3 != null) {
                    fz3Var3.dispose();
                }
                lts0Var.b = null;
                h4 = k7b0.h("VideoMsgShapesSyncManager");
            } finally {
            }
        }
        a540 i5 = k7b0.i(rl3.I(new g8i[]{i, i2, i3, i4, i(h4, str), i(this.l.b(), str)}));
        L.e("ImBgSyncManager", "stopFullSyncManagers: finished");
        return i5;
    }

    public final g8i i(g8i g8iVar, String str) {
        w2w w2wVar = this.a;
        if (!w2wVar.getExperiments().d().a) {
            return g8iVar;
        }
        zno.a aVar = zno.c;
        return new o6g0(g8iVar, eoo.e(1000, DurationUnit.MILLISECONDS), w2wVar.K().k(PerformanceEventType.SYNC_MANAGER_STOP_AWAITING.h()), str);
    }
}
