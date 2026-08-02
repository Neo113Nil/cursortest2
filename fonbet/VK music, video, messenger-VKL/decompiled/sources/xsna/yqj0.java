package xsna;

import android.app.Activity;
import android.graphics.Rect;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import kotlin.LazyThreadSafetyMode;

/* compiled from: SimpleHintsBridgeImpl.kt */
/* loaded from: classes18.dex */
public final class yqj0 implements xqj0 {
    public final h7v a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new l35(28));

    public yqj0(h7v h7vVar) {
        this.a = h7vVar;
    }

    @Override // xsna.xqj0
    public final boolean a(igh ighVar) {
        HintId hintId = HintId.STORY_DEFAULT_LIFETIME_48;
        if (!this.a.m(hintId)) {
            return false;
        }
        n(hintId, ighVar);
        return true;
    }

    @Override // xsna.xqj0
    public final boolean b() {
        return this.a.m(HintId.STORIES_NEW_SERVICE_YC_STICKER);
    }

    @Override // xsna.xqj0
    public final boolean c() {
        return this.a.m(HintId.STORIES_EDITOR_VERTICALIZATION_BANNER);
    }

    @Override // xsna.xqj0
    public final boolean d(Activity activity, Rect rect) {
        return this.a.r(HintId.INFO_EDITOR_LONG_TAP.getId(), rect).g(48).j(activity) != null;
    }

    @Override // xsna.xqj0
    public final boolean e(Activity activity, Rect rect) {
        return this.a.r(HintId.INFO_STORY_ONLINE_BOOKING.getId(), rect).g(8388611).k(m(5)).c(m(256)).j(activity) != null;
    }

    @Override // xsna.xqj0
    public final void f(ape0 ape0Var) {
        n(HintId.STORIES_EDITOR_VERTICALIZATION_MENU, ape0Var);
    }

    @Override // xsna.xqj0
    public final boolean g(Activity activity, Rect rect) {
        return this.a.r(HintId.INFO_STORY_LIFETIME.getId(), rect).g(8388611).k(m(5)).c(m(256)).j(activity) != null;
    }

    @Override // xsna.xqj0
    public final void h() {
        this.a.b(HintId.STORIES_EDITOR_VERTICALIZATION_BANNER.getId());
    }

    @Override // xsna.xqj0
    public final boolean i(j5p j5pVar) {
        HintId hintId = HintId.STORIES_REMOVE_PRIVACY_ONLY_ME;
        h7v h7vVar = this.a;
        boolean m = h7vVar.m(hintId);
        h7vVar.o();
        if (h7vVar.m(hintId)) {
            j5pVar.invoke();
            h7vVar.b(hintId.getId());
        }
        return m;
    }

    @Override // xsna.xqj0
    public final void j(waf0 waf0Var) {
        n(HintId.STORIES_NEW_SERVICE_YC_STICKER, waf0Var);
    }

    @Override // xsna.xqj0
    public final boolean k() {
        return this.a.m(HintId.STORIES_REMOVE_PRIVACY_ONLY_ME);
    }

    @Override // xsna.xqj0
    public final void l(m1k m1kVar) {
        n(HintId.STORIES_GENERATED_MUSIC_MENU, m1kVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final int m(int i) {
        return (int) (((Number) this.b.getValue()).floatValue() * i);
    }

    public final void n(HintId hintId, izs<? super String, s3q0> izsVar) {
        Hint p;
        String str;
        h7v h7vVar = this.a;
        h7vVar.o();
        if (!h7vVar.m(hintId) || (p = h7vVar.p(hintId.getId())) == null || (str = p.c) == null) {
            return;
        }
        izsVar.invoke(str);
        h7vVar.b(hintId.getId());
    }
}
