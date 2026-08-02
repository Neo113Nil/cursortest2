package xsna;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import com.facebook.soloader.MinElf;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.shortvideo.ClipGridParams;
import xsna.o0r0;

/* compiled from: MentionsSpanFactory.kt */
/* loaded from: classes17.dex */
public final class z420 {
    public final y420 a;
    public final bpn0 b = new bpn0(new com.vk.movika.sdk.base.logic.interactor.g(24));

    public z420(y420 y420Var) {
        this.a = y420Var;
    }

    /* compiled from: MentionsSpanFactory.kt */
    public static final class a extends qjc {
        public final UserId i;
        public final String j;
        public final y420 k;
        public k7f l;

        public a(UserId userId, String str, y420 y420Var) {
            super(null);
            this.i = userId;
            this.j = str;
            this.k = y420Var;
        }

        @Override // xsna.rku0
        public final void f(Context context, View view) {
            if (context == null) {
                return;
            }
            zof zofVar = this.k.a;
            UserId userId = this.i;
            if (fkq0.b(userId)) {
                if (zofVar.k()) {
                    t6g0 t6g0Var = t6g0.b;
                    Group C0 = t6g0.b().C0(fkq0.a(userId));
                    ClipsRouter.j(g620.f().a(), context, new ClipGridParams.OnlyId.Profile(userId), C0 != null ? C0.e() : false, null, null, 56);
                } else {
                    xwk.e().m(context, userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                }
            } else if (zofVar.k()) {
                ClipsRouter.j(g620.f().a(), context, new ClipGridParams.OnlyId.Profile(userId), o25.a().a(userId), null, null, 56);
            } else {
                xwk.e().m(context, userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
            }
            k7f k7fVar = this.l;
            if (k7fVar != null) {
                k7fVar.invoke(this.j);
            }
        }

        @Override // xsna.qjc, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setUnderlineText(false);
        }

        @Override // xsna.rku0
        public final void a(Context context, View view) {
        }
    }
}
