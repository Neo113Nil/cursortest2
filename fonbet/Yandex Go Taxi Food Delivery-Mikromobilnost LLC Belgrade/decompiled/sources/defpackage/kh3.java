package defpackage;

import com.twilio.audioswitch.a;

/* loaded from: classes11.dex */
public final class kh3 extends a {
    @Override // defpackage.amm0
    public final void a(hf3 hf3Var) {
        hf3Var.toString();
        ((n9f0) this.C).getClass();
        boolean remove = this.z.remove(hf3Var);
        if (jl40.l(this.x, hf3Var)) {
            this.x = null;
        }
        if (hf3Var instanceof gf3) {
            if3 if3Var = this.D;
            boolean hasSystemFeature = if3Var.i.getPackageManager().hasSystemFeature("android.hardware.telephony");
            if (hasSystemFeature) {
                if3Var.j.getClass();
            }
            if (hasSystemFeature) {
                remove = this.z.add(new ef3(0)) || remove;
            }
        }
        a.g(this, remove);
    }

    @Override // com.twilio.audioswitch.a
    public final void e(hf3 hf3Var) {
        hf3Var.toString();
        ((n9f0) this.C).getClass();
        boolean z = hf3Var instanceof df3;
        if3 if3Var = this.D;
        if (z) {
            if3Var.k.setSpeakerphoneOn(false);
            if3Var.a(true);
        } else if ((hf3Var instanceof ef3) || (hf3Var instanceof gf3)) {
            if3Var.k.setSpeakerphoneOn(false);
            if3Var.a(false);
        } else if (hf3Var instanceof ff3) {
            if3Var.a(false);
            if3Var.k.setSpeakerphoneOn(true);
        }
    }
}
