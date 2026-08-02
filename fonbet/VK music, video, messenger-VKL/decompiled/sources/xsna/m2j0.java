package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.VideoFile;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.video.ui.upload.impl.settings.presentation.feature.entity.SettingsState;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsArguments;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsResult;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ln50;
import xsna.q0j0;
import xsna.q1j0;

/* compiled from: SettingsInlineActor.kt */
/* loaded from: classes7.dex */
public final class m2j0 extends bl50<SettingsState, q0j0, on50, bwj, dwj, q1j0> {
    public final SettingsArguments c;
    public final n2j0 d;
    public final com.vk.core.utils.newtork.b e;
    public final VkOnboardingComponent f;
    public final sj50<SettingsState, on50, ll50<on50, bwj, dwj>, jl50<SettingsState>, q1j0> g;

    public m2j0(SettingsArguments settingsArguments, n2j0 n2j0Var, com.vk.core.utils.newtork.b bVar, VkOnboardingComponent vkOnboardingComponent, sj50<SettingsState, on50, ll50<on50, bwj, dwj>, jl50<SettingsState>, q1j0> sj50Var) {
        super(sj50Var);
        this.c = settingsArguments;
        this.d = n2j0Var;
        this.e = bVar;
        this.f = vkOnboardingComponent;
        this.g = sj50Var;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<SettingsState, on50, ll50<on50, bwj, dwj>, jl50<SettingsState>, q1j0> W() {
        return this.g;
    }

    @Override // xsna.bl50, xsna.qj50
    public final void init() {
        if (!BuildInfo.q() || this.c.c) {
            return;
        }
        g3q.a(this, new l2j0(this, null));
    }

    public final boolean m() {
        this.e.getClass();
        boolean d = com.vk.core.utils.newtork.b.d();
        if (!d) {
            rdi.y(this, new pyz(27));
        }
        return d;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        List<VideoFile> list;
        List<VideoFile> list2;
        q0j0 q0j0Var = (q0j0) lj50Var;
        if (q0j0Var instanceof q0j0.i) {
            q();
            return;
        }
        if (q0j0Var instanceof q0j0.g) {
            if (m()) {
                c(q1j0.e.a);
                return;
            }
            return;
        }
        boolean z = q0j0Var instanceof q0j0.a;
        Object obj = null;
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        if (z) {
            q0j0.a aVar = (q0j0.a) q0j0Var;
            if (aVar instanceof q0j0.a.b) {
                if (m() && (list2 = ((SettingsState) sj50Var.getCurrentState()).b) != null) {
                    c(new q1j0.c(list2));
                    return;
                }
                return;
            }
            if (!(aVar instanceof q0j0.a.c)) {
                if (aVar instanceof q0j0.a.d) {
                    rdi.y(this, new vlc0(aVar, 9));
                    return;
                } else {
                    if (!(aVar instanceof q0j0.a.C3542a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rdi.y(this, new waf0(aVar, 8));
                    return;
                }
            }
            q0j0.a.c cVar = (q0j0.a.c) aVar;
            if (m() && (list = ((SettingsState) sj50Var.getCurrentState()).b) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (epx.f(((VideoFile) next).a1(), cVar.b)) {
                        obj = next;
                        break;
                    }
                }
                VideoFile videoFile = (VideoFile) obj;
                if (videoFile == null) {
                    return;
                }
                c(new q1j0.b(videoFile));
                return;
            }
            return;
        }
        if (q0j0Var instanceof q0j0.b) {
            q0j0.b bVar = (q0j0.b) q0j0Var;
            if (bVar instanceof q0j0.b.a) {
                rdi.y(this, new pey(29));
                return;
            }
            if (!(bVar instanceof q0j0.b.C3543b)) {
                throw new NoWhenBranchMatchedException();
            }
            VkOnboardingCampaign vkOnboardingCampaign = ((SettingsState) sj50Var.getCurrentState()).d;
            if (vkOnboardingCampaign == null) {
                return;
            }
            q7v0 p3 = this.f.p3();
            VkOnboardingType vkOnboardingType = VkOnboardingType.Banner;
            e8v0 e8v0Var = ((q0j0.b.C3543b) bVar).b;
            p3.a(vkOnboardingCampaign, vkOnboardingType, e8v0Var);
            VkOnboardingStat$Delegate vkOnboardingStat$Delegate = ((SettingsState) sj50Var.getCurrentState()).e;
            if (vkOnboardingStat$Delegate != null) {
                vkOnboardingStat$Delegate.d4(e8v0Var);
                return;
            }
            return;
        }
        if (q0j0Var instanceof q0j0.e) {
            q0j0.e eVar = (q0j0.e) q0j0Var;
            rdi.y(this, new bbw(eVar, 28));
            d3q.a(this, u3j0.a, ln50.a.c, new z410(22), new k2j0(this, eVar, null));
            return;
        }
        if (q0j0Var instanceof q0j0.d) {
            rdi.y(this, new w110(q0j0Var, 27));
            return;
        }
        if (q0j0Var instanceof q0j0.j) {
            rdi.y(this, new e2s(q0j0Var, 29));
            return;
        }
        if (!(q0j0Var instanceof q0j0.f)) {
            if (q0j0Var instanceof q0j0.h) {
                rdi.y(this, new k220(25));
                return;
            } else {
                if (!(q0j0Var instanceof q0j0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                q();
                return;
            }
        }
        q0j0.f fVar = (q0j0.f) q0j0Var;
        if (m()) {
            if (fVar instanceof q0j0.f.a) {
                c(new q1j0.d(((SettingsState) sj50Var.getCurrentState()).i));
            } else {
                if (!(fVar instanceof q0j0.f.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                rdi.y(this, new fv90(fVar, 24));
            }
        }
    }

    public final void q() {
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        c(new q1j0.a(new SettingsResult(((SettingsState) sj50Var.getCurrentState()).b, ((SettingsState) sj50Var.getCurrentState()).f, ((SettingsState) sj50Var.getCurrentState()).g, ((SettingsState) sj50Var.getCurrentState()).h, ((SettingsState) sj50Var.getCurrentState()).i)));
    }
}
