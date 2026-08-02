package defpackage;

import androidx.compose.foundation.gestures.i;
import androidx.compose.foundation.gestures.z;
import androidx.compose.foundation.text.selection.d;
import androidx.compose.foundation.text.selection.j;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationSwipeDirection;
import com.yandex.go.ai_widget.ui.component.b;
import defpackage.fp1;
import defpackage.oz40;
import defpackage.tje;
import defpackage.w511;
import defpackage.wu60;
import defpackage.zvd0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public final class ip1 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ip1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.yandex.go.ai_widget.ui.component.c] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                final b bVar = (b) obj;
                return i.h(hwd0Var, null, new sls() { // from class: com.yandex.go.ai_widget.ui.component.c
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
                    @Override // defpackage.sls
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke() {
                        boolean z;
                        b bVar2 = b.this;
                        float f = bVar2.e;
                        oz40 oz40Var = bVar2.j;
                        androidx.compose.animation.core.a aVar = bVar2.c;
                        if (!bVar2.g() && bVar2.f() == null) {
                            boolean z2 = false;
                            if (((Number) aVar.e()).floatValue() > f) {
                                AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection = AiWidgetEvaluationSwipeDirection.RIGHT;
                                if (bVar2.c() == null || bVar2.c() == aiWidgetEvaluationSwipeDirection) {
                                    z = true;
                                    if (((Number) aVar.e()).floatValue() < (-f)) {
                                        AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection2 = AiWidgetEvaluationSwipeDirection.LEFT;
                                        if (bVar2.c() == null || bVar2.c() == aiWidgetEvaluationSwipeDirection2) {
                                            z2 = true;
                                        }
                                    }
                                    if (!z) {
                                        AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection3 = AiWidgetEvaluationSwipeDirection.RIGHT;
                                        if (!bVar2.g()) {
                                            oz40Var.setValue(Boolean.TRUE);
                                            bVar2.h(new AiWidgetEvaluationSwipeState$commitSwipe$1(bVar2, aiWidgetEvaluationSwipeDirection3, null));
                                        }
                                    } else if (z2) {
                                        AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection4 = AiWidgetEvaluationSwipeDirection.LEFT;
                                        if (!bVar2.g()) {
                                            oz40Var.setValue(Boolean.TRUE);
                                            bVar2.h(new AiWidgetEvaluationSwipeState$commitSwipe$1(bVar2, aiWidgetEvaluationSwipeDirection4, null));
                                        }
                                    } else {
                                        bVar2.h(new AiWidgetEvaluationSwipeState$animateBackToOrigin$1(bVar2, null));
                                    }
                                }
                            }
                            z = false;
                            if (((Number) aVar.e()).floatValue() < (-f)) {
                            }
                            if (!z) {
                            }
                        }
                        return zy11.a;
                    }
                }, new wls() { // from class: com.yandex.go.ai_widget.ui.component.d
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
                    
                        if (r1 > 0.0f) goto L19;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
                    
                        r1 = 0.0f;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
                    
                        if (r1 < 0.0f) goto L19;
                     */
                    @Override // defpackage.wls
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj2, Object obj3) {
                        ((zvd0) obj2).a();
                        long j = ((wu60) obj3).a;
                        b bVar2 = b.this;
                        if (!bVar2.g() && bVar2.f() == null) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((Number) bVar2.c.e()).floatValue();
                            AiWidgetEvaluationSwipeDirection c = bVar2.c();
                            int i2 = c == null ? -1 : fp1.a[c.ordinal()];
                            if (i2 != -1) {
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        w511.b();
                                        return null;
                                    }
                                }
                            }
                            tje.N(bVar2.a, null, null, new AiWidgetEvaluationSwipeState$onDrag$1(bVar2, intBitsToFloat, Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + ((Number) bVar2.d.e()).floatValue(), null), 3);
                        }
                        return zy11.a;
                    }
                }, continuation, 5);
            case 1:
                Object j = i.j(hwd0Var, new loj(6, (ysm) obj), continuation);
                return j == CoroutineSingletons.COROUTINE_SUSPENDED ? j : zy11Var;
            case 2:
                j jVar = (j) obj;
                Object c = d.c(hwd0Var, jVar.A, jVar.z, continuation);
                return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11Var;
            default:
                return z.f(hwd0Var, null, null, new ec01(18, (tls) obj), continuation, 7);
        }
    }
}
