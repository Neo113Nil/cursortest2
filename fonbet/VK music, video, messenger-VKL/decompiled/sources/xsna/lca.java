package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.core.util.EditorMode;
import com.vk.catalog2.common.ui.holders.DraggableVh;
import com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.mca;
import xsna.u4a;

/* compiled from: CatalogRecyclerAdapter.kt */
/* loaded from: classes16.dex */
public class lca extends zoj0<UIBlock, tca> implements ai5, eca {
    public static final b q = new b();
    public final wia e;
    public final CatalogConfiguration f;
    public final u4a g;
    public final gzs<qda> h;
    public final qr5 i;
    public androidx.recyclerview.widget.r j;
    public boolean k;
    public final LinkedHashSet l;
    public tnk m;
    public hbt0 n;
    public final Object o;
    public final Object p;

    /* compiled from: CatalogRecyclerAdapter.kt */
    public static final class a extends mw2 {
        public final /* synthetic */ ListDataSet<UIBlock> b;

        public a(ListDataSet<UIBlock> listDataSet) {
            this.b = listDataSet;
        }

        @Override // xsna.mw2, androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            qr5 qr5Var = lca.this.i;
            ListDataSet.ArrayListImpl<UIBlock> arrayListImpl = this.b.d;
            LinkedHashMap linkedHashMap = (LinkedHashMap) qr5Var.b;
            linkedHashMap.clear();
            Iterator<UIBlock> it = arrayListImpl.iterator();
            int i = 0;
            while (it.hasNext()) {
                UIBlock next = it.next();
                linkedHashMap.put(Long.valueOf(next.k), Integer.valueOf(i));
                i += ((Number) ((d) qr5Var.a).invoke(next)).intValue();
            }
        }
    }

    /* compiled from: CatalogRecyclerAdapter.kt */
    public static final class b {
    }

    /* compiled from: CatalogRecyclerAdapter.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_TRACKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CatalogRecyclerAdapter.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<UIBlock, Integer> {
        @Override // xsna.izs
        public final Integer invoke(UIBlock uIBlock) {
            return Integer.valueOf(((CatalogConfiguration) this.receiver).u(uIBlock));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lca(wia wiaVar, CatalogConfiguration catalogConfiguration, ListDataSet<UIBlock> listDataSet, u4a u4aVar, gzs<? extends qda> gzsVar) {
        super(listDataSet);
        this.e = wiaVar;
        this.f = catalogConfiguration;
        this.g = u4aVar;
        this.h = gzsVar;
        this.i = new qr5(new d(1, catalogConfiguration, CatalogConfiguration.class, "getSubItemCount", "getSubItemCount(Lcom/vk/catalog2/common/dto/api/ui/UIBlock;)I", 0));
        this.l = new LinkedHashSet();
        f4 f4Var = new f4(4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o = msy.a(lazyThreadSafetyMode, f4Var);
        this.p = msy.a(lazyThreadSafetyMode, new gy0(this, 11));
        a aVar = new a(listDataSet);
        ArrayList<RecyclerView.i> arrayList = listDataSet.b;
        if (arrayList.contains(aVar)) {
            return;
        }
        arrayList.add(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ai5
    public final y9t0 Eh(int i) {
        yg5 yg5Var;
        if (i >= 0) {
            ListDataSet listDataSet = (ListDataSet) this.c;
            if (i < listDataSet.d.size()) {
                UIBlock uIBlock = (UIBlock) listDataSet.d.get(i);
                d1a d1aVar = uIBlock instanceof d1a ? (d1a) uIBlock : null;
                VideoFile m7 = d1aVar != null ? d1aVar.m7() : null;
                if (m7 != null) {
                    bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                    yg5Var = b.C1208b.a().e(m7, null);
                } else {
                    yg5Var = null;
                }
                VideoAutoPlay videoAutoPlay = yg5Var instanceof VideoAutoPlay ? (VideoAutoPlay) yg5Var : null;
                String str = uIBlock != 0 ? uIBlock.f : null;
                String str2 = uIBlock.b + '|' + uIBlock.b;
                UIBlockVideo uIBlockVideo = uIBlock instanceof UIBlockVideo ? (UIBlockVideo) uIBlock : null;
                return new y9t0(videoAutoPlay, new ni5(str, str2, uIBlockVideo != null ? uIBlockVideo.B.r() : null, 8));
            }
        }
        return null;
    }

    @Override // xsna.dkf0
    public final int getAdapterOffset() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        UIBlock uIBlock = (UIBlock) this.c.c(i);
        if (uIBlock == null) {
            return -1;
        }
        return ((mca) this.p.getValue()).a(uIBlock.e, uIBlock.d, uIBlock.l, uIBlock.Nb() || uIBlock.Ob());
    }

    @Override // xsna.ai5
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return this.f.getVideoAutoPlayDelayType();
    }

    @Override // xsna.eca
    public final void n(EditorMode editorMode) {
        this.k = editorMode == EditorMode.ENTER_EDITOR_MODE;
        notifyItemRangeChanged(0, getItemCount());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.d = recyclerView;
        fjt0 fjt0Var = (fjt0) this.o.getValue();
        if (fjt0Var != null) {
            recyclerView.addOnScrollListener(fjt0Var.c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        tnk tnkVar;
        tca tcaVar = (tca) e0Var;
        UIBlock uIBlock = (UIBlock) this.c.c(i);
        CatalogViewHolder catalogViewHolder = tcaVar.l;
        if ((catalogViewHolder instanceof unk) && (tnkVar = this.m) != null) {
            ((unk) catalogViewHolder).a(tnkVar);
        }
        gzs<qda> gzsVar = this.h;
        if (gzsVar != null && (catalogViewHolder instanceof CatalogListViewHolder)) {
            ((CatalogListViewHolder) catalogViewHolder).Pl(gzsVar.invoke());
        }
        DraggableVh draggableVh = catalogViewHolder instanceof DraggableVh ? (DraggableVh) catalogViewHolder : null;
        if (draggableVh != null) {
            draggableVh.k = this;
        }
        if (catalogViewHolder instanceof c5a) {
            ((c5a) catalogViewHolder).K0(new hc1(3, this, tcaVar));
        }
        boolean z = this.k;
        tcaVar.n = uIBlock;
        catalogViewHolder.yh(i, uIBlock);
        if (uIBlock.d.j()) {
            return;
        }
        if (catalogViewHolder instanceof cho) {
            ((cho) catalogViewHolder).d(z);
            return;
        }
        if (z) {
            View view = tcaVar.itemView;
            qcy<Object>[] qcyVarArr = bwt0.a;
            tcaVar.o = Boolean.valueOf(view.isEnabled());
            tca.V5(tcaVar.itemView, !z);
            return;
        }
        Boolean bool = tcaVar.o;
        if (bool != null) {
            tca.V5(tcaVar.itemView, bool.booleanValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r0 == null) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        CatalogViewHolder w;
        fjt0 fjt0Var;
        DraggableVh draggableVh;
        mca.a c2 = ((mca) this.p.getValue()).c(Math.abs(i));
        CatalogDataType catalogDataType = c2.a;
        CatalogViewType catalogViewType = c2.b;
        CatalogViewStyle catalogViewStyle = c2.c;
        boolean z = c2.d;
        wia wiaVar = this.e;
        if (wiaVar != null) {
            u4a.a aVar = this.g.b;
            w = wiaVar.a(catalogDataType, catalogViewType, catalogViewStyle, null, new z4a(aVar.d, aVar.f));
        }
        w = this.f.w(catalogDataType, catalogViewType, catalogViewStyle, null, this.g);
        if (z && !catalogViewType.j()) {
            int i2 = c.$EnumSwitchMapping$0[catalogDataType.ordinal()];
            if (i2 == 1 || i2 == 2) {
                draggableVh = new DraggableVh(w, 4);
                draggableVh.l = enj.e(R.drawable.vk_icon_add_circle_24, R.attr.vk_ui_icon_secondary, viewGroup.getContext());
                draggableVh.m = enj.e(R.drawable.vk_icon_remove_circle_24, R.attr.vk_ui_background_negative, viewGroup.getContext());
            } else {
                draggableVh = new DraggableVh(w, 6);
            }
            w = draggableVh;
        }
        tca tcaVar = new tca(viewGroup, w, new zha(w));
        DraggableVh draggableVh2 = w instanceof DraggableVh ? (DraggableVh) w : null;
        if (draggableVh2 != null) {
            draggableVh2.j = new vf1(3, this, tcaVar);
        }
        View view = tcaVar.itemView;
        djt0 djt0Var = view instanceof djt0 ? (djt0) view : null;
        if (djt0Var != null && (fjt0Var = (fjt0) this.o.getValue()) != null) {
            djt0Var.e.add(fjt0Var.b);
        }
        return tcaVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        fjt0 fjt0Var = (fjt0) this.o.getValue();
        if (fjt0Var != null) {
            recyclerView.removeOnScrollListener(fjt0Var.c);
            fjt0Var.a = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(RecyclerView.e0 e0Var) {
        tca tcaVar = (tca) e0Var;
        Boolean G = this.f.G(this, tcaVar);
        return G != null ? G.booleanValue() : super.onFailedToRecycleView(tcaVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.e0 e0Var) {
        tca tcaVar = (tca) e0Var;
        super.onViewAttachedToWindow(tcaVar);
        CatalogViewHolder catalogViewHolder = tcaVar.l;
        if (catalogViewHolder instanceof HorizontalListVh) {
            ((HorizontalListVh) catalogViewHolder).v = this.n;
        }
    }
}
