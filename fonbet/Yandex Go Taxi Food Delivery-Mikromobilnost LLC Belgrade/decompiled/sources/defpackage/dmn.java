package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.promocodes.referral.impl.ui.ReferralMainScreenButton;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.fragment.SuggestedFavoritesFragment;
import ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class dmn implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dmn(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i9) {
            case 0:
                ((ChatInputHeightState) obj2).a((i4 - i2) - ((View) obj).getTop());
                break;
            case 1:
                yln ylnVar = (yln) obj2;
                t190 t190Var = (t190) obj;
                LinearLayout linearLayout = t190Var.b;
                int left = linearLayout != null ? linearLayout.getLeft() : t190Var.a.getLeft();
                Integer k = t190Var.k();
                ylnVar.onLayoutChange(view, left, i2, k != null ? k.intValue() : t190Var.a.getRight(), i4, i5, i6, i7, i8);
                break;
            case 2:
                ReferralMainScreenButton._init_$lambda$0((GradientDrawable) obj2, (ReferralMainScreenButton) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                SlideableFlexModalView.onContentUpdated$lambda$0((SlideableFlexModalView) obj2, (RecyclerView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                a5u0 a5u0Var = (a5u0) obj2;
                View view2 = a5u0Var.d;
                view2.removeOnLayoutChangeListener((View.OnLayoutChangeListener) ((Ref$ObjectRef) obj).element);
                long longValue = (a5u0Var.h + a5u0Var.a) - ((Number) a5u0Var.c.invoke()).longValue();
                if (longValue < 0) {
                    longValue = 0;
                }
                view2.postDelayed(new m8t0(19, a5u0Var), longValue);
                break;
            default:
                ((SuggestedFavoritesFragment) obj2).getFocusCoordinator().Td(i4 / 2, (tse) obj);
                break;
        }
    }
}
