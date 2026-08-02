package xsna;

import android.content.Context;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import com.vk.auth.enterphone.choosecountry.Country;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.text.Regex;

/* compiled from: CountriesHelper.kt */
/* loaded from: classes.dex */
public final class uyj {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static List a(Context context, String str) {
        LinkedHashMap linkedHashMap = a;
        List list = (List) linkedHashMap.get(str);
        if (list != null) {
            return list;
        }
        try {
            InputStream open = context.getAssets().open("countries_" + str + ".txt");
            ArrayList arrayList = new ArrayList();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open), 8192);
            try {
                Iterator it = new t5j(new p8z(bufferedReader)).iterator();
                while (it.hasNext()) {
                    String[] strArr = (String[]) new Regex(StringUtils.COMMA).j(4, (String) it.next()).toArray(new String[0]);
                    arrayList.add(new Country(Integer.parseInt(strArr[1]), strArr[0], strArr[2], strArr[3]));
                }
                s3q0 s3q0Var = s3q0.a;
                bufferedReader.close();
                if (arrayList.isEmpty()) {
                    throw new Exception("List should not be empty");
                }
                linkedHashMap.put(str, arrayList);
                return arrayList;
            } finally {
            }
        } catch (Throwable unused) {
            return !epx.f(str, "en") ? a(context, "en") : Collections.EMPTY_LIST;
        }
    }

    public static Country b(Context context, List list) {
        Object obj;
        Object obj2;
        String upperCase = ((TelephonyManager) context.getSystemService("phone")).getSimCountryIso().toUpperCase(Locale.ROOT);
        if (upperCase.length() != 2) {
            upperCase = Locale.getDefault().getCountry();
        }
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (epx.f(((Country) obj2).d(), upperCase)) {
                break;
            }
        }
        Country country = (Country) obj2;
        if (country != null) {
            return country;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (epx.f(((Country) next).d(), "RU")) {
                obj = next;
                break;
            }
        }
        Country country2 = (Country) obj;
        if (country2 != null) {
            return country2;
        }
        Parcelable.Creator<Country> creator = Country.CREATOR;
        return Country.b.a();
    }
}
