package sg.bigo.ads.bj;

import android.content.Context;
import java.io.File;
import sg.bigo.ads.an.o;
import xsna.i5s;

/* loaded from: classes9.dex */
public final class h extends sg.bigo.ads.bj.a {

    public static class a {
        private static final h a = new h(0);
    }

    private h() {
        this.b = new sg.bigo.ads.az.a();
    }

    @Override // sg.bigo.ads.bj.a
    public final String a() {
        return "ImageLoader";
    }

    @Override // sg.bigo.ads.bj.a
    public final int b() {
        return this.b.a();
    }

    @Override // sg.bigo.ads.bj.a
    public final String c(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(o.e(context));
        return i5s.a(sb, File.separator, str);
    }

    public /* synthetic */ h(byte b) {
        this();
    }

    @Override // sg.bigo.ads.bj.a
    public final sg.bigo.ads.an.c a(Context context, String str) {
        return c.a(context).b.get(str);
    }

    @Override // sg.bigo.ads.bj.a
    public final String b(Context context) {
        return o.e(context);
    }

    @Override // sg.bigo.ads.bj.a
    public final void a(Context context) {
        c.a(context).b.evictAll();
    }

    @Override // sg.bigo.ads.bj.a
    public final void b(Context context, String str) {
        c.a(context).b.remove(str);
    }

    @Override // sg.bigo.ads.bj.a
    public final void a(Context context, String str, sg.bigo.ads.an.c cVar) {
        c a2 = c.a(context);
        if (cVar.a.isRecycled()) {
            return;
        }
        a2.b.put(str, cVar);
        c.a.get();
        a2.b.size();
    }
}
