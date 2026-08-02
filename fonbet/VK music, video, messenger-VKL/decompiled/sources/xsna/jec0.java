package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.vk.dto.posting.DonutPostingSettings;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.h7u0;

/* compiled from: PostingDonutDelegate.kt */
/* loaded from: classes4.dex */
public final class jec0 implements jzn {
    public final Context a;
    public DonutPostingSettings.Duration b;
    public ape0 c;
    public List<DonutPostingSettings.Duration> d;

    public jec0(Context context) {
        this.a = context;
    }

    @Override // xsna.jzn
    public final void a(Integer num, List<DonutPostingSettings.Duration> list) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int i = ((DonutPostingSettings.Duration) obj).b;
            if (num != null && i == num.intValue()) {
                break;
            }
        }
        DonutPostingSettings.Duration duration = (DonutPostingSettings.Duration) obj;
        if (duration == null) {
            duration = (DonutPostingSettings.Duration) j5g.a0(list);
        }
        this.b = duration;
        this.d = list;
        Context context = this.a;
        View inflate = LayoutInflater.from(context).inflate(R.layout.vk_alert_paid_durations_dialog, (ViewGroup) null, false);
        h7u0.a aVar = new h7u0.a(context);
        aVar.g0(R.string.posting_settings_paid_duration);
        aVar.c0(R.string.save, new t8o(this, 1));
        aVar.W(R.string.cancel, null);
        aVar.f = inflate;
        Spinner spinner = (Spinner) inflate.findViewById(R.id.spinner);
        ooo oooVar = new ooo(context, R.layout.posting_donut_durations_spinner_selected);
        oooVar.setDropDownViewResource(R.layout.posting_donut_durations_spinner_dropdown);
        oooVar.addAll(list);
        spinner.setAdapter((SpinnerAdapter) oooVar);
        int indexOf = list.indexOf(duration);
        if (indexOf >= 0) {
            spinner.setSelection(indexOf);
        }
        spinner.setOnItemSelectedListener(new a(spinner));
        aVar.m();
    }

    /* compiled from: PostingDonutDelegate.kt */
    public static final class a implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ Spinner c;

        public a(Spinner spinner) {
            this.c = spinner;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            Object itemAtPosition = this.c.getItemAtPosition(i);
            jec0.this.b = itemAtPosition instanceof DonutPostingSettings.Duration ? (DonutPostingSettings.Duration) itemAtPosition : null;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
