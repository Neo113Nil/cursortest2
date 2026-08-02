package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.utils.VerifyInfoHelper;
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
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextFlag;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vk.typography.b;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: DialogItemViewCommonDelegate.kt */
/* loaded from: classes2.dex */
public abstract class egm {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final AttributeSet a;
    public final ViewGroup b;
    public final boolean c = BuildInfo.t();
    public final Context d;
    public final com.vk.im.ui.formatters.spans.dialogitem.a e;
    public final int f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final String k;
    public DialogItemView.ExtraIcon l;
    public b m;
    public final bpn0 n;
    public final bpn0 o;
    public final bpn0 p;
    public final bpn0 q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    /* compiled from: DialogItemViewCommonDelegate.kt */
    public static final class a {
        public static int a(Lazy lazy) {
            if (lazy.isInitialized()) {
                return ((View) lazy.getValue()).getMeasuredHeight();
            }
            return 0;
        }

        public static int b(Lazy lazy) {
            if (lazy.isInitialized()) {
                return ((View) lazy.getValue()).getRight();
            }
            return 0;
        }

        public static boolean c(Lazy lazy) {
            if (lazy.isInitialized()) {
                return bwt0.K((View) lazy.getValue());
            }
            return false;
        }

        public static void d(Lazy lazy, int i, int i2) {
            if (lazy.isInitialized()) {
                int i3 = a2u0.a;
                a2u0.b(i, i2, (View) lazy.getValue());
            }
        }

        public static int e(Lazy lazy) {
            if (lazy.isInitialized()) {
                return bwt0.N((View) lazy.getValue());
            }
            return 0;
        }

        public static int f(Lazy lazy) {
            if (lazy.isInitialized()) {
                return bwt0.O((View) lazy.getValue());
            }
            return 0;
        }

        public static int g(Lazy lazy) {
            if (lazy.isInitialized()) {
                return bwt0.P((View) lazy.getValue());
            }
            return 0;
        }

        public static void h(Lazy lazy, int i, int i2, int i3) {
            if (lazy.isInitialized()) {
                int i4 = a2u0.a;
                a2u0.d((View) lazy.getValue(), i, i2, i3);
            }
        }

        public static void i(Lazy lazy, boolean z) {
            if (lazy.isInitialized() || z) {
                bwt0.p0((View) lazy.getValue(), z);
            }
        }

        public static Lazy j(String str, gzs gzsVar) {
            return msy.a(LazyThreadSafetyMode.NONE, new hn9(9, str, gzsVar));
        }

        public static int k(Lazy lazy) {
            if (lazy.isInitialized()) {
                return bwt0.u0((View) lazy.getValue());
            }
            return 0;
        }

        public static int l(Lazy lazy) {
            if (lazy.isInitialized()) {
                return bwt0.v0((View) lazy.getValue());
            }
            return 0;
        }
    }

    /* compiled from: DialogItemViewCommonDelegate.kt */
    public static final class b {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;

        public b(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i;
        }

