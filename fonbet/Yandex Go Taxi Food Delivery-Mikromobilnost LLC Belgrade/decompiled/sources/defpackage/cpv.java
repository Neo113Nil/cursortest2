package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.go.navigator.incidents.IncidentType;
import com.yandex.go.navigator.repository.ReportStatus$Error$ErrorType;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.road_events.RoadEventFailedError;
import com.yandex.mapkit.road_events.RoadEventMetadata;
import com.yandex.mapkit.road_events.RoadEventSession;
import com.yandex.runtime.Error;
import com.yandex.runtime.auth.AuthRequiredError;
import com.yandex.runtime.network.ForbiddenError;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class cpv implements RoadEventSession.RoadEventListener {
    public final /* synthetic */ dpv a;

    public cpv(dpv dpvVar) {
        this.a = dpvVar;
    }

    @Override // com.yandex.mapkit.road_events.RoadEventSession.RoadEventListener
    public final void onRoadEventError(Error error) {
        Pair pair;
        ReportStatus$Error$ErrorType reportStatus$Error$ErrorType;
        if (error instanceof AuthRequiredError) {
            g8e.C("Road event: Auth required", jst.e);
            pair = new Pair(ReportStatus$Error$ErrorType.NoAuth, null);
        } else if (error instanceof ForbiddenError) {
            g8e.C("Road event: Forbidden", jst.e);
            pair = new Pair(ReportStatus$Error$ErrorType.Forbidden, null);
        } else if (error instanceof RoadEventFailedError) {
            RoadEventFailedError roadEventFailedError = (RoadEventFailedError) error;
            int i = bpv.a[roadEventFailedError.getCode().ordinal()];
            if (i == 1) {
                reportStatus$Error$ErrorType = ReportStatus$Error$ErrorType.Unknown;
            } else if (i == 2) {
                reportStatus$Error$ErrorType = ReportStatus$Error$ErrorType.BannedUser;
            } else if (i == 3) {
                reportStatus$Error$ErrorType = ReportStatus$Error$ErrorType.TooFar;
            } else if (i == 4) {
                reportStatus$Error$ErrorType = ReportStatus$Error$ErrorType.TooOften;
            } else {
                if (i != 5) {
                    w511.b();
                    return;
                }
                reportStatus$Error$ErrorType = ReportStatus$Error$ErrorType.LegalReason;
            }
            pair = new Pair(reportStatus$Error$ErrorType, roadEventFailedError.getDescription());
        } else {
            pair = new Pair(ReportStatus$Error$ErrorType.Unknown, null);
        }
        ReportStatus$Error$ErrorType reportStatus$Error$ErrorType2 = (ReportStatus$Error$ErrorType) pair.getFirst();
        String str = (String) pair.getSecond();
        jst.e.j(new IllegalStateException("Road event: " + str + ShimmerDivHandler.NUMBER_SING + reportStatus$Error$ErrorType2));
        this.a.d.g(new q3j0(reportStatus$Error$ErrorType2, str));
    }

    @Override // com.yandex.mapkit.road_events.RoadEventSession.RoadEventListener
    public final void onRoadEventReceived(GeoObject geoObject) {
        Object failure;
        gpv gpvVar;
        nsk0 b;
        dpv dpvVar = this.a;
        n0 n0Var = dpvVar.d;
        try {
            RoadEventMetadata roadEventMetadata = (RoadEventMetadata) geoObject.getMetadataContainer().getItem(RoadEventMetadata.class);
            gpvVar = dpvVar.c;
            b = dpvVar.b.b(roadEventMetadata);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        if (b == null) {
            throw new IllegalStateException("Required value was null.");
        }
        EventTag eventTag = b.c;
        gpvVar.getClass();
        failure = gpv.a(eventTag);
        if (failure == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (Result.a(failure) != null) {
            n0Var.g(s3j0.a);
        }
        if (failure instanceof Result.Failure) {
            return;
        }
        n0Var.g(new t3j0((IncidentType) failure));
    }
}
