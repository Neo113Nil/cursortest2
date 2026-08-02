package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.DisplayCutout;
import android.view.ViewGroup;
import androidx.core.app.b;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class bi91 {
    public static final String[] a = {"🏳️", "🏴️", "🏁️", "🚩️", "🏳️\u200d🌈️", "🇦🇫️", "🇦🇽️", "🇦🇱️", "🇩🇿️", "🇦🇸️", "🇦🇩️", "🇦🇴️", "🇦🇮️", "🇦🇶️", "🇦🇬️", "🇦🇷️", "🇦🇲️", "🇦🇼️", "🇦🇺️", "🇦🇹️", "🇦🇿️", "🇧🇸️", "🇧🇭️", "🇧🇩️", "🇧🇧️", "🇧🇾️", "🇧🇪️", "🇧🇿️", "🇧🇯️", "🇧🇲️", "🇧🇹️", "🇧🇴️", "🇧🇦️", "🇧🇼️", "🇧🇷️", "🇮🇴️", "🇻🇬️", "🇧🇳️", "🇧🇬️", "🇧🇫️", "🇧🇮️", "🇨🇻️", "🇰🇭️", "🇨🇲️", "🇨🇦️", "🇮🇨️", "🇰🇾️", "🇨🇫️", "🇹🇩️", "🇨🇱️", "🇨🇳️", "🇨🇽️", "🇨🇨️", "🇨🇴️", "🇰🇲️", "🇨🇬️", "🇨🇩️", "🇨🇰️", "🇨🇷️", "🇨🇮️", "🇭🇷️", "🇨🇺️", "🇨🇼️", "🇨🇾️", "🇨🇿️", "🇩🇰️", "🇩🇯️", "🇩🇲️", "🇩🇴️", "🇪🇨️", "🇪🇬️", "🇸🇻️", "🇬🇶️", "🇪🇷️", "🇪🇪️", "🇪🇹️", "🇪🇺️", "🇫🇴️", "🇫🇯️", "🇫🇮️", "🇫🇷️", "🇵🇫️", "🇬🇦️", "🇬🇲️", "🇬🇪️", "🇩🇪️", "🇬🇭️", "🇬🇮️", "🇬🇷️", "🇬🇱️", "🇬🇩️", "🇬🇺️", "🇬🇹️", "🇬🇬️", "🇬🇳️", "🇬🇼️", "🇬🇾️", "🇭🇹️", "🇭🇳️", "🇭🇰️", "🇭🇺️", "🇮🇸️", "🇮🇳️", "🇮🇩️", "🇮🇷️", "🇮🇶️", "🇮🇪️", "🇮🇲️", "🇮🇱️", "🇮🇹️", "🇯🇲️", "🇯🇵️", "🎌️", "🇯🇪️", "🇯🇴️", "🇰🇿️", "🇰🇪️", "🇰🇮️", "🇰🇼️", "🇰🇬️", "🇱🇦️", "🇱🇻️", "🇱🇧️", "🇱🇸️", "🇱🇷️", "🇱🇾️", "🇱🇮️", "🇱🇹️", "🇱🇺️", "🇲🇴️", "🇲🇰️", "🇲🇬️", "🇲🇼️", "🇲🇾️", "🇲🇻️", "🇲🇱️", "🇲🇹️", "🇲🇭️", "🇲🇷️", "🇲🇺️", "🇲🇽️", "🇫🇲️", "🇲🇩️", "🇲🇨️", "🇲🇳️", "🇲🇪️", "🇲🇸️", "🇲🇦️", "🇲🇿️", "🇲🇲️", "🇳🇦️", "🇳🇷️", "🇳🇵️", "🇳🇱️", "🇳🇿️", "🇳🇮️", "🇳🇪️", "🇳🇬️", "🇳🇺️", "🇳🇫️", "🇲🇵️", "🇰🇵️", "🇳🇴️", "🇴🇲️", "🇵🇰️", "🇵🇼️", "🇵🇸️", "🇵🇦️", "🇵🇬️", "🇵🇾️", "🇵🇪️", "🇵🇭️", "🇵🇳️", "🇵🇱️", "🇵🇹️", "🇵🇷️", "🇶🇦️", "🇷🇴️", "🇷🇺️", "🇷🇼️", "🇸🇭️", "🇰🇳️", "🇱🇨️", "🇻🇨️", "🇼🇸️", "🇸🇲️", "🇸🇹️", "🇸🇦️", "🇸🇳️", "🇷🇸️", "🇸🇨️", "🇸🇱️", "🇸🇬️", "🇸🇽️", "🇸🇰️", "🇸🇮️", "🇸🇧️", "🇸🇴️", "🇿🇦️", "🇰🇷️", "🇸🇸️", "🇪🇸️", "🇱🇰️", "🇸🇩️", "🇸🇷️", "🇸🇿️", "🇸🇪️", "🇨🇭️", "🇸🇾️", "🇹🇼️", "🇹🇯️", "🇹🇿️", "🇹🇭️", "🇹🇱️", "🇹🇬️", "🇹🇰️", "🇹🇴️", "🇹🇹️", "🇹🇳️", "🇹🇷️", "🇹🇲️", "🇹🇨️", "🇹🇻️", "🇺🇦️", "🇦🇪️", "🇬🇧️", "🇺🇸️", "🇻🇮️", "🇺🇾️", "🇺🇿️", "🇻🇺️", "🇻🇦️", "🇻🇪️", "🇻🇳️", "🇾🇪️", "🇿🇲️", "🇿🇼️", "🇦🇨️", "🇧🇻️", "🇨🇵️", "🇭🇲️", "🇸🇯️", "🇹🇦️", "🇺🇲"};

    public static List a(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static int b(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int c(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static boolean f(Context context) {
        return qke.h(context, "android.permission.READ_CONTACTS") == 0;
    }

    public static boolean g(Activity activity, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (b.M(activity, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final ryh h(ViewGroup viewGroup) {
        return new ryh(viewGroup);
    }
}
