package defpackage;

import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import java.util.UUID;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class c2m extends o4j0 {
    public final void b(String str) {
        xwl xwlVar = (xwl) a(str);
        xwlVar.b.close();
        xwlVar.c.close();
        this.a.remove(str);
    }

    public final xwl c(Pair pair) {
        String uuid = UUID.randomUUID().toString();
        xwl xwlVar = new xwl(uuid, (PdfRenderer) pair.getSecond(), (ParcelFileDescriptor) pair.getFirst());
        this.a.put(uuid, xwlVar);
        return xwlVar;
    }
}
