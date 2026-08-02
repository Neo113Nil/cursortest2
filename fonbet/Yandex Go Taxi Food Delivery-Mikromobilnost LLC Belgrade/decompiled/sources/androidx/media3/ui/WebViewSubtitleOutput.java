package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.common.collect.ImmutableMap;
import defpackage.d6z;
import defpackage.fmy0;
import defpackage.kir;
import defpackage.mib1;
import defpackage.mnt0;
import defpackage.nnt0;
import defpackage.o38;
import defpackage.odf;
import defpackage.ont0;
import defpackage.oyr;
import defpackage.qu41;
import defpackage.rru;
import defpackage.sjl0;
import defpackage.tw21;
import defpackage.unr0;
import defpackage.w1b1;
import defpackage.y2v0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
final class WebViewSubtitleOutput extends FrameLayout implements y2v0 {
    private static final float CSS_LINE_HEIGHT = 1.2f;
    private static final String DEFAULT_BACKGROUND_CSS_CLASS = "default_bg";
    private float bottomPaddingFraction;
    private final CanvasSubtitleOutput canvasSubtitleOutput;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private o38 style;
    private List<odf> textCues;
    private final WebView webView;

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.textCues = Collections.EMPTY_LIST;
        this.style = o38.g;
        this.defaultTextSize = 0.0533f;
        this.defaultTextSizeType = 0;
        this.bottomPaddingFraction = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.canvasSubtitleOutput = canvasSubtitleOutput;
        WebView webView = new WebView(context, attributeSet) { // from class: androidx.media3.ui.WebViewSubtitleOutput.1
            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.webView = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }

    private static int anchorTypeToTranslatePercent(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String convertAlignmentToCss(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i = qu41.a[alignment.ordinal()];
        return i != 1 ? i != 2 ? "center" : "end" : "start";
    }

    private static String convertCaptionStyleToCssTextShadow(o38 o38Var) {
        int i = o38Var.d;
        int i2 = o38Var.e;
        if (i == 1) {
            Object[] objArr = {w1b1.c(i2)};
            int i3 = tw21.a;
            return String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr);
        }
        if (i == 2) {
            String c = w1b1.c(i2);
            int i4 = tw21.a;
            Locale locale = Locale.US;
            return "0.1em 0.12em 0.15em ".concat(c);
        }
        if (i == 3) {
            String c2 = w1b1.c(i2);
            int i5 = tw21.a;
            Locale locale2 = Locale.US;
            return "0.06em 0.08em 0.15em ".concat(c2);
        }
        if (i != 4) {
            return "unset";
        }
        String c3 = w1b1.c(i2);
        int i6 = tw21.a;
        Locale locale3 = Locale.US;
        return "-0.05em -0.05em 0.15em ".concat(c3);
    }

