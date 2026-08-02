package xsna;

import java.util.Calendar;

/* compiled from: CurrentYearProvider.kt */
/* loaded from: classes5.dex */
public final class slk implements gzs<Integer> {
    @Override // xsna.gzs
    public final Integer invoke() {
        return Integer.valueOf(Calendar.getInstance().get(1));
    }
}
