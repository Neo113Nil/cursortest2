package xsna;

import android.view.LayoutInflater;
import com.vk.im.engine.models.ProfilesInfo;
import java.util.AbstractCollection;
import xsna.thm;

/* compiled from: Adapter.kt */
/* loaded from: classes2.dex */
public final class fj0 extends qul {
    public final LayoutInflater h;
    public final thm.a i;

    public fj0(LayoutInflater layoutInflater, thm.a aVar) {
        super(false);
        this.h = layoutInflater;
        this.i = aVar;
        if ((3 & 1) != 0) {
            new m420((AbstractCollection) null, (ProfilesInfo) null, false, 15);
        }
        setHasStableIds(true);
        x0(w120.class, new pz(this, 2));
        x0(yi10.class, new ec(this, 1));
        x0(ftz.class, new h5(this, 2));
    }
}
