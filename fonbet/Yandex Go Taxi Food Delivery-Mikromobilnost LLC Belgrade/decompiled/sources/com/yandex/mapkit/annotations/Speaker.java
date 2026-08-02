package com.yandex.mapkit.annotations;

/* loaded from: classes7.dex */
public interface Speaker {
    double duration(LocalizedPhrase localizedPhrase);

    void reset();

    void say(LocalizedPhrase localizedPhrase);
}
