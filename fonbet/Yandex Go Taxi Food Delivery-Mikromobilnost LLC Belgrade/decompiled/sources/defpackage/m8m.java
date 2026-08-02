package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.feature.savings.internal.views.SavingsCardView;
import com.ybsdk.feature.savings.internal.views.SavingsDivCardView;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes3.dex */
public final /* synthetic */ class m8m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g561 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ sls x;

    public /* synthetic */ m8m(Object obj, g561 g561Var, sls slsVar, float f, int i) {
        this.a = i;
        this.w = obj;
        this.b = g561Var;
        this.x = slsVar;
        this.c = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        float f = this.c;
        sls slsVar = this.x;
        final g561 g561Var = this.b;
        Object obj = this.w;
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case 0:
                final q8m q8mVar = (q8m) obj;
                final qam0 qam0Var = (qam0) slsVar;
                g561Var.b.setOnClickListener(new View.OnClickListener(q8mVar, g561Var, qam0Var, i3) { // from class: n8m
                    public final /* synthetic */ int a;
                    public final /* synthetic */ g561 b;
                    public final /* synthetic */ qam0 c;

                    {
                        this.a = i3;
                        this.b = g561Var;
                        this.c = qam0Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = this.a;
                        qam0 qam0Var2 = this.c;
                        g561 g561Var2 = this.b;
                        switch (i4) {
                            case 0:
                                q8m.a(g561Var2, qam0Var2);
                                break;
                            default:
                                q8m.a(g561Var2, qam0Var2);
                                break;
                        }
                    }
                });
                nzm nzmVar = g561Var.d;
                ((YbButtonView) nzmVar.c).setOnClickListener(new View.OnClickListener(q8mVar, g561Var, qam0Var, i2) { // from class: n8m
                    public final /* synthetic */ int a;
                    public final /* synthetic */ g561 b;
                    public final /* synthetic */ qam0 c;

                    {
                        this.a = i2;
                        this.b = g561Var;
                        this.c = qam0Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = this.a;
                        qam0 qam0Var2 = this.c;
                        g561 g561Var2 = this.b;
                        switch (i4) {
                            case 0:
                                q8m.a(g561Var2, qam0Var2);
                                break;
                            default:
                                q8m.a(g561Var2, qam0Var2);
                                break;
                        }
                    }
                });
                View view = g561Var.b;
                b.c(view, true, 0L, 0, 0L, null, 30);
                LinearLayout linearLayout = (LinearLayout) nzmVar.b;
                linearLayout.setVisibility(0);
                linearLayout.setAlpha(0.0f);
                linearLayout.setY(g561Var.a.getHeight());
                ViewPropertyAnimator alpha = linearLayout.animate().alpha(1.0f);
                ho4 ho4Var = g561Var.c;
                LinearLayout linearLayout2 = (LinearLayout) ho4Var.c;
                alpha.y(linearLayout2.getY() + linearLayout2.getHeight() + f).setDuration(900L).start();
                view.animate().alpha(1.0f).setDuration(900L).setStartDelay(300L).start();
                linearLayout2.animate().alpha(1.0f).setStartDelay(200L).setDuration(900L).start();
                SavingsCardView savingsCardView = (SavingsCardView) ho4Var.b;
                SavingsCardView savingsCardView2 = (SavingsCardView) ho4Var.d;
                float x = savingsCardView2.getX() - savingsCardView.getX();
                float x2 = savingsCardView.getX() - savingsCardView2.getX();
                savingsCardView.animate().translationX(x).setDuration(600L).setStartDelay(OperationProgressView.ROTATION_ANIMATION_DURATION).setUpdateListener(new o8m(0, q8mVar, savingsCardView, savingsCardView2)).start();
                savingsCardView2.animate().translationX(x2).setDuration(600L).setStartDelay(OperationProgressView.ROTATION_ANIMATION_DURATION).start();
                break;
            default:
                final s8m s8mVar = (s8m) obj;
                final qam0 qam0Var2 = (qam0) slsVar;
                g561Var.b.setOnClickListener(new View.OnClickListener(s8mVar, g561Var, qam0Var2, i3) { // from class: r8m
                    public final /* synthetic */ int a;
                    public final /* synthetic */ g561 b;
                    public final /* synthetic */ qam0 c;

                    {
                        this.a = i3;
                        this.b = g561Var;
                        this.c = qam0Var2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i4 = this.a;
                        qam0 qam0Var3 = this.c;
                        g561 g561Var2 = this.b;
                        switch (i4) {
                            case 0:
                                s8m.a(g561Var2, qam0Var3);
                                break;
                            default:
                                s8m.a(g561Var2, qam0Var3);
                                break;
                        }
                    }
                });
                nzm nzmVar2 = g561Var.d;
                ((YbButtonView) nzmVar2.c).setOnClickListener(new View.OnClickListener(s8mVar, g561Var, qam0Var2, i2) { // from class: r8m
                    public final /* synthetic */ int a;
                    public final /* synthetic */ g561 b;
                    public final /* synthetic */ qam0 c;

                    {
                        this.a = i2;
                        this.b = g561Var;
                        this.c = qam0Var2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i4 = this.a;
                        qam0 qam0Var3 = this.c;
                        g561 g561Var2 = this.b;
                        switch (i4) {
                            case 0:
                                s8m.a(g561Var2, qam0Var3);
                                break;
                            default:
                                s8m.a(g561Var2, qam0Var3);
                                break;
                        }
                    }
                });
                View view2 = g561Var.b;
                b.c(view2, true, 0L, 0, 0L, null, 30);
                LinearLayout linearLayout3 = (LinearLayout) nzmVar2.b;
                linearLayout3.setVisibility(0);
                linearLayout3.setAlpha(0.0f);
                linearLayout3.setY(g561Var.a.getHeight());
                ViewPropertyAnimator alpha2 = linearLayout3.animate().alpha(1.0f);
                ho4 ho4Var2 = g561Var.e;
                LinearLayout linearLayout4 = (LinearLayout) ho4Var2.c;
                alpha2.y(linearLayout4.getY() + linearLayout4.getHeight() + f).setDuration(900L).start();
                view2.animate().alpha(1.0f).setDuration(900L).setStartDelay(300L).start();
                linearLayout4.animate().alpha(1.0f).setStartDelay(200L).setDuration(900L).start();
                SavingsDivCardView savingsDivCardView = (SavingsDivCardView) ho4Var2.b;
                SavingsDivCardView savingsDivCardView2 = (SavingsDivCardView) ho4Var2.d;
                float x3 = savingsDivCardView2.getX() - savingsDivCardView.getX();
                float x4 = savingsDivCardView.getX() - savingsDivCardView2.getX();
                savingsDivCardView.animate().translationX(x3).setDuration(600L).setStartDelay(OperationProgressView.ROTATION_ANIMATION_DURATION).setUpdateListener(new o8m(1, s8mVar, savingsDivCardView, savingsDivCardView2)).start();
                savingsDivCardView2.animate().translationX(x4).setDuration(600L).setStartDelay(OperationProgressView.ROTATION_ANIMATION_DURATION).start();
                break;
        }
    }
}
