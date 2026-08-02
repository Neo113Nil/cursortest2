package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.bottomsheet.daychoosers.WeekDayChooserView$State$WeekDay;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class nry {
    public final WeekDayChooserView$State$WeekDay a;
    public final Text.Resource b;

    public nry(WeekDayChooserView$State$WeekDay weekDayChooserView$State$WeekDay, Text.Resource resource) {
        this.a = weekDayChooserView$State$WeekDay;
        this.b = resource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nry)) {
            return false;
        }
        nry nryVar = (nry) obj;
        return this.a == nryVar.a && this.b.equals(nryVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ListItem(weekDay=" + this.a + ", title=" + this.b + Extension.C_BRAKE;
    }
}
