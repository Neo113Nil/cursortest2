package xsna;

import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: BroadcastUpcomingPresenter.kt */
/* loaded from: classes3.dex */
public final class bk8 implements zj8 {
    public final UserId b;
    public final String c;
    public final String d;
    public final long e;
    public ak8 f;
    public final Object g = msy.a(LazyThreadSafetyMode.NONE, new sv0(4));

    public bk8(long j, UserId userId, String str, String str2) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = j;
    }

    @Override // xsna.pk6
    public final void release() {
        this.f = null;
    }

    @Override // xsna.pk6
    public final void start() {
        ak8 ak8Var = this.f;
        if (ak8Var != null) {
            ak8Var.setLiveName(this.d);
        }
        ak8 ak8Var2 = this.f;
        if (ak8Var2 != null) {
            ak8Var2.setLiveAuthorImage(this.c);
        }
        if (fkq0.d(this.b)) {
            ak8 ak8Var3 = this.f;
            if (ak8Var3 != null) {
                ak8Var3.setLiveAuthorPlaceholderImage(R.drawable.vk_icon_user_28);
                return;
            }
            return;
        }
        ak8 ak8Var4 = this.f;
        if (ak8Var4 != null) {
            ak8Var4.setLiveAuthorPlaceholderImage(R.drawable.vk_icon_users_28);
        }
    }

    @Override // xsna.pk6
    public final void pause() {
    }

    @Override // xsna.pk6
    public final void resume() {
    }
}
