package xsna;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import kotlin.LazyThreadSafetyMode;
import xsna.fmc0;

/* compiled from: PostingStep2ContentView.kt */
/* loaded from: classes4.dex */
public final class roc0 extends RecyclerView {
    public final Object b;
    public final c5d0 c;

    public roc0(Context context) {
        super(context, null, 0);
        this.b = msy.a(LazyThreadSafetyMode.NONE, new dj60(this, 15));
        this.c = new c5d0(this, getDonutPriceTemplateParser());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final a2o getDonutPriceTemplateParser() {
        return (a2o) this.b.getValue();
    }

    public final c5d0 getMediaView() {
        return this.c;
    }

    public final void setAddPostingSideEffectListener(izs<? super izs<? super fmc0.u, s3q0>, s3q0> izsVar) {
        izsVar.invoke(this.c.m);
    }

    public final void setAvailabilityProvider(e70 e70Var) {
        this.c.getClass();
    }

    public final void setSendAction(izs<? super PostingAction, s3q0> izsVar) {
        this.c.a = izsVar;
    }
}
