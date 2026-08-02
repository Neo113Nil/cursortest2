package defpackage;

import android.text.Editable;
import android.widget.EditText;
import androidx.transition.Transition;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationFragment;

/* loaded from: classes3.dex */
public final class n98 extends xmh {
    public final /* synthetic */ CardActivationFragment a;

    public n98(CardActivationFragment cardActivationFragment) {
        this.a = cardActivationFragment;
    }

    @Override // defpackage.xmh, androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        CardActivationFragment cardActivationFragment = this.a;
        CardActivationFragment.access$getBinding(cardActivationFragment).b.getEditText().setCursorVisible(true);
        EditText editText = CardActivationFragment.access$getBinding(cardActivationFragment).b.getEditText();
        Editable text = CardActivationFragment.access$getBinding(cardActivationFragment).b.getEditText().getText();
        editText.setSelection(text != null ? text.length() : 0);
    }

    @Override // defpackage.xmh, androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        CardActivationFragment.access$getBinding(this.a).b.getEditText().setCursorVisible(false);
    }
}
