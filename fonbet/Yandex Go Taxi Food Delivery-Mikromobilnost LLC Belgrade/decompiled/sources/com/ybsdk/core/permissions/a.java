package com.ybsdk.core.permissions;

import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ybsdk.core.permissions.RequestPermissionResult;
import com.ybsdk.core.permissions.a;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.g;
import defpackage.b0b0;
import defpackage.c0b0;
import defpackage.d0b0;
import defpackage.ffx;
import defpackage.g8e;
import defpackage.gza0;
import defpackage.h50;
import defpackage.i50;
import defpackage.jla1;
import defpackage.lcb1;
import defpackage.m50;
import defpackage.ny61;
import defpackage.qya0;
import defpackage.rbv;
import defpackage.tls;
import defpackage.tya0;
import defpackage.u40;
import defpackage.w511;
import defpackage.wrt;
import defpackage.z1x0;
import defpackage.z8i0;
import io.appmetrica.analytics.BuildConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes2.dex */
public final class a implements tya0 {
    public final gza0 a;
    public final Fragment b;
    public final SharedPreferences c;
    public final n0 d = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
    public final m50 e;
    public final m50 f;
    public final String g;
    public final String h;
    public qya0 i;

    public a(gza0 gza0Var, Fragment fragment, SharedPreferences sharedPreferences) {
        this.a = gza0Var;
        this.b = fragment;
        this.c = sharedPreferences;
        final int i = 0;
        final int i2 = 1;
        this.e = fragment.registerForActivityResult(new i50(), new u40(this) { // from class: vya0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.u40
            public final void a(Object obj) {
                RequestPermissionResult requestPermissionResult;
                int i3 = i;
                a aVar = this.b;
                switch (i3) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        aVar.e(!bool.booleanValue());
                        aVar.d.g(bool.booleanValue() ? RequestPermissionResult.ALLOW : RequestPermissionResult.SYSTEM_DISALLOW);
                        break;
                    default:
                        Map map = (Map) obj;
                        b0b0 b0b0Var = (b0b0) aVar.a.a;
                        int i4 = a0b0.a[b0b0Var.c.ordinal()];
                        if (i4 == 1) {
                            if (!map.isEmpty()) {
                                Iterator it = map.entrySet().iterator();
                                while (it.hasNext()) {
                                    if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                        requestPermissionResult = RequestPermissionResult.SYSTEM_DISALLOW;
                                    }
                                }
                            }
                            requestPermissionResult = RequestPermissionResult.ALLOW;
                        } else if (i4 == 2) {
                            if (!map.isEmpty()) {
                                Iterator it2 = map.entrySet().iterator();
                                while (it2.hasNext()) {
                                    if (((Boolean) ((Map.Entry) it2.next()).getValue()).booleanValue()) {
                                        requestPermissionResult = RequestPermissionResult.ALLOW;
                                    }
                                }
                            }
                            requestPermissionResult = RequestPermissionResult.SYSTEM_DISALLOW;
                        } else if (i4 != 3) {
                            w511.b();
                            break;
                        } else {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : map.entrySet()) {
                                if (b0b0Var.b.contains((String) entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            if (!linkedHashMap.isEmpty()) {
                                Iterator it3 = linkedHashMap.entrySet().iterator();
                                while (it3.hasNext()) {
                                    if (!((Boolean) ((Map.Entry) it3.next()).getValue()).booleanValue()) {
                                        requestPermissionResult = RequestPermissionResult.SYSTEM_DISALLOW;
                                    }
                                }
                            }
                            requestPermissionResult = RequestPermissionResult.ALLOW;
                        }
                        aVar.e(!requestPermissionResult.getIsGranted());
                        aVar.d.g(requestPermissionResult);
                        break;
                }
            }
        });
        this.f = fragment.registerForActivityResult(new h50(), new u40(this) { // from class: vya0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.u40
            public final void a(Object obj) {
                RequestPermissionResult requestPermissionResult;
                int i3 = i2;
                a aVar = this.b;
                switch (i3) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        aVar.e(!bool.booleanValue());
                        aVar.d.g(bool.booleanValue() ? RequestPermissionResult.ALLOW : RequestPermissionResult.SYSTEM_DISALLOW);
                        break;
                    default:
                        Map map = (Map) obj;
                        b0b0 b0b0Var = (b0b0) aVar.a.a;
                        int i4 = a0b0.a[b0b0Var.c.ordinal()];
                        if (i4 == 1) {
                            if (!map.isEmpty()) {
                                Iterator it = map.entrySet().iterator();
                                while (it.hasNext()) {
                                    if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                        requestPermissionResult = RequestPermissionResult.SYSTEM_DISALLOW;
                                    }
                                }
                            }
                            requestPermissionResult = RequestPermissionResult.ALLOW;
                        } else if (i4 == 2) {
                            if (!map.isEmpty()) {
                                Iterator it2 = map.entrySet().iterator();
                                while (it2.hasNext()) {
                                    if (((Boolean) ((Map.Entry) it2.next()).getValue()).booleanValue()) {
                                        requestPermissionResult = RequestPermissionResult.ALLOW;
                                    }
                                }
                            }
                            requestPermissionResult = RequestPermissionResult.SYSTEM_DISALLOW;
                        } else if (i4 != 3) {
                            w511.b();
                            break;
                        } else {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : map.entrySet()) {
                                if (b0b0Var.b.contains((String) entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            if (!linkedHashMap.isEmpty()) {
                                Iterator it3 = linkedHashMap.entrySet().iterator();
                                while (it3.hasNext()) {
                                    if (!((Boolean) ((Map.Entry) it3.next()).getValue()).booleanValue()) {
                                        requestPermissionResult = RequestPermissionResult.SYSTEM_DISALLOW;
                                    }
                                }
                            }
                            requestPermissionResult = RequestPermissionResult.ALLOW;
                        }
                        aVar.e(!requestPermissionResult.getIsGranted());
                        aVar.d.g(requestPermissionResult);
                        break;
                }
            }
        });
        d0b0 d0b0Var = gza0Var.a;
        this.g = g8e.o("rationaleWasShown:", d0b0Var.b());
        this.h = g8e.o("lastRequestTimestampKey:", d0b0Var.b());
    }

