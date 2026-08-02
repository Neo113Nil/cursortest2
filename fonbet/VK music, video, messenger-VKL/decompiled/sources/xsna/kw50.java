package xsna;

import android.content.Context;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.user.RequestUserProfile;
import java.util.List;

/* compiled from: NavigationActionHandler.kt */
/* loaded from: classes16.dex */
public final class kw50 extends wx20 {
    public final /* synthetic */ mw50 c;
    public final /* synthetic */ RequestUserProfile d;
    public final /* synthetic */ VoipCallSource e;
    public final /* synthetic */ List<e520> f;

    public kw50(mw50 mw50Var, RequestUserProfile requestUserProfile, VoipCallSource voipCallSource, List<e520> list) {
        this.c = mw50Var;
        this.d = requestUserProfile;
        this.e = voipCallSource;
        this.f = list;
    }

    @Override // xsna.wx20
    public final List<e520> a() {
        return this.f;
    }

    @Override // xsna.wx20
    public final void f(Context context, e520 e520Var) {
        this.c.d.j().d(context, this.e, this.d.c, e520Var.a == 1);
    }
}
