package xsna;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import java.util.Iterator;

/* compiled from: MaterialTextInputPicker.java */
/* loaded from: classes13.dex */
public final class vm10<S> extends wha0<S> {
    public int i;

    @Nullable
    public DateSelector<S> j;

    @Nullable
    public CalendarConstraints k;

    /* compiled from: MaterialTextInputPicker.java */
    public class a extends pb80<S> {
        public a() {
        }

        @Override // xsna.pb80
        public final void a() {
            Iterator<pb80<S>> it = vm10.this.h.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // xsna.pb80
        public final void b(S s) {
            Iterator<pb80<S>> it = vm10.this.h.iterator();
            while (it.hasNext()) {
                it.next().b(s);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.i = bundle.getInt("THEME_RES_ID_KEY");
        this.j = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.k = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return this.j.e3(layoutInflater.cloneInContext(new ContextThemeWrapper(mo2getContext(), this.i)), viewGroup, this.k, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.i);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.j);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.k);
    }
}
