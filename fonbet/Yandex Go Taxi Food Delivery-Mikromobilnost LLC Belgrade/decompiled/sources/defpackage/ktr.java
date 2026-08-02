package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import io.flutter.embedding.android.FlutterEmbedViewDelegate;
import io.flutter.embedding.android.FlutterSurfaceView;
import io.flutter.embedding.android.FlutterTextureView;
import io.flutter.embedding.android.FlutterViewContainer;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.android.TransparencyMode;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public final class ktr implements lrr {
    public final boolean A;
    public boolean B;
    public FlutterEmbedViewDelegate C;
    public final Context a;
    public final FlutterViewContainer b;
    public final RenderMode c;
    public final TransparencyMode w;
    public final int x;
    public final String y = "mainDrive";
    public final List z;

    public ktr(Context context, FlutterViewContainer flutterViewContainer, RenderMode renderMode, TransparencyMode transparencyMode, int i, List list, boolean z) {
        this.a = context;
        this.b = flutterViewContainer;
        this.c = renderMode;
        this.w = transparencyMode;
        this.x = i;
        this.z = list;
        this.A = z;
    }

    @Override // defpackage.lrr
    public final boolean attachToEngineAutomatically() {
        return true;
    }

    @Override // defpackage.lrr, defpackage.vrr
    public final void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
        this.b.cleanUpFlutterEngine(flutterEngine);
    }

    @Override // defpackage.lrr, defpackage.vrr
    public final void configureFlutterEngine(FlutterEngine flutterEngine) {
        this.b.configureFlutterEngine(flutterEngine);
    }

    @Override // defpackage.lrr
    public final void detachFromFlutterEngine() {
        FlutterEmbedViewDelegate flutterEmbedViewDelegate = this.C;
        if (flutterEmbedViewDelegate != null) {
            flutterEmbedViewDelegate.onDestroyView();
        }
        FlutterEmbedViewDelegate flutterEmbedViewDelegate2 = this.C;
        if (flutterEmbedViewDelegate2 != null) {
            flutterEmbedViewDelegate2.onDetach();
        }
    }

    @Override // defpackage.lrr
    public final Activity getActivity() {
        return this.b.getActivity();
    }

    @Override // defpackage.lrr
    public final String getAppBundlePath() {
        return "";
    }

    @Override // defpackage.lrr
    public final boolean getBackCallbackState() {
        return this.B;
    }

    @Override // defpackage.lrr
    public final String getCachedEngineGroupId() {
        return null;
    }

    @Override // defpackage.lrr
    public final String getCachedEngineId() {
        return null;
    }

    @Override // defpackage.lrr
    public final Context getContext() {
        return this.a;
    }

    @Override // defpackage.lrr
    public final List getDartEntrypointArgs() {
        return this.z;
    }

    @Override // defpackage.lrr
    public final String getDartEntrypointFunctionName() {
        return this.y;
    }

    @Override // defpackage.lrr
    public final String getDartEntrypointLibraryUri() {
        return null;
    }

    @Override // defpackage.lrr
    public final atr getFlutterShellArgs() {
        return new atr(EmptyList.a);
    }

    @Override // defpackage.lrr
    public final String getInitialRoute() {
        return null;
    }

    @Override // defpackage.lrr, defpackage.pey
    public final Lifecycle getLifecycle() {
        return this.b.getLifecycle();
    }

    @Override // defpackage.lrr
    public final RenderMode getRenderMode() {
        return this.c;
    }

    @Override // defpackage.lrr
    public final TransparencyMode getTransparencyMode() {
        return this.w;
    }

    @Override // defpackage.lrr
    public final void onFlutterSurfaceViewCreated(FlutterSurfaceView flutterSurfaceView) {
        this.b.onFlutterSurfaceViewCreated(flutterSurfaceView);
    }

    @Override // defpackage.lrr
    public final void onFlutterTextureViewCreated(FlutterTextureView flutterTextureView) {
        this.b.onFlutterTextureViewCreated(flutterTextureView);
    }

    @Override // defpackage.lrr
    public final void onFlutterUiDisplayed() {
        this.b.onFlutterUiDisplayed();
    }

    @Override // defpackage.lrr
    public final void onFlutterUiNoLongerDisplayed() {
        this.b.onFlutterUiNoLongerDisplayed();
    }

    @Override // defpackage.xvc0
    public final boolean popSystemNavigator() {
        return this.b.popSystemNavigator();
    }

    @Override // defpackage.lrr, defpackage.csr
    public final FlutterEngine provideFlutterEngine(Context context) {
        return this.b.provideFlutterEngine(context);
    }

    @Override // defpackage.lrr
    public final yvc0 providePlatformPlugin(Activity activity, FlutterEngine flutterEngine) {
        y4a0 y4a0Var = flutterEngine.m;
        if (this.A) {
            if (activity != null) {
                return new jtr(activity, y4a0Var, this);
            }
            return null;
        }
        if (activity != null) {
            return new yvc0(activity, y4a0Var, this);
        }
        return null;
    }

    @Override // defpackage.lrr
    public final vqq0 provideSensitiveContentPlugin(Activity activity, FlutterEngine flutterEngine) {
        if (activity == null) {
            return null;
        }
        return new vqq0(this.x, activity, flutterEngine.o);
    }

    @Override // defpackage.xvc0
    public final void setFrameworkHandlesBack(boolean z) {
        this.B = z;
    }

    @Override // defpackage.lrr
    public final boolean shouldAttachEngineToActivity() {
        return true;
    }

    @Override // defpackage.lrr
    public final boolean shouldDestroyEngineWithHost() {
        return true;
    }

    @Override // defpackage.lrr
    public final boolean shouldDispatchAppLifecycleState() {
        return true;
    }

    @Override // defpackage.lrr
    public final boolean shouldHandleDeeplinking() {
        return false;
    }

    @Override // defpackage.lrr
    public final boolean shouldRestoreAndSaveState() {
        return true;
    }
}
