package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class ao61 {
    public static final /* synthetic */ kgx[] g = {qha1.a(ao61.class, "nativeAdView", "getNativeAdView()Landroid/view/View;"), qha1.a(ao61.class, "imageView", "getImageView()Landroid/widget/ImageView;"), qha1.a(ao61.class, "muteButtonView", "getMuteButtonView()Landroid/widget/CheckBox;"), qha1.a(ao61.class, "videoProgressView", "getVideoProgressView()Landroid/widget/ProgressBar;"), qha1.a(ao61.class, "customAssets", "getCustomAssets()Ljava/util/List;")};
    public final r581 a;
    public final r581 b = new r581(null);
    public final r581 c;
    public final r581 d;
    public final r581 e;
    public final LinkedHashMap f;

    public ao61(pk61 pk61Var) {
        this.a = new r581(pk61Var.a);
        this.c = new r581(pk61Var.b);
        this.d = new r581(pk61Var.c);
        this.e = new r581(pk61Var.e);
        LinkedHashMap linkedHashMap = pk61Var.d;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(gw00.d(linkedHashMap2.size()));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry2.getKey(), new WeakReference(entry2.getValue()));
        }
        this.f = linkedHashMap3;
    }

    public final View a() {
        kgx kgxVar = g[0];
        return (View) this.a.a.get();
    }

    public final View b(String str) {
        WeakReference weakReference = (WeakReference) this.f.get(str);
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }
}
