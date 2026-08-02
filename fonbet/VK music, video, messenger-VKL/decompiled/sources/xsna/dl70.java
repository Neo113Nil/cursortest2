package xsna;

import android.content.Context;
import android.view.View;
import com.vk.api.generated.audio.dto.AudioGetPlaylistsResponseDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.permission.PermissionHelper;
import com.vk.stickers.keyboard.page.StickersRecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class dl70 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ dl70(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Boolean bool = (Boolean) obj;
                int i = el70.g1;
                bool.booleanValue();
                break;
            case 1:
                ((View) obj).setPadding(0, 0, 0, 0);
                break;
            case 2:
                dsw<UserId, v390> dswVar = y390.a;
                dswVar.b = null;
                dswVar.a = null;
                break;
            case 3:
                break;
            case 4:
                PermissionHelper.a.getClass();
                break;
            case 5:
                break;
            case 6:
                qgi0.r((tgi0) obj, "error_description");
                break;
            case 7:
                qgi0.r((tgi0) obj, "remainingTime");
                break;
            case 8:
                Throwable th = (Throwable) obj;
                Context context = e43.a;
                cvk.w(j03.g(context != null ? context : null, th, R.string.error), false);
                break;
            case 9:
                break;
            case 10:
                L.i((Throwable) obj);
                cvk.u(R.string.common_network_error, false);
                break;
            case 11:
                qgi0.r((tgi0) obj, "PrivacySettingsSingleDonutLevelButtonChevron");
                break;
            case 12:
                qof0 qof0Var = (qof0) obj;
                break;
            case 13:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 0);
                qgi0.r(tgi0Var, "TEST_TAG_PRE_EXTRA_ACTION");
                break;
            case 14:
                break;
            case 15:
                dhw0 dhw0Var = (dhw0) ((it80) obj).a;
                if (dhw0Var == null || (r11 = dhw0Var.r) == null) {
                    break;
                }
                break;
            case 16:
                break;
            case 17:
                int i2 = StickersRecyclerView.w;
                break;
            case 18:
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                break;
            case 19:
                break;
            case 20:
                v9n0.d.onNext((Result) obj);
                break;
            case 21:
                break;
            case 22:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                break;
            case 23:
                AudioGetPlaylistsResponseDto audioGetPlaylistsResponseDto = (AudioGetPlaylistsResponseDto) obj;
                List<AudioPlaylistDto> e = audioGetPlaylistsResponseDto.e();
                ArrayList arrayList = new ArrayList(c5g.u(e, 10));
                for (AudioPlaylistDto audioPlaylistDto : e) {
                    jt4.a.getClass();
                    arrayList.add(jt4.a(audioPlaylistDto));
                }
                VKList vKList = new VKList(arrayList);
                vKList.n(audioGetPlaylistsResponseDto.f());
                break;
            case 24:
                break;
            case 25:
                VideoFileOld.a aVar = VideoFileOld.z1;
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            default:
                break;
        }
        return s3q0.a;
    }
}
