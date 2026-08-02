package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkFadeText;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.im.ImageList;
import com.vk.im.design.view.counter.ImVkCounter;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.views.avatars.VkImAvatar;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.Pair;
import xsna.egm;
import xsna.gko;

/* compiled from: DialogItemViewRedesignDelegate.kt */
/* loaded from: classes2.dex */
public final class hgm extends egm {
    public final Object K;
    public final bpn0 L;
    public a M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object a0;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public final int e0;
    public final int f0;
    public final int g0;
    public final int h0;
    public final int i0;
    public final int j0;
    public final int k0;
    public final int l0;
    public final int m0;
    public final int n0;
    public final int o0;
    public final int p0;
    public final int q0;
    public final int r0;
    public final int s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final float w0;

    /* compiled from: DialogItemViewRedesignDelegate.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a() {
            this(false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RightTopBadgeState(isBirthday=");
            sb.append(this.a);
            sb.append(", isCallActive=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* compiled from: DialogItemViewRedesignDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ImStoryState.values().length];
            try {
                iArr[ImStoryState.SEEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImStoryState.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DialogItemView.ExtraIcon.values().length];
            try {
                iArr2[DialogItemView.ExtraIcon.BOMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DialogItemView.ExtraIcon.MENTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DialogItemView.ExtraIcon.PIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DialogItemView.ExtraIcon.DRAG.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public hgm(AttributeSet attributeSet, ViewGroup viewGroup) {
        super(attributeSet, viewGroup);
        this.K = egm.a.j("DialogItemView.composingDrawable", new maj(this, 2));
        this.L = new bpn0(new foi(this, 3));
        this.M = new a(false, false);
        this.N = egm.a.j("DialogItemView.lazyImageStatusView", new t9b(7, this, viewGroup));
        this.O = egm.a.j("DialogItemView.lazyMutedView", new pk(8, this, viewGroup));
        this.P = egm.a.j("DialogItemView.lazyHiddenView", new qk(9, this, viewGroup));
        this.Q = egm.a.j("DialogItemView.lazyVerifiedView", new oe5(7, this, viewGroup));
        this.R = egm.a.j("DialogItemView.lazyIconView", new sk(13, this, viewGroup));
        this.S = egm.a.j("DialogItemView.lazyUnreadReactionsView", new tx(11, this, viewGroup));
        this.T = egm.a.j("DialogItemView.lazyWritingDisabledView", new uk(8, this, viewGroup));
        this.U = egm.a.j("DialogItemView.lazyCasperView", new u14(7, this, viewGroup));
        this.V = egm.a.j("DialogItemView.lazySendingView", new com.vk.movika.sdk.base.logic.processor.actions.e(7, this, viewGroup));
        this.W = egm.a.j("DialogItemView.lazyErrorView", new j3(9, this, viewGroup));
        this.X = egm.a.j("DialogItemView.lazyUnreadOutView", new xk(11, this, viewGroup));
        this.Y = egm.a.j("DialogItemView.lazyReplyTextView", new kg(11, this, viewGroup));
        this.Z = egm.a.j("DialogItemView.lazyAttachView", new yk(8, this, viewGroup));
        this.a0 = egm.a.j("DialogItemView.lazyTypingBodyView", new m84(10, this, viewGroup));
        this.b0 = egm.a.j("DialogItemView.lazyTypingIconView", new lb6(9, this, viewGroup));
        this.c0 = egm.a.j("DialogItemView.lazyDonutView", new cy0(10, this, viewGroup));
        this.d0 = egm.a.j("DialogItemView.lazyReadOutView", new dy0(9, this, viewGroup));
        this.e0 = e3m.a(R.dimen.vkim_dialog_list_item_avatar_size, this.d);
        this.f0 = e3m.a(R.dimen.vk_ui_spacing_size2_xs, this.d);
        this.g0 = e3m.a(R.dimen.vk_ui_spacing_size2_xs, this.d);
        this.h0 = e3m.a(R.dimen.vkim_dialog_list_item_verified_icon_size, this.d);
        this.i0 = e3m.a(R.dimen.vk_ui_spacing_size2_xs, this.d);
        this.j0 = e3m.a(R.dimen.vkim_dialog_list_item_extra_icon_size, this.d);
        this.k0 = e3m.a(R.dimen.vkim_dialog_list_item_unread_reactions_icon_size, this.d);
        this.l0 = e3m.a(R.dimen.vkim_dialog_list_item_writing_disabled_icon_size, this.d);
        this.m0 = e3m.a(R.dimen.vkim_dialog_list_item_read_out_icon_size, this.d);
        this.n0 = e3m.a(R.dimen.vkim_dialog_list_item_muted_icon_size, this.d);
        this.o0 = e3m.a(R.dimen.vkim_dialog_list_item_hidden_icon_size, this.d);
        this.p0 = e3m.a(R.dimen.vkim_dialog_list_item_casper_icon_size, this.d);
        this.q0 = e3m.a(R.dimen.vkim_dialog_list_item_donut_icon_size, this.d);
        this.r0 = e3m.a(R.dimen.vkim_dialog_list_item_image_status_icon_size, this.d);
        this.s0 = e3m.a(R.dimen.vkim_dialog_list_item_typing_icon_height, this.d);
        this.t0 = e3m.a(R.dimen.vkim_dialog_list_item_typing_icon_width, this.d);
        this.u0 = e3m.a(R.dimen.vk_ui_spacing_size_l, this.d);
        this.v0 = e3m.a(R.dimen.vkim_dialog_list_item_spacing_size4_xs, this.d);
        this.w0 = -e3m.a(R.dimen.vkim_dialog_list_item_translation_y, this.d);
    }

    public final VkImAvatar A0() {
        return (VkImAvatar) this.L.getValue();
    }

    public final void B0() {
        A0().T0("birthday");
        A0().T0("active_call");
        a aVar = this.M;
        if (aVar.b) {
            VkImAvatar A0 = A0();
            A0.getClass();
            gko.b bVar = gko.Companion;
            A0.Q0(new com.vk.core.view.components.avatar.badge.a(gko.b(R.drawable.vk_icon_phone_circle_fill_green_20, A0.getContext()), true, VkAvatarBadge.Alignment.TopRight, (SizeF) null, "active_call"));
            return;
        }
        if (aVar.a) {
            A0().T0("birthday");
            VkImAvatar A02 = A0();
            A02.getClass();
            gko.b bVar2 = gko.Companion;
            A02.Q0(new com.vk.core.view.components.avatar.badge.a(gko.b(R.drawable.vk_icon_cake_circle_fill_purple_20, A02.getContext()), true, VkAvatarBadge.Alignment.TopRight, (SizeF) null, "birthday"));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.text.VkText>] */
    @Override // xsna.egm
    public final Lazy<VkText> D() {
        return this.a0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    @Override // xsna.egm
    public final Lazy<VkImageSimple> E() {
        return this.b0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    @Override // xsna.egm
    public final Lazy<VkImageSimple> G() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.im.design.view.counter.ImVkCounter>] */
    @Override // xsna.egm
    public final Lazy<ImVkCounter> H() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    @Override // xsna.egm
    public final Lazy<VkImageSimple> I() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    @Override // xsna.egm
    public final Lazy<VkImageSimple> J() {
        return this.T;
    }

    @Override // xsna.egm
    public final void N() {
        VkImAvatar A0 = A0();
        egm.b bVar = this.m;
        int i = (bVar != null ? bVar : null).f;
        if (bVar == null) {
            bVar = null;
        }
        A0.setLayoutParams(egm.W(this, i, bVar.f, 0, 0, e3m.a(R.dimen.vk_ui_spacing_size_xl, A0.getContext()), 0, 44));
    }

    @Override // xsna.egm
    public final void O() {
        m().setId(R.id.dialog_item_message_preview);
        Pair pair = new Pair(Integer.valueOf(R.style.VkUiTypography_ParagraphNormal), Integer.valueOf(R.attr.vk_ui_text_subhead));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        m().setTextAppearance(intValue);
        m().setTextColor(e3m.f(intValue2, this.d));
        m().setMaxTextLines(v());
        if (v() == 1) {
            m().setSingleLine();
        }
        m().setFade(false);
        m().setEllipsize(TextUtils.TruncateAt.END);
        m().setIncludeFontPadding(true);
        m().setLayoutParams(egm.W(this, 0, 0, 0, 0, 0, 0, 63));
        m().setTranslationY(this.w0);
    }

    @Override // xsna.egm
    public final void P() {
        this.m = new egm.b(null, 0, 0, 0, R.attr.vk_ui_text_subhead, this.e0, this.j0, this.i0, this.m0);
    }

    @Override // xsna.egm
    public final void Q() {
        Pair pair = new Pair(Integer.valueOf(R.style.VkUiTypography_FootnoteNormal), Integer.valueOf(R.attr.vk_ui_text_subhead));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        B().setTextAppearance(intValue);
        B().setTextColor(e3m.f(intValue2, this.d));
        B().setSingleLine(true);
        B().setIncludeFontPadding(true);
        B().setLayoutParams(egm.W(this, 0, 0, this.v0, 0, 0, 0, 59));
        B().setTranslationY(this.w0);
    }

    @Override // xsna.egm
    public final void R() {
        C().setId(R.id.dialog_item_title);
        Pair pair = new Pair(Integer.valueOf(R.style.VkUiTypography_Headline1Medium), Integer.valueOf(this.f));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        C().setTextAppearance(intValue);
        C().setTextColor(e3m.f(intValue2, this.d));
        C().setMaxTextLines(1);
        C().setEmojiCompatEnabled(false);
        C().setSingleLine();
        C().setFade(false);
        C().setEllipsize(TextUtils.TruncateAt.END);
        C().setIncludeFontPadding(true);
        C().setLayoutParams(egm.W(this, 0, 0, 0, 0, this.f0, 0, 47));
        C().setTranslationY(this.w0);
    }

    @Override // xsna.egm
    public final void S() {
        ImVkCounter F = F();
        egm.b bVar = this.m;
        if (bVar == null) {
            bVar = null;
        }
        F.setLayoutParams(egm.W(this, 0, 0, bVar.h, 0, 0, 0, 59));
        F().setRenderMode(ImVkCounter.DrawMode.COUNTER);
        F().setSize(VkCounter.Size.Medium);
        Pair pair = new Pair(Integer.valueOf(R.attr.vk_ui_text_contrast_themed), Integer.valueOf(R.attr.vk_ui_background_accent_themed));
        int intValue = ((Number) pair.d()).intValue();
        F().setAppearance(new VkCounter.CounterAppearance.a(((Number) pair.g()).intValue(), intValue));
    }

    @Override // xsna.egm
    public final void T() {
        P();
        Trace.beginSection("DialogItemView.init avatar");
        N();
        Trace.endSection();
        Trace.beginSection("DialogItemView.init title");
        R();
        Trace.endSection();
        Trace.beginSection("DialogItemView.init bodyview");
        O();
        Trace.endSection();
        Trace.beginSection("DialogItemView.init timeview");
        Q();
        Trace.endSection();
        Trace.beginSection("DialogItemView.init unreadInView");
        S();
        Trace.endSection();
        ViewGroup viewGroup = this.b;
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        Trace.beginSection("DialogItemView.init addView");
        viewGroup.addView(A0());
        viewGroup.addView(C());
        viewGroup.addView(m());
        viewGroup.addView(B());
        viewGroup.addView(F());
        Trace.endSection();
    }

    @Override // xsna.egm
    public final void U(int i, int i2, int i3, int i4) {
        VkImAvatar A0 = A0();
        int v0 = bwt0.v0(A0) + i;
        bwt0.u0(A0);
        a(i, i2);
        int u0 = p() == DialogItemView.LinesCount.LINES_2 ? (((bwt0.u0(A0) - M()) - f()) - y0()) / 2 : 0;
        M();
        K(v0, u0 + i2);
        int g = g();
        f();
        e3m.a(R.dimen.vk_ui_spacing_size2_xs, this.d);
        int M = bwt0.M(C()) + C().getBottom();
        int i5 = g + v0;
        d(v0, M);
        w0(v0, M);
        int v02 = i3 - bwt0.v0(B());
        if (i5 > v02) {
            i5 = v02;
        }
        int A = A() + bwt0.M(C()) + C().getBottom();
        int i6 = a2u0.a;
        a2u0.b(i5, A, B());
        int u02 = u0();
        int t0 = t0();
        int i7 = ((i2 + i4) / 2) - (t0 / 2);
        q0(i3 - u02, i7, t0 + i7);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.egm
    public final void V(int i) {
        egm.b bVar = this.m;
        if (bVar == null) {
            bVar = null;
        }
        r0(gp10.c(i - bVar.f, Integer.MIN_VALUE), gp10.c(0, 0));
        int u0 = u0();
        b(gp10.c(i, Integer.MIN_VALUE), gp10.c(0, 0));
        int v0 = bwt0.v0(A0());
        int c = gp10.c((i - u0) - v0, Integer.MIN_VALUE);
        int c2 = gp10.c(0, 0);
        L(c, c2);
        int l = egm.a.l(this.T) + egm.a.l(this.U) + egm.a.l(this.P) + egm.a.l(this.O) + egm.a.l(this.Q) + egm.a.l(this.c0) + egm.a.l(this.N);
        int i2 = this.u0;
        int i3 = a2u0.a;
        a2u0.c(C(), c, l + i2, c2);
        int i4 = (i - v0) - u0;
        e(gp10.c(i4, Integer.MIN_VALUE), gp10.c(0, 0), bwt0.v0(B()) + i2);
        x0(gp10.c(i4, Integer.MIN_VALUE), gp10.c(0, 0));
    }

    @Override // xsna.egm
    public final void Y(ImageList imageList, Drawable drawable, boolean z) {
        VkImAvatar A0 = A0();
        qcy<Object>[] qcyVarArr = VkImAvatar.z;
        A0.Z0(imageList, drawable);
    }

    @Override // xsna.egm
    public final void Z(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo) {
        VkImAvatar.a1(A0(), dialog, profilesSimpleInfo, 12);
    }

    @Override // xsna.egm
    public final void a(int i, int i2) {
        int i3 = a2u0.a;
        a2u0.a(bwt0.N(A0()) + i, bwt0.P(A0()) + i2, A0());
    }

    @Override // xsna.egm
    public final void a0(View.OnClickListener onClickListener) {
        VkImAvatar A0 = A0();
        bwt0.h0(onClickListener, A0);
        A0.setClickable(onClickListener != null);
    }

    @Override // xsna.egm
    public final void b(int i, int i2) {
        int i3 = a2u0.a;
        a2u0.c(A0(), i, 0, i2);
    }

    @Override // xsna.egm
    public final void b0(String str) {
        A0().setContentDescription(str);
    }

    @Override // xsna.egm
    public final void c0(View.OnTouchListener onTouchListener) {
        A0().setOnTouchListener(onTouchListener);
    }

    @Override // xsna.egm
    public final void d0(CharSequence charSequence) {
        m().setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        m().setText(charSequence);
        z0();
        VkFadeText m = m();
        com.vk.im.ui.formatters.spans.dialogitem.a aVar = this.e;
        aVar.a(m);
        CharSequence text = m().getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            return;
        }
        aVar.c(spanned);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.egm
    public final void e0(DialogItemView.ExtraIcon extraIcon, boolean z) {
        Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_contrast_themed);
        Integer valueOf2 = Integer.valueOf(R.attr.vk_ui_icon_tertiary);
        this.l = extraIcon;
        ?? r2 = this.R;
        bwt0.Q((View) r2.getValue(), ((ImVkCounter) r2.getValue()).getId(), extraIcon);
        int i = b.$EnumSwitchMapping$1[extraIcon.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (r2.isInitialized()) {
                    bwt0.p0((View) r2.getValue(), false);
                    return;
                }
                return;
            }
            Pair pair = extraIcon == DialogItemView.ExtraIcon.PIN ? new Pair(Integer.valueOf(R.drawable.vk_icon_pin_16), valueOf2) : new Pair(Integer.valueOf(R.drawable.vk_icon_reorder_24), valueOf2);
            int intValue = ((Number) pair.d()).intValue();
            int intValue2 = ((Number) pair.g()).intValue();
            ((ImVkCounter) r2.getValue()).setDrawBackground(false);
            ((ImVkCounter) r2.getValue()).e(intValue, intValue2);
            ((ImVkCounter) r2.getValue()).setImageInset(0);
            r2.isInitialized();
            bwt0.p0((View) r2.getValue(), true);
            return;
        }
        DialogItemView.ExtraIcon extraIcon2 = DialogItemView.ExtraIcon.BOMB;
        int i2 = R.attr.vk_ui_background_accent_themed;
        if (extraIcon == extraIcon2 && z) {
            i2 = R.attr.vk_ui_icon_secondary;
        }
        ((ImVkCounter) r2.getValue()).setDrawBackground(true);
        ((ImVkCounter) r2.getValue()).setAppearance(new VkCounter.CounterAppearance.a(i2, i2));
        Pair pair2 = extraIcon == extraIcon2 ? new Pair(Integer.valueOf(R.drawable.vk_icon_bomb_16), valueOf) : new Pair(Integer.valueOf(R.drawable.vk_icon_mention_16), valueOf);
        ((ImVkCounter) r2.getValue()).e(((Number) pair2.d()).intValue(), ((Number) pair2.g()).intValue());
        ImVkCounter imVkCounter = (ImVkCounter) r2.getValue();
        egm.b bVar = this.m;
        if (bVar == null) {
            bVar = null;
        }
        imVkCounter.setImageInset(bVar.g / 6);
        r2.isInitialized();
        bwt0.p0((View) r2.getValue(), true);
    }

