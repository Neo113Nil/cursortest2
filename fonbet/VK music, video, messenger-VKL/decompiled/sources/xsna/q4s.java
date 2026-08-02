package xsna;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;

/* compiled from: FontAssetManager.java */
/* loaded from: classes12.dex */
public final class q4s {
    public final AssetManager d;
    public final ih50<String> a = new ih50<>();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public String e = ".ttf";

    public q4s(Drawable.Callback callback) {
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getAssets();
        } else {
            n100.b("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        }
    }
}
