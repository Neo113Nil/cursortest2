package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.interests.impl.ui.button.ButtonStyle;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipsInterestsLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class xge implements uge, w8i {
    public final ix3 b;
    public final pme c;
    public volatile qme d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.logic.processor.actions.f(this, 22));

    public xge(ix3 ix3Var, pme pmeVar, rme rmeVar) {
        this.b = ix3Var;
        this.c = pmeVar;
        this.d = rmeVar;
    }

    @Override // xsna.uge
    public final void a(Context context) {
        this.c.getClass();
        ClipsInterestsFragment.a aVar = new ClipsInterestsFragment.a();
        int h = ButtonStyle.NEXT_ONLY.h();
        Bundle bundle = aVar.j;
        bundle.putInt("NEXT_BUTTON_KEY", h);
        bundle.putBoolean("BACK_ARROW_KEY", true);
        aVar.k(context);
    }

    @Override // xsna.uge
    public final io.reactivex.rxjava3.internal.operators.maybe.c b(Context context) {
        return new io.reactivex.rxjava3.internal.operators.maybe.c(new vge(this, context));
    }
}
