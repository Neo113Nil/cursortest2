package xsna;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import com.vk.debug.ui.dev.DebugDevImageFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class y2l implements gzs {
    public final /* synthetic */ DebugDevImageFragment b;
    public final /* synthetic */ uek c;
    public final /* synthetic */ View d;
    public final /* synthetic */ SwitchCompat e;
    public final /* synthetic */ View f;
    public final /* synthetic */ EditText g;
    public final /* synthetic */ EditText h;

    public /* synthetic */ y2l(DebugDevImageFragment debugDevImageFragment, uek uekVar, View view, SwitchCompat switchCompat, View view2, EditText editText, EditText editText2) {
        this.b = debugDevImageFragment;
        this.c = uekVar;
        this.d = view;
        this.e = switchCompat;
        this.f = view2;
        this.g = editText;
        this.h = editText2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = DebugDevImageFragment.U;
        DebugDevImageFragment debugDevImageFragment = this.b;
        enj.r(debugDevImageFragment.mo2getContext(), "Finish loading!", 0);
        DebugDevImageFragment.io(this.d, this.e, this.f, this.g, this.h, false);
        debugDevImageFragment.jo(this.c);
        return s3q0.a;
    }
}
