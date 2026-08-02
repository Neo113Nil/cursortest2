package defpackage;

import com.yandex.go.domain.entities.UserPhotoButtonAction;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class eq21 {
    public final lx4 a;
    public final cug b;
    public final zf c;

    public eq21(lx4 lx4Var, cug cugVar, zf zfVar) {
        this.a = lx4Var;
        this.b = cugVar;
        this.c = zfVar;
    }

    public static String a(UserPhotoButtonAction userPhotoButtonAction) {
        int i = dq21.b[userPhotoButtonAction.ordinal()];
        if (i == 1) {
            return "delete";
        }
        if (i == 2) {
            return "take_selfie";
        }
        if (i == 3) {
            return "select_photo";
        }
        w511.b();
        return null;
    }

    public final void b(UserPhotoButtonAction userPhotoButtonAction, boolean z) {
        String a = a(userPhotoButtonAction);
        Boolean valueOf = Boolean.valueOf(z);
        cug cugVar = this.b;
        cugVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("action", a);
        hashMap.put("is_action_available", valueOf);
        cugVar.a.a("UserPhotoUploading.Button.Tapped", hashMap, 1, new HashMap());
    }

    public final void c(String str) {
        zf zfVar = this.c;
        zfVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("source", str);
        zfVar.a.a("AccessToCamera.Closed", hashMap, 1, new HashMap());
    }

    public final void d(String str) {
        cug cugVar = this.b;
        cugVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("source", str);
        cugVar.a.a("UserPhotoUploading.Screen.Disappear", hashMap, 1, new HashMap());
    }

    public final void e() {
        cug cugVar = this.b;
        cugVar.getClass();
        cugVar.a.a("UserPhotoUploading.ErrorScreen.RetryButton.Tapped", new HashMap(), 1, new HashMap());
    }

    public final void f() {
        cug cugVar = this.b;
        cugVar.getClass();
        cugVar.a.a("UserPhotoUploading.ErrorScreen.Appear", new HashMap(), 1, new HashMap());
    }
}
