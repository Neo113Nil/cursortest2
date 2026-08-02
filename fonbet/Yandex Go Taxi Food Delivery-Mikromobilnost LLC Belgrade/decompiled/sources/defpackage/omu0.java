package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.b;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.lang.ref.WeakReference;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.stories.presentation.story.StoryModalView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final /* synthetic */ class omu0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ omu0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 cancelImageLoadingRequest$lambda$0$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 1:
                cancelImageLoadingRequest$lambda$0$0 = StoryModalView.cancelImageLoadingRequest$lambda$0$0((Drawable) obj);
                return cancelImageLoadingRequest$lambda$0$0;
            case 2:
                return ((CharSequence) obj).toString();
            case 3:
                return zy11Var;
            case 4:
                View view = new View(((ViewGroup) obj).getContext());
                x4e.y(-1, -1, view);
                return view;
            case 5:
                View view2 = new View(((ViewGroup) obj).getContext());
                x4e.y(-1, -1, view2);
                return view2;
            case 6:
                return new ca1((View) obj, 23);
            case 7:
                return new ca1((View) obj, 24);
            case 8:
                n70 n70Var = (n70) obj;
                n70Var.W(new ns3(n70Var, 18));
                return zy11Var;
            case 9:
                RobotoTextView robotoTextView = (RobotoTextView) obj;
                a3v0 a3v0Var = new a3v0(robotoTextView);
                View view3 = (View) a3v0Var.R;
                view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), c.d(mrg0.go_design_s_space, robotoTextView));
                return a3v0Var;
            case 10:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                nzs.s(listItemComponent, -1, -2);
                return listItemComponent;
            case 11:
                TaxiOrder taxiOrder = (TaxiOrder) obj;
                if (taxiOrder != null) {
                    return taxiOrder.V();
                }
                return null;
            case 12:
                n70 n70Var2 = (n70) obj;
                n70Var2.W(new ns3(n70Var2, 19));
                return zy11Var;
            case 13:
                ListItemComponent listItemComponent2 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemComponent2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                listItemComponent2.setMinimumHeight(tje.u(56, listItemComponent2.getContext()));
                listItemComponent2.setLeadTint(qje.t(xng0.line, listItemComponent2.getContext()));
                listItemComponent2.setTrailTint(qje.t(xng0.line, listItemComponent2.getContext()));
                listItemComponent2.setSubTitleEllipsizeMode(1);
                listItemComponent2.setSubtitleMaxLines(2);
                listItemComponent2.setSubtitleTextSizePx((int) tje.b0(listItemComponent2.getContext(), 13.0f));
                listItemComponent2.setSubtitleTypeface(0);
                listItemComponent2.setTitleEllipsizeMode(1);
                listItemComponent2.setTitleMaxLines(1);
                listItemComponent2.setTitleTextSizePx((int) tje.b0(listItemComponent2.getContext(), 16.0f));
                listItemComponent2.setTitleTypeface(0);
                listItemComponent2.setTrailMode(2);
                return listItemComponent2;
            case 14:
                RobotoTextView robotoTextView2 = new RobotoTextView((Context) obj, null, 0, 6, null);
                robotoTextView2.setImportantForAccessibility(2);
                b.p(robotoTextView2, null);
                robotoTextView2.setIncludeFontPadding(false);
                return robotoTextView2;
            case 15:
                return ((fnx0) obj).c.l;
            case 16:
                return ((fnx0) obj).e.d;
            case 17:
                return new eqv0((epo) obj);
            case 18:
                return new fqv0((u0s) obj);
            case 19:
                return new hqv0((udv0) obj);
            case 20:
                return new x62((etz0) obj);
            case 21:
                return new dqv0((y62) obj);
            case 22:
                return new gqv0((tg00) obj);
            case 23:
                return ((mi31) obj).a.b;
            case 24:
                t0e c = ((zkv0) obj).c();
                j0e j0eVar = c instanceof j0e ? (j0e) c : null;
                return Boolean.valueOf(j0eVar != null ? jl40.l(j0eVar.getC(), Boolean.TRUE) : false);
            case 25:
                zkv0 zkv0Var = (zkv0) obj;
                t0e c2 = zkv0Var.c();
                if ((c2 instanceof j0e ? (j0e) c2 : null) != null && !jl40.l(((j0e) zkv0Var.c()).getC(), Boolean.FALSE)) {
                    r3 = false;
                }
                return Boolean.valueOf(r3);
            case 26:
                return new ca1((FrameLayout) obj, 25);
            case 27:
                return Boolean.valueOf(((WeakReference) obj).get() == null);
            case 28:
                return Long.valueOf(((ywv0) obj) instanceof wwv0 ? 0L : 600L);
            default:
                return ((mjy) obj).a;
        }
    }
}
