package xsna;

import com.vk.dto.common.id.UserId;
import com.vkontakte.android.attachments.PollAttachment;
import xsna.fja;
import xsna.fnc;
import xsna.mbf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class op3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ op3(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke((PollAttachment) obj);
                return s3q0.a;
            case 1:
                this.c.invoke(new fja.c(((Integer) obj).intValue()));
                return s3q0.a;
            case 2:
                this.c.invoke(new fnc.d((UserId) obj));
                return s3q0.a;
            case 3:
                this.c.invoke(new mbf.b.a((zoa) obj));
                return s3q0.a;
            default:
                return (p410) this.c.invoke((n410) obj);
        }
    }
}
