package xsna;

import com.vk.libvideo.design.compose.base.preview.PreviewViewState;

/* compiled from: Effects.kt */
/* loaded from: classes2.dex */
public final class e6d0 implements kgn {
    public final /* synthetic */ wh50 a;
    public final /* synthetic */ PreviewViewState.v b;

    public e6d0(wh50 wh50Var, PreviewViewState.v vVar) {
        this.a = wh50Var;
        this.b = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.kgn
    public final void dispose() {
        gzs<? extends s3q0> h;
        if (!((Boolean) this.a.getValue()).booleanValue() || (h = this.b.a().h()) == null) {
            return;
        }
        h.invoke();
    }
}
