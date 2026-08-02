package xsna;

import android.content.ComponentName;
import kotlin.jvm.internal.Lambda;

/* compiled from: PushIPCClientImpl.kt */
/* loaded from: classes5.dex */
public final class eie0 extends Lambda implements izs<String, ComponentName> {
    final /* synthetic */ uie0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eie0(uie0 uie0Var) {
        super(1);
        this.this$0 = uie0Var;
    }

    @Override // xsna.izs
    public final ComponentName invoke(String str) {
        return uie0.n(this.this$0, str);
    }
}
