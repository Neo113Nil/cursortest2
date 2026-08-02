package sg.bigo.ads.bj;

import android.content.Context;
import java.io.File;
import sg.bigo.ads.an.o;
import xsna.i5s;

/* loaded from: classes9.dex */
public final class d extends sg.bigo.ads.bj.a {

    public static class a {
        private static final d a = new d(0);
    }

    private d() {
        this.b = new sg.bigo.ads.az.a();
    }

    @Override // sg.bigo.ads.bj.a
    public final String a() {
        return "IconLoader";
    }

    @Override // sg.bigo.ads.bj.a
    public final int b() {
        sg.bigo.ads.az.a aVar = this.b;
        if (aVar.b == 0) {
            return Integer.MAX_VALUE;
        }
        return aVar.c;
    }

    @Override // sg.bigo.ads.bj.a
    public final String c(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(o.f(context));
        return i5s.a(sb, File.separator, str);
    }

    public /* synthetic */ d(byte b) {
        this();
    }

    @Override // sg.bigo.ads.bj.a
    public final sg.bigo.ads.an.c a(Context context, String str) {
        return c.a(context).c.get(str);
    }

    @Override // sg.bigo.ads.bj.a
    public final String b(Context context) {
        return o.f(context);
    }

    @Override // sg.bigo.ads.bj.a
    public final void a(Context context) {
        c.a(context).c.evictAll();
    }

    @Override // sg.bigo.ads.bj.a
    public final void b(Context context, String str) {
        c.a(context).c.remove(str);
    }

    @Override // sg.bigo.ads.bj.a
    public final void a(Context context, String str, sg.bigo.ads.an.c cVar) {
        c a2 = c.a(context);
        if (cVar.a.isRecycled()) {
            return;
        }
        a2.c.put(str, cVar);
        c.a.get();
        a2.b.size();
    }
}
