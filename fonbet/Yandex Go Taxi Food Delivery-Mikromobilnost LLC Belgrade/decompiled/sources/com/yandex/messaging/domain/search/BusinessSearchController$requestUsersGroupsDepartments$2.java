package com.yandex.messaging.domain.search;

import com.yandex.messaging.core.net.entities.DepartmentData;
import com.yandex.messaging.core.net.entities.GroupData;
import com.yandex.messaging.core.net.entities.SearchData;
import com.yandex.messaging.core.net.entities.SearchParams;
import com.yandex.messaging.core.net.entities.UserData;
import defpackage.i3u;
import defpackage.ijt;
import defpackage.jl40;
import defpackage.kwi;
import defpackage.l020;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.qjt;
import defpackage.qn2;
import defpackage.rjt;
import defpackage.sjt;
import defpackage.tnq;
import defpackage.tse;
import defpackage.wls;
import defpackage.xx6;
import defpackage.yx6;
import defpackage.z83;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lijt;", "<anonymous>", "(Ltse;)Lijt;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.search.BusinessSearchController$requestUsersGroupsDepartments$2", f = "BusinessSearchController.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BusinessSearchController$requestUsersGroupsDepartments$2 extends SuspendLambda implements wls {
    final /* synthetic */ yx6 $filter;
    final /* synthetic */ String $suggestChatId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xx6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessSearchController$requestUsersGroupsDepartments$2(xx6 xx6Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xx6Var;
        this.$suggestChatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BusinessSearchController$requestUsersGroupsDepartments$2 businessSearchController$requestUsersGroupsDepartments$2 = new BusinessSearchController$requestUsersGroupsDepartments$2(this.this$0, this.$suggestChatId, continuation);
        businessSearchController$requestUsersGroupsDepartments$2.L$0 = obj;
        return businessSearchController$requestUsersGroupsDepartments$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BusinessSearchController$requestUsersGroupsDepartments$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SearchData.UsersGroupsDepartments usersGroupsDepartments;
        T t;
        SearchData searchData;
        SearchData.Warnings warnings;
        GroupData groupData;
        DepartmentData departmentData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        UserData[] userDataArr = null;
        if (i == 0) {
            b.b(obj);
            throw null;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SearchParams searchParams = (SearchParams) this.L$0;
        b.b(obj);
        oyj0 oyj0Var = (oyj0) obj;
        qn2 qn2Var = (qn2) oyj0Var.a();
        int i2 = 0;
        if (qn2Var != null) {
            this.this$0.f.c(searchParams, qn2Var.a);
            return new ijt(i2);
        }
        SearchData searchData2 = (SearchData) oyj0Var.b();
        if (searchData2 == null || (usersGroupsDepartments = searchData2.usersGroupsDepartments) == null) {
            return new ijt(i2);
        }
        xx6 xx6Var = this.this$0;
        xx6Var.getClass();
        ArrayList arrayList = new ArrayList();
        SearchData.CommonSearchEntity[] commonSearchEntityArr = usersGroupsDepartments.items;
        if (commonSearchEntityArr != null) {
            ArrayList arrayList2 = new ArrayList();
            for (SearchData.CommonSearchEntity commonSearchEntity : commonSearchEntityArr) {
                if (jl40.l(commonSearchEntity.entity, "department")) {
                    arrayList2.add(commonSearchEntity);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                SearchData.CommonSearchData commonSearchData = ((SearchData.CommonSearchEntity) it.next()).data;
                Long l = commonSearchData.departmentId;
                String str = commonSearchData.name;
                Long l2 = commonSearchData.organizationId;
                Long l3 = commonSearchData.version;
                Integer num = commonSearchData.membersCount;
                int intValue = num != null ? num.intValue() : 0;
                if (l == null || str == null || l2 == null || l3 == null) {
                    z83.i();
                    departmentData = null;
                } else {
                    departmentData = new DepartmentData(l.longValue(), str, l2.longValue(), commonSearchData.organizationName, l3.longValue(), intValue);
                }
                if (departmentData != null) {
                    arrayList.add(new qjt(departmentData.getMembersCount(), departmentData.getId(), departmentData.getOrganizationId(), departmentData.getName(), departmentData.getOrganizationName()));
                    xx6Var.e.a.y(new kwi(departmentData.getId(), departmentData.getOrganizationId()), departmentData);
                }
            }
        }
        xx6 xx6Var2 = this.this$0;
        xx6Var2.getClass();
        ArrayList arrayList3 = new ArrayList();
        SearchData.CommonSearchEntity[] commonSearchEntityArr2 = usersGroupsDepartments.items;
        if (commonSearchEntityArr2 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (SearchData.CommonSearchEntity commonSearchEntity2 : commonSearchEntityArr2) {
                if (jl40.l(commonSearchEntity2.entity, "group")) {
                    arrayList4.add(commonSearchEntity2);
                }
            }
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                SearchData.CommonSearchData commonSearchData2 = ((SearchData.CommonSearchEntity) it2.next()).data;
                Long l4 = commonSearchData2.groupId;
                String str2 = commonSearchData2.name;
                Long l5 = commonSearchData2.organizationId;
                Long l6 = commonSearchData2.version;
                Integer num2 = commonSearchData2.membersCount;
                int intValue2 = num2 != null ? num2.intValue() : 0;
                if (l4 == null || str2 == null || l5 == null || l6 == null) {
                    z83.i();
                    groupData = null;
                } else {
                    groupData = new GroupData(l4.longValue(), str2, l5.longValue(), commonSearchData2.organizationName, l6.longValue(), intValue2);
                }
                if (groupData != null) {
                    arrayList3.add(new rjt(groupData.getMembersCount(), groupData.getId(), groupData.getOrganizationId(), groupData.getName(), groupData.getOrganizationName()));
                    xx6Var2.d.a.y(new i3u(groupData.getId(), groupData.getOrganizationId()), groupData);
                }
            }
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        l020 C = this.this$0.c.C();
        xx6 xx6Var3 = this.this$0;
        try {
            ref$ObjectRef.element = xx6.a(xx6Var3, usersGroupsDepartments, C);
            if (((tnq) xx6Var3.g.get()).c && (searchData = (SearchData) oyj0Var.b()) != null && (warnings = searchData.warnings) != null) {
                userDataArr = warnings.users;
            }
            if (userDataArr != null) {
                t = new ArrayList(userDataArr.length);
                int length = userDataArr.length;
                while (i2 < length) {
                    UserData userData = userDataArr[i2];
                    C.D0(userData);
                    t.add(new sjt(userData.userId));
                    i2++;
                }
            } else {
                t = EmptyList.a;
            }
            ref$ObjectRef2.element = t;
            C.s();
            C.close();
            return new ijt(kotlin.collections.a.m0((Iterable) ref$ObjectRef.element, kotlin.collections.a.m0(arrayList3, arrayList)), (List) ref$ObjectRef2.element);
        } finally {
        }
    }
}
