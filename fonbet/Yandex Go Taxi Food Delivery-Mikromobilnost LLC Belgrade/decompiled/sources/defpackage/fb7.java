package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import kotlin.a;

/* loaded from: classes9.dex */
public final class fb7 {
    public final i3y a;

    public fb7(rqo rqoVar) {
        this.a = a.a(new zf2(rqoVar, 8));
    }

    public static void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            new File((String) it.next()).delete();
        }
    }

    public File b() {
        i3y i3yVar = this.a;
        if (((File) i3yVar.getValue()).exists() || ((File) i3yVar.getValue()).mkdirs()) {
            return new File((File) i3yVar.getValue(), UUID.randomUUID().toString());
        }
        ny61.v("Couldn't create cache directory");
        return null;
    }

    public fb7(Context context) {
        this.a = a.a(new ku2(context, 2));
    }
}
