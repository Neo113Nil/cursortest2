package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.InvisibleStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.users.UserStorageModel;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UserContentWriter.kt */
/* loaded from: classes2.dex */
public final class ehq0 {

    /* compiled from: UserContentWriter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Platform.values().length];
            try {
                iArr[Platform.WEB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Platform.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(SQLiteStatement sQLiteStatement, UserStorageModel userStorageModel) {
        long i;
        int i2;
        sQLiteStatement.bindLong(1, userStorageModel.b);
        rdi.l(sQLiteStatement, 2, userStorageModel.c);
        sQLiteStatement.bindString(3, userStorageModel.d);
        sQLiteStatement.bindLong(4, userStorageModel.e.h());
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        sQLiteStatement.bindBlob(5, Serializer.b.e(userStorageModel.f));
        rdi.i(sQLiteStatement, 6, userStorageModel.g);
        rdi.i(sQLiteStatement, 7, userStorageModel.h);
        sQLiteStatement.bindLong(8, userStorageModel.i.h());
        rdi.i(sQLiteStatement, 9, userStorageModel.j);
        OnlineInfo onlineInfo = userStorageModel.l;
        sQLiteStatement.bindLong(10, b(onlineInfo));
        boolean z = onlineInfo instanceof VisibleStatus;
        if (z) {
            i = ((VisibleStatus) onlineInfo).b;
        } else {
            if (!(onlineInfo instanceof InvisibleStatus)) {
                throw new NoWhenBranchMatchedException();
            }
            i = ((InvisibleStatus) onlineInfo).b.i();
        }
        sQLiteStatement.bindLong(11, i);
        if (z) {
            i2 = ((VisibleStatus) onlineInfo).d;
        } else {
            if (!(onlineInfo instanceof InvisibleStatus)) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 0;
        }
        sQLiteStatement.bindLong(12, i2);
        sQLiteStatement.bindString(13, userStorageModel.m);
        sQLiteStatement.bindString(14, userStorageModel.n);
        sQLiteStatement.bindString(15, userStorageModel.o);
        sQLiteStatement.bindString(16, userStorageModel.p);
        sQLiteStatement.bindString(17, userStorageModel.q);
        sQLiteStatement.bindString(18, userStorageModel.r);
        sQLiteStatement.bindString(19, userStorageModel.s);
        sQLiteStatement.bindString(20, userStorageModel.t);
        rdi.i(sQLiteStatement, 21, userStorageModel.u);
        rdi.i(sQLiteStatement, 22, userStorageModel.v);
        rdi.i(sQLiteStatement, 23, userStorageModel.w);
        sQLiteStatement.bindLong(24, userStorageModel.x);
        sQLiteStatement.bindString(25, userStorageModel.y);
        rdi.i(sQLiteStatement, 26, userStorageModel.z);
        rdi.i(sQLiteStatement, 27, userStorageModel.A);
        rdi.i(sQLiteStatement, 28, userStorageModel.B);
        sQLiteStatement.bindLong(29, userStorageModel.C);
        sQLiteStatement.bindLong(30, userStorageModel.D);
        ImageStatus imageStatus = userStorageModel.E;
        rdi.h(sQLiteStatement, 31, imageStatus != null ? Serializer.b.e(imageStatus) : null);
        sQLiteStatement.bindString(32, userStorageModel.F);
        sQLiteStatement.bindString(33, userStorageModel.G);
        sQLiteStatement.bindLong(34, userStorageModel.H.i());
        sQLiteStatement.bindString(35, userStorageModel.I);
        rdi.k(sQLiteStatement, 36, userStorageModel.J);
        rdi.k(sQLiteStatement, 37, userStorageModel.K);
        rdi.k(sQLiteStatement, 38, userStorageModel.L);
        rdi.i(sQLiteStatement, 39, userStorageModel.M);
        rdi.i(sQLiteStatement, 40, userStorageModel.N);
        rdi.i(sQLiteStatement, 41, userStorageModel.k);
        sQLiteStatement.bindString(42, userStorageModel.O.name());
        rdi.i(sQLiteStatement, 43, userStorageModel.P);
        rdi.i(sQLiteStatement, 44, userStorageModel.Q);
    }

    public static int b(OnlineInfo onlineInfo) {
        boolean z = onlineInfo instanceof VisibleStatus;
        if (z && !((VisibleStatus) onlineInfo).c) {
            return 0;
        }
        if (z) {
            return ((VisibleStatus) onlineInfo).e == Platform.MOBILE ? 2 : 1;
        }
        return -1;
    }
}
