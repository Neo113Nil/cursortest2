package defpackage;

import android.content.res.ColorStateList;
import com.yandex.go.chargers.multiorder.ui.ChargersMultiOrderModalView;
import com.yandex.go.chargers.multiorder.ui.components.ChargersMultiOrderTakeMoreButton;
import java.util.List;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class m4a implements o4a {
    public final /* synthetic */ ChargersMultiOrderModalView a;

    public m4a(ChargersMultiOrderModalView chargersMultiOrderModalView) {
        this.a = chargersMultiOrderModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        s3a s3aVar;
        w5a binding;
        w5a binding2;
        w5a binding3;
        w5a binding4;
        w5a binding5;
        pav pavVar;
        w5a binding6;
        w5a binding7;
        v5a v5aVar = (v5a) obj;
        ChargersMultiOrderModalView chargersMultiOrderModalView = this.a;
        s3aVar = chargersMultiOrderModalView.adapter;
        List list = v5aVar.c;
        n5a n5aVar = v5aVar.b;
        s3aVar.submitList(list, null);
        binding = chargersMultiOrderModalView.getBinding();
        RobotoTextView robotoTextView = binding.e;
        CharSequence charSequence = v5aVar.a;
        robotoTextView.setVisibility(charSequence != null ? 0 : 8);
        if (charSequence != null) {
            robotoTextView.setText(charSequence);
        }
        chargersMultiOrderModalView.setupTabs(v5aVar.d);
        if (n5aVar == null) {
            binding6 = chargersMultiOrderModalView.getBinding();
            binding6.b.setVisibility(8);
            binding7 = chargersMultiOrderModalView.getBinding();
            binding7.c.setVisibility(8);
            return;
        }
        if (!(n5aVar instanceof m5a)) {
            if (!(n5aVar instanceof o5a)) {
                w511.b();
                return;
            }
            binding2 = chargersMultiOrderModalView.getBinding();
            binding2.b.setVisibility(8);
            binding3 = chargersMultiOrderModalView.getBinding();
            RobotoTextView robotoTextView2 = binding3.c;
            robotoTextView2.setVisibility(0);
            o5a o5aVar = (o5a) n5aVar;
            robotoTextView2.setText(o5aVar.a);
            robotoTextView2.setBackgroundTintList(ColorStateList.valueOf(s8o.m(o5aVar.b, robotoTextView2.getContext())));
            return;
        }
        binding4 = chargersMultiOrderModalView.getBinding();
        binding4.c.setVisibility(8);
        binding5 = chargersMultiOrderModalView.getBinding();
        ChargersMultiOrderTakeMoreButton chargersMultiOrderTakeMoreButton = binding5.b;
        chargersMultiOrderTakeMoreButton.setVisibility(0);
        m5a m5aVar = (m5a) n5aVar;
        String str = m5aVar.c;
        pavVar = chargersMultiOrderModalView.imageLoader;
        chargersMultiOrderTakeMoreButton.loadIcon(str, pavVar);
        chargersMultiOrderTakeMoreButton.setText(m5aVar.a);
        chargersMultiOrderTakeMoreButton.setEnabled(m5aVar.b);
        chargersMultiOrderTakeMoreButton.setDebounceClickListener(new nm7(29, chargersMultiOrderModalView, v5aVar));
    }
}
