package androidx.compose.ui.platform;

import defpackage.g2m0;
import defpackage.i2m0;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
final class DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 extends Lambda implements sls {
    final /* synthetic */ g2m0 $androidxRegistry;
    final /* synthetic */ String $key;
    final /* synthetic */ boolean $registered;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(boolean z, g2m0 g2m0Var, String str) {
        super(0);
        this.$registered = z;
        this.$androidxRegistry = g2m0Var;
        this.$key = str;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        if (this.$registered) {
            g2m0 g2m0Var = this.$androidxRegistry;
            String str = this.$key;
            i2m0 i2m0Var = g2m0Var.a;
            synchronized (i2m0Var.c) {
            }
        }
        return zy11.a;
    }
}
