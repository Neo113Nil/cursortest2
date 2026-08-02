package xsna;

import android.content.Context;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.superapp.api.exceptions.AuthException;
import java.util.Iterator;
import java.util.List;
import xsna.jq0;
import xsna.p4g;
import xsna.q55;

/* compiled from: AdditionalOAuthAuthObserver.kt */
/* loaded from: classes15.dex */
public final class iq0 extends io.reactivex.rxjava3.observers.a<AuthResult> {
    public final x6v0 c;
    public final io.reactivex.rxjava3.disposables.b d;
    public final i060 e;

    public iq0(Context context, VkAuthMetaInfo vkAuthMetaInfo, x6v0 x6v0Var, io.reactivex.rxjava3.disposables.b bVar) {
        this.c = x6v0Var;
        this.d = bVar;
        this.e = new i060(context, vkAuthMetaInfo, new za(this, 2), null);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        if (th instanceof AuthException.NeedValidationException) {
            AuthException.NeedValidationException needValidationException = (AuthException.NeedValidationException) th;
            this.e.a(needValidationException.d(), needValidationException.g(), this.d);
            return;
        }
        q55 q55Var = q55.a;
        List y0 = j5g.y0(q55.b);
        q55.b bVar = new q55.b(par0.a);
        p4g.a aVar = p4g.a;
        Iterator it = y0.iterator();
        while (it.hasNext()) {
            try {
                ((s25) it.next()).l(jq0.a.a);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th2) {
                bVar.invoke(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        q55 q55Var = q55.a;
        List y0 = j5g.y0(q55.b);
        q55.b bVar = new q55.b(par0.a);
        p4g.a aVar = p4g.a;
        Iterator it = y0.iterator();
        while (it.hasNext()) {
            try {
                ((s25) it.next()).l(jq0.b.a);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                bVar.invoke(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
    }
}
