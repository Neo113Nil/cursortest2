package xsna;

import com.vk.video.ui.smartcrop.api.router.SmartCropArguments;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import one.video.player.OneVideoPlayer;
import xsna.d4k0;
import xsna.el50;
import xsna.g4k0;
import xsna.ln50;
import xsna.m5k0;
import xsna.mik;

/* compiled from: SmartCropInlineActor.kt */
/* loaded from: classes7.dex */
public final class w4k0 extends bl50<SmartCropState, d4k0, on50, bwj, dwj, g4k0> {
    public final SmartCropArguments c;
    public final z4k0 d;
    public final o1b0 e;
    public final com.vk.core.utils.newtork.b f;
    public final sj50<SmartCropState, on50, ll50<on50, bwj, dwj>, jl50<SmartCropState>, g4k0> g;

    public w4k0(SmartCropArguments smartCropArguments, z4k0 z4k0Var, o1b0 o1b0Var, com.vk.core.utils.newtork.b bVar, sj50<SmartCropState, on50, ll50<on50, bwj, dwj>, jl50<SmartCropState>, g4k0> sj50Var) {
        super(sj50Var);
        this.c = smartCropArguments;
        this.d = z4k0Var;
        this.e = o1b0Var;
        this.f = bVar;
        this.g = sj50Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (xsna.qsl.b(r12, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0066 -> B:11:0x0069). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(w4k0 w4k0Var, long j, ContinuationImpl continuationImpl) {
        r4k0 r4k0Var;
        int i;
        long j2;
        long j3;
        Object a;
        w4k0Var.getClass();
        if (continuationImpl instanceof r4k0) {
            r4k0Var = (r4k0) continuationImpl;
            int i2 = r4k0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r4k0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = r4k0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = r4k0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    j2 = j;
                    j3 = 2000;
                    r4k0Var.J$0 = j2;
                    r4k0Var.J$1 = j3;
                    r4k0Var.label = 1;
                } else if (i == 1) {
                    j3 = r4k0Var.J$1;
                    j2 = r4k0Var.J$0;
                    kotlin.a.a(obj);
                    z4k0 z4k0Var = w4k0Var.d;
                    r4k0Var.J$0 = j2;
                    r4k0Var.J$1 = j3;
                    r4k0Var.label = 2;
                    a = z4k0Var.a(j2, r4k0Var);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j4 = r4k0Var.J$0;
                    kotlin.a.a(obj);
                    a = ((Result) obj).d();
                    j2 = j4;
                    Throwable a2 = Result.a(a);
                    if (a2 != null) {
                        w4k0Var.q(a2);
                        return s3q0.a;
                    }
                    mik mikVar = (mik) a;
                    if (!(mikVar instanceof mik.c)) {
                        if (!(mikVar instanceof mik.b)) {
                            if (!(mikVar instanceof mik.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            w4k0Var.q(null);
                            return s3q0.a;
                        }
                        final long currentTimeMillis = System.currentTimeMillis();
                        rdi.y(w4k0Var, new izs() { // from class: xsna.k4k0
                            @Override // xsna.izs
                            public final Object invoke(Object obj2) {
                                SmartCropState smartCropState = (SmartCropState) obj2;
                                SmartCropState.CropVideoProgress cropVideoProgress = smartCropState.i;
                                return SmartCropState.a(smartCropState, null, null, null, null, 0L, false, cropVideoProgress != null ? SmartCropState.CropVideoProgress.a(cropVideoProgress, null, Long.valueOf(currentTimeMillis), 7) : null, false, false, null, 1919);
                            }
                        });
                        String str = ((mik.b) mikVar).a;
                        SmartCropState.CropVideoProgress cropVideoProgress = ((SmartCropState) w4k0Var.b.getCurrentState()).i;
                        w4k0Var.c(new g4k0.b(str, cropVideoProgress != null && cropVideoProgress.c));
                        return s3q0.a;
                    }
                    mik.c cVar = (mik.c) mikVar;
                    if (cVar.a != null) {
                        rdi.y(w4k0Var, new w910((mik.c) mikVar, 28));
                    }
                    Long l = cVar.b;
                    if (l != null) {
                        j3 = l.longValue();
                        if (j3 > 20000) {
                            j3 = 20000;
                        }
                        r4k0Var.J$0 = j2;
                        r4k0Var.J$1 = j3;
                        r4k0Var.label = 1;
                    }
                    j3 = 2000;
                    r4k0Var.J$0 = j2;
                    r4k0Var.J$1 = j3;
                    r4k0Var.label = 1;
                }
            }
        }
        r4k0Var = new r4k0(w4k0Var, continuationImpl);
        Object obj2 = r4k0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = r4k0Var.label;
        if (i != 0) {
        }
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<SmartCropState, on50, ll50<on50, bwj, dwj>, jl50<SmartCropState>, g4k0> W() {
        return this.g;
    }

    @Override // xsna.bl50, xsna.qj50
    public final void init() {
        g3q.a(this, new q4k0(this, null));
        SmartCropState.CropVideoProgress cropVideoProgress = ((SmartCropState) this.b.getCurrentState()).i;
        if (cropVideoProgress == null) {
            return;
        }
        if (cropVideoProgress.b == null) {
            q(null);
            return;
        }
        el50.a.a(this, q5k0.a, ln50.a.b, new evh0(1, this, cropVideoProgress));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        OneVideoPlayer oneVideoPlayer;
        d4k0 d4k0Var = (d4k0) lj50Var;
        if ((d4k0Var instanceof d4k0.j) || (d4k0Var instanceof d4k0.b)) {
            rdi.y(this, new l4k0(0));
            return;
        }
        boolean z = d4k0Var instanceof d4k0.k;
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        if (z) {
            d4k0.k kVar = (d4k0.k) d4k0Var;
            if (kVar instanceof d4k0.k.b) {
                OneVideoPlayer oneVideoPlayer2 = ((SmartCropState) sj50Var.getCurrentState()).c;
                if (oneVideoPlayer2 != null) {
                    oneVideoPlayer2.pause();
                    return;
                }
                return;
            }
            if (!(kVar instanceof d4k0.k.a)) {
                throw new NoWhenBranchMatchedException();
            }
            rdi.y(this, new r820(kVar, 24));
            OneVideoPlayer oneVideoPlayer3 = ((SmartCropState) sj50Var.getCurrentState()).c;
            Long valueOf = oneVideoPlayer3 != null ? Long.valueOf(oneVideoPlayer3.getCurrentPosition()) : null;
            if (valueOf != null) {
                q500 q500Var = ((d4k0.k.a) kVar).b;
                if (q500Var.f(valueOf.longValue()) || (oneVideoPlayer = ((SmartCropState) sj50Var.getCurrentState()).c) == null) {
                    return;
                }
                oneVideoPlayer.seekTo(q500Var.b);
                return;
            }
            return;
        }
        if (d4k0Var instanceof d4k0.h) {
            rdi.y(this, new nt10(d4k0Var, 25));
            return;
        }
        if (d4k0Var instanceof d4k0.c) {
            this.f.getClass();
            boolean d = com.vk.core.utils.newtork.b.d();
            if (!d) {
                rdi.y(this, new cd10(17));
            }
            if (d) {
                final q500 q500Var2 = ((SmartCropState) sj50Var.getCurrentState()).f;
                final boolean z2 = ((SmartCropState) sj50Var.getCurrentState()).h;
                el50.a.a(this, q5k0.a, ln50.a.b, new izs() { // from class: xsna.o4k0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        dwj dwjVar = (dwj) obj;
                        return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, new v4k0(w4k0.this, q500Var2, z2, null), 3));
                    }
                });
                return;
            }
            return;
        }
        if (d4k0Var instanceof d4k0.f) {
            rdi.y(this, new byo(25));
            return;
        }
        if (d4k0Var instanceof d4k0.a) {
            if (!(((d4k0.a) d4k0Var) instanceof d4k0.a.C2704a)) {
                return;
            } else {
                g(q5k0.a);
                return;
            }
        }
        if (d4k0Var instanceof d4k0.d) {
            if (((d4k0.d) d4k0Var) instanceof d4k0.d.b) {
                SmartCropState smartCropState = (SmartCropState) sj50Var.getCurrentState();
                rdi.y(this, new ev60(10));
                g3q.a(this, new s4k0(smartCropState, this, null));
                g(q5k0.a);
                c(new g4k0.a(false));
            }
            rdi.y(this, new m4k0(0));
            return;
        }
        if (d4k0Var instanceof d4k0.i) {
            rdi.y(this, new hwi0(4));
        } else if (d4k0Var instanceof d4k0.g) {
            rdi.y(this, new z6u(20));
        } else {
            if (!(d4k0Var instanceof d4k0.e)) {
                throw new NoWhenBranchMatchedException();
            }
            g(q5k0.a);
        }
    }

    public final void q(Throwable th) {
        final boolean z = false;
        if (th != null && h03.a(th)) {
            z = true;
        }
        rdi.y(this, new izs() { // from class: xsna.p4k0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                return SmartCropState.a((SmartCropState) obj, null, null, null, null, 0L, false, null, false, false, z ? m5k0.b.a : m5k0.a.a, 895);
            }
        });
    }
}
