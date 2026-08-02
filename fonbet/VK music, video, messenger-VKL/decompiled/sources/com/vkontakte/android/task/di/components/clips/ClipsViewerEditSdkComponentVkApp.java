package com.vkontakte.android.task.di.components.clips;

import com.ironsource.D1;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.attachments.api.di.ClipsAttachmentsComponent;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.clips.edit.impl.deps.features.ClipEditVkFeatures;
import com.vk.clips.upload.edit.api.ClipsUploadSdkEditComponent;
import com.vk.clips.upload.ui.api.di.ClipsUploadSdkUiComponent;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkComponent;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.clips.viewer.edit.api.di.ClipViewerEditSdkComponent;
import com.vk.clips.viewer.edit.di.ClipsViewerEditSdkComponentBase;
import com.vk.di.component.DiUnscopedComponent;
import com.vkontakte.android.task.di.components.clips.ClipsViewerEditSdkComponentVkApp;
import java.util.Collections;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fof;
import xsna.fpf0;
import xsna.fsk0;
import xsna.gzs;
import xsna.nwy;
import xsna.qcy;
import xsna.qsk0;

/* compiled from: ClipsViewerEditSdkComponentVkApp.kt */
/* loaded from: classes7.dex */
public final class ClipsViewerEditSdkComponentVkApp extends ClipsViewerEditSdkComponentBase {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nwy c;

    /* compiled from: ClipsViewerEditSdkComponentVkApp.kt */
    public static final class a implements b7m<ClipViewerEditSdkComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ClipsViewerEditSdkComponentVkApp((ClipsUploadSdkEditComponent) e7mVar.b(fpf0.a(ClipsUploadSdkEditComponent.class)), (ClipsUploadSdkUiComponent) e7mVar.b(fpf0.a(ClipsUploadSdkUiComponent.class)), (ClipsUploadSdkUploaderComponent) e7mVar.a(fpf0.a(ClipsUploadSdkUploaderComponent.class)), (ClipsAttachmentsComponent) e7mVar.a(fpf0.a(ClipsAttachmentsComponent.class)), (ClipsCoauthorsComponent) e7mVar.b(fpf0.a(ClipsCoauthorsComponent.class)), (ClipsUploadUiVkComponent) e7mVar.b(fpf0.a(ClipsUploadUiVkComponent.class)), (BridgeComponent) e7mVar.a(fpf0.a(BridgeComponent.class)), (ClipEditComponent) e7mVar.a(fpf0.a(ClipEditComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsViewerEditSdkComponentVkApp.class, D1.e, "getExternal()Lcom/vk/clips/viewer/edit/api/di/ClipsViewerEditExternalDeps;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
    }

    public ClipsViewerEditSdkComponentVkApp(final ClipsUploadSdkEditComponent clipsUploadSdkEditComponent, final ClipsUploadSdkUiComponent clipsUploadSdkUiComponent, final ClipsUploadSdkUploaderComponent clipsUploadSdkUploaderComponent, final ClipsAttachmentsComponent clipsAttachmentsComponent, final ClipsCoauthorsComponent clipsCoauthorsComponent, final ClipsUploadUiVkComponent clipsUploadUiVkComponent, final BridgeComponent bridgeComponent, final ClipEditComponent clipEditComponent) {
        this.c = new nwy(new gzs() { // from class: xsna.hof
            @Override // xsna.gzs
            public final Object invoke() {
                qcy<Object>[] qcyVarArr = ClipsViewerEditSdkComponentVkApp.d;
                return new uvd(ClipsUploadSdkEditComponent.this, clipsUploadSdkUiComponent, clipsUploadSdkUploaderComponent, clipsAttachmentsComponent, clipsCoauthorsComponent, clipsUploadUiVkComponent, bridgeComponent, clipEditComponent, Collections.singleton(ClipEditVkFeatures.All));
            }
        });
    }

    @Override // com.vk.clips.viewer.edit.di.ClipsViewerEditSdkComponentBase
    public final fsk0 Df() {
        return qsk0.a;
    }

    @Override // com.vk.clips.viewer.edit.api.di.ClipViewerEditSdkComponent
    public final fof k() {
        qcy<Object> qcyVar = d[0];
        return (fof) this.c.c();
    }
}
