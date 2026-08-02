package xsna;

import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesInfo;
import xsna.khw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class wq80 implements izs {
    public final /* synthetic */ UserId b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ VoipCallSource d;
    public final /* synthetic */ UserId e;
    public final /* synthetic */ String f;
    public final /* synthetic */ yp80 g;

    public /* synthetic */ wq80(UserId userId, boolean z, VoipCallSource voipCallSource, UserId userId2, String str, yp80 yp80Var) {
        this.b = userId;
        this.c = z;
        this.d = voipCallSource;
        this.e = userId2;
        this.f = str;
        this.g = yp80Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        qtd0 Cb = ((ProfilesInfo) obj).Cb(Long.valueOf(this.b.b));
        yp80 yp80Var = this.g;
        if (Cb != null) {
            zqk0 c = jnw0.c(Cb, this.c);
            khw0 a = a201.b().a();
            UserId userId = this.e;
            if (userId == null) {
                userId = UserId.d;
            }
            a.d(new khw0.a(c, this.d, userId, this.f, null, 16));
            if (yp80Var != null) {
                yp80Var.onSuccess();
            }
        } else if (yp80Var != null) {
            yp80Var.U();
        }
        return s3q0.a;
    }
}
