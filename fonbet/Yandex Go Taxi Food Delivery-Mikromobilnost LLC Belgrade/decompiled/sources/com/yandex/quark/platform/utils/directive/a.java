package com.yandex.quark.platform.utils.directive;

import defpackage.enj;
import defpackage.fcx;
import defpackage.gcx;
import defpackage.jyj0;
import defpackage.lyj0;
import defpackage.syj0;
import defpackage.t830;
import defpackage.umj;
import defpackage.vmj;
import defpackage.w511;
import java.util.Map;
import okio.ByteString;
import ru.yandex.alice.protos.api.alicekit.directives.platform.utils.TDirective;

/* loaded from: classes2.dex */
public abstract class a {
    public static final syj0 a(TDirective tDirective, gcx gcxVar) {
        Map<String, ?> payload = tDirective.getPayload();
        ByteString payloadRaw = tDirective.getPayloadRaw();
        if (payload == null) {
            return payloadRaw != null ? new lyj0(new enj(payloadRaw.v())) : new jyj0(vmj.b);
        }
        syj0 b = ((t830) gcxVar).b(Map.class, payload);
        if (!(b instanceof lyj0)) {
            if (!(b instanceof jyj0)) {
                w511.b();
                return null;
            }
            b = new jyj0(new umj(((fcx) ((jyj0) b).a).a));
        }
        return b.b(TDirectiveExtensionsKt$extractPayload$2.b);
    }
}
