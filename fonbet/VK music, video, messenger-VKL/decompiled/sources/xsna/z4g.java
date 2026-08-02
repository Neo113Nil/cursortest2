package xsna;

import com.vk.network.encoding.EncodingType;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.io.FileWalkDirection;
import org.chromium.net.NetError;

/* compiled from: CollectionToArray.kt */
/* loaded from: classes11.dex */
public final class z4g implements m2p0, b9i {
    public static final Object[] c = new Object[0];
    public static final z4g d = new z4g(1);
    public static final z4g e = new z4g(2);
    public static final /* synthetic */ z4g f = new z4g(3);
    public static bpn0 g;
    public final /* synthetic */ int b;

    public /* synthetic */ z4g(int i) {
        this.b = i;
    }

    public static final void b(File file, Long l) {
        File[] listFiles;
        long currentTimeMillis = System.currentTimeMillis();
        Iterator<File> it = new war(file, FileWalkDirection.BOTTOM_UP).iterator();
        while (it.hasNext()) {
            File next = it.next();
            boolean z = false;
            boolean z2 = next.isFile() && (l == null || currentTimeMillis - next.lastModified() > l.longValue());
            if (next.isDirectory() && ((listFiles = next.listFiles()) == null || listFiles.length == 0)) {
                z = true;
            }
            boolean equals = next.equals(file);
            if (z2 || (z && !equals)) {
                next.delete();
            }
        }
    }

    public static final ui70 d() {
        bpn0 bpn0Var = g;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (ui70) bpn0Var.getValue();
    }

    public static final long f(File file) {
        if (file.exists() && file.canRead()) {
            return com.vk.core.files.a.I(file);
        }
        return 0L;
    }

    public static final long g(File file) {
        if (file.exists() && file.canRead()) {
            return com.vk.core.files.a.J(file);
        }
        return 0L;
    }

    @ozl
    public static final Object[] h(Collection collection) {
        int size = collection.size();
        Object[] objArr = c;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i2);
            }
            i = i2;
        }
    }

    @ozl
    public static final Object[] i(Collection collection, Object[] objArr) {
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr2 = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        return new m3q(lcg0Var.e(rt20.class));
    }

    public void e(EncodingType encodingType, String str, String str2, Throwable th) {
        String str3 = null;
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.CONTENT_DECODE_ERROR.h(), str3, encodingType.name(), null, str, null, str2, null, th.getClass().getSimpleName(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS, 3, null);
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = schemeStat$TypeDevNullItem;
        l5mVar.q();
    }

    public String toString() {
        switch (this.b) {
            case 1:
                return "NoopTextMapPropagator";
            default:
                return super.toString();
        }
    }

    @Override // xsna.m2p0
    public void a(int i, long j) {
    }
}
