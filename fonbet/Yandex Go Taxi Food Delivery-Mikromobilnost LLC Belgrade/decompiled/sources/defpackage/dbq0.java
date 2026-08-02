package defpackage;

import ru.yandex.taxi.contacts.SelectContactMvpView;
import ru.yandex.taxi.contacts.SelectContactView;
import ru.yandex.taxi.contacts.d;
import ru.yandex.taxi.contacts.g;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;

/* loaded from: classes5.dex */
public final /* synthetic */ class dbq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectContactView b;

    public /* synthetic */ dbq0(SelectContactView selectContactView, int i) {
        this.a = i;
        this.b = selectContactView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar;
        d dVar2;
        AnimatedListItemInputComponent animatedListItemInputComponent;
        AnimatedListItemInputComponent animatedListItemInputComponent2;
        d dVar3;
        int i = this.a;
        SelectContactView selectContactView = this.b;
        switch (i) {
            case 0:
                SelectContactView.setupContactsButton$lambda$0(selectContactView);
                break;
            case 1:
                SelectContactView.setTitleNavigation$lambda$0(selectContactView);
                break;
            case 2:
                SelectContactView.pickFromContactClicked$lambda$0(selectContactView);
                break;
            case 3:
                SelectContactView.manuallyInputClick$lambda$0(selectContactView);
                break;
            case 4:
                SelectContactView.onAttachedToWindow$lambda$0(selectContactView);
                break;
            case 5:
                SelectContactView.onAttachedToWindow$lambda$1(selectContactView);
                break;
            case 6:
                selectContactView.screenTitle.title().requestFocus();
                selectContactView.screenTitle.title().performAccessibilityAction(64, null);
                selectContactView.screenTitle.title().sendAccessibilityEvent(8);
                break;
            case 7:
                dVar = selectContactView.presenter;
                SelectContactMvpView.UiState uiState = dVar.H;
                SelectContactMvpView.UiState uiState2 = SelectContactMvpView.UiState.NORMAL;
                if (uiState == uiState2) {
                    dVar.H = SelectContactMvpView.UiState.EDIT;
                } else if (uiState == SelectContactMvpView.UiState.EDIT) {
                    dVar.H = uiState2;
                }
                SelectContactMvpView selectContactMvpView = (SelectContactMvpView) dVar.Dg();
                SelectContactMvpView.UiState uiState3 = dVar.H;
                dgq0 dgq0Var = dVar.z;
                selectContactMvpView.xf(dgq0Var.e(), uiState3);
                dVar.Ng(dgq0Var.e(), dVar.y.d);
                break;
            case 8:
                dVar2 = selectContactView.presenter;
                SelectContactMvpView.UiState uiState4 = dVar2.H;
                SelectContactMvpView.UiState uiState5 = SelectContactMvpView.UiState.NORMAL;
                if (uiState4 == uiState5) {
                    dVar2.H = SelectContactMvpView.UiState.EDIT;
                } else if (uiState4 == SelectContactMvpView.UiState.EDIT) {
                    dVar2.H = uiState5;
                }
                SelectContactMvpView selectContactMvpView2 = (SelectContactMvpView) dVar2.Dg();
                SelectContactMvpView.UiState uiState6 = dVar2.H;
                dgq0 dgq0Var2 = dVar2.z;
                selectContactMvpView2.xf(dgq0Var2.e(), uiState6);
                dVar2.Ng(dgq0Var2.e(), dVar2.y.d);
                break;
            case 9:
                animatedListItemInputComponent = selectContactView.nameInput;
                animatedListItemInputComponent.focusInput();
                animatedListItemInputComponent2 = selectContactView.nameInput;
                if (animatedListItemInputComponent2 != null) {
                    animatedListItemInputComponent2.post(new xd2(animatedListItemInputComponent2, 1));
                    break;
                }
                break;
            default:
                dVar3 = selectContactView.presenter;
                g gVar = dVar3.C;
                gVar.e = new b7p0(9, dVar3);
                gVar.a();
                break;
        }
    }
}
