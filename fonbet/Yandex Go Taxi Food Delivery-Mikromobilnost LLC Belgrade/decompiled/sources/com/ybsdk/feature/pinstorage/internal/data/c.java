package com.ybsdk.feature.pinstorage.internal.data;

import android.content.SharedPreferences;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import com.ybsdk.common.DeviceIdProvider;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.g;
import com.ybsdk.rconfig.configs.PinBackupConfig;
import defpackage.acb1;
import defpackage.an11;
import defpackage.dxf0;
import defpackage.e5z0;
import defpackage.em3;
import defpackage.evu0;
import defpackage.g0c;
import defpackage.g8e;
import defpackage.gvu0;
import defpackage.gw00;
import defpackage.h0c0;
import defpackage.i5z0;
import defpackage.jl40;
import defpackage.m7a1;
import defpackage.ny61;
import defpackage.ogx;
import defpackage.oo31;
import defpackage.qc20;
import defpackage.qoi0;
import defpackage.rqp0;
import defpackage.sm91;
import defpackage.tcc;
import defpackage.tls;
import defpackage.trp0;
import defpackage.tzn;
import defpackage.uoi0;
import defpackage.v0c0;
import defpackage.va90;
import defpackage.vub0;
import defpackage.w511;
import defpackage.yop0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c {
    public final g a;
    public final dxf0 b;
    public final Moshi c;
    public final va90 d;
    public final qc20 e;
    public final SharedPreferences f;
    public final SharedPreferences g;

    public c(yop0 yop0Var, g gVar, dxf0 dxf0Var, Moshi moshi, va90 va90Var, qc20 qc20Var) {
        this.a = gVar;
        this.b = dxf0Var;
        this.c = moshi;
        this.d = va90Var;
        this.e = qc20Var;
        this.f = yop0Var.a;
        this.g = yop0Var.b;
    }

    public static boolean o(PinStorageImpl$GetPinErrorReason pinStorageImpl$GetPinErrorReason) {
        int i = pinStorageImpl$GetPinErrorReason == null ? -1 : b.a[pinStorageImpl$GetPinErrorReason.ordinal()];
        if (i != -1) {
            if (i == 1 || i == 2) {
                return true;
            }
            if (i != 3 && i != 4 && i != 5) {
                w511.b();
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(int i, ContinuationImpl continuationImpl) {
        PinStorageImpl$setBiometricSuggestScreenCount$1 pinStorageImpl$setBiometricSuggestScreenCount$1;
        int i2;
        Object e;
        v0c0 v0c0Var;
        String c;
        if (continuationImpl instanceof PinStorageImpl$setBiometricSuggestScreenCount$1) {
            pinStorageImpl$setBiometricSuggestScreenCount$1 = (PinStorageImpl$setBiometricSuggestScreenCount$1) continuationImpl;
            int i3 = pinStorageImpl$setBiometricSuggestScreenCount$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pinStorageImpl$setBiometricSuggestScreenCount$1.label = i3 - Integer.MIN_VALUE;
                Object obj = pinStorageImpl$setBiometricSuggestScreenCount$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = pinStorageImpl$setBiometricSuggestScreenCount$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    pinStorageImpl$setBiometricSuggestScreenCount$1.I$0 = i;
                    pinStorageImpl$setBiometricSuggestScreenCount$1.label = 1;
                    e = e(pinStorageImpl$setBiometricSuggestScreenCount$1);
                    if (e == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = pinStorageImpl$setBiometricSuggestScreenCount$1.I$0;
                    kotlin.b.b(obj);
                    e = ((Result) obj).getValue();
                }
                v0c0Var = (v0c0) (e instanceof Result.Failure ? null : e);
                zy11 zy11Var = zy11.a;
                if (v0c0Var != null && (c = v0c0Var.c()) != null) {
                    SharedPreferences.Editor edit = this.f.edit();
                    edit.putInt(String.format("biometric_pin_suggest_screen_count:%s", Arrays.copyOf(new Object[]{c}, 1)), i);
                    edit.apply();
                }
                return zy11Var;
            }
        }
        pinStorageImpl$setBiometricSuggestScreenCount$1 = new PinStorageImpl$setBiometricSuggestScreenCount$1(this, continuationImpl);
        Object obj3 = pinStorageImpl$setBiometricSuggestScreenCount$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = pinStorageImpl$setBiometricSuggestScreenCount$1.label;
        if (i2 != 0) {
        }
        v0c0Var = (v0c0) (e instanceof Result.Failure ? null : e);
        zy11 zy11Var2 = zy11.a;
        if (v0c0Var != null) {
            SharedPreferences.Editor edit2 = this.f.edit();
            edit2.putInt(String.format("biometric_pin_suggest_screen_count:%s", Arrays.copyOf(new Object[]{c}, 1)), i);
            edit2.apply();
        }
        return zy11Var2;
    }

    public final void B(boolean z) {
        SharedPreferences sharedPreferences = this.g;
        boolean z2 = sharedPreferences.getBoolean("has_biometric_pin", false);
        if (z2 != z) {
            e5z0 e5z0Var = i5z0.a;
            e5z0Var.m("has_pin_cache");
            e5z0Var.a("hasBiometricPin cache changed " + z2 + " -> " + z, new Object[0]);
        }
        oo31.n(sharedPreferences, "has_biometric_pin", z);
    }

    public final void C(boolean z) {
        SharedPreferences sharedPreferences = this.g;
        boolean z2 = sharedPreferences.getBoolean("has_pin", false);
        if (z2 != z) {
            e5z0 e5z0Var = i5z0.a;
            e5z0Var.m("has_pin_cache");
            e5z0Var.a("hasPin cache changed " + z2 + " -> " + z, new Object[0]);
        }
        oo31.n(sharedPreferences, "has_pin", z);
    }

    public final void D(boolean z) {
        SharedPreferences.Editor edit = this.f.edit();
        edit.putBoolean(String.format("pin_already_been_set:%s", Arrays.copyOf(new Object[]{g()}, 1)), z);
        edit.apply();
    }

    public final void E(boolean z) {
        em3 em3Var = ((AppAnalyticsReporter) this.d.a).S;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("newValue", Boolean.valueOf(z));
        em3Var.a.a("pin_state.should_ask_for_pin.changed", linkedHashMap);
        SharedPreferences.Editor edit = this.f.edit();
        edit.putBoolean(String.format("should_ask_for_pin:%s", Arrays.copyOf(new Object[]{g()}, 1)), z);
        edit.apply();
    }

    public final String F(PinTokenAmModel pinTokenAmModel) {
        PinTokenAmModel copy$default;
        Object failure;
        if (pinTokenAmModel == null || (copy$default = PinTokenAmModel.copy$default(pinTokenAmModel, gvu0.B0(2, pinTokenAmModel.getToken()), null, null, 6, null)) == null) {
            return "null";
        }
        try {
            failure = _MoshiKotlinExtensionsKt.adapter(this.c, qoi0.e(PinTokenAmModel.class)).toJson(copy$default);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        String str = (String) failure;
        return str == null ? "null" : str;
    }

    public final String G(Map map) {
        LinkedHashMap linkedHashMap;
        String json2;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                List<PinTokenAmModel> list = (List) entry.getValue();
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (PinTokenAmModel pinTokenAmModel : list) {
                    arrayList.add(PinTokenAmModel.copy$default(pinTokenAmModel, gvu0.B0(2, pinTokenAmModel.getToken()), null, null, 6, null));
                }
                linkedHashMap.put(key, arrayList);
            }
        } else {
            linkedHashMap = null;
        }
        return (linkedHashMap == null || (json2 = f().toJson(linkedHashMap)) == null) ? "null" : json2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PinStorageImpl$canRepeatEnteringCodeAfterError$1 pinStorageImpl$canRepeatEnteringCodeAfterError$1;
        int i;
        PinTokenAmModel pinTokenAmModel;
        if (continuationImpl instanceof PinStorageImpl$canRepeatEnteringCodeAfterError$1) {
            pinStorageImpl$canRepeatEnteringCodeAfterError$1 = (PinStorageImpl$canRepeatEnteringCodeAfterError$1) continuationImpl;
            int i2 = pinStorageImpl$canRepeatEnteringCodeAfterError$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinStorageImpl$canRepeatEnteringCodeAfterError$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinStorageImpl$canRepeatEnteringCodeAfterError$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinStorageImpl$canRepeatEnteringCodeAfterError$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!((PinBackupConfig) ((com.ybsdk.rconfig.b) this.e.a).d(vub0.a).getData()).getResetPinAfterFirstWrongEntering()) {
                        return Boolean.TRUE;
                    }
                    PinTokenAmModel p = p();
                    pinStorageImpl$canRepeatEnteringCodeAfterError$1.L$0 = p;
                    pinStorageImpl$canRepeatEnteringCodeAfterError$1.label = 1;
                    Serializable r = r(pinStorageImpl$canRepeatEnteringCodeAfterError$1);
                    if (r == serializable) {
                        return serializable;
                    }
                    obj = r;
                    pinTokenAmModel = p;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pinTokenAmModel = (PinTokenAmModel) pinStorageImpl$canRepeatEnteringCodeAfterError$1.L$0;
                    kotlin.b.b(obj);
                }
                Pair pair = (Pair) obj;
                return Boolean.valueOf(!(pinTokenAmModel == null && ((v0c0) pair.getFirst()) == null && o((PinStorageImpl$GetPinErrorReason) pair.getSecond())));
            }
        }
        pinStorageImpl$canRepeatEnteringCodeAfterError$1 = new PinStorageImpl$canRepeatEnteringCodeAfterError$1(this, continuationImpl);
        Object obj2 = pinStorageImpl$canRepeatEnteringCodeAfterError$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$canRepeatEnteringCodeAfterError$1.label;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj2;
        return Boolean.valueOf(!(pinTokenAmModel == null && ((v0c0) pair2.getFirst()) == null && o((PinStorageImpl$GetPinErrorReason) pair2.getSecond())));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PinStorageImpl$getBiometricPin$1 pinStorageImpl$getBiometricPin$1;
        int i;
        Object e;
        v0c0 v0c0Var;
        String c;
        String string;
        String string2;
        SharedPreferences sharedPreferences = this.f;
        try {
            if (continuationImpl instanceof PinStorageImpl$getBiometricPin$1) {
                pinStorageImpl$getBiometricPin$1 = (PinStorageImpl$getBiometricPin$1) continuationImpl;
                int i2 = pinStorageImpl$getBiometricPin$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pinStorageImpl$getBiometricPin$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = pinStorageImpl$getBiometricPin$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pinStorageImpl$getBiometricPin$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        pinStorageImpl$getBiometricPin$1.label = 1;
                        e = e(pinStorageImpl$getBiometricPin$1);
                        if (e == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        e = ((Result) obj).getValue();
                    }
                    if (e instanceof Result.Failure) {
                        e = null;
                    }
                    v0c0Var = (v0c0) e;
                    if (v0c0Var != null && (c = v0c0Var.c()) != null && (string = sharedPreferences.getString(String.format("biometric_pin_value:%s", Arrays.copyOf(new Object[]{c}, 1)), null)) != null && (string2 = sharedPreferences.getString(String.format("biometric_pin_iv:%s", Arrays.copyOf(new Object[]{c}, 1)), null)) != null) {
                        return new tzn(m7a1.b(string), m7a1.b(string2));
                    }
                    return null;
                }
            }
            if (i != 0) {
            }
            if (e instanceof Result.Failure) {
            }
            v0c0Var = (v0c0) e;
            if (v0c0Var != null) {
                return new tzn(m7a1.b(string), m7a1.b(string2));
            }
            return null;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        pinStorageImpl$getBiometricPin$1 = new PinStorageImpl$getBiometricPin$1(this, continuationImpl);
        Object obj3 = pinStorageImpl$getBiometricPin$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$getBiometricPin$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        PinStorageImpl$getBiometricSuggestScreenCount$1 pinStorageImpl$getBiometricSuggestScreenCount$1;
        int i;
        Object e;
        v0c0 v0c0Var;
        String c;
        if (continuationImpl instanceof PinStorageImpl$getBiometricSuggestScreenCount$1) {
            pinStorageImpl$getBiometricSuggestScreenCount$1 = (PinStorageImpl$getBiometricSuggestScreenCount$1) continuationImpl;
            int i2 = pinStorageImpl$getBiometricSuggestScreenCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinStorageImpl$getBiometricSuggestScreenCount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinStorageImpl$getBiometricSuggestScreenCount$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinStorageImpl$getBiometricSuggestScreenCount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinStorageImpl$getBiometricSuggestScreenCount$1.label = 1;
                    e = e(pinStorageImpl$getBiometricSuggestScreenCount$1);
                    if (e == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    e = ((Result) obj).getValue();
                }
                if (e instanceof Result.Failure) {
                    e = null;
                }
                v0c0Var = (v0c0) e;
                if (v0c0Var != null || (c = v0c0Var.c()) == null) {
                    return null;
                }
                return new Integer(this.f.getInt(String.format("biometric_pin_suggest_screen_count:%s", Arrays.copyOf(new Object[]{c}, 1)), 0));
            }
        }
        pinStorageImpl$getBiometricSuggestScreenCount$1 = new PinStorageImpl$getBiometricSuggestScreenCount$1(this, continuationImpl);
        Object obj3 = pinStorageImpl$getBiometricSuggestScreenCount$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$getBiometricSuggestScreenCount$1.label;
        if (i != 0) {
        }
        if (e instanceof Result.Failure) {
        }
        v0c0Var = (v0c0) e;
        if (v0c0Var != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        PinStorageImpl$getDeviceId$1 pinStorageImpl$getDeviceId$1;
        int i;
        if (continuationImpl instanceof PinStorageImpl$getDeviceId$1) {
            pinStorageImpl$getDeviceId$1 = (PinStorageImpl$getDeviceId$1) continuationImpl;
            int i2 = pinStorageImpl$getDeviceId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinStorageImpl$getDeviceId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinStorageImpl$getDeviceId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinStorageImpl$getDeviceId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinStorageImpl$getDeviceId$1.label = 1;
                    obj = ((DeviceIdProvider) this.b.a).d(pinStorageImpl$getDeviceId$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                String str = (String) obj;
                return str != null ? "" : str;
            }
        }
        pinStorageImpl$getDeviceId$1 = new PinStorageImpl$getDeviceId$1(this, continuationImpl);
        Object obj2 = pinStorageImpl$getDeviceId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$getDeviceId$1.label;
        if (i != 0) {
        }
        String str2 = (String) obj2;
        if (str2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        PinStorageImpl$getEncryptedPinToken$1 pinStorageImpl$getEncryptedPinToken$1;
        int i;
        Object s;
        if (continuationImpl instanceof PinStorageImpl$getEncryptedPinToken$1) {
            pinStorageImpl$getEncryptedPinToken$1 = (PinStorageImpl$getEncryptedPinToken$1) continuationImpl;
            int i2 = pinStorageImpl$getEncryptedPinToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinStorageImpl$getEncryptedPinToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinStorageImpl$getEncryptedPinToken$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinStorageImpl$getEncryptedPinToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinStorageImpl$getEncryptedPinToken$1.label = 1;
                    s = s(pinStorageImpl$getEncryptedPinToken$1);
                    if (s == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    s = ((Result) obj).getValue();
                }
                return s instanceof Result.Failure ? (v0c0) ((Pair) s).c() : s;
            }
        }
        pinStorageImpl$getEncryptedPinToken$1 = new PinStorageImpl$getEncryptedPinToken$1(this, continuationImpl);
        Object obj3 = pinStorageImpl$getEncryptedPinToken$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$getEncryptedPinToken$1.label;
        if (i != 0) {
        }
        if (s instanceof Result.Failure) {
        }
    }

    public final JsonAdapter f() {
        int i = ogx.c;
        ogx e = acb1.e(qoi0.e(String.class));
        ogx e2 = acb1.e(qoi0.d(acb1.e(qoi0.e(PinTokenAmModel.class))));
        uoi0 uoi0Var = qoi0.a;
        g0c a = qoi0.a(Map.class);
        List asList = Arrays.asList(e, e2);
        uoi0Var.getClass();
        return _MoshiKotlinExtensionsKt.adapter(this.c, new an11(a, asList, false));
    }

    public final String g() {
        Long b = this.a.b();
        if (b != null) {
            return b.toString();
        }
        return null;
    }

    public final boolean h() {
        return this.f.getBoolean(String.format("should_ask_for_pin:%s", Arrays.copyOf(new Object[]{g()}, 1)), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable i(ContinuationImpl continuationImpl) {
        PinStorageImpl$getStashedDeviceIds$1 pinStorageImpl$getStashedDeviceIds$1;
        int i;
        a aVar;
        List list;
        if (continuationImpl instanceof PinStorageImpl$getStashedDeviceIds$1) {
            pinStorageImpl$getStashedDeviceIds$1 = (PinStorageImpl$getStashedDeviceIds$1) continuationImpl;
            int i2 = pinStorageImpl$getStashedDeviceIds$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinStorageImpl$getStashedDeviceIds$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinStorageImpl$getStashedDeviceIds$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinStorageImpl$getStashedDeviceIds$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinStorageImpl$getStashedDeviceIds$1.label = 1;
                    obj = j(pinStorageImpl$getStashedDeviceIds$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                aVar = (a) obj;
                if (aVar.a() == null || (list = (List) aVar.b().get("encrypted_token_v3")) == null) {
                    return null;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PinTokenAmModel) it.next()).getDeviceId());
                }
                return arrayList;
            }
        }
        pinStorageImpl$getStashedDeviceIds$1 = new PinStorageImpl$getStashedDeviceIds$1(this, continuationImpl);
        Object obj2 = pinStorageImpl$getStashedDeviceIds$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$getStashedDeviceIds$1.label;
        if (i != 0) {
        }
        aVar = (a) obj2;
        if (aVar.a() == null) {
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:52|53))(2:54|(2:56|57)(2:58|(1:60)))|11|12|(4:14|(1:16)|17|18)(4:20|(1:22)|23|(3:(1:50)(1:47)|48|49)(6:27|28|29|(1:31)|32|(4:34|(1:36)|37|38)(2:39|40)))))|65|6|7|(0)(0)|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0110, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0111, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0030, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0071, code lost:
    
        r9 = new kotlin.Result.Failure(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        PinStorageImpl$getTokensData$1 pinStorageImpl$getTokensData$1;
        int i;
        Throwable a;
        Object failure;
        Object a2;
        if (continuationImpl instanceof PinStorageImpl$getTokensData$1) {
            pinStorageImpl$getTokensData$1 = (PinStorageImpl$getTokensData$1) continuationImpl;
            int i2 = pinStorageImpl$getTokensData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinStorageImpl$getTokensData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinStorageImpl$getTokensData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinStorageImpl$getTokensData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = this.a;
                    Long b = gVar.b();
                    if (b == null) {
                        trp0.e(new rqp0(new IllegalStateException("Uid is missing"), "GET"));
                        return new a(kotlin.collections.b.f(), PinStorageImpl$GetPinErrorReason.NO_UID);
                    }
                    long longValue = b.longValue();
                    pinStorageImpl$getTokensData$1.label = 1;
                    a2 = gVar.a(longValue, pinStorageImpl$getTokensData$1);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a2 = ((Result) obj).getValue();
                }
                kotlin.b.b(a2);
                Object failure2 = (String) a2;
                a = Result.a(failure2);
                if (a == null) {
                    if (!(a instanceof NullPointerException)) {
                        trp0.e(new rqp0(a, "GET"));
                    }
                    return new a(kotlin.collections.b.f(), PinStorageImpl$GetPinErrorReason.GET_ACCOUNT_ERROR);
                }
                if (failure2 instanceof Result.Failure) {
                    failure2 = null;
                }
                String str = (String) failure2;
                va90 va90Var = this.d;
                if (str == null || str.length() == 0) {
                    va90Var.j((str == null || str.length() != 0) ? "null" : "empty");
                    return new a(kotlin.collections.b.f(), PinStorageImpl$GetPinErrorReason.DATA_NULL_OR_EMPTY);
                }
                try {
                    failure = (Map) f().fromJson(str);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a3 = Result.a(failure);
                if (a3 != null) {
                    trp0.e(new rqp0(a3, "GET"));
                }
                if (Result.a(failure) != null) {
                    va90Var.j("deserialization error");
                    return new a(kotlin.collections.b.f(), PinStorageImpl$GetPinErrorReason.DESERIALIZATION);
                }
                Map map = (Map) failure;
                va90Var.j(G(map));
                if (map == null) {
                    map = kotlin.collections.b.f();
                }
                return new a(map, null);
            }
        }
        pinStorageImpl$getTokensData$1 = new PinStorageImpl$getTokensData$1(this, continuationImpl);
        Object obj2 = pinStorageImpl$getTokensData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$getTokensData$1.label;
        if (i != 0) {
        }
        kotlin.b.b(a2);
        Object failure22 = (String) a2;
        a = Result.a(failure22);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ContinuationImpl continuationImpl) {
        PinStorageImpl$hasBiometricPin$1 pinStorageImpl$hasBiometricPin$1;
        int i;
        Object b;
        if (continuationImpl instanceof PinStorageImpl$hasBiometricPin$1) {
            pinStorageImpl$hasBiometricPin$1 = (PinStorageImpl$hasBiometricPin$1) continuationImpl;
            int i2 = pinStorageImpl$hasBiometricPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinStorageImpl$hasBiometricPin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinStorageImpl$hasBiometricPin$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinStorageImpl$hasBiometricPin$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Boolean hasPinCacheEnabled = ((PinBackupConfig) ((com.ybsdk.rconfig.b) this.e.a).d(vub0.a).getData()).getHasPinCacheEnabled();
                    boolean z = (hasPinCacheEnabled != null ? hasPinCacheEnabled.booleanValue() : false) && this.g.getBoolean("has_biometric_pin", false);
                    if (z) {
                        e5z0 e5z0Var = i5z0.a;
                        e5z0Var.m("has_pin_cache");
                        e5z0Var.a("Using hasBiometricPin cached value", new Object[0]);
                    }
                    if (z) {
                        return Boolean.TRUE;
                    }
                    pinStorageImpl$hasBiometricPin$1.label = 1;
                    b = b(pinStorageImpl$hasBiometricPin$1);
                    if (b == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                boolean z2 = (b instanceof Result.Failure ? null : b) != null;
                Boolean valueOf = Boolean.valueOf(z2);
                B(z2);
                return valueOf;
            }
        }
        pinStorageImpl$hasBiometricPin$1 = new PinStorageImpl$hasBiometricPin$1(this, continuationImpl);
        Object obj3 = pinStorageImpl$hasBiometricPin$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$hasBiometricPin$1.label;
        if (i != 0) {
        }
        if ((b instanceof Result.Failure ? null : b) != null) {
        }
        Boolean valueOf2 = Boolean.valueOf(z2);
        B(z2);
        return valueOf2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(ContinuationImpl continuationImpl) {
        PinStorageImpl$hasPinCode$1 pinStorageImpl$hasPinCode$1;
        int i;
        Object s;
        PinStorageImpl$GetPinErrorReason pinStorageImpl$GetPinErrorReason;
        boolean z;
        String code;
        v0c0 v0c0Var;
        if (continuationImpl instanceof PinStorageImpl$hasPinCode$1) {
            pinStorageImpl$hasPinCode$1 = (PinStorageImpl$hasPinCode$1) continuationImpl;
            int i2 = pinStorageImpl$hasPinCode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinStorageImpl$hasPinCode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinStorageImpl$hasPinCode$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinStorageImpl$hasPinCode$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Boolean hasPinCacheEnabled = ((PinBackupConfig) ((com.ybsdk.rconfig.b) this.e.a).d(vub0.a).getData()).getHasPinCacheEnabled();
                    boolean z2 = (hasPinCacheEnabled != null ? hasPinCacheEnabled.booleanValue() : false) && this.g.getBoolean("has_pin", false);
                    if (z2) {
                        e5z0 e5z0Var = i5z0.a;
                        e5z0Var.m("has_pin_cache");
                        e5z0Var.a("Using hasPin cached value", new Object[0]);
                    }
                    if (z2) {
                        return Boolean.TRUE;
                    }
                    pinStorageImpl$hasPinCode$1.label = 1;
                    s = s(pinStorageImpl$hasPinCode$1);
                    if (s == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    s = ((Result) obj).getValue();
                }
                if (s instanceof Result.Failure) {
                    s = null;
                }
                Pair pair = (Pair) s;
                String b = (pair != null || (v0c0Var = (v0c0) pair.c()) == null) ? null : v0c0Var.b();
                pinStorageImpl$GetPinErrorReason = pair == null ? (PinStorageImpl$GetPinErrorReason) pair.f() : null;
                z = b != null || evu0.J(b);
                if (this.f.getBoolean(String.format("pin_already_been_set:%s", Arrays.copyOf(new Object[]{g()}, 1)), false) && z) {
                    code = pinStorageImpl$GetPinErrorReason == null ? pinStorageImpl$GetPinErrorReason.getCode() : null;
                    em3 em3Var = ((AppAnalyticsReporter) this.d.a).S;
                    em3Var.a.a("pin_code.user_pin_code_wiped_out", null);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                    if (code != null) {
                        linkedHashMap.put("error_data", code);
                    }
                    em3Var.a.a("pin_code.user_pin_code_wiped_out_2", linkedHashMap);
                    D(false);
                    C(false);
                }
                if (!z) {
                    D(true);
                    C(true);
                }
                return Boolean.valueOf(!z);
            }
        }
        pinStorageImpl$hasPinCode$1 = new PinStorageImpl$hasPinCode$1(this, continuationImpl);
        Object obj3 = pinStorageImpl$hasPinCode$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$hasPinCode$1.label;
        if (i != 0) {
        }
        if (s instanceof Result.Failure) {
        }
        Pair pair2 = (Pair) s;
        if (pair2 != null) {
        }
        if (pair2 == null) {
        }
        if (b != null) {
        }
        if (this.f.getBoolean(String.format("pin_already_been_set:%s", Arrays.copyOf(new Object[]{g()}, 1)), false)) {
            if (pinStorageImpl$GetPinErrorReason == null) {
            }
            em3 em3Var2 = ((AppAnalyticsReporter) this.d.a).S;
            em3Var2.a.a("pin_code.user_pin_code_wiped_out", null);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
            if (code != null) {
            }
            em3Var2.a.a("pin_code.user_pin_code_wiped_out_2", linkedHashMap2);
            D(false);
            C(false);
        }
        if (!z) {
        }
        return Boolean.valueOf(!z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(ContinuationImpl continuationImpl) {
        PinStorageImpl$incrementBiometricSuggestScreenCount$1 pinStorageImpl$incrementBiometricSuggestScreenCount$1;
        Object obj;
        int i;
        Object e;
        v0c0 v0c0Var;
        String c;
        Object c2;
        String str;
        Integer num;
        if (continuationImpl instanceof PinStorageImpl$incrementBiometricSuggestScreenCount$1) {
            pinStorageImpl$incrementBiometricSuggestScreenCount$1 = (PinStorageImpl$incrementBiometricSuggestScreenCount$1) continuationImpl;
            int i2 = pinStorageImpl$incrementBiometricSuggestScreenCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinStorageImpl$incrementBiometricSuggestScreenCount$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = pinStorageImpl$incrementBiometricSuggestScreenCount$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinStorageImpl$incrementBiometricSuggestScreenCount$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pinStorageImpl$incrementBiometricSuggestScreenCount$1.label = 1;
                    e = e(pinStorageImpl$incrementBiometricSuggestScreenCount$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) pinStorageImpl$incrementBiometricSuggestScreenCount$1.L$0;
                        kotlin.b.b(obj2);
                        num = (Integer) obj2;
                        if (num != null) {
                            int intValue = num.intValue();
                            SharedPreferences.Editor edit = this.f.edit();
                            edit.putInt(String.format("biometric_pin_suggest_screen_count:%s", Arrays.copyOf(new Object[]{str}, 1)), intValue + 1);
                            edit.apply();
                        }
                        return zy11Var;
                    }
                    kotlin.b.b(obj2);
                    e = ((Result) obj2).getValue();
                }
                v0c0Var = (v0c0) (e instanceof Result.Failure ? null : e);
                if (v0c0Var != null && (c = v0c0Var.c()) != null) {
                    pinStorageImpl$incrementBiometricSuggestScreenCount$1.L$0 = c;
                    pinStorageImpl$incrementBiometricSuggestScreenCount$1.label = 2;
                    c2 = c(pinStorageImpl$incrementBiometricSuggestScreenCount$1);
                    if (c2 != obj) {
                        str = c;
                        obj2 = c2;
                        num = (Integer) obj2;
                        if (num != null) {
                        }
                    }
                    return obj;
                }
                return zy11Var;
            }
        }
        pinStorageImpl$incrementBiometricSuggestScreenCount$1 = new PinStorageImpl$incrementBiometricSuggestScreenCount$1(this, continuationImpl);
        Object obj22 = pinStorageImpl$incrementBiometricSuggestScreenCount$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$incrementBiometricSuggestScreenCount$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        v0c0Var = (v0c0) (e instanceof Result.Failure ? null : e);
        if (v0c0Var != null) {
            pinStorageImpl$incrementBiometricSuggestScreenCount$1.L$0 = c;
            pinStorageImpl$incrementBiometricSuggestScreenCount$1.label = 2;
            c2 = c(pinStorageImpl$incrementBiometricSuggestScreenCount$1);
            if (c2 != obj) {
            }
            return obj;
        }
        return zy11Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
    
        if (r12 == r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(ContinuationImpl continuationImpl) {
        PinStorageImpl$onSuccessfulPinCheck$1 pinStorageImpl$onSuccessfulPinCheck$1;
        int i;
        PinTokenAmModel p;
        v0c0 v0c0Var;
        AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) this.d.a;
        if (continuationImpl instanceof PinStorageImpl$onSuccessfulPinCheck$1) {
            pinStorageImpl$onSuccessfulPinCheck$1 = (PinStorageImpl$onSuccessfulPinCheck$1) continuationImpl;
            int i2 = pinStorageImpl$onSuccessfulPinCheck$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinStorageImpl$onSuccessfulPinCheck$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinStorageImpl$onSuccessfulPinCheck$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinStorageImpl$onSuccessfulPinCheck$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p = p();
                    pinStorageImpl$onSuccessfulPinCheck$1.L$0 = p;
                    pinStorageImpl$onSuccessfulPinCheck$1.label = 1;
                    obj = r(pinStorageImpl$onSuccessfulPinCheck$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        return zy11Var;
                    }
                    p = (PinTokenAmModel) pinStorageImpl$onSuccessfulPinCheck$1.L$0;
                    kotlin.b.b(obj);
                }
                Pair pair = (Pair) obj;
                v0c0Var = (v0c0) pair.getFirst();
                PinStorageImpl$GetPinErrorReason pinStorageImpl$GetPinErrorReason = (PinStorageImpl$GetPinErrorReason) pair.getSecond();
                if (((PinBackupConfig) ((com.ybsdk.rconfig.b) this.e.a).d(vub0.a).getData()).isEnabled() || p == null) {
                    if (v0c0Var != null) {
                        if (!jl40.l(p != null ? sm91.g(p) : null, v0c0Var)) {
                            PinTokenAmModel pinTokenAmModel = new PinTokenAmModel(v0c0Var.b(), v0c0Var.a(), v0c0Var.c());
                            String F = F(pinTokenAmModel);
                            appAnalyticsReporter.S.a.a("pin_code.save_backup_after_successful_check_2", g8e.w(1, Constants.KEY_DATA, F));
                            x(pinTokenAmModel);
                        }
                    }
                } else if (v0c0Var == null && o(pinStorageImpl$GetPinErrorReason)) {
                    String F2 = F(p);
                    appAnalyticsReporter.S.a.a("pin_code.recover_from_backup_2", g8e.w(1, Constants.KEY_DATA, F2));
                    tls h0c0Var = new h0c0(p, 0);
                    pinStorageImpl$onSuccessfulPinCheck$1.L$0 = null;
                    pinStorageImpl$onSuccessfulPinCheck$1.label = 2;
                    if (v(h0c0Var, pinStorageImpl$onSuccessfulPinCheck$1) == obj2) {
                        return obj2;
                    }
                }
                return zy11Var;
            }
        }
        pinStorageImpl$onSuccessfulPinCheck$1 = new PinStorageImpl$onSuccessfulPinCheck$1(this, continuationImpl);
        Object obj3 = pinStorageImpl$onSuccessfulPinCheck$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$onSuccessfulPinCheck$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj3;
        v0c0Var = (v0c0) pair2.getFirst();
        PinStorageImpl$GetPinErrorReason pinStorageImpl$GetPinErrorReason2 = (PinStorageImpl$GetPinErrorReason) pair2.getSecond();
        if (((PinBackupConfig) ((com.ybsdk.rconfig.b) this.e.a).d(vub0.a).getData()).isEnabled()) {
        }
        if (v0c0Var != null) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.Result$Failure] */
    public final PinTokenAmModel p() {
        PinTokenAmModel failure;
        String string = this.f.getString(String.format("pin_backup_v1:%s", Arrays.copyOf(new Object[]{g()}, 1)), null);
        if (string != null) {
            try {
                failure = (PinTokenAmModel) _MoshiKotlinExtensionsKt.adapter(this.c, qoi0.e(PinTokenAmModel.class)).fromJson(string);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            r3 = failure instanceof Result.Failure ? null : failure;
        }
        ((AppAnalyticsReporter) this.d.a).S.a.a("pin_code.read_backup_2", g8e.w(1, Constants.KEY_DATA, r3 != null ? F(r3) : string == null ? "null" : "deserialization error"));
        return r3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008f, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078 A[Catch: all -> 0x00ae, CancellationException -> 0x00b5, TryCatch #2 {CancellationException -> 0x00b5, all -> 0x00ae, blocks: (B:12:0x0031, B:13:0x0092, B:15:0x0072, B:17:0x0078, B:22:0x009a, B:24:0x009e, B:26:0x00a6, B:27:0x00a8, B:33:0x003b, B:34:0x004b, B:36:0x0053, B:38:0x005d, B:40:0x006b, B:42:0x0042), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[Catch: all -> 0x00ae, CancellationException -> 0x00b5, TryCatch #2 {CancellationException -> 0x00b5, all -> 0x00ae, blocks: (B:12:0x0031, B:13:0x0092, B:15:0x0072, B:17:0x0078, B:22:0x009a, B:24:0x009e, B:26:0x00a6, B:27:0x00a8, B:33:0x003b, B:34:0x004b, B:36:0x0053, B:38:0x005d, B:40:0x006b, B:42:0x0042), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6 A[Catch: all -> 0x00ae, CancellationException -> 0x00b5, TryCatch #2 {CancellationException -> 0x00b5, all -> 0x00ae, blocks: (B:12:0x0031, B:13:0x0092, B:15:0x0072, B:17:0x0078, B:22:0x009a, B:24:0x009e, B:26:0x00a6, B:27:0x00a8, B:33:0x003b, B:34:0x004b, B:36:0x0053, B:38:0x005d, B:40:0x006b, B:42:0x0042), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053 A[Catch: all -> 0x00ae, CancellationException -> 0x00b5, TryCatch #2 {CancellationException -> 0x00b5, all -> 0x00ae, blocks: (B:12:0x0031, B:13:0x0092, B:15:0x0072, B:17:0x0078, B:22:0x009a, B:24:0x009e, B:26:0x00a6, B:27:0x00a8, B:33:0x003b, B:34:0x004b, B:36:0x0053, B:38:0x005d, B:40:0x006b, B:42:0x0042), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d A[Catch: all -> 0x00ae, CancellationException -> 0x00b5, TryCatch #2 {CancellationException -> 0x00b5, all -> 0x00ae, blocks: (B:12:0x0031, B:13:0x0092, B:15:0x0072, B:17:0x0078, B:22:0x009a, B:24:0x009e, B:26:0x00a6, B:27:0x00a8, B:33:0x003b, B:34:0x004b, B:36:0x0053, B:38:0x005d, B:40:0x006b, B:42:0x0042), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008f -> B:13:0x0092). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable q(ContinuationImpl continuationImpl) {
        PinStorageImpl$readPinTokenForDeviceIdFromStash$1 pinStorageImpl$readPinTokenForDeviceIdFromStash$1;
        int i;
        a aVar;
        Iterator it;
        v0c0 v0c0Var;
        PinTokenAmModel pinTokenAmModel;
        try {
            if (continuationImpl instanceof PinStorageImpl$readPinTokenForDeviceIdFromStash$1) {
                pinStorageImpl$readPinTokenForDeviceIdFromStash$1 = (PinStorageImpl$readPinTokenForDeviceIdFromStash$1) continuationImpl;
                int i2 = pinStorageImpl$readPinTokenForDeviceIdFromStash$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pinStorageImpl$readPinTokenForDeviceIdFromStash$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = pinStorageImpl$readPinTokenForDeviceIdFromStash$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pinStorageImpl$readPinTokenForDeviceIdFromStash$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        pinStorageImpl$readPinTokenForDeviceIdFromStash$1.label = 1;
                        obj = j(pinStorageImpl$readPinTokenForDeviceIdFromStash$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (i == 1) {
                        kotlin.b.b(obj);
                    } else {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String deviceId = (String) pinStorageImpl$readPinTokenForDeviceIdFromStash$1.L$2;
                        Object obj2 = pinStorageImpl$readPinTokenForDeviceIdFromStash$1.L$1;
                        it = (Iterator) pinStorageImpl$readPinTokenForDeviceIdFromStash$1.L$0;
                        kotlin.b.b(obj);
                        if (jl40.l(deviceId, obj)) {
                            pinTokenAmModel = (PinTokenAmModel) obj2;
                            if (pinTokenAmModel != null) {
                                v0c0Var = sm91.g(pinTokenAmModel);
                                return new Pair(v0c0Var, v0c0Var == null ? PinStorageImpl$GetPinErrorReason.NOTHING_FOR_DEVICE_ID : null);
                            }
                            v0c0Var = null;
                            return new Pair(v0c0Var, v0c0Var == null ? PinStorageImpl$GetPinErrorReason.NOTHING_FOR_DEVICE_ID : null);
                        }
                        if (it.hasNext()) {
                            obj2 = null;
                            pinTokenAmModel = (PinTokenAmModel) obj2;
                            if (pinTokenAmModel != null) {
                            }
                            v0c0Var = null;
                            return new Pair(v0c0Var, v0c0Var == null ? PinStorageImpl$GetPinErrorReason.NOTHING_FOR_DEVICE_ID : null);
                        }
                        obj2 = it.next();
                        deviceId = ((PinTokenAmModel) obj2).getDeviceId();
                        pinStorageImpl$readPinTokenForDeviceIdFromStash$1.L$0 = it;
                        pinStorageImpl$readPinTokenForDeviceIdFromStash$1.L$1 = obj2;
                        pinStorageImpl$readPinTokenForDeviceIdFromStash$1.L$2 = deviceId;
                        pinStorageImpl$readPinTokenForDeviceIdFromStash$1.label = 2;
                        obj = d(pinStorageImpl$readPinTokenForDeviceIdFromStash$1);
                    }
                    aVar = (a) obj;
                    if (aVar.a() == null) {
                        return new Pair(null, aVar.a());
                    }
                    List list = (List) aVar.b().get("encrypted_token_v3");
                    if (list != null) {
                        it = list.iterator();
                        if (it.hasNext()) {
                        }
                    }
                    v0c0Var = null;
                    return new Pair(v0c0Var, v0c0Var == null ? PinStorageImpl$GetPinErrorReason.NOTHING_FOR_DEVICE_ID : null);
                }
            }
            if (i != 0) {
            }
            aVar = (a) obj;
            if (aVar.a() == null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        pinStorageImpl$readPinTokenForDeviceIdFromStash$1 = new PinStorageImpl$readPinTokenForDeviceIdFromStash$1(this, continuationImpl);
        Object obj3 = pinStorageImpl$readPinTokenForDeviceIdFromStash$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$readPinTokenForDeviceIdFromStash$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable r(ContinuationImpl continuationImpl) {
        PinStorageImpl$readPinTokenForDeviceIdImplOrNull$1 pinStorageImpl$readPinTokenForDeviceIdImplOrNull$1;
        int i;
        Object q;
        boolean z;
        if (continuationImpl instanceof PinStorageImpl$readPinTokenForDeviceIdImplOrNull$1) {
            pinStorageImpl$readPinTokenForDeviceIdImplOrNull$1 = (PinStorageImpl$readPinTokenForDeviceIdImplOrNull$1) continuationImpl;
            int i2 = pinStorageImpl$readPinTokenForDeviceIdImplOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinStorageImpl$readPinTokenForDeviceIdImplOrNull$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinStorageImpl$readPinTokenForDeviceIdImplOrNull$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinStorageImpl$readPinTokenForDeviceIdImplOrNull$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinStorageImpl$readPinTokenForDeviceIdImplOrNull$1.label = 1;
                    q = q(pinStorageImpl$readPinTokenForDeviceIdImplOrNull$1);
                    if (q == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    q = ((Result) obj).getValue();
                }
                z = q instanceof Result.Failure;
                Pair pair = (Pair) (!z ? null : q);
                v0c0 v0c0Var = pair == null ? (v0c0) pair.c() : null;
                if (z) {
                    q = null;
                }
                Pair pair2 = (Pair) q;
                return new Pair(v0c0Var, pair2 != null ? (PinStorageImpl$GetPinErrorReason) pair2.f() : null);
            }
        }
        pinStorageImpl$readPinTokenForDeviceIdImplOrNull$1 = new PinStorageImpl$readPinTokenForDeviceIdImplOrNull$1(this, continuationImpl);
        Object obj2 = pinStorageImpl$readPinTokenForDeviceIdImplOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$readPinTokenForDeviceIdImplOrNull$1.label;
        if (i != 0) {
        }
        z = q instanceof Result.Failure;
        Pair pair3 = (Pair) (!z ? null : q);
        if (pair3 == null) {
        }
        if (z) {
        }
        Pair pair22 = (Pair) q;
        return new Pair(v0c0Var, pair22 != null ? (PinStorageImpl$GetPinErrorReason) pair22.f() : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004f, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(ContinuationImpl continuationImpl) {
        PinStorageImpl$readPinTokenForDeviceIdWithBackup$1 pinStorageImpl$readPinTokenForDeviceIdWithBackup$1;
        int i;
        Object q;
        PinStorageImpl$GetPinErrorReason pinStorageImpl$GetPinErrorReason;
        PinTokenAmModel p;
        Object obj;
        String str;
        if (continuationImpl instanceof PinStorageImpl$readPinTokenForDeviceIdWithBackup$1) {
            pinStorageImpl$readPinTokenForDeviceIdWithBackup$1 = (PinStorageImpl$readPinTokenForDeviceIdWithBackup$1) continuationImpl;
            int i2 = pinStorageImpl$readPinTokenForDeviceIdWithBackup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinStorageImpl$readPinTokenForDeviceIdWithBackup$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = pinStorageImpl$readPinTokenForDeviceIdWithBackup$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinStorageImpl$readPinTokenForDeviceIdWithBackup$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pinStorageImpl$readPinTokenForDeviceIdWithBackup$1.label = 1;
                    q = q(pinStorageImpl$readPinTokenForDeviceIdWithBackup$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) pinStorageImpl$readPinTokenForDeviceIdWithBackup$1.L$2;
                        p = (PinTokenAmModel) pinStorageImpl$readPinTokenForDeviceIdWithBackup$1.L$1;
                        obj = pinStorageImpl$readPinTokenForDeviceIdWithBackup$1.L$0;
                        kotlin.b.b(obj2);
                        if (jl40.l(str, obj2)) {
                            return obj;
                        }
                        ((AppAnalyticsReporter) this.d.a).S.a.a("pin_code.return_data_from_backup_2", g8e.w(1, Constants.KEY_DATA, F(p)));
                        return new Pair(sm91.g(p), null);
                    }
                    kotlin.b.b(obj2);
                    q = ((Result) obj2).getValue();
                }
                if (((PinBackupConfig) ((com.ybsdk.rconfig.b) this.e.a).d(vub0.a).getData()).isEnabled()) {
                    Pair pair = (Pair) (q instanceof Result.Failure ? null : q);
                    if (pair != null && (pinStorageImpl$GetPinErrorReason = (PinStorageImpl$GetPinErrorReason) pair.f()) != null && o(pinStorageImpl$GetPinErrorReason) && (p = p()) != null) {
                        String deviceId = p.getDeviceId();
                        pinStorageImpl$readPinTokenForDeviceIdWithBackup$1.L$0 = q;
                        pinStorageImpl$readPinTokenForDeviceIdWithBackup$1.L$1 = p;
                        pinStorageImpl$readPinTokenForDeviceIdWithBackup$1.L$2 = deviceId;
                        pinStorageImpl$readPinTokenForDeviceIdWithBackup$1.label = 2;
                        Object d = d(pinStorageImpl$readPinTokenForDeviceIdWithBackup$1);
                        if (d != obj3) {
                            obj = q;
                            obj2 = d;
                            str = deviceId;
                            if (jl40.l(str, obj2)) {
                            }
                        }
                        return obj3;
                    }
                }
                return q;
            }
        }
        pinStorageImpl$readPinTokenForDeviceIdWithBackup$1 = new PinStorageImpl$readPinTokenForDeviceIdWithBackup$1(this, continuationImpl);
        Object obj22 = pinStorageImpl$readPinTokenForDeviceIdWithBackup$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$readPinTokenForDeviceIdWithBackup$1.label;
        if (i != 0) {
        }
        if (((PinBackupConfig) ((com.ybsdk.rconfig.b) this.e.a).d(vub0.a).getData()).isEnabled()) {
        }
        return q;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(ContinuationImpl continuationImpl) {
        PinStorageImpl$removeBiometric$1 pinStorageImpl$removeBiometric$1;
        int i;
        Object e;
        v0c0 v0c0Var;
        String c;
        if (continuationImpl instanceof PinStorageImpl$removeBiometric$1) {
            pinStorageImpl$removeBiometric$1 = (PinStorageImpl$removeBiometric$1) continuationImpl;
            int i2 = pinStorageImpl$removeBiometric$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinStorageImpl$removeBiometric$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinStorageImpl$removeBiometric$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinStorageImpl$removeBiometric$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    B(false);
                    pinStorageImpl$removeBiometric$1.label = 1;
                    e = e(pinStorageImpl$removeBiometric$1);
                    if (e == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    e = ((Result) obj).getValue();
                }
                v0c0Var = (v0c0) (e instanceof Result.Failure ? null : e);
                zy11 zy11Var = zy11.a;
                if (v0c0Var != null && (c = v0c0Var.c()) != null) {
                    SharedPreferences.Editor edit = this.f.edit();
                    edit.remove(String.format("biometric_pin_value:%s", Arrays.copyOf(new Object[]{c}, 1)));
                    edit.remove(String.format("biometric_pin_iv:%s", Arrays.copyOf(new Object[]{c}, 1)));
                    edit.apply();
                }
                return zy11Var;
            }
        }
        pinStorageImpl$removeBiometric$1 = new PinStorageImpl$removeBiometric$1(this, continuationImpl);
        Object obj3 = pinStorageImpl$removeBiometric$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$removeBiometric$1.label;
        if (i != 0) {
        }
        v0c0Var = (v0c0) (e instanceof Result.Failure ? null : e);
        zy11 zy11Var2 = zy11.a;
        if (v0c0Var != null) {
            SharedPreferences.Editor edit2 = this.f.edit();
            edit2.remove(String.format("biometric_pin_value:%s", Arrays.copyOf(new Object[]{c}, 1)));
            edit2.remove(String.format("biometric_pin_iv:%s", Arrays.copyOf(new Object[]{c}, 1)));
            edit2.apply();
        }
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(ContinuationImpl continuationImpl) {
        PinStorageImpl$removeOldCode$1 pinStorageImpl$removeOldCode$1;
        int i;
        if (continuationImpl instanceof PinStorageImpl$removeOldCode$1) {
            pinStorageImpl$removeOldCode$1 = (PinStorageImpl$removeOldCode$1) continuationImpl;
            int i2 = pinStorageImpl$removeOldCode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinStorageImpl$removeOldCode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinStorageImpl$removeOldCode$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinStorageImpl$removeOldCode$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinStorageImpl$removeOldCode$1.label = 1;
                    Object v = v(null, pinStorageImpl$removeOldCode$1);
                    return v == obj2 ? obj2 : v;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        pinStorageImpl$removeOldCode$1 = new PinStorageImpl$removeOldCode$1(this, continuationImpl);
        Object obj3 = pinStorageImpl$removeOldCode$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$removeOldCode$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x012c, code lost:
    
        if (r2 == r4) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9 A[Catch: all -> 0x006b, CancellationException -> 0x0169, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0169, blocks: (B:14:0x0036, B:16:0x012f, B:19:0x0136, B:38:0x0066, B:39:0x00e3, B:41:0x00e9, B:43:0x00b8, B:45:0x00be, B:49:0x00ee, B:51:0x00f9, B:52:0x00fc, B:54:0x0105, B:56:0x013c, B:57:0x0143, B:63:0x0073, B:65:0x0091, B:67:0x00a4, B:68:0x00aa, B:74:0x0085), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be A[Catch: all -> 0x00a7, CancellationException -> 0x0169, TRY_LEAVE, TryCatch #1 {all -> 0x00a7, blocks: (B:16:0x012f, B:19:0x0136, B:43:0x00b8, B:45:0x00be, B:49:0x00ee, B:51:0x00f9, B:52:0x00fc, B:54:0x0105, B:56:0x013c, B:57:0x0143, B:65:0x0091, B:67:0x00a4, B:68:0x00aa, B:74:0x0085), top: B:73:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee A[Catch: all -> 0x00a7, CancellationException -> 0x0169, TRY_ENTER, TryCatch #1 {all -> 0x00a7, blocks: (B:16:0x012f, B:19:0x0136, B:43:0x00b8, B:45:0x00be, B:49:0x00ee, B:51:0x00f9, B:52:0x00fc, B:54:0x0105, B:56:0x013c, B:57:0x0143, B:65:0x0091, B:67:0x00a4, B:68:0x00aa, B:74:0x0085), top: B:73:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a4 A[Catch: all -> 0x00a7, CancellationException -> 0x0169, TryCatch #1 {all -> 0x00a7, blocks: (B:16:0x012f, B:19:0x0136, B:43:0x00b8, B:45:0x00be, B:49:0x00ee, B:51:0x00f9, B:52:0x00fc, B:54:0x0105, B:56:0x013c, B:57:0x0143, B:65:0x0091, B:67:0x00a4, B:68:0x00aa, B:74:0x0085), top: B:73:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00de -> B:39:0x00e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(tls tlsVar, ContinuationImpl continuationImpl) {
        PinStorageImpl$removeOldCodeAndModifyList$1 pinStorageImpl$removeOldCodeAndModifyList$1;
        int i;
        tls tlsVar2;
        Object j;
        Iterable iterable;
        Map map;
        Collection arrayList;
        Iterator it;
        Object c;
        Object failure;
        Throwable a;
        g gVar = this.a;
        try {
            if (continuationImpl instanceof PinStorageImpl$removeOldCodeAndModifyList$1) {
                pinStorageImpl$removeOldCodeAndModifyList$1 = (PinStorageImpl$removeOldCodeAndModifyList$1) continuationImpl;
                int i2 = pinStorageImpl$removeOldCodeAndModifyList$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pinStorageImpl$removeOldCodeAndModifyList$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = pinStorageImpl$removeOldCodeAndModifyList$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pinStorageImpl$removeOldCodeAndModifyList$1.label;
                    boolean z = true;
                    if (i == 0) {
                        if (i == 1) {
                            tls tlsVar3 = (tls) pinStorageImpl$removeOldCodeAndModifyList$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                j = obj;
                                tlsVar2 = tlsVar3;
                            } catch (Throwable th) {
                                th = th;
                                tlsVar2 = tlsVar3;
                            }
                        } else {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                tls tlsVar4 = (tls) pinStorageImpl$removeOldCodeAndModifyList$1.L$0;
                                try {
                                    kotlin.b.b(obj);
                                    c = ((Result) obj).getValue();
                                    tlsVar2 = tlsVar4;
                                    kotlin.b.b(c);
                                    if (tlsVar2 == null) {
                                        z = false;
                                    }
                                    D(z);
                                    failure = zy11.a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    tlsVar2 = tlsVar4;
                                }
                                a = Result.a(failure);
                                if (a != null) {
                                    String str = tlsVar2 != null ? " AND MODIFY" : null;
                                    if (str == null) {
                                        str = "";
                                    }
                                    String concat = "SAVE".concat(str);
                                    trp0 trp0Var = trp0.a;
                                    trp0.e(new rqp0(a, concat));
                                }
                                return failure;
                            }
                            String deviceId = (String) pinStorageImpl$removeOldCodeAndModifyList$1.L$5;
                            Object next = pinStorageImpl$removeOldCodeAndModifyList$1.L$4;
                            it = (Iterator) pinStorageImpl$removeOldCodeAndModifyList$1.L$3;
                            arrayList = (Collection) pinStorageImpl$removeOldCodeAndModifyList$1.L$2;
                            map = (Map) pinStorageImpl$removeOldCodeAndModifyList$1.L$1;
                            tls tlsVar5 = (tls) pinStorageImpl$removeOldCodeAndModifyList$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                if (!jl40.l(deviceId, obj)) {
                                    arrayList.add(next);
                                }
                                tlsVar2 = tlsVar5;
                                if (!it.hasNext()) {
                                    next = it.next();
                                    deviceId = ((PinTokenAmModel) next).getDeviceId();
                                    pinStorageImpl$removeOldCodeAndModifyList$1.L$0 = tlsVar2;
                                    pinStorageImpl$removeOldCodeAndModifyList$1.L$1 = map;
                                    pinStorageImpl$removeOldCodeAndModifyList$1.L$2 = arrayList;
                                    pinStorageImpl$removeOldCodeAndModifyList$1.L$3 = it;
                                    pinStorageImpl$removeOldCodeAndModifyList$1.L$4 = next;
                                    pinStorageImpl$removeOldCodeAndModifyList$1.L$5 = deviceId;
                                    pinStorageImpl$removeOldCodeAndModifyList$1.label = 2;
                                    Object d = d(pinStorageImpl$removeOldCodeAndModifyList$1);
                                    if (d != obj2) {
                                        tlsVar5 = tlsVar2;
                                        obj = d;
                                        if (!jl40.l(deviceId, obj)) {
                                        }
                                        tlsVar2 = tlsVar5;
                                        if (!it.hasNext()) {
                                            ArrayList arrayList2 = new ArrayList((List) arrayList);
                                            if (tlsVar2 != null) {
                                                tlsVar2.invoke(arrayList2);
                                            }
                                            map.put("encrypted_token_v3", arrayList2);
                                            Long b = gVar.b();
                                            if (b == null) {
                                                throw new IllegalStateException("Uid is missing");
                                            }
                                            long longValue = b.longValue();
                                            String json2 = f().toJson(map);
                                            this.d.k(G(map));
                                            pinStorageImpl$removeOldCodeAndModifyList$1.L$0 = tlsVar2;
                                            pinStorageImpl$removeOldCodeAndModifyList$1.L$1 = null;
                                            pinStorageImpl$removeOldCodeAndModifyList$1.L$2 = null;
                                            pinStorageImpl$removeOldCodeAndModifyList$1.L$3 = null;
                                            pinStorageImpl$removeOldCodeAndModifyList$1.L$4 = null;
                                            pinStorageImpl$removeOldCodeAndModifyList$1.L$5 = null;
                                            pinStorageImpl$removeOldCodeAndModifyList$1.label = 3;
                                            c = gVar.c(longValue, json2, pinStorageImpl$removeOldCodeAndModifyList$1);
                                        }
                                    }
                                }
                                return obj2;
                            } catch (Throwable th3) {
                                th = th3;
                                tlsVar2 = tlsVar5;
                            }
                        }
                        failure = new Result.Failure(th);
                        a = Result.a(failure);
                        if (a != null) {
                        }
                        return failure;
                    }
                    kotlin.b.b(obj);
                    tlsVar2 = tlsVar;
                    try {
                        pinStorageImpl$removeOldCodeAndModifyList$1.L$0 = tlsVar2;
                        pinStorageImpl$removeOldCodeAndModifyList$1.label = 1;
                        j = j(pinStorageImpl$removeOldCodeAndModifyList$1);
                        if (j == obj2) {
                            return obj2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(((a) j).b());
                    iterable = (List) linkedHashMap.get("encrypted_token_v3");
                    if (iterable == null) {
                        iterable = EmptyList.a;
                    }
                    map = linkedHashMap;
                    arrayList = new ArrayList();
                    it = iterable.iterator();
                    if (!it.hasNext()) {
                    }
                    return obj2;
                }
            }
            if (i == 0) {
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(((a) j).b());
            iterable = (List) linkedHashMap2.get("encrypted_token_v3");
            if (iterable == null) {
            }
            map = linkedHashMap2;
            arrayList = new ArrayList();
            it = iterable.iterator();
            if (!it.hasNext()) {
            }
            return obj2;
        } catch (CancellationException e) {
            throw e;
        }
        pinStorageImpl$removeOldCodeAndModifyList$1 = new PinStorageImpl$removeOldCodeAndModifyList$1(this, continuationImpl);
        Object obj3 = pinStorageImpl$removeOldCodeAndModifyList$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$removeOldCodeAndModifyList$1.label;
        boolean z2 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (t(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(ContinuationImpl continuationImpl) {
        PinStorageImpl$removePin$1 pinStorageImpl$removePin$1;
        int i;
        Object u;
        if (continuationImpl instanceof PinStorageImpl$removePin$1) {
            pinStorageImpl$removePin$1 = (PinStorageImpl$removePin$1) continuationImpl;
            int i2 = pinStorageImpl$removePin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinStorageImpl$removePin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinStorageImpl$removePin$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinStorageImpl$removePin$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    E(false);
                    pinStorageImpl$removePin$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        u = ((Result) obj).getValue();
                        if (!(u instanceof Result.Failure)) {
                            C(false);
                        }
                        x(null);
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                pinStorageImpl$removePin$1.label = 2;
                u = u(pinStorageImpl$removePin$1);
            }
        }
        pinStorageImpl$removePin$1 = new PinStorageImpl$removePin$1(this, continuationImpl);
        Object obj3 = pinStorageImpl$removePin$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$removePin$1.label;
        if (i != 0) {
        }
        pinStorageImpl$removePin$1.label = 2;
        u = u(pinStorageImpl$removePin$1);
    }

    public final void x(PinTokenAmModel pinTokenAmModel) {
        Object failure;
        String str;
        if (pinTokenAmModel != null) {
            try {
                failure = _MoshiKotlinExtensionsKt.adapter(this.c, qoi0.e(PinTokenAmModel.class)).toJson(pinTokenAmModel);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            str = (String) failure;
        } else {
            str = null;
        }
        String F = pinTokenAmModel != null ? F(pinTokenAmModel) : null;
        em3 em3Var = ((AppAnalyticsReporter) this.d.a).S;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (F != null) {
            linkedHashMap.put(Constants.KEY_DATA, F);
        }
        em3Var.a.a("pin_code.save_backup_2", linkedHashMap);
        SharedPreferences.Editor edit = this.f.edit();
        edit.putString(String.format("pin_backup_v1:%s", Arrays.copyOf(new Object[]{g()}, 1)), str);
        edit.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (v(r9, r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(String str, ContinuationImpl continuationImpl) {
        PinStorageImpl$saveEncryptedPinCode$1 pinStorageImpl$saveEncryptedPinCode$1;
        Object obj;
        int i;
        PinTokenAmModel pinTokenAmModel;
        try {
            if (continuationImpl instanceof PinStorageImpl$saveEncryptedPinCode$1) {
                pinStorageImpl$saveEncryptedPinCode$1 = (PinStorageImpl$saveEncryptedPinCode$1) continuationImpl;
                int i2 = pinStorageImpl$saveEncryptedPinCode$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pinStorageImpl$saveEncryptedPinCode$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = pinStorageImpl$saveEncryptedPinCode$1.result;
                    obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pinStorageImpl$saveEncryptedPinCode$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        pinStorageImpl$saveEncryptedPinCode$1.L$0 = str;
                        pinStorageImpl$saveEncryptedPinCode$1.label = 1;
                        obj2 = d(pinStorageImpl$saveEncryptedPinCode$1);
                        if (obj2 == obj) {
                            return obj;
                        }
                    } else if (i == 1) {
                        str = (String) pinStorageImpl$saveEncryptedPinCode$1.L$0;
                        kotlin.b.b(obj2);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            pinTokenAmModel = (PinTokenAmModel) pinStorageImpl$saveEncryptedPinCode$1.L$0;
                            kotlin.b.b(obj2);
                            ((Result) obj2).getClass();
                            x(pinTokenAmModel);
                            return sm91.g(pinTokenAmModel);
                        }
                        pinTokenAmModel = (PinTokenAmModel) pinStorageImpl$saveEncryptedPinCode$1.L$0;
                        kotlin.b.b(obj2);
                        tls h0c0Var = new h0c0(pinTokenAmModel, 1);
                        pinStorageImpl$saveEncryptedPinCode$1.L$0 = pinTokenAmModel;
                        pinStorageImpl$saveEncryptedPinCode$1.label = 3;
                    }
                    PinTokenAmModel pinTokenAmModel2 = new PinTokenAmModel(str, (String) obj2, UUID.randomUUID().toString());
                    pinStorageImpl$saveEncryptedPinCode$1.L$0 = pinTokenAmModel2;
                    pinStorageImpl$saveEncryptedPinCode$1.label = 2;
                    if (t(pinStorageImpl$saveEncryptedPinCode$1) != obj) {
                        return obj;
                    }
                    pinTokenAmModel = pinTokenAmModel2;
                    tls h0c0Var2 = new h0c0(pinTokenAmModel, 1);
                    pinStorageImpl$saveEncryptedPinCode$1.L$0 = pinTokenAmModel;
                    pinStorageImpl$saveEncryptedPinCode$1.label = 3;
                }
            }
            if (i != 0) {
            }
            PinTokenAmModel pinTokenAmModel22 = new PinTokenAmModel(str, (String) obj2, UUID.randomUUID().toString());
            pinStorageImpl$saveEncryptedPinCode$1.L$0 = pinTokenAmModel22;
            pinStorageImpl$saveEncryptedPinCode$1.label = 2;
            if (t(pinStorageImpl$saveEncryptedPinCode$1) != obj) {
            }
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        pinStorageImpl$saveEncryptedPinCode$1 = new PinStorageImpl$saveEncryptedPinCode$1(this, continuationImpl);
        Object obj22 = pinStorageImpl$saveEncryptedPinCode$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$saveEncryptedPinCode$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(tzn tznVar, ContinuationImpl continuationImpl) {
        PinStorageImpl$setBiometricPin$1 pinStorageImpl$setBiometricPin$1;
        int i;
        Object e;
        v0c0 v0c0Var;
        String c;
        if (continuationImpl instanceof PinStorageImpl$setBiometricPin$1) {
            pinStorageImpl$setBiometricPin$1 = (PinStorageImpl$setBiometricPin$1) continuationImpl;
            int i2 = pinStorageImpl$setBiometricPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinStorageImpl$setBiometricPin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinStorageImpl$setBiometricPin$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinStorageImpl$setBiometricPin$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinStorageImpl$setBiometricPin$1.L$0 = tznVar;
                    pinStorageImpl$setBiometricPin$1.label = 1;
                    e = e(pinStorageImpl$setBiometricPin$1);
                    if (e == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tznVar = (tzn) pinStorageImpl$setBiometricPin$1.L$0;
                    kotlin.b.b(obj);
                    e = ((Result) obj).getValue();
                }
                v0c0Var = (v0c0) (e instanceof Result.Failure ? null : e);
                zy11 zy11Var = zy11.a;
                if (v0c0Var != null && (c = v0c0Var.c()) != null) {
                    SharedPreferences.Editor edit = this.f.edit();
                    edit.putString(String.format("biometric_pin_value:%s", Arrays.copyOf(new Object[]{c}, 1)), m7a1.c(tznVar.a()));
                    edit.putString(String.format("biometric_pin_iv:%s", Arrays.copyOf(new Object[]{c}, 1)), m7a1.c(tznVar.b()));
                    edit.apply();
                    B(true);
                }
                return zy11Var;
            }
        }
        pinStorageImpl$setBiometricPin$1 = new PinStorageImpl$setBiometricPin$1(this, continuationImpl);
        Object obj3 = pinStorageImpl$setBiometricPin$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinStorageImpl$setBiometricPin$1.label;
        if (i != 0) {
        }
        v0c0Var = (v0c0) (e instanceof Result.Failure ? null : e);
        zy11 zy11Var2 = zy11.a;
        if (v0c0Var != null) {
            SharedPreferences.Editor edit2 = this.f.edit();
            edit2.putString(String.format("biometric_pin_value:%s", Arrays.copyOf(new Object[]{c}, 1)), m7a1.c(tznVar.a()));
            edit2.putString(String.format("biometric_pin_iv:%s", Arrays.copyOf(new Object[]{c}, 1)), m7a1.c(tznVar.b()));
            edit2.apply();
            B(true);
        }
        return zy11Var2;
    }
}
