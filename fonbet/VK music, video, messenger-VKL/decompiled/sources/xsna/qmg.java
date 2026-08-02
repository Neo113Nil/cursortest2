package xsna;

import android.content.Context;
import com.vk.dto.gift.CatalogedGift;
import com.vk.stickers.views.sticker.StickerPackPreview;
import java.util.Collection;
import kotlin.InitializedLazyImpl;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class qmg implements izs {
    public final /* synthetic */ Collection b;
    public final /* synthetic */ StickerPackPreview c;
    public final /* synthetic */ smg d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ String f;

    public /* synthetic */ qmg(Collection collection, StickerPackPreview stickerPackPreview, smg smgVar, Context context, String str) {
        this.b = collection;
        this.c = stickerPackPreview;
        this.d = smgVar;
        this.e = context;
        this.f = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        dqt dqtVar = (dqt) obj;
        Collection collection = this.b;
        if (collection != null && collection.size() == 1 && !this.c.j) {
            collection = EmptyList.b;
        }
        zal0 zal0Var = (zal0) ((InitializedLazyImpl) this.d.a).getValue();
        CatalogedGift catalogedGift = dqtVar.b;
        String str = this.f;
        if (str == null) {
            str = "stickers_store";
        }
        zal0Var.g(this.e, collection, catalogedGift, str);
        return s3q0.a;
    }
}
