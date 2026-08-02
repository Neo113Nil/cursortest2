package xsna;

import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: UserFriendsApiFieldsHelper.kt */
/* loaded from: classes14.dex */
public final class ckq0 {
    public final UserId a;

    public ckq0(UserId userId) {
        this.a = userId;
    }

    public final ArrayList a() {
        List l = e43.l("mutual", "is_friend", "friend_status", "can_write_private_message", "can_call", "city", "country", "education", "occupation", "career", "universities", "is_followers_mode_on", "social_button_type", "descriptions");
        UserId c = vx2.d.c();
        boolean c2 = fkq0.c(this.a);
        return j5g.u0(l, j5g.u0((epx.f(this.a, c) || !c2) ? e43.l("bdate", "first_name_gen", X3.j.D, "last_name_gen", "sex", "verified", "is_verified", "blacklisted", "blacklisted_by_me", "can_call", "can_write_private_message") : EmptyList.b, e43.l("verified", "is_verified", "online_info", "is_nft", "photo_base")));
    }
}
