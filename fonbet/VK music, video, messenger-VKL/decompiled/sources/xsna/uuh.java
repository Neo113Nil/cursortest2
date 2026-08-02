package xsna;

import com.vk.log.L;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: CommunityProfileVideoItemViewHolder.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class uuh extends AdaptedFunctionReference implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uuh(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((io.reactivex.rxjava3.disposables.g) this.receiver).b((io.reactivex.rxjava3.disposables.c) obj);
                break;
            default:
                L.E((Throwable) obj, new Object[0]);
                break;
        }
        return s3q0.a;
    }
}
