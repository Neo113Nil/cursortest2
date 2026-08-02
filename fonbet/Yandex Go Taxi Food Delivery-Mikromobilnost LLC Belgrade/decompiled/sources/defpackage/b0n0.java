package defpackage;

import android.content.Context;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogAnalyticsState;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogPresentation$BackDialogButtonListenerType;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogPresentation$OkDialogButtonListenerType;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogPresentation$RetryDialogButtonListenerType;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;
import ru.yandex.taxi.scooters.domain.model.ScootersAuthorizationException;
import ru.yandex.taxi.scooters.domain.model.ScootersBleAttemptFailedException;
import ru.yandex.taxi.scooters.domain.model.ScootersCarControlFailedException;
import ru.yandex.taxi.scooters.domain.model.ScootersDebtPayOffException;
import ru.yandex.taxi.scooters.domain.model.ScootersEvolvingFailedException;
import ru.yandex.taxi.scooters.domain.model.ScootersPhotoShootingException;
import ru.yandex.taxi.scooters.domain.model.ScootersPhotosLimitException;

/* loaded from: classes13.dex */
public final class b0n0 implements sjn0 {
    public final /* synthetic */ int a;
    public final Context b;

    public /* synthetic */ b0n0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    public static bkn0 b(Context context) {
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState = ScootersErrorDialogAnalyticsState.RIDE_COMMON_ERROR;
        String string = context.getString(kyh0.scooters_data_load_failed);
        String string2 = context.getString(kyh0.scooters_general_error_subtitle);
        return new bkn0(scootersErrorDialogAnalyticsState, new gkn0(string), null, new gkn0(string2), new ckn0(f1h0.ic_dialog_error), null, null, null, new m2v(new gkn0(context.getString(kyh0.scooters_open_support)), null, null, ScootersErrorDialogPresentation$RetryDialogButtonListenerType.OPEN_SUPPORT), 980);
    }

