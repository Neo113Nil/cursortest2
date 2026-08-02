package defpackage;

import ru.yandex.taxi.preorder.suggested.selection.c;

/* loaded from: classes6.dex */
public final /* synthetic */ class l5v0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ l5v0(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.b;
        CharSequence charSequence = (CharSequence) obj;
        switch (i) {
            case 0:
                cVar.O.setTrailCompanionText(charSequence);
                break;
            case 1:
                cVar.O.setTrailCompanionSubtext(charSequence);
                break;
            case 2:
                cVar.W = charSequence;
                cVar.O.setSubtitle(charSequence);
                break;
            default:
                cVar.S = charSequence;
                cVar.O.setTitle(charSequence);
                break;
        }
        return zy11Var;
    }
}
