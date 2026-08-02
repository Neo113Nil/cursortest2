package defpackage;

import android.content.Context;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.feature.savings.internal.entities.SavingsAccountButtonEntity$Status;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.IncomeWidgetProgressAnimationConfig;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class o8m0 implements ev31 {
    public static final int w = kp50.r(2);
    public final mdm0 a;
    public final Context b;
    public final w530 c;

    public o8m0(mdm0 mdm0Var, Context context, w530 w530Var) {
        this.a = mdm0Var;
        this.b = context;
        this.c = w530Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0524 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        Text.Constant constant;
        Text.Constant constant2;
        Text.Constant constant3;
        rr51 rr51Var;
        Text.Constant constant4;
        Text.Constant constant5;
        Text.Constant constant6;
        ArrayList arrayList;
        Iterator it;
        YbButtonViewGroup.b bVar;
        ColorModel attr;
        YbButtonView.a aVar;
        YbButtonView.a aVar2;
        ColorModel attr2;
        nbv nbvVar;
        Text.Constant constant7;
        Text.Constant constant8;
        Iterator it2;
        rr51 rr51Var2;
        Text.Constant constant9;
        Text.Constant constant10;
        boolean z;
        Text.Constant constant11;
        Object u8m0Var;
        rbv nbvVar2;
        ThemedImageUrlEntity themedImageUrlEntity;
        o8m0 o8m0Var = this;
        r7m0 r7m0Var = (r7m0) obj;
        lur0 lur0Var = r7m0Var.a;
        if (r7m0Var.h) {
            return new m8m0(r7m0Var.i, lur0Var);
        }
        x6m0 x6m0Var = r7m0Var.b;
        if (x6m0Var == null) {
            Throwable th = r7m0Var.c;
            FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
            return new l8m0(r501.a(r7m0Var.c, null, null, null, (failDataException == null || failDataException.getSupportUrl() == null) ? null : unr0.h(Text.Companion, dzh0.ybsdk_common_send_message_to_support), null, null, null, null, null, null, null, null, 65502), lur0Var);
        }
        String str = r7m0Var.d;
        boolean z2 = r7m0Var.g;
        s7m0 s7m0Var = r7m0Var.e;
        s7m0 s7m0Var2 = r7m0Var.f;
        if (s7m0Var == null) {
            s7m0Var = s7m0Var2;
        }
        String str2 = x6m0Var.h;
        MoneyEntity moneyEntity = x6m0Var.j;
        MoneyEntity moneyEntity2 = x6m0Var.e;
        Context context = o8m0Var.b;
        if (str2 == null) {
            MoneyEntity moneyEntity3 = x6m0Var.i;
            if (moneyEntity3 != null) {
                String a = w530.a(o8m0Var.c, moneyEntity3.getAmount(), moneyEntity3.getCurrency(), false, null, false, 60);
                if (a != null) {
                    str2 = context.getString(dzh0.ybsdk_savings_target_balance_text_template, a);
                }
            }
            str2 = null;
        }
        String a2 = w530.a(o8m0Var.c, moneyEntity2.getAmount(), moneyEntity2.getCurrency(), true, null, false, 56);
        CharSequence charSequence = a2;
        if (x6m0Var.g) {
            charSequence = ugb1.b(a2, rje.j(kyg0.ybsdk_savings_account_income_lock, context), w);
        }
        b bVar2 = Text.Companion;
        if (str == null) {
            str = x6m0Var.a;
        }
        Text.Constant i = g8e.i(bVar2, str);
        String str3 = x6m0Var.b;
        if (str3 != null) {
            if (x6m0Var.c != null) {
                str3 = null;
            }
            if (str3 != null) {
                constant = new Text.Constant(str3);
                rr51 rr51Var3 = x6m0Var.c;
                constant2 = str2 == null ? new Text.Constant(str2) : null;
                constant3 = new Text.Constant(charSequence);
                j8m0 j8m0Var = new j8m0(s7m0Var == null ? s7m0Var.o : new ColorModel.Attr(ung0.ybColor_textIcon_primary), s7m0Var == null ? s7m0Var.l : new ColorModel.Attr(ung0.ybColor_textIcon_primaryInverted), (s7m0Var != null || (themedImageUrlEntity = s7m0Var.d) == null) ? null : job1.b(themedImageUrlEntity, context), s7m0Var == null ? s7m0Var.c : new ColorModel.Attr(ung0.ybColor_product_savingsBgTheme1), s7m0Var == null ? s7m0Var.k : new ColorModel.Attr(ung0.ybColor_textIcon_primary), s7m0Var == null ? s7m0Var.m : new ColorModel.Attr(ung0.ybColor_fill_color7_400));
                rr51Var = rr51Var3;
                constant4 = new Text.Constant(w530.a(o8m0Var.c, moneyEntity.getAmount(), moneyEntity.getCurrency(), false, null, false, 60));
                List list = x6m0Var.m;
                constant5 = i;
                constant6 = constant;
                arrayList = new ArrayList();
                it = list.iterator();
                while (true) {
                    boolean z3 = false;
                    if (it.hasNext()) {
                        Text.Constant constant12 = constant3;
                        Text.Constant constant13 = constant6;
                        rr51 rr51Var4 = rr51Var;
                        Text.Constant constant14 = constant5;
                        Text.Constant constant15 = constant4;
                        boolean z4 = z2;
                        Text.Constant constant16 = constant2;
                        b3m0 b3m0Var = x6m0Var.l;
                        if (b3m0Var != null) {
                            a3m0 a3m0Var = b3m0Var.a;
                            b bVar3 = Text.Companion;
                            a3m0 a3m0Var2 = b3m0Var.b;
                            Text.Constant i2 = g8e.i(bVar3, a3m0Var.a);
                            String str4 = a3m0Var.d;
                            Text.Constant constant17 = str4 != null ? new Text.Constant(str4) : null;
                            ColorModel attr3 = s7m0Var != null ? s7m0Var.e : new ColorModel.Attr(ung0.ybColor_textIcon_primary);
                            if (s7m0Var == null || (attr = s7m0Var.i) == null) {
                                attr = new ColorModel.Attr(ung0.ybColor_textIcon_secondary);
                            }
                            YbButtonView.a aVar3 = new YbButtonView.a(i2, constant17, null, s7m0Var != null ? s7m0Var.j : new ColorModel.Attr(ung0.ybColor_button_invertedNormal), attr3, attr, null, false, false, null, 4036);
                            if (a3m0Var2 != null) {
                                SavingsAccountButtonEntity$Status savingsAccountButtonEntity$Status = a3m0Var2.c;
                                SavingsAccountButtonEntity$Status savingsAccountButtonEntity$Status2 = SavingsAccountButtonEntity$Status.LOCKED;
                                ColorModel attr4 = savingsAccountButtonEntity$Status == savingsAccountButtonEntity$Status2 ? new ColorModel.Attr(ung0.ybColor_button_secondaryNormal) : s7m0Var != null ? s7m0Var.j : new ColorModel.Attr(ung0.ybColor_button_invertedNormal);
                                Text.Constant constant18 = new Text.Constant(a3m0Var2.a);
                                String str5 = a3m0Var2.d;
                                Text.Constant constant19 = str5 != null ? new Text.Constant(str5) : null;
                                ColorModel attr5 = s7m0Var != null ? s7m0Var.h : new ColorModel.Attr(ung0.ybColor_textIcon_primary);
                                if (s7m0Var == null || (attr2 = s7m0Var.i) == null) {
                                    attr2 = new ColorModel.Attr(ung0.ybColor_textIcon_secondary);
                                }
                                ColorModel colorModel = attr2;
                                if (savingsAccountButtonEntity$Status == savingsAccountButtonEntity$Status2) {
                                    aVar = null;
                                    nbvVar = new nbv(txg0.ybsdk_ic_locked_outline, null);
                                } else {
                                    aVar = null;
                                    nbvVar = null;
                                }
                                aVar2 = new YbButtonView.a(constant18, constant19, nbvVar, attr4, attr5, colorModel, null, false, false, null, 4032);
                            } else {
                                aVar = null;
                                aVar2 = aVar3;
                            }
                            bVar = new YbButtonViewGroup.b(YbButtonViewGroup.Orientation.HORIZONTAL, aVar2, !aVar3.equals(aVar2) ? aVar3 : aVar, null, 8);
                        } else {
                            bVar = null;
                        }
                        bwb0 bwb0Var = lur0Var.a;
                        com.ybsdk.rconfig.b bVar4 = bwb0Var.a;
                        dfr dfrVar = wlp.a;
                        if (!((CommonFeatureFlag) bVar4.d(dfrVar).getData()).isEnabled() || (((CommonFeatureFlag) bwb0Var.a.d(dfrVar).getData()).isEnabled() && ((lur0Var instanceof iur0) || (lur0Var instanceof hur0)))) {
                            z3 = true;
                        }
                        return new k8m0(constant14, constant13, rr51Var4, constant16, constant12, j8m0Var, constant15, z4, arrayList, bVar, lur0Var, z3);
                    }
                    s9m0 s9m0Var = (s9m0) it.next();
                    if (s9m0Var instanceof i9m0) {
                        i9m0 i9m0Var = (i9m0) s9m0Var;
                        constant7 = constant3;
                        u8m0Var = new t8m0(i9m0Var.b, i9m0Var.a);
                        constant8 = constant6;
                        it2 = it;
                    } else {
                        constant7 = constant3;
                        if (s9m0Var instanceof f9m0) {
                            f9m0 f9m0Var = (f9m0) s9m0Var;
                            String str6 = f9m0Var.a;
                            String str7 = f9m0Var.c;
                            constant8 = constant6;
                            it2 = it;
                            Text.Constant i3 = g8e.i(Text.Companion, f9m0Var.b);
                            ThemedImageUrlEntity themedImageUrlEntity2 = f9m0Var.d;
                            if (themedImageUrlEntity2 == null || (nbvVar2 = job1.f(themedImageUrlEntity2, new i1m0(16))) == null) {
                                nbvVar2 = new nbv(txg0.ybsdk_ic_trash, null);
                            }
                            u8m0Var = new q8m0(str6, new YbButtonView.a(i3, null, nbvVar2, null, null, null, null, false, false, null, 4090), str7);
                        } else {
                            constant8 = constant6;
                            it2 = it;
                            if (s9m0Var instanceof p9m0) {
                                p9m0 p9m0Var = (p9m0) s9m0Var;
                                String str8 = p9m0Var.a;
                                Text.Constant i4 = g8e.i(Text.Companion, p9m0Var.b);
                                ArrayList arrayList2 = p9m0Var.c;
                                rr51Var2 = rr51Var;
                                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                                Iterator it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    o9m0 o9m0Var = (o9m0) it3.next();
                                    Iterator it4 = it3;
                                    Text.Constant i5 = g8e.i(Text.Companion, o9m0Var.a);
                                    Text.Constant constant20 = new Text.Constant(o9m0Var.b);
                                    Text.Constant constant21 = new Text.Constant(o9m0Var.c);
                                    Text.Constant constant22 = new Text.Constant(o9m0Var.d);
                                    Text.Constant constant23 = new Text.Constant(o9m0Var.e);
                                    String str9 = o9m0Var.f;
                                    Text constant24 = str9 != null ? new Text.Constant(str9) : Text.Empty.INSTANCE;
                                    String str10 = o9m0Var.g;
                                    Text constant25 = str10 != null ? new Text.Constant(str10) : Text.Empty.INSTANCE;
                                    ArrayList arrayList4 = o9m0Var.h;
                                    Text.Constant constant26 = constant5;
                                    Text.Constant constant27 = constant4;
                                    ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
                                    Iterator it5 = arrayList4.iterator();
                                    while (it5.hasNext()) {
                                        n9m0 n9m0Var = (n9m0) it5.next();
                                        arrayList5.add(new y8m0(g8e.i(Text.Companion, n9m0Var.a), new Text.Constant(n9m0Var.b)));
                                        it5 = it5;
                                        z2 = z2;
                                    }
                                    arrayList3.add(new z8m0(i5, constant20, constant21, constant22, constant23, constant24, constant25, arrayList5, o9m0Var.i, o9m0Var.j, o9m0Var.k));
                                    it3 = it4;
                                    constant5 = constant26;
                                    constant4 = constant27;
                                }
                                constant9 = constant5;
                                constant10 = constant4;
                                z = z2;
                                ndm0 ndm0Var = (ndm0) o8m0Var.a;
                                ndm0Var.getClass();
                                com.ybsdk.rconfig.b bVar5 = ndm0Var.a;
                                dfr dfrVar2 = xcm0.a;
                                u8m0Var = new b9m0(str8, i4, arrayList3, new a9m0(((IncomeWidgetProgressAnimationConfig) bVar5.d(dfrVar2).getData()).getMinDurationMs(), ((IncomeWidgetProgressAnimationConfig) bVar5.d(dfrVar2).getData()).getMaxDurationMs()));
                            } else {
                                rr51Var2 = rr51Var;
                                constant9 = constant5;
                                constant10 = constant4;
                                z = z2;
                                if (s9m0Var instanceof m9m0) {
                                    m9m0 m9m0Var = (m9m0) s9m0Var;
                                    String str11 = m9m0Var.a;
                                    Text.Constant i6 = g8e.i(Text.Companion, m9m0Var.b);
                                    String str12 = m9m0Var.c;
                                    ArrayList arrayList6 = m9m0Var.d;
                                    ArrayList arrayList7 = new ArrayList(tcc.n(arrayList6, 10));
                                    Iterator it6 = arrayList6.iterator();
                                    while (it6.hasNext()) {
                                        k9m0 k9m0Var = (k9m0) it6.next();
                                        String str13 = k9m0Var.a;
                                        Text.Constant i7 = g8e.i(Text.Companion, k9m0Var.b);
                                        Text.Constant constant28 = new Text.Constant(k9m0Var.c);
                                        Text.Constant constant29 = new Text.Constant(k9m0Var.d);
                                        Text.Constant constant30 = new Text.Constant(k9m0Var.e);
                                        Text.Constant constant31 = new Text.Constant(k9m0Var.f);
                                        ArrayList arrayList8 = k9m0Var.g;
                                        Iterator it7 = it6;
                                        ArrayList arrayList9 = new ArrayList(tcc.n(arrayList8, 10));
                                        Iterator it8 = arrayList8.iterator();
                                        while (it8.hasNext()) {
                                            l9m0 l9m0Var = (l9m0) it8.next();
                                            arrayList9.add(new w8m0(l9m0Var.a, g8e.i(Text.Companion, l9m0Var.b), new Text.Constant(l9m0Var.c), new Text.Constant(l9m0Var.d)));
                                            it8 = it8;
                                            str13 = str13;
                                        }
                                        arrayList7.add(new v8m0(str13, i7, constant28, constant29, constant30, constant31, arrayList9));
                                        it6 = it7;
                                    }
                                    u8m0Var = new x8m0(str11, i6, str12, arrayList7);
                                } else {
                                    if (s9m0Var instanceof h9m0) {
                                        h9m0 h9m0Var = (h9m0) s9m0Var;
                                        String str14 = h9m0Var.a;
                                        Text.Constant i8 = g8e.i(Text.Companion, h9m0Var.b);
                                        String str15 = h9m0Var.c;
                                        ArrayList arrayList10 = h9m0Var.d;
                                        ArrayList arrayList11 = new ArrayList(tcc.n(arrayList10, 10));
                                        Iterator it9 = arrayList10.iterator();
                                        while (it9.hasNext()) {
                                            g9m0 g9m0Var = (g9m0) it9.next();
                                            b bVar6 = Text.Companion;
                                            String str16 = g9m0Var.a;
                                            String str17 = g9m0Var.b;
                                            Text.Constant i9 = g8e.i(bVar6, str16);
                                            Text.Constant constant32 = new Text.Constant(str17);
                                            StringBuilder sb = new StringBuilder();
                                            Iterator it10 = it9;
                                            int length = str17.length();
                                            Text.Constant constant33 = constant2;
                                            int i10 = 0;
                                            while (i10 < length) {
                                                int i11 = length;
                                                char charAt = str17.charAt(i10);
                                                if (Character.isDigit(charAt)) {
                                                    sb.append(charAt);
                                                }
                                                i10++;
                                                length = i11;
                                            }
                                            arrayList11.add(new r8m0(i9, constant32, "yandexbank://deeplink/copy_text?text=".concat(sb.toString())));
                                            it9 = it10;
                                            constant2 = constant33;
                                        }
                                        constant11 = constant2;
                                        u8m0Var = new s8m0(str14, i8, str15, arrayList11);
                                    } else {
                                        constant11 = constant2;
                                        if (s9m0Var instanceof r9m0) {
                                            r9m0 r9m0Var = (r9m0) s9m0Var;
                                            String str18 = r9m0Var.a;
                                            Text.Constant i12 = g8e.i(Text.Companion, r9m0Var.b);
                                            Text.Constant constant34 = new Text.Constant(r9m0Var.d.getFormattedAmount());
                                            Text.Constant constant35 = new Text.Constant(r9m0Var.c);
                                            String str19 = r9m0Var.f;
                                            ArrayList<q9m0> arrayList12 = r9m0Var.g;
                                            ArrayList arrayList13 = new ArrayList(tcc.n(arrayList12, 10));
                                            for (q9m0 q9m0Var : arrayList12) {
                                                arrayList13.add(new c9m0(g8e.i(Text.Companion, q9m0Var.b.getFormattedAmount()), new Text.Constant(q9m0Var.a), q9m0Var.c, q9m0Var.d, s7m0Var != null ? s7m0Var.n : q9m0Var.e));
                                            }
                                            u8m0Var = new d9m0(str18, i12, constant34, constant35, str19, arrayList13);
                                        } else {
                                            if (!(s9m0Var instanceof j9m0)) {
                                                w511.b();
                                                return null;
                                            }
                                            j9m0 j9m0Var = (j9m0) s9m0Var;
                                            String str20 = j9m0Var.a;
                                            Text.Constant i13 = g8e.i(Text.Companion, j9m0Var.b);
                                            ArrayList<s5m0> arrayList14 = j9m0Var.c;
                                            ArrayList arrayList15 = new ArrayList(tcc.n(arrayList14, 10));
                                            for (s5m0 s5m0Var : arrayList14) {
                                                arrayList15.add(new u2m0(job1.f(s5m0Var.a, new i1m0(17)), g8e.i(Text.Companion, s5m0Var.b), s5m0Var.c));
                                            }
                                            u8m0Var = new u8m0(str20, i13, arrayList15);
                                        }
                                    }
                                    arrayList.add(u8m0Var);
                                    o8m0Var = this;
                                    constant3 = constant7;
                                    rr51Var = rr51Var2;
                                    constant5 = constant9;
                                    constant4 = constant10;
                                    constant2 = constant11;
                                    z2 = z;
                                    constant6 = constant8;
                                    it = it2;
                                }
                            }
                            constant11 = constant2;
                            arrayList.add(u8m0Var);
                            o8m0Var = this;
                            constant3 = constant7;
                            rr51Var = rr51Var2;
                            constant5 = constant9;
                            constant4 = constant10;
                            constant2 = constant11;
                            z2 = z;
                            constant6 = constant8;
                            it = it2;
                        }
                    }
                    rr51Var2 = rr51Var;
                    constant9 = constant5;
                    constant10 = constant4;
                    z = z2;
                    constant11 = constant2;
                    arrayList.add(u8m0Var);
                    o8m0Var = this;
                    constant3 = constant7;
                    rr51Var = rr51Var2;
                    constant5 = constant9;
                    constant4 = constant10;
                    constant2 = constant11;
                    z2 = z;
                    constant6 = constant8;
                    it = it2;
                }
            }
        }
        constant = null;
        rr51 rr51Var32 = x6m0Var.c;
        if (str2 == null) {
        }
        constant3 = new Text.Constant(charSequence);
        j8m0 j8m0Var2 = new j8m0(s7m0Var == null ? s7m0Var.o : new ColorModel.Attr(ung0.ybColor_textIcon_primary), s7m0Var == null ? s7m0Var.l : new ColorModel.Attr(ung0.ybColor_textIcon_primaryInverted), (s7m0Var != null || (themedImageUrlEntity = s7m0Var.d) == null) ? null : job1.b(themedImageUrlEntity, context), s7m0Var == null ? s7m0Var.c : new ColorModel.Attr(ung0.ybColor_product_savingsBgTheme1), s7m0Var == null ? s7m0Var.k : new ColorModel.Attr(ung0.ybColor_textIcon_primary), s7m0Var == null ? s7m0Var.m : new ColorModel.Attr(ung0.ybColor_fill_color7_400));
        rr51Var = rr51Var32;
        constant4 = new Text.Constant(w530.a(o8m0Var.c, moneyEntity.getAmount(), moneyEntity.getCurrency(), false, null, false, 60));
        List list2 = x6m0Var.m;
        constant5 = i;
        constant6 = constant;
        arrayList = new ArrayList();
        it = list2.iterator();
        while (true) {
            boolean z32 = false;
            if (it.hasNext()) {
            }
            arrayList.add(u8m0Var);
            o8m0Var = this;
            constant3 = constant7;
            rr51Var = rr51Var2;
            constant5 = constant9;
            constant4 = constant10;
            constant2 = constant11;
            z2 = z;
            constant6 = constant8;
            it = it2;
        }
    }
}
