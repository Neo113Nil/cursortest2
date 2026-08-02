package ru.ok.android.api.http;

/* compiled from: HttpGeoPosition.kt */
/* loaded from: classes11.dex */
public interface HttpGeoPosition {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final HttpGeoPosition NONE = new None();

    /* compiled from: HttpGeoPosition.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    String getGeoPosition();

    void sentGeoPosition(String str);

    /* compiled from: HttpGeoPosition.kt */
    public static final class None implements HttpGeoPosition {
        @Override // ru.ok.android.api.http.HttpGeoPosition
        public String getGeoPosition() {
            return null;
        }

        @Override // ru.ok.android.api.http.HttpGeoPosition
        public void sentGeoPosition(String str) {
        }
    }
}
