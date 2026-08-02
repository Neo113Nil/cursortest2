package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.themes.VKTheme;
import com.vk.dto.common.id.UserId;
import com.vk.dto.uxpolls.UxPoll;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import com.vk.video.polls.nav.PollNavParams;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.q;
import com.vk.video.ui.discovery.minimizable.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.j1x0;
import xsna.tra0;
import xsna.vm30;
import xsna.w4r0;
import xsna.whg;
import xsna.x1x0;
import xsna.z1x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class puo0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ puo0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VKTheme u;
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) this.c;
                tra0 tra0Var = (tra0) this.d;
                tra0.a aVar = (tra0.a) obj;
                aVar.q((tra0) arrayList.get(0), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                aVar.q((tra0) arrayList.get(1), 0, ((tra0) arrayList.get(0)).c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                aVar.q(tra0Var, 0, ((tra0) arrayList.get(0)).c - (tra0Var.c / 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 1:
                UxPoll uxPoll = (UxPoll) this.c;
                UxPollEntryPointLocation uxPollEntryPointLocation = (UxPollEntryPointLocation) this.d;
                com.vk.video.polls.nav.a a = ((PollNavParams.a) obj).a(uxPoll.d.size() > 1 ? PollNavParams.Strategy.ALL_IN_ONE : PollNavParams.Strategy.ONE_IN_ONE);
                UxPollEntryPointLocation.Companion.getClass();
                int i = w4r0.a.$EnumSwitchMapping$0[UxPollEntryPointLocation.a.a(uxPollEntryPointLocation).ordinal()];
                if (i == 1) {
                    dhr0.a.getClass();
                    u = dhr0.u();
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    u = dhr0.C();
                }
                a.d = u.c;
                a.a = new UxPollEntryPoint(uxPoll, uxPollEntryPointLocation, false);
                return a.c();
            case 2:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.c;
                s.a aVar2 = (s.a) this.d;
                q.a aVar3 = (q.a) obj;
                ags0 ags0Var = videoMinimizableDiscoveryFragment.C0;
                if (ags0Var != null) {
                    List<q.a> a2 = aVar2.j.a();
                    ags0Var.n.a(aVar3, a2);
                    ags0Var.o.a(aVar3, a2);
                }
                znj0 znj0Var = videoMinimizableDiscoveryFragment.B0;
                if (znj0Var != null) {
                    List<q.a> a3 = aVar2.j.a();
                    if (gsi0.b().e) {
                        mha mhaVar = znj0Var.i;
                        if (mhaVar == null) {
                            mhaVar = null;
                        }
                        mhaVar.a(aVar3, a3);
                    }
                }
                return s3q0.a;
            case 3:
                n1x0 n1x0Var = (n1x0) this.c;
                z1x0 z1x0Var = (z1x0) this.d;
                n1x0Var.h.b(j1x0.b.d.a);
                n1x0Var.l.b(new whg.v(new UserId(((z1x0.a) z1x0Var).e.id())));
                n1x0Var.m.b(x1x0.a.a);
                return s3q0.a;
            default:
                z9x0 z9x0Var = (z9x0) this.c;
                vm30.e eVar = (vm30.e) this.d;
                AttachWall attachWall = (AttachWall) obj;
                z9x0Var.getClass();
                String c = z9x0.c(attachWall);
                p4g.a(c, z9x0Var.h, eVar.a());
                z9x0Var.g.putIfAbsent(c, attachWall.C);
                return s3q0.a;
        }
    }

    public /* synthetic */ puo0(w4r0 w4r0Var, UxPoll uxPoll, UxPollEntryPointLocation uxPollEntryPointLocation) {
        this.b = 1;
        this.c = uxPoll;
        this.d = uxPollEntryPointLocation;
    }
}
