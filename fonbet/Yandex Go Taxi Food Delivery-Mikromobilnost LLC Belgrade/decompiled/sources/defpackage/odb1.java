package defpackage;

/* loaded from: classes.dex */
public final class odb1 {
    public static final cna1 a;
    public static final cna1 b;

    static {
        eid eidVar = new eid(wma1.a(), true, true);
        eidVar.o("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        eidVar.o("measurement.set_default_event_parameters_with_backfill.service", true);
        eidVar.n(0L, "measurement.id.set_default_event_parameters.fix_service_request_ordering");
        a = eidVar.o("measurement.set_default_event_parameters.fix_app_update_logging", true);
        b = eidVar.o("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        eidVar.o("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}