        public final int hashCode() {
            String str = this.a;
            return Integer.hashCode(this.i) + shy.a(this.h, shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StyleAttributes(titleFont=");
            sb.append(this.a);
            sb.append(", titleTextSize=");
            sb.append(this.b);
            sb.append(", bodyTextSize=");
            sb.append(this.c);
            sb.append(", timeTextSize=");
            sb.append(this.d);
            sb.append(", timeTextColor=");
            sb.append(this.e);
            sb.append(", avatarSize=");
            sb.append(this.f);
            sb.append(", iconsSize=");
            sb.append(this.g);
            sb.append(", iconsMargin=");
            sb.append(this.h);
            sb.append(", readOutIconSize=");
            return vu5.b(sb, this.i, ')');
        }
    }

    /* compiled from: DialogItemViewCommonDelegate.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DialogItemView.ExtraIcon.values().length];
            try {
                iArr[DialogItemView.ExtraIcon.BOMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DialogItemView.ExtraIcon.MENTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DialogItemView.ExtraIcon.PIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DialogItemView.ExtraIcon.DRAG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public egm(AttributeSet attributeSet, ViewGroup viewGroup) {
        this.a = attributeSet;
        this.b = viewGroup;
        Context context = viewGroup.getContext();
        this.d = context;
        this.e = new com.vk.im.ui.formatters.spans.dialogitem.a(context);
        this.f = e3m.f(R.attr.vk_ui_text_primary, context);
        this.g = a.j("DialogItemView.titleColorHighlight", new p5h(this, 9));
        this.h = a.j("DialogItemView.drOnlineWeb", new enh(this, 8));
        this.i = a.j("DialogItemView.placeholderError", new tvj(this, 3));
        this.j = a.j("DialogItemView.composingDrawable", new ozf(this, 17));
        this.k = "W\nW\nW\nW\nW\n";
        this.n = new bpn0(new gbh(this, 8));
        this.o = new bpn0(new k6k(this, 2));
        this.p = new bpn0(new odm(this, 1));
        this.q = new bpn0(new akh(this, 9));
        this.r = a.j("DialogItemView.lazyDonutView", new xyh(this, 5));
        this.s = a.j("DialogItemView.lazyImageStatusView", new mag(this, 11));
        this.t = a.j("DialogItemView.lazyVerifiedView", new qzg(this, 10));
        this.u = a.j("DialogItemView.lazyCasperView", new dgm(this, 0));
        this.v = a.j("DialogItemView.lazyWritingDisabledView", new cfl(this, 2));
        this.w = a.j("DialogItemView.lazyMutedView", new ufk(this, 1));
        this.x = a.j("DialogItemView.lazyHiddenView", new bih(this, 11));
        this.y = a.j("DialogItemView.lazyAttachView", new h1j(this, 6));
        this.z = a.j("DialogItemView.lazyTypingBodyView", new wzh(this, 9));
        this.A = a.j("DialogItemView.lazyTypingIconView", new l1i(this, 5));
        this.B = a.j("DialogItemView.lazyIconView", new ecm(this, 1));
        this.C = a.j("DialogItemView.lazyReplyTextView", new q5f(this, 12));
        this.D = a.j("DialogItemView.lazyUnreadReactionsView", new t2l(this, 3));
        this.E = a.j("DialogItemView.lazyUnreadOutView", new yce(this, 12));
        this.F = a.j("DialogItemView.lazySendingView", new kbe(this, 14));
        this.G = a.j("DialogItemView.lazyErrorView", new jpf(this, 11));
        this.H = a.j("DialogItemView.lazyReadOutView", new sfg(this, 10));
        this.I = a.j("DialogItemView.lazySpecialStatusView", new m2j(this, 3));
        this.J = a.j("DialogItemView.lazyStatusView", new qbj(this, 1));
    }

    public static ViewGroup.MarginLayoutParams W(egm egmVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if ((i7 & 1) != 0) {
            i = -2;
        }
        if ((i7 & 2) != 0) {
            i2 = -2;
        }
        if ((i7 & 4) != 0) {
            i3 = 0;
        }
        if ((i7 & 8) != 0) {
            i4 = 0;
        }
        if ((i7 & 16) != 0) {
            i5 = 0;
        }
        if ((i7 & 32) != 0) {
            i6 = 0;
        }
        egmVar.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, i2);
        marginLayoutParams.leftMargin = i3;
        marginLayoutParams.topMargin = i4;
        marginLayoutParams.rightMargin = i5;
        marginLayoutParams.bottomMargin = i6;
        return marginLayoutParams;
    }

    public final int A() {
        Layout layout = m().getLayout();
        if (layout == null && (layout = j().getValue().getLayout()) == null) {
            return 0;
        }
        int lineBaseline = layout.getLineBaseline(0);
        Layout layout2 = B().getLayout();
        return lineBaseline - (layout2 != null ? layout2.getLineBaseline(0) : 0);
    }

    public final VkText B() {
        return (VkText) this.o.getValue();
    }

    public final VkFadeText C() {
        return (VkFadeText) this.n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.text.VkText>] */
    public Lazy<VkText> D() {
        return this.z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    public Lazy<VkImageSimple> E() {
        return this.A;
    }

    public final ImVkCounter F() {
        return (ImVkCounter) this.q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    public Lazy<VkImageSimple> G() {
        return this.E;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.im.design.view.counter.ImVkCounter>] */
    public Lazy<ImVkCounter> H() {
        return this.D;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    public Lazy<VkImageSimple> I() {
        return this.t;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    public Lazy<VkImageSimple> J() {
        return this.v;
    }

    public final void K(int i, int i2) {
        int i3 = a2u0.a;
        a2u0.b(bwt0.N(C()) + i, bwt0.P(C()) + i2, C());
        int O = bwt0.O(C()) + C().getRight();
        int measuredHeight = (C().getMeasuredHeight() / 2) + bwt0.P(C()) + i2;
        a.d(I(), a.e(I()) + O, a.g(I()) + (measuredHeight - (a.a(I()) / 2)));
        if (a.c(I())) {
            O = a.f(I()) + a.b(I());
        }
        a.d(u(), a.e(u()) + O, a.g(u()) + (measuredHeight - (a.a(u()) / 2)));
        if (a.c(u())) {
            O = a.f(u()) + a.b(u());
        }
        a.d(q(), a.e(q()) + O, a.g(q()) + (measuredHeight - (a.a(q()) / 2)));
        if (a.c(q())) {
            O = a.f(q()) + a.b(q());
        }
        a.d(n(), a.e(n()) + O, a.g(n()) + (measuredHeight - (a.a(n()) / 2)));
        if (a.c(n())) {
            O = a.f(n()) + a.b(n());
        }
        a.d(J(), a.e(J()) + O, a.g(J()) + (measuredHeight - (a.a(J()) / 2)));
        if (a.c(J())) {
            O = a.f(J()) + a.b(J());
        }
        a.d(w(), a.e(w()) + O, a.g(w()) + (measuredHeight - (a.a(w()) / 2)));
        if (a.c(w())) {
            O = a.f(w()) + a.b(w());
        }
        a.d(s(), a.e(s()) + O, a.g(s()) + (measuredHeight - (a.a(s()) / 2)));
    }

    public final void L(int i, int i2) {
        a.h(u(), i, 0, i2);
        a.h(q(), i, 0, i2);
        a.h(I(), i, 0, i2);
        a.h(n(), i, 0, i2);
        a.h(J(), i, 0, i2);
        a.h(w(), i, 0, i2);
        a.h(s(), i, 0, i2);
        int i3 = a2u0.a;
        a2u0.d(B(), i, 0, i2);
    }

    public final int M() {
        return Math.max(Math.max(bwt0.u0(C()), Math.max(bwt0.u0(B()), a.k(u()))), Math.max(a.k(I()), Math.max(a.k(w()), a.k(q()))));
    }

    public abstract void N();

    public void O() {
        float f;
        m().setId(R.id.dialog_item_message_preview);
        VkFadeText m = m();
        FontFamily fontFamily = FontFamily.REGULAR;
        b bVar = this.m;
        if (bVar == null) {
            bVar = null;
        }
        float f2 = bVar.c;
        TextSizeUnit textSizeUnit = TextSizeUnit.PX;
        int i = a.C1933a.C1934a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
        int i2 = 2;
        if (i == 1) {
            f = f2;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = com.vk.typography.b.b(f2);
        }
        Font.Companion.getClass();
        Font a2 = Font.a.a(fontFamily, f);
        Context context = this.d;
        Typeface k = a2.k(context);
        float j = a2.j();
        m.setTypeface(k);
        m.setLetterSpacing(j);
        if ((TextFlag.DO_NOT_CHANGE_SIZE.h() & 0) == 0) {
            int i3 = b.a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
            if (i3 == 1) {
                i2 = 0;
            } else if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            m.setTextSize(i2, f2);
        }
        m().setMaxTextLines(v());
        if (v() == 1) {
            m().setSingleLine();
        }
        m().setFade(false);
        if (this.c) {
            m().setLetterSpacing(0.01f);
            m().setLineSpacing(cn70.e() * 2.0f, 1.0f);
        }
        m().setTextColor(e3m.f(R.attr.vk_ui_text_subhead, context));
        m().setEllipsize(TextUtils.TruncateAt.END);
        m().setLayoutParams(W(this, 0, 0, 0, 0, 0, 0, 63));
        m().setTranslationY(cn70.a() * (-1.0f));
    }

    public void P() {
        TypedArray obtainStyledAttributes = this.d.obtainStyledAttributes(this.a, R$styleable.g);
        String string = obtainStyledAttributes.getString(12);
        boolean z = this.c;
        this.m = new b(string, obtainStyledAttributes.getDimensionPixelSize(13, z ? cn70.f(16) : cn70.f(17)), obtainStyledAttributes.getDimensionPixelSize(4, cn70.f(z ? 14 : 15)), obtainStyledAttributes.getDimensionPixelSize(11, cn70.f(13)), obtainStyledAttributes.getColor(10, -16777216), obtainStyledAttributes.getDimensionPixelSize(0, cn70.b(z ? 48 : 64)), obtainStyledAttributes.getDimensionPixelSize(6, z ? cn70.b(18) : cn70.b(24)), obtainStyledAttributes.getDimensionPixelSize(5, cn70.b(z ? 4 : 8)), obtainStyledAttributes.getDimensionPixelSize(9, z ? cn70.b(16) : cn70.b(24)));
        obtainStyledAttributes.recycle();
    }

    public void Q() {
        float f;
        int b2;
        int i;
        int i2;
        int i3;
        int i4;
        VkText B = B();
        FontFamily fontFamily = FontFamily.REGULAR;
        b bVar = this.m;
        if (bVar == null) {
            bVar = null;
        }
        float f2 = bVar.d;
        TextSizeUnit textSizeUnit = TextSizeUnit.PX;
        int i5 = a.C1933a.C1934a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
        int i6 = 2;
        if (i5 == 1) {
            f = f2;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = com.vk.typography.b.b(f2);
        }
        Font.Companion.getClass();
        Font a2 = Font.a.a(fontFamily, f);
        Typeface k = a2.k(this.d);
        float j = a2.j();
        B.setTypeface(k);
        B.setLetterSpacing(j);
        if ((TextFlag.DO_NOT_CHANGE_SIZE.h() & 0) == 0) {
            int i7 = b.a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
            if (i7 == 1) {
                i6 = 0;
            } else if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            B.setTextSize(i6, f2);
        }
        VkText B2 = B();
        b bVar2 = this.m;
        B2.setTextColor((bVar2 != null ? bVar2 : null).e);
        B().setSingleLine(true);
        VkText B3 = B();
        if (this.c) {
            i = 0;
            i2 = 63;
            i3 = 0;
            i4 = 0;
            b2 = 0;
        } else {
            b2 = cn70.b(6);
            i = 0;
            i2 = 59;
            i3 = 0;
            i4 = 0;
        }
        B3.setLayoutParams(W(this, i3, i4, b2, 0, 0, i, i2));
        B().setTranslationY(cn70.a() * (-1.0f));
    }

    public void R() {
        C().setId(R.id.dialog_item_title);
        C().setTextColor(this.f);
        C().setMaxTextLines(1);
        C().setSingleLine();
        C().setEllipsize(TextUtils.TruncateAt.END);
        C().setLayoutParams(W(this, 0, 0, 0, 0, 0, 0, 63));
        C().setTranslationY(cn70.a() * (-1.0f));
        C().setEmojiCompatEnabled(false);
        C().setFade(false);
        VkFadeText C = C();
        b bVar = this.m;
        String str = (bVar != null ? bVar : null).a;
        if (bVar == null) {
            bVar = null;
        }
        com.vk.typography.b.h(C, a.C1933a.b(this.d, str, bVar.b, TextSizeUnit.PX), 0);
    }

    public void S() {
        ImVkCounter F = F();
        b bVar = this.m;
        if (bVar == null) {
            bVar = null;
        }
        F.setLayoutParams(W(this, 0, 0, bVar.h, 0, 0, 0, 59));
        F().setSize(VkCounter.Size.Medium);
        F().setRenderMode(ImVkCounter.DrawMode.COUNTER);
        Pair pair = new Pair(Integer.valueOf(R.attr.vk_ui_text_contrast_themed), Integer.valueOf(R.attr.vk_ui_background_accent_themed));
        int intValue = ((Number) pair.d()).intValue();
        F().setAppearance(new VkCounter.CounterAppearance.a(((Number) pair.g()).intValue(), intValue));
    }

    public void T() {
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
        viewGroup.setClipToPadding(false);
        Trace.beginSection("DialogItemView.init addView");
        viewGroup.addView(l());
        viewGroup.addView(C());
        viewGroup.addView(m());
        viewGroup.addView(B());
        viewGroup.addView(F());
        Trace.endSection();
    }

    public void U(int i, int i2, int i3, int i4) {
        View l = l();
        int v0 = bwt0.v0(l) + i;
        bwt0.u0(l);
        a(i, i2);
        int u0 = p() == DialogItemView.LinesCount.LINES_2 ? (((bwt0.u0(l) - M()) - f()) - y0()) / 2 : 0;
        M();
        K(v0, u0 + i2);
        int g = g();
        f();
        int M = bwt0.M(C()) + C().getBottom();
        int i5 = g + v0;
        d(v0, M);
        w0(v0, M);
        int A = A() + bwt0.M(C()) + C().getBottom();
        int i6 = a2u0.a;
        a2u0.b(i5, A, B());
        int u02 = u0();
        int t0 = t0();
        int i7 = ((i2 + i4) / 2) - (t0 / 2);
        q0(i3 - u02, i7, t0 + i7);
    }

    public void V(int i) {
        b bVar = this.m;
        if (bVar == null) {
            bVar = null;
        }
        r0(gp10.c(i - bVar.f, Integer.MIN_VALUE), gp10.c(0, 0));
        int u0 = u0();
        b(gp10.c(i, Integer.MIN_VALUE), gp10.c(0, 0));
        int v0 = bwt0.v0(l());
        int c2 = gp10.c((i - u0) - v0, Integer.MIN_VALUE);
        int c3 = gp10.c(0, 0);
        L(c2, c3);
        int l = a.l(J()) + a.l(n()) + a.l(s()) + a.l(w()) + a.l(I()) + a.l(q()) + a.l(u());
        int i2 = a2u0.a;
        a2u0.c(C(), c2, l, c3);
        int i3 = (i - v0) - u0;
        e(gp10.c(i3, Integer.MIN_VALUE), gp10.c(0, 0), bwt0.v0(B()));
        x0(gp10.c(i3, Integer.MIN_VALUE), gp10.c(0, 0));
    }

    public final void X(CharSequence charSequence) {
        Lazy<VkText> j = j();
        boolean z = charSequence == null || charSequence.length() == 0;
        boolean z2 = !z;
        if (!z || j.isInitialized()) {
            awt0.v(j.getValue(), z2);
        }
        if (a.c(j())) {
            Lazy<VkText> j2 = j();
            if (charSequence == null) {
                charSequence = "";
            }
            j2.getValue().setText(charSequence);
        }
    }

    public abstract void Y(ImageList imageList, Drawable drawable, boolean z);

    public abstract void Z(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo);

    public abstract void a(int i, int i2);

    public abstract void a0(View.OnClickListener onClickListener);

    public abstract void b(int i, int i2);

    public abstract void b0(String str);

    public final void c(int i, int i2) {
        int i3 = a2u0.a;
        a2u0.a(a.e(j()) + i, a.g(j()) + i2, j().getValue());
    }

    public abstract void c0(View.OnTouchListener onTouchListener);

    public final void d(int i, int i2) {
        if (bwt0.K(m()) && a.c(j())) {
            bwt0.u0(m());
            int i3 = a2u0.a;
            a2u0.a(bwt0.N(m()) + i, bwt0.P(m()) + i2, m());
            c(i, bwt0.u0(m()) + i2);
            return;
        }
        if (bwt0.K(m())) {
            int i4 = a2u0.a;
            a2u0.a(bwt0.N(m()) + i, bwt0.P(m()) + i2, m());
        } else if (a.c(j())) {
            c(i, i2);
        }
    }

    public void d0(CharSequence charSequence) {
        m().setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        m().setText(charSequence);
        z0();
        this.e.a(m());
    }

    public final void e(int i, int i2, int i3) {
        int i4 = a2u0.a;
        a2u0.d(m(), i, i3, i2);
        a.h(j(), i, i3, i2);
    }

    public void e0(DialogItemView.ExtraIcon extraIcon, boolean z) {
        this.l = extraIcon;
        bwt0.Q(t().getValue(), t().getValue().getId(), extraIcon);
        int i = c.$EnumSwitchMapping$0[extraIcon.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                a.i(t(), false);
                return;
            }
            t().getValue().setDrawBackground(false);
            t().getValue().e(extraIcon == DialogItemView.ExtraIcon.PIN ? this.c ? R.drawable.vk_icon_pin_16 : R.drawable.vk_icon_pin_20 : R.drawable.vk_icon_reorder_24, R.attr.vk_ui_icon_tertiary);
            t().getValue().setImageInset(0);
            a.i(t(), true);
            return;
        }
        t().getValue().setDrawBackground(true);
        t().getValue().setAppearance(new VkCounter.CounterAppearance.a(R.attr.vk_ui_icon_accent_themed, R.attr.vk_ui_icon_accent_themed));
        t().getValue().e(extraIcon == DialogItemView.ExtraIcon.BOMB ? R.drawable.vk_icon_bomb_outline_28 : R.drawable.vk_icon_mention_16, R.attr.vk_ui_text_contrast_themed);
        ImVkCounter value = t().getValue();
        b bVar = this.m;
        if (bVar == null) {
            bVar = null;
        }
        value.setImageInset(bVar.g / 6);
        a.i(t(), true);
    }

    public final int f() {
        if (!this.c) {
            return a.k(j()) + bwt0.u0(m());
        }
        return bwt0.M(m()) + bwt0.P(m()) + new xxk0(this.k, m().getPaint(), 0, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, TextUtils.TruncateAt.END, m().getMaxLines(), 5628).a().getHeight();
    }

    public abstract void f0();

    public final int g() {
        return Math.max(bwt0.v0(m()), a.l(j()));
    }

    public abstract void g0();

    public void h() {
        VkFadeText m = m();
        com.vk.im.ui.formatters.spans.dialogitem.a aVar = this.e;
        aVar.a(m);
        aVar.a(D().getValue());
    }

    public abstract void h0(boolean z);

    public abstract void i();

    public abstract void i0();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.text.VkText>] */
    public Lazy<VkText> j() {
        return this.y;
    }

    public abstract void j0();

    public abstract Rect k(Rect rect);

    public abstract void k0(ImStoryState imStoryState);

    public abstract View l();

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    public void l0(CharSequence charSequence, boolean z) {
        VkFadeText C = C();
        ucp ucpVar = ucp.a;
        C.setText(ucp.j(charSequence, Float.valueOf(C().getTextSize())));
        C().setTextColor(z ? ((Number) this.g.getValue()).intValue() : this.f);
    }

    public final VkFadeText m() {
        return (VkFadeText) this.p.getValue();
    }

    public void m0(boolean z) {
        F().setMuted(z);
        F().setAppearance(new VkCounter.CounterAppearance.a(z ? R.attr.vk_ui_icon_tertiary : R.attr.vk_ui_background_accent_themed, R.attr.vk_ui_text_contrast_themed));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    public Lazy<VkImageSimple> n() {
        return this.u;
    }

    public void n0(boolean z) {
        int i = z ? R.attr.vk_ui_icon_tertiary : R.attr.vk_ui_icon_accent_themed;
        H().getValue().setAppearance(new VkCounter.CounterAppearance.a(i, i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public yri o() {
        return (yri) this.j.getValue();
    }

    public void o0(VerifyInfo verifyInfo) {
        if (verifyInfo == null) {
            Lazy<VkImageSimple> I = I();
            if (I.isInitialized()) {
                f4m.j(I.getValue());
                return;
            }
            return;
        }
        if (o25.b(o25.a()) && verifyInfo.b) {
            VkImageSimple value = I().getValue();
            dhr0.a.l0(value, R.drawable.vk_icon_education_16, R.attr.vk_ui_icon_accent_themed);
            value.setVisibility(0);
            return;
        }
        Drawable h = VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, this.d, VerifyInfoHelper.ColorTheme.normal, 8);
        if (h != null) {
            I().getValue().setImageDrawable(h);
            I().getValue().setVisibility(0);
        } else {
            Lazy<VkImageSimple> I2 = I();
            if (I2.isInitialized()) {
                f4m.j(I2.getValue());
            }
        }
    }

    public final DialogItemView.LinesCount p() {
        if (this.c) {
            zdw zdwVar = i7o0.b;
            if (zdwVar == null) {
                zdwVar = null;
            }
            zdwVar.u.getClass();
            if (cew.h().getInt("pref_dialogs_list_lines_number", 3) == 3) {
                return DialogItemView.LinesCount.LINES_3;
            }
        }
        return DialogItemView.LinesCount.LINES_2;
    }

    public final int p0() {
        return Math.max(Math.max(a.l(G()), a.l(x())), Math.max(a.l(z()), a.l(r())));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    public Lazy<VkImageSimple> q() {
        return this.r;
    }

    public final void q0(int i, int i2, int i3) {
        int i4 = (i3 + i2) / 2;
        a.d(y(), a.e(y()) + i, a.g(y()) + (i4 - (a.a(y()) / 2)));
        a.d(H(), a.e(H()) + i, a.g(H()) + (i4 - (a.a(H()) / 2)));
        if (a.c(H())) {
            i = a.b(H()) + a.f(H());
        }
        a.d(t(), a.e(t()) + i, a.g(t()) + (i4 - (a.a(t()) / 2)));
        if (a.c(t())) {
            i = a.b(t()) + a.f(t());
        }
        int i5 = a2u0.a;
        ImVkCounter F = F();
        a2u0.b(bwt0.N(F()) + i, bwt0.P(F()) + (i4 - (F().getMeasuredHeight() / 2)), F);
        a.d(G(), a.e(G()) + i, a.g(G()) + (i4 - (a.a(G()) / 2)));
        a.d(x(), a.e(x()) + i, a.g(x()) + (i4 - (a.a(x()) / 2)));
        a.d(z(), a.e(z()) + i, a.g(z()) + (i4 - (a.a(z()) / 2)));
        a.d(r(), a.e(r()) + i, a.g(r()) + (i4 - (a.a(r()) / 2)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    public Lazy<VkImageSimple> r() {
        return this.G;
    }

    public final void r0(int i, int i2) {
        a.h(H(), i, 0, i2);
        a.h(t(), i, 0, i2);
        int i3 = a2u0.a;
        a2u0.d(F(), i, 0, i2);
        a.h(G(), i, 0, i2);
        a.h(x(), i, 0, i2);
        a.h(z(), i, 0, i2);
        a.h(r(), i, 0, i2);
        a.h(y(), i, 0, i2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    public Lazy<VkImageSimple> s() {
        return this.x;
    }

    public final int s0() {
        return a.l(y()) + a.l(H()) + bwt0.v0(F()) + a.l(t());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.im.design.view.counter.ImVkCounter>] */
    public Lazy<ImVkCounter> t() {
        return this.B;
    }

    public final int t0() {
        return jw5.u(a.k(t()), bwt0.u0(F()), a.k(G()), a.k(x()), a.k(z()), a.k(r()), a.k(H()), a.k(y()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.image.VkEnhancedImageView>] */
    public Lazy<VkEnhancedImageView> u() {
        return this.s;
    }

    public final int u0() {
        return a.l(y()) + a.l(H()) + Math.max(bwt0.v0(F()), Math.max(Math.max(a.l(G()), a.l(x())), Math.max(a.l(z()), a.l(r())))) + a.l(t());
    }

    public final int v() {
        return p() == DialogItemView.LinesCount.LINES_3 ? 2 : 1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    public Lazy<VkImageSimple> w() {
        return this.w;
    }

    public final void w0(int i, int i2) {
        a.d(D(), a.e(D()) + i, i2);
        int f = a.f(D()) + a.b(D());
        Lazy<VkText> D = D();
        int bottom = D.isInitialized() ? D.getValue().getBottom() : 0;
        Lazy<VkText> D2 = D();
        a.d(E(), a.e(E()) + f, a.g(E()) + (((bottom + (D2.isInitialized() ? D2.getValue().getTop() : 0)) / 2) - (a.a(E()) / 2)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    public Lazy<VkImageSimple> x() {
        return this.H;
    }

    public final void x0(int i, int i2) {
        a.h(E(), i, 0, i2);
        a.h(D(), i, a.l(E()), i2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.text.VkText>] */
    public Lazy<VkText> y() {
        return this.C;
    }

    public final int y0() {
        return Math.max(a.k(E()), a.k(D()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<com.vk.core.view.components.picture.VkImageSimple>] */
    public Lazy<VkImageSimple> z() {
        return this.F;
    }

    public void z0() {
        int v = v();
        if (v() == 1) {
            m().setSingleLine();
        }
        m().setMaxTextLines(v);
    }

    public void v0() {
    }
}
