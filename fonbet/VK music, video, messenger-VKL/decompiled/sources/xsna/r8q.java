package xsna;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.common.links.LinksParserData;
import com.vk.core.view.text.SquareExcerptTextView;
import com.vk.dto.common.Attachment;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.common.helpers.SelectTextActionModeCallback;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.Iterator;
import java.util.concurrent.Callable;
import xsna.k840;

/* compiled from: ExpandableTextBinder.kt */
/* loaded from: classes4.dex */
public final class r8q implements View.OnClickListener {
    public final ViewGroup b;
    public final SquareExcerptTextView c;
    public final f8q d;
    public final o7q e;
    public s1q f;
    public boolean g;
    public PostInteract h;
    public ej90 i;
    public iko0 j;
    public NewsEntry k;
    public final pjb0 l;
    public CharSequence m;
    public String n;
    public boolean o = true;
    public boolean p;
    public x7q q;
    public boolean r;
    public ValueAnimator s;
    public boolean t;
    public boolean u;
    public boolean v;
    public SelectTextActionModeCallback w;
    public int x;
    public e6o y;
    public final a z;

    public r8q(ViewGroup viewGroup, SquareExcerptTextView squareExcerptTextView, f8q f8qVar, o7q o7qVar) {
        this.b = viewGroup;
        this.c = squareExcerptTextView;
        this.d = f8qVar;
        this.e = o7qVar;
        this.l = new pjb0(viewGroup.getContext(), k840.a.g().b());
        squareExcerptTextView.getContext();
        this.x = R.attr.vk_ui_text_link;
        this.z = new a();
    }

    public static /* synthetic */ void c(r8q r8qVar, u1c0 u1c0Var, s1q s1qVar, boolean z, x7q x7qVar, boolean z2, int i) {
        boolean z3;
        r8q r8qVar2;
        u1c0 u1c0Var2;
        boolean z4;
        x7q x7qVar2;
        if ((i & 2) != 0) {
            s1qVar = null;
        }
        s1q s1qVar2 = s1qVar;
        boolean z5 = (i & 16) != 0 ? false : z2;
        boolean z6 = (i & 32) == 0;
        if ((i & 64) != 0) {
            z3 = false;
            u1c0Var2 = u1c0Var;
            z4 = z;
            x7qVar2 = x7qVar;
            r8qVar2 = r8qVar;
        } else {
            z3 = true;
            r8qVar2 = r8qVar;
            u1c0Var2 = u1c0Var;
            z4 = z;
            x7qVar2 = x7qVar;
        }
        r8qVar2.b(u1c0Var2, s1qVar2, z4, x7qVar2, z5, z6, z3);
    }

