package com.yandex.mapkit.navigation.transport.layer.balloons;

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
public class MasstransitStopBalloon implements Serializable {
    private String lineName;
    private boolean lineName__is_initialized;
    private Line.Style lineStyle;
    private boolean lineStyle__is_initialized;
    private NativeObject nativeObject;
    private String shortLineName;
    private boolean shortLineName__is_initialized;
    private List<TransportContour> transportContours;
    private boolean transportContours__is_initialized;
    private String transportSystemId;
    private boolean transportSystemId__is_initialized;
    private List<TransportType> transportTypes;
    private boolean transportTypes__is_initialized;

    public MasstransitStopBalloon(List<TransportContour> list, List<TransportType> list2, String str, Line.Style style, String str2, String str3) {
        this.transportContours__is_initialized = false;
        this.transportTypes__is_initialized = false;
        this.lineName__is_initialized = false;
        this.lineStyle__is_initialized = false;
        this.shortLineName__is_initialized = false;
        this.transportSystemId__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"transportContours\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"transportTypes\" cannot be null");
            throw null;
        }
        if (str == null) {
            ny61.g("Required field \"lineName\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list, list2, str, style, str2, str3);
        this.transportContours = list;
        this.transportContours__is_initialized = true;
        this.transportTypes = list2;
        this.transportTypes__is_initialized = true;
        this.lineName = str;
        this.lineName__is_initialized = true;
        this.lineStyle = style;
        this.lineStyle__is_initialized = true;
        this.shortLineName = str2;
        this.shortLineName__is_initialized = true;
        this.transportSystemId = str3;
        this.transportSystemId__is_initialized = true;
    }

    private native String getLineName__Native();

    private native Line.Style getLineStyle__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::navigation::transport::layer::balloons::MasstransitStopBalloon";
    }

    private native String getShortLineName__Native();

    private native List<TransportContour> getTransportContours__Native();

    private native String getTransportSystemId__Native();

    private native List<TransportType> getTransportTypes__Native();

    private native NativeObject init(List<TransportContour> list, List<TransportType> list2, String str, Line.Style style, String str2, String str3);

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
            archive.add((List) getTransportContours(), false, (ArchivingHandler) new ClassHandler(TransportContour.class));
            archive.add((List) getTransportTypes(), false, (ArchivingHandler) new EnumHandler(TransportType.class));
            archive.add(getLineName(), false);
            archive.add((Archive) getLineStyle(), true, (Class<Archive>) Line.Style.class);
            archive.add(getShortLineName(), true);
            archive.add(getTransportSystemId(), true);
            return;
        }
        this.transportContours = nzs.e(TransportContour.class, archive, this.transportContours, false);
        this.transportContours__is_initialized = true;
        this.transportTypes = archive.add((List) this.transportTypes, false, (ArchivingHandler) new EnumHandler(TransportType.class));
        this.transportTypes__is_initialized = true;
        this.lineName = archive.add(this.lineName, false);
        this.lineName__is_initialized = true;
        this.lineStyle = (Line.Style) archive.add((Archive) this.lineStyle, true, (Class<Archive>) Line.Style.class);
        this.lineStyle__is_initialized = true;
        this.shortLineName = archive.add(this.shortLineName, true);
        this.shortLineName__is_initialized = true;
        String add = archive.add(this.transportSystemId, true);
        this.transportSystemId = add;
        this.transportSystemId__is_initialized = true;
        this.nativeObject = init(this.transportContours, this.transportTypes, this.lineName, this.lineStyle, this.shortLineName, add);
    }

    public MasstransitStopBalloon() {
        this.transportContours__is_initialized = false;
        this.transportTypes__is_initialized = false;
        this.lineName__is_initialized = false;
        this.lineStyle__is_initialized = false;
        this.shortLineName__is_initialized = false;
        this.transportSystemId__is_initialized = false;
    }

    private MasstransitStopBalloon(NativeObject nativeObject) {
        this.transportContours__is_initialized = false;
        this.transportTypes__is_initialized = false;
        this.lineName__is_initialized = false;
        this.lineStyle__is_initialized = false;
        this.shortLineName__is_initialized = false;
        this.transportSystemId__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
