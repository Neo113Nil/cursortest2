package xsna;

import com.vk.auth.passport.VkPassportContract$VkSecurityInfo;
import com.vk.auth.passport.d;

/* compiled from: VkPassportContract.kt */
/* loaded from: classes15.dex */
public final class wav0 {
    public final d.a a;
    public final com.vk.auth.passport.e b;
    public final com.vk.auth.passport.c c;
    public final VkPassportContract$VkSecurityInfo d;

    public wav0(d.a aVar, com.vk.auth.passport.e eVar, com.vk.auth.passport.c cVar, VkPassportContract$VkSecurityInfo vkPassportContract$VkSecurityInfo) {
        this.a = aVar;
        this.b = eVar;
        this.c = cVar;
        this.d = vkPassportContract$VkSecurityInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wav0)) {
            return false;
        }
        wav0 wav0Var = (wav0) obj;
        wav0Var.getClass();
        return this.a.equals(wav0Var.a) && this.b.equals(wav0Var.b) && epx.f(this.c, wav0Var.c) && this.d == wav0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PassportData(superappToken=null, vkConnect=" + this.a + ", vkpay=" + this.b + ", vkCombo=" + this.c + ", vkSecurityInfo=" + this.d + ')';
    }
}
