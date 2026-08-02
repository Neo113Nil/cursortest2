package com.cloudwebrtc.webrtc;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import com.cloudwebrtc.webrtc.audio.AudioProcessingController;
import com.cloudwebrtc.webrtc.audio.AudioSwitchManager;
import com.cloudwebrtc.webrtc.utils.AnyThreadSink;
import com.cloudwebrtc.webrtc.utils.ConstraintsMap;
import defpackage.afo;
import defpackage.ea20;
import defpackage.hf3;
import defpackage.l40;
import defpackage.loj;
import defpackage.pey;
import defpackage.r30;
import defpackage.ssr;
import defpackage.tsr;
import defpackage.tt5;
import defpackage.wrr;
import defpackage.xeo;
import defpackage.xuy0;
import defpackage.zeo;
import defpackage.zy11;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.List;
import java.util.Objects;
import org.webrtc.MediaStreamTrack;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes10.dex */
public class FlutterWebRTCPlugin implements tsr, r30, zeo {
    public static final String TAG = "FlutterWebRTCPlugin";
    private static Application application;
    public static FlutterWebRTCPlugin sharedSingleton;
    private afo eventChannel;
    public xeo eventSink;
    private Lifecycle lifecycle;
    private MethodCallHandlerImpl methodCallHandler;
    private ea20 methodChannel;
    private LifeCycleObserver observer;

    public FlutterWebRTCPlugin() {
        sharedSingleton = this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ zy11 lambda$startListening$0(List list, hf3 hf3Var) {
        Objects.toString(list);
        Objects.toString(hf3Var);
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onDeviceChange");
        sendEvent(constraintsMap.toMap());
        return null;
    }

    private void startListening(Context context, tt5 tt5Var, xuy0 xuy0Var) {
        AudioSwitchManager.instance = new AudioSwitchManager(context);
        this.methodCallHandler = new MethodCallHandlerImpl(context, tt5Var, xuy0Var);
        ea20 ea20Var = new ea20(tt5Var, "FlutterWebRTC.Method");
        this.methodChannel = ea20Var;
        ea20Var.b(this.methodCallHandler);
        afo afoVar = new afo(tt5Var, "FlutterWebRTC.Event");
        this.eventChannel = afoVar;
        afoVar.a(this);
        AudioSwitchManager.instance.audioDeviceChangeListener = new loj(26, this);
    }

    private void stopListening() {
        this.methodCallHandler.dispose();
        this.methodCallHandler = null;
        this.methodChannel.b(null);
        this.eventChannel.a(null);
        AudioSwitchManager audioSwitchManager = AudioSwitchManager.instance;
        if (audioSwitchManager != null) {
            audioSwitchManager.stop();
        }
    }

    public AudioProcessingController getAudioProcessingController() {
        return this.methodCallHandler.audioProcessingController;
    }

    public LocalTrack getLocalTrack(String str) {
        return this.methodCallHandler.getLocalTrack(str);
    }

    public MediaStreamTrack getRemoteTrack(String str) {
        return this.methodCallHandler.getRemoteTrack(str);
    }

    public MediaStreamTrack getTrackForId(String str, String str2) {
        return this.methodCallHandler.getTrackForId(str, str2);
    }

    @Override // defpackage.r30
    public void onAttachedToActivity(l40 l40Var) {
        this.methodCallHandler.setActivity((Activity) ((wrr) l40Var).b);
        this.observer = new LifeCycleObserver(this, 0);
        Lifecycle lifecycle = ((HiddenLifecycleReference) ((wrr) l40Var).c).getLifecycle();
        this.lifecycle = lifecycle;
        lifecycle.a(this.observer);
    }

    @Override // defpackage.tsr
    public void onAttachedToEngine(ssr ssrVar) {
        startListening(ssrVar.a, ssrVar.c, ssrVar.d);
    }

    @Override // defpackage.zeo
    public void onCancel(Object obj) {
        this.eventSink = null;
    }

    @Override // defpackage.r30
    public void onDetachedFromActivity() {
        this.methodCallHandler.setActivity(null);
        LifeCycleObserver lifeCycleObserver = this.observer;
        if (lifeCycleObserver != null) {
            this.lifecycle.d(lifeCycleObserver);
            Application application2 = application;
            if (application2 != null) {
                application2.unregisterActivityLifecycleCallbacks(this.observer);
            }
        }
        this.lifecycle = null;
    }

    @Override // defpackage.r30
    public void onDetachedFromActivityForConfigChanges() {
        this.methodCallHandler.setActivity(null);
    }

    @Override // defpackage.tsr
    public void onDetachedFromEngine(ssr ssrVar) {
        stopListening();
    }

    @Override // defpackage.zeo
    public void onListen(Object obj, xeo xeoVar) {
        this.eventSink = new AnyThreadSink(xeoVar);
    }

    @Override // defpackage.r30
    public void onReattachedToActivityForConfigChanges(l40 l40Var) {
        this.methodCallHandler.setActivity((Activity) ((wrr) l40Var).b);
    }

    public void sendEvent(Object obj) {
        xeo xeoVar = this.eventSink;
        if (xeoVar != null) {
            xeoVar.success(obj);
        }
    }

    /* loaded from: classes.dex */
    public class LifeCycleObserver implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {
        private LifeCycleObserver() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (FlutterWebRTCPlugin.this.methodCallHandler != null) {
                FlutterWebRTCPlugin.this.methodCallHandler.reStartCamera();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ /* synthetic */ void onCreate(pey peyVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ /* synthetic */ void onDestroy(pey peyVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ /* synthetic */ void onPause(pey peyVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(pey peyVar) {
            if (FlutterWebRTCPlugin.this.methodCallHandler != null) {
                FlutterWebRTCPlugin.this.methodCallHandler.reStartCamera();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ /* synthetic */ void onStart(pey peyVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ /* synthetic */ void onStop(pey peyVar) {
        }

        public /* synthetic */ LifeCycleObserver(FlutterWebRTCPlugin flutterWebRTCPlugin, int i) {
            this();
        }
    }
}
