package xsna;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import ru.ok.tracer.base.ucum.UcumUtils;

/* compiled from: ConstraintLayout.kt */
/* loaded from: classes11.dex */
public final class bzm implements yym {
    public final lj70 a;
    public final lj70 b;
    public final lj70 c;

    public bzm(String str) {
        this.a = new lj70(str, "base");
        Object obj = null;
        this.b = new lj70(obj, UcumUtils.UCUM_MINUTES);
        this.c = new lj70(obj, InneractiveMediationNameConsts.MAX);
    }
}
