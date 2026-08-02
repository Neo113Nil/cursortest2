package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.model.GifItem;
import com.vk.dto.stories.model.GifWithQueryData;
import com.vk.lists.c;
import kotlin.collections.EmptyList;

/* compiled from: GifSearchPagedDataProvider.kt */
/* loaded from: classes15.dex */
public final class zyt implements c.m<VKList<GifItem>> {
    public final czt b;
    public final syt c;
    public final io.reactivex.rxjava3.disposables.b d;
    public final gzs<String> e;
    public final wzs<Boolean, Boolean, s3q0> f;
    public final gzs<Boolean> g;

    /* JADX WARN: Multi-variable type inference failed */
    public zyt(czt cztVar, syt sytVar, io.reactivex.rxjava3.disposables.b bVar, gzs<String> gzsVar, wzs<? super Boolean, ? super Boolean, s3q0> wzsVar, gzs<Boolean> gzsVar2) {
        this.b = cztVar;
        this.c = sytVar;
        this.d = bVar;
        this.e = gzsVar;
        this.f = wzsVar;
        this.g = gzsVar2;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<VKList<GifItem>> O9(String str, com.vk.lists.c cVar) {
        if (!this.g.invoke().booleanValue()) {
            return io.reactivex.rxjava3.core.q.T(new VKList());
        }
        return syt.d(this.c, this.e.invoke(), str, 4);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<VKList<GifItem>> hj(com.vk.lists.c cVar, boolean z) {
        czt cztVar = this.b;
        cztVar.d = true;
        cztVar.c = null;
        cztVar.b = GifWithQueryData.zb(cztVar.b, null, EmptyList.b, 1);
        return O9("", cVar);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<VKList<GifItem>> qVar, boolean z, com.vk.lists.c cVar) {
        asu0 asu0Var = asu0.a;
        this.d.b(qVar.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new xf1(new dq1(this, cVar, z), 26), new az(new eq1(this, z, 1), 26)));
    }
}
