package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.emoji2.text.EmojiSpan;
import com.yandex.alicekit.core.views.EmptyDrawable;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.view.timeline.QuoteTextSelectionCallback;
import com.yandex.messaging.internal.view.timeline.l;
import com.yandex.messaging.views.ClickableSpanHandler;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes15.dex */
public final class mw10 {
    public static final /* synthetic */ kgx[] H = {new MutablePropertyReference1Impl("messageSubscription", 0, "getMessageSubscription()Lcom/yandex/alicekit/core/Disposable;", mw10.class), oyr.B(qoi0.a, mw10.class, "pendingUpdateCallback", "getPendingUpdateCallback()Lcom/yandex/messaging/internal/view/timeline/MessageTextHelper$UpdateCallback;", 0)};
    public boolean A;
    public final b9c B;
    public final long C;
    public final int D;
    public long E;
    public float F;
    public float G;
    public final AppCompatTextView a;
    public final b2c b;
    public final tmt0 c;
    public final llt0 d;
    public final v3k0 e;
    public final ult0 f;
    public final lqo g;
    public final boolean h;
    public final sls i;
    public final qp3 j;
    public final float k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public kw10 s;
    public Integer t;
    public String u;
    public Rect v;
    public boolean w;
    public boolean x;
    public boolean y;
    public final op3 z;

    public mw10(AppCompatTextView appCompatTextView, b2c b2cVar, tmt0 tmt0Var, l lVar, v3k0 v3k0Var, ult0 ult0Var, lqo lqoVar, tb5 tb5Var, int i) {
        int i2 = 1;
        boolean z = (i & 128) != 0;
        tb5Var = (i & 256) != 0 ? null : tb5Var;
        this.a = appCompatTextView;
        this.b = b2cVar;
        this.c = tmt0Var;
        this.d = lVar;
        this.e = v3k0Var;
        this.f = ult0Var;
        this.g = lqoVar;
        this.h = z;
        this.i = tb5Var;
        this.j = new qp3();
        this.k = appCompatTextView.getTextSize();
        this.l = appCompatTextView.getPaint().getFontMetricsInt(null);
        this.m = kjs0.b(6);
        this.n = kjs0.b(12);
        this.o = kjs0.b(9);
        this.p = kjs0.b(16);
        this.q = kjs0.b(12);
        this.r = kjs0.b(8);
        this.w = true;
        this.y = true;
        this.z = new op3();
        kjs0.b(4);
        this.B = new b9c();
        drb1.d(appCompatTextView.getContext(), jng0.messagingCodeBubble, jng0.messagingCodeBubbleAlpha);
        this.C = ViewConfiguration.getDoubleTapTimeout();
        this.D = ViewConfiguration.get(appCompatTextView.getContext()).getScaledDoubleTapSlop();
        appCompatTextView.setTextIsSelectable(false);
        ClickableSpanHandler clickableSpanHandler = new ClickableSpanHandler(appCompatTextView);
        clickableSpanHandler.setClickDelegate(b2cVar);
        appCompatTextView.setOnTouchListener(new bmk(i2, clickableSpanHandler, tb5Var, this));
    }

    public final void a() {
        kgx[] kgxVarArr = H;
        kgx kgxVar = kgxVarArr[1];
        this.z.b(null);
        kgx kgxVar2 = kgxVarArr[0];
        this.j.b(null);
        this.s = null;
        this.E = 0L;
        this.A = false;
        float f = this.k;
        AppCompatTextView appCompatTextView = this.a;
        appCompatTextView.setTextSize(0, f);
        hi91.h(0, appCompatTextView);
        this.v = null;
        this.y = true;
    }

    public final void b(Canvas canvas, ip31 ip31Var) {
        Layout layout;
        AppCompatTextView appCompatTextView = this.a;
        Editable editableText = appCompatTextView.getEditableText();
        if (editableText == null || (layout = appCompatTextView.getLayout()) == null) {
            return;
        }
        ip31Var.e();
        appCompatTextView.getHeight();
        ip31Var.f();
        appCompatTextView.getPaddingLeft();
        ip31Var.g();
        appCompatTextView.getPaddingRight();
        b9c.a(this.B, editableText, layout, 192);
    }

