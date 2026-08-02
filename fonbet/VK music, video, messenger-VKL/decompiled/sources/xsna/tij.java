package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import com.vk.clips.design.view.camera.settings.ModalPrivacySettingsErrorView;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.components.userstack.VkMiniUserStack;
import com.vk.core.view.interop.components.image.InteropPicture;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.posting.FriendsListPrivacyType;
import com.vk.dto.privacy.ListFriends;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.common.posting.listfriends.ListFriendsIconDrawable;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.ayv0;
import xsna.dw20;
import xsna.nfd0;
import xsna.snx;
import xsna.tij;
import xsna.tlo0;
import xsna.tzp0;

/* compiled from: ContentPrivacyBottomSheet.kt */
/* loaded from: classes17.dex */
public abstract class tij extends dw20.b implements w8i {
    public final Context e;
    public final izs<PrivacySetting, s3q0> f;
    public final gzs<s3q0> g;
    public List<ListFriends> h;
    public boolean i;
    public WeakReference<dw20> j;
    public ViewGroup k;
    public View l;
    public ViewGroup m;
    public View n;
    public View o;
    public ModalPrivacySettingsErrorView p;
    public Group q;
    public VkBanner r;
    public final bpn0 s;
    public final sij t;

    /* compiled from: ContentPrivacyBottomSheet.kt */
    public static final class a {
        public final List<UserId> a;
        public final List<Integer> b;
        public final List<UserId> c;
        public final List<Integer> d;
        public final boolean e;
        public final nfd0.b f;

