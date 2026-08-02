package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class SearchMetadata implements BaseMetadata, Serializable {
    private BoundingBox boundingBox;
    private boolean boundingBox__is_initialized;
    private BusinessResultMetadata businessResultMetadata;
    private boolean businessResultMetadata__is_initialized;
    private CollectionResultMetadata collectionResultMetadata;
    private boolean collectionResultMetadata__is_initialized;
    private String context;
    private boolean context__is_initialized;
    private String correctedRequestText;
    private boolean correctedRequestText__is_initialized;
    private DisplayType displayType;
    private boolean displayType__is_initialized;
    private int found;
    private boolean found__is_initialized;
    private NativeObject nativeObject;
    private String reqid;
    private boolean reqid__is_initialized;
    private BoundingBox requestBoundingBox;
    private boolean requestBoundingBox__is_initialized;
    private String requestText;
    private boolean requestText__is_initialized;
    private Sort sort;
    private boolean sort__is_initialized;
    private GeoObject toponym;
    private ToponymResultMetadata toponymResultMetadata;
    private boolean toponymResultMetadata__is_initialized;
    private boolean toponym__is_initialized;

    public SearchMetadata(int i, DisplayType displayType, BoundingBox boundingBox, Sort sort, GeoObject geoObject, ToponymResultMetadata toponymResultMetadata, BusinessResultMetadata businessResultMetadata, CollectionResultMetadata collectionResultMetadata, String str, String str2, String str3, String str4, BoundingBox boundingBox2) {
        this.found__is_initialized = false;
        this.displayType__is_initialized = false;
        this.boundingBox__is_initialized = false;
        this.sort__is_initialized = false;
        this.toponym__is_initialized = false;
        this.toponymResultMetadata__is_initialized = false;
        this.businessResultMetadata__is_initialized = false;
        this.collectionResultMetadata__is_initialized = false;
        this.reqid__is_initialized = false;
        this.context__is_initialized = false;
        this.requestText__is_initialized = false;
        this.correctedRequestText__is_initialized = false;
        this.requestBoundingBox__is_initialized = false;
        if (displayType == null) {
            ny61.g("Required field \"displayType\" cannot be null");
            throw null;
        }
        if (str == null) {
            ny61.g("Required field \"reqid\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"context\" cannot be null");
            throw null;
        }
        if (str3 == null) {
            ny61.g("Required field \"requestText\" cannot be null");
            throw null;
        }
        this.nativeObject = init(i, displayType, boundingBox, sort, geoObject, toponymResultMetadata, businessResultMetadata, collectionResultMetadata, str, str2, str3, str4, boundingBox2);
        this.found = i;
        this.found__is_initialized = true;
        this.displayType = displayType;
        this.displayType__is_initialized = true;
        this.boundingBox = boundingBox;
        this.boundingBox__is_initialized = true;
        this.sort = sort;
        this.sort__is_initialized = true;
        this.toponym = geoObject;
        this.toponym__is_initialized = true;
        this.toponymResultMetadata = toponymResultMetadata;
        this.toponymResultMetadata__is_initialized = true;
        this.businessResultMetadata = businessResultMetadata;
        this.businessResultMetadata__is_initialized = true;
        this.collectionResultMetadata = collectionResultMetadata;
        this.collectionResultMetadata__is_initialized = true;
        this.reqid = str;
        this.reqid__is_initialized = true;
        this.context = str2;
        this.context__is_initialized = true;
        this.requestText = str3;
        this.requestText__is_initialized = true;
        this.correctedRequestText = str4;
        this.correctedRequestText__is_initialized = true;
        this.requestBoundingBox = boundingBox2;
        this.requestBoundingBox__is_initialized = true;
    }

    private native BoundingBox getBoundingBox__Native();

    private native BusinessResultMetadata getBusinessResultMetadata__Native();

    private native CollectionResultMetadata getCollectionResultMetadata__Native();

    private native String getContext__Native();

    private native String getCorrectedRequestText__Native();

    private native DisplayType getDisplayType__Native();

    private native int getFound__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::SearchMetadata";
    }

    private native String getReqid__Native();

    private native BoundingBox getRequestBoundingBox__Native();

    private native String getRequestText__Native();

    private native Sort getSort__Native();

    private native ToponymResultMetadata getToponymResultMetadata__Native();

    private native GeoObject getToponym__Native();

    private native NativeObject init(int i, DisplayType displayType, BoundingBox boundingBox, Sort sort, GeoObject geoObject, ToponymResultMetadata toponymResultMetadata, BusinessResultMetadata businessResultMetadata, CollectionResultMetadata collectionResultMetadata, String str, String str2, String str3, String str4, BoundingBox boundingBox2);

    private native NativeObject initPublic(int i, DisplayType displayType, BoundingBox boundingBox, Sort sort, GeoObject geoObject, ToponymResultMetadata toponymResultMetadata, BusinessResultMetadata businessResultMetadata, String str, String str2, String str3, String str4, BoundingBox boundingBox2);

    public synchronized BoundingBox getBoundingBox() {
        try {
            if (!this.boundingBox__is_initialized) {
                this.boundingBox = getBoundingBox__Native();
                this.boundingBox__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.boundingBox;
    }

    public synchronized BusinessResultMetadata getBusinessResultMetadata() {
        try {
            if (!this.businessResultMetadata__is_initialized) {
                this.businessResultMetadata = getBusinessResultMetadata__Native();
                this.businessResultMetadata__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.businessResultMetadata;
    }

    public synchronized CollectionResultMetadata getCollectionResultMetadata() {
        try {
            if (!this.collectionResultMetadata__is_initialized) {
                this.collectionResultMetadata = getCollectionResultMetadata__Native();
                this.collectionResultMetadata__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.collectionResultMetadata;
    }

    public synchronized String getContext() {
        try {
            if (!this.context__is_initialized) {
                this.context = getContext__Native();
                this.context__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.context;
    }

    public synchronized String getCorrectedRequestText() {
        try {
            if (!this.correctedRequestText__is_initialized) {
                this.correctedRequestText = getCorrectedRequestText__Native();
                this.correctedRequestText__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.correctedRequestText;
    }

    public synchronized DisplayType getDisplayType() {
        try {
            if (!this.displayType__is_initialized) {
                this.displayType = getDisplayType__Native();
                this.displayType__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.displayType;
    }

    public synchronized int getFound() {
        try {
            if (!this.found__is_initialized) {
                this.found = getFound__Native();
                this.found__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.found;
    }

    public synchronized String getReqid() {
        try {
            if (!this.reqid__is_initialized) {
                this.reqid = getReqid__Native();
                this.reqid__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.reqid;
    }

    public synchronized BoundingBox getRequestBoundingBox() {
        try {
            if (!this.requestBoundingBox__is_initialized) {
                this.requestBoundingBox = getRequestBoundingBox__Native();
                this.requestBoundingBox__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.requestBoundingBox;
    }

    public synchronized String getRequestText() {
        try {
            if (!this.requestText__is_initialized) {
                this.requestText = getRequestText__Native();
                this.requestText__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.requestText;
    }

    public synchronized Sort getSort() {
        try {
            if (!this.sort__is_initialized) {
                this.sort = getSort__Native();
                this.sort__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.sort;
    }

    public synchronized GeoObject getToponym() {
        try {
            if (!this.toponym__is_initialized) {
                this.toponym = getToponym__Native();
                this.toponym__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.toponym;
    }

    public synchronized ToponymResultMetadata getToponymResultMetadata() {
        try {
            if (!this.toponymResultMetadata__is_initialized) {
                this.toponymResultMetadata = getToponymResultMetadata__Native();
                this.toponymResultMetadata__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.toponymResultMetadata;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getFound());
            archive.add((Archive) getDisplayType(), false, (Class<Archive>) DisplayType.class);
            archive.add((Archive) getBoundingBox(), true, (Class<Archive>) BoundingBox.class);
            archive.add((Archive) getSort(), true, (Class<Archive>) Sort.class);
            archive.add((Archive) getToponym(), true, (Class<Archive>) GeoObject.class);
            archive.add((Archive) getToponymResultMetadata(), true, (Class<Archive>) ToponymResultMetadata.class);
            archive.add((Archive) getBusinessResultMetadata(), true, (Class<Archive>) BusinessResultMetadata.class);
            archive.add((Archive) getCollectionResultMetadata(), true, (Class<Archive>) CollectionResultMetadata.class);
            archive.add(getReqid(), false);
            archive.add(getContext(), false);
            archive.add(getRequestText(), false);
            archive.add(getCorrectedRequestText(), true);
            archive.add((Archive) getRequestBoundingBox(), true, (Class<Archive>) BoundingBox.class);
            return;
        }
        this.found = archive.add(this.found);
        this.found__is_initialized = true;
        this.displayType = (DisplayType) archive.add((Archive) this.displayType, false, (Class<Archive>) DisplayType.class);
        this.displayType__is_initialized = true;
        this.boundingBox = (BoundingBox) archive.add((Archive) this.boundingBox, true, (Class<Archive>) BoundingBox.class);
        this.boundingBox__is_initialized = true;
        this.sort = (Sort) archive.add((Archive) this.sort, true, (Class<Archive>) Sort.class);
        this.sort__is_initialized = true;
        this.toponym = (GeoObject) archive.add((Archive) this.toponym, true, (Class<Archive>) GeoObject.class);
        this.toponym__is_initialized = true;
        this.toponymResultMetadata = (ToponymResultMetadata) archive.add((Archive) this.toponymResultMetadata, true, (Class<Archive>) ToponymResultMetadata.class);
        this.toponymResultMetadata__is_initialized = true;
        this.businessResultMetadata = (BusinessResultMetadata) archive.add((Archive) this.businessResultMetadata, true, (Class<Archive>) BusinessResultMetadata.class);
        this.businessResultMetadata__is_initialized = true;
        this.collectionResultMetadata = (CollectionResultMetadata) archive.add((Archive) this.collectionResultMetadata, true, (Class<Archive>) CollectionResultMetadata.class);
        this.collectionResultMetadata__is_initialized = true;
        this.reqid = archive.add(this.reqid, false);
        this.reqid__is_initialized = true;
        this.context = archive.add(this.context, false);
        this.context__is_initialized = true;
        this.requestText = archive.add(this.requestText, false);
        this.requestText__is_initialized = true;
        this.correctedRequestText = archive.add(this.correctedRequestText, true);
        this.correctedRequestText__is_initialized = true;
        BoundingBox boundingBox = (BoundingBox) archive.add((Archive) this.requestBoundingBox, true, (Class<Archive>) BoundingBox.class);
        this.requestBoundingBox = boundingBox;
        this.requestBoundingBox__is_initialized = true;
        this.nativeObject = init(this.found, this.displayType, this.boundingBox, this.sort, this.toponym, this.toponymResultMetadata, this.businessResultMetadata, this.collectionResultMetadata, this.reqid, this.context, this.requestText, this.correctedRequestText, boundingBox);
    }

    public SearchMetadata() {
        this.found__is_initialized = false;
        this.displayType__is_initialized = false;
        this.boundingBox__is_initialized = false;
        this.sort__is_initialized = false;
        this.toponym__is_initialized = false;
        this.toponymResultMetadata__is_initialized = false;
        this.businessResultMetadata__is_initialized = false;
        this.collectionResultMetadata__is_initialized = false;
        this.reqid__is_initialized = false;
        this.context__is_initialized = false;
        this.requestText__is_initialized = false;
        this.correctedRequestText__is_initialized = false;
        this.requestBoundingBox__is_initialized = false;
    }

    private SearchMetadata(NativeObject nativeObject) {
        this.found__is_initialized = false;
        this.displayType__is_initialized = false;
        this.boundingBox__is_initialized = false;
        this.sort__is_initialized = false;
        this.toponym__is_initialized = false;
        this.toponymResultMetadata__is_initialized = false;
        this.businessResultMetadata__is_initialized = false;
        this.collectionResultMetadata__is_initialized = false;
        this.reqid__is_initialized = false;
        this.context__is_initialized = false;
        this.requestText__is_initialized = false;
        this.correctedRequestText__is_initialized = false;
        this.requestBoundingBox__is_initialized = false;
        this.nativeObject = nativeObject;
    }

    public SearchMetadata(int i, DisplayType displayType, BoundingBox boundingBox, Sort sort, GeoObject geoObject, ToponymResultMetadata toponymResultMetadata, BusinessResultMetadata businessResultMetadata, String str, String str2, String str3, String str4, BoundingBox boundingBox2) {
        this.found__is_initialized = false;
        this.displayType__is_initialized = false;
        this.boundingBox__is_initialized = false;
        this.sort__is_initialized = false;
        this.toponym__is_initialized = false;
        this.toponymResultMetadata__is_initialized = false;
        this.businessResultMetadata__is_initialized = false;
        this.collectionResultMetadata__is_initialized = false;
        this.reqid__is_initialized = false;
        this.context__is_initialized = false;
        this.requestText__is_initialized = false;
        this.correctedRequestText__is_initialized = false;
        this.requestBoundingBox__is_initialized = false;
        if (displayType == null) {
            ny61.g("Required field \"displayType\" cannot be null");
            throw null;
        }
        if (str == null) {
            ny61.g("Required field \"reqid\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"context\" cannot be null");
            throw null;
        }
        if (str3 != null) {
            this.nativeObject = initPublic(i, displayType, boundingBox, sort, geoObject, toponymResultMetadata, businessResultMetadata, str, str2, str3, str4, boundingBox2);
            this.found = i;
            this.found__is_initialized = true;
            this.displayType = displayType;
            this.displayType__is_initialized = true;
            this.boundingBox = boundingBox;
            this.boundingBox__is_initialized = true;
            this.sort = sort;
            this.sort__is_initialized = true;
            this.toponym = geoObject;
            this.toponym__is_initialized = true;
            this.toponymResultMetadata = toponymResultMetadata;
            this.toponymResultMetadata__is_initialized = true;
            this.businessResultMetadata = businessResultMetadata;
            this.businessResultMetadata__is_initialized = true;
            this.reqid = str;
            this.reqid__is_initialized = true;
            this.context = str2;
            this.context__is_initialized = true;
            this.requestText = str3;
            this.requestText__is_initialized = true;
            this.correctedRequestText = str4;
            this.correctedRequestText__is_initialized = true;
            this.requestBoundingBox = boundingBox2;
            this.requestBoundingBox__is_initialized = true;
            return;
        }
        ny61.g("Required field \"requestText\" cannot be null");
        throw null;
    }
}
