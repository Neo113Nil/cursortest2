package xsna;

import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.CircularProgressView;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import xsna.gko;
import xsna.kcb;
import xsna.tlo0;
import xsna.vwb;
import xsna.xpb;

/* compiled from: ChatProfileChatSettingsVc.kt */
/* loaded from: classes2.dex */
public class xwb implements vpb, hzb, kcb.a.InterfaceC3174a, xpb.a.InterfaceC4032a {
    public final j8i b;
    public final kkm c;
    public final int d;
    public qwb e;
    public bzb0 f;
    public Toolbar g;
    public VkTopBar h;
    public View i;
    public AppBarShadowView j;
    public RecyclerView k;
    public CircularProgressView l;
    public final b m;
    public final boolean n;

    /* compiled from: ChatProfileChatSettingsVc.kt */
    public interface a extends hzb {
        void J(ph90 ph90Var, int i);

        void O(AvatarAction avatarAction);

        void Z(ph90 ph90Var);

        void b(vwb.c cVar);

        void b0();

        void h(vwb.b bVar);

        void n();

        void o();

        void p(AvatarAction avatarAction);

        void y();
    }

    /* compiled from: ChatProfileChatSettingsVc.kt */
    public static final class b extends RecyclerView.y {
        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
            return true;
        }
    }

    /* compiled from: ChatProfileChatSettingsVc.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarAction.values().length];
            try {
                iArr[AvatarAction.REMOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xwb(a aVar, kkm kkmVar, int i) {
        ucp ucpVar = ucp.a;
        this.b = (j8i) aVar;
        this.c = kkmVar;
        this.d = i;
        this.m = new b();
        ImFeatures imFeatures = ImFeatures.IM_CHAT_SETTINGS_REDESIGN;
        imFeatures.getClass();
        this.n = com.vk.toggle.b.A.a(imFeatures);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.vkim_chat_profile_chat_settings, viewGroup, false);
        this.i = inflate;
        this.h = (VkTopBar) inflate.findViewById(R.id.vkim_chat_profile_chat_settings_topbar);
        View view = this.i;
        if (view == null) {
            view = null;
        }
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.vkim_chat_profile_chat_settings__toolbar);
        this.g = toolbar;
        boolean z = this.n;
        int i = 4;
        int i2 = 3;
        int i3 = 7;
        int i4 = this.d;
        if (z) {
            f4m.j(toolbar);
            VkTopBar vkTopBar = this.h;
            if (vkTopBar == null) {
                vkTopBar = null;
            }
            vkTopBar.setVisibility(0);
            VkTopBar vkTopBar2 = this.h;
            if (vkTopBar2 == null) {
                vkTopBar2 = null;
            }
            vkTopBar2.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, i4), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new qm(i3), 3), 14), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
            VkTopBar vkTopBar3 = this.h;
            if (vkTopBar3 == null) {
                vkTopBar3 = null;
            }
            vkTopBar3.setBack(new VkTopBar.b(new i70(this, 15), new tlo0.f(R.string.accessibility_toolbar_back), null, null, com.vk.core.compose.component.semantics.b.a(null, new sm(i3), 3), 12));
        } else {
            VkTopBar vkTopBar4 = this.h;
            if (vkTopBar4 == null) {
                vkTopBar4 = null;
            }
            f4m.j(vkTopBar4);
            Toolbar toolbar2 = this.g;
            if (toolbar2 == null) {
                toolbar2 = null;
            }
            toolbar2.setVisibility(0);
            Toolbar toolbar3 = this.g;
            Toolbar toolbar4 = toolbar3 == null ? null : toolbar3;
            if (toolbar3 == null) {
                toolbar3 = null;
            }
            toolbar4.setTitle(toolbar3.getContext().getString(i4));
            Toolbar toolbar5 = this.g;
            if (toolbar5 == null) {
                toolbar5 = null;
            }
            toolbar5.l(R.menu.vkim_menu_done_28);
            Toolbar toolbar6 = this.g;
            if (toolbar6 == null) {
                toolbar6 = null;
            }
            Menu menu = toolbar6.getMenu();
            int size = menu.size();
            for (int i5 = 0; i5 < size; i5++) {
                menu.getItem(i5).setVisible(false);
            }
            Toolbar toolbar7 = this.g;
            if (toolbar7 == null) {
                toolbar7 = null;
            }
            toolbar7.setOnMenuItemClickListener(new d9(this, 7));
            Toolbar toolbar8 = this.g;
            if (toolbar8 == null) {
                toolbar8 = null;
            }
            toolbar8.setNavigationOnClickListener(new f9(this, i));
        }
        View view2 = this.i;
        if (view2 == null) {
            view2 = null;
        }
        this.j = (AppBarShadowView) view2.findViewById(R.id.vkim_chat_profile_chat_settings__shadow);
        View view3 = this.i;
        if (view3 == null) {
            view3 = null;
        }
        RecyclerView recyclerView = (RecyclerView) view3.findViewById(R.id.vkim_chat_profile_chat_settings__rv_content);
        ucp ucpVar = ucp.a;
        qwb qwbVar = new qwb();
        ImFeatures imFeatures = ImFeatures.IM_CHAT_SETTINGS_REDESIGN;
        imFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(imFeatures);
        qwbVar.setHasStableIds(true);
        qwbVar.y0(a2 ? new tpb(this) : new upb(this));
        qwbVar.y0(a2 ? new dzb(this) : new gzb(this));
        qwbVar.y0(new kcb(this));
        qwbVar.y0(new xpb(this));
        this.e = qwbVar;
        recyclerView.setAdapter(qwbVar);
        recyclerView.setItemAnimator(null);
        qwb qwbVar2 = this.e;
        recyclerView.addItemDecoration(new wwb(qwbVar2 == null ? null : qwbVar2, cn70.b(16), cn70.b(12), cn70.b(16), cn70.b(12), cn70.b(50)));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        AppBarShadowView appBarShadowView = this.j;
        if (appBarShadowView == null) {
            appBarShadowView = null;
        }
        fkf0 fkf0Var = new fkf0(recyclerView, appBarShadowView, null, cn70.b(4));
        RecyclerView recyclerView2 = fkf0Var.b;
        recyclerView2.removeOnScrollListener(fkf0Var);
        recyclerView2.addOnScrollListener(fkf0Var);
        this.k = recyclerView;
        View view4 = this.i;
        if (view4 == null) {
            view4 = null;
        }
        this.l = (CircularProgressView) view4.findViewById(R.id.vkim_chat_profile_chat_settings__progress);
        View view5 = this.i;
        if (view5 == null) {
            view5 = null;
        }
        this.f = new bzb0(view5.getContext());
        Toolbar toolbar9 = this.g;
        if (toolbar9 == null) {
            toolbar9 = null;
        }
        kkm kkmVar = this.c;
        kkmVar.b(toolbar9, R.attr.vk_ui_text_accent_themed);
        CircularProgressView circularProgressView = this.l;
        if (circularProgressView == null) {
            circularProgressView = null;
        }
        kkmVar.a(circularProgressView, "progressTint", new d9j(kkmVar, i2));
        View view6 = this.i;
        if (view6 == null) {
            return null;
        }
        return view6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.j8i, xsna.xwb$a] */
    @Override // xsna.xpb.a.InterfaceC4032a
    public final void b(vwb.c cVar) {
        this.b.b(cVar);
    }

    public final MenuItem c() {
        Toolbar toolbar = this.g;
        if (toolbar == null) {
            toolbar = null;
        }
        return toolbar.getMenu().findItem(R.id.vkim_progress);
    }

    public final void d() {
        View view = this.i;
        if (view == null) {
            view = null;
        }
        IBinder windowToken = view.getWindowToken();
        View view2 = this.i;
        if (view2 == null) {
            view2 = null;
        }
        mhy.c(windowToken, view2.getContext());
        View view3 = this.i;
        (view3 != null ? view3 : null).clearFocus();
    }

    public final void e() {
        if (this.n) {
            VkTopBar vkTopBar = this.h;
            if (vkTopBar == null) {
                vkTopBar = null;
            }
            vkTopBar.setAfter(null);
            return;
        }
        Toolbar toolbar = this.g;
        MenuItem findItem = (toolbar != null ? toolbar : null).getMenu().findItem(R.id.vkim_done);
        if (findItem != null) {
            findItem.setVisible(false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.hzb, xsna.j8i] */
    @Override // xsna.hzb, xsna.kcb.a.InterfaceC3174a
    public final void f() {
        this.b.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.hzb, xsna.j8i] */
    @Override // xsna.hzb, xsna.kcb.a.InterfaceC3174a
    public final void g(String str) {
        this.b.g(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.j8i, xsna.xwb$a] */
    @Override // xsna.vpb
    public final void h(vwb.b bVar) {
        this.b.h(bVar);
    }

    public final void i() {
        if (this.n) {
            VkTopBar vkTopBar = this.h;
            if (vkTopBar == null) {
                vkTopBar = null;
            }
            vkTopBar.setAfter(null);
            return;
        }
        MenuItem c2 = c();
        if (c2 != null) {
            c2.setVisible(false);
        }
    }

    public final void j() {
        View actionView;
        bzb0 bzb0Var = this.f;
        if (bzb0Var != null) {
            bzb0Var.a();
            s3q0 s3q0Var = s3q0.a;
            this.f = null;
        }
        Toolbar toolbar = this.g;
        if (toolbar == null) {
            toolbar = null;
        }
        kkm kkmVar = this.c;
        kkmVar.h(toolbar);
        MenuItem c2 = c();
        if (c2 != null && (actionView = c2.getActionView()) != null) {
            kkmVar.h(actionView);
        }
        CircularProgressView circularProgressView = this.l;
        kkmVar.h(circularProgressView != null ? circularProgressView : null);
    }

    public final void k() {
        if (!this.n) {
            Toolbar toolbar = this.g;
            MenuItem findItem = (toolbar != null ? toolbar : null).getMenu().findItem(R.id.vkim_done);
            if (findItem != null) {
                findItem.setVisible(true);
                return;
            }
            return;
        }
        VkTopBar vkTopBar = this.h;
        if (vkTopBar == null) {
            vkTopBar = null;
        }
        gko.b bVar = gko.Companion;
        vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_done_28), null, new com.vk.movika.sdk.base.presenter.b(this, 8), null, new b8g(dhr0.t.c(R.attr.vk_ui_icon_accent_themed)), com.vk.core.compose.component.semantics.b.a(null, new tr0(1), 3), 10), null, 6));
    }

    public final void l() {
        if (this.n) {
            VkTopBar vkTopBar = this.h;
            if (vkTopBar == null) {
                vkTopBar = null;
            }
            long c2 = f870.c(e3m.f(R.attr.vk_ui_icon_accent_themed, vkTopBar.getContext()));
            VkTopBar vkTopBar2 = this.h;
            if (vkTopBar2 == null) {
                vkTopBar2 = null;
            }
            vkTopBar2.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.h(c2), null, 6));
            return;
        }
        MenuItem c3 = c();
        if (c3 != null) {
            if (c3.getActionView() == null) {
                Toolbar toolbar = this.g;
                if (toolbar == null) {
                    toolbar = null;
                }
                CircularProgressView circularProgressView = new CircularProgressView(toolbar.getContext());
                circularProgressView.setLayoutParams(new ViewGroup.LayoutParams(cn70.b(56), cn70.b(56)));
                int b2 = cn70.b(14);
                circularProgressView.setPadding(b2, b2, b2, b2);
                circularProgressView.setIndeterminate(true);
                circularProgressView.setThickness(cn70.b(2));
                kkm kkmVar = this.c;
                kkmVar.getClass();
                kkmVar.a(circularProgressView, "progressTint", new d9j(kkmVar, 3));
                c3.setActionView(circularProgressView);
            }
            c3.setVisible(true);
        }
        MenuItem c4 = c();
        View actionView = c4 != null ? c4.getActionView() : null;
        CircularProgressView circularProgressView2 = actionView instanceof CircularProgressView ? (CircularProgressView) actionView : null;
        if (circularProgressView2 != null) {
            circularProgressView2.b();
        }
    }

    public void R(boolean z) {
    }

    public void q0(String str) {
    }
}
