package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.room.RoomDatabase;
import androidx.room.j;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.yandex.div.state.db.StateEntry;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.db.AppDatabaseRoom;
import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import com.yandex.messaging.core.net.entities.proto.message.LocalizationDescriptor;
import com.yandex.messaging.core.net.entities.proto.message.LocalizedData;
import com.yandex.messaging.internal.entities.ForwardMessageRef;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.pending.OutgoingAttachment$ExistingAttachment;
import com.yandex.messaging.profile.f;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final /* synthetic */ class dff0 implements yvf0 {
    public final /* synthetic */ File a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Moshi c;
    public final /* synthetic */ x22 d;
    public final /* synthetic */ cvg e;
    public final /* synthetic */ Looper f;
    public final /* synthetic */ h3y g;

    public /* synthetic */ dff0(File file, Context context, Moshi moshi, x22 x22Var, cvg cvgVar, Looper looper, h3y h3yVar) {
        this.a = file;
        this.b = context;
        this.c = moshi;
        this.d = x22Var;
        this.e = cvgVar;
        this.f = looper;
        this.g = h3yVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        File file = new File(this.a, "DatabaseV2");
        f fVar = new f(this.g);
        Map e = gw00.e(new Pair(StateEntry.COLUMN_PATH, file.getPath()));
        x22 x22Var = this.d;
        x22Var.reportEvent("tech_db_build", e);
        j l = dai0.l(this.b, AppDatabaseRoom.class, file.getPath());
        l.i = true;
        l.a((zg20[]) Arrays.copyOf(sk91.a, 0));
        l.j = RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        l.p = true;
        l.q = true;
        l.r = true;
        int[] I0 = a.I0(a.J0(new d6w(1, 103, 1)));
        for (int i : Arrays.copyOf(I0, I0.length)) {
            l.m.add(Integer.valueOf(i));
        }
        l.r = true;
        l.d.add(new ct2(fVar, x22Var));
        Moshi moshi = this.c;
        Iterator it = scc.g(new r8b(moshi, ChatRequest.class), new okf(moshi, CustomPayload.class), new us10(moshi, MessageData.class), new kas(moshi, ForwardMessageRef[].class), new dmo(moshi, OutgoingAttachment$ExistingAttachment[].class), new xsu0(moshi, String[].class), new euu0(moshi, Types.newParameterizedType(Set.class, String.class)), new j6w(moshi, Types.newParameterizedType(Set.class, Integer.class)), new fuu0(moshi, Types.newParameterizedType(Map.class, String.class, String.class)), new w5z(moshi, LocalizationDescriptor.class), new x5z(moshi, Types.newParameterizedType(Map.class, String.class, LocalizedData.class))).iterator();
        while (it.hasNext()) {
            l.e.add(it.next());
        }
        AppDatabaseRoom appDatabaseRoom = (AppDatabaseRoom) l.b();
        appDatabaseRoom.l = this.e;
        appDatabaseRoom.m = this.f;
        return appDatabaseRoom;
    }
}
