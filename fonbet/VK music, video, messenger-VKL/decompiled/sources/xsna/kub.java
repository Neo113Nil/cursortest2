package xsna;

import android.os.Bundle;
import com.vk.dialogslist.impl.DialogsFragment;

/* compiled from: ChatPreviewComponent.kt */
/* loaded from: classes18.dex */
public final class kub extends yj50<mub, vub, rub, tub, uub, pub, qub> {
    public final a1w n;
    public final mxv o;

    public kub(DialogsFragment dialogsFragment, a1w a1wVar, mxv mxvVar) {
        super(dialogsFragment, dialogsFragment, rub.class, false);
        this.n = a1wVar;
        this.o = mxvVar;
    }

    @Override // xsna.yj50
    public final mub a(Bundle bundle) {
        return new mub(new tum(this.n));
    }

    @Override // xsna.yj50
    public final qub b() {
        return new qub();
    }

    @Override // xsna.yj50
    public final tub d() {
        return new tub(this.n);
    }
}
