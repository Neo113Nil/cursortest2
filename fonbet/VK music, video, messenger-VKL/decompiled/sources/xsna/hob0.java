package xsna;

import android.os.SystemClock;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import com.vk.newsfeed.posting.impl.presentation.model.PollAnswerDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorScreen;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorState;
import com.vk.newsfeed.posting.poll_editor.presentation.base.fragment.PollEditorModalBottomSheet;
import com.vk.newsfeed.posting.poll_editor.presentation.model.PollEditorMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.pnb0;
import xsna.qpb0;
import xsna.yob0;

/* compiled from: PollEditorFeature.kt */
/* loaded from: classes4.dex */
public final class hob0 extends wk50<wpb0, PollEditorState, pnb0, yob0> implements spb0 {
    public final wj50<qpb0> f;
    public final a g;
    public final job0 h;
    public final qob0 i;

    /* compiled from: PollEditorFeature.kt */
    public static final class a extends juq<yob0, pnb0, qpb0> {
        public final hob0 a;

        public a(hob0 hob0Var) {
            this.a = hob0Var;
        }

        @Override // xsna.juq
        public final void a(yob0 yob0Var) {
            this.a.T(yob0Var);
        }

        public final void b(kj50 kj50Var) {
            this.a.C((pnb0) kj50Var);
        }

        public final void c(Object obj) {
            this.a.f((qpb0) obj);
        }
    }

    public hob0(dpb0 dpb0Var, pnb0.b bVar, f4z f4zVar) {
        super(bVar, dpb0Var);
        this.f = f4zVar;
        a aVar = new a(this);
        this.g = aVar;
        this.h = new job0(aVar, this);
        this.i = new qob0(aVar, this);
    }

