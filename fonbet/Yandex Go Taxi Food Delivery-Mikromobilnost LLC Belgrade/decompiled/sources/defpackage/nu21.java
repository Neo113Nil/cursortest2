package defpackage;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.yandex.messaging.core.net.entities.Metadata;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.core.net.entities.proto.message.EmployeeInfo;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.RobotInfo;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.images.b;
import com.yandex.messaging.internal.storage.contacts.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes15.dex */
public final class nu21 {
    public final Context a;
    public final mv21 b;
    public final bv21 c;
    public final kl21 d;
    public final kp21 e;
    public final vl21 f;
    public final uxj0 g;
    public final fqr0 h;
    public final meb i;
    public final az10 j;
    public final wgu k;
    public final h3y l;
    public final avf0 m;
    public final bn21 n;
    public final ph9 o;
    public final z5z p;
    public final String q;

    public nu21(Context context, mv21 mv21Var, bv21 bv21Var, kl21 kl21Var, kp21 kp21Var, vl21 vl21Var, uxj0 uxj0Var, fqr0 fqr0Var, meb mebVar, az10 az10Var, wgu wguVar, h3y h3yVar, el21 el21Var, avf0 avf0Var, bn21 bn21Var, ph9 ph9Var, z5z z5zVar) {
        this.a = context;
        this.b = mv21Var;
        this.c = bv21Var;
        this.d = kl21Var;
        this.e = kp21Var;
        this.f = vl21Var;
        this.g = uxj0Var;
        this.h = fqr0Var;
        this.i = mebVar;
        this.j = az10Var;
        this.k = wguVar;
        this.l = h3yVar;
        this.m = avf0Var;
        this.n = bn21Var;
        this.o = ph9Var;
        this.p = z5zVar;
        this.q = el21Var.c();
    }

