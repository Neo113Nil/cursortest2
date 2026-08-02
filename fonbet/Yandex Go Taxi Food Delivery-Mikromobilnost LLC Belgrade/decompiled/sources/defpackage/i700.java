package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.core.view.b;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.address.models.FavoritesInputParams$Intention;
import com.yandex.go.payments.AddButtonType;
import com.yandex.go.payments.api.shared.model.BusinessAccountMenuItemPosition;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.plus.api.model.BadgeContent$GlyphPosition;
import com.yandex.go.ultima_mode.menu.mvp.MenuUltimaModeView;
import com.yandex.go.user_profile.main_menu.profile.presentation.MainMenuUserProfileView;
import com.yandex.go.user_profile.main_menu.profile.repository.logout.presentation.MainMenuLogOutUiState;
import com.yandex.go.user_profile.settings.main.UserInfoView;
import com.yandex.go.yb.main_menu.ui.d;
import defpackage.fky;
import defpackage.i000;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.gopayments.business.SharedAccountMenuViewModel;
import ru.yandex.taxi.plus.badge.CashbackAmountView;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;
import ru.yandex.taxi.settings.main.NativeMenuState;
import ru.yandex.taxi.settings.main.data.PaymentMenuItemAppearance;
import ru.yandex.taxi.settings.main.e;
import ru.yandex.taxi.settings.main.f;
import ru.yandex.taxi.settings.main.k;
import ru.yandex.taxi.settings.presentation.menu_item.PushDisabledMenuItem;
import ru.yandex.taxi.zalogin.LinkAccountsViewFactoryImpl$createLinkAccountsView$1;

/* loaded from: classes6.dex */
public final class i700 extends x3 implements z500 {
    public final c2x0 A;
    public final g3g0 B;
    public final un10 C;
    public final uk10 D;
    public final d E;
    public final View F;
    public final ScrollView G;
    public final LinearLayout H;
    public final i3y I;
    public final i3y J;
    public final i3y K;
    public final i3y L;
    public final ViewGroup M;
    public final i3y N;
    public final i3y O;
    public final i3y P;
    public final i3y Q;
    public final i3y R;
    public final i3y S;
    public final i3y T;
    public final i3y U;
    public final i3y V;
    public final i3y W;
    public final ViewGroup Z;
    public final ViewGroup a0;
    public final ViewGroup b0;
    public final f c;
    public final ViewGroup c0;
    public final i3y d0;
    public final i3y e0;
    public final i3y f0;
    public final i3y g0;
    public final i3y h0;
    public final i3y i0;
    public final i3y j0;
    public final i3y k0;
    public PushDisabledMenuItem l0;
    public final i3y m0;
    public final i3y n0;
    public final i3y o0;
    public final i3y p0;
    public final i3y q0;
    public f r0;
    public boolean s0;
    public boolean t0;
    public final f3f0 u0;
    public final q2w v0;
    public final h3y w;
    public final h3y x;
    public final pav y;
    public final k7x0 z;

