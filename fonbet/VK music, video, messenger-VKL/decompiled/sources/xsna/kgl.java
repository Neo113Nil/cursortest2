package xsna;

import androidx.emoji2.text.c;

/* compiled from: EmojiCompatStatus.android.kt */
/* loaded from: classes11.dex */
public final class kgl {
    public mtk0<Boolean> a;

    /* compiled from: EmojiCompatStatus.android.kt */
    public static final class a extends c.f {
        public final /* synthetic */ wh50<Boolean> b;
        public final /* synthetic */ kgl c;

        public a(wh50<Boolean> wh50Var, kgl kglVar) {
            this.b = wh50Var;
            this.c = kglVar;
        }

        @Override // androidx.emoji2.text.c.f
        public final void a() {
            this.c.a = d02.q;
        }

        @Override // androidx.emoji2.text.c.f
        public final void b() {
            ((zak0) this.b).setValue(Boolean.TRUE);
            this.c.a = new aow(true);
        }
    }

    public final mtk0<Boolean> a() {
        androidx.emoji2.text.c a2 = androidx.emoji2.text.c.a();
        if (a2.c() == 1) {
            return new aow(true);
        }
        wh50 b = androidx.compose.runtime.k.b(Boolean.FALSE);
        a2.h(new a(b, this));
        return b;
    }
}
