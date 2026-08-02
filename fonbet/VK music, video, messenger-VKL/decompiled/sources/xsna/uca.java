package xsna;

import com.vk.toggle.b;
import com.vk.toggle.features.SaFeatures;
import kotlin.LazyThreadSafetyMode;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CatalogRedesignUtill.kt */
/* loaded from: classes17.dex */
public final class uca {
    public static final Object a;
    public static final Object b;

    static {
        pr6 pr6Var = new pr6(2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        a = msy.a(lazyThreadSafetyMode, pr6Var);
        b = msy.a(lazyThreadSafetyMode, new xu0(6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static final boolean a() {
        return ((Boolean) b.getValue()).booleanValue();
    }

    public static final boolean b() {
        b.d j;
        JSONObject g;
        JSONArray optJSONArray;
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        SaFeatures saFeatures = SaFeatures.SA_APP_VIEW_PART_RECS;
        return bVar.a(saFeatures) && ((j = bVar.j(saFeatures.getKey(), false)) == null || (g = j.g()) == null || (optJSONArray = g.optJSONArray("entrypoints_exclude")) == null || !f370.O(optJSONArray).contains("games_catalog"));
    }
}
