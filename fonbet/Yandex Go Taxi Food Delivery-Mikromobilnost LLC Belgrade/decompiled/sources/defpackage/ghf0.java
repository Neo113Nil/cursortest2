package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import com.yandex.messaging.InitialOrganizationStrategy;
import com.yandex.messaging.analytics.OrganizationChangeReporter$ChangeType;
import com.yandex.messaging.analytics.OrganizationChangeSource;
import com.yandex.messaging.core.net.entities.PersonalUserData;
import com.yandex.messaging.data.e;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class ghf0 {
    public final q5b0 a;
    public final y7b0 b;
    public final u2k0 c;
    public final az10 d;
    public final ueb e;
    public final t3f0 f;
    public final ro6 g;
    public final t5b0 h;
    public final s2c0 i;
    public final wgu j;
    public final a8b k;
    public final q5b l;
    public final ot21 m;
    public final nmf n;
    public final k020 o;
    public final InitialOrganizationStrategy p;
    public final ai80 q;
    public final e r;
    public final ph9 s;
    public final dlf t;
    public final String u;

    public ghf0(q5b0 q5b0Var, y7b0 y7b0Var, u2k0 u2k0Var, az10 az10Var, ueb uebVar, t3f0 t3f0Var, ro6 ro6Var, t5b0 t5b0Var, s2c0 s2c0Var, wgu wguVar, a8b a8bVar, q5b q5bVar, ot21 ot21Var, nmf nmfVar, k020 k020Var, InitialOrganizationStrategy initialOrganizationStrategy, ai80 ai80Var, el21 el21Var, e eVar, ph9 ph9Var, dlf dlfVar) {
        this.a = q5b0Var;
        this.b = y7b0Var;
        this.c = u2k0Var;
        this.d = az10Var;
        this.e = uebVar;
        this.f = t3f0Var;
        this.g = ro6Var;
        this.h = t5b0Var;
        this.i = s2c0Var;
        this.j = wguVar;
        this.k = a8bVar;
        this.l = q5bVar;
        this.m = ot21Var;
        this.n = nmfVar;
        this.o = k020Var;
        this.p = initialOrganizationStrategy;
        this.q = ai80Var;
        this.r = eVar;
        this.s = ph9Var;
        this.t = dlfVar;
        String c = el21Var.c();
        this.u = c;
        RoomDatabase roomDatabase = u2k0Var.a;
        if (((String) a.b(roomDatabase, true, false, new nqi0(19))) == null) {
            ((Number) a.b(roomDatabase, false, true, new dcc0(c, 17))).intValue();
        } else {
            z83.i();
        }
    }

    public final void a(z7b0 z7b0Var, PersonalUserData.Organization[] organizationArr, boolean z) {
        e eVar;
        long j;
        z83.i();
        x4b0 A = this.o.A();
        if (A == null || A.b < z7b0Var.c || z) {
            y7b0 y7b0Var = this.b;
            boolean z2 = false;
            ((Number) a.b(y7b0Var.a, false, true, new ww90(13, y7b0Var, z7b0Var))).longValue();
            this.s.c.d(e9h0.payload_personal_user_info_changed, this.u);
            e eVar2 = this.r;
            Long a = eVar2.a();
            long j2 = 0;
            boolean z3 = a != null && a.longValue() == 0;
            q5b0 q5b0Var = this.a;
            a.b(q5b0Var.a, false, true, new dia0(17));
            if (organizationArr != null) {
                ArrayList arrayList = new ArrayList(organizationArr.length);
                boolean z4 = false;
                int i = 0;
                while (i < organizationArr.length) {
                    int i2 = i + 1;
                    try {
                        PersonalUserData.Organization organization = organizationArr[i];
                        long j3 = j2;
                        long j4 = organization.organizationId;
                        String str = organization.organizationName;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = str;
                        String str3 = organization.registrationStatus;
                        if (str3 == null) {
                            str3 = "U";
                        }
                        e eVar3 = eVar2;
                        arrayList.add(new n5b0(j4, organization.organizationRights, str2, str3, organization.isPublic, organization.isGuest, organization.disabled));
                        if (a == null || organization.organizationId != a.longValue()) {
                            i = i2;
                            j2 = j3;
                            eVar2 = eVar3;
                        } else if (organization.disabled && organization.organizationId == j3) {
                            i = i2;
                            j2 = j3;
                            eVar2 = eVar3;
                            z3 = false;
                            z4 = true;
                        } else {
                            i = i2;
                            j2 = j3;
                            eVar2 = eVar3;
                            z3 = true;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        w511.i(e.getMessage());
                        return;
                    }
                }
                eVar = eVar2;
                j = j2;
                a.b(q5b0Var.a, false, true, new ww90(7, q5b0Var, arrayList));
                z2 = z4;
            } else {
                eVar = eVar2;
                j = 0;
            }
            OrganizationChangeReporter$ChangeType organizationChangeReporter$ChangeType = (z3 || a == null) ? OrganizationChangeReporter$ChangeType.Init : OrganizationChangeReporter$ChangeType.AfterDeleted;
            if (a == null || !z3 || z2) {
                long a2 = this.p.a(organizationArr);
                if (z2) {
                    int i3 = (a2 > j ? 1 : (a2 == j ? 0 : -1));
                }
                z83.i();
                eVar.a.edit().putLong("user_current_org_id", a2).apply();
                ai80 ai80Var = this.q;
                ai80Var.getClass();
                ai80Var.a(a, a2, organizationChangeReporter$ChangeType, OrganizationChangeSource.AutoChange);
            }
        }
    }
}
