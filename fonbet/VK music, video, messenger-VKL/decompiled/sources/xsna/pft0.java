package xsna;

import com.google.android.gms.internal.mlkit_vision_barcode.zzdg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdk;
import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.video.dto.VideoGetVideoForEditResponseDto;
import com.vk.api.generated.wall.dto.WallGetByIdResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import ru.mail.libverify.utils.Optional;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class pft0 implements f03, b03, io.reactivex.rxjava3.functions.l, Optional.Action, yads.yr {
    public final /* synthetic */ int b;

    public /* synthetic */ pft0(int i) {
        this.b = i;
    }

    public static zzdk a(int i) {
        zzdg zzdgVar = new zzdg();
        zzdgVar.zza(i);
        return zzdgVar.zzb();
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        ((Runnable) obj).run();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (Map) obj;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        return (BaseUploadServerDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseUploadServerDto.class).getType())).a();
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetVideoForEditResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, WallGetByIdResponseDto.class).getType());
        }
    }
}
