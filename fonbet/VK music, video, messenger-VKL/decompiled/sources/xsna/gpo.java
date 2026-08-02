package xsna;

import com.facebook.common.file.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import xsna.tbn;

/* compiled from: DynamicDefaultDiskStorage.java */
/* loaded from: classes12.dex */
public final class gpo implements tbn {
    public final int a;
    public final yhn0<File> b;
    public final String c;
    public final e370 d;
    public volatile a e = new a(null, null);

    /* compiled from: DynamicDefaultDiskStorage.java */
    public static class a {
        public final tbn a;
        public final File b;

        public a(File file, kdl kdlVar) {
            this.a = kdlVar;
            this.b = file;
        }
    }

    public gpo(int i, yhn0 yhn0Var, String str, e370 e370Var) {
        this.a = i;
        this.d = e370Var;
        this.b = yhn0Var;
        this.c = str;
    }

    public final void a() throws IOException {
        File file = new File(this.b.get(), this.c);
        try {
            FileUtils.a(file);
            String absolutePath = file.getAbsolutePath();
            if (ahq.a.a(3)) {
                bhq.b(3, gpo.class.getSimpleName(), "Created cache directory " + absolutePath);
            }
            this.e = new a(file, new kdl(file, this.a, this.d));
        } catch (FileUtils.CreateDirectoryException e) {
            this.d.getClass();
            throw e;
        }
    }

    @Override // xsna.tbn
    public final void b() throws IOException {
        i().b();
    }

    @Override // xsna.tbn
    public final Collection<tbn.a> c() throws IOException {
        return i().c();
    }

    @Override // xsna.tbn
    public final t27 d(Object obj, String str) throws IOException {
        return i().d(obj, str);
    }

    @Override // xsna.tbn
    public final long e(tbn.a aVar) throws IOException {
        return i().e(aVar);
    }

    @Override // xsna.tbn
    public final void f() {
        try {
            i().f();
        } catch (IOException e) {
            ahq.b(gpo.class, "purgeUnexpectedResources", e);
        }
    }

    @Override // xsna.tbn
    public final boolean g(Object obj, String str) throws IOException {
        return i().g(obj, str);
    }

    @Override // xsna.tbn
    public final tbn.b h(Object obj, String str) throws IOException {
        return i().h(obj, str);
    }

    public final synchronized tbn i() throws IOException {
        tbn tbnVar;
        File file;
        a aVar = this.e;
        if (aVar.a == null || (file = aVar.b) == null || !file.exists()) {
            if (this.e.a != null && this.e.b != null) {
                rte0.k(this.e.b);
            }
            a();
        }
        tbnVar = this.e.a;
        tbnVar.getClass();
        return tbnVar;
    }

    @Override // xsna.tbn
    public final boolean isExternal() {
        try {
            return i().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // xsna.tbn
    public final long remove(String str) throws IOException {
        return i().remove(str);
    }
}
