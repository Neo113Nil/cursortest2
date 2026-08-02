package xsna;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.twe0;

/* compiled from: FileInfo.java */
/* loaded from: classes7.dex */
public final class a9r {
    public final File a;
    public final twe0 b;
    public long c;
    public String d;

    /* compiled from: FileInfo.java */
    public static class a {
        public final long a;
        public final long b;
        public final boolean c;

        public a(long j, long j2, boolean z) {
            this.a = j;
            this.b = j2;
            this.c = z;
        }

        public final String toString() {
            return sp.p(this, "from", Long.valueOf(this.a), "to", Long.valueOf(this.b), "downloaded", Boolean.valueOf(this.c));
        }
    }

    public a9r(File file) {
        twe0 twe0Var = new twe0();
        twe0Var.b = null;
        this.b = twe0Var;
        this.a = new File(file.getParentFile(), file.getName() + ".info");
    }

    public final void a() throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(this.a));
        try {
            this.c = dataInputStream.readLong();
            if (dataInputStream.readBoolean()) {
                this.d = dataInputStream.readUTF();
            }
            int readInt = dataInputStream.readInt();
            for (int i = 0; i < readInt; i++) {
                this.b.a(dataInputStream.readLong(), dataInputStream.readLong());
            }
            sp.i(dataInputStream);
        } catch (Throwable th) {
            sp.i(dataInputStream);
            throw th;
        }
    }

    public final ArrayList b() {
        long j;
        ArrayList arrayList = new ArrayList();
        long j2 = this.c;
        long j3 = 0;
        long j4 = j2 > 0 ? j2 - 1 : Long.MAX_VALUE;
        long j5 = 0;
        while (true) {
            Iterator<twe0.a> it = this.b.iterator();
            long j6 = -1;
            long j7 = Long.MAX_VALUE;
            while (true) {
                twe0.b bVar = (twe0.b) it;
                if (!bVar.hasNext()) {
                    break;
                }
                twe0.a aVar = (twe0.a) bVar.next();
                if (aVar.a(j5)) {
                    j = j3;
                    long j8 = aVar.d;
                    if (j8 > j6) {
                        j6 = j8;
                    }
                } else {
                    j = j3;
                    long j9 = aVar.c;
                    if (j9 > j5 && j9 < j7) {
                        j7 = j9;
                    }
                }
                j3 = j;
            }
            long j10 = j3;
            if (j6 >= j10) {
                if (j4 <= j6) {
                    arrayList.add(new a(j5, j4, true));
                    return arrayList;
                }
                arrayList.add(new a(j5, j6, true));
                j5 = j6 + 1;
            } else {
                if (j7 >= Long.MAX_VALUE) {
                    arrayList.add(new a(j5, -1L, false));
                    return arrayList;
                }
                if (j4 <= j6) {
                    arrayList.add(new a(j5, j4, false));
                    return arrayList;
                }
                long j11 = j7;
                arrayList.add(new a(j5, j11, false));
                j5 = j11 + 1;
            }
            j3 = j10;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator<twe0.a> it = this.b.iterator();
        while (true) {
            twe0.b bVar = (twe0.b) it;
            if (!bVar.hasNext()) {
                sb.append(']');
                return sp.p(this, "contentLength", Long.valueOf(this.c), "contentType", this.d, "ranges", sb);
            }
            twe0.a aVar = (twe0.a) bVar.next();
            sb.append('(');
            sb.append(aVar.c);
            sb.append(", ");
            sb.append(aVar.d);
            sb.append(')');
            if (bVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
