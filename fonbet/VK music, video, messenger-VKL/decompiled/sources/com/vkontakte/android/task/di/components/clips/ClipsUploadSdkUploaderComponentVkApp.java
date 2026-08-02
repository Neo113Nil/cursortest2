package com.vkontakte.android.task.di.components.clips;

import com.ironsource.D1;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.clips.uploader.impl.ClipsUploadSdkUploaderComponentBase;
import com.vk.di.component.DiScopedComponent;
import defpackage.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.fsk0;
import xsna.g8m;
import xsna.nlf;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.qsk0;
import xsna.wv0;
import xsna.xy0;

/* compiled from: ClipsUploadSdkUploaderComponentVkApp.kt */
/* loaded from: classes7.dex */
public final class ClipsUploadSdkUploaderComponentVkApp extends ClipsUploadSdkUploaderComponentBase {
    public static final /* synthetic */ qcy<Object>[] g = {new PropertyReference1Impl(ClipsUploadSdkUploaderComponentVkApp.class, "draftsProvider", "getDraftsProvider()Lcom/vk/clips/sdk/drafts/dbmodels/ClipsSdkDraftsInteractor;", 0), fp.c(0, ClipsUploadSdkUploaderComponentVkApp.class, D1.e, "getExternal()Lcom/vk/clips/uploader/api/external/ClipsUploaderExternalDeps;", fpf0.a)};
    public final xy0 d;
    public final nwy e = new nwy(new i(this, 27));
    public final nwy f = new nwy(new wv0(6));

    /* compiled from: ClipsUploadSdkUploaderComponentVkApp.kt */
    public static final class a implements c8m<ClipsUploadSdkUploaderComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipsUploadSdkUploaderComponentVkApp(new xy0(8, ((AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class))).s(), g8mVar));
        }
    }

    public ClipsUploadSdkUploaderComponentVkApp(xy0 xy0Var) {
        this.d = xy0Var;
    }

    @Override // com.vk.clips.uploader.impl.ClipsUploadSdkUploaderComponentBase
    public final fsk0 Df() {
        return qsk0.a;
    }

    @Override // com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent
    public final nlf k() {
        qcy<Object> qcyVar = g[1];
        return (nlf) this.f.c();
    }
}
