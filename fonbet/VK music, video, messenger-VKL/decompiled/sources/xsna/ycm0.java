package xsna;

import android.content.Context;
import android.view.Window;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.story.viewer.impl.presentation.stories.message.FastReaction;
import com.vkontakte.android.R;
import java.util.List;
import xsna.ify;
import xsna.vu4;

/* compiled from: StorySendMessagePresenter.kt */
/* loaded from: classes6.dex */
public final class ycm0 implements cc6, vu4.a, ify.a {
    public static final List<FastReaction> n = e43.l(FastReaction.HEART, FastReaction.FIRE, FastReaction.THUMBS_UP);
    public static final List<FastReaction> o = e43.l(FastReaction.FACE_WITH_TEARS_OF_HAPPINESS, FastReaction.FACE_WITH_HEART_EYES, FastReaction.PRAYING_HANDS);
    public final iul0 b;
    public final kcl0 c;
    public final StoryOwner d;
    public vu4 e;
    public zb90 f;
    public lcm0 g;
    public mcm0 h;
    public y6m0 i;
    public boolean k;
    public boolean l;
    public boolean j = true;
    public final io.reactivex.rxjava3.disposables.b m = new io.reactivex.rxjava3.disposables.b();

    public ycm0(iul0 iul0Var, kcl0 kcl0Var, StoryOwner storyOwner) {
        this.b = iul0Var;
        this.c = kcl0Var;
        this.d = storyOwner;
    }

    @Override // xsna.vu4.a
    public final void I() {
        zb90 zb90Var = this.f;
        if (zb90Var == null) {
            zb90Var = null;
        }
        zb90Var.e(false);
        zb90 zb90Var2 = this.f;
        if (zb90Var2 == null) {
            zb90Var2 = null;
        }
        zb90Var2.c(false);
        lcm0 lcm0Var = this.g;
        if (lcm0Var == null) {
            lcm0Var = null;
        }
        anm0 anm0Var = lcm0Var.a;
        xkm0 xkm0Var = lcm0Var.b;
        anm0Var.g(xkm0Var != null ? xkm0Var : null);
    }

    @Override // xsna.ify.a
    public final void Y0() {
        mcm0 mcm0Var = this.h;
        if (mcm0Var == null) {
            mcm0Var = null;
        }
        ((tcm0) mcm0Var).dismiss();
    }

    @Override // xsna.vu4.a
    public final boolean a0() {
        mcm0 mcm0Var = this.h;
        if (mcm0Var == null) {
            mcm0Var = null;
        }
        ((tcm0) mcm0Var).dismiss();
        return true;
    }

    public final void b() {
        zb90 zb90Var = this.f;
        if (zb90Var == null) {
            zb90Var = null;
        }
        zb90Var.e(true);
        zb90 zb90Var2 = this.f;
        (zb90Var2 != null ? zb90Var2 : null).c(true);
        this.k = false;
    }

    @Override // xsna.vu4.a
    public final void g() {
        lcm0 lcm0Var = this.g;
        if (lcm0Var == null) {
            lcm0Var = null;
        }
        lcm0Var.getClass();
    }

    @Override // xsna.vu4.a
    public final void h1() {
        b();
        mcm0 mcm0Var = this.h;
        if (mcm0Var == null) {
            mcm0Var = null;
        }
        ((tcm0) mcm0Var).d.setText("");
        lcm0 lcm0Var = this.g;
        (lcm0Var != null ? lcm0Var : null).getClass();
    }

