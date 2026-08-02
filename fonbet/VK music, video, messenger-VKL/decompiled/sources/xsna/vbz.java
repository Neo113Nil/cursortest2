package xsna;

import com.vk.api.generated.groups.dto.GroupsBidOrganizationDto;
import com.vk.api.generated.groups.dto.GroupsBidOrganizationLinkedDto;
import com.vk.api.generated.groups.dto.GroupsGetBidOrganizationsListResponseDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: LinkVKBidRepository.kt */
/* loaded from: classes18.dex */
public final class vbz {
    public final zqu a;

    public vbz(zqu zquVar) {
        this.a = zquVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(UserId userId, ContinuationImpl continuationImpl) {
        tbz tbzVar;
        int i;
        vbz vbzVar;
        List<GroupsBidOrganizationDto> d;
        ?? r0;
        String str;
        String str2;
        boolean z;
        if (continuationImpl instanceof tbz) {
            tbzVar = (tbz) continuationImpl;
            int i2 = tbzVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tbzVar.label = i2 - Integer.MIN_VALUE;
                Object obj = tbzVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tbzVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    this.a.getClass();
                    tfx tfxVar = new tfx("groups.getBidOrganizationList", new nq(12), new wq(18));
                    tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
                    iz2 A = yfb.A(tfxVar);
                    tbzVar.L$0 = null;
                    tbzVar.L$1 = this;
                    tbzVar.label = 1;
                    obj = evj.p(A, tbzVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vbzVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vbzVar = (vbz) tbzVar.L$1;
                    kotlin.a.a(obj);
                }
                vbzVar.getClass();
                d = ((GroupsGetBidOrganizationsListResponseDto) obj).d();
                if (d == null) {
                    List<GroupsBidOrganizationDto> list = d;
                    r0 = new ArrayList(c5g.u(list, 10));
                    for (GroupsBidOrganizationDto groupsBidOrganizationDto : list) {
                        long intValue = groupsBidOrganizationDto.e() != null ? r3.intValue() : -1L;
                        String d2 = groupsBidOrganizationDto.d();
                        if (d2 == null) {
                            d2 = "";
                        }
                        String f = groupsBidOrganizationDto.f();
                        if (f == null) {
                            f = "";
                        }
                        String g = groupsBidOrganizationDto.g();
                        String str3 = g != null ? g : "";
                        Boolean i3 = groupsBidOrganizationDto.i();
                        if (i3 != null) {
                            String str4 = f;
                            str = str3;
                            str2 = str4;
                            z = i3.booleanValue();
                        } else {
                            String str5 = f;
                            str = str3;
                            str2 = str5;
                            z = false;
                        }
                        r0.add(new xeu0(d2, str2, str, intValue, z));
                    }
                } else {
                    r0 = EmptyList.b;
                }
                return new afu0(0, r0);
            }
        }
        tbzVar = new tbz(this, continuationImpl);
        Object obj2 = tbzVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tbzVar.label;
        if (i != 0) {
        }
        vbzVar.getClass();
        d = ((GroupsGetBidOrganizationsListResponseDto) obj2).d();
        if (d == null) {
        }
        return new afu0(0, r0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(UserId userId, long j, ContinuationImpl continuationImpl) {
        ubz ubzVar;
        int i;
        if (continuationImpl instanceof ubz) {
            ubzVar = (ubz) continuationImpl;
            int i2 = ubzVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ubzVar.label = i2 - Integer.MIN_VALUE;
                Object obj = ubzVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ubzVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    this.a.getClass();
                    tfx tfxVar = new tfx("groups.setBidLink", new io.reactivex.rxjava3.internal.operators.observable.n0(24), new jr(18));
                    tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
                    tfx.m(tfxVar, "org_id", j, 1L, 8);
                    iz2 A = yfb.A(tfxVar);
                    ubzVar.L$0 = null;
                    ubzVar.J$0 = j;
                    ubzVar.label = 1;
                    obj = evj.p(A, ubzVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return Boolean.valueOf(epx.f(((GroupsBidOrganizationLinkedDto) obj).d(), Boolean.TRUE));
            }
        }
        ubzVar = new ubz(this, continuationImpl);
        Object obj2 = ubzVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ubzVar.label;
        if (i != 0) {
        }
        return Boolean.valueOf(epx.f(((GroupsBidOrganizationLinkedDto) obj2).d(), Boolean.TRUE));
    }
}
