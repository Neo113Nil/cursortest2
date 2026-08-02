package defpackage;

import com.yandex.payment.divkit.bind.b;
import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes13.dex */
public final /* synthetic */ class px implements eg90 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ px(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.eg90
    public final void a(Exception exc) {
        StackTraceElement stackTraceElement;
        String str;
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((d5z0) obj).e(exc);
                break;
            case 1:
                rwo rwoVar = ((b) obj).c;
                sv90 sv90Var = qv90.a;
                String message = exc.getMessage();
                if (message == null) {
                    message = exc.toString();
                }
                sv90Var.getClass();
                ((y22) rwoVar).a(sv90.n(message));
                break;
            case 2:
                rwo rwoVar2 = ((psf) obj).c;
                sv90 sv90Var2 = qv90.a;
                String message2 = exc.getMessage();
                if (message2 == null) {
                    message2 = exc.toString();
                }
                sv90Var2.getClass();
                ((y22) rwoVar2).a(sv90.n(message2));
                break;
            case 3:
                ((aw5) obj).a.logError(exc);
                break;
            case 4:
                zjr zjrVar = ((r5o) obj).c;
                String type = ErrorTypes.DIVKIT_DIVDATA_DECODING_ERROR.getType();
                i3y a = xfz.a(new Pair("locator", "EquableDivPatchDataParser.parse"), new Pair("cause", exc), xfz.d(exc.getMessage(), DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION));
                s7s0 s7s0Var = zjrVar.c.a;
                boolean booleanValue = Boolean.FALSE.booleanValue();
                tjr tjrVar = tjr.d;
                if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName = stackTraceElement.getFileName();
                    if (fileName == null) {
                        fileName = "No file info";
                    }
                    String methodName = stackTraceElement.getMethodName();
                    int lineNumber = stackTraceElement.getLineNumber();
                    Integer valueOf = Integer.valueOf(lineNumber);
                    if (lineNumber <= 0) {
                        valueOf = null;
                    }
                    if (valueOf == null || (str = valueOf.toString()) == null) {
                        str = "No line info";
                    }
                    tjrVar = new tjr(fileName, methodName, str);
                }
                i3y a2 = xfz.a(new Pair("errorType", type));
                zjrVar.d(FlexLogLevel.ERROR, "DivData decoding error", xfz.c(a, a2), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
                break;
            case 5:
                rwo rwoVar3 = ((xmo) obj).c;
                sv90 sv90Var3 = qv90.a;
                String message3 = exc.getMessage();
                if (message3 == null) {
                    message3 = exc.toString();
                }
                sv90Var3.getClass();
                ((y22) rwoVar3).a(sv90.n(message3));
                break;
            default:
                rwo rwoVar4 = ((edy) obj).c;
                sv90 sv90Var4 = qv90.a;
                String message4 = exc.getMessage();
                if (message4 == null) {
                    message4 = exc.toString();
                }
                sv90Var4.getClass();
                ((y22) rwoVar4).a(sv90.n(message4));
                break;
        }
    }
}
