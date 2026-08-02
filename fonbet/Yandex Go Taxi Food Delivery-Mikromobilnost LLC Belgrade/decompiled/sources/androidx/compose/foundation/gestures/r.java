package androidx.compose.foundation.gestures;

import defpackage.fwi;
import defpackage.jl40;
import defpackage.kjj;
import defpackage.ny61;
import defpackage.tvd0;
import defpackage.wls;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public abstract class r {
    public final y a;
    public final wls b;
    public fwi c;
    public boolean d;
    public final kjj e = new kjj();

    public r(y yVar, wls wlsVar, fwi fwiVar) {
        this.a = yVar;
        this.b = wlsVar;
        this.c = fwiVar;
    }

    public static void a(tvd0 tvd0Var) {
        List list = tvd0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((zvd0) list.get(i)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(wls wlsVar, ContinuationImpl continuationImpl) {
        NonTouchScrollingLogic$userScroll$1 nonTouchScrollingLogic$userScroll$1;
        int i;
        if (continuationImpl instanceof NonTouchScrollingLogic$userScroll$1) {
            nonTouchScrollingLogic$userScroll$1 = (NonTouchScrollingLogic$userScroll$1) continuationImpl;
            int i2 = nonTouchScrollingLogic$userScroll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nonTouchScrollingLogic$userScroll$1.label = i2 - Integer.MIN_VALUE;
                Object obj = nonTouchScrollingLogic$userScroll$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nonTouchScrollingLogic$userScroll$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.d = true;
                    NonTouchScrollingLogic$userScroll$2 nonTouchScrollingLogic$userScroll$2 = new NonTouchScrollingLogic$userScroll$2(this, wlsVar, null);
                    nonTouchScrollingLogic$userScroll$1.label = 1;
                    if (jl40.O(nonTouchScrollingLogic$userScroll$2, nonTouchScrollingLogic$userScroll$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this.d = false;
                return zy11.a;
            }
        }
        nonTouchScrollingLogic$userScroll$1 = new NonTouchScrollingLogic$userScroll$1(this, continuationImpl);
        Object obj2 = nonTouchScrollingLogic$userScroll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nonTouchScrollingLogic$userScroll$1.label;
        if (i != 0) {
        }
        this.d = false;
        return zy11.a;
    }
}
