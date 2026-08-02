package androidx.media3.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.lk91;
import defpackage.m2v0;
import defpackage.mib1;
import defpackage.ndf;
import defpackage.o38;
import defpackage.odf;
import defpackage.x4e;
import defpackage.xvz;
import defpackage.y2v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
final class CanvasSubtitleOutput extends View implements y2v0 {
    private float bottomPaddingFraction;
    private List<odf> cues;
    private final List<m2v0> painters;
    private o38 style;
    private float textSize;
    private int textSizeType;

    public CanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.painters = new ArrayList();
        this.cues = Collections.EMPTY_LIST;
        this.textSizeType = 0;
        this.textSize = 0.0533f;
        this.style = o38.g;
        this.bottomPaddingFraction = 0.08f;
    }

    private static odf repositionVerticalCue(odf odfVar) {
        ndf a = odfVar.a();
        a.h = -3.4028235E38f;
        a.i = Integer.MIN_VALUE;
        a.c = null;
        int i = odfVar.f;
        float f = odfVar.e;
        if (i == 0) {
            a.e = 1.0f - f;
            a.f = 0;
        } else {
            a.e = (-f) - 1.0f;
            a.f = 1;
        }
        int i2 = odfVar.g;
        if (i2 == 0) {
            a.g = 2;
        } else if (i2 == 2) {
            a.g = 0;
        }
        return a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x041b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        float f2;
        int i3;
        float f3;
        int i4;
        float f4;
        TextPaint textPaint;
        int i5;
        int c;
        int i6;
        int i7;
        CanvasSubtitleOutput canvasSubtitleOutput = this;
        List<odf> list = canvasSubtitleOutput.cues;
        if (list.isEmpty()) {
            return;
        }
        int height = canvasSubtitleOutput.getHeight();
        int paddingLeft = canvasSubtitleOutput.getPaddingLeft();
        int paddingTop = canvasSubtitleOutput.getPaddingTop();
        int width = canvasSubtitleOutput.getWidth() - canvasSubtitleOutput.getPaddingRight();
        int paddingBottom = height - canvasSubtitleOutput.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i8 = paddingBottom - paddingTop;
        float d = mib1.d(canvasSubtitleOutput.textSizeType, canvasSubtitleOutput.textSize, height, i8);
        float f5 = 0.0f;
        if (d <= 0.0f) {
            return;
        }
        int size = list.size();
        int i9 = 0;
        while (i9 < size) {
            odf odfVar = list.get(i9);
            float f6 = f5;
            if (odfVar.p != Integer.MIN_VALUE) {
                odfVar = repositionVerticalCue(odfVar);
            }
            float d2 = mib1.d(odfVar.n, odfVar.o, height, i8);
            m2v0 m2v0Var = canvasSubtitleOutput.painters.get(i9);
            o38 o38Var = canvasSubtitleOutput.style;
            List<odf> list2 = list;
            float f7 = canvasSubtitleOutput.bottomPaddingFraction;
            TextPaint textPaint2 = m2v0Var.f;
            int i10 = height;
            Bitmap bitmap = odfVar.d;
            int i11 = i8;
            float f8 = odfVar.k;
            int i12 = size;
            float f9 = odfVar.j;
            int i13 = i9;
            int i14 = odfVar.i;
            float f10 = odfVar.h;
            int i15 = odfVar.g;
            float f11 = d;
            int i16 = odfVar.f;
            float f12 = odfVar.e;
            Layout.Alignment alignment = odfVar.b;
            CharSequence charSequence = odfVar.a;
            boolean z = bitmap == null;
            if (z) {
                if (!TextUtils.isEmpty(charSequence)) {
                    f = f10;
                    i = odfVar.l ? odfVar.m : o38Var.c;
                }
                i3 = paddingLeft;
                f2 = f11;
                i9 = i13 + 1;
                canvasSubtitleOutput = this;
                f5 = f6;
                list = list2;
                height = i10;
                i8 = i11;
                size = i12;
                d = f2;
                paddingLeft = i3;
            } else {
                f = f10;
                i = ModalContentViewContainer.BASE_SHADOW_COLOR;
            }
            CharSequence charSequence2 = m2v0Var.i;
            if ((charSequence2 == charSequence || (charSequence2 != null && charSequence2.equals(charSequence))) && Objects.equals(m2v0Var.j, alignment) && m2v0Var.k == bitmap && m2v0Var.l == f12 && m2v0Var.m == i16) {
                i2 = i15;
                if (Integer.valueOf(m2v0Var.n).equals(Integer.valueOf(i2)) && m2v0Var.o == f && Integer.valueOf(m2v0Var.p).equals(Integer.valueOf(i14)) && m2v0Var.q == f9 && m2v0Var.r == f8 && m2v0Var.s == o38Var.a && m2v0Var.t == o38Var.b && m2v0Var.u == i && m2v0Var.w == o38Var.d && m2v0Var.v == o38Var.e && Objects.equals(textPaint2.getTypeface(), o38Var.f) && m2v0Var.x == f11 && m2v0Var.y == d2 && m2v0Var.z == f7 && m2v0Var.A == paddingLeft && m2v0Var.B == paddingTop && m2v0Var.C == width && m2v0Var.D == paddingBottom) {
                    m2v0Var.a(canvas, z);
                    i3 = paddingLeft;
                    f2 = f11;
                    i9 = i13 + 1;
                    canvasSubtitleOutput = this;
                    f5 = f6;
                    list = list2;
                    height = i10;
                    i8 = i11;
                    size = i12;
                    d = f2;
                    paddingLeft = i3;
                }
            } else {
                i2 = i15;
            }
            m2v0Var.i = charSequence;
            m2v0Var.j = alignment;
            m2v0Var.k = bitmap;
            m2v0Var.l = f12;
            m2v0Var.m = i16;
            m2v0Var.n = i2;
            m2v0Var.o = f;
            m2v0Var.p = i14;
            m2v0Var.q = f9;
            m2v0Var.r = f8;
            m2v0Var.s = o38Var.a;
            m2v0Var.t = o38Var.b;
            m2v0Var.u = i;
            m2v0Var.w = o38Var.d;
            m2v0Var.v = o38Var.e;
            textPaint2.setTypeface(o38Var.f);
            m2v0Var.x = f11;
            m2v0Var.y = d2;
            m2v0Var.z = f7;
            m2v0Var.A = paddingLeft;
            m2v0Var.B = paddingTop;
            m2v0Var.C = width;
            m2v0Var.D = paddingBottom;
            if (z) {
                m2v0Var.i.getClass();
                CharSequence charSequence3 = m2v0Var.i;
                SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(m2v0Var.i);
                int i17 = m2v0Var.C - m2v0Var.A;
                int i18 = m2v0Var.D - m2v0Var.B;
                textPaint2.setTextSize(m2v0Var.x);
                int i19 = (int) ((m2v0Var.x * 0.125f) + 0.5f);
                int i20 = i19 * 2;
                int i21 = i17 - i20;
                float f13 = m2v0Var.q;
                if (f13 != -3.4028235E38f) {
                    i21 = (int) (i21 * f13);
                }
                int i22 = i21;
                if (i22 <= 0) {
                    lk91.j("Skipped drawing subtitle cue (insufficient space)");
                    f2 = f11;
                    i3 = paddingLeft;
                } else {
                    if (m2v0Var.y > f6) {
                        f2 = f11;
                        textPaint = textPaint2;
                        i5 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) m2v0Var.y), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        f2 = f11;
                        textPaint = textPaint2;
                        i5 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (m2v0Var.w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i5, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i23 = 0;
                        for (int length = foregroundColorSpanArr.length; i23 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i23]);
                            i23++;
                        }
                    }
                    if (Color.alpha(m2v0Var.t) > 0) {
                        int i24 = m2v0Var.w;
                        if (i24 == 0 || i24 == 2) {
                            i3 = paddingLeft;
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(m2v0Var.t), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            i3 = paddingLeft;
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(m2v0Var.t), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    } else {
                        i3 = paddingLeft;
                    }
                    Layout.Alignment alignment2 = m2v0Var.j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    Layout.Alignment alignment3 = alignment2;
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder3, textPaint, i22, alignment3, m2v0Var.d, m2v0Var.e, true);
                    m2v0Var.E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = m2v0Var.E.getLineCount();
                    int i25 = 0;
                    int i26 = 0;
                    while (i25 < lineCount) {
                        i26 = Math.max((int) Math.ceil(m2v0Var.E.getLineWidth(i25)), i26);
                        i25++;
                        height2 = height2;
                        lineCount = lineCount;
                        spannableStringBuilder2 = spannableStringBuilder2;
                    }
                    int i27 = height2;
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    int i28 = ((m2v0Var.q == -3.4028235E38f || i26 >= i22) ? i26 : i22) + i20;
                    float f14 = m2v0Var.o;
                    int i29 = m2v0Var.A;
                    if (f14 != -3.4028235E38f) {
                        int round = Math.round(i17 * f14) + i29;
                        int i30 = m2v0Var.p;
                        if (i30 == 1) {
                            round = ((round * 2) - i28) / 2;
                        } else if (i30 == 2) {
                            round -= i28;
                        }
                        c = Math.max(round, i29);
                        i6 = Math.min(i28 + c, m2v0Var.C);
                    } else {
                        c = x4e.c(i17, i28, 2, i29);
                        i6 = i28 + c;
                    }
                    int i31 = i6 - c;
                    if (i31 <= 0) {
                        lk91.j("Skipped drawing subtitle cue (invalid horizontal positioning)");
                    } else {
                        float f15 = m2v0Var.l;
                        if (f15 != -3.4028235E38f) {
                            if (m2v0Var.m == 0) {
                                i7 = Math.round(i18 * f15) + m2v0Var.B;
                                int i32 = m2v0Var.n;
                                if (i32 == 2) {
                                    i7 -= i27;
                                } else if (i32 == 1) {
                                    i7 = ((i7 * 2) - i27) / 2;
                                }
                            } else {
                                int lineBottom = m2v0Var.E.getLineBottom(0) - m2v0Var.E.getLineTop(0);
                                float f16 = m2v0Var.l;
                                i7 = f16 >= f6 ? Math.round(f16 * lineBottom) + m2v0Var.B : (Math.round((f16 + 1.0f) * lineBottom) + m2v0Var.D) - i27;
                            }
                            int i33 = i7 + i27;
                            int i34 = m2v0Var.D;
                            if (i33 > i34) {
                                i7 = i34 - i27;
                            } else {
                                int i35 = m2v0Var.B;
                                if (i7 < i35) {
                                    i7 = i35;
                                }
                            }
                        } else {
                            i7 = (m2v0Var.D - i27) - ((int) (i18 * m2v0Var.z));
                        }
                        m2v0Var.E = new StaticLayout(spannableStringBuilder3, textPaint, i31, alignment3, m2v0Var.d, m2v0Var.e, true);
                        m2v0Var.F = new StaticLayout(spannableStringBuilder4, textPaint, i31, alignment3, m2v0Var.d, m2v0Var.e, true);
                        m2v0Var.G = c;
                        m2v0Var.H = i7;
                        m2v0Var.I = i19;
                    }
                }
            } else {
                f2 = f11;
                i3 = paddingLeft;
                m2v0Var.k.getClass();
                Bitmap bitmap2 = m2v0Var.k;
                int i36 = m2v0Var.C;
                int i37 = m2v0Var.A;
                int i38 = m2v0Var.D;
                int i39 = m2v0Var.B;
                float f17 = i36 - i37;
                float f18 = (m2v0Var.o * f17) + i37;
                float f19 = i38 - i39;
                float f20 = (m2v0Var.l * f19) + i39;
                int round2 = Math.round(f17 * m2v0Var.q);
                float f21 = m2v0Var.r;
                int round3 = f21 != -3.4028235E38f ? Math.round(f19 * f21) : xvz.a(bitmap2.getHeight(), bitmap2.getWidth(), round2);
                int i40 = m2v0Var.p;
                if (i40 == 2) {
                    f3 = round2;
                } else {
                    if (i40 == 1) {
                        f3 = round2 / 2;
                    }
                    int round4 = Math.round(f18);
                    i4 = m2v0Var.n;
                    if (i4 != 2) {
                        f4 = round3;
                    } else {
                        if (i4 == 1) {
                            f4 = round3 / 2;
                        }
                        int round5 = Math.round(f20);
                        m2v0Var.J = new Rect(round4, round5, round2 + round4, round3 + round5);
                    }
                    f20 -= f4;
                    int round52 = Math.round(f20);
                    m2v0Var.J = new Rect(round4, round52, round2 + round4, round3 + round52);
                }
                f18 -= f3;
                int round42 = Math.round(f18);
                i4 = m2v0Var.n;
                if (i4 != 2) {
                }
                f20 -= f4;
                int round522 = Math.round(f20);
                m2v0Var.J = new Rect(round42, round522, round2 + round42, round3 + round522);
            }
            m2v0Var.a(canvas, z);
            i9 = i13 + 1;
            canvasSubtitleOutput = this;
            f5 = f6;
            list = list2;
            height = i10;
            i8 = i11;
            size = i12;
            d = f2;
            paddingLeft = i3;
        }
    }

    @Override // defpackage.y2v0
    public void update(List<odf> list, o38 o38Var, float f, int i, float f2) {
        this.cues = list;
        this.style = o38Var;
        this.textSize = f;
        this.textSizeType = i;
        this.bottomPaddingFraction = f2;
        while (this.painters.size() < list.size()) {
            this.painters.add(new m2v0(getContext()));
        }
        invalidate();
    }

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }
}
