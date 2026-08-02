package xsna;

import com.vk.camera.drawing.gradient.StoryEditText;
import com.vk.dto.stories.entities.StoryCameraTarget;
import java.util.Collections;

/* compiled from: StoryPrivacyHint.kt */
/* loaded from: classes16.dex */
public interface r9m0 {

    /* compiled from: StoryPrivacyHint.kt */
    public static final class a extends rno0 {
        public final /* synthetic */ Object b;

        public a(r9m0 r9m0Var) {
            this.b = r9m0Var;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xsna.r9m0] */
        @Override // xsna.rno0, android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int length = charSequence.length();
            ?? r2 = this.b;
            if (length == 0) {
                r2.x().d();
            } else {
                r2.x().c();
            }
        }
    }

    default void b() {
        if (getTarget().h() || !o25.a().b()) {
            return;
        }
        z().addTextChangedListener(new a(this));
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new io(Collections.singletonList("stories"), false, false, false), null, null, 3);
        p350 p350Var = new p350(this, 21);
        int i = kwg0.a;
        y0.subscribe(p350Var, new iwg0());
    }

    void g();

    StoryCameraTarget getTarget();

    t9m0 x();

    StoryEditText z();
}
