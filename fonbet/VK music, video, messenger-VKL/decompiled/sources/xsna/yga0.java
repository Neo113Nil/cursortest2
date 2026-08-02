package xsna;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.caverock.androidsvg.c;
import com.ironsource.sdk.utils.Logger;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetV5113ResponseDto;
import com.vk.api.generated.video.dto.VideoGetThumbUploadUrlResponseDto;
import com.vk.api.generated.video.dto.VideoLiveHeartbeatResponseDto;
import com.vk.core.preference.Preference;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.xml.sax.Attributes;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class yga0 implements f03, io.reactivex.rxjava3.functions.l, b03, io.reactivex.rxjava3.core.s, yads.wq {
    public final /* synthetic */ int b;

    public /* synthetic */ yga0(int i) {
        this.b = i;
    }

    public static int a(Attributes attributes, int i) {
        return c.g.a(attributes.getLocalName(i)).ordinal();
    }

    public static int b(nmo0 nmo0Var, int i, int i2) {
        return (nmo0Var.hashCode() + i) * i2;
    }

    public static void c(String str, String str2, String str3, String str4) {
        Logger.i(str4, str + str2 + str3);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (pk50) obj;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 5:
                return (StoriesGetV5113ResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StoriesGetV5113ResponseDto.class).getType())).a();
            case 6:
            default:
                return (VideoGetThumbUploadUrlResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetThumbUploadUrlResponseDto.class).getType())).a();
            case 7:
                return (VideoLiveHeartbeatResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoLiveHeartbeatResponseDto.class).getType())).a();
        }
    }

    @Override // yads.wq
    public yads.xq fromBundle(Bundle bundle) {
        return yads.gn1.a(bundle);
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences$OnSharedPreferenceChangeListener, xsna.lyo0] */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final io.reactivex.rxjava3.core.r rVar) {
        final SharedPreferences f = Preference.f("THEME_TIMETABLE");
        final ?? r1 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: xsna.lyo0
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                io.reactivex.rxjava3.core.r.this.onNext(s3q0.a);
            }
        };
        f.registerOnSharedPreferenceChangeListener(r1);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.myo0
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                f.unregisterOnSharedPreferenceChangeListener(r1);
            }
        });
    }

    public /* synthetic */ yga0(com.vk.movika.sdk.base.observable.u uVar) {
        this.b = 1;
    }
}
