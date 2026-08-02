package xsna;

import com.vk.clips.viewer.impl.grid.b;
import com.vk.clips.viewer.impl.grid.lists.ClipsGridTabData;
import com.vk.dto.shortvideo.ClipGridParams;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import xsna.wfu;

/* compiled from: CommonGridLoadPresenter.kt */
/* loaded from: classes17.dex */
public final class ckg implements ufu {
    public final wee a;
    public final ClipGridParams b;
    public final b.a c;
    public final mce d;
    public final gxe e;
    public final hld f;
    public final ConcurrentHashMap<wfu, wfu.a> g = new ConcurrentHashMap<>();

    /* compiled from: CommonGridLoadPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsGridTabData.values().length];
            try {
                iArr[ClipsGridTabData.CommonClips.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ckg(wee weeVar, ClipGridParams clipGridParams, b.a aVar, mce mceVar, gxe gxeVar, hld hldVar) {
        this.a = weeVar;
        this.b = clipGridParams;
        this.c = aVar;
        this.d = mceVar;
        this.e = gxeVar;
        this.f = hldVar;
    }

    @Override // xsna.ufu
    public final void G0() {
        Iterator<T> it = this.g.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((wfu) entry.getKey()).a((wfu.a) entry.getValue(), EmptyList.b);
        }
    }

    @Override // xsna.ufu
    public final sde a(ClipsGridTabData clipsGridTabData) {
        if (a.$EnumSwitchMapping$0[clipsGridTabData.ordinal()] == 1) {
            return this.d;
        }
        com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Stub clips delegate returned from " + qjg.a(this) + " for tab type = " + clipsGridTabData));
        ane aneVar = new ane();
        rdi.F(aneVar);
        return aneVar;
    }

    @Override // xsna.ufu
    public final void b(boolean z) {
        pgn pgnVar = this.d.i;
        qcy<Object> qcyVar = mce.j[0];
        pgnVar.b(null);
    }

    @Override // xsna.ufu
    public final void e(wfu wfuVar, wfu.a aVar) {
        this.g.put(wfuVar, aVar);
        wfuVar.a(aVar, EmptyList.b);
        if (aVar instanceof wfu.a.C3931a) {
            this.c.invoke(Boolean.valueOf(((wfu.a.C3931a) aVar).b.a != null));
        }
    }

    @Override // xsna.ufu
    public final wfu f() {
        return new gkg(this.e, this.f, this.a, this.b);
    }

    @Override // xsna.ufu
    public final wfu g(wfu wfuVar, wfu.a aVar) {
        fde fdeVar;
        if (!(wfuVar instanceof gkg)) {
            return null;
        }
        boolean z = aVar instanceof wfu.a.C3931a;
        wfu.a.C3931a c3931a = z ? (wfu.a.C3931a) aVar : null;
        ClipGridParams clipGridParams = (c3931a == null || (fdeVar = c3931a.a) == null) ? null : fdeVar.a;
        if (clipGridParams == null) {
            clipGridParams = this.b;
        }
        return new ilg(z ? (wfu.a.C3931a) aVar : null, this.d, this.a, clipGridParams);
    }

    @Override // xsna.ufu
    public final void c() {
    }

    @Override // xsna.ufu
    public final void d(ClipGridParams clipGridParams) {
    }
}
