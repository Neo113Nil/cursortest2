package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ImageSizesParser.kt */
/* loaded from: classes2.dex */
public final class plw {
    public static final Set<ImageSizeKey> a = rl3.y0(new ImageSizeKey[]{ImageSizeKey.SIZE_O_0130, ImageSizeKey.SIZE_P_0200, ImageSizeKey.SIZE_Q_0320, ImageSizeKey.SIZE_R_0510});
    public static final int b = ImageSizeKey.SIZE_Z_1080.getHeight();
    public static final LinkedHashSet c;

    static {
        ArrayList arrayList = new ArrayList(ImageSize.j);
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            char charValue = ((Character) it.next()).charValue();
            ImageSizeKey.Companion.getClass();
            arrayList2.add(ImageSizeKey.a.b(charValue));
        }
        c = izi0.j(j5g.S0(arrayList2), a);
    }

    public static ImageList a(JSONArray jSONArray, Set set) throws VKApiException {
        ArrayList arrayList;
        if (jSONArray != null) {
            arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    Image b2 = b(jSONArray.getJSONObject(i), set);
                    if (b2 != null) {
                        arrayList.add(b2);
                    }
                } catch (JSONException e) {
                    throw new VKApiIllegalResponseException(e);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return new ImageList(arrayList);
    }

    public static Image b(JSONObject jSONObject, Set set) {
        int i;
        String optString = jSONObject.optString("url", jSONObject.optString("src", ""));
        String optString2 = jSONObject.optBoolean("is_base", false) ? "base" : jSONObject.optString("type", "");
        int optInt = jSONObject.optInt("width", 0);
        int optInt2 = jSONObject.optInt("height", 0);
        if (drm0.N(optString)) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.e, new Object[]{cq.c("Empty image url: ", jSONObject)});
            }
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException(cq.c("Empty image url, jo=", jSONObject)));
            return null;
        }
        if (drm0.N(optString2) && (optInt <= 0 || optInt2 <= 0)) {
            throw new VKApiIllegalResponseException(cq.c("Incorrect image size: ", jSONObject));
        }
        ImageSizeKey.Companion.getClass();
        char c2 = ImageSizeKey.a.c(optString2, ' ');
        ImageSizeKey b2 = ImageSizeKey.a.b(c2);
        if (j5g.P(set, ImageSizeKey.a.b(c2))) {
            return null;
        }
        if (b2 == null || (optInt > 0 && optInt2 > 0)) {
            i = optInt;
        } else if (c.contains(b2)) {
            i = b2.getWidth();
            optInt2 = b2.getHeight();
        } else {
            optInt2 = b;
            i = optInt2;
        }
        a1w a1wVar = q1w.a;
        cau0 cau0Var = (a1wVar != null ? a1wVar : null).r().h;
        o2l.a.getClass();
        if (o2l.b("__dbg_fresco_debug_overlay", false)) {
            if (optString2.equals("base")) {
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{iq.a(optInt, "parsed base url ", optString, "&cs=", "x0")});
                }
            } else {
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.d, new Object[]{"parsed NON-base url ".concat(optString)});
                }
            }
        }
        return new Image(i, optInt2, optString, optString2.equals("base"));
    }
}
