package com.vkontakte.android.fragments;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.about.AboutAppFragment;
import com.vk.balance.BalanceFragment;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.debug.ui.DebugTabsFragment;
import com.vk.donut.impl.PaidSubscriptionsFragment;
import com.vk.identity.fragments.IdentityListFragment;
import com.vk.multiaccount.api.domain.model.VkClientOpenSwitcherConfig;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.EcosystemProfileView;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.a;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.configuration.ActionButtonsStyle;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.configuration.LogoStyle;
import com.vk.webapp.fragments.HelpFragment;
import com.vk.webapp.fragments.PrivacyFragment;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.a0a;
import xsna.cez;
import xsna.da50;
import xsna.dez;
import xsna.dhr0;
import xsna.dyo;
import xsna.e43;
import xsna.ey50;
import xsna.f880;
import xsna.fpf0;
import xsna.fyc0;
import xsna.g880;
import xsna.gkc0;
import xsna.gpu0;
import xsna.gzs;
import xsna.h3p0;
import xsna.h48;
import xsna.hu50;
import xsna.iah0;
import xsna.io60;
import xsna.itg0;
import xsna.iud0;
import xsna.jjv0;
import xsna.jlu0;
import xsna.kjf0;
import xsna.kw5;
import xsna.lpj;
import xsna.m6r0;
import xsna.m7m;
import xsna.m960;
import xsna.mlf0;
import xsna.msn;
import xsna.msy;
import xsna.mui0;
import xsna.n7r;
import xsna.o25;
import xsna.o2l;
import xsna.oz50;
import xsna.pwh0;
import xsna.q6r0;
import xsna.q9k;
import xsna.qsk0;
import xsna.r6m;
import xsna.r9c0;
import xsna.s3q0;
import xsna.t200;
import xsna.tju;
import xsna.tlo0;
import xsna.tq;
import xsna.u1u0;
import xsna.v2j0;
import xsna.vk40;
import xsna.vv20;
import xsna.w2j0;
import xsna.x2j0;
import xsna.x750;
import xsna.xxo;
import xsna.y1z;
import xsna.yn3;
import xsna.yu60;
import xsna.zqn0;

/* compiled from: SettingsListFragment.kt */
/* loaded from: classes7.dex */
public final class SettingsListFragment extends CardRecyclerFragment<kjf0.a> {
    public static final /* synthetic */ int X0 = 0;
    public int J0;
    public int K0;
    public Long L0;
    public io.reactivex.rxjava3.disposables.c M0;
    public io.reactivex.rxjava3.disposables.c N0;
    public final Object O0;
    public final Object P0;
    public final Object Q0;
    public final Object R0;
    public final Object S0;
    public final Object T0;
    public final Object U0;
    public final f V0;
    public final h W0;

    /* compiled from: SettingsListFragment.kt */
    public static final class a {
        public static void a(Context context, String str) {
            new oz50(SettingsListFragment.class, null, q9k.a("extraNewTheme", str)).k(context);
        }
    }

    /* compiled from: SettingsListFragment.kt */
    public static final class c extends IOException {
    }

    /* compiled from: SettingsListFragment.kt */
    public static final class d implements Callable<Boolean> {
        public final mui0 b;

        public d(mui0 mui0Var) {
            this.b = mui0Var;
        }

        @Override // java.util.concurrent.Callable
        public final Boolean call() {
            o25.a().O(new t200(72, o25.a().c(), "user", null, true, true, true));
            return Boolean.valueOf(this.b.i() == null);
        }
    }

    /* compiled from: SettingsListFragment.kt */
    public static final class e implements io.reactivex.rxjava3.functions.f<Boolean> {
        public final WeakReference<Activity> b;
        public final WeakReference<Dialog> c;

        public e(FragmentActivity fragmentActivity, com.vk.core.view.components.spinner.c cVar) {
            this.b = new WeakReference<>(fragmentActivity);
            this.c = new WeakReference<>(cVar);
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            u1u0.b(this.c.get());
            ComponentCallbacks2 componentCallbacks2 = (Activity) this.b.get();
            if ((componentCallbacks2 instanceof ey50) && booleanValue) {
                ((ey50) componentCallbacks2).Y().K(null);
            }
        }
    }

    /* compiled from: SettingsListFragment.kt */
    public final class f extends kjf0 implements jjv0 {
        public int e;
        public boolean f;

