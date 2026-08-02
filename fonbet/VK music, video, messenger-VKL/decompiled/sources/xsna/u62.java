package xsna;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import com.vk.contacts.AndroidContact;
import com.vk.contacts.NoReadContactsPermissionException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.text.Regex;

/* compiled from: AndroidContactLoader.kt */
/* loaded from: classes.dex */
public final class u62 {
    public static final Regex b = new Regex("\\W*");
    public static final String[] c = {"lookup", "mimetype", "account_type", "data1", "display_name", "display_name_alt", "display_name_source", "starred"};
    public final Context a;

    public u62(Context context, apv0 apv0Var) {
        this.a = context;
    }

    public static AndroidContact a(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AndroidContact androidContact = (AndroidContact) it.next();
            linkedHashSet.addAll(androidContact.f());
            linkedHashSet2.addAll(androidContact.e());
        }
        return AndroidContact.a((AndroidContact) j5g.Y(list), null, linkedHashSet, linkedHashSet2, 23);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r3.intValue() == 1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AndroidContact c(Cursor cursor) {
        String F = fl3.F(cursor, "lookup");
        if (F == null) {
            return null;
        }
        long abs = Math.abs(F.hashCode());
        String F2 = fl3.F(cursor, "display_name");
        if (F2 == null && (F2 = fl3.F(cursor, "display_name_alt")) == null && (F2 = fl3.F(cursor, "display_name_source")) == null) {
            return null;
        }
        String str = F2;
        String E = fl3.E(cursor, "mimetype");
        Integer B = fl3.B(cursor, "starred");
        boolean z = B != null;
        boolean z2 = z;
        String F3 = fl3.F(cursor, "data1");
        if (F3 == null || F3.length() == 0) {
            return null;
        }
        return new AndroidContact(Long.valueOf(abs), str, z2, E.equals("vnd.android.cursor.item/phone_v2") ? Collections.singleton(b.g(F3, "")) : EmptySet.b, E.equals("vnd.android.cursor.item/phone_v2") ? Collections.singleton(F3) : EmptySet.b, E.equals("vnd.android.cursor.item/email_v2") ? Collections.singleton(F3) : EmptySet.b);
    }

    public final LinkedHashMap b() {
        Context context = this.a;
        if (!enj.l(context, "android.permission.READ_CONTACTS")) {
            throw new NoReadContactsPermissionException();
        }
        ContentResolver contentResolver = context.getContentResolver();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Cursor b2 = vkj.b(contentResolver, ContactsContract.Data.CONTENT_URI, c, "mimetype='vnd.android.cursor.item/phone_v2' OR\n                   mimetype='vnd.android.cursor.item/email_v2'\n                ", null, null, 0, 0, 248);
        if (b2 != null) {
            fl3.i(b2, new s62(this, "com.vkontakte.account", linkedHashMap, 0));
        }
        return linkedHashMap;
    }
}
