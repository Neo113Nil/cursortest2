package xsna;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* compiled from: DiskCacheStrategy.java */
/* loaded from: classes12.dex */
public abstract class bbn {
    public static final b a;
    public static final c b;
    public static final e c;

    /* compiled from: DiskCacheStrategy.java */
    public class a extends bbn {
        @Override // xsna.bbn
        public final boolean a() {
            return true;
        }

        @Override // xsna.bbn
        public final boolean b() {
            return true;
        }

        @Override // xsna.bbn
        public final boolean c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // xsna.bbn
        public final boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    public class b extends bbn {
        @Override // xsna.bbn
        public final boolean a() {
            return false;
        }

        @Override // xsna.bbn
        public final boolean b() {
            return false;
        }

        @Override // xsna.bbn
        public final boolean c(DataSource dataSource) {
            return false;
        }

        @Override // xsna.bbn
        public final boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    public class c extends bbn {
        @Override // xsna.bbn
        public final boolean a() {
            return true;
        }

        @Override // xsna.bbn
        public final boolean b() {
            return false;
        }

        @Override // xsna.bbn
        public final boolean c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // xsna.bbn
        public final boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    public class d extends bbn {
        @Override // xsna.bbn
        public final boolean a() {
            return false;
        }

        @Override // xsna.bbn
        public final boolean b() {
            return true;
        }

        @Override // xsna.bbn
        public final boolean c(DataSource dataSource) {
            return false;
        }

        @Override // xsna.bbn
        public final boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    public class e extends bbn {
        @Override // xsna.bbn
        public final boolean a() {
            return true;
        }

        @Override // xsna.bbn
        public final boolean b() {
            return true;
        }

        @Override // xsna.bbn
        public final boolean c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // xsna.bbn
        public final boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    static {
        new a();
        a = new b();
        b = new c();
        new d();
        c = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(DataSource dataSource);

    public abstract boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
