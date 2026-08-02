package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.transition.AutoTransition;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollOption;
import com.vk.feed.tool.view.newsfeed.attach.PrimaryAttachmentLayout;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.common.views.PrimaryAttachmentPollV2View;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.polls.entities.exceptions.UserAlreadyVotedException;
import com.vk.polls.entities.exceptions.UserDidntVoteException;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import xsna.crb0;
import xsna.l7x0;
import xsna.oqb0;
import xsna.oqb0.a;

/* compiled from: PrimaryAttachmentPollV2Holder.kt */
/* loaded from: classes4.dex */
public final class b7d0 extends m56<PollAttachment> implements w8i {
    public static final /* synthetic */ int P = 0;
    public final umb0 D;
    public final vmb0 E;
    public final ine0 F;
    public final fai G;
    public final PrimaryAttachmentLayout H;
    public final PrimaryAttachmentPollV2View I;
    public final Object J;
    public final gzs<a> K;
    public final izs<Integer, Boolean> L;
    public final bsb0 M;
    public final View.OnClickListener N;
    public final View.OnClickListener O;

    /* compiled from: PrimaryAttachmentPollV2Holder.kt */
    public static final class a implements asb0 {
        public static final Handler d = new Handler();
        public final PollAttachment b;
        public final p870 c;

        public a(PollAttachment pollAttachment, p870 p870Var) {
            this.b = pollAttachment;
            this.c = p870Var;
        }

        @Override // xsna.asb0
        public final void b0(Poll poll) {
            PollAttachment pollAttachment = this.b;
            Poll poll2 = pollAttachment.f;
            if (poll2.b == poll.b && epx.f(poll2.c, poll.c)) {
                pollAttachment.f = poll;
                ysg0.b.a(new zrb0(poll));
                d.postDelayed(new tv9(this, 10), 600L);
            }
        }
    }

    /* compiled from: PrimaryAttachmentPollV2Holder.kt */
    public static final class b implements rv2 {
        public b() {
        }

        @Override // xsna.rv2
        public final boolean a(PollOption pollOption) {
            b7d0 b7d0Var = b7d0.this;
            lad0 e7 = b7d0Var.e7();
            if (e7 == null) {
                return false;
            }
            Poll poll = (Poll) e7.y.b;
            if (!poll.Ab() || !poll.e.contains(Long.valueOf(pollOption.b))) {
                return false;
            }
            l7x0.e eVar = l7x0.e.a;
            ine0 ine0Var = b7d0Var.F;
            nvl nvlVar = new nvl(eVar, e7, b7d0Var.D, b7d0Var, b7d0Var.K, b7d0Var.L);
            ine0Var.getClass();
            nvlVar.a();
            return true;
        }

        @Override // xsna.rv2
        public final void b(long j, boolean z) {
            b7d0 b7d0Var = b7d0.this;
            lad0 e7 = b7d0Var.e7();
            if (e7 == null) {
                return;
            }
            m7x0 m7x0Var = e7.I;
            l7x0 l7x0Var = m7x0Var.a;
            if (l7x0Var instanceof l7x0.c) {
                if (z) {
                    ((l7x0.c) l7x0Var).a.add(Long.valueOf(j));
                } else {
                    l7x0.c cVar = (l7x0.c) l7x0Var;
                    cVar.a.remove(Long.valueOf(j));
                    if (cVar.a.isEmpty()) {
                        m7x0Var.a = l7x0.b.a;
                    }
                }
            } else if (z) {
                m7x0Var.a = new l7x0.c(izi0.i(Long.valueOf(j)));
            }
            TransitionManager.beginDelayedTransition(b7d0Var.I, new Fade().setInterpolator(qq2.f).setDuration(200L));
            b7d0Var.f7(true);
        }

