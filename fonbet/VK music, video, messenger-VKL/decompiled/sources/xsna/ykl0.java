package xsna;

import com.vk.dto.common.GoodAlbum;
import xsna.sjl0;

/* compiled from: StorefrontAlbumsSuccess.kt */
/* loaded from: classes18.dex */
public final class ykl0 implements gzs<s3q0> {
    public final /* synthetic */ izs<sjl0, s3q0> b;
    public final /* synthetic */ GoodAlbum c;
    public final /* synthetic */ int d;

    /* JADX WARN: Multi-variable type inference failed */
    public ykl0(izs<? super sjl0, s3q0> izsVar, GoodAlbum goodAlbum, int i) {
        this.b = izsVar;
        this.c = goodAlbum;
        this.d = i;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        this.b.invoke(new sjl0.a.C3669a(this.c, this.d));
        return s3q0.a;
    }
}
