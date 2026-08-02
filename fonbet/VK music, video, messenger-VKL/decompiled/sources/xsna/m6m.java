package xsna;

import android.os.Build;
import androidx.annotation.NonNull;
import com.huawei.hms.android.SystemUtils;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: DeviceQuirks.java */
/* loaded from: classes11.dex */
public final class m6m {

    @NonNull
    public static final sse0 a;

    static {
        ArrayList arrayList = new ArrayList();
        if (btw.a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()))) {
            arrayList.add(new btw());
        }
        String str = Build.BRAND;
        if ((SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || (SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(str) && "STK-LX1".equalsIgnoreCase(Build.MODEL))) {
            arrayList.add(new chw());
        }
        a = new sse0(arrayList);
    }
}
