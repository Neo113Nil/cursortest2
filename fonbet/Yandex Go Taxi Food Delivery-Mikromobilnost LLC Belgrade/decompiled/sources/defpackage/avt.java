package defpackage;

import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes15.dex */
public final class avt {
    public final z22 a;
    public final DefaultEnvironment b;
    public WeakReference c = new WeakReference(null);
    public r1s d;
    public m50 e;

    public avt(z22 z22Var, DefaultEnvironment defaultEnvironment) {
        this.a = z22Var;
        this.b = defaultEnvironment;
    }

    public final void a(String str) {
        Pair pair = new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, g8e.o("Ошибка получения токена Google Pay: ", str));
        if (str == null) {
            str = "Unknown error";
        }
        ((a) this.a).a(new keo("google_pay_failure", b.i(pair, new Pair(CRLReasonCodeExtension.REASON, str))));
        r1s r1sVar = this.d;
        if (r1sVar != null) {
            ((jh5) r1sVar.w).a.dispatch(((qut) r1sVar.c).b);
        }
    }
}
