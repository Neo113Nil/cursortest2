package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.video.polls.entrypoint.model.UxPollProject;
import com.vk.video.polls.models.UxPollEventType;
import com.vkontakte.android.VKApplication;
import java.util.List;
import java.util.Map;

/* compiled from: UxPollsRepo.kt */
/* loaded from: classes6.dex */
public final class m5r0 {
    public final b25 a;
    public final r4r0 b;
    public final String c;
    public final a6r0 d = new a6r0();

    public m5r0(b25 b25Var, r4r0 r4r0Var, String str) {
        this.a = b25Var;
        this.b = r4r0Var;
        this.c = str;
    }

    public final io.reactivex.rxjava3.internal.operators.completable.u a(int i, List list, UxPollEventType uxPollEventType, UxPollProject uxPollProject) {
        xy2 d;
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        a6r0 a6r0Var = this.d;
        long j = this.a.c().b;
        String str = (String) j5g.a0(list);
        if (str == null) {
            str = "";
        }
        d = a6r0Var.d(j, str, uxPollEventType.getId(), uxPollProject.getId(), (r29 & 16) != 0 ? null : null, Integer.valueOf(i), (r29 & 64) != 0 ? null : this.c, null, null, null, null, (r29 & 2048) != 0 ? null : null, (r29 & 4096) != 0 ? null : null);
        return rsg0.Z(yfb.x(d)).o(asu0.a.d());
    }

    public final io.reactivex.rxjava3.internal.operators.completable.u b(Map map, List list, int i) {
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        return new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.v(new ehe(1, map, this)), new uf20(new eu10(this, i, list, 1), 18)).o(asu0.a.d());
    }
}
