package xsna;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.vk.dto.common.id.UserId;

/* compiled from: CommunityLeaveDelegateFactoryImpl.kt */
/* loaded from: classes5.dex */
public final class d7h implements c7h {
    public final o0r0 a;
    public final a1w b;
    public final gxh c;

    public d7h(o0r0 o0r0Var, a1w a1wVar, gxh gxhVar) {
        this.a = o0r0Var;
        this.b = a1wVar;
        this.c = gxhVar;
    }

    @Override // xsna.c7h
    public final b7h b(Context context, Fragment fragment, b3i b3iVar, x2i x2iVar, wzs<? super UserId, ? super Integer, s3q0> wzsVar) {
        return new j7h(context, this.c, this.a, this.b, b3iVar, wzsVar, fragment, x2iVar);
    }
}
