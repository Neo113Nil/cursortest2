package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockSticker;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPack;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPackPreview;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPreview;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.CommonVasStat$TypeIvasItemViews;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.stickers.views.sticker.StickerPackPreviewWithStickerId;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.fb80;
import xsna.hzp0;
import xsna.vha;

/* compiled from: StickersCatalogUiViewTracker.kt */
/* loaded from: classes16.dex */
public final class e9l0 extends z160 {
    public final boolean f;
    public final String g;
    public final Long h;

    /* compiled from: StickersCatalogUiViewTracker.kt */
    public static final class a extends vha.a {
        public final boolean w;
        public final RecyclerView x;
        public final View y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v4, types: [android.view.View] */
        public a(fb80.b bVar, boolean z, RecyclerView recyclerView, RecyclerView recyclerView2, dsg dsgVar, int i) {
            super((fb80.b<Object>) bVar, z, recyclerView, (i & 16) != 0 ? null : dsgVar);
            recyclerView2 = (i & 8) != 0 ? null : recyclerView2;
            this.w = z;
            this.x = recyclerView2;
            if (recyclerView2 == null) {
                this.y = null;
                return;
            }
            while (recyclerView != null && !epx.f(recyclerView.getParent(), this.x)) {
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            this.y = recyclerView;
        }

        @Override // xsna.jm6
        public final boolean d(RecyclerView recyclerView, View view) {
            float f;
            View view2;
            RecyclerView recyclerView2 = this.x;
            boolean z = this.w;
            if (!z && recyclerView2 == null) {
                return false;
            }
            if (recyclerView2 == null || (view2 = this.y) == null) {
                f = z ? 0.9f : 0.7f;
                return fco0.f(recyclerView, view, f, f, z);
            }
            f = z ? 0.9f : 0.7f;
            return fco0.f(recyclerView, view, f, f, z) && fco0.f(recyclerView2, view2, 0.9f, 0.9f, true);
        }

        @Override // xsna.vha.a
        public final vha.b n(RecyclerView.e0 e0Var, UIBlock uIBlock, tca tcaVar) {
            int i;
            int v;
            int x;
            View view;
            Integer num = null;
            RecyclerView recyclerView = this.x;
            if (recyclerView != null && (view = this.y) != null) {
                RecyclerView.e0 findContainingViewHolder = recyclerView.findContainingViewHolder(view);
                tca tcaVar2 = findContainingViewHolder instanceof tca ? (tca) findContainingViewHolder : null;
                UIBlock uIBlock2 = tcaVar2 != null ? tcaVar2.n : null;
                if (tcaVar2 != null && uIBlock2 != null) {
                    i = o(uIBlock2, tcaVar2);
                    vha.b n = super.n(e0Var, uIBlock, tcaVar);
                    UIBlock uIBlock3 = n.a;
                    int i2 = n.b;
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.b.getLayoutManager();
                    v = linearLayoutManager.v();
                    x = linearLayoutManager.x();
                    if (v != -1 && x != -1) {
                        num = Integer.valueOf((x - v) + 1);
                    }
                    return new b(uIBlock3, i2, i, num);
                }
            }
            i = 0;
            vha.b n2 = super.n(e0Var, uIBlock, tcaVar);
            UIBlock uIBlock32 = n2.a;
            int i22 = n2.b;
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) this.b.getLayoutManager();
            v = linearLayoutManager2.v();
            x = linearLayoutManager2.x();
            if (v != -1) {
                num = Integer.valueOf((x - v) + 1);
            }
            return new b(uIBlock32, i22, i, num);
        }
    }

    /* compiled from: StickersCatalogUiViewTracker.kt */
    public static final class b extends vha.b {
        public final int c;
        public final Integer d;

        public b(UIBlock uIBlock, int i, int i2, Integer num) {
            super(i, uIBlock);
            this.c = i2;
            this.d = num;
        }
    }

