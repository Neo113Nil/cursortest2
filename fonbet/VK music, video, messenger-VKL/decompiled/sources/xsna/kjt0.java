package xsna;

import android.util.Base64;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.video.bugreport.api.dto.VideoTechBugreportData;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: VideoTechBugreportEventBuilder.kt */
/* loaded from: classes5.dex */
public final class kjt0 extends l5m {
    public final VideoTechBugreportData h;
    public final String i;
    public final String j;
    public final Long k;

    /* compiled from: VideoTechBugreportEventBuilder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoTechBugreportData.VideoType.values().length];
            try {
                iArr[VideoTechBugreportData.VideoType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoTechBugreportData.VideoType.CLIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoTechBugreportData.VideoType.INTERACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kjt0(VideoTechBugreportData videoTechBugreportData, String str, String str2, Long l) {
        super(null, null, 3);
        this.h = videoTechBugreportData;
        this.i = str;
        this.j = str2;
        this.k = l;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        String str;
        int i;
        String str2;
        String h = DevNullEventKey.VIDEO_TECH_BUGREPORT.h();
        VideoTechBugreportData videoTechBugreportData = this.h;
        wsk0 wsk0Var = videoTechBugreportData.b;
        int i2 = wsk0Var.b;
        int i3 = (int) wsk0Var.c;
        boolean i4 = r6m.i();
        v0b0 v0b0Var = videoTechBugreportData.c;
        int i5 = (int) v0b0Var.b;
        int i6 = (int) v0b0Var.c;
        int i7 = (int) v0b0Var.a;
        int i8 = a.$EnumSwitchMapping$0[videoTechBugreportData.a.ordinal()];
        if (i8 == 1) {
            str = "video";
        } else if (i8 == 2) {
            str = "clip";
        } else {
            if (i8 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "interactive";
        }
        String str3 = videoTechBugreportData.b.a;
        String str4 = this.j;
        String D0 = str4 != null ? erm0.D0(256, str4) : null;
        String valueOf = String.valueOf(this.k);
        String str5 = videoTechBugreportData.b.d;
        String str6 = videoTechBugreportData.c.d;
        String valueOf2 = String.valueOf(videoTechBugreportData.d);
        String valueOf3 = String.valueOf(videoTechBugreportData.e);
        String decodersDebugInfo = videoTechBugreportData.f.toString();
        String lgqVar = videoTechBugreportData.g.toString();
        String str7 = this.i;
        if (str7 != null) {
            i = i3;
            str2 = new JSONObject().put("text", Base64.encodeToString(erm0.D0(1024, str7).getBytes(emb.b), 0)).toString();
        } else {
            i = i3;
            str2 = null;
        }
        this.g = new SchemeStat$TypeDevNullItem(h, str2, str, Integer.valueOf(i2), str3, Integer.valueOf(i), null, Integer.valueOf(i4 ? 1 : 0), D0, Integer.valueOf(i5), valueOf, Integer.valueOf(i6), str5, Integer.valueOf(i7), str6, null, valueOf2, null, valueOf3, null, decodersDebugInfo, null, lgqVar, null, null, null, null, null, null, null, null, null, null, null, -5603264, 3, null);
        return super.p();
    }
}
