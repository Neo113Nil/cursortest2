package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import io.flutter.embedding.android.FlutterSurfaceView;
import io.flutter.embedding.android.FlutterTextureView;
import io.flutter.embedding.engine.FlutterEngine;

/* loaded from: classes4.dex */
public interface gtr extends xvc0 {
    void cleanUpFlutterEngine(FlutterEngine flutterEngine);

    void configureFlutterEngine(FlutterEngine flutterEngine);

    Activity getActivity();

    Lifecycle getLifecycle();

    void onFlutterSurfaceViewCreated(FlutterSurfaceView flutterSurfaceView);

    void onFlutterTextureViewCreated(FlutterTextureView flutterTextureView);

    void onFlutterUiDisplayed();

    void onFlutterUiNoLongerDisplayed();

    FlutterEngine provideFlutterEngine(Context context);
}
