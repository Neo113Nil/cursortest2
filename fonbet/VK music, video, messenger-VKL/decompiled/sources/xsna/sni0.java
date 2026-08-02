package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.serverEffects.dto.ServerEffectsCutVideoResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.api.generated.stories.dto.StoriesGetSubscriptionsExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoGetForPlayResponseDto;
import com.vk.dto.music.MusicTracksPage;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.cert.X509Certificate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class sni0 implements b03, io.reactivex.rxjava3.functions.l, f03, io.reactivex.rxjava3.functions.m, ahz0 {
    public final /* synthetic */ int b;

    public /* synthetic */ sni0(int i) {
        this.b = i;
    }

    public static String a(String str, String str2, String str3, boolean z, boolean z2) {
        return str + z + str2 + z2 + str3;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return ((s99) obj).d;
            case 5:
                return ((MusicTracksPage) obj).b;
            default:
                return Boolean.FALSE;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (ServerEffectsCutVideoResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ServerEffectsCutVideoResponseDto.class).getType())).a();
            case 1:
            default:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 2:
                return (ShortVideoPlaylistFullDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ShortVideoPlaylistFullDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 3:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Object.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StoriesGetSubscriptionsExtendedResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetForPlayResponseDto.class).getType());
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return bool.booleanValue();
    }

    @Override // xsna.ahz0
    public boolean verify(String str, X509Certificate x509Certificate) {
        return true;
    }

    public /* synthetic */ sni0(izs izsVar, int i) {
        this.b = i;
    }
}
