package xsna;

import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import xsna.eox0;
import xsna.l5x0;
import xsna.oox0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class k4x0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ k4x0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object c3460a;
        switch (this.b) {
            case 0:
                return CallsAudioDeviceInfo.Companion.getNONE();
            case 1:
                return ((l5x0.b) obj).a;
            default:
                eox0.a aVar = ((eox0) obj).b;
                if (aVar instanceof eox0.a.b) {
                    return oox0.a.AbstractC3459a.b.a;
                }
                if (aVar instanceof eox0.a.c) {
                    c3460a = new oox0.a.AbstractC3459a.c(((eox0.a.c) aVar).b);
                } else {
                    if (!(aVar instanceof eox0.a.C2830a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c3460a = new oox0.a.AbstractC3459a.C3460a(((eox0.a.C2830a) aVar).b);
                }
                return c3460a;
        }
    }
}
