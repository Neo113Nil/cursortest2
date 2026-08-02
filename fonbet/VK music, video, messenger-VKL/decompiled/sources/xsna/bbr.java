package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.vk.core.files.a;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import xsna.r7y0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class bbr implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bbr(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6 A[Catch: Exception -> 0x00b8, TryCatch #1 {Exception -> 0x00b8, blocks: (B:20:0x0097, B:21:0x009b, B:23:0x00a1, B:25:0x00b1, B:29:0x00e4, B:30:0x00eb, B:31:0x00ba, B:33:0x00c0, B:35:0x00c7, B:37:0x00ec, B:39:0x00f6, B:41:0x0100), top: B:19:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100 A[Catch: Exception -> 0x00b8, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b8, blocks: (B:20:0x0097, B:21:0x009b, B:23:0x00a1, B:25:0x00b1, B:29:0x00e4, B:30:0x00eb, B:31:0x00ba, B:33:0x00c0, B:35:0x00c7, B:37:0x00ec, B:39:0x00f6, B:41:0x0100), top: B:19:0x0097 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.b) {
            case 0:
                List<Uri> list = (List) this.c;
                Context context = (Context) this.d;
                a.C0764a c0764a = (a.C0764a) this.e;
                Handler handler = com.vk.core.files.a.g;
                ArrayList arrayList = new ArrayList();
                try {
                    for (Uri uri : list) {
                        File d = com.vk.core.files.a.d(uri);
                        if (d.exists() && !d.delete()) {
                            throw new RuntimeException("Cannot create temp file");
                        }
                        if (!com.vk.core.files.a.c(d)) {
                            throw new RuntimeException("Cannot create temp file");
                        }
                        if (!a.b.a(context, uri, d, null)) {
                            if (list.size() != arrayList.size()) {
                                handler.post(new rm3(2, c0764a, arrayList));
                                return;
                            } else {
                                handler.post(new tsk(c0764a, 2));
                                return;
                            }
                        }
                        arrayList.add(Uri.parse("file://" + d.getAbsolutePath()));
                    }
                    if (list.size() != arrayList.size()) {
                    }
                } catch (Exception e) {
                    L.B("vk", "Error copying files from a restricted provider", e);
                    handler.post(new qyc(2, c0764a, e));
                    return;
                }
                break;
            case 1:
                r7y0 r7y0Var = (r7y0) this.c;
                String str = (String) this.d;
                r7y0.a aVar = (r7y0.a) this.e;
                try {
                    r7y0Var.a(str, aVar);
                    Preference.F(System.currentTimeMillis(), "zstd_pref", "last_download_time");
                    r7y0Var.c = r7y0.b.WAIT_FOR_NEXT_DOWNLOAD_WINDOW;
                    return;
                } catch (Throwable th) {
                    r7y0Var.c = r7y0.b.DOWNLOADING_ERROR;
                    int andIncrement = r7y0Var.e.getAndIncrement();
                    r7y0Var.f = andIncrement >= 32 ? Long.MIN_VALUE : r7y0Var.d.a(andIncrement) + System.currentTimeMillis();
                    aVar.c(r7y0Var.f);
                    L.i(new IllegalStateException("Zstd dict download error!", th));
                    return;
                }
            default:
                String str2 = (String) this.c;
                cw50 cw50Var = (cw50) this.e;
                xdz0.b(xdz0.a(str2, cw50Var.a, cw50Var.b, cw50Var.g, cw50Var.h, cw50Var.n, cw50Var.l, cw50Var.j, cw50Var.k, cw50Var.i, cw50Var.c, cw50Var.d, cw50Var.a(), (Context) this.d));
                return;
        }
    }

    public /* synthetic */ bbr(String str, cw50 cw50Var, Context context) {
        this.b = 2;
        this.c = str;
        this.e = cw50Var;
        this.d = context;
    }
}
