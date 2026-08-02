package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.a;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.b;
import com.yandex.go.taxi.order.util.accordion.AccordionComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

/* loaded from: classes14.dex */
public final /* synthetic */ class ifj0 implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ ifj0(int i) {
        this.a = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        View O;
        View O2;
        View O3;
        View O4;
        boolean l;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                View inflate = ((LayoutInflater) obj).inflate(krh0.item_detail, (ViewGroup) obj2, false);
                int i2 = kfh0.condition_name;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
                if (robotoTextView != null) {
                    i2 = kfh0.condition_value;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, inflate);
                    if (robotoTextView2 != null) {
                        return new b0b(new h1x((LinearLayout) inflate, robotoTextView, robotoTextView2), 11);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            case 1:
                View inflate2 = ((LayoutInflater) obj).inflate(krh0.item_detail_placeholder, (ViewGroup) obj2, false);
                int i3 = kfh0.condition_block_placeholder;
                View O5 = cma1.O(i3, inflate2);
                if (O5 != null && (O = cma1.O((i3 = kfh0.condition_name_placeholder), inflate2)) != null) {
                    i3 = kfh0.condition_placeholders_container;
                    LinearLayout linearLayout = (LinearLayout) cma1.O(i3, inflate2);
                    if (linearLayout != null && (O2 = cma1.O((i3 = kfh0.condition_subtitle_placeholder), inflate2)) != null && (O3 = cma1.O((i3 = kfh0.condition_title_placeholder), inflate2)) != null && (O4 = cma1.O((i3 = kfh0.condition_value_placeholder), inflate2)) != null) {
                        return new b0b(new j1x((ShimmeringFrameLayout) inflate2, O5, O, linearLayout, O2, O3, O4), 12);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
                return null;
            case 2:
                View inflate3 = ((LayoutInflater) obj).inflate(krh0.item_detail_subtitle, (ViewGroup) obj2, false);
                if (inflate3 != null) {
                    return new b0b(new k1x((RobotoTextView) inflate3), 13);
                }
                ny61.t("rootView");
                return null;
            case 3:
                View inflate4 = ((LayoutInflater) obj).inflate(krh0.item_detail_title, (ViewGroup) obj2, false);
                if (inflate4 != null) {
                    return new b0b(new l1x((RobotoTextView) inflate4), 14);
                }
                ny61.t("rootView");
                return null;
            case 4:
                l = jl40.l(((u8k0) obj).c, ((u8k0) obj2).c);
                break;
            case 5:
                ((b) obj).R.renderHeader(((u8k0) obj2).c);
                return zy11Var;
            case 6:
                l = jl40.l(((u8k0) obj).d, ((u8k0) obj2).d);
                break;
            case 7:
                b bVar = (b) obj;
                AccordionComponent accordionComponent = bVar.R;
                int i4 = b.V;
                accordionComponent.setContainerContent(jpa1.e(accordionComponent.getContext(), bVar.T, ((u8k0) obj2).d));
                return zy11Var;
            case 8:
                ((a) obj).c0(((yck0) obj2).i);
                return zy11Var;
            case 9:
                return Boolean.valueOf(((yck0) obj).g != ((yck0) obj2).g);
            case 10:
                a aVar = (a) obj;
                boolean z = ((yck0) obj2).g;
                jqs0 jqs0Var = aVar.T;
                if (jqs0Var != null) {
                    jqs0Var.a = z;
                }
                if (z) {
                    aVar.R.asView().sendAccessibilityEvent(1);
                }
                return zy11Var;
            case 11:
                l = jl40.l(((yck0) obj).h, ((yck0) obj2).h);
                break;
            case 12:
                qk4 qk4Var = ((yck0) obj2).h;
                ((a) obj).R.renderBadge(qk4Var != null ? qk4Var.a : null, qk4Var != null ? qk4Var.b : null, qk4Var != null ? qk4Var.c : null, qk4Var != null ? qk4Var.d : null);
                return zy11Var;
            case 13:
                l = jl40.l(((yck0) obj).c.b, ((yck0) obj2).c.b);
                break;
            case 14:
                ((a) obj).R.setProperties(((yck0) obj2).c.b);
                return zy11Var;
            case 15:
                l = jl40.l(((yck0) obj).c.a.a, ((yck0) obj2).c.a.a);
                break;
            case 16:
                ((a) obj).R.renderLead(((yck0) obj2).c.a.a);
                return zy11Var;
            case 17:
                l = jl40.l(((yck0) obj).c.a.d, ((yck0) obj2).c.a.d);
                break;
            case 18:
                l = jl40.l(((yck0) obj).c.a.b, ((yck0) obj2).c.a.b);
                break;
            case 19:
                ((a) obj).R.renderBody(((yck0) obj2).c.a.b);
                return zy11Var;
            case 20:
                l = jl40.l(((yck0) obj).c.a.c, ((yck0) obj2).c.a.c);
                break;
            case 21:
                ((a) obj).R.renderTrail(((yck0) obj2).c.a.c);
                return zy11Var;
            case 22:
                yck0 yck0Var = (yck0) obj2;
                ((a) obj).R.setAction(yck0Var.c.a.d, yck0Var.j);
                return zy11Var;
            case 23:
                l = jl40.l(((yck0) obj).d, ((yck0) obj2).d);
                break;
            case 24:
                ((a) obj).R.renderBackground(((yck0) obj2).d);
                return zy11Var;
            case 25:
                return Boolean.valueOf(((yck0) obj).e != ((yck0) obj2).e);
            case 26:
                ((a) obj).R.renderLoading(((yck0) obj2).e);
                return zy11Var;
            case 27:
                return Boolean.valueOf(((yck0) obj).f != ((yck0) obj2).f);
            case 28:
                ((a) obj).R.renderEnabled(((yck0) obj2).f);
                return zy11Var;
            default:
                return Boolean.valueOf(((yck0) obj).i != ((yck0) obj2).i);
        }
        return Boolean.valueOf(!l);
    }
}
