package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.fintechsdk.adapters.divkit.sdk.impl.internal.glowingborder.GlowingBorderDrawable;
import com.yandex.go.flex.main_screen.presentation.divkit.azimuth.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class gkt implements dpk {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gkt(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        List extensions;
        Object obj;
        JSONObject jSONObject;
        Object obj2;
        int i = this.a;
        Object obj3 = this.b;
        r0 = null;
        JSONObject jSONObject2 = null;
        switch (i) {
            case 0:
                Context context = (Context) obj3;
                if (matches(egkVar) && (extensions = egkVar.getExtensions()) != null) {
                    Iterator it = extensions.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (jl40.l(((bpk) obj).a, "glowingBorder")) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    bpk bpkVar = (bpk) obj;
                    if (bpkVar != null && (jSONObject = bpkVar.b) != null) {
                        long optLong = jSONObject.optLong("duration");
                        float optDouble = ((float) jSONObject.optDouble("stroke_width")) * context.getResources().getDisplayMetrics().density;
                        float optInt = jSONObject.optInt("corner_radius") * context.getResources().getDisplayMetrics().density;
                        JSONObject optJSONObject = jSONObject.optJSONObject("gradient_colors");
                        JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("light") : null;
                        JSONArray optJSONArray2 = jSONObject.optJSONArray("phase_bezier");
                        ArrayList arrayList = new ArrayList();
                        if (optJSONArray != null) {
                            int length = optJSONArray.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                arrayList.add(Integer.valueOf(Color.parseColor(optJSONArray.getString(i2))));
                            }
                        }
                        int[] I0 = a.I0(arrayList);
                        ArrayList arrayList2 = new ArrayList();
                        if (optJSONArray2 != null) {
                            int length2 = optJSONArray2.length();
                            for (int i3 = 0; i3 < length2; i3++) {
                                arrayList2.add(Float.valueOf((float) optJSONArray2.getDouble(i3)));
                            }
                        }
                        ((View) view.getParent()).setForeground(new GlowingBorderDrawable(optDouble, optLong, optInt, I0, a.G0(arrayList2)));
                        break;
                    }
                }
                break;
            default:
                List extensions2 = egkVar.getExtensions();
                if (extensions2 != null) {
                    Iterator it2 = extensions2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (jl40.l(((bpk) obj2).a, "superapp_azimuth_rotation")) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    bpk bpkVar2 = (bpk) obj2;
                    if (bpkVar2 != null) {
                        jSONObject2 = bpkVar2.b;
                    }
                }
                ((e) obj3).a(jSONObject2 != null ? (float) jSONObject2.optDouble("rotation_compensation", 0.0d) : 0.0f, view);
                break;
        }
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        switch (this.a) {
            case 0:
                List extensions = egkVar.getExtensions();
                if (extensions != null) {
                    List list = extensions;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (jl40.l(((bpk) it.next()).a, "glowingBorder")) {
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                List extensions2 = egkVar.getExtensions();
                if (extensions2 != null) {
                    List list2 = extensions2;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (jl40.l(((bpk) it2.next()).a, "superapp_azimuth_rotation")) {
                                break;
                            }
                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                l8x l8xVar = (l8x) ((e) this.b).e.remove(view);
                if (l8xVar != null) {
                    l8xVar.a(null);
                }
                view.setRotation(0.0f);
                break;
        }
    }
}
