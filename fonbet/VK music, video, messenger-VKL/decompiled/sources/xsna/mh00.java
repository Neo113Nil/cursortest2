package xsna;

import android.os.Build;
import com.vk.api.generated.account.dto.AccountManagePushDeviceMultiActionsDto;
import com.vk.api.generated.account.dto.AccountManagePushDeviceMultiPushProviderDto;
import com.vk.api.generated.account.dto.AccountManagePushDeviceMultiTypesDto;
import com.vk.instantjobs.InstantJob;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import xsna.ij20;
import xsna.u6x;

/* compiled from: ManageDeviceForPushesJob.kt */
/* loaded from: classes.dex */
public final class mh00 extends u4w {
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;
    public final String g;
    public final List<String> h;
    public final boolean i;
    public final boolean j;
    public final Boolean k;
    public final vle0 l = new vle0();

    /* compiled from: ManageDeviceForPushesJob.kt */
    public static final class a implements s7x<mh00> {
        @Override // xsna.s7x
        public final mh00 a(ny90 ny90Var) {
            String f = ny90Var.f("token");
            int c = ny90Var.c(CallAnalyticsApiRequest.KEY_APP_VERSION);
            String f2 = ny90Var.f("companion_apps");
            boolean a = ny90Var.a("google_services_available");
            String f3 = ny90Var.f("push_provider");
            String i = ny90Var.i("unregister_tokens", "");
            if (drm0.N(i)) {
                i = null;
            }
            List c0 = i != null ? drm0.c0(i, new String[]{StringUtils.COMMA}, 0, 6) : null;
            if (c0 == null) {
                c0 = EmptyList.b;
            }
            return new mh00(f, c, f2, a, f3, c0, ny90Var.a("is_multi_push_enabled"), ny90Var.h("only_unregister"), ny90Var.g("send_stat_setting_switch") ? Boolean.valueOf(ny90Var.a("send_stat_setting_switch")) : null);
        }

        @Override // xsna.s7x
        public final void b(mh00 mh00Var, ny90 ny90Var) {
            mh00 mh00Var2 = mh00Var;
            ny90Var.o("token", mh00Var2.c);
            ny90Var.l(CallAnalyticsApiRequest.KEY_APP_VERSION, mh00Var2.d);
            ny90Var.o("companion_apps", mh00Var2.e);
            ny90Var.j("google_services_available", mh00Var2.f);
            ny90Var.o("push_provider", mh00Var2.g);
            ny90Var.o("unregister_tokens", j5g.g0(mh00Var2.h, StringUtils.COMMA, null, null, 0, null, 62));
            ny90Var.j("is_multi_push_enabled", mh00Var2.i);
            ny90Var.j("only_unregister", mh00Var2.j);
            Boolean bool = mh00Var2.k;
            if (bool != null) {
                ny90Var.j("send_stat_setting_switch", bool.booleanValue());
            }
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ImManageDeviceForPushes";
        }
    }

