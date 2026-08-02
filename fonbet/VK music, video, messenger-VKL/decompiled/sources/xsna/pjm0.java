package xsna;

import android.graphics.Canvas;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.nov;

/* compiled from: StoryTemplateSticker.kt */
/* loaded from: classes6.dex */
public final class pjm0 extends kr9 implements u570 {
    public final int h;
    public final List<String> i;
    public final WeakReference<View> j;
    public boolean k;
    public boolean l;

    public pjm0() {
        this(0, (List) null, 15);
    }

    @Override // xsna.kr9, xsna.nov
    public final nov E0(nov novVar) {
        pjm0 pjm0Var = new pjm0(this.h, this.i, this.j);
        nov.a.b(this, pjm0Var);
        return pjm0Var;
    }

    @Override // xsna.kr9, xsna.nov
    public final boolean H0() {
        return this.l;
    }

    @Override // xsna.kr9, xsna.nov
    public final boolean d() {
        return this.k;
    }

    @Override // xsna.nov
    public final float getOriginalHeight() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.nov
    public final float getOriginalWidth() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.kr9, xsna.nov
    public final void setStatic(boolean z) {
        this.k = z;
    }

    @Override // xsna.kr9, xsna.nov
    public final void setStickerVisible(boolean z) {
        this.l = z;
    }

    public pjm0(int i, List list, WeakReference weakReference) {
        this.h = i;
        this.i = list;
        this.j = weakReference;
        this.k = true;
    }

    public pjm0(int i, List list, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? EmptyList.b : list, new WeakReference(null));
    }

    @Override // xsna.nov
    public final void G0(Canvas canvas) {
    }
}