    /* compiled from: StickersCatalogUiViewTracker.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e9l0(boolean z, String str, Long l, c9l0 c9l0Var) {
        super(new s1v(), c9l0Var, 4);
        this.f = z;
        this.g = str;
        this.h = l;
    }

    @Override // xsna.vha, xsna.d680
    public final List<hzp0> j(Object obj) {
        StickerPackPreviewWithStickerId stickerPackPreviewWithStickerId;
        StickerPackPreview stickerPackPreview;
        Integer valueOf;
        StickerPackPreview stickerPackPreview2;
        StickerStockItem stickerStockItem;
        Integer num;
        StickerStockItemWithStickerId stickerStockItemWithStickerId;
        StickerStockItem stickerStockItem2;
        CommonVasStat$TypeIvasItemViews.BlockType blockType = null;
        if (obj instanceof vha.b) {
            vha.b bVar = (vha.b) obj;
            UIBlock uIBlock = bVar.a;
            if (!(uIBlock instanceof UIBlockHeader)) {
                if (uIBlock instanceof UIBlockSticker) {
                    UIBlockSticker uIBlockSticker = uIBlock != null ? (UIBlockSticker) uIBlock : null;
                    if (uIBlockSticker != null && (stickerStockItemWithStickerId = uIBlockSticker.y) != null && (stickerStockItem2 = stickerStockItemWithStickerId.b) != null) {
                        valueOf = Integer.valueOf(stickerStockItem2.b);
                    }
                    valueOf = null;
                } else if (uIBlock instanceof UIBlockStickerPack) {
                    UIBlockStickerPack uIBlockStickerPack = uIBlock != null ? (UIBlockStickerPack) uIBlock : null;
                    if (uIBlockStickerPack != null && (stickerStockItem = uIBlockStickerPack.y) != null) {
                        valueOf = Integer.valueOf(stickerStockItem.b);
                    }
                    valueOf = null;
                } else if (uIBlock instanceof UIBlockStickerPackPreview) {
                    UIBlockStickerPackPreview uIBlockStickerPackPreview = uIBlock != null ? (UIBlockStickerPackPreview) uIBlock : null;
                    if (uIBlockStickerPackPreview != null && (stickerPackPreview2 = uIBlockStickerPackPreview.y) != null) {
                        valueOf = Integer.valueOf(stickerPackPreview2.b);
                    }
                    valueOf = null;
                } else {
                    if (uIBlock instanceof UIBlockStickerPreview) {
                        UIBlockStickerPreview uIBlockStickerPreview = uIBlock != null ? (UIBlockStickerPreview) uIBlock : null;
                        if (uIBlockStickerPreview != null && (stickerPackPreviewWithStickerId = uIBlockStickerPreview.y) != null && (stickerPackPreview = stickerPackPreviewWithStickerId.b) != null) {
                            valueOf = Integer.valueOf(stickerPackPreview.b);
                        }
                    }
                    valueOf = null;
                }
                if (valueOf == null) {
                    return EmptyList.b;
                }
                boolean z = obj instanceof b;
                b bVar2 = z ? (b) obj : null;
                int intValue = (bVar2 == null || (num = bVar2.d) == null) ? 0 : num.intValue();
                b bVar3 = z ? (b) obj : null;
                int b2 = x9.b(bVar3 != null ? bVar3.c : 0, 1, 3, 1);
                int i = c.$EnumSwitchMapping$0[bVar.a.d.ordinal()];
                if (i == 1) {
                    blockType = CommonVasStat$TypeIvasItemViews.BlockType.BLOCK;
                } else if (i == 2) {
                    blockType = CommonVasStat$TypeIvasItemViews.BlockType.LIST;
                }
                CommonVasStat$TypeIvasItemViews.BlockType blockType2 = blockType;
                SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.STICKERS, null, null, null, null, null, 62, null);
                CommonVasStat$TypeIvasItemViews.ItemType itemType = CommonVasStat$TypeIvasItemViews.ItemType.STICKER_PACK;
                List singletonList = Collections.singletonList(valueOf);
                String str = this.g;
                if (str == null) {
                    str = "";
                }
                return Collections.singletonList(new hzp0.w(schemeStat$EventItem, new CommonVasStat$TypeIvasItemViews(itemType, singletonList, Integer.valueOf(b2), blockType2, null, Integer.valueOf(bVar.b), new CommonStat$TypeTrackCodeItem(str), Integer.valueOf(intValue), this.h, null, null, null, 3600, null)));
            }
        }
        return null;
    }

    @Override // xsna.z160, xsna.vha
    public final c2q0<Object> p(RecyclerView recyclerView) {
        return new a(this, this.f, recyclerView, null, new dsg(7, this, recyclerView), 8);
    }
}
