package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.base.model.VideoVariant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* compiled from: ManifestHolder.kt */
/* loaded from: classes3.dex */
public final class dj00 {
    public final com.vk.movika.sdk.base.model.s a;
    public final Map<String, String> b;
    public final LinkedHashMap c;

    public dj00() {
        throw null;
    }

    public dj00(com.vk.movika.sdk.base.model.s sVar) {
        Pair pair;
        Object obj;
        String str;
        Object obj2;
        String str2;
        ArrayList<com.vk.movika.sdk.base.model.v> arrayList = sVar.c;
        ArrayList arrayList2 = new ArrayList();
        for (com.vk.movika.sdk.base.model.v vVar : arrayList) {
            Iterator it = vVar.c.iterator();
            while (true) {
                pair = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (((VideoVariant) obj).b == VideoVariant.Type.CUSTOM) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            VideoVariant videoVariant = (VideoVariant) obj;
            if (videoVariant != null && (str = videoVariant.i) != null) {
                String optString = new JSONObject(str).optString("id");
                String g0 = drm0.g0(optString, BundleUtil.UNDERLINE_TAG, optString);
                Iterator it2 = sVar.b.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (epx.f(((Chapter) obj2).b, vVar.a)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                Chapter chapter = (Chapter) obj2;
                if (chapter != null && (str2 = chapter.a) != null) {
                    pair = new Pair(g0, str2);
                }
            }
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        Map<String, String> s = pn00.s(arrayList2);
        List<Pair> x = rn00.x(s);
        int e = on00.e(c5g.u(x, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Pair pair2 : x) {
            Pair pair3 = new Pair(pair2.j(), pair2.i());
            linkedHashMap.put(pair3.i(), pair3.j());
        }
        this.a = sVar;
        this.b = s;
        this.c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj00)) {
            return false;
        }
        dj00 dj00Var = (dj00) obj;
        return epx.f(this.a, dj00Var.a) && epx.f(this.b, dj00Var.b) && epx.f(this.c, dj00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + v11.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ManifestHolder(manifest=" + this.a + ", videoIdToChapterId=" + this.b + ", chapterIdToVideoId=" + this.c + ')';
    }
}
