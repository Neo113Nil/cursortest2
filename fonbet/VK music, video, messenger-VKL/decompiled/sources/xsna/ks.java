package xsna;

import com.vk.im.engine.commands.account.Setting;
import xsna.ij20;

/* compiled from: AccountInfoSetCmd.kt */
/* loaded from: classes2.dex */
public final class ks extends le6<s3q0> {
    public final Setting.ImUserNameType b;
    public final boolean c = true;

    public ks(Setting.ImUserNameType imUserNameType) {
        this.b = imUserNameType;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        ij20.a aVar = new ij20.a();
        aVar.d = bz2.m();
        aVar.c = "account.setInfo";
        Setting.ImUserNameType imUserNameType = this.b;
        imUserNameType.getClass();
        aVar.b("name", "im_user_name_type");
        aVar.b("value", imUserNameType.a);
        aVar.i = this.c;
        bz2.h(new ij20(aVar));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks)) {
            return false;
        }
        ks ksVar = (ks) obj;
        return epx.f(this.b, ksVar.b) && this.c == ksVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountSettingSetCmd(setting=");
        sb.append(this.b);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
