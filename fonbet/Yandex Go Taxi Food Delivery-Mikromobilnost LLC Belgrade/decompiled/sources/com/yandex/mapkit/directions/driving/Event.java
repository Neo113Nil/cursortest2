package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.EnumHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import java.util.List;

/* loaded from: classes15.dex */
public class Event implements Serializable {
    private AnnotationSchemeID annotationSchemeId;
    private boolean annotationSchemeId__is_initialized;
    private String descriptionText;
    private boolean descriptionText__is_initialized;
    private String eventId;
    private boolean eventId__is_initialized;
    private Point location;
    private boolean location__is_initialized;
    private NativeObject nativeObject;
    private PolylinePosition polylinePosition;
    private boolean polylinePosition__is_initialized;
    private Float speedLimit;
    private boolean speedLimit__is_initialized;
    private List<EventTag> tags;
    private boolean tags__is_initialized;

    public Event(PolylinePosition polylinePosition, String str, String str2, List<EventTag> list, Point point, Float f, AnnotationSchemeID annotationSchemeID) {
        this.polylinePosition__is_initialized = false;
        this.eventId__is_initialized = false;
        this.descriptionText__is_initialized = false;
        this.tags__is_initialized = false;
        this.location__is_initialized = false;
        this.speedLimit__is_initialized = false;
        this.annotationSchemeId__is_initialized = false;
        if (polylinePosition == null) {
            ny61.g("Required field \"polylinePosition\" cannot be null");
            throw null;
        }
        if (str == null) {
            ny61.g("Required field \"eventId\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"tags\" cannot be null");
            throw null;
        }
        if (point == null) {
            ny61.g("Required field \"location\" cannot be null");
            throw null;
        }
        this.nativeObject = init(polylinePosition, str, str2, list, point, f, annotationSchemeID);
        this.polylinePosition = polylinePosition;
        this.polylinePosition__is_initialized = true;
        this.eventId = str;
        this.eventId__is_initialized = true;
        this.descriptionText = str2;
        this.descriptionText__is_initialized = true;
        this.tags = list;
        this.tags__is_initialized = true;
        this.location = point;
        this.location__is_initialized = true;
        this.speedLimit = f;
        this.speedLimit__is_initialized = true;
        this.annotationSchemeId = annotationSchemeID;
        this.annotationSchemeId__is_initialized = true;
    }

    private native AnnotationSchemeID getAnnotationSchemeId__Native();

    private native String getDescriptionText__Native();

    private native String getEventId__Native();

