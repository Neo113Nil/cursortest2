package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import com.yandex.go.places.map.ui.configs.PlacesPinLabelBitmapCreator$LabelTypeface;
import com.yandex.go.places.map.ui.configs.PlacesPinLabelBitmapCreator$TextAlignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.utils.CustomImageSpan;

/* loaded from: classes13.dex */
public final class ddc0 {
    public final Context a;
    public final i3y b;
    public final i3y c;
    public final i3y d;
    public final int e;
    public final TextPaint f;

    public ddc0(Context context) {
        this.a = context;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i = 0;
        this.b = a.b(lazyThreadSafetyMode, new sls(this) { // from class: ucc0
            public final /* synthetic */ ddc0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                ddc0 ddc0Var = this.b;
                switch (i2) {
                    case 0:
                        return ddc0Var.a.getResources().getFont(h5h0.ys_display_cond_medium);
                    case 1:
                        return ddc0Var.a.getResources().getFont(i5h0.ys_display_cond_regular);
                    default:
                        return ddc0Var.a.getResources().getFont(d5h0.ys_display_cond_bold);
                }
            }
        });
        final int i2 = 1;
        this.c = a.b(lazyThreadSafetyMode, new sls(this) { // from class: ucc0
            public final /* synthetic */ ddc0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                ddc0 ddc0Var = this.b;
                switch (i22) {
                    case 0:
                        return ddc0Var.a.getResources().getFont(h5h0.ys_display_cond_medium);
                    case 1:
                        return ddc0Var.a.getResources().getFont(i5h0.ys_display_cond_regular);
                    default:
                        return ddc0Var.a.getResources().getFont(d5h0.ys_display_cond_bold);
                }
            }
        });
        final int i3 = 2;
        this.d = a.b(lazyThreadSafetyMode, new sls(this) { // from class: ucc0
            public final /* synthetic */ ddc0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                ddc0 ddc0Var = this.b;
                switch (i22) {
                    case 0:
                        return ddc0Var.a.getResources().getFont(h5h0.ys_display_cond_medium);
                    case 1:
                        return ddc0Var.a.getResources().getFont(i5h0.ys_display_cond_regular);
                    default:
                        return ddc0Var.a.getResources().getFont(d5h0.ys_display_cond_bold);
                }
            }
        });
        this.e = tje.r(eug0.discovery_organizations_map_pin_label_stroke_width, context);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        textPaint.setTextAlign(Paint.Align.LEFT);
        this.f = textPaint;
    }

    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i, int i2, boolean z) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
        if (i2 < 1) {
            i2 = 1;
        }
        StaticLayout.Builder maxLines = obtain.setMaxLines(i2);
        if (z) {
            maxLines.setEllipsize(TextUtils.TruncateAt.END);
        }
        return maxLines.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.util.ArrayList, java.util.List] */
    public static wcc0 d(ddc0 ddc0Var, CharSequence charSequence, CharSequence charSequence2, PlacesPinLabelBitmapCreator$TextAlignment placesPinLabelBitmapCreator$TextAlignment, bdc0 bdc0Var, xcc0 xcc0Var, int i, int i2, int i3, PlacesPinLabelBitmapCreator$LabelTypeface placesPinLabelBitmapCreator$LabelTypeface, PlacesPinLabelBitmapCreator$LabelTypeface placesPinLabelBitmapCreator$LabelTypeface2, int i4, Integer num, int i5, int i6) {
        Integer num2;
        boolean z;
        Paint.Align align;
        int i7;
        int i8;
        boolean z2;
        int i9;
        EmptyList emptyList;
        Integer valueOf;
        Integer num3;
        String obj;
        List W;
        String str;
        int i10;
        String str2;
        List W2;
        int i11;
        Iterator it;
        int i12 = (i6 & 32) != 0 ? eug0.discovery_organizations_map_pin_max_width : i;
        int i13 = (i6 & 64) != 0 ? eug0.discovery_organizations_map_pin_title_size : i2;
        int i14 = (i6 & 128) != 0 ? eug0.discovery_organizations_map_pin_subtitle_size : i3;
        PlacesPinLabelBitmapCreator$LabelTypeface placesPinLabelBitmapCreator$LabelTypeface3 = (i6 & 256) != 0 ? PlacesPinLabelBitmapCreator$LabelTypeface.DisplayCondMedium : placesPinLabelBitmapCreator$LabelTypeface;
        PlacesPinLabelBitmapCreator$LabelTypeface placesPinLabelBitmapCreator$LabelTypeface4 = (i6 & 512) != 0 ? PlacesPinLabelBitmapCreator$LabelTypeface.DisplayCondRegular : placesPinLabelBitmapCreator$LabelTypeface2;
        int i15 = (i6 & 1024) != 0 ? xng0.textMain : i4;
        Integer num4 = (i6 & 2048) != 0 ? null : num;
        int i16 = (i6 & 4096) != 0 ? 1 : i5;
        if ((i6 & 8192) != 0) {
            num2 = num4;
            z = true;
        } else {
            num2 = num4;
            z = false;
        }
        int r = tje.r(i12, ddc0Var.a);
        int intValue = num2 != null ? num2.intValue() : ddc0Var.e;
        int i17 = xcc0Var.a;
        int i18 = xcc0Var.c;
        int i19 = ((r - intValue) - i17) - i18;
        TextPaint c = ddc0Var.c(charSequence, i13, ddc0Var.e(placesPinLabelBitmapCreator$LabelTypeface3));
        int i20 = cdc0.b[placesPinLabelBitmapCreator$TextAlignment.ordinal()];
        if (i20 == 1) {
            align = Paint.Align.LEFT;
        } else if (i20 == 2) {
            align = Paint.Align.RIGHT;
        } else {
            if (i20 != 3) {
                w511.b();
                return null;
            }
            align = Paint.Align.CENTER;
        }
        c.setTextAlign(align);
        TextPaint c2 = ddc0Var.c(charSequence2, i14, ddc0Var.e(placesPinLabelBitmapCreator$LabelTypeface4));
        if (charSequence == null || (obj = charSequence.toString()) == null) {
            i7 = intValue;
            i8 = i15;
            z2 = z;
            i9 = i18;
            emptyList = EmptyList.a;
        } else if (bdc0Var instanceof zcc0) {
            zcc0 zcc0Var = (zcc0) bdc0Var;
            ?? arrayList = new ArrayList();
            i7 = intValue;
            StringBuilder sb = new StringBuilder();
            i8 = i15;
            z2 = z;
            W2 = evu0.W(obj, new String[]{" "}, (r2 & 4) != 0 ? 0 : 2);
            Iterator it2 = W2.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                if (sb.length() != 0) {
                    it = it2;
                    if (str3.length() + sb.length() + 1 > 25) {
                        arrayList.add(sb.toString());
                        sb.setLength(0);
                        if (arrayList.size() == zcc0Var.a) {
                            break;
                        }
                        sb.append(str3);
                    } else {
                        sb.append(" ");
                        sb.append(str3);
                    }
                } else {
                    sb.append(str3);
                    it = it2;
                }
                it2 = it;
            }
            if (sb.length() > 0) {
                arrayList.add(sb.toString());
                i11 = 0;
                sb.setLength(0);
            } else {
                i11 = 0;
            }
            if (zcc0Var.b && !arrayList.isEmpty()) {
                arrayList.set(i11, "«" + arrayList.get(i11));
                arrayList.set(scc.f(arrayList), arrayList.get(scc.f(arrayList)) + "»");
            }
            i9 = i18;
            emptyList = arrayList;
        } else {
            i7 = intValue;
            i8 = i15;
            z2 = z;
            if (bdc0Var instanceof adc0) {
                float f = i19;
                adc0 adc0Var = (adc0) bdc0Var;
                boolean z3 = adc0Var.b;
                int i21 = adc0Var.a;
                float measureText = z3 ? c.measureText("«") : 0.0f;
                float measureText2 = z3 ? c.measureText("»") : 0.0f;
                ?? arrayList2 = new ArrayList();
                StringBuilder sb2 = new StringBuilder();
                float f2 = measureText2;
                float f3 = measureText;
                W = evu0.W(obj, new String[]{" "}, (r2 & 4) != 0 ? 0 : 2);
                int i22 = 0;
                while (i22 < W.size() && arrayList2.size() < i21) {
                    String str4 = (String) W.get(i22);
                    if (sb2.length() == 0) {
                        i10 = i18;
                        str2 = str4;
                    } else {
                        i10 = i18;
                        str2 = ((Object) sb2) + " " + str4;
                    }
                    float measureText3 = c.measureText(str2);
                    int size = arrayList2.size();
                    float f4 = (z3 && size == 0) ? f - f3 : f;
                    if (z3 && size == i21 - 1) {
                        f4 -= f2;
                    }
                    if (measureText3 <= f4) {
                        sb2.setLength(0);
                        sb2.append(str2);
                        i22++;
                    } else {
                        if (sb2.length() == 0) {
                            sb2.append(str4);
                            i22++;
                        }
                        arrayList2.add(sb2.toString());
                        sb2.setLength(0);
                    }
                    i18 = i10;
                }
                i9 = i18;
                if (sb2.length() > 0 && arrayList2.size() < i21) {
                    arrayList2.add(sb2.toString());
                    sb2.setLength(0);
                }
                boolean z4 = i22 < W.size();
                if (!arrayList2.isEmpty()) {
                    int f5 = scc.f(arrayList2);
                    float f6 = (z3 && f5 == 0) ? f - f3 : f;
                    if (z3) {
                        f6 -= f2;
                    }
                    if (z4) {
                        String X = kotlin.collections.a.X(W.subList(i22, W.size()), " ", null, null, null, 62);
                        str = arrayList2.get(f5) + " " + X;
                    } else {
                        str = (String) arrayList2.get(f5);
                    }
                    if (c.measureText(str) > f6) {
                        arrayList2.set(f5, TextUtils.ellipsize(str, c, f6, TextUtils.TruncateAt.END).toString());
                    }
                }
                if (z3 && !arrayList2.isEmpty()) {
                    arrayList2.set(0, "«" + arrayList2.get(0));
                    arrayList2.set(scc.f(arrayList2), arrayList2.get(scc.f(arrayList2)) + "»");
                }
                emptyList = arrayList2;
            } else {
                i9 = i18;
                if (!(bdc0Var instanceof ycc0)) {
                    w511.b();
                    return null;
                }
                float f7 = i19;
                String str5 = c.measureText(obj) <= f7 ? obj : null;
                if (str5 == null) {
                    str5 = TextUtils.ellipsize(obj, c, f7, TextUtils.TruncateAt.END).toString();
                }
                emptyList = Collections.singletonList(str5);
            }
        }
        EmptyList emptyList2 = emptyList;
        Iterator it3 = emptyList2.iterator();
        if (it3.hasNext()) {
            valueOf = Integer.valueOf((int) Math.ceil(c.measureText((String) it3.next())));
            while (it3.hasNext()) {
                Integer valueOf2 = Integer.valueOf((int) Math.ceil(c.measureText((String) it3.next())));
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
        } else {
            valueOf = null;
        }
        int intValue2 = valueOf != null ? valueOf.intValue() : 0;
        Paint.FontMetrics fontMetrics = c.getFontMetrics();
        int ceil = (int) Math.ceil(fontMetrics.descent - fontMetrics.ascent);
        ListBuilder a = rcc.a();
        if (charSequence2 != null && charSequence2.length() != 0) {
            StaticLayout a2 = a(charSequence2, c2, i19, i16, true);
            int lineCount = a2.getLineCount();
            int i23 = 0;
            while (i23 < lineCount) {
                SpannableString spannableString = new SpannableString(charSequence2.subSequence(a2.getLineStart(i23), a2.getLineEnd(i23)));
                int min = Math.min(i19, f(spannableString, c2));
                boolean z5 = i23 == a2.getLineCount() - 1;
                StaticLayout a3 = a(spannableString, c2, min, 1, z5);
                CharSequence text = a3.getText();
                Integer valueOf3 = Integer.valueOf(min);
                if (z5) {
                    valueOf3 = null;
                }
                a.add(new vcc0(spannableString, valueOf3 != null ? valueOf3.intValue() : f(text, c2), a3.getHeight()));
                i23++;
            }
        }
        ListBuilder j = a.j();
        qqy qqyVar = (qqy) j.listIterator(0);
        if (qqyVar.hasNext()) {
            Integer valueOf4 = Integer.valueOf(((vcc0) qqyVar.next()).b);
            loop3: while (true) {
                num3 = valueOf4;
                while (qqyVar.hasNext()) {
                    valueOf4 = Integer.valueOf(((vcc0) qqyVar.next()).b);
                    if (num3.compareTo(valueOf4) < 0) {
                        break;
                    }
                }
            }
        } else {
            num3 = null;
        }
        int intValue3 = num3 != null ? num3.intValue() : 0;
        ListIterator listIterator = j.listIterator(0);
        int i24 = 0;
        while (true) {
            qqy qqyVar2 = (qqy) listIterator;
            if (!qqyVar2.hasNext()) {
                return new wcc0(Math.max(intValue2, intValue3) + i7 + xcc0Var.a + i9, (emptyList2.size() * ceil) + i24 + i7 + xcc0Var.b + xcc0Var.d, xcc0Var, placesPinLabelBitmapCreator$TextAlignment, emptyList2, c, ceil, j, c2, i8, i7, z2);
            }
            i24 += ((vcc0) qqyVar2.next()).c;
        }
    }

    public static int f(CharSequence charSequence, TextPaint textPaint) {
        int ceil = (int) Math.ceil(textPaint.measureText(charSequence.toString()));
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        int i = 0;
        for (Object obj : valueOf.getSpans(0, valueOf.length(), CustomImageSpan.class)) {
            i += ((CustomImageSpan) obj).getDrawable().getIntrinsicWidth();
        }
        return ceil + i;
    }

    public final Bitmap b(wcc0 wcc0Var) {
        float f;
        float f2;
        float f3;
        TextPaint textPaint = wcc0Var.f;
        xcc0 xcc0Var = wcc0Var.c;
        PlacesPinLabelBitmapCreator$TextAlignment placesPinLabelBitmapCreator$TextAlignment = wcc0Var.d;
        List list = wcc0Var.h;
        int i = wcc0Var.k;
        int i2 = xng0.textMain;
        Context context = this.a;
        textPaint.setColor(qje.t(i2, context));
        TextPaint textPaint2 = wcc0Var.i;
        textPaint2.setColor(qje.u(context.getTheme(), wcc0Var.j));
        int u = qje.u(context.getTheme(), xng0.bgMain);
        TextPaint textPaint3 = this.f;
        textPaint3.setColor(u);
        Bitmap createBitmap = Bitmap.createBitmap(wcc0Var.a, wcc0Var.b, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        boolean z = wcc0Var.l;
        if (z) {
            textPaint3.setStrokeWidth(i);
            textPaint3.setTextSize(textPaint.getTextSize());
            textPaint3.setTypeface(textPaint.getTypeface());
            textPaint3.setTextAlign(textPaint.getTextAlign());
        }
        int i3 = cdc0.b[placesPinLabelBitmapCreator$TextAlignment.ordinal()];
        if (i3 == 1) {
            f = 2.0f;
            f2 = (i / 2.0f) + xcc0Var.a;
        } else if (i3 == 2) {
            f = 2.0f;
            f2 = (canvas.getWidth() - (i / 2.0f)) - xcc0Var.c;
        } else {
            if (i3 != 3) {
                w511.b();
                return null;
            }
            f2 = canvas.getWidth() / 2.0f;
            f = 2.0f;
        }
        float f4 = i;
        float f5 = f4 / f;
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(Math.abs(textPaint.getFontMetrics().ascent) + f5 + xcc0Var.b));
        float floatValue = ((Number) pair.getFirst()).floatValue();
        float floatValue2 = ((Number) pair.getSecond()).floatValue();
        for (String str : wcc0Var.e) {
            if (z) {
                canvas.drawText(str, floatValue, floatValue2, textPaint3);
            }
            canvas.drawText(str, floatValue, floatValue2, textPaint);
            floatValue2 += wcc0Var.g;
        }
        if (z) {
            textPaint3.setStrokeWidth(f4);
            textPaint3.setTextSize(textPaint2.getTextSize());
            textPaint3.setTypeface(textPaint2.getTypeface());
            textPaint3.setTextAlign(textPaint2.getTextAlign());
        }
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                scc.m();
                throw null;
            }
            vcc0 vcc0Var = (vcc0) next;
            int i6 = ((vcc0) list.get(i4)).b;
            Iterator it2 = kotlin.collections.a.A0(list, i4).iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                i7 += ((vcc0) it2.next()).c;
                it = it;
            }
            Iterator it3 = it;
            int i8 = cdc0.b[placesPinLabelBitmapCreator$TextAlignment.ordinal()];
            if (i8 == 1) {
                f3 = f5 + xcc0Var.a;
            } else if (i8 == 2) {
                f3 = ((canvas.getWidth() - i6) - f5) - xcc0Var.c;
            } else {
                if (i8 != 3) {
                    w511.b();
                    return null;
                }
                f3 = (canvas.getWidth() - i6) / f;
            }
            Pair pair2 = new Pair(Float.valueOf(f3), Float.valueOf(i7 + floatValue2 + textPaint2.getFontMetrics().top));
            float floatValue3 = ((Number) pair2.getFirst()).floatValue();
            float floatValue4 = ((Number) pair2.getSecond()).floatValue();
            int save = canvas.save();
            canvas.translate(floatValue3, floatValue4);
            try {
                boolean z2 = i4 == scc.f(list);
                if (z) {
                    a(vcc0Var.a, textPaint3, vcc0Var.b, 1, z2).draw(canvas);
                }
                a(vcc0Var.a, textPaint2, vcc0Var.b, 1, z2).draw(canvas);
                canvas.restoreToCount(save);
                i4 = i5;
                it = it3;
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
        return createBitmap;
    }

    public final TextPaint c(CharSequence charSequence, int i, Typeface typeface) {
        SpannableStringBuilder spannableStringBuilder;
        TextPaint textPaint = new TextPaint(1);
        Context context = this.a;
        textPaint.setTextSize(tje.r(i, context));
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setTypeface(typeface);
        textPaint.density = context.getResources().getDisplayMetrics().density;
        if (charSequence != null) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            Object[] spans = valueOf.getSpans(0, valueOf.length(), Object.class);
            if (spans != null) {
                for (Object obj : spans) {
                    if (!(obj instanceof CustomImageSpan)) {
                        if (obj instanceof MetricAffectingSpan) {
                            ((MetricAffectingSpan) obj).updateMeasureState(textPaint);
                            CharacterStyle characterStyle = (CharacterStyle) obj;
                            spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : null;
                            if (spannableStringBuilder != null) {
                                spannableStringBuilder.removeSpan(characterStyle);
                            }
                        } else if (obj instanceof CharacterStyle) {
                            CharacterStyle characterStyle2 = (CharacterStyle) obj;
                            characterStyle2.updateDrawState(textPaint);
                            spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : null;
                            if (spannableStringBuilder != null) {
                                spannableStringBuilder.removeSpan(characterStyle2);
                            }
                        }
                    }
                }
            }
        }
        return textPaint;
    }

    public final Typeface e(PlacesPinLabelBitmapCreator$LabelTypeface placesPinLabelBitmapCreator$LabelTypeface) {
        int i = cdc0.a[placesPinLabelBitmapCreator$LabelTypeface.ordinal()];
        if (i == 1) {
            return (Typeface) this.b.getValue();
        }
        if (i == 2) {
            return (Typeface) this.c.getValue();
        }
        if (i == 3) {
            return (Typeface) this.d.getValue();
        }
        if (i == 4) {
            int[] iArr = up11.a;
            return eja1.w(3, 0);
        }
        if (i == 5) {
            int[] iArr2 = up11.a;
            return eja1.w(5, 0);
        }
        w511.b();
        return null;
    }
}
