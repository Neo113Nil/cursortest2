package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.fzu0;
import xsna.yk8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class vw5 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vw5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        fzu0 view;
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                List list = sfl0.b;
                List<l5g> d = cx5.d(f870.c(((Number) ((List) obj4).get(3)).intValue()));
                float intBitsToFloat = Float.intBitsToFloat((int) (((mxj0) ((wh50) obj3).getValue()).a >> 32)) - Float.intBitsToFloat((int) (((ov70) ((mtk0) obj2).getValue()).a >> 32));
                return yk8.a.e(d, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (((mxj0) r3.getValue()).a & 4294967295L)) - Float.intBitsToFloat((int) (((ov70) r2.getValue()).a & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), ((Number) ((mtk0) obj).getValue()).floatValue() * 1.8f, 8);
            default:
                UserId userId = (UserId) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                fzu0.a aVar = ((g4y) obj4).c;
                if (aVar != null && (view = aVar.getView()) != null) {
                    view.o9(userId, str, str2);
                }
                return s3q0.a;
        }
    }
}
