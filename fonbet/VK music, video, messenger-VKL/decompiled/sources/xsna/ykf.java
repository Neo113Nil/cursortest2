package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.r1r0;
import xsna.zbf;

/* compiled from: ClipsUploadUserInfoInteractorImpl.kt */
/* loaded from: classes17.dex */
public final class ykf implements ukf {
    public final b25 a;
    public final bpn0 b = new bpn0(new nd1(8));
    public final bpn0 c = new bpn0(new fn4(6));
    public final HashMap<UserId, Boolean> d = new HashMap<>();
    public final HashMap<UserId, Boolean> e = new HashMap<>();
    public final wi50 f = bay.a();

    public ykf(b25 b25Var) {
        this.a = b25Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.ukf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        wkf wkfVar;
        int i;
        cn cnVar;
        String str;
        if (continuationImpl instanceof wkf) {
            wkfVar = (wkf) continuationImpl;
            int i2 = wkfVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wkfVar.label = i2 - Integer.MIN_VALUE;
                Object obj = wkfVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wkfVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    cn o = this.a.o();
                    iz2 A = yfb.A(r1r0.a.b((s1r0) this.b.getValue(), null, Collections.singletonList(UsersFieldsDto.AGE_MARK), null, null, 58));
                    wkfVar.L$0 = o;
                    wkfVar.label = 1;
                    Object p = evj.p(A, wkfVar);
                    if (p == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    cnVar = o;
                    obj = p;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cnVar = (cn) wkfVar.L$0;
                    kotlin.a.a(obj);
                }
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) j5g.a0((List) obj);
                UserId userId = cnVar.a;
                String str2 = cnVar.b;
                str = cnVar.c;
                if (str == null) {
                    str = "";
                }
                String str3 = str;
                Integer f = usersUserFullDto == null ? usersUserFullDto.f() : null;
                return new UploadUserInfo(userId, str2, str3, (f != null && f.intValue() == 1) ? UploadUserInfo.AgeRestriction.OVER_16 : (f != null && f.intValue() == 2) ? UploadUserInfo.AgeRestriction.OVER_18 : UploadUserInfo.AgeRestriction.NONE, usersUserFullDto == null ? epx.f(usersUserFullDto.T2(), Boolean.TRUE) : false);
            }
        }
        wkfVar = new wkf(this, continuationImpl);
        Object obj2 = wkfVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wkfVar.label;
        if (i != 0) {
        }
        UsersUserFullDto usersUserFullDto2 = (UsersUserFullDto) j5g.a0((List) obj2);
        UserId userId2 = cnVar.a;
        String str22 = cnVar.b;
        str = cnVar.c;
        if (str == null) {
        }
        String str32 = str;
        if (usersUserFullDto2 == null) {
        }
        if (f != null) {
            return new UploadUserInfo(userId2, str22, str32, (f != null && f.intValue() == 1) ? UploadUserInfo.AgeRestriction.OVER_16 : (f != null && f.intValue() == 2) ? UploadUserInfo.AgeRestriction.OVER_18 : UploadUserInfo.AgeRestriction.NONE, usersUserFullDto2 == null ? epx.f(usersUserFullDto2.T2(), Boolean.TRUE) : false);
        }
        if (f != null) {
            return new UploadUserInfo(userId2, str22, str32, (f != null && f.intValue() == 1) ? UploadUserInfo.AgeRestriction.OVER_16 : (f != null && f.intValue() == 2) ? UploadUserInfo.AgeRestriction.OVER_18 : UploadUserInfo.AgeRestriction.NONE, usersUserFullDto2 == null ? epx.f(usersUserFullDto2.T2(), Boolean.TRUE) : false);
        }
        return new UploadUserInfo(userId2, str22, str32, (f != null && f.intValue() == 1) ? UploadUserInfo.AgeRestriction.OVER_16 : (f != null && f.intValue() == 2) ? UploadUserInfo.AgeRestriction.OVER_18 : UploadUserInfo.AgeRestriction.NONE, usersUserFullDto2 == null ? epx.f(usersUserFullDto2.T2(), Boolean.TRUE) : false);
    }

    @Override // xsna.ukf
    public final Object b(UserId userId, SuspendLambda suspendLambda) {
        return myc0.k(hqu0.b(), new xkf(this, userId, null), suspendLambda);
    }

    @Override // xsna.ukf
    public final Object c(UserId userId, zbf.b bVar) {
        return myc0.k(hqu0.b(), new vkf(this, userId, null), bVar);
    }
}
