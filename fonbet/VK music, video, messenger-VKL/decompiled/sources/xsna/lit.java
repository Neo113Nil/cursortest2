package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.dto.common.id.UserId;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.wqu;
import xsna.yqu;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class lit implements hfn0 {
    public final bpn0 a = new bpn0(new z34(11));

    @Override // xsna.hfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(long j, long j2) {
        return rdx0.u(e370.e(yqu.a.a(new UserId(j), new UserId(j2)))).U(new qs6(new xr0(29), 16));
    }

    @Override // xsna.hfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 b(long j) {
        return rdx0.u(e370.e(yqu.a.b((480 & 2) != 0 ? null : "0", null, null, null, new UserId(j), null, null, null))).U(new o40(new dh5(28), 20));
    }

    @Override // xsna.hfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 c(long j, long j2, long j3, String str) {
        int i = (int) j;
        UserId userId = new UserId(j2);
        int i2 = (int) j3;
        String str2 = "";
        for (byte b : MessageDigest.getInstance("SHA-256").digest(j5g.g0(e43.l(String.valueOf(j3), dgn0.b().l, String.valueOf(j), String.valueOf(j2), "U$83gh9t)!0G9KXS]INXG(-q!dFY-["), HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, 0, null, 62).getBytes(emb.b))) {
            StringBuilder e = fw3.e(str2);
            e.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
            str2 = e.toString();
        }
        ufx ufxVar = new ufx("groups.sendPayload", new r11(17), new sf3(14));
        ufx.k(ufxVar, "app_id", i, 0, 8);
        ufx.m(ufxVar, "group_id", userId, 1L, 8);
        ufx.n(ufxVar, "payload", str, 0, 12);
        ufx.k(ufxVar, "time", i2, 0, 8);
        ufxVar.g(64, 64, InAppPurchaseMetaData.KEY_SIGNATURE, str2);
        return rdx0.u(e370.e(ufxVar)).U(new m40(new amp(5), 15));
    }

    @Override // xsna.hfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 d(long j) {
        return g(Collections.singletonList(Long.valueOf(j))).U(new ed(new dam(9), 19));
    }

    @Override // xsna.hfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 e(long j) {
        return rdx0.u(e370.e(yqu.a.d(new UserId(j), null, null, null, null))).U(new com.vk.movika.sdk.base.ui.j(new fj1(28), 15));
    }

    @Override // xsna.hfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 f(long j) {
        List singletonList = Collections.singletonList(Long.valueOf(j));
        ArrayList arrayList = new ArrayList(c5g.u(singletonList, 10));
        Iterator it = singletonList.iterator();
        while (it.hasNext()) {
            dq.h(((Number) it.next()).longValue(), arrayList);
        }
        List l = e43.l(GroupsFieldsDto.ID, GroupsFieldsDto.NAME, GroupsFieldsDto.IS_CLOSED, GroupsFieldsDto.PHOTO_BASE);
        if ((4 & 2) != 0) {
            l = null;
        }
        return rdx0.u(e370.e(wqu.a.a(null, arrayList, l))).U(new u5(new vs6(1, (mlu) this.a.getValue(), mlu.class, "mapToWebGroup", "mapToWebGroup(Lcom/vk/api/generated/groups/dto/GroupsGetByIdObjectResponseDto;)Ljava/util/List;", 0, 4), 17)).U(new zj0(new ve0(27), 14));
    }

    @Override // xsna.hfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 g(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            dq.h(((Number) it.next()).longValue(), arrayList);
        }
        List l = e43.l(GroupsFieldsDto.ID, GroupsFieldsDto.NAME, GroupsFieldsDto.SCREEN_NAME, GroupsFieldsDto.IS_CLOSED, GroupsFieldsDto.TYPE, GroupsFieldsDto.IS_MEMBER, GroupsFieldsDto.DESCRIPTION, GroupsFieldsDto.MEMBERS_COUNT, GroupsFieldsDto.PHOTO_BASE);
        if ((4 & 2) != 0) {
            l = null;
        }
        return rdx0.u(e370.e(wqu.a.a(null, arrayList, l))).U(new y34(new q1(1, (mlu) this.a.getValue(), mlu.class, "mapToWebGroupShortInfo", "mapToWebGroupShortInfo(Lcom/vk/api/generated/groups/dto/GroupsGetByIdObjectResponseDto;)Ljava/util/List;", 0, 3), 19));
    }
}
