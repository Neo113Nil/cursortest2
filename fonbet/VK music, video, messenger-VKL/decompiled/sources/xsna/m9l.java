package xsna;

import com.vk.log.L;
import java.util.concurrent.CompletableFuture;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: DeepLinkRouter.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class m9l extends AdaptedFunctionReference implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9l(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((CompletableFuture) this.receiver).complete((i9l) obj);
                break;
            default:
                L.E((Throwable) obj, new Object[0]);
                break;
        }
        return s3q0.a;
    }
}
