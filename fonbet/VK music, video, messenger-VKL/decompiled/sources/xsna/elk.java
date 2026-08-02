package xsna;

import com.vk.dto.music.Curator;

/* compiled from: PersonEvents.kt */
/* loaded from: classes3.dex */
public final class elk implements yj40 {
    public final boolean a;
    public final String b;

    public elk(Curator curator, boolean z) {
        this.a = z;
        this.b = "curatorId=" + curator.b + " isFollowed=" + z;
    }

    @Override // xsna.yj40
    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "CuratorFollowed";
    }
}