    public static boolean e(TextView textView) {
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            Spanned spanned = (Spanned) text;
            if (spanned.getSpans(0, spanned.length(), x7q.class).length != 0) {
                return true;
            }
        }
        return jno0.b(textView);
    }

    public final void a(NewsEntry newsEntry, ej90 ej90Var, PostInteract postInteract, String str) {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
        this.n = str;
        if (newsEntry == null) {
            return;
        }
        this.k = newsEntry;
        if (ej90Var == null) {
            return;
        }
        CharSequence charSequence = ej90Var.a;
        this.i = ej90Var;
        this.h = postInteract;
        CharSequence f = f((!this.o || this.p) ? charSequence : ej90Var.b, newsEntry);
        x7q x7qVar = this.q;
        if (x7qVar == null) {
            if (f instanceof Spannable) {
                Spanned spanned = (Spanned) f;
                x7qVar = (x7q) rl3.O(spanned.getSpans(0, spanned.length(), x7q.class));
            } else {
                x7qVar = null;
            }
        }
        SquareExcerptTextView squareExcerptTextView = this.c;
        if (x7qVar != null) {
            squareExcerptTextView.getContext();
            x7qVar.b(this.x);
        }
        if (x7qVar != null) {
            x7qVar.m = this.z;
        }
        if (!TextUtils.equals(f, squareExcerptTextView.getText()) || !TextUtils.equals(this.m, charSequence)) {
            this.m = charSequence;
            squareExcerptTextView.setText(f);
            if (!this.r) {
                squareExcerptTextView.setContentDescription(ej90Var.c);
            }
        }
        squareExcerptTextView.setTextIsSelectable(this.g);
        squareExcerptTextView.setCustomSelectionActionModeCallback(this.w);
        o7q o7qVar = this.e;
        o7qVar.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        o7qVar.g = false;
        d();
    }

    public final void b(u1c0 u1c0Var, s1q s1qVar, boolean z, x7q x7qVar, boolean z2, boolean z3, boolean z4) {
        this.f = s1qVar;
        this.p = z;
        this.q = x7qVar;
        this.t = z2;
        this.u = z3;
        this.v = z4;
        if (!(u1c0Var instanceof iko0)) {
            this.j = null;
            this.o = true;
            this.g = false;
        } else {
            iko0 iko0Var = (iko0) u1c0Var;
            this.j = iko0Var;
            this.g = iko0Var.r;
            this.o = iko0Var.q;
        }
    }

    public final void d() {
        s1q s1qVar;
        boolean z = this.t;
        SquareExcerptTextView squareExcerptTextView = this.c;
        if (z) {
            View.OnClickListener onClickListener = this.y;
            if (onClickListener == null) {
                onClickListener = this;
            }
            squareExcerptTextView.setOnClickListener(onClickListener);
            return;
        }
        if (this.g || (s1qVar = this.f) == null || !s1qVar.d) {
            squareExcerptTextView.setOnClickListener(null);
            squareExcerptTextView.setClickable(false);
        } else {
            View.OnClickListener onClickListener2 = this.y;
            if (onClickListener2 == null) {
                onClickListener2 = this;
            }
            squareExcerptTextView.setOnClickListener(onClickListener2);
        }
    }

    public final CharSequence f(CharSequence charSequence, NewsEntry newsEntry) {
        Object obj;
        if (!(newsEntry instanceof Post)) {
            return charSequence;
        }
        Iterator<T> it = ((Post) newsEntry).z.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((EntryAttachment) obj).b instanceof PodcastAttachment) {
                break;
            }
        }
        EntryAttachment entryAttachment = (EntryAttachment) obj;
        Attachment attachment = entryAttachment != null ? entryAttachment.b : null;
        if (!(attachment instanceof PodcastAttachment)) {
            return charSequence;
        }
        MusicPlaybackLaunchContext Eb = MusicPlaybackLaunchContext.Fb(this.n).Eb(128);
        MusicTrack musicTrack = ((PodcastAttachment) attachment).f;
        int i = musicTrack.f;
        pjb0 pjb0Var = this.l;
        pjb0Var.d = musicTrack;
        pjb0Var.e = Eb;
        return hd60.a().d(charSequence, new LinksParserData(128, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, i, (taz) pjb0Var, false, 10238));
    }

    public final void g(boolean z) {
        NewsEntry.TrackData Cb;
        this.o = z;
        iko0 iko0Var = this.j;
        if (iko0Var != null) {
            iko0Var.q = z;
        }
        NewsEntry newsEntry = this.k;
        if (newsEntry == null || (Cb = newsEntry.Cb()) == null) {
            return;
        }
        Cb.g = Boolean.valueOf(z);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        s1c0 s1c0Var;
        boolean z = this.u;
        f8q f8qVar = this.d;
        if (z && this.v) {
            f8qVar.x2(true);
            PostInteract postInteract = this.h;
            if (postInteract != null) {
                postInteract.zb(PostInteract.Type.expand);
                return;
            }
            return;
        }
        boolean z2 = this.t;
        a aVar = this.z;
        SquareExcerptTextView squareExcerptTextView = this.c;
        if (!z2 || this.v) {
            if (!e(squareExcerptTextView)) {
                g(false);
                f8qVar.x2(true);
                PostInteract postInteract2 = this.h;
                if (postInteract2 != null) {
                    postInteract2.zb(PostInteract.Type.expand);
                    return;
                }
                return;
            }
            if (this.o) {
                g(true);
                aVar.b(true, false);
                return;
            }
            g(false);
            f8qVar.x2(true);
            PostInteract postInteract3 = this.h;
            if (postInteract3 != null) {
                postInteract3.zb(PostInteract.Type.expand);
                return;
            }
            return;
        }
        if (e(squareExcerptTextView) && this.o) {
            aVar.a(false);
            return;
        }
        if (e(squareExcerptTextView) || this.o) {
            return;
        }
        iko0 iko0Var = this.j;
        if (iko0Var == null || (s1c0Var = iko0Var.n) == null || !s1c0Var.k) {
            int height = squareExcerptTextView.getHeight();
            iko0 iko0Var2 = this.j;
            if (iko0Var2 == null || (num = iko0Var2.u) == null) {
                return;
            }
            int intValue = num.intValue();
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                ValueAnimator ofInt = ValueAnimator.ofInt(height, intValue);
                ofInt.addListener(new s8q(this));
                ofInt.addUpdateListener(new t8q(this));
                ofInt.addListener(new u8q(this));
                ofInt.setDuration(250L);
                ofInt.start();
                this.s = ofInt;
            }
        }
    }

    /* compiled from: ExpandableTextBinder.kt */
    public final class a implements View.OnClickListener {

        /* compiled from: ExpandableTextBinder.kt */
        public static final class b implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ r8q b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;

            public b(r8q r8qVar, int i, int i2) {
                this.b = r8qVar;
                this.c = i;
                this.d = i2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                r8q r8qVar = this.b;
                ViewGroup.LayoutParams layoutParams = r8qVar.b.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = intValue;
                }
                o7q o7qVar = r8qVar.e;
                if (o7qVar != null) {
                    o7qVar.f = intValue / (this.c - this.d);
                }
                r8qVar.b.requestLayout();
            }
        }

        public a() {
        }

        public final void a(boolean z) {
            r8q r8qVar = r8q.this;
            SquareExcerptTextView squareExcerptTextView = r8qVar.c;
            ValueAnimator valueAnimator = r8qVar.s;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                r8qVar.d.h();
                int height = squareExcerptTextView.getHeight();
                ViewGroup viewGroup = r8qVar.b;
                int height2 = squareExcerptTextView.getHeight();
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = height2;
                }
                NewsEntry newsEntry = r8qVar.k;
                ej90 ej90Var = r8qVar.i;
                CharSequence charSequence = ej90Var != null ? ej90Var.a : null;
                if (newsEntry != null && charSequence != null) {
                    charSequence = r8qVar.f(charSequence, newsEntry);
                }
                squareExcerptTextView.setText(charSequence);
                squareExcerptTextView.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = squareExcerptTextView.getMeasuredHeight();
                ValueAnimator valueAnimator2 = r8qVar.s;
                if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(height, measuredHeight);
                    ofInt.addListener(new C3599a(r8qVar, height));
                    ofInt.addUpdateListener(new b(r8qVar, measuredHeight, height));
                    ofInt.addListener(new c(r8qVar, z));
                    ofInt.setDuration(250L);
                    ofInt.start();
                    r8qVar.s = ofInt;
                }
            }
        }

        public final void b(boolean z, boolean z2) {
            int i;
            CharSequence charSequence;
            io.reactivex.rxjava3.disposables.c cVar;
            final CharSequence charSequence2;
            r8q r8qVar = r8q.this;
            f8q f8qVar = r8qVar.d;
            SquareExcerptTextView squareExcerptTextView = r8qVar.c;
            if (r8qVar.v && r8qVar.u) {
                i = 20;
            } else {
                s1q s1qVar = r8qVar.f;
                i = s1qVar != null ? s1qVar.c : Integer.MAX_VALUE;
            }
            if (squareExcerptTextView.getLineCount() > i) {
                f8qVar.x2(z);
                PostInteract postInteract = r8qVar.h;
                if (postInteract != null) {
                    postInteract.zb(PostInteract.Type.expand);
                    return;
                }
                return;
            }
            ej90 ej90Var = r8qVar.i;
            if (ej90Var == null || (charSequence = ej90Var.a) == null) {
                return;
            }
            CharSequence text = squareExcerptTextView.getText();
            int length = text != null ? text.length() : 0;
            if (r8qVar.f == null && Math.abs(length - charSequence.length()) > 6500) {
                f8qVar.x2(z);
                PostInteract postInteract2 = r8qVar.h;
                if (postInteract2 != null) {
                    postInteract2.zb(PostInteract.Type.expand);
                    return;
                }
                return;
            }
            ej90 ej90Var2 = r8qVar.i;
            if (ej90Var2 == null || (charSequence2 = ej90Var2.a) == null) {
                cVar = null;
            } else {
                final TextPaint paint = squareExcerptTextView.getPaint();
                final int width = (squareExcerptTextView.getWidth() - squareExcerptTextView.getPaddingLeft()) - squareExcerptTextView.getPaddingRight();
                final float lineSpacingExtra = squareExcerptTextView.getLineSpacingExtra();
                final float lineSpacingMultiplier = squareExcerptTextView.getLineSpacingMultiplier();
                io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.p8q
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        CharSequence charSequence3 = charSequence2;
                        return Integer.valueOf(StaticLayout.Builder.obtain(charSequence3, 0, charSequence3.length(), paint, width).setLineSpacing(lineSpacingExtra, lineSpacingMultiplier).build().getLineCount());
                    }
                });
                asu0.a.getClass();
                cVar = s0Var.r0(asu0.i()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new n20(new q8q(i, r8qVar, z, this, z2), 25), new f60(new i5n(r8qVar, z), 25));
            }
            if (cVar != null) {
                hg1.b(squareExcerptTextView, cVar);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (r8q.this.t) {
                a(true);
            } else {
                b(false, true);
            }
        }

        /* compiled from: Animator.kt */
        /* renamed from: xsna.r8q$a$a, reason: collision with other inner class name */
        public static final class C3599a implements Animator.AnimatorListener {
            public final /* synthetic */ r8q b;
            public final /* synthetic */ int c;

            public C3599a(r8q r8qVar, int i) {
                this.b = r8qVar;
                this.c = i;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                r8q r8qVar = this.b;
                r8qVar.g(true);
                o7q o7qVar = r8qVar.e;
                o7qVar.g = o7qVar.d;
                iko0 iko0Var = r8qVar.j;
                if (iko0Var != null) {
                    iko0Var.u = Integer.valueOf(this.c);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }
        }

        /* compiled from: Animator.kt */
        public static final class c implements Animator.AnimatorListener {
            public final /* synthetic */ r8q b;
            public final /* synthetic */ boolean c;

            public c(r8q r8qVar, boolean z) {
                this.b = r8qVar;
                this.c = z;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                r8q r8qVar = this.b;
                r8qVar.g(false);
                r8qVar.e.g = false;
                r8qVar.d.Z0(this.c);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }
    }
}
