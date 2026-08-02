package defpackage;

import android.os.Looper;
import android.util.SparseArray;
import androidx.room.util.a;
import com.yandex.messaging.extension.flow.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class j020 implements zs2 {
    public final /* synthetic */ k020 a;

    public j020(k020 k020Var) {
        this.a = k020Var;
    }

    @Override // defpackage.zs2
    public final void b(SparseArray sparseArray) {
        boolean z;
        bvb0 bvb0Var;
        boolean z2;
        h9b b;
        k020 k020Var = this.a;
        if (sparseArray.get(e9h0.payload_chat_list_changed) != null) {
            sb7 sb7Var = (sb7) k020Var.d.get();
            z83.g(null, sb7Var.a, Looper.myLooper());
            sq60 sq60Var = sb7Var.i.x;
            sq60Var.rewind();
            while (sq60Var.hasNext()) {
                ((x6f0) ((tb7) sq60Var.next()).a).d(zy11.a);
            }
        }
        if (sparseArray.get(e9h0.payload_thread_list_changed) != null) {
            sb7 sb7Var2 = (sb7) k020Var.d.get();
            z83.g(null, sb7Var2.a, Looper.myLooper());
            sq60 sq60Var2 = sb7Var2.j.x;
            sq60Var2.rewind();
            while (sq60Var2.hasNext()) {
                ((x6f0) ((zb7) sq60Var2.next()).a).d(zy11.a);
            }
        }
        if (sparseArray.get(e9h0.payload_unseen_changed) != null || sparseArray.get(e9h0.payload_thread_list_changed) != null) {
            sb7 sb7Var3 = (sb7) k020Var.d.get();
            z83.g(null, sb7Var3.a, Looper.myLooper());
            sq60 sq60Var3 = sb7Var3.g.x;
            sq60Var3.rewind();
            while (sq60Var3.hasNext()) {
                ((x6f0) ((ac7) sq60Var3.next()).a).d(zy11.a);
            }
        }
        Object obj = sparseArray.get(e9h0.payload_timeline_changed);
        int i = 0;
        if (obj instanceof rnz) {
            boolean l = jl40.l(sparseArray.get(e9h0.payload_update_without_notifications), Boolean.TRUE);
            rnz rnzVar = (rnz) obj;
            int j = rnzVar.j();
            for (int i2 = 0; i2 < j; i2++) {
                long g = rnzVar.g(i2);
                sb7 sb7Var4 = (sb7) k020Var.d.get();
                baz0 baz0Var = (baz0) rnzVar.l(i2);
                z83.g(null, sb7Var4.a, Looper.myLooper());
                sq60 sq60Var4 = sb7Var4.e.x;
                sq60Var4.rewind();
                while (sq60Var4.hasNext()) {
                    ((qb7) sq60Var4.next()).w(g, baz0Var, l);
                }
            }
        }
        Object obj2 = sparseArray.get(e9h0.payload_message_changed);
        if (obj2 instanceof rnz) {
            rnz rnzVar2 = (rnz) obj2;
            int j2 = rnzVar2.j();
            for (int i3 = 0; i3 < j2; i3++) {
                long g2 = rnzVar2.g(i3);
                sb7 sb7Var5 = (sb7) k020Var.d.get();
                Collection collection = (Collection) rnzVar2.l(i3);
                z83.g(null, sb7Var5.a, Looper.myLooper());
                sq60 sq60Var5 = sb7Var5.e.x;
                sq60Var5.rewind();
                while (sq60Var5.hasNext()) {
                    ((qb7) sq60Var5.next()).n(g2, collection);
                }
            }
        }
        Object obj3 = sparseArray.get(e9h0.payload_owner_seen_marker_changed);
        if (obj3 instanceof rnz) {
            rnz rnzVar3 = (rnz) obj3;
            int j3 = rnzVar3.j();
            for (int i4 = 0; i4 < j3; i4++) {
                long g3 = rnzVar3.g(i4);
                sb7 sb7Var6 = (sb7) k020Var.d.get();
                z83.g(null, sb7Var6.a, Looper.myLooper());
                sq60 sq60Var6 = sb7Var6.e.x;
                sq60Var6.rewind();
                while (sq60Var6.hasNext()) {
                    ((qb7) sq60Var6.next()).d(g3);
                }
            }
        }
        Object obj4 = sparseArray.get(e9h0.payload_members_changed);
        if (obj4 instanceof rnz) {
            rnz rnzVar4 = (rnz) obj4;
            int j4 = rnzVar4.j();
            for (int i5 = 0; i5 < j4; i5++) {
                rnzVar4.g(i5);
                sb7 sb7Var7 = (sb7) k020Var.d.get();
                z83.g(null, sb7Var7.a, Looper.myLooper());
                sq60 sq60Var7 = sb7Var7.e.x;
                sq60Var7.rewind();
                while (sq60Var7.hasNext()) {
                }
            }
        }
        Object obj5 = sparseArray.get(e9h0.payload_admins_changed);
        if (obj5 instanceof rnz) {
            rnz rnzVar5 = (rnz) obj5;
            int j5 = rnzVar5.j();
            for (int i6 = 0; i6 < j5; i6++) {
                rnzVar5.g(i6);
                sb7 sb7Var8 = (sb7) k020Var.d.get();
                z83.g(null, sb7Var8.a, Looper.myLooper());
                sq60 sq60Var8 = sb7Var8.e.x;
                sq60Var8.rewind();
                while (sq60Var8.hasNext()) {
                    ((qb7) sq60Var8.next()).k();
                }
            }
        }
        Object obj6 = sparseArray.get(e9h0.payload_users_changed);
        if (obj6 instanceof HashSet) {
            Iterator it = ((HashSet) obj6).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                sb7 sb7Var9 = (sb7) k020Var.d.get();
                z83.g(null, sb7Var9.a, Looper.myLooper());
                sq60 sq60Var9 = sb7Var9.h.x;
                sq60Var9.rewind();
                while (sq60Var9.hasNext()) {
                    ((rb7) sq60Var9.next()).o(str);
                }
            }
        }
        Object obj7 = sparseArray.get(e9h0.payload_chats_inserted);
        if ((obj7 instanceof HashSet) && !((HashSet) obj7).isEmpty()) {
            sb7 sb7Var10 = (sb7) k020Var.d.get();
            z83.g(null, sb7Var10.a, Looper.myLooper());
            sq60 sq60Var10 = sb7Var10.e.x;
            sq60Var10.rewind();
            while (sq60Var10.hasNext()) {
            }
        }
        if (sparseArray.get(e9h0.payload_users_to_talk_changed) != null) {
            sb7 sb7Var11 = (sb7) k020Var.d.get();
            z83.g(null, sb7Var11.a, Looper.myLooper());
            sq60 sq60Var11 = sb7Var11.k.x;
            sq60Var11.rewind();
            while (sq60Var11.hasNext()) {
                sub1.e(((xb7) sq60Var11.next()).a, zy11.a);
            }
        }
        Object obj8 = sparseArray.get(e9h0.payload_chat_view_changed);
        if (obj8 instanceof HashSet) {
            Iterator it2 = ((HashSet) obj8).iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                sb7 sb7Var12 = (sb7) k020Var.d.get();
                z83.g(null, sb7Var12.a, Looper.myLooper());
                cl21 d = ((el21) sb7Var12.b.get()).d();
                if (d != null && (b = ((d9g) d).b()) != null) {
                    m3b m3bVar = b.g;
                    synchronized (m3bVar) {
                        m3bVar.a.getClass();
                        Looper.myLooper();
                        z83.i();
                        l3b l3bVar = (l3b) m3bVar.b.get(str2);
                        if (l3bVar != null) {
                            m3bVar.b.put(str2, new l3b(l3bVar.a, false));
                        }
                    }
                    b.k.rewind();
                    while (b.k.hasNext()) {
                        f9b f9bVar = (f9b) b.k.next();
                        o1b0 o1b0Var = f9bVar.w;
                        if (o1b0Var != null) {
                            if (!str2.equals(o1b0Var.b) && !str2.equals(f9bVar.x)) {
                                o1b0Var = null;
                            }
                            if (o1b0Var != null) {
                                f9bVar.b.d(f9bVar.d(o1b0Var));
                            }
                        }
                    }
                }
                sq60 sq60Var12 = sb7Var12.e.x;
                sq60Var12.rewind();
                while (sq60Var12.hasNext()) {
                    ((qb7) sq60Var12.next()).c(str2);
                }
            }
        }
        Object obj9 = sparseArray.get(e9h0.payload_chat_member_rights_changed);
        HashSet hashSet = obj9 instanceof HashSet ? (HashSet) obj9 : null;
        if (hashSet != null) {
            Iterator it3 = hashSet.iterator();
            if (it3.hasNext()) {
                if (it3.next() != null) {
                    ny61.u();
                    return;
                } else {
                    ((sb7) k020Var.d.get()).getClass();
                    throw null;
                }
            }
        }
        Object obj10 = sparseArray.get(e9h0.payload_chat_translation_changed);
        HashMap hashMap = obj10 instanceof HashMap ? (HashMap) obj10 : null;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                sb7 sb7Var13 = (sb7) k020Var.d.get();
                long longValue = ((Number) entry.getKey()).longValue();
                String str3 = (String) entry.getValue();
                z83.g(null, sb7Var13.a, Looper.myLooper());
                sq60 sq60Var13 = sb7Var13.e.x;
                sq60Var13.rewind();
                while (sq60Var13.hasNext()) {
                    ((qb7) sq60Var13.next()).a(longValue, str3);
                }
            }
        }
        if (sparseArray.get(e9h0.payload_personal_user_info_changed) != null) {
            k020Var.m = null;
            sb7 sb7Var14 = (sb7) k020Var.d.get();
            z83.g(null, sb7Var14.a, Looper.myLooper());
            sq60 sq60Var14 = sb7Var14.f.x;
            sq60Var14.rewind();
            while (sq60Var14.hasNext()) {
                yb7 yb7Var = (yb7) sq60Var14.next();
                int i7 = yb7Var.a;
                Object obj11 = yb7Var.b;
                switch (i7) {
                    case 0:
                        sub1.e((y6f0) obj11, zy11.a);
                        break;
                    default:
                        ((ixj0) obj11).a();
                        break;
                }
            }
        }
        if (sparseArray.get(e9h0.payload_personal_preferences_changed) != null) {
            sb7 sb7Var15 = (sb7) k020Var.d.get();
            z83.g(null, sb7Var15.a, Looper.myLooper());
            c.d(sb7Var15.w, zy11.a);
        }
        Object obj12 = sparseArray.get(e9h0.payload_restrictions_changed);
        if (obj12 instanceof HashSet) {
            Iterator it4 = ((HashSet) obj12).iterator();
            while (it4.hasNext()) {
                String str4 = (String) it4.next();
                sb7 sb7Var16 = (sb7) k020Var.d.get();
                z83.g(null, sb7Var16.a, Looper.myLooper());
                ayj0 ayj0Var = (ayj0) ((eyj0) sb7Var16.c.get()).e.get(str4);
                if (ayj0Var != null) {
                    eyj0 eyj0Var = ayj0Var.c;
                    z83.b(null, eyj0Var.a.getLooper(), Looper.myLooper());
                    boolean e = eyj0Var.c.b.C().e(str4);
                    if (str4.equals(ayj0Var.b)) {
                        eyj0Var.b.post(new yxj0(ayj0Var, str4, e));
                    }
                }
            }
            sb7 sb7Var17 = (sb7) k020Var.d.get();
            z83.g(null, sb7Var17.a, Looper.myLooper());
            zq60 zq60Var = ((eyj0) sb7Var17.c.get()).d;
            zq60Var.getClass();
            zq60Var.b++;
            int size = zq60Var.a.size();
            int i8 = 0;
            boolean z3 = false;
            while (true) {
                int i9 = i8;
                while (i9 < size && zq60Var.a.get(i9) == null) {
                    i9++;
                }
                if (i9 < size) {
                    z2 = true;
                } else {
                    if (!z3) {
                        zq60.a(zq60Var);
                        z3 = true;
                    }
                    z2 = false;
                }
                if (z2) {
                    ArrayList arrayList = zq60Var.a;
                    while (i8 < size && arrayList.get(i8) == null) {
                        i8++;
                    }
                    if (i8 >= size) {
                        if (!z3) {
                            zq60.a(zq60Var);
                        }
                        ny61.p();
                        return;
                    } else {
                        int i10 = i8 + 1;
                        dyj0 dyj0Var = (dyj0) arrayList.get(i8);
                        eyj0 eyj0Var2 = dyj0Var.c;
                        z83.b(null, eyj0Var2.a.getLooper(), Looper.myLooper());
                        eyj0Var2.b.post(new cyj0(dyj0Var, new txj0(eyj0Var2.c.b.C().c()), i));
                        i8 = i10;
                    }
                }
            }
        }
        if (sparseArray.get(e9h0.payload_pin_chats_changes) != null) {
            sb7 sb7Var18 = (sb7) k020Var.d.get();
            z83.g(null, sb7Var18.a, Looper.myLooper());
            cl21 d2 = ((el21) sb7Var18.b.get()).d();
            if (d2 != null && (bvb0Var = (bvb0) ((d9g) d2).G0.get()) != null) {
                String[] strArr = (String[]) a.b(bvb0Var.a.b.L().a, true, false, new fnb0(7));
                r0 r0Var = bvb0Var.b;
                r2c0 r2c0Var = new r2c0(strArr);
                r0Var.getClass();
                r0Var.m(null, r2c0Var);
            }
        }
        Object obj13 = sparseArray.get(e9h0.payload_chat_spam_marker);
        if (obj13 instanceof HashSet) {
            Iterator it5 = ((HashSet) obj13).iterator();
            while (it5.hasNext()) {
                String str5 = (String) it5.next();
                sb7 sb7Var19 = (sb7) k020Var.d.get();
                z83.g(null, sb7Var19.a, Looper.myLooper());
                c.d(sb7Var19.m, str5);
            }
        }
        if (sparseArray.get(e9h0.payload_privacy_changed) != null) {
            sb7 sb7Var20 = (sb7) k020Var.d.get();
            z83.g(null, sb7Var20.a, Looper.myLooper());
            b4f0 b4f0Var = (b4f0) sb7Var20.d.get();
            z83.b(null, b4f0Var.b.getLooper(), Looper.myLooper());
            zq60 zq60Var2 = b4f0Var.d;
            zq60Var2.getClass();
            zq60Var2.b++;
            int size2 = zq60Var2.a.size();
            int i11 = 0;
            boolean z4 = false;
            while (true) {
                int i12 = i11;
                while (i12 < size2 && zq60Var2.a.get(i12) == null) {
                    i12++;
                }
                if (i12 < size2) {
                    z = true;
                } else {
                    if (!z4) {
                        zq60.a(zq60Var2);
                        z4 = true;
                    }
                    z = false;
                }
                if (z) {
                    ArrayList arrayList2 = zq60Var2.a;
                    while (i11 < size2 && arrayList2.get(i11) == null) {
                        i11++;
                    }
                    if (i11 >= size2) {
                        if (!z4) {
                            zq60.a(zq60Var2);
                        }
                        ny61.p();
                        return;
                    }
                    ((a4f0) arrayList2.get(i11)).a();
                    i11++;
                }
            }
        }
        Object obj14 = sparseArray.get(e9h0.payload_chat_organizations_changed);
        if (obj14 instanceof HashSet) {
            HashSet hashSet2 = (HashSet) obj14;
            sb7 sb7Var21 = (sb7) k020Var.d.get();
            z83.g(null, sb7Var21.a, Looper.myLooper());
            sq60 sq60Var15 = sb7Var21.l.x;
            sq60Var15.rewind();
            while (sq60Var15.hasNext()) {
                ((x6f0) ((ub7) sq60Var15.next()).a).d(hashSet2);
            }
        }
        Object obj15 = sparseArray.get(e9h0.payload_chat_metadata_changed);
        if (obj15 instanceof HashSet) {
            Iterator it6 = ((HashSet) obj15).iterator();
            while (it6.hasNext()) {
                String str6 = (String) it6.next();
                sb7 sb7Var22 = (sb7) k020Var.d.get();
                z83.g(null, sb7Var22.a, Looper.myLooper());
                sq60 sq60Var16 = sb7Var22.e.x;
                sq60Var16.rewind();
                while (sq60Var16.hasNext()) {
                    ((qb7) sq60Var16.next()).e(str6);
                }
            }
        }
        Object obj16 = sparseArray.get(e9h0.payload_chat_miniapp_info_changed);
        if (obj16 instanceof HashSet) {
            Iterator it7 = ((HashSet) obj16).iterator();
            while (it7.hasNext()) {
                String str7 = (String) it7.next();
                sb7 sb7Var23 = (sb7) k020Var.d.get();
                z83.g(null, sb7Var23.a, Looper.myLooper());
                c.d(sb7Var23.o, str7);
            }
        }
        Object obj17 = sparseArray.get(e9h0.payload_user_status_changed);
        if (obj17 instanceof String) {
            sb7 sb7Var24 = (sb7) k020Var.d.get();
            z83.g(null, sb7Var24.a, Looper.myLooper());
            c.d(sb7Var24.q, (String) obj17);
        }
        if (sparseArray.get(e9h0.payload_custom_user_statuses_changed) != null) {
            sb7 sb7Var25 = (sb7) k020Var.d.get();
            z83.g(null, sb7Var25.a, Looper.myLooper());
            c.d(sb7Var25.s, zy11.a);
        }
        Object obj18 = sparseArray.get(e9h0.payload_folders_changed);
        if (obj18 != null) {
            sb7 sb7Var26 = (sb7) k020Var.d.get();
            z83.g(null, sb7Var26.a, Looper.myLooper());
            c.d(sb7Var26.u, (qi1) obj18);
        }
    }
}
