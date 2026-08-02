package xsna;

import android.content.Context;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetDownloadUrlQualityDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetDownloadUrlResponseDto;
import com.vk.clips.download.impl.quality.ClipDownloadQuality;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import xsna.frc;
import xsna.z6x;

/* compiled from: ClipsDownloadLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class ord {
    public dw20 a;

    /* compiled from: ClipsDownloadLauncherImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShortVideoGetDownloadUrlQualityDto.values().length];
            try {
                iArr[ShortVideoGetDownloadUrlQualityDto.TYPE_1080P.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShortVideoGetDownloadUrlQualityDto.TYPE_720P.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShortVideoGetDownloadUrlQualityDto.TYPE_480P.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final frc.a a(ClipVideoFile clipVideoFile, ShortVideoGetDownloadUrlResponseDto shortVideoGetDownloadUrlResponseDto, ShortVideoGetDownloadUrlQualityDto shortVideoGetDownloadUrlQualityDto) {
        ClipDownloadQuality clipDownloadQuality;
        String r1 = clipVideoFile.r1();
        String d = shortVideoGetDownloadUrlResponseDto.d();
        String str = clipVideoFile.l;
        int i = a.$EnumSwitchMapping$0[shortVideoGetDownloadUrlQualityDto.ordinal()];
        if (i == 1) {
            clipDownloadQuality = ClipDownloadQuality.QUALITY_1080p;
        } else if (i == 2) {
            clipDownloadQuality = ClipDownloadQuality.QUALITY_720p;
        } else if (i != 3) {
            clipDownloadQuality = ClipDownloadQuality.QUALITY_1080p;
            rdi.F(clipDownloadQuality);
        } else {
            clipDownloadQuality = ClipDownloadQuality.QUALITY_480p;
        }
        return new frc.a(r1, d, str, clipDownloadQuality, clipVideoFile.b.b, clipVideoFile.c, clipVideoFile.W);
    }

    public static final void b(ord ordVar, gzs<s3q0> gzsVar, frc.a aVar) {
        rgl rglVar = z6x.a.a;
        if (rglVar == null) {
            rglVar = null;
        }
        ((y6x) rglVar.c()).a(new frc(aVar, jrd.a));
        gzsVar.invoke();
    }

    public static final void c(Context context, ShortVideoGetDownloadUrlQualityDto shortVideoGetDownloadUrlQualityDto, ClipVideoFile clipVideoFile, ord ordVar, gzs gzsVar) {
        UserId userId = clipVideoFile.b;
        int i = clipVideoFile.c;
        tfx tfxVar = new tfx("shortVideo.getDownloadUrl", new joi0(1), new hq(27));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "video_id", i, 1, 0, 8);
        if (shortVideoGetDownloadUrlQualityDto != null) {
            tfx.o(tfxVar, "quality", shortVideoGetDownloadUrlQualityDto.i(), 0, 0, 12);
        }
        dz2 x = yfb.x(tfxVar);
        ahn.D(x);
        rsg0.y0(x, null, null, 3).subscribe(new f40(new mrd(context, shortVideoGetDownloadUrlQualityDto, clipVideoFile, ordVar, gzsVar), 10), new bw(new v5(context, 23), 13));
    }
}
