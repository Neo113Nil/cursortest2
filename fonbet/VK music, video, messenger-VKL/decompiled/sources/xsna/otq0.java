package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import kotlin.Pair;

/* compiled from: UserProfilePresenter.kt */
/* loaded from: classes4.dex */
public interface otq0 extends dqp {
    @Override // xsna.dqp
    default String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(getUid().b < 0 ? "club" : CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        sb.append(getUid().b);
        return sb.toString();
    }

    void b(Boolean bool);

    void e(WallGetMode wallGetMode);

    void f(boolean z);

    Boolean g();

    @Override // xsna.dqp, xsna.kvh
    default String getRef() {
        return getUid().b > 0 ? "wall_user" : "wall_group";
    }

    UserId getUid();

    void i(Pair<String, String> pair);

    void k(UserId userId);

    Boolean l();

    void m(Boolean bool);
}
