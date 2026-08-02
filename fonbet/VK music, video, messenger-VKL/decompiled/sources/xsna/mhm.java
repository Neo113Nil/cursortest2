package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogMember;
import java.util.Comparator;
import xsna.ohm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class mhm implements Comparator {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mhm(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Peer peer = (Peer) obj3;
                DialogMember dialogMember = (DialogMember) obj;
                DialogMember dialogMember2 = (DialogMember) obj2;
                boolean f = epx.f(dialogMember.b, peer);
                boolean f2 = epx.f(dialogMember2.b, peer);
                bpn0 bpn0Var = ohm.c;
                int g = epx.g(ohm.a.b(dialogMember, f), ohm.a.b(dialogMember2, f2));
                return g == 0 ? epx.h(dialogMember.d, dialogMember2.d) : g;
            default:
                return ((Number) ((nde) obj3).invoke(obj, obj2)).intValue();
        }
    }
}
