package com.yandex.messaging.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import defpackage.d6w;
import defpackage.fxa1;
import defpackage.jng0;
import defpackage.job1;
import defpackage.k3i0;
import defpackage.kjs0;
import defpackage.r941;
import defpackage.tls;
import defpackage.y6i0;
import defpackage.z83;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002OPB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010\u001aJ\u0017\u0010#\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010\u001aJ1\u0010)\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u00162\u0006\u0010%\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*J1\u0010-\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u00162\u0006\u0010%\u001a\u00020\u00162\u0006\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020&H\u0016¢\u0006\u0004\b-\u0010*J\u0017\u0010.\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b.\u0010!J!\u00101\u001a\u00020\r2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0/¢\u0006\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R2\u00109\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r0/j\u0002`88\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u00102R*\u0010?\u001a\u00020&2\u0006\u0010>\u001a\u00020&8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR*\u0010F\u001a\u00020E2\u0006\u0010>\u001a\u00020E8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006Q"}, d2 = {"Lcom/yandex/messaging/views/WaveformView;", "Landroid/view/View;", "Landroid/view/GestureDetector$OnGestureListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/yandex/messaging/views/WaveformView$a;", "update", "Lzy11;", "applyBatchUpdate", "(Lcom/yandex/messaging/views/WaveformView$a;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "e", "onShowPress", "(Landroid/view/MotionEvent;)V", "onSingleTapUp", "onDown", "e1", "e2", "", "velocityX", "velocityY", "onFling", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "distanceX", "distanceY", "onScroll", "onLongPress", "Lkotlin/Function1;", "block", "batchUpdate", "(Ltls;)V", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "shouldInvalidate", "Z", "Lcom/yandex/messaging/views/OnProgressChanged;", "onProgressChanged", "Ltls;", "getOnProgressChanged", "()Ltls;", "setOnProgressChanged", "value", "progress", "F", "getProgress", "()F", "setProgress", "(F)V", "", "waveform", "[B", "getWaveform", "()[B", "setWaveform", "([B)V", "Lcom/yandex/messaging/views/WaveformView$b;", "renderer", "Lcom/yandex/messaging/views/WaveformView$b;", "b", "a", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WaveformView extends View implements GestureDetector.OnGestureListener {
    public static final int $stable = 8;
    private final GestureDetector gestureDetector;
    private tls onProgressChanged;
    private float progress;
    private final b renderer;
    private boolean shouldInvalidate;
    private byte[] waveform;

    public static final class a {
        public Float a;
        public byte[] b;
    }

    public static final class b {
        public final float a = kjs0.d(2);
        public final float b;
        public final int c;
        public final Paint d;
        public final Paint e;
        public byte[] f;
        public int g;
        public int h;

        public b() {
            float d = kjs0.d(2);
            this.b = d;
            this.c = kjs0.b(1);
            Paint paint = new Paint();
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            paint.setStrokeWidth(d);
            this.d = paint;
            Paint paint2 = new Paint();
            paint2.setStyle(style);
            paint2.setStrokeWidth(d);
            this.e = paint2;
            this.f = new byte[0];
        }

        public final void a(byte[] bArr) {
            int i;
            byte[] bArr2;
            int i2;
            int i3;
            int i4;
            byte[] bArr3 = bArr;
            byte b = 0;
            if (this.g == 0 || bArr3.length == 0) {
                bArr3 = new byte[0];
            } else {
                int i5 = (int) ((r2 + r4) / (this.b + this.c));
                int i6 = 1;
                z83.h(null, !(bArr3.length == 0));
                if (i5 != bArr3.length) {
                    byte[] bArr4 = new byte[i5];
                    for (int i7 = 0; i7 < i5; i7++) {
                        bArr4[i7] = 0;
                    }
                    int length = bArr3.length;
                    if (length % 2 != 0) {
                        length *= 2;
                    }
                    int i8 = i5 % 2 == 0 ? i5 : i5 * 2;
                    int i9 = length * i8;
                    while (length != 0 && i8 != 0) {
                        if (length > i8) {
                            length %= i8;
                        } else {
                            i8 %= length;
                        }
                    }
                    int i10 = i9 / (length + i8);
                    int i11 = i10 / i5;
                    int length2 = i10 / bArr3.length;
                    int i12 = 0;
                    while (i12 < i5) {
                        int i13 = i12 + 1;
                        d6w n = y6i0.n(i12 * i11, i13 * i11);
                        int i14 = n.a;
                        int H = kotlin.collections.a.H(n);
                        byte[] bArr5 = new byte[H];
                        for (int i15 = b; i15 < H; i15++) {
                            bArr5[i15] = b;
                        }
                        int i16 = n.b;
                        if (i14 <= i16) {
                            int i17 = i14;
                            while (true) {
                                int i18 = i17 - (length2 / 2);
                                if (i18 % length2 == 0) {
                                    int i19 = i18 / length2;
                                    i = i5;
                                    bArr2 = bArr4;
                                    bArr5[i17 - i14] = (byte) (new d6w(0, bArr3.length - i6, i6).g(i19) ? bArr3[i19] & 255 : 0);
                                    i2 = i11;
                                    i3 = i12;
                                    i4 = i6;
                                } else {
                                    i = i5;
                                    bArr2 = bArr4;
                                    int i20 = (i18 + length2) / length2;
                                    int i21 = i20 - 1;
                                    int abs = Math.abs((i20 * length2) - i18);
                                    int abs2 = Math.abs((i21 * length2) - i18);
                                    i3 = i12;
                                    i4 = i6;
                                    i2 = i11;
                                    bArr5[i17 - i14] = (byte) ((((new d6w(0, bArr3.length - i4, i4).g(i20) ? bArr3[i20] & 255 : 0) * abs2) + ((new d6w(0, bArr3.length + (-1), i4).g(i21) ? bArr3[i21] & 255 : 0) * abs)) / (abs2 + abs));
                                }
                                if (i17 == i16) {
                                    break;
                                }
                                i17++;
                                i6 = i4;
                                i12 = i3;
                                i5 = i;
                                bArr4 = bArr2;
                                i11 = i2;
                            }
                        } else {
                            i = i5;
                            bArr2 = bArr4;
                            i2 = i11;
                            i3 = i12;
                            i4 = i6;
                        }
                        long j = 0;
                        long j2 = 0;
                        for (int i22 = 0; i22 < H; i22++) {
                            j += bArr5[i22] & 255;
                            j2++;
                        }
                        bArr2[i3] = (byte) (j / j2);
                        i6 = i4;
                        i12 = i13;
                        i5 = i;
                        bArr4 = bArr2;
                        i11 = i2;
                        b = 0;
                    }
                    bArr3 = bArr4;
                }
            }
            this.f = bArr3;
        }
    }

    public WaveformView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gestureDetector = new GestureDetector(context, this);
        this.shouldInvalidate = true;
        this.onProgressChanged = new r941(0);
        byte[] bArr = new byte[64];
        for (int i2 = 0; i2 < 64; i2++) {
            bArr[i2] = 0;
        }
        this.waveform = bArr;
        b bVar = new b();
        this.renderer = bVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k3i0.WaveformView, 0, 0);
        try {
            bVar.e.setColor(job1.g(obtainStyledAttributes.getColor(k3i0.WaveformView_wv_fillcolor, fxa1.c(jng0.messagingOwnVoiceMessageFillColor, context).data), 0.5f));
            bVar.d.setColor(obtainStyledAttributes.getColor(k3i0.WaveformView_wv_progress_color, fxa1.c(jng0.messagingOwnVoiceMessageProgressColor, context).data));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void applyBatchUpdate(a update) {
        this.shouldInvalidate = false;
        Float f = update.a;
        setProgress(f != null ? f.floatValue() : this.progress);
        byte[] bArr = update.b;
        if (bArr == null) {
            bArr = this.waveform;
        }
        setWaveform(bArr);
        this.shouldInvalidate = true;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onProgressChanged$lambda$0(float f) {
        return zy11.a;
    }

    public final void batchUpdate(tls block) {
        a aVar = new a();
        block.invoke(aVar);
        applyBatchUpdate(aVar);
    }

    public final tls getOnProgressChanged() {
        return this.onProgressChanged;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final byte[] getWaveform() {
        return this.waveform;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e) {
        setProgress(e.getX() / getWidth());
        this.onProgressChanged.invoke(Float.valueOf(this.progress));
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        b bVar = this.renderer;
        float f = this.progress;
        bVar.getClass();
        int i = 0;
        canvas.drawColor(0);
        byte[] bArr = bVar.f;
        if (bArr.length == 0) {
            return;
        }
        int length = (int) (bArr.length * f);
        int length2 = bArr.length;
        while (i < length2) {
            float f2 = bVar.f[i] & 255;
            float f3 = bVar.a;
            float f4 = bVar.h;
            float f5 = ((f2 / 255.0f) * (f4 - f3)) + f3;
            float f6 = (bVar.b + bVar.c) * (i + 0.5f);
            float f7 = (f4 - f5) / 2.0f;
            Paint paint = i < length ? bVar.d : bVar.e;
            if (f5 == 0.0f) {
                canvas.drawPoint(f6, f7, paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(f6, f7, f6, f7 + f5, paint);
            }
            i++;
            canvas = canvas2;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent e) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        float width = (-distanceX) / getWidth();
        float f = this.progress;
        float f2 = 1.0f;
        if (f + width <= 1.0f) {
            f2 = 0.0f;
            if (f + width >= 0.0f) {
                f2 = f + width;
            }
        }
        setProgress(f2);
        this.onProgressChanged.invoke(Float.valueOf(this.progress));
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent e) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        b bVar = this.renderer;
        bVar.g = w;
        bVar.h = h;
        bVar.a(this.waveform);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return this.gestureDetector.onTouchEvent(event) || super.onTouchEvent(event);
    }

    public final void setOnProgressChanged(tls tlsVar) {
        this.onProgressChanged = tlsVar;
    }

    public final void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        if (this.shouldInvalidate) {
            invalidate();
        }
    }

    public final void setWaveform(byte[] bArr) {
        if (Arrays.equals(this.waveform, bArr)) {
            return;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        this.waveform = copyOf;
        this.renderer.a(copyOf);
        if (this.shouldInvalidate) {
            invalidate();
        }
    }

    public WaveformView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ WaveformView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public WaveformView(Context context) {
        this(context, null, 0, 6, null);
    }
}
