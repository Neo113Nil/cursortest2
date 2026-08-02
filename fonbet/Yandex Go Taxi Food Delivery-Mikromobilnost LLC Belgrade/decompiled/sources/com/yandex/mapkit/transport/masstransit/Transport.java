package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class Transport implements Serializable {
    private Line line;
    private boolean line__is_initialized;
    private NativeObject nativeObject;
    private List<TransportContour> transportContours;
    private boolean transportContours__is_initialized;
    private List<TransportThread> transports;
    private boolean transports__is_initialized;

    public Transport(Line line, List<TransportThread> list, List<TransportContour> list2) {
        this.line__is_initialized = false;
        this.transports__is_initialized = false;
        this.transportContours__is_initialized = false;
        if (line == null) {
            ny61.g("Required field \"line\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"transports\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"transportContours\" cannot be null");
            throw null;
        }
        this.nativeObject = init(line, list, list2);
        this.line = line;
        this.line__is_initialized = true;
        this.transports = list;
        this.transports__is_initialized = true;
        this.transportContours = list2;
        this.transportContours__is_initialized = true;
    }

    private native Line getLine__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Transport";
    }

    private native List<TransportContour> getTransportContours__Native();

    private native List<TransportThread> getTransports__Native();

    private native NativeObject init(Line line, List<TransportThread> list, List<TransportContour> list2);

    public synchronized Line getLine() {
        try {
            if (!this.line__is_initialized) {
                this.line = getLine__Native();
                this.line__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.line;
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

    public synchronized List<TransportThread> getTransports() {
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
            archive.add((Archive) getLine(), false, (Class<Archive>) Line.class);
            archive.add((List) getTransports(), false, (ArchivingHandler) new ClassHandler(TransportThread.class));
            nzs.m(TransportContour.class, archive, getTransportContours(), false);
            return;
        }
        this.line = (Line) archive.add((Archive) this.line, false, (Class<Archive>) Line.class);
        this.line__is_initialized = true;
        this.transports = nzs.e(TransportThread.class, archive, this.transports, false);
        this.transports__is_initialized = true;
        List<TransportContour> e = nzs.e(TransportContour.class, archive, this.transportContours, false);
        this.transportContours = e;
        this.transportContours__is_initialized = true;
        this.nativeObject = init(this.line, this.transports, e);
    }

    public Transport() {
        this.line__is_initialized = false;
        this.transports__is_initialized = false;
        this.transportContours__is_initialized = false;
    }

    private Transport(NativeObject nativeObject) {
        this.line__is_initialized = false;
        this.transports__is_initialized = false;
        this.transportContours__is_initialized = false;
        this.nativeObject = nativeObject;
    }

    public static class TransportThread implements Serializable {
        private List<TransportThreadAlert> alerts;
        private boolean alerts__is_initialized;
        private Stop alternateDepartureStop;
        private boolean alternateDepartureStop__is_initialized;
        private List<Subpolyline> bindingsSegments;
        private boolean bindingsSegments__is_initialized;
        private BoardingOptions boardingOptions;
        private boolean boardingOptions__is_initialized;
        private TravelEstimation estimation;
        private boolean estimation__is_initialized;
        private Polyline geometry;
        private boolean geometry__is_initialized;
        private boolean isRecommended;
        private boolean isRecommended__is_initialized;
        private NativeObject nativeObject;
        private List<TransportStop> stops;
        private boolean stops__is_initialized;
        private Thread thread;
        private boolean thread__is_initialized;

        public TransportThread(Thread thread, boolean z, List<TransportThreadAlert> list, Stop stop, BoardingOptions boardingOptions, TravelEstimation travelEstimation, List<TransportStop> list2, Polyline polyline, List<Subpolyline> list3) {
            this.thread__is_initialized = false;
            this.isRecommended__is_initialized = false;
            this.alerts__is_initialized = false;
            this.alternateDepartureStop__is_initialized = false;
            this.boardingOptions__is_initialized = false;
            this.estimation__is_initialized = false;
            this.stops__is_initialized = false;
            this.geometry__is_initialized = false;
            this.bindingsSegments__is_initialized = false;
            if (thread == null) {
                ny61.g("Required field \"thread\" cannot be null");
                throw null;
            }
            if (list == null) {
                ny61.g("Required field \"alerts\" cannot be null");
                throw null;
            }
            if (list2 == null) {
                ny61.g("Required field \"stops\" cannot be null");
                throw null;
            }
            if (polyline == null) {
                ny61.g("Required field \"geometry\" cannot be null");
                throw null;
            }
            if (list3 == null) {
                ny61.g("Required field \"bindingsSegments\" cannot be null");
                throw null;
            }
            this.nativeObject = init(thread, z, list, stop, boardingOptions, travelEstimation, list2, polyline, list3);
            this.thread = thread;
            this.thread__is_initialized = true;
            this.isRecommended = z;
            this.isRecommended__is_initialized = true;
            this.alerts = list;
            this.alerts__is_initialized = true;
            this.alternateDepartureStop = stop;
            this.alternateDepartureStop__is_initialized = true;
            this.boardingOptions = boardingOptions;
            this.boardingOptions__is_initialized = true;
            this.estimation = travelEstimation;
            this.estimation__is_initialized = true;
            this.stops = list2;
            this.stops__is_initialized = true;
            this.geometry = polyline;
            this.geometry__is_initialized = true;
            this.bindingsSegments = list3;
            this.bindingsSegments__is_initialized = true;
        }

        private native List<TransportThreadAlert> getAlerts__Native();

        private native Stop getAlternateDepartureStop__Native();

        private native List<Subpolyline> getBindingsSegments__Native();

        private native BoardingOptions getBoardingOptions__Native();

        private native TravelEstimation getEstimation__Native();

        private native Polyline getGeometry__Native();

        private native boolean getIsRecommended__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::transport::masstransit::Transport::TransportThread";
        }

        private native List<TransportStop> getStops__Native();

        private native Thread getThread__Native();

        private native NativeObject init(Thread thread, boolean z, List<TransportThreadAlert> list, Stop stop, BoardingOptions boardingOptions, TravelEstimation travelEstimation, List<TransportStop> list2, Polyline polyline, List<Subpolyline> list3);

        private native NativeObject initPublic(Thread thread, boolean z, List<TransportThreadAlert> list, Stop stop, BoardingOptions boardingOptions, TravelEstimation travelEstimation, List<TransportStop> list2, Polyline polyline);

        public synchronized List<TransportThreadAlert> getAlerts() {
            try {
                if (!this.alerts__is_initialized) {
                    this.alerts = getAlerts__Native();
                    this.alerts__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.alerts;
        }

        public synchronized Stop getAlternateDepartureStop() {
            try {
                if (!this.alternateDepartureStop__is_initialized) {
                    this.alternateDepartureStop = getAlternateDepartureStop__Native();
                    this.alternateDepartureStop__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.alternateDepartureStop;
        }

        public synchronized List<Subpolyline> getBindingsSegments() {
            try {
                if (!this.bindingsSegments__is_initialized) {
                    this.bindingsSegments = getBindingsSegments__Native();
                    this.bindingsSegments__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.bindingsSegments;
        }

        public synchronized BoardingOptions getBoardingOptions() {
            try {
                if (!this.boardingOptions__is_initialized) {
                    this.boardingOptions = getBoardingOptions__Native();
                    this.boardingOptions__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.boardingOptions;
        }

        public synchronized TravelEstimation getEstimation() {
            try {
                if (!this.estimation__is_initialized) {
                    this.estimation = getEstimation__Native();
                    this.estimation__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.estimation;
        }

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

        public synchronized boolean getIsRecommended() {
            try {
                if (!this.isRecommended__is_initialized) {
                    this.isRecommended = getIsRecommended__Native();
                    this.isRecommended__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.isRecommended;
        }

        public synchronized List<TransportStop> getStops() {
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

        public synchronized Thread getThread() {
            try {
                if (!this.thread__is_initialized) {
                    this.thread = getThread__Native();
                    this.thread__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.thread;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                archive.add((Archive) getThread(), false, (Class<Archive>) Thread.class);
                archive.add(getIsRecommended());
                archive.add((List) getAlerts(), false, (ArchivingHandler) new ClassHandler(TransportThreadAlert.class));
                archive.add((Archive) getAlternateDepartureStop(), true, (Class<Archive>) Stop.class);
                archive.add((Archive) getBoardingOptions(), true, (Class<Archive>) BoardingOptions.class);
                archive.add((Archive) getEstimation(), true, (Class<Archive>) TravelEstimation.class);
                archive.add((List) getStops(), false, (ArchivingHandler) new ClassHandler(TransportStop.class));
                archive.add((Archive) getGeometry(), false, (Class<Archive>) Polyline.class);
                nzs.m(Subpolyline.class, archive, getBindingsSegments(), false);
                return;
            }
            this.thread = (Thread) archive.add((Archive) this.thread, false, (Class<Archive>) Thread.class);
            this.thread__is_initialized = true;
            this.isRecommended = archive.add(this.isRecommended);
            this.isRecommended__is_initialized = true;
            this.alerts = nzs.e(TransportThreadAlert.class, archive, this.alerts, false);
            this.alerts__is_initialized = true;
            this.alternateDepartureStop = (Stop) archive.add((Archive) this.alternateDepartureStop, true, (Class<Archive>) Stop.class);
            this.alternateDepartureStop__is_initialized = true;
            this.boardingOptions = (BoardingOptions) archive.add((Archive) this.boardingOptions, true, (Class<Archive>) BoardingOptions.class);
            this.boardingOptions__is_initialized = true;
            this.estimation = (TravelEstimation) archive.add((Archive) this.estimation, true, (Class<Archive>) TravelEstimation.class);
            this.estimation__is_initialized = true;
            this.stops = nzs.e(TransportStop.class, archive, this.stops, false);
            this.stops__is_initialized = true;
            this.geometry = (Polyline) archive.add((Archive) this.geometry, false, (Class<Archive>) Polyline.class);
            this.geometry__is_initialized = true;
            List<Subpolyline> e = nzs.e(Subpolyline.class, archive, this.bindingsSegments, false);
            this.bindingsSegments = e;
            this.bindingsSegments__is_initialized = true;
            this.nativeObject = init(this.thread, this.isRecommended, this.alerts, this.alternateDepartureStop, this.boardingOptions, this.estimation, this.stops, this.geometry, e);
        }

        public TransportThread() {
            this.thread__is_initialized = false;
            this.isRecommended__is_initialized = false;
            this.alerts__is_initialized = false;
            this.alternateDepartureStop__is_initialized = false;
            this.boardingOptions__is_initialized = false;
            this.estimation__is_initialized = false;
            this.stops__is_initialized = false;
            this.geometry__is_initialized = false;
            this.bindingsSegments__is_initialized = false;
        }

        private TransportThread(NativeObject nativeObject) {
            this.thread__is_initialized = false;
            this.isRecommended__is_initialized = false;
            this.alerts__is_initialized = false;
            this.alternateDepartureStop__is_initialized = false;
            this.boardingOptions__is_initialized = false;
            this.estimation__is_initialized = false;
            this.stops__is_initialized = false;
            this.geometry__is_initialized = false;
            this.bindingsSegments__is_initialized = false;
            this.nativeObject = nativeObject;
        }

        public TransportThread(Thread thread, boolean z, List<TransportThreadAlert> list, Stop stop, BoardingOptions boardingOptions, TravelEstimation travelEstimation, List<TransportStop> list2, Polyline polyline) {
            this.thread__is_initialized = false;
            this.isRecommended__is_initialized = false;
            this.alerts__is_initialized = false;
            this.alternateDepartureStop__is_initialized = false;
            this.boardingOptions__is_initialized = false;
            this.estimation__is_initialized = false;
            this.stops__is_initialized = false;
            this.geometry__is_initialized = false;
            this.bindingsSegments__is_initialized = false;
            if (thread == null) {
                ny61.g("Required field \"thread\" cannot be null");
                throw null;
            }
            if (list == null) {
                ny61.g("Required field \"alerts\" cannot be null");
                throw null;
            }
            if (list2 == null) {
                ny61.g("Required field \"stops\" cannot be null");
                throw null;
            }
            if (polyline != null) {
                this.nativeObject = initPublic(thread, z, list, stop, boardingOptions, travelEstimation, list2, polyline);
                this.thread = thread;
                this.thread__is_initialized = true;
                this.isRecommended = z;
                this.isRecommended__is_initialized = true;
                this.alerts = list;
                this.alerts__is_initialized = true;
                this.alternateDepartureStop = stop;
                this.alternateDepartureStop__is_initialized = true;
                this.boardingOptions = boardingOptions;
                this.boardingOptions__is_initialized = true;
                this.estimation = travelEstimation;
                this.estimation__is_initialized = true;
                this.stops = list2;
                this.stops__is_initialized = true;
                this.geometry = polyline;
                this.geometry__is_initialized = true;
                return;
            }
            ny61.g("Required field \"geometry\" cannot be null");
            throw null;
        }
    }
}
