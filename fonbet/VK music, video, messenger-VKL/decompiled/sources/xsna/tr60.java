package xsna;

import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import kotlin.InitializedLazyImpl;
import kotlin.Lazy;

/* compiled from: NewsfeedListScreenContext.kt */
/* loaded from: classes4.dex */
public final class tr60 {
    public final int a;
    public final String b;
    public final boolean c;
    public final Lazy<Boolean> d;
    public final boolean e;
    public final boolean f;
    public final FullSourceJoinApi.EntryServiceType g;
    public final c0x h;
    public final boolean i;
    public final VideoAutoPlayDelayType j;

    public tr60() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [xsna.bpn0] */
    public tr60(String str, boolean z, InitializedLazyImpl initializedLazyImpl, FullSourceJoinApi.EntryServiceType entryServiceType, c0x c0xVar, VideoAutoPlayDelayType videoAutoPlayDelayType, int i) {
        int i2 = (i & 1) != 0 ? 25 : 3;
        initializedLazyImpl = (i & 8) != 0 ? new bpn0(new hy2(23)) : initializedLazyImpl;
        boolean z2 = (i & 16) == 0;
        boolean z3 = (i & 32) != 0;
        entryServiceType = (i & 64) != 0 ? null : entryServiceType;
        c0xVar = (i & 128) != 0 ? new c0x(7) : c0xVar;
        boolean z4 = (i & 256) != 0;
        this.a = i2;
        this.b = str;
        this.c = z;
        this.d = initializedLazyImpl;
        this.e = z2;
        this.f = z3;
        this.g = entryServiceType;
        this.h = c0xVar;
        this.i = z4;
        this.j = videoAutoPlayDelayType;
    }
}
