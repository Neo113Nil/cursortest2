package xsna;

import com.vk.content.design.view.camera.CameraUIView;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import java.util.List;
import xsna.gpz;
import xsna.npc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ji3 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ji3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((g20) obj2).invoke(obj);
                break;
            case 1:
                ((qt0) obj2).invoke(obj);
                break;
            case 2:
                ((g20) obj2).invoke(obj);
                break;
            case 3:
                ((jl6) obj2).invoke(obj);
                break;
            case 4:
                ((qt0) obj2).invoke(obj);
                break;
            case 5:
                int i2 = BonusCatalogFragment.f0;
                ((g20) obj2).invoke(obj);
                break;
            case 6:
                ((g20) obj2).invoke(obj);
                break;
            case 7:
                float f = CameraUIView.w1;
                ((g20) obj2).invoke(obj);
                break;
            case 8:
                ((g20) obj2).invoke(obj);
                break;
            case 9:
                ((ud8) obj2).invoke(obj);
                break;
            case 10:
                ((g20) obj2).invoke(obj);
                break;
            case 11:
                xyb xybVar = (xyb) obj2;
                gpz.a aVar = (gpz.a) obj;
                xybVar.q = zyb.a(xybVar.q, xyb.Z0(new DialogExt(aVar.a, aVar.c)), false, false, aVar.b, aVar.d, null, 1238);
                xybVar.X0();
                azb azbVar = xybVar.A;
                if (azbVar != null) {
                    xybVar.a1(azbVar);
                    break;
                }
                break;
            case 12:
                ((ypc) obj2).b.e(new npc.b((List) obj));
                break;
            case 13:
                ((g20) obj2).invoke(obj);
                break;
            case 14:
                ((g20) obj2).invoke(obj);
                break;
            case 15:
                ((wqe) obj2).invoke(obj);
                break;
            case 16:
                ((nvg) obj2).invoke(obj);
                break;
            case 17:
                ((nvg) obj2).invoke(obj);
                break;
            case 18:
                ((qt0) obj2).invoke(obj);
                break;
            case 19:
                ((nvg) obj2).invoke(obj);
                break;
            case 20:
                ((com.vk.movika.sdk.base.logic.processor.d) obj2).invoke(obj);
                break;
            case 21:
                ((com.vk.movika.sdk.base.logic.processor.d) obj2).invoke(obj);
                break;
            case 22:
                ((sg3) obj2).invoke(obj);
                break;
            case 23:
                ((jl6) obj2).invoke(obj);
                break;
            case 24:
                ((com.vk.movika.sdk.base.logic.processor.d) obj2).invoke(obj);
                break;
            case 25:
                ((nvg) obj2).invoke(obj);
                break;
            case 26:
                ((pem) obj2).invoke(obj);
                break;
            case 27:
                ((nvg) obj2).invoke(obj);
                break;
            case 28:
                ((qt0) obj2).invoke(obj);
                break;
            default:
                ((nvg) obj2).invoke(obj);
                break;
        }
    }
}
