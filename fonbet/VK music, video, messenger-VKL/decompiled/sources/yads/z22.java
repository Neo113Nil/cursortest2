package yads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class z22 {
    public static final /* synthetic */ qcy[] g = {wb.a(z22.class, "nativeAdView", "getNativeAdView()Landroid/view/View;", 0), wb.a(z22.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0), wb.a(z22.class, "muteButtonView", "getMuteButtonView()Landroid/widget/CheckBox;", 0), wb.a(z22.class, "videoProgressView", "getVideoProgressView()Landroid/widget/ProgressBar;", 0), wb.a(z22.class, "customAssets", "getCustomAssets()Ljava/util/List;", 0)};
    public final mn2 a;
    public final mn2 b;
    public final mn2 c;
    public final mn2 d;
    public final mn2 e;
    public final LinkedHashMap f;

    public z22(y22 y22Var) {
        this.a = nn2.a(y22Var.e());
        this.b = nn2.a(y22Var.c());
        this.c = nn2.a(y22Var.d());
        this.d = nn2.a(y22Var.f());
        this.e = nn2.a(y22Var.b());
        this.f = lj1.a(y22Var.a());
    }

    public final View a(String str) {
        WeakReference weakReference = (WeakReference) this.f.get(str);
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final View a() {
        mn2 mn2Var = this.a;
        qcy qcyVar = g[0];
        return (View) mn2Var.a.get();
    }
}