    @Override // xsna.wk50
    public final void N(PollEditorState pollEditorState, pnb0 pnb0Var) {
        pnb0.c cVar;
        boolean s;
        PollAnswerDto pollAnswerDto;
        PollEditorState pollEditorState2 = pollEditorState;
        pnb0 pnb0Var2 = pnb0Var;
        if (pnb0Var2 instanceof pnb0.b) {
            PollEditorModalBottomSheet.PollEditorArguments pollEditorArguments = ((pnb0.b) pnb0Var2).b;
            T(new yob0.a.C4122a(pollEditorArguments.d, pollEditorArguments.e, pollEditorArguments.f, pollEditorArguments.c, pollEditorArguments.g));
            return;
        }
        HashMap hashMap = null;
        if (!(pnb0Var2 instanceof pnb0.c)) {
            if (!(pnb0Var2 instanceof pnb0.a)) {
                boolean z = pnb0Var2 instanceof rnb0;
                a aVar = this.g;
                if (z) {
                    aVar.a.f(rpb0.a);
                    return;
                } else {
                    if (!(pnb0Var2 instanceof qnb0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.a.T(new zob0(((qnb0) pnb0Var2).b));
                    return;
                }
            }
            pnb0.a aVar2 = (pnb0.a) pnb0Var2;
            job0 job0Var = this.h;
            a aVar3 = job0Var.a;
            if (aVar2 instanceof pnb0.a.e) {
                aVar3.a(new apb0(SystemClock.elapsedRealtime()));
                pnb0.a.e eVar = (pnb0.a.e) aVar2;
                job0Var.b(pollEditorState2, eVar.b, eVar.c);
                return;
            }
            if (!(aVar2 instanceof pnb0.a.b)) {
                if (aVar2 instanceof pnb0.a.C3521a) {
                    aVar3.a(yob0.b.c.b);
                    job0Var.b.f(new qpb0.a.c(((pnb0.a.C3521a) aVar2).b, pollEditorState2.q1()));
                    return;
                } else {
                    if (aVar2 instanceof pnb0.a.d) {
                        aVar3.a(new wob0(((pnb0.a.d) aVar2).b));
                        return;
                    }
                    if (aVar2 instanceof pnb0.a.f) {
                        aVar3.a(new xob0(((pnb0.a.f) aVar2).b));
                        return;
                    } else {
                        if (!(aVar2 instanceof pnb0.a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pnb0.a.c cVar2 = (pnb0.a.c) aVar2;
                        aVar3.a(new vob0(p490.u(cVar2.b, cVar2.c, cVar2.d, cVar2.e, null, false)));
                        return;
                    }
                }
            }
            aVar3.a(new apb0(SystemClock.elapsedRealtime()));
            pnb0.a.b bVar = (pnb0.a.b) aVar2;
            PollEditorUiConfig pollEditorUiConfig = bVar.c;
            PostingPollDto postingPollDto = bVar.b;
            if (!postingPollDto.k) {
                job0Var.b(pollEditorState2, postingPollDto, pollEditorUiConfig);
                return;
            }
            gob0 gob0Var = bVar.d;
            if (!p490.s(postingPollDto, pollEditorUiConfig) || postingPollDto.b == 0) {
                return;
            }
            UserId q = pollEditorState2.q();
            int i = postingPollDto.b;
            String str = postingPollDto.d;
            Map<Integer, String> map = gob0Var.c;
            ArrayList arrayList = new ArrayList(map.size());
            Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            job0Var.a(new bub0(q, i, str, arrayList, gob0Var.a, gob0Var.b, postingPollDto.f, postingPollDto.g, false, null, null, null, null, postingPollDto.i ? Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(postingPollDto.j)) : null, "poll"), new gda0(job0Var, 2));
            return;
        }
        pnb0.c cVar3 = (pnb0.c) pnb0Var2;
        qob0 qob0Var = this.i;
        hob0 hob0Var = qob0Var.b;
        a aVar4 = qob0Var.a;
        if (pollEditorState2 instanceof PollEditorState.Editing) {
            if (!(cVar3 instanceof pnb0.c.h)) {
                if (cVar3 instanceof pnb0.c.f) {
                    aVar4.a(yob0.b.c.b);
                    return;
                }
                if (cVar3 instanceof pnb0.c.g) {
                    qob0Var.a((pnb0.c.g) cVar3);
                    return;
                }
                if (cVar3 instanceof pnb0.c.b) {
                    aVar4.a(yob0.b.a.b);
                    return;
                }
                if (cVar3 instanceof pnb0.c.a) {
                    aVar4.a(yob0.b.c.b);
                    hob0Var.f(new qpb0.a.C3567a(((PollEditorState.Editing) pollEditorState2).d));
                    return;
                }
                if (cVar3 instanceof pnb0.c.C3522c) {
                    hob0Var.f(new qpb0.a.b(((PollEditorState.Editing) pollEditorState2).d));
                    return;
                }
                if (cVar3 instanceof pnb0.c.d) {
                    aVar4.a(yob0.b.c.b);
                    hob0Var.f(new qpb0.a.e(((PollEditorState.Editing) pollEditorState2).d));
                    return;
                } else {
                    if (cVar3 instanceof pnb0.c.i) {
                        aVar4.a(yob0.b.e.b);
                        return;
                    }
                    if (cVar3 instanceof pnb0.c.e) {
                        aVar4.a(yob0.b.C4123b.b);
                        return;
                    } else {
                        if (!(cVar3 instanceof pnb0.c.j)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pnb0.c.j jVar = (pnb0.c.j) cVar3;
                        hob0Var.f(new qpb0.a.i(jVar.b, jVar.c));
                        return;
                    }
                }
            }
            PollEditorState.Editing editing = (PollEditorState.Editing) pollEditorState2;
            PickerTechMetrics pickerTechMetrics = editing.d;
            if (editing.l) {
                PostingPollDto postingPollDto2 = editing.g;
                PostingPollDto postingPollDto3 = editing.f;
                boolean z2 = editing.h;
                PollEditorMode pollEditorMode = editing.i;
                PollEditorUiConfig pollEditorUiConfig2 = editing.c;
                if (pollEditorMode.equals(PollEditorMode.Edit.b)) {
                    if (!z2) {
                        boolean z3 = postingPollDto3 != null && postingPollDto3.j == postingPollDto2.j;
                        if (epx.f(postingPollDto3 != null ? postingPollDto3.d : null, postingPollDto2.d) && z3) {
                            List<PollAnswerDto> list = postingPollDto2.e;
                            List<PollAnswerDto> list2 = postingPollDto3 != null ? postingPollDto3.e : null;
                            ArrayList arrayList2 = new ArrayList();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            if (list2 != null) {
                                List<PollAnswerDto> list3 = list2;
                                hashMap = new HashMap(list3.size());
                                for (PollAnswerDto pollAnswerDto2 : list3) {
                                    hashMap.put(Long.valueOf(pollAnswerDto2.b), pollAnswerDto2);
                                }
                            }
                            int size = list.size();
                            int i2 = 0;
                            while (i2 < size) {
                                PollAnswerDto pollAnswerDto3 = list.get(i2);
                                pnb0.c cVar4 = cVar3;
                                long j = pollAnswerDto3.b;
                                String str2 = pollAnswerDto3.c;
                                if (j > 0) {
                                    if (!((hashMap == null || (pollAnswerDto = (PollAnswerDto) hashMap.get(Long.valueOf(j))) == null) ? "" : pollAnswerDto.c).equals(str2)) {
                                        linkedHashMap.put(String.valueOf(pollAnswerDto3.b), str2);
                                    }
                                } else if (drm0.p0(str2).toString().length() > 0) {
                                    arrayList2.add(str2);
                                }
                                i2++;
                                cVar3 = cVar4;
                            }
                            cVar = cVar3;
                            if (arrayList2.isEmpty() && linkedHashMap.isEmpty()) {
                                s = false;
                            }
                            s = true;
                        }
                    }
                    cVar = cVar3;
                    s = true;
                } else {
                    cVar = cVar3;
                    s = p490.s(postingPollDto2, pollEditorUiConfig2);
                }
                if (s) {
                    qob0Var.a(new pnb0.c.g(new PollEditorScreen.ExitPollEditorAlert(((pnb0.c.h) cVar).b)));
                    return;
                }
            } else {
                cVar = cVar3;
            }
            aVar4.a(yob0.b.c.b);
            if (((pnb0.c.h) cVar).b) {
                hob0Var.f(new qpb0.a.d(pickerTechMetrics));
            } else {
                hob0Var.f(new qpb0.a.C3567a(pickerTechMetrics));
            }
        }
    }

    @Override // xsna.spb0
    public final void f(qpb0 qpb0Var) {
        this.f.b(qpb0Var);
    }
}
