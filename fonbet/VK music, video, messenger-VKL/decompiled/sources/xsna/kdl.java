package xsna;

import android.os.Environment;
import com.facebook.common.file.FileUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import xsna.tbn;

/* compiled from: DefaultDiskStorage.java */
/* loaded from: classes12.dex */
public final class kdl implements tbn {
    public static final long f = TimeUnit.MINUTES.toMillis(30);
    public static final /* synthetic */ int g = 0;
    public final File a;
    public final boolean b;
    public final File c;
    public final e370 d;
    public final l2l0 e;

    /* compiled from: DefaultDiskStorage.java */
    public static class b implements tbn.a {
        public final String a;
        public final x7r b;
        public long c;
        public long d;

        public b(String str, File file) {
            str.getClass();
            this.a = str;
            this.b = new x7r(file);
            this.c = -1L;
            this.d = -1L;
        }

        @Override // xsna.tbn.a
        public final String getId() {
            return this.a;
        }

        @Override // xsna.tbn.a
        public final long getSize() {
            if (this.c < 0) {
                this.c = this.b.b.length();
            }
            return this.c;
        }

        @Override // xsna.tbn.a
        public final long getTimestamp() {
            if (this.d < 0) {
                this.d = this.b.b.lastModified();
            }
            return this.d;
        }
    }

