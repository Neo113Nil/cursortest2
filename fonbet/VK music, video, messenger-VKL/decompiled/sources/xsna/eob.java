package xsna;

import com.vk.clips.sdk.shared.decoration.ClipsFeedDecorationPayload;
import com.vk.im.chat.clips.decoration.api.models.ImChatClipsInitDecorPayload;

/* compiled from: ChatClipsDecorationOnboardingInteractor.kt */
/* loaded from: classes2.dex */
public final class eob implements w8l {
    public final wob a;
    public ClipsFeedDecorationPayload b;
    public final io.reactivex.rxjava3.subjects.f<hjj0> c = new io.reactivex.rxjava3.subjects.f<>();

    public eob(wob wobVar) {
        this.a = wobVar;
    }

    @Override // xsna.w8l
    public final void a(ClipsFeedDecorationPayload clipsFeedDecorationPayload) {
        this.b = clipsFeedDecorationPayload;
    }

    @Override // xsna.w8l
    public final void b(int i) {
        ClipsFeedDecorationPayload clipsFeedDecorationPayload = this.b;
        f18 f18Var = this.a.a;
        qcy<Object> qcyVar = wob.b[0];
        if (f18Var.a().booleanValue() || !(clipsFeedDecorationPayload instanceof ImChatClipsInitDecorPayload) || i <= 0) {
            return;
        }
        this.c.onNext(new hjj0());
    }

    @Override // xsna.w8l
    public final void c() {
        f18 f18Var = this.a.a;
        qcy<Object> qcyVar = wob.b[0];
        f18Var.b(true);
    }

    @Override // xsna.w8l
    public final io.reactivex.rxjava3.core.q<hjj0> d() {
        return this.c;
    }
}
