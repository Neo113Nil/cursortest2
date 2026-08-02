package xsna;

import com.vkontakte.android.R;
import xsna.npf;
import xsna.nsf;

/* compiled from: ClipsWrapperNavigationButton.kt */
/* loaded from: classes17.dex */
public abstract class ksf {
    public final npf a;
    public final npf b;
    public final int c;
    public final nsf d;

    /* compiled from: ClipsWrapperNavigationButton.kt */
    public static final class a extends ksf {
        public static final a e = new a();

        public a() {
            super(npf.h.a.b, null, R.string.accessibility_back, new nsf.a());
        }
    }

    /* compiled from: ClipsWrapperNavigationButton.kt */
    public static final class b extends ksf {
        public b(nsf.b bVar) {
            super(npf.h.l.b, npf.h.k.b, R.string.clips_topbar_profile_icon_description, bVar);
        }
    }

    public ksf(npf npfVar, npf npfVar2, int i, nsf nsfVar) {
        this.a = npfVar;
        this.b = npfVar2;
        this.c = i;
        this.d = nsfVar;
    }
}
