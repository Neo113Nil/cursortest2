package xsna;

import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$DelayedPublication;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$DraftsSave;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalNumber;
import com.vk.dto.group.Group;
import kotlin.NoWhenBranchMatchedException;
import xsna.lbf;
import xsna.mjf;
import xsna.qef;
import xsna.ugf;

/* compiled from: ClipsUploadNavActionsActor.kt */
/* loaded from: classes17.dex */
public final class tgf extends al50<ClipsUploadState, lbf.b, Object, mjf, ugf, qef> {
    public final sj50<ClipsUploadState, Object, mjf, ugf, qef> c;

    public tgf(sj50<ClipsUploadState, Object, mjf, ugf, qef> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        ClipsUploadState.Loaded loaded;
        lbf.b bVar = (lbf.b) lj50Var;
        boolean equals = bVar.equals(lbf.b.a.b);
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        if (equals) {
            lm50 currentState = sj50Var.getCurrentState();
            loaded = currentState instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState : null;
            if (loaded != null) {
                if (loaded.b.f.contains(ClipUploadScreenFeature$DraftsSave.b)) {
                    a(new mjf.e.a("clips_deleted_by_go_back"));
                    a(mjf.b.c.b);
                } else {
                    a(new mjf.e.a("back_without_draft"));
                    a(mjf.b.C3347b.b);
                }
            }
            c(qef.a.a);
            return;
        }
        boolean equals2 = bVar.equals(lbf.b.f.b);
        qef.n nVar = qef.n.a;
        if (equals2) {
            lm50 currentState2 = sj50Var.getCurrentState();
            loaded = currentState2 instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState2 : null;
            if (loaded == null) {
                return;
            }
            Group b = hif.b(loaded, loaded.f);
            if (b != null && b.Y) {
                c(qef.x.a);
                return;
            } else {
                a(mjf.e.c.b);
                c(nVar);
                return;
            }
        }
        if (bVar.equals(lbf.b.g.b)) {
            a(mjf.e.c.b);
            c(nVar);
            return;
        }
        if (bVar.equals(lbf.b.d.b)) {
            lm50 currentState3 = sj50Var.getCurrentState();
            loaded = currentState3 instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState3 : null;
            if (loaded == null) {
                return;
            }
            e(new ugf.c.a(false, fkq0.b(loaded.f) ? ConditionalFeature.State.HIDDEN : ConditionalFeature.State.SHOWN, !loaded.b.f.contains(ClipUploadScreenFeature$DelayedPublication.b) ? ConditionalNumber.State.HIDDEN : ConditionalNumber.State.SHOWN));
            a(new mjf.e.a("clips_deleted_by_draft_save"));
            a(mjf.b.a.b);
            c(qef.o.a);
            return;
        }
        if (bVar.equals(lbf.b.C3248b.b)) {
            c(qef.l.a);
            return;
        }
        if (bVar.equals(lbf.b.e.b)) {
            c(qef.j.a);
            return;
        }
        if (bVar.equals(lbf.b.i.b)) {
            lm50 currentState4 = sj50Var.getCurrentState();
            loaded = currentState4 instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState4 : null;
            if (loaded == null) {
                return;
            }
            a(new mjf.e.a("go_to_editor"));
            c(new qef.e(loaded.b.c.b));
            return;
        }
        if (bVar.equals(lbf.b.h.b)) {
            c(qef.m.a);
        } else {
            if (!(bVar instanceof lbf.b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            c(new qef.b(((lbf.b.c) bVar).b));
        }
    }
}
