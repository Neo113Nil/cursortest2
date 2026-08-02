package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.go.chargers.debt.screen.ChargersDebtModalView;
import com.yandex.go.chargers.debt.screen.a;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class kp9 implements qp9 {
    public final /* synthetic */ ChargersDebtModalView a;

    public kp9(ChargersDebtModalView chargersDebtModalView) {
        this.a = chargersDebtModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        lp9 binding;
        final sq9 sq9Var = (sq9) obj;
        final ChargersDebtModalView chargersDebtModalView = this.a;
        binding = chargersDebtModalView.getBinding();
        RobotoTextView robotoTextView = binding.h;
        ButtonComponent buttonComponent = binding.d;
        ListItemComponent listItemComponent = binding.e;
        CharSequence charSequence = sq9Var.a;
        rq9 rq9Var = sq9Var.c;
        gl glVar = sq9Var.e;
        robotoTextView.setText(charSequence);
        binding.f.setText(sq9Var.b);
        ListItemComponent listItemComponent2 = binding.c;
        qq9 qq9Var = sq9Var.d;
        CharSequence charSequence2 = qq9Var.d;
        CharSequence charSequence3 = qq9Var.c;
        listItemComponent2.setTitle(charSequence2);
        listItemComponent2.setSubtitle(qq9Var.e);
        listItemComponent2.setEnabled(qq9Var.b);
        final int i = 0;
        if (qq9Var.a != null) {
            listItemComponent2.clearTrailView();
            GoLinearLayout goLinearLayout = new GoLinearLayout(listItemComponent2.getContext(), null, 0, 0, 14, null);
            goLinearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            goLinearLayout.setOrientation(0);
            goLinearLayout.setGravity(16);
            RobotoTextView robotoTextView2 = new RobotoTextView(chargersDebtModalView.getContext(), null, 0, 6, null);
            robotoTextView2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            robotoTextView2.setText(charSequence3);
            goLinearLayout.addView(robotoTextView2);
            int b = m810.b(goLinearLayout.getContext().getResources().getDisplayMetrics().density * 24.0f);
            GoImageView goImageView = new GoImageView(goLinearLayout.getContext(), null, 0, 6, null);
            goImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(b, b));
            goImageView.setImageResource(dzg0.ic_chevron);
            goImageView.setScaleType(ImageView.ScaleType.CENTER);
            goLinearLayout.addView(goImageView);
            listItemComponent2.setTrailView(goLinearLayout);
            listItemComponent2.setDebounceClickListener(new Runnable() { // from class: jp9
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar;
                    a aVar2;
                    a aVar3;
                    int i2 = i;
                    sq9 sq9Var2 = sq9Var;
                    ChargersDebtModalView chargersDebtModalView2 = chargersDebtModalView;
                    switch (i2) {
                        case 0:
                            aVar = chargersDebtModalView2.chargersDebtPresenter;
                            aVar.Kg(sq9Var2.d.a);
                            break;
                        case 1:
                            aVar2 = chargersDebtModalView2.chargersDebtPresenter;
                            aVar2.Kg((pq9) sq9Var2.e.b);
                            break;
                        default:
                            aVar3 = chargersDebtModalView2.chargersDebtPresenter;
                            aVar3.Kg(sq9Var2.c.a);
                            break;
                    }
                }
            });
        } else {
            listItemComponent2.setTrailCompanionText(charSequence3);
        }
        listItemComponent.setEnabled(glVar.a);
        listItemComponent.setTitle((CharSequence) glVar.w);
        listItemComponent.setSubtitle((CharSequence) glVar.x);
        listItemComponent.clearTrailView();
        GoLinearLayout goLinearLayout2 = new GoLinearLayout(listItemComponent.getContext(), null, 0, 0, 14, null);
        goLinearLayout2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        goLinearLayout2.setOrientation(0);
        goLinearLayout2.setGravity(16);
        GoImageView goImageView2 = new GoImageView(chargersDebtModalView.getContext(), null, 0, 6, null);
        goImageView2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        goImageView2.setImageDrawable((Drawable) glVar.c);
        goLinearLayout2.addView(goImageView2);
        int b2 = m810.b(24.0f * goLinearLayout2.getContext().getResources().getDisplayMetrics().density);
        GoImageView goImageView3 = new GoImageView(goLinearLayout2.getContext(), null, 0, 6, null);
        goImageView3.setLayoutParams(new ViewGroup.MarginLayoutParams(b2, b2));
        goImageView3.setImageResource(dzg0.ic_chevron);
        goImageView3.setScaleType(ImageView.ScaleType.CENTER);
        goLinearLayout2.addView(goImageView3);
        listItemComponent.setTrailView(goLinearLayout2);
        final int i2 = 1;
        listItemComponent.setDebounceClickListener(new Runnable() { // from class: jp9
            @Override // java.lang.Runnable
            public final void run() {
                a aVar;
                a aVar2;
                a aVar3;
                int i22 = i2;
                sq9 sq9Var2 = sq9Var;
                ChargersDebtModalView chargersDebtModalView2 = chargersDebtModalView;
                switch (i22) {
                    case 0:
                        aVar = chargersDebtModalView2.chargersDebtPresenter;
                        aVar.Kg(sq9Var2.d.a);
                        break;
                    case 1:
                        aVar2 = chargersDebtModalView2.chargersDebtPresenter;
                        aVar2.Kg((pq9) sq9Var2.e.b);
                        break;
                    default:
                        aVar3 = chargersDebtModalView2.chargersDebtPresenter;
                        aVar3.Kg(sq9Var2.c.a);
                        break;
                }
            }
        });
        buttonComponent.setText(rq9Var.c);
        buttonComponent.setEnabled(rq9Var.b);
        if (rq9Var.d) {
            buttonComponent.startProgress();
        } else {
            buttonComponent.finishProgress();
        }
        final int i3 = 2;
        buttonComponent.setDebounceClickListener(new Runnable() { // from class: jp9
            @Override // java.lang.Runnable
            public final void run() {
                a aVar;
                a aVar2;
                a aVar3;
                int i22 = i3;
                sq9 sq9Var2 = sq9Var;
                ChargersDebtModalView chargersDebtModalView2 = chargersDebtModalView;
                switch (i22) {
                    case 0:
                        aVar = chargersDebtModalView2.chargersDebtPresenter;
                        aVar.Kg(sq9Var2.d.a);
                        break;
                    case 1:
                        aVar2 = chargersDebtModalView2.chargersDebtPresenter;
                        aVar2.Kg((pq9) sq9Var2.e.b);
                        break;
                    default:
                        aVar3 = chargersDebtModalView2.chargersDebtPresenter;
                        aVar3.Kg(sq9Var2.c.a);
                        break;
                }
            }
        });
        binding.b.setVisibility(4);
        binding.g.setVisibility(0);
    }
}
