package xsna;

import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeAction;

/* compiled from: SakEventBuilder.kt */
/* loaded from: classes11.dex */
public class zzg0 extends cd6<e0h0> {
    public SchemeStatSak$EventScreen f;
    public SchemeStatSak$TypeAction g;

    public zzg0(boolean z) {
        super(z, null, 14);
    }

    @Override // xsna.cd6
    public final e0h0 p() {
        SchemeStatSak$TypeAction schemeStatSak$TypeAction;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = (SchemeStatSak$EventScreen) r(this.f);
        if (schemeStatSak$EventScreen == null || (schemeStatSak$TypeAction = (SchemeStatSak$TypeAction) r(this.g)) == null) {
            return null;
        }
        return new e0h0(schemeStatSak$EventScreen, schemeStatSak$TypeAction, this.d);
    }
}
