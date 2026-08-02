package defpackage;

import android.view.View;
import com.ybsdk.widgets.common.LoadableInput;

/* loaded from: classes14.dex */
public final class b361 implements zo31 {
    public final LoadableInput a;
    public final LoadableInput b;

    public b361(LoadableInput loadableInput, LoadableInput loadableInput2) {
        this.a = loadableInput;
        this.b = loadableInput2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
