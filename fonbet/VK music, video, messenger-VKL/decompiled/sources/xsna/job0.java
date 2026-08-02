package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import com.vk.newsfeed.posting.impl.presentation.model.PollAnswerDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import xsna.hob0;

/* compiled from: PollEditorFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class job0 {
    public final hob0.a a;
    public final hob0 b;
    public final io.reactivex.rxjava3.internal.schedulers.d c;
    public final io.reactivex.rxjava3.disposables.b d;

    public job0(hob0.a aVar, hob0 hob0Var) {
        this.a = aVar;
        this.b = hob0Var;
        asu0 asu0Var = asu0.a;
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.b;
        asu0Var.getClass();
        io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
        this.c = new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.d = bVar;
        aVar.a.e.b(bVar);
    }

    public final <T> void a(rsg0<T> rsg0Var, izs<? super T, s3q0> izsVar) {
        int i = 22;
        this.d.d(new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(rsg0.w0(rsg0Var).m(this.c), new b8v(new kn20(this, i), 16)), new k130(new eiz(this, i), 14)).h(new f5y(new fju(this, 23), 15)), new vy3(this, 4)).subscribe(new iob0(izsVar, 0), new ux00(new fv90(this, 8), 12)));
    }

    public final void b(PollEditorState pollEditorState, PostingPollDto postingPollDto, PollEditorUiConfig pollEditorUiConfig) {
        tfx tfxVar;
        if (p490.s(postingPollDto, pollEditorUiConfig)) {
            String str = postingPollDto.d;
            List<PollAnswerDto> list = postingPollDto.e;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((PollAnswerDto) it.next()).c);
            }
            String jSONArray = new JSONArray((Collection) arrayList).toString();
            UserId q = pollEditorState.q();
            boolean z = postingPollDto.f;
            boolean z2 = postingPollDto.g;
            boolean z3 = postingPollDto.h;
            Integer valueOf = postingPollDto.i ? Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(postingPollDto.j)) : null;
            tfx tfxVar2 = new tfx("polls.create", new com.vk.movika.sdk.android.defaultplayer.view.a(27), new gub0(0));
            if (str != null) {
                tfxVar = tfxVar2;
                tfx.o(tfxVar, "question", str, 0, 0, 12);
            } else {
                tfxVar = tfxVar2;
            }
            tfxVar.j("is_anonymous", z);
            tfxVar.j("is_multiple", z2);
            if (valueOf != null) {
                tfx.l(tfxVar, "end_date", valueOf.intValue(), 1550700000, 0, 8);
            }
            if (q != null) {
                tfx.n(tfxVar, "owner_id", q, 0L, 0L, 12);
            }
            tfx.o(tfxVar, "add_answers", jSONArray, 0, 0, 12);
            tfxVar.j("disable_unvote", z3);
            a(yfb.x(tfxVar), new bzw(this, 22));
        }
    }
}
