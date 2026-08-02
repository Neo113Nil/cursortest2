package defpackage;

import com.yandex.go.tips.experiments.TipsSettingsModalExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.c;

/* loaded from: classes6.dex */
public final class ehu implements t1b0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public ehu(rqo rqoVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                TipsSettingsModalExperiment.Companion.getClass();
                this.b = uga1.b(rqoVar, TipsSettingsModalExperiment.e);
                break;
            default:
                dhu.Companion.getClass();
                this.b = uga1.b(rqoVar, dhu.e);
                break;
        }
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        int i = this.a;
        c cVar = this.b;
        switch (i) {
        }
        return cVar.a();
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
                return (dhu) this.b.c();
            default:
                return (TipsSettingsModalExperiment) this.b.c();
        }
    }
}
