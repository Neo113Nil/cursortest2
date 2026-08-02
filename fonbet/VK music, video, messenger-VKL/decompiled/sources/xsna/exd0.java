package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.vk.api.generated.account.dto.AccountSetPrivacyKeyDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationMembersFilterDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.posting.FriendsListPrivacyType;
import com.vk.dto.privacy.ListFriends;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.api.posting.listsfriends.ListsFriendsDefaultList;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.h7u0;
import xsna.ikv0;
import xsna.ixd0;
import xsna.mts;
import xsna.nx6;

/* compiled from: ProfileFriendsListPresenter.kt */
/* loaded from: classes4.dex */
public final class exd0 extends ysi implements zwd0 {
    public final ProfileFriendsFragment c;
    public final FriendsListParams d;
    public final FriendsListPrivacyType e;
    public final List<UserId> f;
    public final List<Integer> g;
    public final qwe h;
    public boolean i;
    public boolean j;
    public final es k = new es();
    public volatile gxd0 l;
    public Boolean m;
    public final LinkedHashSet n;
    public final LinkedHashSet o;
    public Set<UserId> p;
    public final czi q;
    public final be r;

    /* compiled from: ProfileFriendsListPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FriendsListPrivacyType.values().length];
            try {
                iArr[FriendsListPrivacyType.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FriendsListPrivacyType.CLIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FriendsListPrivacyType.STORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FriendsListPrivacyType.LIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FriendsListPrivacyType.VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FriendsListPrivacyType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ProfileFriendsListPresenter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            j03.l(th);
            return s3q0.a;
        }
    }

    /* compiled from: ProfileFriendsListPresenter.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            j03.l(th);
            return s3q0.a;
        }
    }

    /* compiled from: ProfileFriendsListPresenter.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            ((exd0) this.receiver).getClass();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            cvk.w(j03.g(context, th2, R.string.error), false);
            return s3q0.a;
        }
    }

    /* compiled from: ProfileFriendsListPresenter.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            j03.l(th);
            return s3q0.a;
        }
    }

    /* compiled from: ProfileFriendsListPresenter.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            j03.l(th);
            return s3q0.a;
        }
    }

    /* compiled from: ProfileFriendsListPresenter.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            j03.l(th);
            return s3q0.a;
        }
    }

    /* compiled from: ProfileFriendsListPresenter.kt */
    public static final class h implements izs {
        public final /* synthetic */ ArrayList c;

