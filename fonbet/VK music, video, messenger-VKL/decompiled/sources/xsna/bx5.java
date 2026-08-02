package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import java.util.List;
import xsna.rw30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class bx5 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bx5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                mtk0 mtk0Var = (mtk0) obj2;
                List list = sfl0.b;
                List<l5g> d = cx5.d(f870.c(((Number) ((List) obj4).get(1)).intValue()));
                float intBitsToFloat = Float.intBitsToFloat((int) (((mxj0) ((wh50) obj3).getValue()).a >> 32)) - Float.intBitsToFloat((int) (((ov70) mtk0Var.getValue()).a >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (((ov70) mtk0Var.getValue()).a & 4294967295L));
                break;
            case 1:
                c7x c7xVar = (c7x) obj4;
                Throwable th = (Throwable) obj3;
                c7xVar.f(th);
                break;
            case 2:
                gdj0 gdj0Var = (gdj0) obj4;
                gdj0Var.e = (phr) obj3;
                gdj0Var.f = (phr) obj2;
                gdj0Var.c = (phr) obj;
                break;
            default:
                rw30 rw30Var = (rw30) obj4;
                Dialog dialog = (Dialog) obj3;
                ProfilesSimpleInfo profilesSimpleInfo = (ProfilesSimpleInfo) obj2;
                ImSearchItemLoggingInfo imSearchItemLoggingInfo = (ImSearchItemLoggingInfo) obj;
                rw30.a aVar = rw30Var.w;
                if (aVar != null) {
                    aVar.e(dialog, profilesSimpleInfo, imSearchItemLoggingInfo);
                }
                rw30Var.j1(dialog);
                break;
        }
        return s3q0.a;
    }
}
