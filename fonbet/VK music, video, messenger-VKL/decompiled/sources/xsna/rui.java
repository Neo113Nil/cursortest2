package xsna;

import java.util.ArrayList;
import xsna.hn50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.yl50;

/* compiled from: CompositeTaskExecutorBuilder.kt */
/* loaded from: classes3.dex */
public final class rui<State extends lm50, TaskId extends on50, Task extends hn50<TaskId>, Patch extends yl50, Event extends pk50> {
    public final nn50<State, TaskId, Task, Patch, Event> a;
    public wzs<? super qk50, ? super Task, Object> b;
    public final ArrayList c = new ArrayList();

    public rui(nn50<State, TaskId, Task, Patch, Event> nn50Var) {
        this.a = nn50Var;
    }

    public final f64 a(dl50 dl50Var) {
        f64 f64Var = new f64(dl50Var);
        this.c.add(f64Var);
        return f64Var;
    }
}