    public final boolean a() {
        return this.a.a.c(this.b.requireActivity());
    }

    public final void b() {
        d0b0 d0b0Var = this.a.a;
        if (d0b0Var instanceof c0b0) {
            jla1.i(this.e, ((c0b0) d0b0Var).a);
        } else if (!(d0b0Var instanceof b0b0)) {
            w511.b();
        } else {
            jla1.i(this.f, ((b0b0) d0b0Var).a.toArray(new String[0]));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(boolean z, ContinuationImpl continuationImpl) {
        PermissionManagerImpl$requestPermission$1 permissionManagerImpl$requestPermission$1;
        int i;
        qya0 qya0Var;
        if (continuationImpl instanceof PermissionManagerImpl$requestPermission$1) {
            permissionManagerImpl$requestPermission$1 = (PermissionManagerImpl$requestPermission$1) continuationImpl;
            int i2 = permissionManagerImpl$requestPermission$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                permissionManagerImpl$requestPermission$1.label = i2 - Integer.MIN_VALUE;
                Object obj = permissionManagerImpl$requestPermission$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = permissionManagerImpl$requestPermission$1.label;
                final int i3 = 1;
                if (i != 0) {
                    b.b(obj);
                    permissionManagerImpl$requestPermission$1.label = 1;
                    if (a()) {
                        obj = RequestPermissionResult.ALLOW;
                    } else {
                        SharedPreferences sharedPreferences = this.c;
                        String str = this.g;
                        final int i4 = 0;
                        boolean z2 = sharedPreferences.getBoolean(str, false);
                        gza0 gza0Var = this.a;
                        if (z2 && gza0Var.d) {
                            obj = RequestPermissionResult.SYSTEM_DISALLOW;
                        } else {
                            sharedPreferences.edit().putLong(this.h, System.currentTimeMillis()).apply();
                            d0b0 d0b0Var = gza0Var.a;
                            Fragment fragment = this.b;
                            final int i5 = 2;
                            if (d0b0Var.a(fragment.requireActivity())) {
                                qya0 qya0Var2 = this.i;
                                if (qya0Var2 != null) {
                                    qya0Var2.d();
                                }
                                e(true);
                                final BottomSheetDialogView bottomSheetDialogView = new BottomSheetDialogView(fragment.requireContext(), null, 0, 6, null);
                                bottomSheetDialogView.onPrimaryAction(new View.OnClickListener() { // from class: wya0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i6 = i3;
                                        a aVar = this;
                                        BottomSheetDialogView bottomSheetDialogView2 = bottomSheetDialogView;
                                        switch (i6) {
                                            case 0:
                                                bottomSheetDialogView2.dismiss();
                                                cua1.d(aVar.b);
                                                break;
                                            case 1:
                                                bottomSheetDialogView2.onDismiss(new jiu(13));
                                                aVar.b();
                                                bottomSheetDialogView2.dismiss();
                                                break;
                                            default:
                                                bottomSheetDialogView2.onDismiss(new jiu(13));
                                                bottomSheetDialogView2.dismiss();
                                                aVar.d.g(RequestPermissionResult.RATIONALE_DISALLOW);
                                                break;
                                        }
                                    }
                                });
                                bottomSheetDialogView.onSecondaryAction(new View.OnClickListener() { // from class: wya0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i6 = i5;
                                        a aVar = this;
                                        BottomSheetDialogView bottomSheetDialogView2 = bottomSheetDialogView;
                                        switch (i6) {
                                            case 0:
                                                bottomSheetDialogView2.dismiss();
                                                cua1.d(aVar.b);
                                                break;
                                            case 1:
                                                bottomSheetDialogView2.onDismiss(new jiu(13));
                                                aVar.b();
                                                bottomSheetDialogView2.dismiss();
                                                break;
                                            default:
                                                bottomSheetDialogView2.onDismiss(new jiu(13));
                                                bottomSheetDialogView2.dismiss();
                                                aVar.d.g(RequestPermissionResult.RATIONALE_DISALLOW);
                                                break;
                                        }
                                    }
                                });
                                bottomSheetDialogView.onDismiss(new tls(this) { // from class: xya0
                                    public final /* synthetic */ a b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj2) {
                                        int i6 = i3;
                                        zy11 zy11Var = zy11.a;
                                        a aVar = this.b;
                                        ((Boolean) obj2).getClass();
                                        switch (i6) {
                                            case 0:
                                                aVar.d.g(RequestPermissionResult.SETTINGS_DISMISS);
                                                break;
                                            default:
                                                aVar.d.g(RequestPermissionResult.RATIONALE_DISMISS);
                                                break;
                                        }
                                        return zy11Var;
                                    }
                                });
                                z8i0 z8i0Var = gza0Var.b;
                                YbButtonView.a aVar = new YbButtonView.a(z8i0Var.c, null, null, null, null, null, null, false, false, null, 4094);
                                YbButtonView.a aVar2 = new YbButtonView.a(z8i0Var.d, null, null, null, null, null, null, false, false, null, 4094);
                                Text.Resource resource = z8i0Var.a;
                                Text.Resource resource2 = z8i0Var.b;
                                rbv rbvVar = z8i0Var.e;
                                BottomSheetDialogView.State.a aVar3 = new BottomSheetDialogView.State.a(resource, resource2, null, rbvVar != null ? new g(rbvVar, null, null, null, 30) : null, null, null, BuildConfig.API_LEVEL);
                                z1x0 z1x0Var = z8i0Var.f;
                                if (z1x0Var == null) {
                                    z1x0Var = new z1x0(z1x0.c, null);
                                }
                                bottomSheetDialogView.render(new BottomSheetDialogView.State(aVar3, aVar, aVar2, null, null, null, z1x0Var, null, null, 126960));
                                View currentFocus = fragment.requireActivity().getCurrentFocus();
                                if (currentFocus != null) {
                                    lcb1.d(currentFocus);
                                }
                                BottomSheetDialogView.show$default(bottomSheetDialogView, fragment.requireActivity(), null, 2, null);
                            } else if (!sharedPreferences.getBoolean(str, false)) {
                                qya0 qya0Var3 = this.i;
                                if (qya0Var3 != null) {
                                    qya0Var3.e();
                                }
                                b();
                                e(true);
                            } else if (z) {
                                wrt wrtVar = gza0Var.c;
                                if (wrtVar != null) {
                                    qya0 qya0Var4 = this.i;
                                    if (qya0Var4 != null) {
                                        qya0Var4.f();
                                    }
                                    final BottomSheetDialogView bottomSheetDialogView2 = new BottomSheetDialogView(fragment.requireContext(), null, 0, 6, null);
                                    bottomSheetDialogView2.onPrimaryAction(new View.OnClickListener() { // from class: wya0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i6 = i4;
                                            a aVar4 = this;
                                            BottomSheetDialogView bottomSheetDialogView22 = bottomSheetDialogView2;
                                            switch (i6) {
                                                case 0:
                                                    bottomSheetDialogView22.dismiss();
                                                    cua1.d(aVar4.b);
                                                    break;
                                                case 1:
                                                    bottomSheetDialogView22.onDismiss(new jiu(13));
                                                    aVar4.b();
                                                    bottomSheetDialogView22.dismiss();
                                                    break;
                                                default:
                                                    bottomSheetDialogView22.onDismiss(new jiu(13));
                                                    bottomSheetDialogView22.dismiss();
                                                    aVar4.d.g(RequestPermissionResult.RATIONALE_DISALLOW);
                                                    break;
                                            }
                                        }
                                    });
                                    bottomSheetDialogView2.onDismiss(new tls(this) { // from class: xya0
                                        public final /* synthetic */ a b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // defpackage.tls
                                        public final Object invoke(Object obj2) {
                                            int i6 = i4;
                                            zy11 zy11Var = zy11.a;
                                            a aVar4 = this.b;
                                            ((Boolean) obj2).getClass();
                                            switch (i6) {
                                                case 0:
                                                    aVar4.d.g(RequestPermissionResult.SETTINGS_DISMISS);
                                                    break;
                                                default:
                                                    aVar4.d.g(RequestPermissionResult.RATIONALE_DISMISS);
                                                    break;
                                            }
                                            return zy11Var;
                                        }
                                    });
                                    YbButtonView.a aVar4 = new YbButtonView.a(wrtVar.c, null, null, null, null, null, null, false, false, null, 4094);
                                    Text.Resource resource3 = wrtVar.a;
                                    Text text = wrtVar.b;
                                    rbv rbvVar2 = wrtVar.d;
                                    bottomSheetDialogView2.render(new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(resource3, text, null, rbvVar2 != null ? new g(rbvVar2, null, null, null, 30) : null, null, null, BuildConfig.API_LEVEL), aVar4, null, null, null, null, null, null, null, 131068));
                                    View currentFocus2 = fragment.requireActivity().getCurrentFocus();
                                    if (currentFocus2 != null) {
                                        lcb1.d(currentFocus2);
                                    }
                                    BottomSheetDialogView.show$default(bottomSheetDialogView2, fragment.requireActivity(), null, 2, null);
                                }
                            } else {
                                obj = RequestPermissionResult.SYSTEM_DISALLOW;
                            }
                            obj = e.y(this.d, permissionManagerImpl$requestPermission$1);
                        }
                    }
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                RequestPermissionResult requestPermissionResult = (RequestPermissionResult) obj;
                qya0Var = this.i;
                if (qya0Var != null) {
                    qya0Var.c(requestPermissionResult);
                }
                return obj;
            }
        }
        permissionManagerImpl$requestPermission$1 = new PermissionManagerImpl$requestPermission$1(this, continuationImpl);
        Object obj2 = permissionManagerImpl$requestPermission$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = permissionManagerImpl$requestPermission$1.label;
        final int i32 = 1;
        if (i != 0) {
        }
        RequestPermissionResult requestPermissionResult2 = (RequestPermissionResult) obj2;
        qya0Var = this.i;
        if (qya0Var != null) {
        }
        return obj2;
    }

    public final void d(qya0 qya0Var) {
        this.i = qya0Var;
    }

    public final void e(boolean z) {
        this.c.edit().putBoolean(this.g, z).apply();
    }
}
