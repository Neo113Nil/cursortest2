package com.yandex.div.core.util.mask;

import xsna.shy;
import xsna.vu5;
import xsna.zcl;

/* compiled from: TextDiff.kt */
/* loaded from: classes7.dex */
public final class TextDiff {
    public static final Companion Companion = new Companion(null);
    private final int added;
    private final int removed;
    private final int start;

    /* compiled from: TextDiff.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final TextDiff build(String str, String str2) {
            if (str.length() > str2.length()) {
                TextDiff build = build(str2, str);
                return new TextDiff(build.getStart(), build.getRemoved(), build.getAdded());
            }
            int length = str2.length() - 1;
            int length2 = str2.length() - str.length();
            int i = 0;
            while (i < length && i < str.length() && str.charAt(i) == str2.charAt(i)) {
                i++;
            }
            while (true) {
                int i2 = length - length2;
                if (i2 < i || str.charAt(i2) != str2.charAt(length)) {
                    break;
                }
                length--;
            }
            int i3 = (length + 1) - i;
            return new TextDiff(i, i3, i3 - length2);
        }

        private Companion() {
        }
    }

    public TextDiff(int i, int i2, int i3) {
        this.start = i;
        this.added = i2;
        this.removed = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextDiff)) {
            return false;
        }
        TextDiff textDiff = (TextDiff) obj;
        return this.start == textDiff.start && this.added == textDiff.added && this.removed == textDiff.removed;
    }

    public final int getAdded() {
        return this.added;
    }

    public final int getRemoved() {
        return this.removed;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return Integer.hashCode(this.removed) + shy.a(this.added, Integer.hashCode(this.start) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TextDiff(start=");
        sb.append(this.start);
        sb.append(", added=");
        sb.append(this.added);
        sb.append(", removed=");
        return vu5.b(sb, this.removed, ')');
    }
}
