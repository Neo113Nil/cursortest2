package xsna;

import android.accounts.Account;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.internal.fitness.zzab;
import com.google.android.gms.internal.fitness.zzaj;
import com.google.android.gms.internal.fitness.zzax;
import com.google.android.gms.internal.fitness.zzbf;
import com.google.android.gms.internal.fitness.zzbn;
import com.google.android.gms.internal.fitness.zzdf;
import com.google.android.gms.internal.fitness.zzdl;
import com.google.android.gms.internal.fitness.zzdo;
import com.google.android.gms.internal.fitness.zzdz;
import com.google.android.gms.internal.fitness.zzej;
import com.google.android.gms.internal.fitness.zzen;
import com.google.android.gms.internal.fitness.zzey;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class nmr {
    static {
        a.g gVar = zzbf.zze;
        new zzen();
        a.g gVar2 = zzax.zze;
        new zzej();
        a.g gVar3 = zzbn.zze;
        new zzey();
        a.g gVar4 = zzaj.zze;
        new zzdz();
        a.g gVar5 = zzab.zze;
        new zzdo();
        a.g gVar6 = com.google.android.gms.internal.fitness.zzu.zze;
        new zzdl();
        a.g gVar7 = com.google.android.gms.internal.fitness.zzm.zze;
        new zzdf();
        new Scope("https://www.googleapis.com/auth/fitness.activity.read");
        new Scope("https://www.googleapis.com/auth/fitness.activity.write");
        new Scope("https://www.googleapis.com/auth/fitness.location.read");
        new Scope("https://www.googleapis.com/auth/fitness.location.write");
        new Scope("https://www.googleapis.com/auth/fitness.body.read");
        new Scope("https://www.googleapis.com/auth/fitness.body.write");
        new Scope("https://www.googleapis.com/auth/fitness.nutrition.read");
        new Scope("https://www.googleapis.com/auth/fitness.nutrition.write");
        new Scope("https://www.googleapis.com/auth/fitness.heart_rate.read");
        new Scope("https://www.googleapis.com/auth/fitness.heart_rate.write");
        new Scope("https://www.googleapis.com/auth/fitness.respiratory_rate.read");
        new Scope("https://www.googleapis.com/auth/fitness.respiratory_rate.write");
        new Scope("https://www.googleapis.com/auth/fitness.sleep.read");
        new Scope("https://www.googleapis.com/auth/fitness.sleep.write");
        Account account = new Account("none", "com.google");
        el3 el3Var = new el3();
        String str = account.name;
        exc0.f(str);
        new GoogleSignInAccount(null, null, str, null, null, null, 0L, str, new ArrayList(el3Var), null, null);
    }

    @NonNull
    @Deprecated
    public static i8v a(@NonNull Context context, @NonNull GoogleSignInAccount googleSignInAccount) {
        return new i8v(context, zzaj.zzg, new kh01(context, googleSignInAccount), b.a.c);
    }
}
