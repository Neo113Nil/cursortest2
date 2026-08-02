package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.axt0;
import defpackage.b64;
import defpackage.c9i0;
import defpackage.g9i0;
import defpackage.gju0;
import defpackage.kju0;
import defpackage.lju0;
import defpackage.oyr;
import defpackage.sey0;
import defpackage.tls;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0014\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u001a\b\u0002\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\t2\u001a\b\u0002\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0004\b!\u0010 J)\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00062\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b%\u0010&J1\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\u00020\f2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b,\u0010-J!\u0010.\u001a\u00020\f2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b.\u0010-J#\u0010/\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\f¢\u0006\u0004\b1\u0010\u001c¨\u00062"}, d2 = {"Lcom/yandex/div/storage/database/StorageStatements;", "", "<init>", "()V", "T", "", "", "b", "(Ljava/util/Collection;)Ljava/lang/String;", "", "Lsey0;", "templates", "Llju0;", "o", "(Ljava/util/List;)Llju0;", "Lg9i0;", "rawJsons", "Lkotlin/Function1;", "Lzy11;", "onFailedTransactions", "m", "(Ljava/util/List;Ltls;)Llju0;", "groupId", "Lc9i0;", kju0.b, "k", "(Ljava/lang/String;Ljava/util/List;Ltls;)Llju0;", "e", "()Llju0;", "", "elementIds", "c", "(Ljava/util/Set;)Llju0;", "d", "templateHash", "", TarifficatorScenarioActivity.RESULT_KEY, "h", "(Ljava/lang/String;Ltls;)Llju0;", "cardId", "g", "(Ljava/lang/String;Ljava/lang/String;Ltls;)Llju0;", "Lcom/yandex/div/storage/database/ReadState;", "reader", CoreConstants.PushMessage.SERVICE_TYPE, "(Ltls;)Llju0;", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "p", "(Ljava/lang/String;Ljava/util/List;)Llju0;", "f", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StorageStatements {
    public static final StorageStatements a = new StorageStatements();

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/yandex/div/storage/database/StorageStatements$a", "Llju0;", "Laxt0;", "compiler", "Lzy11;", "a", "(Laxt0;)V", "", "toString", "()Ljava/lang/String;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements lju0 {
        final /* synthetic */ Set<String> a;

        public a(Set<String> set) {
            this.a = set;
        }

        @Override // defpackage.lju0
        public final void a(axt0 compiler) {
            StorageStatements storageStatements = StorageStatements.a;
            SQLiteStatement g = compiler.g("DELETE FROM cards WHERE layout_id IN  ".concat(storageStatements.b(this.a)));
            SQLiteStatement g2 = compiler.g("\n    DELETE FROM template_references WHERE group_id IN\n ".concat(storageStatements.b(this.a)));
            g.executeUpdateDelete();
            g2.executeUpdateDelete();
        }

        public final String toString() {
            return "Deleting cards with ids: " + this.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/yandex/div/storage/database/StorageStatements$b", "Llju0;", "Laxt0;", "compiler", "Lzy11;", "a", "(Laxt0;)V", "", "toString", "()Ljava/lang/String;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements lju0 {
        final /* synthetic */ Set<String> a;

        public b(Set<String> set) {
            this.a = set;
        }

        @Override // defpackage.lju0
        public final void a(axt0 compiler) {
            compiler.g("DELETE FROM raw_json WHERE raw_json_id IN ".concat(StorageStatements.a.b(this.a))).executeUpdateDelete();
        }

        public final String toString() {
            return "Deleting raw jsons with ids: " + this.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/yandex/div/storage/database/StorageStatements$c", "Llju0;", "Laxt0;", "compiler", "Lzy11;", "a", "(Laxt0;)V", "", "toString", "()Ljava/lang/String;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements lju0 {
        @Override // defpackage.lju0
        public final void a(axt0 compiler) {
            compiler.g(gju0.g).executeUpdateDelete();
            compiler.g(gju0.f).executeUpdateDelete();
        }

        public final String toString() {
            return "Deleting unused templates";
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/yandex/div/storage/database/StorageStatements$d", "Llju0;", "Laxt0;", "compiler", "Lzy11;", "a", "(Laxt0;)V", "", "toString", "()Ljava/lang/String;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements lju0 {
        @Override // defpackage.lju0
        public final void a(axt0 compiler) {
            ArrayList arrayList = new ArrayList();
            ReadState k = compiler.k("SELECT name FROM sqlite_master WHERE type='table'", new String[0]);
            try {
                Cursor a = k.a();
                if (!a.moveToFirst()) {
                    k.close();
                    return;
                }
                do {
                    arrayList.add(a.getString(a.getColumnIndexOrThrow("name")));
                } while (a.moveToNext());
                k.close();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    compiler.g("DROP TABLE IF EXISTS " + ((String) it.next())).execute();
                }
            } finally {
            }
        }

        public final String toString() {
            return "Drop all database tables";
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/yandex/div/storage/database/StorageStatements$e", "Llju0;", "Laxt0;", "compiler", "Lzy11;", "a", "(Laxt0;)V", "", "toString", "()Ljava/lang/String;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements lju0 {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ tls c;

        public e(String str, String str2, tls tlsVar) {
            this.a = str;
            this.b = str2;
            this.c = tlsVar;
        }

        @Override // defpackage.lju0
        public final void a(axt0 compiler) {
            StringBuilder sb = new StringBuilder("SELECT 1 FROM cards WHERE layout_id == '");
            sb.append(this.a);
            sb.append("' AND group_id == '");
            ReadState k = compiler.k(b64.p(sb, this.b, '\''), new String[0]);
            try {
                this.c.invoke(Boolean.valueOf(k.a().getCount() > 0));
                k.close();
            } finally {
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Check card '");
            sb.append(this.a);
            sb.append("' with group '");
            return oyr.t(sb, this.b, "' exists");
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/yandex/div/storage/database/StorageStatements$f", "Llju0;", "Laxt0;", "compiler", "Lzy11;", "a", "(Laxt0;)V", "", "toString", "()Ljava/lang/String;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f implements lju0 {
        final /* synthetic */ String a;
        final /* synthetic */ tls b;

        public f(String str, tls tlsVar) {
            this.a = str;
            this.b = tlsVar;
        }

        @Override // defpackage.lju0
        public final void a(axt0 compiler) {
            ReadState k = compiler.k(oyr.t(new StringBuilder("SELECT 1 FROM templates WHERE template_hash == '"), this.a, "' "), new String[0]);
            try {
                this.b.invoke(Boolean.valueOf(k.a().getCount() > 0));
                k.close();
            } finally {
            }
        }

        public final String toString() {
            return oyr.t(new StringBuilder("Check template '"), this.a, "' exists in group");
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/yandex/div/storage/database/StorageStatements$g", "Llju0;", "Laxt0;", "compiler", "Lzy11;", "a", "(Laxt0;)V", "", "toString", "()Ljava/lang/String;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g implements lju0 {
        final /* synthetic */ tls a;

        public g(tls tlsVar) {
            this.a = tlsVar;
        }

        @Override // defpackage.lju0
        public final void a(axt0 compiler) {
            ReadState k = compiler.k("SELECT * FROM cards", new String[0]);
            try {
                this.a.invoke(k);
                k.close();
            } finally {
            }
        }

        public final String toString() {
            return "Selecting all div data";
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/yandex/div/storage/database/StorageStatements$h", "Llju0;", "Laxt0;", "compiler", "Lzy11;", "a", "(Laxt0;)V", "", "toString", "()Ljava/lang/String;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h implements lju0 {
        final /* synthetic */ tls a;

        public h(tls tlsVar) {
            this.a = tlsVar;
        }

        @Override // defpackage.lju0
        public final void a(axt0 compiler) {
            ReadState k = compiler.k("SELECT * FROM raw_json", new String[0]);
            try {
                this.a.invoke(k);
                k.close();
            } finally {
            }
        }

        public final String toString() {
            return "Selecting all raw jsons";
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/yandex/div/storage/database/StorageStatements$i", "Llju0;", "Laxt0;", "compiler", "Lzy11;", "a", "(Laxt0;)V", "", "toString", "()Ljava/lang/String;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class i implements lju0 {
        final /* synthetic */ List<sey0> a;
        final /* synthetic */ String b;

        public i(List<sey0> list, String str) {
            this.a = list;
            this.b = str;
        }

        @Override // defpackage.lju0
        public final void a(axt0 compiler) {
            SQLiteStatement g = compiler.g(gju0.i);
            List<sey0> list = this.a;
            String str = this.b;
            for (sey0 sey0Var : list) {
                g.bindString(1, str);
                g.bindString(2, sey0Var.getId());
                g.bindString(3, sey0Var.getHash());
                g.executeInsert();
            }
        }

        public final String toString() {
            return "Write template usages for " + this.b;
        }
    }

    private StorageStatements() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> String b(Collection<? extends T> collection) {
        return kotlin.collections.a.X(collection, "', '", "('", "')", null, 56);
    }

    public static lju0 l(StorageStatements storageStatements, String str, List list, tls tlsVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            tlsVar = StorageStatements$replaceCards$1.w;
        }
        storageStatements.getClass();
        return new StorageStatements$replaceCards$2(list, tlsVar, str);
    }

    public static lju0 n(StorageStatements storageStatements, List list, tls tlsVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            tlsVar = StorageStatements$replaceRawJsons$1.w;
        }
        storageStatements.getClass();
        return new StorageStatements$replaceRawJsons$2(list, tlsVar);
    }

    public final lju0 c(Set<String> elementIds) {
        return new a(elementIds);
    }

    public final lju0 d(Set<String> elementIds) {
        return new b(elementIds);
    }

    public final lju0 e() {
        return new c();
    }

    public final lju0 f() {
        return new d();
    }

    public final lju0 g(String cardId, String groupId, tls result) {
        return new e(cardId, groupId, result);
    }

    public final lju0 h(String templateHash, tls result) {
        return new f(templateHash, result);
    }

    public final lju0 i(tls reader) {
        return new g(reader);
    }

    public final lju0 j(tls reader) {
        return new h(reader);
    }

    public final lju0 k(String groupId, List<? extends c9i0> cards, tls onFailedTransactions) {
        return new StorageStatements$replaceCards$2(cards, onFailedTransactions, groupId);
    }

    public final lju0 m(List<? extends g9i0> rawJsons, tls onFailedTransactions) {
        return new StorageStatements$replaceRawJsons$2(rawJsons, onFailedTransactions);
    }

    public final lju0 o(List<sey0> templates) {
        return new StorageStatements$writeTemplates$1(templates);
    }

    public final lju0 p(String groupId, List<sey0> templates) {
        return new i(templates, groupId);
    }
}
