package defpackage;

import com.yandex.passport.common.url.b;
import com.yandex.passport.internal.ui.challenge.webview.e;
import com.yandex.passport.internal.ui.challenge.webview.f;
import com.yandex.passport.internal.ui.challenge.webview.g;
import com.yandex.passport.internal.ui.challenge.webview.h;
import com.yandex.passport.internal.ui.challenge.webview.j;
import ru.yandex.taxi.address.clarification.UpdateReason;
import ru.yandex.taxi.address.clarification.impl.repo.a;
import ru.yandex.taxi.common_models.net.map_object.a0;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes9.dex */
public final /* synthetic */ class cq0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ cq0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.y;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                zb1 zb1Var = (zb1) obj6;
                a aVar = (a) obj4;
                g2t g2tVar = (g2t) obj3;
                UpdateReason updateReason = (UpdateReason) obj2;
                a0 a0Var = (a0) obj;
                String str = jl40.l(((p820) obj5).a, zb1Var.b) ? zb1Var.a : "";
                i iVar = aVar.a;
                iVar.getClass();
                return new bc1(a0Var, updateReason, str, iVar.m(g2tVar, true), g2tVar, aVar.e);
            default:
                tls tlsVar = (tls) obj6;
                tls tlsVar2 = (tls) obj5;
                tls tlsVar3 = (tls) obj4;
                oz40 oz40Var = (oz40) obj3;
                oz40 oz40Var2 = (oz40) obj2;
                j jVar = (j) obj;
                if (jVar instanceof e) {
                    tlsVar.invoke(((e) jVar).a());
                } else if (jVar instanceof g) {
                    tlsVar2.invoke(new b(((g) jVar).a()));
                } else if (jVar instanceof h) {
                    oz40Var2.setValue(((h) jVar).a());
                } else if (jVar instanceof com.yandex.passport.internal.ui.challenge.webview.i) {
                    tlsVar3.invoke(((com.yandex.passport.internal.ui.challenge.webview.i) jVar).a());
                } else {
                    if (!(jVar instanceof f)) {
                        w511.b();
                        return null;
                    }
                    oz40Var.setValue(Boolean.TRUE);
                }
                return zy11.a;
        }
    }
}
