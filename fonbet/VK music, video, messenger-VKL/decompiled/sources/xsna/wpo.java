package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.dynamic_loader.DynamicTask;
import com.vk.core.dynamic_loader.b;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.dto.stickers.StickerSuggestion;
import com.vk.log.L;
import java.util.HashMap;
import java.util.List;
import xsna.kcl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class wpo implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wpo(int i, DynamicTask dynamicTask, io.reactivex.rxjava3.subjects.d dVar) {
        this.d = dynamicTask;
        this.e = dVar;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                DynamicTask dynamicTask = (DynamicTask) this.d;
                io.reactivex.rxjava3.subjects.d<b.AbstractC0762b> dVar = (io.reactivex.rxjava3.subjects.d) this.e;
                Integer num = (Integer) obj;
                L.p("DynamicLibLoader", "Start loading task - " + dynamicTask.name());
                dVar.onNext(b.AbstractC0762b.e.a);
                com.vk.core.dynamic_loader.b.i.put(num, dVar);
                com.vk.core.dynamic_loader.b.g.put(dynamicTask, num);
                vpo vpoVar = com.vk.core.dynamic_loader.b.a;
                if (vpoVar != null) {
                    vpoVar.c(dynamicTask, num.intValue());
                }
                int i = this.c;
                if (i != 0) {
                    com.vk.core.dynamic_loader.b.j.put(num, Integer.valueOf(i));
                } else {
                    HashMap<DynamicTask, uqn0> hashMap = com.vk.core.dynamic_loader.b.h;
                    uqn0 uqn0Var = new uqn0();
                    uqn0Var.b();
                    hashMap.put(dynamicTask, uqn0Var);
                }
                break;
            default:
                i8l0 i8l0Var = (i8l0) this.d;
                List<StickerSuggestion> list = (List) this.e;
                StickerStockItem stickerStockItem = (StickerStockItem) obj;
                if (stickerStockItem != null) {
                    Context context = i8l0Var.c;
                    kcl0.e eVar = i8l0Var.a;
                    StickerStockItemWithStickerId stickerStockItemWithStickerId = new StickerStockItemWithStickerId(stickerStockItem, this.c);
                    View view = i8l0Var.f;
                    k8l0 k8l0Var = new k8l0(context, eVar, stickerStockItemWithStickerId, list, view, i8l0Var);
                    k8l0Var.a(list);
                    k8l0Var.g.e(view);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ wpo(i8l0 i8l0Var, int i, List list) {
        this.d = i8l0Var;
        this.c = i;
        this.e = list;
    }
}