    private String convertTextSizeToCss(int i, float f) {
        float d = mib1.d(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (d == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(d / getContext().getResources().getDisplayMetrics().density)};
        int i2 = tw21.a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    private static String convertVerticalTypeToCss(int i) {
        return i != 1 ? i != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    private static String getBlockShearTransformFunction(odf odfVar) {
        float f = odfVar.q;
        if (f == 0.0f) {
            return "";
        }
        int i = odfVar.p;
        Object[] objArr = {(i == 2 || i == 1) ? "skewY" : "skewX", Float.valueOf(f)};
        int i2 = tw21.a;
        return String.format(Locale.US, "%s(%.2fdeg)", objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x015e, code lost:
    
        if (r12 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0161, code lost:
    
        r17 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0163, code lost:
    
        r21 = "top";
        r23 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0168, code lost:
    
        if (r12 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateWebView() {
        float f;
        float f2;
        int i;
        String format;
        boolean z;
        Object obj;
        String str;
        String str2;
        CharSequence charSequence;
        int i2;
        float f3;
        String str3;
        String str4;
        int i3;
        kir kirVar;
        Object[] objArr;
        int i4;
        int i5;
        int i6;
        int i7;
        String format2;
        String str5;
        Layout.Alignment alignment;
        StringBuilder sb = new StringBuilder();
        float f4 = 1.2f;
        Object[] objArr2 = {w1b1.c(this.style.a), convertTextSizeToCss(this.defaultTextSizeType, this.defaultTextSize), Float.valueOf(1.2f), convertCaptionStyleToCssTextShadow(this.style)};
        int i8 = tw21.a;
        sb.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr2));
        HashMap hashMap = new HashMap();
        String c = w1b1.c(this.style.b);
        String str6 = "background-color:";
        StringBuilder sb2 = new StringBuilder("background-color:");
        sb2.append(c);
        String str7 = ";";
        sb2.append(";");
        hashMap.put(".default_bg,.default_bg *", sb2.toString());
        int i9 = 0;
        while (i9 < this.textCues.size()) {
            odf odfVar = this.textCues.get(i9);
            float f5 = odfVar.h;
            int i10 = odfVar.p;
            float f6 = f5 != -3.4028235E38f ? f5 * 100.0f : 50.0f;
            int anchorTypeToTranslatePercent = anchorTypeToTranslatePercent(odfVar.i);
            float f7 = odfVar.e;
            float f8 = f4;
            if (f7 != -3.4028235E38f) {
                f = -3.4028235E38f;
                if (odfVar.f != 1) {
                    String format3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f7 * 100.0f));
                    int i11 = odfVar.g;
                    i = i10 == 1 ? -anchorTypeToTranslatePercent(i11) : anchorTypeToTranslatePercent(i11);
                    format = format3;
                    f2 = 100.0f;
                } else {
                    f2 = 100.0f;
                    if (f7 >= 0.0f) {
                        format = String.format(Locale.US, "%.2fem", Float.valueOf(f7 * f8));
                        z = false;
                        i = 0;
                    } else {
                        format = String.format(Locale.US, "%.2fem", Float.valueOf(((-f7) - 1.0f) * f8));
                        i = 0;
                        z = true;
                    }
                    float f9 = odfVar.j;
                    String format4 = f9 == f ? String.format(Locale.US, "%.2f%%", Float.valueOf(f9 * f2)) : "fit-content";
                    String convertAlignmentToCss = convertAlignmentToCss(odfVar.b);
                    String convertVerticalTypeToCss = convertVerticalTypeToCss(i10);
                    String convertTextSizeToCss = convertTextSizeToCss(odfVar.n, odfVar.o);
                    String c2 = w1b1.c(!odfVar.l ? odfVar.m : this.style.c);
                    String str8 = "right";
                    if (i10 == 1) {
                        if (i10 != 2) {
                            obj = "left";
                            str = z ? "bottom" : "top";
                        }
                    }
                    if (i10 != 2 || i10 == 1) {
                        str2 = "height";
                        int i12 = i;
                        i = anchorTypeToTranslatePercent;
                        anchorTypeToTranslatePercent = i12;
                    } else {
                        str2 = "width";
                    }
                    String str9 = str2;
                    charSequence = odfVar.a;
                    float f10 = getContext().getResources().getDisplayMetrics().density;
                    Pattern pattern = ont0.a;
                    if (charSequence != null) {
                        kirVar = new kir("", ImmutableMap.f());
                    } else if (charSequence instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence;
                        HashSet hashSet = new HashSet();
                        i2 = i9;
                        f3 = f6;
                        BackgroundColorSpan[] backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        int length = backgroundColorSpanArr.length;
                        int i13 = 0;
                        while (i13 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i13].getBackgroundColor()));
                            i13++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        HashMap hashMap2 = new HashMap();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            String i14 = oyr.i(intValue, "bg_");
                            Iterator it2 = it;
                            String p = unr0.p(Extension.DOT_CHAR, i14, ",.", i14, " *");
                            String c3 = w1b1.c(intValue);
                            int i15 = tw21.a;
                            Locale locale = Locale.US;
                            hashMap2.put(p, str6 + c3 + str7);
                            it = it2;
                            f10 = f10;
                        }
                        float f11 = f10;
                        SparseArray sparseArray = new SparseArray();
                        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                        int length2 = spans.length;
                        int i16 = 0;
                        while (i16 < length2) {
                            String str10 = str7;
                            Object obj2 = spans[i16];
                            String str11 = str6;
                            boolean z2 = obj2 instanceof StrikethroughSpan;
                            String str12 = null;
                            if (z2) {
                                objArr = spans;
                                i4 = length2;
                                i5 = i16;
                                i6 = anchorTypeToTranslatePercent;
                                format2 = "<span style='text-decoration:line-through;'>";
                            } else {
                                if (obj2 instanceof ForegroundColorSpan) {
                                    String c4 = w1b1.c(((ForegroundColorSpan) obj2).getForegroundColor());
                                    int i17 = tw21.a;
                                    Locale locale2 = Locale.US;
                                    objArr = spans;
                                    format2 = oyr.p("<span style='color:", c4, ";'>");
                                    i4 = length2;
                                } else {
                                    objArr = spans;
                                    if (obj2 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj2).getBackgroundColor();
                                        int i18 = tw21.a;
                                        Locale locale3 = Locale.US;
                                        i4 = length2;
                                        format2 = oyr.j(backgroundColor, "<span class='bg_", "'>");
                                    } else {
                                        i4 = length2;
                                        if (obj2 instanceof rru) {
                                            format2 = "<span style='text-combine-upright:all;'>";
                                        } else if (obj2 instanceof AbsoluteSizeSpan) {
                                            Object[] objArr3 = {Float.valueOf(((AbsoluteSizeSpan) obj2).getDip() ? r6.getSize() : r6.getSize() / f11)};
                                            int i19 = tw21.a;
                                            format2 = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr3);
                                        } else if (obj2 instanceof RelativeSizeSpan) {
                                            Object[] objArr4 = {Float.valueOf(((RelativeSizeSpan) obj2).getSizeChange() * f2)};
                                            int i20 = tw21.a;
                                            format2 = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr4);
                                        } else if (obj2 instanceof TypefaceSpan) {
                                            String family = ((TypefaceSpan) obj2).getFamily();
                                            if (family != null) {
                                                int i21 = tw21.a;
                                                Locale locale4 = Locale.US;
                                                format2 = oyr.p("<span style='font-family:\"", family, "\";'>");
                                            }
                                            i5 = i16;
                                            i6 = anchorTypeToTranslatePercent;
                                            format2 = null;
                                        } else if (obj2 instanceof StyleSpan) {
                                            int style = ((StyleSpan) obj2).getStyle();
                                            if (style == 1) {
                                                format2 = "<b>";
                                            } else if (style != 2) {
                                                if (style == 3) {
                                                    format2 = "<b><i>";
                                                }
                                                i5 = i16;
                                                i6 = anchorTypeToTranslatePercent;
                                                format2 = null;
                                            } else {
                                                format2 = "<i>";
                                            }
                                        } else if (obj2 instanceof sjl0) {
                                            int i22 = ((sjl0) obj2).b;
                                            if (i22 == -1) {
                                                format2 = "<ruby style='ruby-position:unset;'>";
                                            } else if (i22 != 1) {
                                                if (i22 == 2) {
                                                    format2 = "<ruby style='ruby-position:under;'>";
                                                }
                                                i5 = i16;
                                                i6 = anchorTypeToTranslatePercent;
                                                format2 = null;
                                            } else {
                                                format2 = "<ruby style='ruby-position:over;'>";
                                            }
                                        } else if (obj2 instanceof UnderlineSpan) {
                                            format2 = "<u>";
                                        } else {
                                            if (obj2 instanceof fmy0) {
                                                fmy0 fmy0Var = (fmy0) obj2;
                                                int i23 = fmy0Var.a;
                                                int i24 = fmy0Var.b;
                                                i5 = i16;
                                                StringBuilder sb3 = new StringBuilder();
                                                i6 = anchorTypeToTranslatePercent;
                                                if (i24 != 1) {
                                                    i7 = 2;
                                                    if (i24 == 2) {
                                                        sb3.append("open ");
                                                    }
                                                } else {
                                                    i7 = 2;
                                                    sb3.append("filled ");
                                                }
                                                if (i23 == 0) {
                                                    sb3.append("none");
                                                } else if (i23 == 1) {
                                                    sb3.append("circle");
                                                } else if (i23 == i7) {
                                                    sb3.append("dot");
                                                } else if (i23 != 3) {
                                                    sb3.append("unset");
                                                } else {
                                                    sb3.append("sesame");
                                                }
                                                Object[] objArr5 = {sb3.toString(), fmy0Var.c != 2 ? "over right" : "under left"};
                                                int i25 = tw21.a;
                                                format2 = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr5);
                                            }
                                            i5 = i16;
                                            i6 = anchorTypeToTranslatePercent;
                                            format2 = null;
                                        }
                                    }
                                }
                                i5 = i16;
                                i6 = anchorTypeToTranslatePercent;
                            }
                            if (z2 || (obj2 instanceof ForegroundColorSpan) || (obj2 instanceof BackgroundColorSpan) || (obj2 instanceof rru) || (obj2 instanceof AbsoluteSizeSpan) || (obj2 instanceof RelativeSizeSpan) || (obj2 instanceof fmy0)) {
                                str5 = "</span>";
                            } else if (obj2 instanceof TypefaceSpan) {
                                str5 = ((TypefaceSpan) obj2).getFamily() != null ? "</span>" : null;
                            } else {
                                if (obj2 instanceof StyleSpan) {
                                    int style2 = ((StyleSpan) obj2).getStyle();
                                    if (style2 == 1) {
                                        str12 = "</b>";
                                    } else if (style2 == 2) {
                                        str12 = "</i>";
                                    } else if (style2 == 3) {
                                        str12 = "</i></b>";
                                    }
                                } else if (obj2 instanceof sjl0) {
                                    str12 = "<rt>" + ont0.a(((sjl0) obj2).a) + "</rt></ruby>";
                                } else if (obj2 instanceof UnderlineSpan) {
                                    str12 = "</u>";
                                }
                                str5 = str12;
                            }
                            int spanStart = spanned.getSpanStart(obj2);
                            int spanEnd = spanned.getSpanEnd(obj2);
                            if (format2 != null) {
                                str5.getClass();
                                mnt0 mnt0Var = new mnt0(spanStart, spanEnd, format2, str5);
                                nnt0 nnt0Var = (nnt0) sparseArray.get(spanStart);
                                if (nnt0Var == null) {
                                    nnt0Var = new nnt0();
                                    sparseArray.put(spanStart, nnt0Var);
                                }
                                nnt0Var.a.add(mnt0Var);
                                nnt0 nnt0Var2 = (nnt0) sparseArray.get(spanEnd);
                                if (nnt0Var2 == null) {
                                    nnt0Var2 = new nnt0();
                                    sparseArray.put(spanEnd, nnt0Var2);
                                }
                                nnt0Var2.b.add(mnt0Var);
                            }
                            i16 = i5 + 1;
                            str7 = str10;
                            str6 = str11;
                            spans = objArr;
                            length2 = i4;
                            anchorTypeToTranslatePercent = i6;
                        }
                        str3 = str7;
                        str4 = str6;
                        i3 = anchorTypeToTranslatePercent;
                        StringBuilder sb4 = new StringBuilder(spanned.length());
                        int i26 = 0;
                        int i27 = 0;
                        while (i27 < sparseArray.size()) {
                            int keyAt = sparseArray.keyAt(i27);
                            sb4.append(ont0.a(spanned.subSequence(i26, keyAt)));
                            nnt0 nnt0Var3 = (nnt0) sparseArray.get(keyAt);
                            ArrayList arrayList = nnt0Var3.b;
                            ArrayList arrayList2 = nnt0Var3.a;
                            SparseArray sparseArray2 = sparseArray;
                            Collections.sort(arrayList, mnt0.f);
                            Iterator it3 = nnt0Var3.b.iterator();
                            while (it3.hasNext()) {
                                sb4.append(((mnt0) it3.next()).d);
                            }
                            Collections.sort(arrayList2, mnt0.e);
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                sb4.append(((mnt0) it4.next()).c);
                            }
                            i27++;
                            i26 = keyAt;
                            sparseArray = sparseArray2;
                        }
                        sb4.append(ont0.a(spanned.subSequence(i26, spanned.length())));
                        kirVar = new kir(sb4.toString(), hashMap2);
                        for (String str13 : hashMap.keySet()) {
                            String str14 = (String) hashMap.put(str13, (String) hashMap.get(str13));
                            d6z.x(str14 == null || str14.equals(hashMap.get(str13)));
                        }
                        sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i2), obj, Float.valueOf(f3), str, format, str9, format4, convertAlignmentToCss, convertVerticalTypeToCss, convertTextSizeToCss, c2, Integer.valueOf(i3), Integer.valueOf(i), getBlockShearTransformFunction(odfVar)));
                        sb.append("<span class='default_bg'>");
                        alignment = odfVar.c;
                        String str15 = kirVar.a;
                        if (alignment != null) {
                            sb.append("<span style='display:inline-block; text-align:" + convertAlignmentToCss(alignment) + ";'>");
                            sb.append(str15);
                            sb.append("</span>");
                        } else {
                            sb.append(str15);
                        }
                        sb.append("</span></div>");
                        i9 = i2 + 1;
                        f4 = f8;
                        str7 = str3;
                        str6 = str4;
                    } else {
                        kirVar = new kir(ont0.a(charSequence), ImmutableMap.f());
                    }
                    str3 = str7;
                    str4 = str6;
                    i2 = i9;
                    f3 = f6;
                    i3 = anchorTypeToTranslatePercent;
                    while (r3.hasNext()) {
                    }
                    sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i2), obj, Float.valueOf(f3), str, format, str9, format4, convertAlignmentToCss, convertVerticalTypeToCss, convertTextSizeToCss, c2, Integer.valueOf(i3), Integer.valueOf(i), getBlockShearTransformFunction(odfVar)));
                    sb.append("<span class='default_bg'>");
                    alignment = odfVar.c;
                    String str152 = kirVar.a;
                    if (alignment != null) {
                    }
                    sb.append("</span></div>");
                    i9 = i2 + 1;
                    f4 = f8;
                    str7 = str3;
                    str6 = str4;
                }
            } else {
                f = -3.4028235E38f;
                f2 = 100.0f;
                i = -100;
                format = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - this.bottomPaddingFraction) * 100.0f));
            }
            z = false;
            float f92 = odfVar.j;
            String format42 = f92 == f ? String.format(Locale.US, "%.2f%%", Float.valueOf(f92 * f2)) : "fit-content";
            String convertAlignmentToCss2 = convertAlignmentToCss(odfVar.b);
            String convertVerticalTypeToCss2 = convertVerticalTypeToCss(i10);
            String convertTextSizeToCss2 = convertTextSizeToCss(odfVar.n, odfVar.o);
            String c22 = w1b1.c(!odfVar.l ? odfVar.m : this.style.c);
            String str82 = "right";
            if (i10 == 1) {
            }
            if (i10 != 2) {
            }
            str2 = "height";
            int i122 = i;
            i = anchorTypeToTranslatePercent;
            anchorTypeToTranslatePercent = i122;
            String str92 = str2;
            charSequence = odfVar.a;
            float f102 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = ont0.a;
            if (charSequence != null) {
            }
            str3 = str7;
            str4 = str6;
            i2 = i9;
            f3 = f6;
            i3 = anchorTypeToTranslatePercent;
            while (r3.hasNext()) {
            }
            sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i2), obj, Float.valueOf(f3), str, format, str92, format42, convertAlignmentToCss2, convertVerticalTypeToCss2, convertTextSizeToCss2, c22, Integer.valueOf(i3), Integer.valueOf(i), getBlockShearTransformFunction(odfVar)));
            sb.append("<span class='default_bg'>");
            alignment = odfVar.c;
            String str1522 = kirVar.a;
            if (alignment != null) {
            }
            sb.append("</span></div>");
            i9 = i2 + 1;
            f4 = f8;
            str7 = str3;
            str6 = str4;
        }
        sb.append("</div></body></html>");
        StringBuilder sb5 = new StringBuilder("<html><head><style>");
        for (String str16 : hashMap.keySet()) {
            sb5.append(str16);
            sb5.append("{");
            sb5.append((String) hashMap.get(str16));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb.insert(0, sb5.toString());
        this.webView.loadData(Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    public void destroy() {
        this.webView.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.textCues.isEmpty()) {
            return;
        }
        updateWebView();
    }

    @Override // defpackage.y2v0
    public void update(List<odf> list, o38 o38Var, float f, int i, float f2) {
        this.style = o38Var;
        this.defaultTextSize = f;
        this.defaultTextSizeType = i;
        this.bottomPaddingFraction = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            odf odfVar = list.get(i2);
            if (odfVar.d != null) {
                arrayList.add(odfVar);
            } else {
                arrayList2.add(odfVar);
            }
        }
        if (!this.textCues.isEmpty() || !arrayList2.isEmpty()) {
            this.textCues = arrayList2;
            updateWebView();
        }
        this.canvasSubtitleOutput.update(arrayList, o38Var, f, i, f2);
        invalidate();
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }
}
