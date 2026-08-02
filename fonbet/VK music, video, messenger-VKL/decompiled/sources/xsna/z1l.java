package xsna;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: DaysOfWeekAdapter.java */
/* loaded from: classes13.dex */
public final class z1l extends BaseAdapter {

    @NonNull
    public final Calendar b;
    public final int c;
    public final int d;

    public z1l() {
        Calendar e = l2r0.e(null);
        this.b = e;
        this.c = e.getMaximum(7);
        this.d = e.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.c;
    }

    @Override // android.widget.Adapter
    @Nullable
    public final Object getItem(int i) {
        int i2 = this.c;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.d;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @Nullable
    @SuppressLint({"WrongConstant"})
    public final View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.d;
        int i3 = this.c;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.b;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R$string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public z1l(int i) {
        Calendar e = l2r0.e(null);
        this.b = e;
        this.c = e.getMaximum(7);
        this.d = i;
    }
}
