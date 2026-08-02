package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.safety.center.lost_item.modal.ui.LostItemModalView;
import java.util.Iterator;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final class brz implements xqz {
    public final /* synthetic */ LostItemModalView a;

    public brz(LostItemModalView lostItemModalView) {
        this.a = lostItemModalView;
    }

    @Override // defpackage.xqz
    public final void eb(jrz jrzVar) {
        crz binding;
        crz binding2;
        crz binding3;
        crz binding4;
        crz binding5;
        ListItemComponent createBullet;
        crz binding6;
        crz binding7;
        if (jrzVar instanceof irz) {
            h(true);
            return;
        }
        if (!(jrzVar instanceof hrz)) {
            w511.b();
            return;
        }
        hrz hrzVar = (hrz) jrzVar;
        h(false);
        grz grzVar = hrzVar.a;
        CharSequence charSequence = hrzVar.c;
        frz frzVar = hrzVar.e;
        LostItemModalView lostItemModalView = this.a;
        if (grzVar != null) {
            Drawable drawable = grzVar.a;
            int i = arz.a[grzVar.b.ordinal()];
            if (i == 1) {
                binding6 = lostItemModalView.getBinding();
                GoImageView goImageView = binding6.f;
                goImageView.setImageDrawable(drawable);
                goImageView.setVisibility(0);
            } else if (i == 2) {
                binding7 = lostItemModalView.getBinding();
                GoImageView goImageView2 = binding7.g;
                goImageView2.setImageDrawable(drawable);
                goImageView2.setVisibility(0);
            } else if (i != 3) {
                w511.b();
                return;
            }
        }
        binding = lostItemModalView.getBinding();
        binding.e.setTitle(hrzVar.b);
        binding2 = lostItemModalView.getBinding();
        binding2.d.setVisibility((charSequence == null || evu0.J(charSequence)) ? 8 : 0);
        binding3 = lostItemModalView.getBinding();
        binding3.d.setTitle(charSequence);
        binding4 = lostItemModalView.getBinding();
        GoLinearLayout goLinearLayout = binding4.c;
        goLinearLayout.removeAllViews();
        Iterator it = hrzVar.d.iterator();
        while (it.hasNext()) {
            createBullet = lostItemModalView.createBullet(goLinearLayout.getContext(), (erz) it.next());
            goLinearLayout.addView(createBullet);
        }
        if (frzVar != null) {
            binding5 = lostItemModalView.getBinding();
            ButtonComponent buttonComponent = binding5.b;
            buttonComponent.setText(frzVar.b);
            buttonComponent.setTextIcon(frzVar.a);
            buttonComponent.setDebounceClickListener(new r7v(28, lostItemModalView, hrzVar));
        }
    }

    public final void h(boolean z) {
        crz binding;
        crz binding2;
        crz binding3;
        crz binding4;
        crz binding5;
        crz binding6;
        crz binding7;
        crz binding8;
        LostItemModalView lostItemModalView = this.a;
        binding = lostItemModalView.getBinding();
        binding.e.setVisibility(!z ? 0 : 8);
        binding2 = lostItemModalView.getBinding();
        binding2.d.setVisibility(!z ? 0 : 8);
        binding3 = lostItemModalView.getBinding();
        binding3.g.setVisibility(8);
        binding4 = lostItemModalView.getBinding();
        binding4.f.setVisibility(8);
        binding5 = lostItemModalView.getBinding();
        binding5.c.setVisibility(!z ? 0 : 8);
        binding6 = lostItemModalView.getBinding();
        binding6.h.setVisibility(z ? 0 : 8);
        if (z) {
            binding8 = lostItemModalView.getBinding();
            binding8.b.setText(kyh0.common_loading);
        }
        binding7 = lostItemModalView.getBinding();
        binding7.b.setEnabled(!z);
    }
}
