package xsna;

import android.os.Bundle;
import androidx.preference.Preference;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioDeleteExtendedResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.multiaccount.dto.MultiaccountCheckRelatedUserPinCodeResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGenericResponseDto;
import com.vk.api.generated.places.dto.PlacesPlaceDto;
import com.vk.api.generated.polls.dto.PollsGetVotersCriteriaResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoCreateResponseDto;
import com.vk.api.generated.stickers.dto.StickersSearchStickersResponseDto;
import com.vk.api.generated.video.dto.VideoGetInteractiveVideoInfoResponseDto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.util.List;
import xsna.ky6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e630 implements io.reactivex.rxjava3.functions.l, f03, b03, Preference.b, yads.wq, yads.md0 {
    public final /* synthetic */ int b;

    public /* synthetic */ e630(int i) {
        this.b = i;
    }

    public static int b(int i, int i2, NewsEntry newsEntry) {
        return (newsEntry.hashCode() + i) * i2;
    }

    public static String c(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ boolean d(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (!Character.isWhitespace(codePointAt)) {
                return false;
            }
            i += Character.charCount(codePointAt);
        }
        return true;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        int i = SettingsGeneralFragment.z0;
        if (obj instanceof Boolean) {
            if (!com.vk.core.preference.Preference.j().contains("adaptive_feed_media_changed_by_user")) {
                ky6.a aVar = (ky6.a) com.vk.core.preference.Preference.j().edit();
                aVar.putBoolean("adaptive_feed_media_changed_by_user", true);
                aVar.a();
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            sr10 sr10Var = dy2.a;
            if (sr10Var != null) {
                sr10Var.j(booleanValue);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        return true;
    }

    @Override // yads.md0
    public Constructor a() {
        return yads.od0.a();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return ((AudioDeleteExtendedResponseDto) obj).d();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 3:
                return (NewsfeedGenericResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, NewsfeedGenericResponseDto.class).getType())).a();
            case 4:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, PlacesPlaceDto.class).getType()).getType())).a();
            case 5:
            case 7:
            default:
                return (StickersSearchStickersResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StickersSearchStickersResponseDto.class).getType())).a();
            case 6:
                return (PollsGetVotersCriteriaResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, PollsGetVotersCriteriaResponseDto.class).getType())).a();
            case 8:
                return (ShortVideoCreateResponseDto) ((com.vk.clips.sdk.api.generated.SingleRootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.clips.sdk.api.generated.SingleRootResponseDto.class, ShortVideoCreateResponseDto.class).getType())).a();
        }
    }

    @Override // yads.wq
    public yads.xq fromBundle(Bundle bundle) {
        switch (this.b) {
            case 14:
                return yads.e6.a(bundle);
            default:
                return yads.l83.a(bundle);
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MultiaccountCheckRelatedUserPinCodeResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioAudioDto.class).getType());
            case 10:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 12:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetInteractiveVideoInfoResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    public /* synthetic */ e630(n9w n9wVar) {
        this.b = 0;
    }
}
