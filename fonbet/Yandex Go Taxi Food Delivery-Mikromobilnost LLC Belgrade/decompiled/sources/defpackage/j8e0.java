package defpackage;

import ru.yandex.taxi.modal.popup.ui.model.PopupDialogModalUiState$HeaderType;

/* loaded from: classes6.dex */
public final class j8e0 {
    public final PopupDialogModalUiState$HeaderType a;

    public j8e0(PopupDialogModalUiState$HeaderType popupDialogModalUiState$HeaderType, int i) {
        this.a = (i & 1) != 0 ? PopupDialogModalUiState$HeaderType.DEFAULT : popupDialogModalUiState$HeaderType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8e0) && this.a == ((j8e0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderAppearance(type=" + this.a + ", hasDivider=false)";
    }

    public j8e0() {
        this(null, 3);
    }
}
