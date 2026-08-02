package xsna;

import com.google.android.datatransport.Priority;

/* compiled from: EventGDTLogger.kt */
/* loaded from: classes.dex */
public final class wyp implements xyp {
    public final f9e0<top0> a;

    public wyp(f9e0<top0> f9e0Var) {
        this.a = f9e0Var;
    }

    @Override // xsna.xyp
    public final void a(kti0 kti0Var) {
        this.a.get().a("FIREBASE_APPQUALITY_SESSION", new ijp("json"), new ho8()).a(new xl5(null, kti0Var, Priority.DEFAULT, null), new sl9());
    }
}
