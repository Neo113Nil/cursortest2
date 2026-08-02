package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardRequisiteFieldView;

/* loaded from: classes3.dex */
public final class h461 implements zo31 {
    public final ConstraintLayout a;

    public h461(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, CardRequisiteFieldView cardRequisiteFieldView, CardRequisiteFieldView cardRequisiteFieldView2, CardRequisiteFieldView cardRequisiteFieldView3) {
        this.a = constraintLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
