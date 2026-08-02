package defpackage;

import android.content.Intent;
import android.net.Uri;
import kotlin.a;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes9.dex */
public final class ha1 {
    public final lx4 a;
    public final q0h b;
    public final qqc c;
    public final i3y d;

    public ha1(zuj0 zuj0Var, lx4 lx4Var, q0h q0hVar, qqc qqcVar) {
        this.a = lx4Var;
        this.b = q0hVar;
        this.c = qqcVar;
        this.d = a.a(new d9(8, zuj0Var));
    }

    public final boolean a(Uri uri) {
        if (!og21.b(uri)) {
            return false;
        }
        i3y i3yVar = this.d;
        if (evu0.J((String) i3yVar.getValue())) {
            return false;
        }
        return jl40.l(uri.getHost(), (String) i3yVar.getValue());
    }

    public final void b(Intent intent, tls tlsVar) {
        Uri data = intent.getData();
        if (data == null) {
            tlsVar.invoke(intent);
            return;
        }
        boolean a = a(data);
        lx4 lx4Var = this.a;
        if (a) {
            ((j) lx4Var).i().e(data, new ga1(0, this, tlsVar, intent));
        } else {
            tlsVar.invoke(intent);
            ((j) lx4Var).i().h(data);
        }
    }
}
