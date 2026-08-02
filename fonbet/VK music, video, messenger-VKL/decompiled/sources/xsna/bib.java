package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.credentials.UserCredentials;

/* compiled from: ChannelsRecommendationsDataSourceImpl.kt */
/* loaded from: classes.dex */
public final class bib {
    public final Object a;

    public /* synthetic */ bib(Object obj) {
        this.a = obj;
    }

    public fpo a() {
        ihq0 u = ((b25) this.a).u();
        UserCredentials userCredentials = null;
        if (!fkq0.c(u.a) || !myc0.f(u.b)) {
            u = null;
        }
        if (u != null) {
            userCredentials = new UserCredentials(u.d, u.e, u.a, u.b, u.c);
        }
        return new fpo(userCredentials);
    }

    public scf0 b() {
        return (scf0) vdg0.a(((a1w) this.a).n(this, new ofb(Source.CACHE)), new com.vk.movika.sdk.base.utils.b(7));
    }
}
