package com.yandex.div.storage;

import com.yandex.div.storage.database.DatabaseOpenHelper;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.epx;
import xsna.g0t;
import xsna.xzs;

/* compiled from: DivStorageImpl.kt */
/* loaded from: classes7.dex */
public /* synthetic */ class DivStorageImpl$openHelper$1 implements DatabaseOpenHelper.CreateCallback, g0t {
    final /* synthetic */ DivStorageImpl $tmp0;

    public DivStorageImpl$openHelper$1(DivStorageImpl divStorageImpl) {
        this.$tmp0 = divStorageImpl;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof DatabaseOpenHelper.CreateCallback) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, DivStorageImpl.class, "onCreate", "onCreate(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper.CreateCallback
    public final void onCreate(DatabaseOpenHelper.Database database) {
        this.$tmp0.onCreate(database);
    }
}
