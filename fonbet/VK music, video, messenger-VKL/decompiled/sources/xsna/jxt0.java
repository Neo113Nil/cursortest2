package xsna;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: ViewGroup.kt */
/* loaded from: classes11.dex */
public final class jxt0 implements uki0<View> {
    public final /* synthetic */ ViewGroup a;

    public jxt0(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // xsna.uki0
    public final Iterator<View> iterator() {
        return new kxt0(this.a);
    }
}
