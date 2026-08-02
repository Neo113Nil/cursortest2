package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.camera.settings.ModalPrivacySettingsErrorView;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.core.ui.CircularProgressView;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.PhotoStackView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.newsfeed.impl.posting.viewpresenter.settings.PostingType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.cqc0;
import xsna.dw20;
import xsna.tzp0;

/* compiled from: PostingVisibilityBottomSheet.kt */
/* loaded from: classes4.dex */
public final class cqc0 extends dw20.b implements w8i {
    public static final String v = fpf0.a(cqc0.class).l();
    public static final tzp0.c.a w = new tzp0.c.a(new a(), true);
    public final Context e;
    public PostingVisibilityMode f;
    public final PostingType g;
    public final izs<PostingVisibilityMode, s3q0> h;
    public final gzs<s3q0> i;
    public final gzs<s3q0> j;
    public ss3 k;
    public final com.vk.newsfeed.impl.posting.a l;
    public final io.reactivex.rxjava3.disposables.b m;
    public WeakReference<dw20> n;
    public c o;
    public List<UserId> p;
    public List<Integer> q;
    public final Object r;
    public final Object s;
    public final int t;
    public final aqc0 u;

    /* compiled from: PostingVisibilityBottomSheet.kt */
    public static final class a implements m0q0 {
        @Override // xsna.m0q0
        public final void y(UiTrackingScreen uiTrackingScreen) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PRIVACY_VALUE_SETTINGS;
        }
    }

    /* compiled from: PostingVisibilityBottomSheet.kt */
    public static final class b {
        public static tzp0.c.a a() {
            return cqc0.w;
        }
    }

    /* compiled from: PostingVisibilityBottomSheet.kt */
    public static final class c {
        public final Object A;
        public final Object B;
        public final CircularProgressView C;
        public final ModalPrivacySettingsErrorView D;
        public final Context a;
        public final View b;
        public final View c;
        public final TextView d;
        public final View e;
        public final PhotoStackView f;
        public final View g;
        public final LinearLayout h;
        public final LinearLayout i;
        public final Object j;
        public final Object k;
        public final Object l;
        public final Object m;
        public final View n;
        public final TextView o;
        public final TextView p;
        public final Object q;
        public final Object r;
        public final Object s;
        public final Object t;
        public final Object u;
        public final View v;
        public final Object w;
        public final Object x;
        public final Object y;
        public final Object z;

        public c(Context context, View view, PostingType postingType, final boolean z) {
            this.a = context;
            this.b = view;
            this.c = view.findViewById(R.id.posting_separator);
            TextView textView = (TextView) view.findViewById(R.id.posting_visibility_subtitle);
            bwt0.p0(textView, false);
            this.d = textView;
            View findViewById = view.findViewById(R.id.posting_visibility_add_friends_container);
            bwt0.p0(findViewById, false);
            this.e = findViewById;
            PhotoStackView photoStackView = (PhotoStackView) view.findViewById(R.id.posting_visibility_friends_hint);
            photoStackView.setOverlapOffset(0.85f);
            this.f = photoStackView;
            this.g = view.findViewById(R.id.posting_visibility_choose_friends);
            this.h = (LinearLayout) view.findViewById(R.id.posting_visibility_first_settings_group);
            this.i = (LinearLayout) view.findViewById(R.id.posting_visibility_second_settings_group);
            vt30 vt30Var = new vt30(this, 22);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.j = msy.a(lazyThreadSafetyMode, vt30Var);
            this.k = msy.a(lazyThreadSafetyMode, new b1z(this, 15));
            this.l = msy.a(lazyThreadSafetyMode, new cf00(this, 20));
            this.m = msy.a(lazyThreadSafetyMode, new u110(this, 13));
            View findViewById2 = view.findViewById(R.id.posting_visibility_close_profile);
            bwt0.p0(findViewById2, false);
            this.n = findViewById2;
            this.o = (TextView) view.findViewById(R.id.posting_visibility_not_available);
            TextView textView2 = (TextView) view.findViewById(R.id.posting_visibility_available);
            f4m.t(iah0.a(16), textView2);
            this.p = textView2;
            this.q = msy.a(lazyThreadSafetyMode, new b290(this, 9));
            this.r = msy.a(lazyThreadSafetyMode, new uq50(this, 22));
            this.s = msy.a(lazyThreadSafetyMode, new x850(this, 15));
            this.t = msy.a(lazyThreadSafetyMode, new odc0(this, 3));
            this.u = msy.a(lazyThreadSafetyMode, new wf40(this, 17));
            this.v = view.findViewById(R.id.privacy_sections_divider);
            this.w = msy.a(lazyThreadSafetyMode, new lo10(this, 21));
            this.x = msy.a(lazyThreadSafetyMode, new dqc0(this, z, 0));
            this.y = msy.a(lazyThreadSafetyMode, new gzs() { // from class: xsna.eqc0
                @Override // xsna.gzs
                public final Object invoke() {
                    ModalSettingsPrivacyOption modalSettingsPrivacyOption = new ModalSettingsPrivacyOption(cqc0.c.this.a, null, 6);
                    modalSettingsPrivacyOption.setTitle(R.string.clips_privacy_modal_bottomsheet_available_only_me);
                    bwt0.p0(modalSettingsPrivacyOption, z);
                    return modalSettingsPrivacyOption;
                }
            });
            this.z = msy.a(lazyThreadSafetyMode, new hdx(this, z, 1));
            this.A = msy.a(lazyThreadSafetyMode, new f540(this, 16));
            this.B = msy.a(lazyThreadSafetyMode, new x550(this, 17));
            CircularProgressView circularProgressView = (CircularProgressView) view.findViewById(R.id.posting_loader);
            bwt0.p0(circularProgressView, true);
            this.C = circularProgressView;
            this.D = (ModalPrivacySettingsErrorView) view.findViewById(R.id.posting_bottomsheet_loading_error);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final View a() {
            return (View) this.m.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final ModalSettingsPrivacyOption b() {
            return (ModalSettingsPrivacyOption) this.w.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final View c() {
            return (View) this.s.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final ModalSettingsPrivacyOption d() {
            return (ModalSettingsPrivacyOption) this.r.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final ModalSettingsPrivacyOption e() {
            return (ModalSettingsPrivacyOption) this.q.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final ModalSettingsPrivacyOption f() {
            return (ModalSettingsPrivacyOption) this.t.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final View g() {
            return (View) this.u.getValue();
        }
    }

    /* compiled from: PostingVisibilityBottomSheet.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PostingType.values().length];
            try {
                iArr[PostingType.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingType.CLIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostingType.LIVE_RECORDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PostingVisibilityMode.values().length];
            try {
                iArr2[PostingVisibilityMode.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PostingVisibilityMode.FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PostingVisibilityMode.BEST_FRIENDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PostingVisibilityMode.LISTS_FRIENDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PostingVisibilityMode.ONLY_ME.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PostingVisibilityMode.UNAVAILABLE_FRIENDS_AND_FRIENDS_OF_FRIENDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PostingVisibilityMode.UNAVAILABLE_FRIENDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[PostingVisibilityMode.UNAVAILABLE_FRIENDS_AND_FRIENDS_LISTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [xsna.aqc0] */
    public cqc0(Context context, PostingVisibilityMode postingVisibilityMode, PostingType postingType, izs izsVar, gzs gzsVar, gzs gzsVar2, com.vk.newsfeed.impl.posting.a aVar, tzp0.c cVar) {
        super(context, cVar);
        this.e = context;
        this.f = postingVisibilityMode;
        this.g = postingType;
        this.h = izsVar;
        this.i = gzsVar;
        this.j = gzsVar2;
        this.k = null;
        this.l = aVar;
        this.m = new io.reactivex.rxjava3.disposables.b();
        EmptyList emptyList = EmptyList.b;
        this.p = emptyList;
        this.q = emptyList;
        so40 so40Var = new so40(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.r = msy.a(lazyThreadSafetyMode, so40Var);
        new bpn0(new k7z(this, 28));
        this.s = msy.a(lazyThreadSafetyMode, new gd70(this, 14));
        this.t = y8g0.a(R.dimen.posting_counter_stack_item_size);
        ArrayList T0 = T0();
        ArrayList U0 = U0();
        this.p = T0;
        this.q = U0;
        this.u = new tb0() { // from class: xsna.aqc0
            @Override // xsna.tb0
            public final void onActivityResult(int i, int i2, Intent intent) {
                Set<String> S0;
                Set<String> S02;
                if (i2 == -1 && i == 24 && intent != null) {
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("chosen_friends_ids");
                    if (stringArrayListExtra != null && (S02 = j5g.S0(stringArrayListExtra)) != null) {
                        g620.f().e().v(S02);
                    }
                    ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("chosen_friends_lists_ids");
                    if (stringArrayListExtra2 != null && (S0 = j5g.S0(stringArrayListExtra2)) != null) {
                        g620.f().e().B(S0);
                    }
                    ArrayList T02 = cqc0.T0();
                    ArrayList U02 = cqc0.U0();
                    boolean z = (T02.isEmpty() && U02.isEmpty()) ? false : true;
                    boolean d2 = o25.a().d();
                    cqc0 cqc0Var = cqc0.this;
                    if (z) {
                        cqc0Var.f = PostingVisibilityMode.UNAVAILABLE_FRIENDS_AND_FRIENDS_LISTS;
                    } else {
                        cqc0.c cVar2 = cqc0Var.o;
                        if (cVar2 != null) {
                            bwt0.p0(cVar2.f(), false);
                            bwt0.p0(cVar2.g(), false);
                            s3q0 s3q0Var = s3q0.a;
                        }
                        cqc0Var.f = d2 ? PostingVisibilityMode.FRIENDS : PostingVisibilityMode.ALL;
                        if (d2) {
                            cqc0Var.a1();
                        }
                    }
                    cqc0Var.h.invoke(cqc0Var.f);
                    cqc0Var.p = T02;
                    cqc0Var.q = U02;
                    cqc0Var.W0();
                }
            }
        };
    }

    public static ArrayList T0() {
        Set<String> p = g620.f().e().p();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = p.iterator();
        while (it.hasNext()) {
            Long n = arm0.n((String) it.next());
            UserId userId = n != null ? new UserId(n.longValue()) : null;
            if (userId != null) {
                arrayList.add(userId);
            }
        }
        return arrayList;
    }

    public static ArrayList U0() {
        Set<String> c2 = g620.f().e().c();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = c2.iterator();
        while (it.hasNext()) {
            Integer m = arm0.m(10, (String) it.next());
            if (m != null) {
                arrayList.add(m);
            }
        }
        return arrayList;
    }

    public final void S0(izs<? super c, s3q0> izsVar) {
        c cVar = this.o;
        if (cVar == null) {
            return;
        }
        izsVar.invoke(cVar);
    }

    public final void V0() {
        dw20 dw20Var;
        WeakReference<dw20> weakReference = this.n;
        if (weakReference == null || (dw20Var = weakReference.get()) == null) {
            return;
        }
        dw20Var.hide();
    }

    public final void W0() {
        io.reactivex.rxjava3.disposables.c subscribe;
        com.vk.newsfeed.impl.posting.a aVar = this.l;
        if (aVar == null || (subscribe = com.vk.newsfeed.impl.posting.a.c(aVar, null, this.p, 7).subscribe(new wmz(new nt10(this, 15), 16), new lkz(new xd40(this, 11), 12))) == null) {
            return;
        }
        this.m.b(subscribe);
    }

    public final void X0(PostingVisibilityMode postingVisibilityMode) {
        this.h.invoke(postingVisibilityMode);
        V0();
    }

    public final void Y0(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return;
        }
        this.p = list;
        this.q = list2;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlin.Lazy] */
    public final void Z0(com.vk.core.ui.bottomsheet.internal.b bVar, boolean z) {
        int i;
        int i2;
        int i3;
        Lifecycle lifecycle;
        Context context = this.e;
        if (context instanceof l7s) {
            u0(((l7s) context).getThemeResId());
            l(e3m.f(R.attr.vk_ui_background_content, context));
        }
        v0(R.string.newsfeed_newpost_visibility_dialog_title);
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.view_posting_visibility, (ViewGroup) null, false);
        qxm0.r(inflate);
        PostingVisibilityMode postingVisibilityMode = this.f;
        boolean z2 = postingVisibilityMode == PostingVisibilityMode.ONLY_ME || postingVisibilityMode == PostingVisibilityMode.FRIENDS;
        PostingType postingType = this.g;
        c cVar = new c(context, inflate, postingType, z2);
        int[] iArr = d.$EnumSwitchMapping$0;
        int i4 = iArr[postingType.ordinal()];
        ?? r10 = cVar.l;
        ?? r11 = cVar.k;
        ?? r12 = cVar.j;
        ?? r13 = cVar.y;
        ?? r14 = cVar.x;
        ?? r15 = cVar.z;
        LinearLayout linearLayout = cVar.h;
        if (i4 != 1) {
            LinearLayout linearLayout2 = cVar.i;
            if (i4 == 2) {
                linearLayout.addView(cVar.e());
                linearLayout.addView(cVar.d());
                linearLayout.addView(cVar.c());
                linearLayout.addView(cVar.f());
                linearLayout.addView(cVar.g());
                linearLayout2.addView(cVar.b());
                linearLayout2.addView((View) r15.getValue());
                linearLayout2.addView((ModalSettingsPrivacyOption) r14.getValue());
                linearLayout2.addView((ModalSettingsPrivacyOption) r13.getValue());
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                linearLayout.addView(cVar.e());
                linearLayout.addView(cVar.d());
                linearLayout.addView(cVar.c());
                linearLayout.addView(cVar.f());
                linearLayout.addView(cVar.g());
                linearLayout2.addView(cVar.b());
                linearLayout2.addView((View) r15.getValue());
                linearLayout2.addView((ModalSettingsPrivacyOption) r14.getValue());
                linearLayout2.addView((ModalSettingsPrivacyOption) r13.getValue());
            }
        } else {
            linearLayout.addView((ModalSettingsPrivacyOption) r12.getValue());
            linearLayout.addView((ModalSettingsPrivacyOption) r11.getValue());
            linearLayout.addView((ModalSettingsPrivacyOption) r10.getValue());
            linearLayout.addView(cVar.a());
        }
        ((ModalSettingsPrivacyOption) r12.getValue()).setOnClickListener(new be6(this, 9));
        cVar.b().setOnClickListener(new q01(this, 12));
        ((ModalSettingsPrivacyOption) r11.getValue()).setOnClickListener(new wz5(this, 9));
        ((ModalSettingsPrivacyOption) r14.getValue()).setOnClickListener(new xz5(this, 12));
        ((ModalSettingsPrivacyOption) r10.getValue()).setOnClickListener(new s01(this, 10));
        ((ModalSettingsPrivacyOption) cVar.A.getValue()).setOnClickListener(new u01(this, 13));
        ((ModalSettingsPrivacyOption) r13.getValue()).setOnClickListener(new v01(this, 8));
        ((View) r15.getValue()).setOnClickListener(new a06(this, 9));
        cVar.e().setOnClickListener(new i1(this, 8));
        cVar.d().setOnClickListener(new x01(this, 5));
        cVar.f().setOnClickListener(new a50(this, 8));
        View view = cVar.n;
        TextView textView = (TextView) view.findViewById(R.id.close_profile_go_to_settings);
        int dimension = (int) textView.getContext().getResources().getDimension(R.dimen.clips_privacy_bottomsheet_unavailable_title_increase_zine_size);
        if (textView.getParent() == null) {
            b7l.a("You can't increase click area without parent view");
        } else {
            fvr.o(dimension, textView);
        }
        bwt0.i0(textView, new d50(18, this, cVar));
        TextView textView2 = (TextView) view.findViewById(R.id.close_profile_description);
        int i5 = iArr[postingType.ordinal()];
        if (i5 == 1 || i5 == 2) {
            i = R.string.clips_privacy_descirption_title_for_users;
        } else {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.clips_live_recording_privacy_description_title_for_users;
        }
        textView2.setText(i);
        int i6 = iArr[postingType.ordinal()];
        if (i6 == 1 || i6 == 2) {
            i2 = R.string.newsfeed_new_clip_visibility_not_available;
        } else {
            if (i6 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.string.newsfeed_live_recording_visibility_not_available;
        }
        cVar.o.setText(i2);
        int i7 = iArr[postingType.ordinal()];
        if (i7 == 1 || i7 == 2) {
            i3 = R.string.newsfeed_new_clip_visibility_available;
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = R.string.newsfeed_live_recording_visibility_available;
        }
        cVar.p.setText(i3);
        cVar.c().setOnClickListener(new qa6(this, 7));
        cVar.g().setOnClickListener(new ra6(this, 6));
        cVar.g.setOnClickListener(new sa6(this, 8));
        bwt0.i0(cVar.a(), new f410(this, 25));
        bwt0.i0((ModalSettingsPrivacyOption) cVar.B.getValue(), new hb40(this, 13));
        cVar.D.setRetryAction(new qbc0(this, 2));
        this.o = cVar;
        D0(inflate, z);
        c(bVar);
        a0(new fr20(this, 22));
        WeakReference<dw20> weakReference = new WeakReference<>(I0(v));
        this.n = weakReference;
        dw20 dw20Var = weakReference.get();
        if (dw20Var != null && (lifecycle = dw20Var.getLifecycle()) != null) {
            lifecycle.addObserver(new fqc0(this, 0));
        }
        ComponentCallbacks2 h = e3m.h(this.c);
        aeg0 aeg0Var = h instanceof aeg0 ? (aeg0) h : null;
        if (aeg0Var != null) {
            aeg0Var.Li(this.u);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    public final void a1() {
        ModalSettingsPrivacyOption modalSettingsPrivacyOption;
        ModalSettingsPrivacyOption modalSettingsPrivacyOption2;
        c cVar = this.o;
        if (cVar != null) {
            bwt0.p0((View) cVar.z.getValue(), false);
        }
        c cVar2 = this.o;
        if (cVar2 != null && (modalSettingsPrivacyOption2 = (ModalSettingsPrivacyOption) cVar2.x.getValue()) != null) {
            d3m.c(modalSettingsPrivacyOption2, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        c cVar3 = this.o;
        if (cVar3 == null || (modalSettingsPrivacyOption = (ModalSettingsPrivacyOption) cVar3.y.getValue()) == null) {
            return;
        }
        d3m.c(modalSettingsPrivacyOption, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void b1(boolean z) {
        Z0(z ? new a470() : new cpo(false, 0, 5), !z);
        W0();
    }
}
