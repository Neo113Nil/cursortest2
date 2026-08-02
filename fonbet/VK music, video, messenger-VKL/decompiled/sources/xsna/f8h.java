package xsna;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.impl.livecover.LiveCoverType;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$LiveCoverEvent;
import xsna.j8h;

/* compiled from: CommunityLiveCoverDialog.kt */
/* loaded from: classes5.dex */
public final class f8h implements fcn, View.OnLayoutChangeListener {
    public int A;
    public int B;
    public final Activity b;
    public final b c;
    public r8h d;
    public c8h e;
    public final UserId f;
    public final a g;
    public final j8h.b.a h;
    public ew3 i;
    public boolean j;
    public final Handler k = new Handler(Looper.getMainLooper());
    public final i8h l;
    public final FrameLayout m;
    public final w8h n;
    public final g8h o;
    public final View p;
    public final FrameLayout q;
    public ViewGroup r;
    public ViewGroup s;
    public final e8h t;
    public int u;
    public Integer v;
    public final apo w;
    public final Paint x;
    public final xy80 y;
    public final m8x0 z;

    /* compiled from: CommunityLiveCoverDialog.kt */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: CommunityLiveCoverDialog.kt */
    public static final class b {
        public final w8h a;
        public final View b;
        public final View c;

        public b(w8h w8hVar, View view, View view2) {
            this.a = w8hVar;
            this.b = view;
            this.c = view2;
        }
    }

    public f8h(Activity activity, b bVar, r8h r8hVar, c8h c8hVar, UserId userId, a aVar, j8h.b.a aVar2) {
        LiveCoverType type;
        this.b = activity;
        this.c = bVar;
        this.d = r8hVar;
        this.e = c8hVar;
        this.f = userId;
        this.g = aVar;
        this.h = aVar2;
        this.l = new i8h(this, bVar.a.a, bVar.c);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.m = frameLayout;
        w8h w8hVar = new w8h(frameLayout);
        w8hVar.e = true;
        r8h r8hVar2 = this.d;
        w8h.a(w8hVar, r8hVar2, this.e, r8hVar2.c, 8);
        this.n = w8hVar;
        g8h g8hVar = new g8h(activity);
        this.u = ((Number) aVar2.invoke()).intValue();
        zwt0.b(activity);
        f4m.a(g8hVar, new zv(7, this, g8hVar));
        this.o = g8hVar;
        View findViewById = activity.findViewById(R.id.content);
        this.p = findViewById;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.q = frameLayout2;
        apo apoVar = new apo(com.vkontakte.android.R.attr.vk_ui_header_background);
        this.w = apoVar;
        Paint paint = new Paint();
        paint.setColor(apoVar.a());
        this.x = paint;
        xy80 xy80Var = new xy80(activity);
        this.y = xy80Var;
        this.z = new m8x0(activity, f8h.class.getName());
        this.e.a.invoke(new CommunityProfileAction.g.d.f(true));
        this.e.a.invoke(new CommunityProfileAction.g.d.e());
        aVar.a();
        this.e.a.invoke(CommunityProfileAction.g.d.a.b);
        xy80Var.enable();
        xy80Var.f();
        frameLayout2.addView(frameLayout);
        g8hVar.addView(frameLayout2);
        e8h e8hVar = new e8h(this, activity);
        this.t = e8hVar;
        g8hVar.addView(e8hVar);
        activity.getWindow().addContentView(g8hVar, new ViewGroup.LayoutParams(-1, -1));
        e8hVar.setVisibility(4);
        frameLayout2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.e.a.invoke(new CommunityProfileAction.g.d.C1587d(true));
        awt0.t(g8hVar, new pff(this, 7));
        gwh<?, ?> gwhVar = this.d.j;
        if (gwhVar != null && (type = gwhVar.getType()) != null) {
            siz.b(Long.valueOf(userId.b), MobileOfficialAppsGroupsStat$LiveCoverEvent.LiveCoverEventType.REVEAL, siz.a(type), null, null);
        }
        findViewById.addOnLayoutChangeListener(this);
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    public final void a(float f) {
        this.x.setAlpha((int) (f * 255));
        e8h e8hVar = this.t;
        if (e8hVar != null) {
            e8hVar.invalidate();
        }
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        b bVar = this.c;
        View view = bVar.b;
        if (this.j) {
            return;
        }
        int i = 1;
        this.j = true;
        r8h r8hVar = this.d;
        int i2 = r8hVar.c;
        gwh<?, ?> gwhVar = r8hVar.j;
        LiveCoverType type = gwhVar != null ? gwhVar.getType() : null;
        long j = this.f.b;
        if (type != null) {
            siz.b(Long.valueOf(j), MobileOfficialAppsGroupsStat$LiveCoverEvent.LiveCoverEventType.HIDE, siz.a(type), null, null);
        }
        w8h.a(bVar.a, this.d, this.e, i2, 8);
        this.e.a.invoke(new CommunityProfileAction.g.d.C1587d(true));
        i8h i8hVar = this.l;
        w8h w8hVar = this.n;
        View view2 = this.p;
        i8hVar.a(w8hVar, view, view2);
        w8hVar.d();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.addUpdateListener(new h8h(i8hVar, w8hVar, view, view2));
        ofFloat.setInterpolator(i8hVar.c);
        ofFloat.setDuration(300L);
        ofFloat.addListener(new lv1(new v0y0(this, i), 2));
        ofFloat.start();
        i8hVar.k = ofFloat;
    }

    @Override // xsna.fcn
    public final void dismiss() {
        b(false);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view.getMeasuredHeight() == this.A && view.getMeasuredWidth() == this.B) {
            return;
        }
        this.A = view.getMeasuredHeight();
        this.B = view.getMeasuredWidth();
        this.m.postDelayed(new tw3(this, 4), 100L);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }
}
