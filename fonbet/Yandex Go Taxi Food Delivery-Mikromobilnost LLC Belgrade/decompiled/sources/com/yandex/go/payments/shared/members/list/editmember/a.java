package com.yandex.go.payments.shared.members.list.editmember;

import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.data.model.SaveMemberDetails;
import defpackage.amn;
import defpackage.bmn;
import defpackage.jst;
import defpackage.kh10;
import defpackage.mum;
import defpackage.tje;
import defpackage.uln;
import defpackage.wln;
import ru.yandex.taxi.exception.ValidationException;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                wln wlnVar = ((amn) obj).c;
                kh10 kh10Var = wlnVar.I;
                wlnVar.D.m(wlnVar.G.b, wlnVar.H, wlnVar.J, SharedPaymentAnalytics$Button.DONE);
                ((uln) wlnVar.Dg()).closeKeyboard();
                try {
                    mum mumVar = wlnVar.y;
                    bmn bmnVar = wlnVar.J;
                    mumVar.getClass();
                    SaveMemberDetails i2 = mum.i(bmnVar, kh10Var);
                    bmn bmnVar2 = wlnVar.J;
                    bmnVar2.o = false;
                    bmnVar2.k = true;
                    bmnVar2.j = kh10Var.m;
                    bmnVar2.k = true;
                    tje.N(wlnVar.Jg(), null, null, new EditMemberPresenter$onSaveClick$1(wlnVar, i2, null), 3);
                    wlnVar.Og();
                    break;
                } catch (ValidationException e) {
                    jst.e.j(e);
                    bmn bmnVar3 = wlnVar.J;
                    bmnVar3.o = true;
                    bmnVar3.k = false;
                    bmnVar3.j = wlnVar.I.k;
                    wlnVar.Og();
                    wlnVar.Ng(e);
                    return;
                }
            case 1:
                wln wlnVar2 = ((amn) obj).c;
                tje.N(wlnVar2.Jg(), null, null, new EditMemberPresenter$onSelectContactClick$1(wlnVar2, null), 3);
                break;
            default:
                wln wlnVar3 = (wln) obj;
                bmn bmnVar4 = wlnVar3.J;
                boolean z = bmnVar4.i;
                bmnVar4.i = true;
                bmnVar4.o = false;
                bmnVar4.k = true;
                bmnVar4.j = wlnVar3.I.n;
                wlnVar3.Og();
                tje.N(wlnVar3.Jg(), null, null, new EditMemberPresenter$removeMember$1(wlnVar3, z, null), 3);
                break;
        }
    }
}
