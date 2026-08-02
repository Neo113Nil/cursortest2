package xsna;

import android.os.Build;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: DeviceQuirks.java */
/* loaded from: classes11.dex */
public final class n6m {

    @NonNull
    public static final sse0 a;

    static {
        ArrayList arrayList = new ArrayList();
        String str = Build.MANUFACTURER;
        if (("Google".equals(str) && "Pixel 2".equals(Build.MODEL)) || ("Google".equals(str) && "Pixel 3".equals(Build.MODEL))) {
            arrayList.add(new bhw());
        }
        List<String> list = r0h0.a;
        String str2 = Build.BRAND;
        if ("SAMSUNG".equals(str2.toUpperCase()) && r0h0.a.contains(Build.MODEL.toUpperCase())) {
            arrayList.add(new r0h0());
        }
        List<String> list2 = x170.a;
        "GOOGLE".equals(str2.toUpperCase());
        if (("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) || ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE))) {
            arrayList.add(new v2q());
        }
        if ("SAMSUNG".equals(str.toUpperCase()) && Build.MODEL.toUpperCase().startsWith("SM-A300")) {
            arrayList.add(new i4k());
        }
        ArrayList arrayList2 = y4d0.a;
        if ("Google".equals(str) && y4d0.a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()))) {
            arrayList.add(new y4d0());
        }
        Locale locale = Locale.US;
        if ("SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716")) {
            arrayList.add(new ufl0());
        }
        a = new sse0(arrayList);
    }
}
