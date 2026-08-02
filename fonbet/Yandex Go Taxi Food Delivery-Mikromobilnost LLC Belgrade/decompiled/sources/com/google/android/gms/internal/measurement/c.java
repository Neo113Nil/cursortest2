package com.google.android.gms.internal.measurement;

import android.app.Activity;
import defpackage.cvw;
import defpackage.gp91;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c extends gp91 {
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(zzfa zzfaVar, Activity activity, int i) {
        super(zzfaVar.zza, true);
        this.x = i;
        switch (i) {
            case 1:
                this.y = activity;
                this.z = zzfaVar;
                super(zzfaVar.zza, true);
                break;
            case 2:
                this.y = activity;
                this.z = zzfaVar;
                super(zzfaVar.zza, true);
                break;
            case 3:
                this.y = activity;
                this.z = zzfaVar;
                super(zzfaVar.zza, true);
                break;
            case 4:
                this.y = activity;
                this.z = zzfaVar;
                super(zzfaVar.zza, true);
                break;
            default:
                this.y = activity;
                this.z = zzfaVar;
                break;
        }
    }

    @Override // defpackage.gp91
    public final void a() {
        switch (this.x) {
            case 0:
                zzcr zzcrVar = ((zzfa) this.z).zza.f;
                cvw.l(zzcrVar);
                zzcrVar.onActivityStartedByScionActivityInfo(zzdf.zza((Activity) this.y), this.b);
                break;
            case 1:
                zzcr zzcrVar2 = ((zzfa) this.z).zza.f;
                cvw.l(zzcrVar2);
                zzcrVar2.onActivityResumedByScionActivityInfo(zzdf.zza((Activity) this.y), this.b);
                break;
            case 2:
                zzcr zzcrVar3 = ((zzfa) this.z).zza.f;
                cvw.l(zzcrVar3);
                zzcrVar3.onActivityPausedByScionActivityInfo(zzdf.zza((Activity) this.y), this.b);
                break;
            case 3:
                zzcr zzcrVar4 = ((zzfa) this.z).zza.f;
                cvw.l(zzcrVar4);
                zzcrVar4.onActivityStoppedByScionActivityInfo(zzdf.zza((Activity) this.y), this.b);
                break;
            case 4:
                zzcr zzcrVar5 = ((zzfa) this.z).zza.f;
                cvw.l(zzcrVar5);
                zzcrVar5.onActivityDestroyedByScionActivityInfo(zzdf.zza((Activity) this.y), this.b);
                break;
            default:
                zzcr zzcrVar6 = ((e) this.z).f;
                cvw.l(zzcrVar6);
                zzcrVar6.registerOnMeasurementEventListener((zzes) this.y);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, zzes zzesVar) {
        super(eVar, true);
        this.x = 5;
        this.y = zzesVar;
        Objects.requireNonNull(eVar);
        this.z = eVar;
    }
}
