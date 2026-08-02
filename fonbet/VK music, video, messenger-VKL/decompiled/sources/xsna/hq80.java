package xsna;

import android.content.Context;
import com.vk.api.generated.video.dto.VideoGetVideoQualitiesDownloadInfoResponseDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.offline.settings.api.domain.objects.QualityOptionTypeDo;
import java.util.concurrent.TimeUnit;

/* compiled from: OpenChooserDownloadDelegate.kt */
/* loaded from: classes3.dex */
public final class hq80 implements m8o {
    public final Context b;
    public final VideoFile c;
    public final boolean d;
    public final QualityOptionTypeDo e;
    public final String f;
    public final izs<a, s3q0> g;
    public final gzs<s3q0> h;
    public io.reactivex.rxjava3.subjects.a<VideoGetVideoQualitiesDownloadInfoResponseDto> i;
    public io.reactivex.rxjava3.disposables.c j;
    public boolean k;

    /* compiled from: OpenChooserDownloadDelegate.kt */
    public static final class a {
        public final QualityOptionTypeDo a;
        public final whs0 b;
        public final QualityOptionTypeDo c;
        public final gzs<s3q0> d;

        public a(QualityOptionTypeDo qualityOptionTypeDo, whs0 whs0Var, QualityOptionTypeDo qualityOptionTypeDo2, gzs<s3q0> gzsVar) {
            this.a = qualityOptionTypeDo;
            this.b = whs0Var;
            this.c = qualityOptionTypeDo2;
            this.d = gzsVar;
        }
    }

    /* compiled from: OpenChooserDownloadDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QualityOptionTypeDo.values().length];
            try {
                iArr[QualityOptionTypeDo.ALWAYS_ASK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QualityOptionTypeDo.HIGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QualityOptionTypeDo.AVG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QualityOptionTypeDo.LOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[QualityOptionTypeDo.AUDIO_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hq80(Context context, VideoFile videoFile, boolean z, QualityOptionTypeDo qualityOptionTypeDo, String str, izs<? super a, s3q0> izsVar, gzs<s3q0> gzsVar) {
        this.b = context;
        this.c = videoFile;
        this.d = z;
        this.e = qualityOptionTypeDo;
        this.f = str;
        this.g = izsVar;
        this.h = gzsVar;
    }

    @Override // xsna.m8o
    public final void a(rr1 rr1Var, ygp0 ygp0Var) {
        if (this.k) {
            gzs<s3q0> gzsVar = this.h;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            this.k = false;
            return;
        }
        io.reactivex.rxjava3.subjects.a<VideoGetVideoQualitiesDownloadInfoResponseDto> aVar = this.i;
        if (aVar != null) {
            new io.reactivex.rxjava3.internal.operators.single.n(aVar.a0(io.reactivex.rxjava3.android.schedulers.a.b()).K(), new wx00(new yhu(this, 15), 7)).subscribe(new aug0(new yf1(this, rr1Var, ygp0Var, 6), new com.vk.libvideo.design.view.video.a(23, this, ygp0Var)));
        }
    }

    public final void b() {
        this.k = true;
        io.reactivex.rxjava3.disposables.c cVar = this.j;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public final void c() {
        io.reactivex.rxjava3.subjects.a<VideoGetVideoQualitiesDownloadInfoResponseDto> aVar = new io.reactivex.rxjava3.subjects.a<>();
        VideoFile videoFile = this.c;
        UserId I0 = videoFile.I0();
        int o0 = videoFile.o0();
        tfx tfxVar = new tfx("video.getVideoQualitiesDownloadInfo", new s7o0(1), new joi0(7));
        if (I0 != null) {
            tfx.n(tfxVar, "owner_id", I0, 0L, 0L, 12);
        }
        tfx.l(tfxVar, "video_id", o0, 1, 0, 8);
        rsg0.D0(yfb.x(tfxVar)).r(5000L, TimeUnit.MILLISECONDS).subscribe(new aug0(new o3w(aVar, 24), new j4x(aVar, 25)));
        this.i = aVar;
    }
}
