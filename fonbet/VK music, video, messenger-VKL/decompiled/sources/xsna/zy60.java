package xsna;

import android.util.Pair;
import androidx.preference.Preference;
import com.google.android.gms.internal.cast.zzxp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.podcast.dto.PodcastEpisodeListDto;
import com.vk.api.generated.search.dto.SearchGetCoOwnersResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoSaveAnonLikeResponseDto;
import com.vk.api.generated.store.dto.StoreGetStickersKeywordsResponseDto;
import com.vk.api.generated.video.dto.VideoGetVideoMusicDiscoverResponseDto;
import com.vk.api.generated.vkStart.dto.VkStartStatsListItemDto;
import com.vk.api.generated.wall.dto.WallDeleteThreadResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import xsna.k840;
import xsna.lgs0;
import xsna.mzp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zy60 implements b03, f03, Continuation, Preference.b, mzp0.d, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;

    public /* synthetic */ zy60(int i) {
        this.b = i;
    }

    public static int b(int i, int i2, int i3) {
        return zzxp.zzv(i) + i2 + i3;
    }

    public static String c(String str, String str2, boolean z, boolean z2) {
        return str + z + str2 + z2;
    }

    public static wh50 d(long j) {
        return androidx.compose.runtime.k.b(new l5g(j));
    }

    public static void f(String str, String str2, ArrayList arrayList) {
        arrayList.add(new Pair(str, str2));
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        int i = SettingsGeneralFragment.z0;
        k840.a.d().S(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // xsna.mzp0.d
    public void a(mzp0.c cVar) {
        irk0 irk0Var = cVar.a;
        UUID uuid = cVar.b;
        new m0i0(cVar.e, cVar.f, cVar.g, cVar.h, cVar.c, cVar.d, uuid, irk0Var).q();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 1:
                return (BaseUploadServerDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseUploadServerDto.class).getType())).a();
            case 2:
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 3:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PodcastEpisodeListDto.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, SearchGetCoOwnersResponseDto.class).getType());
            case 9:
                return (RootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoSaveAnonLikeResponseDto.class).getType());
            case 10:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 11:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StoreGetStickersKeywordsResponseDto.class).getType());
            case 16:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetVideoMusicDiscoverResponseDto.class).getType());
            case 17:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, VkStartStatsListItemDto.class).getType()).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, WallDeleteThreadResponseDto.class).getType());
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return Boolean.valueOf(obj instanceof lgs0.a).booleanValue();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z;
        if (task.isSuccessful()) {
            u5k u5kVar = (u5k) task.getResult();
            u5kVar.getClass();
            File c = u5kVar.c();
            if (c.delete()) {
                c.getPath();
            } else {
                c.getPath();
            }
            z = true;
        } else {
            task.getException();
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public /* synthetic */ zy60(tui0 tui0Var) {
        this.b = 7;
    }
}
