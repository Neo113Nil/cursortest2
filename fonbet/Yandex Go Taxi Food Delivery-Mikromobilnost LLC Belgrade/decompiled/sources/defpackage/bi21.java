package defpackage;

import java.util.HashMap;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;

/* loaded from: classes15.dex */
public class bi21 {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("^(((([1]?\\d)?\\d|2[0-4]\\d|25[0-5])\\.){3}(([1]?\\d)?\\d|2[0-4]\\d|25[0-5]))|([\\da-fA-F]{1,4}(\\:[\\da-fA-F]{1,4}){7})|(([\\da-fA-F]{1,4}:){0,5}::([\\da-fA-F]{1,4}:){0,5}[\\da-fA-F]{1,4})$", 2);
        HashMap hashMap = new HashMap();
        hashMap.put("RU", ClearCryptoProPrefs.COUNTRY);
        hashMap.put("TR", "com.tr");
        hashMap.put("BY", "by");
        hashMap.put("KZ", "kz");
        hashMap.put("UA", "ua");
        hashMap.put("UZ", "uz");
    }
}
