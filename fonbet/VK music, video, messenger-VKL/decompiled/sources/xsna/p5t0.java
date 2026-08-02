package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoListWithTotalCount;
import xsna.l5t0;
import xsna.m5t0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class p5t0 implements izs {
    public final /* synthetic */ l5t0.b b;
    public final /* synthetic */ m5t0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ UserId e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ m5t0.a.C3323a i;

    public /* synthetic */ p5t0(l5t0.b bVar, m5t0 m5t0Var, int i, UserId userId, String str, boolean z, String str2, m5t0.a.C3323a c3323a) {
        this.b = bVar;
        this.c = m5t0Var;
        this.d = i;
        this.e = userId;
        this.f = str;
        this.g = z;
        this.h = str2;
        this.i = c3323a;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VideoListWithTotalCount videoListWithTotalCount = (VideoListWithTotalCount) obj;
        VideoFile videoFile = (VideoFile) j5g.a0(videoListWithTotalCount.b);
        if (videoFile != null) {
            return io.reactivex.rxjava3.core.x.k(videoFile);
        }
        l5t0.b bVar = this.b;
        int i = bVar.a;
        int i2 = bVar.b;
        int i3 = i + i2;
        int i4 = videoListWithTotalCount.c;
        int i5 = this.d;
        UserId userId = this.e;
        if (i3 >= i4) {
            return io.reactivex.rxjava3.core.x.i(new IllegalArgumentException("Playlist " + userId + '-' + i5 + " has no videos"));
        }
        l5t0.b bVar2 = new l5t0.b(i3, i2);
        String str = this.f;
        boolean z = this.g;
        String str2 = this.h;
        m5t0.a.C3323a c3323a = this.i;
        m5t0.a aVar = new m5t0.a(i5, userId, str, bVar2, z, str2, c3323a);
        m5t0 m5t0Var = this.c;
        return new io.reactivex.rxjava3.internal.operators.single.r(m5t0Var.a(aVar), new he40(new p5t0(bVar2, m5t0Var, i5, userId, str, z, str2, c3323a), 16));
    }
}
