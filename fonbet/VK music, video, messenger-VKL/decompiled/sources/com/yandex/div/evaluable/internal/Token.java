package com.yandex.div.evaluable.internal;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.air;
import xsna.epx;
import xsna.ho8;
import xsna.vby;

/* compiled from: Token.kt */
/* loaded from: classes7.dex */
public interface Token {

    /* compiled from: Token.kt */
    public static final class Function implements Token {
        private final String name;

        /* compiled from: Token.kt */
        public static final class ArgumentDelimiter implements Token {
            public static final ArgumentDelimiter INSTANCE = new ArgumentDelimiter();

            private ArgumentDelimiter() {
            }

            public String toString() {
                return StringUtils.COMMA;
            }
        }

        public Function(String str) {
            this.name = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Function) && epx.f(this.name, ((Function) obj).name);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return ho8.a(new StringBuilder("Function(name="), this.name, ')');
        }
    }

    /* compiled from: Token.kt */
    public interface Operator extends Token {

        /* compiled from: Token.kt */
        public interface Binary extends Operator {

            /* compiled from: Token.kt */
            public interface Comparison extends Binary {

                /* compiled from: Token.kt */
                public static final class Greater implements Comparison {
                    public static final Greater INSTANCE = new Greater();

                    private Greater() {
                    }

                    public String toString() {
                        return ">";
                    }
                }

                /* compiled from: Token.kt */
                public static final class GreaterOrEqual implements Comparison {
                    public static final GreaterOrEqual INSTANCE = new GreaterOrEqual();

                    private GreaterOrEqual() {
                    }

                    public String toString() {
                        return ">=";
                    }
                }

                /* compiled from: Token.kt */
                public static final class Less implements Comparison {
                    public static final Less INSTANCE = new Less();

                    private Less() {
                    }

                    public String toString() {
                        return "<";
                    }
                }

                /* compiled from: Token.kt */
                public static final class LessOrEqual implements Comparison {
                    public static final LessOrEqual INSTANCE = new LessOrEqual();

                    private LessOrEqual() {
                    }

                    public String toString() {
                        return "<=";
                    }
                }
            }

            /* compiled from: Token.kt */
            public interface Equality extends Binary {

                /* compiled from: Token.kt */
                public static final class Equal implements Equality {
                    public static final Equal INSTANCE = new Equal();

                    private Equal() {
                    }

                    public String toString() {
                        return "==";
                    }
                }

                /* compiled from: Token.kt */
                public static final class NotEqual implements Equality {
                    public static final NotEqual INSTANCE = new NotEqual();

                    private NotEqual() {
                    }

                    public String toString() {
                        return "!=";
                    }
                }
            }

            /* compiled from: Token.kt */
            public interface Factor extends Binary {

                /* compiled from: Token.kt */
                public static final class Division implements Factor {
                    public static final Division INSTANCE = new Division();

                    private Division() {
                    }

                    public String toString() {
                        return DomExceptionUtils.SEPARATOR;
                    }
                }

                /* compiled from: Token.kt */
                public static final class Modulo implements Factor {
                    public static final Modulo INSTANCE = new Modulo();

                    private Modulo() {
                    }

                    public String toString() {
                        return "%";
                    }
                }

                /* compiled from: Token.kt */
                public static final class Multiplication implements Factor {
                    public static final Multiplication INSTANCE = new Multiplication();

                    private Multiplication() {
                    }

                    public String toString() {
                        return "*";
                    }
                }
            }

            /* compiled from: Token.kt */
            public interface Logical extends Binary {

                /* compiled from: Token.kt */
                public static final class And implements Logical {
                    public static final And INSTANCE = new And();

                    private And() {
                    }

                    public String toString() {
                        return "&&";
                    }
                }

                /* compiled from: Token.kt */
                public static final class Or implements Logical {
                    public static final Or INSTANCE = new Or();

                    private Or() {
                    }

                    public String toString() {
                        return "||";
                    }
                }
            }

            /* compiled from: Token.kt */
            public static final class Power implements Binary {
                public static final Power INSTANCE = new Power();

                private Power() {
                }

                public String toString() {
                    return "^";
                }
            }

            /* compiled from: Token.kt */
            public interface Sum extends Binary {

                /* compiled from: Token.kt */
                public static final class Minus implements Sum {
                    public static final Minus INSTANCE = new Minus();

                    private Minus() {
                    }

                    public String toString() {
                        return "-";
                    }
                }

                /* compiled from: Token.kt */
                public static final class Plus implements Sum {
                    public static final Plus INSTANCE = new Plus();

                    private Plus() {
                    }

                    public String toString() {
                        return "+";
                    }
                }
            }
        }

        /* compiled from: Token.kt */
        public static final class Dot implements Operator {
            public static final Dot INSTANCE = new Dot();

            private Dot() {
            }

            public String toString() {
                return ".";
            }
        }

        /* compiled from: Token.kt */
        public static final class TernaryElse implements Operator {
            public static final TernaryElse INSTANCE = new TernaryElse();

            private TernaryElse() {
            }

            public String toString() {
                return StringUtils.PROCESS_POSTFIX_DELIMITER;
            }
        }

        /* compiled from: Token.kt */
        public static final class TernaryIf implements Operator {
            public static final TernaryIf INSTANCE = new TernaryIf();

            private TernaryIf() {
            }

            public String toString() {
                return "?";
            }
        }

        /* compiled from: Token.kt */
        public static final class TernaryIfElse implements Operator {
            public static final TernaryIfElse INSTANCE = new TernaryIfElse();

            private TernaryIfElse() {
            }
        }

        /* compiled from: Token.kt */
        public static final class Try implements Operator {
            public static final Try INSTANCE = new Try();

            private Try() {
            }

            public String toString() {
                return "!:";
            }
        }

        /* compiled from: Token.kt */
        public interface Unary extends Operator {

            /* compiled from: Token.kt */
            public static final class Minus implements Unary {
                public static final Minus INSTANCE = new Minus();

                private Minus() {
                }

                public String toString() {
                    return "-";
                }
            }

            /* compiled from: Token.kt */
            public static final class Not implements Unary {
                public static final Not INSTANCE = new Not();

                private Not() {
                }

                public String toString() {
                    return "!";
                }
            }

            /* compiled from: Token.kt */
            public static final class Plus implements Unary {
                public static final Plus INSTANCE = new Plus();

                private Plus() {
                }

                public String toString() {
                    return "+";
                }
            }
        }
    }

    /* compiled from: Token.kt */
    public interface Operand extends Token {

        /* compiled from: Token.kt */
        public interface Literal extends Operand {

            /* compiled from: Token.kt */
            @vby
            public static final class Bool implements Literal {
                private final boolean value;

                private /* synthetic */ Bool(boolean z) {
                    this.value = z;
                }

                /* renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Bool m156boximpl(boolean z) {
                    return new Bool(z);
                }

                /* renamed from: equals-impl, reason: not valid java name */
                public static boolean m158equalsimpl(boolean z, Object obj) {
                    return (obj instanceof Bool) && z == ((Bool) obj).m161unboximpl();
                }

                /* renamed from: hashCode-impl, reason: not valid java name */
                public static int m159hashCodeimpl(boolean z) {
                    if (z) {
                        return 1;
                    }
                    return z ? 1 : 0;
                }

                /* renamed from: toString-impl, reason: not valid java name */
                public static String m160toStringimpl(boolean z) {
                    return "Bool(value=" + z + ')';
                }

                public boolean equals(Object obj) {
                    return m158equalsimpl(this.value, obj);
                }

                public int hashCode() {
                    return m159hashCodeimpl(this.value);
                }

                public String toString() {
                    return m160toStringimpl(this.value);
                }

                /* renamed from: unbox-impl, reason: not valid java name */
                public final /* synthetic */ boolean m161unboximpl() {
                    return this.value;
                }

                /* renamed from: constructor-impl, reason: not valid java name */
                public static boolean m157constructorimpl(boolean z) {
                    return z;
                }
            }

            /* compiled from: Token.kt */
            @vby
            public static final class Num implements Literal {
                private final Number value;

                private /* synthetic */ Num(Number number) {
                    this.value = number;
                }

                /* renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Num m162boximpl(Number number) {
                    return new Num(number);
                }

                /* renamed from: equals-impl, reason: not valid java name */
                public static boolean m164equalsimpl(Number number, Object obj) {
                    return (obj instanceof Num) && epx.f(number, ((Num) obj).m167unboximpl());
                }

                /* renamed from: hashCode-impl, reason: not valid java name */
                public static int m165hashCodeimpl(Number number) {
                    return number.hashCode();
                }

                /* renamed from: toString-impl, reason: not valid java name */
                public static String m166toStringimpl(Number number) {
                    return "Num(value=" + number + ')';
                }

                public boolean equals(Object obj) {
                    return m164equalsimpl(this.value, obj);
                }

                public int hashCode() {
                    return m165hashCodeimpl(this.value);
                }

                public String toString() {
                    return m166toStringimpl(this.value);
                }

                /* renamed from: unbox-impl, reason: not valid java name */
                public final /* synthetic */ Number m167unboximpl() {
                    return this.value;
                }

                /* renamed from: constructor-impl, reason: not valid java name */
                public static Number m163constructorimpl(Number number) {
                    return number;
                }
            }

            /* compiled from: Token.kt */
            @vby
            public static final class Str implements Literal {
                private final String value;

                private /* synthetic */ Str(String str) {
                    this.value = str;
                }

                /* renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Str m168boximpl(String str) {
                    return new Str(str);
                }

                /* renamed from: equals-impl, reason: not valid java name */
                public static boolean m170equalsimpl(String str, Object obj) {
                    return (obj instanceof Str) && epx.f(str, ((Str) obj).m173unboximpl());
                }

                /* renamed from: hashCode-impl, reason: not valid java name */
                public static int m171hashCodeimpl(String str) {
                    return str.hashCode();
                }

                /* renamed from: toString-impl, reason: not valid java name */
                public static String m172toStringimpl(String str) {
                    return air.b(')', "Str(value=", str);
                }

                public boolean equals(Object obj) {
                    return m170equalsimpl(this.value, obj);
                }

                public int hashCode() {
                    return m171hashCodeimpl(this.value);
                }

                public String toString() {
                    return m172toStringimpl(this.value);
                }

                /* renamed from: unbox-impl, reason: not valid java name */
                public final /* synthetic */ String m173unboximpl() {
                    return this.value;
                }

                /* renamed from: constructor-impl, reason: not valid java name */
                public static String m169constructorimpl(String str) {
                    return str;
                }
            }
        }

        /* compiled from: Token.kt */
        @vby
        public static final class Variable implements Operand {
            private final String name;

            private /* synthetic */ Variable(String str) {
                this.name = str;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Variable m174boximpl(String str) {
                return new Variable(str);
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m176equalsimpl(String str, Object obj) {
                return (obj instanceof Variable) && epx.f(str, ((Variable) obj).m180unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m177equalsimpl0(String str, String str2) {
                return epx.f(str, str2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m178hashCodeimpl(String str) {
                return str.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m179toStringimpl(String str) {
                return air.b(')', "Variable(name=", str);
            }

            public boolean equals(Object obj) {
                return m176equalsimpl(this.name, obj);
            }

            public int hashCode() {
                return m178hashCodeimpl(this.name);
            }

            public String toString() {
                return m179toStringimpl(this.name);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ String m180unboximpl() {
                return this.name;
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static String m175constructorimpl(String str) {
                return str;
            }
        }
    }
}
