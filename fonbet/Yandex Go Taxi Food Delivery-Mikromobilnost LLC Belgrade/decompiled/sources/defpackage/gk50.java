package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

@gsq0
/* loaded from: classes6.dex */
public final class gk50 {
    public static final fk50 Companion = new fk50();
    public static final i3y[] h;
    public final String a;
    public final zzs b;
    public final Set c;
    public final List d;
    public final boolean e;
    public final RequirementsParam f;
    public final pka0 g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new ah40(26)), a.b(lazyThreadSafetyMode, new ah40(27)), null, a.b(lazyThreadSafetyMode, new ah40(28)), null};
    }

    public /* synthetic */ gk50(int i, String str, zzs zzsVar, Set set, List list, boolean z, RequirementsParam requirementsParam, pka0 pka0Var) {
        if (127 != (i & HProv.PP_VERSION_TIMESTAMP)) {
            qje.Z(i, HProv.PP_VERSION_TIMESTAMP, ek50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = zzsVar;
        this.c = set;
        this.d = list;
        this.e = z;
        this.f = requirementsParam;
        this.g = pka0Var;
    }

    public gk50(String str, zzs zzsVar, Set set, List list, RequirementsParam requirementsParam, pka0 pka0Var) {
        this.a = str;
        this.b = zzsVar;
        this.c = set;
        this.d = list;
        this.e = true;
        this.f = requirementsParam;
        this.g = pka0Var;
    }
}
