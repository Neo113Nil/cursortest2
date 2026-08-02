package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.animation.i;
import androidx.compose.animation.k;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.RideCardAdaptiveLinearLayoutManager;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceOptionSelectorView;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceSelectorWithHeaderView;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.component.RequiredAltChoiceComponentView;

/* loaded from: classes13.dex */
public final /* synthetic */ class nqi0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ nqi0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        String c;
        zy11 listDelegate$lambda$0;
        long j;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = null;
        switch (i) {
            case 0:
                return zy11Var;
            case 1:
                T0 = ((oll0) obj).T0("SELECT remotes_phone_id FROM remote_contacts");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(T0.Y1(0));
                    }
                    return arrayList;
                } finally {
                }
            case 2:
                T0 = ((oll0) obj).T0("SELECT * FROM remote_contacts WHERE remotes_deleted != 1 ORDER BY remotes_user_id ASC");
                try {
                    int r = eja1.r(T0, "row_id");
                    int r2 = eja1.r(T0, "remotes_user_id");
                    int r3 = eja1.r(T0, "remotes_phone_id");
                    int r4 = eja1.r(T0, "remotes_deleted");
                    int r5 = eja1.r(T0, "remotes_contact_name");
                    ArrayList arrayList2 = new ArrayList();
                    while (T0.q()) {
                        arrayList2.add(new cvi0(T0.Y1(r2), T0.Y1(r3), T0.isNull(r5) ? null : T0.Y1(r5), ((int) T0.getLong(r4)) != 0, T0.isNull(r) ? null : Long.valueOf(T0.getLong(r))));
                    }
                    return arrayList2;
                } finally {
                }
            case 3:
                oll0 oll0Var = (oll0) obj;
                T0 = oll0Var.T0("DELETE FROM remote_contacts");
                try {
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 4:
                m2j0 m2j0Var = (m2j0) obj;
                StringBuilder sb = new StringBuilder("window.postMessage(");
                if (m2j0Var instanceof l2j0) {
                    c = vuu0.c("\n                    '" + ((l2j0) m2j0Var).b + "'\n                ");
                } else {
                    if (!(m2j0Var instanceof k2j0)) {
                        w511.b();
                        return null;
                    }
                    StringBuilder sb2 = new StringBuilder("\n                    {\n                        format: 'dataUrl', \n                        dataUrl: '");
                    k2j0 k2j0Var = (k2j0) m2j0Var;
                    sb2.append(k2j0Var.b);
                    sb2.append("',\n                        name: '");
                    sb2.append(k2j0Var.c);
                    sb2.append("'\n                    }\n                ");
                    c = vuu0.c(sb2.toString());
                }
                return oyr.t(sb, vuu0.c("\n            {\n                message: 'set-question-value',\n                slug: '" + m2j0Var.a() + "',\n                value: " + c + "\n            }\n        "), ");");
            case 5:
                return oyr.i(((Integer) obj).intValue(), "media_type = ");
            case 6:
                return new nj1((RequiredAltChoiceSelectorWithHeaderView) obj);
            case 7:
                listDelegate$lambda$0 = RequiredAltChoiceOptionSelectorView.listDelegate$lambda$0((RequiredAltChoiceComponentView) obj);
                return listDelegate$lambda$0;
            case 8:
                return ((tdj0) obj).a;
            case 9:
                return new i(k.e(null, 3), k.f(null, 3));
            case 10:
                pex0 pex0Var = (pex0) obj;
                String str = pex0Var.b0;
                return str == null ? pex0Var.b : str;
            case 11:
                oq90 oq90Var = auj0.y;
                return Boolean.valueOf(sms.a(((vc61) obj).a));
            case 12:
                try {
                    ((oll0) obj).T0("DELETE FROM restrictions").q();
                    return zy11Var;
                } finally {
                }
            case 13:
                T0 = ((oll0) obj).T0("SELECT user_id FROM restrictions WHERE blacklisted <> 0");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (T0.q()) {
                        arrayList3.add(T0.Y1(0));
                    }
                    return arrayList3;
                } finally {
                }
            case 14:
                ((m0k0) obj).i1();
                return zy11Var;
            case 15:
                return Boolean.TRUE;
            case 16:
                T0 = ((oll0) obj).T0("SELECT contacts_last_version FROM revisions");
                try {
                    j = T0.q() ? T0.getLong(0) : 0L;
                    T0.close();
                    return Long.valueOf(j);
                } finally {
                }
            case 17:
                T0 = ((oll0) obj).T0("SELECT last_thread_message_timestamp FROM revisions");
                try {
                    j = T0.q() ? T0.getLong(0) : 0L;
                    T0.close();
                    return Long.valueOf(j);
                } finally {
                }
            case 18:
                T0 = ((oll0) obj).T0("SELECT max_role_version FROM revisions");
                try {
                    j = T0.q() ? T0.getLong(0) : 0L;
                    T0.close();
                    return Long.valueOf(j);
                } finally {
                }
            case 19:
                T0 = ((oll0) obj).T0("SELECT cache_owner FROM revisions");
                try {
                    if (T0.q() && !T0.isNull(0)) {
                        obj2 = T0.Y1(0);
                    }
                    return obj2;
                } finally {
                }
            case 20:
                T0 = ((oll0) obj).T0("SELECT workspace_version FROM revisions");
                try {
                    if (T0.q() && !T0.isNull(0)) {
                        obj2 = Integer.valueOf((int) T0.getLong(0));
                    }
                    return obj2;
                } finally {
                }
            case 21:
                T0 = ((oll0) obj).T0("SELECT max_history_version FROM revisions");
                try {
                    j = T0.q() ? T0.getLong(0) : 0L;
                    T0.close();
                    return Long.valueOf(j);
                } finally {
                }
            case 22:
                T0 = ((oll0) obj).T0("SELECT last_message_timestamp FROM revisions");
                try {
                    j = T0.q() ? T0.getLong(0) : 0L;
                    T0.close();
                    return Long.valueOf(j);
                } finally {
                }
            case 23:
                CompositePaymentIconsView compositePaymentIconsView = new CompositePaymentIconsView((Context) obj, null, 0, 6, null);
                compositePaymentIconsView.setTitleVisible(true);
                compositePaymentIconsView.setImportantForAccessibility(2);
                return compositePaymentIconsView;
            case 24:
                ((sy60) obj).a();
                return zy11Var;
            case 25:
                return new LinkedHashSet();
            case 26:
                return new LinkedHashSet();
            case 27:
                return ((TaxiOrder) obj).a;
            case 28:
                ViewGroup viewGroup = (ViewGroup) obj;
                RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
                recyclerView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                recyclerView.setPadding(tje.u(16, recyclerView.getContext()), tje.u(8, recyclerView.getContext()), tje.u(16, recyclerView.getContext()), tje.u(16, recyclerView.getContext()));
                recyclerView.setLayoutManager(new RideCardAdaptiveLinearLayoutManager(viewGroup.getContext()));
                recyclerView.addItemDecoration(new t590(tje.u(4, recyclerView.getContext())));
                recyclerView.setClipChildren(false);
                recyclerView.setClipToPadding(false);
                recyclerView.setItemAnimator(null);
                recyclerView.setNestedScrollingEnabled(false);
                return recyclerView;
            default:
                return yw31.a(((ViewGroup) obj).getContext(), CardDivider.Type.BOTTOM, 0);
        }
    }
}
