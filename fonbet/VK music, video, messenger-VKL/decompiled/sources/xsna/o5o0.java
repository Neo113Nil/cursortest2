package xsna;

import android.os.Trace;
import com.ironsource.X3;
import com.vk.im.engine.internal.TaskExecutorMultipleGroupSwitching;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class o5o0 implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o5o0(long j, mtk0 mtk0Var, TimelineViewState.d dVar) {
        this.c = j;
        this.d = mtk0Var;
        this.e = dVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        String name;
        switch (this.b) {
            case 0:
                q5o0 q5o0Var = (q5o0) this.d;
                e1w e1wVar = (e1w) this.e;
                long j = this.c;
                q5o0Var.getClass();
                ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
                if (threadGroup != null && (name = threadGroup.getName()) != null) {
                    mla mlaVar = e1wVar.a;
                    if (mlaVar == null) {
                        mlaVar = null;
                    }
                    int i = 0;
                    while (true) {
                        if (mlaVar != null && !mlaVar.d.equals(X3.i.Z)) {
                            if (mlaVar.d.equals(name)) {
                                i++;
                            }
                            if (i >= 2) {
                                ohp0 ohp0Var = q5o0Var.a.getConfig().g;
                                TaskExecutorMultipleGroupSwitching taskExecutorMultipleGroupSwitching = new TaskExecutorMultipleGroupSwitching("Multiple command switching within the same group: " + name + " (" + e1wVar + "). Consider refactoring into direct calls.");
                                mla mlaVar2 = e1wVar.a;
                                nr2.L(taskExecutorMultipleGroupSwitching, (mlaVar2 != null ? mlaVar2 : null).b());
                                x19.N(ohp0Var, taskExecutorMultipleGroupSwitching);
                            } else {
                                mlaVar = mlaVar.a();
                            }
                        }
                    }
                }
                q5o0Var.b.getClass();
                q5o0Var.a.K().g().j(System.currentTimeMillis() - j, e1wVar.getClass().getName(), sv1.n(e1wVar));
                boolean e = ndp0.e();
                if (e) {
                    ndp0.b("TaskExecutor " + e1wVar.getClass().getCanonicalName() + " on " + sv1.o(e1wVar));
                }
                try {
                    try {
                        q5o0Var.j.add(Thread.currentThread());
                        return q5o0Var.b(q5o0Var.a, e1wVar);
                    } finally {
                        q5o0Var.j.remove(Thread.currentThread());
                    }
                } finally {
                    if (e) {
                        Trace.endSection();
                    }
                }
            default:
                long j2 = this.c;
                return Integer.valueOf((int) Math.floor(((((TimelineViewState.d) this.e).e - 1) * (Math.min(j2, Math.max(0L, ((Number) ((mtk0) this.d).getValue()).longValue())) / j2)) + 0.5d));
        }
    }

    public /* synthetic */ o5o0(q5o0 q5o0Var, e1w e1wVar, long j) {
        this.d = q5o0Var;
        this.e = e1wVar;
        this.c = j;
    }
}
