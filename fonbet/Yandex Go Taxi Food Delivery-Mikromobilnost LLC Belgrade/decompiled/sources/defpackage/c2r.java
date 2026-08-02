package defpackage;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.io.FileWalkDirection;

/* loaded from: classes9.dex */
public final class c2r extends a8 {
    public final ArrayDeque c;
    public final /* synthetic */ e2r w;

    public c2r(e2r e2rVar) {
        this.w = e2rVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.c = arrayDeque;
        File file = (File) e2rVar.b;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (file.isFile()) {
            arrayDeque.push(new z1r(file));
        } else {
            this.a = 2;
        }
    }

    @Override // defpackage.a8
    public final void a() {
        File file;
        File a;
        while (true) {
            ArrayDeque arrayDeque = this.c;
            d2r d2rVar = (d2r) arrayDeque.peek();
            if (d2rVar == null) {
                file = null;
                break;
            }
            a = d2rVar.a();
            if (a == null) {
                arrayDeque.pop();
            } else if (a.equals(d2rVar.a) || !a.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                break;
            } else {
                arrayDeque.push(b(a));
            }
        }
        file = a;
        if (file == null) {
            this.a = 2;
        } else {
            this.b = file;
            this.a = 1;
        }
    }

    public final x1r b(File file) {
        int i = b2r.a[((FileWalkDirection) this.w.c).ordinal()];
        if (i == 1) {
            return new a2r(this, file);
        }
        if (i == 2) {
            return new y1r(this, file);
        }
        w511.b();
        return null;
    }
}
