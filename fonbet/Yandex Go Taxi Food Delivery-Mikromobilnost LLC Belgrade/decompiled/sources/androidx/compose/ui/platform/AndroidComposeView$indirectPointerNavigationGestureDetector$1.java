package androidx.compose.ui.platform;

import defpackage.tls;
import defpackage.xtr;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxtr;", "it", "Lzy11;", "invoke-3ESFkO8", "(I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
public final class AndroidComposeView$indirectPointerNavigationGestureDetector$1 extends Lambda implements tls {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$indirectPointerNavigationGestureDetector$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((androidx.compose.ui.focus.c) this.this$0.getFocusOwner()).j(((xtr) obj).d(), false);
        return zy11.a;
    }
}
