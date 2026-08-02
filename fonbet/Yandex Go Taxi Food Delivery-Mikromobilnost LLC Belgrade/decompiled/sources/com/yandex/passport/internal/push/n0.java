package com.yandex.passport.internal.push;

import android.content.Context;
import androidx.core.app.a1;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.report.ma;
import com.yandex.passport.internal.report.qd;
import com.yandex.passport.internal.ui.util.ForegroundDetector;
import defpackage.fd20;
import defpackage.i3y;
import defpackage.pz40;
import defpackage.z93;
import defpackage.zy11;
import io.appmetrica.analytics.IReporterYandex;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class n0 implements r {
    public static final s c = new s();
    public static volatile n0 d;
    public final Object a;
    public final Object b;

    public n0(Context context) {
        new ForegroundDetector(context, new z93(this));
        this.a = kotlin.a.a(new a1(9));
        this.b = kotlin.a.a(new com.yandex.passport.internal.flags.experiments.h(2, context));
        new com.yandex.passport.internal.flags.presentation.l(7, context, this);
    }

    @Override // com.yandex.passport.internal.push.r
    public Object a(Continuation continuation) {
        Object g = ((c) this.a).g((Uid) this.b, (ContinuationImpl) continuation);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : zy11.a;
    }

    public void b(PushPayload pushPayload) {
        ma maVar = ma.w;
        boolean A = com.yandex.passport.internal.properties.u.A(pushPayload);
        Pair pair = new Pair("uid", String.valueOf(pushPayload.getUid()));
        String pushId = pushPayload.getPushId();
        if (pushId == null) {
            pushId = "";
        }
        Pair pair2 = new Pair("push_id", pushId);
        String trackId = pushPayload.getTrackId();
        String b = trackId != null ? qd.b(trackId) : null;
        c(maVar, kotlin.collections.b.i(pair, pair2, new Pair("track_id", b != null ? b : ""), new Pair("is_actual", String.valueOf(A))));
        kotlinx.coroutines.flow.r0 r0Var = (kotlinx.coroutines.flow.r0) ((pz40) ((i3y) this.a).getValue());
        r0Var.getClass();
        r0Var.m(null, pushPayload);
    }

    public void c(fd20 fd20Var, Map map) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.VERBOSE, "[METRICA EVENT]", fd20Var + Extension.COLON_SPACE + map, 8);
        }
        ((IReporterYandex) ((i3y) this.b).getValue()).reportEvent(fd20Var.toString(), (Map<String, Object>) map);
    }

    public n0(c cVar, Uid uid) {
        this.a = cVar;
        this.b = uid;
    }
}
