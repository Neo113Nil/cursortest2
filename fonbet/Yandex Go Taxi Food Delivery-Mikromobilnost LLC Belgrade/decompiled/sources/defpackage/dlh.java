package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.media3.common.a;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class dlh implements o2v0 {
    @Override // defpackage.o2v0
    public final int a(a aVar) {
        String str = aVar.n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        ny61.g(g8e.o("Unsupported MIME type: ", str));
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.o2v0
    public final q2v0 e(a aVar) {
        char c;
        String str = aVar.n;
        List list = aVar.q;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    j4n j4nVar = new j4n();
                    ef90 ef90Var = new ef90((byte[]) list.get(0));
                    int E = ef90Var.E();
                    int E2 = ef90Var.E();
                    Paint paint = new Paint();
                    j4nVar.a = paint;
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                    paint.setPathEffect(null);
                    Paint paint2 = new Paint();
                    j4nVar.b = paint2;
                    paint2.setStyle(Paint.Style.FILL);
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                    paint2.setPathEffect(null);
                    j4nVar.c = new Canvas();
                    j4nVar.x = new c4n(sk51.DEFAULT_MAX_HEIGHT_TO_DISCARD, 575, 0, sk51.DEFAULT_MAX_HEIGHT_TO_DISCARD, 0, 575);
                    j4nVar.y = new b4n(new int[]{0, -1, ModalContentViewContainer.BASE_SHADOW_COLOR, -8421505}, j4n.v(), j4n.w(), 0);
                    j4nVar.z = new i4n(E, E2, 0);
                    return j4nVar;
                case 1:
                    return new beb0();
                case 2:
                    return new zb30();
                case 3:
                    return new pw41();
                case 4:
                    return new kl11(list);
                case 5:
                    return new wxt0(list);
                case 6:
                    return new s421(list);
                case 7:
                    return new hzu0();
                case '\b':
                    return new oj11();
            }
        }
        ny61.g(g8e.o("Unsupported MIME type: ", str));
        return null;
    }

    @Override // defpackage.o2v0
    public final boolean supportsFormat(a aVar) {
        String str = aVar.n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }
}
