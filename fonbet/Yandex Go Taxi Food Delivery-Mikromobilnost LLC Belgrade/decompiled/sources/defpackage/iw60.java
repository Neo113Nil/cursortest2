package defpackage;

import com.yandex.plus.core.network.okhttp.interceptor.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class iw60 implements uv50 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iw60(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uv50
    public final Object a(tv50 tv50Var, ContinuationImpl continuationImpl) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((a) obj).e(tv50Var, continuationImpl);
            case 1:
                return ((a) obj).a(tv50Var, continuationImpl);
            default:
                return ((zls) obj).invoke(((com.yandex.plus.core.network.interceptor.a) tv50Var).a, ((com.yandex.plus.core.network.interceptor.a) tv50Var).b, continuationImpl);
        }
    }
}
