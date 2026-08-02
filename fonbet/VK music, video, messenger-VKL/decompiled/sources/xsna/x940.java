package xsna;

import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.holders.MusicActionPlayAllButtonVh;
import com.vk.catalog2.feature.music.holders.MusicActionSaveAsPlaylistButtonVh;
import com.vk.dto.common.id.UserId;
import com.vk.internal.api.GsonHolder;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.CatalogFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.u4a;

/* compiled from: MusicAndroidAutoCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class x940 extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final String D;
    public final boolean E;
    public final xga F;
    public final e3a G;

    /* compiled from: MusicAndroidAutoCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_PLAY_AUDIO_FROM_BLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_SAVE_AS_PLAYLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_PLAY_SHUFFLED_AUDIO_FROM_BLOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: MusicAndroidAutoCatalogConfiguration.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<CatalogCatalogResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto) {
            ((e3a) this.receiver).getClass();
            return e3a.b(catalogCatalogResponseObjectDto);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x940(Bundle bundle) {
        super(r0, r1);
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        userId = userId == null ? UserId.d : userId;
        String string = bundle.getString("ref");
        String string2 = bundle.getString("key_url");
        boolean z = bundle.getBoolean("VKAndroidAutoCatalogMediaService.key_new_android_auto");
        this.D = string2;
        this.E = z;
        this.F = new xga();
        this.G = new e3a();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> D(String str, String str2, boolean z) {
        ArrayList arrayList;
        CatalogFeatures.Companion.getClass();
        List a2 = CatalogFeatures.a.a();
        if (a2 != null) {
            List list = a2;
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.vk.catalog2.common.ui.mvp.configuration.a.y0((b.d) it.next()));
            }
        } else {
            arrayList = null;
        }
        return rsg0.T(new r6a(new wba(), str, str2, z, null, null, null, arrayList, PsExtractor.VIDEO_STREAM_MASK));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final jda K(u4a u4aVar) {
        return this.E ? new fz8(new wfb0(rl3.y0(new kda[]{new y940(), new fd40()})), u4aVar.c.d) : super.K(u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final Bundle r() {
        Bundle r = super.r();
        r.putString("key_url", this.D);
        return r;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        u4a.a aVar = u4aVar.b;
        if (uIBlock instanceof UIBlockButtons) {
            UIBlockButtons uIBlockButtons = (UIBlockButtons) uIBlock;
            if (uIBlockButtons.d == CatalogViewType.BUTTONS_HORIZONTAL && uIBlockButtons.y.size() != 1) {
                if (a.$EnumSwitchMapping$1[catalogDataType.ordinal()] != 1) {
                    return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                }
                int i = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                return i != 1 ? i != 2 ? i != 3 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : new MusicActionPlayAllButtonVh(R.drawable.vk_icon_shuffle_outline_28, R.string.audio_shuffle_all, aVar.i) : new MusicActionSaveAsPlaylistButtonVh(R.drawable.vk_icon_add_outline_28, R.layout.catalog_action_horizontal_list_music) : new MusicActionPlayAllButtonVh(R.drawable.vk_icon_play_28, R.string.music_artist_listen_all_btn, aVar.i);
            }
        }
        return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        ArrayList arrayList;
        CatalogFeatures.Companion.getClass();
        List a2 = CatalogFeatures.a.a();
        if (a2 != null) {
            List list = a2;
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.vk.catalog2.common.ui.mvp.configuration.a.y0((b.d) it.next()));
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        Features.Type type = Features.Type.FEATURE_AUDIO_AUTOGEN_CATALOG;
        type.getClass();
        if (!com.vk.toggle.b.A.a(type)) {
            return rsg0.T(new v5a(new wba(), userId, str, this.D, arrayList2));
        }
        this.F.getClass();
        tfx tfxVar = new tfx("catalog.getAudioAuto", new pm0(8), new tf3(5));
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        tfxVar.j("need_blocks", true);
        String str2 = this.D;
        if (str2 != null) {
            tfx.o(tfxVar, "url", str2, 0, 0, 12);
        }
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (arrayList2 != null) {
            tfx.o(tfxVar, "applied_toggles", GsonHolder.a().toJson(arrayList2), 0, 0, 12);
        }
        return rsg0.T(yfb.x(tfxVar)).U(new p5w(new b(1, this.G, e3a.class, "mapToCatalog", "mapToCatalog(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 4));
    }
}
