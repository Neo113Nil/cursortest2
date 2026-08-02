package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.id.UserId;

/* compiled from: CommentsProviderImpl.kt */
/* loaded from: classes17.dex */
public final class agg implements zfg {
    @Override // xsna.zfg
    public final f3g0 a(View view, UserId userId, boolean z, boolean z2, pm01 pm01Var) {
        return new f3g0(view, userId, z, z2, pm01Var);
    }

    @Override // xsna.zfg
    public final d8q b(ViewGroup viewGroup, eeg eegVar, gzs gzsVar) {
        return new d8q(viewGroup, new yeg(eegVar), new g3f0((z2f0) null, 3), gzsVar, true);
    }

    @Override // xsna.zfg
    public final pvn c() {
        return new pvn(new k0x(4), false);
    }
}
