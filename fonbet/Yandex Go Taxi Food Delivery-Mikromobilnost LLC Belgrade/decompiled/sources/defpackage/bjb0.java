package defpackage;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashSet;

/* loaded from: classes12.dex */
public final class bjb0 {
    public final Context a;
    public final LinkedHashSet b = new LinkedHashSet();

    public bjb0(Context context) {
        this.a = context;
    }

    public final File a(int i) {
        String j = oyr.j(i, "pickup_photo", ".jpg");
        File file = new File(this.a.getCacheDir(), "pickup_from_photo");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, j);
        this.b.add(j);
        if (!file2.exists()) {
            file2.createNewFile();
        }
        return file2;
    }
}
