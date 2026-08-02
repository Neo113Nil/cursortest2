package xsna;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.R$id;
import com.google.android.material.timepicker.b;
import com.vk.clips.design.view.author.a;
import com.vk.core.view.FutureDateTimePickerView;
import com.vk.core.view.links.LinkedTextView;
import com.vk.im.design.view.pagination.DialogPinView;
import com.vk.im.ui.fragments.ImCreateChatControlParamsFragment;
import java.util.Calendar;
import xsna.g4m;
import xsna.ii8;
import xsna.npm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class gi8 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gi8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                hi8 hi8Var = (hi8) obj;
                ii8.a aVar = ii8.a.a;
                if (hi8Var.h) {
                    hi8Var.d.onNext(aVar);
                    break;
                }
                break;
            case 1:
                ((a.InterfaceC0555a.c) ((a.InterfaceC0555a) obj)).c.invoke();
                break;
            case 2:
                Runnable runnable = ((g4m) ((g4m.d) obj).m).j;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                gzs<s3q0> gzsVar = ((DialogPinView) obj).j;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 4:
                opm opmVar = (opm) obj;
                opmVar.O(new npm.a(opmVar.f.b()));
                break;
            case 5:
                FutureDateTimePickerView futureDateTimePickerView = (FutureDateTimePickerView) obj;
                int i2 = FutureDateTimePickerView.o;
                FragmentManager c = futureDateTimePickerView.c();
                if (c != null) {
                    Calendar calendar = Calendar.getInstance(pvo0.d().getTimeZone());
                    calendar.setTime(futureDateTimePickerView.g);
                    b.d dVar = new b.d();
                    dVar.d(DateFormat.is24HourFormat(futureDateTimePickerView.getContext()) ? 1 : 0);
                    dVar.b(calendar.get(11));
                    dVar.c(calendar.get(12));
                    com.google.android.material.timepicker.b a = dVar.a();
                    a.Td(c, com.google.android.material.timepicker.b.class.getName());
                    c.F();
                    Dialog dialog = a.s;
                    View findViewById = dialog != null ? dialog.findViewById(R$id.material_timepicker_ok_button) : null;
                    if (findViewById != null) {
                        findViewById.setOnClickListener(new lkc(2, a, futureDateTimePickerView));
                        break;
                    }
                }
                break;
            case 6:
                gzs gzsVar2 = (gzs) obj;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                    break;
                }
                break;
            case 7:
                int i3 = ImCreateChatControlParamsFragment.b0;
                ((ImCreateChatControlParamsFragment) obj).a0();
                break;
            case 8:
                sp30 sp30Var = (sp30) obj;
                pk30 pk30Var = sp30Var.f;
                tp30 tp30Var = sp30Var.g;
                String str = tp30Var != null ? tp30Var.d : null;
                if (pk30Var != null && str != null) {
                    pk30Var.s(tp30Var != null ? tp30Var.e : 0, str);
                    break;
                }
                break;
            case 9:
                Object obj2 = ((vl90) obj).o;
                ((tl90) (obj2 != null ? obj2 : null)).I();
                break;
            case 10:
                ((izs) obj).invoke(view);
                break;
            case 11:
                tgb0 tgb0Var = (tgb0) obj;
                LinkedTextView linkedTextView = tgb0Var.o;
                ViewGroup viewGroup = tgb0Var.n;
                Object tag = linkedTextView.getTag();
                CharSequence charSequence = tag instanceof CharSequence ? (CharSequence) tag : null;
                if (charSequence != null) {
                    int height = linkedTextView.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = height;
                    }
                    linkedTextView.setText(charSequence);
                    linkedTextView.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                    ValueAnimator ofInt = ValueAnimator.ofInt(height, linkedTextView.getMeasuredHeight());
                    ofInt.addUpdateListener(new if0(tgb0Var, 1));
                    ofInt.setDuration(250L);
                    ofInt.start();
                    tgb0Var.p = true;
                    break;
                }
                break;
            case 12:
                u6m0 u6m0Var = ((q6m0) obj).p;
                if (u6m0Var != null) {
                    u6m0Var.k();
                    break;
                }
                break;
            default:
                tcn0 tcn0Var = (tcn0) obj;
                u7n0 u7n0Var = tcn0Var.m;
                Context context = view.getContext();
                Object obj3 = tcn0Var.l;
                u7n0Var.h0(context, (b9n0) (obj3 != null ? obj3 : null));
                break;
        }
    }
}
