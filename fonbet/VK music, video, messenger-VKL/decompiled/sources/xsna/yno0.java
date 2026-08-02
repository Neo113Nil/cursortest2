package xsna;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.common.links.AwayLink;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.attachment.AttachmentStyle;
import com.vk.feed.core.models.attachment.ChipAttachmentStyle;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.text.BaseChipTextView;
import com.vk.newsfeed.common.helpers.SelectTextActionModeCallback;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostExpandText;
import com.vk.stickers.bridge.GiftData;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.DonutLinkAttachment;
import com.vkontakte.android.attachments.NarrativeAttachment;
import com.vkontakte.android.attachments.StickerAttachment;
import io.jsonwebtoken.JwtParser;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.hbc;
import xsna.qjc;
import xsna.t1q;
import xsna.xno0;

/* compiled from: TextWithChipsHolder.kt */
/* loaded from: classes4.dex */
public final class yno0 extends rp6<dio0, NewsEntry> implements qjc.a, i7o, View.OnClickListener, View.OnAttachStateChangeListener, a1n, o0n {
    public static final /* synthetic */ int S = 0;
    public final p870 E;
    public final h170 F;
    public final xno0 G;
    public e6o H;
    public h I;
    public ValueAnimator J;
    public final Rect K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final aai0 Q;
    public boolean R;

    /* compiled from: TextWithChipsHolder.kt */
    public final class a {
        public a() {
        }
    }

    /* compiled from: TextWithChipsHolder.kt */
    public final class b {
        public b() {
        }
    }

    /* compiled from: TextWithChipsHolder.kt */
    public final class c {
        public final Object a = msy.a(LazyThreadSafetyMode.NONE, new xv0(26));

        /* compiled from: TextWithChipsHolder.kt */
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

        public c() {
        }
    }

