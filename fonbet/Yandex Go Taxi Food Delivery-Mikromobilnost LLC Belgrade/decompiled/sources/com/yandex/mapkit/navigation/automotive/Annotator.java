package com.yandex.mapkit.navigation.automotive;

import com.yandex.mapkit.annotations.Speaker;

/* loaded from: classes15.dex */
public interface Annotator {
    void addListener(AnnotatorListener annotatorListener);

    int getAnnotatedEvents();

    int getAnnotatedRoadEvents();

    AnnotatingMode getAnnotatingMode();

    boolean isValid();

    void mute();

    void removeListener(AnnotatorListener annotatorListener);

    void setAnnotatedEvents(int i);

    void setAnnotatedRoadEvents(int i);

    void setAnnotatingMode(AnnotatingMode annotatingMode);

    void setSpeaker(Speaker speaker);

    void unmute();
}
