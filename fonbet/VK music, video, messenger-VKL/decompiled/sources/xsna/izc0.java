package xsna;

import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.qwi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class izc0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ izc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ((kzc0) obj2).a();
            case 1:
                ((com.vk.voip.ui.sessionrooms.d) obj2).k().C(new qwi0.a((ParticipantId) obj));
                return s3q0.a;
            default:
                k2q k2qVar = ((zbr0) obj2).b;
                if (k2qVar == null) {
                    return null;
                }
                k2qVar.c();
                return s3q0.a;
        }
    }
}