    /* compiled from: TextWithChipsHolder.kt */
    public static final class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            yno0 yno0Var = yno0.this;
            yno0Var.G.getLayoutParams().height = intValue;
            yno0Var.G.requestLayout();
        }
    }

    /* compiled from: TextWithChipsHolder.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements gzs<ActionMode.Callback> {
        @Override // xsna.gzs
        public final ActionMode.Callback invoke() {
            return ((xno0) this.receiver).getCustomSelectionActionModeCallback();
        }
    }

    /* compiled from: TextWithChipsHolder.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((yno0) this.receiver).onClick();
            return s3q0.a;
        }
    }

    /* compiled from: TextWithChipsHolder.kt */
    public static final class h implements View.OnLayoutChangeListener {
        public final /* synthetic */ View c;
        public final /* synthetic */ yno0 d;

        public h(View view, yno0 yno0Var) {
            this.c = view;
            this.d = yno0Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            NewsEntry newsEntry;
            NewsEntry.TrackData Cb;
            yno0 yno0Var = this.d;
            iko0 J0 = yno0Var.J0();
            boolean z = !(yno0Var.G.j instanceof xno0.d);
            if (J0 != null) {
                J0.v = z;
            }
            if (J0 != null && (newsEntry = J0.a) != null && (Cb = newsEntry.Cb()) != null) {
                Cb.g = Boolean.valueOf(z);
            }
            yno0 yno0Var2 = yno0.this;
            h hVar = yno0Var2.I;
            if (hVar != null) {
                this.c.removeOnLayoutChangeListener(hVar);
            }
            yno0Var2.I = null;
        }
    }

    public yno0(ViewGroup viewGroup, h170 h170Var, p870 p870Var) {
        super(new xno0(viewGroup.getContext()), viewGroup);
        this.E = p870Var;
        this.F = h170Var;
        xno0 xno0Var = (xno0) this.itemView;
        this.G = xno0Var;
        this.K = new Rect();
        dqm0 dqm0Var = new dqm0(1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.L = msy.a(lazyThreadSafetyMode, dqm0Var);
        this.M = msy.a(lazyThreadSafetyMode, new xk70(10));
        this.N = msy.a(lazyThreadSafetyMode, new kcj0(this, 7));
        this.O = msy.a(lazyThreadSafetyMode, new l6n0(this, 4));
        this.P = msy.a(lazyThreadSafetyMode, new w2j0(this, 7));
        this.Q = new aai0(this.itemView.getContext(), new f(0, xno0Var, xno0.class, "getCustomSelectionActionModeCallback", "getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;", 0), new g(0, this, yno0.class, "onClick", "onClick()V", 0));
        xno0Var.addOnAttachStateChangeListener(this);
        View.OnClickListener onClickListener = this.H;
        xno0Var.setContainerViewsClickListener(onClickListener == null ? this : onClickListener);
    }

    @Override // xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
        xno0 xno0Var = this.G;
        xno0Var.setImportantForAccessibility(1);
        xno0Var.setContentDescription(di60.m(disclaimerData, this.itemView.getContext()));
    }

    @Override // xsna.qjc.a
    public final void I(AwayLink awayLink) {
        String str = awayLink != null ? awayLink.b : null;
        if (!epx.f(this.u, "fave") || str == null) {
            return;
        }
        qrq.a(t6(), gnq.g(null, str, false));
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        e6o a2 = s6oVar.a(this, s6oVar.e);
        this.H = a2;
        this.G.setContainerViewsClickListener(a2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // xsna.rp6
    public final void R6(dio0 dio0Var) {
        View view;
        t1q t1qVar;
        s1c0 s1c0Var;
        dio0 dio0Var2 = dio0Var;
        fj90 fj90Var = dio0Var2.n;
        xno0 xno0Var = this.G;
        xno0Var.getContext();
        FontFamily fontFamily = dio0Var2.o;
        float f2 = dio0Var2.q;
        VkLinkedText vkLinkedText = xno0Var.c;
        com.vk.typography.b.k(vkLinkedText, fontFamily, Float.valueOf(f2), 4);
        vkLinkedText.setLineSpacing(dio0Var2.v, dio0Var2.w);
        xno0Var.setTextIsSelectable(false);
        f4m.y(dio0Var2.u, xno0Var);
        f4m.v(dio0Var2.t, xno0Var);
        xno0Var.setTextIsSelectableInFullExcerptType(true);
        if (((Boolean) this.F.p.getValue()).booleanValue() && (s1c0Var = this.x) != null && s1c0Var.C) {
            xno0Var.setRequestChildFocusEnabled(true);
        }
        iko0 J0 = J0();
        if (J0 != null) {
            if (J0.v) {
                iko0 J02 = J0();
                if (J02 == null) {
                    t1qVar = t1q.a.a;
                } else {
                    s1q s1qVar = dio0Var2.r;
                    if (s1qVar == null && (s1qVar = J02.s) == null) {
                        t1qVar = t1q.a.a;
                    } else {
                        int i = s1qVar.b;
                        if (J02.q) {
                            int i2 = s1qVar.a;
                            t1qVar = (i2 == Integer.MAX_VALUE || s1qVar.e != null) ? new t1q.c(i) : new t1q.b(i2, i);
                        } else {
                            t1qVar = t1q.a.a;
                        }
                    }
                }
            } else {
                t1qVar = t1q.a.a;
            }
            f7(t1qVar);
        }
        fqc.a(q6(), fj90Var != null ? fj90Var.a : null);
        xno0Var.setText(fj90Var != null ? fj90Var.a.a : null);
        xno0Var.j();
        for (EntryAttachment entryAttachment : dio0Var2.A) {
            AttachmentStyle attachmentStyle = entryAttachment.c;
            ChipAttachmentStyle chipAttachmentStyle = attachmentStyle instanceof ChipAttachmentStyle ? (ChipAttachmentStyle) attachmentStyle : null;
            if (chipAttachmentStyle != null) {
                ChipAttachmentStyle.a aVar = chipAttachmentStyle.b;
                if (aVar instanceof ChipAttachmentStyle.a.b) {
                    hbc.a.b bVar = new hbc.a.b(entryAttachment.b);
                    String str = ((ChipAttachmentStyle.a.b) aVar).a;
                    View.OnClickListener onClickListener = this.H;
                    if (onClickListener == null) {
                        onClickListener = this;
                    }
                    BaseChipTextView i3 = xno0Var.i(bVar, str);
                    i3.setOnClickListener(onClickListener);
                    xno0Var.addView(i3, -1, new ViewGroup.MarginLayoutParams(-1, -2));
                } else if (aVar instanceof ChipAttachmentStyle.a.AbstractC1036a.C1037a) {
                    hbc.a.C2984a c2984a = new hbc.a.C2984a(entryAttachment.b);
                    StringBuilder sb = new StringBuilder();
                    ChipAttachmentStyle.a.AbstractC1036a.C1037a c1037a = (ChipAttachmentStyle.a.AbstractC1036a.C1037a) aVar;
                    sb.append(c1037a.a);
                    sb.append(JwtParser.SEPARATOR_CHAR);
                    sb.append(c1037a.b);
                    String sb2 = sb.toString();
                    View.OnClickListener onClickListener2 = this.H;
                    if (onClickListener2 == null) {
                        onClickListener2 = this;
                    }
                    BaseChipTextView i4 = xno0Var.i(c2984a, sb2);
                    i4.setOnClickListener(onClickListener2);
                    xno0Var.addView(i4, -1, new ViewGroup.MarginLayoutParams(-1, -2));
                }
            }
        }
        String str2 = dio0Var2.B;
        String string = str2 == null ? null : this.itemView.getContext().getString(R.string.from_author_template, str2, dio0Var2.C);
        if (string != null) {
            View.OnClickListener onClickListener3 = this.H;
            if (onClickListener3 == null) {
                onClickListener3 = this;
            }
            BaseChipTextView i5 = xno0Var.i(hbc.b.a, string);
            i5.setId(R.id.author_chip_view);
            i5.setOnClickListener(onClickListener3);
            xno0Var.addView(i5, -1, new ViewGroup.MarginLayoutParams(-1, -2));
        }
        boolean K = bwt0.K(vkLinkedText);
        int childCount = xno0Var.getChildCount();
        View view2 = null;
        View view3 = null;
        View view4 = null;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = xno0Var.getChildAt(i6);
            if (childAt != null) {
                Object tag = childAt.getTag();
                if (tag instanceof hbc.a.b) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (tag instanceof hbc.a.C2984a) {
                    if (view3 == null) {
                        view3 = childAt;
                    }
                } else if ((tag instanceof hbc.b) && view4 == null) {
                    view4 = childAt;
                }
            }
        }
        if (view2 != null && K) {
            bwt0.f0(view2, 0, cn70.b(4), 0, 0, 13);
        }
        if (view3 == null || (view2 == null && !K)) {
            view = view3;
        } else {
            view = view3;
            bwt0.f0(view, 0, cn70.b(4), 0, 0, 13);
        }
        if (view4 != null) {
            boolean z = view2 == null && view == null && K;
            boolean z2 = view2 != null && view == null;
            if (z || z2) {
                bwt0.f0(view4, 0, cn70.b(4), 0, 0, 13);
            }
        }
        if (dio0Var2.p && fj90Var != null) {
            ((io.reactivex.rxjava3.disposables.b) this.M.getValue()).b(itg0.l(((vpa) this.L.getValue()).b(fj90Var.a, new t0c0(this.E, dio0Var2.h))));
        }
        b bVar2 = (b) this.O.getValue();
        boolean z3 = dio0Var2.z;
        yno0 yno0Var = yno0.this;
        xno0 xno0Var2 = yno0Var.G;
        if (z3) {
            xno0Var2.setCustomSelectionActionModeCallback(new SelectTextActionModeCallback(new zno0(1, xno0Var2, xno0.class, "onTextContextMenuItem", "onTextContextMenuItem(I)Z", 0), new wug0(18, bVar2, yno0Var)));
            xno0Var2.setOnTextTouchListener(new t43(yno0Var.Q, 2));
        } else {
            xno0Var2.setOnTextTouchListener(null);
            xno0Var2.setCustomSelectionActionModeCallback(null);
        }
        this.R = false;
    }

    @Override // xsna.a1n
    public final void U5() {
        this.R = true;
    }

    @Override // xsna.o0n
    public final void a5() {
        awt0.q(this.G);
    }

    public final boolean b7() {
        ValueAnimator valueAnimator = this.J;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final void c7(boolean z) {
        if (b7()) {
            return;
        }
        xno0 xno0Var = this.G;
        int height = xno0Var.getHeight();
        xno0Var.k(View.MeasureSpec.makeMeasureSpec(xno0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0), t1q.a.a);
        int measuredHeight = xno0Var.getMeasuredHeight();
        if (b7()) {
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(height, measuredHeight);
        ofInt.addListener(new d(z));
        ofInt.addUpdateListener(new e());
        ofInt.setDuration(250L);
        ofInt.start();
        this.J = ofInt;
    }

    public final t1q d7() {
        iko0 J0 = J0();
        if (J0 == null) {
            return t1q.a.a;
        }
        s1q s1qVar = J0.s;
        if (s1qVar == null) {
            return t1q.a.a;
        }
        int i = s1qVar.b;
        if (!J0.q) {
            return t1q.a.a;
        }
        int i2 = s1qVar.a;
        return (i2 == Integer.MAX_VALUE || s1qVar.e != null) ? new t1q.c(i) : new t1q.b(i2, i);
    }

    @Override // xsna.qi6, xsna.w1c0
    /* renamed from: e7, reason: merged with bridge method [inline-methods] */
    public final iko0 J0() {
        u1c0 J0 = super.J0();
        if (J0 instanceof iko0) {
            return (iko0) J0;
        }
        return null;
    }

    public final void f7(t1q t1qVar) {
        xno0 xno0Var = this.G;
        xno0Var.setExcerptType(t1qVar);
        h hVar = this.I;
        if (hVar != null) {
            xno0Var.removeOnLayoutChangeListener(hVar);
        }
        h hVar2 = new h(xno0Var, this);
        this.I = hVar2;
        xno0Var.addOnLayoutChangeListener(hVar2);
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ?? q6;
        Owner owner;
        int id = view.getId();
        xno0 xno0Var = this.G;
        if (id == xno0Var.getId() || id == R.id.main_text_view) {
            iko0 J0 = J0();
            NewsEntry newsEntry = J0 != null ? J0.b : null;
            Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
            if (epx.f(post != null ? post.t : null, "reply")) {
                s980 s980Var = this.y;
                if (s980Var != null) {
                    c cVar = (c) this.P.getValue();
                    yno0 yno0Var = yno0.this;
                    iko0 J02 = yno0Var.J0();
                    if (J02 != null) {
                        Object[] objArr = J02.q && J02.v;
                        ?? q62 = yno0Var.q6();
                        if (q62 != 0) {
                            p4r p4rVar = (p4r) cVar.a.getValue();
                            iko0 J03 = yno0Var.J0();
                            int i = J03 != null ? J03.k : 0;
                            UserId o = k9q0.o(q62);
                            Integer valueOf = Integer.valueOf(di60.n(q62));
                            String str = yno0Var.v;
                            MobileOfficialAppsFeedStat$TypeFeedOpenItem.Source source = objArr == false ? MobileOfficialAppsFeedStat$TypeFeedOpenItem.Source.NEWS_ITEM_CLICK : MobileOfficialAppsFeedStat$TypeFeedOpenItem.Source.EXPAND;
                            p4rVar.getClass();
                            p4r.g(i, o, valueOf, str, source);
                        }
                    }
                    NewsEntry t6 = t6();
                    iko0 J04 = J0();
                    s980Var.U5(t6, true, J04 != null ? J04.k : -1);
                    return;
                }
                return;
            }
            iko0 J05 = J0();
            if (J05 != null) {
                boolean z = J05.q;
                boolean z2 = J05.v;
                t1q currentExcerptType = xno0Var.getCurrentExcerptType();
                if (z && z2 && !epx.f(currentExcerptType, t1q.a.a)) {
                    c7(false);
                    return;
                }
            }
            iko0 J06 = J0();
            if (J06 == null) {
                return;
            }
            boolean z3 = J06.q;
            boolean z4 = J06.v;
            t1q currentExcerptType2 = xno0Var.getCurrentExcerptType();
            if (!z3 || z4 || !epx.f(currentExcerptType2, t1q.a.a) || b7()) {
                return;
            }
            int height = xno0Var.getHeight();
            xno0Var.k(View.MeasureSpec.makeMeasureSpec(xno0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0), d7());
            int measuredHeight = xno0Var.getMeasuredHeight();
            if (b7()) {
                return;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(height, measuredHeight);
            ofInt.addListener(new aoo0(this));
            ofInt.addUpdateListener(new boo0(this));
            ofInt.setDuration(250L);
            ofInt.start();
            this.J = ofInt;
            return;
        }
        if (id == R.id.show_more_view) {
            c7(true);
            return;
        }
        Object tag = view.getTag();
        hbc hbcVar = tag instanceof hbc ? (hbc) tag : null;
        if (hbcVar == null || (q6 = q6()) == 0) {
            return;
        }
        boolean z5 = hbcVar instanceof hbc.a;
        ?? r2 = this.N;
        if (!z5) {
            if (!(hbcVar instanceof hbc.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a aVar = (a) r2.getValue();
            aVar.getClass();
            Post post2 = q6 instanceof Post ? (Post) q6 : null;
            if (post2 == null || (owner = post2.q) == null) {
                if (post2 == null) {
                    return;
                } else {
                    owner = post2.o;
                }
            }
            gd60.Z0(hd60.a(), yno0.this.itemView.getContext(), owner.b, null, null, 12);
            return;
        }
        Attachment a2 = ((hbc.a) hbcVar).a();
        a aVar2 = (a) r2.getValue();
        yno0 yno0Var2 = yno0.this;
        yno0 yno0Var3 = yno0.this;
        if (a2 instanceof DonutLinkAttachment) {
            DonutLinkAttachment donutLinkAttachment = (DonutLinkAttachment) a2;
            s980 s980Var2 = yno0Var2.y;
            if (s980Var2 != 0) {
                s980Var2.Hh(yno0Var2.itemView, yno0Var2.J0(), q6, donutLinkAttachment);
                return;
            }
            return;
        }
        if (a2 instanceof ArticleAttachment) {
            ArticleAttachment articleAttachment = (ArticleAttachment) a2;
            Article article = articleAttachment.f;
            if (article.j()) {
                cvk.u(R.string.article_deleted, false);
                return;
            }
            if (!article.g()) {
                cvk.u(R.string.article_protected, false);
                return;
            }
            s980 s980Var3 = yno0Var3.y;
            if (s980Var3 != 0) {
                s980Var3.Mg(yno0Var3.itemView, yno0Var3.J0(), q6, articleAttachment);
                return;
            }
            return;
        }
        if (!(a2 instanceof NarrativeAttachment)) {
            if (a2 instanceof StickerAttachment) {
                zal0.H(g2v.d().a(), yno0Var2.itemView.getContext(), ((StickerAttachment) a2).g, GiftData.d, null, "comment", null, 96);
                return;
            }
            s980 s980Var4 = yno0Var2.y;
            if (s980Var4 != 0) {
                s980Var4.Mg(yno0Var2.itemView, yno0Var2.J0(), q6, a2);
                return;
            }
            return;
        }
        NarrativeAttachment narrativeAttachment = (NarrativeAttachment) a2;
        Narrative narrative = narrativeAttachment.f;
        if (narrative.h) {
            cvk.u(R.string.narrative_deleted, false);
            return;
        }
        if (!narrative.Ab()) {
            cvk.u(R.string.narrative_private, false);
            return;
        }
        s980 s980Var5 = yno0Var3.y;
        if (s980Var5 != 0) {
            s980Var5.Mg(yno0Var3.itemView, yno0Var3.J0(), q6, narrativeAttachment);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ViewParent parent = this.itemView.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null) {
            recyclerView.addOnItemTouchListener(this.Q);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ((io.reactivex.rxjava3.disposables.b) this.M.getValue()).e();
        ViewParent parent = this.itemView.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null) {
            recyclerView.removeOnItemTouchListener(this.Q);
        }
    }

    /* compiled from: Animator.kt */
    public static final class d implements Animator.AnimatorListener {
        public final /* synthetic */ boolean c;

        public d(boolean z) {
            this.c = z;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.vk.feed.core.models.news.NewsEntry] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            yno0 yno0Var = yno0.this;
            yno0Var.G.getLayoutParams().height = -2;
            c cVar = (c) yno0Var.P.getValue();
            yno0 yno0Var2 = yno0.this;
            ?? q6 = yno0Var2.q6();
            if (q6 != 0) {
                p4r p4rVar = (p4r) cVar.a.getValue();
                MobileOfficialAppsFeedStat$TypeFeedPostExpandText.Source source = this.c ? MobileOfficialAppsFeedStat$TypeFeedPostExpandText.Source.SHOW_MORE_BUTTON : MobileOfficialAppsFeedStat$TypeFeedPostExpandText.Source.TEXT;
                UserId o = k9q0.o(q6);
                Integer valueOf = Integer.valueOf(di60.n(q6));
                String str = yno0Var2.v;
                iko0 J0 = yno0Var2.J0();
                Integer valueOf2 = Integer.valueOf(J0 != null ? J0.k : 0);
                p4rVar.getClass();
                p4r.c(source, o, valueOf, str, valueOf2);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            yno0.this.f7(t1q.a.a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }
    }
}
