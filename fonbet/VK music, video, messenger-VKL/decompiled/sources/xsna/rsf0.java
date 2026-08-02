package xsna;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.auth.verification.base.ui.VkCheckEditText;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.osf0;

/* compiled from: RelatedUserPinInputRenderer.kt */
/* loaded from: classes6.dex */
public final class rsf0 implements gm50 {
    public final osf0 b;
    public final View c;
    public final osf0.a d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public rsf0(osf0 osf0Var, View view, osf0.a aVar) {
        this.b = osf0Var;
        this.c = view;
        this.d = aVar;
        lva0 lva0Var = new lva0(this, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a = msy.a(lazyThreadSafetyMode, lva0Var);
        this.e = a;
        Lazy a2 = msy.a(lazyThreadSafetyMode, new su80(this, 14));
        this.f = a2;
        Lazy a3 = msy.a(lazyThreadSafetyMode, new wm80(this, 10));
        this.g = a3;
        this.h = msy.a(lazyThreadSafetyMode, new c950(this, 26));
        iut0.q((ImageView) a.getValue(), new vmk());
        ((ImageView) a.getValue()).setContentDescription(osf0Var.getString(R.string.vk_auth_related_user_pin_close_talkback));
        ((ImageView) a.getValue()).setOnClickListener(new rg0(this, 9));
        ImageView imageView = (ImageView) a.getValue();
        r55 r55Var = r55.a;
        imageView.setImageDrawable(r55.i().b(view.getContext()));
        ((Button) a3.getValue()).setOnClickListener(new sg0(this, 16));
        ((Button) a3.getValue()).setText(osf0Var.getString(R.string.vk_auth_related_user_pin_dont_remember));
        ((TextView) a2.getValue()).setText(osf0Var.getString(R.string.vk_auth_related_user_pin_enter));
        ((Button) a3.getValue()).setOnClickListener(new cnw(this, 5));
        a().setDigitsNumber(4);
        hg1.b(view, hg1.h(new qno0(a().c), new z6f0(this, 1)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final VkCheckEditText a() {
        return (VkCheckEditText) this.h.getValue();
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
