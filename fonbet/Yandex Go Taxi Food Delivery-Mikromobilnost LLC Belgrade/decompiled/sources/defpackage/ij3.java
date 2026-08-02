package defpackage;

import coil.c;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.logger.a;
import ru.yandex.taxi.network.api.models.GoApiOtherException;

/* loaded from: classes.dex */
public final class ij3 extends d7 implements mse {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij3(c cVar) {
        super(lse.a);
        this.a = 10;
    }

    private final void B(fse fseVar, Throwable th) {
    }

    private final void G(fse fseVar, Throwable th) {
    }

    private final void o(fse fseVar, Throwable th) {
    }

    @Override // defpackage.mse
    public final void handleException(fse fseVar, Throwable th) {
        switch (this.a) {
            case 0:
                jgz jgzVar = jgz.a;
                jgz.d(th, "DeliveryAuthManager exception. Job in scope was cancelled", new Object[0]);
                break;
            case 1:
                xby.d.k(th, "Unexpected exception during story media files loading");
                break;
            case 2:
                jst.e.j(th);
                break;
            case 3:
                break;
            case 4:
                jst.e.k(th, "Async cache save failed: AsyncDiskMemoryCaching.save");
                break;
            case 5:
                jst.e.g("LBS_ERROR_TOKEN_V1", "lbsLoggerTag", "LBS_ERROR_TOKEN_V1:DEFAULT_CEH", th instanceof GoApiOtherException ? ((GoApiOtherException) th).getOriginal() : th);
                break;
            case 6:
                jst.e.g("LOCATION_POLLING_ERROR_TOKEN_V2", "locationPollingLoggerTag", "LOCATION_POLLING_ERROR_TOKEN_V2:DEFAULT_CEH", th instanceof GoApiOtherException ? ((GoApiOtherException) th).getOriginal() : th);
                break;
            case 7:
                jst.e.g("LOCATION_PROVIDER_ERROR_TOKEN_V2", "locationProviderLoggerTag", "LOCATION_PROVIDER_ERROR_TOKEN_V2:DEFAULT_CEH", th instanceof GoApiOtherException ? ((GoApiOtherException) th).getOriginal() : th);
                break;
            case 8:
                xby.l(jst.e, "MainScreenFlexSdkPresenter", null, th, "MainScreenFlexSdkPresenter failed load document in " + fseVar, 2);
                break;
            case 9:
                jst.e.h("PendingOrdersFetching", "Pending orders fetching produced error", th);
                break;
            case 10:
            case 11:
                break;
            case 12:
                jst.e.i("OpenExternalWebViewUrl.Error", th);
                break;
            case 13:
                com.yandex.passport.common.logger.c cVar = a.a;
                if (a.a.isEnabled()) {
                    a.b(LogLevel.ERROR, null, "ForegroundDetector in passport process failed", th);
                    break;
                }
                break;
            case 14:
                com.yandex.passport.common.logger.c cVar2 = a.a;
                if (a.a.isEnabled()) {
                    a.b(LogLevel.ERROR, null, "ForegroundDetector in passport process failed", th);
                    break;
                }
                break;
            default:
                com.yandex.passport.common.logger.c cVar3 = a.a;
                if (a.a.isEnabled()) {
                    a.b(LogLevel.ERROR, null, "Error in push registration", th);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ij3(ese eseVar, int i) {
        super(eseVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij3(q7y q7yVar) {
        super(lse.a);
        this.a = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij3(g9z g9zVar) {
        super(lse.a);
        this.a = 6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij3(ccz cczVar) {
        super(lse.a);
        this.a = 7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij3(com.yandex.go.flex.common.a aVar) {
        super(lse.a);
        this.a = 4;
    }
}
