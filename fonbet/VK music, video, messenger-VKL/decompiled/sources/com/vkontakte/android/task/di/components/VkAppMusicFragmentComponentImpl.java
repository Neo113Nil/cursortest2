package com.vkontakte.android.task.di.components;

import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.music.fragment.api.di.MusicFragmentComponent;
import com.vk.music.fragment.impl.MusicAddTrackToPlaylistLauncherImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.e3c0;
import xsna.ep;
import xsna.f9t;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gbt0;
import xsna.hpf0;
import xsna.nwy;
import xsna.ok40;
import xsna.pwj0;
import xsna.qcy;
import xsna.xk40;
import xsna.z0h0;

/* compiled from: VkAppMusicFragmentComponentImpl.kt */
/* loaded from: classes7.dex */
public final class VkAppMusicFragmentComponentImpl implements MusicFragmentComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final AppContextDiComponent a;
    public final nwy b = new nwy(new gbt0(this, 3));
    public final nwy c = new nwy(new z0h0(15));
    public final nwy d = new nwy(new e3c0(15));

    /* compiled from: VkAppMusicFragmentComponentImpl.kt */
    public static final class a implements c8m<MusicFragmentComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VkAppMusicFragmentComponentImpl((AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VkAppMusicFragmentComponentImpl.class, "addTrackToPlaylistLauncher", "getAddTrackToPlaylistLauncher()Lcom/vk/music/fragment/impl/MusicAddTrackToPlaylistLauncherImpl;", 0);
        hpf0 hpf0Var = fpf0.a;
        e = new qcy[]{propertyReference1Impl, fp.c(0, VkAppMusicFragmentComponentImpl.class, "musicFactory", "getMusicFactory()Lcom/vk/music/fragment/api/di/MusicFactory;", hpf0Var), ep.a(0, VkAppMusicFragmentComponentImpl.class, "musicFragmentNavigator", "getMusicFragmentNavigator()Lcom/vk/music/fragment/api/MusicFragmentNavigator;", hpf0Var)};
    }

    public VkAppMusicFragmentComponentImpl(AppContextDiComponent appContextDiComponent) {
        this.a = appContextDiComponent;
    }

    @Override // com.vk.music.fragment.api.di.MusicFragmentComponent
    public final ok40 Y1() {
        qcy<Object> qcyVar = e[1];
        return (ok40) this.c.c();
    }

    @Override // com.vk.music.fragment.api.di.MusicFragmentComponent
    public final f9t b6() {
        return f9t.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.music.fragment.api.di.MusicFragmentComponent
    public final MusicAddTrackToPlaylistLauncherImpl tc() {
        qcy<Object> qcyVar = e[0];
        return (MusicAddTrackToPlaylistLauncherImpl) this.b.c();
    }

    @Override // com.vk.music.fragment.api.di.MusicFragmentComponent
    public final xk40 v2() {
        qcy<Object> qcyVar = e[2];
        return (xk40) this.d.c();
    }
}
