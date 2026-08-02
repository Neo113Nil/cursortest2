package ru.ok.gleffects.recognition;

import androidx.annotation.NonNull;
import xsna.h5s;

/* loaded from: classes9.dex */
public class GalleryAsset {
    public final int defaultIndex;
    public final String filename;
    public final Type type;

    public enum Type {
        Image,
        Video
    }

    public GalleryAsset(Type type, String str, int i) {
        this.type = type;
        this.filename = str;
        this.defaultIndex = i;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GalleryAsset{type=");
        sb.append(this.type);
        sb.append(", filename=");
        sb.append(this.filename);
        sb.append(", defaultIndex=");
        return h5s.c(this.defaultIndex, "}", sb);
    }

    public GalleryAsset(Type type, String str) {
        this.type = type;
        this.filename = str;
        this.defaultIndex = -1;
    }
}
