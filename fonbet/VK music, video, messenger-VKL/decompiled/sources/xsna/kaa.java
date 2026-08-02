package xsna;

import java.util.List;
import ru.ok.android.webrtc.mediarecord.VideoRecord;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class kaa implements a0t {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kaa(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.b) {
            case 0:
                aq40 aq40Var = ((laa) this.c).r;
                aq40Var.getClass();
                return aq40.a(aq40Var, (List) obj, (List) obj2, false, (List) obj3, (List) obj4, (List) obj5, null, null, null, null, VideoRecord.DEFAULT_MAX_DIMENSION);
            default:
                xjw0 xjw0Var = (xjw0) this.c;
                ((Integer) obj2).intValue();
                int intValue = ((Integer) obj3).intValue();
                ((Integer) obj4).intValue();
                int intValue2 = ((Integer) obj5).intValue();
                khc0 khc0Var = xjw0Var.d;
                if (khc0Var != null) {
                    mjw0 mjw0Var = (mjw0) khc0Var.c;
                    mjw0Var.e.b(intValue, intValue2);
                    mjw0Var.f.d5(intValue, intValue2);
                }
                return s3q0.a;
        }
    }
}
