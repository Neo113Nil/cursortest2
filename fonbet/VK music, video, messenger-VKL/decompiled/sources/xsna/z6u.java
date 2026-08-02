package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.video.dto.VideoGetMusicMixResponseDto;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.core.view.components.p003switch.VkSwitchItem;
import com.vk.dto.notifications.settings.NotificationSettingsCategory;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.im.ui.components.msg_search.domain.model.a;
import com.vk.instantjobs.InstantJob;
import com.vk.medianative.MediaImageEncoder;
import com.vk.newsfeed.impl.fragments.video.tree.VideoCommentsTreeInPlayerFragment;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsRepository;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import java.io.File;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import me.grishka.appkit.fragments.LoaderFragment;
import xsna.j7u;
import xsna.m5k0;
import xsna.tj50;
import xsna.yzx;
import xsna.z8r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class z6u implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ z6u(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List u0;
        switch (this.b) {
            case 0:
                return j7u.b.a;
            case 1:
                GroupCallViewModel.b.getClass();
                GroupCallViewModel.q((List) obj);
                return s3q0.a;
            case 2:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).j.h);
            case 3:
                return s3q0.a;
            case 4:
                return new yzx.a(((tj50.a) obj).a(rzx.b, ao8.d));
            case 5:
                int i = LoaderFragment.k0;
                ((yvv) obj).d();
                throw null;
            case 6:
                return ((a.d) obj).a.a;
            case 7:
                hda hdaVar = (hda) obj;
                Object obj2 = hdaVar.a;
                CatalogCatalog catalogCatalog = obj2 instanceof CatalogCatalog ? (CatalogCatalog) obj2 : null;
                if (catalogCatalog == null) {
                    return hdaVar;
                }
                return new hda(CatalogCatalog.zb(catalogCatalog, null, mf40.G + catalogCatalog.c, 125), hdaVar.b, null);
            case 8:
                return (List) obj;
            case 9:
                NotificationSettingsCategory[] notificationSettingsCategoryArr = ((dk70) obj).c;
                return (notificationSettingsCategoryArr == null || (u0 = rl3.u0(notificationSettingsCategoryArr)) == null) ? EmptyList.b : u0;
            case 10:
                return ((ef00) obj).c;
            case 11:
                return fpf0.a(((gna0) obj).getClass());
            case 12:
                return s3q0.a;
            case 13:
                return s3q0.a;
            case 14:
                final Bitmap bitmap = (Bitmap) obj;
                return new io.reactivex.rxjava3.internal.operators.maybe.d(new io.reactivex.rxjava3.functions.n() { // from class: xsna.zyd0
                    @Override // io.reactivex.rxjava3.functions.n
                    public final Object get() {
                        File s = com.vk.core.files.a.s();
                        return !MediaImageEncoder.INSTANCE.encodeJpegWithoutCompression(bitmap, s) ? io.reactivex.rxjava3.internal.operators.maybe.i.b : io.reactivex.rxjava3.core.k.i(s);
                    }
                });
            case 15:
                return (Boolean) obj;
            case 16:
                return s3q0.a;
            case 17:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM recents_stickers");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 18:
                return ((RecyclerView.e0) obj).itemView;
            case 19:
                return Boolean.valueOf(((InstantJob) obj) instanceof zhb);
            case 20:
                return SmartCropState.a((SmartCropState) obj, null, null, null, null, 0L, false, null, false, false, m5k0.c.a, 895);
            case 21:
                return StickerStockItem.Ab((StickerStockItem) obj, false, 0, null, null, -536870913, 8191);
            case 22:
                qgi0.r((tgi0) obj, "storefront_top_bar_search");
                return s3q0.a;
            case 23:
                qgi0.r((tgi0) obj, "title_toolbar");
                return s3q0.a;
            case 24:
                VkSwitchItem vkSwitchItem = new VkSwitchItem((Context) obj, null, 6);
                vkSwitchItem.setAlignSwitchToEnd(true);
                return vkSwitchItem;
            case 25:
                ((com.vk.newsfeed.common.requests.a) obj).M = Boolean.TRUE;
                return s3q0.a;
            case 26:
                io.reactivex.rxjava3.subjects.d dVar = z8r0.a;
                z8r0.a(new z8r0.a.C4167a());
                return s3q0.a;
            case 27:
                String[] strArr = VideoCommentsTreeInPlayerFragment.c0;
                return s3q0.a;
            case 28:
                return Collections.singletonList((hfz) obj);
            default:
                VideoGetMusicMixResponseDto videoGetMusicMixResponseDto = (VideoGetMusicMixResponseDto) obj;
                ddt0.a.getClass();
                return new VideoDiscoveryRecommendationsRepository.a(new c3t(com.vk.dto.video.a.a(ums0.e(ums0.a, videoGetMusicMixResponseDto.g(), videoGetMusicMixResponseDto.f(), videoGetMusicMixResponseDto.d(), false, 52)), videoGetMusicMixResponseDto.g().size()), videoGetMusicMixResponseDto.e(), 6);
        }
    }
}
