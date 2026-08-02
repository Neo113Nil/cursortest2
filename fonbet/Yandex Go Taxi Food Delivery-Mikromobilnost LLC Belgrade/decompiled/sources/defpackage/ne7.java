package defpackage;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class ne7 implements me7 {
    public final o631 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public ne7(o631 o631Var) {
        this.a = o631Var;
    }

    @Override // defpackage.me7
    public final void a(String str, String str2) {
        b(str, str2);
    }

    public final void b(String str, String str2) {
        Long l = (Long) this.b.get(str2);
        if (l != null) {
            this.a.c(System.currentTimeMillis() - l.longValue(), String.format("FlexDocumentCachePartApply.%s", Arrays.copyOf(new Object[]{str}, 1)));
        }
    }

    @Override // defpackage.me7
    public final void d(String str, String str2) {
        this.b.put(str2, Long.valueOf(System.currentTimeMillis()));
    }
}
