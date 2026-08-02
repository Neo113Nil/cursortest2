package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;

/* compiled from: ReactionPickerFactory.kt */
/* loaded from: classes2.dex */
public interface r1f0 {

    /* compiled from: ReactionPickerFactory.kt */
    public static final class a {
        public final FrameLayout a;
        public final boolean b;
        public final l6 c;
        public final String d;
        public final Msg e;
        public final no f;
        public final boolean g;

        public a(FrameLayout frameLayout, boolean z, l6 l6Var, String str, Msg msg, no noVar, boolean z2) {
            this.a = frameLayout;
            this.b = z;
            this.c = l6Var;
            this.d = str;
            this.e = msg;
            this.f = noVar;
            this.g = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c.equals(aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f.equals(aVar.f) && this.g == aVar.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + ((this.f.hashCode() + pn.a(this.e, urd0.a((this.c.hashCode() + qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, false), 31, false)) * 31, 31, this.d), 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowAlwaysCollapsedReactionsPickerArgs(container=");
            sb.append(this.a);
            sb.append(", isIncognito=");
            sb.append(this.b);
            sb.append(", isPaidReactionsAvailable=false, animated=false, onReactionSelectedListener=");
            sb.append(this.c);
            sb.append(", source=");
            sb.append(this.d);
            sb.append(", msg=");
            sb.append(this.e);
            sb.append(", onMoreClicked=");
            sb.append(this.f);
            sb.append(", useLegacyPicker=");
            return defpackage.q0.a(sb, this.g, ')');
        }
    }

    /* compiled from: ReactionPickerFactory.kt */
    public static final class b {
        public final FrameLayout a;
        public final boolean b;
        public final onb c;
        public final String d;
        public final Msg e;
        public final boolean f;

        public b(FrameLayout frameLayout, boolean z, onb onbVar, String str, Msg msg, boolean z2) {
            this.a = frameLayout;
            this.b = z;
            this.c = onbVar;
            this.d = str;
            this.e = msg;
            this.f = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c.equals(bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && this.f == bVar.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + pn.a(this.e, urd0.a((this.c.hashCode() + qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, false), 31, true)) * 31, 31, this.d), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowAlwaysExpandedReactionsPickerArgs(container=");
            sb.append(this.a);
            sb.append(", isIncognito=");
            sb.append(this.b);
            sb.append(", isPaidReactionsAvailable=false, animated=true, onReactionSelectedListener=");
            sb.append(this.c);
            sb.append(", source=");
            sb.append(this.d);
            sb.append(", msg=");
            sb.append(this.e);
            sb.append(", useLegacyPicker=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: ReactionPickerFactory.kt */
    public static final class c {
        public final FrameLayout a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final wzs<Integer, Integer, s3q0> e;
        public final String f;
        public final Msg g;
        public final gzs<s3q0> h;
        public final boolean i;

        /* JADX WARN: Multi-variable type inference failed */
        public c(FrameLayout frameLayout, boolean z, boolean z2, boolean z3, wzs<? super Integer, ? super Integer, s3q0> wzsVar, String str, Msg msg, gzs<s3q0> gzsVar, boolean z4) {
            this.a = frameLayout;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = wzsVar;
            this.f = str;
            this.g = msg;
            this.h = gzsVar;
            this.i = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g) && epx.f(this.h, cVar.h) && this.i == cVar.i;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + sf3.a(pn.a(this.g, urd0.a((this.e.hashCode() + qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowBigReactionsPickerArgs(container=");
            sb.append(this.a);
            sb.append(", isIncognito=");
            sb.append(this.b);
            sb.append(", isPaidReactionsAvailable=");
            sb.append(this.c);
            sb.append(", animated=");
            sb.append(this.d);
            sb.append(", onReactionSelectedListener=");
            sb.append(this.e);
            sb.append(", source=");
            sb.append(this.f);
            sb.append(", msg=");
            sb.append(this.g);
            sb.append(", onMoreClicked=");
            sb.append(this.h);
            sb.append(", useLegacyPicker=");
            return defpackage.q0.a(sb, this.i, ')');
        }
    }

    /* compiled from: ReactionPickerFactory.kt */
    public static final class d {
        public final FrameLayout a;
        public final boolean b;
        public final boolean c;
        public final w70 d;
        public final String e;
        public final View f;
        public final MsgFromUser g;
        public final boolean h;

        public d(FrameLayout frameLayout, boolean z, boolean z2, w70 w70Var, String str, View view, MsgFromUser msgFromUser, boolean z3) {
            this.a = frameLayout;
            this.b = z;
            this.c = z2;
            this.d = w70Var;
            this.e = str;
            this.f = view;
            this.g = msgFromUser;
            this.h = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c && this.d.equals(dVar.d) && epx.f(this.e, dVar.e) && this.f.equals(dVar.f) && epx.f(this.g, dVar.g) && this.h == dVar.h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + urd0.a((this.d.hashCode() + qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, false), 31, this.c)) * 31, 31, this.e)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowFloatReactionsPickerArgs(container=");
            sb.append(this.a);
            sb.append(", isIncognito=");
            sb.append(this.b);
            sb.append(", isPaidReactionsAvailable=false, animated=");
            sb.append(this.c);
            sb.append(", onReactionSelectedListener=");
            sb.append(this.d);
            sb.append(", source=");
            sb.append(this.e);
            sb.append(", anchorView=");
            sb.append(this.f);
            sb.append(", msg=");
            sb.append(this.g);
            sb.append(", useLegacyPicker=");
            return defpackage.q0.a(sb, this.h, ')');
        }
    }

    /* compiled from: ReactionPickerFactory.kt */
    public static final class e {
        public final FrameLayout a;
        public final boolean b;
        public final boolean c;
        public final mq0 d;
        public final String e;
        public final View f;
        public final MsgFromUser g;
        public final k9b h;
        public final boolean i;

        public e(FrameLayout frameLayout, boolean z, boolean z2, mq0 mq0Var, String str, View view, MsgFromUser msgFromUser, k9b k9bVar, boolean z3) {
            this.a = frameLayout;
            this.b = z;
            this.c = z2;
            this.d = mq0Var;
            this.e = str;
            this.f = view;
            this.g = msgFromUser;
            this.h = k9bVar;
            this.i = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && this.d.equals(eVar.d) && epx.f(this.e, eVar.e) && epx.f(this.f, eVar.f) && this.g.equals(eVar.g) && this.h.equals(eVar.h) && this.i == eVar.i;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + urd0.a((this.d.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, false), 31, this.c), 31, false)) * 31, 31, this.e)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowFloatReactionsPickerCloudArgs(container=");
            sb.append(this.a);
            sb.append(", isIncognito=");
            sb.append(this.b);
            sb.append(", isPaidReactionsAvailable=false, animated=");
            sb.append(this.c);
            sb.append(", isSingleReaction=false, onReactionSelectedListener=");
            sb.append(this.d);
            sb.append(", source=");
            sb.append(this.e);
            sb.append(", anchorView=");
            sb.append(this.f);
            sb.append(", msg=");
            sb.append(this.g);
            sb.append(", onMoreClicked=");
            sb.append(this.h);
            sb.append(", useLegacyPicker=");
            return defpackage.q0.a(sb, this.i, ')');
        }
    }

    q1f0 a(b bVar);

    q1f0 b(c cVar);

    q1f0 c(d dVar);

    q1f0 d(e eVar);

    String e(int i, Context context);

    q1f0 f(a aVar);
}
