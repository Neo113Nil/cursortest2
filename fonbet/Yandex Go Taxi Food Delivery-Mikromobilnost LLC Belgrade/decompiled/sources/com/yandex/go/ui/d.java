package com.yandex.go.ui;

import android.net.Uri;
import android.widget.LinearLayout;
import com.adjust.sdk.Constants;
import com.yandex.go.account.user_verification.domain.i;
import com.yandex.go.domain.entities.UserPhotoButtonAction;
import com.yandex.go.navigation.UserPhotoUploadingEntryPoint;
import com.yandex.go.repositories.e;
import defpackage.ad5;
import defpackage.bvf0;
import defpackage.cne0;
import defpackage.cug;
import defpackage.dq21;
import defpackage.ecp0;
import defpackage.egv;
import defpackage.eq21;
import defpackage.fcl0;
import defpackage.fjb0;
import defpackage.gcp0;
import defpackage.gjb0;
import defpackage.gq21;
import defpackage.gr21;
import defpackage.hcp0;
import defpackage.hit;
import defpackage.i3y;
import defpackage.ir21;
import defpackage.mse;
import defpackage.ny61;
import defpackage.pr21;
import defpackage.r40;
import defpackage.rq21;
import defpackage.rr21;
import defpackage.s8o;
import defpackage.scc;
import defpackage.sls;
import defpackage.sr21;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse0;
import defpackage.v3n0;
import defpackage.v7j0;
import defpackage.vq21;
import defpackage.w511;
import defpackage.wx11;
import defpackage.xq21;
import defpackage.z30;
import defpackage.zo1;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes14.dex */
public final class d extends ad5 {
    public final e A;
    public final v7j0 B;
    public final g C;
    public final hit D;
    public final rq21 E;
    public final hcp0 F;
    public final eq21 G;
    public final i H;
    public final fjb0 I;
    public final gjb0 J;
    public final com.yandex.go.domain.interactor.c K;
    public final r0 L;
    public final r0 M;
    public boolean N;
    public String O;
    public volatile egv P;
    public final com.yandex.go.navigation.a x;
    public final UserPhotoUploadingEntryPoint y;
    public final com.yandex.go.domain.interactor.d z;

