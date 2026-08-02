package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.semantics.f;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.GiftProgressView;
import defpackage.v4j0;
import java.util.ArrayList;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.favorites.list.ui.HeaderView;
import ru.yandex.taxi.share_favorites.experiments.d;
import ru.yandex.taxi.surge.dialog.GradientComponentView;

/* loaded from: classes12.dex */
public final /* synthetic */ class iws implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ iws(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 initProperties$lambda$3;
        ull0 T0;
        int i = this.a;
        int i2 = 1;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((hlm) obj).a.R(new fkm(true));
                return zy11Var;
            case 1:
                int i3 = d.h;
                return null;
            case 2:
                ((v4j0.a) obj).a = false;
                return zy11Var;
            case 3:
                ((v4j0.a) obj).a = false;
                return zy11Var;
            case 4:
                ((v4j0.a) obj).a = true;
                return zy11Var;
            case 5:
                initProperties$lambda$3 = GiftProgressView.initProperties$lambda$3(((Integer) obj).intValue());
                return initProperties$lambda$3;
            case 6:
                e5z0 e5z0Var = i5z0.a;
                e5z0Var.m("GoogleSmsRetrieverMethod");
                e5z0Var.a("Success starting sms retriever", new Object[0]);
                return zy11Var;
            case 7:
                GradientComponentView gradientComponentView = new GradientComponentView(((ViewGroup) obj).getContext(), null, 0, 6, null);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                int r = tje.r(tsg0.gradient_component_horizontal_margin, gradientComponentView.getContext());
                marginLayoutParams.setMargins(r, tje.r(tsg0.gradient_component_top_margin, gradientComponentView.getContext()), r, tje.r(tsg0.gradient_component_bottom_margin, gradientComponentView.getContext()));
                gradientComponentView.setLayoutParams(marginLayoutParams);
                return gradientComponentView;
            case 8:
                ((m2k0) obj).j(1);
                return zy11Var;
            case 9:
                return new HeaderView(((ViewGroup) obj).getContext());
            case 10:
                return new x9u((HeaderView) obj);
            case 11:
                ListGroupHeaderComponent listGroupHeaderComponent = new ListGroupHeaderComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listGroupHeaderComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                listGroupHeaderComponent.setImportantForAccessibility(2);
                return listGroupHeaderComponent;
            case 12:
                return new c6r0((ListGroupHeaderComponent) obj, 1);
            case 13:
                jau jauVar = new jau((ListGroupHeaderComponent) obj);
                ((ListGroupHeaderComponent) ((View) jauVar.R)).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return jauVar;
            case 14:
                f.d((mnq0) obj);
                return zy11Var;
            case 15:
                f.d((mnq0) obj);
                return zy11Var;
            case 16:
                f.e((mnq0) obj);
                return zy11Var;
            case 17:
                ((m2k0) obj).j(1);
                return zy11Var;
            case 18:
                f.p((mnq0) obj, 0);
                return zy11Var;
            case 19:
                f.p((mnq0) obj, 0);
                return zy11Var;
            case 20:
                f.d((mnq0) obj);
                return zy11Var;
            case 21:
                return new ky31((ListItemComponent) obj, i2);
            case 22:
                ListGroupHeaderComponent listGroupHeaderComponent2 = new ListGroupHeaderComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listGroupHeaderComponent2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                return listGroupHeaderComponent2;
            case 23:
                return new ca1((ListGroupHeaderComponent) obj, 17);
            case 24:
                ca1 ca1Var = new ca1((ListTitleComponent) obj, 16);
                ((ListTitleComponent) ((View) ca1Var.R)).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return ca1Var;
            case 25:
                T0 = ((oll0) obj).T0("SELECT namespace FROM hidden_namespaces");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(Integer.valueOf((int) T0.getLong(0)));
                    }
                    return arrayList;
                } finally {
                }
            case 26:
                oll0 oll0Var = (oll0) obj;
                T0 = oll0Var.T0("DELETE FROM hidden_namespaces");
                try {
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 27:
                T0 = ((oll0) obj).T0("SELECT user_id, hide_timestamp FROM local_hidden_private_chats_bucket");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (T0.q()) {
                        arrayList2.add(new ygu(T0.Y1(0), T0.getLong(1)));
                    }
                    return arrayList2;
                } finally {
                }
            case 28:
                try {
                    ((oll0) obj).T0("DELETE FROM local_hidden_private_chats_bucket").q();
                    return zy11Var;
                } finally {
                }
            default:
                rw2 rw2Var = (rw2) obj;
                switch (rw2Var.a) {
                    case 0:
                        rw2Var.b.invoke();
                        return zy11Var;
                    default:
                        rw2Var.b.invoke();
                        return zy11Var;
                }
        }
    }
}
