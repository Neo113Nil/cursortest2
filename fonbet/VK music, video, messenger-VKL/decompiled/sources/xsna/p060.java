package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.channels.impl.comments.e;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.c;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: NegativeRepliesHolder.kt */
/* loaded from: classes16.dex */
public final class p060 extends vfz<q060> {
    public final a l;
    public final Object m;
    public final Object n;
    public final io.reactivex.rxjava3.disposables.b o;

    /* compiled from: NegativeRepliesHolder.kt */
    public interface a {
        void h();
    }

    /* compiled from: NegativeRepliesHolder.kt */
    public final class b {
        public final VkAvatar a;
        public final TextView b;
        public final TextView c;

        public b(View view) {
            this.a = (VkAvatar) view.findViewById(R.id.im_negative_replies_icon);
            this.b = (TextView) view.findViewById(R.id.im_negative_replies_title);
            this.c = (TextView) view.findViewById(R.id.im_negative_replies_subtitle);
        }
    }

    public p060(View view, e.a aVar) {
        super(view);
        this.l = aVar;
        bwt0.i0(view, new w7u(this, 18));
        pvh pvhVar = new pvh(this, view);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.m = msy.a(lazyThreadSafetyMode, pvhVar);
        this.n = msy.a(lazyThreadSafetyMode, new obh(this, 25));
        this.o = new io.reactivex.rxjava3.disposables.b();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(q060 q060Var) {
        q060 q060Var2 = q060Var;
        String str = q060Var2.d;
        ?? r1 = this.m;
        if (!(((b) r1.getValue()).a.getContent() instanceof c.b)) {
            io.reactivex.rxjava3.disposables.b bVar = this.o;
            bVar.e();
            bVar.b(c7r0.h(str).subscribe(new o060(new yr00(this, 10), 0), new w250(new bk30(this, 5), 2)));
        }
        ((b) r1.getValue()).b.setText(q060Var2.b);
        ((b) r1.getValue()).c.setText(q060Var2.c);
    }

    @Override // xsna.vfz
    public final void g6() {
        this.o.e();
    }
}
