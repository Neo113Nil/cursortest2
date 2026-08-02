package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.EnumHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RouteMetadata implements BaseMetadata, Serializable {
    private List<ComfortTag> comfortTags;
    private boolean comfortTags__is_initialized;
    private TravelEstimation estimation;
    private boolean estimation__is_initialized;
    private Flags flags;
    private boolean flags__is_initialized;
    private NativeObject nativeObject;
    private List<RoutePaymentOption> paymentOptions;
    private boolean paymentOptions__is_initialized;
    private String routeExplanation;
    private boolean routeExplanation__is_initialized;
    private String routeId;
    private boolean routeId__is_initialized;
    private RouteSettings settings;
    private boolean settings__is_initialized;
    private StairsSummary stairsSummary;
    private boolean stairsSummary__is_initialized;
    private List<WayPoint> wayPoints;
    private boolean wayPoints__is_initialized;
    private Weight weight;
    private boolean weight__is_initialized;

    public RouteMetadata(Weight weight, RouteSettings routeSettings, TravelEstimation travelEstimation, List<WayPoint> list, String str, Flags flags, List<ComfortTag> list2, StairsSummary stairsSummary, List<RoutePaymentOption> list3, String str2) {
        this.weight__is_initialized = false;
        this.settings__is_initialized = false;
        this.estimation__is_initialized = false;
        this.wayPoints__is_initialized = false;
        this.routeId__is_initialized = false;
        this.flags__is_initialized = false;
        this.comfortTags__is_initialized = false;
        this.stairsSummary__is_initialized = false;
        this.paymentOptions__is_initialized = false;
        this.routeExplanation__is_initialized = false;
        if (weight == null) {
            ny61.g("Required field \"weight\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"wayPoints\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"comfortTags\" cannot be null");
            throw null;
        }
        if (stairsSummary == null) {
            ny61.g("Required field \"stairsSummary\" cannot be null");
            throw null;
        }
        if (list3 == null) {
            ny61.g("Required field \"paymentOptions\" cannot be null");
            throw null;
        }
        this.nativeObject = init(weight, routeSettings, travelEstimation, list, str, flags, list2, stairsSummary, list3, str2);
        this.weight = weight;
        this.weight__is_initialized = true;
        this.settings = routeSettings;
        this.settings__is_initialized = true;
        this.estimation = travelEstimation;
        this.estimation__is_initialized = true;
        this.wayPoints = list;
        this.wayPoints__is_initialized = true;
        this.routeId = str;
        this.routeId__is_initialized = true;
        this.flags = flags;
        this.flags__is_initialized = true;
        this.comfortTags = list2;
        this.comfortTags__is_initialized = true;
        this.stairsSummary = stairsSummary;
        this.stairsSummary__is_initialized = true;
        this.paymentOptions = list3;
        this.paymentOptions__is_initialized = true;
        this.routeExplanation = str2;
        this.routeExplanation__is_initialized = true;
    }

    private native List<ComfortTag> getComfortTags__Native();

    private native TravelEstimation getEstimation__Native();

    private native Flags getFlags__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::RouteMetadata";
    }

    private native List<RoutePaymentOption> getPaymentOptions__Native();

    private native String getRouteExplanation__Native();

    private native String getRouteId__Native();

    private native RouteSettings getSettings__Native();

    private native StairsSummary getStairsSummary__Native();

    private native List<WayPoint> getWayPoints__Native();

    private native Weight getWeight__Native();

    private native NativeObject init(Weight weight, RouteSettings routeSettings, TravelEstimation travelEstimation, List<WayPoint> list, String str, Flags flags, List<ComfortTag> list2, StairsSummary stairsSummary, List<RoutePaymentOption> list3, String str2);

    public synchronized List<ComfortTag> getComfortTags() {
        try {
            if (!this.comfortTags__is_initialized) {
                this.comfortTags = getComfortTags__Native();
                this.comfortTags__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.comfortTags;
    }

    public synchronized TravelEstimation getEstimation() {
        try {
            if (!this.estimation__is_initialized) {
                this.estimation = getEstimation__Native();
                this.estimation__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.estimation;
    }

    public synchronized Flags getFlags() {
        try {
            if (!this.flags__is_initialized) {
                this.flags = getFlags__Native();
                this.flags__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.flags;
    }

    public synchronized List<RoutePaymentOption> getPaymentOptions() {
        try {
            if (!this.paymentOptions__is_initialized) {
                this.paymentOptions = getPaymentOptions__Native();
                this.paymentOptions__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.paymentOptions;
    }

    public synchronized String getRouteExplanation() {
        try {
            if (!this.routeExplanation__is_initialized) {
                this.routeExplanation = getRouteExplanation__Native();
                this.routeExplanation__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.routeExplanation;
    }

    public synchronized String getRouteId() {
        try {
            if (!this.routeId__is_initialized) {
                this.routeId = getRouteId__Native();
                this.routeId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.routeId;
    }

    public synchronized RouteSettings getSettings() {
        try {
            if (!this.settings__is_initialized) {
                this.settings = getSettings__Native();
                this.settings__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.settings;
    }

    public synchronized StairsSummary getStairsSummary() {
        try {
            if (!this.stairsSummary__is_initialized) {
                this.stairsSummary = getStairsSummary__Native();
                this.stairsSummary__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.stairsSummary;
    }

    public synchronized List<WayPoint> getWayPoints() {
        try {
            if (!this.wayPoints__is_initialized) {
                this.wayPoints = getWayPoints__Native();
                this.wayPoints__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.wayPoints;
    }

    public synchronized Weight getWeight() {
        try {
            if (!this.weight__is_initialized) {
                this.weight = getWeight__Native();
                this.weight__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.weight;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getWeight(), false, (Class<Archive>) Weight.class);
            archive.add((Archive) getSettings(), true, (Class<Archive>) RouteSettings.class);
            archive.add((Archive) getEstimation(), true, (Class<Archive>) TravelEstimation.class);
            archive.add((List) getWayPoints(), false, (ArchivingHandler) new ClassHandler(WayPoint.class));
            archive.add(getRouteId(), true);
            archive.add((Archive) getFlags(), true, (Class<Archive>) Flags.class);
            archive.add((List) getComfortTags(), false, (ArchivingHandler) new EnumHandler(ComfortTag.class));
            archive.add((Archive) getStairsSummary(), false, (Class<Archive>) StairsSummary.class);
            archive.add((List) getPaymentOptions(), false, (ArchivingHandler) new ClassHandler(RoutePaymentOption.class));
            archive.add(getRouteExplanation(), true);
            return;
        }
        this.weight = (Weight) archive.add((Archive) this.weight, false, (Class<Archive>) Weight.class);
        this.weight__is_initialized = true;
        this.settings = (RouteSettings) archive.add((Archive) this.settings, true, (Class<Archive>) RouteSettings.class);
        this.settings__is_initialized = true;
        this.estimation = (TravelEstimation) archive.add((Archive) this.estimation, true, (Class<Archive>) TravelEstimation.class);
        this.estimation__is_initialized = true;
        this.wayPoints = nzs.e(WayPoint.class, archive, this.wayPoints, false);
        this.wayPoints__is_initialized = true;
        this.routeId = archive.add(this.routeId, true);
        this.routeId__is_initialized = true;
        this.flags = (Flags) archive.add((Archive) this.flags, true, (Class<Archive>) Flags.class);
        this.flags__is_initialized = true;
        this.comfortTags = archive.add((List) this.comfortTags, false, (ArchivingHandler) new EnumHandler(ComfortTag.class));
        this.comfortTags__is_initialized = true;
        this.stairsSummary = (StairsSummary) archive.add((Archive) this.stairsSummary, false, (Class<Archive>) StairsSummary.class);
        this.stairsSummary__is_initialized = true;
        this.paymentOptions = nzs.e(RoutePaymentOption.class, archive, this.paymentOptions, false);
        this.paymentOptions__is_initialized = true;
        String add = archive.add(this.routeExplanation, true);
        this.routeExplanation = add;
        this.routeExplanation__is_initialized = true;
        this.nativeObject = init(this.weight, this.settings, this.estimation, this.wayPoints, this.routeId, this.flags, this.comfortTags, this.stairsSummary, this.paymentOptions, add);
    }

    public RouteMetadata() {
        this.weight__is_initialized = false;
        this.settings__is_initialized = false;
        this.estimation__is_initialized = false;
        this.wayPoints__is_initialized = false;
        this.routeId__is_initialized = false;
        this.flags__is_initialized = false;
        this.comfortTags__is_initialized = false;
        this.stairsSummary__is_initialized = false;
        this.paymentOptions__is_initialized = false;
        this.routeExplanation__is_initialized = false;
    }

    private RouteMetadata(NativeObject nativeObject) {
        this.weight__is_initialized = false;
        this.settings__is_initialized = false;
        this.estimation__is_initialized = false;
        this.wayPoints__is_initialized = false;
        this.routeId__is_initialized = false;
        this.flags__is_initialized = false;
        this.comfortTags__is_initialized = false;
        this.stairsSummary__is_initialized = false;
        this.paymentOptions__is_initialized = false;
        this.routeExplanation__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
