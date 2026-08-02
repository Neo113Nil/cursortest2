package com.yandex.delivery.attrbutedtext.impl.text.base;

import android.app.Application;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.UpdateAppearance;
import android.util.TypedValue;
import com.yandex.delivery.attrbutedtext.api.FormattedText;
import com.yandex.delivery.attrbutedtext.api.c;
import com.yandex.delivery.attrbutedtext.api.d;
import com.yandex.delivery.attrbutedtext.api.e;
import com.yandex.delivery.attrbutedtext.api.f;
import com.yandex.delivery.attrbutedtext.api.g;
import com.yandex.delivery.attrbutedtext.api.h;
import com.yandex.delivery.attrbutedtext.impl.text.base.span.AbsoluteSizeSpanFix;
import com.yandex.delivery.attrbutedtext.impl.text.base.span.CustomImageSpan;
import com.yandex.delivery.attrbutedtext.impl.text.base.span.DiagonallyStrikethroughSpan;
import com.yandex.delivery.attrbutedtext.impl.text.base.span.ForegroundColorSpanFix;
import com.yandex.delivery.attrbutedtext.impl.text.base.span.OutlineSpan;
import com.yandex.delivery.attrbutedtext.impl.text.base.span.StrikethroughSpanFix;
import com.yandex.delivery.attrbutedtext.impl.text.base.span.StyleSpanFix;
import com.yandex.delivery.attrbutedtext.impl.text.base.span.StyledTypefaceSpan;
import com.yandex.delivery.attrbutedtext.impl.text.base.span.URLSpanFix;
import com.yandex.delivery.attrbutedtext.impl.text.base.span.UnderlineSpanFix;
import defpackage.a2u;
import defpackage.b8s;
import defpackage.bvf0;
import defpackage.cvu0;
import defpackage.dci;
import defpackage.ddc;
import defpackage.e820;
import defpackage.e991;
import defpackage.fyr;
import defpackage.hhs0;
import defpackage.i8s;
import defpackage.idc;
import defpackage.iob1;
import defpackage.j73;
import defpackage.jjz;
import defpackage.kjz;
import defpackage.l7x0;
import defpackage.lzr;
import defpackage.m810;
import defpackage.my4;
import defpackage.ngd0;
import defpackage.ofg;
import defpackage.p15;
import defpackage.r820;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.w8s;
import defpackage.wuj0;
import defpackage.yjf;
import defpackage.z7s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.logistics.sdk.o;
import ru.yandex.taxi.logistics.sdk.ui.theme.fonts.TextMetaStyle;

/* loaded from: classes11.dex */
public final class a {
    public final my4 a;
    public final dci b;
    public final l7x0 c;
    public final Context d;
    public final e820 e;
    public final a2u f;
    public final ofg g;

    public a(my4 my4Var, dci dciVar, l7x0 l7x0Var, Context context, e820 e820Var, a2u a2uVar, ofg ofgVar) {
        this.a = my4Var;
        this.b = dciVar;
        this.c = l7x0Var;
        this.d = context;
        this.e = e820Var;
        this.f = a2uVar;
        this.g = ofgVar;
    }

    public static Object c(a aVar, FormattedText formattedText, ContinuationImpl continuationImpl) {
        Map f = b.f();
        aVar.getClass();
        return bvf0.n(new BaseFormattedTextConverter$awaitConvert$2(aVar, formattedText, true, false, false, f, null), continuationImpl);
    }

