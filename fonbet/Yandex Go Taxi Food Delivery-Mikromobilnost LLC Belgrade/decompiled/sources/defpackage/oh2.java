package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import com.yandex.go.navigation.api.router.FragmentAnimation$TransitionType;

/* loaded from: classes8.dex */
public final class oh2 implements q {
    public final /* synthetic */ ddf a;
    public final /* synthetic */ o950 b;

    public oh2(ddf ddfVar, o950 o950Var) {
        this.a = ddfVar;
        this.b = o950Var;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        Lifecycle.Event event2 = Lifecycle.Event.ON_START;
        ddf ddfVar = this.a;
        if (event == event2 && ((FragmentAnimation$TransitionType) ddfVar.b) == null) {
            ddfVar.b = FragmentAnimation$TransitionType.ENTER;
        }
        if (event == Lifecycle.Event.ON_STOP && ((FragmentAnimation$TransitionType) ddfVar.b) == null) {
            ddfVar.b = FragmentAnimation$TransitionType.RETURN;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            ddfVar.b = null;
            this.b.d(this);
        }
    }
}
