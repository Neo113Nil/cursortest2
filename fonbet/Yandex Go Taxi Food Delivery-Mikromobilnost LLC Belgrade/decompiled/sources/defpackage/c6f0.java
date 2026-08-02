package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public final class c6f0 implements tsr, r30, nzc0 {
    public final PackageManager a;
    public l40 b;
    public HashMap c;
    public final HashMap w = new HashMap();

    public c6f0(y4a0 y4a0Var) {
        this.a = (PackageManager) y4a0Var.b;
        y4a0Var.c = this;
    }

    public final void a(String str, String str2, boolean z, ba20 ba20Var) {
        if (this.b == null) {
            ba20Var.error("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.c;
        if (hashMap == null) {
            ba20Var.error("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            ba20Var.error("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = ba20Var.hashCode();
        this.w.put(Integer.valueOf(hashCode), ba20Var);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z);
        ((Activity) ((wrr) this.b).b).startActivityForResult(intent, hashCode);
    }

    public final HashMap b() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.c;
        PackageManager packageManager = this.a;
        if (hashMap == null) {
            this.c = new HashMap();
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
            if (Build.VERSION.SDK_INT >= 33) {
                of = PackageManager.ResolveInfoFlags.of(0L);
                queryIntentActivities = packageManager.queryIntentActivities(type, of);
            } else {
                queryIntentActivities = packageManager.queryIntentActivities(type, 0);
            }
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.c.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.c.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.c.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // defpackage.nzc0
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.w;
        if (!hashMap.containsKey(valueOf)) {
            return false;
        }
        ((da20) hashMap.remove(Integer.valueOf(i))).success(i2 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // defpackage.r30
    public final void onAttachedToActivity(l40 l40Var) {
        this.b = l40Var;
        ((wrr) l40Var).a(this);
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivity() {
        ((wrr) this.b).k(this);
        this.b = null;
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivityForConfigChanges() {
        ((wrr) this.b).k(this);
        this.b = null;
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
    }

    @Override // defpackage.r30
    public final void onReattachedToActivityForConfigChanges(l40 l40Var) {
        this.b = l40Var;
        ((wrr) l40Var).a(this);
    }
}
