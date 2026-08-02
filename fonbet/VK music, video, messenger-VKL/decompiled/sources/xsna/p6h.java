package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;

/* compiled from: CommunityJoinDelegateFactoryImpl.kt */
/* loaded from: classes5.dex */
public final class p6h implements o6h {
    public final o0r0 a;
    public final gxh b;

    public p6h(o0r0 o0r0Var, gxh gxhVar) {
        this.a = o0r0Var;
        this.b = gxhVar;
    }

    @Override // xsna.o6h
    public final n6h b(Context context, b3i b3iVar, zzx zzxVar, x2i x2iVar, wzs<? super UserId, ? super Integer, s3q0> wzsVar) {
        return new s6h(context, b3iVar, this.a, this.b, zzxVar, x2iVar, wzsVar);
    }
}
