package xsna;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.user.UserSex;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$SocialProofAuthorType;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedShowIconComment;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.a5u0;
import xsna.qr80;

/* compiled from: OnMediaCommentUiComponent.kt */
/* loaded from: classes4.dex */
public final class a880 implements pyp0 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Matrix E;
    public final LinearGradient F;
    public final Paint G;
    public final Rect H;
    public final Rect I;
    public final Rect J;
    public final Rect K;
    public final RectF L;
    public final io.reactivex.rxjava3.disposables.b M;
    public final fa00 N;
    public final OnMediaUiComponentAnimationDelegate O;
    public final Object P;
    public final int a = cn70.b(120);
    public final int b = cn70.b(47);
    public int c = -1;
    public boolean d;
    public final a5u0.b e;
    public final int f;
    public final int g;
    public b2r h;
    public View i;
    public b880 j;
    public boolean k;
    public hi60 l;
    public NewsEntry m;
    public n880 n;
    public CharSequence o;
    public StaticLayout p;
    public final int q;
    public float r;
    public final float s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public final Paint y;
    public final Paint z;

    /* compiled from: OnMediaCommentUiComponent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserSex.values().length];
            try {
                iArr[UserSex.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserSex.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserSex.MALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a880() {
        View.generateViewId();
        this.d = true;
        this.e = a5u0.b.a;
        this.f = 8388691;
        this.g = cn70.b(12);
        this.o = "";
        this.q = cn70.b(20);
        this.s = cn70.a() * 120.0f;
        Paint b = rqi.b(1, 0);
        b.setShadowLayer(cn70.a() * 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, l8g.f(0.12f, -16777216));
        this.y = b;
        Paint b2 = rqi.b(1, 0);
        b2.setShadowLayer(cn70.a() * 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.a() * 16.0f, l8g.f(0.16f, -16777216));
        this.z = b2;
        ln20 ln20Var = new ln20(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.A = msy.a(lazyThreadSafetyMode, ln20Var);
        this.B = msy.a(lazyThreadSafetyMode, new r(19));
        int i = 25;
        this.C = msy.a(lazyThreadSafetyMode, new gzv(this, i));
        this.D = msy.a(lazyThreadSafetyMode, new x4u(this, i));
        this.E = new Matrix();
        LinearGradient linearGradient = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.a() * 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, -16777216, Shader.TileMode.CLAMP);
        this.F = linearGradient;
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        this.G = paint;
        this.H = new Rect();
        this.I = new Rect();
        this.J = new Rect();
        this.K = new Rect();
        this.L = new RectF();
        this.M = new io.reactivex.rxjava3.disposables.b();
        this.N = new fa00(this, 11);
        this.O = new OnMediaUiComponentAnimationDelegate(new m130(this, 12), new pr6(24), new i440(this, 8));
        this.P = msy.a(lazyThreadSafetyMode, new yv2(25));
    }

    public static RectF s(a880 a880Var, Rect rect, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        RectF rectF = a880Var.L;
        rectF.set(rect.left + 0, rect.top + 0, rect.right + 0, rect.bottom + i);
        return rectF;
    }

    @Override // xsna.pyp0
    public final boolean a(float f, float f2) {
        FeedRecyclerView feedRecyclerView;
        if (!this.u) {
            return false;
        }
        float f3 = this.w - f;
        this.w = an10.b(f3);
        this.x = an10.b(this.x - f2);
        if (!this.v && r()) {
            this.v = true;
            b2r b2rVar = this.h;
            if (b2rVar != null && (feedRecyclerView = b2rVar.b) != null) {
                feedRecyclerView.performHapticFeedback(0);
            }
        }
        return true;
    }

    @Override // xsna.pyp0
    public final int b() {
        return this.c;
    }

    @Override // xsna.pyp0
    public final int c() {
        return this.f;
    }

    @Override // xsna.pyp0
    public final void d(b2r b2rVar) {
        this.h = b2rVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.pyp0
    public final void detach() {
        if (this.k) {
            n880 n880Var = this.n;
            if (n880Var != null) {
                n880Var.Y0(this.N);
            }
            Iterator it = this.O.i.entrySet().iterator();
            while (it.hasNext()) {
                ((OnMediaUiComponentAnimationDelegate.b) ((Map.Entry) it.next()).getValue()).c();
            }
            ccr0 q = q();
            if (q != null) {
                q.t();
            }
            this.M.e();
            this.l = null;
            this.h = null;
            this.i = null;
            this.k = false;
            this.v = false;
            this.u = false;
            this.x = 0;
            this.w = 0;
        }
    }

    @Override // xsna.pyp0
    public final void draw(Canvas canvas) {
        Rect rect = this.K;
        OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate = this.O;
        if (this.d) {
            int save = canvas.save();
            try {
                View view = this.i;
                if (view != null) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                }
                float a2 = onMediaUiComponentAnimationDelegate.a();
                OnMediaUiComponentAnimationDelegate.e eVar = onMediaUiComponentAnimationDelegate.f;
                canvas.scale(a2, onMediaUiComponentAnimationDelegate.a(), rect.exactCenterX() + eVar.a, rect.exactCenterY() + eVar.b);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), cn70.a() * 19.0f, this.y);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), cn70.a() * 19.0f, this.z);
                ccr0 q = q();
                if (q != null) {
                    q.setBounds(rect);
                }
                ccr0 q2 = q();
                if (q2 != null) {
                    q2.draw(canvas);
                }
                p(canvas);
                canvas.restoreToCount(save);
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
    }

    @Override // xsna.pyp0
    public final void e() {
        if (r()) {
            b2r b2rVar = this.h;
            if (b2rVar != null) {
                b2rVar.m(new wq20(this, 11));
                return;
            }
            return;
        }
        int i = this.w;
        int i2 = this.x;
        OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate = this.O;
        OnMediaUiComponentAnimationDelegate.f fVar = onMediaUiComponentAnimationDelegate.g;
        fVar.a = i;
        fVar.b = i2;
        OnMediaUiComponentAnimationDelegate.c(onMediaUiComponentAnimationDelegate, OnMediaUiComponentAnimationDelegate.AnimationType.RETURN, null, 6);
        this.v = false;
        this.u = false;
        this.x = 0;
        this.w = 0;
    }

    @Override // xsna.pyp0
    public final void f(View view) {
        this.i = view;
    }

    @Override // xsna.pyp0
    public final void g(int i) {
        this.c = i;
    }

    @Override // xsna.pyp0
    public final int getHeight() {
        return this.b;
    }

    @Override // xsna.pyp0
    public final int getPaddingBottom() {
        p880 state;
        boolean z = this.k;
        int i = this.q;
        if (z) {
            return i + this.O.h.a;
        }
        n880 n880Var = this.n;
        return i + ((n880Var == null || (state = n880Var.getState()) == null) ? 0 : state.b);
    }

    @Override // xsna.pyp0
    public final int getPaddingStart() {
        return this.g;
    }

    @Override // xsna.pyp0
    public final int getWidth() {
        return this.a;
    }

    @Override // xsna.pyp0
    public final void h() {
        this.u = true;
    }

    @Override // xsna.pyp0
    public final void hide() {
        OnMediaUiComponentAnimationDelegate.c(this.O, OnMediaUiComponentAnimationDelegate.AnimationType.DISAPPEAR, new e550(this, 5), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.pyp0
    public final boolean i(qyp0 qyp0Var, RecyclerView.e0 e0Var) {
        NewsEntry H0;
        b880 b880Var = qyp0Var instanceof b880 ? (b880) qyp0Var : null;
        if (b880Var == null) {
            return false;
        }
        n880 n880Var = e0Var instanceof n880 ? (n880) e0Var : null;
        return n880Var != null && (H0 = n880Var.H0()) != null && epx.f(k9q0.o(H0), b880Var.b) && di60.n(H0) == b880Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pyp0
    public final void j(qyp0 qyp0Var, RecyclerView.e0 e0Var) {
        FeedRecyclerView feedRecyclerView;
        ccr0 q;
        NewsEntry.TrackData Cb;
        ?? r3 = this.A;
        OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate = this.O;
        if (this.k) {
            return;
        }
        String str = null;
        b880 b880Var = qyp0Var instanceof b880 ? (b880) qyp0Var : null;
        if (b880Var == null) {
            return;
        }
        Owner owner = b880Var.f;
        n880 n880Var = e0Var instanceof n880 ? (n880) e0Var : null;
        if (n880Var == null) {
            return;
        }
        this.m = n880Var.H0();
        p880 state = n880Var.getState();
        this.d = !state.a;
        this.n = n880Var;
        qi6 qi6Var = n880Var instanceof qi6 ? (qi6) n880Var : null;
        this.l = qi6Var != null ? qi6Var.i6() : null;
        onMediaUiComponentAnimationDelegate.b(state.b, false);
        n880Var.i2(this.N);
        this.j = b880Var;
        String str2 = owner.d;
        ccr0 q2 = q();
        if (q2 != null) {
            q2.r(str2);
        }
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        BuildInfo.h();
        int i = a.$EnumSwitchMapping$0[owner.l.ordinal()];
        int i2 = R.string.accessibility_on_media_comment_m;
        if (i != 1) {
            if (i == 2) {
                i2 = R.string.accessibility_on_media_comment_f;
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        n880Var.s4(y8g0.f(i2, owner.c));
        if (b880Var.g) {
            OnMediaUiComponentAnimationDelegate.c(onMediaUiComponentAnimationDelegate, OnMediaUiComponentAnimationDelegate.AnimationType.APPEAR, null, 6);
            b2r b2rVar = this.h;
            if (b2rVar != null) {
                b2rVar.q(b880Var, new b880(b880Var.b, b880Var.c, b880Var.d, b880Var.e, b880Var.f, false));
            }
            b880 b880Var2 = this.j;
            if (b880Var2 != null) {
                p4r p4rVar = (p4r) this.P.getValue();
                long j = b880Var2.c;
                UserId userId = b880Var2.b;
                NewsEntry newsEntry = this.m;
                if (newsEntry != null && (Cb = newsEntry.Cb()) != null) {
                    str = Cb.b;
                }
                String str3 = str;
                boolean z = this.m instanceof Videos;
                p4rVar.getClass();
                String valueOf = String.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
                UiTracker uiTracker = UiTracker.a;
                new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(z ? SchemeStat$EventItem.Type.CLIP : SchemeStat$EventItem.Type.POST, Long.valueOf(j), Long.valueOf(userId.b), null, str3, null, 40, null), valueOf, valueOf, null, new MobileOfficialAppsFeedStat$TypeFeedShowIconComment(MobileOfficialAppsFeedStat$SocialProofAuthorType.FROM_FRIEND), 8)).q();
            }
        } else {
            OnMediaUiComponentAnimationDelegate.c(onMediaUiComponentAnimationDelegate, OnMediaUiComponentAnimationDelegate.AnimationType.APPEAR, null, 4);
        }
        CharSequence charSequence = b880Var.d;
        this.o = charSequence;
        float desiredWidth = Layout.getDesiredWidth(charSequence, 0, charSequence.length(), (TextPaint) r3.getValue());
        float f = this.s;
        if (desiredWidth > f) {
            this.r = f;
            this.t = true;
        } else {
            this.r = desiredWidth;
            this.t = false;
        }
        CharSequence charSequence2 = this.o;
        this.p = StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), (TextPaint) r3.getValue(), (int) Math.ceil(desiredWidth)).setMaxLines(1).build();
        b2r b2rVar2 = this.h;
        if (b2rVar2 != null && (feedRecyclerView = b2rVar2.b) != null && (q = q()) != null) {
            q.q(feedRecyclerView);
        }
        ccr0 q3 = q();
        if (q3 != null) {
            q3.s();
        }
        this.k = true;
    }

    @Override // xsna.pyp0
    public final a5u0 k() {
        return this.e;
    }

    @Override // xsna.pyp0
    public final boolean l(float f, float f2) {
        if (!this.d) {
            return false;
        }
        int i = (int) f;
        int i2 = (int) f2;
        return this.K.contains(i, i2) || this.I.contains(i, i2);
    }

    @Override // xsna.pyp0
    public final boolean m(float f, float f2) {
        b880 b880Var;
        Comment comment;
        hi60 hi60Var;
        if (!this.d) {
            return false;
        }
        int i = (int) f;
        int i2 = (int) f2;
        if (!this.K.contains(i, i2) && !this.I.contains(i, i2)) {
            return false;
        }
        NewsEntry newsEntry = this.m;
        if (newsEntry != null && (b880Var = this.j) != null && (comment = b880Var.e) != null) {
            qr80.e eVar = qr80.e.a;
            int[] iArr = comment.l;
            NewsfeedExternalAction newsfeedExternalAction = null;
            if (iArr != null) {
                if (!(iArr.length == 0)) {
                    Post R = di60.R(newsEntry);
                    if (R != null) {
                        newsfeedExternalAction = new NewsfeedExternalAction.c.o(R, comment);
                    }
                    if (newsfeedExternalAction != null && (hi60Var = this.l) != null) {
                        hi60Var.sa(newsfeedExternalAction);
                    }
                }
            }
            newsfeedExternalAction = new NewsfeedExternalAction.c.n(newsEntry, comment, null, eVar);
            if (newsfeedExternalAction != null) {
                hi60Var.sa(newsfeedExternalAction);
            }
        }
        return true;
    }

    @Override // xsna.pyp0
    public final void n(int i, int i2, int i3, int i4) {
        Rect rect = this.H;
        rect.set(i, i3, i2, i4);
        int b = cn70.b(40);
        int b2 = cn70.b(40);
        Rect rect2 = this.K;
        rect2.right = rect2.left + b;
        rect2.bottom = rect2.top + b2;
        int width = rect2.width();
        int i5 = rect.left;
        rect2.left = i5;
        rect2.right = i5 + width;
        int height = rect2.height();
        int i6 = rect.bottom;
        rect2.bottom = i6;
        rect2.top = i6 - height;
        int b3 = cn70.b(16) + an10.b(this.r);
        int b4 = cn70.b(30);
        Rect rect3 = this.I;
        rect3.right = rect3.left + b3;
        rect3.bottom = rect3.top + b4;
        int height2 = rect3.height();
        int i7 = rect.top;
        rect3.top = i7;
        rect3.bottom = i7 + height2;
        int b5 = cn70.b(4);
        int width2 = rect3.width();
        int i8 = rect2.right;
        rect3.left = i8;
        rect3.right = i8 + width2;
        rect3.offset(b5, 0);
        int b6 = cn70.b(14);
        int b7 = cn70.b(11);
        Rect rect4 = this.J;
        rect4.right = rect4.left + b6;
        rect4.bottom = rect4.top + b7;
        int width3 = rect4.width();
        int i9 = rect3.left;
        rect4.left = i9;
        rect4.right = i9 + width3;
        int height3 = rect4.height();
        int i10 = rect3.bottom;
        rect4.bottom = i10;
        rect4.top = i10 - height3;
        rect4.offset(0, cn70.b(3));
        rect4.offset(cn70.b(2), 0);
        o(rect);
        o(rect2);
        o(rect3);
        o(rect4);
    }

    public final void o(Rect rect) {
        boolean z = this.u;
        OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate = this.O;
        rect.offset(z ? this.w : an10.b(onMediaUiComponentAnimationDelegate.g.a), this.u ? this.x : an10.b(onMediaUiComponentAnimationDelegate.g.b));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void p(Canvas canvas) {
        OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate = this.O;
        float a2 = onMediaUiComponentAnimationDelegate.a();
        float a3 = onMediaUiComponentAnimationDelegate.a();
        Rect rect = this.I;
        canvas.scale(a2, a3, rect.left, rect.bottom);
        ?? r0 = this.B;
        int color = (((Paint) r0.getValue()).getColor() >> 24) & 255;
        int saveLayerAlpha = canvas.saveLayerAlpha(s(this, rect, cn70.b(3), 11), color);
        int g = l8g.g(((Paint) r0.getValue()).getColor(), 255);
        ((Paint) r0.getValue()).setColor(g);
        ?? r5 = this.D;
        baf0 baf0Var = (baf0) r5.getValue();
        if (baf0Var != null) {
            baf0Var.a(g);
        }
        baf0 baf0Var2 = (baf0) r5.getValue();
        if (baf0Var2 != null) {
            baf0Var2.setBounds(this.J);
        }
        baf0 baf0Var3 = (baf0) r5.getValue();
        if (baf0Var3 != null) {
            baf0Var3.draw(canvas);
        }
        canvas.drawRoundRect(s(this, rect, 0, 15), cn70.a() * 30.0f, cn70.a() * 30.0f, (Paint) r0.getValue());
        canvas.restoreToCount(saveLayerAlpha);
        int g2 = l8g.g(((Paint) r0.getValue()).getColor(), color);
        ((Paint) r0.getValue()).setColor(g2);
        baf0 baf0Var4 = (baf0) r5.getValue();
        if (baf0Var4 != null) {
            baf0Var4.a(g2);
        }
        RectF s = s(this, rect, 0, 15);
        int saveLayer = canvas.saveLayer(s, null);
        int save = canvas.save();
        canvas.translate(dq.a(8.0f, rect.left), rect.top + cn70.b(5));
        try {
            StaticLayout staticLayout = this.p;
            if (staticLayout != null) {
                staticLayout.draw(canvas);
            }
            canvas.restoreToCount(save);
            if (this.t) {
                Matrix matrix = this.E;
                matrix.reset();
                matrix.postTranslate(rect.right - (cn70.a() * 24.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.F.setLocalMatrix(matrix);
                canvas.drawRect(s, this.G);
            }
            canvas.restoreToCount(saveLayer);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ccr0 q() {
        return (ccr0) this.C.getValue();
    }

    public final boolean r() {
        float f = this.w;
        float f2 = this.x;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f2;
        return ((float) Math.sqrt((double) ((f4 * f4) + (f3 * f3)))) > ((float) ((this.b * 2) / 3));
    }
}
