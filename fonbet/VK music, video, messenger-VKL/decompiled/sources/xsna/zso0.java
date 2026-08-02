package xsna;

import android.graphics.drawable.Animatable;
import com.vk.music.view.ThumbsImageView;

/* compiled from: ThumbsImageView.kt */
/* loaded from: classes3.dex */
public final class zso0 extends fc6<mjw> {
    public final /* synthetic */ ThumbsImageView c;

    public zso0(ThumbsImageView thumbsImageView) {
        this.c = thumbsImageView;
    }

    @Override // xsna.fc6, xsna.kqj
    public final void b(String str, Throwable th) {
        b780 b780Var = this.c.v;
        if (b780Var != null) {
            b780Var.b(str, th);
        }
    }

    @Override // xsna.fc6, xsna.kqj
    public final void d(String str) {
        b780 b780Var = this.c.v;
        if (b780Var != null) {
            b780Var.onCancel(str);
        }
    }

    @Override // xsna.fc6, xsna.kqj
    public final void e(String str, Object obj, Animatable animatable) {
        mjw mjwVar = (mjw) obj;
        b780 b780Var = this.c.v;
        if (b780Var != null) {
            b780Var.t(mjwVar != null ? mjwVar.getWidth() : 0, mjwVar != null ? mjwVar.getHeight() : 0, str);
        }
    }

    @Override // xsna.fc6, xsna.kqj
    public final void f(Object obj, String str) {
        b780 b780Var = this.c.v;
        if (b780Var != null) {
            b780Var.g(str);
        }
    }
}
