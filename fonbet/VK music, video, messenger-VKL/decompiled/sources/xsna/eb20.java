package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import xsna.jdm;

/* compiled from: MessageRequestsMetaCmd.kt */
/* loaded from: classes2.dex */
public final class eb20 extends jdm<a> {

    /* compiled from: MessageRequestsMetaCmd.kt */
    public static final class a {
        public final xpp<Integer> a;
        public final int b;
        public final Dialog c;
        public final Msg d;
        public final ProfilesInfo e;

        public a(xpp<Integer> xppVar, int i, Dialog dialog, Msg msg, ProfilesInfo profilesInfo) {
            this.a = xppVar;
            this.b = i;
            this.c = dialog;
            this.d = msg;
            this.e = profilesInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int a = shy.a(this.b, this.a.hashCode() * 31, 31);
            Dialog dialog = this.c;
            int hashCode = (a + (dialog == null ? 0 : dialog.hashCode())) * 31;
            Msg msg = this.d;
            int hashCode2 = (hashCode + (msg == null ? 0 : msg.hashCode())) * 31;
            ProfilesInfo profilesInfo = this.e;
            return hashCode2 + (profilesInfo != null ? profilesInfo.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MessageRequestMeta(count=");
            sb.append(this.a);
            sb.append(", unread=");
            sb.append(this.b);
            sb.append(", lastDialog=");
            sb.append(this.c);
            sb.append(", lastMsg=");
            sb.append(this.d);
            sb.append(", profilesInfo=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.e, ')');
        }
    }

    public eb20() {
        super(DialogsFilter.REQUESTS);
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        Integer num;
        DialogsCounters.a aVar = ((DialogsCounters) w2wVar.J0(this, new gnm(Source.CACHE, false)).await()).e;
        qcy<Object> qcyVar = DialogsCounters.i[4];
        xpp a2 = aVar.a();
        com.vk.im.engine.internal.storage.delegates.dialogs.b a3 = w2wVar.I0().b().a();
        a3.getClass();
        Cursor d = a3.b.b().d("SELECT SUM(CASE \n                        WHEN id > 2000000000 THEN 1\n                        WHEN read_till_in_msg_cnv_id >= read_till_in_msg_cnv_id_local THEN count_unread\n                         ELSE count_unread_local\n                    END) as unread\n            FROM dialogs \n            WHERE msg_request_status_desired = " + MsgRequestStatus.PENDING.j() + " AND type = 0 \n            AND (\n                CASE \n                    WHEN id > 2000000000 THEN true\n                    WHEN read_till_in_msg_cnv_id >= read_till_in_msg_cnv_id_local THEN count_unread > 0\n                    ELSE count_unread_local > 0\n                END\n                OR\n                CASE WHEN marked_as_unread_local IS NULL\n                     THEN marked_as_unread_server = 1\n                     ELSE marked_as_unread_local = 1\n                END\n            )\n             AND is_archived = 0", null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(Integer.valueOf(d.getInt(0)));
                        d.moveToNext();
                    }
                }
                Trace.endSection();
                int intValue = ((Number) j5g.Y(arrayList)).intValue();
                if (a2.d() || ((num = (Integer) a2.a()) != null && num.intValue() == 0)) {
                    return new a(a2, intValue, null, null, null);
                }
                jdm.a f = f(w2wVar, true);
                if (f == null && (f = f(w2wVar, false)) == null) {
                    f = jdm.a.d;
                }
                return new a(a2, intValue, f.a, f.b, f.c);
            } finally {
                d.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // xsna.e1w
    public final String toString() {
        return "MessageRequestsMetaCmd";
    }
}
