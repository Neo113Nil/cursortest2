package org.jsoup.parser;

import org.jsoup.helper.ValidationException;
import xsna.ad0;
import xsna.i5s;

/* loaded from: classes8.dex */
public abstract class Token {
    public TokenType b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TokenType {
        private static final /* synthetic */ TokenType[] $VALUES;
        public static final TokenType Character;
        public static final TokenType Comment;
        public static final TokenType Doctype;
        public static final TokenType EOF;
        public static final TokenType EndTag;
        public static final TokenType StartTag;

        static {
            TokenType tokenType = new TokenType("Doctype", 0);
            Doctype = tokenType;
            TokenType tokenType2 = new TokenType("StartTag", 1);
            StartTag = tokenType2;
            TokenType tokenType3 = new TokenType("EndTag", 2);
            EndTag = tokenType3;
            TokenType tokenType4 = new TokenType("Comment", 3);
            Comment = tokenType4;
            TokenType tokenType5 = new TokenType("Character", 4);
            Character = tokenType5;
            TokenType tokenType6 = new TokenType("EOF", 5);
            EOF = tokenType6;
            $VALUES = new TokenType[]{tokenType, tokenType2, tokenType3, tokenType4, tokenType5, tokenType6};
        }

        public TokenType() {
            throw null;
        }

        public static TokenType valueOf(String str) {
            return (TokenType) Enum.valueOf(TokenType.class, str);
        }

        public static TokenType[] values() {
            return (TokenType[]) $VALUES.clone();
        }
    }

    public static final class a extends b {
        @Override // org.jsoup.parser.Token.b
        public final String toString() {
            return i5s.a(new StringBuilder("<![CDATA["), this.c, "]]>");
        }
    }

    public static class b extends Token implements Cloneable {
        public String c;

        public b() {
            this.b = TokenType.Character;
        }

