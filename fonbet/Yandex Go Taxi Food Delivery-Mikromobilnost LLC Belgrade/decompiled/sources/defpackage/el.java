package defpackage;

import android.view.View;
import defpackage.al;
import defpackage.dl;
import defpackage.fl;
import defpackage.tje;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final class el implements al {
    public final /* synthetic */ fl a;

    public el(fl flVar) {
        this.a = flVar;
    }

    @Override // defpackage.al
    public final void bf(gl glVar) {
        final fl flVar = this.a;
        ListItemComponent listItemComponent = flVar.x;
        listItemComponent.setTitle((String) glVar.b);
        listItemComponent.setLeadImage(((k0a0) glVar.x).a(flVar.w.getContext()));
        flVar.y.setText((String) glVar.c);
        ButtonComponent buttonComponent = flVar.A;
        buttonComponent.setOnClickListener(new tf(1, flVar));
        buttonComponent.setText((String) glVar.w);
        ButtonComponent buttonComponent2 = flVar.z;
        buttonComponent2.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.go.payments.shared.accountexistsdialog.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dl dlVar = fl.this.c;
                if (dlVar.C) {
                    return;
                }
                dlVar.C = true;
                ((al) dlVar.Dg()).bf(dlVar.Lg());
                tje.N(dlVar.Jg(), null, null, new AccountExistsDialogPresenter$onLeaveAccountClick$1(dlVar, null), 3);
            }
        });
        buttonComponent2.setProgressing(glVar.a);
    }
}
