package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;
import ru.rt.ebs.cryptosdk.core.storage.keystore.KeyStorageType;

/* loaded from: classes10.dex */
public final class g1o implements bit, b3v {
    public volatile Object a;
    public final Object b;

    public g1o(Context context) {
        this.b = context;
        this.a = new ConcurrentHashMap();
    }

    public bxj a() {
        if (((bxj) this.a) == null) {
            synchronized (this) {
                try {
                    if (((bxj) this.a) == null) {
                        File cacheDir = ((me0) ((i4u) this.b).a).a.getCacheDir();
                        gpc gpcVar = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            gpcVar = new gpc(file);
                        }
                        this.a = gpcVar;
                    }
                    if (((bxj) this.a) == null) {
                        this.a = new cxj();
                    }
                } finally {
                }
            }
        }
        return (bxj) this.a;
    }

    public IKeyStorage b(String str, KeyStorageType keyStorageType) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            int i = djx.a[keyStorageType.ordinal()];
            if (i == 1) {
                obj = new loe0((Context) this.b, str);
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                obj = new si10();
            }
            Object putIfAbsent = concurrentHashMap.putIfAbsent(str, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        return (IKeyStorage) obj;
    }

    @Override // defpackage.bit
    public Object get() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        Object obj = ((bit) this.b).get();
                        z2a1.e(obj, "Argument must not be null");
                        this.a = obj;
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    public /* synthetic */ g1o(Object obj) {
        this.b = obj;
    }
}
