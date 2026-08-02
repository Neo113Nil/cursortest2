package xsna;

import com.vk.video.ui.upload.impl.publish.domain.model.VideoAuthorDo;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AuthorDelegate.kt */
/* loaded from: classes7.dex */
public final class a85 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(gce0 gce0Var, VideoAuthorDo videoAuthorDo, ContinuationImpl continuationImpl) {
        z75 z75Var;
        int i;
        Object a;
        Throwable a2;
        if (continuationImpl instanceof z75) {
            z75Var = (z75) continuationImpl;
            int i2 = z75Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z75Var.label = i2 - Integer.MIN_VALUE;
                Object obj = z75Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = z75Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ice0 ice0Var = gce0Var.e;
                    z75Var.L$0 = gce0Var;
                    z75Var.L$1 = videoAuthorDo;
                    z75Var.label = 1;
                    a = ice0Var.a(z75Var);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    videoAuthorDo = (VideoAuthorDo) z75Var.L$1;
                    gce0Var = (gce0) z75Var.L$0;
                    kotlin.a.a(obj);
                    a = ((Result) obj).d();
                }
                if (!(a instanceof Result.Failure)) {
                    rdi.y(gce0Var, new c5(gce0Var, (List) a, videoAuthorDo, 1));
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    if (h03.a(a2)) {
                        rdi.y(gce0Var, new i0r(24));
                    }
                    com.vk.metrics.eventtracking.b.a.a(a2);
                }
                return a;
            }
        }
        z75Var = new z75(continuationImpl);
        Object obj2 = z75Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = z75Var.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return a;
    }
}
