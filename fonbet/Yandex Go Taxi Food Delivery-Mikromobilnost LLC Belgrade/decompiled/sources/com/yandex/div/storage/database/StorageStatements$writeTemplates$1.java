package com.yandex.div.storage.database;

import android.database.sqlite.SQLiteStatement;
import defpackage.axt0;
import defpackage.gju0;
import defpackage.lju0;
import defpackage.sey0;
import defpackage.uza;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/yandex/div/storage/database/StorageStatements$writeTemplates$1", "Llju0;", "Laxt0;", "compiler", "Lzy11;", "a", "(Laxt0;)V", "", "toString", "()Ljava/lang/String;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StorageStatements$writeTemplates$1 implements lju0 {
    final /* synthetic */ List<sey0> a;

    public StorageStatements$writeTemplates$1(List<sey0> list) {
        this.a = list;
    }

    @Override // defpackage.lju0
    public final void a(axt0 compiler) {
        SQLiteStatement g = compiler.g(gju0.e);
        for (sey0 sey0Var : this.a) {
            g.bindString(1, sey0Var.getHash());
            g.bindBlob(2, sey0Var.getTemplate().toString().getBytes(uza.a));
            g.executeInsert();
        }
    }

    public final String toString() {
        return "Write templates ".concat(kotlin.collections.a.X(this.a, null, null, null, StorageStatements$writeTemplates$1$toString$1.w, 31));
    }
}