        @Override // xsna.rv2
        public final void c(smb0 smb0Var, PollOption pollOption) {
            b7d0 b7d0Var = b7d0.this;
            lad0 e7 = b7d0Var.e7();
            if (e7 == null) {
                return;
            }
            mkl mklVar = e7.y;
            Poll poll = (Poll) mklVar.b;
            int i = 1;
            if (!poll.Bb()) {
                b7d0Var.J0();
                vmb0 vmb0Var = b7d0Var.E;
                Context context = b7d0Var.itemView.getContext();
                vmb0Var.getClass();
                new PollResultsFragment.a((Poll) mklVar.b, true).k(context);
                return;
            }
            if (poll.Ib()) {
                smb0Var.g.toggle();
                return;
            }
            ine0 ine0Var = b7d0Var.F;
            np0 np0Var = new np0(new l7x0.a(pollOption.b), e7, b7d0Var.D, b7d0Var, b7d0Var.K, b7d0Var.L);
            ine0Var.getClass();
            lad0 lad0Var = np0Var.b;
            m7x0 m7x0Var = lad0Var.I;
            l7x0.a aVar = np0Var.a;
            m7x0Var.a = aVar;
            int i2 = b7d0.P;
            b7d0 b7d0Var2 = np0Var.d;
            b7d0Var2.f7(false);
            mkl mklVar2 = lad0Var.y;
            Poll poll2 = (Poll) mklVar2.b;
            UserId userId = poll2.c;
            int i3 = poll2.b;
            boolean z = poll2.j;
            String str = (String) mklVar2.c;
            String str2 = (String) mklVar2.d;
            long j = aVar.a;
            String str3 = (String) mklVar2.e;
            wmb0 wmb0Var = np0Var.c.a;
            io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new rtb0(userId, str, str2, z, Collections.singletonList(Long.valueOf(j)), i3, str3), null, null, 3);
            w00 w00Var = new w00(new tl0(np0Var, i), 1);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            b7d0Var2.j7(new io.reactivex.rxjava3.internal.operators.observable.i0(y0.E(w00Var, lVar, kVar, kVar), new lp0(new com.vk.movika.sdk.base.hooks.p(np0Var, 3), 0))).subscribe(new vl0(new s6(np0Var, 2), i), new mp0(new wl0(np0Var, i), 0));
        }
    }

    /* compiled from: PrimaryAttachmentPollV2Holder.kt */
    public static final class c implements PrimaryAttachmentPollV2View.b {
        public c() {
        }

        @Override // com.vk.newsfeed.common.views.PrimaryAttachmentPollV2View.b
        public final void a(boolean z) {
            u1c0 J0;
            b7d0 b7d0Var = b7d0.this;
            vmb0 vmb0Var = b7d0Var.E;
            lad0 e7 = b7d0Var.e7();
            if (e7 == null) {
                return;
            }
            mkl mklVar = e7.y;
            if (!e7.l) {
                Context context = b7d0Var.itemView.getContext();
                vmb0Var.getClass();
                new PollResultsFragment.a((Poll) mklVar.b, true).k(context);
                return;
            }
            if (!z || (J0 = b7d0Var.J0()) == null) {
                return;
            }
            Context context2 = b7d0Var.itemView.getContext();
            vmb0Var.getClass();
            final oqb0 oqb0Var = new oqb0(context2, e7, J0, null);
            final oqb0.a aVar = oqb0Var.new a();
            ComponentCallbacks2 h = e3m.h(context2);
            if (h instanceof ey50) {
                ((ey50) h).Y().S(aVar);
            }
            crb0.a aVar2 = new crb0.a(context2, e7, J0);
            aVar2.Z(new DialogInterface.OnDismissListener() { // from class: xsna.mqb0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    oqb0 oqb0Var2 = oqb0.this;
                    ComponentCallbacks2 h2 = e3m.h(oqb0Var2.a);
                    if (h2 instanceof ey50) {
                        ((ey50) h2).Y().H(aVar);
                    }
                    oqb0Var2.b = null;
                }
            });
            crb0 crb0Var = new crb0(aVar2.c, aVar2.e, aVar2.f);
            aVar2.D0(crb0Var, false);
            aVar2.c(new cpo(false, 0, 7));
            aVar2.F0(true);
            aVar2.u(0);
            aVar2.x(0);
            aVar2.I(true);
            dw20 I0 = aVar2.I0(null);
            crb0Var.setOnButtonClickListener(new jsk(I0, 9));
            oqb0Var.b = I0;
        }
    }

    public b7d0(crb0 crb0Var, tvb0 tvb0Var, crb0 crb0Var2) {
        super(crb0Var2);
        this.D = new umb0();
        vmb0 vmb0Var = new vmb0();
        this.E = vmb0Var;
        this.F = new ine0();
        this.G = new fai();
        this.H = (PrimaryAttachmentLayout) this.itemView.findViewById(R.id.attach);
        PrimaryAttachmentPollV2View primaryAttachmentPollV2View = (PrimaryAttachmentPollV2View) this.itemView.findViewById(R.id.poll_view);
        this.I = primaryAttachmentPollV2View;
        this.J = msy.a(LazyThreadSafetyMode.NONE, new s1x(this, 29));
        this.K = new tzv(this, 29);
        this.L = new zl20(this, 23);
        this.M = new bsb0(this.itemView.getContext(), vmb0Var);
        b bVar = new b();
        x01 x01Var = new x01(this, 6);
        this.N = x01Var;
        k1 k1Var = new k1(this, 11);
        this.O = k1Var;
        c cVar = new c();
        primaryAttachmentPollV2View.setAnswersListener(bVar);
        primaryAttachmentPollV2View.setActionsClickListener(x01Var);
        primaryAttachmentPollV2View.setMultipleVoteButtonClickListener(k1Var);
        primaryAttachmentPollV2View.setPollViewClickListener(cVar);
        primaryAttachmentPollV2View.setActionsVisible(true);
        primaryAttachmentPollV2View.setPool(tvb0Var);
    }

    public static void X6(b7d0 b7d0Var) {
        lad0 e7 = b7d0Var.e7();
        if (e7 == null) {
            return;
        }
        l7x0 l7x0Var = e7.I.a;
        if (e7.J.f.Ib() && (l7x0Var instanceof l7x0.c)) {
            l7x0.d dVar = new l7x0.d(j5g.O0(((l7x0.c) l7x0Var).a));
            ine0 ine0Var = b7d0Var.F;
            pp0 pp0Var = new pp0(dVar, e7, b7d0Var.D, b7d0Var, b7d0Var.K, b7d0Var.L);
            ine0Var.getClass();
            lad0 lad0Var = pp0Var.b;
            m7x0 m7x0Var = lad0Var.I;
            l7x0.d dVar2 = pp0Var.a;
            m7x0Var.a = dVar2;
            b7d0 b7d0Var2 = pp0Var.d;
            b7d0Var2.f7(false);
            mkl mklVar = lad0Var.y;
            Poll poll = (Poll) mklVar.b;
            UserId userId = poll.c;
            int i = poll.b;
            boolean z = poll.j;
            String str = (String) mklVar.c;
            String str2 = (String) mklVar.d;
            List<Long> list = dVar2.a;
            String str3 = (String) mklVar.e;
            wmb0 wmb0Var = pp0Var.c.a;
            io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new rtb0(userId, str, str2, z, list, i, str3), null, null, 3);
            ga gaVar = new ga(new com.vk.movika.sdk.base.logic.interactor.d(pp0Var, 3), 2);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            b7d0Var2.j7(new io.reactivex.rxjava3.internal.operators.observable.i0(y0.E(gaVar, lVar, kVar, kVar), new op0(new ha(pp0Var, 2), 0))).subscribe(new zl0(new ka(pp0Var, 3), 1), new j50(new b7(2, pp0Var, mklVar), 2));
        }
    }

    public static void Y6(b7d0 b7d0Var, View view) {
        lad0 e7 = b7d0Var.e7();
        if (e7 == null) {
            return;
        }
        mkl mklVar = e7.y;
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        view.getContext();
        e.b bVar = new e.b(view, null, null, l, 6);
        bVar.w = R.layout.ds_internal_context_menu_item;
        Poll poll = (Poll) mklVar.b;
        if (poll.Ab()) {
            VkContextMenu.c.c(bVar, R.string.poll_cancel_vote, null, false, null, new rs0(14, b7d0Var, e7), 30);
        }
        if (poll.q) {
            VkContextMenu.c.c(bVar, R.string.poll_sharing, null, false, null, new com.vk.movika.sdk.base.flow.binding.j(22, b7d0Var, mklVar), 30);
        }
        VkContextMenu.c.c(bVar, R.string.poll_copy_link, null, false, null, new pw(27, b7d0Var, mklVar), 30);
        if (poll.p) {
            VkContextMenu.c.c(bVar, R.string.poll_report_content, null, false, null, new com.vk.movika.sdk.base.flow.binding.l(16, b7d0Var, mklVar), 30);
        }
        bVar.j();
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        PrimaryAttachmentPollV2View primaryAttachmentPollV2View = this.I;
        primaryAttachmentPollV2View.getClass();
        View.OnClickListener onClickListener = s6oVar.e;
        primaryAttachmentPollV2View.p = s6oVar.a(primaryAttachmentPollV2View, onClickListener);
        primaryAttachmentPollV2View.q = s6oVar.a(primaryAttachmentPollV2View.C, onClickListener);
        primaryAttachmentPollV2View.c();
    }

    @Override // xsna.m56
    public final void T6(PollAttachment pollAttachment) {
        c7(false);
    }

    public final void b7(Poll poll) {
        lad0 e7 = e7();
        if (e7 == null) {
            return;
        }
        PollAttachment pollAttachment = e7.J;
        Poll poll2 = pollAttachment.f;
        if (poll2.b == poll.b && epx.f(poll2.c, poll.c)) {
            pollAttachment.f = poll;
        }
        f7(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c7(boolean z) {
        ColorStateList colorStateList;
        int i;
        int c2;
        boolean z2;
        String str;
        Iterator it;
        boolean z3;
        Iterator it2;
        int c3;
        int i2;
        int[] iArr;
        Drawable drawable;
        lad0 lad0Var;
        int f;
        Drawable newDrawable;
        int f2 = l8g.f(0.84f, -1);
        u1c0 J0 = J0();
        ol60 ol60Var = J0 != null ? J0.h : null;
        if (ol60Var instanceof lad0) {
            lad0 lad0Var2 = (lad0) ol60Var;
            Poll poll = (Poll) lad0Var2.y.b;
            this.G.getClass();
            PollBackground pollBackground = poll.s;
            if (poll.Fb()) {
                colorStateList = null;
            } else {
                int c4 = dhr0.t.c(R.attr.vk_ui_icon_tertiary);
                colorStateList = new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_enabled}}, new int[]{c4, c4});
            }
            int c5 = poll.Fb() ? -1 : dhr0.t.c(R.attr.vk_ui_text_muted);
            int c6 = poll.Fb() ? f2 : dhr0.t.c(R.attr.vk_ui_text_secondary);
            Integer valueOf = pollBackground != null ? null : Integer.valueOf(dhr0.t.c(R.attr.vk_ui_vkontakte_color_snippet_background));
            int color = pollBackground != null ? e43.a.getColor(R.color.vk_gray_800) : dhr0.t.c(R.attr.vk_ui_text_primary);
            if (poll.Fb()) {
                i = -1;
                c2 = e43.a.getColor(R.color.vk_gray_800);
            } else {
                i = -1;
                c2 = dhr0.t.c(R.attr.vk_ui_text_primary);
            }
            int c7 = poll.Fb() ? i : dhr0.t.c(R.attr.vk_ui_stroke_accent);
            if (!poll.Fb()) {
                f2 = dhr0.t.c(R.attr.vk_ui_text_secondary);
            }
            PrimaryAttachmentPollV2View primaryAttachmentPollV2View = this.I;
            primaryAttachmentPollV2View.setShowResultsButtonTextColor(color);
            primaryAttachmentPollV2View.setAnswersFadingColor(valueOf);
            primaryAttachmentPollV2View.setActionsImageTintList(colorStateList);
            primaryAttachmentPollV2View.setTitleViewTextColor(c5);
            primaryAttachmentPollV2View.setMultipleProgressColor(c7);
            primaryAttachmentPollV2View.setVotesCountTextColor(f2);
            primaryAttachmentPollV2View.setMultipleVoteButtonTextColor(c2);
            primaryAttachmentPollV2View.setInfoTextColor(c6);
            s1c0 s1c0Var = this.x;
            boolean z4 = true;
            this.H.setHeightMatchContent(s1c0Var != null && s1c0Var.k);
            s1c0 s1c0Var2 = this.x;
            primaryAttachmentPollV2View.setMode((s1c0Var2 == null || !s1c0Var2.k) ? PrimaryAttachmentPollV2View.Mode.AT_MOST_SQUARE : PrimaryAttachmentPollV2View.Mode.UNSPECIFIED);
            mkq0 mkq0Var = lad0Var2.z;
            int i3 = lad0Var2.j;
            mkq0Var.c = this.M;
            primaryAttachmentPollV2View.setCanVote(lad0Var2.l);
            primaryAttachmentPollV2View.setAnswersCount(i3);
            VKImageView vKImageView = primaryAttachmentPollV2View.d;
            vKImageView.clear();
            vKImageView.setImageBitmap(null);
            primaryAttachmentPollV2View.setBackgroundDrawableFactory(lad0Var2.A);
            primaryAttachmentPollV2View.setBackgroundBackgroundDrawable(lad0Var2.B);
            lad0 e7 = e7();
            if (e7 == null || !e7.H) {
                sr10 sr10Var = dy2.a;
                if (!(sr10Var != null ? sr10Var.c() : true)) {
                    z2 = true;
                    str = !z2 ? lad0Var2.D : lad0Var2.C;
                    if (str != null || str.length() == 0) {
                        primaryAttachmentPollV2View.setBackgroundUrl(str);
                    } else {
                        Drawable drawable2 = lad0Var2.E;
                        if (drawable2 != null) {
                            primaryAttachmentPollV2View.setBackgroundImageDrawable(drawable2);
                        } else {
                            primaryAttachmentPollV2View.setBackgroundImageResource(lad0Var2.F);
                        }
                    }
                    primaryAttachmentPollV2View.setShowResultsButtonDynamicBackgroundResource(lad0Var2.p);
                    primaryAttachmentPollV2View.setActionsImageResourceId(lad0Var2.h);
                    primaryAttachmentPollV2View.setTitleViewText(lad0Var2.m);
                    primaryAttachmentPollV2View.setShowResultButtonText(lad0Var2.o);
                    primaryAttachmentPollV2View.setAnswersViewCount(i3);
                    primaryAttachmentPollV2View.setAnswersEnabled(lad0Var2.i);
                    it = lad0Var2.k.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            e43.t();
                            throw null;
                        }
                        tmb0 tmb0Var = (tmb0) next;
                        smb0 a2 = primaryAttachmentPollV2View.a(i4);
                        if (a2 == null) {
                            it2 = it;
                            lad0Var = lad0Var2;
                            z3 = z4;
                            i2 = i5;
                        } else {
                            a2.setAnswerUiDto(tmb0Var);
                            a2.setMupltipleChoiceChecked(tmb0Var.f);
                            a2.setMultipleChoiceAnimationEnabled(z);
                            a2.setMultipleChoiceVisibility(tmb0Var.g);
                            ProgressBar progressBar = a2.h;
                            rqb0 rqb0Var = a2.i;
                            z3 = z4;
                            TextView textView = a2.e;
                            PollOption pollOption = tmb0Var.b;
                            Poll poll2 = tmb0Var.c;
                            TextView textView2 = a2.f;
                            a2.d.getClass();
                            boolean Fb = poll2.Fb();
                            if (poll2.Fb()) {
                                it2 = it;
                                c3 = i;
                            } else {
                                it2 = it;
                                c3 = dhr0.t.c(R.attr.vk_ui_text_primary);
                            }
                            int i6 = i4;
                            int[][] iArr2 = {new int[]{-16842912}, new int[]{android.R.attr.state_checked}};
                            if (Fb) {
                                iArr = new int[2];
                                iArr[0] = i;
                                iArr[z3 ? 1 : 0] = i;
                                i2 = i5;
                            } else {
                                int[] iArr3 = new int[2];
                                abg0 abg0Var = dhr0.t;
                                i2 = i5;
                                iArr3[0] = abg0Var.c(R.attr.vk_ui_icon_tertiary);
                                iArr3[z3 ? 1 : 0] = abg0Var.c(R.attr.vk_ui_icon_accent);
                                iArr = iArr3;
                            }
                            ColorStateList colorStateList2 = new ColorStateList(iArr2, iArr);
                            lad0 lad0Var3 = lad0Var2;
                            if (poll2.e.contains(Long.valueOf(pollOption.b))) {
                                Drawable.ConstantState constantState = m33.a(R.drawable.vk_icon_done_16, e43.a).getConstantState();
                                drawable = (constantState == null || (newDrawable = constantState.newDrawable()) == null) ? null : newDrawable.mutate();
                                if (drawable != null) {
                                    drawable.setTint(Fb ? i : dhr0.t.c(R.attr.vk_ui_icon_accent));
                                }
                            } else {
                                drawable = null;
                            }
                            int c8 = Fb ? i : dhr0.t.c(R.attr.vk_ui_text_primary);
                            float f3 = pollOption.e;
                            float Gb = poll2.Gb();
                            boolean Jb = poll2.Jb();
                            int f4 = Fb ? (f3 == Gb && Jb) ? 1728053247 : 1040187391 : (f3 == Gb && Jb) ? l8g.f(0.22f, dhr0.t.c(R.attr.vk_ui_background_accent_themed)) : l8g.f(0.16f, dhr0.t.c(R.attr.vk_ui_background_accent_themed));
                            if (Fb) {
                                f = 536870911;
                                lad0Var = lad0Var3;
                            } else {
                                lad0Var = lad0Var3;
                                f = l8g.f(0.1f, dhr0.t.c(R.attr.vk_ui_background_accent_themed));
                            }
                            int c9 = Fb ? i : dhr0.t.c(R.attr.vk_ui_stroke_accent);
                            a2.g.setButtonTintList(colorStateList2);
                            textView.setTextColor(c3);
                            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setTextColor(c8);
                            rqb0Var.b = f;
                            rqb0Var.a = f4;
                            progressBar.getIndeterminateDrawable().setColorFilter(c9, PorterDuff.Mode.MULTIPLY);
                            textView.setContentDescription(tmb0Var.e);
                            textView.setText(tmb0Var.d);
                            textView2.setText(tmb0Var.i);
                            textView2.setVisibility(tmb0Var.j);
                            rqb0Var.a(tmb0Var.l, z);
                            progressBar.setVisibility(tmb0Var.h);
                            a2.setForeground(tmb0Var.k);
                            f4m.t(i6 != 0 ? cn70.b(12) : 0, a2);
                            f4m.s(0, a2);
                            f4m.r(0, a2);
                            View.OnClickListener onClickListener = primaryAttachmentPollV2View.q;
                            if (onClickListener == null) {
                                onClickListener = primaryAttachmentPollV2View.C;
                            }
                            a2.setOnClickListener(onClickListener);
                            a2.setOnLongClickListener(primaryAttachmentPollV2View.D);
                            a2.setOnAnswerCheckedListener(primaryAttachmentPollV2View.B);
                            boolean z5 = (!primaryAttachmentPollV2View.t || primaryAttachmentPollV2View.x) ? false : z3 ? 1 : 0;
                            boolean z6 = primaryAttachmentPollV2View.G;
                            a2.setEnabled(z5);
                            a2.setClickable((z5 && z6) ? z3 ? 1 : 0 : false);
                            a2.setLongClickable(z5);
                            a2.setMultipleChoiceClickable(z5);
                        }
                        z4 = z3;
                        it = it2;
                        lad0Var2 = lad0Var;
                        i4 = i2;
                    }
                    lad0 lad0Var4 = lad0Var2;
                    primaryAttachmentPollV2View.setMultipleProgressVisibility(lad0Var4.x);
                    primaryAttachmentPollV2View.setVotesCountText(lad0Var4.t);
                    primaryAttachmentPollV2View.setVotesCountVisibility(lad0Var4.s);
                    primaryAttachmentPollV2View.setFriendsPhotosVisible(lad0Var4.u);
                    primaryAttachmentPollV2View.setFriendsPhotos(lad0Var4.v);
                    primaryAttachmentPollV2View.setMultipleVoteButtonVisibility(lad0Var4.q);
                    primaryAttachmentPollV2View.setMultipleVoteButtonDynamicBackgroundResource(lad0Var4.r);
                    primaryAttachmentPollV2View.setForegroundDrawable(lad0Var4.w);
                    primaryAttachmentPollV2View.setInfoText(lad0Var4.n);
                }
            }
            z2 = false;
            if (!z2) {
            }
            if (str != null || str.length() == 0) {
            }
            primaryAttachmentPollV2View.setShowResultsButtonDynamicBackgroundResource(lad0Var2.p);
            primaryAttachmentPollV2View.setActionsImageResourceId(lad0Var2.h);
            primaryAttachmentPollV2View.setTitleViewText(lad0Var2.m);
            primaryAttachmentPollV2View.setShowResultButtonText(lad0Var2.o);
            primaryAttachmentPollV2View.setAnswersViewCount(i3);
            primaryAttachmentPollV2View.setAnswersEnabled(lad0Var2.i);
            it = lad0Var2.k.iterator();
            int i42 = 0;
            while (it.hasNext()) {
            }
            lad0 lad0Var42 = lad0Var2;
            primaryAttachmentPollV2View.setMultipleProgressVisibility(lad0Var42.x);
            primaryAttachmentPollV2View.setVotesCountText(lad0Var42.t);
            primaryAttachmentPollV2View.setVotesCountVisibility(lad0Var42.s);
            primaryAttachmentPollV2View.setFriendsPhotosVisible(lad0Var42.u);
            primaryAttachmentPollV2View.setFriendsPhotos(lad0Var42.v);
            primaryAttachmentPollV2View.setMultipleVoteButtonVisibility(lad0Var42.q);
            primaryAttachmentPollV2View.setMultipleVoteButtonDynamicBackgroundResource(lad0Var42.r);
            primaryAttachmentPollV2View.setForegroundDrawable(lad0Var42.w);
            primaryAttachmentPollV2View.setInfoText(lad0Var42.n);
        }
    }

    public final void d7(Poll poll) {
        lad0 e7 = e7();
        if (e7 == null) {
            return;
        }
        PollAttachment pollAttachment = e7.J;
        Poll poll2 = pollAttachment.f;
        if (poll2.b == poll.b && epx.f(poll2.c, poll.c)) {
            pollAttachment.f = poll;
        }
        vvr0.c();
        PrimaryAttachmentPollV2View primaryAttachmentPollV2View = this.I;
        AnimatorSet animatorSet = primaryAttachmentPollV2View.o;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Transition duration = new AutoTransition().excludeTarget((View) primaryAttachmentPollV2View.b, true).excludeChildren((View) primaryAttachmentPollV2View.h, true).setInterpolator(qq2.f).setDuration(200L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        int i = primaryAttachmentPollV2View.H;
        for (int i2 = 0; i2 < i; i2++) {
            smb0 a2 = primaryAttachmentPollV2View.a(i2);
            if (a2 != null) {
                Drawable background = a2.getBackground();
                if (background instanceof rqb0) {
                    ((rqb0) background).a(0, false);
                }
                if (bwt0.K(a2)) {
                    TextView textView = a2.f;
                    Transition excludeTarget = duration.excludeTarget((View) textView, true);
                    AppCompatCheckBox appCompatCheckBox = a2.g;
                    excludeTarget.excludeTarget((View) appCompatCheckBox, true).excludeTarget((View) a2.e, true);
                    appCompatCheckBox.setVisibility(4);
                    textView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    textView.setTranslationX(smb0.j);
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_X, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    qq2.g(ofFloat, 2.0f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, 1.0f);
                    ofFloat2.setInterpolator(qq2.f);
                    animatorSet3.playTogether(ofFloat, ofFloat2);
                    animatorSet3.setDuration(600L);
                    arrayList.add(animatorSet3);
                }
            }
        }
        animatorSet2.playTogether(arrayList);
        animatorSet2.start();
        primaryAttachmentPollV2View.o = animatorSet2;
        TransitionManager.beginDelayedTransition(primaryAttachmentPollV2View, duration);
        f7(true);
    }

    public final lad0 e7() {
        u1c0 J0 = J0();
        ol60 ol60Var = J0 != null ? J0.h : null;
        if (ol60Var instanceof lad0) {
            return (lad0) ol60Var;
        }
        return null;
    }

    public final void f7(boolean z) {
        lad0 e7 = e7();
        if (e7 == null) {
            return;
        }
        ol60 ol60Var = (ol60) j5g.a0(new nad0().a(0, new Triple(e7.J, e7.G, e7.I)));
        u1c0 J0 = J0();
        if (J0 != null) {
            J0.h = ol60Var;
        }
        c7(z);
    }

    public final void h7(l7x0 l7x0Var) {
        m7x0 m7x0Var;
        lad0 e7 = e7();
        if (e7 == null || (m7x0Var = e7.I) == null) {
            return;
        }
        m7x0Var.a = l7x0Var;
    }

    public final void i7(Throwable th) {
        Integer valueOf = th instanceof UserAlreadyVotedException ? Integer.valueOf(R.string.poll_user_already_voted) : th instanceof UserDidntVoteException ? Integer.valueOf(R.string.poll_user_didnt_vote) : null;
        if (valueOf != null) {
            enj.q(valueOf.intValue(), 0, vx2.d.getContext());
        } else {
            h03.b(th);
        }
    }

    public final <T> io.reactivex.rxjava3.core.q<T> j7(io.reactivex.rxjava3.core.q<T> qVar) {
        return hg1.m(qVar, this.I.getContext(), 0L, false, 62);
    }

    public b7d0(ViewGroup viewGroup, tvb0<smb0> tvb0Var) {
        super(R.layout.attach_primary_poll_v2, viewGroup);
        this.D = new umb0();
        vmb0 vmb0Var = new vmb0();
        this.E = vmb0Var;
        this.F = new ine0();
        this.G = new fai();
        this.H = (PrimaryAttachmentLayout) this.itemView.findViewById(R.id.attach);
        PrimaryAttachmentPollV2View primaryAttachmentPollV2View = (PrimaryAttachmentPollV2View) this.itemView.findViewById(R.id.poll_view);
        this.I = primaryAttachmentPollV2View;
        this.J = msy.a(LazyThreadSafetyMode.NONE, new s1x(this, 29));
        this.K = new tzv(this, 29);
        this.L = new zl20(this, 23);
        this.M = new bsb0(this.itemView.getContext(), vmb0Var);
        b bVar = new b();
        x01 x01Var = new x01(this, 6);
        this.N = x01Var;
        k1 k1Var = new k1(this, 11);
        this.O = k1Var;
        c cVar = new c();
        primaryAttachmentPollV2View.setAnswersListener(bVar);
        primaryAttachmentPollV2View.setActionsClickListener(x01Var);
        primaryAttachmentPollV2View.setMultipleVoteButtonClickListener(k1Var);
        primaryAttachmentPollV2View.setPollViewClickListener(cVar);
        primaryAttachmentPollV2View.setActionsVisible(true);
        primaryAttachmentPollV2View.setPool(tvb0Var);
    }
}