    public final void a(SpannableStringBuilder spannableStringBuilder, tse tseVar, List list, boolean z, boolean z2, boolean z3, Map map) {
        String str;
        int i;
        a aVar = this;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i8s i8sVar = (i8s) it.next();
            if (i8sVar instanceof com.yandex.delivery.attrbutedtext.api.a) {
                com.yandex.delivery.attrbutedtext.api.a aVar2 = (com.yandex.delivery.attrbutedtext.api.a) i8sVar;
                if (aVar2 instanceof e) {
                    str = aVar.c.a(((e) aVar2).a);
                } else if (aVar2 instanceof f) {
                    str = ((f) aVar2).a;
                }
                String str2 = str;
                Drawable drawable = new Drawable() { // from class: com.yandex.delivery.attrbutedtext.impl.text.base.BaseFormattedTextConverter$EmptyDrawable
                    public static final int $stable = 8;

                    @Override // android.graphics.drawable.Drawable
                    public void draw(Canvas canvas) {
                    }

                    @Override // android.graphics.drawable.Drawable
                    public int getOpacity() {
                        return -2;
                    }

                    @Override // android.graphics.drawable.Drawable
                    public void setAlpha(int alpha) {
                    }

                    @Override // android.graphics.drawable.Drawable
                    public void setColorFilter(ColorFilter colorFilter) {
                    }
                };
                Integer width = aVar2.getWidth();
                Context context = aVar.d;
                int b = width != null ? m810.b(TypedValue.applyDimension(1, width.intValue(), context.getResources().getDisplayMetrics())) : 0;
                int b2 = aVar2.getHeight() != null ? m810.b(TypedValue.applyDimension(1, r6.intValue(), context.getResources().getDisplayMetrics())) : 0;
                drawable.setBounds(0, 0, b, b2);
                int i2 = p15.b[aVar2.c().ordinal()];
                if (i2 == 1) {
                    i = 1;
                } else if (i2 == 2) {
                    i = 2;
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return;
                    }
                    i = 0;
                }
                CustomImageSpan customImageSpan = new CustomImageSpan(drawable, i, i == 1 ? aVar2.d() : null, aVar2.b(), false, new yjf(str2), 16, null);
                spannableStringBuilder.append(" ", customImageSpan, 33);
                tje.N(tseVar, null, null, new BaseFormattedTextConverter$appendImage$1(b, b2, customImageSpan, this, aVar2, z, spannableStringBuilder, str2, null), 3);
            } else if (i8sVar instanceof h) {
                aVar = this;
                aVar.b(spannableStringBuilder, (h) i8sVar, z3, null, z2, map);
            } else if (i8sVar instanceof g) {
                g gVar = (g) i8sVar;
                aVar = this;
                aVar.b(spannableStringBuilder, gVar.b, z3, new URLSpanFix(gVar.a), z2, map);
            } else if (i8sVar instanceof d) {
                spannableStringBuilder.length();
                aVar = this;
                aVar.a(spannableStringBuilder, tseVar, ((d) i8sVar).b, z, z2, z3, map);
                aVar.f.getClass();
            }
            aVar = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c4 A[LOOP:3: B:92:0x02be->B:94:0x02c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0275  */
    /* JADX WARN: Type inference failed for: r24v0, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.yandex.delivery.attrbutedtext.impl.text.base.span.OutlineSpan] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(SpannableStringBuilder spannableStringBuilder, h hVar, boolean z, URLSpanFix uRLSpanFix, boolean z2, Map map) {
        int i;
        idc ddcVar;
        idc idcVar;
        TextMetaStyle textMetaStyle;
        fyr fyrVar;
        Integer num;
        Typeface typeface;
        lzr lzrVar;
        int i2;
        int i3;
        UpdateAppearance styledTypefaceSpan;
        int i4;
        UnderlineSpanFix underlineSpanFix;
        UnderlineSpanFix underlineSpanFix2;
        Object strikethroughSpanFix;
        Object obj;
        Float f;
        ofg ofgVar;
        Iterator it;
        Object obj2;
        Object obj3;
        UpdateAppearance updateAppearance;
        kjz kjzVar;
        int i5;
        ru.yandex.taxi.common_models.net.TextMetaStyle textMetaStyle2;
        Integer num2;
        int length = spannableStringBuilder.length();
        String str = hVar.a;
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            str = cvu0.v(str, (String) entry.getKey(), (String) entry.getValue(), false);
        }
        spannableStringBuilder.append(str);
        String str2 = hVar.g;
        DefaultConstructorMarker defaultConstructorMarker = null;
        defaultConstructorMarker = null;
        if (z2) {
            ddcVar = this.a.a(str2);
        } else {
            Integer b = iob1.b(str2);
            ddcVar = b != null ? new ddc(b.intValue()) : null;
        }
        String str3 = hVar.j;
        if (str3 != null) {
            if (z2) {
                idcVar = this.a.a(str3);
            } else {
                Integer b2 = iob1.b(str3);
                if (b2 != null) {
                    idcVar = new ddc(b2.intValue());
                }
            }
            textMetaStyle = hVar.i;
            int i6 = 2;
            if (textMetaStyle != null && (kjzVar = ngd0.z) != null) {
                r820 r820Var = (r820) ((o) kjzVar.b).v.get();
                i5 = jjz.c[textMetaStyle.ordinal()];
                if (i5 != 1) {
                    textMetaStyle2 = ru.yandex.taxi.common_models.net.TextMetaStyle.HeadlineTitle1;
                } else if (i5 == 2) {
                    textMetaStyle2 = ru.yandex.taxi.common_models.net.TextMetaStyle.HeadlineTitle2;
                } else if (i5 == 3) {
                    textMetaStyle2 = ru.yandex.taxi.common_models.net.TextMetaStyle.HeadlineTitle3;
                } else if (i5 == 4) {
                    textMetaStyle2 = ru.yandex.taxi.common_models.net.TextMetaStyle.HeadlineTitle4;
                } else {
                    if (i5 != 5) {
                        w511.b();
                        return;
                    }
                    textMetaStyle2 = ru.yandex.taxi.common_models.net.TextMetaStyle.HeadlineTitle5;
                }
                hhs0 a = r820Var.a(textMetaStyle2);
                num2 = (Integer) a.b;
                if (num2 != null) {
                    Typeface b3 = wuj0.b(num2.intValue(), (Application) ((kjz) kjzVar.c).c);
                    if (b3 != null) {
                        fyrVar = new fyr(b3, (Integer) a.c);
                        if (fyrVar != null || (num = fyrVar.b) == null) {
                            num = hVar.d;
                        }
                        AbsoluteSizeSpanFix absoluteSizeSpanFix = num != null ? new AbsoluteSizeSpanFix(num.intValue(), true) : null;
                        typeface = fyrVar != null ? fyrVar.a : null;
                        FormattedText.FontWeight fontWeight = hVar.c;
                        FormattedText.FontStyle fontStyle = hVar.b;
                        if (typeface == null) {
                            if (fontWeight != null || z) {
                                if (fontWeight == null) {
                                    fontWeight = FormattedText.FontWeight.REGULAR;
                                }
                                int i7 = w8s.b[fontWeight.ordinal()];
                                if (i7 == 1) {
                                    lzrVar = lzr.C;
                                } else if (i7 == 2) {
                                    lzrVar = lzr.D;
                                } else if (i7 == 3) {
                                    lzrVar = lzr.E;
                                } else if (i7 == 4) {
                                    lzrVar = lzr.G;
                                } else {
                                    if (i7 != 5) {
                                        w511.b();
                                        return;
                                    }
                                    lzrVar = lzr.H;
                                }
                                int[] iArr = w8s.a;
                                int i8 = iArr[fontStyle.ordinal()];
                                if (i8 == 1) {
                                    i2 = 0;
                                } else {
                                    if (i8 != 2) {
                                        w511.b();
                                        return;
                                    }
                                    i2 = 1;
                                }
                                Typeface s = ngd0.s(i2, lzrVar);
                                int i9 = iArr[fontStyle.ordinal()];
                                if (i9 == 1) {
                                    i3 = 0;
                                } else {
                                    if (i9 != 2) {
                                        w511.b();
                                        return;
                                    }
                                    i3 = 2;
                                }
                                styledTypefaceSpan = new StyledTypefaceSpan(s, i3);
                            } else {
                                if (fontStyle == FormattedText.FontStyle.NORMAL) {
                                    fontStyle = null;
                                }
                                if (fontStyle != null) {
                                    int i10 = w8s.a[fontStyle.ordinal()];
                                    if (i10 == 1) {
                                        i4 = 0;
                                    } else {
                                        if (i10 != 2) {
                                            w511.b();
                                            return;
                                        }
                                        i4 = 2;
                                    }
                                    updateAppearance = new StyleSpanFix(i4);
                                } else {
                                    styledTypefaceSpan = null;
                                }
                            }
                            if (hVar.f.isEmpty()) {
                                Iterator it3 = hVar.f.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        obj3 = null;
                                        break;
                                    } else {
                                        obj3 = it3.next();
                                        if (((b8s) obj3) instanceof z7s) {
                                            break;
                                        }
                                    }
                                }
                                if ((obj3 instanceof z7s ? (z7s) obj3 : null) != null) {
                                    underlineSpanFix = new UnderlineSpanFix();
                                    underlineSpanFix2 = underlineSpanFix;
                                }
                                underlineSpanFix2 = null;
                            } else {
                                if (hVar.e.contains(FormattedText.TextDecoration.UNDERLINE)) {
                                    underlineSpanFix = new UnderlineSpanFix();
                                    underlineSpanFix2 = underlineSpanFix;
                                }
                                underlineSpanFix2 = null;
                            }
                            if (hVar.f.isEmpty()) {
                                List list = hVar.f;
                                ofg ofgVar2 = this.g;
                                Iterator it4 = list.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        obj2 = null;
                                        break;
                                    } else {
                                        obj2 = it4.next();
                                        if (((b8s) obj2) instanceof c) {
                                            break;
                                        }
                                    }
                                }
                                c cVar = obj2 instanceof c ? (c) obj2 : null;
                                FormattedText.LineThroughStyle lineThroughStyle = cVar != null ? cVar.a : null;
                                int i11 = lineThroughStyle == null ? -1 : p15.a[lineThroughStyle.ordinal()];
                                if (i11 != 1) {
                                    if (i11 == 2) {
                                        Context context = this.d;
                                        idc a2 = this.a.a(cVar.b);
                                        if (a2 != null) {
                                            strikethroughSpanFix = new DiagonallyStrikethroughSpan(context, e991.d(a2, ofgVar2.b()), e991.d(ddcVar == null ? new ddc(0) : ddcVar, ofgVar2.b()));
                                        }
                                    }
                                    obj = null;
                                } else {
                                    strikethroughSpanFix = new StrikethroughSpanFix();
                                }
                                obj = strikethroughSpanFix;
                            } else {
                                if (hVar.e.contains(FormattedText.TextDecoration.LINE_THROUGH)) {
                                    strikethroughSpanFix = new StrikethroughSpanFix();
                                    obj = strikethroughSpanFix;
                                }
                                obj = null;
                            }
                            if (hVar.h != null) {
                                this.e.getClass();
                            }
                            ForegroundColorSpanFix foregroundColorSpanFix = ddcVar == null ? new ForegroundColorSpanFix(e991.d(ddcVar, this.g.b())) : null;
                            f = hVar.k;
                            ofgVar = this.g;
                            if (ddcVar != null && idcVar != null) {
                                defaultConstructorMarker = new OutlineSpan(e991.d(ddcVar, ofgVar.b()), e991.d(idcVar, ofgVar.b()), TypedValue.applyDimension(1, f == null ? f.floatValue() : 0.5f, this.d.getResources().getDisplayMetrics()));
                            }
                            it = ((ArrayList) j73.A(new Object[]{uRLSpanFix, absoluteSizeSpanFix, styledTypefaceSpan, underlineSpanFix2, obj, foregroundColorSpanFix, defaultConstructorMarker})).iterator();
                            while (it.hasNext()) {
                                spannableStringBuilder.setSpan(it.next(), length, spannableStringBuilder.length(), 33);
                            }
                        }
                        updateAppearance = new StyledTypefaceSpan(typeface, i, i6, defaultConstructorMarker);
                        styledTypefaceSpan = updateAppearance;
                        if (hVar.f.isEmpty()) {
                        }
                        if (hVar.f.isEmpty()) {
                        }
                        if (hVar.h != null) {
                        }
                        if (ddcVar == null) {
                        }
                        f = hVar.k;
                        ofgVar = this.g;
                        if (ddcVar != null) {
                            defaultConstructorMarker = new OutlineSpan(e991.d(ddcVar, ofgVar.b()), e991.d(idcVar, ofgVar.b()), TypedValue.applyDimension(1, f == null ? f.floatValue() : 0.5f, this.d.getResources().getDisplayMetrics()));
                        }
                        it = ((ArrayList) j73.A(new Object[]{uRLSpanFix, absoluteSizeSpanFix, styledTypefaceSpan, underlineSpanFix2, obj, foregroundColorSpanFix, defaultConstructorMarker})).iterator();
                        while (it.hasNext()) {
                        }
                    }
                }
            }
            fyrVar = null;
            if (fyrVar != null) {
            }
            num = hVar.d;
            if (num != null) {
            }
            if (fyrVar != null) {
            }
            FormattedText.FontWeight fontWeight2 = hVar.c;
            FormattedText.FontStyle fontStyle2 = hVar.b;
            if (typeface == null) {
            }
            styledTypefaceSpan = updateAppearance;
            if (hVar.f.isEmpty()) {
            }
            if (hVar.f.isEmpty()) {
            }
            if (hVar.h != null) {
            }
            if (ddcVar == null) {
            }
            f = hVar.k;
            ofgVar = this.g;
            if (ddcVar != null) {
            }
            it = ((ArrayList) j73.A(new Object[]{uRLSpanFix, absoluteSizeSpanFix, styledTypefaceSpan, underlineSpanFix2, obj, foregroundColorSpanFix, defaultConstructorMarker})).iterator();
            while (it.hasNext()) {
            }
        }
        idcVar = null;
        textMetaStyle = hVar.i;
        int i62 = 2;
        if (textMetaStyle != null) {
            r820 r820Var2 = (r820) ((o) kjzVar.b).v.get();
            i5 = jjz.c[textMetaStyle.ordinal()];
            if (i5 != 1) {
            }
            hhs0 a3 = r820Var2.a(textMetaStyle2);
            num2 = (Integer) a3.b;
            if (num2 != null) {
            }
        }
        fyrVar = null;
        if (fyrVar != null) {
        }
        num = hVar.d;
        if (num != null) {
        }
        if (fyrVar != null) {
        }
        FormattedText.FontWeight fontWeight22 = hVar.c;
        FormattedText.FontStyle fontStyle22 = hVar.b;
        if (typeface == null) {
        }
        styledTypefaceSpan = updateAppearance;
        if (hVar.f.isEmpty()) {
        }
        if (hVar.f.isEmpty()) {
        }
        if (hVar.h != null) {
        }
        if (ddcVar == null) {
        }
        f = hVar.k;
        ofgVar = this.g;
        if (ddcVar != null) {
        }
        it = ((ArrayList) j73.A(new Object[]{uRLSpanFix, absoluteSizeSpanFix, styledTypefaceSpan, underlineSpanFix2, obj, foregroundColorSpanFix, defaultConstructorMarker})).iterator();
        while (it.hasNext()) {
        }
    }
}
