package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.auth.api.models.AuthResult;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.multiaccount.api.analytics.VkAnalyticsUserType;
import xsna.pgn0;
import xsna.usi0;

/* compiled from: MultiAccountAuthHelper.kt */
/* loaded from: classes6.dex */
public final class x140 {
    public final Context a;

    /* compiled from: MultiAccountAuthHelper.kt */
    public static final class a extends Throwable {
    }

    public x140(Context context) {
        this.a = context;
    }

    public static io.reactivex.rxjava3.internal.operators.observable.b0 a(usi0.a aVar, MultiAccountEntryPoint multiAccountEntryPoint, usi0.a aVar2) {
        UserId userId;
        fhq0 c;
        Bundle bundle = Bundle.EMPTY;
        Bundle x = sv1.x(multiAccountEntryPoint, aVar2 != null ? aVar2 instanceof usi0.a.b ? VkAnalyticsUserType.Related : VkAnalyticsUserType.Master : null, aVar instanceof usi0.a.b ? VkAnalyticsUserType.Related : VkAnalyticsUserType.Master);
        x.putAll(bundle);
        AuthResult a2 = an00.a(aVar, x);
        l55 l55Var = l55.a;
        if (aVar2 == null || (c = aVar2.c()) == null || (userId = c.a) == null) {
            wdx0 wdx0Var = e370.f;
            wdx0 wdx0Var2 = wdx0Var != null ? wdx0Var : null;
            int i = pgn0.a.a;
            userId = wdx0Var2.c().b;
        }
        return l55.g(l55Var, a2, userId, 4).a0(io.reactivex.rxjava3.android.schedulers.a.b()).G(new l46(a2, 6));
    }
}
