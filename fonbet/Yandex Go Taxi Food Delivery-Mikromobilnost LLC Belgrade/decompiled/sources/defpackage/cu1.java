package defpackage;

import com.yandex.go.taxi.experiments.DisableSwipeVerticalsExperiment;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes14.dex */
public final class cu1 {
    public final qqo a;

    public cu1(rqo rqoVar, int i) {
        switch (i) {
            case 1:
                DisableSwipeVerticalsExperiment.Companion.getClass();
                this.a = ((jbh) rqoVar).c(DisableSwipeVerticalsExperiment.c);
                break;
            case 2:
                ac11.Companion.getClass();
                this.a = ((jbh) rqoVar).c(new ac11(0));
                break;
            default:
                this.a = ((jbh) rqoVar).a(SimpleBooleanExperiment.ALLOW_LETTER_FOR_PORCH);
                break;
        }
    }
}
