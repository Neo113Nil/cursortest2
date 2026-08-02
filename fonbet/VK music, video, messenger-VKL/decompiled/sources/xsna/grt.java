package xsna;

import com.vk.api.generated.fave.dto.FaveGetPagesResponseDto;

/* compiled from: FaveGetRequestProvider.kt */
/* loaded from: classes4.dex */
public final class grt extends com.vk.api.request.rx.batch.a<iqq, FaveGetPagesResponseDto, iqq> {
    @Override // com.vk.api.request.rx.batch.a
    public final iqq K0(bv6<iqq> bv6Var, bv6<FaveGetPagesResponseDto> bv6Var2) {
        iqq iqqVar = bv6Var.a;
        Integer valueOf = Integer.valueOf(bv6Var2.a.getCount());
        return new iqq(iqqVar.c, iqqVar.d, iqqVar.a, valueOf);
    }
}
