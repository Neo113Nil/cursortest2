package xsna;

import android.util.Pair;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.storage.delegates.dialogs.DialogWeightDb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: DialogMigrateToNewIdLpTask.kt */
/* loaded from: classes2.dex */
public final class xhm extends e500 {
    public final w2w c;
    public final Peer d;
    public final Peer e;
    public final long f;
    public final long g;

    public xhm(w2w w2wVar, Peer peer, Peer peer2) {
        super("DialogMigrateToNewIdLpTask(od=" + f9t.K(peer.b) + ",nd=" + f9t.K(peer2.b) + ')');
        this.c = w2wVar;
        this.d = peer;
        this.e = peer2;
        this.f = peer.d;
        this.g = peer2.d;
        if (!peer.Ab(Peer.Type.CONTACT)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!peer2.Ab(Peer.Type.USER)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        LinkedHashMap linkedHashMap = c400Var.a;
        long j = this.g;
        if (!linkedHashMap.containsKey(Long.valueOf(j))) {
            f400Var.e(j);
        }
        LinkedHashMap linkedHashMap2 = c400Var.d;
        Peer peer = this.e;
        if (linkedHashMap2.containsKey(Long.valueOf(peer.b))) {
            return;
        }
        f400Var.c.add(Long.valueOf(peer.b));
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.e(this.f);
        z300Var.k(this.g);
        long j = this.d.b;
        long j2 = this.e.b;
        if (z300Var.C == null) {
            z300Var.C = new ArrayList();
        }
        z300Var.C.add(new Pair(Long.valueOf(j), Long.valueOf(j2)));
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        LinkedHashMap linkedHashMap = c400Var.d;
        Peer peer = this.e;
        com.vk.im.engine.models.dialogs.a aVar = (com.vk.im.engine.models.dialogs.a) pn00.h(Long.valueOf(peer.b), linkedHashMap);
        w2w w2wVar = this.c;
        xgl0 I0 = w2wVar.I0();
        final dnm d = I0.b().d();
        final long j = this.d.b;
        final long j2 = peer.b;
        d.getClass();
        String a = defpackage.k0.a(j2, "DELETE FROM dialog_pinned_msg_attaches WHERE dialog_id = ");
        StringBuilder b = fp.b(j2, "UPDATE dialogs SET id = ", " WHERE id = ");
        b.append(j);
        String sb = b.toString();
        StringBuilder b2 = fp.b(j2, "UPDATE dialog_pinned_msg_attaches SET dialog_id = ", " WHERE dialog_id = ");
        b2.append(j);
        String sb2 = b2.toString();
        String a2 = defpackage.k0.a(j2, "DELETE FROM dialog_members WHERE dialog_id = ");
        String a3 = defpackage.k0.a(j2, "DELETE FROM dialog_members_meta WHERE dialog_id = ");
        StringBuilder b3 = fp.b(j2, "UPDATE dialog_members SET dialog_id = ", " WHERE dialog_id = ");
        b3.append(j);
        String sb3 = b3.toString();
        StringBuilder b4 = fp.b(j2, "UPDATE dialog_members_meta SET dialog_id = ", " WHERE dialog_id = ");
        b4.append(j);
        String sb4 = b4.toString();
        String a4 = defpackage.k0.a(j2, "DELETE FROM peers_search WHERE docid = ");
        StringBuilder b5 = fp.b(j2, "UPDATE peers_search SET docid = ", " WHERE docid = ");
        b5.append(j);
        String sb5 = b5.toString();
        StringBuilder b6 = fp.b(j2, "UPDATE messages SET dialog_id = ", " WHERE dialog_id = ");
        b6.append(j);
        String sb6 = b6.toString();
        StringBuilder b7 = fp.b(j2, "UPDATE dialog_to_folder SET dialog_id = ", " WHERE dialog_id = ");
        b7.append(j);
        final List l = e43.l("DELETE FROM dialogs WHERE id = " + j2, a, sb, sb2, a2, a3, sb3, sb4, a4, sb5, sb6, b7.toString());
        d.a.b().h(new izs() { // from class: xsna.cnm
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                e0w e0wVar = (e0w) obj;
                Iterator it = l.iterator();
                while (it.hasNext()) {
                    e0wVar.execSQL((String) it.next());
                }
                DialogWeightDb dialogWeightDb = d.b;
                Serializer.c<Peer> cVar = Peer.CREATOR;
                Peer b8 = Peer.a.b(j);
                Peer b9 = Peer.a.b(j2);
                dialogWeightDb.b.b().execSQL("UPDATE OR REPLACE " + dialogWeightDb.a.a + " SET " + DialogWeightDb.Column.DIALOG_ID.getKey() + " = " + b9.b + " WHERE x_dialog_id = " + b8.b);
                return s3q0.a;
            }
        });
        hdj w = I0.w();
        long j3 = this.f;
        long j4 = this.g;
        w.n(j3, j4);
        I0.d().i(j4, Long.valueOf(j3));
        new wfm(aVar, null).o(w2wVar);
    }
}