    @Override // defpackage.sjn0
    public final jkn0 a(Throwable th) {
        jkn0 fkn0Var;
        fkn0 fkn0Var2;
        jkn0 bkn0Var;
        jkn0 fkn0Var3;
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                if (th instanceof ScootersDebtPayOffException) {
                    fkn0Var = new bkn0(ScootersErrorDialogAnalyticsState.DEBT_PAYOFF, new gkn0(context.getString(kyh0.scooters_debt_payoff_error_title)), null, new gkn0(context.getString(kyh0.scooters_debt_payoff_error_subtitle)), new ckn0(f1h0.ic_dialog_error), null, null, null, null, 2004);
                } else {
                    if (!(th instanceof ScootersAuthorizationException)) {
                        return null;
                    }
                    fkn0Var = new fkn0(ScootersErrorDialogAnalyticsState.AUTH_ERROR, new gkn0(context.getString(kyh0.scooters_data_load_failed)), null, new gkn0(context.getString(kyh0.scooters_general_error_subtitle)), null, null, null, new m2v(new gkn0(context.getString(kyh0.common_retry)), null, null, ScootersErrorDialogPresentation$OkDialogButtonListenerType.DEFAULT), 500);
                }
                return fkn0Var;
            default:
                if (th instanceof ScootersBleAttemptFailedException) {
                    ScootersBleAttemptFailedException scootersBleAttemptFailedException = (ScootersBleAttemptFailedException) th;
                    fkn0Var3 = new fkn0(ScootersErrorDialogAnalyticsState.BLE_ATTEMPT_FAILURE, new gkn0(scootersBleAttemptFailedException.getTitle()), null, new gkn0(scootersBleAttemptFailedException.getSubtitle()), null, null, null, new m2v(new gkn0(context.getString(kyh0.scooters_ble_attempt_failure_button)), null, null, ScootersErrorDialogPresentation$OkDialogButtonListenerType.DEFAULT), 500);
                } else if (th instanceof ScootersPhotosLimitException) {
                    fkn0Var3 = new fkn0(ScootersErrorDialogAnalyticsState.DAMAGE_PHOTOS_LIMIT_REACHED, new gkn0(context.getString(kyh0.scooters_error_photo_limit_title)), null, new gkn0(context.getString(kyh0.scooters_error_photo_limit_subtitle)), null, null, null, null, 1012);
                } else if (th instanceof ScootersPhotoShootingException) {
                    fkn0Var3 = new fkn0(ScootersErrorDialogAnalyticsState.PHOTO_SHOOTING, new gkn0(context.getString(kyh0.scooters_error_while_taking_picture)), null, new gkn0(context.getString(kyh0.scooters_try_again)), null, null, null, null, 1012);
                } else if (th instanceof ScootersCarControlFailedException) {
                    fkn0Var3 = new bkn0(ScootersErrorDialogAnalyticsState.RIDE_COMMON_ERROR, new gkn0(context.getString(kyh0.scooters_data_load_failed)), null, new gkn0(context.getString(kyh0.scooters_general_error_subtitle)), new ckn0(f1h0.ic_dialog_error), null, null, null, new m2v(new gkn0(context.getString(kyh0.scooters_open_support)), null, null, ScootersErrorDialogPresentation$RetryDialogButtonListenerType.OPEN_SUPPORT), 980);
                } else {
                    if (!(th instanceof ScootersEvolvingFailedException)) {
                        return null;
                    }
                    ScootersEvolvingFailedException scootersEvolvingFailedException = (ScootersEvolvingFailedException) th;
                    ScootersErrorCode errorCode = scootersEvolvingFailedException.getErrorCode();
                    switch (errorCode == null ? -1 : c5o0.a[errorCode.ordinal()]) {
                        case 1:
                            if (scootersEvolvingFailedException.getRiskyParkingMessage() != null) {
                                bkn0Var = new bkn0(ScootersErrorDialogAnalyticsState.FORBIDDEN_PARKING, new gkn0(scootersEvolvingFailedException.getRiskyParkingMessage().a), null, new gkn0(scootersEvolvingFailedException.getRiskyParkingMessage().b), null, new ckn0(s3h0.ic_exclamation_mark_fill), null, r100.C(new gkn0(context.getString(kyh0.common_no)), ScootersErrorDialogPresentation$BackDialogButtonListenerType.RISKY_PARKING_CANCEL, 6), r100.E(new gkn0(context.getString(kyh0.common_yes)), ScootersErrorDialogPresentation$RetryDialogButtonListenerType.RISKY_PARKING, 6), 404);
                            } else {
                                if (!jl40.l(scootersEvolvingFailedException.getIsNearestParkingNavigationEnabled(), Boolean.TRUE)) {
                                    fkn0Var2 = new fkn0(ScootersErrorDialogAnalyticsState.FORBIDDEN_PARKING, new gkn0(context.getString(kyh0.scooters_impossible_to_park_title)), null, new gkn0(context.getString(kyh0.scooters_impossible_to_park_subtitle)), null, null, null, new m2v(new gkn0(context.getString(kyh0.scooters_impossible_to_park_button)), null, null, ScootersErrorDialogPresentation$OkDialogButtonListenerType.DEFAULT), 500);
                                    return fkn0Var2;
                                }
                                bkn0Var = new bkn0(ScootersErrorDialogAnalyticsState.FORBIDDEN_PARKING, new gkn0(context.getString(kyh0.scooters_impossible_to_park_title)), null, new gkn0(context.getString(kyh0.scooters_impossible_to_park_subtitle)), new ckn0(f1h0.ic_dialog_error), null, null, r100.C(new gkn0(context.getString(kyh0.scooters_impossible_to_park_button)), null, 14), r100.E(new gkn0(context.getString(kyh0.scooters_impossible_to_park_nearest_parking_button)), ScootersErrorDialogPresentation$RetryDialogButtonListenerType.FIND_NEAREST_PARKING, 6), 468);
                            }
                            return bkn0Var;
                        case 2:
                            fkn0Var2 = new fkn0(ScootersErrorDialogAnalyticsState.DEPOSIT_FAILED, new gkn0(context.getString(kyh0.scooters_deposit_failed_title)), null, new gkn0(context.getString(kyh0.scooters_deposit_failed_subtitle)), null, null, null, new m2v(new gkn0(context.getString(kyh0.scooters_deposit_failed_button)), null, null, ScootersErrorDialogPresentation$OkDialogButtonListenerType.DEFAULT), 500);
                            return fkn0Var2;
                        case 3:
                            bkn0Var = new fkn0(ScootersErrorDialogAnalyticsState.BIKE_WHEEL_IS_NOT_LOCKED, new gkn0(context.getString(kyh0.scooters_wheel_not_locked_title)), null, new gkn0(context.getString(kyh0.scooters_wheel_not_locked_subtitle)), null, null, null, new m2v(new gkn0(context.getString(kyh0.scooters_wheel_not_locked_button)), null, null, ScootersErrorDialogPresentation$OkDialogButtonListenerType.DEFAULT), 500);
                            return bkn0Var;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            if (!scootersEvolvingFailedException.getEvolveToCompletion()) {
                                fkn0Var3 = new fkn0(ScootersErrorDialogAnalyticsState.TELEMATICS_FAILED, new gkn0(context.getString(kyh0.scooters_telematics_default_error_title)), null, new gkn0(context.getString(kyh0.scooters_telematics_default_error_subtitle)), null, null, null, null, 1012);
                                break;
                            } else {
                                return b(context);
                            }
                        default:
                            return b(context);
                    }
                }
                return fkn0Var3;
        }
    }
}
