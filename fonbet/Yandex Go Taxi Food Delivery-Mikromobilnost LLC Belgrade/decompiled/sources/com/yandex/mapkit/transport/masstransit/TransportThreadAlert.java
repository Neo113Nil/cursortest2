package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.Time;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes7.dex */
public class TransportThreadAlert implements Serializable {
    private Closed closed;
    private ClosedUntil closedUntil;
    private LastTrip lastTrip;
    private String text;

    public TransportThreadAlert(String str, Closed closed, ClosedUntil closedUntil, LastTrip lastTrip) {
        if (str == null) {
            ny61.g("Required field \"text\" cannot be null");
            throw null;
        }
        this.text = str;
        this.closed = closed;
        this.closedUntil = closedUntil;
        this.lastTrip = lastTrip;
    }

    public Closed getClosed() {
        return this.closed;
    }

    public ClosedUntil getClosedUntil() {
        return this.closedUntil;
    }

    public LastTrip getLastTrip() {
        return this.lastTrip;
    }

    public String getText() {
        return this.text;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.text = archive.add(this.text, false);
        this.closed = (Closed) archive.add((Archive) this.closed, true, (Class<Archive>) Closed.class);
        this.closedUntil = (ClosedUntil) archive.add((Archive) this.closedUntil, true, (Class<Archive>) ClosedUntil.class);
        this.lastTrip = (LastTrip) archive.add((Archive) this.lastTrip, true, (Class<Archive>) LastTrip.class);
    }

    /* loaded from: classes15.dex */
    public static class Closed implements Serializable {
        private boolean dummy;

        public Closed(boolean z) {
            this.dummy = z;
        }

        public boolean getDummy() {
            return this.dummy;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.dummy = archive.add(this.dummy);
        }

        public Closed() {
        }
    }

    /* loaded from: classes15.dex */
    public static class ClosedUntil implements Serializable {
        private Time time;

        public ClosedUntil(Time time) {
            if (time != null) {
                this.time = time;
            } else {
                ny61.g("Required field \"time\" cannot be null");
                throw null;
            }
        }

        public Time getTime() {
            return this.time;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.time = (Time) archive.add((Archive) this.time, false, (Class<Archive>) Time.class);
        }

        public ClosedUntil() {
        }
    }

    /* loaded from: classes15.dex */
    public static class LastTrip implements Serializable {
        private Time time;

        public LastTrip(Time time) {
            if (time != null) {
                this.time = time;
            } else {
                ny61.g("Required field \"time\" cannot be null");
                throw null;
            }
        }

        public Time getTime() {
            return this.time;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.time = (Time) archive.add((Archive) this.time, false, (Class<Archive>) Time.class);
        }

        public LastTrip() {
        }
    }

    public TransportThreadAlert() {
    }
}
