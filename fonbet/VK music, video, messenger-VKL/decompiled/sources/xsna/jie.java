package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipsInternalMiniAppsRouter.kt */
/* loaded from: classes17.dex */
public interface jie {
    static /* synthetic */ void a(jie jieVar, Context context, UserId userId, String str, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        jieVar.b(context, userId, str, true);
    }

    void b(Context context, UserId userId, String str, boolean z);
}
