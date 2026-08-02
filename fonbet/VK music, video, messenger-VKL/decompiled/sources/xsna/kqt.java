package xsna;

import com.vk.voip.ui.VoipViewModelState;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.iqt;

/* compiled from: GetCallParticipantsLockImpl.kt */
/* loaded from: classes11.dex */
public final class kqt implements iqt {
    public final com.vk.voip.ui.c a;
    public whr0 c;
    public final io.reactivex.rxjava3.subjects.d<iqt.a> b = io.reactivex.rxjava3.subjects.d.N0();
    public Collection<String> d = EmptyList.b;

    public kqt(com.vk.voip.ui.c cVar) {
        this.a = cVar;
    }

    @Override // xsna.iqt
    public final Map<String, whr0> a(Collection<String> collection) {
        this.d = collection;
        whr0 whr0Var = this.c;
        return (whr0Var == null || !collection.contains(whr0Var.f())) ? jgp.b : on00.f(new Pair(whr0Var.f(), whr0Var));
    }

    @Override // xsna.iqt
    public final io.reactivex.rxjava3.subjects.d b() {
        return this.b;
    }

    @Override // xsna.iqt
    public final boolean c() {
        this.a.getClass();
        VoipViewModelState voipViewModelState = com.vk.voip.ui.c.K0;
        return this.c != null && (!voipViewModelState.i() || voipViewModelState == VoipViewModelState.ReceivingCallFromPeer);
    }
}
