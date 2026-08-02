package xsna;

import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.method.selector.impl.MethodSelectorView;
import com.vk.method.selector.impl.c;
import com.vk.registration.funnels.b;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipsHostUiVisibilityDelegate.kt */
/* loaded from: classes17.dex */
public final class dge implements dkv, rj20 {
    public final Object b;
    public final Object c;

    public /* synthetic */ dge(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.rj20
    public void D() {
        com.vk.method.selector.impl.c cVar = ((MethodSelectorView) this.b).f.p;
        cVar.getClass();
        cVar.c(new ik20(0, b.a.a, b.a.class, "onChooseRestore", "onChooseRestore()V", 0));
        ((rj20) this.c).D();
    }

    @Override // xsna.rj20
    public void E(VerificationMethodTypes verificationMethodTypes) {
        com.vk.method.selector.impl.c cVar = ((MethodSelectorView) this.b).f.p;
        cVar.c = verificationMethodTypes;
        switch (c.a.$EnumSwitchMapping$0[verificationMethodTypes.ordinal()]) {
            case 1:
                cVar.c(new mk20(0, b.a.a, b.a.class, "onChooseCallReset", "onChooseCallReset()V", 0));
                break;
            case 2:
                cVar.c(new nk20(0, b.a.a, b.a.class, "onChooseAppGenerator", "onChooseAppGenerator()V", 0));
                break;
            case 3:
                cVar.c(new ok20(0, b.a.a, b.a.class, "onChooseEmail", "onChooseEmail()V", 0));
                break;
            case 4:
                cVar.c(new pk20(0, b.a.a, b.a.class, "onChoosePasskey", "onChoosePasskey()V", 0));
                break;
            case 5:
                cVar.c(new jsl(com.vk.registration.funnels.b.a, 1));
                break;
            case 6:
                cVar.c(new qk20(0, b.a.a, b.a.class, "onChooseEcosystemPush", "onChooseEcosystemPush()V", 0));
                break;
            case 7:
                cVar.c(new rk20(0, b.a.a, b.a.class, "onChooseReserveCode", "onChooseReserveCode()V", 0));
                break;
            case 8:
                cVar.c(new sk20(0, b.a.a, b.a.class, "onChooseSms", "onChooseSms()V", 0));
                break;
            case 9:
                cVar.c(new tk20(0, b.a.a, b.a.class, "onChooseMaxOtpCode", "onChooseMaxOtpCode()V", 0));
                break;
            case 10:
                cVar.c(new kk20(0, b.a.a, b.a.class, "onChooseMaxMessenger", "onChooseMaxMessenger()V", 0));
                break;
            case 11:
                cVar.c(new lk20(0, b.a.a, b.a.class, "onChooseOfficialMessenger", "onChooseOfficialMessenger()V", 0));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ((rj20) this.c).E(verificationMethodTypes);
    }

    @Override // xsna.rj20
    public void a() {
        ((MethodSelectorView) this.b).f.getClass();
        ((rj20) this.c).a();
    }

    public sd90 b(int i, com.vk.lists.c cVar) {
        return i != 2 ? i != 6 ? new scl(cVar) : new mdp0(cVar, new und(cVar, (fae) this.b)) : new mcs0(cVar, (ics0) this.c);
    }

    public sd90 c(int i, com.vk.lists.c cVar, boolean z, boolean z2) {
        return i != 0 ? i != 2 ? i != 6 ? new akl(2, cVar, z, z2) : new mdp0(cVar, new s4f(cVar, (fae) this.b)) : new akl(12, cVar, false, false) : new ocl(cVar, z, z2);
    }

    @Override // xsna.dkv
    public byte[] getContent() {
        return (byte[]) this.c;
    }

    @Override // xsna.dkv
    public int getContentLength() {
        return ((byte[]) this.c).length;
    }

    @Override // xsna.dkv
    public String getContentType() {
        dkv dkvVar = ((ckv) this.b).d;
        if (dkvVar != null) {
            return dkvVar.getContentType();
        }
        return null;
    }

    public dge(gzs gzsVar) {
        this.b = gzsVar;
        this.c = new ArrayList();
    }
}
