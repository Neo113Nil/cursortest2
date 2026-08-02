package defpackage;

import com.yandex.go.chargers.plus.api.ChargersPlusPlaqueExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes.dex */
public final class jma implements t1b0 {
    public final /* synthetic */ q a;

    public jma(rqo rqoVar) {
        ChargersPlusPlaqueExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(ChargersPlusPlaqueExperiment.f);
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (ChargersPlusPlaqueExperiment) this.a.c();
    }
}
