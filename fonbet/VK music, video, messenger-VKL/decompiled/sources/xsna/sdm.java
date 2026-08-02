package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

/* compiled from: DialogFooterActionsComponent.kt */
/* loaded from: classes2.dex */
public final class sdm extends j8i {
    public tdm i;

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        tdm tdmVar = new tdm(viewStub);
        this.i = tdmVar;
        return (View) tdmVar.b;
    }

    @Override // xsna.j8i
    public final void N0() {
        this.i = null;
    }
}
