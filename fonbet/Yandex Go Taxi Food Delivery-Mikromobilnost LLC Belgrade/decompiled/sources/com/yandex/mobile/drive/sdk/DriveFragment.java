package com.yandex.mobile.drive.sdk;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.yandex.mobile.drive.drive_native_features.b;
import defpackage.a9z;
import defpackage.bcz;
import defpackage.bfm;
import defpackage.dfm;
import defpackage.ea20;
import defpackage.jfm;
import defpackage.mfm;
import defpackage.s6z;
import defpackage.shm;
import defpackage.tsr;
import defpackage.wdm;
import defpackage.x30;
import defpackage.xrr;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/yandex/mobile/drive/sdk/DriveFragment;", "Lio/flutter/embedding/android/FlutterFragment;", "<init>", "()V", "", "registerPlugins", "()Z", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDetach", "Lx30;", "activityComponent", "Lx30;", "Companion", "wdm", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public class DriveFragment extends FlutterFragment {
    public static final wdm Companion = new wdm();
    public static final String KEY_REGISTER_PLUGINS = "key.plugins.register";
    private x30 activityComponent;

    private final boolean registerPlugins() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getBoolean(KEY_REGISTER_PLUGINS);
    }

    @Override // io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        requireActivity();
    }

    @Override // io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FlutterEngine flutterEngine = getFlutterEngine();
        if (registerPlugins()) {
            GeneratedPluginRegistrant.registerWith(flutterEngine);
        }
        dfm dfmVar = new dfm();
        new a9z(flutterEngine.c);
        xrr xrrVar = flutterEngine.d;
        tsr l = xrrVar.l(mfm.class);
        if (!(l instanceof mfm)) {
            l = null;
        }
        mfm mfmVar = (mfm) l;
        xrrVar.l(jfm.class);
        xrrVar.l(shm.class);
        if (mfmVar != null) {
            mfmVar.a();
        }
        if (((s6z) bfm.i.e.get()) == null) {
            bcz bczVar = b.A;
            bczVar.a.addIfAbsent(dfmVar);
            Location location = bczVar.b;
            if (location != null) {
                dfm.a(location);
            }
        }
        if (mfmVar != null) {
            HashMap h = kotlin.collections.b.h(new Pair("session", null), new Pair("link", null));
            ea20 ea20Var = mfmVar.b;
            if (ea20Var != null) {
                ea20Var.a("start", h, null);
            }
        }
    }
}
