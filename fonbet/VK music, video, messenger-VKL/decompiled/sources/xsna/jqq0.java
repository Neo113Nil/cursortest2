package xsna;

import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;

/* compiled from: UserProfileInterestingStoriesBlockViewHolder.kt */
/* loaded from: classes5.dex */
public final class jqq0 extends aq6<UserProfileAdapterItem.s> {
    public final kex n;
    public final slq0 o;

    public jqq0(kex kexVar, hpq0 hpq0Var) {
        super(kexVar);
        this.n = kexVar;
        this.o = hpq0Var;
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        UserProfileAdapterItem.s sVar = (UserProfileAdapterItem.s) obj;
        if (sVar == null) {
            return;
        }
        iqq0 iqq0Var = new iqq0(this);
        kex kexVar = this.n;
        kexVar.setOnClickListener(iqq0Var);
        kexVar.setData(sVar.c);
    }
}
