package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.common.links.contract.AnonymousLinker;
import com.vk.toggle.anonymous.SakFeatures;

/* compiled from: AnonymousLinkProcessor.kt */
/* loaded from: classes17.dex */
public final class su2 implements AnonymousLinker {
    @Override // com.vk.common.links.contract.AnonymousLinker
    public final AnonymousLinker.b c(Context context, String str) {
        Uri parse = Uri.parse(naz.a(jaz.a(str)));
        haz.a(context, Uri.parse(str));
        s3q0 s3q0Var = s3q0.a;
        if (naz.o(parse)) {
            return new AnonymousLinker.b(AnonymousLinker.Type.UNAUTH_WEB, parse.toString());
        }
        if (!naz.s(parse) && !naz.u(parse)) {
            return AnonymousLinker.b.c;
        }
        peq0 peq0Var = new peq0(parse);
        return jh.h("/call/join/(.+)", peq0Var, null, null, 14) ? new AnonymousLinker.b(AnonymousLinker.Type.CALL_JOIN, parse.toString()) : (jh.h("/call/(.+)", peq0Var, null, null, 14) && SakFeatures.Type.VOIP_JOIN_TO_CALL_BY_PASSWORD_ANON.h()) ? new AnonymousLinker.b(AnonymousLinker.Type.CALL, parse.toString()) : AnonymousLinker.b.c;
    }
}
