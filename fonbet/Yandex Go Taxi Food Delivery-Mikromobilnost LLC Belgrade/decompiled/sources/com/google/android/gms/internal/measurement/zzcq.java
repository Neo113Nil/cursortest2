package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.da91;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzcq extends zzbm implements zzcr {
    public zzcq() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzcr asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof zzcr ? (zzcr) queryLocalInterface : new zzcp(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void beginAdUnitExposure(String str, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void clearMeasurementEnabled(long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void endAdUnitExposure(String str, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void generateEventId(zzcu zzcuVar) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void getAppInstanceId(zzcu zzcuVar) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void getCachedAppInstanceId(zzcu zzcuVar) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void getConditionalUserProperties(String str, String str2, zzcu zzcuVar) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void getCurrentScreenClass(zzcu zzcuVar) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void getCurrentScreenName(zzcu zzcuVar) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void getGmpAppId(zzcu zzcuVar) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void getMaxUserProperties(String str, zzcu zzcuVar) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void getSessionId(zzcu zzcuVar) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void getTestFlag(zzcu zzcuVar, int i) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void getUserProperties(String str, String str2, boolean z, zzcu zzcuVar) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void initForTests(Map map) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void initialize(IObjectWrapper iObjectWrapper, zzdd zzddVar, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void isDataCollectionEnabled(zzcu zzcuVar) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void logEventAndBundle(String str, String str2, Bundle bundle, zzcu zzcuVar, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcu zzcuVar, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zzcu zzcuVar, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void performAction(Bundle bundle, zzcu zzcuVar, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void registerOnMeasurementEventListener(zzda zzdaVar) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void resetAnalyticsData(long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void retrieveAndUploadBatches(zzcx zzcxVar) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void setConsent(Bundle bundle, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void setConsentThirdParty(Bundle bundle, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void setDataCollectionEnabled(boolean z) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void setEventInterceptor(zzda zzdaVar) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void setInstanceIdProvider(zzdc zzdcVar) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void setMinimumSessionDuration(long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void setSessionTimeoutDuration(long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void setSgtmDebugInfo(Intent intent) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void setUserId(String str, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzcr
    public abstract /* synthetic */ void unregisterOnMeasurementEventListener(zzda zzdaVar) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcu zzcuVar = null;
        zzcx zzcxVar = null;
        zzcu zzcuVar2 = null;
        zzcu zzcuVar3 = null;
        zzcu zzcuVar4 = null;
        zzcu zzcuVar5 = null;
        zzda zzdaVar = null;
        zzda zzdaVar2 = null;
        zzda zzdaVar3 = null;
        zzcu zzcuVar6 = null;
        zzcu zzcuVar7 = null;
        zzcu zzcuVar8 = null;
        zzcu zzcuVar9 = null;
        zzcu zzcuVar10 = null;
        zzcu zzcuVar11 = null;
        zzdc zzdcVar = null;
        zzcu zzcuVar12 = null;
        zzcu zzcuVar13 = null;
        zzcu zzcuVar14 = null;
        zzcu zzcuVar15 = null;
        zzcu zzcuVar16 = null;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzdd zzddVar = (zzdd) da91.b(parcel, zzdd.CREATOR);
                long readLong = parcel.readLong();
                da91.f(parcel);
                initialize(asInterface, zzddVar, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) da91.b(parcel, Bundle.CREATOR);
                boolean a = da91.a(parcel);
                boolean a2 = da91.a(parcel);
                long readLong2 = parcel.readLong();
                da91.f(parcel);
                logEvent(readString, readString2, bundle, a, a2, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) da91.b(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar = queryLocalInterface instanceof zzcu ? (zzcu) queryLocalInterface : new zzcs(readStrongBinder);
                }
                long readLong3 = parcel.readLong();
                da91.f(parcel);
                logEventAndBundle(readString3, readString4, bundle2, zzcuVar, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean a3 = da91.a(parcel);
                long readLong4 = parcel.readLong();
                da91.f(parcel);
                setUserProperty(readString5, readString6, asInterface2, a3, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean a4 = da91.a(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar16 = queryLocalInterface2 instanceof zzcu ? (zzcu) queryLocalInterface2 : new zzcs(readStrongBinder2);
                }
                da91.f(parcel);
                getUserProperties(readString7, readString8, a4, zzcuVar16);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar15 = queryLocalInterface3 instanceof zzcu ? (zzcu) queryLocalInterface3 : new zzcs(readStrongBinder3);
                }
                da91.f(parcel);
                getMaxUserProperties(readString9, zzcuVar15);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                da91.f(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) da91.b(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                da91.f(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) da91.b(parcel, Bundle.CREATOR);
                da91.f(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar14 = queryLocalInterface4 instanceof zzcu ? (zzcu) queryLocalInterface4 : new zzcs(readStrongBinder4);
                }
                da91.f(parcel);
                getConditionalUserProperties(readString13, readString14, zzcuVar14);
                break;
            case 11:
                boolean a5 = da91.a(parcel);
                long readLong7 = parcel.readLong();
                da91.f(parcel);
                setMeasurementEnabled(a5, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                da91.f(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                da91.f(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                da91.f(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                da91.f(parcel);
                setCurrentScreen(asInterface3, readString15, readString16, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar13 = queryLocalInterface5 instanceof zzcu ? (zzcu) queryLocalInterface5 : new zzcs(readStrongBinder5);
                }
                da91.f(parcel);
                getCurrentScreenName(zzcuVar13);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar12 = queryLocalInterface6 instanceof zzcu ? (zzcu) queryLocalInterface6 : new zzcs(readStrongBinder6);
                }
                da91.f(parcel);
                getCurrentScreenClass(zzcuVar12);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    zzdcVar = queryLocalInterface7 instanceof zzdc ? (zzdc) queryLocalInterface7 : new zzdb(readStrongBinder7);
                }
                da91.f(parcel);
                setInstanceIdProvider(zzdcVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar11 = queryLocalInterface8 instanceof zzcu ? (zzcu) queryLocalInterface8 : new zzcs(readStrongBinder8);
                }
                da91.f(parcel);
                getCachedAppInstanceId(zzcuVar11);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar10 = queryLocalInterface9 instanceof zzcu ? (zzcu) queryLocalInterface9 : new zzcs(readStrongBinder9);
                }
                da91.f(parcel);
                getAppInstanceId(zzcuVar10);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar9 = queryLocalInterface10 instanceof zzcu ? (zzcu) queryLocalInterface10 : new zzcs(readStrongBinder10);
                }
                da91.f(parcel);
                getGmpAppId(zzcuVar9);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar8 = queryLocalInterface11 instanceof zzcu ? (zzcu) queryLocalInterface11 : new zzcs(readStrongBinder11);
                }
                da91.f(parcel);
                generateEventId(zzcuVar8);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                da91.f(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                da91.f(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case 25:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                da91.f(parcel);
                onActivityStarted(asInterface4, readLong14);
                break;
            case 26:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                da91.f(parcel);
                onActivityStopped(asInterface5, readLong15);
                break;
            case 27:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) da91.b(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                da91.f(parcel);
                onActivityCreated(asInterface6, bundle5, readLong16);
                break;
            case 28:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                da91.f(parcel);
                onActivityDestroyed(asInterface7, readLong17);
                break;
            case 29:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                da91.f(parcel);
                onActivityPaused(asInterface8, readLong18);
                break;
            case 30:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                da91.f(parcel);
                onActivityResumed(asInterface9, readLong19);
                break;
            case 31:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar7 = queryLocalInterface12 instanceof zzcu ? (zzcu) queryLocalInterface12 : new zzcs(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                da91.f(parcel);
                onActivitySaveInstanceState(asInterface10, zzcuVar7, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) da91.b(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar6 = queryLocalInterface13 instanceof zzcu ? (zzcu) queryLocalInterface13 : new zzcs(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                da91.f(parcel);
                performAction(bundle6, zzcuVar6, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                da91.f(parcel);
                logHealthData(readInt, readString19, asInterface11, asInterface12, asInterface13);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdaVar3 = queryLocalInterface14 instanceof zzda ? (zzda) queryLocalInterface14 : new zzcy(readStrongBinder14);
                }
                da91.f(parcel);
                setEventInterceptor(zzdaVar3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdaVar2 = queryLocalInterface15 instanceof zzda ? (zzda) queryLocalInterface15 : new zzcy(readStrongBinder15);
                }
                da91.f(parcel);
                registerOnMeasurementEventListener(zzdaVar2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdaVar = queryLocalInterface16 instanceof zzda ? (zzda) queryLocalInterface16 : new zzcy(readStrongBinder16);
                }
                da91.f(parcel);
                unregisterOnMeasurementEventListener(zzdaVar);
                break;
            case 37:
                HashMap e = da91.e(parcel);
                da91.f(parcel);
                initForTests(e);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar5 = queryLocalInterface17 instanceof zzcu ? (zzcu) queryLocalInterface17 : new zzcs(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                da91.f(parcel);
                getTestFlag(zzcuVar5, readInt2);
                break;
            case 39:
                boolean a6 = da91.a(parcel);
                da91.f(parcel);
                setDataCollectionEnabled(a6);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar4 = queryLocalInterface18 instanceof zzcu ? (zzcu) queryLocalInterface18 : new zzcs(readStrongBinder18);
                }
                da91.f(parcel);
                isDataCollectionEnabled(zzcuVar4);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) da91.b(parcel, Bundle.CREATOR);
                da91.f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long readLong22 = parcel.readLong();
                da91.f(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) da91.b(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                da91.f(parcel);
                setConsent(bundle8, readLong23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) da91.b(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                da91.f(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar3 = queryLocalInterface19 instanceof zzcu ? (zzcu) queryLocalInterface19 : new zzcs(readStrongBinder19);
                }
                da91.f(parcel);
                getSessionId(zzcuVar3);
                break;
            case 48:
                Intent intent = (Intent) da91.b(parcel, Intent.CREATOR);
                da91.f(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                zzdf zzdfVar = (zzdf) da91.b(parcel, zzdf.CREATOR);
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                long readLong25 = parcel.readLong();
                da91.f(parcel);
                setCurrentScreenByScionActivityInfo(zzdfVar, readString20, readString21, readLong25);
                break;
            case SAFETY_TIPS_VALUE:
                zzdf zzdfVar2 = (zzdf) da91.b(parcel, zzdf.CREATOR);
                long readLong26 = parcel.readLong();
                da91.f(parcel);
                onActivityStartedByScionActivityInfo(zzdfVar2, readLong26);
                break;
            case 52:
                zzdf zzdfVar3 = (zzdf) da91.b(parcel, zzdf.CREATOR);
                long readLong27 = parcel.readLong();
                da91.f(parcel);
                onActivityStoppedByScionActivityInfo(zzdfVar3, readLong27);
                break;
            case 53:
                zzdf zzdfVar4 = (zzdf) da91.b(parcel, zzdf.CREATOR);
                Bundle bundle10 = (Bundle) da91.b(parcel, Bundle.CREATOR);
                long readLong28 = parcel.readLong();
                da91.f(parcel);
                onActivityCreatedByScionActivityInfo(zzdfVar4, bundle10, readLong28);
                break;
            case 54:
                zzdf zzdfVar5 = (zzdf) da91.b(parcel, zzdf.CREATOR);
                long readLong29 = parcel.readLong();
                da91.f(parcel);
                onActivityDestroyedByScionActivityInfo(zzdfVar5, readLong29);
                break;
            case SODA_DE_DE_VALUE:
                zzdf zzdfVar6 = (zzdf) da91.b(parcel, zzdf.CREATOR);
                long readLong30 = parcel.readLong();
                da91.f(parcel);
                onActivityPausedByScionActivityInfo(zzdfVar6, readLong30);
                break;
            case 56:
                zzdf zzdfVar7 = (zzdf) da91.b(parcel, zzdf.CREATOR);
                long readLong31 = parcel.readLong();
                da91.f(parcel);
                onActivityResumedByScionActivityInfo(zzdfVar7, readLong31);
                break;
            case SODA_ES_ES_VALUE:
                zzdf zzdfVar8 = (zzdf) da91.b(parcel, zzdf.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar2 = queryLocalInterface20 instanceof zzcu ? (zzcu) queryLocalInterface20 : new zzcs(readStrongBinder20);
                }
                long readLong32 = parcel.readLong();
                da91.f(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(zzdfVar8, zzcuVar2, readLong32);
                break;
            case 58:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    zzcxVar = queryLocalInterface21 instanceof zzcx ? (zzcx) queryLocalInterface21 : new zzcv(readStrongBinder21);
                }
                da91.f(parcel);
                retrieveAndUploadBatches(zzcxVar);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
