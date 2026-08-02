package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.miniinfo.MiniInfoCell$Mode;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.gl.tf.Tensorflow;
import xsna.ar20;
import xsna.jbb0;
import xsna.q630;
import xsna.zq20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class r67 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r67(int i, int i2, Object obj, izs izsVar, q630 q630Var) {
        this.b = i2;
        this.d = obj;
        this.c = izsVar;
        this.e = q630Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding.g) this.d).i((w67) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((wab0) this.d).h((jbb0.a.C3112a) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                wye0.a((ewh) this.d, (q630) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                o7i0.a((k7i0) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                q8k0.a((e9k0) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                Ref$LongRef ref$LongRef = (Ref$LongRef) this.e;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1271402737, intValue, -1, "com.vk.ecomm.market.good.ui.holder.StockAmountHolder.ContentRedesigned.<anonymous> (StockAmountHolder.kt:99)");
                    }
                    zq20 a = zq20.a.a((lg90) ref$ObjectRef.element, new l5g(ref$LongRef.element), null, aVar, 24584, 12);
                    String str = (String) ref$ObjectRef2.element;
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new wfl0(0);
                        aVar.R(x);
                    }
                    b4v0.a(ar20.a.a(str, false, false, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), aVar, 196608, 14), MiniInfoCell$Mode.Base, txj0.f(q630.a.a, 1.0f), a, null, null, null, aVar, Tensorflow.FRAME_WIDTH, 112);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ r67(Object obj, Object obj2, izs izsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = izsVar;
    }

    public /* synthetic */ r67(Ref$ObjectRef ref$ObjectRef, Ref$LongRef ref$LongRef, Ref$ObjectRef ref$ObjectRef2) {
        this.b = 5;
        this.d = ref$ObjectRef;
        this.e = ref$LongRef;
        this.c = ref$ObjectRef2;
    }
}
