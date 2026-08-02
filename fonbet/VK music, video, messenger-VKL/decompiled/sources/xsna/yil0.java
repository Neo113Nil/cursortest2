package xsna;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_common.zzbk;
import com.google.android.gms.internal.mlkit_common.zzbo;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.store.dto.StoreGetProductsResponseDto;
import com.vk.api.generated.video.dto.VideoSaveResultDto;
import com.vk.internal.api.GsonHolder;
import java.io.InputStream;
import java.io.InputStreamReader;
import xsna.hjz0;
import xsna.hox;
import xsna.mzp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class yil0 implements f03, mzp0.b, yads.sk0, yads.wq {
    public final /* synthetic */ int b;

    public /* synthetic */ yil0(int i) {
        this.b = i;
    }

    public static zzbo b(int i) {
        zzbk zzbkVar = new zzbk();
        zzbkVar.zza(i);
        return zzbkVar.zzb();
    }

    public static void c(TextView textView, int i, Drawable drawable) {
        textView.setTextColor(e3m.f(i, textView.getContext()));
        textView.setBackground(drawable);
    }

    public static void d(hjz0.a aVar) {
        aVar.a(new hox.a());
    }

    @Override // xsna.mzp0.b
    public void a(mzp0.a aVar) {
        new dxo0(aVar.c, aVar.d, aVar.a, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, aVar.j).q();
    }

    @Override // yads.wq
    public yads.xq fromBundle(Bundle bundle) {
        return yads.um1.a(bundle);
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StoreGetProductsResponseDto.class).getType());
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 2:
            case 3:
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoSaveResultDto.class).getType());
        }
    }

    @Override // yads.sk0
    public void release() {
        yads.sk0.lambda$static$0();
    }
}
