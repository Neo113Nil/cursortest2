package com.yandex.mob;

import android.content.Context;
import com.yandex.mob.api.model.MobEnvironment;
import com.yandex.mob.model.MobCronJobType;
import defpackage.acb1;
import defpackage.cs20;
import defpackage.dp20;
import defpackage.dq20;
import defpackage.em20;
import defpackage.gtq0;
import defpackage.jl20;
import defpackage.jl40;
import defpackage.kf5;
import defpackage.kme0;
import defpackage.mme0;
import defpackage.ny61;
import defpackage.ogx;
import defpackage.oog;
import defpackage.oyr;
import defpackage.pr20;
import defpackage.qn20;
import defpackage.qoi0;
import defpackage.qp20;
import defpackage.qr20;
import defpackage.rot;
import defpackage.tm20;
import defpackage.tpr;
import defpackage.xr20;
import defpackage.zcx;
import defpackage.zy11;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class o implements oog {
    public final Context a;
    public final MobEnvironment b;
    public final rot c;
    public final jl20 d;

    public o(Context context, MobEnvironment mobEnvironment, rot rotVar, jl20 jl20Var) {
        this.a = context;
        this.b = mobEnvironment;
        this.c = rotVar;
        this.d = jl20Var;
    }

    public static LinkedHashMap e(mme0 mme0Var, boolean z) {
        Object obj;
        String str = z ? "_trigger" : "";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : kotlin.collections.b.i(new Pair(MobCronJobType.Notifications, "notifications_polling".concat(str)), new Pair(MobCronJobType.AvailabilityReport, "availability_report".concat(str)), new Pair(MobCronJobType.AvailabilityReportAll, "availability_report_all".concat(str)), new Pair(MobCronJobType.Config, "config_key".concat(str)), new Pair(MobCronJobType.DetailReport, "detail_report".concat(str))).entrySet()) {
            MobCronJobType mobCronJobType = (MobCronJobType) entry.getKey();
            String str2 = (String) mme0Var.c(new kme0((String) entry.getValue()));
            if (str2 != null) {
                try {
                    if (qn20.class.equals(zy11.class)) {
                        obj = (qn20) zy11.a;
                    } else {
                        zcx zcxVar = qr20.a;
                        obj = zcxVar.b(gtq0.H(zcxVar.b, qoi0.c(qn20.class)), str2);
                    }
                } catch (Exception unused) {
                    obj = null;
                }
                qn20 qn20Var = (qn20) obj;
                if (qn20Var != null) {
                    linkedHashMap.put(mobCronJobType, qn20Var);
                }
            }
        }
        return linkedHashMap;
    }

    @Override // defpackage.oog
    public final Object a(Object obj, Continuation continuation) {
        boolean z;
        if (jl40.l((xr20) obj, new xr20(null, null, null, null, null, null, null, null, null, null, null, null, null, 65535))) {
            if (new File(this.a.getFilesDir(), "datastore/".concat(oyr.p("mob_storage_", this.b.name(), ".preferences_pb"))).exists()) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    @Override // defpackage.oog
    public final void b() {
        try {
            new File(this.a.getFilesDir(), "datastore/".concat("mob_storage_" + this.b.name() + ".preferences_pb")).delete();
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.oog
    public final /* bridge */ /* synthetic */ Object c(Object obj, Continuation continuation) {
        return d((ContinuationImpl) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a9 A[Catch: Exception -> 0x0038, TRY_ENTER, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x0034, B:12:0x0057, B:201:0x00c2, B:16:0x00c9, B:192:0x00f6, B:19:0x00fd, B:62:0x01b3, B:105:0x026b, B:108:0x02a9, B:110:0x02b6, B:112:0x02bf, B:113:0x02ca, B:115:0x02d0, B:122:0x02f7, B:130:0x02fb, B:154:0x0329, B:133:0x0330, B:145:0x0360, B:136:0x0367, B:65:0x01f7, B:67:0x0204, B:69:0x020d, B:70:0x0218, B:72:0x021e, B:79:0x0258, B:22:0x0142, B:24:0x014f, B:26:0x0158, B:27:0x0163, B:29:0x0169, B:36:0x01a2, B:208:0x0044), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0340 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x030a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x027e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0142 A[Catch: Exception -> 0x0038, TRY_ENTER, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x0034, B:12:0x0057, B:201:0x00c2, B:16:0x00c9, B:192:0x00f6, B:19:0x00fd, B:62:0x01b3, B:105:0x026b, B:108:0x02a9, B:110:0x02b6, B:112:0x02bf, B:113:0x02ca, B:115:0x02d0, B:122:0x02f7, B:130:0x02fb, B:154:0x0329, B:133:0x0330, B:145:0x0360, B:136:0x0367, B:65:0x01f7, B:67:0x0204, B:69:0x020d, B:70:0x0218, B:72:0x021e, B:79:0x0258, B:22:0x0142, B:24:0x014f, B:26:0x0158, B:27:0x0163, B:29:0x0169, B:36:0x01a2, B:208:0x0044), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a2 A[Catch: Exception -> 0x0038, TRY_ENTER, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x0034, B:12:0x0057, B:201:0x00c2, B:16:0x00c9, B:192:0x00f6, B:19:0x00fd, B:62:0x01b3, B:105:0x026b, B:108:0x02a9, B:110:0x02b6, B:112:0x02bf, B:113:0x02ca, B:115:0x02d0, B:122:0x02f7, B:130:0x02fb, B:154:0x0329, B:133:0x0330, B:145:0x0360, B:136:0x0367, B:65:0x01f7, B:67:0x0204, B:69:0x020d, B:70:0x0218, B:72:0x021e, B:79:0x0258, B:22:0x0142, B:24:0x014f, B:26:0x0158, B:27:0x0163, B:29:0x0169, B:36:0x01a2, B:208:0x0044), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f7 A[Catch: Exception -> 0x0038, TRY_ENTER, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x0034, B:12:0x0057, B:201:0x00c2, B:16:0x00c9, B:192:0x00f6, B:19:0x00fd, B:62:0x01b3, B:105:0x026b, B:108:0x02a9, B:110:0x02b6, B:112:0x02bf, B:113:0x02ca, B:115:0x02d0, B:122:0x02f7, B:130:0x02fb, B:154:0x0329, B:133:0x0330, B:145:0x0360, B:136:0x0367, B:65:0x01f7, B:67:0x0204, B:69:0x020d, B:70:0x0218, B:72:0x021e, B:79:0x0258, B:22:0x0142, B:24:0x014f, B:26:0x0158, B:27:0x0163, B:29:0x0169, B:36:0x01a2, B:208:0x0044), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0258 A[Catch: Exception -> 0x0038, TRY_ENTER, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x0034, B:12:0x0057, B:201:0x00c2, B:16:0x00c9, B:192:0x00f6, B:19:0x00fd, B:62:0x01b3, B:105:0x026b, B:108:0x02a9, B:110:0x02b6, B:112:0x02bf, B:113:0x02ca, B:115:0x02d0, B:122:0x02f7, B:130:0x02fb, B:154:0x0329, B:133:0x0330, B:145:0x0360, B:136:0x0367, B:65:0x01f7, B:67:0x0204, B:69:0x020d, B:70:0x0218, B:72:0x021e, B:79:0x0258, B:22:0x0142, B:24:0x014f, B:26:0x0158, B:27:0x0163, B:29:0x0169, B:36:0x01a2, B:208:0x0044), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        PreferencesToTypedMigration$migrate$1 preferencesToTypedMigration$migrate$1;
        int i;
        String str;
        Object obj;
        dp20 dp20Var;
        String str2;
        Object obj2;
        tm20 tm20Var;
        String str3;
        List list;
        Object obj3;
        Object b;
        String str4;
        List list2;
        List list3;
        List list4;
        Object b2;
        String str5;
        Object b3;
        String str6;
        Object obj4;
        em20 em20Var;
        String str7;
        Object obj5;
        cs20 cs20Var;
        Object obj6;
        List list5;
        Iterator it;
        Class<pr20> cls;
        Object obj7;
        zcx zcxVar;
        Iterator it2;
        Class<qp20> cls2;
        Object obj8;
        Object obj9;
        try {
            if (continuationImpl instanceof PreferencesToTypedMigration$migrate$1) {
                preferencesToTypedMigration$migrate$1 = (PreferencesToTypedMigration$migrate$1) continuationImpl;
                int i2 = preferencesToTypedMigration$migrate$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    preferencesToTypedMigration$migrate$1.label = i2 - Integer.MIN_VALUE;
                    Object obj10 = preferencesToTypedMigration$migrate$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = preferencesToTypedMigration$migrate$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj10);
                        tpr tprVar = (tpr) this.d.invoke();
                        preferencesToTypedMigration$migrate$1.L$0 = null;
                        preferencesToTypedMigration$migrate$1.label = 1;
                        obj10 = kotlinx.coroutines.flow.e.y(tprVar, preferencesToTypedMigration$migrate$1);
                        if (obj10 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj10);
                    }
                    mme0 mme0Var = (mme0) obj10;
                    String str8 = (String) mme0Var.c(new kme0("mob_id"));
                    String str9 = (String) mme0Var.c(new kme0("country_iso"));
                    String str10 = (String) mme0Var.c(new kme0("ip_to_geo_country_iso"));
                    Integer num = (Integer) mme0Var.c(new kme0("notifications_polling_interval"));
                    str = (String) mme0Var.c(new kme0("metrica_data"));
                    Object obj11 = zy11.a;
                    if (str == null) {
                        try {
                            if (dp20.class.equals(zy11.class)) {
                                obj = (dp20) obj11;
                            } else {
                                zcx zcxVar2 = qr20.a;
                                obj = zcxVar2.b(gtq0.H(zcxVar2.b, qoi0.c(dp20.class)), str);
                            }
                        } catch (Exception unused) {
                            obj = null;
                        }
                        dp20Var = (dp20) obj;
                    } else {
                        dp20Var = null;
                    }
                    str2 = (String) mme0Var.c(new kme0("mob_config"));
                    if (str2 == null) {
                        try {
                            if (tm20.class.equals(zy11.class)) {
                                obj2 = (tm20) obj11;
                            } else {
                                zcx zcxVar3 = qr20.a;
                                obj2 = zcxVar3.b(gtq0.H(zcxVar3.b, qoi0.c(tm20.class)), str2);
                            }
                        } catch (Exception unused2) {
                            obj2 = null;
                        }
                        tm20Var = (tm20) obj2;
                    } else {
                        tm20Var = null;
                    }
                    str3 = (String) mme0Var.c(new kme0("mob_notifications_v2"));
                    Class<qp20> cls3 = qp20.class;
                    List list6 = EmptyList.a;
                    if (str3 == null) {
                        try {
                            if (List.class.equals(zy11.class)) {
                                b = (List) obj11;
                            } else {
                                zcx zcxVar4 = qr20.a;
                                kf5 kf5Var = zcxVar4.b;
                                int i3 = ogx.c;
                                b = zcxVar4.b(gtq0.H(kf5Var, qoi0.d(acb1.e(qoi0.e(cls3)))), str3);
                            }
                            list = (List) b;
                        } catch (Exception unused3) {
                            list = list6;
                        }
                        obj3 = obj11;
                    } else {
                        Set set = (Set) mme0Var.c(new kme0("mob_notifications"));
                        if (set == null || set.isEmpty()) {
                            obj3 = obj11;
                            list = list6;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Iterator it3 = set.iterator();
                            while (it3.hasNext()) {
                                String str11 = (String) it3.next();
                                try {
                                    if (cls3.equals(zy11.class)) {
                                        obj9 = (qp20) obj11;
                                        it2 = it3;
                                        cls2 = cls3;
                                        obj8 = obj11;
                                    } else {
                                        it2 = it3;
                                        try {
                                            zcx zcxVar5 = qr20.a;
                                            cls2 = cls3;
                                            try {
                                                obj8 = obj11;
                                                try {
                                                    obj9 = zcxVar5.b(gtq0.H(zcxVar5.b, qoi0.c(cls2)), str11);
                                                } catch (Exception unused4) {
                                                    obj9 = null;
                                                    if (obj9 == null) {
                                                    }
                                                    it3 = it2;
                                                    cls3 = cls2;
                                                    obj11 = obj8;
                                                }
                                            } catch (Exception unused5) {
                                                obj8 = obj11;
                                                obj9 = null;
                                                if (obj9 == null) {
                                                }
                                                it3 = it2;
                                                cls3 = cls2;
                                                obj11 = obj8;
                                            }
                                        } catch (Exception unused6) {
                                            cls2 = cls3;
                                            obj8 = obj11;
                                            obj9 = null;
                                            if (obj9 == null) {
                                            }
                                            it3 = it2;
                                            cls3 = cls2;
                                            obj11 = obj8;
                                        }
                                    }
                                } catch (Exception unused7) {
                                    it2 = it3;
                                }
                                if (obj9 == null) {
                                    arrayList.add(obj9);
                                }
                                it3 = it2;
                                cls3 = cls2;
                                obj11 = obj8;
                            }
                            obj3 = obj11;
                            list = arrayList;
                        }
                    }
                    str4 = (String) mme0Var.c(new kme0("mob_selected_proxies_v2"));
                    Class<pr20> cls4 = pr20.class;
                    if (str4 == null) {
                        try {
                            if (List.class.equals(zy11.class)) {
                                b2 = (List) obj3;
                            } else {
                                zcx zcxVar6 = qr20.a;
                                kf5 kf5Var2 = zcxVar6.b;
                                int i4 = ogx.c;
                                b2 = zcxVar6.b(gtq0.H(kf5Var2, qoi0.d(acb1.e(qoi0.e(cls4)))), str4);
                            }
                            list2 = (List) b2;
                        } catch (Exception unused8) {
                            list2 = list6;
                        }
                        list3 = list;
                        list4 = list2;
                    } else {
                        Set set2 = (Set) mme0Var.c(new kme0("mob_selected_proxies"));
                        if (set2 == null || set2.isEmpty()) {
                            list3 = list;
                            list4 = list6;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it4 = set2.iterator();
                            while (it4.hasNext()) {
                                String str12 = (String) it4.next();
                                try {
                                    if (cls4.equals(zy11.class)) {
                                        obj7 = (pr20) obj3;
                                        list5 = list;
                                        it = it4;
                                        cls = cls4;
                                    } else {
                                        list5 = list;
                                        try {
                                            zcxVar = qr20.a;
                                            it = it4;
                                        } catch (Exception unused9) {
                                            it = it4;
                                            cls = cls4;
                                            obj7 = null;
                                            if (obj7 == null) {
                                            }
                                            list = list5;
                                            it4 = it;
                                            cls4 = cls;
                                        }
                                        try {
                                            cls = cls4;
                                            try {
                                                obj7 = zcxVar.b(gtq0.H(zcxVar.b, qoi0.c(cls)), str12);
                                            } catch (Exception unused10) {
                                                obj7 = null;
                                                if (obj7 == null) {
                                                }
                                                list = list5;
                                                it4 = it;
                                                cls4 = cls;
                                            }
                                        } catch (Exception unused11) {
                                            cls = cls4;
                                            obj7 = null;
                                            if (obj7 == null) {
                                            }
                                            list = list5;
                                            it4 = it;
                                            cls4 = cls;
                                        }
                                    }
                                } catch (Exception unused12) {
                                    list5 = list;
                                }
                                if (obj7 == null) {
                                    arrayList2.add(obj7);
                                }
                                list = list5;
                                it4 = it;
                                cls4 = cls;
                            }
                            list3 = list;
                            list4 = arrayList2;
                        }
                    }
                    str5 = (String) mme0Var.c(new kme0("api_names_for_detail_report_v2"));
                    if (str5 == null) {
                        try {
                            if (List.class.equals(zy11.class)) {
                                b3 = (List) obj3;
                            } else {
                                zcx zcxVar7 = qr20.a;
                                kf5 kf5Var3 = zcxVar7.b;
                                int i5 = ogx.c;
                                b3 = zcxVar7.b(gtq0.H(kf5Var3, qoi0.d(acb1.e(qoi0.e(dq20.class)))), str5);
                            }
                            list6 = (List) b3;
                        } catch (Exception unused13) {
                        }
                    } else {
                        Set<String> set3 = (Set) mme0Var.c(new kme0("api_names_for_detail_report"));
                        if (set3 != null && !set3.isEmpty()) {
                            list6 = new ArrayList();
                            for (String str13 : set3) {
                                try {
                                    if (dq20.class.equals(zy11.class)) {
                                        obj6 = (dq20) obj3;
                                    } else {
                                        zcx zcxVar8 = qr20.a;
                                        obj6 = zcxVar8.b(gtq0.H(zcxVar8.b, qoi0.c(dq20.class)), str13);
                                    }
                                } catch (Exception unused14) {
                                    obj6 = null;
                                }
                                if (obj6 != null) {
                                    list6.add(obj6);
                                }
                            }
                        }
                    }
                    str6 = (String) mme0Var.c(new kme0("availability_report"));
                    if (str6 == null) {
                        try {
                            if (em20.class.equals(zy11.class)) {
                                obj4 = (em20) obj3;
                            } else {
                                zcx zcxVar9 = qr20.a;
                                obj4 = zcxVar9.b(gtq0.H(zcxVar9.b, qoi0.c(em20.class)), str6);
                            }
                        } catch (Exception unused15) {
                            obj4 = null;
                        }
                        em20Var = (em20) obj4;
                    } else {
                        em20Var = null;
                    }
                    str7 = (String) mme0Var.c(new kme0("vpn_state"));
                    if (str7 == null) {
                        try {
                            if (cs20.class.equals(zy11.class)) {
                                obj5 = (cs20) obj3;
                            } else {
                                zcx zcxVar10 = qr20.a;
                                obj5 = zcxVar10.b(gtq0.H(zcxVar10.b, qoi0.c(cs20.class)), str7);
                            }
                        } catch (Exception unused16) {
                            obj5 = null;
                        }
                        cs20Var = (cs20) obj5;
                    } else {
                        cs20Var = null;
                    }
                    return new xr20(str8, str9, str10, num, dp20Var, list3, list6, em20Var, cs20Var, e(mme0Var, false), e(mme0Var, true), tm20Var, list4, 9220);
                }
            }
            if (i != 0) {
            }
            mme0 mme0Var2 = (mme0) obj10;
            String str82 = (String) mme0Var2.c(new kme0("mob_id"));
            String str92 = (String) mme0Var2.c(new kme0("country_iso"));
            String str102 = (String) mme0Var2.c(new kme0("ip_to_geo_country_iso"));
            Integer num2 = (Integer) mme0Var2.c(new kme0("notifications_polling_interval"));
            str = (String) mme0Var2.c(new kme0("metrica_data"));
            Object obj112 = zy11.a;
            if (str == null) {
            }
            str2 = (String) mme0Var2.c(new kme0("mob_config"));
            if (str2 == null) {
            }
            str3 = (String) mme0Var2.c(new kme0("mob_notifications_v2"));
            Class<qp20> cls32 = qp20.class;
            List list62 = EmptyList.a;
            if (str3 == null) {
            }
            str4 = (String) mme0Var2.c(new kme0("mob_selected_proxies_v2"));
            Class<pr20> cls42 = pr20.class;
            if (str4 == null) {
            }
            str5 = (String) mme0Var2.c(new kme0("api_names_for_detail_report_v2"));
            if (str5 == null) {
            }
            str6 = (String) mme0Var2.c(new kme0("availability_report"));
            if (str6 == null) {
            }
            str7 = (String) mme0Var2.c(new kme0("vpn_state"));
            if (str7 == null) {
            }
            return new xr20(str82, str92, str102, num2, dp20Var, list3, list62, em20Var, cs20Var, e(mme0Var2, false), e(mme0Var2, true), tm20Var, list4, 9220);
        } catch (Exception e) {
            this.c.a("PreferencesToTypedMigration", e);
            return new xr20(null, null, null, null, null, null, null, null, null, null, null, null, null, 65535);
        }
        preferencesToTypedMigration$migrate$1 = new PreferencesToTypedMigration$migrate$1(this, continuationImpl);
        Object obj102 = preferencesToTypedMigration$migrate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preferencesToTypedMigration$migrate$1.label;
    }
}
