package com.vkontakte.android.task.di.components.clips;

import com.ironsource.D1;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vk.clips.upload.ui.api.di.ClipsUploadSdkUiComponent;
import com.vk.clips.upload.ui.impl.ClipsUploadSdkUiComponentBase;
import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fn4;
import xsna.fp;
import xsna.fpf0;
import xsna.nh;
import xsna.nwy;
import xsna.qcy;
import xsna.rkf;

/* compiled from: ClipsUploadSdkUiComponentVkApp.kt */
/* loaded from: classes7.dex */
public final class ClipsUploadSdkUiComponentVkApp extends ClipsUploadSdkUiComponentBase {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(ClipsUploadSdkUiComponentVkApp.class, IronSourceConstants.EVENTS_PROVIDER, "getProvider()Lcom/vk/clips/upload/ui/impl/provider/ClipsUploadSdkUiProvider;", 0), fp.c(0, ClipsUploadSdkUiComponentVkApp.class, D1.e, "getExternal()Lcom/vk/clips/upload/ui/api/di/ClipsUploadUiExternalDeps;", fpf0.a)};
    public final nwy a = new nwy(new fn4(5));
    public final nwy b = new nwy(new nh(5));

    /* compiled from: ClipsUploadSdkUiComponentVkApp.kt */
    public static final class a implements b7m<ClipsUploadSdkUiComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ClipsUploadSdkUiComponentVkApp();
        }
    }

    @Override // com.vk.clips.upload.ui.api.di.ClipsUploadSdkUiComponent
    public final rkf k() {
        qcy<Object> qcyVar = c[1];
        return (rkf) this.b.c();
    }
}
