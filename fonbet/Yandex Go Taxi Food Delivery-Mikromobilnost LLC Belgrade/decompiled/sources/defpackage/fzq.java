package defpackage;

import com.squareup.moshi.JsonAdapter;
import java.io.File;
import java.io.FileInputStream;
import kotlin.text.Regex;

/* loaded from: classes15.dex */
public final class fzq extends m5j0 {
    public final /* synthetic */ int b = 1;
    public final Object c;
    public final Object d;

    public fzq(wg10 wg10Var, byte[] bArr, long j) {
        this.c = wg10Var;
        this.d = f73.m((int) j, bArr.length, bArr);
    }

    @Override // defpackage.m5j0
    public final long a() {
        switch (this.b) {
            case 0:
                return ((byte[]) this.d).length;
            case 1:
                yp6 yp6Var = new yp6();
                ((JsonAdapter) this.c).toJson((oq6) yp6Var, (yp6) this.d);
                return yp6Var.b;
            case 2:
                return ((File) this.d).length();
            default:
                return ((m5j0) this.d).a();
        }
    }

    @Override // defpackage.m5j0
    public final wg10 b() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 1:
                Regex regex = wg10.e;
                try {
                    break;
                }
        }
        return (wg10) obj;
    }

    @Override // defpackage.m5j0
    public final void d(oq6 oq6Var) {
        int i = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                oq6Var.write((byte[]) obj);
                oq6Var.flush();
                return;
            case 1:
                ((JsonAdapter) this.c).toJson(oq6Var, (oq6) obj);
                return;
            case 2:
                v0w v0wVar = new v0w(new FileInputStream((File) obj), ydz0.d);
                try {
                    oq6Var.N1(v0wVar);
                    v0wVar.close();
                    return;
                } finally {
                }
            default:
                ((m5j0) obj).d(oq6Var);
                return;
        }
    }

    public fzq(JsonAdapter jsonAdapter, Object obj) {
        this.c = jsonAdapter;
        this.d = obj;
    }

    public fzq(wg10 wg10Var, File file) {
        this.c = wg10Var;
        this.d = file;
    }

    public fzq(m5j0 m5j0Var, wg10 wg10Var) {
        this.d = m5j0Var;
        this.c = wg10Var;
    }
}
