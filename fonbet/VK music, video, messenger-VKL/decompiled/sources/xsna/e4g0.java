package xsna;

import com.vk.dto.messages.MsgTextFormat;

/* compiled from: ReplyFragmentChannel.kt */
/* loaded from: classes2.dex */
public final class e4g0 {
    public static final io.reactivex.rxjava3.subjects.f<s3q0> a = new io.reactivex.rxjava3.subjects.f<>();
    public static a b;

    /* compiled from: ReplyFragmentChannel.kt */
    public static final class a {
        public final String a;
        public final MsgTextFormat b;

        public a(String str, MsgTextFormat msgTextFormat) {
            this.a = str;
            this.b = msgTextFormat;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ReplyDraft(msgText=" + this.a + ", msgTextFormat=" + this.b + ')';
        }
    }
}
