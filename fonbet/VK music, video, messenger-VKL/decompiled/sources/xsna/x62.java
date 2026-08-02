package xsna;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.vk.contacts.AndroidContact;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.bridge.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class x62 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Collection c;

    public /* synthetic */ x62(int i, Collection collection) {
        this.b = i;
        this.c = collection;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Collection collection = this.c;
        switch (i) {
            case 0:
                SQLiteStatement compileStatement = ((SQLiteDatabase) obj).compileStatement("\n            REPLACE INTO android_contacts (id, android_id, name, is_favorite, phones, original_phones, emails)\n            VALUES(?, ?, ?, ?, ?, ?, ?)\n        ");
                try {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            s3q0 s3q0Var = s3q0.a;
                            ro.e(compileStatement, null);
                            return s3q0.a;
                        }
                        AndroidContact androidContact = (AndroidContact) it.next();
                        long j = androidContact.h;
                        Set<String> set = androidContact.g;
                        Set<String> set2 = androidContact.f;
                        Set<String> set3 = androidContact.e;
                        compileStatement.bindLong(1, j);
                        Long l = androidContact.b;
                        if (l == null) {
                            compileStatement.bindNull(2);
                        } else {
                            compileStatement.bindLong(2, l.longValue());
                        }
                        compileStatement.bindString(3, androidContact.c);
                        compileStatement.bindLong(4, androidContact.d ? 1L : 0L);
                        String k = !set3.isEmpty() ? p4g.k(set3, StringUtils.COMMA, null) : null;
                        if (k == null) {
                            compileStatement.bindNull(5);
                        } else {
                            compileStatement.bindString(5, k);
                        }
                        String k2 = !set2.isEmpty() ? p4g.k(set2, StringUtils.COMMA, null) : null;
                        if (k2 == null) {
                            compileStatement.bindNull(6);
                        } else {
                            compileStatement.bindString(6, k2);
                        }
                        String k3 = set.isEmpty() ? null : p4g.k(set, StringUtils.COMMA, null);
                        if (k3 == null) {
                            compileStatement.bindNull(7);
                        } else {
                            compileStatement.bindString(7, k3);
                        }
                        compileStatement.executeInsert();
                    }
                } finally {
                }
            default:
                return new b.a((StickerStockItem) obj, new GiftData(collection, false));
        }
    }
}
