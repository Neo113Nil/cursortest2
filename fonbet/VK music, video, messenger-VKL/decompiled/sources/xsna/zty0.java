package xsna;

import android.os.Build;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class zty0 implements j601 {
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public zty0(j601 j601Var, j601 j601Var2, j601 j601Var3, j601 j601Var4) {
        this.b = j601Var;
        this.c = j601Var2;
        this.d = j601Var3;
        this.e = j601Var4;
    }

    @Override // xsna.j601
    public /* bridge */ /* synthetic */ Object zza() {
        return new wtz0((x201) ((j601) this.b).zza(), (bs01) ((j601) this.c).zza(), (dp01) ((j601) this.d).zza(), (e301) ((j601) this.e).zza());
    }

    public zty0(String str, String str2, String str3, String str4) {
        String str5 = Build.VERSION.RELEASE;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }
}
