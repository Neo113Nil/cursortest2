package xsna;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.GoogleApiAvailability;
import com.vk.api.generated.likes.dto.LikesAddActionDto;
import com.vk.api.generated.likes.dto.LikesGetListExtendedFilterDto;
import com.vk.api.generated.likes.dto.LikesGetListExtendedFriendsOnlyDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: InlineList.kt */
@vby
/* loaded from: classes11.dex */
public final class k0x implements abk0, zuf {
    public static final k0x c = new k0x(1);
    public static final k0x d = new k0x(2);
    public static mcc0 e;
    public final /* synthetic */ int b;

    public /* synthetic */ k0x(int i) {
        this.b = i;
    }

    public static final boolean c(Context context) {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }

    public static xy2 d(k0x k0xVar, String str, int i, UserId userId, Integer num, String str2, String str3, String str4, LikesAddActionDto likesAddActionDto, int i2) {
        Integer num2 = (i2 & 8) != 0 ? null : num;
        String str5 = (i2 & 16) != 0 ? null : str2;
        String str6 = (i2 & 32) != 0 ? null : str3;
        String str7 = (i2 & 64) != 0 ? null : str4;
        LikesAddActionDto likesAddActionDto2 = (i2 & 128) == 0 ? likesAddActionDto : null;
        k0xVar.getClass();
        tfx tfxVar = new tfx("likes.add", new sn(24), new nr(17));
        tfx.o(tfxVar, "type", str, 0, 0, 12);
        tfx.l(tfxVar, "item_id", i, 0, 0, 8);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (num2 != null) {
            tfx.l(tfxVar, "reaction_id", num2.intValue(), 0, 0, 8);
        }
        if (str5 != null) {
            tfx.o(tfxVar, "access_key", str5, 0, 0, 12);
        }
        if (str6 != null) {
            tfx.o(tfxVar, "ref", str6, 0, 0, 12);
        }
        if (str7 != null) {
            tfx.o(tfxVar, "track_code", str7, 0, 0, 12);
        }
        if (likesAddActionDto2 != null) {
            tfx.o(tfxVar, "action", likesAddActionDto2.i(), 0, 0, 12);
        }
        return tfxVar;
    }

    public static xy2 e(k0x k0xVar, String str, int i, UserId userId, String str2, String str3, String str4, int i2) {
        String str5 = (i2 & 8) != 0 ? null : str2;
        String str6 = (i2 & 16) != 0 ? null : str3;
        String str7 = (i2 & 32) == 0 ? str4 : null;
        k0xVar.getClass();
        tfx tfxVar = new tfx("likes.delete", new pn(22), new mr(21));
        tfx.o(tfxVar, "type", str, 0, 0, 12);
        tfx.l(tfxVar, "item_id", i, 0, 0, 8);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (str5 != null) {
            tfx.o(tfxVar, "access_key", str5, 0, 0, 12);
        }
        if (str6 != null) {
            tfx.o(tfxVar, "ref", str6, 0, 0, 12);
        }
        if (str7 != null) {
            tfx.o(tfxVar, "track_code", str7, 0, 0, 12);
        }
        return tfxVar;
    }

    public static xy2 f(k0x k0xVar, String str, UserId userId, Integer num, LikesGetListExtendedFilterDto likesGetListExtendedFilterDto, LikesGetListExtendedFriendsOnlyDto likesGetListExtendedFriendsOnlyDto, Integer num2, Boolean bool, List list, int i) {
        LikesGetListExtendedFilterDto likesGetListExtendedFilterDto2 = (i & 16) != 0 ? null : likesGetListExtendedFilterDto;
        LikesGetListExtendedFriendsOnlyDto likesGetListExtendedFriendsOnlyDto2 = (i & 32) != 0 ? null : likesGetListExtendedFriendsOnlyDto;
        Integer num3 = (i & 64) != 0 ? null : 0;
        Boolean bool2 = (i & 256) == 0 ? bool : null;
        k0xVar.getClass();
        tfx tfxVar = new tfx("likes.getList", new defpackage.j0(22), new or(18));
        tfx.o(tfxVar, "type", str, 0, 0, 12);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        tfx.l(tfxVar, "item_id", num.intValue(), 0, 0, 12);
        if (likesGetListExtendedFilterDto2 != null) {
            tfx.o(tfxVar, "filter", likesGetListExtendedFilterDto2.i(), 0, 0, 12);
        }
        if (likesGetListExtendedFriendsOnlyDto2 != null) {
            tfx.l(tfxVar, "friends_only", likesGetListExtendedFriendsOnlyDto2.i(), 0, 0, 12);
        }
        tfxVar.j("extended", true);
        if (num3 != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num3.intValue(), 0, 0, 8);
        }
        tfxVar.f(num2.intValue(), 0, 1000, "count");
        if (bool2 != null) {
            tfxVar.j("skip_own", bool2.booleanValue());
        }
        if (list != null) {
            tfxVar.i("fields", list);
        }
        return tfxVar;
    }

    public static final Object g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    @Override // xsna.zuf
    public long C() {
        return SystemClock.elapsedRealtime();
    }

    public void a(Context context) {
        if (e == null) {
            e = new mcc0(context);
        }
    }

    @Override // xsna.abk0
    public boolean b(Object obj, Object obj2) {
        return epx.f(obj, obj2);
    }

    public String toString() {
        switch (this.b) {
            case 1:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }
}
