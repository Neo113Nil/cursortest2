package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

/* loaded from: classes6.dex */
public final class o7h {
    public static final ywl e = new ywl(new dzp0(new czp0(false, new bzp0(null)), EmptyList.a, null, null, null, null), null, cnr0.b, new uwl(null, null, null, null, null, null), null, null);
    public final Context a;
    public final d0m b;
    public final int c;
    public ywl d;

    public o7h(Context context, d0m d0mVar, int i) {
        this.a = context;
        this.b = d0mVar;
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ywl a() {
        ywl ywlVar;
        InputStream openInputStream;
        ywl ywlVar2 = this.d;
        if (ywlVar2 != null) {
            return ywlVar2;
        }
        l2m l2mVar = new l2m(this.b, (uyg) null);
        Context context = this.a;
        Uri build = new Uri.Builder().scheme("android.resource").authority(context.getPackageName()).appendPath("raw").appendPath(context.getResources().getResourceEntryName(this.c)).build();
        k2m b = l2mVar.b(new u1m(6, build.toString(), (Map) null), null, null);
        try {
            openInputStream = context.getContentResolver().openInputStream(build);
        } catch (Exception e2) {
            hst hstVar = jst.e;
            ke00 a = hstVar.b.a();
            if (a != null && a.b(15)) {
                a.a(15, "DefaultCachingRawDocumentLoader", e2, unr0.n(build, "Error processing resource: "), hstVar.a);
            }
        }
        if (openInputStream == null) {
            hst hstVar2 = jst.e;
            ke00 a2 = hstVar2.b.a();
            if (a2 != null && a2.b(15)) {
                a2.a(15, "DefaultCachingRawDocumentLoader", null, "Couldn't open resource: " + build, hstVar2.a);
            }
            ywlVar = null;
            if (ywlVar != null) {
                return null;
            }
            this.d = ywlVar;
            return ywlVar;
        }
        try {
            kg90 kg90Var = (kg90) b.a(b.f(), openInputStream);
            if (kg90Var instanceof jg90) {
                ywlVar = ((h2m) ((jg90) kg90Var).a).a;
            } else {
                if (!(kg90Var instanceof ig90)) {
                    throw new NoWhenBranchMatchedException();
                }
                hst hstVar3 = jst.e;
                Throwable th = ((ig90) kg90Var).a;
                ke00 a3 = hstVar3.b.a();
                if (a3 != null && a3.b(15)) {
                    a3.a(15, "DefaultCachingRawDocumentLoader", th, "Couldn't parse resource: " + build, hstVar3.a);
                }
                ywlVar = null;
            }
            openInputStream.close();
            if (ywlVar != null) {
            }
        } finally {
        }
    }
}