        /* compiled from: SettingsListFragment.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VkClientOpenSwitcherConfig.values().length];
                try {
                    iArr[VkClientOpenSwitcherConfig.OPEN_AUTH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VkClientOpenSwitcherConfig.OPEN_SWITCHER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public f(SettingsListFragment settingsListFragment) {
            super(settingsListFragment);
            this.e = -1;
        }

        public static kjf0.a z0() {
            return kjf0.a.a(1, new b(R.drawable.vk_icon_bug_outline_28, tq.h(tlo0.Companion, R.string.sett_debug), DebugTabsFragment.class));
        }

        @Override // xsna.jjv0
        public final int n1(int i) {
            return (i >= getItemCount() || i <= 0 || (x0().get(i).c & 2) == 0) ? 0 : 3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            SettingsListFragment settingsListFragment = SettingsListFragment.this;
            if (i == 1) {
                return new fyc0(viewGroup, new com.vkontakte.android.fragments.d(1, settingsListFragment, SettingsListFragment.class, "onItemClick", "onItemClick(Lcom/vkontakte/android/fragments/SettingsListFragment$Item;)V", 0));
            }
            if (i == 2) {
                return new kw5(viewGroup);
            }
            if (i == 3) {
                return new com.vkontakte.android.fragments.a(viewGroup, settingsListFragment);
            }
            if (i != 4) {
                return i != 5 ? new fyc0(viewGroup, new com.vkontakte.android.fragments.e(1, settingsListFragment, SettingsListFragment.class, "onItemClick", "onItemClick(Lcom/vkontakte/android/fragments/SettingsListFragment$Item;)V", 0)) : new com.vkontakte.android.fragments.b(viewGroup, settingsListFragment);
            }
            EcosystemProfileView ecosystemProfileView = new EcosystemProfileView(settingsListFragment.requireContext(), null, 6);
            ecosystemProfileView.h.s(new a.i(new xxo(dyo.b.a, LogoStyle.ECOSYSTEM, false, xxo.f, ActionButtonsStyle.DEFAULT)));
            float f = 8;
            ecosystemProfileView.setPadding(iah0.a(f), 0, iah0.a(f), iah0.a(12));
            return new com.vkontakte.android.fragments.c(ecosystemProfileView);
        }

        @Override // xsna.jjv0
        public final int t(int i) {
            return 0;
        }
    }

    /* compiled from: SettingsListFragment.kt */
    public static final /* synthetic */ class g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkClientOpenSwitcherConfig.values().length];
            try {
                iArr[VkClientOpenSwitcherConfig.OPEN_AUTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkClientOpenSwitcherConfig.OPEN_SWITCHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SettingsListFragment.kt */
    public static final class h extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            int i = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    public SettingsListFragment() {
        super(10);
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.M0 = emptyDisposable;
        this.N0 = emptyDisposable;
        x750 x750Var = new x750(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.O0 = msy.a(lazyThreadSafetyMode, x750Var);
        this.P0 = msy.a(lazyThreadSafetyMode, new tju(this, 29));
        this.Q0 = msy.a(lazyThreadSafetyMode, new vv20(this, 24));
        this.R0 = msy.a(lazyThreadSafetyMode, new w2j0(this, 0));
        this.S0 = msy.a(lazyThreadSafetyMode, new gkc0(this, 9));
        this.T0 = msy.a(lazyThreadSafetyMode, new da50(this, 21));
        this.U0 = msy.a(lazyThreadSafetyMode, new mlf0(this, 3));
        this.V0 = new f(this);
        this.W0 = new h();
        Ho(false);
    }

    public static final void Ko(SettingsListFragment settingsListFragment, b bVar) {
        settingsListFragment.getClass();
        oz50 oz50Var = bVar.e;
        Class<? extends FragmentImpl> cls = bVar.d;
        if (oz50Var != null) {
            oz50Var.k(settingsListFragment.getActivity());
            return;
        }
        if (cls != null) {
            new oz50(cls, null, null).k(settingsListFragment.getActivity());
            return;
        }
        gzs<s3q0> gzsVar = bVar.f;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // com.vkontakte.android.fragments.CardRecyclerFragment
    public final gpu0 Io(jjv0 jjv0Var) {
        gpu0 Io = super.Io(jjv0Var);
        Io.i = iah0.a(16);
        float f2 = 12;
        Io.g = iah0.a(f2);
        Io.h = iah0.a(f2);
        Io.e = iah0.a(f2);
        Io.f = iah0.a(1);
        Io.c = R.attr.vk_ui_separator_primary;
        Io.Ng();
        return Io;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.W0;
    }

    public final b Lo(int i) {
        int i2 = Mo().b() ? R.string.sett_dnd_cancel : R.string.chat_dnd;
        if (!this.M0.h()) {
            this.M0.dispose();
        }
        this.M0 = Mo().f().subscribe(new vk40(new v2j0(this, i), 19));
        return new b(R.drawable.vk_icon_block_outline_28, tq.h(tlo0.Companion, i2), new pwh0(this, 4));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final msn Mo() {
        return (msn) this.S0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final jlu0 No() {
        return (jlu0) this.P0.getValue();
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        lpj lpjVar = (lpj) this.W0.a;
        return lpjVar != null ? lpjVar : B();
    }

    @Override // com.vkontakte.android.fragments.CardRecyclerFragment, me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        qo();
        Mo().c(requireContext());
    }

    @Override // com.vkontakte.android.fragments.CardRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = this.K0;
        this.K0 = i;
        UsableRecyclerView usableRecyclerView = this.n0;
        if (usableRecyclerView == null) {
            return;
        }
        h48.a(usableRecyclerView, this.J0, i, 0);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zqn0.a.f();
    }

    @Override // com.vkontakte.android.fragments.CardRecyclerFragment, me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.K0 = 0;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        if (this.M0.h()) {
            return;
        }
        this.M0.dispose();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.n0.f();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        qsk0.a.e(null);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            CacheComponent cacheComponent = (CacheComponent) m7m.d(this).a(fpf0.a(CacheComponent.class));
            itg0.a(activity, cacheComponent.ve().a(cacheComponent.ic().a()).subscribe(new hu50(new r9c0(this, 7), 17)));
        }
        Mo().getClass();
        f fVar = this.V0;
        if (fVar.e == -1 || fVar.f) {
            return;
        }
        o2l.a.getClass();
        if (o2l.b) {
            fVar.f = true;
            fVar.x0().add(fVar.e, f.z0());
            fVar.notifyItemInserted(fVar.e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vkontakte.android.fragments.CardRecyclerFragment, com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.J0 = this.n0.getPaddingBottom();
        tlo0.f h2 = tq.h(tlo0.Companion, R.string.menu_settings);
        yu60 yu60Var = new yu60(this, 23);
        VkTopBar vkTopBar = new VkTopBar(requireContext(), null, 6, 0);
        vkTopBar.setBack(new VkTopBar.b(yu60Var, null, null, null, null, 30));
        Object[] objArr = 0 == true ? 1 : 0;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(h2, null, null, 0 == true ? 1 : 0, null, 30), objArr, null, null, 14));
        vkTopBar.setOnClickListener(new yn3(this, 16));
        jo(vkTopBar);
        h3p0.d(this, vkTopBar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02b7  */
    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void vo(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        f fVar = this.V0;
        fVar.getClass();
        ArrayList arrayList = new ArrayList();
        m6r0 f2 = q6r0.f();
        arrayList.add(kjf0.a.a(4, new Object()));
        int i5 = 27;
        arrayList.add(kjf0.a.a(1, new b(R.drawable.vk_icon_notifications_28, tq.h(tlo0.Companion, R.string.sett_notifications), new io60(SettingsListFragment.this, i5))));
        SettingsListFragment.this.Mo().getClass();
        arrayList.add(kjf0.a.a(1, SettingsListFragment.this.Lo(arrayList.size())));
        arrayList.add(kjf0.a.b(1, new b(R.drawable.vk_icon_user_outline_28, new tlo0.f(R.string.sett_account), SettingsAccountFragment.class)));
        arrayList.add(kjf0.a.a(1, new b(R.drawable.vk_icon_palette_outline_28, new tlo0.f(R.string.sett_appearance), new f880(SettingsListFragment.this, 20))));
        int i6 = 0;
        if (!SettingsListFragment.this.U) {
            arrayList.add(kjf0.a.a(1, new b(R.drawable.vk_icon_square_4_outline_28, new tlo0.f(R.string.sett_tabbar), new x2j0(SettingsListFragment.this, i6))));
        }
        arrayList.add(kjf0.a.a(1, new b(R.drawable.vk_icon_settings_outline_28, new tlo0.f(R.string.sett_general), SettingsGeneralFragment.class)));
        tlo0.f fVar2 = new tlo0.f(R.string.privacy_settings);
        int i7 = PrivacyFragment.a0;
        arrayList.add(kjf0.a.a(1, new b(R.drawable.vk_icon_privacy_outline_28, fVar2, PrivacyFragment.b.a(false, false, null, null, 47))));
        arrayList.add(kjf0.a.a(1, new b(R.drawable.vk_icon_users_outline_28, new tlo0.f(R.string.blacklist), new g880(SettingsListFragment.this, 21))));
        if (f2.e(m6r0.x0)) {
            tlo0.f fVar3 = new tlo0.f(R.string.vk_identity_title);
            IdentityListFragment.c cVar = new IdentityListFragment.c(IdentityListFragment.class, null, null);
            cVar.j.putString("arg_source", "menu");
            arrayList.add(kjf0.a.a(1, new b(R.drawable.vk_icon_services_outline_28, fVar3, cVar)));
        }
        arrayList.add(kjf0.a.b(1, new b(R.drawable.vk_icon_coins_outline_28, new tlo0.f(R.string.votes), BalanceFragment.class)));
        arrayList.add(kjf0.a.a(1, new b(R.drawable.vk_icon_money_circle_outline_28, new tlo0.f(R.string.settings_paid_subscriptions), new PaidSubscriptionsFragment.a())));
        arrayList.add(kjf0.a.b(1, new b(R.drawable.vk_icon_info_outline_28, new tlo0.f(R.string.menu_about), new AboutAppFragment.b(AboutAppFragment.class, null, null))));
        tlo0.f fVar4 = new tlo0.f(R.string.right_menu_support);
        int i8 = HelpFragment.a0;
        arrayList.add(kjf0.a.a(1, new b(R.drawable.vk_icon_help_circle_outline_28, fVar4, HelpFragment.b.a(null, null, "https://" + a0a.d + "/support/?vk_ref=settings"))));
        fVar.e = arrayList.size();
        o2l.a.getClass();
        boolean e2 = o2l.e();
        if (e2 || o2l.b) {
            fVar.f = true;
            arrayList.add(f.z0());
        }
        n7r n7rVar = m6r0.q;
        if (TextUtils.isEmpty((String) f2.a(n7rVar)) || TextUtils.equals((String) f2.a(n7rVar), "app_developer")) {
            r6m.a.getClass();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            if (Settings.Secure.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 1) {
                Context context2 = e43.a;
                if (Settings.Secure.getInt((context2 != null ? context2 : null).getContentResolver(), "adb_enabled", 0) == 1) {
                    z = true;
                    if (BuildInfo.m() && z) {
                        arrayList.add(kjf0.a.a(1, new b(R.drawable.vk_icon_new_logo_vk_outline_28, new tlo0.h(f2.n() + ", xочешь в команду VK?"), new m960(SettingsListFragment.this, i5))));
                    }
                    int i9 = 3;
                    if (e2) {
                        arrayList.add(kjf0.a.a(1, new b(R.drawable.vk_icon_send_outline_28, new tlo0.h(!BuildInfo.m() ? SettingsListFragment.this.getString(R.string.settings_send_debug_logs) : SettingsListFragment.this.getString(R.string.settings_upload_debug_logs)), new iud0(i9))));
                    }
                    i3 = f.a.$EnumSwitchMapping$0[SettingsListFragment.this.No().d(MultiAccountEntryPoint.SettingsLogout.d).ordinal()];
                    if (i3 != 1) {
                        i4 = R.string.add_account;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i4 = R.string.change_account;
                    }
                    arrayList.add(kjf0.a.c(5, new cez.a(i4)));
                    arrayList.add(kjf0.a.a(3, new dez.a()));
                    Bo(arrayList, false);
                }
            }
        }
        z = false;
        if (BuildInfo.m()) {
            arrayList.add(kjf0.a.a(1, new b(R.drawable.vk_icon_new_logo_vk_outline_28, new tlo0.h(f2.n() + ", xочешь в команду VK?"), new m960(SettingsListFragment.this, i5))));
        }
        int i92 = 3;
        if (e2) {
        }
        i3 = f.a.$EnumSwitchMapping$0[SettingsListFragment.this.No().d(MultiAccountEntryPoint.SettingsLogout.d).ordinal()];
        if (i3 != 1) {
        }
        arrayList.add(kjf0.a.c(5, new cez.a(i4)));
        arrayList.add(kjf0.a.a(3, new dez.a()));
        Bo(arrayList, false);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final RecyclerView.Adapter<?> wo() {
        return this.V0;
    }

    /* compiled from: SettingsListFragment.kt */
    public static final class b extends fyc0.a {
        public final Class<? extends FragmentImpl> d;
        public final oz50 e;
        public final gzs<s3q0> f;

        public b() {
            throw null;
        }

        public b(int i, tlo0.f fVar, Class cls) {
            super(i, fVar);
            this.d = cls;
        }

        public b(int i, tlo0.f fVar, oz50 oz50Var) {
            super(i, fVar);
            this.e = oz50Var;
        }

        public b(int i, tlo0 tlo0Var, gzs gzsVar) {
            super(i, tlo0Var);
            this.f = gzsVar;
        }
    }
}
