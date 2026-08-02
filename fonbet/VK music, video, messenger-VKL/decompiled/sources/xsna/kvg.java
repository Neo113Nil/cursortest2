package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.chats.impl.presentation.CommunityChatsFragment;
import java.util.Collections;
import xsna.wqu;

/* compiled from: CommunityChatsRouterImpl.kt */
/* loaded from: classes.dex */
public final class kvg implements ivg {
    public final bpn0 a = new bpn0(new jvg(0));

    @Override // xsna.ivg
    public final void a(int i, Context context, UserId userId) {
        new CommunityChatsFragment.a(userId, i).k(context);
    }

    @Override // xsna.ivg
    @SuppressLint({"CheckResult"})
    public final void b(Context context, UserId userId, defpackage.r rVar, j5 j5Var) {
        hg1.n(rsg0.w0(yfb.x(wqu.a.b((xqu) this.a.getValue(), Collections.singletonList(userId), Collections.singletonList(GroupsFieldsDto.ADMIN_LEVEL), null, 4))), context, false, null, 62).subscribe(new l50(new qgg(this, context, userId, rVar, 1), 15), new tp0(new zx0(j5Var, 27), 17));
    }
}
