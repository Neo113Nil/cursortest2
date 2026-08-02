package xsna;

import android.widget.ImageView;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import xsna.i330;

/* compiled from: PinDelegate.kt */
/* loaded from: classes7.dex */
public final class tla0 {
    public final ImageView a;
    public final i330<a> b;
    public boolean c;
    public pna0 d;

    /* compiled from: PinDelegate.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PinViewModel(isPinnedForMe=");
            sb.append(this.a);
            sb.append(", isPinnedForAll=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    public tla0(ImageView imageView) {
        this.a = imageView;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        pv7 pv7Var = new pv7((byte) 0, 3);
        arrayList.add(new i330.b(new bod(2), new bq00(this, 23), pv7Var));
        this.b = new i330<>(arrayList, hashMap);
        bwt0.i0(imageView, new ie90(this, 2));
    }

    public final void a(pna0 pna0Var) {
        boolean z = pna0Var.c;
        this.d = pna0Var;
        boolean t = emi.t(pna0Var.a);
        boolean z2 = pna0Var.d;
        this.a.setVisibility(((z2 || z) && t && (pna0Var.b == GroupCallViewModel.GroupCallViewMode.MainSpeakerAndThumbsViewMode) && this.c) ? 0 : 8);
        this.b.b(new a(z2, z));
    }
}
