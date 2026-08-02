package com.yandex.mapkit.navigation.transport.layer.balloons;

import com.yandex.mapkit.transport.masstransit.Summary;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class RouteSummaryBalloon implements Serializable {
    private RouteSummaryDifference difference;
    private boolean difference__is_initialized;
    private NativeObject nativeObject;
    private Summary summary;
    private boolean summary__is_initialized;

    public RouteSummaryBalloon(Summary summary, RouteSummaryDifference routeSummaryDifference) {
        this.summary__is_initialized = false;
        this.difference__is_initialized = false;
        if (summary == null) {
            ny61.g("Required field \"summary\" cannot be null");
            throw null;
        }
        this.nativeObject = init(summary, routeSummaryDifference);
        this.summary = summary;
        this.summary__is_initialized = true;
        this.difference = routeSummaryDifference;
        this.difference__is_initialized = true;
    }

    private native RouteSummaryDifference getDifference__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::navigation::transport::layer::balloons::RouteSummaryBalloon";
    }

    private native Summary getSummary__Native();

    private native NativeObject init(Summary summary, RouteSummaryDifference routeSummaryDifference);

    public synchronized RouteSummaryDifference getDifference() {
        try {
            if (!this.difference__is_initialized) {
                this.difference = getDifference__Native();
                this.difference__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.difference;
    }

    public synchronized Summary getSummary() {
        try {
            if (!this.summary__is_initialized) {
                this.summary = getSummary__Native();
                this.summary__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.summary;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getSummary(), false, (Class<Archive>) Summary.class);
            archive.add((Archive) getDifference(), true, (Class<Archive>) RouteSummaryDifference.class);
            return;
        }
        this.summary = (Summary) archive.add((Archive) this.summary, false, (Class<Archive>) Summary.class);
        this.summary__is_initialized = true;
        RouteSummaryDifference routeSummaryDifference = (RouteSummaryDifference) archive.add((Archive) this.difference, true, (Class<Archive>) RouteSummaryDifference.class);
        this.difference = routeSummaryDifference;
        this.difference__is_initialized = true;
        this.nativeObject = init(this.summary, routeSummaryDifference);
    }

    public RouteSummaryBalloon() {
        this.summary__is_initialized = false;
        this.difference__is_initialized = false;
    }

    private RouteSummaryBalloon(NativeObject nativeObject) {
        this.summary__is_initialized = false;
        this.difference__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
