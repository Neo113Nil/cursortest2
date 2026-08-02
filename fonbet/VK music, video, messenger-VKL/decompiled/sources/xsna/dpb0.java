package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorState;
import com.vk.newsfeed.posting.poll_editor.presentation.model.PollEditorMode;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.yob0;

/* compiled from: PollEditorReducer.kt */
/* loaded from: classes4.dex */
public final class dpb0 extends dm50<wpb0, yob0, PollEditorState> {
    public final fz5 d;
    public final PollEditorUiConfig e;
    public final PostingPollDto f;
    public final PollEditorMode g;
    public final boolean h;
    public final boolean i;

    public dpb0(PollEditorState.Loading loading, fz5 fz5Var, PollEditorUiConfig pollEditorUiConfig, PostingPollDto postingPollDto, PollEditorMode pollEditorMode, boolean z, boolean z2) {
        super(loading);
        this.d = fz5Var;
        this.e = pollEditorUiConfig;
        this.f = postingPollDto;
        this.g = pollEditorMode;
        this.h = z;
        this.i = z2;
    }

    public static PollEditorState i(PollEditorState pollEditorState, PickerTechMetrics pickerTechMetrics) {
        if (pollEditorState instanceof PollEditorState.Editing) {
            return PollEditorState.Editing.a((PollEditorState.Editing) pollEditorState, pickerTechMetrics, null, null, false, null, false, 2043);
        }
        if (!(pollEditorState instanceof PollEditorState.Loading)) {
            throw new NoWhenBranchMatchedException();
        }
        PollEditorState.Loading loading = (PollEditorState.Loading) pollEditorState;
        return new PollEditorState.Loading(loading.b, loading.c, pickerTechMetrics);
    }

    @Override // xsna.dm50
    public final PollEditorState c(PollEditorState pollEditorState, yob0 yob0Var) {
        PollEditorState pollEditorState2 = pollEditorState;
        yob0 yob0Var2 = yob0Var;
        if (yob0Var2 instanceof yob0.a) {
            yob0.a aVar = (yob0.a) yob0Var2;
            if (!(aVar instanceof yob0.a.C4122a)) {
                throw new NoWhenBranchMatchedException();
            }
            yob0.a.C4122a c4122a = (yob0.a.C4122a) aVar;
            PickerTechMetrics pickerTechMetrics = new PickerTechMetrics(c4122a.f, null, null);
            UserId q = pollEditorState2.q();
            PostingPollDto postingPollDto = c4122a.b;
            return new PollEditorState.Editing(q, c4122a.e, pickerTechMetrics, postingPollDto, c4122a.c, postingPollDto, false, c4122a.d, EmptyList.b, false, true);
        }
        if (!(yob0Var2 instanceof yob0.b)) {
            if (yob0Var2 instanceof wob0) {
                wob0 wob0Var = (wob0) yob0Var2;
                if (!(pollEditorState2 instanceof PollEditorState.Editing)) {
                    return pollEditorState2;
                }
                PollEditorState.Editing editing = (PollEditorState.Editing) pollEditorState2;
                return PollEditorState.Editing.a(editing, null, PostingPollDto.a(editing.e, wob0Var.b, 1791), null, false, null, false, 2039);
            }
            if (yob0Var2 instanceof vob0) {
                return pollEditorState2 instanceof PollEditorState.Editing ? PollEditorState.Editing.a((PollEditorState.Editing) pollEditorState2, null, null, ((vob0) yob0Var2).b, false, null, false, 2015) : pollEditorState2;
            }
            if (yob0Var2 instanceof xob0) {
                return pollEditorState2 instanceof PollEditorState.Editing ? PollEditorState.Editing.a((PollEditorState.Editing) pollEditorState2, null, null, null, !((xob0) yob0Var2).b.isEmpty(), null, false, 1983) : pollEditorState2;
            }
            if (yob0Var2 instanceof zob0) {
                return i(pollEditorState2, PickerTechMetrics.a(pollEditorState2.q1(), 0L, Long.valueOf(((zob0) yob0Var2).b), null, 5));
            }
            if (yob0Var2 instanceof apb0) {
                return i(pollEditorState2, PickerTechMetrics.a(pollEditorState2.q1(), 0L, null, Long.valueOf(((apb0) yob0Var2).b), 3));
            }
            throw new NoWhenBranchMatchedException();
        }
        yob0.b bVar = (yob0.b) yob0Var2;
        if (bVar instanceof yob0.b.d) {
            yob0.b.d dVar = (yob0.b.d) bVar;
            if (!(pollEditorState2 instanceof PollEditorState.Editing)) {
                return pollEditorState2;
            }
            PollEditorState.Editing editing2 = (PollEditorState.Editing) pollEditorState2;
            ArrayList arrayList = new ArrayList(editing2.j);
            arrayList.add(dVar.b);
            s3q0 s3q0Var = s3q0.a;
            return PollEditorState.Editing.a(editing2, null, null, null, false, arrayList, false, 1791);
        }
        if (bVar instanceof yob0.b.a) {
            if (!(pollEditorState2 instanceof PollEditorState.Editing)) {
                return pollEditorState2;
            }
            PollEditorState.Editing editing3 = (PollEditorState.Editing) pollEditorState2;
            ArrayList arrayList2 = new ArrayList(editing3.j);
            g5g.J(arrayList2);
            s3q0 s3q0Var2 = s3q0.a;
            return PollEditorState.Editing.a(editing3, null, null, null, false, arrayList2, false, 1791);
        }
        if (bVar instanceof yob0.b.e) {
            return !(pollEditorState2 instanceof PollEditorState.Editing) ? pollEditorState2 : PollEditorState.Editing.a((PollEditorState.Editing) pollEditorState2, null, null, null, false, null, true, 1535);
        }
        if (bVar instanceof yob0.b.C4123b) {
            return !(pollEditorState2 instanceof PollEditorState.Editing) ? pollEditorState2 : PollEditorState.Editing.a((PollEditorState.Editing) pollEditorState2, null, null, null, false, null, false, 1535);
        }
        if (bVar instanceof yob0.b.c) {
            return !(pollEditorState2 instanceof PollEditorState.Editing) ? pollEditorState2 : PollEditorState.Editing.a((PollEditorState.Editing) pollEditorState2, null, null, null, false, null, false, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final wpb0 d() {
        return new wpb0(e(new jjx(this, 29)));
    }

    @Override // xsna.dm50
    public final void h(PollEditorState pollEditorState, wpb0 wpb0Var) {
        PollEditorState pollEditorState2 = pollEditorState;
        if (pollEditorState2 instanceof PollEditorState.Editing) {
            f(((wpb0) this.b).a, (PollEditorState.Editing) pollEditorState2);
        } else if (!(pollEditorState2 instanceof PollEditorState.Loading)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
