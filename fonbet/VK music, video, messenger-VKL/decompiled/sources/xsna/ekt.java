package xsna;

import android.location.Location;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.location.common.LocationCommon;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.SchemeStat$TypeAppStarts;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: GeoConcentrator.kt */
/* loaded from: classes11.dex */
public final class ekt implements dyp<SchemeStat$TypeAppStarts> {
    public final AppCompatActivity a;

    /* compiled from: GeoConcentrator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PermissionHelper.PermissionResult.values().length];
            try {
                iArr[PermissionHelper.PermissionResult.NOT_DETERMINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionHelper.PermissionResult.NOT_ALLOWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionHelper.PermissionResult.DONT_ASK_AGAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PermissionHelper.PermissionResult.ALLOWED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ekt(AppCompatActivity appCompatActivity) {
        this.a = appCompatActivity;
    }

    @Override // xsna.dyp
    public final SchemeStat$TypeAppStarts a(SchemeStat$TypeAppStarts schemeStat$TypeAppStarts) {
        Pair pair;
        PermissionHelper.a.getClass();
        String[] strArr = PermissionHelper.h;
        AppCompatActivity appCompatActivity = this.a;
        int i = a.$EnumSwitchMapping$0[PermissionHelper.p(appCompatActivity, strArr).ordinal()];
        if (i == 1) {
            pair = new Pair("not_determined", null);
        } else if (i == 2 || i == 3) {
            pair = new Pair("denied", null);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            LocationCommon.a.getClass();
            if (LocationCommon.b(appCompatActivity)) {
                Location f = kzz.f(appCompatActivity);
                pair = epx.f(f, LocationCommon.b) ? new Pair("no_data_internal_error", null) : new Pair("has_data", f);
            } else {
                pair = new Pair("no_data_location_disabled", null);
            }
        }
        String str = (String) pair.d();
        Location location = (Location) pair.g();
        return SchemeStat$TypeAppStarts.a(schemeStat$TypeAppStarts, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, location != null ? Float.valueOf((float) location.getLatitude()) : null, location != null ? Float.valueOf((float) location.getLongitude()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -939524097, -1, 1048575);
    }
}
