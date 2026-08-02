package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class kg10 implements gog {
    public static final String[] w = {"_data"};
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ kg10(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    @Override // defpackage.gog
    public final Class a() {
        switch (this.a) {
            case 0:
                return File.class;
            case 1:
                return ((i67) this.c).a();
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.gog
    public final void b(Priority priority, fog fogVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Cursor query = ((Context) obj).getContentResolver().query((Uri) this.c, w, null, null, null);
                if (query != null) {
                    try {
                        r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                        query.close();
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                if (!TextUtils.isEmpty(r0)) {
                    fogVar.d(new File(r0));
                    return;
                }
                fogVar.e(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.c)));
                return;
            case 1:
                fogVar.d(((i67) this.c).k((byte[]) obj));
                return;
            default:
                try {
                    ByteArrayInputStream p = zoy0.p((String) obj);
                    this.c = p;
                    fogVar.d(p);
                    return;
                } catch (IllegalArgumentException e) {
                    fogVar.e(e);
                    return;
                }
        }
    }

    @Override // defpackage.gog
    public final DataSource c() {
        switch (this.a) {
        }
        return DataSource.LOCAL;
    }

    @Override // defpackage.gog
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.gog
    public final void cleanup() {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                try {
                    ((ByteArrayInputStream) this.c).close();
                    break;
                } catch (IOException unused) {
                    return;
                }
        }
    }

    public kg10(String str, zoy0 zoy0Var) {
        this.a = 2;
        this.b = str;
    }
}
