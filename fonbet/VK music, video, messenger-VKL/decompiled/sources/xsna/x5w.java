package xsna;

import androidx.lifecycle.Lifecycle;
import com.vk.im.engine.models.c;

/* compiled from: ImItemListFragmentFix.kt */
/* loaded from: classes18.dex */
public final class x5w implements c.b {
    public final /* synthetic */ y5w a;

    public x5w(y5w y5wVar) {
        this.a = y5wVar;
    }

    @Override // com.vk.im.engine.models.c.b
    public final void a() {
        y5w y5wVar = this.a;
        if (y5wVar.a.getViewLifecycleOwner().getLifecycle().getCurrentState().a(Lifecycle.State.CREATED)) {
            y5wVar.a();
        }
    }

    @Override // com.vk.im.engine.models.c.b
    public final void j() {
    }
}
