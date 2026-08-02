package com.yandex.div.storage.database;

import defpackage.sey0;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsey0;", "it", "", "b", "(Lsey0;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes11.dex */
public final class StorageStatements$writeTemplates$1$toString$1 extends Lambda implements tls {
    public static final StorageStatements$writeTemplates$1$toString$1 w = new StorageStatements$writeTemplates$1$toString$1(1);

    public StorageStatements$writeTemplates$1$toString$1() {
        super(1);
    }

    @Override // defpackage.tls
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final CharSequence invoke(sey0 sey0Var) {
        return sey0Var.getId() + '/' + sey0Var.getHash();
    }
}