    /* compiled from: DefaultDiskStorage.java */
    public static class c {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("(");
            return i5s.a(sb, this.b, ")");
        }
    }

    /* compiled from: DefaultDiskStorage.java */
    public static class d extends IOException {
    }

    /* compiled from: DefaultDiskStorage.java */
    public class e implements tbn.b {
        public final String a;
        public final File b;

        public e(String str, File file) {
            this.a = str;
            this.b = file;
        }

        @Override // xsna.tbn.b
        public final boolean G() {
            File file = this.b;
            return !file.exists() || file.delete();
        }

        @Override // xsna.tbn.b
        public final void H(xm8 xm8Var) throws IOException {
            File file = this.b;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    ryj ryjVar = new ryj(fileOutputStream);
                    ryjVar.b = 0L;
                    rip ripVar = (rip) xm8Var.b;
                    ym8 ym8Var = (ym8) xm8Var.c;
                    InputStream p = ripVar.p();
                    if (p == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    ym8Var.c.a(p, ryjVar);
                    ryjVar.flush();
                    long j = ryjVar.b;
                    fileOutputStream.close();
                    if (file.length() == j) {
                        return;
                    }
                    long length = file.length();
                    StringBuilder b = fp.b(j, "File was not written completely. Expected: ", ", found: ");
                    b.append(length);
                    throw new d(b.toString());
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e) {
                e370 e370Var = kdl.this.d;
                int i = kdl.g;
                e370Var.getClass();
                throw e;
            }
        }

        @Override // xsna.tbn.b
        public final t27 commit() throws IOException {
            kdl kdlVar = kdl.this;
            kdlVar.e.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            File i = kdlVar.i(this.a);
            try {
                FileUtils.b(this.b, i);
                if (i.exists()) {
                    i.setLastModified(currentTimeMillis);
                }
                return new x7r(i);
            } catch (FileUtils.RenameException e) {
                e.getCause();
                e370 e370Var = kdlVar.d;
                int i2 = kdl.g;
                e370Var.getClass();
                throw e;
            }
        }
    }

    /* compiled from: DefaultDiskStorage.java */
    public class f implements var {
        public boolean a;

        public f() {
        }

        @Override // xsna.var
        public final void a(File file) {
            if (this.a || !file.equals(kdl.this.c)) {
                return;
            }
            this.a = true;
        }

        @Override // xsna.var
        public final void b(File file) {
            kdl kdlVar;
            c a;
            if (this.a && (a = kdl.a(file, (kdlVar = kdl.this))) != null) {
                String str = a.a;
                if (str != ".tmp") {
                    sex0.f(str == ".cnt");
                    return;
                }
                long lastModified = file.lastModified();
                kdlVar.e.getClass();
                if (lastModified > System.currentTimeMillis() - kdl.f) {
                    return;
                }
            }
            file.delete();
        }

        @Override // xsna.var
        public final void c(File file) {
            kdl kdlVar = kdl.this;
            if (!kdlVar.a.equals(file) && !this.a) {
                file.delete();
            }
            if (this.a && file.equals(kdlVar.c)) {
                this.a = false;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|2|3|(3:5|6|7)|11|(4:13|(1:15)|16|17)|19|20|16|17|(1:(1:10))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        r4 = r2.d;
        java.util.Objects.toString(r3);
        r4.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kdl(File file, int i, e370 e370Var) {
        this.a = file;
        boolean z = false;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                try {
                    z = file.getCanonicalPath().contains(externalStorageDirectory.toString());
                } catch (IOException unused) {
                    e370Var.getClass();
                }
            }
        } catch (Exception unused2) {
            e370Var.getClass();
        }
        this.b = z;
        File file2 = new File(this.a, lhg.a(i, "v2.ols100."));
        this.c = file2;
        this.d = e370Var;
        File file3 = this.a;
        if (file3.exists()) {
            if (!file2.exists()) {
                rte0.k(file3);
            }
            this.e = l2l0.c;
        }
        FileUtils.a(file2);
        this.e = l2l0.c;
    }

    public static c a(File file, kdl kdlVar) {
        c cVar;
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf > 0) {
            String substring = name.substring(lastIndexOf);
            String str = ".cnt".equals(substring) ? ".cnt" : ".tmp".equals(substring) ? ".tmp" : null;
            if (str != null) {
                String substring2 = name.substring(0, lastIndexOf);
                if (str.equals(".tmp")) {
                    int lastIndexOf2 = substring2.lastIndexOf(46);
                    if (lastIndexOf2 > 0) {
                        substring2 = substring2.substring(0, lastIndexOf2);
                    }
                }
                cVar = new c(str, substring2);
                if (cVar != null && new File(kdlVar.j(cVar.b)).equals(file.getParentFile())) {
                    return cVar;
                }
                return null;
            }
        }
        cVar = null;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // xsna.tbn
    public final void b() {
        File[] listFiles = this.a.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                rte0.k(file);
            }
        }
    }

    @Override // xsna.tbn
    public final Collection c() throws IOException {
        a aVar = new a();
        rte0.F(this.c, aVar);
        return Collections.unmodifiableList(aVar.a);
    }

    @Override // xsna.tbn
    public final t27 d(Object obj, String str) {
        File i = i(str);
        if (!i.exists()) {
            return null;
        }
        this.e.getClass();
        i.setLastModified(System.currentTimeMillis());
        return new x7r(i);
    }

    @Override // xsna.tbn
    public final long e(tbn.a aVar) {
        File file = ((b) aVar).b.b;
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    @Override // xsna.tbn
    public final void f() {
        rte0.F(this.a, new f());
    }

    @Override // xsna.tbn
    public final boolean g(Object obj, String str) {
        return i(str).exists();
    }

    @Override // xsna.tbn
    public final tbn.b h(Object obj, String str) throws IOException {
        File file = new File(j(str));
        boolean exists = file.exists();
        e370 e370Var = this.d;
        if (!exists) {
            try {
                FileUtils.a(file);
            } catch (FileUtils.CreateDirectoryException e2) {
                e370Var.getClass();
                throw e2;
            }
        }
        try {
            return new e(str, File.createTempFile(str.concat("."), ".tmp", file));
        } catch (IOException e3) {
            e370Var.getClass();
            throw e3;
        }
    }

    public final File i(String str) {
        return new File(tdj.a(fw3.e(j(str)), File.separator, str, ".cnt"));
    }

    @Override // xsna.tbn
    public final boolean isExternal() {
        return this.b;
    }

    public final String j(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        return i5s.a(sb, File.separator, valueOf);
    }

    @Override // xsna.tbn
    public final long remove(String str) {
        File i = i(str);
        if (!i.exists()) {
            return 0L;
        }
        long length = i.length();
        if (i.delete()) {
            return length;
        }
        return -1L;
    }

    /* compiled from: DefaultDiskStorage.java */
    public class a implements var {
        public final ArrayList a = new ArrayList();

        public a() {
        }

        @Override // xsna.var
        public final void b(File file) {
            c a = kdl.a(file, kdl.this);
            if (a == null || a.a != ".cnt") {
                return;
            }
            this.a.add(new b(a.b, file));
        }

        @Override // xsna.var
        public final void a(File file) {
        }

        @Override // xsna.var
        public final void c(File file) {
        }
    }
}
