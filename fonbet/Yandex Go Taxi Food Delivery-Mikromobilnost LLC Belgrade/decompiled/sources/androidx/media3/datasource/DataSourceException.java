package androidx.media3.datasource;

import java.io.IOException;

/* loaded from: classes10.dex */
public class DataSourceException extends IOException {
    public final int reason;

    public DataSourceException(int i) {
        this.reason = i;
    }

    public DataSourceException(int i, Exception exc) {
        super(exc);
        this.reason = i;
    }

    public DataSourceException(String str, int i) {
        super(str);
        this.reason = i;
    }

    public DataSourceException(int i, Exception exc, String str) {
        super(str, exc);
        this.reason = i;
    }
}
