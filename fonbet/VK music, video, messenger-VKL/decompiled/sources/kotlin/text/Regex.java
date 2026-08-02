package kotlin.text;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.drm0;
import xsna.hl10;
import xsna.izs;
import xsna.ji;
import xsna.kjt;
import xsna.ppf0;
import xsna.qg1;
import xsna.unr;
import xsna.zk10;

/* compiled from: Regex.kt */
/* loaded from: classes11.dex */
public final class Regex implements Serializable {
    private Set<? extends RegexOption> _options;
    private final Pattern nativePattern;

    /* compiled from: Regex.kt */
    public static final class a {
    }

    /* compiled from: Regex.kt */
    /* loaded from: classes8.dex */
    public static final class b implements Serializable {
        private static final long serialVersionUID = 0;
        private final int flags;
        private final String pattern;

        public b(String str, int i) {
            this.pattern = str;
            this.flags = i;
        }

        private final Object readResolve() {
            return new Regex(Pattern.compile(this.pattern, this.flags));
        }
    }

    public Regex(Pattern pattern) {
        this.nativePattern = pattern;
    }

    public static kjt d(Regex regex, CharSequence charSequence) {
        regex.getClass();
        if (charSequence.length() >= 0) {
            return new kjt(new qg1(19, regex, charSequence), ppf0.b);
        }
        StringBuilder b2 = ji.b(0, "Start index out of bounds: ", ", input length: ");
        b2.append(charSequence.length());
        throw new IndexOutOfBoundsException(b2.toString());
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new b(this.nativePattern.pattern(), this.nativePattern.flags());
    }

    public final boolean a(CharSequence charSequence) {
        return this.nativePattern.matcher(charSequence).find();
    }

    public final hl10 b(CharSequence charSequence) {
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (matcher.find(0)) {
            return new hl10(matcher, charSequence);
        }
        return null;
    }

    public final hl10 e(CharSequence charSequence) {
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (matcher.matches()) {
            return new hl10(matcher, charSequence);
        }
        return null;
    }

    public final boolean f(CharSequence charSequence) {
        return this.nativePattern.matcher(charSequence).matches();
    }

    public final String g(CharSequence charSequence, String str) {
        return this.nativePattern.matcher(charSequence).replaceAll(str);
    }

    public final String h(CharSequence charSequence, izs<? super zk10, ? extends CharSequence> izsVar) {
        hl10 b2 = b(charSequence);
        if (b2 == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        do {
            sb.append(charSequence, i, b2.c().b);
            sb.append(izsVar.invoke(b2));
            i = b2.c().c + 1;
            b2 = b2.next();
            if (i >= length) {
                break;
            }
        } while (b2 != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        return sb.toString();
    }

    public final String i(CharSequence charSequence, String str) {
        return this.nativePattern.matcher(charSequence).replaceFirst(str);
    }

    public final List j(int i, CharSequence charSequence) {
        drm0.Z(i);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return Collections.singletonList(charSequence.toString());
        }
        int i2 = 10;
        if (i > 0 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i - 1;
        int i4 = 0;
        do {
            arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            if (i3 >= 0 && arrayList.size() == i3) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
        return arrayList;
    }

    public final Pattern k() {
        return this.nativePattern;
    }

    public final String toString() {
        return this.nativePattern.toString();
    }

    public Regex(String str) {
        this(Pattern.compile(str));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Regex(String str, RegexOption regexOption) {
        this(Pattern.compile(str, (r3 & 2) != 0 ? r3 | 64 : r3));
        int value = regexOption.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Regex(String str, Set<? extends RegexOption> set) {
        this(Pattern.compile(str, (r0 & 2) != 0 ? r0 | 64 : r0));
        Iterator<T> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((unr) it.next()).getValue();
        }
    }
}
