package com.vkontakte.android.task.di.components.clips;

import com.ironsource.D1;
import com.vk.clips.upload.edit.api.ClipsUploadSdkEditComponent;
import com.vk.clips.upload.edit.impl.ClipsUploadSdkEditComponentBase;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.media.filters.di.FiltersComponent;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.media.playback.di.MediaPlaybackComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.cj4;
import xsna.dhr0;
import xsna.e7m;
import xsna.fp;
import xsna.fpf0;
import xsna.mef;
import xsna.nwy;
import xsna.qcy;
import xsna.tj2;
import xsna.xnf;

/* compiled from: ClipsUploadSdkEditComponentVkApp.kt */
/* loaded from: classes7.dex */
public final class ClipsUploadSdkEditComponentVkApp extends ClipsUploadSdkEditComponentBase {
    public static final /* synthetic */ qcy<Object>[] h = {new PropertyReference1Impl(ClipsUploadSdkEditComponentVkApp.class, "viewColorSchemeProvider", "getViewColorSchemeProvider()Lcom/vk/sdk/clips/theme/view/ClipsViewThemeProvider;", 0), fp.c(0, ClipsUploadSdkEditComponentVkApp.class, D1.e, "getExternal()Lcom/vk/clips/upload/edit/api/ClipsUploadEditExternalDeps;", fpf0.a)};
    public final nwy f;
    public final nwy g;

    /* compiled from: ClipsUploadSdkEditComponentVkApp.kt */
    public static final class a implements b7m<ClipsUploadSdkEditComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ClipsUploadSdkEditComponentVkApp((FiltersComponent) e7mVar.b(fpf0.a(FiltersComponent.class)), (MediaPipelineComponent) e7mVar.a(fpf0.a(MediaPipelineComponent.class)), (MediaPlaybackComponent) e7mVar.b(fpf0.a(MediaPlaybackComponent.class)));
        }
    }

    /* compiled from: ClipsUploadSdkEditComponentVkApp.kt */
    public static final class b implements xnf {
        public final int a;

        public b() {
            dhr0.a.getClass();
            this.a = dhr0.u().c;
            int i = dhr0.z().c;
        }

        @Override // xsna.xnf
        public final int a() {
            return this.a;
        }
    }

    public ClipsUploadSdkEditComponentVkApp(FiltersComponent filtersComponent, MediaPipelineComponent mediaPipelineComponent, MediaPlaybackComponent mediaPlaybackComponent) {
        super(filtersComponent, mediaPipelineComponent, mediaPlaybackComponent);
        this.f = new nwy(new cj4(8));
        this.g = new nwy(new tj2(6));
        k().f();
    }

    @Override // com.vk.clips.upload.edit.impl.ClipsUploadSdkEditComponentBase
    public final xnf Df() {
        qcy<Object> qcyVar = h[0];
        return (xnf) this.f.c();
    }

    @Override // com.vk.clips.upload.edit.api.ClipsUploadSdkEditComponent
    public final mef k() {
        qcy<Object> qcyVar = h[1];
        return (mef) this.g.c();
    }
}
