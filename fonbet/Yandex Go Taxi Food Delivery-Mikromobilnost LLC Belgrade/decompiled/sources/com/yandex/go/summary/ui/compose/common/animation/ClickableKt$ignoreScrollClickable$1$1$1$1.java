package com.yandex.go.summary.ui.compose.common.animation;

import androidx.compose.foundation.gestures.z;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.f;
import defpackage.ay40;
import defpackage.ey91;
import defpackage.ixe0;
import defpackage.jxe0;
import defpackage.kxe0;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tvd0;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zvd0;
import defpackage.zx40;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.common.animation.ClickableKt$ignoreScrollClickable$1$1$1$1", f = "Clickable.kt", l = {HProv.PP_LCD_QUERY, 143}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ClickableKt$ignoreScrollClickable$1$1$1$1 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ m3u0 $latestInteractionSource$delegate;
    final /* synthetic */ m3u0 $latestOnClick$delegate;
    final /* synthetic */ m3u0 $latestTouchSlop$delegate;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$ignoreScrollClickable$1$1$1$1(m3u0 m3u0Var, m3u0 m3u0Var2, m3u0 m3u0Var3, Continuation continuation) {
        super(2, continuation);
        this.$latestInteractionSource$delegate = m3u0Var;
        this.$latestTouchSlop$delegate = m3u0Var2;
        this.$latestOnClick$delegate = m3u0Var3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ClickableKt$ignoreScrollClickable$1$1$1$1 clickableKt$ignoreScrollClickable$1$1$1$1 = new ClickableKt$ignoreScrollClickable$1$1$1$1(this.$latestInteractionSource$delegate, this.$latestTouchSlop$delegate, this.$latestOnClick$delegate, continuation);
        clickableKt$ignoreScrollClickable$1$1$1$1.L$0 = obj;
        return clickableKt$ignoreScrollClickable$1$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ClickableKt$ignoreScrollClickable$1$1$1$1) create((f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
    
        if (r15 != r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0034, code lost:
    
        if (r15 == r1) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0108  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0060 -> B:6:0x0063). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jxe0 jxe0Var;
        int i;
        zvd0 zvd0Var;
        Object obj2;
        f fVar = (f) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 1;
        if (i2 == 0) {
            kotlin.b.b(obj);
            this.L$0 = fVar;
            this.label = 1;
            obj = z.b(fVar, null, this, 2);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$0;
                jxe0Var = (jxe0) this.L$2;
                zvd0Var = (zvd0) this.L$1;
                kotlin.b.b(obj);
                tvd0 tvd0Var = (tvd0) obj;
                Iterator it = tvd0Var.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (ey91.e(((zvd0) obj2).a, zvd0Var.a)) {
                        break;
                    }
                }
                zvd0 zvd0Var2 = (zvd0) obj2;
                if (zvd0Var2 != null) {
                    if (wu60.d(wu60.e(zvd0Var2.c, zvd0Var.c)) > ((Number) this.$latestTouchSlop$delegate.getValue()).floatValue()) {
                        ((ay40) ((zx40) this.$latestInteractionSource$delegate.getValue())).b(new ixe0(jxe0Var));
                        if (i3 == 0) {
                            ((ay40) ((zx40) this.$latestInteractionSource$delegate.getValue())).b(new kxe0(jxe0Var));
                        }
                        return zy11.a;
                    }
                    if (zvd0Var2.d) {
                        List list = tvd0Var.a;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (((zvd0) it2.next()).d) {
                                    this.L$0 = fVar;
                                    this.L$1 = zvd0Var;
                                    this.L$2 = jxe0Var;
                                    this.I$0 = i;
                                    this.label = 2;
                                    obj = fVar.a(PointerEventPass.Main, this);
                                }
                            }
                        }
                    } else {
                        ((ay40) ((zx40) this.$latestInteractionSource$delegate.getValue())).b(new kxe0(jxe0Var));
                        ((sls) this.$latestOnClick$delegate.getValue()).invoke();
                    }
                }
                i3 = i;
                if (i3 == 0) {
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        zvd0 zvd0Var3 = (zvd0) obj;
        jxe0 jxe0Var2 = new jxe0(zvd0Var3.c);
        ((ay40) ((zx40) this.$latestInteractionSource$delegate.getValue())).b(jxe0Var2);
        jxe0Var = jxe0Var2;
        i = 0;
        zvd0Var = zvd0Var3;
        this.L$0 = fVar;
        this.L$1 = zvd0Var;
        this.L$2 = jxe0Var;
        this.I$0 = i;
        this.label = 2;
        obj = fVar.a(PointerEventPass.Main, this);
    }
}
