package xsna;

import com.vk.dto.stickers.AnimatedStickerInfo;
import java.util.HashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class sdh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ sdh(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "priority_block_header_show_all_item_btn");
                qgi0.h(tgi0Var, this.c);
                break;
            default:
                HashMap<String, AnimatedStickerInfo> hashMap = c7r0.g;
                String str = this.c;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new AnimatedStickerInfo(str, 0, 0, 6, null));
                    wmi0.a.m("animated_stickers_list_v21", j5g.O0(hashMap.values()));
                }
                break;
        }
        return s3q0.a;
    }
}
