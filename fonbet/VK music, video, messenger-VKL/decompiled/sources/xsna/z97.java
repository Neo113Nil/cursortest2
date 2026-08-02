package xsna;

import com.vk.api.generated.account.dto.AccountGetUserObjectDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.BirthdayBroadcastReceiver;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class z97 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                int i = BirthdayBroadcastReceiver.a;
                ArrayList arrayList = new ArrayList();
                for (AccountGetUserObjectDto accountGetUserObjectDto : (List) obj) {
                    UserProfile userProfile = new UserProfile();
                    userProfile.c = accountGetUserObjectDto.i() != null ? new UserId(accountGetUserObjectDto.i().longValue()) : new UserId(0L);
                    userProfile.d = accountGetUserObjectDto.f();
                    userProfile.f = accountGetUserObjectDto.j();
                    userProfile.e = accountGetUserObjectDto.f() + " " + accountGetUserObjectDto.j();
                    userProfile.g = accountGetUserObjectDto.k();
                    userProfile.h = accountGetUserObjectDto.k() != null ? js5.a(480, accountGetUserObjectDto.k()) : null;
                    arrayList.add(userProfile);
                }
                BirthdayBroadcastReceiver.a(arrayList);
                break;
            case 1:
                s3q0 s3q0Var = s3q0.a;
                break;
            case 2:
                s3q0 s3q0Var2 = s3q0.a;
                break;
            default:
                s3q0 s3q0Var3 = s3q0.a;
                break;
        }
    }
}
