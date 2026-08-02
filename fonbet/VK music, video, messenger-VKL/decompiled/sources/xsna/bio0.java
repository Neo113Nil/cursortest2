package xsna;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.common.links.AwayLink;
import com.vk.core.view.text.SquareExcerptTextView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.tool.view.newsfeed.text.VkFeedTextWrapper;
import com.vk.newsfeed.common.helpers.SelectTextActionModeCallback;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostExpandText;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.data.PostInteract;
import java.util.concurrent.Callable;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.am;
import xsna.qjc;
import xsna.uij0;

/* compiled from: TextHolder.kt */
/* loaded from: classes4.dex */
public final class bio0 extends rp6<dio0, NewsEntry> implements qjc.a, View.OnClickListener, View.OnAttachStateChangeListener, f8q, i7o, a1n, o0n {
    public static final /* synthetic */ int T = 0;
    public final p870 E;
    public final h170 F;
    public final Object G;
    public final VkFeedTextWrapper H;
    public final SquareExcerptTextView I;
    public final r8q J;
    public final x7q K;
    public final SpannableStringBuilder L;
    public final vpa M;
    public final zq70 N;
    public final io.reactivex.rxjava3.disposables.b O;
    public final am.a P;
    public boolean Q;
    public gzs<s3q0> R;
    public final aai0 S;

