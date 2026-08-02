package xsna;

import android.os.SystemClock;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.ui.fragments.chat.ChatFragment;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class oqb implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ oqb(long j, PinnedMsg pinnedMsg, avm avmVar) {
        this.c = j;
        this.d = pinnedMsg;
        this.e = avmVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        long j = this.c;
        switch (i) {
            case 0:
                ((ChatFragment) obj3).Q.j().a(SystemClock.uptimeMillis() - j, (String) obj2, ((Boolean) obj).booleanValue());
                return s3q0.a;
            default:
                PinnedMsg pinnedMsg = (PinnedMsg) obj3;
                jcm jcmVar = ((avm) obj2).d;
                e0w e0wVar = (e0w) obj;
                e0wVar.execSQL("DELETE FROM dialog_pinned_msg_attaches WHERE dialog_id = " + j);
                if (pinnedMsg != null) {
                    SQLiteStatement b = jcmVar.b(e0wVar);
                    try {
                        Iterator it = pinnedMsg.x7().iterator();
                        while (it.hasNext()) {
                            jcmVar.a(b, j, (Attach) it.next());
                            b.executeInsert();
                        }
                        s3q0 s3q0Var = s3q0.a;
                        ro.e(b, null);
                    } finally {
                    }
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ oqb(ChatFragment chatFragment, long j, long j2, String str) {
        this.d = chatFragment;
        this.c = j2;
        this.e = str;
    }
}
