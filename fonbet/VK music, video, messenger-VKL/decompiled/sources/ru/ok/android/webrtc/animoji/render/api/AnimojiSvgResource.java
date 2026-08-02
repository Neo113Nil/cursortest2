package ru.ok.android.webrtc.animoji.render.api;

import java.io.Closeable;
import java.io.File;

/* loaded from: classes9.dex */
public interface AnimojiSvgResource extends Closeable {
    byte[] asData();

    File asFile();

    int bgColorRGB();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void prepare();
}
