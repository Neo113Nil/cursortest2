package com.yandex.mapkit.navigation.transport;

import com.yandex.mapkit.annotations.Speaker;
import java.util.List;

/* loaded from: classes15.dex */
public interface Annotator {
    void addListener(AnnotatorListener annotatorListener);

    TransportAnnotationLanguage getAnnotationLanguage();

    int getEnabledAnnotations();

    List<UpcomingManoeuvre> getManoeuvres();

    boolean isValid();

    void mute();

    void removeListener(AnnotatorListener annotatorListener);

    void setAnnotationLanguage(TransportAnnotationLanguage transportAnnotationLanguage);

    void setEnabledAnnotations(int i);

    void setSpeaker(Speaker speaker);

    void unmute();
}
