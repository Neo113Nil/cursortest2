package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.b;
import com.yandex.div.core.util.text.DivBackgroundSpan;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.a;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.spannable.BaselineShiftSpan;
import com.yandex.div.core.view2.spannable.FontFeatureSpan;
import com.yandex.div.core.view2.spannable.FontSizeSpan;
import com.yandex.div.core.view2.spannable.ImageSpan;
import com.yandex.div.core.view2.spannable.LineHeightWithTopOffsetSpan;
import com.yandex.div.core.view2.spannable.MaskSpan;
import com.yandex.div.core.view2.spannable.PerformActionSpan;
import com.yandex.div.core.view2.spannable.ShadowSpan;
import com.yandex.div.core.view2.spannable.TextVerticalAlignment;
import com.yandex.div.core.view2.spannable.VerticalAlignmentSpan;
import com.yandex.div.core.view2.text.SelectableLinkMovementMethod;
import com.yandex.div.internal.spannable.LetterSpacingSpan;
import com.yandex.div.internal.spannable.NoStrikethroughSpan;
import com.yandex.div.internal.spannable.NoUnderlineSpan;
import com.yandex.div.internal.spannable.TextColorSpan;
import com.yandex.div.internal.spannable.TypefaceSpan;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivText$Image$Accessibility;
import com.yandex.div2.DivText$Image$IndexingDirection;
import com.yandex.div2.DivTextAlignmentVertical;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.collections.EmptyList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lnt0 {
    public final nml a;
    public final gtk b;
    public final Paint c = new Paint();

    public lnt0(nml nmlVar, gtk gtkVar) {
        this.a = nmlVar;
        this.b = gtkVar;
    }

    public static void a(aw5 aw5Var, TextView textView, SpannableStringBuilder spannableStringBuilder, int i, int i2, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        textView.setMovementMethod(SelectableLinkMovementMethod.INSTANCE);
        spannableStringBuilder.setSpan(new PerformActionSpan(aw5Var, list), i, i2, 33);
        b.e(textView);
    }

    public static int c(int i, cfl cflVar, rvo rvoVar) {
        long longValue = ((Number) cflVar.f.a(rvoVar)).longValue();
        int i2 = jnt0.a[((DivText$Image$IndexingDirection) cflVar.d.a(rvoVar)).ordinal()];
        if (i2 == 1) {
            long j = longValue >> 31;
            return (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        if (i2 != 2) {
            w511.b();
            return 0;
        }
        long j2 = i - longValue;
        long j3 = j2 >> 31;
        return (j3 == 0 || j3 == -1) ? (int) j2 : j2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    public static TextVerticalAlignment d(DivTextAlignmentVertical divTextAlignmentVertical) {
        int i = jnt0.d[divTextAlignmentVertical.ordinal()];
        if (i == 1) {
            return TextVerticalAlignment.TOP;
        }
        if (i == 2) {
            return TextVerticalAlignment.CENTER;
        }
        if (i != 3 && i == 4) {
            return TextVerticalAlignment.BOTTOM;
        }
        return TextVerticalAlignment.BASELINE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:0x096a, code lost:
    
        if (r3 > r13) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x01aa, code lost:
    
        if (r8 > r13) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x08a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x08b8 A[EDGE_INSN: B:201:0x08b8->B:202:0x08b8 BREAK  A[LOOP:1: B:68:0x0697->B:74:0x08a1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0b79 A[LOOP:4: B:344:0x0b79->B:391:0x0cd2, LOOP_START, PHI: r1 r2 r3 r7 r9 r12 r27 r28 r38
      0x0b79: PHI (r1v98 aw5) = (r1v97 aw5), (r1v101 aw5) binds: [B:343:0x0b77, B:391:0x0cd2] A[DONT_GENERATE, DONT_INLINE]
      0x0b79: PHI (r2v18 int) = (r2v17 int), (r2v31 int) binds: [B:343:0x0b77, B:391:0x0cd2] A[DONT_GENERATE, DONT_INLINE]
      0x0b79: PHI (r3v8 android.text.SpannableStringBuilder) = (r3v6 android.text.SpannableStringBuilder), (r3v10 android.text.SpannableStringBuilder) binds: [B:343:0x0b77, B:391:0x0cd2] A[DONT_GENERATE, DONT_INLINE]
      0x0b79: PHI (r7v8 int) = (r7v7 int), (r7v11 int) binds: [B:343:0x0b77, B:391:0x0cd2] A[DONT_GENERATE, DONT_INLINE]
      0x0b79: PHI (r9v14 int) = (r9v13 int), (r9v16 int) binds: [B:343:0x0b77, B:391:0x0cd2] A[DONT_GENERATE, DONT_INLINE]
      0x0b79: PHI (r12v31 int) = (r12v30 int), (r12v32 int) binds: [B:343:0x0b77, B:391:0x0cd2] A[DONT_GENERATE, DONT_INLINE]
      0x0b79: PHI (r27v4 com.yandex.div.core.view2.Div2View) = (r27v3 com.yandex.div.core.view2.Div2View), (r27v5 com.yandex.div.core.view2.Div2View) binds: [B:343:0x0b77, B:391:0x0cd2] A[DONT_GENERATE, DONT_INLINE]
      0x0b79: PHI (r28v4 com.yandex.div.core.view2.Div2View) = (r28v3 com.yandex.div.core.view2.Div2View), (r28v5 com.yandex.div.core.view2.Div2View) binds: [B:343:0x0b77, B:391:0x0cd2] A[DONT_GENERATE, DONT_INLINE]
      0x0b79: PHI (r38v7 kotlin.collections.EmptyList) = (r38v6 kotlin.collections.EmptyList), (r38v9 kotlin.collections.EmptyList) binds: [B:343:0x0b77, B:391:0x0cd2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0c16  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0c2c  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0c47  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0c50  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0ce6  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0c56  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0c4c  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0c3b  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0c1d  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0ce2  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x077a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SpannableStringBuilder b(aw5 aw5Var, TextView textView, ffl fflVar, String str, List list, List list2, List list3, tls tlsVar, boolean z) {
        Integer num;
        Integer num2;
        EmptyList emptyList;
        Integer num3;
        Div2View div2View;
        Div2View div2View2;
        SpannableStringBuilder spannableStringBuilder;
        int i;
        ?? arrayList;
        int i2;
        EmptyList emptyList2;
        Integer num4;
        SpannableStringBuilder spannableStringBuilder2;
        int i3;
        Integer num5;
        Integer num6;
        gy00 fy00Var;
        int i4;
        m8l m8lVar;
        int i5;
        kgr0 kgr0Var;
        Integer num7;
        EmptyList emptyList3;
        Iterator it;
        boolean hasNext;
        nml nmlVar;
        Integer num8;
        DivFontWeight divFontWeight;
        String str2;
        Integer num9;
        int i6;
        char c;
        int i7;
        char c2;
        rvo rvoVar;
        SpannableStringBuilder spannableStringBuilder3;
        int i8;
        int size;
        tls tlsVar2;
        int i9;
        Div2View div2View3;
        afv afvVar;
        String str3;
        PerformActionSpan[] performActionSpanArr;
        int i10;
        hgl hglVar;
        Integer num10;
        String str4;
        int i11;
        Integer num11;
        Integer num12;
        rvo rvoVar2;
        nml nmlVar2;
        SpannableStringBuilder spannableStringBuilder4;
        char c3;
        char c4;
        int i12;
        int i13;
        SpannableStringBuilder spannableStringBuilder5;
        DivTextAlignmentVertical divTextAlignmentVertical;
        int i14;
        EmptyList emptyList4;
        int i15;
        rvo rvoVar3;
        int i16;
        String str5;
        Integer num13;
        Double d;
        DivLineStyle divLineStyle;
        DivLineStyle divLineStyle2;
        Typeface d2;
        Integer num14;
        kgr0 kgr0Var2;
        gy00 gy00Var;
        int i17;
        int intValue;
        List list4;
        lnt0 lnt0Var = this;
        Context context = textView.getContext();
        Div2View div2View4 = aw5Var.a;
        Div2View div2View5 = aw5Var.a;
        rvo rvoVar4 = aw5Var.b;
        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(str.length() == 0 ? "\u200b" : str);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        long longValue = ((Number) fflVar.v.a(rvoVar4)).longValue();
        long j = longValue >> 31;
        int i18 = (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        DivSizeUnit divSizeUnit = (DivSizeUnit) fflVar.w.a(rvoVar4);
        int O = a.O(Integer.valueOf(i18), displayMetrics, divSizeUnit);
        Expression expression = fflVar.y;
        DivFontWeight divFontWeight2 = expression != null ? (DivFontWeight) expression.a(rvoVar4) : null;
        Expression expression2 = fflVar.z;
        if (expression2 != null) {
            long longValue2 = ((Number) expression2.a(rvoVar4)).longValue();
            long j2 = longValue2 >> 31;
            num = Integer.valueOf((j2 == 0 || j2 == -1) ? (int) longValue2 : longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        } else {
            num = null;
        }
        Expression expression3 = fflVar.t;
        String str6 = expression3 != null ? (String) expression3.a(rvoVar4) : null;
        Expression expression4 = fflVar.I;
        if (expression4 != null) {
            long longValue3 = ((Number) expression4.a(rvoVar4)).longValue();
            long j3 = longValue3 >> 31;
            num2 = Integer.valueOf(a.O(Integer.valueOf((j3 == 0 || j3 == -1) ? (int) longValue3 : longValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE), displayMetrics, divSizeUnit));
        } else {
            num2 = null;
        }
        ply0 ply0Var = new ply0(str, O, i18, divSizeUnit, str6, divFontWeight2, num, num2, ((Number) fflVar.Z.a(rvoVar4)).intValue());
        EmptyList emptyList5 = EmptyList.a;
        Integer num15 = ply0Var.h;
        if (num2 == null && ((list4 = list) == null || list4.isEmpty())) {
            arrayList = emptyList5;
            emptyList = arrayList;
            num3 = num15;
            div2View = div2View4;
            div2View2 = div2View5;
            spannableStringBuilder = spannableStringBuilder6;
        } else {
            int size2 = list != null ? list.size() : 0;
            TreeSet treeSet = new TreeSet();
            j73.Z(new Integer[0], treeSet);
            ArrayList arrayList2 = new ArrayList(size2 + 1);
            int i19 = ply0Var.j;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    dfl dflVar = (dfl) it2.next();
                    Expression expression5 = dflVar.q;
                    Context context2 = context;
                    Expression expression6 = dflVar.u;
                    Div2View div2View6 = div2View4;
                    Div2View div2View7 = div2View5;
                    long longValue4 = ((Number) expression5.a(rvoVar4)).longValue();
                    long j4 = longValue4 >> 31;
                    int i20 = (j4 == 0 || j4 == -1) ? (int) longValue4 : longValue4 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    if (i20 > i19) {
                        i20 = i19;
                    }
                    Expression expression7 = dflVar.f;
                    if (expression7 != null) {
                        long longValue5 = ((Number) expression7.a(rvoVar4)).longValue();
                        long j5 = longValue5 >> 31;
                        i2 = (j5 == 0 || j5 == -1) ? (int) longValue5 : longValue5 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    i2 = i19;
                    if (i20 < i2) {
                        DisplayMetrics displayMetrics2 = context2.getResources().getDisplayMetrics();
                        int i21 = i20;
                        Expression expression8 = dflVar.i;
                        if (expression8 != null) {
                            emptyList2 = emptyList5;
                            num4 = num15;
                            long longValue6 = ((Number) expression8.a(rvoVar4)).longValue();
                            long j6 = longValue6 >> 31;
                            num5 = Integer.valueOf((j6 == 0 || j6 == -1) ? (int) longValue6 : longValue6 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                        } else {
                            emptyList2 = emptyList5;
                            num4 = num15;
                            num5 = null;
                        }
                        DivSizeUnit divSizeUnit2 = (DivSizeUnit) dflVar.j.a(rvoVar4);
                        Expression expression9 = dflVar.b;
                        DivTextAlignmentVertical divTextAlignmentVertical2 = expression9 != null ? (DivTextAlignmentVertical) expression9.a(rvoVar4) : null;
                        int O2 = a.O((Number) dflVar.d.a(rvoVar4), displayMetrics2, divSizeUnit2);
                        Expression expression10 = dflVar.g;
                        String str7 = expression10 != null ? (String) expression10.a(rvoVar4) : null;
                        Expression expression11 = dflVar.h;
                        String str8 = expression11 != null ? (String) expression11.a(rvoVar4) : null;
                        Integer valueOf = num5 != null ? Integer.valueOf(a.O(num5, displayMetrics2, divSizeUnit2)) : null;
                        Expression expression12 = dflVar.l;
                        DivFontWeight divFontWeight3 = expression12 != null ? (DivFontWeight) expression12.a(rvoVar4) : null;
                        Expression expression13 = dflVar.m;
                        if (expression13 != null) {
                            spannableStringBuilder2 = spannableStringBuilder6;
                            i3 = i19;
                            long longValue7 = ((Number) expression13.a(rvoVar4)).longValue();
                            long j7 = longValue7 >> 31;
                            num6 = Integer.valueOf((j7 == 0 || j7 == -1) ? (int) longValue7 : longValue7 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                        } else {
                            spannableStringBuilder2 = spannableStringBuilder6;
                            i3 = i19;
                            num6 = null;
                        }
                        Expression expression14 = dflVar.k;
                        JSONObject jSONObject = expression14 != null ? (JSONObject) expression14.a(rvoVar4) : null;
                        Expression expression15 = dflVar.n;
                        Double valueOf2 = expression15 != null ? Double.valueOf(((Number) expression15.a(rvoVar4)).doubleValue() / (num5 != null ? num5.intValue() : ply0Var.c)) : null;
                        Expression expression16 = dflVar.o;
                        Integer valueOf3 = expression16 != null ? Integer.valueOf(a.N(Long.valueOf(((Number) expression16.a(rvoVar4)).longValue()), displayMetrics2, divSizeUnit2)) : null;
                        pgl pglVar = dflVar.p;
                        if (pglVar == null) {
                            fy00Var = null;
                        } else {
                            DisplayMetrics displayMetrics3 = context2.getResources().getDisplayMetrics();
                            if (pglVar instanceof ngl) {
                                ygl b = ((ngl) pglVar).b();
                                sqk sqkVar = b.e;
                                long longValue8 = ((Number) sqkVar.b.a(rvoVar4)).longValue();
                                DivSizeUnit divSizeUnit3 = (DivSizeUnit) sqkVar.a.a(rvoVar4);
                                int intValue2 = ((Number) b.a.a(rvoVar4)).intValue();
                                float doubleValue = (float) ((Number) b.b.a(rvoVar4)).doubleValue();
                                boolean booleanValue = ((Boolean) b.c.a(rvoVar4)).booleanValue();
                                boolean booleanValue2 = ((Boolean) b.d.a(rvoVar4)).booleanValue();
                                Long valueOf4 = Long.valueOf(longValue8);
                                int i22 = o05.a[divSizeUnit3.ordinal()];
                                if (i22 == 1) {
                                    i4 = 1;
                                } else if (i22 == 2) {
                                    i4 = 2;
                                } else {
                                    if (i22 != 3) {
                                        w511.b();
                                        return null;
                                    }
                                    i4 = 0;
                                }
                                fy00Var = new ey00(intValue2, doubleValue, booleanValue, booleanValue2, TypedValue.applyDimension(i4, valueOf4.floatValue(), displayMetrics3));
                            } else {
                                if (!(pglVar instanceof ogl)) {
                                    w511.b();
                                    return null;
                                }
                                fhl b2 = ((ogl) pglVar).b();
                                fy00Var = new fy00(((Number) b2.a.a(rvoVar4)).intValue(), ((Boolean) b2.b.a(rvoVar4)).booleanValue());
                                Expression expression17 = dflVar.r;
                                DivLineStyle divLineStyle3 = expression17 == null ? (DivLineStyle) expression17.a(rvoVar4) : null;
                                Expression expression18 = dflVar.s;
                                Integer num16 = expression18 == null ? (Integer) expression18.a(rvoVar4) : null;
                                m8lVar = dflVar.t;
                                if (m8lVar != null) {
                                    i5 = i2;
                                    kgr0Var = null;
                                } else {
                                    x4l x4lVar = m8lVar.d;
                                    DisplayMetrics displayMetrics4 = context2.getResources().getDisplayMetrics();
                                    int i23 = ply0Var.i >>> 24;
                                    i5 = i2;
                                    float q = a.q((Number) m8lVar.b.a(rvoVar4), displayMetrics4);
                                    float G = a.G(x4lVar.a, displayMetrics4, rvoVar4);
                                    float G2 = a.G(x4lVar.b, displayMetrics4, rvoVar4);
                                    int intValue3 = ((Number) m8lVar.c.a(rvoVar4)).intValue();
                                    Paint paint = lnt0Var.c;
                                    paint.setColor(intValue3);
                                    paint.setAlpha((int) (i23 * ((Number) m8lVar.a.a(rvoVar4)).doubleValue()));
                                    kgr0Var = new kgr0(G, G2, q, paint.getColor());
                                }
                                if (expression6 == null) {
                                    long longValue9 = ((Number) expression6.a(rvoVar4)).longValue();
                                    long j8 = longValue9 >> 31;
                                    num7 = Integer.valueOf(a.O(Integer.valueOf((j8 == 0 || j8 == -1) ? (int) longValue9 : longValue9 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE), displayMetrics2, divSizeUnit2));
                                } else {
                                    num7 = null;
                                }
                                Integer valueOf5 = expression6 == null ? Integer.valueOf(i21) : null;
                                Integer valueOf6 = expression6 == null ? Integer.valueOf(i5) : null;
                                Expression expression19 = dflVar.v;
                                DivLineStyle divLineStyle4 = expression19 == null ? (DivLineStyle) expression19.a(rvoVar4) : null;
                                mlt0 mlt0Var = new mlt0(i21, i5, divTextAlignmentVertical2, O2, str7, str8, valueOf, divSizeUnit2, divFontWeight3, num6, jSONObject, valueOf2, valueOf3, fy00Var, divLineStyle3, num16, kgr0Var, num7, valueOf5, valueOf6, divLineStyle4);
                                DivLineStyle divLineStyle5 = divLineStyle4;
                                if (divTextAlignmentVertical2 == null || O2 != 0 || str7 != null || str8 != null || valueOf != null || divSizeUnit2 != mlt0.O || divFontWeight3 != null || num6 != null || valueOf2 != null || valueOf3 != null || fy00Var != null || divLineStyle3 != null || num16 != null || kgr0Var != null || num7 != null || valueOf5 != null || valueOf6 != null || divLineStyle5 != null) {
                                    treeSet.add(Integer.valueOf(i21));
                                    treeSet.add(Integer.valueOf(i5));
                                    arrayList2.add(mlt0Var);
                                }
                            }
                        }
                        Expression expression172 = dflVar.r;
                        if (expression172 == null) {
                        }
                        Expression expression182 = dflVar.s;
                        if (expression182 == null) {
                        }
                        m8lVar = dflVar.t;
                        if (m8lVar != null) {
                        }
                        if (expression6 == null) {
                        }
                        if (expression6 == null) {
                        }
                        if (expression6 == null) {
                        }
                        Expression expression192 = dflVar.v;
                        if (expression192 == null) {
                        }
                        mlt0 mlt0Var2 = new mlt0(i21, i5, divTextAlignmentVertical2, O2, str7, str8, valueOf, divSizeUnit2, divFontWeight3, num6, jSONObject, valueOf2, valueOf3, fy00Var, divLineStyle3, num16, kgr0Var, num7, valueOf5, valueOf6, divLineStyle4);
                        DivLineStyle divLineStyle52 = divLineStyle4;
                        if (divTextAlignmentVertical2 == null) {
                        }
                        treeSet.add(Integer.valueOf(i21));
                        treeSet.add(Integer.valueOf(i5));
                        arrayList2.add(mlt0Var2);
                    } else {
                        emptyList2 = emptyList5;
                        num4 = num15;
                        spannableStringBuilder2 = spannableStringBuilder6;
                        i3 = i19;
                    }
                    context = context2;
                    div2View4 = div2View6;
                    div2View5 = div2View7;
                    emptyList5 = emptyList2;
                    num15 = num4;
                    spannableStringBuilder6 = spannableStringBuilder2;
                    i19 = i3;
                }
            }
            emptyList = emptyList5;
            num3 = num15;
            div2View = div2View4;
            div2View2 = div2View5;
            spannableStringBuilder = spannableStringBuilder6;
            int i24 = i19;
            xcc.p(arrayList2);
            if (num3 != null) {
                int intValue4 = num3.intValue();
                treeSet.add(0);
                treeSet.add(Integer.valueOf(i24));
                i = 0;
                arrayList2.add(0, new mlt0(0, i24, null, 0, null, null, null, mlt0.O, null, null, null, null, Integer.valueOf(intValue4), null, null, null, null, null, null, null, null));
            } else {
                i = 0;
            }
            if (arrayList2.isEmpty()) {
                arrayList = emptyList;
            } else {
                List J0 = kotlin.collections.a.J0(treeSet);
                arrayList = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int intValue5 = ((Number) kotlin.collections.a.P(J0)).intValue();
                if (J0.size() == 1) {
                    mlt0 mlt0Var3 = new mlt0(intValue5, intValue5, null, 0, null, null, null, mlt0.O, null, null, null, null, null, null, null, null, null, null, null, null, null);
                    Iterator it3 = arrayList2.iterator();
                    mlt0 mlt0Var4 = mlt0Var3;
                    while (it3.hasNext()) {
                        mlt0Var4 = mlt0Var4.a((mlt0) it3.next(), intValue5, intValue5);
                    }
                    arrayList.add(mlt0Var4);
                } else {
                    int size3 = J0.size();
                    int i25 = 1;
                    while (i25 < size3) {
                        int intValue6 = ((Number) J0.get(i25)).intValue();
                        int size4 = arrayList2.size();
                        for (int i26 = i; i26 < size4; i26++) {
                            mlt0 mlt0Var5 = (mlt0) arrayList2.get(i26);
                            int i27 = mlt0Var5.a;
                            if (intValue6 < i27) {
                                break;
                            }
                            if (intValue6 > i27 && intValue6 <= mlt0Var5.b) {
                                arrayList3.add(mlt0Var5);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            mlt0 mlt0Var6 = new mlt0(intValue5, intValue6, null, 0, null, null, null, mlt0.O, null, null, null, null, null, null, null, null, null, null, null, null, null);
                            int i28 = intValue5;
                            Iterator it4 = arrayList3.iterator();
                            mlt0 mlt0Var7 = mlt0Var6;
                            while (it4.hasNext()) {
                                mlt0Var7 = mlt0Var7.a((mlt0) it4.next(), i28, intValue6);
                            }
                            arrayList.add(mlt0Var7);
                        }
                        arrayList3.clear();
                        i25++;
                        intValue5 = intValue6;
                    }
                }
            }
        }
        int i29 = ply0Var.j;
        if (list2 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : list2) {
                if (((Number) ((cfl) obj).f.a(rvoVar4)).longValue() <= i29) {
                    arrayList4.add(obj);
                }
            }
            emptyList3 = kotlin.collections.a.x0(arrayList4, new knt0(lnt0Var, ply0Var, rvoVar4));
        } else {
            emptyList3 = emptyList;
        }
        Iterable iterable = arrayList;
        TextView textView2 = textView;
        boolean z2 = textView2 instanceof DivLineHeightTextView;
        DivLineHeightTextView divLineHeightTextView = z2 ? (DivLineHeightTextView) textView2 : null;
        if (divLineHeightTextView != null) {
            divLineHeightTextView.clearImageSpans$div_release();
            com.yandex.div.core.util.text.a textRoundedBgHelper = divLineHeightTextView.getTextRoundedBgHelper();
            if (textRoundedBgHelper != null) {
                textRoundedBgHelper.e(z);
                it = iterable.iterator();
                while (true) {
                    hasNext = it.hasNext();
                    nmlVar = lnt0Var.a;
                    num8 = ply0Var.g;
                    divFontWeight = ply0Var.f;
                    str2 = ply0Var.e;
                    if (hasNext) {
                        break;
                    }
                    mlt0 mlt0Var8 = (mlt0) it.next();
                    int i30 = mlt0Var8.a;
                    Integer num17 = mlt0Var8.K;
                    Iterator it5 = it;
                    DivFontWeight divFontWeight4 = mlt0Var8.B;
                    ply0 ply0Var2 = ply0Var;
                    String str9 = mlt0Var8.x;
                    Integer num18 = mlt0Var8.z;
                    Integer num19 = mlt0Var8.C;
                    Integer num20 = mlt0Var8.F;
                    boolean z3 = z2;
                    int i31 = mlt0Var8.b;
                    if (i30 > i31) {
                        emptyList4 = emptyList3;
                        rvoVar3 = rvoVar4;
                        num14 = num3;
                        spannableStringBuilder5 = spannableStringBuilder;
                        i15 = i29;
                    } else {
                        DivTextAlignmentVertical divTextAlignmentVertical3 = mlt0Var8.c;
                        if (divTextAlignmentVertical3 == null) {
                            divTextAlignmentVertical3 = DivTextAlignmentVertical.BASELINE;
                        }
                        int i32 = mlt0Var8.w;
                        if (i32 != 0) {
                            if (num20 != null) {
                                intValue = num20.intValue();
                            } else if (num3 != null) {
                                intValue = num3.intValue();
                            } else {
                                i17 = 0;
                                BaselineShiftSpan baselineShiftSpan = new BaselineShiftSpan(i32, i17);
                                spannableStringBuilder5 = spannableStringBuilder;
                                spannableStringBuilder5.setSpan(baselineShiftSpan, i30, i31, 33);
                            }
                            i17 = intValue;
                            BaselineShiftSpan baselineShiftSpan2 = new BaselineShiftSpan(i32, i17);
                            spannableStringBuilder5 = spannableStringBuilder;
                            spannableStringBuilder5.setSpan(baselineShiftSpan2, i30, i31, 33);
                        } else {
                            spannableStringBuilder5 = spannableStringBuilder;
                            if (divTextAlignmentVertical3 != DivTextAlignmentVertical.BASELINE) {
                                if (num18 != null) {
                                    divTextAlignmentVertical = divTextAlignmentVertical3;
                                    i14 = num18.intValue();
                                } else {
                                    divTextAlignmentVertical = divTextAlignmentVertical3;
                                    i14 = 0;
                                }
                                emptyList4 = emptyList3;
                                TextVerticalAlignment d3 = d(divTextAlignmentVertical);
                                i15 = i29;
                                rvoVar3 = rvoVar4;
                                spannableStringBuilder5.setSpan(new VerticalAlignmentSpan(i14, d3, new da1(4, textView2)), i30, i31, 33);
                                if (num18 == null) {
                                    i16 = 33;
                                    spannableStringBuilder5.setSpan(new FontSizeSpan(num18.intValue(), num20 != null ? num20.intValue() : num3 != null ? num3.intValue() : 0), i30, i31, 33);
                                } else {
                                    i16 = 33;
                                }
                                str5 = mlt0Var8.y;
                                if (str5 != null) {
                                    spannableStringBuilder5.setSpan(new FontFeatureSpan(str5), i30, i31, i16);
                                }
                                num13 = mlt0Var8.I;
                                if (num13 != null) {
                                    spannableStringBuilder5.setSpan(new TextColorSpan(num13.intValue()), i30, i31, i16);
                                }
                                d = mlt0Var8.E;
                                if (d != null) {
                                    spannableStringBuilder5.setSpan(new LetterSpacingSpan((float) d.doubleValue()), i30, i31, i16);
                                }
                                divLineStyle = mlt0Var8.H;
                                if (divLineStyle != null) {
                                    int i33 = jnt0.b[divLineStyle.ordinal()];
                                    if (i33 == 1) {
                                        spannableStringBuilder5.setSpan(new StrikethroughSpan(), i30, i31, 33);
                                    } else if (i33 == 2) {
                                        spannableStringBuilder5.setSpan(new NoStrikethroughSpan(), i30, i31, 33);
                                    }
                                }
                                divLineStyle2 = mlt0Var8.N;
                                if (divLineStyle2 != null) {
                                    int i34 = jnt0.b[divLineStyle2.ordinal()];
                                    if (i34 == 1) {
                                        spannableStringBuilder5.setSpan(new UnderlineSpan(), i30, i31, 33);
                                    } else if (i34 == 2) {
                                        spannableStringBuilder5.setSpan(new NoUnderlineSpan(), i30, i31, 33);
                                    }
                                }
                                lml a = nmlVar.a(str9 != null ? str2 : str9);
                                if (str9 == null || divFontWeight4 != null || num19 != null) {
                                    d2 = a.d((divFontWeight4 == null || num19 != null) ? qje.x(divFontWeight4, num19) : qje.x(divFontWeight, num8));
                                    if (d2 == null) {
                                        d2 = Typeface.DEFAULT;
                                    }
                                    spannableStringBuilder5.setSpan(new TypefaceSpan(d2), i30, i31, 33);
                                }
                                a.getClass();
                                if (num20 == null || num17 != null) {
                                    num14 = num3;
                                    int i35 = !jl40.l(num20, num14) ? 18 : 33;
                                    int intValue7 = num17 == null ? num17.intValue() : 0;
                                    int intValue8 = num20 == null ? num20.intValue() : 0;
                                    Integer num21 = mlt0Var8.L;
                                    int intValue9 = num21 == null ? num21.intValue() : i30;
                                    Integer num22 = mlt0Var8.M;
                                    spannableStringBuilder5.setSpan(new LineHeightWithTopOffsetSpan(intValue7, intValue8, intValue9, num22 == null ? num22.intValue() : i31), i30, i31, i35);
                                } else {
                                    num14 = num3;
                                }
                                kgr0Var2 = mlt0Var8.J;
                                if (kgr0Var2 != null) {
                                    spannableStringBuilder5.setSpan(new ShadowSpan(kgr0Var2), i30, i31, 33);
                                }
                                gy00Var = mlt0Var8.G;
                                if (gy00Var != null) {
                                    if (gy00Var instanceof ey00) {
                                        if (((ey00) gy00Var).a()) {
                                            spannableStringBuilder5.setSpan(new MaskSpan(gy00Var, z3 ? (DivLineHeightTextView) textView2 : null), i30, i31, 33);
                                        }
                                    } else if ((gy00Var instanceof fy00) && ((fy00) gy00Var).a()) {
                                        spannableStringBuilder5.setSpan(new MaskSpan(gy00Var, z3 ? (DivLineHeightTextView) textView2 : null), i30, i31, 33);
                                    }
                                }
                            }
                        }
                        i15 = i29;
                        emptyList4 = emptyList3;
                        rvoVar3 = rvoVar4;
                        if (num18 == null) {
                        }
                        str5 = mlt0Var8.y;
                        if (str5 != null) {
                        }
                        num13 = mlt0Var8.I;
                        if (num13 != null) {
                        }
                        d = mlt0Var8.E;
                        if (d != null) {
                        }
                        divLineStyle = mlt0Var8.H;
                        if (divLineStyle != null) {
                        }
                        divLineStyle2 = mlt0Var8.N;
                        if (divLineStyle2 != null) {
                        }
                        lml a2 = nmlVar.a(str9 != null ? str2 : str9);
                        if (str9 == null) {
                        }
                        d2 = a2.d((divFontWeight4 == null || num19 != null) ? qje.x(divFontWeight4, num19) : qje.x(divFontWeight, num8));
                        if (d2 == null) {
                        }
                        spannableStringBuilder5.setSpan(new TypefaceSpan(d2), i30, i31, 33);
                        a2.getClass();
                        if (num20 == null) {
                        }
                        num14 = num3;
                        if (!jl40.l(num20, num14)) {
                        }
                        if (num17 == null) {
                        }
                        if (num20 == null) {
                        }
                        Integer num212 = mlt0Var8.L;
                        if (num212 == null) {
                        }
                        Integer num222 = mlt0Var8.M;
                        spannableStringBuilder5.setSpan(new LineHeightWithTopOffsetSpan(intValue7, intValue8, intValue9, num222 == null ? num222.intValue() : i31), i30, i31, i35);
                        kgr0Var2 = mlt0Var8.J;
                        if (kgr0Var2 != null) {
                        }
                        gy00Var = mlt0Var8.G;
                        if (gy00Var != null) {
                        }
                    }
                    num3 = num14;
                    it = it5;
                    ply0Var = ply0Var2;
                    i29 = i15;
                    z2 = z3;
                    emptyList3 = emptyList4;
                    rvoVar4 = rvoVar3;
                    spannableStringBuilder = spannableStringBuilder5;
                    lnt0Var = this;
                }
                EmptyList emptyList6 = emptyList3;
                rvo rvoVar5 = rvoVar4;
                boolean z4 = z2;
                Integer num23 = num3;
                SpannableStringBuilder spannableStringBuilder7 = spannableStringBuilder;
                int i36 = 1;
                char c5 = 4;
                int i37 = 2;
                char c6 = '!';
                int i38 = i29;
                if (list != null) {
                    List<dfl> list5 = list;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        for (dfl dflVar2 : list5) {
                            if (dflVar2.a != null || dflVar2.c != null || dflVar2.e != null) {
                                for (dfl dflVar3 : list5) {
                                    rvo rvoVar6 = rvoVar5;
                                    long longValue10 = ((Number) dflVar3.q.a(rvoVar6)).longValue();
                                    long j9 = longValue10 >> 31;
                                    int i39 = (j9 == 0 || j9 == -1) ? (int) longValue10 : longValue10 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                                    int i40 = i38;
                                    int i41 = i39 > i40 ? i40 : i39;
                                    Expression expression20 = dflVar3.f;
                                    if (expression20 != null) {
                                        long longValue11 = ((Number) expression20.a(rvoVar6)).longValue();
                                        long j10 = longValue11 >> 31;
                                        i10 = (j10 == 0 || j10 == -1) ? (int) longValue11 : longValue11 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                                    }
                                    i10 = i40;
                                    DivFontWeight divFontWeight5 = divFontWeight;
                                    int i42 = i10;
                                    SpannableStringBuilder spannableStringBuilder8 = spannableStringBuilder7;
                                    Integer num24 = num8;
                                    Integer num25 = num23;
                                    a(aw5Var, textView2, spannableStringBuilder8, i41, i42, dflVar3.a);
                                    hgl hglVar2 = dflVar3.e;
                                    agl aglVar = dflVar3.c;
                                    if (hglVar2 == null && aglVar == null) {
                                        rvoVar2 = rvoVar6;
                                        i12 = i37;
                                        i38 = i40;
                                        c4 = c6;
                                        c3 = 4;
                                        i13 = 1;
                                        spannableStringBuilder4 = spannableStringBuilder8;
                                        nmlVar2 = nmlVar;
                                    } else {
                                        DisplayMetrics displayMetrics5 = textView.getContext().getResources().getDisplayMetrics();
                                        rvo rvoVar7 = aw5Var.b;
                                        Expression expression21 = dflVar3.i;
                                        if (expression21 != null) {
                                            hglVar = hglVar2;
                                            long longValue12 = ((Number) expression21.a(rvoVar7)).longValue();
                                            long j11 = longValue12 >> 31;
                                            num10 = Integer.valueOf((j11 == 0 || j11 == -1) ? (int) longValue12 : longValue12 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                                        } else {
                                            hglVar = hglVar2;
                                            num10 = null;
                                        }
                                        DivSizeUnit divSizeUnit4 = (DivSizeUnit) dflVar3.j.a(rvoVar7);
                                        Expression expression22 = dflVar3.g;
                                        if (expression22 == null || (str4 = (String) expression22.a(rvoVar7)) == null) {
                                            str4 = str2;
                                        }
                                        lml a3 = nmlVar.a(str4);
                                        Expression expression23 = dflVar3.l;
                                        DivFontWeight divFontWeight6 = expression23 != null ? (DivFontWeight) expression23.a(rvoVar7) : null;
                                        int i43 = i41;
                                        Expression expression24 = dflVar3.m;
                                        if (expression24 != null) {
                                            i11 = i42;
                                            long longValue13 = ((Number) expression24.a(rvoVar7)).longValue();
                                            long j12 = longValue13 >> 31;
                                            num11 = Integer.valueOf((j12 == 0 || j12 == -1) ? (int) longValue13 : longValue13 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                                        } else {
                                            i11 = i42;
                                            num11 = null;
                                        }
                                        int x = (divFontWeight6 == null && num11 == null) ? qje.x(divFontWeight5, num24) : qje.x(divFontWeight6, num11);
                                        Expression expression25 = dflVar3.k;
                                        if (expression25 != null) {
                                        }
                                        a3.getClass();
                                        int O3 = a.O((Number) dflVar3.d.a(rvoVar7), displayMetrics5, divSizeUnit4);
                                        Expression expression26 = dflVar3.b;
                                        DivTextAlignmentVertical divTextAlignmentVertical4 = expression26 != null ? (DivTextAlignmentVertical) expression26.a(rvoVar7) : null;
                                        Expression expression27 = dflVar3.o;
                                        Integer valueOf7 = expression27 != null ? Integer.valueOf(a.N(Long.valueOf(((Number) expression27.a(rvoVar7)).longValue()), displayMetrics5, divSizeUnit4)) : null;
                                        Integer valueOf8 = num10 != null ? Integer.valueOf(a.O(num10, displayMetrics5, divSizeUnit4)) : null;
                                        Expression expression28 = dflVar3.u;
                                        if (expression28 != null) {
                                            long longValue14 = ((Number) expression28.a(rvoVar7)).longValue();
                                            long j13 = longValue14 >> 31;
                                            num12 = Integer.valueOf(a.O(Integer.valueOf((j13 == 0 || j13 == -1) ? (int) longValue14 : longValue14 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE), displayMetrics5, divSizeUnit4));
                                        } else {
                                            num12 = null;
                                        }
                                        Typeface d4 = a3.d(x);
                                        if (d4 == null) {
                                            d4 = Typeface.DEFAULT;
                                        }
                                        Typeface typeface = d4;
                                        Expression expression29 = dflVar3.h;
                                        DivBackgroundSpan divBackgroundSpan = new DivBackgroundSpan(hglVar, aglVar, O3, divTextAlignmentVertical4, valueOf7, valueOf8, num12, typeface, expression29 != null ? (String) expression29.a(rvoVar7) : null, null);
                                        if (z4) {
                                            DivLineHeightTextView divLineHeightTextView2 = (DivLineHeightTextView) textView;
                                            rvoVar2 = rvoVar6;
                                            nmlVar2 = nmlVar;
                                            int i44 = i11;
                                            spannableStringBuilder4 = spannableStringBuilder8;
                                            c3 = 4;
                                            c4 = '!';
                                            i12 = 2;
                                            i13 = 1;
                                            i38 = i40;
                                            if (!ti91.b(divLineHeightTextView2, spannableStringBuilder4, divBackgroundSpan, i43, i44, rvoVar7)) {
                                                spannableStringBuilder4.setSpan(divBackgroundSpan, i43, i44, 33);
                                                com.yandex.div.core.util.text.a textRoundedBgHelper2 = divLineHeightTextView2.getTextRoundedBgHelper();
                                                if (textRoundedBgHelper2 != null) {
                                                    textRoundedBgHelper2.a(divBackgroundSpan, z);
                                                }
                                            }
                                        } else {
                                            rvoVar2 = rvoVar6;
                                            nmlVar2 = nmlVar;
                                            spannableStringBuilder4 = spannableStringBuilder8;
                                            c3 = 4;
                                            c4 = '!';
                                            i12 = 2;
                                            i13 = 1;
                                            i38 = i40;
                                        }
                                    }
                                    nmlVar = nmlVar2;
                                    c6 = c4;
                                    divFontWeight = divFontWeight5;
                                    rvoVar5 = rvoVar2;
                                    i36 = i13;
                                    num23 = num25;
                                    num8 = num24;
                                    c5 = c3;
                                    spannableStringBuilder7 = spannableStringBuilder4;
                                    i37 = i12;
                                    textView2 = textView;
                                }
                                num9 = num23;
                                i6 = i36;
                                c = c5;
                                i7 = i37;
                                c2 = c6;
                                rvoVar = rvoVar5;
                                spannableStringBuilder3 = spannableStringBuilder7;
                                i8 = 3;
                                int length = spannableStringBuilder3.length();
                                SpannableStringBuilder spannableStringBuilder9 = spannableStringBuilder3;
                                int i45 = i7;
                                int i46 = i6;
                                int i47 = i38;
                                int i48 = i8;
                                aw5 aw5Var2 = aw5Var;
                                a(aw5Var2, textView, spannableStringBuilder9, 0, length, list3);
                                size = emptyList6.size() - 1;
                                if (size >= 0) {
                                    while (true) {
                                        int i49 = size - 1;
                                        EmptyList emptyList7 = emptyList6;
                                        cfl cflVar = (cfl) emptyList7.get(size);
                                        int c7 = c(i47, cflVar, rvoVar);
                                        int c8 = size > 0 ? c(i47, (cfl) emptyList7.get(size - 1), rvoVar) : Integer.MIN_VALUE;
                                        spannableStringBuilder9.insert(c7, (CharSequence) ShimmerDivHandler.NUMBER_SING);
                                        DisplayMetrics displayMetrics6 = textView.getResources().getDisplayMetrics();
                                        int c9 = c(i47, cflVar, rvoVar);
                                        int H = a.H(cflVar.j, displayMetrics6, rvoVar);
                                        int H2 = a.H(cflVar.c, displayMetrics6, rvoVar);
                                        int intValue10 = num9 != null ? num9.intValue() : 0;
                                        TextVerticalAlignment d5 = d((DivTextAlignmentVertical) cflVar.b.a(rvoVar));
                                        DivText$Image$Accessibility divText$Image$Accessibility = cflVar.a;
                                        if (divText$Image$Accessibility != null) {
                                            int i50 = jnt0.c[divText$Image$Accessibility.b.ordinal()];
                                            if (i50 != i46) {
                                                if (i50 == i45) {
                                                    str3 = qoi0.a(Button.class).c();
                                                } else if (i50 == i48) {
                                                    str3 = qoi0.a(ImageView.class).c();
                                                } else if (i50 == 4) {
                                                    str3 = qoi0.a(TextView.class).c();
                                                } else if (i50 == 5) {
                                                    str3 = qoi0.a(ImageView.class).c();
                                                }
                                                Expression expression30 = divText$Image$Accessibility.a;
                                                String str10 = expression30 == null ? (String) expression30.a(rvoVar) : null;
                                                performActionSpanArr = (PerformActionSpan[]) spannableStringBuilder9.getSpans(c9, c9 + 1, PerformActionSpan.class);
                                                if (performActionSpanArr.length <= i46) {
                                                    i9 = i46;
                                                    div2View3 = div2View2;
                                                    hi91.f(div2View3, new Throwable("Two or more clickable ranges intersect."));
                                                } else {
                                                    i9 = i46;
                                                    div2View3 = div2View2;
                                                }
                                                PerformActionSpan performActionSpan = (PerformActionSpan) j73.D(performActionSpanArr);
                                                List<v3k> actions = performActionSpan == null ? performActionSpan.getActions() : null;
                                                afvVar = new afv(str3, str10, actions == null ? new int0(div2View3, aw5Var2, textView, actions) : null);
                                            }
                                            str3 = null;
                                            Expression expression302 = divText$Image$Accessibility.a;
                                            if (expression302 == null) {
                                            }
                                            performActionSpanArr = (PerformActionSpan[]) spannableStringBuilder9.getSpans(c9, c9 + 1, PerformActionSpan.class);
                                            if (performActionSpanArr.length <= i46) {
                                            }
                                            PerformActionSpan performActionSpan2 = (PerformActionSpan) j73.D(performActionSpanArr);
                                            if (performActionSpan2 == null) {
                                            }
                                            afvVar = new afv(str3, str10, actions == null ? new int0(div2View3, aw5Var2, textView, actions) : null);
                                        } else {
                                            i9 = i46;
                                            div2View3 = div2View2;
                                            afvVar = null;
                                        }
                                        ImageSpan imageSpan = new ImageSpan(null, H, H2, intValue10, d5, afvVar);
                                        spannableStringBuilder9.setSpan(imageSpan, c9, c9 + 1, 33);
                                        DivLineHeightTextView divLineHeightTextView3 = z4 ? (DivLineHeightTextView) textView : null;
                                        if (divLineHeightTextView3 != null) {
                                            divLineHeightTextView3.addImageSpan$div_release(imageSpan);
                                        }
                                        int i51 = c8 + 1 == c7 ? i9 : 0;
                                        int i52 = (c7 <= 0 || rza.b(spannableStringBuilder9.charAt(c7 + (-1)))) ? 0 : i9;
                                        if (i51 == 0 && i52 != 0) {
                                            spannableStringBuilder9.insert(c7, (CharSequence) "\u2060");
                                        }
                                        String uri = ((Uri) cflVar.i.a(rvoVar)).toString();
                                        SpannableStringBuilder spannableStringBuilder10 = spannableStringBuilder9;
                                        tlsVar2 = tlsVar;
                                        emptyList6 = emptyList7;
                                        spannableStringBuilder9 = spannableStringBuilder10;
                                        Div2View div2View8 = div2View;
                                        div2View8.addLoadReference(this.b.loadImage(uri, new xsk(aw5Var, cflVar, imageSpan, spannableStringBuilder10, tlsVar2)), textView);
                                        if (i49 < 0) {
                                            break;
                                        }
                                        aw5Var2 = aw5Var;
                                        div2View = div2View8;
                                        div2View2 = div2View3;
                                        size = i49;
                                        i46 = i9;
                                        i45 = 2;
                                        i48 = 3;
                                    }
                                } else {
                                    tlsVar2 = tlsVar;
                                }
                                if (tlsVar2 != null) {
                                    tlsVar2.invoke(spannableStringBuilder9);
                                }
                                return spannableStringBuilder9;
                            }
                        }
                    }
                }
                num9 = num23;
                i6 = 1;
                c = 4;
                i7 = 2;
                c2 = '!';
                rvoVar = rvoVar5;
                spannableStringBuilder3 = spannableStringBuilder7;
                i8 = 3;
                int length2 = spannableStringBuilder3.length();
                SpannableStringBuilder spannableStringBuilder92 = spannableStringBuilder3;
                int i452 = i7;
                int i462 = i6;
                int i472 = i38;
                int i482 = i8;
                aw5 aw5Var22 = aw5Var;
                a(aw5Var22, textView, spannableStringBuilder92, 0, length2, list3);
                size = emptyList6.size() - 1;
                if (size >= 0) {
                }
                if (tlsVar2 != null) {
                }
                return spannableStringBuilder92;
            }
        }
        it = iterable.iterator();
        while (true) {
            hasNext = it.hasNext();
            nmlVar = lnt0Var.a;
            num8 = ply0Var.g;
            divFontWeight = ply0Var.f;
            str2 = ply0Var.e;
            if (hasNext) {
            }
            num3 = num14;
            it = it5;
            ply0Var = ply0Var2;
            i29 = i15;
            z2 = z3;
            emptyList3 = emptyList4;
            rvoVar4 = rvoVar3;
            spannableStringBuilder = spannableStringBuilder5;
            lnt0Var = this;
        }
        EmptyList emptyList62 = emptyList3;
        rvo rvoVar52 = rvoVar4;
        boolean z42 = z2;
        Integer num232 = num3;
        SpannableStringBuilder spannableStringBuilder72 = spannableStringBuilder;
        int i362 = 1;
        char c52 = 4;
        int i372 = 2;
        char c62 = '!';
        int i382 = i29;
        if (list != null) {
        }
        num9 = num232;
        i6 = 1;
        c = 4;
        i7 = 2;
        c2 = '!';
        rvoVar = rvoVar52;
        spannableStringBuilder3 = spannableStringBuilder72;
        i8 = 3;
        int length22 = spannableStringBuilder3.length();
        SpannableStringBuilder spannableStringBuilder922 = spannableStringBuilder3;
        int i4522 = i7;
        int i4622 = i6;
        int i4722 = i382;
        int i4822 = i8;
        aw5 aw5Var222 = aw5Var;
        a(aw5Var222, textView, spannableStringBuilder922, 0, length22, list3);
        size = emptyList62.size() - 1;
        if (size >= 0) {
        }
        if (tlsVar2 != null) {
        }
        return spannableStringBuilder922;
    }
}
