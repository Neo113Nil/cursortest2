package defpackage;

import com.yandex.fintechsdk.flows.payment.kit.internal.widget.e;
import com.yandex.quark.webchat.WebChatAudioFocusManager$getAudioFocusStateFlow$$inlined$combine$1$3;
import com.ybsdk.feature.transfer.version2.internal.domain.a;
import com.ybsdk.feature.transfer.version2.internal.domain.b;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.c;
import defpackage.zo41;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.internal.j;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.d;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.k;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.l;

/* loaded from: classes5.dex */
public final class g801 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g801(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Object collect = ((m0) obj2).collect(new d(vprVar, (k) obj), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = ((tpr) obj2).collect(new l(vprVar, (b801) obj), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = ((tpr) obj2).collect(new a(vprVar, (b) obj), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            case 3:
                Object collect4 = ((tpr) obj2).collect(new com.ybsdk.feature.transfer.version2.internal.screens.phone.a(vprVar, (c) obj), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
            case 4:
                Object collect5 = ((cdz0) obj2).collect(new com.yandex.plus.home.feature.webviews.internal.treasury.b(vprVar, (com.yandex.plus.home.feature.webviews.internal.treasury.c) obj), continuation);
                return collect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect5 : zy11Var;
            case 5:
                Object collect6 = ((g) obj2).collect(new ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.data.a(vprVar, (te11) obj), continuation);
                return collect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect6 : zy11Var;
            case 6:
                Object collect7 = ((rol0) obj2).collect(new com.yandex.messaging.domain.statuses.k(vprVar, (yt21) obj), continuation);
                return collect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect7 : zy11Var;
            case 7:
                final tpr[] tprVarArr = (tpr[]) obj2;
                Object a = j.a(vprVar, new sls() { // from class: com.yandex.quark.webchat.WebChatAudioFocusManager$getAudioFocusStateFlow$$inlined$combine$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        return new zo41[tprVarArr.length];
                    }
                }, new WebChatAudioFocusManager$getAudioFocusStateFlow$$inlined$combine$1$3(null, (sc41) obj), continuation, tprVarArr);
                return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11Var;
            default:
                Object collect8 = ((tpr) obj2).collect(new com.yandex.fintechsdk.flows.payment.kit.internal.widget.c(vprVar, (e) obj), continuation);
                return collect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect8 : zy11Var;
        }
    }
}
