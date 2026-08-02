package xsna;

import com.vk.photo.editor.domain.LowMemoryException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: EditorImageFactory.kt */
/* loaded from: classes4.dex */
public interface b4p {

    /* compiled from: EditorImageFactory.kt */
    public static class a {
        public final int a;
        public final int b;
        public final boolean c;
        public final String d;

        /* compiled from: EditorImageFactory.kt */
        /* renamed from: xsna.b4p$a$a, reason: collision with other inner class name */
        public static final class C2587a extends a {
            public static final C2587a e = new C2587a(0, 0, false);
        }

        /* compiled from: EditorImageFactory.kt */
        public static final class b extends a {
            public static final b e = new b(0, 0, true);
        }

        public a(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = i + StringUtils.PROCESS_POSTFIX_DELIMITER + i2 + (z ? ":enhanced" : "");
        }

        public final String toString() {
            return this.d;
        }
    }

    void a(o3p o3pVar);

    o3p c(e4p e4pVar, a aVar) throws LowMemoryException;
}
