package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsDb;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class pjb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ mtx0 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pjb(mtx0 mtx0Var, long j, Object obj, int i) {
        this.b = i;
        this.d = mtx0Var;
        this.c = j;
        this.e = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.e;
        long j = this.c;
        mtx0 mtx0Var = this.d;
        switch (i) {
            case 0:
                ChannelsDb channelsDb = ((gkb) mtx0Var).b;
                StringBuilder sb = new StringBuilder("\n            UPDATE ");
                sb.append(channelsDb.a.a);
                sb.append("\n            SET ");
                sr.c(ChannelsDb.Column.AVATAR, sb, " = ?\n            WHERE ");
                channelsDb.b.b().execSQL(bo.d(ChannelsDb.Column.ID, sb, " = ?\n            "), new Object[]{(String) obj2, Long.valueOf(j)});
                break;
            default:
                e0w b = ((hpm) mtx0Var).b.b();
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                b.execSQL("UPDATE dialogs SET chat_settings_avatar = ? WHERE id = ?", new Serializable[]{Serializer.b.e((ImageList) obj2), Long.valueOf(j)});
                break;
        }
        return s3q0.a;
    }
}
