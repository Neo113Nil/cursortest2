package xsna;

import android.view.View;
import com.vk.clips.design.view.component.user.ClipUserView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wed implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wed(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ClipUserView clipUserView = (ClipUserView) this.c;
                View.OnClickListener onClickListener = (View.OnClickListener) this.d;
                ClipUserView.d dVar = clipUserView.F;
                if (!dVar.a) {
                    onClickListener.onClick(view);
                    break;
                } else {
                    dVar.a = false;
                    break;
                }
            default:
                a13 a13Var = (a13) this.c;
                r2r r2rVar = (r2r) this.d;
                a13Var.e(r2rVar.c, o25.a().c());
                break;
        }
    }
}
