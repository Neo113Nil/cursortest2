package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.podcast.dto.PodcastEpisodeListDto;
import com.vk.api.generated.podcasts.dto.PodcastsGetGroupInfoResponseDto;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.ktt;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kbi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ kbi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(352403805, intValue, -1, "com.vk.music.playlist.display.audiobook.presentation.ComposableSingletons$AudiobookListContentKt.lambda$352403805.<anonymous> (AudiobookListContent.kt:88)");
                    }
                    if (a690.d(q630.a.a, tab0.d, aVar, 6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2102734347, intValue2, -1, "com.vk.music.playlist.framework.presentation.catalog.ComposableSingletons$HorizontalSliderKt.lambda$-2102734347.<anonymous> (HorizontalSlider.kt:32)");
                    }
                    f9t.e(txj0.v(q630.a.a, 10), aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-711902633, intValue3, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.screen.ComposableSingletons$SettingsScreenKt.lambda$-711902633.<anonymous> (SettingsScreen.kt:131)");
                    }
                    n3j0.b(48, 0, aVar3, d370.N(R.string.setting_title_quality, 0, aVar3), s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).b);
                return s3q0.a;
            case 4:
                rdi.i((SQLiteStatement) obj, ((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).u);
                return s3q0.a;
            default:
                return new ktt.a((AudioAudioDto) obj, (PodcastEpisodeListDto) obj2, ((PodcastsGetGroupInfoResponseDto) obj3).o(), 4);
        }
    }
}
