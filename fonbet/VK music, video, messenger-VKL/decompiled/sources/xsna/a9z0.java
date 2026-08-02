package xsna;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class a9z0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ mbz0 c;

    public /* synthetic */ a9z0(int i, mbz0 mbz0Var) {
        this.b = i;
        this.c = mbz0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                mbz0 mbz0Var = this.c;
                int i = mbz0Var.i;
                if (i == 0) {
                    mbz0Var.f();
                    break;
                } else if (i == 1) {
                    b9z0 b9z0Var = mbz0Var.b;
                    s4z0 s4z0Var = mbz0Var.d;
                    if (i == 1) {
                        mbz0Var.i = 2;
                        suy0 suy0Var = mbz0Var.h;
                        if (suy0Var != null) {
                            suy0Var.d();
                        }
                        haz0 haz0Var = s4z0Var.b0;
                        w6z0 postView = b9z0Var.getPostView();
                        ImageView iconView = postView.getIconView();
                        TextView titleView = postView.getTitleView();
                        Button ctaButton = postView.getCtaButton();
                        kiw kiwVar = haz0Var.d;
                        if (kiwVar != null) {
                            iconView.setImageBitmap(kiwVar.a());
                        }
                        oly0 oly0Var = s4z0Var.c0;
                        titleView.setText(haz0Var.e);
                        titleView.setMaxLines(5);
                        titleView.setTextColor(oly0Var.f);
                        titleView.setGravity(17);
                        ctaButton.setBackgroundColor(oly0Var.a);
                        ctaButton.setTextColor(oly0Var.c);
                        String str = haz0Var.f;
                        if (TextUtils.isEmpty(str)) {
                            str = s4z0Var.n();
                        }
                        ctaButton.setText(str);
                        ctaButton.setOnClickListener(new l44(mbz0Var, 17));
                        w6z0 w6z0Var = b9z0Var.d;
                        if (w6z0Var.getParent() == null) {
                            b9z0Var.i.addView(w6z0Var, -1, -1);
                        }
                        mbz0Var.b(haz0Var.c);
                        b9z0Var.e.setVisibility(0);
                        b9z0Var.g.setVisibility(8);
                        suy0 a = suy0.a((e5z0) haz0Var.b, null);
                        mbz0Var.h = a;
                        a.b(postView);
                        mbz0Var.h.c();
                        break;
                    }
                }
                break;
            default:
                this.c.c();
                break;
        }
    }
}
