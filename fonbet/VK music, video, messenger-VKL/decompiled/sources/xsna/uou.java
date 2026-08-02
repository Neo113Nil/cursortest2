package xsna;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import xsna.epu;

/* compiled from: Groups.java */
/* loaded from: classes11.dex */
public final class uou {
    public static final List<GroupsFieldsDto> g;
    public static final List<GroupsFieldsDto> h;
    public final Object a = new Object();
    public final tvh0<Group> b = new tvh0<>();
    public volatile boolean c = false;
    public final ExecutorService d;
    public final ArrayList<Group> e;
    public final epu f;

    /* compiled from: Groups.java */
    /* loaded from: classes5.dex */
    public class a implements hx2<bqu> {
        public final /* synthetic */ long b;

        public a(long j) {
            this.b = j;
        }

        @Override // xsna.hx2
        public final void b(bqu bquVar) {
            SQLiteDatabase writableDatabase;
            bqu bquVar2 = bquVar;
            uou uouVar = uou.this;
            epu epuVar = uouVar.f;
            long j = bquVar2.b;
            StringBuilder sb = new StringBuilder("groups:");
            ArrayList arrayList = bquVar2.a;
            sb.append(arrayList.size());
            sb.append(" currentLastUpdateTime: ");
            long j2 = this.b;
            sb.append(j2);
            L.p("GroupsCache", xy6.a(j, " newLastUpdateTime: ", sb));
            if (j <= j2) {
                L.p("GroupsCache", "skip api groups, current data actual");
                epuVar.getClass();
                uouVar.f(epu.c());
                return;
            }
            L.p("GroupsCache", "got new groups from api");
            uouVar.f(arrayList);
            Preference.F(j, "community_repository", "last_update_time");
            epuVar.getClass();
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    writableDatabase = epu.a.n(e43.a).getWritableDatabase();
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                writableDatabase.beginTransaction();
                writableDatabase.delete("groups", null, null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    writableDatabase.insert("groups", null, epu.a((Group) it.next()));
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Exception e2) {
                e = e2;
                sQLiteDatabase = writableDatabase;
                L.f("vk", "Error writing groups cache DB!", e);
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
                egi.g();
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = writableDatabase;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
                throw th;
            }
        }

        @Override // xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            com.vk.metrics.eventtracking.b.a.a(vKApiExecutionException);
            uou uouVar = uou.this;
            uouVar.f.getClass();
            uouVar.f(epu.c());
        }
    }

    static {
        Object[] objArr = {GroupsFieldsDto.MEMBERS_COUNT, GroupsFieldsDto.IS_CLOSED, GroupsFieldsDto.START_DATE, GroupsFieldsDto.CAN_MESSAGE, GroupsFieldsDto.IS_MESSAGES_BLOCKED, GroupsFieldsDto.MEMBER_STATUS, GroupsFieldsDto.BAN_INFO, GroupsFieldsDto.IS_MARKET_CART_ENABLED, GroupsFieldsDto.ENABLED_FEATURES};
        ArrayList arrayList = new ArrayList(9);
        for (int i = 0; i < 9; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        g = Collections.unmodifiableList(arrayList);
        GroupsFieldsDto[] groupsFieldsDtoArr = {GroupsFieldsDto.START_DATE, GroupsFieldsDto.MEMBERS_COUNT, GroupsFieldsDto.VERIFIED, GroupsFieldsDto.SCREEN_NAME, GroupsFieldsDto.ACTIVITY, GroupsFieldsDto.TRENDING, GroupsFieldsDto.CAN_UPLOAD_STORY, GroupsFieldsDto.USING_VKPAY_MARKET_APP, GroupsFieldsDto.HAS_MARKET_APP, GroupsFieldsDto.DONUT, GroupsFieldsDto.LEAVE_MODE, GroupsFieldsDto.HAS_LIVE_COVER, GroupsFieldsDto.ENABLED_FEATURES, GroupsFieldsDto.CAN_UPLOAD_CLIP, GroupsFieldsDto.CAN_UPLOAD_VIDEO, GroupsFieldsDto.CAN_POST, GroupsFieldsDto.WALL, GroupsFieldsDto.TRUST_MARK};
        ArrayList arrayList2 = new ArrayList(18);
        for (int i2 = 0; i2 < 18; i2++) {
            GroupsFieldsDto groupsFieldsDto = groupsFieldsDtoArr[i2];
            Objects.requireNonNull(groupsFieldsDto);
            arrayList2.add(groupsFieldsDto);
        }
        h = Collections.unmodifiableList(arrayList2);
    }

    public uou() {
        asu0.a.getClass();
        this.d = asu0.q();
        this.e = new ArrayList<>();
        this.f = new epu();
    }

    public final boolean a() {
        long m = egi.m();
        return new jx2(mnh0.t(o25.a().c(), Long.valueOf(m)), new a(m)).b();
    }

    @Nullable
    public final Group b(UserId userId) {
        synchronized (this.a) {
            try {
                Iterator<Group> it = this.e.iterator();
                while (it.hasNext()) {
                    Group next = it.next();
                    if (next.c.equals(userId)) {
                        return next;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ArrayList<Group> c(int i) {
        ArrayList<Group> arrayList = new ArrayList<>();
        synchronized (this.a) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                try {
                    Group group = this.e.get(i2);
                    if (group.s >= i) {
                        arrayList.add(group);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    public final void d(Group group) {
        synchronized (this.a) {
            try {
                ArrayList<Group> arrayList = this.e;
                clu cluVar = new clu(group, 1);
                Iterator<Group> it = arrayList.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (((Boolean) cluVar.invoke(it.next())).booleanValue()) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    this.e.set(i, group);
                } else {
                    this.e.add(group);
                }
                this.b.b(this.e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(final boolean z) {
        L.p("GroupsCache", zhy0.a("RELOAD GROUPS ", z));
        if (this.c) {
            return;
        }
        this.c = true;
        this.d.submit(new Runnable() { // from class: xsna.sou
            @Override // java.lang.Runnable
            public final void run() {
                uou uouVar = uou.this;
                if (!z) {
                    uouVar.f.getClass();
                    ArrayList arrayList = new ArrayList(epu.c());
                    if (!arrayList.isEmpty()) {
                        uouVar.f(arrayList);
                        uouVar.c = false;
                        return;
                    }
                }
                uouVar.a();
                uouVar.c = false;
            }
        });
    }

    public final void f(ArrayList arrayList) {
        synchronized (this.a) {
            this.e.clear();
            this.e.addAll(arrayList);
            this.b.b(this.e);
        }
    }
}
