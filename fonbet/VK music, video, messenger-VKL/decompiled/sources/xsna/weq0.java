package xsna;

import com.ironsource.B5;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.voip.dto.RecordType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import xsna.it80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class weq0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ weq0(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                return ((String) entry.getKey()) + B5.U + ((String) entry.getValue());
            case 1:
                return ((ryq0) obj).g;
            case 2:
                tq2 tq2Var = (tq2) obj;
                return new h9x((Math.round(tq2Var.a) << 32) | (Math.round(tq2Var.b) & 4294967295L));
            case 3:
                return (VideoFile) j5g.Y((List) obj);
            case 4:
                String str = ((h2q) obj).b;
                return Boolean.valueOf(!(str == null || str.length() == 0));
            case 5:
                return low0.a((low0) obj, false, true, 3071);
            case 6:
                it80.a aVar = it80.b;
                Object a0 = j5g.a0((ArrayList) obj);
                aVar.getClass();
                return new it80(a0);
            case 7:
                return (RecordType) ((it80) obj).a;
            default:
                return new i5g(((AttachWall) obj).o);
        }
    }
}
