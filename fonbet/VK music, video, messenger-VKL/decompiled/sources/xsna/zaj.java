package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import java.util.List;

/* compiled from: ContactsGetAllExtCmd.kt */
/* loaded from: classes2.dex */
public final class zaj extends xl6<y8j> {
    public final Source b;
    public final boolean c;
    public final Object d;
    public final boolean e;

    /* compiled from: ContactsGetAllExtCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public zaj(Source source, mcj mcjVar, int i) {
        mcjVar = (i & 4) != 0 ? null : mcjVar;
        boolean z = (i & 8) == 0;
        this.b = source;
        this.c = true;
        this.d = mcjVar;
        this.e = z;
    }

    @Override // xsna.m2w
    public final String a() {
        if (a.$EnumSwitchMapping$0[this.b.ordinal()] == 1) {
            return null;
        }
        return "im-contacts-sync";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        List list = (List) w2wVar.b1(this, new com.vk.im.engine.commands.contacts.a(this.b, this.c, this.d, this.e));
        ProfilesInfo profilesInfo = new ProfilesInfo();
        profilesInfo.Lb(list);
        return new y8j(list, profilesInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaj)) {
            return false;
        }
        zaj zajVar = (zaj) obj;
        return this.b == zajVar.b && this.c == zajVar.c && epx.f(this.d, zajVar.d) && this.e == zajVar.e;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
        Object obj = this.d;
        return Boolean.hashCode(this.e) + ((b + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactsGetAllExtCmd(source=");
        sb.append(this.b);
        sb.append(", awaitNetwork=");
        sb.append(this.c);
        sb.append(", changerTag=");
        sb.append(this.d);
        sb.append(", returnDeanonContactsAsUsers=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
