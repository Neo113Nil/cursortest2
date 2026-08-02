package xsna;

import androidx.preference.Preference;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.video.dto.VideoGetAlbumsResponseDto;
import com.vk.api.generated.video.dto.VideoGetFromAlbumResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.log.L;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsRepository;
import com.vkontakte.android.fragments.videos.VideosFragment;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zil0 implements b03, f03, Preference.c, io.reactivex.rxjava3.functions.c, PurchasesUpdatedListener {
    public final /* synthetic */ int b;

    public /* synthetic */ zil0(int i) {
        this.b = i;
    }

    public static String a(int i, String str, String str2, String str3) {
        return str + str2 + str3 + i;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 3:
                return (VideoDiscoveryRecommendationsRepository.a) obj;
            default:
                int i = VideosFragment.z0;
                VideosFragment.f fVar = new VideosFragment.f();
                fVar.a = ((VideoGetAlbumsResponseDto) obj).getCount();
                fVar.b = ((VideoGetFromAlbumResponseDto) obj2).getCount();
                return fVar;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 4:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        L.a();
        return true;
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        com.my.tracker.obfuscated.m0.a(billingResult, list);
    }
}
