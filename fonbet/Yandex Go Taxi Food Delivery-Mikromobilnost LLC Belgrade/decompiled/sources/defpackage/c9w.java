package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ylw;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.contacts.SelectedFrom;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes6.dex */
public final class c9w implements b9w {
    public final d9w a;
    public final wiq0 b;
    public final vp21 c;
    public final zuj0 d;

    public c9w(d9w d9wVar, wiq0 wiq0Var, vp21 vp21Var, zuj0 zuj0Var) {
        this.a = d9wVar;
        this.b = wiq0Var;
        this.c = vp21Var;
        this.d = zuj0Var;
    }

    public final tfb0 a(bgq0 bgq0Var) {
        ylw.e eVar;
        pex0 m = ((k) this.b).m();
        String str = m != null ? m.b : null;
        if (str == null) {
            str = "";
        }
        e9w e9wVar = (e9w) this.a;
        ylw ylwVar = (ylw) e9wVar.b.b();
        ylw.c a = e9wVar.a(ylwVar, str);
        ga0 ga0Var = (a == null || (eVar = a.c) == null) ? null : new ga0(d6z.Y(ylwVar, eVar.a), d6z.Y(ylwVar, eVar.b), false);
        String Og = ((h) this.c).Og();
        List singletonList = !evu0.J(Og) ? Collections.singletonList(new bgq0(((avj0) this.d).h(kyh0.superapp_user_contact_name), Og, (SelectedFrom) null, 12)) : EmptyList.a;
        String str2 = ga0Var != null ? ga0Var.a : null;
        String str3 = str2 == null ? "" : str2;
        String str4 = ga0Var != null ? ga0Var.b : null;
        if (bgq0Var == null) {
            bgq0Var = bgq0.f;
        }
        return new tfb0(str3, singletonList, str4, bgq0Var, false, null, null, 244592);
    }
}
