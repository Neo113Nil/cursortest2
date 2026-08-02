package xsna;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.source.i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.hints.HintId;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.profile.core.onboarding.model.ContentHintOnboardingResource;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.edit.UserEditProfileModalBottomSheet;
import com.vk.profile.user.impl.ui.f;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$UserDetailInfoEvent;
import com.vk.stat.scheme.SchemeStat$TypeDialogItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b080;
import xsna.c5v0;
import xsna.dw20;
import xsna.gzf;
import xsna.h7u0;
import xsna.ios;
import xsna.jq10;
import xsna.kwb0;
import xsna.nyd0;
import xsna.tlo0;
import xsna.tzp0;
import xsna.v2s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class rfw implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rfw(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v120, types: [T, com.vk.core.view.components.context.menu.VkContextMenu] */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, com.vk.core.view.components.context.menu.VkContextMenu] */
    /* JADX WARN: Type inference failed for: r0v31, types: [T, com.vk.core.view.components.context.menu.VkContextMenu] */
    /* JADX WARN: Type inference failed for: r0v35, types: [T, com.vk.core.view.components.context.menu.VkContextMenu] */
    /* JADX WARN: Type inference failed for: r0v66, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r0v72, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r13v10, types: [T, xsna.nri0] */
    /* JADX WARN: Type inference failed for: r2v25, types: [T, xsna.dw20] */
    @Override // java.lang.Runnable
    public final void run() {
        Pair pair;
        String string;
        Window window;
        MediaCodec mediaCodec;
        MediaFormat a;
        c5v0.a.C2643a c2643a = null;
        int i = 1;
        switch (this.b) {
            case 0:
                androidx.media3.transformer.v.this.a((Bitmap) this.d, (androidx.media3.common.a) this.e);
                return;
            case 1:
                ((androidx.media3.exoplayer.g) this.c).c.w(((ImmutableList.a) this.d).g(), (i.b) this.e);
                return;
            case 2:
                nx50 nx50Var = (nx50) this.c;
                FragmentEntry fragmentEntry = (FragmentEntry) this.d;
                Intent intent = (Intent) this.e;
                nx50Var.Z();
                if (nx50Var.v0().b() && nx50Var.N) {
                    nx50Var.N = false;
                    FragmentImpl w0 = nx50Var.w0();
                    nx50Var.X0(w0);
                    nx50Var.b1(w0);
                }
                com.vk.core.fragments.a y0 = nx50Var.y0();
                if (szf0.class.isAssignableFrom(fragmentEntry.b)) {
                    y0.a(fragmentEntry, intent != null ? intent.getBooleanExtra("key_clear_top", false) : false, new or50(fragmentEntry, i), new gb(22, nx50Var, intent));
                } else {
                    y0.q(fragmentEntry);
                }
                fcn z = nx50Var.z();
                if (z != null && z.v6() && z.N8()) {
                    z.dismiss();
                    return;
                }
                return;
            case 3:
                f.c cVar = (f.c) this.c;
                UserProfileDialogs userProfileDialogs = (UserProfileDialogs) this.d;
                FragmentActivity fragmentActivity = (FragmentActivity) this.e;
                int i2 = 4;
                if (cVar instanceof f.c.s) {
                    f.c.s sVar = (f.c.s) cVar;
                    userProfileDialogs.getClass();
                    View view = sVar.b.get();
                    if (view == null) {
                        return;
                    }
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    int i3 = 5;
                    ArrayList b = UserProfileDialogs.b(sVar.a, fragmentActivity, new ed5(ref$ObjectRef, ref$ObjectRef2, userProfileDialogs, i3));
                    int l = krv0.l(R.attr.vk_ui_icon_accent);
                    view.getContext();
                    e.b bVar = new e.b(view, null, null, l, 6);
                    bVar.w = R.layout.ds_internal_context_menu_item;
                    bVar.h(b);
                    bVar.m = cn70.b(4);
                    ?? l2 = bVar.l(true);
                    l2.e(new i6m0(ref$ObjectRef, i3));
                    ref$ObjectRef2.element = l2;
                    return;
                }
                int i4 = 2;
                if (epx.f(cVar, f.c.d.a)) {
                    userProfileDialogs.getClass();
                    h7u0.a aVar = new h7u0.a(fragmentActivity);
                    aVar.g0(R.string.confirm);
                    aVar.U(R.string.delete_photo_confirm);
                    aVar.c0(R.string.yes, new nr1(userProfileDialogs, i4));
                    aVar.W(R.string.no, null);
                    aVar.m();
                    return;
                }
                if (cVar instanceof f.c.h) {
                    hos hosVar = ((f.c.h) cVar).a;
                    userProfileDialogs.getClass();
                    ios iosVar = hosVar.b;
                    ExtendedUserProfile extendedUserProfile = hosVar.a;
                    if (iosVar instanceof ios.d.a.C3068a) {
                        ios.d.a.C3068a c3068a = (ios.d.a.C3068a) iosVar;
                        UserProfile userProfile = extendedUserProfile.a;
                        View inflate = View.inflate(fragmentActivity, R.layout.user_profile_add_to_friend_alert, null);
                        ((TextView) inflate.findViewById(R.id.add_friend_text)).setText(fragmentActivity.getString(userProfile.K().booleanValue() ? c3068a.b : c3068a.a, userProfile.d + "  " + userProfile.f));
                        h7u0.a aVar2 = new h7u0.a(fragmentActivity);
                        aVar2.f = inflate;
                        aVar2.W(R.string.cancel, null);
                        aVar2.g0(R.string.user_profile_closed_add_friend);
                        aVar2.c0(R.string.vk_ok, new ls1(userProfileDialogs, i4));
                        androidx.appcompat.app.d m = aVar2.m();
                        if (m == null || (window = m.getWindow()) == null) {
                            return;
                        }
                        window.setSoftInputMode(3);
                        return;
                    }
                    if (iosVar instanceof ios.d.b) {
                        ios.d.b bVar2 = (ios.d.b) iosVar;
                        UserProfile userProfile2 = extendedUserProfile.a;
                        h7u0.a aVar3 = new h7u0.a(fragmentActivity);
                        AlertController.b bVar3 = aVar3.a;
                        aVar3.g0(R.string.error);
                        if (epx.f(bVar2, ios.d.b.a.c)) {
                            bVar3.f = fragmentActivity.getString(userProfile2.K().booleanValue() ? bVar2.a() : bVar2.b(), userProfile2.s.getString("first_name_acc") + ' ' + userProfile2.s.getString("last_name_acc"));
                            aVar3.c0(R.string.user_profile_unblock_and_continue, new ts8(userProfileDialogs, i2));
                            aVar3.W(R.string.cancel, null);
                            aVar3.m();
                            return;
                        }
                        if (!epx.f(bVar2, ios.d.b.C3069b.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar3.f = fragmentActivity.getString(userProfile2.K().booleanValue() ? bVar2.a() : bVar2.b(), extendedUserProfile.d + ' ' + extendedUserProfile.g);
                        aVar3.c0(R.string.vk_ok, null);
                        aVar3.m();
                        return;
                    }
                    if (epx.f(iosVar, ios.a.a)) {
                        int i5 = h7u0.p;
                        h7u0.a b2 = h7u0.b.b(fragmentActivity);
                        b2.g0(R.string.error);
                        b2.U(R.string.access_error);
                        b2.c0(R.string.vk_ok, null);
                        b2.m();
                        return;
                    }
                    if (iosVar instanceof ios.b) {
                        int i6 = h7u0.p;
                        h7u0.a b3 = h7u0.b.b(fragmentActivity);
                        b3.g0(R.string.error);
                        b3.a.f = ((ios.b) iosVar).a.getLocalizedMessage();
                        b3.c0(R.string.vk_ok, null);
                        b3.m();
                        return;
                    }
                    if (!epx.f(iosVar, ios.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h7u0.a aVar4 = new h7u0.a(fragmentActivity);
                    aVar4.g0(R.string.user_profile_delete_friend);
                    aVar4.a.f = fragmentActivity.getString(R.string.user_profile_delete_friend_confirm, extendedUserProfile.h + ' ' + extendedUserProfile.i);
                    aVar4.c0(R.string.yes, new cxa(userProfileDialogs, i));
                    aVar4.W(R.string.no, null);
                    aVar4.m();
                    return;
                }
                int i7 = 10;
                if (cVar instanceof f.c.a) {
                    hwb0 hwb0Var = ((f.c.a) cVar).a;
                    userProfileDialogs.getClass();
                    View view2 = hwb0Var.b.get();
                    if (view2 == null) {
                        return;
                    }
                    ExtendedUserProfile extendedUserProfile2 = hwb0Var.a;
                    int c = dhr0.t.c(R.attr.vk_ui_icon_accent);
                    view2.getContext();
                    e.b bVar4 = new e.b(view2, null, null, c, 6);
                    bVar4.w = R.layout.ds_internal_context_menu_item;
                    ArrayList<kwb0> arrayList = hwb0Var.c;
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    for (kwb0 kwb0Var : arrayList) {
                        if (kwb0Var instanceof kwb0.a.d) {
                            string = fragmentActivity.getString(R.string.user_profile_hide_user_news, extendedUserProfile2.b);
                        } else if (kwb0Var instanceof kwb0.a.e) {
                            string = fragmentActivity.getString(R.string.user_profile_show_user_news, extendedUserProfile2.b);
                        } else if (kwb0Var instanceof kwb0.a.g) {
                            string = fragmentActivity.getString(R.string.user_profile_delete_friend);
                        } else if (kwb0Var instanceof kwb0.a.b) {
                            string = fragmentActivity.getString(R.string.user_profile_friend_cancel);
                        } else if (kwb0Var instanceof kwb0.a.f) {
                            string = fragmentActivity.getString(R.string.user_profile_unfollow);
                        } else if (kwb0Var instanceof kwb0.a.C3211a) {
                            string = fragmentActivity.getString(R.string.user_profile_add_to_friends);
                        } else {
                            if (!(kwb0Var instanceof kwb0.a.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            string = fragmentActivity.getString(R.string.user_profile_friends_hide);
                        }
                        arrayList2.add(new VkContextMenu.a(string, null, null, false, false, kwb0Var.a, 30));
                    }
                    bVar4.h(arrayList2);
                    bVar4.a().j(true);
                    return;
                }
                if (cVar instanceof f.c.j) {
                    f.c.j jVar = (f.c.j) cVar;
                    userProfileDialogs.e.R0(fragmentActivity, jVar.a, jVar.b);
                    return;
                }
                int i8 = 7;
                if (cVar instanceof f.c.b) {
                    userProfileDialogs.getClass();
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                    final xp0 xp0Var = new xp0(new fd5(ref$ObjectRef3, ref$ObjectRef4, userProfileDialogs, i7), new xwl(userProfileDialogs, ref$ObjectRef3, ref$ObjectRef4, i2), new tfm0(fragmentActivity, i8));
                    UserProfileDialogs.a aVar5 = new UserProfileDialogs.a() { // from class: xsna.ooq0
                        @Override // com.vk.profile.user.impl.UserProfileDialogs.a
                        public final void a() {
                            Iterator it = xp0.this.h.iterator();
                            while (it.hasNext()) {
                                ((yp0) it.next()).q6();
                            }
                        }
                    };
                    userProfileDialogs.i.add(aVar5);
                    RecyclerView recyclerView = new RecyclerView(fragmentActivity);
                    recyclerView.setId(R.id.recycler);
                    recyclerView.setLayoutManager(new LinearLayoutManager());
                    bwt0.f0(recyclerView, 0, 0, 0, cn70.b(16), 7);
                    recyclerView.setAdapter(xp0Var);
                    recyclerView.setNestedScrollingEnabled(false);
                    gpu0 gpu0Var = new gpu0(fragmentActivity);
                    gpu0Var.j = new roq0(xp0Var);
                    recyclerView.addItemDecoration(gpu0Var);
                    xp0Var.setItems(((f.c.b) cVar).a);
                    ref$ObjectRef3.element = ((dw20.b) new dw20.b(fragmentActivity, tzp0.a(null, 3)).v0(R.string.user_profile_action_additonal_title).m(R.attr.vk_ui_background_content).D0(recyclerView, false)).c(new d5j(recyclerView)).q0(true).a0(new z8o0(userProfileDialogs, fragmentActivity, UserProfileDialogs.a(fragmentActivity, new akd0(ref$ObjectRef3, 15)), aVar5, ref$ObjectRef4, 2)).I0(null);
                    return;
                }
                int i9 = 8;
                if (cVar instanceof f.c.e) {
                    f.c.e eVar = (f.c.e) cVar;
                    nyd0.o(nyd0.this, new nyd0.f(null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsProfileStat$UserDetailInfoEvent(MobileOfficialAppsProfileStat$UserDetailInfoEvent.UserDetailInfoEventType.CLICK_TO_MORE), null, 3071));
                    Ref$ObjectRef ref$ObjectRef5 = new Ref$ObjectRef();
                    ref$ObjectRef5.element = userProfileDialogs.d.a(fragmentActivity, eVar.b, eVar.a, new xah(userProfileDialogs, fragmentActivity, UserProfileDialogs.a(fragmentActivity, new hrd(ref$ObjectRef5, i)), i9), new m5o0(ref$ObjectRef5, i2));
                    return;
                }
                if (cVar instanceof f.c.C1718c) {
                    ExtendedUserProfile extendedUserProfile3 = ((f.c.C1718c) cVar).a;
                    userProfileDialogs.getClass();
                    h7u0.a aVar6 = new h7u0.a(fragmentActivity);
                    aVar6.a.f = fragmentActivity.getString(R.string.user_profile_confirm_block_user, extendedUserProfile3.h + ' ' + extendedUserProfile3.i);
                    aVar6.g0(R.string.confirm);
                    aVar6.c0(R.string.yes, new d0p(userProfileDialogs, i4));
                    aVar6.W(R.string.no, null);
                    aVar6.m();
                    return;
                }
                if (cVar instanceof f.c.g) {
                    new UserEditProfileModalBottomSheet.a(fragmentActivity, userProfileDialogs.b, userProfileDialogs.c.a).I0(null);
                    return;
                }
                int i10 = 6;
                if (cVar instanceof f.c.o) {
                    ExtendedUserProfile extendedUserProfile4 = ((f.c.o) cVar).a;
                    userProfileDialogs.getClass();
                    SchemeStat$TypeDialogItem.DialogAction dialogAction = SchemeStat$TypeDialogItem.DialogAction.SHOW;
                    if (userProfileDialogs.g.a(extendedUserProfile4.a.c)) {
                        pair = new Pair(tq.h(tlo0.Companion, R.string.user_profile_esia_verified_title), new tlo0.f(R.string.user_profile_esia_verified_ok));
                    } else {
                        tlo0.a aVar7 = tlo0.Companion;
                        Object[] objArr = {extendedUserProfile4.b};
                        aVar7.getClass();
                        pair = new Pair(tlo0.a.c(R.string.user_profile_esia_verified_someone_subtitle, objArr), new tlo0.f(R.string.user_profile_esia_verified_info));
                    }
                    userProfileDialogs.k = new VkModal(VkModal.Mode.Card, new b.a.C0790b(new c5v0.c.b(new gko(R.drawable.vk_icon_check_circle_outline_56), new x7g(R.attr.vk_ui_icon_secondary), null, 12), new c5v0.b(12, tq.h(tlo0.Companion, R.string.user_profile_esia_verified_title), (tlo0) pair.d()), null, new c5v0.a(new c5v0.a.C2643a((tlo0) pair.g(), new com.vk.movika.sdk.base.ui.s(20, userProfileDialogs, extendedUserProfile4), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), c2643a, i10), 52), null, false, 28).b(fragmentActivity, UserProfileDialogs.m);
                    return;
                }
                if (cVar instanceof f.c.u) {
                    ExtendedUserProfile extendedUserProfile5 = ((f.c.u) cVar).a;
                    userProfileDialogs.getClass();
                    dw20.b bVar5 = new dw20.b(fragmentActivity, new tzp0.c.a(new soq0(), false));
                    cbq.a(bVar5);
                    bVar5.M(R.drawable.vk_icon_check_circle_outline_56, Integer.valueOf(R.attr.vk_ui_icon_accent)).v0(R.string.user_profile_vk_verified_title).h0(R.string.user_profile_vk_verified_info, new oqh0(userProfileDialogs, i9)).r0(userProfileDialogs.g.a(extendedUserProfile5.a.c) ? R.string.user_profile_vk_verified_self_subtitle : R.string.user_profile_vk_verified_someone_subtitle).I0(null);
                    return;
                }
                int i11 = 24;
                if (cVar instanceof f.c.p) {
                    ArrayList arrayList3 = ((f.c.p) cVar).a;
                    userProfileDialogs.getClass();
                    Ref$ObjectRef ref$ObjectRef6 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef7 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef8 = new Ref$ObjectRef();
                    ref$ObjectRef8.element = new nri0(new aa5(ref$ObjectRef8, userProfileDialogs, ref$ObjectRef7, ref$ObjectRef6, 6));
                    View inflate2 = View.inflate(fragmentActivity, R.layout.view_services_dialog, null);
                    RecyclerView recyclerView2 = (RecyclerView) inflate2.findViewById(R.id.recycler);
                    recyclerView2.setLayoutManager(new LinearLayoutManager());
                    recyclerView2.setAdapter((RecyclerView.Adapter) ref$ObjectRef8.element);
                    ((nri0) ref$ObjectRef8.element).setItems(arrayList3);
                    bwt0.f0(recyclerView2, 0, 0, 0, cn70.b(16), 7);
                    ref$ObjectRef6.element = new dw20.b(fragmentActivity, tzp0.a(null, 3)).v0(R.string.user_profile_services_title).m(R.attr.vk_ui_background_content).D0(inflate2, false).A(cn70.b(24)).c(new cpo(false, cn70.b(100), 3)).q0(true).a0(new vd0(userProfileDialogs, fragmentActivity, UserProfileDialogs.a(fragmentActivity, new zkm0(ref$ObjectRef6, i)), ref$ObjectRef7, 2)).I0(null);
                    return;
                }
                if (cVar instanceof f.c.l) {
                    f.c.l lVar = (f.c.l) cVar;
                    userProfileDialogs.getClass();
                    View view3 = lVar.a.get();
                    if (view3 == null) {
                        return;
                    }
                    Ref$ObjectRef ref$ObjectRef9 = new Ref$ObjectRef();
                    ArrayList b4 = UserProfileDialogs.b(lVar.c, fragmentActivity, new dvh0(i8, userProfileDialogs, ref$ObjectRef9));
                    Rect rect = lVar.b;
                    int l3 = krv0.l(R.attr.vk_ui_icon_accent);
                    view3.getContext();
                    e.c cVar2 = new e.c(null, rect, view3, l3, 1);
                    cVar2.m = cn70.b(10);
                    cVar2.h(b4);
                    ref$ObjectRef9.element = cVar2.l(false);
                    return;
                }
                if (cVar instanceof f.c.k) {
                    f.c.k kVar = (f.c.k) cVar;
                    userProfileDialogs.f.j().b();
                    View view4 = kVar.a.get();
                    if (view4 == null) {
                        return;
                    }
                    Ref$ObjectRef ref$ObjectRef10 = new Ref$ObjectRef();
                    ArrayList b5 = UserProfileDialogs.b(kVar.c, fragmentActivity, new noq0(0, userProfileDialogs, ref$ObjectRef10));
                    Rect rect2 = kVar.b;
                    int l4 = krv0.l(R.attr.vk_ui_icon_accent);
                    view4.getContext();
                    e.c cVar3 = new e.c(null, rect2, view4, l4, 1);
                    cVar3.m = cn70.b(10);
                    cVar3.h(b5);
                    ref$ObjectRef10.element = cVar3.l(false);
                    return;
                }
                if (cVar instanceof f.c.t) {
                    f.c.t tVar = (f.c.t) cVar;
                    userProfileDialogs.getClass();
                    ContentHintOnboardingResource contentHintOnboardingResource = tVar.b;
                    String str = tVar.a;
                    HintId hintId = HintId.PROFILE_PHOTO_FLOW_ON_BOARDING_BANNER_PROFILE;
                    boolean f = epx.f(str, hintId.getId());
                    String str2 = tVar.a;
                    new b080.a(fragmentActivity, contentHintOnboardingResource, str, f, epx.f(str2, hintId.getId()), tVar.c, null, new b080.c(new ie90(userProfileDialogs, i11)), 512).I0(str2);
                    return;
                }
                if (cVar instanceof f.c.n) {
                    userProfileDialogs.h.B(new f.e.m1(((f.c.n) cVar).b.a.c));
                    return;
                }
                if (cVar instanceof f.c.C1719f) {
                    f.c.C1719f c1719f = (f.c.C1719f) cVar;
                    userProfileDialogs.getClass();
                    View view5 = c1719f.a.get();
                    if (view5 == null) {
                        return;
                    }
                    Ref$ObjectRef ref$ObjectRef11 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef12 = new Ref$ObjectRef();
                    ArrayList b6 = UserProfileDialogs.b(c1719f.c, fragmentActivity, new w95(ref$ObjectRef11, ref$ObjectRef12, userProfileDialogs, 9));
                    Rect rect3 = c1719f.b;
                    int l5 = krv0.l(R.attr.vk_ui_icon_accent);
                    view5.getContext();
                    e.c cVar4 = new e.c(null, rect3, view5, l5, 1);
                    cVar4.m = cn70.b(6);
                    cVar4.h(b6);
                    ?? l6 = cVar4.l(false);
                    l6.e(new tkq(ref$ObjectRef11, i));
                    ref$ObjectRef12.element = l6;
                    return;
                }
                if (cVar instanceof f.c.m) {
                    return;
                }
                if (cVar instanceof f.c.r) {
                    f.c.r rVar = (f.c.r) cVar;
                    userProfileDialogs.getClass();
                    userProfileDialogs.d(fragmentActivity, rVar.a, rVar.b);
                    return;
                } else if (cVar instanceof f.c.q) {
                    userProfileDialogs.getClass();
                    userProfileDialogs.d(fragmentActivity, fragmentActivity.getString(R.string.user_profile_follow_onboarding_title), fragmentActivity.getString(R.string.user_profile_follow_onboarding_subtitle));
                    return;
                } else {
                    if (!(cVar instanceof f.c.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    userProfileDialogs.getClass();
                    h7u0.a aVar8 = new h7u0.a(fragmentActivity);
                    aVar8.g0(R.string.stories_interesting_block_dialog_confirmation_title);
                    aVar8.U(R.string.stories_interesting_block_dialog_confirmation_subtitle);
                    aVar8.c0(R.string.stories_interesting_block_dialog_confirmation_positive, new gsd(userProfileDialogs, i));
                    aVar8.W(R.string.cancel, null);
                    aVar8.m();
                    return;
                }
            case 4:
                v2s0 v2s0Var = (v2s0) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                CountDownLatch countDownLatch = (CountDownLatch) this.e;
                gzf.c cVar5 = v2s0Var.c.b;
                v2s0.f fVar = v2s0Var.G;
                boolean z2 = v2s0Var.s;
                try {
                    a = gzf.a(cVar5, true);
                    bv10 bv10Var = new bv10();
                    mediaCodec = new jq10(bv10Var, new gq10(bv10Var), new jq10.a(bv10Var), z2).a(null, a, true, null, false);
                } catch (Exception e) {
                    e = e;
                    mediaCodec = 0;
                }
                try {
                    mediaCodec.setCallback(fVar);
                    if (a.containsKey("color-format") && a.getInteger("color-format") == 2130708361) {
                        v2s0Var.D = mediaCodec.createInputSurface();
                    }
                    mediaCodec.start();
                    c2643a = mediaCodec;
                } catch (Exception e2) {
                    e = e2;
                    L.j(e, "failed to start video avc encoder");
                    com.vk.metrics.eventtracking.b.a.a(e);
                    gzf.c(mediaCodec);
                    atomicReference.set(c2643a);
                    countDownLatch.countDown();
                    return;
                }
                atomicReference.set(c2643a);
                countDownLatch.countDown();
                return;
            default:
                com.ironsource.mediationsdk.c.a((AbstractAdapter) this.c, (String) this.d, (List) this.e);
                return;
        }
    }
}
