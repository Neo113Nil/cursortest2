package com.yandex.mapkit.navigation.transport;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class GetOnTransport implements Serializable {
    private NativeObject nativeObject;
    private String stopName;
    private boolean stopName__is_initialized;
    private List<BoardingTransportInfo> transports;
    private boolean transports__is_initialized;

    public GetOnTransport(String str, List<BoardingTransportInfo> list) {
        this.stopName__is_initialized = false;
        this.transports__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"stopName\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"transports\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, list);
        this.stopName = str;
        this.stopName__is_initialized = true;
        this.transports = list;
        this.transports__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::navigation::transport::GetOnTransport";
    }

    private native String getStopName__Native();

    private native List<BoardingTransportInfo> getTransports__Native();

    private native NativeObject init(String str, List<BoardingTransportInfo> list);

    public synchronized String getStopName() {
        try {
            if (!this.stopName__is_initialized) {
                this.stopName = getStopName__Native();
                this.stopName__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.stopName;
    }

    public synchronized List<BoardingTransportInfo> getTransports() {
        try {
            if (!this.transports__is_initialized) {
                this.transports = getTransports__Native();
                this.transports__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.transports;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getStopName(), false);
            nzs.m(BoardingTransportInfo.class, archive, getTransports(), false);
            return;
        }
        this.stopName = archive.add(this.stopName, false);
        this.stopName__is_initialized = true;
        List<BoardingTransportInfo> e = nzs.e(BoardingTransportInfo.class, archive, this.transports, false);
        this.transports = e;
        this.transports__is_initialized = true;
        this.nativeObject = init(this.stopName, e);
    }

    public GetOnTransport() {
        this.stopName__is_initialized = false;
        this.transports__is_initialized = false;
    }

    private GetOnTransport(NativeObject nativeObject) {
        this.stopName__is_initialized = false;
        this.transports__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
