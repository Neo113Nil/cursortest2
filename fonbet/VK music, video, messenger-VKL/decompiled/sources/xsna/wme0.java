package xsna;

import android.content.Context;
import ru.ok.android.internal.tracer.TracerLiteFacade;
import ru.ok.tracer.lite.TracerLite;
import xsna.doe0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class wme0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ wme0(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        TracerLite tracerLite_delegate$lambda$0;
        switch (this.b) {
            case 0:
                return new one0(this.c, doe0.a.a);
            default:
                tracerLite_delegate$lambda$0 = TracerLiteFacade.tracerLite_delegate$lambda$0(this.c);
                return tracerLite_delegate$lambda$0;
        }
    }
}
