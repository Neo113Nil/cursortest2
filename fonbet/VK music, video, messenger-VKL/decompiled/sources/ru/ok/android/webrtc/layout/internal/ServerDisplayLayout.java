package ru.ok.android.webrtc.layout.internal;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class ServerDisplayLayout {
    private Fit fit;
    private int height;
    private boolean shouldStopStream;
    private int width;

    public enum Fit {
        COVER("cv", 0),
        CONTAIN("cn", 1);

        public final int serverCode;
        public final String serverValue;

        Fit(String str, int i) {
            this.serverValue = str;
            this.serverCode = i;
        }
    }

    public Fit getFit() {
        return this.fit;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setFit(Fit fit) {
        this.fit = fit;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setStopStream(boolean z) {
        this.shouldStopStream = z;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public boolean shouldStopStream() {
        return this.shouldStopStream;
    }

    @NonNull
    public String toString() {
        if (shouldStopStream()) {
            return "ss";
        }
        return "sz=" + getWidth() + "x" + getHeight() + ":fit=" + getFit().serverValue;
    }
}
