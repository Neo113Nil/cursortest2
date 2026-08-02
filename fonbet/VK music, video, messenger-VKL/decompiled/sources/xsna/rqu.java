package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GroupsRepository.kt */
/* loaded from: classes5.dex */
public final class rqu {
    public final b25 a;
    public final zqu b = new zqu();
    public final dqu c = new dqu();

    public rqu(b25 b25Var) {
        this.a = b25Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, ContinuationImpl continuationImpl) {
        pqu pquVar;
        int i;
        try {
            if (continuationImpl instanceof pqu) {
                pquVar = (pqu) continuationImpl;
                int i2 = pquVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pquVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = pquVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pquVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        ej70 ej70Var = new ej70(j);
                        pquVar.L$0 = null;
                        pquVar.J$0 = j;
                        pquVar.I$0 = 0;
                        pquVar.label = 1;
                        obj = evj.p(ej70Var, pquVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    return (bvl) obj;
                }
            }
            if (i != 0) {
            }
            return (bvl) obj;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        pquVar = new pqu(this, continuationImpl);
        Object obj2 = pquVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pquVar.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:31|32))(3:33|34|(1:36))|12|13|(6:15|16|(2:19|17)|20|21|22)(1:29)))|40|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        r12 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        qqu qquVar;
        int i;
        Object failure;
        if (continuationImpl instanceof qqu) {
            qquVar = (qqu) continuationImpl;
            int i2 = qquVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qquVar.label = i2 - Integer.MIN_VALUE;
                Object obj = qquVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qquVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    iz2 A = yfb.A(xqu.h(this.b, this.a.c(), Collections.singletonList(GroupsFilterDto.ENABLED_NOTIFICATIONS), e43.l(GroupsFieldsDto.ACTIVITY, GroupsFieldsDto.MEMBERS_COUNT_TEXT), null, null, 56));
                    qquVar.L$0 = null;
                    qquVar.I$0 = 0;
                    qquVar.label = 1;
                    obj = evj.p(A, qquVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                failure = (GroupsGetObjectExtendedResponseDto) obj;
                if (!(failure instanceof Result.Failure)) {
                    return failure;
                }
                try {
                    List<GroupsGroupFullDto> e = ((GroupsGetObjectExtendedResponseDto) failure).e();
                    dqu dquVar = this.c;
                    ArrayList arrayList = new ArrayList(c5g.u(e, 10));
                    for (GroupsGroupFullDto groupsGroupFullDto : e) {
                        dquVar.getClass();
                        arrayList.add(dqu.a(groupsGroupFullDto));
                    }
                    return arrayList;
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }
        qquVar = new qqu(this, continuationImpl);
        Object obj2 = qquVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qquVar.label;
        if (i != 0) {
        }
        failure = (GroupsGetObjectExtendedResponseDto) obj2;
        if (!(failure instanceof Result.Failure)) {
        }
    }
}
