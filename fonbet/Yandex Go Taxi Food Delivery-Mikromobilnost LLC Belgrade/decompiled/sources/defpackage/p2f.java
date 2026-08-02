package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p2f {
    public final uo2 a;
    public final jb7 b;

    public p2f(uo2 uo2Var, q1r q1rVar) {
        this.a = uo2Var;
        this.b = new jb7(q1rVar);
    }

    public final String a(String str) {
        jb7 jb7Var = this.b;
        synchronized (jb7Var) {
            if (Objects.equals((String) jb7Var.c, str)) {
                return (String) jb7Var.w;
            }
            q1r q1rVar = (q1r) jb7Var.b;
            n2f n2fVar = jb7.x;
            File file = new File(q1rVar.d, str);
            file.mkdirs();
            List f = q1r.f(file.listFiles(n2fVar));
            return f.isEmpty() ? null : ((File) Collections.min(f, jb7.y)).getName().substring(4);
        }
    }

    public final void b(String str) {
        jb7 jb7Var = this.b;
        synchronized (jb7Var) {
            if (!Objects.equals((String) jb7Var.c, str)) {
                q1r q1rVar = (q1r) jb7Var.b;
                String str2 = (String) jb7Var.w;
                if (str != null && str2 != null) {
                    try {
                        q1rVar.c(str, "aqs.".concat(str2)).createNewFile();
                    } catch (IOException unused) {
                    }
                }
                jb7Var.c = str;
            }
        }
    }
}
