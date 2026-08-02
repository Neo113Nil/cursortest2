package org.chromium.base;

/* loaded from: classes8.dex */
public abstract class PathService {
    public static final int DIR_MODULE = 3;

    public interface Natives {
        void override(int i, String str);
    }

    private PathService() {
    }

    public static void override(int i, String str) {
        PathServiceJni.get().override(i, str);
    }
}
