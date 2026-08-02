package xsna;

import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.playlist.ModernPlaylistModel;
import kotlin.LazyThreadSafetyMode;

/* compiled from: AudioModels.kt */
/* loaded from: classes4.dex */
public final class cr4 {
    public final AudioModelsComponent a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public cr4(AudioModelsComponent audioModelsComponent) {
        this.a = audioModelsComponent;
        z4 z4Var = new z4(this, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, z4Var);
        this.c = msy.a(lazyThreadSafetyMode, new fn4(1));
        this.d = msy.a(lazyThreadSafetyMode, new defpackage.e(this, 7));
        this.e = msy.a(lazyThreadSafetyMode, new defpackage.f(this, 2));
        this.f = msy.a(lazyThreadSafetyMode, new uv0(3));
        this.g = msy.a(lazyThreadSafetyMode, new vv0(2));
        this.h = msy.a(lazyThreadSafetyMode, new iz3(1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final u2b0 a() {
        return (u2b0) this.b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ModernPlaylistModel b() {
        return (ModernPlaylistModel) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final a630 c() {
        return (a630) this.h.getValue();
    }
}
