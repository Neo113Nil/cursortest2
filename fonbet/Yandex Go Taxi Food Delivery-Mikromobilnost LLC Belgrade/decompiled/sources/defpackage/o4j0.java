package defpackage;

import io.scer.pdfx.resources.RepositoryItemNotFoundException;
import java.util.HashMap;

/* loaded from: classes4.dex */
public abstract class o4j0 {
    public final HashMap a = new HashMap();

    public final Object a(String str) {
        HashMap hashMap = this.a;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str);
        }
        throw new RepositoryItemNotFoundException(str);
    }
}
