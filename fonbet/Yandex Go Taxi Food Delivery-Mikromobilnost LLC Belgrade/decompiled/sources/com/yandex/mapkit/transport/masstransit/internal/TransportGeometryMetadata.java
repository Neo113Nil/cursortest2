package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.geometry.Polyline;
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
public class TransportGeometryMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private List<TransportGeometry> transportGeometry;
    private boolean transportGeometry__is_initialized;

    public TransportGeometryMetadata(List<TransportGeometry> list) {
        this.transportGeometry__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"transportGeometry\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.transportGeometry = list;
        this.transportGeometry__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::internal::TransportGeometryMetadata";
    }

    private native List<TransportGeometry> getTransportGeometry__Native();

    private native NativeObject init(List<TransportGeometry> list);

    public synchronized List<TransportGeometry> getTransportGeometry() {
        try {
            if (!this.transportGeometry__is_initialized) {
                this.transportGeometry = getTransportGeometry__Native();
                this.transportGeometry__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.transportGeometry;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(TransportGeometry.class, archive, getTransportGeometry(), false);
            return;
        }
        List<TransportGeometry> e = nzs.e(TransportGeometry.class, archive, this.transportGeometry, false);
        this.transportGeometry = e;
        this.transportGeometry__is_initialized = true;
        this.nativeObject = init(e);
    }

    public TransportGeometryMetadata() {
        this.transportGeometry__is_initialized = false;
    }

    private TransportGeometryMetadata(NativeObject nativeObject) {
        this.transportGeometry__is_initialized = false;
        this.nativeObject = nativeObject;
    }

    public static class TransportGeometry implements Serializable {
        private Polyline geometry;
        private boolean geometry__is_initialized;
        private NativeObject nativeObject;
        private List<String> threadIds;
        private boolean threadIds__is_initialized;

        public TransportGeometry(List<String> list, Polyline polyline) {
            this.threadIds__is_initialized = false;
            this.geometry__is_initialized = false;
            if (list == null) {
                ny61.g("Required field \"threadIds\" cannot be null");
                throw null;
            }
            if (polyline == null) {
                ny61.g("Required field \"geometry\" cannot be null");
                throw null;
            }
            this.nativeObject = init(list, polyline);
            this.threadIds = list;
            this.threadIds__is_initialized = true;
            this.geometry = polyline;
            this.geometry__is_initialized = true;
        }

        private native Polyline getGeometry__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::transport::masstransit::internal::TransportGeometryMetadata::TransportGeometry";
        }

        private native List<String> getThreadIds__Native();

        private native NativeObject init(List<String> list, Polyline polyline);

        public synchronized Polyline getGeometry() {
            try {
                if (!this.geometry__is_initialized) {
                    this.geometry = getGeometry__Native();
                    this.geometry__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.geometry;
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
                archive.add((Archive) getGeometry(), false, (Class<Archive>) Polyline.class);
                return;
            }
            this.threadIds = nnm.o(archive, this.threadIds, false);
            this.threadIds__is_initialized = true;
            Polyline polyline = (Polyline) archive.add((Archive) this.geometry, false, (Class<Archive>) Polyline.class);
            this.geometry = polyline;
            this.geometry__is_initialized = true;
            this.nativeObject = init(this.threadIds, polyline);
        }

        public TransportGeometry() {
            this.threadIds__is_initialized = false;
            this.geometry__is_initialized = false;
        }

        private TransportGeometry(NativeObject nativeObject) {
            this.threadIds__is_initialized = false;
            this.geometry__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }
}
