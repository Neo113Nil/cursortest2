package com.yandex.div.storage.database;

import android.database.SQLException;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.DivStorageErrorException;
import com.yandex.div.storage.database.c;
import defpackage.lju0;
import defpackage.oyr;
import defpackage.sls;
import defpackage.tls;
import defpackage.xko;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0016\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u000e0\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0014\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u001a\"\u00020\tH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\u001c2\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u001a\"\u00020\tH\u0007¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/div/storage/database/StorageStatementExecutor;", "", "Lkotlin/Function0;", "Lcom/yandex/div/storage/database/c$b;", "dbProvider", "<init>", "(Lsls;)V", "Lcom/yandex/div/storage/database/b;", "compiler", "Llju0;", "statement", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lzy11;", "handleException", "d", "(Lcom/yandex/div/storage/database/b;Llju0;Ltls;)V", "", Constants.KEY_MESSAGE, Constants.KEY_EXCEPTION, "", "e", "(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Void;", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "actionOnError", "", "statements", "Lxko;", "b", "(Lcom/yandex/div/storage/DivDataRepository$ActionOnError;[Llju0;)Lxko;", "c", "([Llju0;)Lxko;", "a", "Lsls;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StorageStatementExecutor {

    /* renamed from: a, reason: from kotlin metadata */
    private final sls dbProvider;

    public StorageStatementExecutor(sls slsVar) {
        this.dbProvider = slsVar;
    }

    public static final Void a(StorageStatementExecutor storageStatementExecutor, String str, Exception exc) {
        storageStatementExecutor.getClass();
        throw new SQLException(str, exc);
    }

    private final void d(b compiler, lju0 statement, tls handleException) {
        try {
            statement.a(compiler);
        } catch (SQLException e) {
            handleException.invoke(e);
        } catch (IllegalStateException e2) {
            handleException.invoke(e2);
        }
    }

    private final Void e(String message, Exception exception) throws SQLException {
        throw new SQLException(message, exception);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        if (r4 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        r4.close();
        r4 = r4;
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0093, code lost:
    
        if (r4 != 0) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [T, lju0] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.yandex.div.storage.database.StorageStatementExecutor] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [com.yandex.div.storage.database.b] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [com.yandex.div.storage.database.b] */
    /* JADX WARN: Type inference failed for: r3v1, types: [lju0[]] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.yandex.div.storage.database.c$b] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.yandex.div.storage.database.c$b] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xko b(DivDataRepository.ActionOnError actionOnError, lju0... statements) throws SQLException {
        b bVar;
        Throwable th;
        IllegalStateException illegalStateException;
        SQLException sQLException;
        c.b bVar2;
        IllegalStateException illegalStateException2;
        SQLException sQLException2;
        lju0[] lju0VarArr = statements;
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 1;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final ArrayList arrayList = new ArrayList();
        ?? r4 = 0;
        DivDataRepository.ActionOnError actionOnError2 = null;
        b bVar3 = null;
        b bVar4 = null;
        r4 = 0;
        r4 = 0;
        c.b bVar5 = null;
        try {
            try {
                try {
                    bVar2 = (c.b) this.dbProvider.invoke();
                    try {
                        bVar = new b(bVar2);
                    } catch (SQLException e) {
                        sQLException2 = e;
                    } catch (IllegalStateException e2) {
                        illegalStateException2 = e2;
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = null;
                    }
                } catch (IOException unused) {
                }
            } catch (SQLException e3) {
                sQLException = e3;
                this = 0;
            } catch (IllegalStateException e4) {
                illegalStateException = e4;
                this = 0;
            } catch (Throwable th3) {
                th = th3;
                bVar = null;
            }
        } catch (Throwable th4) {
            bVar = this;
            th = th4;
            bVar5 = r4;
        }
        try {
            bVar2.i();
            int length = lju0VarArr.length;
            int i = 0;
            final ?? r3 = lju0VarArr;
            while (i < length) {
                ?? r13 = r3[i];
                ref$ObjectRef.element = r13;
                final DivDataRepository.ActionOnError actionOnError3 = actionOnError;
                d(bVar, r13, new tls() { // from class: com.yandex.div.storage.database.StorageStatementExecutor$execute$1$1

                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    public static final /* synthetic */ class a {
                        public static final /* synthetic */ int[] a;

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
                            a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(Exception exc) {
                        StringBuilder sb = new StringBuilder("Exception at statement '");
                        sb.append(ref$ObjectRef.element);
                        sb.append("' (");
                        sb.append(ref$IntRef.element);
                        sb.append(" out ");
                        String s = oyr.s(sb, r3.length, ')');
                        int i2 = a.a[actionOnError3.ordinal()];
                        if (i2 == 1) {
                            StorageStatementExecutor.a(this, s, exc);
                            throw null;
                        }
                        if (i2 != 2) {
                            return;
                        }
                        arrayList.add(new DivStorageErrorException(s, exc, null, 4, null));
                    }

                    @Override // defpackage.tls
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((Exception) obj);
                        return zy11.a;
                    }
                });
                ref$IntRef.element++;
                i++;
                r3 = statements;
                actionOnError2 = actionOnError3;
            }
            bVar2.s();
            try {
                bVar2.t();
            } catch (IllegalStateException unused2) {
            }
            bVar.close();
            bVar2.close();
            r4 = actionOnError2;
            this = this;
        } catch (SQLException e5) {
            sQLException2 = e5;
            bVar3 = bVar;
            sQLException = sQLException2;
            this = bVar3;
            r4 = bVar2;
            arrayList.add(new DivStorageErrorException("Error during statements execution.", sQLException, null, 4, null));
            if (r4 != 0) {
                try {
                    r4.t();
                } catch (IllegalStateException unused3) {
                }
            }
            if (this != 0) {
                this.close();
            }
        } catch (IllegalStateException e6) {
            illegalStateException2 = e6;
            bVar4 = bVar;
            illegalStateException = illegalStateException2;
            this = bVar4;
            r4 = bVar2;
            arrayList.add(new DivStorageErrorException("Error during statements execution.", illegalStateException, null, 4, null));
            if (r4 != 0) {
                try {
                    r4.t();
                } catch (IllegalStateException unused4) {
                }
            }
            if (this != 0) {
                this.close();
            }
        } catch (Throwable th5) {
            th = th5;
            bVar5 = bVar2;
            if (bVar5 != null) {
                try {
                    bVar5.t();
                } catch (IllegalStateException unused5) {
                }
            }
            if (bVar != null) {
                bVar.close();
            }
            if (bVar5 == null) {
                throw th;
            }
            try {
                bVar5.close();
                throw th;
            } catch (IOException unused6) {
                throw th;
            }
        }
        return new xko(arrayList);
    }

    public final xko c(lju0... statements) throws SQLException {
        return b(DivDataRepository.ActionOnError.ABORT_TRANSACTION, (lju0[]) Arrays.copyOf(statements, statements.length));
    }
}
