package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.go.due_timetable.presentation.widget.day_selector.DaySelectorView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.due_timetable.DueTimetableView;

/* loaded from: classes12.dex */
public final class azm implements zo31 {
    public final LinearLayout a;
    public final DaySelectorView b;
    public final FrameLayout c;
    public final View d;
    public final DueTimetableView e;
    public final LinearLayout f;
    public final RobotoTextView g;
    public final RobotoTextView h;

    public azm(LinearLayout linearLayout, DaySelectorView daySelectorView, FrameLayout frameLayout, View view, DueTimetableView dueTimetableView, LinearLayout linearLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = linearLayout;
        this.b = daySelectorView;
        this.c = frameLayout;
        this.d = view;
        this.e = dueTimetableView;
        this.f = linearLayout2;
        this.g = robotoTextView;
        this.h = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
