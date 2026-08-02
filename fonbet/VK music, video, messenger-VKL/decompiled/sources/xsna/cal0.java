package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockSticker;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPack;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPackPreview;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPreview;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.stickers.views.sticker.StickerPackPreviewWithStickerId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: StickersExternalEventHandlerDelegate.kt */
/* loaded from: classes.dex */
public final class cal0 extends l5a {
    public final io.reactivex.rxjava3.disposables.b c;
    public final a2w d;

    public cal0(q3a q3aVar) {
        super(q3aVar);
        this.c = new io.reactivex.rxjava3.disposables.b();
        this.d = new a2w(this);
    }

    public static boolean b(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (epx.f(((UIBlock) obj).Fb(), str)) {
                arrayList2.add(obj);
            }
        }
        if (j5g.M(arrayList2)) {
            return true;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof UIBlockList) {
                arrayList3.add(obj2);
            }
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            b(str, ((UIBlockList) it.next()).Sb());
        }
        return false;
    }

    public static void c(UIBlockList uIBlockList, String str, izs izsVar, izs izsVar2) {
        izs izsVar3 = izsVar;
        izs izsVar4 = izsVar2;
        int size = uIBlockList.Sb().size();
        int i = 0;
        while (i < size) {
            UIBlock uIBlock = uIBlockList.Sb().get(i);
            if (epx.f(uIBlock.Fb(), str)) {
                if (uIBlock instanceof UIBlockStickerPack) {
                    uIBlockList.Sb().set(i, new UIBlockStickerPack(uIBlock.w(), uIBlock.Mb(), uIBlock.Cb(), uIBlock.Jb(), uIBlock.q(), uIBlock.Ib(), uIBlock.Db(), uIBlock.Eb(), (StickerStockItem) izsVar3.invoke(((UIBlockStickerPack) uIBlock).Pb())));
                } else if (uIBlock instanceof UIBlockSticker) {
                    ArrayList<UIBlock> Sb = uIBlockList.Sb();
                    String w = uIBlock.w();
                    CatalogViewType Mb = uIBlock.Mb();
                    CatalogDataType Cb = uIBlock.Cb();
                    String Jb = uIBlock.Jb();
                    UserId q = uIBlock.q();
                    List<String> Ib = uIBlock.Ib();
                    Set<UIBlockDragDropAction> Db = uIBlock.Db();
                    UIBlockHint Eb = uIBlock.Eb();
                    UIBlockSticker uIBlockSticker = (UIBlockSticker) uIBlock;
                    Sb.set(i, new UIBlockSticker(w, Mb, Cb, Jb, q, Ib, Db, Eb, StickerStockItemWithStickerId.zb(uIBlockSticker.Pb(), (StickerStockItem) izsVar3.invoke(uIBlockSticker.Pb().Ab()), 2)));
                } else if (uIBlock instanceof UIBlockStickerPackPreview) {
                    uIBlockList.Sb().set(i, new UIBlockStickerPackPreview(uIBlock.w(), uIBlock.Mb(), uIBlock.Cb(), uIBlock.Jb(), uIBlock.q(), uIBlock.Ib(), uIBlock.Db(), uIBlock.Eb(), (StickerPackPreview) izsVar4.invoke(((UIBlockStickerPackPreview) uIBlock).Pb())));
                } else if (uIBlock instanceof UIBlockStickerPreview) {
                    ArrayList<UIBlock> Sb2 = uIBlockList.Sb();
                    String w2 = uIBlock.w();
                    CatalogViewType Mb2 = uIBlock.Mb();
                    CatalogDataType Cb2 = uIBlock.Cb();
                    String Jb2 = uIBlock.Jb();
                    UserId q2 = uIBlock.q();
                    List<String> Ib2 = uIBlock.Ib();
                    Set<UIBlockDragDropAction> Db2 = uIBlock.Db();
                    UIBlockHint Eb2 = uIBlock.Eb();
                    UIBlockStickerPreview uIBlockStickerPreview = (UIBlockStickerPreview) uIBlock;
                    Sb2.set(i, new UIBlockStickerPreview(w2, Mb2, Cb2, Jb2, q2, Ib2, Db2, Eb2, StickerPackPreviewWithStickerId.zb(uIBlockStickerPreview.Pb(), (StickerPackPreview) izsVar4.invoke(uIBlockStickerPreview.Pb().Ab()), 2)));
                }
            }
            i++;
            izsVar3 = izsVar;
            izsVar4 = izsVar2;
        }
    }

    @Override // xsna.l5a
    public final void a() {
        this.c.b(y9l0.a.y(300L, TimeUnit.MILLISECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new gzc0(new bal0(this), 1)));
    }
}
