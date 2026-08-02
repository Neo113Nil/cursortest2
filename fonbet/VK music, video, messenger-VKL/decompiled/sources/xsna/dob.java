package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgReaction;
import java.util.Iterator;
import xsna.knb;

/* compiled from: ChatClipsBottomBarDecorationViewState.kt */
/* loaded from: classes2.dex */
public final class dob implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: ChatClipsBottomBarDecorationViewState.kt */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClickData(cnvMsgId=");
            sb.append(this.a);
            sb.append(", stateVersion=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationViewState.kt */
    public static final class b implements fm50<knb.a> {
        public final yzt0<c> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("ClipRecom(clipRecomReply="), this.a, ')');
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationViewState.kt */
    public static final class c {
        public final DialogExt a;
        public final VideoFile b;
        public final boolean c;
        public final boolean d;

        public c(DialogExt dialogExt, VideoFile videoFile, boolean z, boolean z2) {
            this.a = dialogExt;
            this.b = videoFile;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            VideoFile videoFile = this.b;
            return Boolean.hashCode(this.d) + qoy.b((hashCode + (videoFile == null ? 0 : videoFile.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClipRecomReplyData(dialogExt=");
            sb.append(this.a);
            sb.append(", recVideoFile=");
            sb.append(this.b);
            sb.append(", canReply=");
            sb.append(this.c);
            sb.append(", isSent=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationViewState.kt */
    public static final class d implements fm50<knb.b> {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -205781842;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationViewState.kt */
    public static final class e {
        public final DialogExt a;
        public final Msg b;
        public final boolean c;

        public e(DialogExt dialogExt, Msg msg, boolean z) {
            this.a = dialogExt;
            this.b = msg;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && this.c == eVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + pn.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExpandedReactionsPickerData(dialogExt=");
            sb.append(this.a);
            sb.append(", msg=");
            sb.append(this.b);
            sb.append(", isVisible=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationViewState.kt */
    public static final class f {
        public final int a;
        public final String b;
        public final qtd0 c;
        public final DialogExt d;
        public final int e;

        public f(int i, String str, qtd0 qtd0Var, DialogExt dialogExt, int i2) {
            this.a = i;
            this.b = str;
            this.c = qtd0Var;
            this.d = dialogExt;
            this.e = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d) && this.e == fVar.e;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            qtd0 qtd0Var = this.c;
            return Integer.hashCode(this.e) + ((this.d.hashCode() + ((hashCode2 + (qtd0Var != null ? qtd0Var.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LinkedTextData(cnvMsgId=");
            sb.append(this.a);
            sb.append(", text=");
            sb.append(this.b);
            sb.append(", sender=");
            sb.append(this.c);
            sb.append(", dialogExt=");
            sb.append(this.d);
            sb.append(", stateVersion=");
            return vu5.b(sb, this.e, ')');
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationViewState.kt */
    public static final class g implements fm50<knb.c> {
        public final yzt0<h> a;
        public final yzt0<a> b;
        public final yzt0<j> c;
        public final yzt0<e> d;
        public final yzt0<f> e;
        public final yzt0<i> f;

        public g(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c) && epx.f(this.d, gVar.d) && epx.f(this.e, gVar.e) && epx.f(this.f, gVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Main(sendControllerData=");
            sb.append(this.a);
            sb.append(", click=");
            sb.append(this.b);
            sb.append(", writebarReactions=");
            sb.append(this.c);
            sb.append(", expandedReactionsPicker=");
            sb.append(this.d);
            sb.append(", linkedText=");
            sb.append(this.e);
            sb.append(", writeBarEditTextData=");
            return tr.c(sb, this.f, ')');
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationViewState.kt */
    public static final class h {
        public final DialogExt a;
        public final boolean b;
        public final int c;

        public h(DialogExt dialogExt, boolean z, int i) {
            this.a = dialogExt;
            this.b = z;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && this.b == hVar.b && this.c == hVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SendControllerData(dialogExt=");
            sb.append(this.a);
            sb.append(", canReply=");
            sb.append(this.b);
            sb.append(", stateVersion=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationViewState.kt */
    public static final class i {
        public final String a;
        public final MsgTextFormat b;

        public i(String str, MsgTextFormat msgTextFormat) {
            this.a = str;
            this.b = msgTextFormat;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.a, iVar.a) && epx.f(this.b, iVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            MsgTextFormat msgTextFormat = this.b;
            return hashCode + (msgTextFormat != null ? msgTextFormat.hashCode() : 0);
        }

        public final String toString() {
            return "WriteBarEditTextData(draftMsgText=" + this.a + ", msgTextFormat=" + this.b + ')';
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationViewState.kt */
    public static final class j {
        public final DialogExt a;
        public final Msg b;
        public final a c;
        public final int d;

        /* compiled from: ChatClipsBottomBarDecorationViewState.kt */
        public interface a {

            /* compiled from: ChatClipsBottomBarDecorationViewState.kt */
            /* renamed from: xsna.dob$j$a$a, reason: collision with other inner class name */
            public static final class C2746a implements a {
                public static final C2746a a = new C2746a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2746a);
                }

                public final int hashCode() {
                    return -1562513952;
                }

                public final String toString() {
                    return "Chips";
                }
            }

            /* compiled from: ChatClipsBottomBarDecorationViewState.kt */
            public static final class b implements a {
                public static final b a = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -1574089761;
                }

                public final String toString() {
                    return "None";
                }
            }

            /* compiled from: ChatClipsBottomBarDecorationViewState.kt */
            public static final class c implements a {
                public static final c a = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return -820373643;
                }

                public final String toString() {
                    return "Picker";
                }
            }
        }

        public j(DialogExt dialogExt, Msg msg, a aVar, int i) {
            this.a = dialogExt;
            this.b = msg;
            this.c = aVar;
            this.d = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean equals(Object obj) {
            if (j.class.equals(obj != null ? obj.getClass() : null)) {
                j jVar = (j) obj;
                if (this.d == jVar.d && this.a.e == jVar.a.e) {
                    Msg msg = this.b;
                    int i = msg.d;
                    Msg msg2 = jVar.b;
                    if (i == msg2.d) {
                        aux0 aux0Var = (aux0) msg;
                        int size = aux0Var.K().size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                if (!epx.f(this.c, jVar.c)) {
                                    break;
                                }
                                return true;
                            }
                            MsgReaction msgReaction = aux0Var.K().get(i2);
                            MsgReaction msgReaction2 = (MsgReaction) j5g.b0(i2, ((aux0) msg2).K());
                            if (msgReaction2 == null || msgReaction.getId() != msgReaction2.getId() || msgReaction.getCount() != msgReaction2.getCount() || !epx.f(j5g.S0(msgReaction.u2()), j5g.S0(msgReaction2.u2()))) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode = Long.hashCode(this.a.e) * 31;
            Msg msg = this.b;
            int a2 = shy.a(msg.d, hashCode, 31);
            aux0 aux0Var = (aux0) msg;
            Integer R5 = aux0Var.R5();
            int hashCode2 = R5 != null ? R5.hashCode() : 0;
            for (MsgReaction msgReaction : aux0Var.K()) {
                hashCode2 = Integer.hashCode(msgReaction.getCount()) + ((Integer.hashCode(msgReaction.getId()) + (hashCode2 * 31)) * 31);
                Iterator<T> it = msgReaction.u2().iterator();
                while (it.hasNext()) {
                    hashCode2 = (hashCode2 * 31) + Long.hashCode(((Number) it.next()).longValue());
                }
            }
            return this.c.hashCode() + ((a2 + hashCode2) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WritebarReactionsData(dialogExt=");
            sb.append(this.a);
            sb.append(", msg=");
            sb.append(this.b);
            sb.append(", type=");
            sb.append(this.c);
            sb.append(", stateVersion=");
            return vu5.b(sb, this.d, ')');
        }
    }

    public dob(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
