package xsna;

import android.os.Bundle;
import com.vk.auth.init.choose.ChooseProfileData;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;

/* compiled from: ChooseProfileFragment.kt */
/* loaded from: classes15.dex */
public final class qbc extends zk6<rbc> {

    /* compiled from: ChooseProfileFragment.kt */
    public static final class a {
        public static Bundle a(ChooseProfileData chooseProfileData) {
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("DATA", chooseProfileData);
            return bundle;
        }
    }

    @Override // xsna.a66
    public final z55 tn(Bundle bundle) {
        Bundle arguments = getArguments();
        ChooseProfileData chooseProfileData = arguments != null ? (ChooseProfileData) arguments.getParcelable("DATA") : null;
        if (chooseProfileData != null) {
            return new rbc(bundle, chooseProfileData, SchemeStatSak$EventScreen.PROCEED_AS_WITH_SUBPROFILE);
        }
        throw new IllegalArgumentException("Data argument is required");
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.PROCEED_AS_WITH_SUBPROFILE;
    }

    @Override // xsna.zk6
    public final void yn() {
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        rbc rbcVar = (rbc) obj;
        rbcVar.y0(this);
        rbcVar.N();
    }
}
