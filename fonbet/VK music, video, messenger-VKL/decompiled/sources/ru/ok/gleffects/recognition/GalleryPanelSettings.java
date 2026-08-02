package ru.ok.gleffects.recognition;

import androidx.annotation.NonNull;
import java.util.Arrays;
import xsna.h5s;

/* loaded from: classes9.dex */
public class GalleryPanelSettings {
    public final String[] defaultFiles;
    public final int defaultSelected;
    public final Mode mode;

    public enum Mode {
        GalleryImages,
        DefaultImages,
        GalleryAndDefaultImages
    }

    public GalleryPanelSettings(int i, String[] strArr, int i2) {
        this.mode = Mode.values()[i];
        this.defaultFiles = strArr;
        this.defaultSelected = i2;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GalleryPanelSettings{mode=");
        sb.append(this.mode);
        sb.append(", defaultFiles=");
        sb.append(Arrays.toString(this.defaultFiles));
        sb.append(", defaultSelected=");
        return h5s.c(this.defaultSelected, "}", sb);
    }
}
