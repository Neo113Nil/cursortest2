package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.rpo;

/* compiled from: DynamicGestureDetectionViewDelegate.kt */
/* loaded from: classes16.dex */
public final class spo extends vdl<rpo> {
    public spo(Context context, View view, ProgressBar progressBar) {
        super(context, view, progressBar, 56);
    }

    @Override // xsna.vdl, xsna.jqo
    public final void f(hqo hqoVar, com.vk.movika.sdk.base.ui.r rVar) {
        rpo rpoVar = (rpo) hqoVar;
        if (rpoVar.equals(rpo.a.b)) {
            super.f(rpoVar, rVar);
        } else if (!rpoVar.equals(rpo.b.b)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // xsna.vdl
    public final CharSequence l(rpo rpoVar) {
        return this.a.getString(R.string.clips_gestures_dynamic_description);
    }

    @Override // xsna.vdl
    public final CharSequence m(rpo rpoVar) {
        return this.a.getString(R.string.clips_gestures_dynamic_title);
    }
}