        public /* synthetic */ a(List list, List list2, List list3, List list4) {
            this(list, list2, list3, list4, true, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            int b = qoy.b(fw3.a(fw3.a(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
            nfd0.b bVar = this.f;
            return b + (bVar == null ? 0 : bVar.hashCode());
        }

        public final String toString() {
            return "LoadContentParams(allowedFriendsIds=" + this.a + ", allowedFriendsListIds=" + this.b + ", forbiddenFriendsIds=" + this.c + ", forbiddenFriendsListIds=" + this.d + ", prioritizeAllowed=" + this.e + ", selectPrivacyOption=" + this.f + ')';
        }

        public a(List<UserId> list, List<Integer> list2, List<UserId> list3, List<Integer> list4, boolean z, nfd0.b bVar) {
            this.a = list;
            this.b = list2;
            this.c = list3;
            this.d = list4;
            this.e = z;
            this.f = bVar;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [xsna.sij] */
    public tij(Context context, izs izsVar, ew3 ew3Var, tzp0.c.a aVar) {
        super(context, aVar);
        this.e = context;
        this.f = izsVar;
        this.g = ew3Var;
        this.h = EmptyList.b;
        this.s = new bpn0(new q5f(this, 7));
        this.t = new tb0() { // from class: xsna.sij
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
            @Override // xsna.tb0
            public final void onActivityResult(int i, int i2, Intent intent) {
                ?? r2;
                ?? r22;
                Set S0;
                Set S02;
                if (i2 == -1) {
                    if ((i == 24 || i == 25) && intent != null) {
                        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("chosen_friends_ids");
                        nfd0.b bVar = null;
                        if (stringArrayListExtra == null || (S02 = j5g.S0(stringArrayListExtra)) == null) {
                            r2 = EmptyList.b;
                        } else {
                            r2 = new ArrayList();
                            Iterator it = S02.iterator();
                            while (it.hasNext()) {
                                Long n = arm0.n((String) it.next());
                                UserId userId = n != null ? new UserId(n.longValue()) : null;
                                if (userId != null) {
                                    r2.add(userId);
                                }
                            }
                        }
                        List list = r2;
                        ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("chosen_friends_lists_ids");
                        if (stringArrayListExtra2 == null || (S0 = j5g.S0(stringArrayListExtra2)) == null) {
                            r22 = EmptyList.b;
                        } else {
                            r22 = new ArrayList();
                            Iterator it2 = S0.iterator();
                            while (it2.hasNext()) {
                                Integer m = arm0.m(10, (String) it2.next());
                                if (m != null) {
                                    r22.add(m);
                                }
                            }
                        }
                        List list2 = r22;
                        tij tijVar = tij.this;
                        if (i == 24) {
                            List<ProfileFriendItem> list3 = tijVar.Z0().c;
                            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                            Iterator it3 = list3.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(((ProfileFriendItem) it3.next()).b);
                            }
                            List<ListFriends> list4 = tijVar.Z0().d;
                            ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
                            Iterator it4 = list4.iterator();
                            while (it4.hasNext()) {
                                arrayList2.add(Integer.valueOf(((ListFriends) it4.next()).b));
                            }
                            Iterator it5 = tijVar.Z0().i.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    break;
                                }
                                ?? next = it5.next();
                                if (((nfd0.b) next).a()) {
                                    bVar = next;
                                    break;
                                }
                            }
                            tijVar.f1(new tij.a(arrayList, arrayList2, list, list2, false, bVar));
                            return;
                        }
                        List<ProfileFriendItem> list5 = tijVar.Z0().a;
                        ArrayList arrayList3 = new ArrayList(c5g.u(list5, 10));
                        Iterator it6 = list5.iterator();
                        while (it6.hasNext()) {
                            arrayList3.add(((ProfileFriendItem) it6.next()).b);
                        }
                        List<ListFriends> list6 = tijVar.Z0().b;
                        ArrayList arrayList4 = new ArrayList(c5g.u(list6, 10));
                        Iterator it7 = list6.iterator();
                        while (it7.hasNext()) {
                            arrayList4.add(Integer.valueOf(((ListFriends) it7.next()).b));
                        }
                        Iterator it8 = tijVar.Z0().h.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                break;
                            }
                            ?? next2 = it8.next();
                            if (((nfd0.b) next2).a()) {
                                bVar = next2;
                                break;
                            }
                        }
                        tijVar.f1(new tij.a(list, list2, arrayList3, arrayList4, true, bVar));
                    }
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v6 */
    public static void l1(ViewGroup viewGroup, nfd0.b bVar, List list, List list2) {
        List list3;
        String c;
        ?? r9;
        List H0;
        ModalSettingsPrivacyOption modalSettingsPrivacyOption = (ModalSettingsPrivacyOption) viewGroup.findViewById(R.id.privacy_option);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.privacy_friends_items_stack);
        VkMiniUserStack vkMiniUserStack = (VkMiniUserStack) viewGroup.findViewById(R.id.privacy_counter_stack_images);
        VkButton vkButton = (VkButton) viewGroup.findViewById(R.id.privacy_friends_button);
        vkButton.setTextTint(R.attr.vk_ui_text_secondary);
        vkButton.d5(Integer.valueOf(R.drawable.vk_icon_dropdown_outline_16));
        vkButton.setTrailingIconSize(Integer.valueOf(iah0.a(16)));
        vkButton.setTrailingIconTint(R.attr.vk_ui_icon_tertiary);
        List list4 = list;
        if ((list4 == null || list4.isEmpty()) && ((list3 = list2) == null || list3.isEmpty())) {
            f4m.j(viewGroup2);
            modalSettingsPrivacyOption.setTitle(bVar.d);
            return;
        }
        viewGroup2.setVisibility(0);
        nfd0.c cVar = bVar.e;
        if (cVar instanceof nfd0.c.b) {
            if (list4 == null || list4.isEmpty()) {
                ((nfd0.c.b) cVar).getClass();
                modalSettingsPrivacyOption.setTitle(R.string.privacy_selection_lists);
                c = y8g0.c(R.plurals.privacy_selection_friends_lists_count, list2.size());
            } else {
                List list5 = list2;
                if (list5 == null || list5.isEmpty()) {
                    ((nfd0.c.b) cVar).getClass();
                    modalSettingsPrivacyOption.setTitle(R.string.privacy_selection_friends);
                    c = y8g0.c(R.plurals.privacy_selection_friends_count, list.size());
                } else {
                    ((nfd0.c.b) cVar).getClass();
                    modalSettingsPrivacyOption.setTitle(R.string.privacy_selection_friends_and_lists);
                    c = String.format(y8g0.e(R.string.privacy_selection_friends_count_title), Arrays.copyOf(new Object[]{y8g0.c(R.plurals.privacy_selection_friends_count, list.size()), y8g0.c(R.plurals.privacy_selection_friends_lists_count, list2.size())}, 2));
                }
            }
            vkButton.setText(c);
            int size = list != null ? list.size() : 0;
            int size2 = list2 != null ? list2.size() : 0;
            int min = Math.min(size, 3 - (size2 <= 1 ? size2 : 1));
            int min2 = Math.min(size2, 3 - min);
            if (list == null || (H0 = j5g.H0(list, min)) == null) {
                r9 = EmptyList.b;
            } else {
                r9 = new ArrayList();
                Iterator it = H0.iterator();
                while (it.hasNext()) {
                    String Fb = ((ProfileFriendItem) it.next()).e.Fb();
                    if (Fb != null) {
                        r9.add(Fb);
                    }
                }
            }
            ArrayList arrayList = new ArrayList(min2);
            for (int i = 0; i < min2; i++) {
                arrayList.add(new ListFriendsIconDrawable(min + i, ListFriendsIconDrawable.IconSizes.OVERLAP_MINIATURES, false));
            }
            Iterable iterable = (Iterable) r9;
            ArrayList arrayList2 = new ArrayList(c5g.u(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                itj0.d((String) it2.next(), arrayList2);
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new ayv0.a((ListFriendsIconDrawable) it3.next()));
            }
            vkMiniUserStack.setAvatars(j5g.u0(arrayList3, arrayList2));
        }
    }

    public final void S0(boolean z, nfd0.b bVar) {
        ModalSettingsPrivacyOption modalSettingsPrivacyOption = new ModalSettingsPrivacyOption(this.e, null, 6);
        modalSettingsPrivacyOption.setId(R.id.privacy_option);
        modalSettingsPrivacyOption.setCheckVisible(false);
        modalSettingsPrivacyOption.setTitle(bVar.d);
        modalSettingsPrivacyOption.setTag(bVar.a);
        bwt0.i0(modalSettingsPrivacyOption, new u9(8, this, bVar));
        ViewGroup viewGroup = z ? this.k : this.m;
        if (viewGroup != null) {
            viewGroup.addView(modalSettingsPrivacyOption);
        }
    }

    public final void T0(boolean z, nfd0.b bVar) {
        View inflate = LayoutInflater.from(this.e).inflate(R.layout.item_privacy_option_with_friends, (ViewGroup) null, false);
        ((ModalSettingsPrivacyOption) inflate.findViewById(R.id.privacy_option)).setTitle(bVar.d);
        inflate.setTag(bVar.a);
        bwt0.i0(inflate, new defpackage.h0(11, this, bVar));
        bwt0.i0(inflate.findViewById(R.id.privacy_friends_items_stack), new wd3(8, this, bVar));
        ViewGroup viewGroup = z ? this.k : this.m;
        if (viewGroup != null) {
            viewGroup.addView(inflate);
        }
    }

    public abstract int U0();

    public abstract int V0();

    public abstract int W0();

    public abstract int X0();

    public abstract FriendsListPrivacyType Y0();

    public abstract nfd0 Z0();

    public abstract int a1();

    public void b(boolean z) {
        d1();
    }

    public abstract String b1();

    public abstract int c1();

    public final void d1() {
        dw20 dw20Var;
        WeakReference<dw20> weakReference = this.j;
        if (weakReference == null || (dw20Var = weakReference.get()) == null) {
            return;
        }
        dw20Var.hide();
    }

    public void dismiss() {
        d1();
    }

    public abstract void e1();

    public final void f1(a aVar) {
        dw20 dw20Var;
        io.reactivex.rxjava3.disposables.c subscribe = rsg0.y0(new mrt(o25.a().c(), j5g.u0(aVar.a, aVar.c)), null, null, 3).subscribe(new cp0(new g22(11, this, aVar), 17), new is1(new rmg(this, 6), 17));
        WeakReference<dw20> weakReference = this.j;
        if (weakReference == null || (dw20Var = weakReference.get()) == null) {
            return;
        }
        hg1.a(subscribe, dw20Var);
    }

    public final void h1(nfd0.b bVar) {
        if ((bVar.c instanceof PrivacyRules.Exclude) && !Z0().b()) {
            j1(false);
            return;
        }
        if ((bVar.c instanceof PrivacyRules.Include) && !Z0().a()) {
            j1(true);
            return;
        }
        boolean z = bVar.b;
        if (z) {
            Z0().getClass();
            Z0().e = bVar;
        } else if (!z) {
            Z0().getClass();
            Z0().f = bVar;
        } else if (z) {
            Z0().e = bVar;
            Z0().f = null;
        } else {
            Z0().f = bVar;
            Z0().e = null;
        }
        n1();
    }

    public abstract void i1();

    public final void j1(boolean z) {
        bpn0 bpn0Var = this.s;
        Context context = this.e;
        if (z) {
            FriendsListPrivacyType Y0 = Y0();
            List<ListFriends> list = this.h;
            List<ProfileFriendItem> list2 = Z0().c;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProfileFriendItem) it.next()).b);
            }
            List<ListFriends> list3 = Z0().d;
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((ListFriends) it2.next()).b));
            }
            ((NewsfeedRouter) bpn0Var.getValue()).c0(context, 25, new uls(Y0, list, arrayList, arrayList2));
            return;
        }
        FriendsListPrivacyType Y02 = Y0();
        List<ListFriends> list4 = this.h;
        List<ProfileFriendItem> list5 = Z0().a;
        ArrayList arrayList3 = new ArrayList(c5g.u(list5, 10));
        Iterator<T> it3 = list5.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((ProfileFriendItem) it3.next()).b);
        }
        List<ListFriends> list6 = Z0().b;
        ArrayList arrayList4 = new ArrayList(c5g.u(list6, 10));
        Iterator<T> it4 = list6.iterator();
        while (it4.hasNext()) {
            arrayList4.add(Integer.valueOf(((ListFriends) it4.next()).b));
        }
        ((NewsfeedRouter) bpn0Var.getValue()).c0(context, 24, new uls(Y02, list4, arrayList3, arrayList4));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k1(ViewGroup viewGroup) {
        Object obj;
        tij tijVar;
        VkCell.Middle.d dVar;
        Iterator it;
        Object obj2;
        PrivacySetting.PrivacyRule privacyRule;
        nfd0 Z0 = Z0();
        Object tag = viewGroup.getTag();
        String str = tag instanceof String ? (String) tag : null;
        Iterator it2 = rl3.I(new nfd0.b[]{Z0.e, Z0.f}).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (epx.f(((nfd0.b) obj).a, str)) {
                    break;
                }
            }
        }
        nfd0.b bVar = (nfd0.b) obj;
        ModalSettingsPrivacyOption modalSettingsPrivacyOption = (ModalSettingsPrivacyOption) viewGroup.findViewById(R.id.privacy_option);
        if (modalSettingsPrivacyOption != null) {
            modalSettingsPrivacyOption.setCheckVisible(bVar != null);
        } else if (viewGroup instanceof VkCell) {
            VkCell vkCell = (VkCell) viewGroup;
            vkCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, bVar != null ? new VkCell.Right.ExtraAction.a(6, null, true) : null, (VkCell.Right.b) null, 27));
            nfd0.c cVar = bVar != null ? bVar.e : null;
            if (bVar != null && (cVar instanceof nfd0.c.a)) {
                if (Z0().g == null || epx.f(Z0().g, DonutLevel.f)) {
                    tijVar = this;
                    dVar = null;
                } else {
                    tlo0.a aVar = tlo0.Companion;
                    nfd0.c.a aVar2 = (nfd0.c.a) cVar;
                    boolean z = aVar2.b;
                    String str2 = aVar2.a;
                    if (z) {
                        tijVar = this;
                    } else {
                        tijVar = this;
                        str2 = tijVar.c.getString(R.string.video_donut_level_subtitle_with_higher_format, str2);
                    }
                    dVar = new VkCell.Middle.d(oq.d(aVar, str2), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62);
                }
                vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(tq.h(tlo0.Companion, bVar.d), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), dVar, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
                nfd0 Z02 = tijVar.Z0();
                Object tag2 = viewGroup.getTag();
                String str3 = !(tag2 instanceof String) ? (String) tag2 : null;
                it = j5g.u0(Z02.i, Z02.h).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (epx.f(((nfd0.b) obj2).a, str3)) {
                            break;
                        }
                    }
                }
                nfd0.b bVar2 = (nfd0.b) obj2;
                privacyRule = bVar2 != null ? bVar2.c : null;
                if (!(privacyRule instanceof PrivacyRules.Exclude)) {
                    l1(viewGroup, bVar2, tijVar.Z0().a, tijVar.Z0().b);
                    return;
                } else {
                    if (privacyRule instanceof PrivacyRules.Include) {
                        l1(viewGroup, bVar2, tijVar.Z0().c, tijVar.Z0().d);
                        return;
                    }
                    return;
                }
            }
        }
        tijVar = this;
        nfd0 Z022 = tijVar.Z0();
        Object tag22 = viewGroup.getTag();
        if (!(tag22 instanceof String)) {
        }
        it = j5g.u0(Z022.i, Z022.h).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        nfd0.b bVar22 = (nfd0.b) obj2;
        if (bVar22 != null) {
        }
        if (!(privacyRule instanceof PrivacyRules.Exclude)) {
        }
    }

    public final void m1() {
        Context context = this.e;
        if (context instanceof l7s) {
            u0(((l7s) context).getThemeResId());
            l(e3m.f(R.attr.vk_ui_background_content, context));
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_content_privacy, (ViewGroup) null, false);
        qxm0.r(inflate);
        ((ModalPrivacySettingsErrorView) inflate.findViewById(R.id.privacy_bottomsheet_loading_error)).setRetryAction(new ozf(this, 10));
        bwt0.i0(inflate.findViewById(R.id.privacy_btn_save), new r3h(this, 3));
        View findViewById = inflate.findViewById(R.id.privacy_first_settings_group_title);
        VkGroupHeader vkGroupHeader = (VkGroupHeader) findViewById;
        VkGroupHeader.Size size = VkGroupHeader.Size.Small;
        vkGroupHeader.setSize(size);
        vkGroupHeader.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, X0()), null, null, null, 0, 510));
        this.l = findViewById;
        View findViewById2 = inflate.findViewById(R.id.privacy_second_settings_group_title);
        VkGroupHeader vkGroupHeader2 = (VkGroupHeader) findViewById2;
        vkGroupHeader2.setSize(size);
        vkGroupHeader2.setTitle(new VkGroupHeader.d(new tlo0.f(a1()), null, null, null, 0, 510));
        this.n = findViewById2;
        this.k = (ViewGroup) inflate.findViewById(R.id.privacy_first_settings_group);
        this.m = (ViewGroup) inflate.findViewById(R.id.privacy_second_settings_group);
        this.o = inflate.findViewById(R.id.privacy_loader);
        this.p = (ModalPrivacySettingsErrorView) inflate.findViewById(R.id.privacy_bottomsheet_loading_error);
        this.q = (Group) inflate.findViewById(R.id.privacy_main_content_group);
        VkBanner vkBanner = (VkBanner) inflate.findViewById(R.id.privacy_close_profile);
        vkBanner.setBefore(new VkBanner.b.c(iah0.a(32), new InteropPicture(new snx.b.C3683b(new gko(R.drawable.vk_icon_lock_outline_56), new b8g(this.c.getColor(R.color.vk_gray_400)), 4), null, null, 14), null));
        vkBanner.setMiddle(new VkBanner.e(null, null, new VkBanner.e.a.b(new tlo0.f(U0())), new VkBanner.c(new tlo0.f(R.string.closed_account_open_setting_btn), new p5h(this, 6), VkButton.Mode.Tertiary, VkButton.Appearance.Neutral, null, null, null, 1008), null, null, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE));
        this.r = vkBanner;
        D0(inflate, false);
        q0(true);
        s(enj.e(R.drawable.vk_icon_arrow_left_outline_28, R.attr.vk_ui_icon_accent, this.c));
        t();
        c(new jgj(inflate, 0, 0, 14));
        v0(c1());
        a0(new h6(this, 28));
        this.j = new WeakReference<>(I0(b1()));
        ComponentCallbacks2 h = e3m.h(this.c);
        aeg0 aeg0Var = h instanceof aeg0 ? (aeg0) h : null;
        if (aeg0Var != null) {
            aeg0Var.Li(this.t);
        }
        e1();
    }

    public void n1() {
        ViewGroup viewGroup = this.k;
        if (viewGroup != null) {
            int i = 0;
            while (i < viewGroup.getChildCount()) {
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    k1((ViewGroup) childAt);
                }
                i = i2;
            }
        }
        ViewGroup viewGroup2 = this.m;
        if (viewGroup2 != null) {
            int i3 = 0;
            while (i3 < viewGroup2.getChildCount()) {
                int i4 = i3 + 1;
                View childAt2 = viewGroup2.getChildAt(i3);
                if (childAt2 instanceof ViewGroup) {
                    k1((ViewGroup) childAt2);
                }
                i3 = i4;
            }
        }
        Group group = this.q;
        if (group != null) {
            group.setVisibility(0);
        }
        View view = this.o;
        if (view != null) {
            f4m.j(view);
        }
        ModalPrivacySettingsErrorView modalPrivacySettingsErrorView = this.p;
        if (modalPrivacySettingsErrorView != null) {
            f4m.j(modalPrivacySettingsErrorView);
        }
        VkBanner vkBanner = this.r;
        if (vkBanner != null) {
            bwt0.p0(vkBanner, Z0().j);
        }
    }

    public final void o1() {
        Group group = this.q;
        if (group != null) {
            f4m.j(group);
        }
        View view = this.o;
        if (view != null) {
            f4m.j(view);
        }
        VkBanner vkBanner = this.r;
        if (vkBanner != null) {
            f4m.j(vkBanner);
        }
        ModalPrivacySettingsErrorView modalPrivacySettingsErrorView = this.p;
        if (modalPrivacySettingsErrorView != null) {
            modalPrivacySettingsErrorView.setVisibility(0);
        }
    }

    public void g1() {
    }
}
