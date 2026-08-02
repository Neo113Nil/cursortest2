package yads;

import android.os.Bundle;
import xsna.xul0;

/* loaded from: classes10.dex */
public abstract class rm2 implements xq {
    public static final wq b = new xul0(9);

    public static rm2 a(Bundle bundle) {
        int i = bundle.getInt(Integer.toString(0, 36), -1);
        if (i == 0) {
            return (rm2) w01.e.fromBundle(bundle);
        }
        if (i == 1) {
            return (rm2) fd2.d.fromBundle(bundle);
        }
        if (i == 2) {
            return (rm2) o43.e.fromBundle(bundle);
        }
        if (i == 3) {
            return (rm2) i73.e.fromBundle(bundle);
        }
        throw new IllegalArgumentException(nh2.a("Unknown RatingType: ", i));
    }
}
