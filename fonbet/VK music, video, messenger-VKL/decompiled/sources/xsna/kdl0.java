package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: StickersTouchHelper.kt */
/* loaded from: classes6.dex */
public final class kdl0 extends y9q implements o1l0 {
    public final StickersDrawingViewGroup b;
    public final g880 c;
    public final ikk0 d;
    public final tbe0 e;
    public final irc0 f;
    public final os30 g;

    public kdl0(StickersDrawingViewGroup stickersDrawingViewGroup, g880 g880Var, ikk0 ikk0Var, tbe0 tbe0Var, irc0 irc0Var, os30 os30Var) {
        super(stickersDrawingViewGroup);
        this.b = stickersDrawingViewGroup;
        this.c = g880Var;
        this.d = ikk0Var;
        this.e = tbe0Var;
        this.f = irc0Var;
        this.g = os30Var;
    }

    public static String b(nov novVar) {
        String accessibilityText;
        if (novVar != null && (accessibilityText = novVar.getAccessibilityText()) != null) {
            if (drm0.N(accessibilityText)) {
                accessibilityText = null;
            }
            if (accessibilityText != null) {
                return accessibilityText;
            }
        }
        int i = novVar instanceof xlo0 ? R.string.accessibility_text : novVar instanceof v4m0 ? R.string.accessibility_hashtag : novVar instanceof x6m0 ? R.string.accessibility_mention : novVar instanceof yjm0 ? R.string.accessibility_time : novVar instanceof sam0 ? R.string.accessibility_question : novVar instanceof h7m0 ? R.string.accessibility_music : novVar instanceof z3m0 ? R.string.accessibility_location : novVar instanceof no6 ? R.string.accessibility_product : novVar instanceof c8m0 ? R.string.accessibility_photo : novVar instanceof unm0 ? R.string.accessibility_vmoji : novVar instanceof r8m0 ? R.string.accessibility_poll : novVar instanceof q5m0 ? R.string.accessibility_link : R.string.story_accessibility_story_sticker;
        Context context = e43.a;
        return (context != null ? context : null).getString(i);
    }

    public final void a(nov novVar) {
        int i = 0;
        for (Object obj : (Iterable) this.c.invoke()) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            nov novVar2 = (nov) obj;
            if (novVar == novVar2) {
                sendEventForVirtualView(i, 32768);
                this.b.announceForAccessibility(b(novVar2));
            }
            i = i2;
        }
    }

    @Override // xsna.y9q
    public final int getVirtualViewAt(float f, float f2) {
        if (!((Boolean) this.f.invoke()).booleanValue()) {
            return -1;
        }
        RectF rectF = new RectF();
        List list = (List) this.c.invoke();
        int size = list.size() - 1;
        while (true) {
            if (-1 >= size) {
                size = -1;
                break;
            }
            nov novVar = (nov) list.get(size);
            rectF.set(novVar.getLeft(), novVar.getTop(), novVar.getRight(), novVar.getBottom());
            if (!(novVar instanceof si9) && !(novVar instanceof lo9) && rectF.contains(f, f2)) {
                break;
            }
            size--;
        }
        if (size == -1) {
            return Integer.MIN_VALUE;
        }
        return size;
    }

    @Override // xsna.y9q
    public final void getVisibleVirtualViews(List<Integer> list) {
        int i = 0;
        for (Object obj : (Iterable) this.c.invoke()) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            list.add(Integer.valueOf(i));
            i = i2;
        }
    }

    @Override // xsna.y9q
    public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        nov novVar;
        r9l0 r9l0Var;
        if (i2 != 16 || (novVar = (nov) j5g.b0(i, (List) this.c.invoke())) == null || (r9l0Var = ((StickersDrawingViewGroup) this.d.c).d) == null) {
            return false;
        }
        boolean d = r9l0Var.d(novVar);
        this.e.invoke();
        return d;
    }

    @Override // xsna.y9q
    public final void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
        nov novVar = (nov) j5g.b0(i, (List) this.c.invoke());
        if (novVar != null) {
            accessibilityEvent.getText().add(b(novVar));
        }
    }

    @Override // xsna.y9q
    public final void onPopulateNodeForVirtualView(int i, am amVar) {
        Rect rect;
        nov novVar = (nov) j5g.b0(i, (List) this.c.invoke());
        if (novVar != null) {
            RectF rectF = new RectF(novVar.getLeft(), novVar.getTop(), novVar.getRight(), novVar.getBottom());
            rect = new Rect();
            rectF.roundOut(rect);
        } else {
            rect = null;
        }
        if (rect == null) {
            amVar.j(new Rect());
            amVar.A("");
            amVar.a.setImportantForAccessibility(false);
        } else {
            amVar.j(rect);
            amVar.A(b(novVar));
            if (((Boolean) this.g.invoke()).booleanValue()) {
                amVar.a(16);
            }
            amVar.l(false);
            amVar.C(false);
        }
    }
}
