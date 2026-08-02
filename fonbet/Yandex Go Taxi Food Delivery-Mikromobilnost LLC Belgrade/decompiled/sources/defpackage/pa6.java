package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.input.pointer.g;
import androidx.room.util.a;
import com.squareup.moshi.JsonAdapter;
import com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item.b;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.entities.GalleryMessageData;
import java.io.IOException;

/* loaded from: classes10.dex */
public final /* synthetic */ class pa6 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ pa6(long j, long j2, Integer num, String str) {
        this.a = 1;
        this.w = str;
        this.x = num;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        GalleryMessageData galleryMessageData;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.x;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                qam.t(c1yVar, (ml6) obj3, this.b, this.c, 0.0f, (ram) obj2, 0, 104);
                return zy11Var;
            case 1:
                String str = (String) obj3;
                Integer num = (Integer) obj2;
                long j = this.b;
                long j2 = this.c;
                oll0 oll0Var = (oll0) obj;
                ull0 T0 = oll0Var.T0("UPDATE messages_view SET data = ?, data_type = ? WHERE chat_internal_id = ? AND message_history_id = ?");
                try {
                    if (str == null) {
                        T0.p(1);
                    } else {
                        T0.g1(1, str);
                    }
                    if (num == null) {
                        T0.p(2);
                    } else {
                        T0.b(2, num.intValue());
                    }
                    T0.b(3, j);
                    T0.b(4, j2);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } catch (Throwable th) {
                    T0.close();
                    throw th;
                }
            case 2:
                wu60 wu60Var = (wu60) obj;
                ((SnapshotStateList) obj2).add(new yyz0(wu60Var.a, b.i(wu60Var.a, ((g) ((hwd0) obj3)).C, this.b, this.c), System.currentTimeMillis()));
                return zy11Var;
            default:
                ndz0 ndz0Var = (ndz0) obj3;
                PlainMessage.Item[] itemArr = (PlainMessage.Item[]) obj2;
                yab yabVar = (yab) obj;
                by10 by10Var = ndz0Var.d;
                long j3 = this.b;
                long j4 = this.c;
                String b = by10Var.b(j3, j4);
                z83.d(b, null);
                if (b == null) {
                    return Boolean.FALSE;
                }
                JsonAdapter adapter = ndz0Var.h.adapter(GalleryMessageData.class);
                try {
                    galleryMessageData = (GalleryMessageData) adapter.fromJson(b);
                } catch (IOException unused) {
                    ydz.b("TimelineUpdater", "gallery message data parsing failed");
                }
                if (galleryMessageData == null) {
                    return Boolean.FALSE;
                }
                galleryMessageData.items = itemArr;
                String json2 = adapter.toJson(galleryMessageData);
                ((Number) a.b(ndz0Var.d.a, false, true, new zx10(json2, j3, j4, 1))).intValue();
                ndz0Var.k.h(j3, alb1.j(ndz0Var.c, j3, yabVar.G(), json2));
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ pa6(Object obj, long j, long j2, Object obj2, int i) {
        this.a = i;
        this.w = obj;
        this.b = j;
        this.c = j2;
        this.x = obj2;
    }
}
