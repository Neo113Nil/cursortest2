package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.go.payments.shared.business.accountcreation.BusinessAccountCreationView;
import com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.factory.CitySuggestDialogModalView;
import com.yandex.go.payments.shared.business.accountcreation.corp.factory.CorpCreatingDraftModalView;
import com.yandex.go.payments.shared.business.accountcreation.corp.factory.CorpCreatingLimitExceededModalView;
import com.yandex.go.payments.shared.business.accountcreation.corp.factory.CorpSuccessDraftCreatedModalView;
import com.yandex.go.payments.shared.members.cardselector.CardSelectorView;
import com.yandex.go.payments.shared.members.cardselector.a;
import com.yandex.go.payments.shared.v;
import com.yandex.go.payments.shared.wizard.welcome.CreateAccountView;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.sharedpayments.c;
import ru.yandex.taxi.transition.b;
import ru.yandex.taxi.web.modal.WebContainerModalView;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes13.dex */
public final class lw6 extends b {
    public final /* synthetic */ int c;
    public final ModalView w;

    public lw6(p1b p1bVar, Context context) {
        this.c = 1;
        c0g c0gVar = (c0g) ((i6r) p1bVar.a);
        tt2 Z1 = c0gVar.Z1();
        q5z.h(Z1);
        sn8 sn8Var = (sn8) p1bVar.b;
        v W2 = c0gVar.W2();
        zor0 X2 = c0gVar.X2();
        q5z.h(X2);
        vnr0 V2 = c0gVar.V2();
        q5z.h(V2);
        pmn pmnVar = new pmn(new qmn());
        zzf zzfVar = c0gVar.z;
        a aVar = new a(Z1, sn8Var, W2, X2, V2, pmnVar, zzfVar.g1(), zzfVar.e1(), (lw90) zzfVar.E9.get(), new v9a0(0, (v9a0) c0gVar.A.a.S3.a));
        g1a0 E2 = c0gVar.E2();
        pav w2 = c0gVar.w2();
        q5z.h(w2);
        c0gVar.getClass();
        x4c x4cVar = x4c.L;
        c0gVar.getClass();
        this.w = new CardSelectorView(context, aVar, E2, w2, x4cVar, new sxz(), c0gVar.z.b1());
    }

    @Override // ru.yandex.taxi.transition.b
    /* renamed from: N3 */
    public final ModalView h() {
        int i = this.c;
        ModalView modalView = this.w;
        switch (i) {
            case 0:
                return (BusinessAccountCreationView) modalView;
            case 1:
                return (CardSelectorView) modalView;
            case 2:
                return (CitySuggestDialogModalView) modalView;
            case 3:
                return (CorpCreatingDraftModalView) modalView;
            case 4:
                return (CorpCreatingLimitExceededModalView) modalView;
            case 5:
                return (CorpSuccessDraftCreatedModalView) modalView;
            case 6:
                return (CreateAccountView) modalView;
            default:
                return (WebContainerModalView) modalView;
        }
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final View h() {
        int i = this.c;
        ModalView modalView = this.w;
        switch (i) {
            case 0:
                return (BusinessAccountCreationView) modalView;
            case 1:
                return (CardSelectorView) modalView;
            case 2:
                return (CitySuggestDialogModalView) modalView;
            case 3:
                return (CorpCreatingDraftModalView) modalView;
            case 4:
                return (CorpCreatingLimitExceededModalView) modalView;
            case 5:
                return (CorpSuccessDraftCreatedModalView) modalView;
            case 6:
                return (CreateAccountView) modalView;
            default:
                return (WebContainerModalView) modalView;
        }
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public void requestFocus() {
        int i = this.c;
        ModalView modalView = this.w;
        switch (i) {
            case 0:
                ((BusinessAccountCreationView) modalView).requestFocus();
                break;
            case 1:
                ((CardSelectorView) modalView).requestFocus();
                break;
            case 2:
                ((CitySuggestDialogModalView) modalView).requestFocus();
                break;
            case 3:
                ((CorpCreatingDraftModalView) modalView).requestFocus();
                break;
            case 4:
                ((CorpCreatingLimitExceededModalView) modalView).requestFocus();
                break;
            case 5:
                ((CorpSuccessDraftCreatedModalView) modalView).requestFocus();
                break;
            case 6:
                ((CreateAccountView) modalView).requestFocus();
                break;
            default:
                super.requestFocus();
                break;
        }
    }

    public lw6(vbb vbbVar) {
        this.c = 6;
        c0g c0gVar = (c0g) ((i6r) vbbVar.a);
        Context e2 = c0gVar.e2();
        q5z.h(e2);
        tse f2 = c0gVar.f2();
        q5z.h(f2);
        pav w2 = c0gVar.w2();
        q5z.h(w2);
        k7x0 Z2 = c0gVar.Z2();
        q5z.h(Z2);
        q3f q3fVar = (q3f) vbbVar.b;
        v W2 = c0gVar.W2();
        zor0 X2 = c0gVar.X2();
        q5z.h(X2);
        vnr0 V2 = c0gVar.V2();
        q5z.h(V2);
        g V1 = c0gVar.V1();
        q5z.h(V1);
        c cVar = (c) c0gVar.A.a.J3.get();
        q5z.h(cVar);
        rqo l2 = c0gVar.l2();
        q5z.h(l2);
        this.w = new CreateAccountView(e2, f2, w2, Z2, new com.yandex.go.payments.shared.wizard.welcome.a(q3fVar, W2, X2, V2, V1, cVar, l2));
    }

    public /* synthetic */ lw6(SlideableModalView slideableModalView, int i) {
        this.c = i;
        this.w = slideableModalView;
    }

    public lw6(wwf wwfVar, Context context, ffe ffeVar, qnu0 qnu0Var, zm41 zm41Var, bue bueVar) {
        this.c = 0;
        this.w = new BusinessAccountCreationView(context, wwfVar, ffeVar, qnu0Var, zm41Var, bueVar);
    }
}
