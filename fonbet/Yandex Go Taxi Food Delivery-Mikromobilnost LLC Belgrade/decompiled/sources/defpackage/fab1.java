package defpackage;

import com.ybsdk.core.common.domain.entities.BottomBarIcon;
import com.ybsdk.core.common.domain.entities.BottomBarItemId;
import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public abstract class fab1 {
    public static boolean a(m0r0 m0r0Var, int... iArr) {
        if (m0r0Var == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return m0r0Var.j().containsAll(arrayList);
    }

    public static final JSONArray b(JSONArray jSONArray, pjn pjnVar) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.optJSONObject(i));
        }
        xcc.q(arrayList, pjnVar);
        return new JSONArray((Collection) arrayList);
    }

    public static final rb6 c(List list, BottomBarItemId bottomBarItemId) {
        sh6 sh6Var;
        List<pb6> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (pb6 pb6Var : list2) {
            BottomBarItemId bottomBarItemId2 = pb6Var.a;
            String str = pb6Var.d;
            if (str != null) {
                switch (mb6.a[bottomBarItemId2.ordinal()]) {
                    case 1:
                        sh6Var = new ph6(str);
                        break;
                    case 2:
                        sh6Var = new mh6(str);
                        break;
                    case 3:
                        sh6Var = new lh6(str);
                        break;
                    case 4:
                        sh6Var = new nh6(str);
                        break;
                    case 5:
                        sh6Var = new qh6(str);
                        break;
                    case 6:
                        sh6Var = new rh6(str);
                        break;
                    default:
                        w511.b();
                        return null;
                }
            } else {
                sh6Var = oh6.a;
            }
            sh6 sh6Var2 = sh6Var;
            String format = mb6.a[bottomBarItemId2.ordinal()] == 1 ? "qr_payment_tabbar_item_view_identifier" : String.format("tabbar_%s_view_id", Arrays.copyOf(new Object[]{bottomBarItemId2.getId()}, 1));
            String id = bottomBarItemId2.getId();
            Text text = pb6Var.b;
            BottomBarIcon bottomBarIcon = pb6Var.c;
            arrayList.add(new tb6(id, text, bottomBarIcon != null ? Integer.valueOf(bottomBarIcon.getIconResId()) : null, bottomBarItemId2 == bottomBarItemId, sh6Var2, format));
        }
        return new rb6(arrayList);
    }
}
