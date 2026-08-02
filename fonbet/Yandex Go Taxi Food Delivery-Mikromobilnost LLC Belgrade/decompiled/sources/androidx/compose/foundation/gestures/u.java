package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.f530;
import defpackage.gkp0;
import defpackage.knj;
import defpackage.ny61;
import defpackage.tyo0;
import defpackage.wu60;
import defpackage.xny0;
import defpackage.z890;
import defpackage.zx40;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;

/* loaded from: classes10.dex */
public abstract class u {
    public static final tyo0 a = new tyo0(9);
    public static final gkp0 b = new gkp0();
    public static final knj c = new knj(1);
    public static final z890 d = new z890(1);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(y yVar, long j, ContinuationImpl continuationImpl) {
        ScrollableKt$semanticsScrollBy$1 scrollableKt$semanticsScrollBy$1;
        int i;
        Ref$FloatRef ref$FloatRef;
        y yVar2;
        if (continuationImpl instanceof ScrollableKt$semanticsScrollBy$1) {
            scrollableKt$semanticsScrollBy$1 = (ScrollableKt$semanticsScrollBy$1) continuationImpl;
            int i2 = scrollableKt$semanticsScrollBy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollableKt$semanticsScrollBy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scrollableKt$semanticsScrollBy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scrollableKt$semanticsScrollBy$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ref$FloatRef = new Ref$FloatRef();
                    MutatePriority mutatePriority = MutatePriority.Default;
                    ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(yVar, j, ref$FloatRef, null);
                    scrollableKt$semanticsScrollBy$1.L$0 = yVar;
                    scrollableKt$semanticsScrollBy$1.L$1 = ref$FloatRef;
                    scrollableKt$semanticsScrollBy$1.label = 1;
                    if (yVar.f(mutatePriority, scrollableKt$semanticsScrollBy$2, scrollableKt$semanticsScrollBy$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    yVar2 = yVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) scrollableKt$semanticsScrollBy$1.L$1;
                    y yVar3 = (y) scrollableKt$semanticsScrollBy$1.L$0;
                    kotlin.b.b(obj);
                    ref$FloatRef = ref$FloatRef2;
                    yVar2 = yVar3;
                }
                return new wu60(yVar2.h(ref$FloatRef.element));
            }
        }
        scrollableKt$semanticsScrollBy$1 = new ScrollableKt$semanticsScrollBy$1(continuationImpl);
        Object obj2 = scrollableKt$semanticsScrollBy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scrollableKt$semanticsScrollBy$1.label;
        if (i != 0) {
        }
        return new wu60(yVar2.h(ref$FloatRef.element));
    }

    public static f530 b(xny0 xny0Var, Orientation orientation, boolean z, boolean z2, zx40 zx40Var) {
        return new t(xny0Var, orientation, z, z2, zx40Var);
    }
}
