package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.lsf0;

/* compiled from: MultiAccountRelatedPinCodeEventsSubscriberImpl.kt */
/* loaded from: classes6.dex */
public final class v240 implements u240 {

    /* compiled from: MultiAccountRelatedPinCodeEventsSubscriberImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<exv0, lsf0> {
        @Override // xsna.izs
        public final lsf0 invoke(exv0 exv0Var) {
            exv0 exv0Var2 = exv0Var;
            ((v240) this.receiver).getClass();
            return exv0Var2 instanceof zwv0 ? lsf0.a.a : exv0Var2 instanceof nvv0 ? lsf0.b.a : lsf0.c.a;
        }
    }

    @Override // xsna.u240
    public final io.reactivex.rxjava3.core.q<lsf0> a() {
        return fxv0.a.a.U(new kf3(new a(1, this, v240.class, "mapToPublic", "mapToPublic(Lcom/vk/superapp/browser/utils/VkUiRxEvent;)Lcom/vk/superapp/multiaccount/api/RelatedPinCodeEvents;", 0), 28));
    }
}
