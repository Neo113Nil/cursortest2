package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsTabbarStat$TabbarItemName;
import com.vk.tabbar.core.api.domain.TabbarItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.mk50;
import xsna.tzp0;

/* compiled from: TabbarSettingsFragment.kt */
/* loaded from: classes6.dex */
public final class ovn0 extends tl50<nvn0, nwn0, jun0> implements w8i, m0q0 {
    public static final /* synthetic */ qcy<Object>[] m1;
    public final bpn0 i1;
    public final bpn0 j1;
    public final bpn0 k1;
    public final nf3 l1;

    /* compiled from: TabbarSettingsFragment.kt */
    public static final class a extends kmu0 {
        public final String h;

        public a(Context context, String str) {
            super(context, tzp0.a(null, 1));
            this.h = str;
            c(new a470());
            P0();
            x(0);
            f0(new p6e0(8));
            this.d.C1 = true;
            F0(true);
            l(dhr0.t.c(R.attr.vk_ui_background_content));
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            ovn0 ovn0Var = new ovn0();
            String str = this.h;
            if (str != null) {
                Bundle bundle = new Bundle();
                bundle.putString("action_name", str);
                ovn0Var.setArguments(bundle);
            }
            return ovn0Var;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ovn0.class, "contentView", "getContentView()Lcom/vk/tabbar/settings/impl/compose/TabbarSettingsContentView;", 0);
        fpf0.a.getClass();
        m1 = new qcy[]{mutablePropertyReference1Impl};
    }

    public ovn0() {
        this.x = new tzp0.c.a(this, false);
        this.i1 = new bpn0(new iri0(this, 9));
        this.j1 = new bpn0(new jaa0(this, 19));
        this.k1 = new bpn0(new b990(this, 18));
        this.l1 = new nf3();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        lvn0 lvn0Var = new lvn0(requireContext(), this);
        qcy<Object> qcyVar = m1[0];
        nf3 nf3Var = this.l1;
        nf3Var.c = lvn0Var;
        return new mk50.c(((lvn0) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((lvn0) this.l1.getValue(this, m1[0])).f((nwn0) ao50Var, new bi6(1, this, ovn0.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 11));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((nvn0) vk50Var).n.a(new b3m0(this, 5), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new nvn0(bundle.getString("action_name"), (k820) this.k1.getValue(), (rvn0) this.i1.getValue(), (pvn0) this.j1.getValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r5 != (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        r2 = xsna.v11.b(1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        r0 = (com.vk.stat.scheme.MobileOfficialAppsTabbarStat$TabbarItemName) r3.get(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        r13.a(new com.vk.stat.scheme.MobileOfficialAppsTabbarStat$TypeTabbarItem(null, r3, r0, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        r0 = java.lang.Integer.valueOf(r5);
     */
    @Override // xsna.m0q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(UiTrackingScreen uiTrackingScreen) {
        int i;
        MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("action_name") : null;
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.TABBAR_SETTINGS;
        List<TabbarItem> h = ((rvn0) this.i1.getValue()).h();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = h.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            TabbarItem tabbarItem = (TabbarItem) it.next();
            MobileOfficialAppsTabbarStat$TabbarItemName[] values = MobileOfficialAppsTabbarStat$TabbarItemName.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    mobileOfficialAppsTabbarStat$TabbarItemName = null;
                    break;
                }
                mobileOfficialAppsTabbarStat$TabbarItemName = values[i];
                if (brm0.w(mobileOfficialAppsTabbarStat$TabbarItemName.name(), tabbarItem.d(), true)) {
                    break;
                } else {
                    i++;
                }
            }
            if (mobileOfficialAppsTabbarStat$TabbarItemName != null) {
                arrayList.add(mobileOfficialAppsTabbarStat$TabbarItemName);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            Object next = it2.next();
            if (i < 0) {
                e43.t();
                throw null;
            }
            if (brm0.w(((MobileOfficialAppsTabbarStat$TabbarItemName) next).name(), string, true)) {
                break;
            } else {
                i++;
            }
        }
    }
}
