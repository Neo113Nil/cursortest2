package xsna;

import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.shortvideo.ClipGridParams;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.wfu;

/* compiled from: CommonPageGrid.kt */
/* loaded from: classes17.dex */
public final class ilg extends bkg {
    public final wfu.a.C3931a c;
    public final mce d;

    public ilg(wfu.a.C3931a c3931a, mce mceVar, wee weeVar, ClipGridParams clipGridParams) {
        super(clipGridParams, weeVar);
        this.c = c3931a;
        this.d = mceVar;
    }

    @Override // xsna.wfu
    public final void a(wfu.a aVar, List<ClipGridParams.Data.Profile> list) {
        wfu.a.C3931a c3931a;
        ClipGridParams clipGridParams = this.b;
        ClipGridParams.Data data = clipGridParams instanceof ClipGridParams.Data ? (ClipGridParams.Data) clipGridParams : null;
        boolean z = aVar instanceof wfu.a.c;
        wee weeVar = this.a;
        if (!z || data == null || (c3931a = this.c) == null) {
            weeVar.jm(null);
            return;
        }
        this.d.j(data, ((wfu.a.c) aVar).a, c3931a.b, true);
        weeVar.ql(false, false, false, false);
        weeVar.Yi();
    }

    @Override // xsna.wfu
    public final io.reactivex.rxjava3.core.x<wfu.a> b() {
        mce mceVar = this.d;
        ClipGridParams clipGridParams = this.b;
        mceVar.a = clipGridParams;
        mceVar.e = PaginationKey.Initial.b;
        mceVar.g = EmptyList.b;
        return (clipGridParams instanceof ClipGridParams.Data.Profile ? mceVar.b((ClipGridParams.Data.Profile) clipGridParams) : mceVar.i(clipGridParams)).l(new b8(new py(13), 14));
    }
}