    public mh00(String str, int i, String str2, boolean z, String str3, List<String> list, boolean z2, boolean z3, Boolean bool) {
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = z;
        this.g = str3;
        this.h = list;
        this.i = z2;
        this.j = z3;
        this.k = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v24, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        Collection arrayList;
        List g;
        Iterable<?> iterable;
        List list;
        AccountManagePushDeviceMultiPushProviderDto accountManagePushDeviceMultiPushProviderDto;
        w2w w2wVar2;
        String str;
        int i;
        long j = w2wVar.H0().d;
        this.l.getClass();
        String c = vle0.c(j);
        vx2.a.getClass();
        wy2 b = vx2.b();
        if (this.j) {
            arrayList = EmptyList.b;
        } else {
            List<h7r0> value = b.i().e.getValue();
            ArrayList arrayList2 = new ArrayList(c5g.u(value, 10));
            Iterator it = value.iterator();
            while (it.hasNext()) {
                arrayList2.add(((h7r0) it.next()).a);
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (!drm0.N((String) next)) {
                    arrayList.add(next);
                }
            }
        }
        List<String> list2 = this.h;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list2) {
            if (!drm0.N((String) obj)) {
                arrayList3.add(obj);
            }
        }
        if (o25.a().b() || !arrayList3.isEmpty()) {
            ListBuilder e = e43.e();
            e.addAll(arrayList);
            e.addAll(arrayList3);
            ListBuilder g2 = e.g();
            int size = arrayList.size();
            ArrayList arrayList4 = new ArrayList(size);
            int i2 = 0;
            while (i2 < size) {
                arrayList4.add(i2 == 0 ? AccountManagePushDeviceMultiActionsDto.REGISTER : this.i ? AccountManagePushDeviceMultiActionsDto.REGISTER : AccountManagePushDeviceMultiActionsDto.UNREGISTER);
                i2++;
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (((AccountManagePushDeviceMultiActionsDto) next2) == AccountManagePushDeviceMultiActionsDto.REGISTER) {
                    arrayList5.add(next2);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                Object next3 = it4.next();
                if (((AccountManagePushDeviceMultiActionsDto) next3) == AccountManagePushDeviceMultiActionsDto.UNREGISTER) {
                    arrayList6.add(next3);
                }
            }
            ArrayList arrayList7 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                arrayList7.add(AccountManagePushDeviceMultiActionsDto.UNREGISTER);
            }
            ListBuilder e2 = e43.e();
            e2.addAll(arrayList6);
            e2.addAll(arrayList7);
            ListBuilder g3 = e2.g();
            ListBuilder e3 = e43.e();
            e3.addAll(arrayList5);
            e3.addAll(g3);
            ListBuilder g4 = e3.g();
            ArrayList arrayList8 = new ArrayList(c5g.u(arrayList5, 10));
            Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                arrayList8.add(AccountManagePushDeviceMultiTypesDto.DEFAULT);
            }
            ArrayList arrayList9 = new ArrayList(c5g.u(g3, 10));
            ListIterator listIterator = g3.listIterator(0);
            while (true) {
                ListBuilder.a aVar2 = (ListBuilder.a) listIterator;
                if (!aVar2.hasNext()) {
                    break;
                }
                arrayList9.add(AccountManagePushDeviceMultiTypesDto.ALL);
            }
            ListBuilder e4 = e43.e();
            e4.addAll(arrayList8);
            e4.addAll(arrayList9);
            g = e4.g();
            iterable = g2;
            list = g4;
        } else {
            iterable = EmptyList.b;
            g = Collections.singletonList(AccountManagePushDeviceMultiTypesDto.DEFAULT);
            list = Collections.singletonList(AccountManagePushDeviceMultiActionsDto.REGISTER);
        }
        AccountManagePushDeviceMultiPushProviderDto[] values = AccountManagePushDeviceMultiPushProviderDto.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                accountManagePushDeviceMultiPushProviderDto = null;
                break;
            }
            accountManagePushDeviceMultiPushProviderDto = values[i3];
            if (epx.f(accountManagePushDeviceMultiPushProviderDto.i(), this.g)) {
                break;
            } else {
                i3++;
            }
        }
        if (accountManagePushDeviceMultiPushProviderDto == null) {
            accountManagePushDeviceMultiPushProviderDto = AccountManagePushDeviceMultiPushProviderDto.FCM;
        }
        String b2 = b6m.b(w2wVar.getContext());
        this.l.getClass();
        String b3 = vle0.b();
        String str2 = this.c;
        if (drm0.N(c)) {
            w2wVar2 = w2wVar;
            str = null;
        } else {
            vle0 vle0Var = this.l;
            String str3 = this.c;
            vle0Var.getClass();
            w2wVar2 = w2wVar;
            str = vle0.d(str3, w2wVar2, c);
        }
        String str4 = Build.VERSION.RELEASE;
        String valueOf = String.valueOf(this.d);
        Iterable<?> iterable2 = iterable;
        List list3 = g;
        List c0 = drm0.c0(this.e, new String[]{StringUtils.COMMA}, 0, 6);
        boolean z = this.f;
        Boolean valueOf2 = this.k != null ? Boolean.valueOf(!r3.booleanValue()) : null;
        boolean e5 = w2wVar2.getConfig().f.e();
        Boolean bool = valueOf2;
        ufx ufxVar = new ufx("account.managePushDeviceMulti", new sr(0), new tr(0));
        ufx.n(ufxVar, "device_id", b2, 0, 12);
        ufxVar.h("access_tokens", iterable2);
        List list4 = list;
        ArrayList arrayList10 = new ArrayList(c5g.u(list4, 10));
        Iterator it7 = list4.iterator();
        while (it7.hasNext()) {
            arrayList10.add(((AccountManagePushDeviceMultiActionsDto) it7.next()).i());
        }
        ufxVar.h("actions", arrayList10);
        List list5 = list3;
        ArrayList arrayList11 = new ArrayList(c5g.u(list5, 10));
        Iterator it8 = list5.iterator();
        while (it8.hasNext()) {
            arrayList11.add(((AccountManagePushDeviceMultiTypesDto) it8.next()).i());
        }
        ufxVar.h("types", arrayList11);
        if (str2 != null) {
            i = 0;
            ufx.n(ufxVar, "token", str2, 0, 12);
        } else {
            i = 0;
        }
        if (b3 != null) {
            ufx.n(ufxVar, AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, b3, i, 12);
        }
        if (str != null) {
            ufx.n(ufxVar, "token_sig", str, i, 12);
        }
        if (str4 != null) {
            ufx.n(ufxVar, "system_version", str4, i, 12);
        }
        if (valueOf != null) {
            ufx.n(ufxVar, CallAnalyticsApiRequest.KEY_APP_VERSION, valueOf, i, 12);
        }
        if (accountManagePushDeviceMultiPushProviderDto != null) {
            ufx.n(ufxVar, "push_provider", accountManagePushDeviceMultiPushProviderDto.i(), i, 12);
        }
        ufxVar.h("companion_apps", c0);
        ufxVar.i("has_google_services", z);
        if (bool != null) {
            ufxVar.i("stat_only_active_account", bool.booleanValue());
        }
        ufxVar.i("pushes_granted", e5);
        ij20.a o = bz2.o(ufxVar, bz2.m());
        o.k = true;
        o.l = true;
        o.o = true;
        o.i = true;
        bz2.f(new ij20(o), new nh00(w2wVar2, this, c, j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh00)) {
            return false;
        }
        mh00 mh00Var = (mh00) obj;
        return epx.f(this.c, mh00Var.c) && this.d == mh00Var.d && epx.f(this.e, mh00Var.e) && this.f == mh00Var.f && epx.f(this.g, mh00Var.g) && epx.f(this.h, mh00Var.h) && this.i == mh00Var.i && this.j == mh00Var.j && epx.f(this.k, mh00Var.k);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(fw3.a(urd0.a(qoy.b(urd0.a(shy.a(this.d, this.c.hashCode() * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        Boolean bool = this.k;
        return b + (bool == null ? 0 : bool.hashCode());
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return "register-device";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "ManageDeviceForPushesJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManageDeviceForPushesJob(token='");
        sb.append(erm0.D0(5, this.c));
        sb.append("...', appVersion=");
        return vu5.b(sb, this.d, ')');
    }
}
