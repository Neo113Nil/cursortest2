package xsna;

import android.content.Context;
import com.vk.bridges.di.BridgeComponent;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.im.ui.bridges.MaxButtonVariants;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.cdw0;
import xsna.gy50;
import xsna.l1x0;
import xsna.o0r0;
import xsna.otw0;
import xsna.qkw0;
import xsna.tww0;
import xsna.utw0;
import xsna.vyw0;
import xsna.xn50;
import xsna.z0x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class whw0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ whw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((zhw0) obj2).T(jiw0.b);
                return s3q0.a;
            case 1:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj2;
                x49 x49Var = (x49) obj;
                if (x49Var instanceof whg) {
                    yhg yhgVar = voipCallServiceFragment.W;
                    (yhgVar != null ? yhgVar : null).a((whg) x49Var);
                } else if (x49Var instanceof f6h0) {
                    ((l6h0) voipCallServiceFragment.V.getValue()).a((f6h0) x49Var);
                } else {
                    int i2 = VoipCallServiceFragment.Y;
                    if (x49Var instanceof eiw0) {
                        eiw0 eiw0Var = (eiw0) x49Var;
                        g2v.c().j().l(voipCallServiceFragment.requireContext(), eiw0Var.a, eiw0Var.b, MaxButtonVariants.ForAnyone);
                    } else if (x49Var instanceof fiw0) {
                        hd60.a().y1(voipCallServiceFragment.requireContext());
                    } else if (x49Var instanceof diw0) {
                        Context requireContext = voipCallServiceFragment.requireContext();
                        Peer.Member member = ((diw0) x49Var).a;
                        int i3 = l1x0.k1;
                        new l1x0.a(requireContext, member, false).I0("VoipShareLinkPagerBottomSheet");
                    } else if (x49Var instanceof ciw0) {
                        ciw0 ciw0Var = (ciw0) x49Var;
                        ((BridgeComponent) m7m.d(voipCallServiceFragment).a(fpf0.a(BridgeComponent.class))).F().m(voipCallServiceFragment.requireContext(), ciw0Var.a, new o0r0.a(false, null, null, null, new SearchStatsLoggingInfo(null, 0, SchemeStat$EventItem.Type.CLICK_ITEM, 0L, ciw0Var.b, MobileOfficialAppsCoreNavStat$EventScreen.CALLS, "except_friends", false, false, 395, null), null, null, false, false, false, false, null, null, null, 65519));
                    }
                }
                return s3q0.a;
            case 2:
                ((mjw0) obj2).S0.a(gy50.c.a);
                return s3q0.a;
            case 3:
                ((akw0) obj2).c.a((fh8) ((it80) obj).a);
                return s3q0.a;
            case 4:
                utw0 utw0Var = (utw0) obj;
                vtw0 vtw0Var = ((qtw0) obj2).j1;
                if (vtw0Var != null) {
                    Context context = vtw0Var.a;
                    if (utw0Var instanceof utw0.e) {
                        UserId userId = ((utw0.e) utw0Var).a;
                        com.vk.voip.ui.c.b.getClass();
                        com.vk.voip.ui.c.J().b(new h1(3, context, userId));
                    } else if (utw0Var instanceof utw0.c) {
                        new cdw0.a(context, ((utw0.c) utw0Var).a).I0(null);
                    } else if (utw0Var instanceof utw0.b) {
                        new otw0.a(context, ((utw0.b) utw0Var).a).I0("VoipParticipantSettingsAccessRightsModalDialog");
                    } else if (utw0Var instanceof utw0.d) {
                        new qkw0.a(context, ((utw0.d) utw0Var).a).I0("VoipCallsExcludeParticipantDialog");
                    } else {
                        if (!(utw0Var instanceof utw0.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        vtw0Var.b.invoke();
                    }
                }
                return s3q0.a;
            case 5:
                Throwable th = (Throwable) obj;
                pww0.U(th);
                ((pww0) obj2).T(new tww0.j.a(th));
                return s3q0.a;
            case 6:
                ((w0x0) obj2).T(new z0x0.a.C4148a((Throwable) obj));
                return s3q0.a;
            default:
                d2x0 d2x0Var = (d2x0) obj2;
                int i4 = d2x0.j1;
                vyw0.c cVar = vyw0.c.b;
                d2x0Var.getClass();
                xn50.a.c(d2x0Var, cVar);
                return s3q0.a;
        }
    }
}
