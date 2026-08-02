package com.vkontakte.android.task.di.components.clips;

import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.editor.di.ClipsEditorComponent;
import com.vk.clips.editor.di.ClipsEditorComponentBase;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.movika.sdk.base.model.props.d;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vkontakte.android.task.di.components.clips.ClipsEditorComponentVkApp;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.dhr0;
import xsna.e7m;
import xsna.fp;
import xsna.fpf0;
import xsna.gzs;
import xsna.nwy;
import xsna.qcy;
import xsna.xnf;

/* compiled from: ClipsEditorComponentVkApp.kt */
/* loaded from: classes7.dex */
public final class ClipsEditorComponentVkApp extends ClipsEditorComponentBase {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(ClipsEditorComponentVkApp.class, "viewColorSchemeProvider", "getViewColorSchemeProvider()Lcom/vk/sdk/clips/theme/view/ClipsViewThemeProvider;", 0), fp.c(0, ClipsEditorComponentVkApp.class, "clipsExternalProvider", "getClipsExternalProvider()Lcom/vk/clips/editor/model/ClipsExternalProvider;", fpf0.a)};
    public final nwy a = new nwy(new d(15));
    public final nwy b;

    /* compiled from: ClipsEditorComponentVkApp.kt */
    public static final class a implements b7m<ClipsEditorComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ClipsEditorComponentVkApp((MediaPipelineComponent) e7mVar.a(fpf0.a(MediaPipelineComponent.class)), (DataRepositoryComponent) e7mVar.a(fpf0.a(DataRepositoryComponent.class)), (ClipsUploadUiVkComponent) e7mVar.b(fpf0.a(ClipsUploadUiVkComponent.class)), (CameraClipsComponent) e7mVar.a(fpf0.a(CameraClipsComponent.class)), (ClipsViewerComponent) e7mVar.a(fpf0.a(ClipsViewerComponent.class)), (ClipsConfigAuthorsComponent) e7mVar.a(fpf0.a(ClipsConfigAuthorsComponent.class)), (ClipsBlacklistsComponent) e7mVar.a(fpf0.a(ClipsBlacklistsComponent.class)));
        }
    }

    /* compiled from: ClipsEditorComponentVkApp.kt */
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

    public ClipsEditorComponentVkApp(final MediaPipelineComponent mediaPipelineComponent, final DataRepositoryComponent dataRepositoryComponent, final ClipsUploadUiVkComponent clipsUploadUiVkComponent, final CameraClipsComponent cameraClipsComponent, final ClipsViewerComponent clipsViewerComponent, final ClipsConfigAuthorsComponent clipsConfigAuthorsComponent, final ClipsBlacklistsComponent clipsBlacklistsComponent) {
        this.b = new nwy(new gzs() { // from class: xsna.bxd
            @Override // xsna.gzs
            public final Object invoke() {
                qcy<Object>[] qcyVarArr = ClipsEditorComponentVkApp.c;
                cxd cxdVar = new cxd(new bpn0(new zy(clipsConfigAuthorsComponent, 24)), new bpn0(new yg(clipsBlacklistsComponent, 24)));
                gxh D = dataRepositoryComponent.D();
                com.vk.clips.upload.vk.ui.api.a V0 = clipsUploadUiVkComponent.V0();
                rhd p9 = cameraClipsComponent.p9();
                ClipsViewerComponent clipsViewerComponent2 = clipsViewerComponent;
                ibr0 pe = clipsViewerComponent2.pe();
                n7d k9 = clipsViewerComponent2.k9();
                d2e d2eVar = new d2e();
                nbl0 nbl0Var = new nbl0();
                rj01 rj01Var = new rj01();
                rj01Var.b = new bpn0(new k5f0(15));
                ryd rydVar = new ryd();
                os9 os9Var = new os9(MediaPipelineComponent.this, 5);
                fo50 fo50Var = new fo50();
                gxd gxdVar = new gxd();
                o4p o4pVar = new o4p(D, V0, p9, pe, k9);
                cmf cmfVar = new cmf();
                ayd aydVar = new ayd();
                ixd ixdVar = new ixd();
                f1e f1eVar = new f1e();
                os9 os9Var2 = new os9(qsk0.a, 4);
                bpn0 bpn0Var = pla.a;
                if (bpn0Var == null) {
                    bpn0Var = null;
                }
                e2e e2eVar = new e2e(nbl0Var, rj01Var, rydVar, os9Var, fo50Var, gxdVar, o4pVar, d2eVar, cmfVar, aydVar, cxdVar, ixdVar, f1eVar, os9Var2, new kne(((wvw) bpn0Var.getValue()).b()));
                ad0.g = ixdVar;
                return e2eVar;
            }
        });
    }
}