    public static String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.toLowerCase(Locale.getDefault()));
        sb.append(" ");
        sb.append(str3);
        sb.append(" ");
        if (str2 != null) {
            sb.append(str2);
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7 A[EDGE_INSN: B:43:0x00e7->B:44:0x00e7 BREAK  A[LOOP:2: B:34:0x00c7->B:41:0x00c7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ef  */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [vl21] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String d(nu21 nu21Var, ReducedUserInfo reducedUserInfo, UserData.EmployeeInfo[] employeeInfoArr, Boolean bool, int i) {
        String str;
        ListIterator listIterator;
        qqy qqyVar;
        ?? r1;
        boolean z;
        Object obj;
        UserData.EmployeeInfo[] employeeInfoArr2 = (i & 2) != 0 ? null : employeeInfoArr;
        Boolean bool2 = (i & 4) != 0 ? null : bool;
        nu21Var.getClass();
        String str2 = reducedUserInfo.displayName;
        ListBuilder a = rcc.a();
        EmployeeInfo[] employeeInfoArr3 = reducedUserInfo.employeeInfos;
        if (employeeInfoArr3 != null) {
            if (employeeInfoArr3.length == 0) {
                employeeInfoArr3 = null;
            }
            if (employeeInfoArr3 != null) {
                ArrayList arrayList = new ArrayList(employeeInfoArr3.length);
                for (EmployeeInfo employeeInfo : employeeInfoArr3) {
                    arrayList.add(new xl21(reducedUserInfo.userId, employeeInfo.getOrganizationId(), employeeInfo.getOrganizationName(), null, employeeInfo.getPosition(), employeeInfo.isGuest(), employeeInfo.getDeleted(), employeeInfo.getGuestOrganizationName(), employeeInfo.getDisplayName()));
                }
                a.addAll(arrayList);
            }
        }
        if (employeeInfoArr2 != null) {
            if (employeeInfoArr2.length == 0) {
                employeeInfoArr2 = null;
            }
            if (employeeInfoArr2 != null) {
                ArrayList arrayList2 = new ArrayList(employeeInfoArr2.length);
                int length = employeeInfoArr2.length;
                int i2 = 0;
                while (i2 < length) {
                    UserData.EmployeeInfo employeeInfo2 = employeeInfoArr2[i2];
                    String str3 = reducedUserInfo.userId;
                    long j = employeeInfo2.organizationId;
                    String str4 = employeeInfo2.organizationName;
                    UserData.DepartmentInfo departmentInfo = employeeInfo2.department;
                    arrayList2.add(new xl21(str3, j, str4, departmentInfo != null ? departmentInfo.name : null, employeeInfo2.position, employeeInfo2.isGuest, employeeInfo2.deleted, employeeInfo2.guestOrganizationName, employeeInfo2.displayName));
                    i2++;
                    employeeInfoArr2 = employeeInfoArr2;
                }
                str = null;
                a.addAll(arrayList2);
                ListBuilder j2 = a.j();
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                listIterator = j2.listIterator(0);
                while (true) {
                    qqyVar = (qqy) listIterator;
                    if (qqyVar.hasNext()) {
                        break;
                    }
                    Object next = qqyVar.next();
                    if (hashSet.add(Long.valueOf(((xl21) next).b))) {
                        arrayList3.add(next);
                    }
                }
                r1 = arrayList3.isEmpty() ? arrayList3 : str;
                if (r1 != 0) {
                    ?? r6 = nu21Var.f;
                    r6.a(reducedUserInfo.userId);
                    r6.e(r1);
                }
                if (!reducedUserInfo.deleted) {
                    Iterator it = arrayList3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = str;
                            break;
                        }
                        obj = it.next();
                        if (((xl21) obj).g) {
                            break;
                        }
                    }
                    if (obj == null) {
                        z = false;
                        if (str2 != null && !z) {
                            return str;
                        }
                        RobotInfo robotInfo = reducedUserInfo.robotInfo;
                        Boolean bool3 = reducedUserInfo.isRobot;
                        Boolean bool4 = Boolean.TRUE;
                        boolean l = jl40.l(bool3, bool4);
                        boolean z2 = robotInfo != null || robotInfo.getCannotBeBlocked();
                        boolean z3 = robotInfo == null && robotInfo.getIsSupport();
                        boolean z4 = robotInfo == null && robotInfo.getDisablePrivates();
                        boolean l2 = jl40.l(reducedUserInfo.isDisplayRestricted, bool4);
                        String str5 = reducedUserInfo.userId;
                        if (str2 == null) {
                            str2 = "";
                        }
                        return nu21Var.c(str5, str2, reducedUserInfo.version, reducedUserInfo.avatarId, reducedUserInfo.phoneId, null, l, z2, z3, z4, l2, null, null, null, reducedUserInfo.deleted, bool2);
                    }
                }
                z = true;
                if (str2 != null) {
                }
                RobotInfo robotInfo2 = reducedUserInfo.robotInfo;
                Boolean bool32 = reducedUserInfo.isRobot;
                Boolean bool42 = Boolean.TRUE;
                boolean l3 = jl40.l(bool32, bool42);
                if (robotInfo2 != null) {
                }
                if (robotInfo2 == null) {
                }
                if (robotInfo2 == null) {
                }
                boolean l22 = jl40.l(reducedUserInfo.isDisplayRestricted, bool42);
                String str52 = reducedUserInfo.userId;
                if (str2 == null) {
                }
                return nu21Var.c(str52, str2, reducedUserInfo.version, reducedUserInfo.avatarId, reducedUserInfo.phoneId, null, l3, z2, z3, z4, l22, null, null, null, reducedUserInfo.deleted, bool2);
            }
        }
        str = null;
        ListBuilder j22 = a.j();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList32 = new ArrayList();
        listIterator = j22.listIterator(0);
        while (true) {
            qqyVar = (qqy) listIterator;
            if (qqyVar.hasNext()) {
            }
        }
        if (arrayList32.isEmpty()) {
        }
        if (r1 != 0) {
        }
        if (!reducedUserInfo.deleted) {
        }
        z = true;
        if (str2 != null) {
        }
        RobotInfo robotInfo22 = reducedUserInfo.robotInfo;
        Boolean bool322 = reducedUserInfo.isRobot;
        Boolean bool422 = Boolean.TRUE;
        boolean l32 = jl40.l(bool322, bool422);
        if (robotInfo22 != null) {
        }
        if (robotInfo22 == null) {
        }
        if (robotInfo22 == null) {
        }
        boolean l222 = jl40.l(reducedUserInfo.isDisplayRestricted, bool422);
        String str522 = reducedUserInfo.userId;
        if (str2 == null) {
        }
        return nu21Var.c(str522, str2, reducedUserInfo.version, reducedUserInfo.avatarId, reducedUserInfo.phoneId, null, l32, z2, z3, z4, l222, null, null, null, reducedUserInfo.deleted, bool2);
    }

    public final String b(UserData userData) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ArrayList arrayList;
        boolean z5;
        String str = userData.userId;
        bv21 bv21Var = this.c;
        am21 b = bv21Var.b(str);
        RoomDatabase roomDatabase = bv21Var.a;
        Long l = b != null ? b.a : null;
        if (l != null && l.longValue() >= userData.version) {
            return null;
        }
        String str2 = userData.displayName;
        boolean z6 = userData.isDisplayRestricted;
        Context context = this.a;
        if (z6) {
            str2 = context.getResources().getString(oyh0.empty_user_placeholder);
        }
        String f = b.f(userData.avatarId);
        String str3 = userData.phoneId;
        String str4 = this.q;
        if (str3 != null) {
            aae a = ((a) this.l.get()).a(str3);
            if (a != null) {
                String str5 = a.d;
                if (!jl40.l(str4, userData.userId) && str5 != null && str5.length() != 0) {
                    str2 = str5;
                }
                z5 = true;
            } else {
                z5 = false;
            }
            z = z5;
        } else {
            z = false;
        }
        String str6 = str2;
        String str7 = userData.displayName;
        if (userData.isDisplayRestricted) {
            str7 = context.getResources().getString(oyh0.empty_user_placeholder);
        }
        String a2 = a(str7, userData.nickname, str6);
        UserData.RobotInfo robotInfo = userData.robotInfo;
        if (robotInfo != null) {
            boolean z7 = robotInfo.isSupport;
            boolean z8 = robotInfo.cannotBeBlocked;
            z4 = robotInfo.disablePrivates;
            z3 = z7;
            z2 = z8;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
        }
        String str8 = userData.userId;
        String str9 = userData.displayName;
        if (userData.isDisplayRestricted) {
            str9 = context.getResources().getString(oyh0.empty_user_placeholder);
        }
        String str10 = userData.website;
        Long l2 = userData.averageResponseTime;
        String str11 = userData.nickname;
        long j = userData.version;
        ((Number) androidx.room.util.a.b(roomDatabase, false, true, new dl01(29, bv21Var, new bm21(str8, str9, f, str10, l2, str6, str11, Long.valueOf(j), Long.valueOf(j), userData.phoneId, a2, userData.isRobot, z2, z3, z, z4, userData.accountDeleted, ((Boolean) androidx.room.util.a.b(roomDatabase, true, false, new il01(userData.userId, 23))).booleanValue())))).longValue();
        Metadata metadata = userData.metadata;
        kp21 kp21Var = this.e;
        if (metadata != null) {
            lp21 lp21Var = (lp21) kp21Var;
            ((Number) androidx.room.util.a.b(lp21Var.a, false, true, new dl01(25, lp21Var, this.m.a(userData.userId, metadata)))).longValue();
        } else {
            ((Number) androidx.room.util.a.b(((lp21) kp21Var).a, false, true, new il01(userData.userId, 13))).intValue();
        }
        String str12 = userData.userId;
        UserData.Contact[] contactArr = userData.contacts;
        kl21 kl21Var = this.d;
        List d = kl21Var.d(str12);
        if (contactArr != null) {
            arrayList = new ArrayList(contactArr.length);
            for (UserData.Contact contact : contactArr) {
                Long l3 = contact.organizationId;
                long longValue = l3 != null ? l3.longValue() : 0L;
                String str13 = contact.type;
                String str14 = contact.value;
                Boolean bool = contact.isLegal;
                arrayList.add(new il21(null, str12, longValue, str13, str14, bool != null ? bool.booleanValue() : false));
            }
        } else {
            arrayList = null;
        }
        if (!kotlin.collections.a.N0(d).equals(arrayList != null ? kotlin.collections.a.N0(arrayList) : null)) {
            kl21Var.a(str12);
            if (arrayList != null) {
                kl21Var.b(arrayList);
            }
        }
        this.f.f(userData.userId, userData.employeesInfo);
        String str15 = userData.userId;
        ph9 ph9Var = this.o;
        ph9Var.j(str15);
        ph9Var.c(new ChatId.PrivateChatId(str4, userData.userId).a);
        return str6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String c(String str, String str2, long j, String str3, String str4, UserData.Contact[] contactArr, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str5, Metadata metadata, UserData.EmployeeInfo[] employeeInfoArr, boolean z6, Boolean bool) {
        Object[] objArr;
        boolean z7;
        boolean z8;
        aae a;
        final bv21 bv21Var = this.c;
        am21 b = bv21Var.b(str);
        RoomDatabase roomDatabase = bv21Var.a;
        if (employeeInfoArr != null && employeeInfoArr.length != 0) {
            this.f.f(str, employeeInfoArr);
        }
        Long l = b != null ? b.a : null;
        final int i = 0;
        if (l != null) {
            objArr = l.longValue() < j;
            return null;
        }
        Long l2 = b != null ? b.b : null;
        if (l2 == null || l2.longValue() < j) {
            if (contactArr != null) {
                for (UserData.Contact contact : contactArr) {
                    jl40.l(contact.type, "phone");
                }
            }
            String f = b.f(str3);
            String string = z5 ? this.a.getResources().getString(oyh0.empty_user_placeholder) : str2;
            if (str4 == null || (a = ((a) this.l.get()).a(str4)) == null) {
                z7 = false;
            } else {
                String str6 = a.d;
                if (str6 != null && str6.length() != 0) {
                    string = str6;
                }
                z7 = true;
            }
            String str7 = string;
            final zl21 zl21Var = new zl21(str, str2, str7, Long.valueOf(j), f, str4, a(str2, null, string), z, z2, z3, z4, str5, z7, z6, bool != null ? bool.booleanValue() : ((Boolean) androidx.room.util.a.b(roomDatabase, true, false, new il01(str, 23))).booleanValue());
            if (objArr == true) {
                z8 = true;
                androidx.room.util.a.b(roomDatabase, false, true, new tls() { // from class: zu21
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i2 = i;
                        zl21 zl21Var2 = zl21Var;
                        bv21 bv21Var2 = bv21Var;
                        oll0 oll0Var = (oll0) obj;
                        switch (i2) {
                            case 0:
                                bv21Var2.d.c(oll0Var, zl21Var2);
                                return zy11.a;
                            default:
                                return Long.valueOf(bv21Var2.c.e(oll0Var, zl21Var2));
                        }
                    }
                });
            } else {
                z8 = true;
                final char c = 1 == true ? 1 : 0;
                ((Number) androidx.room.util.a.b(roomDatabase, false, true, new tls() { // from class: zu21
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i2 = c;
                        zl21 zl21Var2 = zl21Var;
                        bv21 bv21Var2 = bv21Var;
                        oll0 oll0Var = (oll0) obj;
                        switch (i2) {
                            case 0:
                                bv21Var2.d.c(oll0Var, zl21Var2);
                                return zy11.a;
                            default:
                                return Long.valueOf(bv21Var2.c.e(oll0Var, zl21Var2));
                        }
                    }
                })).longValue();
            }
            if (metadata != null) {
                mp21 a2 = this.m.a(str, metadata);
                lp21 lp21Var = (lp21) this.e;
                ((Number) androidx.room.util.a.b(lp21Var.a, false, z8, new dl01(25, lp21Var, a2))).longValue();
            }
            ph9 ph9Var = this.o;
            ph9Var.j(str);
            ph9Var.c(new ChatId.PrivateChatId(this.q, str).a);
            return str7;
        }
        return null;
    }

    public final void e(UserData userData) {
        String b = b(userData);
        if (b == null || userData.isRobot || jl40.l(this.q, userData.userId)) {
            return;
        }
        String str = userData.userId;
        String str2 = userData.displayName;
        if (userData.isDisplayRestricted) {
            str2 = this.a.getResources().getString(oyh0.empty_user_placeholder);
        }
        f(0, str, b, str2, userData.nickname);
    }

    public final void f(int i, String str, String str2, String str3, String str4) {
        long j;
        boolean z;
        String str5;
        String str6;
        String str7 = str;
        String str8 = str2;
        ChatId.PrivateChatId privateChatId = new ChatId.PrivateChatId(this.q, str7);
        ph9 ph9Var = this.o;
        HashSet hashSet = ph9Var.v;
        ikw0 ikw0Var = ph9Var.c;
        if (hashSet == null) {
            ph9Var.v = new HashSet();
        }
        ph9Var.v.add(privateChatId.a);
        ikw0Var.d(e9h0.payload_chat_spam_marker, ph9Var.v);
        final int i2 = 1;
        final int i3 = 0;
        boolean z2 = i == 0;
        boolean z3 = i == 1;
        this.n.getClass();
        boolean a = bn21.a(str7);
        final mv21 mv21Var = this.b;
        RoomDatabase roomDatabase = mv21Var.a;
        RoomDatabase roomDatabase2 = mv21Var.a;
        nv21 nv21Var = (nv21) androidx.room.util.a.b(roomDatabase, true, false, new il01(str7, 28));
        if (nv21Var != null) {
            z2 = z2 || nv21Var.d;
            z3 = z3 || nv21Var.e;
        }
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z4;
        if (i == 2) {
            z6 = false;
        }
        boolean e = this.g.e(str7);
        fqr0 fqr0Var = this.h;
        if (e || (!(z5 || z6) || a)) {
            if (nv21Var != null) {
                ((Number) androidx.room.util.a.b(roomDatabase2, false, true, new il01(str7, 29))).intValue();
            }
            fqr0Var.b(str7);
            return;
        }
        Long l = (Long) androidx.room.util.a.b(this.i.a, true, false, new b5a(str7, 12));
        if (l != null) {
            j = 0;
            Long r = this.j.r(l.longValue());
            long longValue = r != null ? r.longValue() : 0L;
            Long d = this.k.d(str7);
            z = d != null && d.longValue() >= longValue;
            str6 = str4;
            str5 = str3;
        } else {
            j = 0;
            z = false;
            str5 = str3;
            str6 = str4;
        }
        String a2 = a(str5, str6, str8);
        in21 a3 = this.c.a(str7);
        boolean z7 = a3 != null ? a3.n : false;
        List d2 = this.f.d(str7);
        if (d2.isEmpty()) {
            d2 = Collections.singletonList(Long.valueOf(j));
        }
        ArrayList arrayList = new ArrayList(d2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = arrayList;
            String str9 = str7;
            boolean z8 = z6;
            final nv21 nv21Var2 = new nv21(str9, ((Number) it.next()).longValue(), str8, z5, z8, a2, z7);
            str7 = str9;
            if (nv21Var == null) {
                ((Number) androidx.room.util.a.b(roomDatabase2, false, true, new tls() { // from class: kv21
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i4 = i3;
                        nv21 nv21Var3 = nv21Var2;
                        mv21 mv21Var2 = mv21Var;
                        oll0 oll0Var = (oll0) obj;
                        switch (i4) {
                            case 0:
                                return Long.valueOf(mv21Var2.b.e(oll0Var, nv21Var3));
                            default:
                                return Integer.valueOf(mv21Var2.c.c(oll0Var, nv21Var3));
                        }
                    }
                })).longValue();
            } else {
                ((Number) androidx.room.util.a.b(roomDatabase2, false, true, new tls() { // from class: kv21
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i4 = i2;
                        nv21 nv21Var3 = nv21Var2;
                        mv21 mv21Var2 = mv21Var;
                        oll0 oll0Var = (oll0) obj;
                        switch (i4) {
                            case 0:
                                return Long.valueOf(mv21Var2.b.e(oll0Var, nv21Var3));
                            default:
                                return Integer.valueOf(mv21Var2.c.c(oll0Var, nv21Var3));
                        }
                    }
                })).intValue();
            }
            str8 = str2;
            z6 = z8;
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = arrayList;
        if (!z) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                long longValue2 = ((Number) it2.next()).longValue();
                if (fqr0Var.c(longValue2, str7)) {
                    fqr0Var.e(longValue2, str7, str2);
                } else {
                    fqr0Var.d(new iqr0(null, str7, longValue2, str2, 0L, 33));
                }
            }
        }
        ikw0Var.d(e9h0.payload_users_to_talk_changed, Boolean.TRUE);
    }
}
