package xsna;

import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.sessionroom.admin.UpdateRoomsParams;

/* compiled from: ConfigureSessionRoomsFeature.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class z1j extends FunctionReferenceImpl implements izs<a.b, io.reactivex.rxjava3.core.a> {
    @Override // xsna.izs
    public final io.reactivex.rxjava3.core.a invoke(a.b bVar) {
        a.b bVar2 = bVar;
        ((a2j) this.receiver).getClass();
        Integer V = a2j.V(bVar2, null);
        if (V == null) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        final int intValue = V.intValue();
        com.vk.voip.ui.c.b.getClass();
        final com.vk.voip.ui.sessionrooms.d dVar = com.vk.voip.ui.c.B0;
        Collection<lvi0> collection = bVar2.c;
        final ArrayList arrayList = new ArrayList(c5g.u(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((lvi0) it.next()).a.a);
        }
        dVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.completable.e(new io.reactivex.rxjava3.core.d() { // from class: xsna.cwi0
            @Override // io.reactivex.rxjava3.core.d
            public final void subscribe(io.reactivex.rxjava3.core.b bVar3) {
                com.vk.voip.ui.sessionrooms.d.this.a.getClass();
                SessionRoomsManager D = OKVoipEngine.D();
                if (D != null) {
                    UpdateRoomsParams.Builder assignRandomly = new UpdateRoomsParams.Builder().setAssignRandomly(true);
                    ArrayList arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(new UpdateRoomsParams.Room.Builder().setId((SessionRoomId.Room) it2.next()).setParticipantCount(Integer.valueOf(intValue)));
                    }
                    D.updateRooms(assignRandomly.setRooms(arrayList3).build(), new tbe0(bVar3, 6), new n3b0(bVar3, 10));
                }
            }
        });
    }
}
