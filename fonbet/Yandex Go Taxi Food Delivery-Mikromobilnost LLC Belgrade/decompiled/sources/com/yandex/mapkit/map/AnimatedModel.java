package com.yandex.mapkit.map;

/* loaded from: classes15.dex */
public interface AnimatedModel extends Model {
    int getLoopCount();

    float getSpeed();

    AnimationState getState();

    void pause();

    void play();

    void selectAnimation(String str);

    void setLoopCount(int i);

    void setOnFinished(Callback callback);

    void setSpeed(float f);

    void stop();
}
