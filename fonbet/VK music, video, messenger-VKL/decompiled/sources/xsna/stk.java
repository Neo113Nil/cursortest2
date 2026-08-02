package xsna;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.List;
import xsna.b330;
import xsna.buk;
import xsna.cuk;
import xsna.klp;

/* compiled from: DataCacheGenerator.java */
/* loaded from: classes12.dex */
public final class stk implements cuk, buk.a<Object> {
    public final List<ady> b;
    public final q7l<?> c;
    public final cuk.a d;
    public int e = -1;
    public ady f;
    public List<b330<File, ?>> g;
    public int h;
    public volatile b330.a<?> i;
    public File j;

    public stk(List<ady> list, q7l<?> q7lVar, cuk.a aVar) {
        this.b = list;
        this.c = q7lVar;
        this.d = aVar;
    }

    @Override // xsna.cuk
    public final boolean a() {
        while (true) {
            List<b330<File, ?>> list = this.g;
            boolean z = false;
            if (list != null && this.h < list.size()) {
                this.i = null;
                while (!z && this.h < this.g.size()) {
                    List<b330<File, ?>> list2 = this.g;
                    int i = this.h;
                    this.h = i + 1;
                    b330<File, ?> b330Var = list2.get(i);
                    File file = this.j;
                    q7l<?> q7lVar = this.c;
                    this.i = b330Var.a(file, q7lVar.e, q7lVar.f, q7lVar.i);
                    if (this.i != null && this.c.c(this.i.c.b()) != null) {
                        this.i.c.d(this.c.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.e + 1;
            this.e = i2;
            if (i2 >= this.b.size()) {
                return false;
            }
            ady adyVar = this.b.get(this.e);
            q7l<?> q7lVar2 = this.c;
            File c = ((klp.c) q7lVar2.h).a().c(new ttk(adyVar, q7lVar2.n));
            this.j = c;
            if (c != null) {
                this.f = adyVar;
                this.g = this.c.c.a().f(c);
                this.h = 0;
            }
        }
    }

    @Override // xsna.buk.a
    public final void c(Object obj) {
        this.d.c(this.f, obj, this.i.c, DataSource.DATA_DISK_CACHE, this.f);
    }

    @Override // xsna.cuk
    public final void cancel() {
        b330.a<?> aVar = this.i;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // xsna.buk.a
    public final void f(@NonNull Exception exc) {
        this.d.b(this.f, exc, this.i.c, DataSource.DATA_DISK_CACHE);
    }
}
