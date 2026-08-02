package xsna;

import android.view.MotionEvent;
import com.vk.im.engine.models.dialogs.DialogExt;

/* compiled from: ChatPreviewViewState.kt */
/* loaded from: classes18.dex */
public final class vub implements ao50 {
    public final DialogExt a;
    public final io.reactivex.rxjava3.core.q<MotionEvent> b;
    public final boolean c;

    public vub() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vub)) {
            return false;
        }
        vub vubVar = (vub) obj;
        return epx.f(this.a, vubVar.a) && epx.f(this.b, vubVar.b) && this.c == vubVar.c;
    }

    public final int hashCode() {
        DialogExt dialogExt = this.a;
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + ((dialogExt == null ? 0 : dialogExt.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatPreviewViewState(dialogExt=");
        sb.append(this.a);
        sb.append(", moveEvents=");
        sb.append(this.b);
        sb.append(", isShowingPreview=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public vub(DialogExt dialogExt, io.reactivex.rxjava3.core.q<MotionEvent> qVar, boolean z) {
        this.a = dialogExt;
        this.b = qVar;
        this.c = z;
    }

    public vub(int i) {
        this(null, io.reactivex.rxjava3.internal.operators.observable.g0.b, false);
    }
}
