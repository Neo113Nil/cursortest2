package defpackage;

import kotlin.coroutines.Continuation;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.shortcuts.interactors.b;

/* loaded from: classes10.dex */
public final class czr0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ czr0(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        String c;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                boolean f = bVar.c.f();
                if (f) {
                    ((ul51) bVar.e.b).getClass();
                    c = "on_multiorder";
                } else {
                    c = f ? "on_order" : bVar.g.c();
                }
                bVar.b.d(c, th.getMessage());
                break;
            default:
                paf0 paf0Var = (paf0) obj;
                bVar.getClass();
                String str = ((vaf0) paf0Var.b()).f;
                i d = ((j) bVar.a).d(b64.j(str, ".SuggestCard.Error"));
                d.d(MetaDataField.SCREEN_FIELD, str);
                d.d("ErrorType", "shortcuts_not_loaded");
                d.d("ErrorInfo", paf0Var.a().getMessage());
                d.d("MainScreenVersion", "shortcuts");
                d.m();
                break;
        }
        return zy11Var;
    }
}
