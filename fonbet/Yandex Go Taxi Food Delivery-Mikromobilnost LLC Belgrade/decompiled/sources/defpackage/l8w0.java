package defpackage;

import com.yandex.go.profile.config.SuperAppConfigProfileExperiment;
import kotlin.a;

/* loaded from: classes8.dex */
public final class l8w0 {
    public final qmp a;
    public final i3y b;

    public l8w0(rqo rqoVar, qmp qmpVar) {
        this.a = qmpVar;
        this.b = a.a(new zf2(rqoVar, 15));
    }

    public final boolean a() {
        Boolean bool = ((SuperAppConfigProfileExperiment) this.b.getValue()).b;
        if (bool != null) {
            return bool.booleanValue();
        }
        ((ul51) this.a).getClass();
        return true;
    }
}
