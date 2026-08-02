package xsna;

import android.os.Bundle;
import com.vk.dto.common.id.UserId;

/* compiled from: AudioBookPersonGenreCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class gi4 extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final int D;
    public final int E;
    public final xga F;
    public final e3a G;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gi4(Bundle bundle) {
        super(r0, r1);
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        userId = userId == null ? UserId.d : userId;
        String string = bundle.getString("ref");
        int i = bundle.getInt("genre_id");
        int i2 = bundle.getInt("person_id");
        this.D = i;
        this.E = i2;
        this.F = new xga();
        this.G = new e3a();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        this.F.getClass();
        tfx tfxVar = new tfx("catalog.getPersonAudioBooks", new eq(3), new com.vk.movika.sdk.base.model.history.b(5));
        tfx.l(tfxVar, "genre_id", this.D, 0, 0, 8);
        tfx.l(tfxVar, "person_id", this.E, 0, 0, 8);
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        tfxVar.j("need_blocks", true);
        return rsg0.T(yfb.x(tfxVar)).U(new p7(new com.vk.im.engine.internal.api_commands.messages.a(this, 6), 2));
    }
}
