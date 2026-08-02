package defpackage;

import com.yandex.go.trusted_contacts.share_settings.edit.EditContactNameModalView;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;

/* loaded from: classes14.dex */
public final class aln implements dln {
    public final /* synthetic */ EditContactNameModalView a;

    public aln(EditContactNameModalView editContactNameModalView) {
        this.a = editContactNameModalView;
    }

    @Override // defpackage.dln
    public final void oe(lln llnVar) {
        AnimatedListItemInputComponent animatedListItemInputComponent = EditContactNameModalView.access$getBinding(this.a).b;
        animatedListItemInputComponent.setValue(llnVar.a);
        animatedListItemInputComponent.setErrorText(llnVar.b);
    }
}
