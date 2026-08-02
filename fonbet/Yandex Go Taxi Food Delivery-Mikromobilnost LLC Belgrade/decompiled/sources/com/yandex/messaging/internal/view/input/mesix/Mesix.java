package com.yandex.messaging.internal.view.input.mesix;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.as10;
import defpackage.bs10;
import defpackage.cs10;
import defpackage.drb1;
import defpackage.ds10;
import defpackage.e3n;
import defpackage.e8m;
import defpackage.e9h0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jng0;
import defpackage.kp50;
import defpackage.lfx;
import defpackage.ly4;
import defpackage.o430;
import defpackage.oyh0;
import defpackage.pj91;
import defpackage.qoi0;
import defpackage.rm91;
import defpackage.scc;
import defpackage.sls;
import defpackage.t8;
import defpackage.tls;
import defpackage.vqb1;
import defpackage.w3c;
import defpackage.w511;
import defpackage.w53;
import defpackage.wwg0;
import defpackage.xyz;
import defpackage.zgv;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.x509.ReasonFlags;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010#\u001a\u00020\u000f\"\n\b\u0000\u0010 \u0018\u0001*\u00020\u001f2\u000e\b\b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0!H\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010$J/\u0010%\u001a\u00020\u000f\"\n\b\u0000\u0010 \u0018\u0001*\u00020\u001f2\u000e\b\b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0!H\u0086\bø\u0001\u0000¢\u0006\u0004\b%\u0010$J5\u0010'\u001a\u00020\u000f\"\n\b\u0000\u0010 \u0018\u0001*\u00020\u001f2\u0014\b\b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170&H\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J/\u0010-\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0014¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u00100J\u0011\u00102\u001a\u00020\u000f*\u000201¢\u0006\u0004\b2\u00103R1\u00106\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001f05\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0!048\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R1\u0010:\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001f05\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0!048\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R7\u0010<\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001f05\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170&048\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u00109R*\u0010?\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010N\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010LR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010QR\u0014\u0010\r\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010QR\u0014\u0010S\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010QR\u0014\u0010T\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010QR\u0014\u0010U\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010QR\u0014\u0010V\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010QR\u001b\u0010\\\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020^0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010\r\u001a\u00020\f*\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006c"}, d2 = {"Lcom/yandex/messaging/internal/view/input/mesix/Mesix;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "", "progress", "scale", "Lzy11;", "drawTimerProgress", "(Landroid/graphics/Canvas;FF)V", "drawProgress", "(Landroid/graphics/Canvas;F)V", ReasonFlags.UNUSED, "onClick", "(Landroid/view/View;)Lzy11;", "", "onLongClick", "(Landroid/view/View;)Z", "view", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Lds10;", "T", "Lkotlin/Function0;", "listener", "setClickListener", "(Lsls;)V", "setLongClickListener", "Lkotlin/Function1;", "setTouchListener", "(Ltls;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "draw", "(Landroid/graphics/Canvas;)V", "Lbs10;", "init", "(Lbs10;)V", "", "Llfx;", "clickListeners", "Ljava/util/Map;", "getClickListeners", "()Ljava/util/Map;", "longClickListeners", "getLongClickListeners", "touchListeners", "getTouchListeners", "value", ClidProvider.STATE, "Lds10;", "getState", "()Lds10;", "setState", "(Lds10;)V", "Lw3c;", "clock", "Lw3c;", "Landroid/graphics/Rect;", "bounds", "Landroid/graphics/Rect;", "bgColor", CA20Status.STATUS_USER_I, "iconColor", "panelOpenedIconColor", "Landroid/graphics/drawable/Drawable;", "bg", "Landroid/graphics/drawable/Drawable;", "timer", "close", "submit", "mic", "panelOpened", "Landroid/graphics/Paint;", "timerProgressPaint$delegate", "Li3y;", "getTimerProgressPaint", "()Landroid/graphics/Paint;", "timerProgressPaint", "", "Le3n;", "rateLimiterMaxValues", "Ljava/util/List;", "getProgress", "(Lbs10;)F", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Mesix extends View {
    public static final int $stable = 8;
    private final Drawable bg;
    private final int bgColor;
    private final Rect bounds;
    private final Map<lfx, sls> clickListeners;
    private final w3c clock;
    private final Drawable close;
    private final int iconColor;
    private final Map<lfx, sls> longClickListeners;
    private final Drawable mic;
    private final Drawable panelOpened;
    private final int panelOpenedIconColor;
    private final Drawable progress;
    private final List<e3n> rateLimiterMaxValues;
    private ds10 state;
    private final Drawable submit;
    private final Drawable timer;

    /* renamed from: timerProgressPaint$delegate, reason: from kotlin metadata */
    private final i3y timerProgressPaint;
    private final Map<lfx, tls> touchListeners;

    public Mesix(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.clickListeners = new w53(3);
        this.longClickListeners = new w53(1);
        this.touchListeners = new w53(1);
        this.state = cs10.c;
        this.clock = new w3c();
        this.bounds = new Rect();
        int c = drb1.c(jng0.messagingChatSendIconBackgroundColor, context);
        this.bgColor = c;
        int c2 = drb1.c(jng0.messagingChatSendIconColor, context);
        this.iconColor = c2;
        int c3 = drb1.c(jng0.messagingCommonTextPrimaryColor, context);
        this.panelOpenedIconColor = c3;
        this.timerProgressPaint = a.a(new xyz(23, this));
        this.bg = rm91.d(vqb1.e(wwg0.msg_send_btn_bg, context), c);
        this.timer = rm91.d(vqb1.e(wwg0.msg_send_btn_timer, context), c2);
        this.mic = rm91.d(vqb1.e(wwg0.msg_send_btn_mic, context), c2);
        this.progress = rm91.d(vqb1.e(wwg0.msg_send_btn_progress, context), c2);
        this.submit = rm91.d(vqb1.e(wwg0.msg_send_btn_submit, context), c2);
        this.close = rm91.d(vqb1.e(wwg0.msg_ic_16_close, context), c2);
        this.panelOpened = rm91.d(vqb1.e(wwg0.msg_ic_chat_input_emoji_hide, context), c3);
        pj91.i(oyh0.f66voice_button_in_chat_window_content_des, this);
        setId(e9h0.chat_mesix);
        setOnClickListener(new zgv(13, this));
        setOnLongClickListener(new ly4(7, this));
        setOnTouchListener(new t8(12, this));
        o430 o430Var = e3n.b;
        e3n e3nVar = new e3n(kp50.U(10, DurationUnit.SECONDS));
        DurationUnit durationUnit = DurationUnit.MINUTES;
        this.rateLimiterMaxValues = scc.g(e3nVar, new e3n(kp50.U(1, durationUnit)), new e3n(kp50.U(2, durationUnit)), new e3n(kp50.U(5, durationUnit)));
    }

    private final void drawProgress(Canvas canvas, float scale) {
        this.clock.getClass();
        rm91.c(this.progress, canvas, scale, ((SystemClock.elapsedRealtime() % 600.0f) / 600.0f) * 360.0f);
        postInvalidate();
    }

    private final void drawTimerProgress(Canvas canvas, float progress, float scale) {
        float f = 1.0f - scale;
        float width = (this.bounds.width() * f) / 2.0f;
        float height = (this.bounds.height() * f) / 2.0f;
        Rect rect = this.bounds;
        canvas.drawArc(rect.left + width, rect.top + height, rect.right - width, rect.bottom - height, -90.0f, 360.0f - (progress * 360.0f), false, getTimerProgressPaint());
        if (progress < 1.0f) {
            postInvalidate();
        }
    }

    private final float getProgress(bs10 bs10Var) {
        this.clock.getClass();
        float elapsedRealtime = (SystemClock.elapsedRealtime() - bs10Var.b) / bs10Var.c;
        if (elapsedRealtime > 1.0f) {
            return 1.0f;
        }
        return elapsedRealtime;
    }

    private final Paint getTimerProgressPaint() {
        return (Paint) this.timerProgressPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zy11 onClick(View unused) {
        sls slsVar = this.clickListeners.get(qoi0.a(this.state.getClass()));
        if (slsVar == null) {
            return null;
        }
        slsVar.invoke();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onLongClick(View unused) {
        sls slsVar = this.longClickListeners.get(qoi0.a(this.state.getClass()));
        if (slsVar == null) {
            return false;
        }
        slsVar.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onTouch(View view, MotionEvent event) {
        tls tlsVar = this.touchListeners.get(qoi0.a(this.state.getClass()));
        if (tlsVar != null) {
            return ((Boolean) tlsVar.invoke(event)).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint timerProgressPaint_delegate$lambda$1(Mesix mesix) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f * e8m.a.density);
        paint.setColor(mesix.iconColor);
        paint.setDither(true);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        return paint;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        ds10 ds10Var = this.state;
        if (jl40.l(ds10Var, cs10.b)) {
            this.bg.draw(canvas);
            drawProgress(canvas, 0.75f);
            return;
        }
        if (jl40.l(ds10Var, cs10.c)) {
            this.bg.draw(canvas);
            this.mic.draw(canvas);
            return;
        }
        if (jl40.l(ds10Var, as10.a)) {
            this.bg.draw(canvas);
            rm91.c(this.submit, canvas, 0.75f, 0.0f);
            return;
        }
        if (ds10Var instanceof bs10) {
            this.bg.draw(canvas);
            drawTimerProgress(canvas, getProgress((bs10) ds10Var), 0.85f);
            rm91.c(this.timer, canvas, 0.5f, 0.0f);
        } else if (jl40.l(ds10Var, cs10.a)) {
            this.bg.draw(canvas);
            drawProgress(canvas, 0.95f);
            rm91.c(this.close, canvas, 0.45f, 0.0f);
        } else if (jl40.l(ds10Var, cs10.d)) {
            this.panelOpened.draw(canvas);
        } else {
            w511.b();
        }
    }

    public final Map<lfx, sls> getClickListeners() {
        return this.clickListeners;
    }

    public final Map<lfx, sls> getLongClickListeners() {
        return this.longClickListeners;
    }

    public final ds10 getState() {
        return this.state;
    }

    public final Map<lfx, tls> getTouchListeners() {
        return this.touchListeners;
    }

    public final void init(bs10 bs10Var) {
        Object obj;
        long j = bs10Var.a;
        Iterator<T> it = this.rateLimiterMaxValues.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (e3n.c(((e3n) obj).a, j) >= 0) {
                    break;
                }
            }
        }
        e3n e3nVar = (e3n) obj;
        long j2 = e3nVar != null ? e3nVar.a : j;
        this.clock.getClass();
        bs10Var.b = SystemClock.elapsedRealtime() - (e3n.e(j2) - e3n.e(j));
        bs10Var.c = e3n.e(j2);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.bounds.set(getPaddingLeft(), getPaddingTop(), w - getPaddingRight(), h - getPaddingBottom());
        this.bg.setBounds(this.bounds);
        this.timer.setBounds(this.bounds);
        this.mic.setBounds(this.bounds);
        this.panelOpened.setBounds(this.bounds);
        this.progress.setBounds(this.bounds);
        this.submit.setBounds(this.bounds);
        this.close.setBounds(this.bounds);
    }

    public final <T extends ds10> void setClickListener(sls listener) {
        getClickListeners();
        jl40.P();
        throw null;
    }

    public final <T extends ds10> void setLongClickListener(sls listener) {
        getLongClickListeners();
        jl40.P();
        throw null;
    }

    public final void setState(ds10 ds10Var) {
        if (ds10Var.equals(this.state)) {
            return;
        }
        this.state = ds10Var;
        if (jl40.l(ds10Var, cs10.c)) {
            pj91.i(oyh0.f66voice_button_in_chat_window_content_des, this);
        } else {
            pj91.i(oyh0.f59send_button_in_chat_window_content_des, this);
        }
        ds10 ds10Var2 = this.state;
        bs10 bs10Var = ds10Var2 instanceof bs10 ? (bs10) ds10Var2 : null;
        if (bs10Var != null) {
            init(bs10Var);
        }
        postInvalidate();
    }

    public final <T extends ds10> void setTouchListener(tls listener) {
        getTouchListeners();
        jl40.P();
        throw null;
    }

    public Mesix(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ Mesix(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public Mesix(Context context) {
        this(context, null, 0, 6, null);
    }
}
