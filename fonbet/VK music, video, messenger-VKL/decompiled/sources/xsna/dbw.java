package xsna;

import com.vk.api.generated.messages.dto.MessagesSendReactionSourceDto;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.reactions.impl.models.AnimationID;
import com.vk.profile.user.impl.ui.b;
import com.vkontakte.android.api.ExtendedUserProfile;
import xsna.fbw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class dbw implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dbw(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ebw ebwVar = (ebw) this.d;
                Msg msg = (Msg) this.e;
                vvr0.d();
                hbw hbwVar = ebwVar.a;
                long j = msg.c;
                int i = msg.d;
                int i2 = msg.b;
                AnimationID animationID = AnimationID.HEART;
                hbwVar.e(new fbw.a(j, i, i2, this.c, animationID.h(), MessagesSendReactionSourceDto.DOUBLE_CLICK.j()));
                ebwVar.b.a(msg.b, animationID.h(), msg.c);
                break;
            default:
                fqq0 fqq0Var = (fqq0) this.d;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) this.e;
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = fqq0Var.l;
                if (izsVar == null) {
                    izsVar = null;
                }
                extendedUserProfile.i1 = this.c;
                izsVar.invoke(new b.y(extendedUserProfile));
                break;
        }
        return s3q0.a;
    }
}
