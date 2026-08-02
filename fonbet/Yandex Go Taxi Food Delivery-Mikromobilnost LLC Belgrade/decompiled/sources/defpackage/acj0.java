package defpackage;

import android.graphics.Bitmap;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import ru.yandex.taxi.ui.form.RequirementAddressFormModalView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

/* loaded from: classes6.dex */
public final class acj0 implements bcj0 {
    public final /* synthetic */ RequirementAddressFormModalView a;

    public acj0(RequirementAddressFormModalView requirementAddressFormModalView) {
        this.a = requirementAddressFormModalView;
    }

    @Override // defpackage.bcj0
    public final void L5(String str) {
        qcj0 binding;
        binding = this.a.getBinding();
        binding.h.setText(str);
    }

    @Override // defpackage.bcj0
    public final void S8() {
        qcj0 binding;
        binding = this.a.getBinding();
        binding.g.setVisibility(8);
    }

    @Override // defpackage.bcj0
    public final void Wb(Bitmap bitmap) {
        qcj0 binding;
        binding = this.a.getBinding();
        boolean z = bitmap != null;
        ShimmeringFrameLayout shimmeringFrameLayout = binding.f;
        ImageView imageView = binding.e;
        shimmeringFrameLayout.setShimmering(false);
        imageView.setVisibility(z ? 0 : 8);
        if (z) {
            imageView.setImageBitmap(bitmap);
        }
    }

    @Override // defpackage.bcj0
    public final void d4(xcj0 xcj0Var) {
        ubj0 ubj0Var;
        qcj0 binding;
        RequirementAddressFormModalView requirementAddressFormModalView = this.a;
        ubj0Var = requirementAddressFormModalView.adapter;
        ubj0Var.submitList(xcj0Var.a);
        binding = requirementAddressFormModalView.getBinding();
        binding.d.setTitle(xcj0Var.b);
        binding.d.setSubtitle(xcj0Var.c);
    }

    @Override // defpackage.bcj0
    public final void hideKeyboard() {
        RequirementAddressFormModalView requirementAddressFormModalView = this.a;
        ((InputMethodManager) requirementAddressFormModalView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(requirementAddressFormModalView.getWindowToken(), 0);
    }
}
