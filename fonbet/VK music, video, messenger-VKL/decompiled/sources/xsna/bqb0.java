package xsna;

import android.os.Parcelable;
import com.vk.dto.uxpolls.PollAnswer;
import com.vk.dto.uxpolls.UxPoll;
import com.vk.stat.scheme.CommonUxpollsStat$TypeUxpollsEvent;
import com.vk.video.polls.analytics.UxPollsAnalytics;
import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import com.vk.video.polls.entrypoint.model.UxPollProject;
import com.vk.video.polls.models.UxPollEventType;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.trb0;
import xsna.xrb0;
import xsna.zqb0;

/* compiled from: PollFeature.kt */
/* loaded from: classes6.dex */
public final class bqb0 extends wk50<ctb0, trb0, xrb0, zqb0> {
    public final UxPoll f;
    public final wj50<pqb0> g;
    public final m5r0 h;
    public final com.vk.video.polls.analytics.a i;
    public final boolean j;
    public io.reactivex.rxjava3.disposables.c k;

    public bqb0(frb0 frb0Var, Map map, UxPoll uxPoll, wj50 wj50Var, m5r0 m5r0Var, com.vk.video.polls.analytics.a aVar, UxPollEntryPointLocation uxPollEntryPointLocation, boolean z) {
        super(new xrb0.d(map), frb0Var);
        this.f = uxPoll;
        this.g = wj50Var;
        this.h = m5r0Var;
        this.i = aVar;
        this.j = z;
        com.vk.video.polls.analytics.a.f(aVar, CommonUxpollsStat$TypeUxpollsEvent.EventType.SHOW);
        m5r0Var.a(uxPoll.b, uxPoll.c, UxPollEventType.PollShow, UxPollProject.VkVideo).subscribe();
    }

