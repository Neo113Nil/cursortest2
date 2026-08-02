package xsna;

import com.vk.api.generated.businessGroups.dto.BusinessGroupsGetShieldSettingsResponseDto;
import com.vk.api.generated.businessGroups.dto.BusinessGroupsGetShieldSettingsScreenDto;
import com.vk.api.generated.businessGroups.dto.BusinessGroupsShieldSettingsVerificationItemDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.rmu;

/* compiled from: SelectGroupVerificationRepository.kt */
/* loaded from: classes18.dex */
public final class g8i0 {
    public final znk0 a;

    public g8i0(znk0 znk0Var) {
        this.a = znk0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public static rmu b(BusinessGroupsGetShieldSettingsResponseDto businessGroupsGetShieldSettingsResponseDto) {
        ?? r1;
        List<BusinessGroupsShieldSettingsVerificationItemDto> k = businessGroupsGetShieldSettingsResponseDto.k();
        if (k != null) {
            List<BusinessGroupsShieldSettingsVerificationItemDto> list = k;
            r1 = new ArrayList(c5g.u(list, 10));
            for (BusinessGroupsShieldSettingsVerificationItemDto businessGroupsShieldSettingsVerificationItemDto : list) {
                String i = businessGroupsShieldSettingsVerificationItemDto.f().i();
                String title = businessGroupsShieldSettingsVerificationItemDto.getTitle();
                String description = businessGroupsShieldSettingsVerificationItemDto.getDescription();
                String e = businessGroupsShieldSettingsVerificationItemDto.e();
                String d = businessGroupsShieldSettingsVerificationItemDto.d();
                Boolean i2 = businessGroupsShieldSettingsVerificationItemDto.i();
                Boolean bool = Boolean.TRUE;
                r1.add(new rmu.a(i, title, description, e, d, epx.f(i2, bool), epx.f(businessGroupsShieldSettingsVerificationItemDto.g(), bool)));
            }
        } else {
            r1 = 0;
        }
        if (r1 == 0) {
            r1 = EmptyList.b;
        }
        String d2 = businessGroupsGetShieldSettingsResponseDto.f().d();
        if (d2 == null) {
            d2 = "";
        }
        return new rmu(r1, d2, businessGroupsGetShieldSettingsResponseDto.getTitle());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|13|(4:15|16|17|18)(1:24)))|34|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        r6 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(UserId userId, ContinuationImpl continuationImpl) {
        f8i0 f8i0Var;
        int i;
        Object failure;
        if (continuationImpl instanceof f8i0) {
            f8i0Var = (f8i0) continuationImpl;
            int i2 = f8i0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f8i0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = f8i0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = f8i0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    iz2 A = yfb.A(this.a.f(userId, BusinessGroupsGetShieldSettingsScreenDto.VERIFICATION));
                    f8i0Var.L$0 = null;
                    f8i0Var.I$0 = 0;
                    f8i0Var.label = 1;
                    obj = evj.p(A, f8i0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                failure = (BusinessGroupsGetShieldSettingsResponseDto) obj;
                if (!(failure instanceof Result.Failure)) {
                    return failure;
                }
                try {
                    return b((BusinessGroupsGetShieldSettingsResponseDto) failure);
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }
        f8i0Var = new f8i0(this, continuationImpl);
        Object obj2 = f8i0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = f8i0Var.label;
        if (i != 0) {
        }
        failure = (BusinessGroupsGetShieldSettingsResponseDto) obj2;
        if (!(failure instanceof Result.Failure)) {
        }
    }
}