    @Override // xsna.vu4.a
    public final void i1(AttachAudioMsg attachAudioMsg) {
        y6m0 y6m0Var = this.i;
        if (y6m0Var == null) {
            y6m0Var = null;
        }
        if (!this.b.i(attachAudioMsg, y6m0Var)) {
            b();
            mcm0 mcm0Var = this.h;
            ((tcm0) (mcm0Var != null ? mcm0Var : null)).g0();
            return;
        }
        x();
        lcm0 lcm0Var = this.g;
        if (lcm0Var == null) {
            lcm0Var = null;
        }
        anm0 anm0Var = lcm0Var.a;
        xkm0 xkm0Var = lcm0Var.b;
        anm0Var.L(xkm0Var != null ? xkm0Var : null);
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        vu4 vu4Var = this.e;
        if (vu4Var == null) {
            vu4Var = null;
        }
        vu4Var.W0();
        vu4 vu4Var2 = this.e;
        if (vu4Var2 == null) {
            vu4Var2 = null;
        }
        vu4Var2.H0();
        vu4 vu4Var3 = this.e;
        (vu4Var3 != null ? vu4Var3 : null).G0();
        this.m.dispose();
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    @Override // xsna.vu4.a
    public final void p0() {
        b();
    }

    public final void t2(int i, StickerItem stickerItem, String str, String str2, String str3) {
        StoryViewAction storyViewAction;
        y6m0 y6m0Var = this.i;
        if (y6m0Var == null) {
            y6m0Var = null;
        }
        if (!this.b.b(i, stickerItem, str, y6m0Var)) {
            mcm0 mcm0Var = this.h;
            ((tcm0) (mcm0Var != null ? mcm0Var : null)).g0();
            return;
        }
        x();
        lcm0 lcm0Var = this.g;
        if (lcm0Var == null) {
            lcm0Var = null;
        }
        int i2 = stickerItem.b;
        lcm0Var.getClass();
        int hashCode = str2.hashCode();
        if (hashCode == -1362920633) {
            if (str2.equals("fast_reactions")) {
                storyViewAction = StoryViewAction.STICKER_REACTION_SEND;
            }
            storyViewAction = null;
        } else if (hashCode != 503739367) {
            if (hashCode == 1197722116 && str2.equals("suggestion")) {
                storyViewAction = StoryViewAction.STICKER_SUGGESTION_SEND;
            }
            storyViewAction = null;
        } else {
            if (str2.equals("keyboard")) {
                storyViewAction = StoryViewAction.STICKER_KEYBOARD_SEND;
            }
            storyViewAction = null;
        }
        if (storyViewAction != null) {
            anm0 anm0Var = lcm0Var.a;
            xkm0 xkm0Var = lcm0Var.b;
            anm0Var.K(storyViewAction, xkm0Var != null ? xkm0Var : null, new kcm0(i2, str3));
        }
    }

    public final void x() {
        zb90 zb90Var = this.f;
        if (zb90Var == null) {
            zb90Var = null;
        }
        zb90Var.b(false);
        zb90 zb90Var2 = this.f;
        if (zb90Var2 == null) {
            zb90Var2 = null;
        }
        zb90Var2.c(false);
        mcm0 mcm0Var = this.h;
        if (mcm0Var == null) {
            mcm0Var = null;
        }
        mhy.d(((tcm0) mcm0Var).d);
        mcm0 mcm0Var2 = this.h;
        if (mcm0Var2 == null) {
            mcm0Var2 = null;
        }
        tcm0 tcm0Var = (tcm0) mcm0Var2;
        Context context = tcm0Var.getContext();
        uov uovVar = tcm0Var.b;
        Window window = uovVar.getWindow();
        iz8 cadreSize = uovVar.getCadreSize();
        int i = cadreSize != null ? (int) cadreSize.d : 0;
        if ((40 & 16) != 0) {
            i = iah0.a(88);
        }
        cmf0.d(context, window, context.getString(R.string.story_message_sending), false, i, (40 & 32) != 0);
        mcm0 mcm0Var3 = this.h;
        if (mcm0Var3 == null) {
            mcm0Var3 = null;
        }
        ((tcm0) mcm0Var3).d.setText("");
        mcm0 mcm0Var4 = this.h;
        ((tcm0) (mcm0Var4 != null ? mcm0Var4 : null)).dismiss();
    }

    public final void z() {
        mcm0 mcm0Var = this.h;
        if (mcm0Var == null) {
            mcm0Var = null;
        }
        CharSequence text = ((tcm0) mcm0Var).d.getText();
        if (text == null) {
            text = "";
        }
        if (text.length() == 0) {
            return;
        }
        String obj = text.toString();
        y6m0 y6m0Var = this.i;
        if (y6m0Var == null) {
            y6m0Var = null;
        }
        if (this.b.f(obj, y6m0Var)) {
            x();
        } else {
            mcm0 mcm0Var2 = this.h;
            ((tcm0) (mcm0Var2 != null ? mcm0Var2 : null)).g0();
        }
    }

    @Override // xsna.vu4.a
    public final void Z() {
    }

    @Override // xsna.vu4.a
    public final void onDismiss() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.vu4.a
    public final void r1(AttachAudioMsg attachAudioMsg) {
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
    }

    @Override // xsna.vu4.a
    public final void s2(AttachAudioMsg attachAudioMsg, qc qcVar) {
    }
}
