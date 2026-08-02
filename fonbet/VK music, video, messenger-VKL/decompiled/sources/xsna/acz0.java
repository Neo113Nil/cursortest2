package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class acz0 extends RelativeLayout {
    public static final int k = View.generateViewId();
    public static final int l = View.generateViewId();
    public final q8z0 b;
    public final Button c;
    public final x9z0 d;
    public final vvy0 e;
    public final c1z0 f;
    public final boolean g;
    public final s8z0 h;
    public z9z0 i;
    public boolean j;

    public acz0(Context context, c1z0 c1z0Var, boolean z) {
        super(context);
        this.h = new s8z0(new r2v(this, 29));
        this.i = new y9z0();
        this.j = false;
        this.f = c1z0Var;
        this.g = z;
        vvy0 vvy0Var = new vvy0(context, c1z0Var, z);
        this.e = vvy0Var;
        c1z0.n(vvy0Var, "footer_layout");
        q8z0 q8z0Var = new q8z0(context, c1z0Var, z);
        this.b = q8z0Var;
        c1z0.n(q8z0Var, "body_layout");
        Button button = new Button(context);
        this.c = button;
        c1z0.n(button, "cta_button");
        x9z0 x9z0Var = new x9z0(context);
        this.d = x9z0Var;
        c1z0.n(x9z0Var, "age_bordering");
    }

    public final void a(final k6z0 k6z0Var, bj50 bj50Var) {
        boolean z = k6z0Var.g;
        boolean z2 = k6z0Var.m;
        boolean z3 = this.j;
        x9z0 x9z0Var = this.d;
        q8z0 q8z0Var = this.b;
        Button button = this.c;
        final boolean z4 = true;
        if (!z3) {
            final eju ejuVar = new eju(6, this, bj50Var);
            q8z0Var.a(k6z0Var, new or20(ejuVar, 29));
            if (z2) {
                button.setOnClickListener(ejuVar);
                return;
            }
            if (z) {
                button.setOnClickListener(ejuVar);
                button.setEnabled(true);
            } else {
                button.setOnClickListener(null);
                button.setEnabled(false);
            }
            x9z0Var.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.ybz0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    acz0 acz0Var = acz0.this;
                    q8z0 q8z0Var2 = acz0Var.b;
                    if (k6z0Var.h) {
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            q8z0Var2.setBackgroundColor(-3806472);
                            return true;
                        }
                        if (action == 1) {
                            q8z0Var2.setBackgroundColor(-1);
                            ejuVar.onClick(view);
                            return true;
                        }
                        if (action == 3) {
                            acz0Var.setBackgroundColor(-1);
                            return true;
                        }
                    }
                    return true;
                }
            });
            return;
        }
        final n2q n2qVar = new n2q(8, this, bj50Var);
        q8z0Var.a(k6z0Var, new vvi0(bj50Var, 11));
        s8z0 s8z0Var = this.h;
        if (z2) {
            button.setOnTouchListener(s8z0Var);
            button.setOnClickListener(n2qVar);
            x9z0Var.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.zbz0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    z9z0 z9z0Var;
                    acz0 acz0Var = acz0.this;
                    q8z0 q8z0Var2 = acz0Var.b;
                    if (z4) {
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            q8z0Var2.setBackgroundColor(-3806472);
                            return true;
                        }
                        if (action == 1) {
                            q8z0Var2.setBackgroundColor(-1);
                            if (motionEvent.getAction() == 1) {
                                float x = motionEvent.getX();
                                float y = motionEvent.getY();
                                float f = sqe0.b(view).widthPixels;
                                float f2 = sqe0.b(view).heightPixels;
                                view.getLocationOnScreen(new int[2]);
                                z9z0Var = new c7z0((r5[0] + x) / f, (r5[1] + y) / f2);
                            } else {
                                z9z0Var = null;
                            }
                            if (z9z0Var == null) {
                                z9z0Var = new y9z0();
                            }
                            acz0Var.i = z9z0Var;
                            n2qVar.onClick(view);
                            return true;
                        }
                        if (action == 3) {
                            acz0Var.setBackgroundColor(-1);
                            return true;
                        }
                    }
                    return true;
                }
            });
            return;
        }
        button.setOnTouchListener(s8z0Var);
        if (z) {
            button.setOnClickListener(n2qVar);
            button.setEnabled(true);
        } else {
            button.setOnClickListener(null);
            button.setEnabled(false);
        }
        final boolean z5 = k6z0Var.h;
        x9z0Var.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.zbz0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                z9z0 z9z0Var;
                acz0 acz0Var = acz0.this;
                q8z0 q8z0Var2 = acz0Var.b;
                if (z5) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        q8z0Var2.setBackgroundColor(-3806472);
                        return true;
                    }
                    if (action == 1) {
                        q8z0Var2.setBackgroundColor(-1);
                        if (motionEvent.getAction() == 1) {
                            float x = motionEvent.getX();
                            float y = motionEvent.getY();
                            float f = sqe0.b(view).widthPixels;
                            float f2 = sqe0.b(view).heightPixels;
                            view.getLocationOnScreen(new int[2]);
                            z9z0Var = new c7z0((r5[0] + x) / f, (r5[1] + y) / f2);
                        } else {
                            z9z0Var = null;
                        }
                        if (z9z0Var == null) {
                            z9z0Var = new y9z0();
                        }
                        acz0Var.i = z9z0Var;
                        n2qVar.onClick(view);
                        return true;
                    }
                    if (action == 3) {
                        acz0Var.setBackgroundColor(-1);
                        return true;
                    }
                }
                return true;
            }
        });
    }

    public void setBanner(@NonNull tez0 tez0Var) {
        this.b.setBanner(tez0Var);
        String n = tez0Var.n();
        Button button = this.c;
        button.setText(n);
        this.e.setBackgroundColor(-39322);
        this.j = tez0Var.T.c;
        boolean isEmpty = TextUtils.isEmpty(tez0Var.h);
        x9z0 x9z0Var = this.d;
        if (isEmpty) {
            x9z0Var.setVisibility(8);
        } else {
            x9z0Var.setText(tez0Var.h);
        }
        c1z0.o(button, -16733198, -16746839, this.f.b(2));
        button.setTextColor(-1);
    }
}
