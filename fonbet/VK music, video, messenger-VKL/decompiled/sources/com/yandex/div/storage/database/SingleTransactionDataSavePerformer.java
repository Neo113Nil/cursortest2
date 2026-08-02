package com.yandex.div.storage.database;

import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.rawjson.RawJson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xsna.izs;
import xsna.s3q0;

/* compiled from: SingleTransactionDataSavePerformer.kt */
/* loaded from: classes7.dex */
public final class SingleTransactionDataSavePerformer {
    private final StorageStatementExecutor storageStatementsExecutor;

    public SingleTransactionDataSavePerformer(StorageStatementExecutor storageStatementExecutor) {
        this.storageStatementsExecutor = storageStatementExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StorageStatement createRawJsonsSaveStatement(List<? extends RawJson> list) {
        return StorageStatements.replaceRawJsons$default(StorageStatements.INSTANCE, list, null, 2, null);
    }

    private final ExecutionResult executeStatements(DivDataRepository.ActionOnError actionOnError, izs<? super List<StorageStatement>, s3q0> izsVar) {
        ArrayList arrayList = new ArrayList();
        izsVar.invoke(arrayList);
        StorageStatementExecutor storageStatementExecutor = this.storageStatementsExecutor;
        StorageStatement[] storageStatementArr = (StorageStatement[]) arrayList.toArray(new StorageStatement[0]);
        return storageStatementExecutor.execute(actionOnError, (StorageStatement[]) Arrays.copyOf(storageStatementArr, storageStatementArr.length));
    }

    public final ExecutionResult saveRawJsons(final List<? extends RawJson> list, DivDataRepository.ActionOnError actionOnError) throws IOException {
        return executeStatements(actionOnError, new izs<List<StorageStatement>, s3q0>() { // from class: com.yandex.div.storage.database.SingleTransactionDataSavePerformer$saveRawJsons$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(List<StorageStatement> list2) {
                invoke2(list2);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<StorageStatement> list2) {
                StorageStatement createRawJsonsSaveStatement;
                createRawJsonsSaveStatement = SingleTransactionDataSavePerformer.this.createRawJsonsSaveStatement(list);
                list2.add(createRawJsonsSaveStatement);
            }
        });
    }
}