    /* compiled from: TextHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelectTextActionModeCallback.Action.values().length];
            try {
                iArr[SelectTextActionModeCallback.Action.Select.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectTextActionModeCallback.Action.SelectAll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelectTextActionModeCallback.Action.Copy.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: TextHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((bio0) this.receiver).onClick();
            return s3q0.a;
        }
    }

    public bio0(ViewGroup viewGroup, h170 h170Var, p870 p870Var) {
        super(R.layout.news_item_text, viewGroup);
        this.E = p870Var;
        this.F = h170Var;
        this.G = msy.a(LazyThreadSafetyMode.NONE, new gwd0(9));
        VkFeedTextWrapper vkFeedTextWrapper = (VkFeedTextWrapper) this.itemView.findViewById(R.id.container);
        this.H = vkFeedTextWrapper;
        SquareExcerptTextView squareExcerptTextView = (SquareExcerptTextView) this.itemView.findViewById(R.id.post_view);
        this.I = squareExcerptTextView;
        o7q o7qVar = new o7q();
        r8q r8qVar = new r8q(vkFeedTextWrapper, squareExcerptTextView, this, o7qVar);
        this.J = r8qVar;
        x7q x7qVar = new x7q();
        this.K = x7qVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xwk.d().a().p(this.itemView.getContext(), uij0.c.a));
        spannableStringBuilder.setSpan(x7qVar, 0, spannableStringBuilder.length(), 33);
        this.L = spannableStringBuilder;
        this.M = new vpa();
        this.N = new zq70();
        this.O = new io.reactivex.rxjava3.disposables.b();
        this.P = new am.a(16, spannableStringBuilder);
        bx80 bx80Var = new bx80(this, 13);
        squareExcerptTextView.setAvailableShowMoreExpandSpanMeasureStrategy(true);
        squareExcerptTextView.setExpandAnimationController(o7qVar);
        squareExcerptTextView.setCanShowMessageOptions(true);
        this.itemView.addOnAttachStateChangeListener(this);
        squareExcerptTextView.setAccessibilityNodeInfoInitializer(bx80Var);
        squareExcerptTextView.setUseNewAccessibilityBehaviour(true);
        squareExcerptTextView.setShouldExcludeExtraSpaceWhenTextTruncated(true);
        vkFeedTextWrapper.setIgnoreRequestPostTextFocus(true);
        squareExcerptTextView.setShouldIgnoreScrollAfterGainFocus(true);
        if (!r8qVar.r) {
            r8qVar.r = true;
        }
        r8qVar.x = R.attr.vk_ui_text_subhead;
        getContext();
        x7qVar.j();
        getContext();
        this.S = new aai0(this.itemView.getContext(), new hbj0(this, 10), new b(0, this, bio0.class, "onClick", "onClick()V", 0));
    }

    @Override // xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
        VkFeedTextWrapper vkFeedTextWrapper = this.H;
        vkFeedTextWrapper.setImportantForAccessibility(1);
        vkFeedTextWrapper.setContentDescription(di60.m(disclaimerData, this.itemView.getContext()));
    }

    @Override // xsna.qjc.a
    public final void I(AwayLink awayLink) {
        String str = awayLink != null ? awayLink.b : null;
        if (!epx.f(this.u, "fave") || str == null) {
            return;
        }
        qrq.a(t6(), gnq.g(null, str, false));
    }

    @Override // xsna.f8q
    public final void K0(gzs<s3q0> gzsVar) {
        this.R = gzsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [T extends com.vk.feed.core.models.news.NewsEntry, com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T extends com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // xsna.f8q
    public final void P2() {
        u1c0 j6 = j6();
        NewsEntry newsEntry = j6 != null ? j6.a : null;
        ?? r1 = newsEntry != null ? newsEntry : 0;
        if (r1 == 0) {
            r1 = this.p;
        }
        if (r1 != 0) {
            this.p = r1;
            E6(r1);
        }
        ?? q6 = q6();
        if (q6 == 0) {
            return;
        }
        p4r p4rVar = (p4r) this.G.getValue();
        UserId o = k9q0.o(q6);
        Integer valueOf = Integer.valueOf(di60.n(q6));
        String str = this.v;
        u1c0 J0 = J0();
        Integer valueOf2 = Integer.valueOf(J0 != null ? J0.k : 0);
        p4rVar.getClass();
        p4r.b(o, valueOf, valueOf2, str);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        r8q r8qVar = this.J;
        r8qVar.getClass();
        r8qVar.y = s6oVar.a(r8qVar, s6oVar.e);
        SquareExcerptTextView squareExcerptTextView = r8qVar.c;
        if (squareExcerptTextView == null) {
            squareExcerptTextView = null;
        }
        if (squareExcerptTextView != null) {
            sjc sjcVar = (sjc) squareExcerptTextView.getDelegate();
            sjcVar.getClass();
            s6oVar.a(new i1(sjcVar, 3), new rjc(0, s6oVar, sjcVar));
            sjc showMoreLinkDelegate = squareExcerptTextView.getShowMoreLinkDelegate();
            showMoreLinkDelegate.getClass();
            s6oVar.a(new i1(showMoreLinkDelegate, 3), new rjc(0, s6oVar, showMoreLinkDelegate));
        }
        r8qVar.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.text.StaticLayout, android.text.TextUtils$TruncateAt, java.lang.CharSequence, java.lang.Float] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    @Override // xsna.rp6
    public final void R6(dio0 dio0Var) {
        SquareExcerptTextView squareExcerptTextView;
        r8q r8qVar;
        ?? r14;
        ?? r12;
        boolean z;
        s1c0 s1c0Var;
        int i;
        dio0 dio0Var2 = dio0Var;
        NewsEntry newsEntry = dio0Var2.h;
        fj90 fj90Var = dio0Var2.n;
        u1c0 J0 = J0();
        SquareExcerptTextView squareExcerptTextView2 = this.I;
        r8q r8qVar2 = this.J;
        if (J0 != null) {
            boolean z2 = dio0Var2.s;
            r8q.c(this.J, J0, dio0Var2.r, z2, z2 ? this.K : null, dio0Var2.y, 96);
            if (dio0Var2.z) {
                squareExcerptTextView2.setOnTouchListener(new t43(this.S, 2));
                squareExcerptTextView2.setIsTextSelectionFullVisibleTextEnabled(true);
                squareExcerptTextView2.n();
                r14 = 0;
                r8qVar = r8qVar2;
                squareExcerptTextView = squareExcerptTextView2;
                r12 = 0;
                r8qVar.w = new SelectTextActionModeCallback(new q69(1, this, bio0.class, "onTextContextMenuItem", "onTextContextMenuItem(I)Z", 0, 14), new k7l0(this, 8));
            } else {
                SquareExcerptTextView squareExcerptTextView3 = squareExcerptTextView2;
                r8qVar = r8qVar2;
                r14 = 0;
                r12 = 0;
                squareExcerptTextView3.setIsTextSelectionFullVisibleTextEnabled(false);
                r8qVar.w = null;
                r8qVar.c.setOnLongClickListener(null);
                squareExcerptTextView3.setOnTouchListener(null);
                squareExcerptTextView = squareExcerptTextView3;
            }
        } else {
            squareExcerptTextView = squareExcerptTextView2;
            r8qVar = r8qVar2;
            r14 = 0;
            r12 = 0;
        }
        s1q s1qVar = dio0Var2.r;
        if (s1qVar != null) {
            int i2 = s1qVar.b;
            int i3 = s1qVar.a;
            Float f = s1qVar.e;
            boolean z3 = r8qVar.o;
            boolean z4 = (z3 && f == null) ? true : r14;
            squareExcerptTextView.setShouldTruncate(z3);
            squareExcerptTextView.setShouldTrimByCuttableSpans(dio0Var2.x);
            if (z4) {
                i = i3 + i2;
                if (i < i3) {
                    i = i3;
                }
            } else {
                i = Integer.MAX_VALUE;
            }
            squareExcerptTextView.setMaxLines(i);
            squareExcerptTextView.setMaxExcerptLines(z4 ? i3 : Integer.MAX_VALUE);
            squareExcerptTextView.setMaxLinesRatio(f);
            squareExcerptTextView.setMinTrimmedLines(i2);
            squareExcerptTextView.setEllipsize(z3 ? TextUtils.TruncateAt.END : r12);
            squareExcerptTextView.setShowMoreText(this.L);
        } else {
            squareExcerptTextView.setShouldTruncate(r14);
            squareExcerptTextView.setMaxLines(Integer.MAX_VALUE);
            squareExcerptTextView.setEllipsize(r12);
            squareExcerptTextView.setShowMoreText(r12);
            squareExcerptTextView.setMaxExcerptLines(Integer.MAX_VALUE);
            squareExcerptTextView.setMinTrimmedLines(r14);
            squareExcerptTextView.setMaxLinesRatio(r12);
        }
        ?? q6 = q6();
        float f2 = dio0Var2.q;
        fqc.a(q6, fj90Var != null ? fj90Var.a : r12);
        r8qVar.a(newsEntry, fj90Var != null ? fj90Var.a : r12, this.w, this.u);
        getContext();
        com.vk.typography.b.k(squareExcerptTextView, dio0Var2.o, Float.valueOf(f2), 4);
        squareExcerptTextView.setLineSpacing(dio0Var2.v, dio0Var2.w);
        if (squareExcerptTextView.M != f2) {
            squareExcerptTextView.M = f2;
            squareExcerptTextView.w = r12;
            squareExcerptTextView.requestLayout();
            squareExcerptTextView.invalidate();
        }
        f4m.v(dio0Var2.t, squareExcerptTextView);
        f4m.y(dio0Var2.u, squareExcerptTextView);
        boolean z5 = dio0Var2.p;
        io.reactivex.rxjava3.disposables.b bVar = this.O;
        if (z5) {
            if (fj90Var == null) {
                com.vk.metrics.eventtracking.b.a.a(new Throwable("parsedText is null"));
            } else {
                bVar.b(itg0.l(this.M.b(fj90Var.a, new t0c0(this.E, newsEntry))));
            }
        }
        if (dio0Var2.D) {
            ej90 ej90Var = fj90Var != null ? fj90Var.a : r12;
            final CharSequence charSequence = ej90Var != null ? ej90Var.a : r12;
            if (charSequence != null) {
                final hxi hxiVar = new hxi(this, newsEntry);
                final lh10 lh10Var = new lh10(newsEntry, this);
                final zq70 zq70Var = this.N;
                zq70Var.getClass();
                io.reactivex.rxjava3.internal.operators.completable.m mVar = new io.reactivex.rxjava3.internal.operators.completable.m(new Callable() { // from class: xsna.gbc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Spanned spanned;
                        int nextSpanTransition;
                        zq70.this.getClass();
                        CharSequence charSequence2 = charSequence;
                        if ((charSequence2 instanceof Spanned) && (nextSpanTransition = (spanned = (Spanned) charSequence2).nextSpanTransition(-1, charSequence2.length(), db6.class)) != charSequence2.length()) {
                            db6[] db6VarArr = (db6[]) spanned.getSpans(nextSpanTransition, spanned.length(), db6.class);
                            if (db6VarArr.length != 0 && !((db6) rl3.L(db6VarArr)).r()) {
                                for (db6 db6Var : db6VarArr) {
                                    if (db6Var instanceof eb6) {
                                        ((eb6) db6Var).k = hxiVar;
                                    } else if (db6Var instanceof t75) {
                                        ((t75) db6Var).k = lh10Var;
                                    }
                                }
                            }
                        }
                        return s3q0.a;
                    }
                });
                asu0 asu0Var = asu0.a;
                asu0Var.getClass();
                bVar.b(itg0.l(mVar.q(asu0.i()).o(asu0Var.d())));
            }
        }
        VkFeedTextWrapper vkFeedTextWrapper = this.H;
        vkFeedTextWrapper.setImportantForAccessibility(2);
        this.Q = r14;
        vkFeedTextWrapper.setContentDescription(r12);
        if (((Boolean) this.F.p.getValue()).booleanValue() && (s1c0Var = this.x) != null) {
            if (s1c0Var.C) {
                z = true;
                vkFeedTextWrapper.setIgnoreRequestPostTextFocus(!z);
            }
        }
        z = r14;
        vkFeedTextWrapper.setIgnoreRequestPostTextFocus(!z);
    }

    @Override // xsna.a1n
    public final void U5() {
        this.Q = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (xsna.epx.f(r0 != null ? r0.t : null, "reply") == false) goto L19;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.f8q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0(boolean z) {
        u1c0 J0 = J0();
        if (J0 == null) {
            return;
        }
        if (!qi6.D6(J0)) {
            if (!qi6.B6(J0)) {
                NewsEntry newsEntry = J0.b;
                Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
            }
            PostInteract postInteract = this.w;
            if (postInteract != null) {
                postInteract.zb(PostInteract.Type.expand);
                return;
            }
            return;
        }
        ?? q6 = q6();
        if (q6 != 0) {
            p4r p4rVar = (p4r) this.G.getValue();
            MobileOfficialAppsFeedStat$TypeFeedPostExpandText.Source source = z ? MobileOfficialAppsFeedStat$TypeFeedPostExpandText.Source.SHOW_MORE_BUTTON : MobileOfficialAppsFeedStat$TypeFeedPostExpandText.Source.TEXT;
            UserId o = k9q0.o(q6);
            Integer valueOf = Integer.valueOf(di60.n(q6));
            String str = q6.Cb().b;
            u1c0 J02 = J0();
            Integer valueOf2 = Integer.valueOf(J02 != null ? J02.k : 0);
            p4rVar.getClass();
            p4r.c(source, o, valueOf, str, valueOf2);
        }
    }

    @Override // xsna.o0n
    public final void a5() {
        awt0.q(this.H);
    }

    @Override // xsna.f8q
    public final void h() {
        u1c0 J0 = J0();
        if (!(J0 instanceof iko0) || ((iko0) J0).s == null) {
            return;
        }
        SquareExcerptTextView squareExcerptTextView = this.I;
        squareExcerptTextView.setShouldTruncate(false);
        squareExcerptTextView.setEllipsize(null);
        squareExcerptTextView.setMaxLines(Integer.MAX_VALUE);
        squareExcerptTextView.setMaxExcerptLines(Integer.MAX_VALUE);
        squareExcerptTextView.sendAccessibilityEvent(8);
        if (J0 != null) {
            squareExcerptTextView.setTextIsSelectable(qi6.D6(J0) || (!qi6.D6(J0) && !qi6.B6(J0)));
        }
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.Q;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.J.onClick(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ViewParent parent = this.itemView.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null) {
            recyclerView.addOnItemTouchListener(this.S);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewParent parent = this.itemView.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null) {
            recyclerView.removeOnItemTouchListener(this.S);
        }
        this.O.e();
    }

    @Override // xsna.f8q
    public final gzs<s3q0> r3() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.f8q
    public final void x2(boolean z) {
        ?? q6 = q6();
        if (q6 != 0) {
            p4r p4rVar = (p4r) this.G.getValue();
            u1c0 J0 = J0();
            int i = J0 != null ? J0.k : 0;
            UserId o = k9q0.o(q6);
            Integer valueOf = Integer.valueOf(di60.n(q6));
            String str = this.v;
            MobileOfficialAppsFeedStat$TypeFeedOpenItem.Source source = this.I.k ? MobileOfficialAppsFeedStat$TypeFeedOpenItem.Source.NEWS_ITEM_CLICK : MobileOfficialAppsFeedStat$TypeFeedOpenItem.Source.EXPAND;
            p4rVar.getClass();
            p4r.g(i, o, valueOf, str, source);
        }
        s980 s980Var = this.y;
        if (s980Var != null) {
            NewsEntry t6 = t6();
            u1c0 J02 = J0();
            s980Var.U5(t6, z, J02 != null ? J02.k : -1);
        }
    }
}
