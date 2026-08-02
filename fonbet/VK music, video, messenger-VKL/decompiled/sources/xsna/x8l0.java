package xsna;

import android.app.Activity;
import kotlin.NotImplementedError;
import xsna.obl0;
import xsna.sgy;

/* compiled from: StickersBridge.kt */
/* loaded from: classes5.dex */
public interface x8l0 {

    /* compiled from: StickersBridge.kt */
    public static final class a {
        public static final /* synthetic */ int a = 0;

        /* compiled from: StickersBridge.kt */
        /* renamed from: xsna.x8l0$a$a, reason: collision with other inner class name */
        public static final class C3986a implements x8l0 {
            @Override // xsna.x8l0
            public final zal0 a() {
                throw new NotImplementedError("An operation is not implemented: not implemented");
            }

            @Override // xsna.x8l0
            public final m4l0 b() {
                throw new NotImplementedError("An operation is not implemented: not implemented");
            }

            @Override // xsna.x8l0
            public final boolean c(String str) {
                throw new NotImplementedError("An operation is not implemented: not implemented");
            }

            @Override // xsna.x8l0
            public final obl0 e(Activity activity) {
                obl0.A7.getClass();
                return obl0.a.b;
            }

            @Override // xsna.x8l0
            public final boolean f() {
                throw new NotImplementedError("An operation is not implemented: not implemented");
            }

            @Override // xsna.x8l0
            public final n8l0 v() {
                throw new NotImplementedError("An operation is not implemented: not implemented");
            }
        }
    }

    static {
        int i = a.a;
    }

    zal0 a();

    m4l0 b();

    boolean c(String str);

    default sgy.a.C3666a d() {
        sgy.a.getClass();
        return sgy.a.b;
    }

    obl0 e(Activity activity);

    boolean f();

    n8l0 v();
}
