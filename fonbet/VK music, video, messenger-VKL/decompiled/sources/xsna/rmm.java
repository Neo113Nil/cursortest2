package xsna;

import android.content.Context;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import com.vkontakte.android.R;
import kotlin.collections.EmptyList;
import xsna.fcw;
import xsna.gcw;

/* compiled from: DialogWithSelfRepository.kt */
/* loaded from: classes2.dex */
public final class rmm implements fcw {
    public final a1w a;
    public final xw30 b;
    public final yw30 c;

    public rmm(a1w a1wVar, xw30 xw30Var, yw30 yw30Var) {
        this.a = a1wVar;
        this.b = xw30Var;
        this.c = yw30Var;
    }

    @Override // xsna.fcw
    public final io.reactivex.rxjava3.core.x<gcw> a(fcw.a aVar, Object obj) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        if (drm0.D(context.getString(R.string.vkim_dialog_with_self_title), aVar.a, true)) {
            a1w a1wVar = this.a;
            return a1wVar.C(this, new uqm(a1wVar.q(), Source.CACHE)).l(new qj4(new td0(15, this, aVar), 10));
        }
        return io.reactivex.rxjava3.core.x.k(new gcw.b(EmptyList.b, jgp.b, new ProfilesSimpleInfo(), new ImSearchLocalRequestLoggingInfo(aVar.a, aVar.c, 0L, 0, aVar.d, null, 0, false, 232, null)));
    }
}
