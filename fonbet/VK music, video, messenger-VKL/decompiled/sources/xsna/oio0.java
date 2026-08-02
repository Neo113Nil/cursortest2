package xsna;

import android.view.inputmethod.BaseInputConnection;
import kotlin.jvm.internal.Lambda;

/* compiled from: TextInputServiceAndroid.android.kt */
/* loaded from: classes11.dex */
public final class oio0 extends Lambda implements gzs<BaseInputConnection> {
    final /* synthetic */ nio0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oio0(nio0 nio0Var) {
        super(0);
        this.this$0 = nio0Var;
    }

    @Override // xsna.gzs
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.this$0.a, false);
    }
}
