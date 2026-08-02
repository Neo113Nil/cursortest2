package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.favorites.housemissing.HouseMissingModalView;

/* loaded from: classes5.dex */
public final class ctu implements ftu {
    public final /* synthetic */ HouseMissingModalView a;

    public ctu(HouseMissingModalView houseMissingModalView) {
        this.a = houseMissingModalView;
    }

    @Override // defpackage.ftu
    public final void uf(ktu ktuVar) {
        dtu binding;
        dtu binding2;
        dtu binding3;
        Drawable fallbackImage;
        dtu binding4;
        Drawable fallbackBackground;
        c57 c57Var;
        dtu binding5;
        dtu binding6;
        HouseMissingModalView houseMissingModalView = this.a;
        binding = houseMissingModalView.getBinding();
        binding.d.setText(ktuVar.a);
        binding2 = houseMissingModalView.getBinding();
        binding2.c.setText(ktuVar.b);
        Drawable drawable = ktuVar.c;
        if (drawable != null) {
            binding5 = houseMissingModalView.getBinding();
            binding5.e.setImageDrawable(drawable);
            binding6 = houseMissingModalView.getBinding();
            binding6.e.setBackgroundDrawable(null);
        } else {
            binding3 = houseMissingModalView.getBinding();
            GoImageView goImageView = binding3.e;
            fallbackImage = houseMissingModalView.fallbackImage();
            goImageView.setImageDrawable(fallbackImage);
            binding4 = houseMissingModalView.getBinding();
            GoImageView goImageView2 = binding4.e;
            fallbackBackground = houseMissingModalView.fallbackBackground();
            goImageView2.setBackgroundDrawable(fallbackBackground);
        }
        c57Var = houseMissingModalView.buttons;
        ((pm5) c57Var).d(ktuVar.d);
    }
}
