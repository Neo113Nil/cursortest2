package xsna;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.InvisibleSeparatorVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.feature.music.holders.CategoryLinkVh;
import com.vk.catalog2.feature.music.holders.audiobook.ComposeAudioBookSliderVh;
import com.vk.dto.common.id.UserId;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import xsna.u4a;

/* compiled from: AudioBookPersonCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class ci4 extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final int D;
    public final String E;
    public final xga F;
    public final e3a G;

    /* compiled from: AudioBookPersonCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SYNTHETIC_LEGAL_NOTICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_AUDIOBOOKS_PERSONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_AUDIOBOOKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CatalogConfiguration$Companion$ContainerType.values().length];
            try {
                iArr3[CatalogConfiguration$Companion$ContainerType.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ci4(Bundle bundle) {
        super(UserId.d, r0);
        String string = bundle.getString("ref");
        int i = bundle.getInt("person_id", 0);
        String string2 = bundle.getString("launch_origin", "unknown");
        this.D = i;
        this.E = string2;
        this.F = new xga();
        this.G = new e3a();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final RecyclerView.n F(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return a.$EnumSwitchMapping$2[catalogConfiguration$Companion$ContainerType.ordinal()] == 1 ? new yog0() : super.F(catalogConfiguration$Companion$ContainerType, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        u4a.a aVar = u4aVar.b;
        int i = a.$EnumSwitchMapping$1[catalogDataType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 3 ? new ComposeAudioBookSliderVh(aVar.f, j0(), false, true) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 2 ? new CategoryLinkVh(aVar.f, R.layout.catalog_vk_cell_item, null, 60) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 1 ? new InvisibleSeparatorVh() : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : new InvisibleSeparatorVh();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        String Lb = MusicPlaybackLaunchContext.Fb(str).Cb(this.E).Lb();
        this.F.getClass();
        tfx tfxVar = new tfx("catalog.getAudioBooksPerson", new wp(5), new cq(5));
        tfx.l(tfxVar, "person_id", this.D, 0, 0, 12);
        tfxVar.j("need_blocks", true);
        if (Lb != null) {
            tfx.o(tfxVar, "ref", Lb, 0, 0, 12);
        }
        return rsg0.T(yfb.x(tfxVar)).U(new l7(new sa(this, 6), 4));
    }
}
