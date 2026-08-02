package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atx0;
import defpackage.c191;
import defpackage.n091;
import defpackage.o091;
import defpackage.p091;
import defpackage.pui0;
import defpackage.ust;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements pui0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ust b;
    public final /* synthetic */ AbstractSafeParcelable c;

    public /* synthetic */ a(ust ustVar, AbstractSafeParcelable abstractSafeParcelable, int i) {
        this.a = i;
        this.b = ustVar;
        this.c = abstractSafeParcelable;
    }

    @Override // defpackage.pui0
    public final void accept(Object obj, Object obj2) {
        int i = this.a;
        AbstractSafeParcelable abstractSafeParcelable = this.c;
        ust ustVar = this.b;
        switch (i) {
            case 0:
                ((zbn) ((c191) obj).i()).zbd(new zbaf((n091) ustVar, (atx0) obj2), (SavePasswordRequest) abstractSafeParcelable);
                break;
            case 1:
                o091 o091Var = (o091) ustVar;
                zbap zbapVar = new zbap(o091Var, (atx0) obj2);
                ((zbw) ((p091) obj).i()).zbd(zbapVar, (GetPhoneNumberHintIntentRequest) abstractSafeParcelable, o091Var.k);
                break;
            case 2:
                ((zbw) ((p091) obj).i()).zbc(new zbam((o091) ustVar, (atx0) obj2), (BeginSignInRequest) abstractSafeParcelable);
                break;
            default:
                ((zbw) ((p091) obj).i()).zbe(new zbao((o091) ustVar, (atx0) obj2), (GetSignInIntentRequest) abstractSafeParcelable);
                break;
        }
    }
}
