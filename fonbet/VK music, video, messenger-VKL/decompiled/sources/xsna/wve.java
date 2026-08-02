package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;

/* compiled from: ClipsPlaylistsTargetPickerViewState.kt */
/* loaded from: classes16.dex */
public final class wve {
    public final boolean a;
    public final a b;
    public final ArrayList c;
    public final boolean d;

    /* compiled from: ClipsPlaylistsTargetPickerViewState.kt */
    public static final class a {
        public final UserId a;
        public final String b;
        public final String c;

        public a(UserId userId, String str, String str2) {
            this.a = userId;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Author(id=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", avatar=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public wve(boolean z, a aVar, ArrayList arrayList, boolean z2) {
        this.a = z;
        this.b = aVar;
        this.c = arrayList;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wve)) {
            return false;
        }
        wve wveVar = (wve) obj;
        return this.a == wveVar.a && this.b.equals(wveVar.b) && this.c.equals(wveVar.c) && this.d == wveVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qr.a(this.c, (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsPlaylistsTargetPickerViewState(pickerVisible=");
        sb.append(this.a);
        sb.append(", selectedTarget=");
        sb.append(this.b);
        sb.append(", authors=");
        kr.d(this.c, sb, ", pickerExpanded=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
