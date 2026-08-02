package ru.ok.android.externcalls.sdk.ml.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import xsna.epx;
import xsna.zr;

/* compiled from: ExtensionRule.kt */
/* loaded from: classes9.dex */
public interface ExtensionRule {

    /* compiled from: ExtensionRule.kt */
    public static final class OneOf implements ExtensionRule {
        private final Set<String> expected;

        public OneOf(Set<String> set) {
            this.expected = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OneOf copy$default(OneOf oneOf, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = oneOf.expected;
            }
            return oneOf.copy(set);
        }

        public final Set<String> component1() {
            return this.expected;
        }

        public final OneOf copy(Set<String> set) {
            return new OneOf(set);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OneOf) && epx.f(this.expected, ((OneOf) obj).expected);
        }

        public final Set<String> getExpected() {
            return this.expected;
        }

        public int hashCode() {
            return this.expected.hashCode();
        }

        @Override // ru.ok.android.externcalls.sdk.ml.model.ExtensionRule
        public boolean isSatisfied(Set<String> set) {
            Set<String> set2 = this.expected;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                return false;
            }
            Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                if (set.contains((String) it.next())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return "OneOf(expected=" + this.expected + ")";
        }
    }

    /* compiled from: ExtensionRule.kt */
    public static final class Required implements ExtensionRule {
        private final String expected;

        public Required(String str) {
            this.expected = str;
        }

        public static /* synthetic */ Required copy$default(Required required, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = required.expected;
            }
            return required.copy(str);
        }

        public final String component1() {
            return this.expected;
        }

        public final Required copy(String str) {
            return new Required(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Required) && epx.f(this.expected, ((Required) obj).expected);
        }

        public final String getExpected() {
            return this.expected;
        }

        public int hashCode() {
            return this.expected.hashCode();
        }

        @Override // ru.ok.android.externcalls.sdk.ml.model.ExtensionRule
        public boolean isSatisfied(Set<String> set) {
            return set.contains(this.expected);
        }

        public String toString() {
            return zr.a("Required(expected=", this.expected, ")");
        }
    }

    boolean isSatisfied(Set<String> set);
}
