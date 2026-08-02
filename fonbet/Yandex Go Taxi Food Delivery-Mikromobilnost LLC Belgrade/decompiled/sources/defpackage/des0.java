package defpackage;

import com.ybsdk.core.utils.date.YbDateFormat;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.rconfig.SimpleIdValidation;
import com.ybsdk.screens.upgrade.domain.entities.SimpleIdFormFieldEntity;
import com.ybsdk.screens.upgrade.domain.entities.UpgradeFormEntity$SecondDocumentType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.collections.a;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class des0 {
    public static final List g = scc.g(7, 2, 4, 10, 3, 5, 9, 4, 6, 8);
    public static final List h = scc.g(3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8);
    public static final List i = scc.g(9, 8, 7, 6, 5, 4, 3, 2, 1);
    public static final List j = scc.g(100, 101);
    public final SimpleIdValidation a;
    public final na21 b;
    public final Regex c;
    public final Regex d;
    public final Regex e;
    public final Regex f;

    public des0(SimpleIdValidation simpleIdValidation, na21 na21Var) {
        this.a = simpleIdValidation;
        this.b = na21Var;
        this.c = new Regex(simpleIdValidation.getPassportNumberRegex());
        this.d = new Regex(simpleIdValidation.getNameRegex());
        this.e = new Regex(simpleIdValidation.getLastnameRegex());
        this.f = new Regex(simpleIdValidation.getMiddleNameRegex());
    }

    public static boolean b(String str) {
        int length = gtu0.a.j(str, "").length();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < str.length(); i2++) {
            Integer e = sza.e(str.charAt(i2));
            if (e != null) {
                arrayList.add(e);
            }
        }
        if (arrayList.size() != length || arrayList.size() != 12) {
            arrayList = null;
        }
        if (arrayList != null) {
            return ycb1.e(arrayList);
        }
        return false;
    }

    public static boolean c(String str) {
        int length = gtu0.a.j(str, "").length();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < str.length(); i2++) {
            Integer e = sza.e(str.charAt(i2));
            if (e != null) {
                arrayList.add(e);
            }
        }
        if (arrayList.size() != length || arrayList.size() != 11) {
            arrayList = null;
        }
        if (arrayList != null) {
            return f(arrayList);
        }
        return false;
    }

    public static boolean f(ArrayList arrayList) {
        int intValue = ((Number) a.Z(arrayList)).intValue() + (((Number) arrayList.get(scc.f(arrayList) - 1)).intValue() * 10);
        List list = i;
        Iterator it = arrayList.iterator();
        Iterator it2 = list.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(tcc.n(arrayList, 10), tcc.n(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((Number) it.next()).intValue() * ((Number) it2.next()).intValue()));
        }
        int z0 = a.z0(arrayList2);
        while (z0 > 101) {
            z0 %= 101;
        }
        if (j.contains(Integer.valueOf(z0))) {
            z0 = 0;
        }
        return intValue == z0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String a(SimpleIdFormFieldEntity simpleIdFormFieldEntity, String str) {
        SimpleIdValidation simpleIdValidation = this.a;
        if (simpleIdValidation.getAutocorrectEnabled()) {
            switch (ces0.a[simpleIdFormFieldEntity.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    String preCapitalizedDelimiters = simpleIdValidation.getPreCapitalizedDelimiters();
                    String j2 = gtu0.a.j(str, " ");
                    char[] charArray = simpleIdValidation.getPreCapitalizedDelimiters().toCharArray();
                    String lowerCase = evu0.l0(j2, Arrays.copyOf(charArray, charArray.length)).toLowerCase(Locale.ROOT);
                    if (lowerCase.length() > 0) {
                        lowerCase = Character.toUpperCase(lowerCase.charAt(0)) + lowerCase.substring(1);
                    }
                    for (int i2 = 0; i2 < preCapitalizedDelimiters.length(); i2++) {
                        final char charAt = preCapitalizedDelimiters.charAt(i2);
                        lowerCase = new Regex(Pattern.quote(String.valueOf(charAt)).concat("(.)(.*)")).i(lowerCase, new tls() { // from class: yds0
                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                w610 w610Var = (w610) obj;
                                String str2 = (String) ((u1l) w610Var.a()).get(1);
                                Locale locale = Locale.ROOT;
                                return (charAt + str2.toUpperCase(locale)).concat(((String) a.Z(w610Var.a())).toLowerCase(locale));
                            }
                        });
                    }
                    return lowerCase;
                case 4:
                    break;
                case 5:
                    String j3 = gtu0.a.j(str, "");
                    return evu0.k0(gvu0.A0(4, j3) + " " + gvu0.r0(4, j3)).toString();
                case 6:
                    if (c(str) && ((ja21) this.b.a.getValue()).h != UpgradeFormEntity$SecondDocumentType.INN) {
                        return evu0.k0(a.X(gvu0.q0(3, gtu0.a.j(str, "")), " ", null, null, null, 62)).toString();
                    }
                    break;
                default:
                    w511.b();
                    return null;
            }
        }
        return str;
    }

    public final bes0 d(String str) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        int i2 = calendar.get(1);
        SimpleIdValidation simpleIdValidation = this.a;
        calendar2.set(1, i2 - simpleIdValidation.getMinAge());
        Date time = calendar2.getTime();
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(1, calendar.get(1) - simpleIdValidation.getMaxAge());
        Date time2 = calendar3.getTime();
        Date b = vqg.b(str, YbDateFormat.SHORT_USER_DATE_ONLY);
        return (b == null || b.before(time2) || b.after(calendar.getTime())) ? new zds0(unr0.h(Text.Companion, dzh0.ybsdk_uprid_notValid_error_title)) : b.after(time) ? new zds0(new Text.Plural(gwh0.ybsdk_uprid_birthdate_tip_title, simpleIdValidation.getMinAge())) : aes0.a;
    }

    public final bes0 e(SimpleIdFormFieldEntity simpleIdFormFieldEntity, String str) {
        if (this.a.getValidationEnabled()) {
            switch (ces0.a[simpleIdFormFieldEntity.ordinal()]) {
                case 1:
                    if (!this.d.h(str)) {
                        return new zds0(unr0.h(Text.Companion, dzh0.ybsdk_uprid_notValid_error_title));
                    }
                    break;
                case 2:
                    if (!this.e.h(str)) {
                        return new zds0(unr0.h(Text.Companion, dzh0.ybsdk_uprid_notValid_error_title));
                    }
                    break;
                case 3:
                    if (!this.f.h(str)) {
                        return new zds0(unr0.h(Text.Companion, dzh0.ybsdk_uprid_notValid_error_title));
                    }
                    break;
                case 4:
                    return d(str);
                case 5:
                    if (!this.c.h(gtu0.a.j(str, ""))) {
                        return new zds0(unr0.h(Text.Companion, dzh0.ybsdk_uprid_notValid_error_title));
                    }
                    break;
                case 6:
                    int length = gtu0.a.j(str, "").length();
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < str.length(); i2++) {
                        Integer e = sza.e(str.charAt(i2));
                        if (e != null) {
                            arrayList.add(e);
                        }
                    }
                    if (arrayList.size() != length) {
                        arrayList = null;
                    }
                    Integer valueOf = arrayList != null ? Integer.valueOf(arrayList.size()) : null;
                    na21 na21Var = this.b;
                    if (valueOf != null && valueOf.intValue() == 12) {
                        if (((ja21) na21Var.a.getValue()).h == UpgradeFormEntity$SecondDocumentType.SNILS) {
                            return new zds0(null);
                        }
                        if (!ycb1.e(arrayList)) {
                            return new zds0(unr0.h(Text.Companion, dzh0.ybsdk_uprid_notValid_error_title));
                        }
                    } else {
                        if (valueOf == null || valueOf.intValue() != 11) {
                            return new zds0(null);
                        }
                        if (((ja21) na21Var.a.getValue()).h == UpgradeFormEntity$SecondDocumentType.INN) {
                            return new zds0(null);
                        }
                        if ((((Number) arrayList.get(0)).intValue() != 0 || ((Number) arrayList.get(1)).intValue() != 0 || ((Number) arrayList.get(2)).intValue() != 1 || ((Number) arrayList.get(3)).intValue() != 0 || ((Number) arrayList.get(4)).intValue() != 0 || ((Number) arrayList.get(5)).intValue() != 1 || ((Number) arrayList.get(6)).intValue() != 9 || ((Number) arrayList.get(7)).intValue() != 9 || ((Number) arrayList.get(8)).intValue() == 9) && !f(arrayList)) {
                            return new zds0(unr0.h(Text.Companion, dzh0.ybsdk_uprid_notValid_error_title));
                        }
                    }
                    break;
                default:
                    w511.b();
                    return null;
            }
        }
        return aes0.a;
    }
}
