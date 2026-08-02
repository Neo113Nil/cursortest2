package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.video.ui.upload.api.router.AttachedClipsArguments;
import com.vk.video.ui.upload.api.router.AttachedClipsResult;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.ClipAlreadyAttachedDialogState;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.ClipState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.e9k0;
import xsna.ln50;
import xsna.t44;
import xsna.x44;

/* compiled from: AttachedClipsInlineActor.kt */
/* loaded from: classes7.dex */
public final class h54 extends bl50<AttachedClipsState, t44, on50, bwj, dwj, x44> {
    public final AttachedClipsArguments c;
    public final q54 d;
    public final com.vk.core.utils.newtork.b e;
    public final sj50<AttachedClipsState, on50, ll50<on50, bwj, dwj>, jl50<AttachedClipsState>, x44> f;

    /* compiled from: AttachedClipsInlineActor.kt */
    @b6l(c = "com.vk.video.ui.upload.impl.attachedclips.presentation.feature.store.AttachedClipsInlineActor$loadClipsPage$2", f = "AttachedClipsInlineActor.kt", l = {273}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return h54.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (((AttachedClipsState) h54.this.b.getCurrentState()).c != null && ((AttachedClipsState) h54.this.b.getCurrentState()).d == null) {
                    return s3q0.a;
                }
                h54 h54Var = h54.this;
                q54 q54Var = h54Var.d;
                UserId userId = h54Var.c.b;
                String str = ((AttachedClipsState) h54Var.b.getCurrentState()).d;
                this.label = 1;
                a = q54Var.a(30, userId, str, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                a = ((Result) obj).d();
            }
            h54 h54Var2 = h54.this;
            if (!(a instanceof Result.Failure)) {
                rdi.y(h54Var2, new ku1(1, (ipe) a, h54Var2));
            }
            h54 h54Var3 = h54.this;
            Throwable a2 = Result.a(a);
            if (a2 != null) {
                if (h03.a(a2) && ((AttachedClipsState) h54Var3.b.getCurrentState()).c == null) {
                    h54Var3.c(x44.c.C3973c.a);
                    h54Var3.q(false);
                } else if (h03.a(a2)) {
                    rdi.y(h54Var3, new g54(0));
                } else if (((AttachedClipsState) h54Var3.b.getCurrentState()).c == null) {
                    com.vk.metrics.eventtracking.b.a.a(a2);
                    h54Var3.c(x44.c.b.a);
                    h54Var3.q(false);
                } else {
                    com.vk.metrics.eventtracking.b.a.a(a2);
                    rdi.y(h54Var3, new com.vk.movika.sdk.base.observable.s(3));
                }
            }
            return s3q0.a;
        }
    }

    public h54(AttachedClipsArguments attachedClipsArguments, q54 q54Var, com.vk.core.utils.newtork.b bVar, sj50<AttachedClipsState, on50, ll50<on50, bwj, dwj>, jl50<AttachedClipsState>, x44> sj50Var) {
        super(sj50Var);
        this.c = attachedClipsArguments;
        this.d = q54Var;
        this.e = bVar;
        this.f = sj50Var;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<AttachedClipsState, on50, ll50<on50, bwj, dwj>, jl50<AttachedClipsState>, x44> W() {
        return this.f;
    }

    public final void m(boolean z) {
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        if (((AttachedClipsState) sj50Var.getCurrentState()).c == null) {
            q(false);
        } else if (((Boolean) ((AttachedClipsState) sj50Var.getCurrentState()).m.getValue()).booleanValue()) {
            rdi.y(this, new f54(z, 0));
        } else {
            q(false);
        }
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        t44 t44Var = (t44) lj50Var;
        boolean z = t44Var instanceof t44.h;
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        if (z) {
            if (this.c.d != null) {
                rdi.y(this, new go1(this, 8));
                if (((AttachedClipsState) sj50Var.getCurrentState()).c == null) {
                    r();
                    return;
                }
                return;
            }
            d3q.a(this, z54.a, ln50.a.b, new dz(2), new j54(this, null));
            return;
        }
        final boolean z2 = false;
        if (t44Var instanceof t44.j) {
            m(false);
            return;
        }
        final boolean z3 = true;
        if (t44Var instanceof t44.c) {
            t44.c cVar = (t44.c) t44Var;
            if (cVar instanceof t44.c.a) {
                this.e.getClass();
                boolean d = com.vk.core.utils.newtork.b.d();
                if (!d) {
                    rdi.y(this, new n82(4));
                }
                if (d) {
                    c(new x44.b(((t44.c.a) cVar).b));
                    return;
                }
                return;
            }
            if (cVar instanceof t44.c.b) {
                t44.c.b bVar = (t44.c.b) cVar;
                final String str = bVar.b;
                final boolean z4 = bVar.c;
                rdi.y(this, new izs() { // from class: xsna.e54
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        String str2;
                        Object obj2;
                        AttachedClipsState attachedClipsState = (AttachedClipsState) obj;
                        List<ClipState> list = attachedClipsState.c;
                        if (list != null) {
                            List<ClipState> list2 = list;
                            Iterator<T> it = list2.iterator();
                            while (true) {
                                boolean hasNext = it.hasNext();
                                str2 = str;
                                if (!hasNext) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it.next();
                                if (epx.f(((ClipState) obj2).c.a1(), str2)) {
                                    break;
                                }
                            }
                            ClipState clipState = (ClipState) obj2;
                            if (clipState != null) {
                                boolean booleanValue = ((Boolean) attachedClipsState.n.getValue()).booleanValue();
                                boolean z5 = z4;
                                if (!booleanValue && z5) {
                                    return AttachedClipsState.a(attachedClipsState, null, null, null, null, null, false, false, false, false, e9k0.a.a, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
                                }
                                if (z5 && ((Boolean) clipState.f.getValue()).booleanValue()) {
                                    return AttachedClipsState.a(attachedClipsState, null, null, null, null, null, true, false, false, false, null, 991);
                                }
                                if (z3 && z5 && ((Boolean) clipState.e.getValue()).booleanValue()) {
                                    return AttachedClipsState.a(attachedClipsState, null, null, null, null, new ClipAlreadyAttachedDialogState(str2), false, false, false, false, null, 1007);
                                }
                                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                                for (ClipState clipState2 : list2) {
                                    if (epx.f(clipState2.c.a1(), str2)) {
                                        clipState2 = new ClipState(clipState2.b, clipState2.c, z5);
                                    }
                                    arrayList.add(clipState2);
                                }
                                return AttachedClipsState.a(attachedClipsState, null, arrayList, null, null, null, false, false, false, false, null, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT);
                            }
                        }
                        return attachedClipsState;
                    }
                });
                return;
            }
            if (!(cVar instanceof t44.c.C3716c)) {
                throw new NoWhenBranchMatchedException();
            }
            final String str2 = ((t44.c.C3716c) cVar).b;
            rdi.y(this, new izs() { // from class: xsna.e54
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    String str22;
                    Object obj2;
                    AttachedClipsState attachedClipsState = (AttachedClipsState) obj;
                    List<ClipState> list = attachedClipsState.c;
                    if (list != null) {
                        List<ClipState> list2 = list;
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            str22 = str2;
                            if (!hasNext) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (epx.f(((ClipState) obj2).c.a1(), str22)) {
                                break;
                            }
                        }
                        ClipState clipState = (ClipState) obj2;
                        if (clipState != null) {
                            boolean booleanValue = ((Boolean) attachedClipsState.n.getValue()).booleanValue();
                            boolean z5 = z3;
                            if (!booleanValue && z5) {
                                return AttachedClipsState.a(attachedClipsState, null, null, null, null, null, false, false, false, false, e9k0.a.a, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
                            }
                            if (z5 && ((Boolean) clipState.f.getValue()).booleanValue()) {
                                return AttachedClipsState.a(attachedClipsState, null, null, null, null, null, true, false, false, false, null, 991);
                            }
                            if (z3 && z5 && ((Boolean) clipState.e.getValue()).booleanValue()) {
                                return AttachedClipsState.a(attachedClipsState, null, null, null, null, new ClipAlreadyAttachedDialogState(str22), false, false, false, false, null, 1007);
                            }
                            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                            for (ClipState clipState2 : list2) {
                                if (epx.f(clipState2.c.a1(), str22)) {
                                    clipState2 = new ClipState(clipState2.b, clipState2.c, z5);
                                }
                                arrayList.add(clipState2);
                            }
                            return AttachedClipsState.a(attachedClipsState, null, arrayList, null, null, null, false, false, false, false, null, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT);
                        }
                    }
                    return attachedClipsState;
                }
            });
            return;
        }
        if (t44Var instanceof t44.f) {
            r();
            return;
        }
        if (t44Var instanceof t44.b) {
            q(true);
            return;
        }
        if (t44Var instanceof t44.d) {
            t44.d dVar = (t44.d) t44Var;
            if (dVar instanceof t44.d.a) {
                final String str3 = ((t44.d.a) dVar).b;
                rdi.y(this, new izs() { // from class: xsna.e54
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        String str22;
                        Object obj2;
                        AttachedClipsState attachedClipsState = (AttachedClipsState) obj;
                        List<ClipState> list = attachedClipsState.c;
                        if (list != null) {
                            List<ClipState> list2 = list;
                            Iterator<T> it = list2.iterator();
                            while (true) {
                                boolean hasNext = it.hasNext();
                                str22 = str3;
                                if (!hasNext) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it.next();
                                if (epx.f(((ClipState) obj2).c.a1(), str22)) {
                                    break;
                                }
                            }
                            ClipState clipState = (ClipState) obj2;
                            if (clipState != null) {
                                boolean booleanValue = ((Boolean) attachedClipsState.n.getValue()).booleanValue();
                                boolean z5 = z3;
                                if (!booleanValue && z5) {
                                    return AttachedClipsState.a(attachedClipsState, null, null, null, null, null, false, false, false, false, e9k0.a.a, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
                                }
                                if (z5 && ((Boolean) clipState.f.getValue()).booleanValue()) {
                                    return AttachedClipsState.a(attachedClipsState, null, null, null, null, null, true, false, false, false, null, 991);
                                }
                                if (z2 && z5 && ((Boolean) clipState.e.getValue()).booleanValue()) {
                                    return AttachedClipsState.a(attachedClipsState, null, null, null, null, new ClipAlreadyAttachedDialogState(str22), false, false, false, false, null, 1007);
                                }
                                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                                for (ClipState clipState2 : list2) {
                                    if (epx.f(clipState2.c.a1(), str22)) {
                                        clipState2 = new ClipState(clipState2.b, clipState2.c, z5);
                                    }
                                    arrayList.add(clipState2);
                                }
                                return AttachedClipsState.a(attachedClipsState, null, arrayList, null, null, null, false, false, false, false, null, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT);
                            }
                        }
                        return attachedClipsState;
                    }
                });
                return;
            } else {
                if (!(dVar instanceof t44.d.b) && !(dVar instanceof t44.d.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (t44Var instanceof t44.e) {
            t44.e eVar = (t44.e) t44Var;
            if (!(eVar instanceof t44.e.a) && !(eVar instanceof t44.e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        if (!(t44Var instanceof t44.g)) {
            if (!(t44Var instanceof t44.i)) {
                if (!(t44Var instanceof t44.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                m(true);
                return;
            }
            t44.i iVar = (t44.i) t44Var;
            if (iVar instanceof t44.i.b) {
                r();
                return;
            } else {
                if (!(iVar instanceof t44.i.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                rdi.y(this, new bz(3));
                return;
            }
        }
        t44.g gVar = (t44.g) t44Var;
        if (gVar instanceof t44.g.b) {
            q(false);
            return;
        }
        if (gVar instanceof t44.g.a) {
            rdi.y(this, new ob(3));
        } else {
            if (!(gVar instanceof t44.g.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((AttachedClipsState) sj50Var.getCurrentState()).i) {
                q(false);
            } else {
                rdi.y(this, new mo1(1));
            }
        }
    }

    public final void q(boolean z) {
        if (!z) {
            c(new x44.a(null));
            return;
        }
        List<VideoFile> j = ((AttachedClipsState) this.b.getCurrentState()).j();
        AttachedClipsArguments attachedClipsArguments = this.c;
        Integer num = attachedClipsArguments.c;
        if (!attachedClipsArguments.e || num == null) {
            c(new x44.a(new AttachedClipsResult(j)));
            return;
        }
        this.e.getClass();
        boolean d = com.vk.core.utils.newtork.b.d();
        if (!d) {
            rdi.y(this, new n82(4));
        }
        if (d) {
            int intValue = num.intValue();
            d3q.a(this, a64.a, ln50.a.b, new vl1(this, 5), new k54(this, intValue, j, null));
        }
    }

    public final void r() {
        d3q.a(this, y54.a, ln50.a.b, new qb(4), new a(null));
    }
}
