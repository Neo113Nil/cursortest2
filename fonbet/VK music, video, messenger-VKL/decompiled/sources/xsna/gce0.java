package xsna;

import android.content.Context;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.OrdData;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.video.ui.upload.api.router.PublishArguments;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseResult;
import com.vk.video.ui.upload.impl.publish.domain.model.CoverDo;
import com.vk.video.ui.upload.impl.publish.domain.model.VideoInfoDo;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsArguments;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dbe0;
import xsna.k2k;
import xsna.ln50;
import xsna.sbe0;

/* compiled from: PublishInlineActor.kt */
/* loaded from: classes7.dex */
public final class gce0 extends bl50<PublishState, dbe0, on50, bwj, dwj, sbe0> {
    public final Context c;
    public final PublishArguments d;
    public final ice0 e;
    public final cn1 f;
    public final dot0 g;
    public final fks0 h;
    public final com.vk.core.utils.newtork.b i;
    public final b25 j;
    public final l7b k;
    public final mhd l;
    public final VkOnboardingComponent m;
    public final sj50<PublishState, on50, ll50<on50, bwj, dwj>, jl50<PublishState>, sbe0> n;

    public gce0(Context context, PublishArguments publishArguments, ice0 ice0Var, cn1 cn1Var, dot0 dot0Var, fks0 fks0Var, com.vk.core.utils.newtork.b bVar, b25 b25Var, l7b l7bVar, mhd mhdVar, VkOnboardingComponent vkOnboardingComponent, sj50<PublishState, on50, ll50<on50, bwj, dwj>, jl50<PublishState>, sbe0> sj50Var) {
        super(sj50Var);
        this.c = context;
        this.d = publishArguments;
        this.e = ice0Var;
        this.f = cn1Var;
        this.g = dot0Var;
        this.h = fks0Var;
        this.i = bVar;
        this.j = b25Var;
        this.k = l7bVar;
        this.l = mhdVar;
        this.m = vkOnboardingComponent;
        this.n = sj50Var;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<PublishState, on50, ll50<on50, bwj, dwj>, jl50<PublishState>, sbe0> W() {
        return this.n;
    }

    public final void m(boolean z) {
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        PublishState.Edit j = ((PublishState) sj50Var.getCurrentState()).j();
        if (((PublishState) sj50Var.getCurrentState()).c != null && (((PublishState) sj50Var.getCurrentState()).o() != null || (j != null && ((PublishState) sj50Var.getCurrentState()).u(j)))) {
            rdi.y(this, new x68(this, z, 2));
            return;
        }
        g(ree0.a);
        g(see0.a);
        g(tee0.a);
        c(sbe0.a.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        PublishState publishState;
        PublishState.Upload o;
        PublishState publishState2;
        PublishState.Upload o2;
        VideoFile videoFile;
        VideoFile videoFile2;
        dbe0 dbe0Var = (dbe0) lj50Var;
        Integer num = null;
        if (dbe0Var instanceof dbe0.l) {
            g3q.a(this, new fce0(this, null));
            return;
        }
        if (dbe0Var instanceof dbe0.d) {
            m(true);
            return;
        }
        if (dbe0Var instanceof dbe0.n) {
            g(ree0.a);
            g(see0.a);
            g(tee0.a);
            return;
        }
        boolean z = dbe0Var instanceof dbe0.p;
        boolean z2 = 0;
        Object[] objArr = 0;
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        if (z) {
            if (((Boolean) ((PublishState) sj50Var.getCurrentState()).U.getValue()).booleanValue()) {
                return;
            }
            m(false);
            return;
        }
        int i = 24;
        int i2 = 2;
        int i3 = 7;
        int i4 = 16;
        if (dbe0Var instanceof dbe0.f) {
            dbe0.f fVar = (dbe0.f) dbe0Var;
            if (fVar instanceof dbe0.f.a) {
                PublishState.Upload o3 = ((PublishState) sj50Var.getCurrentState()).o();
                if (o3 != null) {
                    c(new sbe0.k(o3.b));
                    return;
                }
                return;
            }
            if (fVar instanceof dbe0.f.b) {
                c(sbe0.f.a);
                return;
            }
            int i5 = 10;
            int i6 = 12;
            if (fVar instanceof dbe0.f.c) {
                CoverDo coverDo = ((PublishState) sj50Var.getCurrentState()).d;
                if (coverDo == null || (coverDo instanceof CoverDo.Preview)) {
                    rdi.y(this, new d7l0(i5));
                } else {
                    if (!(coverDo instanceof CoverDo.Local) && !(coverDo instanceof CoverDo.Remote)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rdi.y(this, new h3e0(i6));
                }
                rdi.y(this, new dh5(i4));
                return;
            }
            if (fVar instanceof ibe0) {
                String str = ((ibe0) fVar).b;
                PublishState.Edit j = ((PublishState) sj50Var.getCurrentState()).j();
                if (j != null && (videoFile2 = j.b) != null) {
                    num = Integer.valueOf(videoFile2.o0());
                }
                UserId userId = ((PublishState) sj50Var.getCurrentState()).h;
                VideoInfoDo videoInfoDo = ((PublishState) sj50Var.getCurrentState()).c;
                if (videoInfoDo != null) {
                    z2 = videoInfoDo.d <= videoInfoDo.e ? 0 : 1;
                }
                c(new sbe0.g(str, num, userId, z2));
                return;
            }
            if (!(fVar instanceof hbe0)) {
                throw new NoWhenBranchMatchedException();
            }
            hbe0 hbe0Var = (hbe0) fVar;
            CoverChooseResult coverChooseResult = hbe0Var.b;
            if (coverChooseResult instanceof CoverChooseResult.Saved) {
                return;
            }
            if (!(coverChooseResult instanceof CoverChooseResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            int i7 = k2k.a.$EnumSwitchMapping$0[((CoverChooseResult.Error) coverChooseResult).b.ordinal()];
            if (i7 == 1) {
                rdi.y(this, new d7l0(i5));
            } else {
                if (i7 != 2 && i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                rdi.y(this, new h3e0(i6));
            }
            return;
        }
        int i8 = 6;
        if (dbe0Var instanceof dbe0.c) {
            dbe0.c cVar = (dbe0.c) dbe0Var;
            if (cVar instanceof dbe0.c.a) {
                if (o3r0.a(this)) {
                    d3q.a(this, ree0.a, ln50.a.b, new w8(this, i8), new x75(this, null));
                    return;
                }
                return;
            } else if (cVar instanceof dbe0.c.C2719c) {
                rdi.y(this, new oh3(r2, ((dbe0.c.C2719c) cVar).b, this));
                return;
            } else {
                if (!(cVar instanceof dbe0.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.h.l1()) {
                    return;
                }
                rdi.y(this, new com.vk.movika.sdk.base.observable.s(5));
                return;
            }
        }
        int i9 = 15;
        if (dbe0Var instanceof dbe0.o) {
            dbe0.o oVar = (dbe0.o) dbe0Var;
            if (oVar instanceof dbe0.o.b) {
                return;
            } else {
                if (!(oVar instanceof dbe0.o.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (dbe0Var instanceof dbe0.g) {
            dbe0.g gVar = (dbe0.g) dbe0Var;
            if (!(gVar instanceof dbe0.g.a)) {
                if (!(gVar instanceof dbe0.g.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                rdi.y(this, new fv90(gVar, 14));
                return;
            } else {
                String str2 = ((PublishState) sj50Var.getCurrentState()).g;
                PublishState.Edit j2 = ((PublishState) sj50Var.getCurrentState()).j();
                if (j2 != null && (videoFile = j2.b) != null) {
                    num = Integer.valueOf(videoFile.o0());
                }
                c(new sbe0.m(str2, num, ((PublishState) sj50Var.getCurrentState()).h));
                return;
            }
        }
        if (dbe0Var instanceof dbe0.b) {
            dbe0.b bVar = (dbe0.b) dbe0Var;
            if (bVar instanceof dbe0.b.a) {
                if (o3r0.a(this)) {
                    c(new sbe0.j(this.d instanceof PublishArguments.Upload, ((PublishState) sj50Var.getCurrentState()).h, (List) ((PublishState) sj50Var.getCurrentState()).a0.getValue()));
                    return;
                }
                return;
            } else {
                if (!(bVar instanceof dbe0.b.C2718b)) {
                    throw new NoWhenBranchMatchedException();
                }
                rdi.y(this, new fda0(bVar, 4));
                return;
            }
        }
        int i10 = 21;
        if (dbe0Var instanceof dbe0.i) {
            dbe0.i iVar = (dbe0.i) dbe0Var;
            if (iVar instanceof lbe0) {
                if (o3r0.a(this)) {
                    d3q.a(this, see0.a, ln50.a.b, new ba40(this, i9), new scd0(this, null));
                    return;
                }
                return;
            } else {
                if (iVar instanceof mbe0) {
                    g3q.a(this, new rcd0(this, (mbe0) iVar, null));
                    return;
                }
                if (iVar instanceof jbe0) {
                    if (o3r0.a(this)) {
                        d3q.a(this, see0.a, ln50.a.b, new h630(this, i10), new pcd0(this, null));
                        return;
                    }
                    return;
                } else {
                    if (!(iVar instanceof kbe0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g3q.a(this, new qcd0(this, (kbe0) iVar, null));
                    return;
                }
            }
        }
        int i11 = 11;
        if (dbe0Var instanceof dbe0.j) {
            dbe0.j jVar = (dbe0.j) dbe0Var;
            if (!(jVar instanceof dbe0.j.a)) {
                if (jVar instanceof dbe0.j.d) {
                    rdi.y(this, new z410(15));
                    return;
                } else if (jVar instanceof dbe0.j.c) {
                    rdi.y(this, new qz40(jVar, i4));
                    return;
                } else {
                    if (!(jVar instanceof dbe0.j.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rdi.y(this, new pyz(i10));
                    return;
                }
            }
            Date date = ((PublishState) sj50Var.getCurrentState()).n;
            if (date == null) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(11, 1);
                calendar.set(13, 0);
                date = calendar.getTime();
            }
            Date date2 = new Date();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(date2);
            calendar2.add(5, 90);
            rdi.y(this, new s62(date, date2, calendar2.getTime(), 6));
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        if (dbe0Var instanceof dbe0.a) {
            dbe0.a aVar = (dbe0.a) dbe0Var;
            if (aVar instanceof dbe0.a.b) {
                q();
                return;
            }
            if (aVar instanceof dbe0.a.c) {
                rdi.y(this, new n7b0(aVar, i2));
                return;
            }
            int i12 = 17;
            if (aVar instanceof ebe0) {
                rdi.y(this, new k220(i12));
                q();
                return;
            }
            if (aVar instanceof fbe0) {
                rdi.y(this, new k220(i12));
                return;
            }
            if (!(aVar instanceof gbe0)) {
                if (!(aVar instanceof dbe0.a.C2717a)) {
                    throw new NoWhenBranchMatchedException();
                }
                rdi.y(this, new w110(aVar, 19));
                return;
            }
            VkOnboardingCampaign vkOnboardingCampaign = ((PublishState) sj50Var.getCurrentState()).F;
            if (vkOnboardingCampaign == null) {
                return;
            }
            q7v0 p3 = this.m.p3();
            VkOnboardingType vkOnboardingType = VkOnboardingType.Tooltip;
            e8v0 e8v0Var = ((gbe0) aVar).b;
            p3.a(vkOnboardingCampaign, vkOnboardingType, e8v0Var);
            VkOnboardingStat$Delegate vkOnboardingStat$Delegate = ((PublishState) sj50Var.getCurrentState()).G;
            if (vkOnboardingStat$Delegate != null) {
                vkOnboardingStat$Delegate.d4(e8v0Var);
                return;
            }
            return;
        }
        if (dbe0Var instanceof dbe0.e) {
            dbe0.e eVar = (dbe0.e) dbe0Var;
            if (eVar instanceof dbe0.e.a) {
                if (((Boolean) ((PublishState) sj50Var.getCurrentState()).U.getValue()).booleanValue() || !o3r0.a(this)) {
                    return;
                }
                PublishState publishState3 = (PublishState) sj50Var.getCurrentState();
                if (publishState3.n != null) {
                    c(sbe0.o.a);
                    return;
                }
                PublishState.Edit j3 = publishState3.j();
                if (j3 == null) {
                    return;
                }
                aeq0.c(this, publishState3, j3);
                return;
            }
            if (!(eVar instanceof dbe0.e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((Boolean) ((PublishState) sj50Var.getCurrentState()).U.getValue()).booleanValue() || !o3r0.a(this)) {
                return;
            }
            PublishState publishState4 = (PublishState) sj50Var.getCurrentState();
            PublishState.Block block = publishState4.b;
            if (!(block instanceof PublishState.Upload)) {
                if (!(block instanceof PublishState.Edit)) {
                    throw new NoWhenBranchMatchedException();
                }
                PublishState.Edit edit = (PublishState.Edit) block;
                if (!edit.Z1()) {
                    aeq0.c(this, publishState4, edit);
                    return;
                } else {
                    if (edit.b == null) {
                        return;
                    }
                    d3q.a(this, tee0.a, ln50.a.b, new qyi0(this, i11), new beq0(this, edit, publishState4, null));
                    return;
                }
            }
            PublishState.Upload upload = (PublishState.Upload) block;
            VideoInfoDo videoInfoDo2 = publishState4.c;
            if (videoInfoDo2 == null) {
                return;
            }
            if (!this.l.c() || videoInfoDo2.b > ynd.a() || videoInfoDo2.d < videoInfoDo2.e) {
                aeq0.e(this, publishState4, upload, "UploadingDelegate handleUploadClickAction");
                return;
            } else {
                rdi.y(this, new e750(24));
                return;
            }
        }
        if (dbe0Var instanceof dbe0.h) {
            dbe0.h hVar = (dbe0.h) dbe0Var;
            if (hVar instanceof dbe0.h.b) {
                g(ree0.a);
                g(see0.a);
                g(tee0.a);
                c(sbe0.a.a);
                return;
            }
            if (hVar instanceof dbe0.h.a) {
                rdi.y(this, new qcw(20));
                return;
            }
            if (!(hVar instanceof dbe0.h.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!((PublishState) sj50Var.getCurrentState()).K) {
                rdi.y(this, new nc90(i3));
                return;
            }
            g(ree0.a);
            g(see0.a);
            g(tee0.a);
            c(sbe0.a.a);
            return;
        }
        if (dbe0Var instanceof dbe0.r) {
            dbe0.r rVar = (dbe0.r) dbe0Var;
            if (rVar instanceof dbe0.r.a) {
                if (o3r0.a(this) && (o2 = (publishState2 = (PublishState) sj50Var.getCurrentState()).o()) != null) {
                    c(new sbe0.d(o2.b, publishState2.h));
                }
            } else if (rVar instanceof dbe0.r.b) {
                if (o3r0.a(this) && (o = (publishState = (PublishState) sj50Var.getCurrentState()).o()) != null) {
                    aeq0.e(this, publishState, o, "UploadingDelegate handleVideo2ClipsVideoClick");
                }
            } else if (!(rVar instanceof dbe0.r.c)) {
                throw new NoWhenBranchMatchedException();
            }
            rdi.y(this, new ygm0(6));
            return;
        }
        if (dbe0Var instanceof dbe0.k) {
            PublishState publishState5 = (PublishState) sj50Var.getCurrentState();
            PublishState.Edit j4 = publishState5.j();
            if (j4 == null) {
                return;
            }
            rdi.y(this, new ev60(i4));
            aeq0.c(this, publishState5, j4);
            return;
        }
        if (dbe0Var instanceof dbe0.m) {
            rdi.y(this, new zos(22));
        } else {
            if (!(dbe0Var instanceof dbe0.q)) {
                throw new NoWhenBranchMatchedException();
            }
            c(sbe0.e.a);
            c(sbe0.a.a);
        }
    }

    public final void q() {
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        List<VideoFile> list = ((PublishState) sj50Var.getCurrentState()).v;
        boolean z = !((PublishState) sj50Var.getCurrentState()).w.isEmpty();
        Boolean valueOf = ((PublishState) sj50Var.getCurrentState()).o() != null ? Boolean.valueOf(((PublishState) sj50Var.getCurrentState()).x) : null;
        Boolean valueOf2 = ((Boolean) ((PublishState) sj50Var.getCurrentState()).c0.getValue()).booleanValue() ? Boolean.valueOf(((PublishState) sj50Var.getCurrentState()).y) : null;
        Boolean valueOf3 = (this.h.y1() && ((Boolean) ((PublishState) sj50Var.getCurrentState()).d0.getValue()).booleanValue()) ? Boolean.valueOf(((PublishState) sj50Var.getCurrentState()).z) : null;
        OrdData ordData = ((PublishState) sj50Var.getCurrentState()).C;
        UserId userId = ((PublishState) sj50Var.getCurrentState()).h;
        PublishState.Edit j = ((PublishState) sj50Var.getCurrentState()).j();
        c(new sbe0.b(new SettingsArguments(list, z, valueOf, valueOf2, valueOf3, ordData, userId, j != null ? j.b : null)));
    }
}
