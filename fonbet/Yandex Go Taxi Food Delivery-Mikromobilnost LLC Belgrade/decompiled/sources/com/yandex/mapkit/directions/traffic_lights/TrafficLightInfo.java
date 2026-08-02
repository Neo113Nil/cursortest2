package com.yandex.mapkit.directions.traffic_lights;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class TrafficLightInfo implements Serializable {
    private List<FeedbackReason> feedbackReasons;
    private boolean feedbackReasons__is_initialized;
    private String id;
    private boolean id__is_initialized;
    private NativeObject nativeObject;
    private TrafficLightObject trafficLightObject;
    private boolean trafficLightObject__is_initialized;

    public TrafficLightInfo(String str, TrafficLightObject trafficLightObject, List<FeedbackReason> list) {
        this.id__is_initialized = false;
        this.trafficLightObject__is_initialized = false;
        this.feedbackReasons__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"id\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"feedbackReasons\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, trafficLightObject, list);
        this.id = str;
        this.id__is_initialized = true;
        this.trafficLightObject = trafficLightObject;
        this.trafficLightObject__is_initialized = true;
        this.feedbackReasons = list;
        this.feedbackReasons__is_initialized = true;
    }

    private native List<FeedbackReason> getFeedbackReasons__Native();

    private native String getId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::traffic_lights::TrafficLightInfo";
    }

    private native TrafficLightObject getTrafficLightObject__Native();

    private native NativeObject init(String str, TrafficLightObject trafficLightObject, List<FeedbackReason> list);

    public synchronized List<FeedbackReason> getFeedbackReasons() {
        try {
            if (!this.feedbackReasons__is_initialized) {
                this.feedbackReasons = getFeedbackReasons__Native();
                this.feedbackReasons__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.feedbackReasons;
    }

    public synchronized String getId() {
        try {
            if (!this.id__is_initialized) {
                this.id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.id;
    }

    public synchronized TrafficLightObject getTrafficLightObject() {
        try {
            if (!this.trafficLightObject__is_initialized) {
                this.trafficLightObject = getTrafficLightObject__Native();
                this.trafficLightObject__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.trafficLightObject;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), false);
            archive.add((Archive) getTrafficLightObject(), true, (Class<Archive>) TrafficLightObject.class);
            nzs.m(FeedbackReason.class, archive, getFeedbackReasons(), false);
            return;
        }
        this.id = archive.add(this.id, false);
        this.id__is_initialized = true;
        this.trafficLightObject = (TrafficLightObject) archive.add((Archive) this.trafficLightObject, true, (Class<Archive>) TrafficLightObject.class);
        this.trafficLightObject__is_initialized = true;
        List<FeedbackReason> e = nzs.e(FeedbackReason.class, archive, this.feedbackReasons, false);
        this.feedbackReasons = e;
        this.feedbackReasons__is_initialized = true;
        this.nativeObject = init(this.id, this.trafficLightObject, e);
    }

    public TrafficLightInfo() {
        this.id__is_initialized = false;
        this.trafficLightObject__is_initialized = false;
        this.feedbackReasons__is_initialized = false;
    }

    private TrafficLightInfo(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.trafficLightObject__is_initialized = false;
        this.feedbackReasons__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
