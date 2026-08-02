package defpackage;

import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class mg3 {
    public final ImmutableList a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public mg3(ImmutableList immutableList) {
        this.a = immutableList;
        ng3 ng3Var = ng3.e;
        this.d = false;
    }

    public final void a() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.a;
            if (i >= immutableList.size()) {
                break;
            }
            og3 og3Var = (og3) immutableList.get(i);
            og3Var.flush();
            if (og3Var.isActive()) {
                arrayList.add(og3Var);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= b(); i2++) {
            this.c[i2] = ((og3) arrayList.get(i2)).c();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        return this.d && ((og3) this.b.get(b())).isEnded() && !this.c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= b()) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    og3 og3Var = (og3) arrayList.get(i);
                    if (!og3Var.isEnded()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : og3.a;
                        long remaining = byteBuffer2.remaining();
                        og3Var.a(byteBuffer2);
                        this.c[i] = og3Var.c();
                        z |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < b()) {
                        ((og3) arrayList.get(i + 1)).b();
                    }
                }
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg3)) {
            return false;
        }
        ImmutableList immutableList = ((mg3) obj).a;
        ImmutableList immutableList2 = this.a;
        if (immutableList2.size() != immutableList.size()) {
            return false;
        }
        for (int i = 0; i < immutableList2.size(); i++) {
            if (immutableList2.get(i) != immutableList.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
