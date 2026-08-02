package com.yandex.div.storage.database;

import android.database.sqlite.SQLiteStatement;
import defpackage.axt0;
import defpackage.c9i0;
import defpackage.gju0;
import defpackage.i3y;
import defpackage.lju0;
import defpackage.oyr;
import defpackage.sls;
import defpackage.tls;
import defpackage.uza;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00022\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"com/yandex/div/storage/database/StorageStatements$replaceCards$2", "Llju0;", "Lorg/json/JSONObject;", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lzy11;", "errorHandler", "", "c", "(Lorg/json/JSONObject;Ltls;)[B", "Laxt0;", "compiler", "a", "(Laxt0;)V", "", "toString", "()Ljava/lang/String;", "Li3y;", "b", "cardIdsString", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StorageStatements$replaceCards$2 implements lju0 {

    /* renamed from: a, reason: from kotlin metadata */
    private final i3y cardIdsString;
    final /* synthetic */ List<c9i0> b;
    final /* synthetic */ tls c;
    final /* synthetic */ String d;

    /* JADX WARN: Multi-variable type inference failed */
    public StorageStatements$replaceCards$2(final List<? extends c9i0> list, tls tlsVar, String str) {
        this.b = list;
        this.c = tlsVar;
        this.d = str;
        this.cardIdsString = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.div.storage.database.StorageStatements$replaceCards$2$cardIdsString$2

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc9i0;", "it", "", "b", "(Lc9i0;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: com.yandex.div.storage.database.StorageStatements$replaceCards$2$cardIdsString$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends Lambda implements tls {
                public static final AnonymousClass1 w = new AnonymousClass1(1);

                public AnonymousClass1() {
                    super(1);
                }

                public final CharSequence b(c9i0 c9i0Var) {
                    return c9i0Var.getId();
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    return ((c9i0) obj).getId();
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

    private final byte[] c(JSONObject jSONObject, tls tlsVar) {
        try {
            return jSONObject.toString().getBytes(uza.a);
        } catch (ConcurrentModificationException e) {
            tlsVar.invoke(e);
            return null;
        }
    }

    @Override // defpackage.lju0
    public final void a(axt0 compiler) {
        byte[] bArr;
        final ArrayList arrayList = new ArrayList();
        SQLiteStatement g = compiler.g(gju0.a);
        List<c9i0> list = this.b;
        String str = this.d;
        for (c9i0 c9i0Var : list) {
            final String id = c9i0Var.getId();
            tls tlsVar = new tls() { // from class: com.yandex.div.storage.database.StorageStatements$replaceCards$2$execute$1$errorHandler$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(Exception exc) {
                    arrayList.add(id);
                    exc.getClass();
                }

                @Override // defpackage.tls
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((Exception) obj);
                    return zy11.a;
                }
            };
            byte[] c = c(c9i0Var.getDivData(), tlsVar);
            if (c != null) {
                JSONObject jSONObject = c9i0Var.getKju0.j java.lang.String();
                if (jSONObject != null) {
                    bArr = c(jSONObject, tlsVar);
                    if (bArr == null) {
                    }
                } else {
                    bArr = null;
                }
                g.bindString(1, id);
                g.bindBlob(2, c);
                if (bArr == null) {
                    g.bindNull(3);
                } else {
                    g.bindBlob(3, bArr);
                }
                g.bindString(4, str);
                long executeInsert = g.executeInsert();
                if ((executeInsert < 0 ? Long.valueOf(executeInsert) : null) != null) {
                    arrayList.add(id);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.c.invoke(arrayList);
    }

    public final String toString() {
        return oyr.t(new StringBuilder("Replace cards ("), b(), ")}");
    }
}