    private native Point getLocation__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::Event";
    }

    private native PolylinePosition getPolylinePosition__Native();

    private native Float getSpeedLimit__Native();

    private native List<EventTag> getTags__Native();

    private native NativeObject init(PolylinePosition polylinePosition, String str, String str2, List<EventTag> list, Point point, Float f, AnnotationSchemeID annotationSchemeID);

    private native NativeObject initPublic(PolylinePosition polylinePosition, String str, String str2, List<EventTag> list, Point point, Float f);

    public synchronized AnnotationSchemeID getAnnotationSchemeId() {
        try {
            if (!this.annotationSchemeId__is_initialized) {
                this.annotationSchemeId = getAnnotationSchemeId__Native();
                this.annotationSchemeId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.annotationSchemeId;
    }

    public synchronized String getDescriptionText() {
        try {
            if (!this.descriptionText__is_initialized) {
                this.descriptionText = getDescriptionText__Native();
                this.descriptionText__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.descriptionText;
    }

    public synchronized String getEventId() {
        try {
            if (!this.eventId__is_initialized) {
                this.eventId = getEventId__Native();
                this.eventId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.eventId;
    }

    public synchronized Point getLocation() {
        try {
            if (!this.location__is_initialized) {
                this.location = getLocation__Native();
                this.location__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.location;
    }

    public synchronized PolylinePosition getPolylinePosition() {
        try {
            if (!this.polylinePosition__is_initialized) {
                this.polylinePosition = getPolylinePosition__Native();
                this.polylinePosition__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.polylinePosition;
    }

    public synchronized Float getSpeedLimit() {
        try {
            if (!this.speedLimit__is_initialized) {
                this.speedLimit = getSpeedLimit__Native();
                this.speedLimit__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.speedLimit;
    }

    public synchronized List<EventTag> getTags() {
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
            archive.add((Archive) getPolylinePosition(), false, (Class<Archive>) PolylinePosition.class);
            archive.add(getEventId(), false);
            archive.add(getDescriptionText(), true);
            archive.add((List) getTags(), false, (ArchivingHandler) new EnumHandler(EventTag.class));
            archive.add((Archive) getLocation(), false, (Class<Archive>) Point.class);
            archive.add(getSpeedLimit(), true);
            archive.add((Archive) getAnnotationSchemeId(), true, (Class<Archive>) AnnotationSchemeID.class);
            return;
        }
        this.polylinePosition = (PolylinePosition) archive.add((Archive) this.polylinePosition, false, (Class<Archive>) PolylinePosition.class);
        this.polylinePosition__is_initialized = true;
        this.eventId = archive.add(this.eventId, false);
        this.eventId__is_initialized = true;
        this.descriptionText = archive.add(this.descriptionText, true);
        this.descriptionText__is_initialized = true;
        this.tags = archive.add((List) this.tags, false, (ArchivingHandler) new EnumHandler(EventTag.class));
        this.tags__is_initialized = true;
        this.location = (Point) archive.add((Archive) this.location, false, (Class<Archive>) Point.class);
        this.location__is_initialized = true;
        this.speedLimit = archive.add(this.speedLimit, true);
        this.speedLimit__is_initialized = true;
        AnnotationSchemeID annotationSchemeID = (AnnotationSchemeID) archive.add((Archive) this.annotationSchemeId, true, (Class<Archive>) AnnotationSchemeID.class);
        this.annotationSchemeId = annotationSchemeID;
        this.annotationSchemeId__is_initialized = true;
        this.nativeObject = init(this.polylinePosition, this.eventId, this.descriptionText, this.tags, this.location, this.speedLimit, annotationSchemeID);
    }

    public Event() {
        this.polylinePosition__is_initialized = false;
        this.eventId__is_initialized = false;
        this.descriptionText__is_initialized = false;
        this.tags__is_initialized = false;
        this.location__is_initialized = false;
        this.speedLimit__is_initialized = false;
        this.annotationSchemeId__is_initialized = false;
    }

    private Event(NativeObject nativeObject) {
        this.polylinePosition__is_initialized = false;
        this.eventId__is_initialized = false;
        this.descriptionText__is_initialized = false;
        this.tags__is_initialized = false;
        this.location__is_initialized = false;
        this.speedLimit__is_initialized = false;
        this.annotationSchemeId__is_initialized = false;
        this.nativeObject = nativeObject;
    }

    public Event(PolylinePosition polylinePosition, String str, String str2, List<EventTag> list, Point point, Float f) {
        this.polylinePosition__is_initialized = false;
        this.eventId__is_initialized = false;
        this.descriptionText__is_initialized = false;
        this.tags__is_initialized = false;
        this.location__is_initialized = false;
        this.speedLimit__is_initialized = false;
        this.annotationSchemeId__is_initialized = false;
        if (polylinePosition == null) {
            ny61.g("Required field \"polylinePosition\" cannot be null");
            throw null;
        }
        if (str == null) {
            ny61.g("Required field \"eventId\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"tags\" cannot be null");
            throw null;
        }
        if (point != null) {
            this.nativeObject = initPublic(polylinePosition, str, str2, list, point, f);
            this.polylinePosition = polylinePosition;
            this.polylinePosition__is_initialized = true;
            this.eventId = str;
            this.eventId__is_initialized = true;
            this.descriptionText = str2;
            this.descriptionText__is_initialized = true;
            this.tags = list;
            this.tags__is_initialized = true;
            this.location = point;
            this.location__is_initialized = true;
            this.speedLimit = f;
            this.speedLimit__is_initialized = true;
            return;
        }
        ny61.g("Required field \"location\" cannot be null");
        throw null;
    }
}
