package defpackage;

/* loaded from: classes.dex */
public final class jfb1 {
    public static final cna1 a;
    public static final cna1 b;
    public static final cna1 c;

    static {
        eid eidVar = new eid(wma1.a(), true, true);
        eidVar.o("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = eidVar.o("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = eidVar.o("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = eidVar.o("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
