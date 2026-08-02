package com.yandex.mapkit.map;

/* loaded from: classes8.dex */
public interface InertiaMoveListener {
    void onCancel(Map map, CameraPosition cameraPosition);

    void onFinish(Map map, CameraPosition cameraPosition);

    void onStart(Map map, CameraPosition cameraPosition);
}
