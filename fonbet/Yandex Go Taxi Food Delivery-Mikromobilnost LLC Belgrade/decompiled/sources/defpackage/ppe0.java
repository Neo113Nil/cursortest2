package defpackage;

import com.yandex.div.core.preload.a;
import kotlin.sequences.b;

/* loaded from: classes.dex */
public final class ppe0 implements ope0 {
    public final sls a;
    public boolean b;
    public boolean c;

    public ppe0(sls slsVar, String str) {
        this.a = slsVar;
    }

    public final void a(dpe0 dpe0Var) {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b = (dpe0Var != null ? (kg21) b.j(a.a(dpe0Var)) : null) != null;
        this.a.invoke();
    }
}
