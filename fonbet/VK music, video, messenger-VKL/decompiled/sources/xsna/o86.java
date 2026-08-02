package xsna;

import android.app.Activity;
import android.graphics.Rect;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.features.StoriesFeatures;

/* compiled from: Handler.kt */
/* loaded from: classes16.dex */
public final class o86 implements Runnable {
    public final /* synthetic */ k86 b;
    public final /* synthetic */ boolean c;

    public o86(k86 k86Var, boolean z) {
        this.b = k86Var;
        this.c = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e8, code lost:
    
        if (r0 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ee, code lost:
    
        if (r1.e() != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean g;
        k86 k86Var = this.b;
        m5p m5pVar = k86Var.D;
        boolean f = epx.f(k86Var.d.e, UserId.d);
        boolean z2 = false;
        boolean z3 = k86Var.v.size() > 1;
        boolean j7 = k86.j7(k86Var, k86Var.k.e);
        boolean d = k86Var.o.r.b.d();
        v76 v76Var = m5pVar.b;
        ?? r8 = m5pVar.c;
        Activity h = e3m.h(v76Var.getRequireContext());
        if (h == null) {
            return;
        }
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_STORY_LIFETIME_48;
        storiesFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        boolean z4 = !bVar.a(storiesFeatures) && f;
        StoriesFeatures storiesFeatures2 = StoriesFeatures.ST_STORY_LIFETIME_COMM_48;
        storiesFeatures2.getClass();
        if (!((z4 || (!bVar.a(storiesFeatures2) && !f)) ? false : m5pVar.a().a(new igh(m5pVar, 10))) && !m5pVar.c(f, z3, d) && !m5pVar.d(h, j7)) {
            if (!((Boolean) r8.getValue()).booleanValue() && this.c) {
                Rect sendButtonRect = v76Var.getBottomControlPanel().getSendButtonRect();
                if (sendButtonRect.height() * sendButtonRect.width() > 0) {
                    z = m5pVar.a().d(h, sendButtonRect);
                    if (!z) {
                        if (!z3) {
                            if (!((Boolean) r8.getValue()).booleanValue()) {
                                Rect moreButtonRect = v76Var.getSideControlPanel().getMoreButtonRect();
                                if (moreButtonRect.height() * moreButtonRect.width() > 0) {
                                    g = m5pVar.a().g(h, moreButtonRect);
                                }
                            }
                            g = false;
                        }
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        z2 = true;
        if (z2) {
            return;
        }
        StoriesFeatures storiesFeatures3 = StoriesFeatures.ST_REACTION_STICKER;
        storiesFeatures3.getClass();
        if (!bVar.a(storiesFeatures3) || m5pVar.f) {
            return;
        }
        aqw.o((q7v0) m5pVar.e.getValue(), "stories:editor:reaction", new com.vk.movika.sdk.android.defaultplayer.control.l(m5pVar, 4));
    }
}
