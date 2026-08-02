package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class DrivingRouteMetadata implements BaseMetadata, Serializable {
    private Description description;
    private boolean description__is_initialized;
    private byte[] descriptor;
    private boolean descriptor__is_initialized;
    private Flags flags;
    private boolean flags__is_initialized;
    private NativeObject nativeObject;
    private NonAvoidedFeatures nonAvoidedFeatures;
    private boolean nonAvoidedFeatures__is_initialized;
    private List<RoutePoint> routePoints;
    private boolean routePoints__is_initialized;
    private List<String> tags;
    private boolean tags__is_initialized;
    private byte[] traits;
    private boolean traits__is_initialized;
    private String uri;
    private boolean uri__is_initialized;
    private Weight weight;
    private boolean weight__is_initialized;

    public DrivingRouteMetadata(Weight weight, Flags flags, byte[] bArr, byte[] bArr2, Description description, List<RoutePoint> list, List<String> list2, String str, NonAvoidedFeatures nonAvoidedFeatures) {
        this.weight__is_initialized = false;
        this.flags__is_initialized = false;
        this.descriptor__is_initialized = false;
        this.traits__is_initialized = false;
        this.description__is_initialized = false;
        this.routePoints__is_initialized = false;
        this.tags__is_initialized = false;
        this.uri__is_initialized = false;
        this.nonAvoidedFeatures__is_initialized = false;
        if (weight == null) {
            ny61.g("Required field \"weight\" cannot be null");
            throw null;
        }
        if (flags == null) {
            ny61.g("Required field \"flags\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"routePoints\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"tags\" cannot be null");
            throw null;
        }
        this.nativeObject = init(weight, flags, bArr, bArr2, description, list, list2, str, nonAvoidedFeatures);
        this.weight = weight;
        this.weight__is_initialized = true;
        this.flags = flags;
        this.flags__is_initialized = true;
        this.descriptor = bArr;
        this.descriptor__is_initialized = true;
        this.traits = bArr2;
        this.traits__is_initialized = true;
        this.description = description;
        this.description__is_initialized = true;
        this.routePoints = list;
        this.routePoints__is_initialized = true;
        this.tags = list2;
        this.tags__is_initialized = true;
        this.uri = str;
        this.uri__is_initialized = true;
        this.nonAvoidedFeatures = nonAvoidedFeatures;
        this.nonAvoidedFeatures__is_initialized = true;
    }

    private native Description getDescription__Native();

    private native byte[] getDescriptor__Native();

    private native Flags getFlags__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::RouteMetadata";
    }

    private native NonAvoidedFeatures getNonAvoidedFeatures__Native();

    private native List<RoutePoint> getRoutePoints__Native();

    private native List<String> getTags__Native();

    private native byte[] getTraits__Native();

    private native String getUri__Native();

    private native Weight getWeight__Native();

    private native NativeObject init(Weight weight, Flags flags, byte[] bArr, byte[] bArr2, Description description, List<RoutePoint> list, List<String> list2, String str, NonAvoidedFeatures nonAvoidedFeatures);

    private native NativeObject initPublic(Weight weight, Flags flags, List<RoutePoint> list, String str, NonAvoidedFeatures nonAvoidedFeatures);

    public synchronized Description getDescription() {
        try {
            if (!this.description__is_initialized) {
                this.description = getDescription__Native();
                this.description__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.description;
    }

    public synchronized byte[] getDescriptor() {
        try {
            if (!this.descriptor__is_initialized) {
                this.descriptor = getDescriptor__Native();
                this.descriptor__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.descriptor;
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

    public synchronized NonAvoidedFeatures getNonAvoidedFeatures() {
        try {
            if (!this.nonAvoidedFeatures__is_initialized) {
                this.nonAvoidedFeatures = getNonAvoidedFeatures__Native();
                this.nonAvoidedFeatures__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.nonAvoidedFeatures;
    }

    public synchronized List<RoutePoint> getRoutePoints() {
        try {
            if (!this.routePoints__is_initialized) {
                this.routePoints = getRoutePoints__Native();
                this.routePoints__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.routePoints;
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

    public synchronized byte[] getTraits() {
        try {
            if (!this.traits__is_initialized) {
                this.traits = getTraits__Native();
                this.traits__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.traits;
    }

    public synchronized String getUri() {
        try {
            if (!this.uri__is_initialized) {
                this.uri = getUri__Native();
                this.uri__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.uri;
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
            archive.add((Archive) getFlags(), false, (Class<Archive>) Flags.class);
            archive.add(getDescriptor(), true);
            archive.add(getTraits(), true);
            archive.add((Archive) getDescription(), true, (Class<Archive>) Description.class);
            archive.add((List) getRoutePoints(), false, (ArchivingHandler) new ClassHandler(RoutePoint.class));
            archive.add((List) getTags(), false, (ArchivingHandler) new StringHandler());
            archive.add(getUri(), true);
            archive.add((Archive) getNonAvoidedFeatures(), true, (Class<Archive>) NonAvoidedFeatures.class);
            return;
        }
        this.weight = (Weight) archive.add((Archive) this.weight, false, (Class<Archive>) Weight.class);
        this.weight__is_initialized = true;
        this.flags = (Flags) archive.add((Archive) this.flags, false, (Class<Archive>) Flags.class);
        this.flags__is_initialized = true;
        this.descriptor = archive.add(this.descriptor, true);
        this.descriptor__is_initialized = true;
        this.traits = archive.add(this.traits, true);
        this.traits__is_initialized = true;
        this.description = (Description) archive.add((Archive) this.description, true, (Class<Archive>) Description.class);
        this.description__is_initialized = true;
        this.routePoints = nzs.e(RoutePoint.class, archive, this.routePoints, false);
        this.routePoints__is_initialized = true;
        this.tags = nnm.o(archive, this.tags, false);
        this.tags__is_initialized = true;
        this.uri = archive.add(this.uri, true);
        this.uri__is_initialized = true;
        NonAvoidedFeatures nonAvoidedFeatures = (NonAvoidedFeatures) archive.add((Archive) this.nonAvoidedFeatures, true, (Class<Archive>) NonAvoidedFeatures.class);
        this.nonAvoidedFeatures = nonAvoidedFeatures;
        this.nonAvoidedFeatures__is_initialized = true;
        this.nativeObject = init(this.weight, this.flags, this.descriptor, this.traits, this.description, this.routePoints, this.tags, this.uri, nonAvoidedFeatures);
    }

    public DrivingRouteMetadata() {
        this.weight__is_initialized = false;
        this.flags__is_initialized = false;
        this.descriptor__is_initialized = false;
        this.traits__is_initialized = false;
        this.description__is_initialized = false;
        this.routePoints__is_initialized = false;
        this.tags__is_initialized = false;
        this.uri__is_initialized = false;
        this.nonAvoidedFeatures__is_initialized = false;
    }

    private DrivingRouteMetadata(NativeObject nativeObject) {
        this.weight__is_initialized = false;
        this.flags__is_initialized = false;
        this.descriptor__is_initialized = false;
        this.traits__is_initialized = false;
        this.description__is_initialized = false;
        this.routePoints__is_initialized = false;
        this.tags__is_initialized = false;
        this.uri__is_initialized = false;
        this.nonAvoidedFeatures__is_initialized = false;
        this.nativeObject = nativeObject;
    }

    public DrivingRouteMetadata(Weight weight, Flags flags, List<RoutePoint> list, String str, NonAvoidedFeatures nonAvoidedFeatures) {
        this.weight__is_initialized = false;
        this.flags__is_initialized = false;
        this.descriptor__is_initialized = false;
        this.traits__is_initialized = false;
        this.description__is_initialized = false;
        this.routePoints__is_initialized = false;
        this.tags__is_initialized = false;
        this.uri__is_initialized = false;
        this.nonAvoidedFeatures__is_initialized = false;
        if (weight == null) {
            ny61.g("Required field \"weight\" cannot be null");
            throw null;
        }
        if (flags == null) {
            ny61.g("Required field \"flags\" cannot be null");
            throw null;
        }
        if (list != null) {
            this.nativeObject = initPublic(weight, flags, list, str, nonAvoidedFeatures);
            this.weight = weight;
            this.weight__is_initialized = true;
            this.flags = flags;
            this.flags__is_initialized = true;
            this.routePoints = list;
            this.routePoints__is_initialized = true;
            this.uri = str;
            this.uri__is_initialized = true;
            this.nonAvoidedFeatures = nonAvoidedFeatures;
            this.nonAvoidedFeatures__is_initialized = true;
            return;
        }
        ny61.g("Required field \"routePoints\" cannot be null");
        throw null;
    }
}
