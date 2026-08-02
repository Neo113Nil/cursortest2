package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.internal.ServerMessageRef;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes15.dex */
public abstract class alb1 {
    public static final void a(long j, Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            if (n8e.h(j) != Integer.MAX_VALUE) {
                return;
            }
            lxv.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (n8e.i(j) != Integer.MAX_VALUE) {
                return;
            }
            lxv.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final caz0 b(az10 az10Var, long j, long j2) {
        int j3 = az10Var.j(j, j2);
        az10Var.g(j, j2);
        return new caz0(j3);
    }

    public static String c(String str, String str2, String str3) {
        if (str == null) {
            str = null;
        } else if (str.length() > 0) {
            str = ((Object) f2a1.c(str.charAt(0))) + str.substring(1);
        }
        List g = scc.g(str, str2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : g) {
            String str4 = (String) obj;
            if (str4 != null && str4.length() != 0) {
                arrayList.add(obj);
            }
        }
        List g2 = scc.g(a.X(arrayList, " ", null, null, null, 62), t7s.a(str3));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : g2) {
            String str5 = (String) obj2;
            if (str5 != null && str5.length() != 0) {
                arrayList2.add(obj2);
            }
        }
        return a.X(arrayList2, null, null, null, null, 63);
    }

    public static final double d(double d, double d2) {
        return qpa1.d(d2) ? d : d2;
    }

    public static boolean e(double d, double d2) {
        return !qpa1.d(d(d, d2));
    }

    public static final haz0 f(az10 az10Var, long j, String str, long j2, String str2, long j3, long j4, long j5, long j6, long j7, double d, String str3, String str4, String str5, String str6, String str7, String str8, Long l, long j8, String str9, Long l2, long j9, String str10, String str11, String str12) {
        az10Var.J(new jz10(j, str, j3, j5, j4, j2, j6, j7, str2, d, str3, str4, h(str4), str5, str7, str8, l, j8, str9, l2, str6, j9, str10, str11, str12));
        int j10 = az10Var.j(j, j3);
        return (wkb1.k(j7, 1L) || j3 >= ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET) ? new faz0(j10) : new eaz0(j10);
    }

    public static final boolean g(DriveState driveState, double d, double d2) {
        return driveState == DriveState.CANCELLED && e(d, d2);
    }

    public static final Integer h(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(new JSONObject(str).getInt("type"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final yab i(az10 az10Var, Moshi moshi, long j, long j2) {
        return new yab(az10Var.X(j, j2), moshi, 0L);
    }

    public static final jaz0 j(az10 az10Var, long j, long j2, String str) {
        if (az10Var.e0(j2, str, h(str)) == 0) {
            return null;
        }
        return new jaz0(az10Var.l(j, j2));
    }

    public static final jaz0 k(az10 az10Var, long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6) {
        if (az10Var.j0(j, j2, j3, str, str2, str3, str4, str5, str6) < 1) {
            return null;
        }
        return new jaz0(az10Var.j(j, j2));
    }
}