    public final void c(QuoteTextSelectionCallback quoteTextSelectionCallback, boolean z) {
        AppCompatTextView appCompatTextView = this.a;
        Object obj = null;
        appCompatTextView.setOnTouchListener(null);
        appCompatTextView.setTextIsSelectable(true);
        appCompatTextView.setCustomSelectionActionModeCallback(quoteTextSelectionCallback);
        appCompatTextView.requestFocus();
        if (z) {
            CharSequence text = appCompatTextView.getText();
            Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
            if (spannable == null || spannable.length() == 0) {
                return;
            }
            int G = evu0.G(spannable.toString(), '\n', 0, 6);
            if (G < 0) {
                Object[] spans = spannable.getSpans(0, spannable.length(), ImageSpan.class);
                int length = spans.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Object obj2 = spans[i];
                    if (spannable.getSpanEnd((ImageSpan) obj2) == spannable.length()) {
                        obj = obj2;
                        break;
                    }
                    i++;
                }
                ImageSpan imageSpan = (ImageSpan) obj;
                G = imageSpan != null ? spannable.getSpanStart(imageSpan) : spannable.length();
            }
            Selection.setSelection(spannable, 0, G);
        }
    }

    public final void d() {
        xyz xyzVar = new xyz(25, this);
        lw10 lw10Var = new lw10();
        lw10Var.a = xyzVar;
        this.a.postOnAnimation(lw10Var);
        kgx kgxVar = H[1];
        this.z.b(lw10Var);
    }

    public final void e(MessageData messageData, int i) {
        Integer num;
        kw10 kw10Var = messageData != null ? new kw10(messageData.text, messageData.textSpans) : null;
        if (jl40.l(this.s, kw10Var) && (num = this.t) != null && num.intValue() == i) {
            return;
        }
        this.s = kw10Var;
        this.t = Integer.valueOf(i);
        g();
        this.a.requestLayout();
    }

    public final void f(String str) {
        if (jl40.l(this.u, str)) {
            return;
        }
        this.u = str;
        if (this.s == null) {
            return;
        }
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c2, code lost:
    
        if (r6.getSpans(0, r6.length(), defpackage.xxk0.class).length != 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c4, code lost:
    
        r18 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c9, code lost:
    
        if (r18 != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01cb, code lost:
    
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01cc, code lost:
    
        r9 = r6.getSpans(0, r6.length(), defpackage.xxk0.class);
        r10 = r9.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d6, code lost:
    
        if (r12 >= r10) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01da, code lost:
    
        if (r9[r12] != null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01e7, code lost:
    
        if (r6.getSpanEnd(null) < (r6.length() - 1)) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ec, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01e9, code lost:
    
        r9 = r25.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01f5, code lost:
    
        r3 = new android.graphics.Rect(r13, r2, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01fe, code lost:
    
        if (r3.equals(r25.v) != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0200, code lost:
    
        r11.setPadding(r3.left, r3.top, r3.right, r3.bottom);
        r25.v = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0215, code lost:
    
        if (r6.equals(r11.getText()) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0217, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0218, code lost:
    
        r11.setMovementMethod(null);
        r11.setText(r6, android.widget.TextView.BufferType.EDITABLE);
        r2 = r25.y;
        r3 = r25.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0225, code lost:
    
        if (r2 == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0227, code lost:
    
        if (r4 != null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0229, code lost:
    
        r2 = r11.getEditableText();
        r4 = r25.s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x022f, code lost:
    
        if (r4 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0231, code lost:
    
        r4 = r4.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0235, code lost:
    
        r6 = r25.w;
        r25.f.getClass();
        r8 = r2.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0240, code lost:
    
        if (r4 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0242, code lost:
    
        r4 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x024c, code lost:
    
        if (r4.hasNext() == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x024e, code lost:
    
        r9 = (com.yandex.messaging.internal.entities.MessageSpan) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0258, code lost:
    
        if (r9.getEnd() > r8) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x025a, code lost:
    
        r10 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0260, code lost:
    
        defpackage.z83.h(null, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0267, code lost:
    
        if (r9.getEnd() > r8) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0269, code lost:
    
        r2.setSpan(r3.x(r9.getUri(), r6), r9.getStart(), r9.getEnd(), 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x025e, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0234, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x027d, code lost:
    
        android.text.util.Linkify.addLinks(r11, 7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0281, code lost:
    
        r22 = r11.getEditableText();
        r2 = r25.x;
        r4 = r25.c;
        r4.getClass();
        r19 = new defpackage.smt0(r4, null, r22, r3, r2);
        r1 = r1[0];
        r25.j.b(r19);
        r25.A = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02a6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ef, code lost:
    
        defpackage.ny61.u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01f2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f3, code lost:
    
        r9 = r25.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c7, code lost:
    
        r18 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        boolean z;
        boolean z2;
        int i;
        kgx[] kgxVarArr = H;
        boolean z3 = true;
        kgx kgxVar = kgxVarArr[1];
        this.z.b(null);
        kw10 kw10Var = this.s;
        String str = kw10Var != null ? kw10Var.a : null;
        Integer num = this.t;
        AppCompatTextView appCompatTextView = this.a;
        if (str == null || num == null) {
            appCompatTextView.setText("");
        } else {
            int i2 = -1;
            Integer num2 = -1;
            if (!this.h) {
                z = false;
            } else if (ftn.e() && ftn.a().c() == 1) {
                if (!evu0.J(str) && !Character.isLetterOrDigit(str.charAt(0))) {
                    ftn a = ftn.a();
                    int length = str.length();
                    CharSequence i3 = a.i(0, length <= 48 ? length : 48, str, 4, 0);
                    Spannable spannable = i3 instanceof Spannable ? (Spannable) i3 : null;
                    if (spannable != null) {
                        int length2 = spannable.length();
                        EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spannable.getSpans(0, spannable.length(), EmojiSpan.class);
                        int length3 = emojiSpanArr.length;
                        if (1 > length3 || length3 >= 4) {
                            i2 = 0;
                        } else if (spannable.getSpanEnd(j73.O(emojiSpanArr)) == length2) {
                            int length4 = emojiSpanArr.length;
                            int i4 = 0;
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                if (i4 >= length4) {
                                    i2 = -1;
                                    break;
                                }
                                EmojiSpan emojiSpan = emojiSpanArr[i4];
                                if (spannable.getSpanStart(emojiSpan) == i5) {
                                    i6++;
                                    i5 = spannable.getSpanEnd(emojiSpan);
                                    if (i5 == length2) {
                                        i2 = i6;
                                        break;
                                    }
                                }
                                i4++;
                            }
                        }
                        num2 = Integer.valueOf(i2);
                    } else {
                        num2 = null;
                    }
                }
                int intValue = num2 != null ? num2.intValue() : 0;
                z = 1 <= intValue && intValue < 4;
                float dimension = appCompatTextView.getResources().getDimension(intValue == 1 ? gvg0.timeline_message_single_emoji_size : (2 > intValue || intValue >= 4) ? gvg0.timeline_message_text_size : gvg0.timeline_message_few_emoji_size);
                if (dimension != appCompatTextView.getTextSize()) {
                    appCompatTextView.setTextSize(0, dimension);
                }
            } else {
                z = false;
            }
            String str2 = this.u;
            v3k0 v3k0Var = this.e;
            SpannableStringBuilder b = str2 == null ? v3k0Var.b(2, str) : this.g.a(tz10.x) ? v3k0Var.b(2, str2) : new SpannableStringBuilder(str2);
            if (!this.y) {
                for (Object obj : b.getSpans(0, b.length(), ClickableSpan.class)) {
                    b.removeSpan((ClickableSpan) obj);
                }
            }
            int intValue2 = num.intValue();
            hi91.h(0, appCompatTextView);
            if (intValue2 > 0) {
                if (z || !bob1.a(appCompatTextView, b)) {
                    hi91.h(this.l, appCompatTextView);
                } else {
                    b.append(HexString.CHAR_SPACE);
                    int dimensionPixelSize = appCompatTextView.getContext().getResources().getDimensionPixelSize(gvg0.timeline_message_text_size);
                    int length5 = b.length();
                    EmptyDrawable emptyDrawable = new EmptyDrawable(0, 0);
                    emptyDrawable.setBounds(0, 0, intValue2, dimensionPixelSize);
                    b.setSpan(new ImageSpan(emptyDrawable), length5 - 1, length5, 33);
                }
            }
            boolean z4 = b.getSpans(0, b.length(), xxk0.class).length == 0;
            int i7 = this.q;
            int i8 = this.r;
            int i9 = !z4 ? i8 : i7;
            Object[] spans = b.getSpans(0, b.length(), xxk0.class);
            int length6 = spans.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length6) {
                    z2 = z3;
                    i = this.m;
                    break;
                } else {
                    if (spans[i10] != null) {
                        ny61.u();
                        return;
                    }
                    z2 = z3;
                    if (b.getSpanStart(null) == 0) {
                        i = this.n;
                        break;
                    } else {
                        i10++;
                        z3 = z2;
                    }
                }
            }
        }
    }
}
