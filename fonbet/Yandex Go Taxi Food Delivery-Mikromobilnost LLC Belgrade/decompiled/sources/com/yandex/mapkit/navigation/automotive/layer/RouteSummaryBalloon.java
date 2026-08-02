package com.yandex.mapkit.navigation.automotive.layer;

import com.yandex.mapkit.directions.driving.Summary;
import com.yandex.mapkit.directions.driving.Weight;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import defpackage.nnm;
import defpackage.ny61;
import java.util.List;

/* loaded from: classes15.dex */
public class RouteSummaryBalloon implements Serializable {
    private NativeObject nativeObject;
    private Weight relativeWeight;
    private boolean relativeWeight__is_initialized;
    private Summary summary;
    private boolean summary__is_initialized;
    private List<String> tags;
    private boolean tags__is_initialized;

    public RouteSummaryBalloon(Summary summary, List<String> list, Weight weight) {
        this.summary__is_initialized = false;
        this.tags__is_initialized = false;
        this.relativeWeight__is_initialized = false;
        if (summary == null) {
            ny61.g("Required field \"summary\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"tags\" cannot be null");
            throw null;
        }
        this.nativeObject = init(summary, list, weight);
        this.summary = summary;
        this.summary__is_initialized = true;
        this.tags = list;
        this.tags__is_initialized = true;
        this.relativeWeight = weight;
        this.relativeWeight__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::navigation::automotive::layer::RouteSummaryBalloon";
    }

    private native Weight getRelativeWeight__Native();

    private native Summary getSummary__Native();

    private native List<String> getTags__Native();

    private native NativeObject init(Summary summary, List<String> list, Weight weight);

    public synchronized Weight getRelativeWeight() {
        try {
            if (!this.relativeWeight__is_initialized) {
                this.relativeWeight = getRelativeWeight__Native();
                this.relativeWeight__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.relativeWeight;
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

    public synchronized List<String> getTags() {
        try {
            if (!this.tags__is_initialized) {
                this.tags = getTags__Native();
                this.tags__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.tags;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getSummary(), false, (Class<Archive>) Summary.class);
            archive.add((List) getTags(), false, (ArchivingHandler) new StringHandler());
            archive.add((Archive) getRelativeWeight(), true, (Class<Archive>) Weight.class);
            return;
        }
        this.summary = (Summary) archive.add((Archive) this.summary, false, (Class<Archive>) Summary.class);
        this.summary__is_initialized = true;
        this.tags = nnm.o(archive, this.tags, false);
        this.tags__is_initialized = true;
        Weight weight = (Weight) archive.add((Archive) this.relativeWeight, true, (Class<Archive>) Weight.class);
        this.relativeWeight = weight;
        this.relativeWeight__is_initialized = true;
        this.nativeObject = init(this.summary, this.tags, weight);
    }

    public RouteSummaryBalloon() {
        this.summary__is_initialized = false;
        this.tags__is_initialized = false;
        this.relativeWeight__is_initialized = false;
    }

    private RouteSummaryBalloon(NativeObject nativeObject) {
        this.summary__is_initialized = false;
        this.tags__is_initialized = false;
        this.relativeWeight__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
