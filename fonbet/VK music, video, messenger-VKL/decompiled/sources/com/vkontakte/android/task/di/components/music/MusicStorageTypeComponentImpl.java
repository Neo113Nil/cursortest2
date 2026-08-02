package com.vkontakte.android.task.di.components.music;

import com.vk.di.component.DiScopedComponent;
import com.vk.music.offline.api.di.StorageTypeComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a68;
import xsna.c8m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.h850;
import xsna.hpf0;
import xsna.i850;
import xsna.nwy;
import xsna.o850;
import xsna.pwj0;
import xsna.qcy;
import xsna.ug9;
import xsna.z58;

/* compiled from: MusicStorageTypeComponentImpl.kt */
/* loaded from: classes11.dex */
public final class MusicStorageTypeComponentImpl implements StorageTypeComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nwy a = new nwy(new z58(7));
    public final nwy b = new nwy(new a68(10));
    public final nwy c = new nwy(new ug9(6));

    /* compiled from: MusicStorageTypeComponentImpl.kt */
    public static final class a implements c8m<StorageTypeComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MusicStorageTypeComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MusicStorageTypeComponentImpl.class, "storageAlertDisplay", "getStorageAlertDisplay()Lcom/vk/music/offline/api/util/MusicStorageAlertDisplay;", 0);
        hpf0 hpf0Var = fpf0.a;
        d = new qcy[]{propertyReference1Impl, fp.c(0, MusicStorageTypeComponentImpl.class, "storageEventRepository", "getStorageEventRepository()Lcom/vk/music/offline/api/domain/repository/MusicStorageEventRepository;", hpf0Var), ep.a(0, MusicStorageTypeComponentImpl.class, "storageTypeRepository", "getStorageTypeRepository()Lcom/vk/music/offline/api/domain/repository/MusicStorageTypeRepository;", hpf0Var)};
    }

    @Override // com.vk.music.offline.api.di.StorageTypeComponent
    public final o850 Y7() {
        qcy<Object> qcyVar = d[2];
        return (o850) this.c.c();
    }

    @Override // com.vk.music.offline.api.di.StorageTypeComponent
    public final h850 j3() {
        qcy<Object> qcyVar = d[0];
        return (h850) this.a.c();
    }

    @Override // com.vk.music.offline.api.di.StorageTypeComponent
    public final i850 rb() {
        qcy<Object> qcyVar = d[1];
        return (i850) this.b.c();
    }
}
