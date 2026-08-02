package com.vk.writebar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.am;
import xsna.bwt0;
import xsna.cfz;
import xsna.cmc0;
import xsna.e3m;
import xsna.e43;
import xsna.iah0;
import xsna.iut0;
import xsna.j6r0;
import xsna.mhq0;
import xsna.qah0;
import xsna.sjo;

/* compiled from: VideoRecordControlPopupWindow.kt */
/* loaded from: classes7.dex */
public final class a {
    public static final int C;
    public static final int D;
    public qah0 B;
    public final int a;
    public final int b;
    public final Context c;
    public final View d;
    public int e;
    public int f;
    public final d g;
    public ObjectAnimator h;
    public WaveRecordCircleView i;
    public C2099a j;
    public View k;
    public final View l;
    public View m;
    public View n;
    public View o;
    public View p;
    public View q;
    public View r;
    public View s;
    public ImageView t;
    public boolean u;
    public long v;
    public boolean w;
    public boolean x;
    public final int y = iah0.a(48);
    public final PointF z = new PointF(-1.0f, -1.0f);
    public final PointF A = new PointF(-1.0f, -1.0f);

    /* compiled from: VideoRecordControlPopupWindow.kt */
    /* renamed from: com.vk.writebar.a$a, reason: collision with other inner class name */
    public final class C2099a extends PopupWindow {
        public C2099a(View view, int i, int i2) {
            super(view, i, i2, true);
        }

        public final void a() {
            a aVar = a.this;
            WaveRecordCircleView waveRecordCircleView = aVar.i;
            if (waveRecordCircleView != null) {
                waveRecordCircleView.setPaintColor(aVar.f);
            }
            super.dismiss();
        }

        @Override // android.widget.PopupWindow
        public final void dismiss() {
            a.a(a.this);
        }
    }

    /* compiled from: VideoRecordControlPopupWindow.kt */
    public static final class b {
        public static final void a(View view, boolean z) {
            int i = a.C;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (view != null) {
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (view != null) {
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (view != null) {
                if (z) {
                    f = 1.0f;
                }
                view.setAlpha(f);
            }
            if (view != null) {
                view.setScaleX(z ? 1.0f : 0.1f);
            }
            if (view != null) {
                view.setScaleY(z ? 1.0f : 0.1f);
            }
            if (view != null) {
                view.setVisibility(z ? 0 : 8);
            }
        }
    }

    /* compiled from: VideoRecordControlPopupWindow.kt */
    public final class c extends j {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            a aVar = a.this;
            try {
                if (aVar.l.getVisibility() == 0) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        aVar.l.dispatchTouchEvent(motionEvent);
                    } else if (action == 1) {
                        if (a(aVar.n, motionEvent)) {
                            aVar.l.performClick();
                            a.a(aVar);
                        } else {
                            motionEvent.setAction(3);
                            aVar.l.dispatchTouchEvent(motionEvent);
                        }
                    }
                }
                return true;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
    }

    /* compiled from: VideoRecordControlPopupWindow.kt */
    public interface d {
        void a();

        void b();

        void c(float f, int i);

        void d();

        void onCancel();
    }

