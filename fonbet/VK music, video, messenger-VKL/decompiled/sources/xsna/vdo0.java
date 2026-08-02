package xsna;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* loaded from: classes11.dex */
public final class vdo0 {
    public static final e a = new e(null, false);
    public static final e b = new e(null, true);
    public static final e c;
    public static final e d;
    public static final e e;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public static class a implements c {
        public static final a a = new a();

        @Override // xsna.vdo0.c
        public final int a(int i, CharSequence charSequence) {
            int i2 = 0;
            boolean z = false;
            while (true) {
                char c = 2;
                if (i2 >= i) {
                    return z ? 1 : 2;
                }
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                e eVar = vdo0.a;
                if (directionality == 0) {
                    c = 1;
                } else if (directionality == 1 || directionality == 2) {
                    c = 0;
                }
                if (c == 0) {
                    return 0;
                }
                if (c == 1) {
                    z = true;
                }
                i2++;
            }
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public static class b implements c {
        public static final b a = new b();

        @Override // xsna.vdo0.c
        public final int a(int i, CharSequence charSequence) {
            int i2 = 2;
            for (int i3 = 0; i3 < i && i2 == 2; i3++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i3));
                e eVar = vdo0.a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i2 = 2;
                                break;
                        }
                    }
                    i2 = 0;
                }
                i2 = 1;
            }
            return i2;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public interface c {
        int a(int i, CharSequence charSequence);
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public static abstract class d {
        public final c a;

        public d(c cVar) {
            this.a = cVar;
        }

        public abstract boolean a();

        public final boolean b(int i, CharSequence charSequence) {
            if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
                throw new IllegalArgumentException();
            }
            c cVar = this.a;
            if (cVar == null) {
                return a();
            }
            int a = cVar.a(i, charSequence);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return a();
            }
            return false;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public static class e extends d {
        public final boolean b;

        public e(c cVar, boolean z) {
            super(cVar);
            this.b = z;
        }

        @Override // xsna.vdo0.d
        public final boolean a() {
            return this.b;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public static class f extends d {
        public static final f b = new f(null);

        @Override // xsna.vdo0.d
        public final boolean a() {
            return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.a;
        c = new e(bVar, false);
        d = new e(bVar, true);
        e = new e(a.a, false);
    }
}
