package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.payments.shared.family.postcard.ui.PostcardView;

/* loaded from: classes13.dex */
public final class age0 implements kfe0 {
    public boolean a;
    public final /* synthetic */ PostcardView b;

    public age0(PostcardView postcardView) {
        this.b = postcardView;
    }

    @Override // defpackage.kfe0
    public final void P7(boolean z) {
        bge0 binding;
        binding = this.b.getBinding();
        binding.g.setShimmering(z);
    }

    @Override // defpackage.kfe0
    public final void X1(boolean z) {
        bge0 binding;
        bge0 binding2;
        bge0 binding3;
        bge0 binding4;
        bge0 binding5;
        bge0 binding6;
        if (this.a == z) {
            return;
        }
        this.a = z;
        PostcardView postcardView = this.b;
        if (z) {
            binding5 = postcardView.getBinding();
            binding5.g.setForeground(vng.t(y2h0.postcard_foreground, postcardView.getContext()));
            binding6 = postcardView.getBinding();
            binding6.g.setImportantForAccessibility(1);
            return;
        }
        binding = postcardView.getBinding();
        ConstraintLayout constraintLayout = binding.a;
        if (constraintLayout != null) {
            constraintLayout.post(new ce0(constraintLayout, 15));
        }
        binding2 = postcardView.getBinding();
        binding2.g.setForeground(null);
        binding3 = postcardView.getBinding();
        binding3.g.setImportantForAccessibility(2);
        binding4 = postcardView.getBinding();
        binding4.f.clearFocus();
        postcardView.requestFocus();
    }

    @Override // defpackage.kfe0
    public final void be(Bitmap bitmap, String str) {
        bge0 binding;
        bge0 binding2;
        bge0 binding3;
        PostcardView postcardView = this.b;
        binding = postcardView.getBinding();
        binding.e.setImageBitmap(bitmap);
        binding2 = postcardView.getBinding();
        binding2.c.setBackgroundTintList(gtq0.e(Color.parseColor(str)));
        binding3 = postcardView.getBinding();
        binding3.e.setBackgroundTintList(bitmap == null ? gtq0.e(qje.t(xng0.bgMinor, postcardView.getContext())) : null);
    }

    @Override // defpackage.kfe0
    public final void dismissView() {
        this.b.dismiss();
    }
}
