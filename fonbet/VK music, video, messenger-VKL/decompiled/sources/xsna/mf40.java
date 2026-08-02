package xsna;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.core.util.EditorMode;
import com.vk.catalog2.common.ui.holders.EmptyVh;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicCatalogHeaderShowAll;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicCatalogShowAllListVh;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicSelectorCatalogCategoriesVh;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicSelectorCatalogEmbeddedTabsVh;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicSelectorCatalogFullHeightListVh;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicSelectorCatalogPromoBannerContainerVh;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicSelectorCatalogPromoBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.container.CatalogLongButtonBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.container.GridListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicTrackPickerVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;
import xsna.ayn0;
import xsna.f4m;
import xsna.gzs;
import xsna.hl10;
import xsna.iah0;
import xsna.mca;
import xsna.ozf0;
import xsna.qda;
import xsna.s3q0;
import xsna.u4a;

/* compiled from: MusicClipsCatalogConfiguration.kt */
/* loaded from: classes3.dex */
public final class mf40 extends p850 {
    public static final String G;
    public static final String H;
    public final b D;
    public final boolean E;
    public final bpn0 F;

    /* compiled from: MusicClipsCatalogConfiguration.kt */
    public static final class a {
    }

    /* compiled from: MusicClipsCatalogConfiguration.kt */
    public static final class b {
        public final mwm0 a;
        public final eni0 b;

        public b(mwm0 mwm0Var, eni0 eni0Var) {
            this.a = mwm0Var;
            this.b = eni0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Deps(viewStyleResolverProvider=" + this.a + ", onCreateVerticalList=" + this.b + ')';
        }
    }

    /* compiled from: MusicClipsCatalogConfiguration.kt */
    public static final class c extends RecyclerView.n {
        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            Integer valueOf = adapter != null ? Integer.valueOf(adapter.getItemCount()) : null;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (valueOf == null || childAdapterPosition < 0 || childAdapterPosition >= valueOf.intValue()) {
                super.getItemOffsets(rect, view, recyclerView, a0Var);
            }
            int a = iah0.a(5);
            rect.set(a, a, a, a);
        }
    }

    /* compiled from: MusicClipsCatalogConfiguration.kt */
    public static final class d extends be40 {
        public final mwm0 v;
        public final Rect w = new Rect();
        public final Paint x;
        public final Object y;

        public d(mwm0 mwm0Var) {
            this.v = mwm0Var;
            Paint paint = new Paint();
            this.x = paint;
            this.y = msy.a(LazyThreadSafetyMode.NONE, new fm20(this, 5));
            paint.setStyle(Paint.Style.FILL);
            dhr0.a.getClass();
            paint.setColor(dhr0.s().getColor(R.color.vk_gray_1000));
        }

