package androidx.datastore.core;

import defpackage.evu0;
import defpackage.ny61;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes.dex */
public final class i {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0070 -> B:10:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i iVar, FileOutputStream fileOutputStream, ContinuationImpl continuationImpl) {
        MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1;
        int i;
        long j;
        MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12;
        iVar.getClass();
        if (continuationImpl instanceof MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) {
            multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 = (MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) continuationImpl;
            int i2 = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.J$0;
                    fileOutputStream = (FileOutputStream) multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.L$0;
                    kotlin.b.b(obj);
                    multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12 = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1;
                    j *= 2;
                    if (j <= 60000) {
                        return fileOutputStream.getChannel().lock(0L, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, false);
                    }
                    try {
                    } catch (IOException e) {
                        String message = e.getMessage();
                        if (message == null || !evu0.y(message, "Resource deadlock would occur", false)) {
                            throw e;
                        }
                        multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12.L$0 = fileOutputStream;
                        multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12.J$0 = j;
                        multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12.label = 1;
                        if (kotlinx.coroutines.a.i(j, multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return fileOutputStream.getChannel().lock(0L, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, false);
                }
                kotlin.b.b(obj);
                j = 10;
                multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$12 = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1;
                if (j <= 60000) {
                }
            }
        }
        multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 = new MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1(iVar, continuationImpl);
        Object obj2 = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label;
        if (i == 0) {
        }
    }
}
