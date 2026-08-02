package com.yandex.mapkit.search;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class NearbyStop implements Serializable {
    private LocalizedValue distance;
    private boolean distance__is_initialized;
    private List<LineAtStop> linesAtStop;
    private boolean linesAtStop__is_initialized;
    private NativeObject nativeObject;
    private Point point;
    private boolean point__is_initialized;
    private Stop stop;
    private boolean stop__is_initialized;

    public NearbyStop(Stop stop, Point point, LocalizedValue localizedValue, List<LineAtStop> list) {
        this.stop__is_initialized = false;
        this.point__is_initialized = false;
        this.distance__is_initialized = false;
        this.linesAtStop__is_initialized = false;
        if (stop == null) {
            ny61.g("Required field \"stop\" cannot be null");
            throw null;
        }
        if (point == null) {
            ny61.g("Required field \"point\" cannot be null");
            throw null;
        }
        if (localizedValue == null) {
            ny61.g("Required field \"distance\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"linesAtStop\" cannot be null");
            throw null;
        }
        this.nativeObject = init(stop, point, localizedValue, list);
        this.stop = stop;
        this.stop__is_initialized = true;
        this.point = point;
        this.point__is_initialized = true;
        this.distance = localizedValue;
        this.distance__is_initialized = true;
        this.linesAtStop = list;
        this.linesAtStop__is_initialized = true;
    }

    private native LocalizedValue getDistance__Native();

    private native List<LineAtStop> getLinesAtStop__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::NearbyStop";
    }

    private native Point getPoint__Native();

    private native Stop getStop__Native();

    private native NativeObject init(Stop stop, Point point, LocalizedValue localizedValue, List<LineAtStop> list);

    public synchronized LocalizedValue getDistance() {
        try {
            if (!this.distance__is_initialized) {
                this.distance = getDistance__Native();
                this.distance__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.distance;
    }

    public synchronized List<LineAtStop> getLinesAtStop() {
        try {
            if (!this.linesAtStop__is_initialized) {
                this.linesAtStop = getLinesAtStop__Native();
                this.linesAtStop__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.linesAtStop;
    }

    public synchronized Point getPoint() {
        try {
            if (!this.point__is_initialized) {
                this.point = getPoint__Native();
                this.point__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.point;
    }

    public synchronized Stop getStop() {
        try {
            if (!this.stop__is_initialized) {
                this.stop = getStop__Native();
                this.stop__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.stop;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getStop(), false, (Class<Archive>) Stop.class);
            archive.add((Archive) getPoint(), false, (Class<Archive>) Point.class);
            archive.add((Archive) getDistance(), false, (Class<Archive>) LocalizedValue.class);
            nzs.m(LineAtStop.class, archive, getLinesAtStop(), false);
            return;
        }
        this.stop = (Stop) archive.add((Archive) this.stop, false, (Class<Archive>) Stop.class);
        this.stop__is_initialized = true;
        this.point = (Point) archive.add((Archive) this.point, false, (Class<Archive>) Point.class);
        this.point__is_initialized = true;
        this.distance = (LocalizedValue) archive.add((Archive) this.distance, false, (Class<Archive>) LocalizedValue.class);
        this.distance__is_initialized = true;
        List<LineAtStop> e = nzs.e(LineAtStop.class, archive, this.linesAtStop, false);
        this.linesAtStop = e;
        this.linesAtStop__is_initialized = true;
        this.nativeObject = init(this.stop, this.point, this.distance, e);
    }

    public static class Style implements Serializable {
        private Integer color;

        public Style(Integer num) {
            this.color = num;
        }

        public Integer getColor() {
            return this.color;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.color = archive.add(this.color, true);
        }

        public Style() {
        }
    }

    public static class Stop implements Serializable {
        private String id;
        private String name;

        public Stop(String str, String str2) {
            if (str == null) {
                ny61.g("Required field \"id\" cannot be null");
                throw null;
            }
            if (str2 == null) {
                ny61.g("Required field \"name\" cannot be null");
                throw null;
            }
            this.id = str;
            this.name = str2;
        }

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.id = archive.add(this.id, false);
            this.name = archive.add(this.name, false);
        }

        public Stop() {
        }
    }

    public static class LineAtStop implements Serializable {
        private Line line;
        private boolean line__is_initialized;
        private NativeObject nativeObject;

        public LineAtStop(Line line) {
            this.line__is_initialized = false;
            if (line == null) {
                ny61.g("Required field \"line\" cannot be null");
                throw null;
            }
            this.nativeObject = init(line);
            this.line = line;
            this.line__is_initialized = true;
        }

        private native Line getLine__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::search::NearbyStop::LineAtStop";
        }

        private native NativeObject init(Line line);

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

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                archive.add((Archive) getLine(), false, (Class<Archive>) Line.class);
                return;
            }
            Line line = (Line) archive.add((Archive) this.line, false, (Class<Archive>) Line.class);
            this.line = line;
            this.line__is_initialized = true;
            this.nativeObject = init(line);
        }

        public LineAtStop() {
            this.line__is_initialized = false;
        }

        private LineAtStop(NativeObject nativeObject) {
            this.line__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public static class Line implements Serializable {
        private String id;
        private boolean id__is_initialized;
        private String name;
        private boolean name__is_initialized;
        private NativeObject nativeObject;
        private Style style;
        private boolean style__is_initialized;
        private List<String> vehicleTypes;
        private boolean vehicleTypes__is_initialized;

        public Line(String str, String str2, Style style, List<String> list) {
            this.id__is_initialized = false;
            this.name__is_initialized = false;
            this.style__is_initialized = false;
            this.vehicleTypes__is_initialized = false;
            if (str == null) {
                ny61.g("Required field \"id\" cannot be null");
                throw null;
            }
            if (str2 == null) {
                ny61.g("Required field \"name\" cannot be null");
                throw null;
            }
            if (list == null) {
                ny61.g("Required field \"vehicleTypes\" cannot be null");
                throw null;
            }
            this.nativeObject = init(str, str2, style, list);
            this.id = str;
            this.id__is_initialized = true;
            this.name = str2;
            this.name__is_initialized = true;
            this.style = style;
            this.style__is_initialized = true;
            this.vehicleTypes = list;
            this.vehicleTypes__is_initialized = true;
        }

        private native String getId__Native();

        private native String getName__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::search::NearbyStop::Line";
        }

        private native Style getStyle__Native();

        private native List<String> getVehicleTypes__Native();

        private native NativeObject init(String str, String str2, Style style, List<String> list);

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

        public synchronized String getName() {
            try {
                if (!this.name__is_initialized) {
                    this.name = getName__Native();
                    this.name__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.name;
        }

        public synchronized Style getStyle() {
            try {
                if (!this.style__is_initialized) {
                    this.style = getStyle__Native();
                    this.style__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.style;
        }

        public synchronized List<String> getVehicleTypes() {
            try {
                if (!this.vehicleTypes__is_initialized) {
                    this.vehicleTypes = getVehicleTypes__Native();
                    this.vehicleTypes__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.vehicleTypes;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                archive.add(getId(), false);
                archive.add(getName(), false);
                archive.add((Archive) getStyle(), true, (Class<Archive>) Style.class);
                nzs.l(archive, getVehicleTypes(), false);
                return;
            }
            this.id = archive.add(this.id, false);
            this.id__is_initialized = true;
            this.name = archive.add(this.name, false);
            this.name__is_initialized = true;
            this.style = (Style) archive.add((Archive) this.style, true, (Class<Archive>) Style.class);
            this.style__is_initialized = true;
            List<String> o = nnm.o(archive, this.vehicleTypes, false);
            this.vehicleTypes = o;
            this.vehicleTypes__is_initialized = true;
            this.nativeObject = init(this.id, this.name, this.style, o);
        }

        public Line() {
            this.id__is_initialized = false;
            this.name__is_initialized = false;
            this.style__is_initialized = false;
            this.vehicleTypes__is_initialized = false;
        }

        private Line(NativeObject nativeObject) {
            this.id__is_initialized = false;
            this.name__is_initialized = false;
            this.style__is_initialized = false;
            this.vehicleTypes__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public NearbyStop() {
        this.stop__is_initialized = false;
        this.point__is_initialized = false;
        this.distance__is_initialized = false;
        this.linesAtStop__is_initialized = false;
    }

    private NearbyStop(NativeObject nativeObject) {
        this.stop__is_initialized = false;
        this.point__is_initialized = false;
        this.distance__is_initialized = false;
        this.linesAtStop__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