    public d(com.yandex.go.navigation.a aVar, UserPhotoUploadingEntryPoint userPhotoUploadingEntryPoint, com.yandex.go.domain.interactor.d dVar, e eVar, v7j0 v7j0Var, g gVar, hit hitVar, rq21 rq21Var, hcp0 hcp0Var, eq21 eq21Var, i iVar, fjb0 fjb0Var, gjb0 gjb0Var, com.yandex.go.domain.interactor.c cVar) {
        super(gr21.class);
        this.x = aVar;
        this.y = userPhotoUploadingEntryPoint;
        this.z = dVar;
        this.A = eVar;
        this.B = v7j0Var;
        this.C = gVar;
        this.D = hitVar;
        this.E = rq21Var;
        this.F = hcp0Var;
        this.G = eq21Var;
        this.H = iVar;
        this.I = fjb0Var;
        this.J = gjb0Var;
        this.K = cVar;
        this.L = bvf0.c(new ir21(true));
        this.M = bvf0.c(Boolean.FALSE);
        com.yandex.go.coroutines.b.g(hitVar.a, null, null, new UserPhotoUploadingPresenter$loadUserPhotoUploadingState$1(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r6v3, types: [sls] */
    /* JADX WARN: Type inference failed for: r7v3, types: [sls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(d dVar, int i, c cVar, zo1 zo1Var, UserPhotoButtonAction userPhotoButtonAction, ContinuationImpl continuationImpl) {
        UserPhotoUploadingPresenter$checkPermissions$1 userPhotoUploadingPresenter$checkPermissions$1;
        int i2;
        zo1 zo1Var2;
        c cVar2;
        boolean booleanValue;
        dVar.getClass();
        if (continuationImpl instanceof UserPhotoUploadingPresenter$checkPermissions$1) {
            userPhotoUploadingPresenter$checkPermissions$1 = (UserPhotoUploadingPresenter$checkPermissions$1) continuationImpl;
            int i3 = userPhotoUploadingPresenter$checkPermissions$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                userPhotoUploadingPresenter$checkPermissions$1.label = i3 - Integer.MIN_VALUE;
                Object obj = userPhotoUploadingPresenter$checkPermissions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = userPhotoUploadingPresenter$checkPermissions$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    v7j0 v7j0Var = dVar.B;
                    userPhotoUploadingPresenter$checkPermissions$1.L$0 = cVar;
                    userPhotoUploadingPresenter$checkPermissions$1.L$1 = zo1Var;
                    userPhotoUploadingPresenter$checkPermissions$1.L$2 = userPhotoButtonAction;
                    userPhotoUploadingPresenter$checkPermissions$1.I$0 = i;
                    userPhotoUploadingPresenter$checkPermissions$1.label = 1;
                    obj = ((com.yandex.go.permission.b) v7j0Var).d(i, userPhotoUploadingPresenter$checkPermissions$1);
                    cVar2 = cVar;
                    zo1Var2 = zo1Var;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    userPhotoButtonAction = (UserPhotoButtonAction) userPhotoUploadingPresenter$checkPermissions$1.L$2;
                    ?? r7 = (sls) userPhotoUploadingPresenter$checkPermissions$1.L$1;
                    ?? r6 = (sls) userPhotoUploadingPresenter$checkPermissions$1.L$0;
                    kotlin.b.b(obj);
                    cVar2 = r6;
                    zo1Var2 = r7;
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    zo1Var2.invoke();
                } else {
                    cVar2.invoke();
                }
                dVar.G.b(userPhotoButtonAction, booleanValue);
                return zy11.a;
            }
        }
        userPhotoUploadingPresenter$checkPermissions$1 = new UserPhotoUploadingPresenter$checkPermissions$1(dVar, continuationImpl);
        Object obj2 = userPhotoUploadingPresenter$checkPermissions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = userPhotoUploadingPresenter$checkPermissions$1.label;
        if (i2 != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
        dVar.G.b(userPhotoButtonAction, booleanValue);
        return zy11.a;
    }

    public static final void Lg(d dVar) {
        com.yandex.go.coroutines.b.g(dVar.D.a, null, null, new UserPhotoUploadingPresenter$onRetryButtonClicked$1(dVar, null), 3);
        dVar.G.e();
    }

    @Override // defpackage.ad5
    public final mse Ig() {
        return new b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Mg(xq21 xq21Var, ir21 ir21Var, ContinuationImpl continuationImpl) {
        UserPhotoUploadingPresenter$mapScreenContent$1 userPhotoUploadingPresenter$mapScreenContent$1;
        int i;
        xq21 xq21Var2;
        ir21 ir21Var2;
        Iterator it;
        if (continuationImpl instanceof UserPhotoUploadingPresenter$mapScreenContent$1) {
            userPhotoUploadingPresenter$mapScreenContent$1 = (UserPhotoUploadingPresenter$mapScreenContent$1) continuationImpl;
            int i2 = userPhotoUploadingPresenter$mapScreenContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userPhotoUploadingPresenter$mapScreenContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userPhotoUploadingPresenter$mapScreenContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userPhotoUploadingPresenter$mapScreenContent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    userPhotoUploadingPresenter$mapScreenContent$1.L$0 = xq21Var;
                    userPhotoUploadingPresenter$mapScreenContent$1.L$1 = ir21Var;
                    userPhotoUploadingPresenter$mapScreenContent$1.label = 1;
                    Object a = this.K.a(userPhotoUploadingPresenter$mapScreenContent$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    xq21Var2 = xq21Var;
                    obj = a;
                    ir21Var2 = ir21Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ir21 ir21Var3 = (ir21) userPhotoUploadingPresenter$mapScreenContent$1.L$1;
                    xq21 xq21Var3 = (xq21) userPhotoUploadingPresenter$mapScreenContent$1.L$0;
                    kotlin.b.b(obj);
                    xq21Var2 = xq21Var3;
                    ir21Var2 = ir21Var3;
                }
                vq21 vq21Var = (vq21) obj;
                this.O = vq21Var == null ? vq21Var.b : null;
                CharSequence charSequence = vq21Var == null ? vq21Var.a : null;
                String str = vq21Var == null ? vq21Var.c : null;
                String str2 = vq21Var == null ? vq21Var.d : null;
                a aVar = new a(this, xq21Var2, 2);
                UserPhotoUploadingPresenter$mapScreenContent$3 userPhotoUploadingPresenter$mapScreenContent$3 = new UserPhotoUploadingPresenter$mapScreenContent$3(0, this, d.class, "onTakeSelfieButtonClicked", "onTakeSelfieButtonClicked()V", 0);
                UserPhotoUploadingPresenter$mapScreenContent$4 userPhotoUploadingPresenter$mapScreenContent$4 = new UserPhotoUploadingPresenter$mapScreenContent$4(0, this, d.class, "onSelectImageButtonClicked", "onSelectImageButtonClicked()V", 0);
                hcp0 hcp0Var = this.F;
                hcp0Var.getClass();
                i3y i3yVar = hcp0Var.b;
                String str3 = str;
                String str4 = str2;
                String str5 = xq21Var2.a;
                CharSequence charSequence2 = xq21Var2.c;
                CharSequence charSequence3 = xq21Var2.d;
                CharSequence charSequence4 = xq21Var2.e;
                ArrayList arrayList = xq21Var2.f;
                int i3 = 1;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                it = arrayList.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        scc.m();
                        throw null;
                    }
                    String str6 = str3;
                    gq21 gq21Var = (gq21) next;
                    String str7 = str4;
                    String str8 = gq21Var.b;
                    String str9 = gq21Var.a;
                    if (str8 == null) {
                        str8 = str9;
                    }
                    CharSequence charSequence5 = charSequence2;
                    ButtonComponent buttonComponent = new ButtonComponent(hcp0Var.a, null, 0, 6, null);
                    CharSequence charSequence6 = charSequence3;
                    Iterator it2 = it;
                    CharSequence charSequence7 = charSequence4;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    ArrayList arrayList3 = arrayList;
                    layoutParams.setMargins(((Number) i3yVar.getValue()).intValue(), 0, ((Number) i3yVar.getValue()).intValue(), i4 == arrayList.size() + (-1) ? ((Number) hcp0Var.c.getValue()).intValue() : ((Number) hcp0Var.d.getValue()).intValue());
                    buttonComponent.setLayoutParams(layoutParams);
                    buttonComponent.setButtonSize(3);
                    buttonComponent.setButtonBackground(s8o.m(gq21Var.c, buttonComponent.getContext()));
                    buttonComponent.setButtonTitleColor(s8o.m(gq21Var.d, buttonComponent.getContext()));
                    int i6 = gcp0.a[gq21Var.e.ordinal()];
                    int i7 = i3;
                    if (i6 == i7) {
                        buttonComponent.setText(str9);
                        buttonComponent.setDebounceClickListener(new v3n0(27, aVar));
                    } else if (i6 == 2) {
                        if (!ir21Var2.a) {
                            str9 = str8;
                        } else if (str6 != null) {
                            str9 = str6;
                        }
                        buttonComponent.setText(str9);
                        buttonComponent.setDebounceClickListener(new fcl0(15, userPhotoUploadingPresenter$mapScreenContent$3));
                    } else {
                        if (i6 != 3) {
                            w511.b();
                            return null;
                        }
                        if (str7 != null) {
                            str9 = str7;
                        }
                        buttonComponent.setText(str9);
                        buttonComponent.setDebounceClickListener(new fcl0(16, userPhotoUploadingPresenter$mapScreenContent$4));
                    }
                    arrayList2.add(buttonComponent);
                    i3 = i7;
                    str4 = str7;
                    i4 = i5;
                    str3 = str6;
                    charSequence3 = charSequence6;
                    it = it2;
                    charSequence4 = charSequence7;
                    arrayList = arrayList3;
                    charSequence2 = charSequence5;
                }
                return new ecp0(str5, charSequence2, charSequence3, charSequence4, charSequence, arrayList2);
            }
        }
        userPhotoUploadingPresenter$mapScreenContent$1 = new UserPhotoUploadingPresenter$mapScreenContent$1(this, continuationImpl);
        Object obj2 = userPhotoUploadingPresenter$mapScreenContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userPhotoUploadingPresenter$mapScreenContent$1.label;
        if (i != 0) {
        }
        vq21 vq21Var2 = (vq21) obj2;
        this.O = vq21Var2 == null ? vq21Var2.b : null;
        if (vq21Var2 == null) {
        }
        if (vq21Var2 == null) {
        }
        if (vq21Var2 == null) {
        }
        a aVar2 = new a(this, xq21Var2, 2);
        UserPhotoUploadingPresenter$mapScreenContent$3 userPhotoUploadingPresenter$mapScreenContent$32 = new UserPhotoUploadingPresenter$mapScreenContent$3(0, this, d.class, "onTakeSelfieButtonClicked", "onTakeSelfieButtonClicked()V", 0);
        UserPhotoUploadingPresenter$mapScreenContent$4 userPhotoUploadingPresenter$mapScreenContent$42 = new UserPhotoUploadingPresenter$mapScreenContent$4(0, this, d.class, "onSelectImageButtonClicked", "onSelectImageButtonClicked()V", 0);
        hcp0 hcp0Var2 = this.F;
        hcp0Var2.getClass();
        i3y i3yVar2 = hcp0Var2.b;
        String str32 = str;
        String str42 = str2;
        String str52 = xq21Var2.a;
        CharSequence charSequence22 = xq21Var2.c;
        CharSequence charSequence32 = xq21Var2.d;
        CharSequence charSequence42 = xq21Var2.e;
        ArrayList arrayList4 = xq21Var2.f;
        int i32 = 1;
        ArrayList arrayList22 = new ArrayList(tcc.n(arrayList4, 10));
        it = arrayList4.iterator();
        int i42 = 0;
        while (it.hasNext()) {
        }
        return new ecp0(str52, charSequence22, charSequence32, charSequence42, charSequence, arrayList22);
    }

    public final void Ng(z30 z30Var) {
        ((cne0) this.z.c.a.getValue()).d().putBoolean("ShouldRestore", false).commit();
        Uri uri = z30Var.b;
        if (uri != null) {
            Rg(uri);
            return;
        }
        cug cugVar = this.G.b;
        cugVar.getClass();
        cugVar.a.a("UserPhotoUploading.PhotoLibrary.Cancelled", new HashMap(), 1, new HashMap());
    }

    public final void Og(r40 r40Var) {
        ((cne0) this.z.c.a.getValue()).d().putBoolean("ShouldRestore", false).commit();
        if (r40Var.a == -1) {
            Rg(this.E.b());
        } else {
            ((j) this.G.a).n("UserPhotoUploading.Camera.Cancelled");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f A[LOOP:0: B:11:0x0059->B:13:0x005f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Pg(xq21 xq21Var, ir21 ir21Var, ContinuationImpl continuationImpl) {
        UserPhotoUploadingPresenter$onSuccessState$1 userPhotoUploadingPresenter$onSuccessState$1;
        int i;
        Iterator it;
        String str;
        String str2;
        if (continuationImpl instanceof UserPhotoUploadingPresenter$onSuccessState$1) {
            userPhotoUploadingPresenter$onSuccessState$1 = (UserPhotoUploadingPresenter$onSuccessState$1) continuationImpl;
            int i2 = userPhotoUploadingPresenter$onSuccessState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userPhotoUploadingPresenter$onSuccessState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userPhotoUploadingPresenter$onSuccessState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userPhotoUploadingPresenter$onSuccessState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    userPhotoUploadingPresenter$onSuccessState$1.L$0 = xq21Var;
                    userPhotoUploadingPresenter$onSuccessState$1.L$1 = null;
                    userPhotoUploadingPresenter$onSuccessState$1.label = 1;
                    obj = Mg(xq21Var, ir21Var, userPhotoUploadingPresenter$onSuccessState$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xq21Var = (xq21) userPhotoUploadingPresenter$onSuccessState$1.L$0;
                    kotlin.b.b(obj);
                }
                ecp0 ecp0Var = (ecp0) obj;
                ArrayList arrayList = xq21Var.f;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((gq21) it.next()).e);
                }
                str = xq21Var.b;
                eq21 eq21Var = this.G;
                cug cugVar = eq21Var.b;
                switch (dq21.a[this.y.ordinal()]) {
                    case 1:
                        str2 = "menu";
                        break;
                    case 2:
                        str2 = Constants.DEEPLINK;
                        break;
                    case 3:
                        str2 = "profile";
                        break;
                    case 4:
                        str2 = "restored";
                        break;
                    case 5:
                        str2 = "notification";
                        break;
                    case 6:
                        str2 = "in_app_notification";
                        break;
                    case 7:
                        str2 = "safety_center";
                        break;
                    default:
                        w511.b();
                        return null;
                }
                String X = kotlin.collections.a.X(arrayList2, Extension.FIX_SPACE, null, null, new wx11(13, eq21Var), 30);
                cugVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("buttons", X);
                if (str != null) {
                    hashMap.put("photo_status", str);
                }
                cugVar.a.a("UserPhotoUploading.Screen.Appear", hashMap, 1, tse0.r("source", hashMap, str2));
                return new pr21(ecp0Var);
            }
        }
        userPhotoUploadingPresenter$onSuccessState$1 = new UserPhotoUploadingPresenter$onSuccessState$1(this, continuationImpl);
        Object obj3 = userPhotoUploadingPresenter$onSuccessState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userPhotoUploadingPresenter$onSuccessState$1.label;
        if (i != 0) {
        }
        ecp0 ecp0Var2 = (ecp0) obj3;
        ArrayList arrayList3 = xq21Var.f;
        ArrayList arrayList22 = new ArrayList(tcc.n(arrayList3, 10));
        it = arrayList3.iterator();
        while (it.hasNext()) {
        }
        str = xq21Var.b;
        eq21 eq21Var2 = this.G;
        cug cugVar2 = eq21Var2.b;
        switch (dq21.a[this.y.ordinal()]) {
        }
        String X2 = kotlin.collections.a.X(arrayList22, Extension.FIX_SPACE, null, null, new wx11(13, eq21Var2), 30);
        cugVar2.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("buttons", X2);
        if (str != null) {
        }
        cugVar2.a.a("UserPhotoUploading.Screen.Appear", hashMap2, 1, tse0.r("source", hashMap2, str2));
        return new pr21(ecp0Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Qg(xq21 xq21Var, ir21 ir21Var, ContinuationImpl continuationImpl) {
        UserPhotoUploadingPresenter$onUploadingState$1 userPhotoUploadingPresenter$onUploadingState$1;
        int i;
        if (continuationImpl instanceof UserPhotoUploadingPresenter$onUploadingState$1) {
            userPhotoUploadingPresenter$onUploadingState$1 = (UserPhotoUploadingPresenter$onUploadingState$1) continuationImpl;
            int i2 = userPhotoUploadingPresenter$onUploadingState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userPhotoUploadingPresenter$onUploadingState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userPhotoUploadingPresenter$onUploadingState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userPhotoUploadingPresenter$onUploadingState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (xq21Var == null) {
                        return rr21.a;
                    }
                    userPhotoUploadingPresenter$onUploadingState$1.L$0 = null;
                    userPhotoUploadingPresenter$onUploadingState$1.L$1 = null;
                    userPhotoUploadingPresenter$onUploadingState$1.label = 1;
                    obj = Mg(xq21Var, ir21Var, userPhotoUploadingPresenter$onUploadingState$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new sr21((ecp0) obj);
            }
        }
        userPhotoUploadingPresenter$onUploadingState$1 = new UserPhotoUploadingPresenter$onUploadingState$1(this, continuationImpl);
        Object obj3 = userPhotoUploadingPresenter$onUploadingState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userPhotoUploadingPresenter$onUploadingState$1.label;
        if (i != 0) {
        }
        return new sr21((ecp0) obj3);
    }

    public final void Rg(Uri uri) {
        com.yandex.go.coroutines.b.g(this.D.a, null, null, new UserPhotoUploadingPresenter$uploadUserPhoto$1(this, uri, null), 3);
    }

    public final void close() {
        tje.N(Jg(), null, null, new UserPhotoUploadingPresenter$close$1(this, null), 3);
    }
}
