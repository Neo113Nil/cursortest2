package com.yandex.div.storage.database;

import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.database.StorageStatements;
import defpackage.c9i0;
import defpackage.g9i0;
import defpackage.kju0;
import defpackage.lju0;
import defpackage.sey0;
import defpackage.tls;
import defpackage.xko;
import defpackage.zy11;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00122\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/div/storage/database/SingleTransactionDataSavePerformer;", "", "Lcom/yandex/div/storage/database/StorageStatementExecutor;", "storageStatementsExecutor", "<init>", "(Lcom/yandex/div/storage/database/StorageStatementExecutor;)V", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "actionOnError", "Lkotlin/Function1;", "", "Llju0;", "Lzy11;", "statementsBuilder", "Lxko;", "e", "(Lcom/yandex/div/storage/DivDataRepository$ActionOnError;Ltls;)Lxko;", "", "groupId", "", "Lc9i0;", kju0.b, "c", "(Ljava/lang/String;Ljava/util/List;)Llju0;", "Lg9i0;", "rawJsons", "d", "(Ljava/util/List;)Llju0;", "Lsey0;", "templatesByHash", "g", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)Lxko;", "h", "(Ljava/util/List;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)Lxko;", "a", "Lcom/yandex/div/storage/database/StorageStatementExecutor;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SingleTransactionDataSavePerformer {

    /* renamed from: a, reason: from kotlin metadata */
    private final StorageStatementExecutor storageStatementsExecutor;

    public SingleTransactionDataSavePerformer(StorageStatementExecutor storageStatementExecutor) {
        this.storageStatementsExecutor = storageStatementExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lju0 c(String groupId, List<? extends c9i0> cards) {
        return StorageStatements.l(StorageStatements.a, groupId, cards, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lju0 d(List<? extends g9i0> rawJsons) {
        return StorageStatements.n(StorageStatements.a, rawJsons, null, 2, null);
    }

    private final xko e(DivDataRepository.ActionOnError actionOnError, tls statementsBuilder) {
        ArrayList arrayList = new ArrayList();
        statementsBuilder.invoke(arrayList);
        StorageStatementExecutor storageStatementExecutor = this.storageStatementsExecutor;
        lju0[] lju0VarArr = (lju0[]) arrayList.toArray(new lju0[0]);
        return storageStatementExecutor.b(actionOnError, (lju0[]) Arrays.copyOf(lju0VarArr, lju0VarArr.length));
    }

    public static /* synthetic */ xko f(SingleTransactionDataSavePerformer singleTransactionDataSavePerformer, DivDataRepository.ActionOnError actionOnError, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            actionOnError = DivDataRepository.ActionOnError.ABORT_TRANSACTION;
        }
        return singleTransactionDataSavePerformer.e(actionOnError, tlsVar);
    }

    public final xko g(final String groupId, final List<? extends c9i0> cards, final List<sey0> templatesByHash, DivDataRepository.ActionOnError actionOnError) throws IOException {
        return e(actionOnError, new tls() { // from class: com.yandex.div.storage.database.SingleTransactionDataSavePerformer$saveDivData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void invoke(List<lju0> list) {
                lju0 c;
                StorageStatements storageStatements = StorageStatements.a;
                String str = groupId;
                List<sey0> list2 = templatesByHash;
                storageStatements.getClass();
                list.add(new StorageStatements.i(list2, str));
                c = this.c(groupId, cards);
                list.add(c);
                List<sey0> list3 = templatesByHash;
                storageStatements.getClass();
                list.add(new StorageStatements$writeTemplates$1(list3));
                storageStatements.getClass();
                list.add(new StorageStatements.c());
            }

            @Override // defpackage.tls
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<lju0>) obj);
                return zy11.a;
            }
        });
    }

    public final xko h(final List<? extends g9i0> rawJsons, DivDataRepository.ActionOnError actionOnError) throws IOException {
        return e(actionOnError, new tls() { // from class: com.yandex.div.storage.database.SingleTransactionDataSavePerformer$saveRawJsons$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void invoke(List<lju0> list) {
                lju0 d;
                d = SingleTransactionDataSavePerformer.this.d(rawJsons);
                list.add(d);
            }

            @Override // defpackage.tls
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<lju0>) obj);
                return zy11.a;
            }
        });
    }
}
