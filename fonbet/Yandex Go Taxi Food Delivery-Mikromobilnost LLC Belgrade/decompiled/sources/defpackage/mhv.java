package defpackage;

import com.yandex.messaging.ui.imageviewer.ImageViewerInfo;

/* loaded from: classes15.dex */
public final class mhv implements o7b {
    public final ImageViewerInfo a;
    public final ru10 b;
    public final String c;
    public final String d;

    public mhv(ImageViewerInfo imageViewerInfo, ru10 ru10Var, String str, String str2) {
        this.a = imageViewerInfo;
        this.b = ru10Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mhv) {
            return jl40.l(this.a.getUrl(), ((mhv) obj).a.getUrl());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