    @Override // xsna.egm
    public final void f0() {
        A0().T0(eok.ONLINE_EXTRAS_KEY);
        A0().Q0(new com.vk.core.view.components.avatar.badge.e(this.b.getContext(), VkAvatarBadge.Alignment.BottomRight, eok.ONLINE_EXTRAS_KEY));
    }

    @Override // xsna.egm
    public final void g0() {
        a aVar = this.M;
        boolean z = aVar.b;
        aVar.getClass();
        this.M = new a(true, z);
        B0();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.egm
    public final void h() {
        VkFadeText m = m();
        com.vk.im.ui.formatters.spans.dialogitem.a aVar = this.e;
        aVar.a(m);
        aVar.a((TextView) this.a0.getValue());
        CharSequence text = m().getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            return;
        }
        aVar.c(spanned);
    }

    @Override // xsna.egm
    public final void h0(boolean z) {
        a aVar = this.M;
        boolean z2 = aVar.a;
        aVar.getClass();
        this.M = new a(z2, z);
        B0();
    }

    @Override // xsna.egm
    public final void i() {
        VkImAvatar.e1(A0());
    }

    @Override // xsna.egm
    public final void i0() {
        this.M = new a(false, false);
        B0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.text.VkText>] */
    @Override // xsna.egm
    public final Lazy<VkText> j() {
        return this.Z;
    }

