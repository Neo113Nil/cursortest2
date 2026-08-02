package xsna;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.squareup.wire.Message;
import com.vk.core.fragments.FragmentEntry;
import com.vk.voip.OKVoipEngine;
import io.reactivex.rxjava3.internal.operators.maybe.c;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.webrtc.sessionroom.admin.UpdateRoomsParams;
import xsna.yx50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class xx50 implements yx50.d, io.reactivex.rxjava3.core.n, io.reactivex.rxjava3.core.d, t8z0 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xx50(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.yx50.d
    public void a() {
        yx50 yx50Var = (yx50) this.b;
        FragmentEntry fragmentEntry = (FragmentEntry) this.c;
        yx50Var.getClass();
        yx50Var.w0(fragmentEntry.b, fragmentEntry.c);
    }

    @Override // xsna.t8z0
    public void accept(Object obj) {
        ijz0 ijz0Var = (ijz0) this.b;
        pjz0 pjz0Var = (pjz0) this.c;
        xrz0 xrz0Var = (xrz0) obj;
        if (ijz0Var.a.i == null) {
            gu8.c(null, "InstreamAudioAdEngine: Unable to start delayed ad: player has not set");
            return;
        }
        ijz0Var.j = xrz0Var;
        ijz0Var.f.l = pjz0Var.h;
        xrz0Var.f();
    }

    @Override // io.reactivex.rxjava3.core.n
    public void subscribe(io.reactivex.rxjava3.core.l lVar) {
        Message message;
        sug0 sug0Var = (sug0) this.b;
        String str = (String) this.c;
        zfz zfzVar = sug0Var.a;
        LinkedHashMap linkedHashMap = zfzVar.f;
        ReentrantReadWriteLock.ReadLock readLock = zfzVar.e.readLock();
        readLock.lock();
        try {
            Message message2 = (Message) linkedHashMap.get(str);
            if (message2 == null) {
                Cursor query = ((SQLiteDatabase) zfzVar.g.getValue()).query("entities", new String[]{"value"}, "key=?", new String[]{str}, null, null, "_id");
                try {
                    if (query.moveToFirst()) {
                        message = (Message) zfzVar.d.decode(query.getBlob(0));
                        linkedHashMap.put(str, message);
                    } else {
                        message = null;
                    }
                    query.close();
                    message2 = message;
                } finally {
                }
            }
            if (message2 == null) {
                ((c.a) lVar).d();
            } else {
                ((c.a) lVar).f(message2);
            }
        } finally {
            readLock.unlock();
        }
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        com.vk.voip.ui.sessionrooms.d dVar = (com.vk.voip.ui.sessionrooms.d) this.b;
        String str = (String) this.c;
        dVar.a.getClass();
        SessionRoomsManager D = OKVoipEngine.D();
        if (D != null) {
            D.updateRooms(new UpdateRoomsParams.Builder().addRoom(new UpdateRoomsParams.Room.Builder().setName(str)).build(), new io60(bVar, 26), new c230(bVar, 25));
        }
    }
}
