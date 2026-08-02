package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem;
import com.vk.superapp.api.dto.account.ProfileNavigationInfo;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;
import xsna.p820;
import xsna.s9n0;
import xsna.tzp0;

/* compiled from: SuperAppMenuV3Dialog.kt */
/* loaded from: classes6.dex */
public final class x9n0 extends hi6<w9n0> implements m0q0 {
    public static final /* synthetic */ int p1 = 0;
    public RecyclerView h1;
    public View i1;
    public boolean k1;
    public boolean l1;
    public final Object m1;
    public final Object n1;
    public final b o1;
    public final s9n0 g1 = new s9n0();
    public final r9n0 j1 = new r9n0(new wgm0(this, 3));

    /* compiled from: SuperAppMenuV3Dialog.kt */
    public static final class a extends dw20.b {
        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new x9n0();
        }
    }

    /* compiled from: SuperAppMenuV3Dialog.kt */
    public static final class b implements fcn {
        public b() {
        }

        @Override // xsna.fcn
        public final boolean M4() {
            return false;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return true;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            ww50 v;
            x9n0 x9n0Var = x9n0.this;
            x9n0Var.hide();
            FragmentActivity activity = x9n0Var.getActivity();
            if (activity == null || (v = s200.v(activity)) == null) {
                return;
            }
            v.H(this);
        }

        @Override // xsna.fcn
        public final void dismiss() {
            b(false);
        }

        @Override // xsna.fcn
        public final boolean v6() {
            return true;
        }
    }

    public x9n0() {
        kld0 kld0Var = new kld0(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.m1 = msy.a(lazyThreadSafetyMode, kld0Var);
        this.n1 = msy.a(lazyThreadSafetyMode, new i6m0(this, 2));
        this.x = new tzp0.c.a(this, false);
        this.o1 = new b();
    }

    public final boolean Zn() {
        return this.k1 || this.l1;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1 = new y9n0(this, this.g1, (hlu0) this.m1.getValue(), ((VkClientMultiAccountComponent) m7m.d(this).a(fpf0.a(VkClientMultiAccountComponent.class))).a(), (b25) this.n1.getValue());
    }

    @Override // xsna.hi6, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.h1 = null;
        this.i1 = null;
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.k1 = true;
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        T t;
        ProfileNavigationInfo.SecurityInfo securityInfo;
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.SUPER_APP_BURGER_MENU;
        s9n0 s9n0Var = this.g1;
        MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem = null;
        Integer num = null;
        if (s9n0Var.a != null) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = s9n0Var.a;
            if (arrayList2 != null) {
                int i = 0;
                Integer num2 = null;
                for (Object obj : arrayList2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    p820 p820Var = (p820) obj;
                    if (p820Var instanceof p820.a) {
                        ProfileNavigationInfo profileNavigationInfo = ((p820.a) p820Var).a;
                        if (profileNavigationInfo == null || (securityInfo = profileNavigationInfo.d) == null) {
                            t = 0;
                        } else {
                            int i3 = s9n0.a.$EnumSwitchMapping$0[securityInfo.ordinal()];
                            if (i3 == 1) {
                                t = MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem.SecurityLevel.NO_STATUS;
                            } else if (i3 == 2) {
                                t = MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem.SecurityLevel.NO_PHONE;
                            } else if (i3 == 3) {
                                t = MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem.SecurityLevel.HAS_WARNINGS;
                            } else {
                                if (i3 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                t = MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem.SecurityLevel.ALL_GOOD;
                            }
                        }
                        ref$ObjectRef.element = t;
                    }
                    arrayList.add(p820Var.c());
                    String c = p820Var.c();
                    p820 p820Var2 = s9n0Var.b;
                    if (epx.f(c, p820Var2 != null ? p820Var2.c() : null)) {
                        num2 = Integer.valueOf(i);
                    }
                    i = i2;
                }
                num = num2;
            }
            mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem = new MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem(arrayList, (MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem.SecurityLevel) ref$ObjectRef.element, num);
        }
        if (mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem != null) {
            uiTrackingScreen.a(mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem);
        }
    }

    @Override // xsna.hi6, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        ViewGroup Ln = Ln();
        if (Ln != null) {
            Context Mn = Mn();
            if (Mn == null) {
                Mn = requireContext();
            }
            RecyclerView recyclerView = (RecyclerView) Ln.findViewById(R.id.menu_recycler);
            recyclerView.setLayoutManager(new LinearLayoutManager());
            r9n0 r9n0Var = this.j1;
            recyclerView.setAdapter(r9n0Var);
            gpu0 gpu0Var = new gpu0(Mn);
            gpu0Var.i = iah0.a(16);
            float f = 12;
            gpu0Var.g = iah0.a(f);
            gpu0Var.h = iah0.a(f);
            gpu0Var.c = R.attr.vk_ui_separator_primary;
            gpu0Var.Ng();
            gpu0Var.e = 0;
            gpu0Var.j = new z9n0(r9n0Var);
            recyclerView.addItemDecoration(gpu0Var);
            f4m.v(iah0.a(f), recyclerView);
            this.h1 = recyclerView;
            this.i1 = Ln.findViewById(R.id.progress);
        }
        return yn;
    }
}
