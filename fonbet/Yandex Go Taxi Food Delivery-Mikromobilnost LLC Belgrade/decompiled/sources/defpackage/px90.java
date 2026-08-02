package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class px90 implements ox90 {
    public ox90 a;
    public esx b;

    public static void h(px90 px90Var, ox90 ox90Var) {
        px90Var.a = ox90Var;
        if (px90Var.b != null) {
            px90Var.b = null;
        }
    }

    @Override // defpackage.ox90
    public final void a(Uri uri, List list) {
        this.b = new esx(uri, list);
        ox90 ox90Var = this.a;
        if (ox90Var != null) {
            ox90Var.a(uri, list);
        }
    }

    @Override // defpackage.ox90
    public final void b(String str) {
        ox90 ox90Var = this.a;
        if (ox90Var != null) {
            ox90Var.b(str);
        }
    }

    @Override // defpackage.ox90
    public final void c() {
        this.b = null;
        ox90 ox90Var = this.a;
        if (ox90Var != null) {
            ox90Var.c();
        }
    }

    @Override // defpackage.ox90
    public final void d(Uri uri) {
        a(uri, EmptyList.a);
    }

    @Override // defpackage.ox90
    public final void e(ct20 ct20Var) {
        ox90 ox90Var = this.a;
        if (ox90Var != null) {
            ox90Var.e(ct20Var);
        }
    }

    @Override // defpackage.ox90
    public final void f() {
        ox90 ox90Var = this.a;
        if (ox90Var != null) {
            ox90Var.f();
        }
    }

    @Override // defpackage.ox90
    public final void g() {
        ox90 ox90Var = this.a;
        if (ox90Var != null) {
            ox90Var.g();
        }
    }
}