    public static final void U(bqb0 bqb0Var) {
        io.reactivex.rxjava3.internal.operators.observable.w2 B0 = io.reactivex.rxjava3.core.q.B0(1000L, TimeUnit.MILLISECONDS);
        asu0 asu0Var = asu0.a;
        bqb0Var.k = B0.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new r7a0(new n3b0(bqb0Var, 1), 3));
    }

    public static final void V(bqb0 bqb0Var, Map map) {
        io.reactivex.rxjava3.disposables.b bVar = bqb0Var.e;
        m5r0 m5r0Var = bqb0Var.h;
        UxPoll uxPoll = bqb0Var.f;
        int i = uxPoll.b;
        List<String> list = uxPoll.c;
        Parcelable.Creator<UxPollProject> creator = UxPollProject.CREATOR;
        bVar.b(io.reactivex.rxjava3.kotlin.c.g(new io.reactivex.rxjava3.internal.operators.completable.h(m5r0Var.b(map, list, i), new rz(bqb0Var, 4)), null, null, 3));
    }

    @Override // xsna.wk50
    public final void N(trb0 trb0Var, xrb0 xrb0Var) {
        UxPollsAnalytics.QuestionType questionType;
        List list;
        String str;
        trb0 trb0Var2 = trb0Var;
        xrb0 xrb0Var2 = xrb0Var;
        if (xrb0Var2 instanceof xrb0.d) {
            T(new zqb0.e((xrb0.d) xrb0Var2));
            return;
        }
        if (xrb0Var2 instanceof xrb0.e) {
            if (trb0Var2 instanceof trb0.a) {
                T(zqb0.c.b);
                V(this, ((trb0.a) trb0Var2).b);
                return;
            }
            return;
        }
        if (xrb0Var2 instanceof xrb0.c) {
            if (trb0Var2 instanceof trb0.a) {
                Map<Integer, PollAnswer> map = ((trb0.a) trb0Var2).b;
                Collection<PollAnswer> values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    for (PollAnswer pollAnswer : values) {
                        if (pollAnswer.b.isEmpty() && ((str = pollAnswer.c) == null || str.length() == 0)) {
                            T(zqb0.d.b);
                            return;
                        }
                    }
                }
                T(zqb0.c.b);
                V(this, map);
                return;
            }
            return;
        }
        boolean z = xrb0Var2 instanceof xrb0.b;
        com.vk.video.polls.analytics.a aVar = this.i;
        if (z) {
            if (trb0Var2 instanceof trb0.a) {
                trb0.a aVar2 = (trb0.a) trb0Var2;
                if (aVar2.e) {
                    return;
                }
                aVar.getClass();
                com.vk.video.polls.analytics.a.f(aVar, CommonUxpollsStat$TypeUxpollsEvent.EventType.HIDE);
                UxPollEventType uxPollEventType = UxPollEventType.PollHide;
                UxPoll uxPoll = this.f;
                int i = uxPoll.b;
                List<String> list2 = uxPoll.c;
                UxPollProject uxPollProject = UxPollProject.VkVideo;
                m5r0 m5r0Var = this.h;
                m5r0Var.a(i, list2, uxPollEventType, uxPollProject).subscribe();
                if (aVar2.d) {
                    io.reactivex.rxjava3.disposables.c cVar = this.k;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    new io.reactivex.rxjava3.internal.operators.completable.h(m5r0Var.b(aVar2.b, uxPoll.c, uxPoll.b), new u30(this, 5)).subscribe();
                    return;
                }
                return;
            }
            return;
        }
        if (xrb0Var2 instanceof xrb0.a) {
            xrb0.a aVar3 = (xrb0.a) xrb0Var2;
            boolean z2 = aVar3 instanceof xrb0.a.d.C4042a;
            if (z2) {
                T(new yqb0((xrb0.a.d.C4042a) aVar3));
                if (this.j && (trb0Var2 instanceof trb0.a)) {
                    if (((trb0.a) trb0Var2).d) {
                        io.reactivex.rxjava3.disposables.c cVar2 = this.k;
                        if (cVar2 != null) {
                            cVar2.dispose();
                        }
                        U(this);
                    } else {
                        T(zqb0.b.b);
                        U(this);
                    }
                }
            } else if (aVar3 instanceof xrb0.a.InterfaceC4038a.C4039a) {
                T(new vqb0((xrb0.a.InterfaceC4038a.C4039a) aVar3));
            } else if (aVar3 instanceof xrb0.a.c.C4041a) {
                T(new xqb0((xrb0.a.c.C4041a) aVar3));
            } else {
                if (!(aVar3 instanceof xrb0.a.b.C4040a)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(new wqb0((xrb0.a.b.C4040a) aVar3));
            }
            if (aVar3 instanceof xrb0.a.d) {
                questionType = UxPollsAnalytics.QuestionType.STAR_RATING;
            } else if (aVar3 instanceof xrb0.a.InterfaceC4038a) {
                questionType = UxPollsAnalytics.QuestionType.SELECTION;
            } else if (aVar3 instanceof xrb0.a.c) {
                questionType = UxPollsAnalytics.QuestionType.OPEN;
            } else {
                if (!(aVar3 instanceof xrb0.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                questionType = UxPollsAnalytics.QuestionType.GRADE;
            }
            if (z2) {
                list = Collections.singletonList(Integer.valueOf(((xrb0.a.d.C4042a) aVar3).c));
            } else if (aVar3 instanceof xrb0.a.InterfaceC4038a.C4039a) {
                list = Collections.singletonList(Integer.valueOf(((xrb0.a.InterfaceC4038a.C4039a) aVar3).c));
            } else if (aVar3 instanceof xrb0.a.b.C4040a) {
                list = Collections.singletonList(Integer.valueOf(((xrb0.a.b.C4040a) aVar3).c));
            } else {
                if (!(aVar3 instanceof xrb0.a.c.C4041a)) {
                    throw new NoWhenBranchMatchedException();
                }
                list = null;
            }
            int n0 = aVar3.n0();
            aVar.getClass();
            aVar.e(new UxPollsAnalytics.a(questionType, Long.valueOf(n0), (List<Integer>) list), CommonUxpollsStat$TypeUxpollsEvent.EventType.ANSWER);
        }
    }
}
