package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.attachpicker.impl.fragment.AttachMusicFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class w24 implements io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ w24(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public final Object apply(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                int i2 = AttachMusicFragment.I0;
                return (VkPaginationList) izsVar.invoke(obj);
            default:
                return (pah) izsVar.invoke(obj);
        }
    }
}