        @Override // xsna.be40, xsna.sca, androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            super.getItemOffsets(rect, view, recyclerView, a0Var);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter == null || adapter.getItemCount() == 0) {
                return;
            }
            if (recyclerView.getChildAdapterPosition(view) == adapter.getItemCount() - 1) {
                rect.bottom = iah0.a(72) + rect.bottom;
            }
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int childAdapterPosition;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter == null || adapter.getItemCount() == 0) {
                return;
            }
            int itemCount = adapter.getItemCount();
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null && (childAdapterPosition = recyclerView.getChildAdapterPosition(childAt)) >= 0 && childAdapterPosition < itemCount) {
                    try {
                        mca.a c = ((mca) this.y.getValue()).c(adapter.getItemViewType(childAdapterPosition));
                        if (c.a == CatalogDataType.DATA_TYPE_CATALOG_BANNERS && c.b == CatalogViewType.BANNER) {
                            int left = recyclerView.getLeft();
                            int top = childAt.getTop();
                            int right = recyclerView.getRight();
                            int bottom = recyclerView.getBottom();
                            Rect rect = this.w;
                            rect.set(left, top, right, bottom);
                            canvas.drawRect(rect, this.x);
                            return;
                        }
                    } catch (IndexOutOfBoundsException unused) {
                        return;
                    }
                }
            }
        }
    }

    /* compiled from: MusicClipsCatalogConfiguration.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SYNTHETIC_CATALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_SLIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_MINITAB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.PROMO_BANNERS_SLIDER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogViewType.HEADER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogViewType.TRIPLE_STACKED_SLIDER_PICKER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogViewType.LIST_PICKER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_SMALL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_CATALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_BANNERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_FAVORITES.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_SHOW_ALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MUSIC_TRACKS.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_SHORT_VIDEO_AUDIOS.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CatalogConfiguration$Companion$ContainerType.values().length];
            try {
                iArr3[CatalogConfiguration$Companion$ContainerType.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* compiled from: MusicClipsCatalogConfiguration.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<CatalogCatalogResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto) {
            ((e3a) this.receiver).getClass();
            return e3a.b(catalogCatalogResponseObjectDto);
        }
    }

    /* compiled from: MusicClipsCatalogConfiguration.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<CatalogCatalogResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto) {
            ((e3a) this.receiver).getClass();
            return e3a.b(catalogCatalogResponseObjectDto);
        }
    }

    static {
        String concat = qjg.a(new a()).concat(BundleUtil.UNDERLINE_TAG);
        G = concat;
        H = fo8.a(concat, NativeAdContent.ViewTag.ROOT);
    }

    public mf40(b bVar, Bundle bundle) {
        super(UserId.d, "");
        this.D = bVar;
        this.E = bundle.getBoolean("use_for_stories", false);
        this.F = new bpn0(new ubw(this, 11));
    }

    public static CatalogViewHolder z0(mf40 mf40Var, CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
    }

    public final xy2<CatalogCatalogResponseObjectDto> A0(UserId userId) {
        return this.E ? new tfx("catalog.getAudioStory", new dq(5), new com.vk.movika.sdk.base.model.n(5)) : wga.e(new xga(), null, null, userId, 21);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [com.vk.music.clips.MusicClipsCatalogConfiguration$createViewHolderImpl$2$listVh$1] */
    public final CatalogViewHolder B0(CatalogDataType catalogDataType, CatalogViewType catalogViewType, UIBlock uIBlock, u4a u4aVar, kf40 kf40Var) {
        String str;
        String str2;
        String str3 = "";
        switch (e.$EnumSwitchMapping$1[catalogDataType.ordinal()]) {
            case 1:
                int i = e.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                return i != 1 ? i != 2 ? (CatalogViewHolder) kf40Var.invoke() : new ClipsMusicSelectorCatalogEmbeddedTabsVh.EndVh(u4aVar) : new ClipsMusicSelectorCatalogEmbeddedTabsVh(u4aVar);
            case 2:
                CatalogViewType catalogViewType2 = CatalogViewType.BANNER;
                if (catalogViewType != catalogViewType2 || !MusicSelectorCatalogRootVh.C) {
                    return catalogViewType == catalogViewType2 ? new EmptyVh(false) : catalogViewType == CatalogViewType.PROMO_BANNERS_SLIDER ? new ClipsMusicSelectorCatalogPromoBannerVh(u4aVar, uIBlock) : (CatalogViewHolder) kf40Var.invoke();
                }
                CatalogLongButtonBannerVh catalogLongButtonBannerVh = new CatalogLongButtonBannerVh(u4aVar, true);
                catalogLongButtonBannerVh.n = new u210(this, 6);
                return catalogLongButtonBannerVh;
            case 3:
                return e.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 3 ? new ClipsMusicSelectorCatalogCategoriesVh(u4aVar) : (CatalogViewHolder) kf40Var.invoke();
            case 4:
                return new ClipsMusicSelectorCatalogFullHeightListVh(u4aVar, uIBlock);
            case 5:
                int i2 = e.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i2 == 3) {
                    return new GridListVh(this, 2, u4aVar, R.layout.catalog_music_slider_item_view, new c(), null, 200);
                }
                if (i2 != 4) {
                    return i2 != 5 ? i2 != 6 ? (CatalogViewHolder) kf40Var.invoke() : new ClipsMusicSelectorCatalogPromoBannerContainerVh(u4aVar) : new ClipsMusicSelectorCatalogFullHeightListVh(u4aVar, uIBlock);
                }
                if (uIBlock != null && (str = uIBlock.b) != null) {
                    str3 = str;
                }
                uba ubaVar = new uba(h0(null, str3, u4aVar));
                CatalogPaginatedListViewHolder g0 = com.vk.catalog2.common.ui.mvp.configuration.a.g0(this, uIBlock, u4aVar, ubaVar, 8);
                this.D.b.invoke(g0);
                ubaVar.h = g0;
                return g0;
            case 6:
                nda ndaVar = u4aVar.b.b;
                eda b0 = b0(u4aVar);
                q3a q3aVar = u4aVar.b.e;
                dhr0.a.getClass();
                ToolbarVh toolbarVh = new ToolbarVh(ndaVar, q3aVar, null, 0, false, bwt0.u(dhr0.E()), b0, null, null, null, null, 4063004);
                if (uIBlock != null && (str2 = uIBlock.b) != null) {
                    str3 = str2;
                }
                uba ubaVar2 = new uba(h0(null, str3, u4aVar));
                final CatalogPaginatedListViewHolder g02 = com.vk.catalog2.common.ui.mvp.configuration.a.g0(this, uIBlock, u4aVar, ubaVar2, 8);
                ClipsMusicCatalogShowAllListVh clipsMusicCatalogShowAllListVh = new ClipsMusicCatalogShowAllListVh(u4aVar, toolbarVh, new CatalogPaginatedListViewHolder() { // from class: com.vk.music.clips.MusicClipsCatalogConfiguration$createViewHolderImpl$2$listVh$1
                    public final /* synthetic */ CatalogPaginatedListViewHolder b;

                    {
                        this.b = CatalogPaginatedListViewHolder.this;
                    }

                    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
                    public final void Bl(boolean z) {
                        this.b.Bl(z);
                    }

                    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder
                    public final void Cm(Integer num) {
                        this.b.Cm(num);
                    }

                    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
                    public final void L() {
                        this.b.L();
                    }

                    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
                    public final void N5(UIBlock uIBlock2) {
                        this.b.N5(uIBlock2);
                    }

                    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
                    public final void N6(UIBlock uIBlock2) {
                        this.b.N6(uIBlock2);
                    }

                    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
                    public final ayn0 Pa() {
                        return this.b.Pa();
                    }

                    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
                    public final void Pl(qda qdaVar) {
                        this.b.Pl(qdaVar);
                    }

                    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
                    public final c Wi(String str4, boolean z, boolean z2, UIBlockList uIBlockList, boolean z3, gzs<s3q0> gzsVar, boolean z4) {
                        return this.b.Wi(str4, z, z2, uIBlockList, z3, gzsVar, z4);
                    }

                    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
                    public final void dj(m.d dVar, List<? extends UIBlock> list, List<? extends UIBlock> list2, UIBlockList uIBlockList) {
                        this.b.dj(dVar, list, list2, uIBlockList);
                    }

                    @Override // xsna.wca
                    public final void g(int i3, int i4) {
                        this.b.g(i3, i4);
                    }

                    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder
                    public final List<ozf0> gi() {
                        return this.b.gi();
                    }

                    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
                    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                        View k5 = CatalogPaginatedListViewHolder.this.k5(layoutInflater, viewGroup, bundle);
                        f4m.t(iah0.a(7), k5);
                        return k5;
                    }

                    @Override // xsna.eca
                    public final void n(EditorMode editorMode) {
                        this.b.n(editorMode);
                    }

                    @Override // xsna.g380
                    public final void onConfigurationChanged(Configuration configuration) {
                        this.b.onConfigurationChanged(configuration);
                    }

                    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
                    public final void onPause() {
                        this.b.onPause();
                    }

                    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
                    public final void onResume() {
                        this.b.onResume();
                    }

                    @Override // xsna.rda
                    public final void s() {
                        this.b.s();
                    }

                    @Override // xsna.rda
                    public final void t() {
                        this.b.t();
                    }

                    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
                    public final qda td() {
                        return this.b.td();
                    }

                    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder
                    public final void um() {
                        this.b.um();
                    }

                    @Override // xsna.rda
                    public final void x(int i3) {
                        this.b.x(i3);
                    }

                    @Override // xsna.m0q0
                    public final void y(UiTrackingScreen uiTrackingScreen) {
                        this.b.y(uiTrackingScreen);
                    }

                    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
                    public final void yh(int i3, UIBlock uIBlock2) {
                        this.b.yh(i3, uIBlock2);
                    }

                    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
                    public final boolean ze(Rect rect) {
                        return this.b.ze(rect);
                    }
                }, uIBlock);
                ubaVar2.h = clipsMusicCatalogShowAllListVh;
                return clipsMusicCatalogShowAllListVh;
            case 7:
                if (e.$EnumSwitchMapping$0[catalogViewType.ordinal()] != 7) {
                    return (CatalogViewHolder) kf40Var.invoke();
                }
                nda ndaVar2 = u4aVar.b.b;
                eda b02 = b0(u4aVar);
                u4a.a aVar = u4aVar.b;
                return new ClipsMusicCatalogHeaderShowAll(this, ndaVar2, b02, aVar.f, aVar.w, aVar.m);
            case 8:
            case 9:
                int i3 = e.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i3 != 4) {
                    if (i3 == 8) {
                        u4aVar.c.getClass();
                        mba mbaVar = u4aVar.c.a;
                        u4a.a aVar2 = u4aVar.b;
                        return new MusicTrackPickerVh(mbaVar, aVar2.f, aVar2.i, R.layout.catalog_music_audio_item_picker_clips_320, true, aVar2.e);
                    }
                    if (i3 != 9) {
                        return (CatalogViewHolder) kf40Var.invoke();
                    }
                }
                u4aVar.c.getClass();
                mba mbaVar2 = u4aVar.c.a;
                u4a.a aVar3 = u4aVar.b;
                return new MusicTrackPickerVh(mbaVar2, aVar3.f, aVar3.i, R.layout.catalog_music_audio_item_picker_clips, true, aVar3.e);
            case 10:
                return e.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 10 ? new PlaceholderVh(u4aVar.b.w, false, false, null, null, R.layout.catalog_minitab_placeholder_view, null, 56, 92) : (CatalogViewHolder) kf40Var.invoke();
            default:
                return (CatalogViewHolder) kf40Var.invoke();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> D(String str, String str2, boolean z) {
        UserId userId = this.b;
        e3a e3aVar = new e3a();
        int i = 22;
        if (str.equals(H)) {
            return ktr.c(rsg0.T(yfb.x(A0(userId))).U(new u5(new g(1, e3aVar, e3a.class, "mapToCatalog", "mapToCatalog(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), i)).U(new qs6(new z6u(7), 23)));
        }
        int i2 = 1;
        io.reactivex.rxjava3.core.q<hda> qVar = null;
        if (brm0.B(str, "synthetic_playlist", false)) {
            Serializer.c<UIBlockMusicPlaylist> cVar = UIBlockMusicPlaylist.CREATOR;
            hl10 e2 = new Regex("synthetic_playlist([-0-9]+)_([0-9]+)_(.+?)_(.+)").e(str);
            if (e2 != null) {
                long parseLong = Long.parseLong((String) ((hl10.a) e2.b()).get(1));
                int parseInt = Integer.parseInt((String) ((hl10.a) e2.b()).get(2));
                String str3 = (String) ((hl10.a) e2.b()).get(3);
                String str4 = (String) ((hl10.a) e2.b()).get(4);
                int parseInt2 = str2 != null ? Integer.parseInt(str2) : 0;
                ix4 ix4Var = new ix4();
                gzs<s3q0> gzsVar = fkq0.a;
                qVar = rsg0.y0(yfb.x(hx4.C(ix4Var, new UserId(parseLong), Integer.valueOf(parseInt), null, Integer.valueOf(parseInt2), 20, str3, str, 13114)), null, null, 3).U(new jo3(new lf40(parseInt2, str, str4), 25));
            }
            return qVar == null ? super.D(str, str2, z) : qVar;
        }
        if (!brm0.B(str, "synthetic_clips_audio_playlist", false)) {
            return super.D(str, str2, z);
        }
        if (str2 != null) {
            bpn0 bpn0Var = cqm0.a;
            try {
                r2 = Integer.parseInt(str2);
            } catch (Throwable unused) {
            }
            if (r2 > 0) {
                return super.D(str, str2, z);
            }
        }
        Serializer.c<UIBlockMusicPlaylist> cVar2 = UIBlockMusicPlaylist.CREATOR;
        hl10 e3 = new Regex("synthetic_clips_audio_playlist_blockId=(.+)_title=(.+)_url=(.+)").e(str);
        if (e3 != null) {
            String str5 = (String) ((hl10.a) e3.b()).get(1);
            qVar = ktr.c(rsg0.T(yfb.x(wga.e(new xga(), str5, (String) ((hl10.a) e3.b()).get(3), userId, 16))).U(new q9(new xkb(str5, (String) ((hl10.a) e3.b()).get(2), i2), i)));
        }
        return qVar == null ? super.D(str, str2, z) : qVar;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final RecyclerView.n F(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return e.$EnumSwitchMapping$2[catalogConfiguration$Companion$ContainerType.ordinal()] == 1 ? new d(this.D.a) : super.F(catalogConfiguration$Companion$ContainerType, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final jda K(u4a u4aVar) {
        return new of40((fz8) super.K(u4aVar));
    }

    @Override // xsna.p850, com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        try {
            return B0(catalogDataType, catalogViewType, uIBlock, u4aVar, new kf40(this, catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar));
        } catch (Exception unused) {
            return new EmptyVh(false);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        return rsg0.y0(yfb.x(A0(userId)), null, null, 3).U(new d22(new f(1, new e3a(), e3a.class, "mapToCatalog", "mapToCatalog(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 27));
    }
}
