package com.yandex.div.storage.database;

import android.database.SQLException;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.DivStorageErrorException;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.util.SqlExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.gzs;
import xsna.vu5;

/* compiled from: StorageStatementExecutor.kt */
/* loaded from: classes7.dex */
public final class StorageStatementExecutor {
    private final gzs<DatabaseOpenHelper.Database> dbProvider;

    /* compiled from: StorageStatementExecutor.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivDataRepository.ActionOnError.values().length];
            try {
                iArr[DivDataRepository.ActionOnError.ABORT_TRANSACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivDataRepository.ActionOnError.SKIP_ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StorageStatementExecutor(gzs<? extends DatabaseOpenHelper.Database> gzsVar) {
        this.dbProvider = gzsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void execute$executeCatchingSqlException(Ref$ObjectRef<StorageStatement> ref$ObjectRef, Ref$IntRef ref$IntRef, StorageStatement[] storageStatementArr, DivDataRepository.ActionOnError actionOnError, StorageStatementExecutor storageStatementExecutor, List<DivStorageErrorException> list, ClosableSqlCompiler closableSqlCompiler, StorageStatement storageStatement) {
        try {
            storageStatement.execute(closableSqlCompiler);
        } catch (SQLException e) {
            execute$handleException(ref$ObjectRef, ref$IntRef, storageStatementArr, actionOnError, storageStatementExecutor, list, storageStatement);
        } catch (IllegalStateException e2) {
            execute$handleException(ref$ObjectRef, ref$IntRef, storageStatementArr, actionOnError, storageStatementExecutor, list, storageStatement);
        }
    }

    private static final void execute$handleException(Ref$ObjectRef<StorageStatement> ref$ObjectRef, Ref$IntRef ref$IntRef, StorageStatement[] storageStatementArr, DivDataRepository.ActionOnError actionOnError, StorageStatementExecutor storageStatementExecutor, List<DivStorageErrorException> list, Exception exc) {
        StringBuilder sb = new StringBuilder("Exception at statement '");
        sb.append(ref$ObjectRef.element);
        sb.append("' (");
        sb.append(ref$IntRef.element);
        sb.append(" out ");
        String b = vu5.b(sb, storageStatementArr.length, ')');
        int i = WhenMappings.$EnumSwitchMapping$0[actionOnError.ordinal()];
        if (i == 1) {
            storageStatementExecutor.throwWithLogging(b, exc);
            throw new KotlinNothingValueException();
        }
        if (i != 2) {
            return;
        }
        list.add(new DivStorageErrorException(b, exc, null, 4, null));
    }

    private final Void throwWithLogging(String str, Exception exc) throws SQLException {
        throw new SQLException(str, exc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        if (r3 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        com.yandex.div.storage.util.SqlExtensionsKt.closeSilently(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        if (r3 != null) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, com.yandex.div.storage.database.StorageStatement] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExecutionResult execute(DivDataRepository.ActionOnError actionOnError, StorageStatement... storageStatementArr) throws SQLException {
        ClosableSqlCompiler closableSqlCompiler;
        IllegalStateException illegalStateException;
        SQLException sQLException;
        StorageStatement[] storageStatementArr2 = storageStatementArr;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 1;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ArrayList arrayList = new ArrayList();
        DatabaseOpenHelper.Database database = null;
        try {
            try {
                DatabaseOpenHelper.Database invoke = this.dbProvider.invoke();
                try {
                    closableSqlCompiler = new ClosableSqlCompiler(invoke);
                    try {
                        invoke.beginTransaction();
                        int length = storageStatementArr2.length;
                        int i = 0;
                        StorageStatement[] storageStatementArr3 = storageStatementArr2;
                        while (i < length) {
                            ?? r7 = storageStatementArr3[i];
                            ref$ObjectRef.element = r7;
                            execute$executeCatchingSqlException(ref$ObjectRef, ref$IntRef, storageStatementArr3, actionOnError, this, arrayList, closableSqlCompiler, r7);
                            ref$IntRef.element++;
                            i++;
                            storageStatementArr3 = storageStatementArr;
                        }
                        invoke.setTransactionSuccessful();
                        SqlExtensionsKt.endTransactionSilently(invoke);
                        closableSqlCompiler.close();
                        SqlExtensionsKt.closeSilently(invoke);
                    } catch (SQLException e) {
                        sQLException = e;
                        database = invoke;
                        arrayList.add(new DivStorageErrorException("Error during statements execution.", sQLException, null, 4, null));
                        if (database != null) {
                            SqlExtensionsKt.endTransactionSilently(database);
                        }
                        if (closableSqlCompiler != null) {
                            closableSqlCompiler.close();
                        }
                    } catch (IllegalStateException e2) {
                        illegalStateException = e2;
                        database = invoke;
                        arrayList.add(new DivStorageErrorException("Error during statements execution.", illegalStateException, null, 4, null));
                        if (database != null) {
                            SqlExtensionsKt.endTransactionSilently(database);
                        }
                        if (closableSqlCompiler != null) {
                            closableSqlCompiler.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        database = invoke;
                        if (database != null) {
                            SqlExtensionsKt.endTransactionSilently(database);
                        }
                        if (closableSqlCompiler != null) {
                            closableSqlCompiler.close();
                        }
                        if (database != null) {
                            SqlExtensionsKt.closeSilently(database);
                        }
                        throw th;
                    }
                } catch (SQLException e3) {
                    sQLException = e3;
                    closableSqlCompiler = null;
                } catch (IllegalStateException e4) {
                    illegalStateException = e4;
                    closableSqlCompiler = null;
                } catch (Throwable th2) {
                    th = th2;
                    closableSqlCompiler = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (SQLException e5) {
            sQLException = e5;
            closableSqlCompiler = null;
        } catch (IllegalStateException e6) {
            illegalStateException = e6;
            closableSqlCompiler = null;
        } catch (Throwable th4) {
            th = th4;
            closableSqlCompiler = null;
        }
        return new ExecutionResult(arrayList);
    }

    public final ExecutionResult execute(StorageStatement... storageStatementArr) throws SQLException {
        return execute(DivDataRepository.ActionOnError.ABORT_TRANSACTION, (StorageStatement[]) Arrays.copyOf(storageStatementArr, storageStatementArr.length));
    }
}
