package androidx.compose.ui.scrollcapture;

import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class a {
    public final int a;
    public final wls b;
    public float c;

    public a(wls wlsVar, int i) {
        this.a = i;
        this.b = wlsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(float f, ContinuationImpl continuationImpl) {
        RelativeScroller$scrollBy$1 relativeScroller$scrollBy$1;
        int i;
        if (continuationImpl instanceof RelativeScroller$scrollBy$1) {
            relativeScroller$scrollBy$1 = (RelativeScroller$scrollBy$1) continuationImpl;
            int i2 = relativeScroller$scrollBy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                relativeScroller$scrollBy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = relativeScroller$scrollBy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = relativeScroller$scrollBy$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Float f2 = new Float(f);
                    relativeScroller$scrollBy$1.label = 1;
                    obj = ((ComposeScrollCaptureCallback$scrollTracker$1) this.b).invoke(f2, relativeScroller$scrollBy$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this.c += ((Number) obj).floatValue();
                return zy11.a;
            }
        }
        relativeScroller$scrollBy$1 = new RelativeScroller$scrollBy$1(this, continuationImpl);
        Object obj2 = relativeScroller$scrollBy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = relativeScroller$scrollBy$1.label;
        if (i != 0) {
        }
        this.c += ((Number) obj2).floatValue();
        return zy11.a;
    }
}
