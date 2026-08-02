package xsna;

import com.vk.search.discover.query.SearchQueryValueHelper;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class xxh0 implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xxh0(boolean z, SearchQueryValueHelper searchQueryValueHelper, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        return Boolean.valueOf(!((Boolean) pair.g()).booleanValue() ? this.c && ((SearchQueryValueHelper.a) pair.d()).b == SearchQueryValueHelper.ChangeType.SILENT : this.b);
    }
}
