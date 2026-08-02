package defpackage;

import android.database.Cursor;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes11.dex */
public abstract class njb1 {
    public static final void a(qxa qxaVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-165187847);
        int i2 = (btsVar.k(qxaVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c.a(null, null, null, false, false, null, null, null, null, null, null, wwg.S(1135836761, true, new l0(12, qxaVar, tlsVar), btsVar), btsVar, 0, 48, 2047);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(qxaVar, tlsVar, i, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static q2x0 b(Cursor cursor) {
        Object valueOf;
        String str;
        String obj;
        Object valueOf2;
        Object valueOf3;
        String str2;
        q2x0 q2x0Var;
        Object valueOf4;
        String str3;
        Object valueOf5;
        String str4;
        String str5;
        Object valueOf6;
        String str6;
        int i;
        String str7;
        Object valueOf7;
        Object valueOf8;
        Object valueOf9;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("display_name");
        boolean isNull = cursor.isNull(columnIndexOrThrow);
        Class cls = Boolean.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Short.TYPE;
        Class cls5 = Integer.TYPE;
        Class cls6 = Long.TYPE;
        if (isNull) {
            str = null;
        } else {
            g0c a = qoi0.a(String.class);
            if (a.equals(qoi0.a(String.class))) {
                valueOf = cursor.getString(columnIndexOrThrow);
            } else if (a.equals(qoi0.a(cls6))) {
                valueOf = Long.valueOf(cursor.getLong(columnIndexOrThrow));
            } else if (a.equals(qoi0.a(cls5))) {
                valueOf = Integer.valueOf(cursor.getInt(columnIndexOrThrow));
            } else if (a.equals(qoi0.a(cls4))) {
                valueOf = Short.valueOf(cursor.getShort(columnIndexOrThrow));
            } else if (a.equals(qoi0.a(cls3))) {
                valueOf = Float.valueOf(cursor.getFloat(columnIndexOrThrow));
            } else if (a.equals(qoi0.a(cls2))) {
                valueOf = Double.valueOf(cursor.getDouble(columnIndexOrThrow));
            } else if (a.equals(qoi0.a(byte[].class))) {
                valueOf = cursor.getBlob(columnIndexOrThrow);
            } else {
                if (!a.equals(qoi0.a(cls))) {
                    qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                    return null;
                }
                valueOf = Boolean.valueOf(cursor.getInt(columnIndexOrThrow) != 0);
            }
            str = (String) valueOf;
        }
        if (str == null || (obj = evu0.k0(str).toString()) == null) {
            return null;
        }
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("mimetype");
        g0c a2 = qoi0.a(String.class);
        if (a2.equals(qoi0.a(String.class))) {
            valueOf2 = cursor.getString(columnIndexOrThrow2);
        } else if (a2.equals(qoi0.a(cls6))) {
            valueOf2 = Long.valueOf(cursor.getLong(columnIndexOrThrow2));
        } else if (a2.equals(qoi0.a(cls5))) {
            valueOf2 = Integer.valueOf(cursor.getInt(columnIndexOrThrow2));
        } else if (a2.equals(qoi0.a(cls4))) {
            valueOf2 = Short.valueOf(cursor.getShort(columnIndexOrThrow2));
        } else if (a2.equals(qoi0.a(cls3))) {
            valueOf2 = Float.valueOf(cursor.getFloat(columnIndexOrThrow2));
        } else if (a2.equals(qoi0.a(cls2))) {
            valueOf2 = Double.valueOf(cursor.getDouble(columnIndexOrThrow2));
        } else if (a2.equals(qoi0.a(byte[].class))) {
            valueOf2 = cursor.getBlob(columnIndexOrThrow2);
        } else {
            if (!a2.equals(qoi0.a(cls))) {
                qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                return null;
            }
            valueOf2 = Boolean.valueOf(cursor.getInt(columnIndexOrThrow2) != 0);
        }
        String str8 = (String) valueOf2;
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("data1");
        if (cursor.isNull(columnIndexOrThrow3)) {
            str2 = null;
        } else {
            g0c a3 = qoi0.a(String.class);
            if (a3.equals(qoi0.a(String.class))) {
                valueOf3 = cursor.getString(columnIndexOrThrow3);
            } else if (a3.equals(qoi0.a(cls6))) {
                valueOf3 = Long.valueOf(cursor.getLong(columnIndexOrThrow3));
            } else if (a3.equals(qoi0.a(cls5))) {
                valueOf3 = Integer.valueOf(cursor.getInt(columnIndexOrThrow3));
            } else if (a3.equals(qoi0.a(cls4))) {
                valueOf3 = Short.valueOf(cursor.getShort(columnIndexOrThrow3));
            } else if (a3.equals(qoi0.a(cls3))) {
                valueOf3 = Float.valueOf(cursor.getFloat(columnIndexOrThrow3));
            } else if (a3.equals(qoi0.a(cls2))) {
                valueOf3 = Double.valueOf(cursor.getDouble(columnIndexOrThrow3));
            } else if (a3.equals(qoi0.a(byte[].class))) {
                valueOf3 = cursor.getBlob(columnIndexOrThrow3);
            } else {
                if (!a3.equals(qoi0.a(cls))) {
                    qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                    return null;
                }
                valueOf3 = Boolean.valueOf(cursor.getInt(columnIndexOrThrow3) != 0);
            }
            str2 = (String) valueOf3;
        }
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("data2");
        if (cursor.isNull(columnIndexOrThrow4)) {
            str3 = null;
            q2x0Var = 0;
        } else {
            g0c a4 = qoi0.a(String.class);
            q2x0Var = 0;
            if (a4.equals(qoi0.a(String.class))) {
                valueOf4 = cursor.getString(columnIndexOrThrow4);
            } else if (a4.equals(qoi0.a(cls6))) {
                valueOf4 = Long.valueOf(cursor.getLong(columnIndexOrThrow4));
            } else if (a4.equals(qoi0.a(cls5))) {
                valueOf4 = Integer.valueOf(cursor.getInt(columnIndexOrThrow4));
            } else if (a4.equals(qoi0.a(cls4))) {
                valueOf4 = Short.valueOf(cursor.getShort(columnIndexOrThrow4));
            } else if (a4.equals(qoi0.a(cls3))) {
                valueOf4 = Float.valueOf(cursor.getFloat(columnIndexOrThrow4));
            } else if (a4.equals(qoi0.a(cls2))) {
                valueOf4 = Double.valueOf(cursor.getDouble(columnIndexOrThrow4));
            } else if (a4.equals(qoi0.a(byte[].class))) {
                valueOf4 = cursor.getBlob(columnIndexOrThrow4);
            } else {
                if (!a4.equals(qoi0.a(cls))) {
                    qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                    return null;
                }
                valueOf4 = Boolean.valueOf(cursor.getInt(columnIndexOrThrow4) != 0);
            }
            str3 = (String) valueOf4;
        }
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("data3");
        if (cursor.isNull(columnIndexOrThrow5)) {
            str4 = q2x0Var;
        } else {
            g0c a5 = qoi0.a(String.class);
            if (a5.equals(qoi0.a(String.class))) {
                valueOf5 = cursor.getString(columnIndexOrThrow5);
            } else if (a5.equals(qoi0.a(cls6))) {
                valueOf5 = Long.valueOf(cursor.getLong(columnIndexOrThrow5));
            } else if (a5.equals(qoi0.a(cls5))) {
                valueOf5 = Integer.valueOf(cursor.getInt(columnIndexOrThrow5));
            } else if (a5.equals(qoi0.a(cls4))) {
                valueOf5 = Short.valueOf(cursor.getShort(columnIndexOrThrow5));
            } else if (a5.equals(qoi0.a(cls3))) {
                valueOf5 = Float.valueOf(cursor.getFloat(columnIndexOrThrow5));
            } else if (a5.equals(qoi0.a(cls2))) {
                valueOf5 = Double.valueOf(cursor.getDouble(columnIndexOrThrow5));
            } else if (a5.equals(qoi0.a(byte[].class))) {
                valueOf5 = cursor.getBlob(columnIndexOrThrow5);
            } else {
                if (!a5.equals(qoi0.a(cls))) {
                    qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                    return q2x0Var;
                }
                valueOf5 = Boolean.valueOf(cursor.getInt(columnIndexOrThrow5) != 0);
            }
            str4 = (String) valueOf5;
        }
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("data4");
        if (cursor.isNull(columnIndexOrThrow6)) {
            str5 = str2;
            str6 = q2x0Var;
        } else {
            g0c a6 = qoi0.a(String.class);
            str5 = str2;
            if (a6.equals(qoi0.a(String.class))) {
                valueOf6 = cursor.getString(columnIndexOrThrow6);
            } else if (a6.equals(qoi0.a(cls6))) {
                valueOf6 = Long.valueOf(cursor.getLong(columnIndexOrThrow6));
            } else if (a6.equals(qoi0.a(cls5))) {
                valueOf6 = Integer.valueOf(cursor.getInt(columnIndexOrThrow6));
            } else if (a6.equals(qoi0.a(cls4))) {
                valueOf6 = Short.valueOf(cursor.getShort(columnIndexOrThrow6));
            } else if (a6.equals(qoi0.a(cls3))) {
                valueOf6 = Float.valueOf(cursor.getFloat(columnIndexOrThrow6));
            } else if (a6.equals(qoi0.a(cls2))) {
                valueOf6 = Double.valueOf(cursor.getDouble(columnIndexOrThrow6));
            } else if (a6.equals(qoi0.a(byte[].class))) {
                valueOf6 = cursor.getBlob(columnIndexOrThrow6);
            } else {
                if (!a6.equals(qoi0.a(cls))) {
                    qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                    return q2x0Var;
                }
                valueOf6 = Boolean.valueOf(cursor.getInt(columnIndexOrThrow6) != 0);
            }
            str6 = (String) valueOf6;
        }
        if ("vnd.android.cursor.item/vnd.org.telegram.messenger.android.profile".equals(str8) || "vnd.android.cursor.item/vnd.org.telegram.plus.android.profile".equals(str8)) {
            i = 0;
            str7 = str4;
        } else if ("vnd.android.cursor.item/vnd.com.whatsapp.profile".equals(str8)) {
            if (str4 != null) {
                i = 0;
                int G = evu0.G(str4, '@', 0, 6);
                if (G >= 0) {
                    str7 = "+".concat(str4.substring(0, G));
                }
            } else {
                i = 0;
            }
            str7 = q2x0Var;
        } else {
            i = 0;
            if (str5 == null) {
                str7 = cqb1.e(str6);
                if (str7 == null) {
                    str7 = cqb1.e(str3);
                }
            } else {
                str7 = str5;
            }
        }
        if (str7 == null) {
            return q2x0Var;
        }
        int i2 = i;
        int i3 = i2;
        while (i2 < str7.length()) {
            if (Character.isDigit(str7.charAt(i2))) {
                i3++;
            }
            i2++;
        }
        String str9 = i3 > 0 ? str7 : q2x0Var;
        if (str9 == null) {
            return q2x0Var;
        }
        Long l = 1L;
        int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("contact_last_updated_timestamp");
        if (!cursor.isNull(columnIndexOrThrow7)) {
            g0c a7 = qoi0.a(Long.class);
            if (a7.equals(qoi0.a(String.class))) {
                valueOf9 = cursor.getString(columnIndexOrThrow7);
            } else if (a7.equals(qoi0.a(cls6))) {
                valueOf9 = Long.valueOf(cursor.getLong(columnIndexOrThrow7));
            } else if (a7.equals(qoi0.a(cls5))) {
                valueOf9 = Integer.valueOf(cursor.getInt(columnIndexOrThrow7));
            } else if (a7.equals(qoi0.a(cls4))) {
                valueOf9 = Short.valueOf(cursor.getShort(columnIndexOrThrow7));
            } else if (a7.equals(qoi0.a(cls3))) {
                valueOf9 = Float.valueOf(cursor.getFloat(columnIndexOrThrow7));
            } else if (a7.equals(qoi0.a(cls2))) {
                valueOf9 = Double.valueOf(cursor.getDouble(columnIndexOrThrow7));
            } else if (a7.equals(qoi0.a(byte[].class))) {
                valueOf9 = cursor.getBlob(columnIndexOrThrow7);
            } else {
                if (!a7.equals(qoi0.a(cls))) {
                    qir.p(g8e.o("No mapping defined for class ", qoi0.a(Long.class).c()));
                    return q2x0Var;
                }
                valueOf9 = Boolean.valueOf(cursor.getInt(columnIndexOrThrow7) != 0 ? 1 : i);
            }
            l = (Long) valueOf9;
        }
        long longValue = l.longValue();
        int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("contact_id");
        g0c a8 = qoi0.a(Long.class);
        if (a8.equals(qoi0.a(String.class))) {
            valueOf7 = cursor.getString(columnIndexOrThrow8);
        } else if (a8.equals(qoi0.a(cls6))) {
            valueOf7 = Long.valueOf(cursor.getLong(columnIndexOrThrow8));
        } else if (a8.equals(qoi0.a(cls5))) {
            valueOf7 = Integer.valueOf(cursor.getInt(columnIndexOrThrow8));
        } else if (a8.equals(qoi0.a(cls4))) {
            valueOf7 = Short.valueOf(cursor.getShort(columnIndexOrThrow8));
        } else if (a8.equals(qoi0.a(cls3))) {
            valueOf7 = Float.valueOf(cursor.getFloat(columnIndexOrThrow8));
        } else if (a8.equals(qoi0.a(cls2))) {
            valueOf7 = Double.valueOf(cursor.getDouble(columnIndexOrThrow8));
        } else if (a8.equals(qoi0.a(byte[].class))) {
            valueOf7 = cursor.getBlob(columnIndexOrThrow8);
        } else {
            if (!a8.equals(qoi0.a(cls))) {
                qir.p(g8e.o("No mapping defined for class ", qoi0.a(Long.class).c()));
                return q2x0Var;
            }
            valueOf7 = Boolean.valueOf(cursor.getInt(columnIndexOrThrow8) != 0);
        }
        long longValue2 = ((Long) valueOf7).longValue();
        int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("lookup");
        g0c a9 = qoi0.a(String.class);
        if (a9.equals(qoi0.a(String.class))) {
            valueOf8 = cursor.getString(columnIndexOrThrow9);
        } else if (a9.equals(qoi0.a(cls6))) {
            valueOf8 = Long.valueOf(cursor.getLong(columnIndexOrThrow9));
        } else if (a9.equals(qoi0.a(cls5))) {
            valueOf8 = Integer.valueOf(cursor.getInt(columnIndexOrThrow9));
        } else if (a9.equals(qoi0.a(cls4))) {
            valueOf8 = Short.valueOf(cursor.getShort(columnIndexOrThrow9));
        } else if (a9.equals(qoi0.a(cls3))) {
            valueOf8 = Float.valueOf(cursor.getFloat(columnIndexOrThrow9));
        } else if (a9.equals(qoi0.a(cls2))) {
            valueOf8 = Double.valueOf(cursor.getDouble(columnIndexOrThrow9));
        } else if (a9.equals(qoi0.a(byte[].class))) {
            valueOf8 = cursor.getBlob(columnIndexOrThrow9);
        } else {
            if (!a9.equals(qoi0.a(cls))) {
                qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                return q2x0Var;
            }
            valueOf8 = Boolean.valueOf(cursor.getInt(columnIndexOrThrow9) != 0);
        }
        return new q2x0(longValue, longValue2, obj, str9, (String) valueOf8);
    }

    public static fa10 c(iq31 iq31Var, nyk0 nyk0Var) {
        List list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list2 = nyk0Var.a;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            gkp gkpVar = (gkp) list2.get(i);
            List list3 = gkpVar.a;
            int size2 = list3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if ((gkpVar instanceof dkp) && i2 == list3.size() / 2) {
                    arrayList2.add(new Pair(gkpVar, Integer.valueOf(arrayList.size())));
                }
                arrayList.add(list3.get(i2));
            }
        }
        Float valueOf = Float.valueOf(0.0f);
        int n = tcc.n(arrayList, 9);
        if (n == 0) {
            list = Collections.singletonList(valueOf);
        } else {
            ArrayList arrayList3 = new ArrayList(n + 1);
            arrayList3.add(valueOf);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jdf jdfVar = (jdf) it.next();
                float floatValue = valueOf.floatValue();
                float c = iq31Var.c(jdfVar);
                if (c < 0.0f) {
                    ny61.g("Measured cubic is expected to be greater or equal to zero");
                    return null;
                }
                valueOf = Float.valueOf(floatValue + c);
                arrayList3.add(valueOf);
            }
            list = arrayList3;
        }
        float floatValue2 = ((Number) a.Z(list)).floatValue();
        rx40 rx40Var = new rx40(list.size());
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            rx40Var.a(((Number) list.get(i3)).floatValue() / floatValue2);
        }
        ListBuilder a = rcc.a();
        int size4 = arrayList2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            int intValue = ((Number) ((Pair) arrayList2.get(i4)).f()).intValue();
            a.add(new fkf0((rx40Var.b(intValue + 1) + rx40Var.b(intValue)) / 2.0f, (gkp) ((Pair) arrayList2.get(i4)).c()));
        }
        return new fa10(iq31Var, a.j(), arrayList, rx40Var);
    }
}
