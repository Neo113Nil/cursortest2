package ru.ok.android.webrtc.signaling.api;

/* loaded from: classes9.dex */
public interface TransportType {

    public static final class WS implements TransportType {
        public static final WS INSTANCE = new WS();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WS);
        }

        @Override // ru.ok.android.webrtc.signaling.api.TransportType
        public String getKey() {
            return "WS";
        }

        public int hashCode() {
            return 2129677386;
        }

        public String toString() {
            return "WS";
        }
    }

    public static final class WT implements TransportType {
        public static final WT INSTANCE = new WT();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WT);
        }

        @Override // ru.ok.android.webrtc.signaling.api.TransportType
        public String getKey() {
            return "WT";
        }

        public int hashCode() {
            return 2129677387;
        }

        public String toString() {
            return "WT";
        }
    }

    String getKey();
}
