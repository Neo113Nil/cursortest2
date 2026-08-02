package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import one.video.exo.diskcache.Action;
import xsna.bx8;

/* compiled from: PreloadDiskCacheManager.kt */
/* loaded from: classes8.dex */
public final class z0d0 {
    public static final bpn0 k = new bpn0(new g13(20));
    public static final HandlerThread l = h5s.a("PreloadDiskCacheManager-handler-thread");
    public final ThreadPoolExecutor a;
    public final vob b;
    public final a c;
    public volatile boolean d;
    public final b9c0 e;
    public final AtomicBoolean f;
    public final CopyOnWriteArrayList<b> g;
    public volatile van h;
    public final a1d0 i;
    public final b1d0 j;

    /* compiled from: PreloadDiskCacheManager.kt */
    public final class a extends Handler {

        /* compiled from: PreloadDiskCacheManager.kt */
        /* renamed from: xsna.z0d0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C4146a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Action.values().length];
                try {
                    iArr[Action.INITIALIZE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Action.INIT_COMPLETED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Action.INIT_FAILED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Action.DOWNLOAD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Action.CANCEL.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Action.CANCEL_ALL.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Action.REMOVE_ALL.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Action.PROCESS_NEXT_TASK.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Action.ON_TASK_FINISHED.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String str = null;
            switch (C4146a.$EnumSwitchMapping$0[((Action) Action.h().get(message.what)).ordinal()]) {
                case 1:
                    z0d0 z0d0Var = z0d0.this;
                    xww xwwVar = (xww) message.obj;
                    if (z0d0Var.d) {
                        z0d0Var.b.k(new f880(xwwVar, 11));
                        return;
                    }
                    try {
                        Context context = xwwVar.a;
                        bhs0 bhs0Var = xwwVar.b;
                        z0d0Var.c.obtainMessage(Action.INIT_COMPLETED.ordinal(), new kxw(new van(bhs0Var, new hdl(new pn80(context.getApplicationContext(), "clips_disk_cache_database.db.db", null, 1)), new dzy(bhs0Var.b)), xwwVar.c)).sendToTarget();
                        return;
                    } catch (Throwable th) {
                        Log.e("PreloadDiskCacheManager", th.getMessage(), th);
                        Exception exc = th instanceof Exception ? th : null;
                        if (exc == null) {
                            exc = new Exception(th);
                        }
                        z0d0Var.c.obtainMessage(Action.INIT_FAILED.ordinal(), new lyw(exc, xwwVar.c)).sendToTarget();
                        return;
                    }
                case 2:
                    z0d0 z0d0Var2 = z0d0.this;
                    kxw kxwVar = (kxw) message.obj;
                    if (z0d0Var2.d) {
                        z0d0Var2.b.k(new m960(kxwVar, 15));
                        return;
                    }
                    van vanVar = kxwVar.a;
                    ThreadPoolExecutor threadPoolExecutor = z0d0Var2.a;
                    z0d0Var2.h = vanVar;
                    z0d0Var2.d = true;
                    z0d0Var2.b.k(new cr20(kxwVar, 25));
                    return;
                case 3:
                    z0d0 z0d0Var3 = z0d0.this;
                    lyw lywVar = (lyw) message.obj;
                    z0d0Var3.d = false;
                    z0d0Var3.h = null;
                    Log.e("PreloadDiskCacheManager", "PreloadDiskCacheManager initialization failed", lywVar.a);
                    z0d0Var3.b.k(new g880(lywVar, 10));
                    return;
                case 4:
                    z0d0 z0d0Var4 = z0d0.this;
                    h8o h8oVar = (h8o) message.obj;
                    van vanVar2 = z0d0Var4.h;
                    if (!z0d0Var4.d || vanVar2 == null) {
                        throw new IllegalStateException("PreloadDiskCacheManager must be initialized first, call init() method");
                    }
                    bx8.a aVar = h8oVar.c;
                    if (0 >= aVar.a) {
                        throw new IllegalStateException("load params is not valid, mediaLoadStartPositionMs >= mediaLoadEndPositionMs");
                    }
                    dbn dbnVar = h8oVar.b;
                    xan xanVar = new xan(dbnVar, aVar);
                    if (((ConcurrentHashMap) z0d0Var4.e.b).containsKey(dbnVar.d)) {
                        return;
                    }
                    switch (c8s0.$EnumSwitchMapping$0[h8oVar.b.a.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            break;
                        case 5:
                            str = MimeTypes.APPLICATION_MP4;
                            break;
                        case 6:
                            str = MimeTypes.APPLICATION_M3U8;
                            break;
                        case 7:
                            str = MimeTypes.APPLICATION_MPD;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    String str2 = str;
                    if (str2 == null) {
                        return;
                    }
                    Context context2 = h8oVar.a;
                    bhs0 bhs0Var2 = vanVar2.a;
                    z0d0Var4.b(new hao(str2, bhs0Var2, context2, vanVar2, xanVar, vanVar2.b(bhs0Var2.c, false, dbnVar), z0d0Var4.a, z0d0Var4.c, z0d0Var4.i));
                    return;
                case 5:
                    cbn c = z0d0.this.e.c((String) message.obj);
                    if (c == null) {
                        return;
                    }
                    c.cancel(true);
                    return;
                case 6:
                    z0d0.this.a();
                    return;
                case 7:
                    z0d0 z0d0Var5 = z0d0.this;
                    van vanVar3 = z0d0Var5.h;
                    if (!z0d0Var5.d || vanVar3 == null) {
                        throw new IllegalStateException("PreloadDiskCacheManager must be initialized first, call init() method");
                    }
                    if (((ConcurrentHashMap) z0d0Var5.e.b).containsKey("clear_task")) {
                        return;
                    }
                    z0d0Var5.a();
                    z0d0Var5.b(new jic(vanVar3, z0d0Var5.i));
                    return;
                case 8:
                    z0d0 z0d0Var6 = z0d0.this;
                    AtomicBoolean atomicBoolean = z0d0Var6.f;
                    if (atomicBoolean.compareAndSet(false, true)) {
                        b9c0 b9c0Var = z0d0Var6.e;
                        ReentrantLock reentrantLock = (ReentrantLock) b9c0Var.d;
                        reentrantLock.lock();
                        try {
                            String str3 = (String) j5g.Z((ConcurrentLinkedDeque) b9c0Var.c);
                            cbn cbnVar = str3 != null ? (cbn) ((ConcurrentHashMap) b9c0Var.b).get(str3) : null;
                            if (cbnVar == null) {
                                atomicBoolean.set(false);
                                return;
                            } else {
                                z0d0Var6.a.execute(new ro2(2, cbnVar, z0d0Var6));
                                return;
                            }
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                    return;
                case 9:
                    c6o0 c6o0Var = (c6o0) message.obj;
                    z0d0 z0d0Var7 = z0d0.this;
                    String str4 = c6o0Var.a;
                    Class<? extends cbn<?, ?>> cls = c6o0Var.b;
                    b9c0 b9c0Var2 = z0d0Var7.e;
                    cbn cbnVar2 = (cbn) ((ConcurrentHashMap) b9c0Var2.b).get(str4);
                    if (cbnVar2 != null && cbnVar2.getClass().equals(cls)) {
                        b9c0Var2.c(str4);
                    }
                    z0d0Var7.f.set(false);
                    if (((ConcurrentHashMap) b9c0Var2.b).isEmpty()) {
                        return;
                    }
                    z0d0Var7.c.obtainMessage(Action.PROCESS_NEXT_TASK.ordinal()).sendToTarget();
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: PreloadDiskCacheManager.kt */
    public interface b {
    }

