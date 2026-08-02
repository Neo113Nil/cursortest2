package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.vk.core.widget.LifecycleHandler;
import com.vk.stat.scheme.SchemeStat$TypeClickItem;
import com.vkontakte.android.R;

/* compiled from: DefaultVoiceSearchDelegate.kt */
/* loaded from: classes17.dex */
public final class nrl implements hcw0 {
    public final Context a;
    public final bcw0 b;
    public final View.OnClickListener c;
    public final bpn0 d = new bpn0(new wqf(this, 11));
    public LifecycleHandler e;

    /* compiled from: DefaultVoiceSearchDelegate.kt */
    public static final class a extends r1q0 {
        public a(SchemeStat$TypeClickItem.Subtype subtype) {
            super(subtype);
        }

        @Override // xsna.r1q0, android.view.View.OnClickListener
        public final void onClick(View view) {
            super.onClick(view);
            nrl nrlVar = nrl.this;
            nrlVar.c.onClick(view);
            nrlVar.a();
        }
    }

    public nrl(Context context, acw0 acw0Var, View.OnClickListener onClickListener) {
        this.a = context;
        this.b = acw0Var;
        this.c = onClickListener;
        i0q0.d(200L, new p69(this, 5));
    }

    @Override // xsna.hcw0
    public final void a() {
        z0h z0hVar = new z0h(this, 4);
        if (this.e == null) {
            i0q0.d(200L, new m67(z0hVar, 4));
        } else {
            z0hVar.invoke();
        }
    }

    @Override // xsna.hcw0
    public final void b(ImageView imageView) {
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.vk_icon_voice_outline_24);
        imageView.setContentDescription(imageView.getContext().getString(R.string.search_voice));
        float f = 2;
        f4m.s(iah0.a(f), imageView);
        f4m.r(iah0.a(f), imageView);
        jjc.f(new a(SchemeStat$TypeClickItem.Subtype.VOICE_SEARCH_ICON), imageView);
    }

    @Override // xsna.hcw0
    public final void c() {
        i0q0.d(500L, new qd0(this, 20));
    }

    @Override // xsna.hcw0
    public final boolean d() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // xsna.hcw0
    public final void onDetachedFromWindow() {
        LifecycleHandler lifecycleHandler = this.e;
        if (lifecycleHandler != null) {
            vtk0.d().c(lifecycleHandler, this.b);
        }
    }
}
