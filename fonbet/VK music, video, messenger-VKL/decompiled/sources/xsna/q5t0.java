package xsna;

import com.vk.dto.common.id.UserId;
import xsna.l5t0;
import xsna.m5t0;

/* compiled from: VideoPlaylistsRepositoryExt.kt */
/* loaded from: classes7.dex */
public final class q5t0 {
    public static final io.reactivex.rxjava3.internal.operators.single.r a(m5t0 m5t0Var, int i, UserId userId, String str, boolean z, String str2, m5t0.a.C3323a c3323a) {
        l5t0.b bVar = new l5t0.b(0, 5);
        return new io.reactivex.rxjava3.internal.operators.single.r(m5t0Var.a(new m5t0.a(i, userId, str, bVar, z, str2, c3323a)), new he40(new p5t0(bVar, m5t0Var, i, userId, str, z, str2, c3323a), 16));
    }
}
