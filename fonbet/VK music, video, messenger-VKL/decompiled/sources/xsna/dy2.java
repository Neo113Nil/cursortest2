package xsna;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import com.vk.api.generated.donut.dto.DonutGetInfoFieldsDto;
import com.vk.api.generated.donut.dto.DonutGetLevelsSourceDto;
import com.vk.core.apps.BuildInfo;
import com.vk.device.store.AppStore;
import com.vk.dto.common.id.UserId;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class dy2 implements jzk0 {
    public static sr10 a;
    public static String b;

    public static xy2 c(dy2 dy2Var, UserId userId, DonutGetLevelsSourceDto donutGetLevelsSourceDto, int i) {
        if ((i & 8) != 0) {
            donutGetLevelsSourceDto = null;
        }
        dy2Var.getClass();
        tfx tfxVar = new tfx("donut.getLevels", new qr(14), new rr(15));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfxVar.j("with_hidden", true);
        if (donutGetLevelsSourceDto != null) {
            tfx.o(tfxVar, "source", donutGetLevelsSourceDto.i(), 0, 0, 12);
        }
        return tfxVar;
    }

    public static final Object e(dcy dcyVar) {
        Object failure;
        Class<?> a2 = ((pfc) dcyVar).a();
        Object obj = a2.getField("Companion").get(null);
        try {
            Field declaredField = obj.getClass().getDeclaredField("STUB");
            declaredField.setAccessible(true);
            failure = declaredField.get(null);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            Method declaredMethod = obj.getClass().getDeclaredMethod("getSTUB", null);
            declaredMethod.setAccessible(true);
            failure = declaredMethod.invoke(obj, null);
        }
        if (a2.isInstance(failure)) {
            return failure;
        }
        throw new IllegalStateException(dcyVar.h() + " has a STUB field of a wrong type");
    }

    public static final PackageInfo f(String str, int i) {
        if (str != null && str.length() != 0) {
            try {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                return context.getPackageManager().getPackageInfo(str, i);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static final boolean g(Context context, AppStore appStore) {
        Object h = h(context, null);
        if (h == null) {
            h = Boolean.FALSE;
        }
        return epx.f(appStore.j(), h);
    }

    public static final String h(Context context, String str) {
        String str2;
        InstallSourceInfo installSourceInfo;
        String originatingPackageName;
        String initiatingPackageName;
        ApplicationInfo applicationInfo;
        InstallSourceInfo installSourceInfo2;
        try {
            String str3 = b;
            if (str3 != null) {
                return str3;
            }
            try {
                if (gz80.a(30)) {
                    installSourceInfo2 = context.getPackageManager().getInstallSourceInfo(context.getPackageName());
                    str2 = BuildInfo.m() ? installSourceInfo2.getInitiatingPackageName() : installSourceInfo2.getInstallingPackageName();
                } else {
                    str2 = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                }
            } catch (Throwable unused) {
                str2 = null;
            }
            int i = 0;
            if (str2 == null) {
                try {
                    if (gz80.a(30)) {
                        installSourceInfo = context.getPackageManager().getInstallSourceInfo(context.getPackageName());
                        str2 = installSourceInfo.getInstallingPackageName();
                        originatingPackageName = installSourceInfo.getOriginatingPackageName();
                        initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                        if (originatingPackageName != null && initiatingPackageName != null && (context.getPackageManager().getApplicationInfo(initiatingPackageName, 0).flags & 1) != 0) {
                            str2 = originatingPackageName;
                        }
                    } else {
                        str2 = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    }
                } catch (Throwable unused2) {
                    str2 = null;
                }
                if (str2 == null) {
                    try {
                        str2 = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    } catch (Throwable unused3) {
                        str2 = null;
                    }
                }
            }
            if (str2 == null) {
                try {
                    Context context2 = e43.a;
                    PackageInfo f = f((context2 != null ? context2 : null).getPackageName(), 0);
                    if (f != null && (applicationInfo = f.applicationInfo) != null) {
                        i = applicationInfo.flags;
                    }
                    if ((i & 1) == 1) {
                        str2 = "system";
                    }
                } catch (Exception unused4) {
                }
            }
            b = str2;
            return str2 == null ? str : str2;
        } catch (Exception unused5) {
            return str;
        }
    }

    public static boolean i(String str) {
        return f(str, 0) != null;
    }

    public tfx a(List list) {
        tfx tfxVar = new tfx("donut.checkCensoredValidate", new sn(18), new nr(13));
        if (list != null) {
            tfxVar.i("values", list);
        }
        return tfxVar;
    }

    public tfx b(UserId userId, List list) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("donut.getInfo", new zn(13), new ao(16));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((DonutGetInfoFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        return tfxVar;
    }

    public tfx d(UserId userId) {
        tfx tfxVar = new tfx("donut.getSettings", new bo(17), new sr(12));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        return tfxVar;
    }
}
