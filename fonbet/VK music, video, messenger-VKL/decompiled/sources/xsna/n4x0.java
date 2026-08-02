package xsna;

import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.ui.VoipViewModelState;
import java.util.List;
import xsna.nhw0;

/* compiled from: VoipViewModel.kt */
/* loaded from: classes7.dex */
public final class n4x0 {
    public final dhw0 a;
    public final VoipViewModelState b;
    public final List<CallMember> c;
    public final nhw0.a d;

    public n4x0(VoipViewModelState voipViewModelState, List list, dhw0 dhw0Var, nhw0.a aVar) {
        this.a = dhw0Var;
        this.b = voipViewModelState;
        this.c = list;
        this.d = aVar;
    }

    public final nhw0.a a() {
        return this.d;
    }

    public final dhw0 b() {
        return this.a;
    }

    public final List<CallMember> c() {
        return this.c;
    }

    public final VoipViewModelState d() {
        return this.b;
    }
}
