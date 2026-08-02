package com.vkontakte.android.task.di.components.clips;

import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.media.pipeline.di.MediaPipelineComponentBase;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ep;
import xsna.f100;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hpf0;
import xsna.ml7;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.u210;
import xsna.uw3;

/* compiled from: MediaPipelineComponentVkApp.kt */
/* loaded from: classes7.dex */
public final class MediaPipelineComponentVkApp extends MediaPipelineComponentBase {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nwy b;
    public final nwy a = new nwy(new ml7(15));
    public final nwy c = new nwy(new uw3(20));

    /* compiled from: MediaPipelineComponentVkApp.kt */
    public static final class a implements c8m<MediaPipelineComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MediaPipelineComponentVkApp((ClipsConfigAuthorsComponent) g8mVar.a(fpf0.a(ClipsConfigAuthorsComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MediaPipelineComponentVkApp.class, "mediaPipelineLogger", "getMediaPipelineLogger()Lcom/vk/media/logger/Logger;", 0);
        hpf0 hpf0Var = fpf0.a;
        d = new qcy[]{propertyReference1Impl, fp.c(0, MediaPipelineComponentVkApp.class, "mediaPipelineConfig", "getMediaPipelineConfig()Lcom/vk/media/pipeline/config/PipelineConfig;", hpf0Var), ep.a(0, MediaPipelineComponentVkApp.class, "analyticsListenerProvider", "getAnalyticsListenerProvider()Lkotlin/jvm/functions/Function0;", hpf0Var)};
    }

    public MediaPipelineComponentVkApp(ClipsConfigAuthorsComponent clipsConfigAuthorsComponent) {
        this.b = new nwy(new u210(clipsConfigAuthorsComponent, 3));
    }

    @Override // com.vk.media.pipeline.di.MediaPipelineComponent
    public final f100 Gd() {
        qcy<Object> qcyVar = d[0];
        return (f100) this.a.c();
    }
}
