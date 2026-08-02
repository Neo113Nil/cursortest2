package yads;

import android.content.Context;
import java.io.File;
import xsna.pzl;

/* loaded from: classes10.dex */
public final class vg0 {
    public static File a(Context context, String str) {
        return new File(pzl.b(context.getCacheDir().getPath(), File.separator, str));
    }
}
