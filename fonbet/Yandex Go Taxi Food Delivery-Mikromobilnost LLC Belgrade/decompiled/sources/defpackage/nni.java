package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.ui.semantics.f;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.rida.bids.router.c;
import java.util.Objects;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final /* synthetic */ class nni implements tls {
    public final /* synthetic */ int a;

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 8;
        switch (i) {
            case 0:
                return ((mi31) obj).b;
            case 1:
                return "slot";
            case 2:
                return ((mrd) obj).a;
            case 3:
                GoLinearLayout goLinearLayout = new GoLinearLayout(((ViewGroup) obj).getContext(), null, 0, 0, 14, null);
                goLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                goLinearLayout.setOrientation(0);
                return goLinearLayout;
            case 4:
                ((rvi) obj).D();
                return zy11Var;
            case 5:
                ca1 ca1Var = new ca1((RobotoTextView) obj, 11);
                View view = (View) ca1Var.R;
                ((RobotoTextView) view).setTextSize(tje.s(mrg0.component_text_size_body, view.getContext()));
                int r = tje.r(mrg0.go_design_m_space, view.getContext());
                ((RobotoTextView) view).setPadding(r, 0, r, r);
                return ca1Var;
            case 6:
                ((ozi) obj).X();
                return zy11Var;
            case 7:
                ImageView imageView = new ImageView(((ViewGroup) obj).getContext());
                imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                sb2.L(imageView, tje.r(mrg0.go_design_m_space, imageView.getContext()), 0, tje.r(mrg0.go_design_m_space, imageView.getContext()), 0, 10);
                return imageView;
            case 8:
                return new uj70((ImageView) obj, 2);
            case 9:
                GoView goView = new GoView(((ViewGroup) obj).getContext(), null, 0, 0, 14, null);
                goView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                goView.setBackgroundColor(goView.getContext().getColor(mqg0.transparent));
                goView.setFocusable(false);
                goView.setImportantForAccessibility(4);
                return goView;
            case 10:
                return new sc6((GoView) obj, 1);
            case 11:
                RobotoTextView robotoTextView = new RobotoTextView(((ViewGroup) obj).getContext(), null, 0, 6, null);
                robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                robotoTextView.setPadding(tje.r(mrg0.go_design_m_space, robotoTextView.getContext()), robotoTextView.getPaddingTop(), tje.r(mrg0.go_design_m_space, robotoTextView.getContext()), robotoTextView.getPaddingBottom());
                return robotoTextView;
            case 12:
                return new k5r0((RobotoTextView) obj, 1);
            case 13:
                GoFrameLayout goFrameLayout = new GoFrameLayout(((ViewGroup) obj).getContext(), null, 0, 0, 14, null);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.setMargins(tje.r(mrg0.go_design_m_space, goFrameLayout.getContext()), 0, tje.r(mrg0.go_design_m_space, goFrameLayout.getContext()), tje.r(mrg0.go_design_m_space, goFrameLayout.getContext()));
                goFrameLayout.setLayoutParams(marginLayoutParams);
                return goFrameLayout;
            case 14:
                GoFrameLayout goFrameLayout2 = new GoFrameLayout(((ViewGroup) obj).getContext(), null, 0, 0, 14, null);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams2.setMargins(tje.r(mrg0.go_design_m_space, goFrameLayout2.getContext()), 0, tje.r(mrg0.go_design_m_space, goFrameLayout2.getContext()), 0);
                goFrameLayout2.setLayoutParams(marginLayoutParams2);
                return goFrameLayout2;
            case 15:
                f.d((mnq0) obj);
                return zy11Var;
            case 16:
                wj00 b = ((y3x) obj).b();
                return new daj(b.p("method"), b.p("payment_method_id"));
            case 17:
                czj0 czj0Var = (czj0) obj;
                if (!czj0Var.d) {
                    return null;
                }
                Throwable th = czj0Var.c;
                Objects.requireNonNull(th);
                qwf0.a("DeviceOrientationManager.onDeviceOrientationChanged", th);
                return null;
            case 18:
                ((c) obj).n1();
                return zy11Var;
            case 19:
                ((c) obj).onCancel();
                return zy11Var;
            case 20:
                return mbb1.d((y3x) obj, new teb(10));
            case 21:
                return mbb1.d((y3x) obj, new teb(7));
            case 22:
                return mbb1.d((y3x) obj, new oxv0(i2));
            case 23:
                return mbb1.d((y3x) obj, new oxv0(i2));
            case 24:
                return mbb1.d((y3x) obj, new ar5(3));
            case 25:
                return mbb1.d((y3x) obj, new oxv0(i2));
            case 26:
                return mbb1.d((y3x) obj, new oxv0(i2));
            case 27:
                return mbb1.d((y3x) obj, new oxv0(i2));
            case 28:
                return mbb1.d((y3x) obj, new f0z0(17));
            default:
                return mbb1.d((y3x) obj, new of11(12));
        }
    }

    public /* synthetic */ nni(int i) {
        this.a = i;
    }
}
