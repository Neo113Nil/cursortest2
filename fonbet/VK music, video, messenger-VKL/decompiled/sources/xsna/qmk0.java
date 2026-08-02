package xsna;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.stickers.dto.StickersSearchStickersResponseDto;
import com.vk.api.generated.store.dto.StoreGetStickersBonusRewardTermsResponseDto;
import com.vk.api.generated.video.dto.VideoPublishResponseDto;
import com.vk.api.generated.wall.dto.WallGetCommentsExtendedResponseDto;
import com.vk.catalog2.common.ui.holders.search.SportsMatchesCurrentVh;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vkontakte.android.R;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.util.List;
import xsna.eda;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class qmk0 implements c.b, f03, b03, eda.a, yads.md0 {
    public final /* synthetic */ int b;

    public /* synthetic */ qmk0(int i) {
        this.b = i;
    }

    @Override // yads.md0
    public Constructor a() {
        return yads.od0.b();
    }

    @Override // xsna.eda.a
    public io.reactivex.rxjava3.core.q b(wba wbaVar, List list, String str) {
        return rsg0.y0(new bda(wbaVar, list, str, null, 24), null, null, 3);
    }

    @Override // com.google.android.material.tabs.c.b
    public void c(TabLayout.g gVar, int i) {
        int i2 = SportsMatchesCurrentVh.h;
        gVar.h.setBackgroundResource(R.drawable.catalog_dots_tab_selector);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (StoreGetStickersBonusRewardTermsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StoreGetStickersBonusRewardTermsResponseDto.class).getType())).a();
            case 3:
                return (BaseOkResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 4:
                return (VideoPublishResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoPublishResponseDto.class).getType())).a();
            default:
                return (WallGetCommentsExtendedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, WallGetCommentsExtendedResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StickersSearchStickersResponseDto.class).getType());
    }
}
