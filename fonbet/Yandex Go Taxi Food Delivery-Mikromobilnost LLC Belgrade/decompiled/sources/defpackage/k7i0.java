package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.FrameLayout;
import androidx.core.view.b;
import com.yandex.go.navigator.rate_route.RateRouteModalView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.buttons.IconCircleButton;

/* loaded from: classes12.dex */
public final class k7i0 implements m7i0 {
    public final /* synthetic */ RateRouteModalView a;

    public k7i0(RateRouteModalView rateRouteModalView) {
        this.a = rateRouteModalView;
    }

    @Override // defpackage.m7i0
    public final void d(Drawable drawable) {
        r7i0 binding;
        LayerDrawable layerDrawable;
        r7i0 binding2;
        r7i0 binding3;
        RateRouteModalView rateRouteModalView = this.a;
        binding = rateRouteModalView.getBinding();
        ListItemInputComponent listItemInputComponent = binding.f;
        WeakHashMap weakHashMap = b.a;
        n751 a = op31.a(listItemInputComponent);
        if (!(a == null ? false : a.a.q(8))) {
            binding3 = rateRouteModalView.getBinding();
            if (!binding3.q.canScrollVertically(1)) {
                layerDrawable = new LayerDrawable(new Drawable[0]);
                binding2 = rateRouteModalView.getBinding();
                cvw.e0(binding2.c, layerDrawable, null, Integer.valueOf(tje.u(8, rateRouteModalView.getContext())), 10);
            }
        }
        layerDrawable = new LayerDrawable(new Drawable[]{drawable, vng.t(f1h0.footer_bg, rateRouteModalView.getContext())});
        binding2 = rateRouteModalView.getBinding();
        cvw.e0(binding2.c, layerDrawable, null, Integer.valueOf(tje.u(8, rateRouteModalView.getContext())), 10);
    }

    public final void h(boolean z) {
        r7i0 binding;
        r7i0 binding2;
        r7i0 binding3;
        RateRouteModalView rateRouteModalView = this.a;
        binding = rateRouteModalView.getBinding();
        ButtonComponent buttonComponent = binding.h;
        buttonComponent.setEnabled(!z);
        buttonComponent.setProgressing(z);
        binding2 = rateRouteModalView.getBinding();
        binding2.r.setVisibility(z ? 0 : 8);
        binding3 = rateRouteModalView.getBinding();
        binding3.g.setVisibility(z ? 8 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.yandex.go.navigator.rate_route.RatingReasonsView, com.yandex.go.navigator.ui.BubbleGridView] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    @Override // defpackage.eyi0
    public final void render(Object obj) {
        r7i0 binding;
        r7i0 binding2;
        r7i0 binding3;
        r7i0 binding4;
        r7i0 binding5;
        r7i0 binding6;
        ?? r3;
        r7i0 binding7;
        r7i0 binding8;
        IconCircleButton iconCircleButton;
        r7i0 binding9;
        r8l0 r8l0Var = (r8l0) obj;
        if (jl40.l(r8l0Var, q8l0.a)) {
            h(true);
            return;
        }
        if (!(r8l0Var instanceof p8l0)) {
            w511.b();
            return;
        }
        p8l0 p8l0Var = (p8l0) r8l0Var;
        h(false);
        as00 as00Var = p8l0Var.h;
        RateRouteModalView rateRouteModalView = this.a;
        rateRouteModalView.renderMapView(as00Var);
        binding = rateRouteModalView.getBinding();
        binding.h.setText(p8l0Var.g);
        binding2 = rateRouteModalView.getBinding();
        binding2.l.setText(p8l0Var.a);
        binding3 = rateRouteModalView.getBinding();
        binding3.n.setText(p8l0Var.b);
        binding4 = rateRouteModalView.getBinding();
        binding4.e.setText(p8l0Var.c);
        binding5 = rateRouteModalView.getBinding();
        binding5.d.setText(p8l0Var.d);
        List list = p8l0Var.e;
        cm21 cm21Var = p8l0Var.f;
        String str = cm21Var.a;
        List list2 = list;
        Iterator it = list2.iterator();
        int i = 0;
        while (true) {
            cvq cvqVar = null;
            if (!it.hasNext()) {
                String str2 = cm21Var.a;
                ?? r4 = cm21Var.b;
                ThemeType themeType = p8l0Var.i;
                binding6 = rateRouteModalView.getBinding();
                ?? r5 = binding6.m;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ?? next = it2.next();
                    if (jl40.l(((cvq) next).a, str2)) {
                        cvqVar = next;
                        break;
                    }
                }
                cvq cvqVar2 = cvqVar;
                if (cvqVar2 != null) {
                    ArrayList<ae70> arrayList = cvqVar2.c;
                    r3 = new ArrayList(tcc.n(arrayList, 10));
                    for (ae70 ae70Var : arrayList) {
                        String j = b64.j(ae70Var.a, themeType.name());
                        String str3 = ae70Var.a;
                        r3.add(new um6(j, 48, str3, ae70Var.b, r4.contains(str3)));
                    }
                } else {
                    r3 = EmptyList.a;
                }
                r5.setData(r3);
                rateRouteModalView.scrollDown();
                return;
            }
            Object next2 = it.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            cvq cvqVar3 = (cvq) next2;
            binding7 = rateRouteModalView.getBinding();
            if (binding7.i.getChildCount() > i) {
                binding9 = rateRouteModalView.getBinding();
                iconCircleButton = (IconCircleButton) binding9.i.getChildAt(i);
            } else {
                IconCircleButton iconCircleButton2 = new IconCircleButton(rateRouteModalView.getContext(), null, 0, 0, 14, null);
                iconCircleButton2.setLayoutParams(new FrameLayout.LayoutParams(tje.u(72, rateRouteModalView.getContext()), tje.u(72, rateRouteModalView.getContext())));
                binding8 = rateRouteModalView.getBinding();
                binding8.i.addView(iconCircleButton2);
                iconCircleButton = iconCircleButton2;
            }
            Bitmap bitmap = cvqVar3.b;
            iconCircleButton.setIcon(bitmap != null ? new BitmapDrawable(rateRouteModalView.getResources(), bitmap) : null);
            iconCircleButton.setIconTintEnable(false);
            iconCircleButton.setBackgroundColor(new bdc(jl40.l(str, cvqVar3.a) ? xng0.bgInvert : xng0.controlMinor));
            iconCircleButton.setDebounceClickListener(new xmf0(4, rateRouteModalView, cvqVar3));
            i = i2;
        }
    }
}
