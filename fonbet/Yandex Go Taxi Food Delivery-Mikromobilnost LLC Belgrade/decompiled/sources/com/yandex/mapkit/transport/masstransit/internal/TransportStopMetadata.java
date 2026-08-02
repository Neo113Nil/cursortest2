package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class TransportStopMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private List<TransportStopInfo> transportStopInfo;
    private boolean transportStopInfo__is_initialized;

    public TransportStopMetadata(List<TransportStopInfo> list) {
        this.transportStopInfo__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"transportStopInfo\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.transportStopInfo = list;
        this.transportStopInfo__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::internal::TransportStopMetadata";
    }

    private native List<TransportStopInfo> getTransportStopInfo__Native();

    private native NativeObject init(List<TransportStopInfo> list);

    public synchronized List<TransportStopInfo> getTransportStopInfo() {
        try {
            if (!this.transportStopInfo__is_initialized) {
                this.transportStopInfo = getTransportStopInfo__Native();
                this.transportStopInfo__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.transportStopInfo;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(TransportStopInfo.class, archive, getTransportStopInfo(), false);
            return;
        }
        List<TransportStopInfo> e = nzs.e(TransportStopInfo.class, archive, this.transportStopInfo, false);
        this.transportStopInfo = e;
        this.transportStopInfo__is_initialized = true;
        this.nativeObject = init(e);
    }

    public TransportStopMetadata() {
        this.transportStopInfo__is_initialized = false;
    }

    private TransportStopMetadata(NativeObject nativeObject) {
        this.transportStopInfo__is_initialized = false;
        this.nativeObject = nativeObject;
    }

    public static class TransportStopInfo implements Serializable {
        private NativeObject nativeObject;
        private List<RawTransportStop> stops;
        private boolean stops__is_initialized;
        private List<String> threadIds;
        private boolean threadIds__is_initialized;

        public TransportStopInfo(List<String> list, List<RawTransportStop> list2) {
            this.threadIds__is_initialized = false;
            this.stops__is_initialized = false;
            if (list == null) {
                ny61.g("Required field \"threadIds\" cannot be null");
                throw null;
            }
            if (list2 == null) {
                ny61.g("Required field \"stops\" cannot be null");
                throw null;
            }
            this.nativeObject = init(list, list2);
            this.threadIds = list;
            this.threadIds__is_initialized = true;
            this.stops = list2;
            this.stops__is_initialized = true;
        }

        public static String getNativeName() {
            return "yandex::maps::mapkit::transport::masstransit::internal::TransportStopMetadata::TransportStopInfo";
        }

        private native List<RawTransportStop> getStops__Native();

        private native List<String> getThreadIds__Native();

        private native NativeObject init(List<String> list, List<RawTransportStop> list2);

        public synchronized List<RawTransportStop> getStops() {
            try {
                if (!this.stops__is_initialized) {
                    this.stops = getStops__Native();
                    this.stops__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.stops;
        }

        public synchronized List<String> getThreadIds() {
            try {
                if (!this.threadIds__is_initialized) {
                    this.threadIds = getThreadIds__Native();
                    this.threadIds__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.threadIds;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                archive.add((List) getThreadIds(), false, (ArchivingHandler) new StringHandler());
                nzs.m(RawTransportStop.class, archive, getStops(), false);
                return;
            }
            this.threadIds = nnm.o(archive, this.threadIds, false);
            this.threadIds__is_initialized = true;
            List<RawTransportStop> e = nzs.e(RawTransportStop.class, archive, this.stops, false);
            this.stops = e;
            this.stops__is_initialized = true;
            this.nativeObject = init(this.threadIds, e);
        }

        public TransportStopInfo() {
            this.threadIds__is_initialized = false;
            this.stops__is_initialized = false;
        }

        private TransportStopInfo(NativeObject nativeObject) {
            this.threadIds__is_initialized = false;
            this.stops__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }
}
