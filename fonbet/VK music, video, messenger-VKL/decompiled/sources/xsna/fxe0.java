package xsna;

import java.nio.ByteBuffer;
import java.util.LinkedList;

/* compiled from: RateShareEntry.java */
/* loaded from: classes13.dex */
public final class fxe0 extends vju {
    public short a;
    public short b;
    public final LinkedList c = new LinkedList();
    public int d;
    public int e;
    public short f;

    /* compiled from: RateShareEntry.java */
    public static class a {
        public int a;
        public short b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return (this.a * 31) + this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{availableBitrate=");
            sb.append(this.a);
            sb.append(", targetRateShare=");
            return vu5.b(sb, this.b, '}');
        }
    }

    @Override // xsna.vju
    public final ByteBuffer a() {
        short s = this.a;
        ByteBuffer allocate = ByteBuffer.allocate(s == 1 ? 13 : (s * 6) + 11);
        allocate.putShort(this.a);
        if (this.a == 1) {
            allocate.putShort(this.b);
        } else {
            for (a aVar : this.c) {
                allocate.putInt(aVar.a);
                allocate.putShort(aVar.b);
            }
        }
        allocate.putInt(this.d);
        allocate.putInt(this.e);
        allocate.put((byte) (this.f & 255));
        allocate.rewind();
        return allocate;
    }

    @Override // xsna.vju
    public final String b() {
        return "rash";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    @Override // xsna.vju
    public final void c(ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        this.a = s;
        if (s == 1) {
            this.b = byteBuffer.getShort();
        } else {
            while (true) {
                ?? r1 = s - 1;
                if (s <= 0) {
                    break;
                }
                int p = up2.p(crx0.w(byteBuffer));
                short s2 = byteBuffer.getShort();
                a aVar = new a();
                aVar.a = p;
                aVar.b = s2;
                this.c.add(aVar);
                s = r1;
            }
        }
        this.d = up2.p(crx0.w(byteBuffer));
        this.e = up2.p(crx0.w(byteBuffer));
        this.f = (short) crx0.e(byteBuffer.get());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fxe0.class != obj.getClass()) {
            return false;
        }
        fxe0 fxe0Var = (fxe0) obj;
        LinkedList linkedList = fxe0Var.c;
        if (this.f != fxe0Var.f || this.d != fxe0Var.d || this.e != fxe0Var.e || this.a != fxe0Var.a || this.b != fxe0Var.b) {
            return false;
        }
        LinkedList linkedList2 = this.c;
        return linkedList2 != null ? linkedList2.equals(linkedList) : linkedList == null;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        LinkedList linkedList = this.c;
        return ((((((i + (linkedList != null ? linkedList.hashCode() : 0)) * 31) + this.d) * 31) + this.e) * 31) + this.f;
    }
}
