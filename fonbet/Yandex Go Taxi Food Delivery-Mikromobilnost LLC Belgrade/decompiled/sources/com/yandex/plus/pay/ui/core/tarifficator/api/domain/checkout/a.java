package com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusGradient;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.home.common.utils.LinearGradientSpan;
import com.yandex.plus.home.common.utils.PlusClickableSpan;
import com.yandex.plus.home.common.utils.RadialGradientSpan;
import com.yandex.plus.home.common.utils.spantext.CustomImageSpan;
import com.yandex.plus.home.common.utils.spantext.DiagonalStrikethroughSpan;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.agc0;
import defpackage.ak00;
import defpackage.b5d0;
import defpackage.cpd0;
import defpackage.d6w;
import defpackage.gw00;
import defpackage.mdh;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.ovg0;
import defpackage.pgz;
import defpackage.qoi0;
import defpackage.scc;
import defpackage.sjh;
import defpackage.sng0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tpd0;
import defpackage.uyj;
import defpackage.vng;
import defpackage.w511;
import defpackage.wls;
import defpackage.ycc;
import defpackage.yw01;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

/* loaded from: classes2.dex */
public final class a implements cpd0 {
    public final Context a;
    public final n4u0 b;
    public final b5d0 c;
    public final pgz d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;

    public a(Context context, n4u0 n4u0Var, b5d0 b5d0Var, pgz pgzVar) {
        this.a = context;
        this.b = n4u0Var;
        this.c = b5d0Var;
        this.d = pgzVar;
        this.e = vng.p(sng0.pay_sdk_highlightTextColor, context);
        this.f = vng.p(sng0.pay_sdk_alertColor, context);
        this.g = vng.p(sng0.pay_sdk_secondaryTextColor, context);
        this.h = context.getResources().getDimension(ovg0.pay_sdk_strikethrough_size);
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, List list, String str, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d6w d6wVar = (d6w) it.next();
            spannableStringBuilder.replace(d6wVar.a, d6wVar.b + 1, (CharSequence) str);
            int i = d6wVar.a;
            d6w d6wVar2 = new d6w(i, str.length() + i, 1);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                spannableStringBuilder.setSpan(it2.next(), d6wVar2.a, d6wVar2.b, 17);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayRichText plusPayRichText, wls wlsVar, ContinuationImpl continuationImpl) {
        PlusTarifficatorRichTextMapperImpl$convert$1 plusTarifficatorRichTextMapperImpl$convert$1;
        int i;
        SpannableStringBuilder spannableStringBuilder;
        wls wlsVar2;
        Object k0;
        Map map;
        Object obj;
        String str;
        List list;
        Object obj2;
        PlusPayRichText.Item.TextColor textColor;
        List singletonList;
        if (continuationImpl instanceof PlusTarifficatorRichTextMapperImpl$convert$1) {
            plusTarifficatorRichTextMapperImpl$convert$1 = (PlusTarifficatorRichTextMapperImpl$convert$1) continuationImpl;
            int i2 = plusTarifficatorRichTextMapperImpl$convert$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusTarifficatorRichTextMapperImpl$convert$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = plusTarifficatorRichTextMapperImpl$convert$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusTarifficatorRichTextMapperImpl$convert$1.label;
                int i3 = 10;
                Object obj4 = null;
                if (i != 0) {
                    b.b(obj3);
                    spannableStringBuilder = new SpannableStringBuilder(plusPayRichText.getText());
                    List<PlusPayRichText.Item> items = plusPayRichText.getItems();
                    int d = gw00.d(tcc.n(items, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    for (Object obj5 : items) {
                        linkedHashMap.put("{{" + ((PlusPayRichText.Item) obj5).getKey() + "}}", obj5);
                    }
                    plusTarifficatorRichTextMapperImpl$convert$1.L$0 = null;
                    wlsVar2 = wlsVar;
                    plusTarifficatorRichTextMapperImpl$convert$1.L$1 = wlsVar2;
                    plusTarifficatorRichTextMapperImpl$convert$1.L$2 = spannableStringBuilder;
                    plusTarifficatorRichTextMapperImpl$convert$1.L$3 = linkedHashMap;
                    plusTarifficatorRichTextMapperImpl$convert$1.label = 1;
                    sjh sjhVar = uyj.a;
                    k0 = tje.k0(mdh.b, new PlusTarifficatorRichTextMapperImpl$loadImages$2(linkedHashMap, this, null), plusTarifficatorRichTextMapperImpl$convert$1);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    map = linkedHashMap;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map = (Map) plusTarifficatorRichTextMapperImpl$convert$1.L$3;
                    spannableStringBuilder = (SpannableStringBuilder) plusTarifficatorRichTextMapperImpl$convert$1.L$2;
                    wls wlsVar3 = (wls) plusTarifficatorRichTextMapperImpl$convert$1.L$1;
                    b.b(obj3);
                    k0 = obj3;
                    wlsVar2 = wlsVar3;
                }
                Map map2 = (Map) k0;
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    PlusPayRichText.Item item = (PlusPayRichText.Item) entry.getValue();
                    List s = kotlin.sequences.b.s(new yw01(Regex.c(new Regex(str2, RegexOption.LITERAL), spannableStringBuilder), PlusTarifficatorRichTextMapperImpl$findAllOccurrences$1.b));
                    boolean z = item instanceof PlusPayRichText.Item.TextColor;
                    n4u0 n4u0Var = this.b;
                    Context context = this.a;
                    int i4 = 2;
                    if (z) {
                        PlusPayRichText.Item.TextColor textColor2 = (PlusPayRichText.Item.TextColor) item;
                        PlusTheme plusTheme = (PlusTheme) n4u0Var.getValue();
                        PlusThemedColor<PlusColor> color = textColor2.getColor();
                        PlusColor plusColor = (PlusColor) (tpd0.a(context, plusTheme) ? color.getDark() : color.getLight());
                        if (plusColor instanceof PlusColor.Color) {
                            list = Collections.singletonList(new ForegroundColorSpan(((PlusColor.Color) plusColor).getColor()));
                        } else {
                            if (!(plusColor instanceof PlusColor.Gradient)) {
                                StringBuilder sb = new StringBuilder("Unsupported color type in TextColor replacement. Type: ");
                                if (plusColor == null || (str = qoi0.a(plusColor.getClass()).d()) == null) {
                                    str = "null";
                                }
                                String data = textColor2.getData();
                                PlusThemedColor<PlusColor> color2 = textColor2.getColor();
                                sb.append(str);
                                sb.append(", Text: ");
                                sb.append(data);
                                sb.append(", Color: ");
                                sb.append(color2);
                                throw new IllegalStateException(sb.toString().toString());
                            }
                            List<PlusGradient> gradients = ((PlusColor.Gradient) plusColor).getGradients();
                            ArrayList arrayList = new ArrayList();
                            for (PlusGradient plusGradient : gradients) {
                                if (plusGradient instanceof PlusGradient.Linear) {
                                    PlusGradient.Linear linear = (PlusGradient.Linear) plusGradient;
                                    String data2 = textColor2.getData();
                                    if (linear.getColors().size() < i4) {
                                        Integer num = (Integer) kotlin.collections.a.R(linear.getColors());
                                        if (num == null) {
                                            ak00.e("Linear gradient must have at least one color. Text: ", data2, ", gradient: ", linear);
                                            return obj4;
                                        }
                                        singletonList = Collections.singletonList(new ForegroundColorSpan(num.intValue()));
                                    } else {
                                        singletonList = Collections.singletonList(new LinearGradientSpan(data2, ((Number) kotlin.collections.a.P(linear.getColors())).intValue(), ((Number) kotlin.collections.a.Z(linear.getColors())).intValue(), null, 8, null));
                                    }
                                } else {
                                    if (!(plusGradient instanceof PlusGradient.Radial)) {
                                        Object obj6 = obj4;
                                        w511.b();
                                        return obj6;
                                    }
                                    PlusGradient.Radial radial = (PlusGradient.Radial) plusGradient;
                                    String data3 = textColor2.getData();
                                    if (radial.getColors().size() < i4) {
                                        Integer num2 = (Integer) kotlin.collections.a.R(radial.getColors());
                                        if (num2 == null) {
                                            ak00.e("Radial gradient must have at least one color. Text: ", data3, ", gradient: ", radial);
                                            return obj4;
                                        }
                                        singletonList = Collections.singletonList(new ForegroundColorSpan(num2.intValue()));
                                    } else {
                                        List<Double> positions = radial.getPositions();
                                        obj2 = obj4;
                                        ArrayList arrayList2 = new ArrayList(tcc.n(positions, i3));
                                        Iterator<T> it = positions.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(Float.valueOf((float) ((Number) it.next()).doubleValue()));
                                            textColor2 = textColor2;
                                        }
                                        textColor = textColor2;
                                        singletonList = Collections.singletonList(new RadialGradientSpan(data3, kotlin.collections.a.I0(radial.getColors()), kotlin.collections.a.G0(arrayList2), (float) ((Number) radial.getCenter().c()).doubleValue(), (float) ((Number) radial.getCenter().f()).doubleValue(), (float) ((Number) radial.getRadius().c()).doubleValue(), (float) ((Number) radial.getRadius().f()).doubleValue(), null, 128, null));
                                        ycc.r(singletonList, arrayList);
                                        textColor2 = textColor;
                                        obj4 = obj2;
                                        i3 = 10;
                                        i4 = 2;
                                    }
                                }
                                textColor = textColor2;
                                obj2 = obj4;
                                ycc.r(singletonList, arrayList);
                                textColor2 = textColor;
                                obj4 = obj2;
                                i3 = 10;
                                i4 = 2;
                            }
                            list = arrayList;
                        }
                        obj = obj4;
                        b(spannableStringBuilder, s, textColor2.getData(), list);
                    } else {
                        obj = obj4;
                        boolean z2 = item instanceof PlusPayRichText.Item.Icon;
                        EmptyList emptyList = EmptyList.a;
                        if (z2) {
                            PlusPayRichText.Item.Icon icon = (PlusPayRichText.Item.Icon) item;
                            PlusTheme plusTheme2 = (PlusTheme) n4u0Var.getValue();
                            PlusThemedImage image = icon.getImage();
                            Drawable drawable = (Drawable) map2.get((String) (tpd0.a(context, plusTheme2) ? image.getDark() : image.getLight()));
                            if (drawable != null) {
                                float applyDimension = TypedValue.applyDimension(2, 16.0f, context.getResources().getDisplayMetrics());
                                drawable.setBounds(0, 0, (int) ((drawable.getIntrinsicWidth() * applyDimension) / drawable.getIntrinsicHeight()), (int) applyDimension);
                                b(spannableStringBuilder, s, " ", Collections.singletonList(new CustomImageSpan(drawable, 2, false, false, 12, null)));
                            } else {
                                b(spannableStringBuilder, s, icon.getAltText(), emptyList);
                            }
                        } else {
                            boolean z3 = item instanceof PlusPayRichText.Item.Link;
                            int i5 = this.e;
                            if (z3) {
                                PlusPayRichText.Item.Link link = (PlusPayRichText.Item.Link) item;
                                b(spannableStringBuilder, s, link.getData(), scc.g(new ForegroundColorSpan(i5), new PlusClickableSpan(false, new agc0(7, wlsVar2, link))));
                            } else if (item instanceof PlusPayRichText.Item.Strikethrough) {
                                b(spannableStringBuilder, s, " ", Collections.singletonList(new DiagonalStrikethroughSpan(this.h, this.f, Integer.valueOf(this.g), null, null, ((PlusPayRichText.Item.Strikethrough) item).getData(), 24, null)));
                            } else if (item instanceof PlusPayRichText.Item.Highlight) {
                                b(spannableStringBuilder, s, ((PlusPayRichText.Item.Highlight) item).getData(), Collections.singletonList(new ForegroundColorSpan(i5)));
                            } else {
                                if (!(item instanceof PlusPayRichText.Item.Text)) {
                                    w511.b();
                                    return obj;
                                }
                                b(spannableStringBuilder, s, ((PlusPayRichText.Item.Text) item).getData(), emptyList);
                            }
                        }
                    }
                    obj4 = obj;
                    i3 = 10;
                }
                return spannableStringBuilder;
            }
        }
        plusTarifficatorRichTextMapperImpl$convert$1 = new PlusTarifficatorRichTextMapperImpl$convert$1(this, continuationImpl);
        Object obj32 = plusTarifficatorRichTextMapperImpl$convert$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusTarifficatorRichTextMapperImpl$convert$1.label;
        int i32 = 10;
        Object obj42 = null;
        if (i != 0) {
        }
        Map map22 = (Map) k0;
        while (r3.hasNext()) {
        }
        return spannableStringBuilder;
    }
}
