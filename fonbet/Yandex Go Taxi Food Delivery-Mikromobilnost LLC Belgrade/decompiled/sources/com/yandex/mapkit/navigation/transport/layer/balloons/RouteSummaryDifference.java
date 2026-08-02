package com.yandex.mapkit.navigation.transport.layer.balloons;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class RouteSummaryDifference implements Serializable {
    private NativeObject nativeObject;
    private Pair time;
    private boolean time__is_initialized;
    private Pair walkingDistance;
    private boolean walkingDistance__is_initialized;

    public RouteSummaryDifference(Pair pair, Pair pair2) {
        this.time__is_initialized = false;
        this.walkingDistance__is_initialized = false;
        if (pair == null) {
            ny61.g("Required field \"time\" cannot be null");
            throw null;
        }
        this.nativeObject = init(pair, pair2);
        this.time = pair;
        this.time__is_initialized = true;
        this.walkingDistance = pair2;
        this.walkingDistance__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::navigation::transport::layer::balloons::RouteSummaryDifference";
    }

    private native Pair getTime__Native();

    private native Pair getWalkingDistance__Native();

    private native NativeObject init(Pair pair, Pair pair2);

    public synchronized Pair getTime() {
        try {
            if (!this.time__is_initialized) {
                this.time = getTime__Native();
                this.time__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.time;
    }

    public synchronized Pair getWalkingDistance() {
        try {
            if (!this.walkingDistance__is_initialized) {
                this.walkingDistance = getWalkingDistance__Native();
                this.walkingDistance__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.walkingDistance;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getTime(), false, (Class<Archive>) Pair.class);
            archive.add((Archive) getWalkingDistance(), true, (Class<Archive>) Pair.class);
            return;
        }
        this.time = (Pair) archive.add((Archive) this.time, false, (Class<Archive>) Pair.class);
        this.time__is_initialized = true;
        Pair pair = (Pair) archive.add((Archive) this.walkingDistance, true, (Class<Archive>) Pair.class);
        this.walkingDistance = pair;
        this.walkingDistance__is_initialized = true;
        this.nativeObject = init(this.time, pair);
    }

    public static class Pair implements Serializable {
        private double ballonValue;
        private boolean ballonValue__is_initialized;
        private NativeObject nativeObject;
        private double selectedRouteValue;
        private boolean selectedRouteValue__is_initialized;

        public Pair(double d, double d2) {
            this.ballonValue__is_initialized = false;
            this.selectedRouteValue__is_initialized = false;
            this.nativeObject = init(d, d2);
            this.ballonValue = d;
            this.ballonValue__is_initialized = true;
            this.selectedRouteValue = d2;
            this.selectedRouteValue__is_initialized = true;
        }

        private native double getBallonValue__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::navigation::transport::layer::balloons::RouteSummaryDifference::Pair";
        }

        private native double getSelectedRouteValue__Native();

        private native NativeObject init(double d, double d2);

        public synchronized double getBallonValue() {
            try {
                if (!this.ballonValue__is_initialized) {
                    this.ballonValue = getBallonValue__Native();
                    this.ballonValue__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.ballonValue;
        }

        public synchronized double getSelectedRouteValue() {
            try {
                if (!this.selectedRouteValue__is_initialized) {
                    this.selectedRouteValue = getSelectedRouteValue__Native();
                    this.selectedRouteValue__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.selectedRouteValue;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                archive.add(getBallonValue());
                archive.add(getSelectedRouteValue());
                return;
            }
            this.ballonValue = archive.add(this.ballonValue);
            this.ballonValue__is_initialized = true;
            double add = archive.add(this.selectedRouteValue);
            this.selectedRouteValue = add;
            this.selectedRouteValue__is_initialized = true;
            this.nativeObject = init(this.ballonValue, add);
        }

        public Pair() {
            this.ballonValue__is_initialized = false;
            this.selectedRouteValue__is_initialized = false;
        }

        private Pair(NativeObject nativeObject) {
            this.ballonValue__is_initialized = false;
            this.selectedRouteValue__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public RouteSummaryDifference() {
        this.time__is_initialized = false;
        this.walkingDistance__is_initialized = false;
    }

    private RouteSummaryDifference(NativeObject nativeObject) {
        this.time__is_initialized = false;
        this.walkingDistance__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
