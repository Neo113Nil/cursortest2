package com.yandex.mapkit.road_events_layer;

import com.yandex.mapkit.GraphLevel;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.EnumHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import java.util.List;

/* loaded from: classes15.dex */
public class RoadEvent implements Serializable {
    private String caption;
    private boolean caption__is_initialized;
    private GraphLevel graphLevel;
    private boolean graphLevel__is_initialized;
    private String id;
    private boolean id__is_initialized;
    private boolean isInFuture;
    private boolean isInFuture__is_initialized;
    private NativeObject nativeObject;
    private Point position;
    private boolean position__is_initialized;
    private List<EventTag> tags;
    private boolean tags__is_initialized;

    public RoadEvent(String str, Point point, List<EventTag> list, String str2, boolean z, GraphLevel graphLevel) {
        this.id__is_initialized = false;
        this.position__is_initialized = false;
        this.tags__is_initialized = false;
        this.caption__is_initialized = false;
        this.isInFuture__is_initialized = false;
        this.graphLevel__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"id\" cannot be null");
            throw null;
        }
        if (point == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"tags\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"caption\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, point, list, str2, z, graphLevel);
        this.id = str;
        this.id__is_initialized = true;
        this.position = point;
        this.position__is_initialized = true;
        this.tags = list;
        this.tags__is_initialized = true;
        this.caption = str2;
        this.caption__is_initialized = true;
        this.isInFuture = z;
        this.isInFuture__is_initialized = true;
        this.graphLevel = graphLevel;
        this.graphLevel__is_initialized = true;
    }

    private native String getCaption__Native();

    private native GraphLevel getGraphLevel__Native();

    private native String getId__Native();

    private native boolean getIsInFuture__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::road_events_layer::RoadEvent";
    }

    private native Point getPosition__Native();

    private native List<EventTag> getTags__Native();

    private native NativeObject init(String str, Point point, List<EventTag> list, String str2, boolean z, GraphLevel graphLevel);

    private native NativeObject initPublic(String str, Point point, List<EventTag> list, String str2, boolean z);

    public synchronized String getCaption() {
        try {
            if (!this.caption__is_initialized) {
                this.caption = getCaption__Native();
                this.caption__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.caption;
    }

    public synchronized GraphLevel getGraphLevel() {
        try {
            if (!this.graphLevel__is_initialized) {
                this.graphLevel = getGraphLevel__Native();
                this.graphLevel__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.graphLevel;
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

    public synchronized boolean getIsInFuture() {
        try {
            if (!this.isInFuture__is_initialized) {
                this.isInFuture = getIsInFuture__Native();
                this.isInFuture__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.isInFuture;
    }

    public synchronized Point getPosition() {
        try {
            if (!this.position__is_initialized) {
                this.position = getPosition__Native();
                this.position__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.position;
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
            archive.add(getId(), false);
            archive.add((Archive) getPosition(), false, (Class<Archive>) Point.class);
            archive.add((List) getTags(), false, (ArchivingHandler) new EnumHandler(EventTag.class));
            archive.add(getCaption(), false);
            archive.add(getIsInFuture());
            archive.add((Archive) getGraphLevel(), true, (Class<Archive>) GraphLevel.class);
            return;
        }
        this.id = archive.add(this.id, false);
        this.id__is_initialized = true;
        this.position = (Point) archive.add((Archive) this.position, false, (Class<Archive>) Point.class);
        this.position__is_initialized = true;
        this.tags = archive.add((List) this.tags, false, (ArchivingHandler) new EnumHandler(EventTag.class));
        this.tags__is_initialized = true;
        this.caption = archive.add(this.caption, false);
        this.caption__is_initialized = true;
        this.isInFuture = archive.add(this.isInFuture);
        this.isInFuture__is_initialized = true;
        GraphLevel graphLevel = (GraphLevel) archive.add((Archive) this.graphLevel, true, (Class<Archive>) GraphLevel.class);
        this.graphLevel = graphLevel;
        this.graphLevel__is_initialized = true;
        this.nativeObject = init(this.id, this.position, this.tags, this.caption, this.isInFuture, graphLevel);
    }

    public RoadEvent() {
        this.id__is_initialized = false;
        this.position__is_initialized = false;
        this.tags__is_initialized = false;
        this.caption__is_initialized = false;
        this.isInFuture__is_initialized = false;
        this.graphLevel__is_initialized = false;
    }

    private RoadEvent(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.position__is_initialized = false;
        this.tags__is_initialized = false;
        this.caption__is_initialized = false;
        this.isInFuture__is_initialized = false;
        this.graphLevel__is_initialized = false;
        this.nativeObject = nativeObject;
    }

    public RoadEvent(String str, Point point, List<EventTag> list, String str2, boolean z) {
        this.id__is_initialized = false;
        this.position__is_initialized = false;
        this.tags__is_initialized = false;
        this.caption__is_initialized = false;
        this.isInFuture__is_initialized = false;
        this.graphLevel__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"id\" cannot be null");
            throw null;
        }
        if (point == null) {
            ny61.g("Required field \"position\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"tags\" cannot be null");
            throw null;
        }
        if (str2 != null) {
            this.nativeObject = initPublic(str, point, list, str2, z);
            this.id = str;
            this.id__is_initialized = true;
            this.position = point;
            this.position__is_initialized = true;
            this.tags = list;
            this.tags__is_initialized = true;
            this.caption = str2;
            this.caption__is_initialized = true;
            this.isInFuture = z;
            this.isInFuture__is_initialized = true;
            return;
        }
        ny61.g("Required field \"caption\" cannot be null");
        throw null;
    }
}
