package xsna;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: BaseCloseableImage.java */
/* loaded from: classes12.dex */
public abstract class gb6 implements svf {
    public static final HashSet d = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "original_url", "modified_url", "image_color_space"));
    public final HashMap b = new HashMap();
    public qjw c;

    @Override // xsna.svf
    public final mjw B() {
        if (this.c == null) {
            int width = getWidth();
            int height = getHeight();
            u();
            R3();
            this.c = new qjw(width, height, this.b);
        }
        return this.c;
    }

    @Override // xsna.svf
    public cpe0 R3() {
        return gpw.d;
    }

    @Override // xsna.kuu
    public final void b(Map<String, ? extends Object> map) {
        if (map == null) {
            return;
        }
        Iterator it = d.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = map.get(str);
            if (obj != null) {
                this.b.put(str, obj);
            }
        }
    }

    @Override // xsna.svf
    public boolean c4() {
        return false;
    }

    @Override // xsna.muu, xsna.kuu
    public final Map<String, Object> getExtras() {
        return this.b;
    }

    @Override // xsna.kuu
    public final void h(Object obj, String str) {
        Boolean bool = Boolean.FALSE;
        if (d.contains("is_rounded")) {
            this.b.put("is_rounded", bool);
        }
    }
}
