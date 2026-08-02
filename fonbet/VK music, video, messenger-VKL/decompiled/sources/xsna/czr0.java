package xsna;

import com.vk.api.generated.video.dto.VideoGetUserInfoResponseDto;
import com.vk.api.generated.video.dto.VideoUserInfoSubscriptionDto;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.dzr0;

/* compiled from: VideoAdFreeSubscriptionRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class czr0 implements zyr0 {
    public final uft0 a;

    public czr0(uft0 uft0Var) {
        this.a = uft0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[Catch: all -> 0x0029, CancellationException -> 0x002c, TimeoutCancellationException -> 0x002f, TryCatch #2 {TimeoutCancellationException -> 0x002f, CancellationException -> 0x002c, all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0053, B:13:0x005b, B:15:0x0069, B:18:0x0071, B:21:0x0079, B:23:0x007f, B:29:0x008c, B:31:0x0099, B:35:0x009f, B:38:0x00a8, B:41:0x00b0, B:43:0x00b6, B:44:0x00bb, B:47:0x00bf, B:53:0x003d), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069 A[Catch: all -> 0x0029, CancellationException -> 0x002c, TimeoutCancellationException -> 0x002f, TRY_LEAVE, TryCatch #2 {TimeoutCancellationException -> 0x002f, CancellationException -> 0x002c, all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0053, B:13:0x005b, B:15:0x0069, B:18:0x0071, B:21:0x0079, B:23:0x007f, B:29:0x008c, B:31:0x0099, B:35:0x009f, B:38:0x00a8, B:41:0x00b0, B:43:0x00b6, B:44:0x00bb, B:47:0x00bf, B:53:0x003d), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: all -> 0x0029, CancellationException -> 0x002c, TimeoutCancellationException -> 0x002f, TRY_LEAVE, TryCatch #2 {TimeoutCancellationException -> 0x002f, CancellationException -> 0x002c, all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0053, B:13:0x005b, B:15:0x0069, B:18:0x0071, B:21:0x0079, B:23:0x007f, B:29:0x008c, B:31:0x0099, B:35:0x009f, B:38:0x00a8, B:41:0x00b0, B:43:0x00b6, B:44:0x00bb, B:47:0x00bf, B:53:0x003d), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // xsna.zyr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        azr0 azr0Var;
        int i;
        VideoUserInfoSubscriptionDto d;
        try {
            if (continuationImpl instanceof azr0) {
                azr0Var = (azr0) continuationImpl;
                int i2 = azr0Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    azr0Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = azr0Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = azr0Var.label;
                    boolean z = true;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        ovj b = hqu0.b();
                        bzr0 bzr0Var = new bzr0(this, null);
                        azr0Var.I$0 = 0;
                        azr0Var.I$1 = 0;
                        azr0Var.label = 1;
                        obj = myc0.k(b, bzr0Var, azr0Var);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    d = ((VideoGetUserInfoResponseDto) obj).d();
                    if (d == null ? epx.f(d.j(), Boolean.TRUE) : false) {
                        return dzr0.a.a;
                    }
                    String str = "";
                    if (!d.i()) {
                        String d2 = d.d();
                        if (d2 == null) {
                            d2 = "";
                        }
                        String g = d.g();
                        if (g != null) {
                            str = g;
                        }
                        Float f = d.f();
                        return new dzr0.b(d2, str, f != null ? (int) f.floatValue() : 0);
                    }
                    String d3 = d.d();
                    if (d3 != null) {
                        str = d3;
                    }
                    Integer e = d.e();
                    if (e != null) {
                        if (e.intValue() <= 1) {
                            z = false;
                        }
                        if ((z ? e : null) != null) {
                            new Long(r3.intValue() * 1000);
                        }
                    }
                    return new dzr0.c(str);
                }
            }
            if (i != 0) {
            }
            d = ((VideoGetUserInfoResponseDto) obj).d();
            if (d == null ? epx.f(d.j(), Boolean.TRUE) : false) {
            }
        } catch (TimeoutCancellationException e2) {
            return new Result.Failure(e2);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        azr0Var = new azr0(this, continuationImpl);
        Object obj2 = azr0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = azr0Var.label;
        boolean z2 = true;
    }
}
