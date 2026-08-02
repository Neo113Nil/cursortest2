package yads;

import android.content.Context;
import androidx.core.content.FileProvider;
import java.io.File;
import xsna.emb;
import xsna.nbr;

/* loaded from: classes10.dex */
public final class e71 {
    public final Context a;
    public final y61 b;

    public e71(Context context, y61 y61Var) {
        this.a = context;
        this.b = y61Var;
    }

    public final d71 a(String str) {
        try {
            File a = this.b.a();
            File parentFile = a.getParentFile();
            long freeSpace = parentFile != null ? parentFile.getFreeSpace() : 0L;
            byte[] bytes = str.getBytes(emb.b);
            if (bytes.length >= freeSpace) {
                return new a71("Not enough space error");
            }
            nbr.v(a, bytes);
            return new c71(FileProvider.getUriForFile(this.a, this.a.getPackageName() + ".monetization.ads.inspector.fileprovider", a));
        } catch (Exception unused) {
            return new a71("Failed to save report");
        }
    }
}
