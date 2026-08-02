package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.viewer.api.domain.subs.ClipsSubsSetting;
import com.vk.core.serialize.Serializer;
import com.vk.dto.gift.CatalogedGift;
import com.vk.dto.stickers.StickerStockItem;
import java.util.Collection;
import kotlin.InitializedLazyImpl;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class m1d implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializer.StreamParcelable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ m1d(Object obj, Serializer.StreamParcelable streamParcelable, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = streamParcelable;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return o1d.q((ile) this.c, (SdkClipVideoFile) this.d, (o1d) this.e, (y0r) this.f, (kih0) this.g, (ClipsSubsSetting) obj);
            default:
                Collection collection = (Collection) this.c;
                StickerStockItem stickerStockItem = (StickerStockItem) this.d;
                smg smgVar = (smg) this.e;
                Context context = (Context) this.f;
                String str = (String) this.g;
                dqt dqtVar = (dqt) obj;
                if (collection != null && collection.size() == 1 && !stickerStockItem.j) {
                    collection = EmptyList.b;
                }
                zal0 zal0Var = (zal0) ((InitializedLazyImpl) smgVar.a).getValue();
                CatalogedGift catalogedGift = dqtVar.b;
                if (str == null) {
                    str = "stickers_store";
                }
                zal0Var.g(context, collection, catalogedGift, str);
                return s3q0.a;
        }
    }
}
