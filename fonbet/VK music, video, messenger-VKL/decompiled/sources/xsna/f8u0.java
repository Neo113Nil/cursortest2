package xsna;

import android.util.Base64;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.util.List;
import xsna.c22;

/* compiled from: VkAndroidAutoBrowsableSerializer.kt */
/* loaded from: classes16.dex */
public final class f8u0 implements j8u0, h8u0 {
    public final i8u0<c22> a;

    /* compiled from: VkAndroidAutoBrowsableSerializer.kt */
    public static final class a implements j8u0, h8u0 {
        public static final a a = new a();

        @Override // xsna.h8u0
        public final Object a(String str) {
            List b0 = drm0.b0(str, new char[]{'|'}, 0, 6);
            return new c22.a(cqm0.a(new String(Base64.decode((String) b0.get(0), 8), emb.b)), cqm0.a((String) b0.get(1)));
        }

        @Override // xsna.j8u0
        public final String serialize(Object obj) {
            c22.a aVar = (c22.a) obj;
            StringBuilder sb = new StringBuilder();
            String str = aVar.a;
            String encodeToString = str != null ? Base64.encodeToString(str.getBytes(emb.b), 8) : null;
            if (encodeToString == null) {
                encodeToString = "";
            }
            sb.append(encodeToString);
            sb.append('|');
            String str2 = aVar.b;
            sb.append(str2 != null ? str2 : "");
            return sb.toString();
        }
    }

    /* compiled from: VkAndroidAutoBrowsableSerializer.kt */
    public static final class b implements j8u0, h8u0 {
        public static final b a = new b();

        @Override // xsna.h8u0
        public final Object a(String str) {
            List b0 = drm0.b0(str, new char[]{'|'}, 0, 6);
            return new c22.b((String) b0.get(0), (String) b0.get(1));
        }

        @Override // xsna.j8u0
        public final String serialize(Object obj) {
            c22.b bVar = (c22.b) obj;
            return bVar.a + '|' + bVar.b;
        }
    }

    /* compiled from: VkAndroidAutoBrowsableSerializer.kt */
    public static final class c implements j8u0, h8u0 {
        public static final c a = new c();

        @Override // xsna.h8u0
        public final Object a(String str) {
            List b0 = drm0.b0(str, new char[]{'|'}, 0, 6);
            return new c22.c((String) b0.get(0), cqm0.a((String) b0.get(1)));
        }

        @Override // xsna.j8u0
        public final String serialize(Object obj) {
            c22.c cVar = (c22.c) obj;
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.a);
            sb.append('|');
            String str = cVar.b;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            return sb.toString();
        }
    }

    public f8u0(i8u0 i8u0Var) {
        this.a = i8u0Var;
    }

    @Override // xsna.h8u0
    public final Object a(String str) {
        return str.equals(DomExceptionUtils.SEPARATOR) ? c22.a.c : this.a.a(str);
    }

    @Override // xsna.j8u0
    public final String serialize(Object obj) {
        return this.a.serialize((c22) obj);
    }
}
