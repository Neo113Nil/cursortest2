package xsna;

import com.vk.sharing.core.view.TargetSendActionView;
import java.util.List;

/* compiled from: SendStoryUsersPatch.kt */
/* loaded from: classes16.dex */
public abstract class yii0 implements xl50 {

    /* compiled from: SendStoryUsersPatch.kt */
    public static final class a extends yii0 {
        public static final a b = new a();
    }

    /* compiled from: SendStoryUsersPatch.kt */
    public static final class b extends yii0 {
        public static final b b = new b();
    }

    /* compiled from: SendStoryUsersPatch.kt */
    public static final class c extends yii0 {
        public final List<s8m> b;

        public c(List<s8m> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("OnNewDialogs(list="), this.b);
        }
    }

    /* compiled from: SendStoryUsersPatch.kt */
    public static final class d extends yii0 {
        public final String b;

        public d(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnSearchQuery(query="), this.b, ')');
        }
    }

    /* compiled from: SendStoryUsersPatch.kt */
    public static final class e extends yii0 {
        public final long b;
        public final TargetSendActionView.State c;

        public e(long j, TargetSendActionView.State state) {
            this.b = j;
            this.c = state;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && this.c == eVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "UpdateDialogState(dialogId=" + this.b + ", state=" + this.c + ')';
        }
    }
}