        public h(ArrayList arrayList) {
            this.c = arrayList;
        }

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            FragmentActivity activity;
            ysg0.b.a(new ywd0(exd0.this.l.d()));
            exd0 exd0Var = exd0.this;
            FriendsListParams friendsListParams = exd0Var.d;
            if (friendsListParams instanceof FriendsListParams.BestFriendsList) {
                ArrayList d = exd0Var.l.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                Iterator it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((ProfileFriendItem) it.next()).b.b));
                }
                Set<String> S0 = j5g.S0(arrayList);
                ProfileFriendsFragment profileFriendsFragment = exd0.this.c;
                Bundle arguments = profileFriendsFragment.getArguments();
                if (arguments != null && arguments.getBoolean("is_open_from_feed_key") && (activity = profileFriendsFragment.getActivity()) != null) {
                    ikv0.a aVar = new ikv0.a(activity);
                    aVar.t = new ikv0.c.C3058c(R.drawable.ic_done_in_blue_circle, (Integer) null, (Size) null, 14);
                    aVar.u = new ikv0.d(activity.getString(R.string.best_friends_saved), (String) null, (ikv0.d.a) null, 6);
                    aVar.o = Integer.valueOf(iah0.a(56));
                    aVar.e = 300L;
                    aVar.n();
                }
                profileFriendsFragment.no(S0, EmptySet.b);
            } else if (friendsListParams instanceof FriendsListParams.HiddenFriendsList) {
                ArrayList arrayList2 = this.c;
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(String.valueOf(((nx6.a) it2.next()).a.b));
                }
                exd0.this.c.no(j5g.S0(arrayList3), EmptySet.b);
            } else if (friendsListParams instanceof FriendsListParams.FriendsList) {
                if (exd0Var.i) {
                    FriendsListParams.FriendsList friendsList = (FriendsListParams.FriendsList) friendsListParams;
                    exd0Var.c.mo(friendsList.d, friendsList.c);
                } else if (this.c.isEmpty()) {
                    exd0.this.c.finish();
                } else {
                    ProfileFriendsFragment profileFriendsFragment2 = exd0.this.c;
                    profileFriendsFragment2.getClass();
                    profileFriendsFragment2.Mf(-1, new Intent());
                }
            } else if (friendsListParams instanceof FriendsListParams.FriendListCreation) {
                exd0Var.c.finish();
            } else {
                if (!(friendsListParams instanceof FriendsListParams.FriendsListsWithFriends)) {
                    throw new NoWhenBranchMatchedException();
                }
                exd0Var.c.finish();
            }
            return s3q0.a;
        }
    }

    public exd0(ProfileFriendsFragment profileFriendsFragment, FriendsListParams friendsListParams, FriendsListPrivacyType friendsListPrivacyType, List list, List list2, qwe qweVar) {
        czi zqsVar;
        be y9x0Var;
        this.c = profileFriendsFragment;
        this.d = friendsListParams;
        this.e = friendsListPrivacyType;
        this.f = list;
        this.g = list2;
        this.h = qweVar;
        List list3 = list2;
        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            kq.d((Number) it.next(), arrayList);
        }
        this.l = new gxd0(null, friendsListParams, j5g.S0(arrayList), null, null, null, null, null, 0, 8167);
        this.n = new LinkedHashSet();
        this.o = new LinkedHashSet();
        FriendsListParams friendsListParams2 = this.d;
        if (friendsListParams2 instanceof FriendsListParams.FriendsList) {
            zqsVar = new dqs(Integer.valueOf(((FriendsListParams.FriendsList) friendsListParams2).b));
        } else if (friendsListParams2 instanceof FriendsListParams.FriendListCreation) {
            zqsVar = new dqs(null);
        } else if (friendsListParams2 instanceof FriendsListParams.BestFriendsList) {
            zqsVar = new yx6(7);
        } else if (friendsListParams2 instanceof FriendsListParams.HiddenFriendsList) {
            zqsVar = new u2v(((FriendsListParams.HiddenFriendsList) friendsListParams2).b);
        } else {
            if (!(friendsListParams2 instanceof FriendsListParams.FriendsListsWithFriends)) {
                throw new NoWhenBranchMatchedException();
            }
            List<UserId> list4 = this.f;
            ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(String.valueOf(((UserId) it2.next()).b));
            }
            zqsVar = new zqs(arrayList2);
        }
        this.q = zqsVar;
        switch (a.$EnumSwitchMapping$0[this.e.ordinal()]) {
            case 1:
                y9x0Var = new y9x0();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                y9x0Var = new zgp();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.r = y9x0Var;
    }

    public static Pair u7(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nx6.a aVar = (nx6.a) it.next();
            if (aVar instanceof nx6.a.C3421a) {
                arrayList2.add(aVar.a);
            } else {
                if (!(aVar instanceof nx6.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList3.add(aVar.a);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        return new Pair(arrayList2, arrayList3);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, android.app.Dialog, androidx.appcompat.app.d] */
    @Override // xsna.shz
    public final void A3() {
        List<ListsFriendsDefaultList> list;
        Window window;
        boolean i2 = i2();
        int size = this.n.size();
        ProfileFriendsFragment profileFriendsFragment = this.c;
        if (size >= 5 && !i2) {
            FragmentActivity activity = profileFriendsFragment.getActivity();
            if (activity == null) {
                return;
            }
            ikv0.a aVar = new ikv0.a(activity);
            aVar.u = new ikv0.d(y8g0.f(R.string.lists_friends_limit_reached, 29), (String) null, (ikv0.d.a) null, 6);
            aVar.o = Integer.valueOf(y8g0.a(R.dimen.clips_privacy_limit_reached_msg_margin));
            aVar.n();
            return;
        }
        Context requireContext = profileFriendsFragment.requireContext();
        h7u0.a aVar2 = new h7u0.a(requireContext);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        View inflate = LayoutInflater.from(requireContext).inflate(R.layout.lists_friends_creation_suggests, (ViewGroup) null, false);
        final EditText editText = (EditText) inflate.findViewById(R.id.new_list_name_input_text);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.new_list_name_input_text_clear);
        VkButton vkButton = (VkButton) inflate.findViewById(R.id.lists_friends_save);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) inflate.findViewById(R.id.suggest_chips_view);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zwd0 zwd0Var = (zwd0) profileFriendsFragment.S;
        if (zwd0Var == null || (list = zwd0Var.F1()) == null) {
            list = EmptyList.b;
        }
        List<ListsFriendsDefaultList> list2 = list;
        final uwd0 uwd0Var = new uwd0(vkButton, imageButton, linkedHashMap);
        editText.addTextChangedListener(uwd0Var);
        editText.setFilters(new m2r0[]{new m2r0()});
        editText.setEnabled(i2);
        editText.setHint(i2 ? y8g0.e(R.string.lists_friends_name_hint) : "");
        bwt0.p0(imageButton, i2 && editText.getText().length() > 0);
        imageButton.setOnClickListener(new f9(editText, 12));
        jjc.f(aVar2.j.e(new qwd0(ref$ObjectRef, linkedHashMap, i2, profileFriendsFragment, editText)), vkButton);
        vkButton.setEnabled(false);
        TextView textView = (TextView) inflate.findViewById(R.id.lists_friends_desc);
        textView.setVisibility(0);
        textView.setText(y8g0.e(i2 ? R.string.lists_friends_create_name_desc : R.string.lists_friends_create_name_desc_custom_limit));
        List<ListsFriendsDefaultList> list3 = list2;
        bwt0.p0(textView, !list3.isEmpty());
        vkButton.setText(R.string.lists_friends_create_continue);
        bwt0.p0(horizontalScrollView, !list3.isEmpty());
        if (!list3.isEmpty()) {
            ChipGroup chipGroup = (ChipGroup) inflate.findViewById(R.id.suggest_lists_chips);
            for (ListsFriendsDefaultList listsFriendsDefaultList : list2) {
                boolean z = i2;
                Chip chip = (Chip) LayoutInflater.from(requireContext).inflate(R.layout.lists_friends_creation_suggest_chip, (ViewGroup) null, false);
                chip.setId(View.generateViewId());
                final String e2 = y8g0.e(oez.a(listsFriendsDefaultList));
                chip.setText(e2);
                final ImageButton imageButton2 = imageButton;
                final VkButton vkButton2 = vkButton;
                chip.setOnClickListener(new View.OnClickListener() { // from class: xsna.rwd0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = ProfileFriendsFragment.k0;
                        boolean isChecked = ((Chip) view).isChecked();
                        EditText editText2 = editText;
                        if (!isChecked) {
                            editText2.setText("");
                            return;
                        }
                        uwd0 uwd0Var2 = uwd0Var;
                        editText2.removeTextChangedListener(uwd0Var2);
                        String str = e2;
                        editText2.setText(str);
                        editText2.setSelection(str.length());
                        editText2.addTextChangedListener(uwd0Var2);
                        vkButton2.setEnabled(true);
                        imageButton2.setVisibility(0);
                    }
                });
                linkedHashMap.put(listsFriendsDefaultList, chip);
                chipGroup.addView(chip);
                vkButton = vkButton2;
                imageButton = imageButton2;
                i2 = z;
            }
        }
        boolean z2 = i2;
        aVar2.f = inflate;
        String e3 = y8g0.e(R.string.lists_friends_create_name_title);
        AppCompatTextView appCompatTextView = new AppCompatTextView(requireContext);
        appCompatTextView.setText(String.valueOf(e3));
        int a2 = e3m.a(R.dimen.lists_friends_creation_title_top, requireContext);
        appCompatTextView.setPadding(a2, a2, a2, e3m.a(R.dimen.lists_friends_creation_title_bottom, requireContext));
        appCompatTextView.setGravity(17);
        appCompatTextView.setIncludeFontPadding(false);
        com.vk.typography.b.k(appCompatTextView, FontFamily.MEDIUM, Float.valueOf(24.0f), 4);
        appCompatTextView.setTextColor(krv0.l(R.attr.vk_ui_text_muted));
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        aVar2.a.e = appCompatTextView;
        ?? m = aVar2.m();
        if (m != 0 && (window = m.getWindow()) != null) {
            window.clearFlags(8);
            window.clearFlags(131072);
            window.setSoftInputMode(5);
        }
        if (m != 0) {
            ref$ObjectRef.element = m;
            if (z2) {
                mhy.j(editText);
            }
        }
    }

    @Override // xsna.shz
    public final List<ListsFriendsDefaultList> F1() {
        ArrayList arrayList = new ArrayList();
        for (ListsFriendsDefaultList listsFriendsDefaultList : ListsFriendsDefaultList.values()) {
            if (!this.n.contains(Integer.valueOf(listsFriendsDefaultList.h()))) {
                arrayList.add(listsFriendsDefaultList);
            }
        }
        return j5g.O0(arrayList);
    }

    @Override // xsna.zwd0
    public final void L1(ox6 ox6Var) {
        Object obj;
        Iterator<T> it = this.l.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((px6) obj).b.a == ox6Var.a) {
                    break;
                }
            }
        }
        px6 px6Var = (px6) obj;
        List<ProfileFriendItem> list = px6Var != null ? px6Var.d : null;
        if (list != null) {
            j7(ox6Var, list);
        } else {
            hg1.e(this.b, this.c.uo(rsg0.y0(yfb.x(sg20.h(new vg20(), new UserId(ox6Var.a), null, MessagesGetConversationMembersFilterDto.FRIENDS, Collections.singletonList(UsersFieldsDto.PHOTO_BASE), null, null, null, null, 4038)), null, null, 3).U(new z8(new x620(18), 27))).subscribe(new lav(new q7a0(3, this, ox6Var), 24), new p350(new b(1, j03.a, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0), 10)));
        }
    }

    @Override // xsna.shz
    public final void O4(int i) {
        this.l.e(i);
        x7();
    }

    @Override // xsna.shz
    public final void P(int i, int i2, String str) {
        ProfileFriendsFragment profileFriendsFragment = this.c;
        profileFriendsFragment.getClass();
        FriendsListParams.FriendsList friendsList = new FriendsListParams.FriendsList(i, str, i2);
        FriendsListPrivacyType.a aVar = FriendsListPrivacyType.Companion;
        Bundle arguments = profileFriendsFragment.getArguments();
        int i3 = arguments != null ? arguments.getInt("privacy_type_key") : -1;
        aVar.getClass();
        new ProfileFriendsFragment.a(friendsList, FriendsListPrivacyType.a.a(i3), null, null, false, 60).g(4330, profileFriendsFragment);
    }

    @Override // xsna.zwd0
    public final void Qa() {
        FriendsListParams friendsListParams = this.d;
        boolean z = friendsListParams instanceof FriendsListParams.FriendsList;
        ProfileFriendsFragment profileFriendsFragment = this.c;
        if (z && this.i) {
            FriendsListParams.FriendsList friendsList = (FriendsListParams.FriendsList) friendsListParams;
            profileFriendsFragment.mo(friendsList.d, friendsList.c);
        } else if (friendsListParams instanceof FriendsListParams.HiddenFriendsList) {
            profileFriendsFragment.to();
        } else {
            profileFriendsFragment.finish();
        }
    }

    @Override // xsna.zwd0
    public final void S0(List<ProfileFriendItem> list) {
        if (!(this.d instanceof FriendsListParams.FriendsListsWithFriends)) {
            gxd0.g(this.l, list);
            x7();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<Integer> list2 = ((ProfileFriendItem) it.next()).f;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                kq.d((Number) it2.next(), arrayList2);
            }
            ArrayList c2 = this.l.c();
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                if (c2.contains((String) next)) {
                    arrayList3.add(next);
                }
            }
            g5g.y(arrayList3, arrayList);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            Integer m = arm0.m(10, (String) it4.next());
            if (m != null) {
                arrayList4.add(m);
            }
        }
        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            Integer valueOf = Integer.valueOf(((Number) it5.next()).intValue());
            arrayList5.add(rsg0.y0(yfb.x(mts.a.a(null, null, (987 & 4) != 0 ? null : valueOf, null, null, Collections.singletonList(UsersFieldsDto.LISTS), null, null)), null, null, 3).U(new aad0(new xht(25), 2)));
        }
        if (!arrayList5.isEmpty()) {
            hg1.e(this.b, new io.reactivex.rxjava3.internal.operators.observable.e3(null, arrayList5, new t9c0(1, new t3v(15)), io.reactivex.rxjava3.core.g.b).subscribe(new x150(new lfa(16, this, list), 8), new jsb0(new wqb(19, this, list), 7)));
        } else {
            gxd0.g(this.l, list);
            x7();
        }
    }

    @Override // xsna.zwd0
    public final void Tm(String str) {
        FriendsListParams friendsListParams = this.d;
        boolean z = friendsListParams instanceof FriendsListParams.FriendsList;
        ProfileFriendsFragment profileFriendsFragment = this.c;
        if (z) {
            hg1.e(this.b, profileFriendsFragment.uo(rsg0.y0(new cp4(((FriendsListParams.FriendsList) friendsListParams).b, str, null, null, null), null, null, 3)).subscribe(new hms(new rh4(23, this, str), 29), new n3t(new g(1, j03.a, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0), 18)));
        } else if (friendsListParams instanceof FriendsListParams.FriendListCreation) {
            ((FriendsListParams.FriendListCreation) friendsListParams).b = str;
            profileFriendsFragment.jo(str);
        } else if (!(friendsListParams instanceof FriendsListParams.BestFriendsList) && !(friendsListParams instanceof FriendsListParams.HiddenFriendsList) && !(friendsListParams instanceof FriendsListParams.FriendsListsWithFriends)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // xsna.zwd0
    public final void U0() {
        if (this.d instanceof FriendsListParams.FriendsListsWithFriends) {
            gxd0 gxd0Var = this.l;
            Set<Integer> set = gxd0Var.b;
            if (!set.isEmpty() || !gxd0Var.e.isEmpty()) {
                Iterator it = p4g.d(set).iterator();
                while (it.hasNext()) {
                    gxd0Var.e(((Number) it.next()).intValue());
                }
                List<ListFriends> list = gxd0Var.a;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(((ListFriends) it2.next()).b));
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    gxd0Var.e(((Number) it3.next()).intValue());
                }
                for (Map.Entry<UserId, jqs> entry : gxd0Var.i.entrySet()) {
                    UserId key = entry.getKey();
                    jqs value = entry.getValue();
                    boolean isEmpty = value.b.f.isEmpty();
                    boolean contains = gxd0Var.f.contains(String.valueOf(key.b));
                    boolean contains2 = gxd0Var.j.contains(key);
                    if (!isEmpty && !contains2 && !contains) {
                        value.c = false;
                    }
                }
            }
            x7();
        }
    }

    @Override // xsna.zwd0
    public final void U8(List<ProfileFriendItem> list, boolean z) {
        if (!this.l.a(list, z)) {
            this.c.so(100);
        }
        x7();
    }

    @Override // xsna.zwd0
    public final void Yh() {
        this.c.w6(ixd0.c.a);
        io.reactivex.rxjava3.internal.operators.observable.j1 U = this.q.o().U(new nit(new m360(this, 11), 15));
        asu0.a.getClass();
        new io.reactivex.rxjava3.internal.operators.observable.c2(U.r0(asu0.r()), new oyr(new d0k(26), 16)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new jw80(new qw30(this, 24), 8), new m330(new acc0(3), 15));
    }

    @Override // xsna.zwd0
    public final void Z6(int i) {
        this.l.m += i;
        x7();
    }

    @Override // xsna.zwd0
    public final void Z7() {
        FriendsListParams friendsListParams = this.d;
        if (friendsListParams instanceof FriendsListParams.FriendListCreation) {
            List list = (List) u7(this.l.h()).d();
            FriendsListParams.FriendListCreation friendListCreation = (FriendsListParams.FriendListCreation) this.d;
            ListsFriendsDefaultList.a aVar = ListsFriendsDefaultList.Companion;
            int i = friendListCreation.d;
            aVar.getClass();
            int i2 = 10;
            int i3 = 23;
            if (ListsFriendsDefaultList.a.a(i)) {
                hg1.e(this.b, this.c.uo(rsg0.y0(new cp4(friendListCreation.d, null, null, list, null), null, null, 3)).subscribe(new w250(new bk30(this, i3), i2), new a8v(new o99(j03.a, 11), 12)));
            } else {
                String str = friendListCreation.b;
                if (list == null) {
                    list = EmptyList.b;
                }
                int i4 = 2;
                ff20 ff20Var = new ff20("friends.addList", i4);
                ff20Var.K("name", str);
                ff20Var.M("user_ids", list);
                hg1.e(this.b, this.c.uo(rsg0.y0(ff20Var, null, null, 3)).subscribe(new tts(new vlc0(this, i4), i3), new fv70(new bw6(j03.a, 10), 7)));
            }
        } else if (friendsListParams instanceof FriendsListParams.FriendsList) {
            w7(false);
        } else if (friendsListParams instanceof FriendsListParams.BestFriendsList) {
            w7(true);
        } else if (friendsListParams instanceof FriendsListParams.HiddenFriendsList) {
            w7(false);
        } else {
            if (!(friendsListParams instanceof FriendsListParams.FriendsListsWithFriends)) {
                throw new NoWhenBranchMatchedException();
            }
            w7(false);
        }
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.zwd0
    public final void b1() {
        if (this.d instanceof FriendsListParams.BestFriendsList) {
            this.r.W();
        }
        this.j = true;
        FriendsListParams friendsListParams = this.d;
        if (friendsListParams instanceof FriendsListParams.FriendsList) {
            if (this.q instanceof dqs) {
                gxd0 gxd0Var = this.l;
                int i = ((FriendsListParams.FriendsList) this.d).b;
                gxd0Var.j.clear();
                gxd0Var.b.remove(Integer.valueOf(i));
                gxd0Var.c.add(Integer.valueOf(i));
                Iterator<T> it = gxd0Var.i.values().iterator();
                while (it.hasNext()) {
                    ((jqs) it.next()).c = false;
                }
            } else {
                gxd0 gxd0Var2 = this.l;
                gxd0.g(gxd0Var2, gxd0Var2.d());
            }
        } else if (friendsListParams instanceof FriendsListParams.FriendsListsWithFriends) {
            gxd0 gxd0Var3 = this.l;
            gxd0Var3.j.clear();
            gxd0Var3.k.addAll(gxd0Var3.i.keySet());
            gxd0Var3.b.clear();
            Set<Integer> set = gxd0Var3.c;
            ArrayList c2 = gxd0Var3.c();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = c2.iterator();
            while (it2.hasNext()) {
                Integer m = arm0.m(10, (String) it2.next());
                if (m != null) {
                    arrayList.add(m);
                }
            }
            set.addAll(arrayList);
            Iterator<T> it3 = gxd0Var3.i.values().iterator();
            while (it3.hasNext()) {
                ((jqs) it3.next()).c = false;
            }
            gxd0.g(gxd0Var3, gxd0Var3.d());
        } else {
            gxd0 gxd0Var4 = this.l;
            gxd0.g(gxd0Var4, gxd0Var4.d());
        }
        x7();
    }

    @Override // xsna.zwd0
    public final void dn() {
        FriendsListParams friendsListParams = this.d;
        boolean z = friendsListParams instanceof FriendsListParams.FriendsList;
        ProfileFriendsFragment profileFriendsFragment = this.c;
        if (z) {
            ListsFriendsDefaultList.a aVar = ListsFriendsDefaultList.Companion;
            FriendsListParams.FriendsList friendsList = (FriendsListParams.FriendsList) friendsListParams;
            int i = friendsList.b;
            aVar.getClass();
            boolean a2 = ListsFriendsDefaultList.a.a(i);
            if (a2) {
                this.n.remove(Integer.valueOf(friendsList.b));
            }
            hg1.e(this.b, profileFriendsFragment.uo(a2 ? rsg0.y0(new cp4(friendsList.b, null, Collections.singletonList(new UserId(0L)), null, null), null, null, 3) : rsg0.y0(new if20(friendsList.b), null, null, 3)).subscribe(new m3y(new or50(this, 13), 16), new s520(new f(1, j03.a, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0), 13)));
            return;
        }
        if (friendsListParams instanceof FriendsListParams.FriendListCreation) {
            profileFriendsFragment.lo(-1);
            cvk.w(y8g0.e(R.string.lists_friends_delete_success), false);
        } else if (!(friendsListParams instanceof FriendsListParams.BestFriendsList) && !(friendsListParams instanceof FriendsListParams.HiddenFriendsList) && !(friendsListParams instanceof FriendsListParams.FriendsListsWithFriends)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // xsna.zwd0
    public final void fl() {
        this.r.V();
    }

    @Override // xsna.zwd0
    public final void g5(int i) {
        this.l.l += i;
        x7();
        this.r.Y();
    }

    @Override // xsna.zwd0
    public final FriendsListPrivacyType getType() {
        return this.e;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<Object> hj(com.vk.lists.c cVar, boolean z) {
        this.c.w6(ixd0.c.a);
        return this.q.o().U(new cxd0(new w110(this, 17), 0));
    }

    @Override // xsna.shz
    public final boolean i2() {
        return this.o.size() < 24;
    }

    public final void j7(ox6 ox6Var, List<ProfileFriendItem> list) {
        gxd0 gxd0Var = this.l;
        boolean a2 = gxd0Var.a(list, true);
        List<px6> list2 = gxd0Var.h;
        if (!g5g.D(list2, true, new gj80(ox6Var, 7))) {
            gxd0Var.l++;
        }
        list2.add(0, new px6(ox6Var, !a2, list, true));
        if (!a2) {
            this.c.so(100);
        }
        x7();
    }

    @Override // xsna.shz
    public final void l0(int i, int i2) {
        ListsFriendsDefaultList.Companion.getClass();
        boolean a2 = ListsFriendsDefaultList.a.a(i);
        io.reactivex.rxjava3.disposables.b bVar = this.b;
        if (a2) {
            hg1.e(bVar, rsg0.y0(new cp4(i, null, Collections.singletonList(new UserId(0L)), null, null), null, null, 3).subscribe(new r7a0(new s34(this, i, i2), 6), new pd40(new d(1, this, exd0.class, "showApiError", "showApiError(Ljava/lang/Throwable;)V", 0), 13)));
        } else {
            hg1.e(bVar, rsg0.y0(new if20(i), null, null, 3).subscribe(new fsq(new dxd0(this, i, i2), 22), new m1r(new e(1, j03.a, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0), 18)));
        }
    }

    @Override // xsna.shz
    public final void l6(int i) {
        gxd0 gxd0Var = this.l;
        gxd0Var.b.add(Integer.valueOf(i));
        gxd0Var.c.remove(Integer.valueOf(i));
        Iterator<Map.Entry<UserId, jqs>> it = gxd0Var.i.entrySet().iterator();
        while (it.hasNext()) {
            jqs value = it.next().getValue();
            if (value.b.f.contains(Integer.valueOf(i))) {
                value.c = true;
            }
        }
        x7();
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        dispose();
    }

    @Override // xsna.shz
    public final void q5(int i, String str) {
        this.l.a.add(0, new ListFriends(i, str));
        ListsFriendsDefaultList.Companion.getClass();
        if (ListsFriendsDefaultList.a.a(i)) {
            this.n.add(Integer.valueOf(i));
        } else {
            this.o.add(Integer.valueOf(i));
        }
    }

    @Override // xsna.zwd0
    public final void rm(io.reactivex.rxjava3.internal.operators.observable.j1 j1Var) {
        io.reactivex.rxjava3.core.q<R> s0 = new io.reactivex.rxjava3.internal.operators.observable.y(j1Var, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).y(100L, TimeUnit.MILLISECONDS).s0(new fq1(new fa00(this, 18), 29));
        cmc0 cmc0Var = new cmc0(new azt(21), 1);
        s0.getClass();
        hg1.e(this.b, new io.reactivex.rxjava3.internal.operators.observable.c2(s0, cmc0Var).a0(asu0.a.d()).subscribe(new n240(new p99(1, this.c, hxd0.class, "updateState", "updateState(Lcom/vk/newsfeed/api/posting/profilefriendslists/ProfileFriendsListViewState;)V", 0, 10), 13), new qg60(new lw3(j03.a, 11), 9)));
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<Object> ui(int i, com.vk.lists.c cVar) {
        return new io.reactivex.rxjava3.internal.operators.observable.c2(this.q.l(cVar.k(), i).U(new ct(new oqu(28), 23)), new k7(new gky(20), 29));
    }

    public final void v7(final int i, int i2, boolean z) {
        if (!z) {
            cvk.u(R.string.error, false);
            return;
        }
        gxd0 gxd0Var = this.l;
        gxd0Var.e(i);
        Iterator<T> it = gxd0Var.g.values().iterator();
        while (it.hasNext()) {
            ((ProfileFriendItem) it.next()).f.remove(Integer.valueOf(i));
        }
        Iterator<T> it2 = gxd0Var.i.values().iterator();
        while (it2.hasNext()) {
            ((jqs) it2.next()).b.f.remove(Integer.valueOf(i));
        }
        g5g.D(gxd0Var.a, true, new izs() { // from class: xsna.fxd0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((ListFriends) obj).b == i);
            }
        });
        gxd0Var.c.remove(Integer.valueOf(i));
        this.c.lo(i2);
        this.o.remove(Integer.valueOf(i));
        this.n.remove(Integer.valueOf(i));
        x7();
    }

    public final void w7(boolean z) {
        io.reactivex.rxjava3.internal.operators.observable.m1 T;
        if (this.d instanceof FriendsListParams.BestFriendsList) {
            this.r.X(z);
        }
        ArrayList h2 = this.l.h();
        FriendsListParams friendsListParams = this.d;
        boolean z2 = ((friendsListParams instanceof FriendsListParams.FriendsListsWithFriends) || (friendsListParams instanceof FriendsListParams.HiddenFriendsList)) ? false : true;
        if (h2.isEmpty() && !this.j && !this.i && z2) {
            this.c.finish();
            return;
        }
        if (z && epx.f(this.m, Boolean.TRUE) && this.l.g.size() > 0) {
            this.c.to();
            this.m = Boolean.FALSE;
            return;
        }
        FriendsListParams friendsListParams2 = this.d;
        boolean z3 = friendsListParams2 instanceof FriendsListParams.FriendsListsWithFriends;
        if (z3) {
            io.reactivex.rxjava3.disposables.b bVar = this.b;
            io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new rs60(this, h2, 1));
            asu0 asu0Var = asu0.a;
            hg1.e(bVar, new io.reactivex.rxjava3.internal.operators.single.n(vVar.q(asu0Var.c()), new b8v(new kn20(this, 29), 20)).m(asu0Var.d()).subscribe(new k130(new eiz(this, 24), 16), new cc20(new fju(this, 27), 18)));
            return;
        }
        if (friendsListParams2 instanceof FriendsListParams.FriendsList) {
            Pair u7 = u7(h2);
            List list = (List) u7.d();
            List list2 = (List) u7.g();
            if (this.j) {
                int i = ((FriendsListParams.FriendsList) this.d).b;
                if (list == null) {
                    list = Collections.singletonList(new UserId(0L));
                }
                T = rsg0.y0(new cp4(i, null, list, null, null), null, null, 3);
            } else {
                T = rsg0.y0(new cp4(((FriendsListParams.FriendsList) this.d).b, null, null, list, list2), null, null, 3);
            }
        } else if (friendsListParams2 instanceof FriendsListParams.BestFriendsList) {
            T = rsg0.y0(new nx6(h2), null, null, 3);
        } else {
            if ((friendsListParams2 instanceof FriendsListParams.FriendListCreation) || z3) {
                return;
            }
            if (!(friendsListParams2 instanceof FriendsListParams.HiddenFriendsList)) {
                throw new NoWhenBranchMatchedException();
            }
            es esVar = this.k;
            AccountSetPrivacyKeyDto accountSetPrivacyKeyDto = AccountSetPrivacyKeyDto.STORIES_EXCLUDE;
            ArrayList arrayList = new ArrayList(c5g.u(h2, 10));
            Iterator it = h2.iterator();
            while (it.hasNext()) {
                arrayList.add(((nx6.a) it.next()).a);
            }
            T = rsg0.T(yfb.x(bs.n(esVar, accountSetPrivacyKeyDto, null, arrayList, Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE)));
        }
        hg1.e(this.b, this.c.uo(T).subscribe(new nex(new h(h2), 17), new wx00(new ha40(8), 13)));
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<Object> qVar, boolean z, com.vk.lists.c cVar) {
        hg1.e(this.b, qVar.a0(asu0.a.d()).subscribe(new ch10(2, this, cVar), new o060(new c(1, j03.a, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0), 9)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        if (r11.i == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        if (r8 != false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x7() {
        boolean z;
        FriendsListParams friendsListParams;
        boolean z2;
        gxd0 gxd0Var;
        boolean z3;
        FriendsListParams friendsListParams2;
        Set<UserId> set;
        ArrayList b2 = this.l.b();
        FriendsListParams friendsListParams3 = this.d;
        boolean z4 = false;
        if (friendsListParams3 instanceof FriendsListParams.FriendListCreation) {
            ListsFriendsDefaultList.a aVar = ListsFriendsDefaultList.Companion;
            int i = ((FriendsListParams.FriendListCreation) friendsListParams3).d;
            aVar.getClass();
            if (ListsFriendsDefaultList.a.a(i)) {
                z = true;
                friendsListParams = this.d;
                if (friendsListParams instanceof FriendsListParams.FriendsList) {
                    ListsFriendsDefaultList.a aVar2 = ListsFriendsDefaultList.Companion;
                    int i2 = ((FriendsListParams.FriendsList) friendsListParams).b;
                    aVar2.getClass();
                    if (ListsFriendsDefaultList.a.a(i2)) {
                        z2 = true;
                        if (!z || z2) {
                            gxd0Var = this.l;
                            if (gxd0Var.j.isEmpty()) {
                                Collection<jqs> values = gxd0Var.i.values();
                                if (!values.isEmpty()) {
                                    Iterator<T> it = values.iterator();
                                    while (it.hasNext()) {
                                        if (((jqs) it.next()).c) {
                                        }
                                    }
                                }
                                z3 = true;
                                ProfileFriendsFragment profileFriendsFragment = this.c;
                                int size = this.l.g.size();
                                boolean z5 = this.l.g.size() <= 0;
                                boolean isEmpty = this.l.h().isEmpty();
                                friendsListParams2 = this.d;
                                if (!(friendsListParams2 instanceof FriendsListParams.HiddenFriendsList) || (friendsListParams2 instanceof FriendsListParams.BestFriendsList)) {
                                    set = this.p;
                                    if (set != null) {
                                        ArrayList d2 = this.l.d();
                                        ArrayList arrayList = new ArrayList(c5g.u(d2, 10));
                                        Iterator it2 = d2.iterator();
                                        while (it2.hasNext()) {
                                            arrayList.add(((ProfileFriendItem) it2.next()).b);
                                        }
                                        z4 = !set.equals(j5g.S0(arrayList));
                                    }
                                } else if (friendsListParams2 instanceof FriendsListParams.FriendsList) {
                                    if (!z5) {
                                        if (!this.j) {
                                            if (isEmpty) {
                                            }
                                        }
                                    }
                                    z4 = true;
                                } else if (friendsListParams2 instanceof FriendsListParams.FriendsListsWithFriends) {
                                    if (!z5) {
                                        if (!this.j) {
                                        }
                                    }
                                    z4 = true;
                                } else {
                                    if (!(friendsListParams2 instanceof FriendsListParams.FriendListCreation)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z4 = z5;
                                }
                                profileFriendsFragment.w6(new ixd0.a(b2, size, z3, z4));
                            }
                        }
                        z3 = false;
                        ProfileFriendsFragment profileFriendsFragment2 = this.c;
                        int size2 = this.l.g.size();
                        if (this.l.g.size() <= 0) {
                        }
                        boolean isEmpty2 = this.l.h().isEmpty();
                        friendsListParams2 = this.d;
                        if (friendsListParams2 instanceof FriendsListParams.HiddenFriendsList) {
                        }
                        set = this.p;
                        if (set != null) {
                        }
                        profileFriendsFragment2.w6(new ixd0.a(b2, size2, z3, z4));
                    }
                }
                z2 = false;
                if (!z) {
                }
                gxd0Var = this.l;
                if (gxd0Var.j.isEmpty()) {
                }
                z3 = false;
                ProfileFriendsFragment profileFriendsFragment22 = this.c;
                int size22 = this.l.g.size();
                if (this.l.g.size() <= 0) {
                }
                boolean isEmpty22 = this.l.h().isEmpty();
                friendsListParams2 = this.d;
                if (friendsListParams2 instanceof FriendsListParams.HiddenFriendsList) {
                }
                set = this.p;
                if (set != null) {
                }
                profileFriendsFragment22.w6(new ixd0.a(b2, size22, z3, z4));
            }
        }
        z = false;
        friendsListParams = this.d;
        if (friendsListParams instanceof FriendsListParams.FriendsList) {
        }
        z2 = false;
        if (!z) {
        }
        gxd0Var = this.l;
        if (gxd0Var.j.isEmpty()) {
        }
        z3 = false;
        ProfileFriendsFragment profileFriendsFragment222 = this.c;
        int size222 = this.l.g.size();
        if (this.l.g.size() <= 0) {
        }
        boolean isEmpty222 = this.l.h().isEmpty();
        friendsListParams2 = this.d;
        if (friendsListParams2 instanceof FriendsListParams.HiddenFriendsList) {
        }
        set = this.p;
        if (set != null) {
        }
        profileFriendsFragment222.w6(new ixd0.a(b2, size222, z3, z4));
    }

    @Override // xsna.gm6
    public final void d() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
