package defpackage;

import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.ui.CircleLoadingImageView;
import com.yandex.go.ui.UserPhotoUploadingModalView;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class cr21 implements gr21 {
    public final /* synthetic */ UserPhotoUploadingModalView a;

    public cr21(UserPhotoUploadingModalView userPhotoUploadingModalView) {
        this.a = userPhotoUploadingModalView;
    }

    @Override // defpackage.gr21
    public final void G7(tr21 tr21Var) {
        dr21 binding;
        dr21 binding2;
        dr21 binding3;
        dr21 binding4;
        dr21 binding5;
        dr21 binding6;
        dr21 binding7;
        dr21 binding8;
        boolean z = tr21Var instanceof pr21;
        UserPhotoUploadingModalView userPhotoUploadingModalView = this.a;
        if (z) {
            binding7 = userPhotoUploadingModalView.getBinding();
            cma1.L(binding7.d.b);
            cma1.L((ConstraintLayout) binding7.c.b);
            cma1.J((ConstraintLayout) binding7.b.d);
            ecp0 ecp0Var = ((pr21) tr21Var).a;
            String str = ecp0Var.a;
            binding8 = userPhotoUploadingModalView.getBinding();
            CircleLoadingImageView circleLoadingImageView = (CircleLoadingImageView) binding8.b.h;
            if (str.length() == 0) {
                circleLoadingImageView.showPlaceholder();
            } else {
                CircleLoadingImageView.setImage$default(circleLoadingImageView, str, 0, 2, null);
            }
            h(ecp0Var.b, ecp0Var.c, ecp0Var.d, ecp0Var.e, ecp0Var.f);
            return;
        }
        if (tr21Var instanceof sr21) {
            binding3 = userPhotoUploadingModalView.getBinding();
            qzm qzmVar = binding3.b;
            binding4 = userPhotoUploadingModalView.getBinding();
            cma1.L(binding4.d.b);
            binding5 = userPhotoUploadingModalView.getBinding();
            cma1.L((ConstraintLayout) binding5.c.b);
            binding6 = userPhotoUploadingModalView.getBinding();
            cma1.J((ConstraintLayout) binding6.b.d);
            ((CircleLoadingImageView) qzmVar.h).showLoading();
            ecp0 ecp0Var2 = ((sr21) tr21Var).a;
            h(ecp0Var2.b, ecp0Var2.c, ecp0Var2.d, ecp0Var2.e, ecp0Var2.f);
            return;
        }
        if (jl40.l(tr21Var, rr21.a)) {
            binding2 = userPhotoUploadingModalView.getBinding();
            cma1.L((ConstraintLayout) binding2.c.b);
            cma1.M((ConstraintLayout) binding2.b.d);
            cma1.J(binding2.d.b);
            return;
        }
        if (!(tr21Var instanceof qr21)) {
            w511.b();
            return;
        }
        binding = userPhotoUploadingModalView.getBinding();
        win winVar = binding.d;
        nzm nzmVar = binding.c;
        cma1.L(winVar.b);
        cma1.M((ConstraintLayout) binding.b.d);
        cma1.J((ConstraintLayout) nzmVar.b);
        ((ButtonComponent) nzmVar.c).setDebounceClickListener(new bh11(12, tr21Var));
    }

    public final void h(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, ArrayList arrayList) {
        dr21 binding;
        UserPhotoUploadingModalView userPhotoUploadingModalView = this.a;
        binding = userPhotoUploadingModalView.getBinding();
        qzm qzmVar = binding.b;
        userPhotoUploadingModalView.setTextAnimated((RobotoTextView) qzmVar.g, charSequence);
        userPhotoUploadingModalView.setTextAnimated((RobotoTextView) qzmVar.b, charSequence2);
        userPhotoUploadingModalView.setTextAnimated((RobotoTextView) qzmVar.f, charSequence3);
        userPhotoUploadingModalView.updateLinkText((RobotoTextView) qzmVar.e, charSequence4);
        LinearLayout linearLayout = (LinearLayout) qzmVar.c;
        linearLayout.removeAllViews();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linearLayout.addView((ButtonComponent) it.next());
        }
    }
}
