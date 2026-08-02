package com.yandex.messaging.ui.chatlist;

import android.graphics.drawable.Drawable;
import com.yandex.messaging.internal.MessageStatus;
import defpackage.gu21;
import defpackage.jl40;
import defpackage.w53;
import java.util.Date;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class c {
    public final w53 a = new w53();

    public static final class a {
        public String a;
        public Drawable b;
        public CharSequence c;
        public Date d;
        public MessageStatus e;
        public Boolean f;
        public gu21 g;
        public Boolean h;
        public List i;
        public Integer j;

        public a(int i) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d) && this.e == aVar.e && jl40.l(this.f, aVar.f) && jl40.l(this.g, aVar.g) && jl40.l(this.h, aVar.h) && jl40.l(this.i, aVar.i) && jl40.l(this.j, aVar.j);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Drawable drawable = this.b;
            int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
            CharSequence charSequence = this.c;
            int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            Date date = this.d;
            int hashCode4 = (hashCode3 + (date == null ? 0 : date.hashCode())) * 31;
            MessageStatus messageStatus = this.e;
            int hashCode5 = (hashCode4 + (messageStatus == null ? 0 : messageStatus.hashCode())) * 31;
            Boolean bool = this.f;
            int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            gu21 gu21Var = this.g;
            int hashCode7 = (hashCode6 + (gu21Var == null ? 0 : gu21Var.hashCode())) * 31;
            Boolean bool2 = this.h;
            int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            List list = this.i;
            int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.j;
            return hashCode9 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            String str = this.a;
            Drawable drawable = this.b;
            CharSequence charSequence = this.c;
            return "Element(name=" + str + ", avatar=" + drawable + ", lastMessage=" + ((Object) charSequence) + ", lastMessageDate=" + this.d + ", lastMessageStatus=" + this.e + ", onlineStatus=" + this.f + ", userStatus=" + this.g + ", hasMeeting=" + this.h + ", badges=" + this.i + ", lastMessageIconRes=" + this.j + Extension.C_BRAKE;
        }

        public a() {
            this(0);
        }
    }
}
