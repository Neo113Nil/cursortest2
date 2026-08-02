package xsna;

import android.content.Context;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetDownloadUrlQualityDto;
import com.vk.clips.download.api.ClipsDownloadLauncher$ClipsDownloadQuality;
import com.vk.dto.common.ClipVideoFile;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class lrd implements izs {
    public final /* synthetic */ izs b;
    public final /* synthetic */ ClipVideoFile c;
    public final /* synthetic */ ord d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ gzs f;

    public /* synthetic */ lrd(izs izsVar, ClipVideoFile clipVideoFile, ord ordVar, Context context, gzs gzsVar) {
        this.b = izsVar;
        this.c = clipVideoFile;
        this.d = ordVar;
        this.e = context;
        this.f = gzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = ((e520) obj).a;
        izs izsVar = this.b;
        if (izsVar != null) {
            izsVar.invoke(i != 0 ? i != 1 ? i != 2 ? ClipsDownloadLauncher$ClipsDownloadQuality.SD : ClipsDownloadLauncher$ClipsDownloadQuality.SD : ClipsDownloadLauncher$ClipsDownloadQuality.HD : ClipsDownloadLauncher$ClipsDownloadQuality.FULLHD);
        }
        ClipVideoFile clipVideoFile = this.c;
        ord ordVar = this.d;
        Context context = this.e;
        gzs gzsVar = this.f;
        if (i == 0) {
            ord.c(context, ShortVideoGetDownloadUrlQualityDto.TYPE_1080P, clipVideoFile, ordVar, gzsVar);
        } else if (i == 1) {
            ord.c(context, ShortVideoGetDownloadUrlQualityDto.TYPE_720P, clipVideoFile, ordVar, gzsVar);
        } else if (i == 2) {
            ord.c(context, ShortVideoGetDownloadUrlQualityDto.TYPE_480P, clipVideoFile, ordVar, gzsVar);
        }
        return s3q0.a;
    }
}
