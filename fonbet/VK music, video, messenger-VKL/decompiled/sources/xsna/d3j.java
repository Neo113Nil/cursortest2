package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.feed.core.models.feedback.Feedback;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ConfirmationFooterHolder.kt */
/* loaded from: classes4.dex */
public final class d3j extends qi6<NewsEntry> implements View.OnClickListener, w8i {
    public io.reactivex.rxjava3.disposables.c C;
    public final View D;
    public final TextView E;
    public final Object F;

    public d3j(ViewGroup viewGroup) {
        super(R.layout.holder_confirmation_footer, viewGroup);
        View findViewById = this.itemView.findViewById(R.id.view);
        this.D = findViewById;
        this.E = (TextView) this.itemView.findViewById(R.id.title);
        this.F = msy.a(LazyThreadSafetyMode.NONE, new obh(this, 3));
        findViewById.setVisibility(8);
        this.itemView.addOnAttachStateChangeListener(new a());
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        Feedback feedback = newsEntry.g;
        this.E.setText(feedback != null ? feedback.c : null);
        io.reactivex.rxjava3.disposables.c cVar = this.C;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.internal.operators.observable.c0 c0Var = new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.z(io.reactivex.rxjava3.core.q.B0(2L, TimeUnit.SECONDS), new st0(new i4h(this, 8), 11)), io.reactivex.rxjava3.internal.functions.a.d, new dm4(this, 2));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        this.C = itg0.m(c0Var.r0(asu0.i()).a0(asu0Var.d()));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jjc.b();
    }

    /* compiled from: ConfirmationFooterHolder.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            io.reactivex.rxjava3.disposables.c cVar = d3j.this.C;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
