package androidx.datastore.core;

import defpackage.btq0;
import defpackage.dxf0;
import defpackage.kma1;
import defpackage.n1r;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tls;
import defpackage.tse;
import defpackage.weu;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public abstract class h {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(File file, tls tlsVar, ContinuationImpl continuationImpl) {
        FileStorageKt$runFileDiagnosticsIfNotCorruption$1 fileStorageKt$runFileDiagnosticsIfNotCorruption$1;
        int i;
        try {
            if (continuationImpl instanceof FileStorageKt$runFileDiagnosticsIfNotCorruption$1) {
                fileStorageKt$runFileDiagnosticsIfNotCorruption$1 = (FileStorageKt$runFileDiagnosticsIfNotCorruption$1) continuationImpl;
                int i2 = fileStorageKt$runFileDiagnosticsIfNotCorruption$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fileStorageKt$runFileDiagnosticsIfNotCorruption$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = fileStorageKt$runFileDiagnosticsIfNotCorruption$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = fileStorageKt$runFileDiagnosticsIfNotCorruption$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        fileStorageKt$runFileDiagnosticsIfNotCorruption$1.L$0 = file;
                        fileStorageKt$runFileDiagnosticsIfNotCorruption$1.label = 1;
                        Object invoke = tlsVar.invoke(fileStorageKt$runFileDiagnosticsIfNotCorruption$1);
                        return invoke == obj2 ? obj2 : invoke;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
            }
            if (i != 0) {
            }
        } catch (IOException e) {
            if (e instanceof CorruptionException) {
                throw e;
            }
            throw kma1.c(file, e);
        }
        fileStorageKt$runFileDiagnosticsIfNotCorruption$1 = new FileStorageKt$runFileDiagnosticsIfNotCorruption$1(continuationImpl);
        Object obj3 = fileStorageKt$runFileDiagnosticsIfNotCorruption$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fileStorageKt$runFileDiagnosticsIfNotCorruption$1.label;
    }

    public static f b(btq0 btq0Var, dxf0 dxf0Var, List list, tse tseVar, sls slsVar) {
        return new f(new n1r(btq0Var, new weu(12, tseVar), slsVar), Collections.singletonList(new DataMigrationInitializer$Companion$getInitializer$1(list, null)), dxf0Var, tseVar);
    }
}
