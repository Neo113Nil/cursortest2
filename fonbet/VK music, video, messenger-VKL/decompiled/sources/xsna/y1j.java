package xsna;

import android.database.SQLException;
import com.vk.log.L;
import xsna.o2j;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class y1j implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y1j(androidx.room.coroutines.c cVar, boolean z) {
        this.b = 1;
        this.d = cVar;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                a2j a2jVar = (a2j) this.d;
                qvi0 qvi0Var = a2jVar.g;
                if (this.c) {
                    qvi0Var.a.l0();
                } else {
                    qvi0Var.a.w();
                }
                L.e("Rooms were created");
                a2jVar.T(o2j.t.b);
                return s3q0.a;
            case 1:
                androidx.room.coroutines.c cVar = (androidx.room.coroutines.c) this.d;
                String str = this.c ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                cVar.c.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                cVar.b.d(sb);
                try {
                    p7i.g(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    return s3q0.a;
                }
            default:
                izs izsVar = (izs) this.d;
                if (this.c) {
                    izsVar.invoke(sx40.e.b);
                } else {
                    izsVar.invoke(sx40.s.b);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ y1j(boolean z, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }
}