    public i700(Activity activity, f fVar, o350 o350Var, h3y h3yVar, h3y h3yVar2, pav pavVar, k7x0 k7x0Var, c2x0 c2x0Var, g3g0 g3g0Var, ny51 ny51Var, h3y h3yVar3, un10 un10Var, uk10 uk10Var, Lifecycle lifecycle, tse tseVar) {
        super(o350Var);
        this.c = fVar;
        this.w = h3yVar;
        this.x = h3yVar2;
        this.y = pavVar;
        this.z = k7x0Var;
        this.A = c2x0Var;
        this.B = g3g0Var;
        this.C = un10Var;
        this.D = uk10Var;
        final int i = 18;
        this.E = new d(Vg(oeh0.yb_wallet_view_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i2 = i;
                final int i3 = 1;
                final int i4 = 3;
                final int i5 = 2;
                final i700 i700Var = this.b;
                switch (i2) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i5));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i5));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i4));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i6 = i5;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i6) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i3));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i6 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i62 = i6;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i62) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i62 = i3;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i62) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i62 = i4;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i62) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i5));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        }), (ly51) ((egx0) ny51Var.a.a.a).get());
        View view = (View) this.b;
        this.F = view;
        int i2 = oeh0.menu_scroll_view;
        WeakHashMap weakHashMap = b.a;
        this.G = (ScrollView) ((View) rp31.d(view, i2));
        this.H = (LinearLayout) ((View) rp31.d(view, oeh0.menu_content));
        final int i3 = 0;
        this.I = Vg(oeh0.user_profile_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i3;
                final int i32 = 1;
                final int i4 = 3;
                final int i5 = 2;
                final i700 i700Var = this.b;
                switch (i22) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i5));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i5));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i4));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i62 = i5;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i62) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i32));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i6 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i62 = i6;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i62) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i62 = i32;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i62) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i62 = i4;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i62) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i5));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        });
        this.J = a.a(new g700(i3, h3yVar3, this));
        final int i4 = 9;
        this.K = Vg(oeh0.phonish_upgrade_view_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i4;
                final int i32 = 1;
                final int i42 = 3;
                final int i5 = 2;
                final i700 i700Var = this.b;
                switch (i22) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i5));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i5));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i42));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i62 = i5;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i62) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i32));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i6 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i62 = i6;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i62) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i62 = i32;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i62) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i62 = i42;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i62) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i5));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        });
        final int i5 = 10;
        this.L = Vg(oeh0.upgrade_account_view_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i5;
                final int i32 = 1;
                final int i42 = 3;
                final int i52 = 2;
                final i700 i700Var = this.b;
                switch (i22) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i52));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i52));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i42));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i62 = i52;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i62) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i32));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i6 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i62 = i6;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i62) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i62 = i32;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i62) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i62 = i42;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i62) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i52));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        });
        this.M = (ViewGroup) ((View) rp31.d(view, oeh0.menu_personal_section));
        final int i6 = 11;
        this.N = Vg(oeh0.hire_driver_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i6;
                final int i32 = 1;
                final int i42 = 3;
                final int i52 = 2;
                final i700 i700Var = this.b;
                switch (i22) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i52));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i52));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i42));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i62 = i52;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i62) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i32));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i62 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i62;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i32;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i42;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i52));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        });
        final int i7 = 12;
        this.O = Vg(oeh0.order_history_view_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i7;
                final int i32 = 1;
                final int i42 = 3;
                final int i52 = 2;
                final i700 i700Var = this.b;
                switch (i22) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i52));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i52));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i42));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i52;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i32));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i62 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i62;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i32;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i42;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i52));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        });
        final int i8 = 13;
        this.P = Vg(oeh0.menu_item_payment_method_view_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i8;
                final int i32 = 1;
                final int i42 = 3;
                final int i52 = 2;
                final i700 i700Var = this.b;
                switch (i22) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i52));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i52));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i42));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i52;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i32));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i62 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i62;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i32;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i42;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i52));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        });
        final int i9 = 14;
        this.Q = Vg(oeh0.enter_phone_view_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i9;
                final int i32 = 1;
                final int i42 = 3;
                final int i52 = 2;
                final i700 i700Var = this.b;
                switch (i22) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i52));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i52));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i42));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i52;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i32));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i62 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i62;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i32;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i42;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i52));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        });
        this.R = Ug(oeh0.add_payment_method_button_view_stub);
        final int i10 = 15;
        this.S = Vg(oeh0.promocode_view_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i10;
                final int i32 = 1;
                final int i42 = 3;
                final int i52 = 2;
                final i700 i700Var = this.b;
                switch (i22) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i52));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i52));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i42));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i52;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i32));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i62 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i62;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i32;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i42;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i52));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        });
        final int i11 = 16;
        this.T = Vg(oeh0.my_addresses_view_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i11;
                final int i32 = 1;
                final int i42 = 3;
                final int i52 = 2;
                final i700 i700Var = this.b;
                switch (i22) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i52));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i52));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i42));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i52;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i32));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i62 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i62;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i32;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i42;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i52));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        });
        this.U = Ug(oeh0.family_group_item_stub);
        this.V = Ug(oeh0.bug_report_item_stub);
        final int i12 = 17;
        this.W = Vg(oeh0.logout_item_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i12;
                final int i32 = 1;
                final int i42 = 3;
                final int i52 = 2;
                final i700 i700Var = this.b;
                switch (i22) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i52));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i52));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i42));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i52;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i32));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i62 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i62;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i32;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i42;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i52));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        });
        this.Z = (ViewGroup) ((View) rp31.d(view, oeh0.shared_payment_accounts_menu_container));
        this.a0 = (ViewGroup) ((View) rp31.d(view, oeh0.shared_payment_accounts_menu_container_parent));
        this.b0 = (ViewGroup) ((View) rp31.d(view, oeh0.business_account_menu_prioritized_container_parent));
        this.c0 = (ViewGroup) ((View) rp31.d(view, oeh0.business_account_menu_prioritized_container));
        final int i13 = 1;
        this.d0 = Vg(oeh0.safety_center_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i13;
                final int i32 = 1;
                final int i42 = 3;
                final int i52 = 2;
                final i700 i700Var = this.b;
                switch (i22) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i52));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i52));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i42));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i52;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i32));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i62 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i62;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i32;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i42;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i52));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        });
        this.e0 = Ug(oeh0.special_needs_view_stub);
        this.f0 = Ug(oeh0.plus_cashback_stub);
        final int i14 = 2;
        this.g0 = Vg(oeh0.maas_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i14;
                final int i32 = 1;
                final int i42 = 3;
                final int i52 = 2;
                final i700 i700Var = this.b;
                switch (i22) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i52));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i52));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i42));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i52;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i32));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i62 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i62;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i32;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i42;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i52));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        });
        this.h0 = a.a(new r4b(activity, 1));
        final int i15 = 3;
        this.i0 = Vg(oeh0.menu_item_address_view_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i15;
                final int i32 = 1;
                final int i42 = 3;
                final int i52 = 2;
                final i700 i700Var = this.b;
                switch (i22) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i52));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i52));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i42));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i52;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i32));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i62 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i62;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i32;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i42;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i52));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        });
        this.j0 = Ug(oeh0.business_to_business_view_stub);
        final int i16 = 4;
        this.k0 = Vg(oeh0.ugc_item_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i16;
                final int i32 = 1;
                final int i42 = 3;
                final int i52 = 2;
                final i700 i700Var = this.b;
                switch (i22) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i52));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i52));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i42));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i52;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i32));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i62 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i62;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i32;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i42;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i52));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        });
        final int i17 = 5;
        this.m0 = Vg(oeh0.settings_item_view_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i17;
                final int i32 = 1;
                final int i42 = 3;
                final int i52 = 2;
                final i700 i700Var = this.b;
                switch (i22) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i52));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i52));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i42));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i52;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i32));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i62 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i62;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i32;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i42;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i52));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        });
        final int i18 = 6;
        this.n0 = Vg(oeh0.info_view_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i18;
                final int i32 = 1;
                final int i42 = 3;
                final int i52 = 2;
                final i700 i700Var = this.b;
                switch (i22) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i52));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i52));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i42));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i52;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i32));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i62 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i62;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i32;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i42;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i52));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        });
        final int i19 = 7;
        this.o0 = Vg(oeh0.feedback_view_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i19;
                final int i32 = 1;
                final int i42 = 3;
                final int i52 = 2;
                final i700 i700Var = this.b;
                switch (i22) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i52));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i52));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i42));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i52;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i32));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i62 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i62;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i32;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i42;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i52));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        });
        final int i20 = 8;
        this.p0 = Vg(oeh0.yango_business_item_stub, new Consumer(this) { // from class: c700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i20;
                final int i32 = 1;
                final int i42 = 3;
                final int i52 = 2;
                final i700 i700Var = this.b;
                switch (i22) {
                    case 0:
                        ((MainMenuUserProfileView) obj).setActionListener(new e700(i700Var, i52));
                        break;
                    case 1:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 11));
                        break;
                    case 2:
                        ListItemComponent listItemComponent = (ListItemComponent) obj;
                        listItemComponent.setDebounceClickListener(new p500(3, i700Var, listItemComponent));
                        break;
                    case 3:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 12));
                        break;
                    case 4:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 5));
                        break;
                    case 5:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 4));
                        break;
                    case 6:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, i52));
                        break;
                    case 7:
                        ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                        uk10 uk10Var2 = i700Var.D;
                        uk10Var2.getClass();
                        uk10Var2.f(listItemComponent2, new lj10(62));
                        listItemComponent2.setDebounceClickListener(new d700(i700Var, 8));
                        break;
                    case 8:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i42));
                        break;
                    case 9:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i52;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (ViewGroup) obj);
                        break;
                    case 10:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i32));
                        break;
                    case 11:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 6));
                        break;
                    case 12:
                        final int i62 = 0;
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i62;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 13:
                        ListItemComponent listItemComponent3 = (ListItemComponent) obj;
                        listItemComponent3.setTrailView((View) i700Var.h0.getValue());
                        listItemComponent3.setDebounceClickListener(new d700(i700Var, 9));
                        break;
                    case 14:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i32;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 15:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 7));
                        break;
                    case 16:
                        c.z(new sls() { // from class: f700
                            @Override // defpackage.sls
                            public final Object invoke() {
                                f fVar2;
                                f fVar3;
                                f fVar4;
                                int i622 = i42;
                                i700 i700Var2 = i700Var;
                                zy11 zy11Var = zy11.a;
                                switch (i622) {
                                    case 0:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar2 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            ((f600) fVar2.F.get()).f();
                                            ((pep0) fVar2.I).f((m950) fVar2.c0.get(), new dmu(false), hxx.a);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar3 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var = fVar3.D;
                                            u500Var.getClass();
                                            u500Var.d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        i700Var2.bh(new e());
                                        break;
                                    default:
                                        if (!i700Var2.s0 && !i700Var2.t0 && (fVar4 = i700Var2.r0) != null) {
                                            i700Var2.s0 = true;
                                            u500 u500Var2 = fVar4.D;
                                            mip mipVar = new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.TRUE);
                                            u500Var2.getClass();
                                            u500Var2.d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, mipVar);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        }, (View) obj);
                        break;
                    case 17:
                        ((ListItemComponent) obj).setDebounceClickListener(new ru.yandex.taxi.settings.main.d(i700Var, i52));
                        break;
                    default:
                        ((ListItemComponent) obj).setDebounceClickListener(new d700(i700Var, 14));
                        break;
                }
            }
        });
        this.q0 = Ug(oeh0.lottery_view_stub);
        this.u0 = new f3f0();
        this.v0 = tje.i(view, 112, new e700(this, i3));
        cey.a(lifecycle, Lifecycle.Event.ON_CREATE, new ru.yandex.taxi.settings.main.d(this, i3));
        gtq0.t(tseVar, new e700(this, i13));
    }

    @Override // defpackage.z500
    public final boolean Aa() {
        return ((View) this.R.getValue()).getVisibility() == 0;
    }

    @Override // defpackage.z500
    public final void C9() {
        this.s0 = false;
    }

    @Override // defpackage.z500
    public final void Ce(ak4 ak4Var) {
        boolean z = ak4Var instanceof zj4;
        i3y i3yVar = this.f0;
        if (!z) {
            if ((ak4Var instanceof yj4) && i3yVar.isInitialized()) {
                ((ListItemComponent) i3yVar.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        ListItemComponent listItemComponent = (ListItemComponent) i3yVar.getValue();
        xj4 xj4Var = ((zj4) ak4Var).a;
        int i = 0;
        if (listItemComponent.findViewById(oeh0.cashback_view) == null) {
            View inflate = LayoutInflater.from(listItemComponent.getContext()).inflate(rqh0.menu_cashback_view, (ViewGroup) listItemComponent, false);
            listItemComponent.clipTrailFrame(false);
            listItemComponent.setTrailView(inflate);
        }
        listItemComponent.setTitle(xj4Var.a);
        CashbackAmountView cashbackAmountView = (CashbackAmountView) listItemComponent.findViewById(oeh0.cashback_view);
        CashbackAmountView.GlyphPosition glyphPosition = xj4Var.b == BadgeContent$GlyphPosition.START ? CashbackAmountView.GlyphPosition.START : CashbackAmountView.GlyphPosition.END;
        if (xj4Var instanceof hky0) {
            cashbackAmountView.setText(((hky0) xj4Var).f, true, glyphPosition);
        } else {
            cashbackAmountView.updateAmount(((co4) xj4Var).f, true, glyphPosition);
        }
        cashbackAmountView.setGradientSettings(xj4Var.c, xj4Var.d, xj4Var.e);
        cashbackAmountView.stopAnimations();
        listItemComponent.setVisibility(0);
        listItemComponent.setDebounceClickListener(new d700(this, i));
    }

    @Override // defpackage.z500
    public final void Df(hs11 hs11Var) {
        ListItemComponent listItemComponent = (ListItemComponent) this.k0.getValue();
        listItemComponent.setTitle(hs11Var.a);
        listItemComponent.setSubtitle(hs11Var.b);
        listItemComponent.setVisibility(0);
    }

    @Override // defpackage.z500
    public final boolean I3() {
        View findViewById = this.F.findViewById(oeh0.ultima_card_stub);
        return ((findViewById instanceof ViewStub) || findViewById == null || findViewById.getVisibility() != 0) ? false : true;
    }

    @Override // defpackage.z500
    public final void K2(z600 z600Var) {
        boolean z = z600Var instanceof s600;
        i3y i3yVar = this.Q;
        i3y i3yVar2 = this.J;
        i3y i3yVar3 = this.I;
        if (z) {
            ((MainMenuUserProfileView) i3yVar3.getValue()).setVisibility(0);
            ((UserInfoView) i3yVar2.getValue()).setVisibility(8);
            ((View) i3yVar.getValue()).setVisibility(8);
        } else if (z600Var instanceof t600) {
            ((MainMenuUserProfileView) i3yVar3.getValue()).setVisibility(8);
            ((UserInfoView) i3yVar2.getValue()).setVisibility(0);
            ((View) i3yVar.getValue()).setVisibility(8);
        } else if (!(z600Var instanceof y600)) {
            w511.b();
            return;
        } else {
            ((MainMenuUserProfileView) i3yVar3.getValue()).setVisibility(8);
            ((UserInfoView) i3yVar2.getValue()).setVisibility(8);
            ((View) i3yVar.getValue()).setVisibility(0);
        }
        ((MainMenuUserProfileView) i3yVar3.getValue()).render(z600Var);
    }

    @Override // defpackage.z500
    public final void L1(xrz xrzVar) {
        boolean z = xrzVar.d;
        String str = xrzVar.b;
        i3y i3yVar = this.q0;
        if (!z) {
            if (i3yVar.isInitialized()) {
                ((ListItemComponent) i3yVar.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        ListItemComponent listItemComponent = (ListItemComponent) i3yVar.getValue();
        listItemComponent.setTitle(xrzVar.a);
        listItemComponent.setSubtitle(str);
        listItemComponent.setSubtitle(str);
        lbm a = this.y.a(listItemComponent.getTrailImageView());
        nac nacVar = (nac) a;
        nacVar.c(((m7x0) this.z).a(xrzVar.e));
        listItemComponent.setVisibility(0);
        listItemComponent.setDebounceClickListener(new p500(2, this, xrzVar));
    }

    @Override // defpackage.z500
    public final void Q9(lc4 lc4Var) {
        ListItemComponent listItemComponent = (ListItemComponent) this.j0.getValue();
        listItemComponent.setTitle(lc4Var.a);
        listItemComponent.setVisibility(0);
        listItemComponent.setDebounceClickListener(new p500(4, this, lc4Var));
    }

    @Override // defpackage.z500
    public final void S1(MainMenuLogOutUiState mainMenuLogOutUiState) {
        ListItemComponent listItemComponent = (ListItemComponent) this.W.getValue();
        int i = h700.a[mainMenuLogOutUiState.ordinal()];
        if (i == 1) {
            listItemComponent.setVisibility(0);
            listItemComponent.setEnabled(true);
            listItemComponent.title().setAlpha(1.0f);
        } else if (i == 2) {
            listItemComponent.setVisibility(0);
            listItemComponent.setEnabled(false);
            listItemComponent.title().setAlpha(0.5f);
        } else if (i == 3) {
            listItemComponent.setVisibility(8);
        } else {
            w511.b();
        }
    }

    @Override // defpackage.z500
    public final void S2(boolean z) {
        ((ListItemComponent) this.P.getValue()).setSubtitleTextColor(z ? new gdc(mqg0.component_red_normal) : new bdc(xng0.textMinor));
    }

    @Override // defpackage.z500
    public final void Se() {
        Object obj;
        Object obj2;
        if (this.l0 == null) {
            b6g b6gVar = (b6g) this.B.b.getValue();
            b6gVar.getClass();
            iw8 iw8Var = b6gVar.a;
            Context context = (Context) iw8Var.f;
            q5z.h(context);
            pav pavVar = (pav) iw8Var.h;
            q5z.h(pavVar);
            k7x0 k7x0Var = (k7x0) iw8Var.g;
            q5z.h(k7x0Var);
            jae0 jae0Var = (jae0) iw8Var.j;
            q5z.h(jae0Var);
            Application application = (Application) iw8Var.a;
            q5z.h(application);
            o4g0 o4g0Var = new o4g0(application);
            pho phoVar = (pho) iw8Var.c;
            q5z.h(phoVar);
            sue0 sue0Var = new sue0(7, new x770(phoVar));
            pwy0 pwy0Var = (pwy0) iw8Var.q;
            q5z.h(pwy0Var);
            this.l0 = new PushDisabledMenuItem(context, pavVar, new l1g0(k7x0Var, jae0Var, o4g0Var, sue0Var, pwy0Var));
        }
        PushDisabledMenuItem pushDisabledMenuItem = this.l0;
        ViewGroup viewGroup = this.M;
        if (viewGroup.indexOfChild(pushDisabledMenuItem) < 0) {
            viewGroup.addView(this.l0, viewGroup.indexOfChild((View) this.i0.getValue()) + 1);
        }
        PushDisabledMenuItem pushDisabledMenuItem2 = this.l0;
        f3f0 f3f0Var = this.u0;
        Iterator it = f3f0Var.a.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (jl40.l(((e3f0) obj2).a, pushDisabledMenuItem2)) {
                    break;
                }
            }
        }
        if (obj2 == null) {
            PushDisabledMenuItem pushDisabledMenuItem3 = this.l0;
            ArrayList arrayList = f3f0Var.a;
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                ((e3f0) obj).getClass();
            }
            if (obj != null) {
                ny61.g("There is another item with specified priority");
                return;
            }
            e3f0 e3f0Var = new e3f0(pushDisabledMenuItem3);
            int i = 0;
            if (!arrayList.isEmpty()) {
                ((e3f0) kotlin.collections.a.P(arrayList)).getClass();
                ((e3f0) kotlin.collections.a.Z(arrayList)).getClass();
                int f = scc.f(arrayList);
                while (i < f) {
                    e3f0 e3f0Var2 = (e3f0) arrayList.get(i);
                    i++;
                    e3f0Var2.getClass();
                }
                ny61.r("This exception must not be thrown");
                return;
            }
            arrayList.add(0, e3f0Var);
        }
        eh();
    }

    @Override // defpackage.z500
    public final void T7(ListBuilder listBuilder) {
        ViewGroup viewGroup = this.c0;
        viewGroup.removeAllViews();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listBuilder) {
            if (((SharedAccountMenuViewModel) obj).f == BusinessAccountMenuItemPosition.PRIORITIZED) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            viewGroup.addView(Wg((SharedAccountMenuViewModel) it.next()));
        }
        this.b0.setVisibility(arrayList.isEmpty() ? 8 : 0);
        ViewGroup viewGroup2 = this.Z;
        viewGroup2.removeAllViews();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listBuilder) {
            if (((SharedAccountMenuViewModel) obj2).f == BusinessAccountMenuItemPosition.ORIGINAL) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            viewGroup2.addView(Wg((SharedAccountMenuViewModel) it2.next()));
        }
        this.a0.setVisibility(arrayList2.isEmpty() ? 8 : 0);
    }

    @Override // defpackage.z500
    public final void T9(wn51 wn51Var) {
        boolean z = wn51Var.a;
        i3y i3yVar = this.p0;
        if (!z && i3yVar.isInitialized()) {
            ((ListItemComponent) i3yVar.getValue()).setVisibility(8);
        }
        if (wn51Var.a) {
            ListItemComponent listItemComponent = (ListItemComponent) i3yVar.getValue();
            listItemComponent.setVisibility(0);
            listItemComponent.setTitle(wn51Var.b);
            String str = wn51Var.c;
            if (str == null || evu0.J(str)) {
                return;
            }
            BadgeView badgeView = new BadgeView(listItemComponent.getContext(), null, 0, 6, null);
            badgeView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            badgeView.setVisibility(0);
            badgeView.setText(str);
            badgeView.setTextColor(listItemComponent.getContext().getColor(mqg0.component_white));
            badgeView.setTintColor(listItemComponent.getContext().getColor(mqg0.component_cinnaban_toxic));
            badgeView.setBackground(vng.t(zzg0.yango_business_badge_bg, listItemComponent.getContext()));
            xw31.F(badgeView, null, null, Integer.valueOf(tje.r(mrg0.go_design_m_space, listItemComponent.getContext())), null);
            xw31.N(tje.u(2, listItemComponent.getContext()), badgeView);
            listItemComponent.setTrailView(badgeView);
        }
    }

    @Override // defpackage.z500
    public final void Tc() {
        View findViewById = this.F.findViewById(oeh0.ultima_card_stub);
        if (findViewById == null) {
            return;
        }
        kn10 kn10Var = (kn10) this.C.a.get();
        kn10Var.getClass();
        Context context = kn10Var.a;
        q5z.h(context);
        com.yandex.go.ultima_mode.action.a aVar = kn10Var.g;
        q5z.h(aVar);
        pwy0 pwy0Var = kn10Var.d;
        q5z.h(pwy0Var);
        xdf xdfVar = kn10Var.b;
        q5z.h(xdfVar);
        ru.yandex.taxi.widget.utils.e eVar = kn10Var.c;
        q5z.h(eVar);
        yu11 yu11Var = kn10Var.e;
        q5z.h(yu11Var);
        com.yandex.go.ultima_mode.menu.state.a aVar2 = new com.yandex.go.ultima_mode.menu.state.a(new com.yandex.go.ultima_mode.ui.header.state.a(xdfVar, eVar, yu11Var), new com.yandex.go.ultima_mode.ui.progress_bar.state.a(xdfVar, eVar));
        tv11 tv11Var = kn10Var.h;
        q5z.h(tv11Var);
        pho phoVar = kn10Var.f;
        q5z.h(phoVar);
        c.w(findViewById, new MenuUltimaModeView(context, new vn10(aVar, pwy0Var, aVar2, tv11Var, new o7r0(phoVar))));
    }

    public final i3y Ug(int i) {
        return Vg(i, new c90(20));
    }

    @Override // defpackage.z500
    public final void Vb() {
        ((CompositePaymentIconsView) this.h0.getValue()).setVisibility(8);
    }

    public final i3y Vg(int i, Consumer consumer) {
        return a.a(new p61(this, i, consumer, 7));
    }

    @Override // defpackage.z500
    public final void Wf(pot0 pot0Var) {
        boolean z = pot0Var.a;
        i3y i3yVar = this.e0;
        if (!z) {
            if (i3yVar.isInitialized()) {
                ((ListItemComponent) i3yVar.getValue()).setVisibility(8);
            }
        } else {
            ListItemComponent listItemComponent = (ListItemComponent) i3yVar.getValue();
            listItemComponent.setTitle(pot0Var.b);
            listItemComponent.setSubtitle(pot0Var.c);
            listItemComponent.setDebounceClickListener(new p500(1, this, pot0Var));
            listItemComponent.setVisibility(0);
        }
    }

    public final ListItemComponent Wg(SharedAccountMenuViewModel sharedAccountMenuViewModel) {
        ViewGroup viewGroup = this.Z;
        int i = 0;
        ListItemComponent listItemComponent = (ListItemComponent) LayoutInflater.from(viewGroup.getContext()).inflate(rqh0.menu_shared_account, viewGroup, false);
        listItemComponent.setTitle(sharedAccountMenuViewModel.a);
        listItemComponent.setSubtitle(sharedAccountMenuViewModel.b);
        listItemComponent.setSubtitleTextColor(sharedAccountMenuViewModel.c ? new gdc(mqg0.component_red_normal) : new bdc(xng0.textMinor));
        listItemComponent.setDebounceClickListener(sharedAccountMenuViewModel.e);
        String str = sharedAccountMenuViewModel.g;
        if (str == null || str.length() == 0) {
            fh(sharedAccountMenuViewModel, listItemComponent);
            return listItemComponent;
        }
        uk10 uk10Var = this.D;
        uk10Var.getClass();
        View inflateTrailView = listItemComponent.inflateTrailView(rqh0.create_business_account_menu_icon);
        mj10 mj10Var = (mj10) uk10Var.a;
        lj10 lj10Var = new lj10(27);
        int r = tje.r(mrg0.go_design_s_space, listItemComponent.getContext());
        View b = ((nj10) mj10Var).b(lj10Var);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(r, r);
        layoutParams.gravity = 8388613;
        b.setLayoutParams(layoutParams);
        ((FrameLayout) inflateTrailView).addView(b);
        b.setBackground(vng.t(zzg0.business_account_menu_badge, listItemComponent.getContext()));
        b.setVisibility(8);
        b.setId(oeh0.business_account_icon_badge);
        int i2 = oeh0.business_account_icon_badge;
        WeakHashMap weakHashMap = b.a;
        View view = (View) rp31.d(inflateTrailView, i2);
        ImageView imageView = (ImageView) ((View) rp31.d(inflateTrailView, oeh0.business_account_icon));
        SharedAccountMenuViewModel.BadgeType badgeType = sharedAccountMenuViewModel.d;
        nac nacVar = (nac) this.y.a(imageView);
        nacVar.i = new b700(i, listItemComponent, this, sharedAccountMenuViewModel);
        nacVar.h = new ynn(23, imageView, view, badgeType);
        nacVar.c(((m7x0) this.z).a(str));
        return listItemComponent;
    }

    @Override // defpackage.z500
    public final void X5() {
        i3y i3yVar = this.j0;
        ((ListItemComponent) i3yVar.getValue()).setVisibility(8);
        ((ListItemComponent) i3yVar.getValue()).setDebounceClickListener(null);
    }

    @Override // defpackage.z500
    public final void X8(i000 i000Var) {
        ListItemComponent listItemComponent = (ListItemComponent) this.g0.getValue();
        listItemComponent.setTitle(i000Var.a.a);
        i000.a aVar = i000Var.a;
        listItemComponent.setSubtitle(aVar.c);
        listItemComponent.setTrailCompanionText(aVar.b);
        listItemComponent.setVisibility(0);
        listItemComponent.setTag(aVar.d);
    }

    @Override // defpackage.z500
    public final void X9(f921 f921Var) {
        ListItemComponent listItemComponent = (ListItemComponent) this.L.getValue();
        listItemComponent.setVisibility(f921Var.a ? 0 : 8);
        listItemComponent.setTitle(f921Var.b);
        listItemComponent.setSubtitle(f921Var.c);
    }

    public final void Xg() {
        this.t0 = false;
    }

    public final void Yg() {
        this.t0 = true;
    }

    @Override // defpackage.z500
    public final void Z4(int i) {
        ((ListItemComponent) this.S.getValue()).setTrailImage(i);
    }

    public final void Zg() {
        ((d2x0) this.A).b(qoi0.a(i700.class));
        f fVar = this.r0;
        if (fVar != null) {
            fVar.N.f.l(NativeMenuState.CLOSED);
        }
    }

    public final void ah() {
        dh();
        UserInfoView userInfoView = (UserInfoView) this.J.getValue();
        if (userInfoView.getVisibility() == 0) {
            userInfoView.performAccessibilityAction(64, null);
            userInfoView.post(new fbz(12, userInfoView));
            return;
        }
        View view = (View) this.Q.getValue();
        if (view.getVisibility() == 0) {
            view.performAccessibilityAction(64, null);
            view.post(new ce0(view, 16));
        }
    }

    @Override // defpackage.z500
    public final void b1(m1a0 m1a0Var) {
        i3y i3yVar = this.h0;
        ((CompositePaymentIconsView) i3yVar.getValue()).setVisibility(0);
        CompositePaymentIconsView.update$default((CompositePaymentIconsView) i3yVar.getValue(), m1a0Var, (z0a0) this.x.get(), true, null, 8, null);
    }

    @Override // defpackage.z500
    public final void bg(boolean z) {
        ((View) this.O.getValue()).setVisibility(z ? 0 : 8);
    }

    public final void bh(tls tlsVar) {
        f fVar;
        if (this.s0 || this.t0 || (fVar = this.r0) == null) {
            return;
        }
        this.s0 = true;
        tlsVar.invoke(fVar);
    }

    @Override // defpackage.z500
    public final void cb(int i) {
        ((ListItemComponent) this.S.getValue()).setTitle(i);
    }

    @Override // defpackage.z500
    public final void ce() {
        Object obj;
        PushDisabledMenuItem pushDisabledMenuItem = this.l0;
        ArrayList arrayList = this.u0.a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((e3f0) obj).a, pushDisabledMenuItem)) {
                    break;
                }
            }
        }
        e3f0 e3f0Var = (e3f0) obj;
        if (e3f0Var != null) {
            arrayList.remove(e3f0Var);
        }
        eh();
    }

    public final void ch() {
        String str;
        z500 z500Var;
        dh();
        f fVar = this.r0;
        if (fVar != null) {
            m500 m500Var = fVar.A;
            k kVar = fVar.N;
            kVar.a();
            kVar.f.l(NativeMenuState.OPENED);
            WeakReference weakReference = fVar.g0;
            if (weakReference != null && (z500Var = (z500) weakReference.get()) != null) {
                fVar.Ng(z500Var);
            }
            String str2 = kVar.h;
            boolean z = str2 == null || str2.length() == 0;
            m500Var.getClass();
            jj10 jj10Var = m500Var.d;
            m500Var.a("view.menu", new Pair("mode", z ? "short" : "full"));
            z500 z500Var2 = (z500) fVar.Dg();
            if (z500Var2.u4()) {
                jj10Var.getClass();
                jj10Var.a.a("Menu.MultiTransportShown", new HashMap(), 1, new HashMap());
            }
            if (z500Var2.Aa() && (str = fVar.f0) != null) {
                jj10Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("payment_type", str);
                jj10Var.a.a("Menu.AddPaymentButton.Shown", hashMap, 1, new HashMap());
            }
            if (z500Var2.I3()) {
                o7r0 o7r0Var = fVar.G.a;
                o7r0Var.getClass();
                o7r0Var.a.a("UltimaMode.MenuCard.Shown", new HashMap(), 1, new HashMap());
            }
            ((com.yandex.go.payments.shared.a) fVar.a0.get()).c.a.set(false);
            z500 z500Var3 = (z500) fVar.Dg();
            if (fVar.Eg()) {
                z500Var3.Z4(zzg0.ic_gift);
                z500Var3.cb(kyh0.promocode_discounts);
                z500Var3.of(kyh0.promocode_hint);
            }
        }
        this.G.scrollTo(0, 0);
        this.s0 = false;
        PushDisabledMenuItem pushDisabledMenuItem = this.l0;
        if (pushDisabledMenuItem != null) {
            pushDisabledMenuItem.onMenuOpened();
        }
        View view = this.F;
        view.announceForAccessibility(view.getContext().getString(kyh0.settings_hamburger_description));
        ((d2x0) this.A).e(2, qoi0.a(i700.class));
    }

    @Override // defpackage.z500
    public final void dc(egv egvVar) {
        UserInfoView userInfoView = (UserInfoView) this.J.getValue();
        if (egvVar instanceof bgv) {
            userInfoView.setCircleLoadingImage(((bgv) egvVar).a);
            userInfoView.setLeadContainerClickListener(new d700(this, 10));
        } else {
            userInfoView.setImage(egvVar.b());
            userInfoView.setLeadContainerClickListener(new d700(this, 13));
        }
    }

    public final void dh() {
        i3y i3yVar = this.m0;
        if (!i3yVar.isInitialized()) {
            i3yVar.getValue();
        }
        i3y i3yVar2 = this.n0;
        if (!i3yVar2.isInitialized()) {
            i3yVar2.getValue();
        }
        i3y i3yVar3 = this.o0;
        if (i3yVar3.isInitialized()) {
            return;
        }
        i3yVar3.getValue();
    }

    @Override // defpackage.z500
    public final void eg(kr6 kr6Var) {
        ListItemComponent listItemComponent = (ListItemComponent) this.V.getValue();
        if (kr6Var instanceof ir6) {
            listItemComponent.setVisibility(8);
        } else {
            listItemComponent.setVisibility(0);
            listItemComponent.setDebounceClickListener(new d700(this, 16));
        }
    }

    public final void eh() {
        f3f0 f3f0Var = this.u0;
        if (f3f0Var.a.isEmpty()) {
            PushDisabledMenuItem pushDisabledMenuItem = this.l0;
            if (pushDisabledMenuItem != null) {
                pushDisabledMenuItem.setVisibility(8);
                return;
            }
            return;
        }
        ListItemComponent listItemComponent = (ListItemComponent) ((e3f0) kotlin.collections.a.P(f3f0Var.a)).a;
        PushDisabledMenuItem pushDisabledMenuItem2 = this.l0;
        if (listItemComponent != pushDisabledMenuItem2 || pushDisabledMenuItem2 == null) {
            return;
        }
        pushDisabledMenuItem2.setVisibility(0);
    }

    public final void fh(SharedAccountMenuViewModel sharedAccountMenuViewModel, ListItemComponent listItemComponent) {
        int i = h700.c[sharedAccountMenuViewModel.d.ordinal()];
        uk10 uk10Var = this.D;
        if (i == 1) {
            uk10Var.getClass();
            uk10Var.f(listItemComponent, new lj10(59));
        } else {
            if (i != 2) {
                return;
            }
            uk10Var.getClass();
            uk10Var.f(listItemComponent, new lj10(55));
        }
    }

    @Override // defpackage.z500
    public final void he() {
        i3y i3yVar = this.g0;
        if (i3yVar.isInitialized()) {
            ((View) i3yVar.getValue()).setVisibility(8);
        }
    }

    @Override // defpackage.z500
    public final void k1() {
        ((ListItemComponent) this.N.getValue()).setVisibility(8);
    }

    @Override // defpackage.z500
    public final void kg(v80 v80Var) {
        ListItemComponent listItemComponent = (ListItemComponent) this.R.getValue();
        listItemComponent.setTitleColorAttr(xng0.textOnControl);
        listItemComponent.setBackgroundAttr(xng0.controlMain);
        listItemComponent.setVisibility(v80Var.a ? 0 : 8);
        listItemComponent.setTitle(v80Var.c);
        AddButtonType addButtonType = v80Var.b;
        AddButtonType addButtonType2 = AddButtonType.CARD;
        View view = this.F;
        if (addButtonType == addButtonType2) {
            c.t(view, oeh0.add_payment_method_button, new d700(this, 1));
        } else if (addButtonType == AddButtonType.SBP_TOKEN) {
            c.t(view, oeh0.add_payment_method_button, new d700(this, 3));
        }
    }

    @Override // defpackage.z500
    public final void l6(PaymentMenuItemAppearance paymentMenuItemAppearance) {
        ListItemComponent listItemComponent = (ListItemComponent) this.P.getValue();
        int i = h700.b[paymentMenuItemAppearance.ordinal()];
        if (i == 1) {
            listItemComponent.setVisibility(8);
            return;
        }
        if (i == 2) {
            listItemComponent.setVisibility(0);
            listItemComponent.setTitleTextColor(new bdc(xng0.textMain));
        } else if (i != 3) {
            w511.b();
        } else {
            listItemComponent.setVisibility(0);
            listItemComponent.setTitleTextColor(new bdc(xng0.textMinor));
        }
    }

    @Override // defpackage.z500
    public final void m5(yju yjuVar) {
        ListItemComponent listItemComponent = (ListItemComponent) this.N.getValue();
        listItemComponent.setTitle(yjuVar.c);
        String str = yjuVar.m;
        Object obj = null;
        if (evu0.J(str)) {
            listItemComponent.setTrailImage((Bitmap) null);
        } else {
            nac nacVar = (nac) this.y.a(listItemComponent.getTrailImageView());
            aev aevVar = nacVar.f;
            uh uhVar = lev.a;
            aevVar.getClass();
            aevVar.m = new gau(11, obj);
            nacVar.f = aevVar;
            nacVar.c(((m7x0) this.z).a(str));
        }
        listItemComponent.setVisibility(0);
    }

    @Override // defpackage.z500
    public final void ne(final tap tapVar) {
        ListItemComponent listItemComponent = (ListItemComponent) this.U.getValue();
        if (!tapVar.a) {
            listItemComponent.setVisibility(8);
            return;
        }
        listItemComponent.setTitle(tapVar.b);
        listItemComponent.setSubtitle(tapVar.c);
        final int i = 0;
        listItemComponent.setDebounceClickListener(new Runnable(this) { // from class: a700
            public final /* synthetic */ i700 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                tap tapVar2 = tapVar;
                i700 i700Var = this.b;
                switch (i2) {
                    case 0:
                        f fVar = i700Var.r0;
                        if (fVar != null) {
                            fVar.Kg(tapVar2.i);
                            break;
                        }
                        break;
                    default:
                        f fVar2 = i700Var.r0;
                        if (fVar2 != null) {
                            fVar2.Kg(tapVar2.f);
                            break;
                        }
                        break;
                }
            }
        });
        if (tapVar.d) {
            ButtonComponent buttonComponent = new ButtonComponent(listItemComponent.getContext(), null, 0, 6, null);
            buttonComponent.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            buttonComponent.setText(tapVar.e);
            buttonComponent.setTextSize(0, tje.r(mrg0.component_text_size_caption, listItemComponent.getContext()));
            buttonComponent.setButtonTitleColor(tapVar.g);
            buttonComponent.setButtonBackground(tapVar.h);
            buttonComponent.setRoundedCornersRadius(tje.u(10, listItemComponent.getContext()));
            buttonComponent.setButtonSize(0);
            final int i2 = 1;
            buttonComponent.setDebounceClickListener(new Runnable(this) { // from class: a700
                public final /* synthetic */ i700 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    tap tapVar2 = tapVar;
                    i700 i700Var = this.b;
                    switch (i22) {
                        case 0:
                            f fVar = i700Var.r0;
                            if (fVar != null) {
                                fVar.Kg(tapVar2.i);
                                break;
                            }
                            break;
                        default:
                            f fVar2 = i700Var.r0;
                            if (fVar2 != null) {
                                fVar2.Kg(tapVar2.f);
                                break;
                            }
                            break;
                    }
                }
            });
            listItemComponent.setTrailView(buttonComponent);
        } else {
            listItemComponent.clearTrailView();
        }
        listItemComponent.setVisibility(0);
    }

    @Override // defpackage.z500
    public final void of(int i) {
        ((ListItemComponent) this.S.getValue()).setSubtitle(i);
    }

    @Override // defpackage.z500
    public final void pd(int i) {
        ((ListItemComponent) this.P.getValue()).setTitle(i);
    }

    @Override // defpackage.z500
    public final void qf(boolean z) {
        ((ListItemComponent) this.S.getValue()).setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.z500
    public final void r3(boolean z) {
        ((View) this.T.getValue()).setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.z500
    public final void rd(boolean z) {
        h3y h3yVar = this.w;
        if (!z) {
            ListItemComponent listItemComponent = ((fky) h3yVar.get()).b;
            if (listItemComponent != null) {
                xw31.a(listItemComponent);
                return;
            }
            return;
        }
        final fky fkyVar = (fky) h3yVar.get();
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext = Events$Zalogin$LinkageContext.MENU;
        if (fkyVar.b != null) {
            return;
        }
        hky hkyVar = (hky) fkyVar.a;
        hkyVar.getClass();
        ViewGroup viewGroup = this.M;
        ListItemComponent listItemComponent2 = (ListItemComponent) LayoutInflater.from(viewGroup.getContext()).inflate(yoh0.link_accounts_view, viewGroup, false);
        listItemComponent2.addOnAttachStateChangeListener(new LinkAccountsViewFactoryImpl$createLinkAccountsView$1(listItemComponent2, hkyVar, events$Zalogin$LinkageContext));
        listItemComponent2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.zalogin.LinkAccountsViewController$showLinkAccountsView$1$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                fky.this.b = null;
            }
        });
        viewGroup.addView(listItemComponent2, 0);
        fkyVar.b = listItemComponent2;
    }

    @Override // defpackage.z500
    public final void tc(toa1 toa1Var) {
        boolean z = toa1Var instanceof c41;
        i3y i3yVar = this.i0;
        if (z) {
            ListItemComponent listItemComponent = (ListItemComponent) i3yVar.getValue();
            listItemComponent.setSubtitle(((c41) toa1Var).a);
            listItemComponent.setVisibility(0);
        } else if (i3yVar.isInitialized() && (toa1Var instanceof b41)) {
            ((View) i3yVar.getValue()).setVisibility(8);
        }
    }

    @Override // defpackage.z500
    public final boolean u4() {
        i3y i3yVar = this.g0;
        return i3yVar.isInitialized() && ((View) i3yVar.getValue()).getVisibility() == 0;
    }

    @Override // defpackage.z500
    public final void vb(String str) {
        ListItemComponent listItemComponent = (ListItemComponent) this.d0.getValue();
        if (str == null || evu0.J(str)) {
            listItemComponent.setVisibility(8);
        } else {
            listItemComponent.setVisibility(0);
            listItemComponent.setTitle(str);
        }
    }

    @Override // defpackage.z500
    public final void w3(String str) {
        String v = str != null ? cvu0.v(str, "unknown", this.F.getResources().getString(kyh0.card_info_title), false) : null;
        ListItemComponent listItemComponent = (ListItemComponent) this.P.getValue();
        if (v == null || evu0.J(v)) {
            listItemComponent.setSubtitle((CharSequence) null);
        } else {
            listItemComponent.setSubtitle(v);
        }
    }

    @Override // defpackage.z500
    public final void y4() {
        ((ListItemComponent) this.k0.getValue()).setVisibility(8);
    }

    @Override // defpackage.z500
    public final void zg(p1s p1sVar) {
        ListItemComponent listItemComponent = (ListItemComponent) ((ViewGroup) this.K.getValue()).findViewById(oeh0.phonish_upgrade);
        if (listItemComponent == null) {
            return;
        }
        if (p1sVar instanceof n1s) {
            listItemComponent.setVisibility(8);
            return;
        }
        if (p1sVar instanceof o1s) {
            listItemComponent.setVisibility(0);
            o1s o1sVar = (o1s) p1sVar;
            listItemComponent.setTitle(o1sVar.a);
            listItemComponent.setSubtitle(o1sVar.b);
            if (qje.s(aog0.showForcePhonishUpgradeAccountMenuItemDivider, this.F.getContext())) {
                listItemComponent.setDividers(DividerPosition.TOP, DividerType.MARGIN);
                listItemComponent.setDividersAlpha(0.4f);
            }
        }
    }
}