    /* compiled from: VideoRecordControlPopupWindow.kt */
    public final class e implements View.OnLayoutChangeListener {
        public long b;

        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.b > 100) {
                this.b = currentTimeMillis;
                a aVar = a.this;
                Point c = aVar.c();
                ViewGroup viewGroup = (ViewGroup) aVar.d.getParent();
                int[] iArr = new int[2];
                viewGroup.getLocationInWindow(iArr);
                C2099a c2099a = aVar.j;
                if (c2099a != null) {
                    c2099a.update(iArr[0], c.y, viewGroup.getWidth(), aVar.b);
                }
            }
        }
    }

    /* compiled from: VideoRecordControlPopupWindow.kt */
    public final class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.g.b();
        }
    }

    /* compiled from: VideoRecordControlPopupWindow.kt */
    public final class g extends j {
        public boolean d;
        public float e = -1.0f;
        public float f = -1.0f;

        public g() {
        }

        public final void b(boolean z) {
            if (this.d != z) {
                this.d = z;
                a aVar = a.this;
                View view = z ? aVar.m : aVar.p;
                j6r0.d(z ? aVar.p : aVar.m, 8, true, 150, null);
                j6r0.d(view, 0, true, 150, null);
                if (z) {
                    aVar.h.start();
                } else {
                    aVar.h.reverse();
                }
            }
        }

        public final boolean c() {
            a aVar = a.this;
            float f = aVar.z.y;
            float f2 = aVar.A.y;
            return f < f2 && Math.abs(f - f2) > ((float) aVar.y);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0161 A[Catch: IllegalArgumentException -> 0x0196, TryCatch #0 {IllegalArgumentException -> 0x0196, blocks: (B:3:0x0007, B:5:0x000f, B:6:0x001b, B:8:0x0021, B:9:0x002d, B:12:0x0040, B:14:0x0059, B:17:0x006a, B:23:0x0088, B:26:0x008c, B:30:0x0092, B:34:0x009c, B:37:0x00b6, B:39:0x00be, B:42:0x00c6, B:44:0x00ce, B:45:0x00d1, B:49:0x00d9, B:52:0x00e5, B:53:0x00f6, B:55:0x00fc, B:57:0x0104, B:60:0x010a, B:62:0x0110, B:64:0x0114, B:65:0x0122, B:67:0x0126, B:70:0x0148, B:73:0x014e, B:74:0x0153, B:75:0x012c, B:76:0x015b, B:78:0x0118, B:79:0x011c, B:80:0x0161, B:82:0x0178, B:83:0x0186, B:85:0x018f, B:87:0x003e, B:88:0x0026, B:89:0x0014), top: B:2:0x0007 }] */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            int action;
            a aVar = a.this;
            try {
                float x = this.e == -1.0f ? motionEvent.getX() : motionEvent.getRawX() - this.e;
                float y = this.f == -1.0f ? motionEvent.getY() : motionEvent.getRawX() - this.f;
                View view2 = aVar.q;
                d dVar = aVar.g;
                float f = ((float) view2.getRight()) + x > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? x : -r7;
                View view3 = aVar.q;
                int abs = ((int) Math.abs(f)) / 2;
                int[] iArr = this.c;
                view3.getLocationOnScreen(iArr);
                if (iArr[1] - abs <= ((int) motionEvent.getRawY())) {
                    if (view3.getHeight() + iArr[1] >= ((int) motionEvent.getRawY())) {
                        z = true;
                        boolean c = c();
                        aVar.z.set(motionEvent.getRawX(), motionEvent.getRawY());
                        action = motionEvent.getAction();
                        if (action == 0) {
                            if (action != 1) {
                                if (action != 2) {
                                    if (action != 3) {
                                        view.setPressed(false);
                                        return false;
                                    }
                                } else if (!aVar.x) {
                                    if (aVar.w && x < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        aVar.q.animate().translationX(f).setDuration(0L).start();
                                        dVar.c(f, 0);
                                        boolean z2 = this.d;
                                        if (!z2 && z && a.C + x <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            b(true);
                                        } else if (!z || (z2 && x + a.C > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                                            b(false);
                                        }
                                    }
                                    if (aVar.w && y < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        float abs2 = Math.abs(y);
                                        float f2 = a.D;
                                        if (abs2 >= f2) {
                                            y = -f2;
                                        }
                                        aVar.q.animate().translationY(y).setDuration(0L).start();
                                    }
                                    if (c != c()) {
                                        aVar.f(c());
                                        return true;
                                    }
                                }
                            }
                            if (!aVar.x) {
                                if (c()) {
                                    aVar.g();
                                    dVar.a();
                                } else if (this.d) {
                                    dVar.onCancel();
                                } else {
                                    dVar.b();
                                }
                                if (aVar.w) {
                                    if (!this.d || !z) {
                                        aVar.q.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(100L).start();
                                        dVar.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100);
                                    }
                                    if (this.d && !z) {
                                        aVar.h.reverse();
                                    }
                                    aVar.w = false;
                                    this.e = -1.0f;
                                    this.f = -1.0f;
                                }
                                view.setPressed(false);
                                this.d = false;
                                return true;
                            }
                        } else {
                            aVar.A.set(motionEvent.getRawX(), motionEvent.getRawY());
                            if (a(aVar.q, motionEvent)) {
                                Point c2 = aVar.c();
                                this.e = c2.x;
                                this.f = c2.y;
                            }
                            aVar.w = true;
                            dVar.d();
                            if (aVar.x) {
                                aVar.g();
                                dVar.a();
                            }
                        }
                        return true;
                    }
                }
                z = false;
                boolean c3 = c();
                aVar.z.set(motionEvent.getRawX(), motionEvent.getRawY());
                action = motionEvent.getAction();
                if (action == 0) {
                }
                return true;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
    }

    /* compiled from: VideoRecordControlPopupWindow.kt */
    public final class h implements View.OnHoverListener {
        public h() {
        }

        @Override // android.view.View.OnHoverListener
        public final boolean onHover(View view, MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            float rawY = motionEvent.getRawY();
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getRawX(), rawY, motionEvent.getMetaState());
            Activity h = e3m.h(a.this.d.getContext());
            if (h == null) {
                return true;
            }
            h.dispatchGenericMotionEvent(obtain);
            return true;
        }
    }

    /* compiled from: VideoRecordControlPopupWindow.kt */
    public final class i implements View.OnTouchListener {
        public i() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            try {
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                view.getLocationOnScreen(new int[2]);
                MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), actionMasked, motionEvent.getX(actionIndex) + r2[0], motionEvent.getY(actionIndex) + r2[1], motionEvent.getMetaState());
                Activity h = e3m.h(a.this.d.getContext());
                if (h != null) {
                    h.dispatchTouchEvent(obtain);
                }
                return true;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
    }

    /* compiled from: VideoRecordControlPopupWindow.kt */
    public abstract class j implements View.OnTouchListener {
        public final Rect b = new Rect();
        public final int[] c = new int[2];

        public final boolean a(View view, MotionEvent motionEvent) {
            Rect rect = this.b;
            view.getDrawingRect(rect);
            int[] iArr = this.c;
            view.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            return rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
    }

    /* compiled from: VideoRecordControlPopupWindow.kt */
    public static final class k extends AnimatorListenerAdapter {
        public final /* synthetic */ AnimatorSet b;
        public final /* synthetic */ a c;
        public final /* synthetic */ boolean d;

        public k(AnimatorSet animatorSet, a aVar, boolean z) {
            this.b = animatorSet;
            this.c = aVar;
            this.d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C2099a c2099a;
            if (animator.equals(this.b)) {
                a aVar = this.c;
                aVar.u = false;
                aVar.v = 0L;
                if (this.d || (c2099a = aVar.j) == null) {
                    return;
                }
                c2099a.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (animator.equals(this.b)) {
                long currentTimeMillis = System.currentTimeMillis();
                a aVar = this.c;
                aVar.v = currentTimeMillis;
                aVar.u = true;
            }
        }
    }

    static {
        WeakHashMap weakHashMap = j6r0.a;
        iah0.a(48.0f);
        C = iah0.a(80.0f);
        D = iah0.a(48);
    }

    public a(Context context, View view, TextView textView, d dVar) {
        this.c = context;
        this.g = dVar;
        this.d = view;
        this.l = textView;
        this.e = context.getResources().getColor(R.color.vk_red);
        this.f = context.getResources().getColor(R.color.vk_blue_400);
        this.a = context.getResources().getDimensionPixelSize(R.dimen.voice_rec_button_width);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.video_rec_button_height);
        context.getResources().getDimensionPixelSize(R.dimen.voice_rec_button_shift_y_hor);
        context.getResources().getDimensionPixelSize(R.dimen.voice_rec_button_shift_y_vert);
    }

    public static final void a(a aVar) {
        Context context = aVar.c;
        if (context != null) {
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            if (context2.getApplicationInfo().targetSdkVersion < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    public final void b(boolean z) {
        WaveRecordCircleView waveRecordCircleView;
        WaveRecordCircleView waveRecordCircleView2;
        View view;
        long currentTimeMillis = this.u ? System.currentTimeMillis() - this.v : 0L;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float scaleX = z ? 0.0f : this.u ? this.i.getScaleX() : 1.0f;
        float f3 = z ? 1.0f : 0.0f;
        View view2 = this.q;
        int[] iArr = new int[2];
        View view3 = this.d;
        view3.getLocationOnScreen(iArr);
        int width = (view3.getWidth() / 2) + iArr[0];
        int height = (view3.getHeight() / 2) + iArr[1];
        int i2 = (this.a / 2) + c().x;
        view2.getTranslationX();
        PointF pointF = new PointF(width - i2, height - ((this.b / 2) + r11.y));
        float translationX = z ? pointF.x : (!this.u || (waveRecordCircleView = this.i) == null) ? 0.0f : waveRecordCircleView.getTranslationX();
        float translationY = z ? pointF.y : (!this.u || (waveRecordCircleView2 = this.i) == null) ? 0.0f : waveRecordCircleView2.getTranslationY();
        float f4 = z ? 0.0f : pointF.x;
        if (!z) {
            f2 = pointF.y;
        }
        if (currentTimeMillis == 0) {
            currentTimeMillis = 200;
        }
        int i3 = (!z && currentTimeMillis == 0) ? 100 : 0;
        View view4 = this.p;
        if (view4 == null || view4.getVisibility() != 0) {
            View view5 = this.o;
            view = (view5 == null || view5.getVisibility() != 0) ? this.m : this.o;
        } else {
            view = this.p;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, scaleX, f3);
        float f5 = f3;
        Property property2 = View.SCALE_Y;
        float f6 = translationX;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, scaleX, f5);
        Property property3 = View.TRANSLATION_X;
        float f7 = f2;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property3, f6, f4);
        Property property4 = View.TRANSLATION_Y;
        float f8 = scaleX;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(view, (Property<View, Float>) property4, translationY, f7), ObjectAnimator.ofFloat(this.k, (Property<View, Float>) property, f8, f5), ObjectAnimator.ofFloat(this.k, (Property<View, Float>) property2, f8, f5), ObjectAnimator.ofFloat(this.k, (Property<View, Float>) property3, f6, f4), ObjectAnimator.ofFloat(this.k, (Property<View, Float>) property4, translationY, f7), ObjectAnimator.ofFloat(this.i, (Property<WaveRecordCircleView, Float>) property, f8, f5), ObjectAnimator.ofFloat(this.i, (Property<WaveRecordCircleView, Float>) property2, f8, f5), ObjectAnimator.ofFloat(this.i, (Property<WaveRecordCircleView, Float>) property3, f6, f4), ObjectAnimator.ofFloat(this.i, (Property<WaveRecordCircleView, Float>) property4, translationY, f7));
        animatorSet.addListener(new k(animatorSet, this, z));
        animatorSet.setStartDelay(i3);
        animatorSet.setDuration(currentTimeMillis);
        animatorSet.start();
    }

    public final Point c() {
        int[] iArr = new int[2];
        View view = this.d;
        view.getLocationOnScreen(iArr);
        iah0.j(this.c);
        return new Point(iArr[0] - (view.getWidth() / 2), (view.getHeight() + iArr[1]) - this.b);
    }

    public final boolean d() {
        C2099a c2099a = this.j;
        return c2099a != null && c2099a.isShowing();
    }

    public final void e(boolean z) {
        qah0 qah0Var;
        Drawable drawable;
        C2099a c2099a = this.j;
        View view = this.d;
        if (c2099a == null) {
            View inflate = LayoutInflater.from(this.c).inflate(R.layout.video_record_control, (ViewGroup) null);
            inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            inflate.setOnTouchListener(new i());
            inflate.setOnHoverListener(new h());
            this.q = inflate.findViewById(R.id.content);
            View findViewById = inflate.findViewById(R.id.button_rec);
            findViewById.setOnTouchListener(new g());
            am.a aVar = am.a.e;
            iut0.o(findViewById, aVar, findViewById.getResources().getString(R.string.accessibility_msg_record_videomsg), new cmc0(this, 7));
            this.p = findViewById;
            View findViewById2 = inflate.findViewById(R.id.button_send);
            findViewById2.setOnClickListener(new f());
            this.o = findViewById2;
            this.m = inflate.findViewById(R.id.button_cancel);
            this.k = inflate.findViewById(R.id.wave_shadow_view);
            View findViewById3 = inflate.findViewById(R.id.button_dismiss_area);
            findViewById3.setOnTouchListener(new c());
            iut0.o(findViewById3, aVar, findViewById3.getResources().getString(R.string.audio_message_slide_to_cancel), new cfz(this, 20));
            this.n = findViewById3;
            WaveRecordCircleView waveRecordCircleView = (WaveRecordCircleView) inflate.findViewById(R.id.wave_record_circle_view);
            waveRecordCircleView.setPaintColor(this.f);
            waveRecordCircleView.setScale(1.8f);
            this.i = waveRecordCircleView;
            this.r = inflate.findViewById(R.id.action_btn);
            this.s = inflate.findViewById(R.id.pull_to_lock);
            this.t = (ImageView) inflate.findViewById(R.id.lock);
            view.getRootView().addOnLayoutChangeListener(new e());
            this.h = ObjectAnimator.ofObject(this.i, "paintColor", new ArgbEvaluator(), Integer.valueOf(this.f), Integer.valueOf(this.e));
            C2099a c2099a2 = new C2099a(inflate, ((ViewGroup) view.getParent()).getWidth(), this.b);
            this.j = c2099a2;
            c2099a2.setInputMethodMode(2);
            C2099a c2099a3 = this.j;
            if (c2099a3 != null) {
                c2099a3.setBackgroundDrawable(new BitmapDrawable());
            }
            C2099a c2099a4 = this.j;
            if (c2099a4 != null) {
                c2099a4.setOutsideTouchable(true);
            }
            C2099a c2099a5 = this.j;
            if (c2099a5 != null) {
                c2099a5.setFocusable(false);
            }
            C2099a c2099a6 = this.j;
            if (c2099a6 != null) {
                c2099a6.update();
            }
            C2099a c2099a7 = this.j;
            if (c2099a7 != null) {
                c2099a7.setClippingEnabled(false);
            }
        }
        this.x = z;
        if (z) {
            View view2 = this.r;
            if (view2 != null) {
                bwt0.p0(view2, false);
            }
        } else {
            View view3 = this.r;
            if (view3 != null) {
                bwt0.p0(view3, true);
            }
            b.a(this.s, true);
            b.a(this.t, false);
        }
        ImageView imageView = this.t;
        if (imageView != null && (drawable = imageView.getDrawable()) != null) {
            sjo.b(drawable, this.f, PorterDuff.Mode.SRC_IN);
        }
        WaveRecordCircleView waveRecordCircleView2 = this.i;
        if (waveRecordCircleView2 != null) {
            waveRecordCircleView2.setPaintColor(this.f);
        }
        this.l.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.zat0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                com.vk.writebar.a aVar2 = com.vk.writebar.a.this;
                View view4 = aVar2.l;
                if (view4.getVisibility() == 0) {
                    View view5 = aVar2.n;
                    if (view5 != null) {
                        view5.setVisibility(0);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view4.getWidth(), view4.getHeight());
                    layoutParams.gravity = 80;
                    View view6 = aVar2.n;
                    if (view6 != null) {
                        view6.setLayoutParams(layoutParams);
                    }
                }
            }
        });
        b.a(this.o, false);
        b.a(this.m, false);
        b.a(this.k, true);
        View view4 = this.q;
        if (view4 != null) {
            view4.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view4.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (view.getWindowToken() != null) {
            Point c2 = c();
            int[] iArr = new int[2];
            ((ViewGroup) view.getParent()).getLocationOnScreen(iArr);
            if (d()) {
                b.a(this.p, false);
                View view5 = this.o;
                View view6 = this.p;
                j6r0.d(view5, 8, true, 150, null);
                j6r0.d(view6, 0, true, 150, null);
                view6.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view6.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.m.setVisibility(8);
            } else {
                b.a(this.p, true);
                b(true);
            }
            this.w = true;
            view.post(new mhq0(this, iArr, c2, 1));
        }
        if (!z && (qah0Var = this.B) != null) {
            qah0Var.invoke();
        }
        this.B = null;
    }

    public final void f(boolean z) {
        View view;
        View view2 = z ? this.s : this.t;
        View view3 = z ? this.t : this.s;
        j6r0.d(view2, 8, true, 150, null);
        j6r0.d(view3, 0, true, 150, null);
        view3.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view3.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (!z || (view = this.q) == null) {
            return;
        }
        view.performHapticFeedback(0);
    }

    public final void g() {
        View view = this.p;
        View view2 = this.o;
        j6r0.d(view, 8, true, 150, null);
        j6r0.d(view2, 0, true, 150, null);
        view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.m.setVisibility(8);
    }
}
