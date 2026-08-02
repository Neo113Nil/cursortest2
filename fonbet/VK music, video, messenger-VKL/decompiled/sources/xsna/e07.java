package xsna;

import com.vk.core.view.VkCheckableButton;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.z430;

/* compiled from: BigPlayerActions.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class e07 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e07(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        jdo jdoVar;
        switch (this.b) {
            case 0:
                break;
            case 1:
                ((x530) this.receiver).a.b(z430.c.a);
                break;
            case 2:
                break;
            case 3:
                ((VkCheckableButton) this.receiver).toggle();
                break;
            case 4:
                ((com.vk.voip.ui.c) this.receiver).B0();
                break;
            case 5:
                zvd0 zvd0Var = (zvd0) this.receiver;
                int i = zvd0.r;
                if (!((pxo0) zvd0Var.p.getValue()).a() && (jdoVar = zvd0Var.q) != null) {
                    zvd0Var.l.invoke(jdoVar);
                }
                break;
            default:
                jkv0 jkv0Var = (jkv0) this.receiver;
                j8z j8zVar = jkv0.i;
                jkv0Var.b();
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e07(Object obj, int i) {
        super(0, obj, g950.class, "hasMusicSubscriptionForOffline", "hasMusicSubscriptionForOffline()Z", 0);
        this.b = i;
        switch (i) {
            case 4:
                super(0, obj, com.vk.voip.ui.c.class, "micOn", "micOn()V", 0);
                break;
            case 5:
                super(0, obj, zvd0.class, "onDraftEditConfirmed", "onDraftEditConfirmed()V", 0);
                break;
            default:
                break;
        }
    }
}
