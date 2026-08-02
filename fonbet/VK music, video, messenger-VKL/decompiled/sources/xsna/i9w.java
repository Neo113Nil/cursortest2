package xsna;

import com.vk.libdelayedjobs.WorkPolicy;
import com.vungle.ads.internal.protos.Sdk;
import xsna.zg20;

/* compiled from: ImMessagesHistorySynchronizerImpl.kt */
/* loaded from: classes.dex */
public final class i9w implements h9w {
    @Override // xsna.h9w
    public final void a(Long l) {
        wsl b = uh.b.b();
        fyx fyxVar = new fyx();
        fyxVar.a.put("data_key_peer_id", l != null ? l.longValue() : 0L);
        s3q0 s3q0Var = s3q0.a;
        ((xsl) b).a("com.vk.im.engine.synchelper.MessagesSyncDelayedJob", zg20.a.a(fyxVar), new usl(WorkPolicy.KEEP, 0L, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
    }
}
