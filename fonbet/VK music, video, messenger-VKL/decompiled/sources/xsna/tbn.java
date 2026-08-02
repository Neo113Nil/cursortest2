package xsna;

import java.io.IOException;
import java.util.Collection;

/* compiled from: DiskStorage.java */
/* loaded from: classes.dex */
public interface tbn {

    /* compiled from: DiskStorage.java */
    /* loaded from: classes12.dex */
    public interface a {
        String getId();

        long getSize();

        long getTimestamp();
    }

    /* compiled from: DiskStorage.java */
    /* loaded from: classes12.dex */
    public interface b {
        boolean G();

        void H(xm8 xm8Var) throws IOException;

        t27 commit() throws IOException;
    }

    void b() throws IOException;

    Collection<a> c() throws IOException;

    t27 d(Object obj, String str) throws IOException;

    long e(a aVar) throws IOException;

    void f();

    boolean g(Object obj, String str) throws IOException;

    b h(Object obj, String str) throws IOException;

    boolean isExternal();

    long remove(String str) throws IOException;
}
