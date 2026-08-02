package com.yandex.div.storage.database;

import android.database.SQLException;
import defpackage.tls;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "failedTransactions", "Lzy11;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes11.dex */
public final class StorageStatements$replaceRawJsons$1 extends Lambda implements tls {
    public static final StorageStatements$replaceRawJsons$1 w = new StorageStatements$replaceRawJsons$1(1);

    public StorageStatements$replaceRawJsons$1() {
        super(1);
    }

    public final void invoke(List<String> list) {
        throw new SQLException("Insertion failed for raw jsons with ids: ".concat(kotlin.collections.a.X(list, null, null, null, null, 63)));
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<String>) obj);
        throw null;
    }
}
