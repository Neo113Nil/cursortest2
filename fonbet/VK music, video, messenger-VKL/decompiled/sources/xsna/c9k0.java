package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;
import xsna.j38;
import xsna.m28;

/* compiled from: BotSnackBarAdapter.kt */
/* loaded from: classes2.dex */
public final class c9k0 extends vfz<g8k0> {
    public static final /* synthetic */ int p = 0;
    public final j38.a l;
    public final TextView m;
    public final AvatarView n;
    public g8k0 o;

    public c9k0(View view, m28.a aVar) {
        super(view);
        this.l = aVar;
        this.m = (TextView) view.findViewById(R.id.text);
        this.n = (AvatarView) view.findViewById(R.id.avatar);
        view.setOutlineProvider(new s0w0(iah0.b(8.0f), 6));
        view.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.b9k0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                j38.a aVar2;
                c9k0 c9k0Var = c9k0.this;
                g8k0 g8k0Var = c9k0Var.o;
                if (g8k0Var == null || (aVar2 = c9k0Var.l) == null) {
                    return true;
                }
                aVar2.a(motionEvent, g8k0Var.b);
                return true;
            }
        });
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(g8k0 g8k0Var) {
        g8k0 g8k0Var2 = g8k0Var;
        this.o = g8k0Var2;
        this.m.setText(g8k0Var2.c);
        qtd0 qtd0Var = g8k0Var2.e;
        boolean z = qtd0Var != null && g8k0Var2.d;
        AvatarView avatarView = this.n;
        bwt0.p0(avatarView, z);
        avatarView.Y0(qtd0Var);
    }
}
