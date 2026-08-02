package com.adjust.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import defpackage.ny61;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class GooglePlayServicesClient {

    /* loaded from: classes10.dex */
    public static final class GooglePlayServicesInfo {
        private final String gpsAdid;
        private final Boolean trackingEnabled;

        public GooglePlayServicesInfo(String str, Boolean bool) {
            this.gpsAdid = str;
            this.trackingEnabled = bool;
        }

        public String getGpsAdid() {
            return this.gpsAdid;
        }

        public Boolean isTrackingEnabled() {
            return this.trackingEnabled;
        }
    }

    /* loaded from: classes10.dex */
    public static final class a implements ServiceConnection {
        public final long a;
        public boolean b = false;
        public final LinkedBlockingQueue<IBinder> c = new LinkedBlockingQueue<>(1);

        public a(long j) {
            this.a = j;
        }

        public final IBinder a() {
            if (this.b) {
                ny61.k();
                return null;
            }
            this.b = true;
            return this.c.poll(this.a, TimeUnit.MILLISECONDS);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.c.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static GooglePlayServicesInfo getGooglePlayServicesInfo(Context context, long j) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ny61.r("Google Play Services info can't be accessed from the main thread");
            return null;
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        a aVar = new a(j);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aVar, 1)) {
                ny61.v("Google Play connection failed");
                return null;
            }
            try {
                IBinder a2 = aVar.a();
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    a2.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    obtain = Parcel.obtain();
                    obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        obtain.writeInt(1);
                        a2.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        boolean z = obtain2.readInt() != 0;
                        obtain2.recycle();
                        obtain.recycle();
                        return new GooglePlayServicesInfo(readString, Boolean.valueOf(!z));
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e) {
                throw e;
            }
        } finally {
            context.unbindService(aVar);
        }
    }
}
