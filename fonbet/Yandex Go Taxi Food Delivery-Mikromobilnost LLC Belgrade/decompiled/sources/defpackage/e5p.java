package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes10.dex */
public interface e5p {
    public static final eb a = new e5p() { // from class: eb
        public final /* synthetic */ int b = 4;

        @Override // defpackage.e5p
        public final b5p[] c() {
            switch (this.b) {
                case 0:
                    return new b5p[]{new fb()};
                case 1:
                    return new b5p[]{new ib()};
                case 2:
                    return new b5p[]{new ed1()};
                case 3:
                    return new b5p[]{new g22()};
                case 4:
                    return new b5p[0];
                case 5:
                    return new b5p[]{new xer()};
                case 6:
                    return new b5p[]{new ltr()};
                case 7:
                    return new b5p[]{new wb30(16, o2v0.d4)};
                case 8:
                    return new b5p[]{new qv60()};
                case 9:
                    return new b5p[]{new cyf0()};
                case 10:
                    return new b5p[]{new vi11(1, 1, o2v0.d4, new sez0(0L), new ymh(0))};
                default:
                    return new b5p[]{new o941()};
            }
        }
    };

    default void a(boolean z) {
    }

    default b5p[] b(Uri uri, Map map) {
        return c();
    }

    b5p[] c();

    default void d(dlh dlhVar) {
    }

    default void e() {
    }
}
