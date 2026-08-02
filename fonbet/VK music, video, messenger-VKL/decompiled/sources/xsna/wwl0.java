package xsna;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.vkontakte.android.R;
import xsna.rwl0;
import xsna.uwl0;

/* compiled from: StoryActionVH.kt */
/* loaded from: classes6.dex */
public class wwl0 extends cc<uwl0.a.AbstractC3841a> {
    public final rwl0.a p;
    public final ImageView q;
    public Rect r;

    public wwl0(View view, rwl0.a aVar) {
        super(view, aVar);
        this.p = aVar;
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_action);
        this.q = imageView;
        imageView.setColorFilter(imageView.getContext().getColor(R.color.vk_white), PorterDuff.Mode.SRC_IN);
    }

    @Override // xsna.y4h0
    public final void V5(MotionEvent motionEvent) {
        Animation animation;
        Animation animation2;
        uwl0 uwl0Var = this.o;
        if (!((uwl0Var != null ? uwl0Var : null) instanceof uwl0.a.AbstractC3841a.C3842a)) {
            if (uwl0Var == null) {
                uwl0Var = null;
            }
            if (!(uwl0Var instanceof uwl0.a.AbstractC3841a.e)) {
                return;
            }
        }
        this.itemView.getFocusedRect(new Rect());
        if (this.itemView.getScaleX() == 1.0f) {
            this.r = f4m.c(this.itemView);
        }
        Rect rect = this.r;
        if (rect == null || !rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            if (this.itemView.getScaleX() == 0.75f && (this.itemView.getAnimation() == null || ((animation = this.itemView.getAnimation()) != null && animation.hasEnded()))) {
                dzl0.a(this.itemView, 0.75f, 1.0f);
            }
        } else if (this.itemView.getScaleX() == 1.0f && (this.itemView.getAnimation() == null || ((animation2 = this.itemView.getAnimation()) != null && animation2.hasEnded()))) {
            dzl0.a(this.itemView, 1.0f, 0.75f);
        }
        getBindingAdapterPosition();
        this.p.b(motionEvent);
    }

    @Override // xsna.y4h0
    public final void W5() {
        uwl0 uwl0Var = this.o;
        if (!((uwl0Var != null ? uwl0Var : null) instanceof uwl0.a.AbstractC3841a.C3842a)) {
            if (!((uwl0Var != null ? uwl0Var : null) instanceof uwl0.a.AbstractC3841a.e)) {
                return;
            }
        }
        if (uwl0Var == null) {
            uwl0Var = null;
        }
        this.p.e(uwl0Var, getBindingAdapterPosition());
    }

    @Override // xsna.cc
    public final void i6() {
        if (jjc.b()) {
            return;
        }
        uwl0 uwl0Var = this.o;
        if (uwl0Var == null) {
            uwl0Var = null;
        }
        m6(uwl0Var);
        super.i6();
    }

    @Override // xsna.cc
    /* renamed from: l6, reason: merged with bridge method [inline-methods] */
    public void b6(uwl0.a.AbstractC3841a abstractC3841a) {
        Integer num = abstractC3841a.c;
        if (num != null) {
            int intValue = num.intValue();
            ImageView imageView = this.q;
            imageView.setImageResource(intValue);
            imageView.setContentDescription(this.itemView.getContext().getString(abstractC3841a.d));
        }
    }

    public void m6(uwl0 uwl0Var) {
    }
}
