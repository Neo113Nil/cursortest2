package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.businessGroups.dto.BusinessGroupsGetShieldSettingsResponseDto;
import com.vk.api.generated.businessGroups.dto.BusinessGroupsGetShieldSettingsScreenDto;
import com.vk.api.generated.businessGroups.dto.BusinessGroupsShieldSettingsBaseItemDto;
import com.vk.api.generated.businessGroups.dto.BusinessGroupsShieldSettingsButtonDto;
import com.vk.api.generated.businessGroups.dto.BusinessGroupsShieldSettingsImageDto;
import com.vk.api.generated.businessGroups.dto.BusinessGroupsShieldSettingsMessageDto;
import com.vk.dto.common.id.UserId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.ls70;
import xsna.o4q0;

/* compiled from: ObtainVerificationRepository.kt */
/* loaded from: classes18.dex */
public final class ks70 {
    public final znk0 a;

    public ks70(znk0 znk0Var) {
        this.a = znk0Var;
    }

    public static o4q0.a d(BusinessGroupsShieldSettingsMessageDto businessGroupsShieldSettingsMessageDto) {
        String title = businessGroupsShieldSettingsMessageDto.getTitle();
        String description = businessGroupsShieldSettingsMessageDto.getDescription();
        BusinessGroupsShieldSettingsButtonDto d = businessGroupsShieldSettingsMessageDto.d();
        String e = d != null ? d.e() : null;
        BusinessGroupsShieldSettingsButtonDto d2 = businessGroupsShieldSettingsMessageDto.d();
        return new o4q0.a(title, description, e, d2 != null ? new o4q0.b(d2.e(), d2.d(), d2.f()) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    public static ls70 e(BusinessGroupsGetShieldSettingsResponseDto businessGroupsGetShieldSettingsResponseDto) {
        List list;
        BusinessGroupsShieldSettingsImageDto e = businessGroupsGetShieldSettingsResponseDto.e();
        String e2 = e != null ? e.e() : null;
        if (e2 == null) {
            e2 = "";
        }
        BusinessGroupsShieldSettingsImageDto e3 = businessGroupsGetShieldSettingsResponseDto.e();
        String d = e3 != null ? e3.d() : null;
        if (d == null) {
            d = "";
        }
        ls70.d dVar = new ls70.d(e2, d);
        String e4 = businessGroupsGetShieldSettingsResponseDto.f().e();
        if (e4 == null) {
            e4 = "";
        }
        String d2 = businessGroupsGetShieldSettingsResponseDto.f().d();
        if (d2 == null) {
            d2 = "";
        }
        ls70.b bVar = new ls70.b(e4, d2);
        String title = businessGroupsGetShieldSettingsResponseDto.getTitle();
        String description = businessGroupsGetShieldSettingsResponseDto.getDescription();
        if (description == null) {
            description = "";
        }
        List<BusinessGroupsShieldSettingsBaseItemDto> j = businessGroupsGetShieldSettingsResponseDto.j();
        if (j != null) {
            List<BusinessGroupsShieldSettingsBaseItemDto> list2 = j;
            list = new ArrayList(c5g.u(list2, 10));
            for (BusinessGroupsShieldSettingsBaseItemDto businessGroupsShieldSettingsBaseItemDto : list2) {
                list.add(new ls70.a(businessGroupsShieldSettingsBaseItemDto.e(), businessGroupsShieldSettingsBaseItemDto.getTitle(), businessGroupsShieldSettingsBaseItemDto.d().i()));
            }
        } else {
            list = 0;
        }
        if (list == 0) {
            list = EmptyList.b;
        }
        BusinessGroupsShieldSettingsButtonDto d3 = businessGroupsGetShieldSettingsResponseDto.d();
        String e5 = d3 != null ? d3.e() : null;
        if (e5 == null) {
            e5 = "";
        }
        BusinessGroupsShieldSettingsButtonDto d4 = businessGroupsGetShieldSettingsResponseDto.d();
        return new ls70(dVar, bVar, title, description, list, new ls70.c(e5, d4 != null ? d4.f() : false));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o4q0 f(BusinessGroupsGetShieldSettingsResponseDto businessGroupsGetShieldSettingsResponseDto) {
        o4q0.a aVar;
        List<BusinessGroupsShieldSettingsMessageDto> i;
        Object obj;
        Object obj2;
        String title = businessGroupsGetShieldSettingsResponseDto.getTitle();
        String description = businessGroupsGetShieldSettingsResponseDto.getDescription();
        Boolean l = businessGroupsGetShieldSettingsResponseDto.l();
        boolean booleanValue = l != null ? l.booleanValue() : false;
        String g = businessGroupsGetShieldSettingsResponseDto.g();
        BusinessGroupsShieldSettingsButtonDto d = businessGroupsGetShieldSettingsResponseDto.d();
        o4q0.a aVar2 = null;
        o4q0.b bVar = d != null ? new o4q0.b(d.e(), d.d(), d.f()) : null;
        List<BusinessGroupsShieldSettingsMessageDto> i2 = businessGroupsGetShieldSettingsResponseDto.i();
        if (i2 != null) {
            Iterator<T> it = i2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (epx.f(((BusinessGroupsShieldSettingsMessageDto) obj2).e().i(), "success")) {
                    break;
                }
            }
            BusinessGroupsShieldSettingsMessageDto businessGroupsShieldSettingsMessageDto = (BusinessGroupsShieldSettingsMessageDto) obj2;
            if (businessGroupsShieldSettingsMessageDto != null) {
                aVar = d(businessGroupsShieldSettingsMessageDto);
                i = businessGroupsGetShieldSettingsResponseDto.i();
                if (i != null) {
                    Iterator<T> it2 = i.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (epx.f(((BusinessGroupsShieldSettingsMessageDto) obj).e().i(), "error")) {
                            break;
                        }
                    }
                    BusinessGroupsShieldSettingsMessageDto businessGroupsShieldSettingsMessageDto2 = (BusinessGroupsShieldSettingsMessageDto) obj;
                    if (businessGroupsShieldSettingsMessageDto2 != null) {
                        aVar2 = d(businessGroupsShieldSettingsMessageDto2);
                    }
                }
                return new o4q0(title, description, booleanValue, g, bVar, aVar, aVar2);
            }
        }
        aVar = null;
        i = businessGroupsGetShieldSettingsResponseDto.i();
        if (i != null) {
        }
        return new o4q0(title, description, booleanValue, g, bVar, aVar, aVar2);
    }

    public static BusinessGroupsGetShieldSettingsScreenDto g(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -840447469) {
            if (hashCode != -318452137) {
                if (hashCode == 3016401 && str.equals("base")) {
                    return BusinessGroupsGetShieldSettingsScreenDto.BASE;
                }
            } else if (str.equals("premium")) {
                return BusinessGroupsGetShieldSettingsScreenDto.PREMIUM;
            }
        } else if (str.equals("unlink")) {
            return BusinessGroupsGetShieldSettingsScreenDto.UNLINK_BID;
        }
        throw new IllegalStateException("Unknown group verification type - ".concat(str));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:25|26))(5:27|28|(1:30)(2:34|(1:36)(2:37|38))|31|(1:33))|12|13|(4:15|16|17|18)(1:24)))|41|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0033, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0089, code lost:
    
        r7 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(UserId userId, String str, ContinuationImpl continuationImpl) {
        gs70 gs70Var;
        int i;
        Object failure;
        BusinessGroupsGetShieldSettingsScreenDto businessGroupsGetShieldSettingsScreenDto;
        if (continuationImpl instanceof gs70) {
            gs70Var = (gs70) continuationImpl;
            int i2 = gs70Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gs70Var.label = i2 - Integer.MIN_VALUE;
                Object obj = gs70Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gs70Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    znk0 znk0Var = this.a;
                    if (epx.f(str, "base")) {
                        businessGroupsGetShieldSettingsScreenDto = BusinessGroupsGetShieldSettingsScreenDto.BASE_ACTIVATION;
                    } else {
                        if (!epx.f(str, "premium")) {
                            throw new IllegalStateException("Unknown group verification type - " + str);
                        }
                        businessGroupsGetShieldSettingsScreenDto = BusinessGroupsGetShieldSettingsScreenDto.PREMIUM_ACTIVATION;
                    }
                    iz2 A = yfb.A(znk0Var.f(userId, businessGroupsGetShieldSettingsScreenDto));
                    gs70Var.L$0 = null;
                    gs70Var.L$1 = null;
                    gs70Var.L$2 = null;
                    gs70Var.I$0 = 0;
                    gs70Var.label = 1;
                    obj = evj.p(A, gs70Var);
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
                    return s3q0.a;
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }
        gs70Var = new gs70(this, continuationImpl);
        Object obj2 = gs70Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gs70Var.label;
        if (i != 0) {
        }
        failure = (BusinessGroupsGetShieldSettingsResponseDto) obj2;
        if (!(failure instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|13|(4:15|16|17|18)(1:24)))|34|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0033, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        r7 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(UserId userId, String str, ContinuationImpl continuationImpl) {
        hs70 hs70Var;
        int i;
        Object failure;
        if (continuationImpl instanceof hs70) {
            hs70Var = (hs70) continuationImpl;
            int i2 = hs70Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hs70Var.label = i2 - Integer.MIN_VALUE;
                Object obj = hs70Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hs70Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    iz2 A = yfb.A(this.a.f(userId, g(str)));
                    hs70Var.L$0 = null;
                    hs70Var.L$1 = null;
                    hs70Var.L$2 = null;
                    hs70Var.I$0 = 0;
                    hs70Var.label = 1;
                    obj = evj.p(A, hs70Var);
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
                    return f((BusinessGroupsGetShieldSettingsResponseDto) failure);
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }
        hs70Var = new hs70(this, continuationImpl);
        Object obj2 = hs70Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hs70Var.label;
        if (i != 0) {
        }
        failure = (BusinessGroupsGetShieldSettingsResponseDto) obj2;
        if (!(failure instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|13|(4:15|16|17|18)(1:24)))|34|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0033, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        r7 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(UserId userId, String str, ContinuationImpl continuationImpl) {
        is70 is70Var;
        int i;
        Object failure;
        if (continuationImpl instanceof is70) {
            is70Var = (is70) continuationImpl;
            int i2 = is70Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                is70Var.label = i2 - Integer.MIN_VALUE;
                Object obj = is70Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = is70Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    iz2 A = yfb.A(this.a.f(userId, g(str)));
                    is70Var.L$0 = null;
                    is70Var.L$1 = null;
                    is70Var.L$2 = null;
                    is70Var.I$0 = 0;
                    is70Var.label = 1;
                    obj = evj.p(A, is70Var);
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
                    return e((BusinessGroupsGetShieldSettingsResponseDto) failure);
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }
        is70Var = new is70(this, continuationImpl);
        Object obj2 = is70Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = is70Var.label;
        if (i != 0) {
        }
        failure = (BusinessGroupsGetShieldSettingsResponseDto) obj2;
        if (!(failure instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(UserId userId, ContinuationImpl continuationImpl) {
        js70 js70Var;
        int i;
        try {
            if (continuationImpl instanceof js70) {
                js70Var = (js70) continuationImpl;
                int i2 = js70Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    js70Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = js70Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = js70Var.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        tfx tfxVar = new tfx("groups.deleteBidLink", new dr(18), new com.vk.movika.sdk.android.defaultplayer.view.a(18));
                        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
                        iz2 A = yfb.A(tfxVar);
                        js70Var.L$0 = null;
                        js70Var.L$1 = null;
                        js70Var.I$0 = 0;
                        js70Var.label = 1;
                        obj = evj.p(A, js70Var);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    return (BaseOkResponseDto) obj;
                }
            }
            if (i != 0) {
            }
            return (BaseOkResponseDto) obj;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        js70Var = new js70(this, continuationImpl);
        Object obj2 = js70Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = js70Var.label;
    }
}
