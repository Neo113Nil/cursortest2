package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes11.dex */
public final class t52 extends Lambda implements izs<dxr, Boolean> {
    final /* synthetic */ int $focusDirection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t52(int i) {
        super(1);
        this.$focusDirection = i;
    }

    @Override // xsna.izs
    public final Boolean invoke(dxr dxrVar) {
        return Boolean.valueOf(dxrVar.v1(this.$focusDirection));
    }
}
