package xsna;

import com.vk.dto.common.VideoFileOld;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoDo;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoSlideDo;
import com.vk.onboardingpromo.impl.ui.entity.OnboardingPromoState;
import com.vk.onboardingpromo.impl.ui.store.delegate.MediaType;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.qg80;

/* compiled from: OnboardingPromoInitDelegate.kt */
/* loaded from: classes4.dex */
public final class hg80 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final OnboardingPromoState.CurrentSlide a(OnboardingPromoSlideDo onboardingPromoSlideDo) {
        Long l = null;
        Object[] objArr = 0;
        String type = onboardingPromoSlideDo != null ? onboardingPromoSlideDo.getType() : null;
        return new OnboardingPromoState.CurrentSlide(epx.f(type, MediaType.VIDEO.h()) ? new qg80.c(new VideoFileOld()) : epx.f(type, MediaType.IMAGE.h()) ? new qg80.b("") : qg80.a.a, l, 2, objArr == true ? 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[EDGE_INSN: B:25:0x0069->B:14:0x0069 BREAK  A[LOOP:0: B:18:0x0056->B:24:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(OnboardingPromoDo onboardingPromoDo, ContinuationImpl continuationImpl) {
        eg80 eg80Var;
        int i;
        Iterable iterable;
        Iterator it;
        if (continuationImpl instanceof eg80) {
            eg80Var = (eg80) continuationImpl;
            int i2 = eg80Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eg80Var.label = i2 - Integer.MIN_VALUE;
                Object obj = eg80Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eg80Var.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.a.a(obj);
                    eg80Var.L$0 = null;
                    eg80Var.label = 1;
                    obj = tg80.e(onboardingPromoDo, eg80Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                iterable = (Iterable) obj;
                if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!((File) it.next()).exists()) {
                            z = false;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }
        eg80Var = new eg80(continuationImpl);
        Object obj2 = eg80Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eg80Var.label;
        boolean z2 = true;
        if (i != 0) {
        }
        iterable = (Iterable) obj2;
        if (iterable instanceof Collection) {
        }
        it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        return Boolean.valueOf(z2);
    }
}
