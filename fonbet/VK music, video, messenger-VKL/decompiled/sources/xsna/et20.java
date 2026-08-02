package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;

/* compiled from: MlEnhanceServerTask.kt */
/* loaded from: classes15.dex */
public final class et20 implements hx2<Boolean> {
    public final /* synthetic */ dt20 b;
    public final /* synthetic */ l6u c;

    public et20(dt20 dt20Var, l6u l6uVar) {
        this.b = dt20Var;
        this.c = l6uVar;
    }

    @Override // xsna.hx2
    public final void b(Boolean bool) {
        bool.booleanValue();
        this.b.d = null;
    }

    @Override // xsna.hx2
    public final void e(VKApiExecutionException vKApiExecutionException) {
        this.b.d = null;
        this.c.invoke(vKApiExecutionException.getCause());
    }
}
