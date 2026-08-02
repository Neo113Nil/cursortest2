package xsna;

import android.content.Context;
import com.vk.core.files.PrivateLocation$Guaranteed;
import com.vk.core.files.PrivateSubdir;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class egd0 implements yzs {
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        File c;
        Boolean putIfAbsent;
        zfd0 zfd0Var = (zfd0) obj;
        PrivateSubdir privateSubdir = (PrivateSubdir) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        Context context = zfd0Var.a;
        if (booleanValue) {
            if (zfd0Var.b() && privateSubdir.h() != PrivateLocation$Guaranteed.INTERNAL_STORAGE && privateSubdir.h() != PrivateLocation$Guaranteed.INTERNAL_CACHE) {
                File[] externalFilesDirs = context.getExternalFilesDirs(null);
                File file = externalFilesDirs != null ? (File) rl3.S(1, externalFilesDirs) : null;
                if (file != null && (c = zfd0.c(file, privateSubdir)) != null) {
                    ConcurrentHashMap<String, Boolean> concurrentHashMap = zfd0Var.b;
                    String absolutePath = c.getAbsolutePath();
                    Boolean bool = concurrentHashMap.get(absolutePath);
                    if (bool == null && (putIfAbsent = concurrentHashMap.putIfAbsent(absolutePath, (bool = Boolean.valueOf(zfd0.a(c))))) != null) {
                        bool = putIfAbsent;
                    }
                    if (bool.booleanValue()) {
                        return c;
                    }
                }
            }
        } else if (zfd0Var.b() && privateSubdir.h() != PrivateLocation$Guaranteed.INTERNAL_STORAGE && privateSubdir.h() != PrivateLocation$Guaranteed.INTERNAL_CACHE) {
            File[] externalFilesDirs2 = context.getExternalFilesDirs(null);
            File file2 = externalFilesDirs2 != null ? (File) rl3.S(1, externalFilesDirs2) : null;
            if (file2 != null) {
                return new File(file2, privateSubdir.i());
            }
        }
        return null;
    }
}
