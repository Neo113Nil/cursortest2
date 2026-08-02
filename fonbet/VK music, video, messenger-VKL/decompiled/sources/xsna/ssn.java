package xsna;

import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;

/* compiled from: DndTimeChooserDialog.kt */
/* loaded from: classes4.dex */
public final class ssn {
    public final Long[] a;
    public final Integer[] b;

    public ssn() {
        TimeUnit timeUnit = TimeUnit.HOURS;
        this.a = new Long[]{Long.valueOf(timeUnit.toSeconds(1L)), Long.valueOf(timeUnit.toSeconds(8L)), Long.valueOf(timeUnit.toSeconds(24L))};
        this.b = new Integer[]{Integer.valueOf(R.string.dnd_time_chooser_1_hour), Integer.valueOf(R.string.dnd_time_chooser_8_hours), Integer.valueOf(R.string.dnd_time_chooser_24_hours)};
    }
}
