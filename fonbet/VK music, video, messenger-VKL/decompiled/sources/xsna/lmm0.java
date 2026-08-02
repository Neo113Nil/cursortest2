package xsna;

import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class lmm0 implements izs {
    public final /* synthetic */ smm0 b;
    public final /* synthetic */ StoryEntry c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;

    public /* synthetic */ lmm0(smm0 smm0Var, StoryEntry storyEntry, boolean z, String str) {
        this.b = smm0Var;
        this.c = storyEntry;
        this.d = z;
        this.e = str;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        StoryOwner storyOwner;
        io.reactivex.rxjava3.core.a g;
        vrl0 vrl0Var;
        String str;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        final StoryEntry storyEntry = this.c;
        if (booleanValue) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.LogType logType = L.LogType.d;
                StringBuilder sb = new StringBuilder("preload skip ");
                sb.append(storyEntry != null ? storyEntry.Kb() : null);
                sb.append(" - cached owner=");
                if (storyEntry != null && (storyOwner = storyEntry.l0) != null) {
                    r1 = storyOwner.Db();
                }
                sb.append(r1);
                L.u(l, logType, new Object[]{sb.toString()});
            }
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        final smm0 smm0Var = this.b;
        if (!((Boolean) smm0Var.f.getValue()).booleanValue() || storyEntry == null || (str = storyEntry.B0) == null || str.length() == 0 || (!storyEntry.Tb() && this.d)) {
            if (storyEntry != null && (vrl0Var = smm0Var.b.get()) != null) {
                vrl0Var.n(smm0Var.a.b(), storyEntry, true, false);
            }
            final String str2 = this.e;
            L.d(new com.vk.movika.sdk.base.ui.m(25, storyEntry, str2));
            g = mcr0.s(str2).o(asu0.a.c()).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.omm0
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    StoryEntry storyEntry2 = StoryEntry.this;
                    L.d(new com.vk.movika.sdk.base.ui.s(18, storyEntry2, str2));
                    if (storyEntry2 != null) {
                        smm0 smm0Var2 = smm0Var;
                        vrl0 vrl0Var2 = smm0Var2.b.get();
                        if (vrl0Var2 != null) {
                            vrl0Var2.h(smm0Var2.a.b(), storyEntry2, true, Boolean.FALSE);
                        }
                    }
                }
            });
        } else {
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.LogType logType2 = L.LogType.d;
                StringBuilder sb2 = new StringBuilder("preload skip ");
                sb2.append(storyEntry.Kb());
                sb2.append(" - thumbhash is available for video story| owner=");
                StoryOwner storyOwner2 = storyEntry.l0;
                sb2.append(storyOwner2 != null ? storyOwner2.Db() : null);
                L.u(l2, logType2, new Object[]{sb2.toString()});
            }
            g = io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        uul0 uul0Var = new uul0(new kpr(26));
        g.getClass();
        return new io.reactivex.rxjava3.internal.operators.completable.x(g, uul0Var);
    }
}
