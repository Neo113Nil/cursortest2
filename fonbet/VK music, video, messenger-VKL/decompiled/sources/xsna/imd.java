package xsna;

import com.vk.clips.coauthors.di.ClipsCoauthorsInternalComponent;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipsCoauthorsInteractorImpl.kt */
/* loaded from: classes16.dex */
public final class imd implements hmd {
    public final ClipsCoauthorsInternalComponent a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new m1(this, 20));

    public imd(ClipsCoauthorsInternalComponent clipsCoauthorsInternalComponent) {
        this.a = clipsCoauthorsInternalComponent;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hmd
    public final io.reactivex.rxjava3.core.x<ClipVideoFile> a(UserId userId, ClipVideoFile clipVideoFile) {
        return io.reactivex.rxjava3.core.x.j(((qmd) this.b.getValue()).b(clipVideoFile.c, clipVideoFile.b, Collections.singletonList(userId), false).U(new o40(new defpackage.h0(6, clipVideoFile, userId), 7)));
    }
}
