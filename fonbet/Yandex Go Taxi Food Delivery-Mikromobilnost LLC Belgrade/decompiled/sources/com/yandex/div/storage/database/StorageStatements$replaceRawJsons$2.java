package com.yandex.div.storage.database;

import android.database.sqlite.SQLiteStatement;
import defpackage.axt0;
import defpackage.b64;
import defpackage.g9i0;
import defpackage.gju0;
import defpackage.i3y;
import defpackage.lju0;
import defpackage.sls;
import defpackage.tls;
import defpackage.uza;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"com/yandex/div/storage/database/StorageStatements$replaceRawJsons$2", "Llju0;", "Laxt0;", "compiler", "Lzy11;", "a", "(Laxt0;)V", "", "toString", "()Ljava/lang/String;", "Li3y;", "b", "cardIdsString", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StorageStatements$replaceRawJsons$2 implements lju0 {

    /* renamed from: a, reason: from kotlin metadata */
    private final i3y cardIdsString;
    final /* synthetic */ List<g9i0> b;
    final /* synthetic */ tls c;

    /* JADX WARN: Multi-variable type inference failed */
    public StorageStatements$replaceRawJsons$2(final List<? extends g9i0> list, tls tlsVar) {
        this.b = list;
        this.c = tlsVar;
        this.cardIdsString = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.div.storage.database.StorageStatements$replaceRawJsons$2$cardIdsString$2

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg9i0;", "it", "", "b", "(Lg9i0;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: com.yandex.div.storage.database.StorageStatements$replaceRawJsons$2$cardIdsString$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends Lambda implements tls {
                public static final AnonymousClass1 w = new AnonymousClass1(1);

                public AnonymousClass1() {
                    super(1);
                }

                public final CharSequence b(g9i0 g9i0Var) {
                    return g9i0Var.getId();
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    return ((g9i0) obj).getId();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final String invoke() {
                return kotlin.collections.a.X(list, null, null, null, AnonymousClass1.w, 31);
            }
        });
    }

    private final String b() {
        return (String) this.cardIdsString.getValue();
    }

    @Override // defpackage.lju0
    public final void a(axt0 compiler) {
        ArrayList arrayList = new ArrayList();
        SQLiteStatement g = compiler.g(gju0.l);
        for (g9i0 g9i0Var : this.b) {
            g.bindString(1, g9i0Var.getId());
            g.bindBlob(2, g9i0Var.getData().toString().getBytes(uza.a));
            long executeInsert = g.executeInsert();
            Long valueOf = Long.valueOf(executeInsert);
            if (executeInsert >= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                arrayList.add(g9i0Var.getId());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.c.invoke(arrayList);
    }

    public final String toString() {
        return b64.p(new StringBuilder("Replace raw jsons ("), b(), ')');
    }
}
