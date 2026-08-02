package defpackage;

import android.content.Context;
import com.yandex.go.design.compose.integration.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class kgd implements igd {
    public final a a;

    public kgd(Context context, yvf0 yvf0Var) {
        this.a = new a(context, kotlin.a.a(new jgd(yvf0Var, 0)));
    }

    @Override // defpackage.igd
    public final Object a(tbv tbvVar, kfv kfvVar, mgd mgdVar, Continuation continuation) {
        return this.a.a(tbvVar, kfvVar, mgdVar, (ContinuationImpl) continuation);
    }
}
