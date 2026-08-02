package xsna;

import com.vk.dto.menu.SideMenuItems;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SideMenuSections.kt */
/* loaded from: classes.dex */
public final class dlj0 implements bxx {
    public final List<SideMenuItems> b;

    public dlj0() {
        this(0);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (SideMenuItems sideMenuItems : this.b) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("items", kvf.a(sideMenuItems));
            jSONArray.put(jSONObject2);
        }
        s3q0 s3q0Var = s3q0.a;
        jSONObject.put("sections", jSONArray);
        return jSONObject;
    }

    public dlj0(List<SideMenuItems> list) {
        this.b = list;
    }

    public dlj0(int i) {
        this(EmptyList.b);
    }
}
