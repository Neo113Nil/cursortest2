package xsna;

import android.content.Context;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetDeviceBlacklistsResponseDto;
import com.vk.log.L;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.tjd;

/* compiled from: SyncClipsBlacklistsJob.kt */
/* loaded from: classes.dex */
public final class fon0 extends tsl {
    public final bpn0 c;

    /* compiled from: SyncClipsBlacklistsJob.kt */
    @b6l(c = "com.vk.clips.blacklists.impl.work.SyncClipsBlacklistsJob$onExecute$1", f = "SyncClipsBlacklistsJob.kt", l = {33, 42}, m = "invokeSuspend")
    /* loaded from: classes16.dex */
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        Object L$0;
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return fon0.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
        
            if (r7 == r0) goto L37;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    L.p("SyncClipsBlacklistsJob", "Fetching blacklists data...");
                    iz2 A = yfb.A(((mgj0) fon0.this.c.getValue()).v());
                    fo50.J(A);
                    this.label = 1;
                    obj = evj.p(A, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    kotlin.a.a(obj);
                }
                ShortVideoGetDeviceBlacklistsResponseDto shortVideoGetDeviceBlacklistsResponseDto = (ShortVideoGetDeviceBlacklistsResponseDto) obj;
                vjd vjdVar = vjd.b;
                Boolean e = shortVideoGetDeviceBlacklistsResponseDto.e();
                tjd.a aVar = tjd.a.a;
                boolean booleanValue = e != null ? e.booleanValue() : aVar.getSTUB().b();
                Boolean f = shortVideoGetDeviceBlacklistsResponseDto.f();
                boolean booleanValue2 = f != null ? f.booleanValue() : aVar.getSTUB().d();
                Boolean d = shortVideoGetDeviceBlacklistsResponseDto.d();
                le7 le7Var = new le7(booleanValue, booleanValue2, d != null ? d.booleanValue() : aVar.getSTUB().c());
                this.L$0 = null;
                this.label = 2;
                Object k = myc0.k(hqu0.b(), new ujd(le7Var, null), this);
                if (k != coroutineSingletons) {
                    k = s3q0.a;
                }
            } catch (CancellationException e2) {
                L.f("SyncClipsBlacklistsJob", "Blacklists fetching cancelled", e2);
                throw e2;
            } catch (Exception e3) {
                L.f("SyncClipsBlacklistsJob", "Failed to fetch device blacklists", e3);
                throw e3;
            }
        }
    }

    public fon0(fyx fyxVar) {
        super(fyxVar);
        this.c = new bpn0(new v0f(9));
    }

    @Override // xsna.tsl
    public final void a(Context context) {
        myc0.i(hqu0.b(), new a(null));
    }
}
