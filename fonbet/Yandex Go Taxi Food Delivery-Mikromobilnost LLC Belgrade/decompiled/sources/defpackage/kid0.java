package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import com.yandex.plus.core.activity.result.internal.d;

/* loaded from: classes8.dex */
public final class kid0 implements q {
    public final /* synthetic */ d a;

    public kid0(d dVar) {
        this.a = dVar;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        int i = jid0.a[event.ordinal()];
        d dVar = this.a;
        switch (i) {
            case 1:
                dVar.b = Lifecycle.State.CREATED;
                break;
            case 2:
                dVar.b = Lifecycle.State.STARTED;
                break;
            case 3:
                dVar.b = Lifecycle.State.RESUMED;
                break;
            case 4:
                dVar.b = Lifecycle.State.STARTED;
                break;
            case 5:
                dVar.b = Lifecycle.State.CREATED;
                break;
            case 6:
                dVar.b = Lifecycle.State.DESTROYED;
                peyVar.getLifecycle().d(this);
                break;
            case 7:
                break;
            default:
                w511.b();
                break;
        }
    }
}