    public z0d0(int i) {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) k.getValue();
        Looper looper = l.getLooper();
        this.a = threadPoolExecutor;
        this.b = new vob((Looper) null);
        this.c = new a(looper);
        this.e = new b9c0();
        this.f = new AtomicBoolean(false);
        this.g = new CopyOnWriteArrayList<>();
        this.i = new a1d0(this);
        this.j = new b1d0();
    }

    public final void a() {
        b9c0 b9c0Var = this.e;
        b9c0Var.getClass();
        Iterator it = j5g.O0(new HashMap((ConcurrentHashMap) b9c0Var.b).keySet()).iterator();
        while (it.hasNext()) {
            cbn c = b9c0Var.c((String) it.next());
            if (c != null) {
                c.cancel(true);
            }
        }
    }

    public final void b(cbn<?, ?> cbnVar) {
        if (this.a.isShutdown()) {
            return;
        }
        b9c0 b9c0Var = this.e;
        ReentrantLock reentrantLock = (ReentrantLock) b9c0Var.d;
        reentrantLock.lock();
        try {
            if (((ConcurrentHashMap) b9c0Var.b).putIfAbsent(cbnVar.d(), cbnVar) != null) {
                reentrantLock.unlock();
            } else {
                ((ConcurrentLinkedDeque) b9c0Var.c).add(cbnVar.d());
            }
            cbnVar.d();
            this.c.obtainMessage(Action.PROCESS_NEXT_TASK.ordinal()).sendToTarget();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c(Context context, bhs0 bhs0Var, ny7 ny7Var) {
        this.c.obtainMessage(Action.INITIALIZE.ordinal(), new xww(context, bhs0Var, ny7Var)).sendToTarget();
    }

    public final boolean d() {
        return this.d;
    }
}
