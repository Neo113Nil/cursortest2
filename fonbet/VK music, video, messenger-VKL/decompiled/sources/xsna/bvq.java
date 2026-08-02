package xsna;

import com.vk.toggle.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: FeatureSet.kt */
/* loaded from: classes11.dex */
public interface bvq {

    /* compiled from: FeatureSet.kt */
    public static final class a {
        public static HashMap a(bvq bvqVar) {
            HashMap hashMap = new HashMap();
            for (String str : bvqVar.getKeys()) {
                hashMap.put(str, new b.d(str));
            }
            return hashMap;
        }
    }

    HashMap a();

    void clear();

    List<String> getKeys();

    ArrayList getSupportedFeatures();
}