        @Override // org.jsoup.parser.Token
        public final void l() {
            this.c = null;
        }

        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final b clone() {
            try {
                return (b) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        public String toString() {
            return this.c;
        }
    }

    public static final class c extends Token {
        public final StringBuilder c = new StringBuilder();
        public String d;

        public c() {
            this.b = TokenType.Comment;
        }

        @Override // org.jsoup.parser.Token
        public final void l() {
            Token.m(this.c);
            this.d = null;
        }

        public final void n(char c) {
            String str = this.d;
            StringBuilder sb = this.c;
            if (str != null) {
                sb.append(str);
                this.d = null;
            }
            sb.append(c);
        }

        public final void o(String str) {
            String str2 = this.d;
            StringBuilder sb = this.c;
            if (str2 != null) {
                sb.append(str2);
                this.d = null;
            }
            if (sb.length() == 0) {
                this.d = str;
            } else {
                sb.append(str);
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<!--");
            String str = this.d;
            if (str == null) {
                str = this.c.toString();
            }
            return i5s.a(sb, str, "-->");
        }
    }

    public static final class d extends Token {
        public final StringBuilder c = new StringBuilder();
        public String d = null;
        public final StringBuilder e = new StringBuilder();
        public final StringBuilder f = new StringBuilder();
        public boolean g = false;

        public d() {
            this.b = TokenType.Doctype;
        }

        @Override // org.jsoup.parser.Token
        public final void l() {
            Token.m(this.c);
            this.d = null;
            Token.m(this.e);
            Token.m(this.f);
            this.g = false;
        }

        public final String toString() {
            return "<!doctype " + this.c.toString() + ">";
        }
    }

    public static final class f extends h {
        public f() {
            this.b = TokenType.EndTag;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("</");
            String str = this.c;
            if (str == null) {
                str = "[unset]";
            }
            return i5s.a(sb, str, ">");
        }
    }

    public static final class g extends h {
        public g() {
            this.b = TokenType.StartTag;
        }

        public final String toString() {
            if (!r() || this.m.b <= 0) {
                StringBuilder sb = new StringBuilder("<");
                String str = this.c;
                return i5s.a(sb, str != null ? str : "[unset]", ">");
            }
            StringBuilder sb2 = new StringBuilder("<");
            String str2 = this.c;
            sb2.append(str2 != null ? str2 : "[unset]");
            sb2.append(" ");
            sb2.append(this.m.toString());
            sb2.append(">");
            return sb2.toString();
        }

        @Override // org.jsoup.parser.Token.h, org.jsoup.parser.Token
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public final h l() {
            super.l();
            this.m = null;
            return this;
        }
    }

    public static abstract class h extends Token {
        public String c;
        public String d;
        public String f;
        public String i;
        public org.jsoup.nodes.b m;
        public final StringBuilder e = new StringBuilder();
        public boolean g = false;
        public final StringBuilder h = new StringBuilder();
        public boolean j = false;
        public boolean k = false;
        public boolean l = false;

        public final void n(char c) {
            this.j = true;
            String str = this.i;
            StringBuilder sb = this.h;
            if (str != null) {
                sb.append(str);
                this.i = null;
            }
            sb.append(c);
        }

        public final void o(String str) {
            this.j = true;
            String str2 = this.i;
            StringBuilder sb = this.h;
            if (str2 != null) {
                sb.append(str2);
                this.i = null;
            }
            if (sb.length() == 0) {
                this.i = str;
            } else {
                sb.append(str);
            }
        }

        public final void p(int[] iArr) {
            this.j = true;
            String str = this.i;
            StringBuilder sb = this.h;
            if (str != null) {
                sb.append(str);
                this.i = null;
            }
            for (int i : iArr) {
                sb.appendCodePoint(i);
            }
        }

        public final void q(String str) {
            String replace = str.replace((char) 0, (char) 65533);
            String str2 = this.c;
            if (str2 != null) {
                replace = str2.concat(replace);
            }
            this.c = replace;
            this.d = ad0.C(replace.trim());
        }

        public final boolean r() {
            return this.m != null;
        }

        public final String s() {
            String str = this.c;
            if (str == null || str.length() == 0) {
                throw new ValidationException("Must be false");
            }
            return this.c;
        }

        public final void t(String str) {
            this.c = str;
            this.d = ad0.C(str.trim());
        }

        public final void u() {
            if (this.m == null) {
                this.m = new org.jsoup.nodes.b();
            }
            boolean z = this.g;
            StringBuilder sb = this.h;
            StringBuilder sb2 = this.e;
            if (z && this.m.b < 512) {
                String trim = (sb2.length() > 0 ? sb2.toString() : this.f).trim();
                if (trim.length() > 0) {
                    this.m.a(trim, this.j ? sb.length() > 0 ? sb.toString() : this.i : this.k ? "" : null);
                }
            }
            Token.m(sb2);
            this.f = null;
            this.g = false;
            Token.m(sb);
            this.i = null;
            this.j = false;
            this.k = false;
        }

        @Override // org.jsoup.parser.Token
        /* renamed from: v */
        public h l() {
            this.c = null;
            this.d = null;
            Token.m(this.e);
            this.f = null;
            this.g = false;
            Token.m(this.h);
            this.i = null;
            this.k = false;
            this.j = false;
            this.l = false;
            this.m = null;
            return this;
        }
    }

    public static void m(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    public final boolean a() {
        return this.b == TokenType.Comment;
    }

    public final boolean e() {
        return this.b == TokenType.Doctype;
    }

    public final boolean i() {
        return this.b == TokenType.EOF;
    }

    public final boolean j() {
        return this.b == TokenType.EndTag;
    }

    public final boolean k() {
        return this.b == TokenType.StartTag;
    }

    public abstract void l();

    public static final class e extends Token {
        public e() {
            this.b = TokenType.EOF;
        }

        public final String toString() {
            return "";
        }

        @Override // org.jsoup.parser.Token
        public final void l() {
        }
    }
}
