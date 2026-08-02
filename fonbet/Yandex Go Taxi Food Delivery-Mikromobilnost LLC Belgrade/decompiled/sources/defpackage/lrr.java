package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import io.flutter.embedding.android.FlutterSurfaceView;
import io.flutter.embedding.android.FlutterTextureView;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.android.TransparencyMode;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.List;

/* loaded from: classes4.dex */
public interface lrr extends csr, vrr, xvc0 {
    boolean attachToEngineAutomatically();

    void cleanUpFlutterEngine(FlutterEngine flutterEngine);

    void configureFlutterEngine(FlutterEngine flutterEngine);

    void detachFromFlutterEngine();

    Activity getActivity();

    String getAppBundlePath();

    boolean getBackCallbackState();

    String getCachedEngineGroupId();

    String getCachedEngineId();

    Context getContext();

    List getDartEntrypointArgs();

    String getDartEntrypointFunctionName();

    String getDartEntrypointLibraryUri();

    atr getFlutterShellArgs();

    String getInitialRoute();

    Lifecycle getLifecycle();

    RenderMode getRenderMode();

    TransparencyMode getTransparencyMode();

    void onFlutterSurfaceViewCreated(FlutterSurfaceView flutterSurfaceView);

    void onFlutterTextureViewCreated(FlutterTextureView flutterTextureView);

    void onFlutterUiDisplayed();

    void onFlutterUiNoLongerDisplayed();

    @Override // defpackage.csr
    FlutterEngine provideFlutterEngine(Context context);

    yvc0 providePlatformPlugin(Activity activity, FlutterEngine flutterEngine);

    vqq0 provideSensitiveContentPlugin(Activity activity, FlutterEngine flutterEngine);

    boolean shouldAttachEngineToActivity();

    boolean shouldDestroyEngineWithHost();

    boolean shouldDispatchAppLifecycleState();

    boolean shouldHandleDeeplinking();

    boolean shouldRestoreAndSaveState();
}