    @Override // xsna.egm
    public final void j0() {
        A0().T0(eok.ONLINE_EXTRAS_KEY);
    }

    @Override // xsna.egm
    public final Rect k(Rect rect) {
        A0().getGlobalVisibleRect(rect);
        return rect;
    }

    @Override // xsna.egm
    public final void k0(ImStoryState imStoryState) {
        int i = b.$EnumSwitchMapping$0[imStoryState.ordinal()];
        A0().W0(i != 1 ? i != 2 ? vep.a : new odu0() : new pdu0(), false);
    }

    @Override // xsna.egm
    public final View l() {
        return A0();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.egm
    public final void l0(CharSequence charSequence, boolean z) {
        VkFadeText C = C();
        ucp ucpVar = ucp.a;
        C.setText(ucp.j(charSequence, Float.valueOf(C().getTextSize())));
        C().setTextColor(z ? ((Number) this.g.getValue()).intValue() : this.f);
    }

    @Override // xsna.egm
    public final void m0(boolean z) {
        F().setMuted(z);
        Pair pair = new Pair(Integer.valueOf(R.attr.vk_ui_text_contrast_themed), Integer.valueOf(z ? R.attr.vk_ui_icon_secondary : R.attr.vk_ui_background_accent_themed));
        F().setAppearance(new VkCounter.CounterAppearance.a(((Number) pair.g()).intValue(), ((Number) pair.d()).intValue()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    @Override // xsna.egm
    public final Lazy<VkImageSimple> n() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.egm
    public final void n0(boolean z) {
        int i = z ? R.attr.vk_ui_icon_secondary : R.attr.vk_ui_background_accent_themed;
        ?? r1 = this.S;
        ((ImVkCounter) r1.getValue()).setAppearance(new VkCounter.CounterAppearance.a(i, i));
        Pair pair = new Pair(Integer.valueOf(R.drawable.vk_icon_stars_16), Integer.valueOf(z ? R.attr.vk_ui_icon_contrast : R.attr.vk_ui_icon_contrast_themed));
        ((ImVkCounter) r1.getValue()).e(((Number) pair.d()).intValue(), ((Number) pair.g()).intValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.egm
    public final yri o() {
        return (yri) this.K.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.egm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0(VerifyInfo verifyInfo) {
        baf0 baf0Var;
        int f;
        ?? r0 = this.Q;
        if (verifyInfo == null) {
            if (r0.isInitialized()) {
                f4m.j((View) r0.getValue());
                return;
            }
            return;
        }
        VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
        Object obj = com.vk.core.utils.a.a;
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_verified_alt_12);
        boolean z = verifyInfo.b;
        Context context = this.d;
        if (z) {
            f = e3m.f(R.attr.vk_ui_icon_accent_themed, context);
        } else {
            if (!verifyInfo.Db()) {
                baf0Var = null;
                if (baf0Var == null) {
                    ((ImageView) r0.getValue()).setImageDrawable(baf0Var);
                    ((View) r0.getValue()).setVisibility(0);
                    return;
                } else {
                    if (r0.isInitialized()) {
                        f4m.j((View) r0.getValue());
                        return;
                    }
                    return;
                }
            }
            f = e3m.f(R.attr.vk_ui_icon_tertiary, context);
        }
        Pair pair = new Pair(valueOf, Integer.valueOf(f));
        int intValue = ((Number) pair.d()).intValue();
        baf0Var = new baf0(m33.a(intValue, context), ((Number) pair.g()).intValue());
        if (baf0Var == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    @Override // xsna.egm
    public final Lazy<VkImageSimple> q() {
        return this.c0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    @Override // xsna.egm
    public final Lazy<VkImageSimple> r() {
        return this.W;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    @Override // xsna.egm
    public final Lazy<VkImageSimple> s() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.im.design.view.counter.ImVkCounter>] */
    @Override // xsna.egm
    public final Lazy<ImVkCounter> t() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.image.VkEnhancedImageView>] */
    @Override // xsna.egm
    public final Lazy<VkEnhancedImageView> u() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    @Override // xsna.egm
    public final Lazy<VkImageSimple> w() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    @Override // xsna.egm
    public final Lazy<VkImageSimple> x() {
        return this.d0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.text.VkText>] */
    @Override // xsna.egm
    public final Lazy<VkText> y() {
        return this.Y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    @Override // xsna.egm
    public final Lazy<VkImageSimple> z() {
        return this.V;
    }

    @Override // xsna.egm
    public final void z0() {
        int v = v();
        if (v() == 1) {
            m().setSingleLine();
        }
        m().setMaxTextLines(v);
    }
}
