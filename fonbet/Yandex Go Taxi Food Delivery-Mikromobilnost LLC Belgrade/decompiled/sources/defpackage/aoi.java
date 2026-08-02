package defpackage;

import android.view.ViewGroup;
import ru.yandex.taxi.logistics.sdk.logger.Logger$Severity;

/* loaded from: classes5.dex */
public final class aoi implements xni {
    public final wni a;
    public final uni b;
    public final vni c;
    public ViewGroup d;

    public aoi(wni wniVar, uni uniVar, vni vniVar) {
        this.a = wniVar;
        this.b = uniVar;
        this.c = vniVar;
    }

    @Override // defpackage.xni
    public final void a() {
        ViewGroup viewGroup = this.d;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.d = null;
    }

    @Override // defpackage.xni
    public final void b(ViewGroup viewGroup) {
        boolean l = jl40.l(this.d, viewGroup);
        wni wniVar = this.a;
        if (l) {
            jgz.a.h("aoi");
            jgz.g(Logger$Severity.VERBOSE, jgz.e(), oyr.p("Attaching screen ", wniVar.getClass().getSimpleName(), " to the same container"), null, 8);
            return;
        }
        a();
        this.d = viewGroup;
        jgz.a.h("aoi");
        String simpleName = wniVar.getClass().getSimpleName();
        vni vniVar = this.c;
        String simpleName2 = vniVar.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder("Attaching screen ");
        sb.append(simpleName);
        sb.append(" with args ");
        uni uniVar = this.b;
        sb.append(uniVar);
        sb.append(" with callback ");
        sb.append(simpleName2);
        jgz.a(sb.toString(), new Object[0]);
        viewGroup.addView(wniVar.m(uniVar, vniVar));
    }
}
