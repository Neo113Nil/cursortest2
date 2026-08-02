package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.users.User;
import xsna.cr5;
import xsna.fzo0;
import xsna.n0n0;

/* compiled from: Ext.kt */
/* loaded from: classes18.dex */
public final class yaq {
    public static final wt90 a(Dialog dialog, ProfilesInfo profilesInfo, boolean z, boolean z2, boolean z3, boolean z4) {
        n0n0 n0n0Var;
        n0n0 dVar;
        n0n0 n0n0Var2;
        n0n0 eVar;
        n0n0 n0n0Var3;
        n0n0 eVar2;
        if (dialog.uc()) {
            return new wt90(dialog.Zb().b, dialog, new cr5.a(dialog), new fzo0.a(dialog), z4 ? n0n0.a.a : new n0n0.b(dialog), z2, z, z3, z4);
        }
        if (dialog.E8()) {
            Contact contact = (Contact) profilesInfo.c.c.get(Long.valueOf(dialog.Zb().d));
            long j = dialog.Zb().b;
            cr5 dVar2 = contact != null ? new cr5.d(dialog, contact) : cr5.b.a;
            fzo0 dVar3 = contact != null ? new fzo0.d(dialog, contact) : fzo0.b.a;
            if (z4) {
                n0n0Var3 = n0n0.a.a;
            } else {
                if (contact != null) {
                    eVar2 = new n0n0.e(dialog, contact);
                    return new wt90(j, dialog, dVar2, dVar3, eVar2, z2, z, z3, z4);
                }
                n0n0Var3 = n0n0.c.a;
            }
            eVar2 = n0n0Var3;
            return new wt90(j, dialog, dVar2, dVar3, eVar2, z2, z, z3, z4);
        }
        if (dialog.t1()) {
            User user = (User) profilesInfo.b.c.get(Long.valueOf(dialog.Zb().d));
            long j2 = dialog.Zb().b;
            cr5 dVar4 = user != null ? new cr5.d(dialog, user) : cr5.b.a;
            fzo0 dVar5 = user != null ? new fzo0.d(dialog, user) : fzo0.b.a;
            if (z4) {
                n0n0Var2 = n0n0.a.a;
            } else {
                if (user != null) {
                    eVar = new n0n0.e(dialog, user);
                    return new wt90(j2, dialog, dVar4, dVar5, eVar, z2, z, z3, z4);
                }
                n0n0Var2 = n0n0.c.a;
            }
            eVar = n0n0Var2;
            return new wt90(j2, dialog, dVar4, dVar5, eVar, z2, z, z3, z4);
        }
        if (!dialog.Va()) {
            return null;
        }
        Group group = (Group) profilesInfo.e.c.get(Long.valueOf(dialog.Zb().d));
        long j3 = dialog.Zb().b;
        cr5 cVar = group != null ? new cr5.c(dialog, group) : cr5.b.a;
        fzo0 cVar2 = group != null ? new fzo0.c(dialog, group) : fzo0.b.a;
        if (z4) {
            n0n0Var = n0n0.a.a;
        } else {
            if (group != null) {
                dVar = new n0n0.d(dialog, group);
                return new wt90(j3, dialog, cVar, cVar2, dVar, z2, z, z3, z4);
            }
            n0n0Var = n0n0.c.a;
        }
        dVar = n0n0Var;
        return new wt90(j3, dialog, cVar, cVar2, dVar, z2, z, z3, z4);
    }
}
