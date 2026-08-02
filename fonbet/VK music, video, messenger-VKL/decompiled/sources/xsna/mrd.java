package xsna;

import android.content.Context;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetDownloadUrlQualityDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetDownloadUrlResponseDto;
import com.vk.dto.common.ClipVideoFile;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class mrd implements izs {
    public final /* synthetic */ ord b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ShortVideoGetDownloadUrlQualityDto d;
    public final /* synthetic */ ClipVideoFile e;
    public final /* synthetic */ gzs f;

    public /* synthetic */ mrd(Context context, ShortVideoGetDownloadUrlQualityDto shortVideoGetDownloadUrlQualityDto, ClipVideoFile clipVideoFile, ord ordVar, gzs gzsVar) {
        this.b = ordVar;
        this.c = context;
        this.d = shortVideoGetDownloadUrlQualityDto;
        this.e = clipVideoFile;
        this.f = gzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ShortVideoGetDownloadUrlResponseDto shortVideoGetDownloadUrlResponseDto = (ShortVideoGetDownloadUrlResponseDto) obj;
        boolean e = shortVideoGetDownloadUrlResponseDto.e();
        ord ordVar = this.b;
        ShortVideoGetDownloadUrlQualityDto shortVideoGetDownloadUrlQualityDto = this.d;
        ClipVideoFile clipVideoFile = this.e;
        gzs gzsVar = this.f;
        if (e) {
            nrd nrdVar = new nrd(shortVideoGetDownloadUrlResponseDto, shortVideoGetDownloadUrlQualityDto, clipVideoFile, ordVar, gzsVar, 0);
            h7u0.a aVar = new h7u0.a(bwt0.u(this.c));
            aVar.g0(R.string.clip_save_without_audio_title);
            aVar.U(R.string.clip_save_without_audio);
            aVar.c0(R.string.clip_save_download_on_device, new epd(nrdVar, 1));
            aVar.W(R.string.cancel, new ss8(1));
            aVar.m();
        } else {
            ord.b(ordVar, gzsVar, ord.a(clipVideoFile, shortVideoGetDownloadUrlResponseDto, shortVideoGetDownloadUrlQualityDto));
        }
        return s3q0.a;
    }
}
