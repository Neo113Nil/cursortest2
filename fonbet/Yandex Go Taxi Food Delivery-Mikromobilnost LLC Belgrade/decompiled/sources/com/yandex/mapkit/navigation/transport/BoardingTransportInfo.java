package com.yandex.mapkit.navigation.transport;

import com.yandex.mapkit.transport.masstransit.Line;
import com.yandex.mapkit.transport.masstransit.TransportContour;
import com.yandex.mapkit.transport.masstransit.TransportType;
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
public class BoardingTransportInfo implements Serializable {
    private ArrivalTime arrivalTime;
    private boolean arrivalTime__is_initialized;
    private String lineName;
    private boolean lineName__is_initialized;
    private Line.Style lineStyle;
    private boolean lineStyle__is_initialized;
    private NativeObject nativeObject;
    private String shortLineName;
    private boolean shortLineName__is_initialized;
    private String threadDescription;
    private boolean threadDescription__is_initialized;
    private List<TransportContour> transportContours;
    private boolean transportContours__is_initialized;
    private String transportSystemId;
    private boolean transportSystemId__is_initialized;
    private List<TransportType> transportTypes;
    private boolean transportTypes__is_initialized;

    public BoardingTransportInfo(String str, String str2, List<TransportContour> list, List<TransportType> list2, ArrivalTime arrivalTime, String str3, String str4, Line.Style style) {
        this.lineName__is_initialized = false;
        this.threadDescription__is_initialized = false;
        this.transportContours__is_initialized = false;
        this.transportTypes__is_initialized = false;
        this.arrivalTime__is_initialized = false;
        this.shortLineName__is_initialized = false;
        this.transportSystemId__is_initialized = false;
        this.lineStyle__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"lineName\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"transportContours\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"transportTypes\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, list, list2, arrivalTime, str3, str4, style);
        this.lineName = str;
        this.lineName__is_initialized = true;
        this.threadDescription = str2;
        this.threadDescription__is_initialized = true;
        this.transportContours = list;
        this.transportContours__is_initialized = true;
        this.transportTypes = list2;
        this.transportTypes__is_initialized = true;
        this.arrivalTime = arrivalTime;
        this.arrivalTime__is_initialized = true;
        this.shortLineName = str3;
        this.shortLineName__is_initialized = true;
        this.transportSystemId = str4;
        this.transportSystemId__is_initialized = true;
        this.lineStyle = style;
        this.lineStyle__is_initialized = true;
    }

    private native ArrivalTime getArrivalTime__Native();

    private native String getLineName__Native();

    private native Line.Style getLineStyle__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::navigation::transport::BoardingTransportInfo";
    }

    private native String getShortLineName__Native();

    private native String getThreadDescription__Native();

    private native List<TransportContour> getTransportContours__Native();

    private native String getTransportSystemId__Native();

    private native List<TransportType> getTransportTypes__Native();

    private native NativeObject init(String str, String str2, List<TransportContour> list, List<TransportType> list2, ArrivalTime arrivalTime, String str3, String str4, Line.Style style);

    public synchronized ArrivalTime getArrivalTime() {
        try {
            if (!this.arrivalTime__is_initialized) {
                this.arrivalTime = getArrivalTime__Native();
                this.arrivalTime__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.arrivalTime;
    }

    public synchronized String getLineName() {
        try {
            if (!this.lineName__is_initialized) {
                this.lineName = getLineName__Native();
                this.lineName__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.lineName;
    }

    public synchronized Line.Style getLineStyle() {
        try {
            if (!this.lineStyle__is_initialized) {
                this.lineStyle = getLineStyle__Native();
                this.lineStyle__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.lineStyle;
    }

    public synchronized String getShortLineName() {
        try {
            if (!this.shortLineName__is_initialized) {
                this.shortLineName = getShortLineName__Native();
                this.shortLineName__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.shortLineName;
    }

    public synchronized String getThreadDescription() {
        try {
            if (!this.threadDescription__is_initialized) {
                this.threadDescription = getThreadDescription__Native();
                this.threadDescription__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.threadDescription;
    }

    public synchronized List<TransportContour> getTransportContours() {
        try {
            if (!this.transportContours__is_initialized) {
                this.transportContours = getTransportContours__Native();
                this.transportContours__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.transportContours;
    }

    public synchronized String getTransportSystemId() {
        try {
            if (!this.transportSystemId__is_initialized) {
                this.transportSystemId = getTransportSystemId__Native();
                this.transportSystemId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.transportSystemId;
    }

    public synchronized List<TransportType> getTransportTypes() {
        try {
            if (!this.transportTypes__is_initialized) {
                this.transportTypes = getTransportTypes__Native();
                this.transportTypes__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.transportTypes;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getLineName(), false);
            archive.add(getThreadDescription(), true);
            archive.add((List) getTransportContours(), false, (ArchivingHandler) new ClassHandler(TransportContour.class));
            archive.add((List) getTransportTypes(), false, (ArchivingHandler) new EnumHandler(TransportType.class));
            archive.add((Archive) getArrivalTime(), true, (Class<Archive>) ArrivalTime.class);
            archive.add(getShortLineName(), true);
            archive.add(getTransportSystemId(), true);
            archive.add((Archive) getLineStyle(), true, (Class<Archive>) Line.Style.class);
            return;
        }
        this.lineName = archive.add(this.lineName, false);
        this.lineName__is_initialized = true;
        this.threadDescription = archive.add(this.threadDescription, true);
        this.threadDescription__is_initialized = true;
        this.transportContours = nzs.e(TransportContour.class, archive, this.transportContours, false);
        this.transportContours__is_initialized = true;
        this.transportTypes = archive.add((List) this.transportTypes, false, (ArchivingHandler) new EnumHandler(TransportType.class));
        this.transportTypes__is_initialized = true;
        this.arrivalTime = (ArrivalTime) archive.add((Archive) this.arrivalTime, true, (Class<Archive>) ArrivalTime.class);
        this.arrivalTime__is_initialized = true;
        this.shortLineName = archive.add(this.shortLineName, true);
        this.shortLineName__is_initialized = true;
        this.transportSystemId = archive.add(this.transportSystemId, true);
        this.transportSystemId__is_initialized = true;
        Line.Style style = (Line.Style) archive.add((Archive) this.lineStyle, true, (Class<Archive>) Line.Style.class);
        this.lineStyle = style;
        this.lineStyle__is_initialized = true;
        this.nativeObject = init(this.lineName, this.threadDescription, this.transportContours, this.transportTypes, this.arrivalTime, this.shortLineName, this.transportSystemId, style);
    }

    public BoardingTransportInfo() {
        this.lineName__is_initialized = false;
        this.threadDescription__is_initialized = false;
        this.transportContours__is_initialized = false;
        this.transportTypes__is_initialized = false;
        this.arrivalTime__is_initialized = false;
        this.shortLineName__is_initialized = false;
        this.transportSystemId__is_initialized = false;
        this.lineStyle__is_initialized = false;
    }

    private BoardingTransportInfo(NativeObject nativeObject) {
        this.lineName__is_initialized = false;
        this.threadDescription__is_initialized = false;
        this.transportContours__is_initialized = false;
        this.transportTypes__is_initialized = false;
        this.arrivalTime__is_initialized = false;
        this.shortLineName__is_initialized = false;
        this.transportSystemId__is_initialized = false;
        this.lineStyle__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
