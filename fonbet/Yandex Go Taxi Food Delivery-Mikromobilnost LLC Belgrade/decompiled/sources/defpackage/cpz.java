package defpackage;

import com.yandex.go.lootbox.impl.domain.interactors.animation.e;

/* loaded from: classes12.dex */
public final /* synthetic */ class cpz implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ String c;

    public /* synthetic */ cpz(e eVar, String str, int i) {
        this.a = i;
        this.b = eVar;
        this.c = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        String str = this.c;
        e eVar = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                jst.e.j(th);
                eVar.g.remove(str);
                break;
            default:
                eVar.g.remove(str);
                break;
        }
        return zy11Var;
    }
}
