package xsna;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.SchemeStat$TypeAppStarts;

/* compiled from: PermissionsConcentrator.kt */
/* loaded from: classes11.dex */
public final class hy90 implements dyp<SchemeStat$TypeAppStarts> {
    public final AppCompatActivity a;

    public hy90(AppCompatActivity appCompatActivity) {
        this.a = appCompatActivity;
    }

    @Override // xsna.dyp
    public final SchemeStat$TypeAppStarts a(SchemeStat$TypeAppStarts schemeStat$TypeAppStarts) {
        Boolean valueOf = Boolean.valueOf(zqn0.a.f());
        PermissionHelper permissionHelper = PermissionHelper.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        permissionHelper.getClass();
        Boolean valueOf2 = Boolean.valueOf(PermissionHelper.n(context));
        String[] strArr = PermissionHelper.l;
        AppCompatActivity appCompatActivity = this.a;
        return SchemeStat$TypeAppStarts.a(schemeStat$TypeAppStarts, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, valueOf, valueOf2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, by90.a(PermissionHelper.p(appCompatActivity, strArr)), by90.a(PermissionHelper.p(appCompatActivity, PermissionHelper.m)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -6291457, -12582913, 1048575);
    }
}
