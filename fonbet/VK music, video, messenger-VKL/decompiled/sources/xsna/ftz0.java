package xsna;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class ftz0 {
    public final t801 a;

    public ftz0(t801 t801Var) {
        this.a = t801Var;
    }

    public final synchronized void a(Context context, HashSet hashSet) {
        AssetManager assets = context.getAssets();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Integer) f370.S(assets, "addAssetPath", Integer.class, String.class, ((File) it.next()).getPath())).intValue();
        }
    }
}
