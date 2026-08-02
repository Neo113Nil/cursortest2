package defpackage;

import com.yandex.go.analytics.rythm.experiments.RythmEventGroupsExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes12.dex */
public final class fll0 implements t1b0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public fll0(rqo rqoVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                jso0.Companion.getClass();
                this.b = ((jbh) rqoVar).d(jso0.d);
                break;
            default:
                RythmEventGroupsExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).d(RythmEventGroupsExperiment.e);
                break;
        }
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        switch (this.a) {
        }
        return this.b.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        switch (this.a) {
            case 0:
                return (RythmEventGroupsExperiment) this.b.c();
            default:
                return (jso0) this.b.c();
        }
    }
}
