package xsna;

import android.content.Context;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import java.util.ArrayList;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.webrtc.sessionroom.admin.UpdateRoomsParams;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class fwi0 implements io.reactivex.rxjava3.core.d {
    public final /* synthetic */ com.vk.voip.ui.sessionrooms.d b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Integer e;

    public /* synthetic */ fwi0(com.vk.voip.ui.sessionrooms.d dVar, Integer num, int i, Integer num2) {
        this.b = dVar;
        this.c = num;
        this.d = i;
        this.e = num2;
    }

    @Override // io.reactivex.rxjava3.core.d
    public final void subscribe(io.reactivex.rxjava3.core.b bVar) {
        this.b.a.getClass();
        SessionRoomsManager D = OKVoipEngine.D();
        if (D != null) {
            UpdateRoomsParams.Builder builder = new UpdateRoomsParams.Builder();
            Integer num = this.c;
            int i = 0;
            UpdateRoomsParams.Builder assignRandomly = builder.setAssignRandomly(num != null);
            int i2 = this.d;
            ArrayList arrayList = new ArrayList(i2);
            while (i < i2) {
                UpdateRoomsParams.Room.Builder builder2 = new UpdateRoomsParams.Room.Builder();
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                i++;
                arrayList.add(builder2.setName(context.getString(R.string.voip_session_room_admin_room_name_pattern, Integer.valueOf(i))).setParticipantCount(num).setCountdownSec(this.e));
            }
            D.updateRooms(assignRandomly.setRooms(arrayList).build(), new gkc0(bVar, 8), new w620(bVar, 24));
        }
    }
}
