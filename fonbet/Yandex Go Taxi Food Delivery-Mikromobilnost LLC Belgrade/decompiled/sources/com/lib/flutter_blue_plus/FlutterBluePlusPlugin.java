package com.lib.flutter_blue_plus;

import android.app.Activity;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelUuid;
import android.util.Log;
import com.lib.flutter_blue_plus.FlutterBluePlusPlugin;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.b64;
import defpackage.ba20;
import defpackage.ca20;
import defpackage.da20;
import defpackage.ea20;
import defpackage.l40;
import defpackage.ny61;
import defpackage.nzc0;
import defpackage.oyr;
import defpackage.ozc0;
import defpackage.qke;
import defpackage.r30;
import defpackage.srr;
import defpackage.ssr;
import defpackage.tsr;
import defpackage.u1n;
import defpackage.unr0;
import defpackage.wrr;
import defpackage.x4e;
import defpackage.x920;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.VMInspector.Depends;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public class FlutterBluePlusPlugin implements tsr, ca20, ozc0, nzc0, r30 {
    public l40 A;
    public ScanCallback S;
    public Application b;
    public ea20 c;
    public BluetoothManager w;
    public BluetoothAdapter x;
    public ssr z;
    public LogLevel a = LogLevel.DEBUG;
    public boolean y = false;
    public final Semaphore B = new Semaphore(1);
    public final ConcurrentHashMap C = new ConcurrentHashMap();
    public final ConcurrentHashMap D = new ConcurrentHashMap();
    public final ConcurrentHashMap E = new ConcurrentHashMap();
    public final ConcurrentHashMap F = new ConcurrentHashMap();
    public final ConcurrentHashMap G = new ConcurrentHashMap();
    public final ConcurrentHashMap H = new ConcurrentHashMap();
    public final ConcurrentHashMap I = new ConcurrentHashMap();
    public final ConcurrentHashMap J = new ConcurrentHashMap();
    public final ConcurrentHashMap K = new ConcurrentHashMap();
    public final ConcurrentHashMap L = new ConcurrentHashMap();
    public HashMap M = new HashMap();
    public final HashMap N = new HashMap();
    public int O = 1452;
    public final BroadcastReceiver P = new BroadcastReceiver() { // from class: com.lib.flutter_blue_plus.FlutterBluePlusPlugin.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            FlutterBluePlusPlugin flutterBluePlusPlugin;
            BluetoothAdapter bluetoothAdapter;
            BluetoothLeScanner bluetoothLeScanner;
            String action = intent.getAction();
            if (action == null || !"android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                return;
            }
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            FlutterBluePlusPlugin flutterBluePlusPlugin2 = FlutterBluePlusPlugin.this;
            LogLevel logLevel = LogLevel.DEBUG;
            switch (intExtra) {
                case 10:
                    str = "off";
                    break;
                case 11:
                    str = "turningOn";
                    break;
                case 12:
                    str = "on";
                    break;
                case 13:
                    str = "turningOff";
                    break;
                default:
                    str = oyr.j(intExtra, "UNKNOWN_ADAPTER_STATE (", Extension.C_BRAKE);
                    break;
            }
            flutterBluePlusPlugin2.t(logLevel, "OnAdapterStateChanged: ".concat(str));
            int i = 0;
            if (intExtra == 12 && (bluetoothAdapter = (flutterBluePlusPlugin = FlutterBluePlusPlugin.this).x) != null && flutterBluePlusPlugin.y && (bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner()) != null) {
                FlutterBluePlusPlugin.this.t(logLevel, "calling stopScan (Bluetooth Restarted)");
                bluetoothLeScanner.stopScan(FlutterBluePlusPlugin.this.o());
                FlutterBluePlusPlugin.this.y = false;
            }
            HashMap hashMap = new HashMap();
            switch (intExtra) {
                case 10:
                    i = 6;
                    break;
                case 11:
                    i = 3;
                    break;
                case 12:
                    i = 4;
                    break;
                case 13:
                    i = 5;
                    break;
            }
            hashMap.put("adapter_state", Integer.valueOf(i));
            FlutterBluePlusPlugin.this.q("OnAdapterStateChanged", hashMap);
            if (intExtra == 13 || intExtra == 10) {
                FlutterBluePlusPlugin.this.i("adapterTurnOff");
            }
        }
    };
    public final BroadcastReceiver Q = new BroadcastReceiver() { // from class: com.lib.flutter_blue_plus.FlutterBluePlusPlugin.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            Object parcelableExtra;
            String action = intent.getAction();
            if (action == null || !action.equals("android.bluetooth.device.action.PAIRING_REQUEST")) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class);
                bluetoothDevice = (BluetoothDevice) parcelableExtra;
            } else {
                bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            }
            String address = bluetoothDevice.getAddress();
            if (FlutterBluePlusPlugin.this.F.containsKey(address)) {
                byte[] bArr = (byte[]) FlutterBluePlusPlugin.this.F.get(address);
                FlutterBluePlusPlugin flutterBluePlusPlugin = FlutterBluePlusPlugin.this;
                LogLevel logLevel = LogLevel.DEBUG;
                StringBuilder x = unr0.x("Setting PIN code for ", address, Extension.COLON_SPACE);
                x.append(FlutterBluePlusPlugin.a(bArr));
                flutterBluePlusPlugin.t(logLevel, x.toString());
                if (!bluetoothDevice.setPin(bArr)) {
                    FlutterBluePlusPlugin.this.t(LogLevel.ERROR, "setPin() failed on " + address);
                }
                FlutterBluePlusPlugin.this.F.remove(address);
            }
        }
    };
    public final BroadcastReceiver R = new BroadcastReceiver() { // from class: com.lib.flutter_blue_plus.FlutterBluePlusPlugin.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            String str;
            Object parcelableExtra;
            String action = intent.getAction();
            if (action == null || !action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class);
                bluetoothDevice = (BluetoothDevice) parcelableExtra;
            } else {
                bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            }
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
            int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
            FlutterBluePlusPlugin flutterBluePlusPlugin = FlutterBluePlusPlugin.this;
            LogLevel logLevel = LogLevel.DEBUG;
            StringBuilder sb = new StringBuilder("OnBondStateChanged: ");
            String str2 = "bond-none";
            switch (intExtra) {
                case 10:
                    str = "bond-none";
                    break;
                case 11:
                    str = "bonding";
                    break;
                case 12:
                    str = "bonded";
                    break;
                default:
                    str = oyr.j(intExtra, "UNKNOWN_BOND_STATE (", Extension.C_BRAKE);
                    break;
            }
            sb.append(str);
            sb.append(" prev: ");
            switch (intExtra2) {
                case 10:
                    break;
                case 11:
                    str2 = "bonding";
                    break;
                case 12:
                    str2 = "bonded";
                    break;
                default:
                    str2 = oyr.j(intExtra2, "UNKNOWN_BOND_STATE (", Extension.C_BRAKE);
                    break;
            }
            sb.append(str2);
            flutterBluePlusPlugin.t(logLevel, sb.toString());
            String address = bluetoothDevice.getAddress();
            FlutterBluePlusPlugin flutterBluePlusPlugin2 = FlutterBluePlusPlugin.this;
            if (intExtra == 11) {
                flutterBluePlusPlugin2.E.put(address, bluetoothDevice);
            } else {
                flutterBluePlusPlugin2.E.remove(address);
            }
            HashMap p = x4e.p("remote_id", address);
            p.put("bond_state", Integer.valueOf(intExtra != 11 ? intExtra != 12 ? 0 : 2 : 1));
            p.put("prev_state", Integer.valueOf(intExtra2 != 11 ? intExtra2 != 12 ? 0 : 2 : 1));
            FlutterBluePlusPlugin.this.q("OnBondStateChanged", p);
        }
    };
    public final BluetoothGattCallback T = new BluetoothGattCallback() { // from class: com.lib.flutter_blue_plus.FlutterBluePlusPlugin.5
        private boolean handleUnexpectedConnectionEvents(BluetoothGatt bluetoothGatt, int i, String str) {
            if (i == 2) {
                if (FlutterBluePlusPlugin.this.D.get(str) != null || FlutterBluePlusPlugin.this.H.get(str) != null) {
                    return false;
                }
                FlutterBluePlusPlugin.this.t(LogLevel.DEBUG, "[unexpected connection] disconnecting now");
                FlutterBluePlusPlugin.this.C.remove(str);
                FlutterBluePlusPlugin.this.E.remove(str);
                FlutterBluePlusPlugin.this.F.remove(str);
                bluetoothGatt.disconnect();
                bluetoothGatt.close();
                return true;
            }
            if (i != 0 || FlutterBluePlusPlugin.this.D.get(str) != null || FlutterBluePlusPlugin.this.C.get(str) != null || FlutterBluePlusPlugin.this.H.get(str) != null) {
                return false;
            }
            FlutterBluePlusPlugin.this.t(LogLevel.DEBUG, "[unexpected connection] disconnect complete");
            FlutterBluePlusPlugin.this.E.remove(str);
            FlutterBluePlusPlugin.this.F.remove(str);
            bluetoothGatt.close();
            return true;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            LogLevel logLevel = LogLevel.DEBUG;
            FlutterBluePlusPlugin.this.t(logLevel, "onCharacteristicChanged:");
            FlutterBluePlusPlugin flutterBluePlusPlugin = FlutterBluePlusPlugin.this;
            UUID uuid = bluetoothGattCharacteristic.getUuid();
            flutterBluePlusPlugin.getClass();
            flutterBluePlusPlugin.t(logLevel, "  chr: ".concat(FlutterBluePlusPlugin.v(uuid)));
            onCharacteristicReceived(bluetoothGatt, bluetoothGattCharacteristic, bArr, 0);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
            LogLevel logLevel = i == 0 ? LogLevel.DEBUG : LogLevel.ERROR;
            FlutterBluePlusPlugin.this.t(logLevel, "onCharacteristicRead:");
            FlutterBluePlusPlugin flutterBluePlusPlugin = FlutterBluePlusPlugin.this;
            UUID uuid = bluetoothGattCharacteristic.getUuid();
            flutterBluePlusPlugin.getClass();
            flutterBluePlusPlugin.t(logLevel, "  chr: ".concat(FlutterBluePlusPlugin.v(uuid)));
            FlutterBluePlusPlugin.this.t(logLevel, "  status: " + FlutterBluePlusPlugin.b(i) + Extension.O_BRAKE_SPACE + i + Extension.C_BRAKE);
            FlutterBluePlusPlugin flutterBluePlusPlugin2 = FlutterBluePlusPlugin.this;
            StringBuilder sb = new StringBuilder("  instanceId: ");
            sb.append(FlutterBluePlusPlugin.l(bluetoothGattCharacteristic));
            flutterBluePlusPlugin2.t(logLevel, sb.toString());
            onCharacteristicReceived(bluetoothGatt, bluetoothGattCharacteristic, bArr, i);
        }

        public void onCharacteristicReceived(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
            FlutterBluePlusPlugin flutterBluePlusPlugin = FlutterBluePlusPlugin.this;
            UUID uuid = bluetoothGattCharacteristic.getService().getUuid();
            flutterBluePlusPlugin.getClass();
            if (FlutterBluePlusPlugin.v(uuid).equals("1801")) {
                FlutterBluePlusPlugin flutterBluePlusPlugin2 = FlutterBluePlusPlugin.this;
                UUID uuid2 = bluetoothGattCharacteristic.getUuid();
                flutterBluePlusPlugin2.getClass();
                if (FlutterBluePlusPlugin.v(uuid2).toUpperCase().equals("2A05")) {
                    FlutterBluePlusPlugin flutterBluePlusPlugin3 = FlutterBluePlusPlugin.this;
                    BluetoothDevice device = bluetoothGatt.getDevice();
                    flutterBluePlusPlugin3.getClass();
                    FlutterBluePlusPlugin.this.q("OnServicesReset", FlutterBluePlusPlugin.f(device));
                }
            }
            BluetoothGattService n = FlutterBluePlusPlugin.n(bluetoothGatt, bluetoothGattCharacteristic);
            HashMap hashMap = new HashMap();
            hashMap.put("remote_id", bluetoothGatt.getDevice().getAddress());
            if (n != null) {
                FlutterBluePlusPlugin flutterBluePlusPlugin4 = FlutterBluePlusPlugin.this;
                UUID uuid3 = n.getUuid();
                flutterBluePlusPlugin4.getClass();
                hashMap.put("primary_service_uuid", FlutterBluePlusPlugin.v(uuid3));
            }
            FlutterBluePlusPlugin flutterBluePlusPlugin5 = FlutterBluePlusPlugin.this;
            UUID uuid4 = bluetoothGattCharacteristic.getService().getUuid();
            flutterBluePlusPlugin5.getClass();
            hashMap.put("service_uuid", FlutterBluePlusPlugin.v(uuid4));
            FlutterBluePlusPlugin flutterBluePlusPlugin6 = FlutterBluePlusPlugin.this;
            UUID uuid5 = bluetoothGattCharacteristic.getUuid();
            flutterBluePlusPlugin6.getClass();
            hashMap.put("characteristic_uuid", FlutterBluePlusPlugin.v(uuid5));
            hashMap.put("instance_id", Integer.valueOf(FlutterBluePlusPlugin.l(bluetoothGattCharacteristic)));
            hashMap.put("value", bArr);
            b64.B(i == 0 ? 1 : 0, hashMap, "success", i, "error_code");
            hashMap.put("error_string", FlutterBluePlusPlugin.b(i));
            FlutterBluePlusPlugin.this.q("OnCharacteristicReceived", hashMap);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            String str;
            LogLevel logLevel = i == 0 ? LogLevel.DEBUG : LogLevel.ERROR;
            FlutterBluePlusPlugin.this.t(logLevel, "onCharacteristicWrite:");
            FlutterBluePlusPlugin flutterBluePlusPlugin = FlutterBluePlusPlugin.this;
            UUID uuid = bluetoothGattCharacteristic.getUuid();
            flutterBluePlusPlugin.getClass();
            flutterBluePlusPlugin.t(logLevel, "  chr: ".concat(FlutterBluePlusPlugin.v(uuid)));
            FlutterBluePlusPlugin.this.t(logLevel, "  status: " + FlutterBluePlusPlugin.b(i) + Extension.O_BRAKE_SPACE + i + Extension.C_BRAKE);
            BluetoothGattService n = FlutterBluePlusPlugin.n(bluetoothGatt, bluetoothGattCharacteristic);
            String address = bluetoothGatt.getDevice().getAddress();
            if (n != null) {
                FlutterBluePlusPlugin flutterBluePlusPlugin2 = FlutterBluePlusPlugin.this;
                UUID uuid2 = n.getUuid();
                flutterBluePlusPlugin2.getClass();
                str = FlutterBluePlusPlugin.v(uuid2);
            } else {
                str = "";
            }
            FlutterBluePlusPlugin flutterBluePlusPlugin3 = FlutterBluePlusPlugin.this;
            UUID uuid3 = bluetoothGattCharacteristic.getService().getUuid();
            flutterBluePlusPlugin3.getClass();
            String v = FlutterBluePlusPlugin.v(uuid3);
            FlutterBluePlusPlugin flutterBluePlusPlugin4 = FlutterBluePlusPlugin.this;
            UUID uuid4 = bluetoothGattCharacteristic.getUuid();
            flutterBluePlusPlugin4.getClass();
            String v2 = FlutterBluePlusPlugin.v(uuid4);
            Integer valueOf = Integer.valueOf(FlutterBluePlusPlugin.l(bluetoothGattCharacteristic));
            StringBuilder w = oyr.w(address, ":", str, ":", v);
            w.append(":");
            w.append(v2);
            w.append(":");
            w.append(valueOf);
            byte[] bArr = (byte[]) FlutterBluePlusPlugin.this.I.remove(w.toString());
            if (bArr == null) {
                bArr = new byte[0];
            }
            HashMap p = x4e.p("remote_id", address);
            if (n != null) {
                FlutterBluePlusPlugin flutterBluePlusPlugin5 = FlutterBluePlusPlugin.this;
                UUID uuid5 = n.getUuid();
                flutterBluePlusPlugin5.getClass();
                p.put("primary_service_uuid", FlutterBluePlusPlugin.v(uuid5));
            }
            p.put("service_uuid", v);
            p.put("characteristic_uuid", v2);
            p.put("instance_id", valueOf);
            p.put("value", bArr);
            b64.B(i == 0 ? 1 : 0, p, "success", i, "error_code");
            p.put("error_string", FlutterBluePlusPlugin.b(i));
            FlutterBluePlusPlugin.this.q("OnCharacteristicWritten", p);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            String str;
            try {
                FlutterBluePlusPlugin flutterBluePlusPlugin = FlutterBluePlusPlugin.this;
                Semaphore semaphore = flutterBluePlusPlugin.B;
                int i3 = 0;
                boolean z = false;
                while (!z) {
                    try {
                        semaphore.acquire();
                        z = true;
                    } catch (InterruptedException unused) {
                        flutterBluePlusPlugin.t(LogLevel.ERROR, "failed to acquire mutex, retrying");
                    }
                }
                FlutterBluePlusPlugin flutterBluePlusPlugin2 = FlutterBluePlusPlugin.this;
                LogLevel logLevel = LogLevel.DEBUG;
                StringBuilder sb = new StringBuilder("onConnectionStateChange:");
                if (i2 == 0) {
                    str = "disconnected";
                } else if (i2 == 1) {
                    str = "connecting";
                } else if (i2 == 2) {
                    str = "connected";
                } else if (i2 != 3) {
                    str = "UNKNOWN_CONNECTION_STATE (" + i2 + Extension.C_BRAKE;
                } else {
                    str = "disconnecting";
                }
                sb.append(str);
                flutterBluePlusPlugin2.t(logLevel, sb.toString());
                FlutterBluePlusPlugin.this.t(logLevel, "  status: ".concat(FlutterBluePlusPlugin.c(i)));
                if (i2 == 2 || i2 == 0) {
                    String address = bluetoothGatt.getDevice().getAddress();
                    if (!handleUnexpectedConnectionEvents(bluetoothGatt, i2, address)) {
                        if (i2 == 2) {
                            FlutterBluePlusPlugin.this.C.put(address, bluetoothGatt);
                            FlutterBluePlusPlugin.this.D.remove(address);
                            FlutterBluePlusPlugin.this.G.put(address, 23);
                        }
                        if (i2 == 0) {
                            FlutterBluePlusPlugin.this.C.remove(address);
                            FlutterBluePlusPlugin.this.D.remove(address);
                            FlutterBluePlusPlugin.this.E.remove(address);
                            FlutterBluePlusPlugin.this.F.remove(address);
                            if (FlutterBluePlusPlugin.this.H.containsKey(address)) {
                                FlutterBluePlusPlugin.this.t(logLevel, "autoconnect is true. skipping gatt.close()");
                            } else {
                                bluetoothGatt.close();
                            }
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("remote_id", address);
                        if (i2 == 2) {
                            i3 = 1;
                        }
                        hashMap.put("connection_state", Integer.valueOf(i3));
                        hashMap.put("disconnect_reason_code", Integer.valueOf(i));
                        hashMap.put("disconnect_reason_string", FlutterBluePlusPlugin.c(i));
                        FlutterBluePlusPlugin.this.q("OnConnectionStateChanged", hashMap);
                    }
                }
            } finally {
                FlutterBluePlusPlugin.this.B.release();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i, byte[] bArr) {
            LogLevel logLevel = i == 0 ? LogLevel.DEBUG : LogLevel.ERROR;
            FlutterBluePlusPlugin.this.t(logLevel, "onDescriptorRead:");
            FlutterBluePlusPlugin flutterBluePlusPlugin = FlutterBluePlusPlugin.this;
            UUID uuid = bluetoothGattDescriptor.getCharacteristic().getUuid();
            flutterBluePlusPlugin.getClass();
            flutterBluePlusPlugin.t(logLevel, "  chr: ".concat(FlutterBluePlusPlugin.v(uuid)));
            FlutterBluePlusPlugin flutterBluePlusPlugin2 = FlutterBluePlusPlugin.this;
            UUID uuid2 = bluetoothGattDescriptor.getUuid();
            flutterBluePlusPlugin2.getClass();
            flutterBluePlusPlugin2.t(logLevel, "  desc: ".concat(FlutterBluePlusPlugin.v(uuid2)));
            FlutterBluePlusPlugin.this.t(logLevel, "  status: " + FlutterBluePlusPlugin.b(i) + Extension.O_BRAKE_SPACE + i + Extension.C_BRAKE);
            BluetoothGattService n = FlutterBluePlusPlugin.n(bluetoothGatt, bluetoothGattDescriptor.getCharacteristic());
            HashMap hashMap = new HashMap();
            hashMap.put("remote_id", bluetoothGatt.getDevice().getAddress());
            if (n != null) {
                FlutterBluePlusPlugin flutterBluePlusPlugin3 = FlutterBluePlusPlugin.this;
                UUID uuid3 = n.getUuid();
                flutterBluePlusPlugin3.getClass();
                hashMap.put("primary_service_uuid", FlutterBluePlusPlugin.v(uuid3));
            }
            FlutterBluePlusPlugin flutterBluePlusPlugin4 = FlutterBluePlusPlugin.this;
            UUID uuid4 = bluetoothGattDescriptor.getCharacteristic().getService().getUuid();
            flutterBluePlusPlugin4.getClass();
            hashMap.put("service_uuid", FlutterBluePlusPlugin.v(uuid4));
            FlutterBluePlusPlugin flutterBluePlusPlugin5 = FlutterBluePlusPlugin.this;
            UUID uuid5 = bluetoothGattDescriptor.getCharacteristic().getUuid();
            flutterBluePlusPlugin5.getClass();
            hashMap.put("characteristic_uuid", FlutterBluePlusPlugin.v(uuid5));
            FlutterBluePlusPlugin flutterBluePlusPlugin6 = FlutterBluePlusPlugin.this;
            UUID uuid6 = bluetoothGattDescriptor.getUuid();
            flutterBluePlusPlugin6.getClass();
            hashMap.put("descriptor_uuid", FlutterBluePlusPlugin.v(uuid6));
            hashMap.put("instance_id", Integer.valueOf(FlutterBluePlusPlugin.l(bluetoothGattDescriptor.getCharacteristic())));
            hashMap.put("value", bArr);
            b64.B(i == 0 ? 1 : 0, hashMap, "success", i, "error_code");
            hashMap.put("error_string", FlutterBluePlusPlugin.b(i));
            FlutterBluePlusPlugin.this.q("OnDescriptorRead", hashMap);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            String str;
            LogLevel logLevel = i == 0 ? LogLevel.DEBUG : LogLevel.ERROR;
            FlutterBluePlusPlugin.this.t(logLevel, "onDescriptorWrite:");
            FlutterBluePlusPlugin flutterBluePlusPlugin = FlutterBluePlusPlugin.this;
            UUID uuid = bluetoothGattDescriptor.getCharacteristic().getUuid();
            flutterBluePlusPlugin.getClass();
            flutterBluePlusPlugin.t(logLevel, "  chr: ".concat(FlutterBluePlusPlugin.v(uuid)));
            FlutterBluePlusPlugin flutterBluePlusPlugin2 = FlutterBluePlusPlugin.this;
            UUID uuid2 = bluetoothGattDescriptor.getUuid();
            flutterBluePlusPlugin2.getClass();
            flutterBluePlusPlugin2.t(logLevel, "  desc: ".concat(FlutterBluePlusPlugin.v(uuid2)));
            FlutterBluePlusPlugin.this.t(logLevel, "  status: " + FlutterBluePlusPlugin.b(i) + Extension.O_BRAKE_SPACE + i + Extension.C_BRAKE);
            BluetoothGattService n = FlutterBluePlusPlugin.n(bluetoothGatt, bluetoothGattDescriptor.getCharacteristic());
            String address = bluetoothGatt.getDevice().getAddress();
            if (n != null) {
                FlutterBluePlusPlugin flutterBluePlusPlugin3 = FlutterBluePlusPlugin.this;
                UUID uuid3 = n.getUuid();
                flutterBluePlusPlugin3.getClass();
                str = FlutterBluePlusPlugin.v(uuid3);
            } else {
                str = "";
            }
            FlutterBluePlusPlugin flutterBluePlusPlugin4 = FlutterBluePlusPlugin.this;
            UUID uuid4 = bluetoothGattDescriptor.getCharacteristic().getService().getUuid();
            flutterBluePlusPlugin4.getClass();
            String v = FlutterBluePlusPlugin.v(uuid4);
            FlutterBluePlusPlugin flutterBluePlusPlugin5 = FlutterBluePlusPlugin.this;
            UUID uuid5 = bluetoothGattDescriptor.getCharacteristic().getUuid();
            flutterBluePlusPlugin5.getClass();
            String v2 = FlutterBluePlusPlugin.v(uuid5);
            Integer valueOf = Integer.valueOf(FlutterBluePlusPlugin.l(bluetoothGattDescriptor.getCharacteristic()));
            FlutterBluePlusPlugin flutterBluePlusPlugin6 = FlutterBluePlusPlugin.this;
            UUID uuid6 = bluetoothGattDescriptor.getUuid();
            flutterBluePlusPlugin6.getClass();
            String v3 = FlutterBluePlusPlugin.v(uuid6);
            StringBuilder w = oyr.w(address, ":", str, ":", v);
            w.append(":");
            w.append(v2);
            w.append(":");
            w.append(valueOf);
            byte[] bArr = (byte[]) FlutterBluePlusPlugin.this.J.remove(oyr.t(w, ":", v3));
            if (bArr == null) {
                bArr = new byte[0];
            }
            HashMap p = x4e.p("remote_id", address);
            if (n != null) {
                FlutterBluePlusPlugin flutterBluePlusPlugin7 = FlutterBluePlusPlugin.this;
                UUID uuid7 = n.getUuid();
                flutterBluePlusPlugin7.getClass();
                p.put("primary_service_uuid", FlutterBluePlusPlugin.v(uuid7));
            }
            p.put("service_uuid", v);
            p.put("characteristic_uuid", v2);
            p.put("descriptor_uuid", v3);
            p.put("instance_id", Integer.valueOf(FlutterBluePlusPlugin.l(bluetoothGattDescriptor.getCharacteristic())));
            p.put("value", bArr);
            b64.B(i == 0 ? 1 : 0, p, "success", i, "error_code");
            p.put("error_string", FlutterBluePlusPlugin.b(i));
            FlutterBluePlusPlugin.this.q("OnDescriptorWritten", p);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            LogLevel logLevel = i2 == 0 ? LogLevel.DEBUG : LogLevel.ERROR;
            FlutterBluePlusPlugin.this.t(logLevel, "onMtuChanged:");
            FlutterBluePlusPlugin.this.t(logLevel, "  mtu: " + i);
            FlutterBluePlusPlugin.this.t(logLevel, "  status: " + FlutterBluePlusPlugin.b(i2) + Extension.O_BRAKE_SPACE + i2 + Extension.C_BRAKE);
            String address = bluetoothGatt.getDevice().getAddress();
            FlutterBluePlusPlugin.this.G.put(address, Integer.valueOf(i));
            HashMap hashMap = new HashMap();
            hashMap.put("remote_id", address);
            hashMap.put("mtu", Integer.valueOf(i));
            b64.B(i2 == 0 ? 1 : 0, hashMap, "success", i2, "error_code");
            hashMap.put("error_string", FlutterBluePlusPlugin.b(i2));
            FlutterBluePlusPlugin.this.q("OnMtuChanged", hashMap);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
            LogLevel logLevel = i2 == 0 ? LogLevel.DEBUG : LogLevel.ERROR;
            FlutterBluePlusPlugin.this.t(logLevel, "onReadRemoteRssi:");
            FlutterBluePlusPlugin.this.t(logLevel, "  rssi: " + i);
            FlutterBluePlusPlugin.this.t(logLevel, "  status: " + FlutterBluePlusPlugin.b(i2) + Extension.O_BRAKE_SPACE + i2 + Extension.C_BRAKE);
            HashMap hashMap = new HashMap();
            hashMap.put("remote_id", bluetoothGatt.getDevice().getAddress());
            hashMap.put("rssi", Integer.valueOf(i));
            b64.B(i2 == 0 ? 1 : 0, hashMap, "success", i2, "error_code");
            hashMap.put("error_string", FlutterBluePlusPlugin.b(i2));
            FlutterBluePlusPlugin.this.q("OnReadRssi", hashMap);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i) {
            LogLevel logLevel = i == 0 ? LogLevel.DEBUG : LogLevel.ERROR;
            FlutterBluePlusPlugin.this.t(logLevel, "onReliableWriteCompleted:");
            FlutterBluePlusPlugin.this.t(logLevel, "  status: " + FlutterBluePlusPlugin.b(i) + Extension.O_BRAKE_SPACE + i + Extension.C_BRAKE);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            LogLevel logLevel = i == 0 ? LogLevel.DEBUG : LogLevel.ERROR;
            FlutterBluePlusPlugin.this.t(logLevel, "onServicesDiscovered:");
            FlutterBluePlusPlugin.this.t(logLevel, "  count: " + bluetoothGatt.getServices().size());
            FlutterBluePlusPlugin.this.t(logLevel, "  status: " + i + FlutterBluePlusPlugin.b(i));
            ArrayList arrayList = new ArrayList();
            for (BluetoothGattService bluetoothGattService : bluetoothGatt.getServices()) {
                FlutterBluePlusPlugin flutterBluePlusPlugin = FlutterBluePlusPlugin.this;
                BluetoothDevice device = bluetoothGatt.getDevice();
                flutterBluePlusPlugin.getClass();
                arrayList.add(FlutterBluePlusPlugin.g(device, bluetoothGattService, null, bluetoothGatt));
                for (BluetoothGattService bluetoothGattService2 : bluetoothGattService.getIncludedServices()) {
                    FlutterBluePlusPlugin flutterBluePlusPlugin2 = FlutterBluePlusPlugin.this;
                    BluetoothDevice device2 = bluetoothGatt.getDevice();
                    flutterBluePlusPlugin2.getClass();
                    arrayList.add(FlutterBluePlusPlugin.g(device2, bluetoothGattService2, bluetoothGattService, bluetoothGatt));
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("remote_id", bluetoothGatt.getDevice().getAddress());
            hashMap.put("services", arrayList);
            b64.B(i == 0 ? 1 : 0, hashMap, "success", i, "error_code");
            hashMap.put("error_string", FlutterBluePlusPlugin.b(i));
            FlutterBluePlusPlugin.this.q("OnDiscoveredServices", hashMap);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue());
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue(), i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i, bluetoothGattDescriptor.getValue());
        }
    };

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LogLevel {
        private static final /* synthetic */ LogLevel[] $VALUES;
        public static final LogLevel DEBUG;
        public static final LogLevel ERROR;
        public static final LogLevel INFO;
        public static final LogLevel NONE;
        public static final LogLevel VERBOSE;
        public static final LogLevel WARNING;

        static {
            LogLevel logLevel = new LogLevel(JCP.RAW_PREFIX, 0);
            NONE = logLevel;
            LogLevel logLevel2 = new LogLevel("ERROR", 1);
            ERROR = logLevel2;
            LogLevel logLevel3 = new LogLevel("WARNING", 2);
            WARNING = logLevel3;
            LogLevel logLevel4 = new LogLevel("INFO", 3);
            INFO = logLevel4;
            LogLevel logLevel5 = new LogLevel("DEBUG", 4);
            DEBUG = logLevel5;
            LogLevel logLevel6 = new LogLevel("VERBOSE", 5);
            VERBOSE = logLevel6;
            $VALUES = new LogLevel[]{logLevel, logLevel2, logLevel3, logLevel4, logLevel5, logLevel6};
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public static LogLevel[] values() {
            return (LogLevel[]) $VALUES.clone();
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(Character.forDigit((b >> 4) & 15, 16));
            sb.append(Character.forDigit(b & PKIBody._CCP, 16));
        }
        return sb.toString();
    }

    public static String b(int i) {
        if (i == 257) {
            return "GATT_FAILURE";
        }
        switch (i) {
            case 0:
                return "GATT_SUCCESS";
            case 1:
                return "GATT_INVALID_HANDLE";
            case 2:
                return "GATT_READ_NOT_PERMITTED";
            case 3:
                return "GATT_WRITE_NOT_PERMITTED";
            case 4:
                return "GATT_INVALID_PDU";
            case 5:
                return "GATT_INSUFFICIENT_AUTHENTICATION";
            case 6:
                return "GATT_REQUEST_NOT_SUPPORTED";
            case 7:
                return "GATT_INVALID_OFFSET";
            case 8:
                return "GATT_INSUFFICIENT_AUTHORIZATION";
            case 9:
                return "GATT_PREPARE_QUEUE_FULL";
            case 10:
                return "GATT_ATTR_NOT_FOUND";
            case 11:
                return "GATT_ATTR_NOT_LONG";
            case 12:
                return "GATT_INSUFFICIENT_KEY_SIZE";
            case 13:
                return "GATT_INVALID_ATTRIBUTE_LENGTH";
            case 14:
                return "GATT_UNLIKELY";
            case 15:
                return "GATT_INSUFFICIENT_ENCRYPTION";
            case 16:
                return "GATT_UNSUPPORTED_GROUP";
            case 17:
                return "GATT_INSUFFICIENT_RESOURCES";
            default:
                switch (i) {
                    case 128:
                        return "GATT_NO_RESOURCES";
                    case HProv.PP_SECURITY_LEVEL /* 129 */:
                        return "GATT_INTERNAL_ERROR";
                    case 130:
                        return "GATT_WRONG_STATE";
                    case HProv.PP_FAST_CODE /* 131 */:
                        return "GATT_DB_FULL";
                    case HProv.PP_CONTAINER_EXTENSION /* 132 */:
                        return "GATT_BUSY";
                    case HProv.PP_ENUM_CONTAINER_EXTENSION /* 133 */:
                        return "GATT_ERROR";
                    case HProv.PP_CONTAINER_EXTENSION_DEL /* 134 */:
                        return "GATT_CMD_STARTED";
                    case HProv.PP_CONTAINER_DEFAULT /* 135 */:
                        return "GATT_ILLEGAL_PARAMETER";
                    case HProv.PP_LCD_QUERY /* 136 */:
                        return "GATT_PENDING";
                    case HProv.PP_ENUM_LOG /* 137 */:
                        return "GATT_AUTH_FAIL";
                    case HProv.PP_VERSION_EX /* 138 */:
                        return "GATT_MORE";
                    case 139:
                        return "GATT_INVALID_CFG";
                    case PollMessageDraft.MAX_ANSWER_LENGTH /* 140 */:
                        return "GATT_SERVICE_STARTED";
                    case 141:
                        return "GATT_ENCRYPTED_NO_MITM";
                    case 142:
                        return "GATT_NOT_ENCRYPTED";
                    case 143:
                        return "GATT_CONNECTION_CONGESTED";
                    default:
                        return oyr.j(i, "UNKNOWN_GATT_ERROR (", Extension.C_BRAKE);
                }
        }
    }

    public static String c(int i) {
        if (i == 133) {
            return "ANDROID_SPECIFIC_ERROR";
        }
        if (i == 143) {
            return "GATT_CONNECTION_CONGESTED";
        }
        if (i == 147) {
            return "GATT_CONNECTION_TIMEOUT";
        }
        if (i == 257) {
            return "FAILURE_REGISTERING_CLIENT";
        }
        switch (i) {
            case 0:
                return "SUCCESS";
            case 1:
                return "UNKNOWN_COMMAND";
            case 2:
                return "UNKNOWN_CONNECTION_IDENTIFIER";
            case 3:
                return "HARDWARE_FAILURE";
            case 4:
                return "PAGE_TIMEOUT";
            case 5:
                return "AUTHENTICATION_FAILURE";
            case 6:
                return "PIN_OR_KEY_MISSING";
            case 7:
                return "MEMORY_FULL";
            case 8:
                return "LINK_SUPERVISION_TIMEOUT";
            case 9:
                return "CONNECTION_LIMIT_EXCEEDED";
            case 10:
                return "MAX_NUM_OF_CONNECTIONS_EXCEEDED";
            case 11:
                return "CONNECTION_ALREADY_EXISTS";
            case 12:
                return "COMMAND_DISALLOWED";
            case 13:
                return "CONNECTION_REJECTED_LIMITED_RESOURCES";
            case 14:
                return "CONNECTION_REJECTED_SECURITY_REASONS";
            case 15:
                return "CONNECTION_REJECTED_UNACCEPTABLE_MAC_ADDRESS";
            case 16:
                return "CONNECTION_ACCEPT_TIMEOUT_EXCEEDED";
            case 17:
                return "UNSUPPORTED_PARAMETER_VALUE";
            case 18:
                return "INVALID_COMMAND_PARAMETERS";
            case 19:
                return "REMOTE_USER_TERMINATED_CONNECTION";
            case 20:
                return "REMOTE_DEVICE_TERMINATED_CONNECTION_LOW_RESOURCES";
            case 21:
                return "REMOTE_DEVICE_TERMINATED_CONNECTION_POWER_OFF";
            case 22:
                return "CONNECTION_TERMINATED_BY_LOCAL_HOST";
            case 23:
                return "REPEATED_ATTEMPTS";
            case 24:
                return "PAIRING_NOT_ALLOWED";
            case 25:
                return "UNKNOWN_LMP_PDU";
            case 26:
                return "UNSUPPORTED_REMOTE_FEATURE";
            case 27:
                return "SCO_OFFSET_REJECTED";
            case 28:
                return "SCO_INTERVAL_REJECTED";
            case 29:
                return "SCO_AIR_MODE_REJECTED";
            case 30:
                return "INVALID_LMP_OR_LL_PARAMETERS";
            case 31:
                return "UNSPECIFIED";
            case 32:
                return "UNSUPPORTED_LMP_OR_LL_PARAMETER_VALUE";
            case 33:
                return "ROLE_CHANGE_NOT_ALLOWED";
            case 34:
                return "LMP_OR_LL_RESPONSE_TIMEOUT";
            case 35:
                return "LMP_OR_LL_ERROR_TRANS_COLLISION";
            case 36:
                return "LMP_PDU_NOT_ALLOWED";
            case 37:
                return "ENCRYPTION_MODE_NOT_ACCEPTABLE";
            case 38:
                return "LINK_KEY_CANNOT_BE_EXCHANGED";
            case 39:
                return "REQUESTED_QOS_NOT_SUPPORTED";
            case 40:
                return "INSTANT_PASSED";
            case 41:
                return "PAIRING_WITH_UNIT_KEY_NOT_SUPPORTED";
            case 42:
                return "DIFFERENT_TRANSACTION_COLLISION";
            case 43:
                return "UNDEFINED_0x2B";
            case 44:
                return "QOS_UNACCEPTABLE_PARAMETER";
            case 45:
                return "QOS_REJECTED";
            case 46:
                return "CHANNEL_CLASSIFICATION_NOT_SUPPORTED";
            case 47:
                return "INSUFFICIENT_SECURITY";
            case 48:
                return "PARAMETER_OUT_OF_RANGE";
            case 49:
                return "UNDEFINED_0x31";
            case 50:
                return "ROLE_SWITCH_PENDING";
            case SAFETY_TIPS_VALUE:
                return "UNDEFINED_0x33";
            case 52:
                return "RESERVED_SLOT_VIOLATION";
            case 53:
                return "ROLE_SWITCH_FAILED";
            case 54:
                return "INQUIRY_RESPONSE_TOO_LARGE";
            case SODA_DE_DE_VALUE:
                return "SECURE_SIMPLE_PAIRING_NOT_SUPPORTED";
            case 56:
                return "HOST_BUSY_PAIRING";
            case SODA_ES_ES_VALUE:
                return "CONNECTION_REJECTED_NO_SUITABLE_CHANNEL";
            case 58:
                return "CONTROLLER_BUSY";
            case 59:
                return "UNACCEPTABLE_CONNECTION_PARAMETERS";
            case 60:
                return "ADVERTISING_TIMEOUT";
            case 61:
                return "CONNECTION_TERMINATED_MIC_FAILURE";
            case 62:
                return "CONNECTION_FAILED_ESTABLISHMENT";
            case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                return "MAC_CONNECTION_FAILED";
            case 64:
                return "COARSE_CLOCK_ADJUSTMENT_REJECTED";
            case 65:
                return "TYPE0_SUBMAP_NOT_DEFINED";
            case 66:
                return "UNKNOWN_ADVERTISING_IDENTIFIER";
            case 67:
                return "LIMIT_REACHED";
            case TRANSLATE_KIT_VALUE:
                return "OPERATION_CANCELLED_BY_HOST";
            case 69:
                return "PACKET_TOO_LONG";
            default:
                return oyr.j(i, "UNKNOWN_HCI_ERROR (", Extension.C_BRAKE);
        }
    }

    public static String d(int i) {
        switch (i) {
            case 1:
                return "SCAN_FAILED_ALREADY_STARTED";
            case 2:
                return "SCAN_FAILED_APPLICATION_REGISTRATION_FAILED";
            case 3:
                return "SCAN_FAILED_INTERNAL_ERROR";
            case 4:
                return "SCAN_FAILED_FEATURE_UNSUPPORTED";
            case 5:
                return "SCAN_FAILED_OUT_OF_HARDWARE_RESOURCES";
            case 6:
                return "SCAN_FAILED_SCANNING_TOO_FREQUENTLY";
            default:
                return oyr.j(i, "UNKNOWN_SCAN_ERROR (", Extension.C_BRAKE);
        }
    }

    public static String e(int i) {
        if (i == 0) {
            return "SUCCESS";
        }
        if (i == 1) {
            return "ERROR_BLUETOOTH_NOT_ENABLED";
        }
        if (i == 2) {
            return "ERROR_BLUETOOTH_NOT_ALLOWED";
        }
        if (i == 3) {
            return "ERROR_DEVICE_NOT_BONDED";
        }
        if (i == 6) {
            return "ERROR_MISSING_BLUETOOTH_CONNECT_PERMISSION";
        }
        if (i == Integer.MAX_VALUE) {
            return "ERROR_UNKNOWN";
        }
        if (i == 200) {
            return "ERROR_GATT_WRITE_NOT_ALLOWED";
        }
        if (i == 201) {
            return "ERROR_GATT_WRITE_REQUEST_BUSY";
        }
        switch (i) {
            case 9:
                return "ERROR_PROFILE_SERVICE_NOT_BOUND";
            case 10:
                return "FEATURE_SUPPORTED";
            case 11:
                return "FEATURE_NOT_SUPPORTED";
            default:
                return oyr.j(i, "UNKNOWN_BLE_ERROR (", Extension.C_BRAKE);
        }
    }

    public static HashMap f(BluetoothDevice bluetoothDevice) {
        HashMap hashMap = new HashMap();
        hashMap.put("remote_id", bluetoothDevice.getAddress());
        hashMap.put("platform_name", bluetoothDevice.getName());
        return hashMap;
    }

    public static HashMap g(BluetoothDevice bluetoothDevice, BluetoothGattService bluetoothGattService, BluetoothGattService bluetoothGattService2, BluetoothGatt bluetoothGatt) {
        ArrayList arrayList = new ArrayList();
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
            ArrayList arrayList2 = new ArrayList();
            for (BluetoothGattDescriptor bluetoothGattDescriptor : bluetoothGattCharacteristic.getDescriptors()) {
                BluetoothGattService n = n(bluetoothGatt, bluetoothGattDescriptor.getCharacteristic());
                HashMap hashMap = new HashMap();
                hashMap.put("remote_id", bluetoothDevice.getAddress());
                if (n != null) {
                    hashMap.put("primary_service_uuid", v(n.getUuid()));
                }
                hashMap.put("service_uuid", v(bluetoothGattDescriptor.getCharacteristic().getService().getUuid()));
                hashMap.put("descriptor_uuid", v(bluetoothGattDescriptor.getUuid()));
                hashMap.put("characteristic_uuid", v(bluetoothGattDescriptor.getCharacteristic().getUuid()));
                hashMap.put("instance_id", Integer.valueOf(l(bluetoothGattDescriptor.getCharacteristic())));
                arrayList2.add(hashMap);
            }
            BluetoothGattService n2 = n(bluetoothGatt, bluetoothGattCharacteristic);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("remote_id", bluetoothDevice.getAddress());
            if (n2 != null) {
                hashMap2.put("primary_service_uuid", v(n2.getUuid()));
            }
            hashMap2.put("service_uuid", v(bluetoothGattCharacteristic.getService().getUuid()));
            hashMap2.put("characteristic_uuid", v(bluetoothGattCharacteristic.getUuid()));
            hashMap2.put("instance_id", Integer.valueOf(l(bluetoothGattCharacteristic)));
            hashMap2.put("descriptors", arrayList2);
            int properties = bluetoothGattCharacteristic.getProperties();
            HashMap hashMap3 = new HashMap();
            int i = 0;
            hashMap3.put("broadcast", Integer.valueOf((properties & 1) != 0 ? 1 : 0));
            hashMap3.put("read", Integer.valueOf((properties & 2) != 0 ? 1 : 0));
            hashMap3.put("write_without_response", Integer.valueOf((properties & 4) != 0 ? 1 : 0));
            hashMap3.put("write", Integer.valueOf((properties & 8) != 0 ? 1 : 0));
            hashMap3.put("notify", Integer.valueOf((properties & 16) != 0 ? 1 : 0));
            hashMap3.put("indicate", Integer.valueOf((properties & 32) != 0 ? 1 : 0));
            hashMap3.put("authenticated_signed_writes", Integer.valueOf((properties & 64) != 0 ? 1 : 0));
            hashMap3.put("extended_properties", Integer.valueOf((properties & 128) != 0 ? 1 : 0));
            hashMap3.put("notify_encryption_required", Integer.valueOf((properties & 256) != 0 ? 1 : 0));
            if ((properties & 512) != 0) {
                i = 1;
            }
            hashMap3.put("indicate_encryption_required", Integer.valueOf(i));
            hashMap2.put("properties", hashMap3);
            arrayList.add(hashMap2);
        }
        HashMap hashMap4 = new HashMap();
        hashMap4.put("remote_id", bluetoothDevice.getAddress());
        if (bluetoothGattService2 != null) {
            hashMap4.put("primary_service_uuid", v(bluetoothGattService2.getUuid()));
        }
        hashMap4.put("service_uuid", v(bluetoothGattService.getUuid()));
        hashMap4.put("characteristics", arrayList);
        return hashMap4;
    }

    public static int h(int i) {
        if (i != 0) {
            return i != 1 ? 2 : 1;
        }
        return 0;
    }

    public static BluetoothGattDescriptor k(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BluetoothGattDescriptor bluetoothGattDescriptor = (BluetoothGattDescriptor) it.next();
            if (u(bluetoothGattDescriptor.getUuid()).equals(u(str))) {
                return bluetoothGattDescriptor;
            }
        }
        return null;
    }

    public static int l(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattService service = bluetoothGattCharacteristic.getService();
        if (service == null) {
            return 0;
        }
        UUID uuid = bluetoothGattCharacteristic.getUuid();
        Integer num = null;
        int i = 0;
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic2 : service.getCharacteristics()) {
            if (uuid.equals(bluetoothGattCharacteristic2.getUuid())) {
                i++;
                if (bluetoothGattCharacteristic2 == bluetoothGattCharacteristic) {
                    num = Integer.valueOf(bluetoothGattCharacteristic2.getInstanceId());
                }
            }
        }
        if (i <= 1 || num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static BluetoothGattService n(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattService service = bluetoothGattCharacteristic.getService();
        if (service.getType() == 0) {
            return null;
        }
        for (BluetoothGattService bluetoothGattService : bluetoothGatt.getServices()) {
            Iterator<BluetoothGattService> it = bluetoothGattService.getIncludedServices().iterator();
            while (it.hasNext()) {
                if (it.next().getUuid().equals(service.getUuid())) {
                    return bluetoothGattService;
                }
            }
        }
        return null;
    }

    public static BluetoothGattService p(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BluetoothGattService bluetoothGattService = (BluetoothGattService) it.next();
            if (u(bluetoothGattService.getUuid()).equals(u(str))) {
                return bluetoothGattService;
            }
        }
        return null;
    }

    public static u1n s(BluetoothGatt bluetoothGatt, String str, String str2, String str3, Integer num) {
        BluetoothGattService bluetoothGattService;
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        boolean z = str != null;
        if (str == null) {
            str = str2;
        }
        BluetoothGattService p = p(str, bluetoothGatt.getServices());
        if (p == null) {
            return new u1n(21, null, oyr.p("primary service not found '", str, "'"));
        }
        if (z) {
            bluetoothGattService = p(str2, p.getIncludedServices());
            if (bluetoothGattService == null) {
                return new u1n(21, null, unr0.p("secondary service not found '", str2, "' (primary service '", str, "')"));
            }
        } else {
            bluetoothGattService = null;
        }
        if (bluetoothGattService != null) {
            p = bluetoothGattService;
        }
        Iterator<BluetoothGattCharacteristic> it = p.getCharacteristics().iterator();
        while (true) {
            if (!it.hasNext()) {
                bluetoothGattCharacteristic = null;
                break;
            }
            bluetoothGattCharacteristic = it.next();
            if (u(bluetoothGattCharacteristic.getUuid()).equals(u(str3)) && l(bluetoothGattCharacteristic) == num.intValue()) {
                break;
            }
        }
        return bluetoothGattCharacteristic == null ? new u1n(21, null, unr0.p("characteristic not found in service (chr: '", str3, "' svc: '", str2, "')")) : new u1n(21, bluetoothGattCharacteristic, null);
    }

    public static String u(Object obj) {
        if (!(obj instanceof UUID) && !(obj instanceof String)) {
            ny61.g("input must be UUID or String");
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.length() != 4) {
            return obj2.length() == 8 ? obj2.concat("-0000-1000-8000-00805f9b34fb").toLowerCase() : obj2.toLowerCase();
        }
        return ("0000" + obj2 + "-0000-1000-8000-00805f9b34fb").toLowerCase();
    }

    public static String v(UUID uuid) {
        String u = u(uuid);
        boolean startsWith = u.startsWith("0000");
        boolean endsWith = u.endsWith("-0000-1000-8000-00805f9b34fb");
        return (startsWith && endsWith) ? u.substring(4, 8) : endsWith ? u.substring(0, 8) : u;
    }

    public final void i(String str) {
        t(LogLevel.DEBUG, "disconnectAllDevices(" + str + Extension.C_BRAKE);
        HashMap hashMap = new HashMap();
        ConcurrentHashMap concurrentHashMap = this.C;
        hashMap.putAll(concurrentHashMap);
        ConcurrentHashMap concurrentHashMap2 = this.H;
        hashMap.putAll(concurrentHashMap2);
        for (BluetoothGatt bluetoothGatt : hashMap.values()) {
            if (str == "adapterTurnOff") {
                this.T.onConnectionStateChange(bluetoothGatt, 0, 0);
            } else {
                String address = bluetoothGatt.getDevice().getAddress();
                LogLevel logLevel = LogLevel.DEBUG;
                t(logLevel, "calling disconnect: " + address);
                bluetoothGatt.disconnect();
                t(logLevel, "calling close: " + address);
                bluetoothGatt.close();
            }
        }
        concurrentHashMap.clear();
        this.D.clear();
        this.E.clear();
        this.F.clear();
        this.G.clear();
        this.I.clear();
        this.J.clear();
        concurrentHashMap2.clear();
    }

    public final void j(ArrayList arrayList, srr srrVar) {
        if (this.b == null) {
            srrVar.a("Application Context is null", false);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && qke.h(this.b, str) != 0) {
                arrayList2.add(str);
            }
        }
        if (arrayList2.isEmpty()) {
            srrVar.a(null, true);
            return;
        }
        if (arrayList2.isEmpty()) {
            srrVar.a(null, true);
            return;
        }
        this.N.put(Integer.valueOf(this.O), srrVar);
        androidx.core.app.b.J((Activity) ((wrr) this.A).b, (String[]) arrayList2.toArray(new String[0]), this.O);
        this.O++;
    }

    public final int m(int i, String str, boolean z) {
        if (i != 1 && z) {
            return 512;
        }
        Integer num = (Integer) this.G.get(str);
        if (num == null) {
            num = 23;
        }
        return Math.min(num.intValue() - 3, 512);
    }

    public final ScanCallback o() {
        if (this.S == null) {
            this.S = new ScanCallback() { // from class: com.lib.flutter_blue_plus.FlutterBluePlusPlugin.4
                @Override // android.bluetooth.le.ScanCallback
                public void onBatchScanResults(List<ScanResult> list) {
                    super.onBatchScanResults(list);
                }

                @Override // android.bluetooth.le.ScanCallback
                public void onScanFailed(int i) {
                    FlutterBluePlusPlugin.this.t(LogLevel.ERROR, "onScanFailed: ".concat(FlutterBluePlusPlugin.d(i)));
                    super.onScanFailed(i);
                    HashMap hashMap = new HashMap();
                    hashMap.put("advertisements", new ArrayList());
                    hashMap.put("success", 0);
                    hashMap.put("error_code", Integer.valueOf(i));
                    hashMap.put("error_string", FlutterBluePlusPlugin.d(i));
                    FlutterBluePlusPlugin.this.q("OnScanResponse", hashMap);
                }

                /* JADX WARN: Removed duplicated region for block: B:100:0x0254  */
                /* JADX WARN: Removed duplicated region for block: B:102:0x025f  */
                /* JADX WARN: Removed duplicated region for block: B:104:0x026a  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x0273  */
                /* JADX WARN: Removed duplicated region for block: B:109:0x027f  */
                /* JADX WARN: Removed duplicated region for block: B:112:0x028e  */
                /* JADX WARN: Removed duplicated region for block: B:114:0x0295  */
                /* JADX WARN: Removed duplicated region for block: B:116:0x029c  */
                /* JADX WARN: Removed duplicated region for block: B:119:0x02a7  */
                /* JADX WARN: Removed duplicated region for block: B:122:0x01c0  */
                /* JADX WARN: Removed duplicated region for block: B:123:0x01b8  */
                /* JADX WARN: Removed duplicated region for block: B:127:0x01ae  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0176  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x01b3  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x01bb  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x01eb  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
                /* JADX WARN: Removed duplicated region for block: B:97:0x0245  */
                @Override // android.bluetooth.le.ScanCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onScanResult(int i, ScanResult scanResult) {
                    int i2;
                    int i3;
                    int i4;
                    byte[] bArr;
                    List<ParcelUuid> serviceUuids;
                    Map<ParcelUuid, byte[]> serviceData;
                    HashMap hashMap;
                    int i5;
                    int i6;
                    int i7;
                    Map advertisingDataMap;
                    FlutterBluePlusPlugin.this.t(LogLevel.VERBOSE, "onScanResult");
                    super.onScanResult(i, scanResult);
                    BluetoothDevice device = scanResult.getDevice();
                    String address = device.getAddress();
                    ScanRecord scanRecord = scanResult.getScanRecord();
                    String a = scanRecord != null ? FlutterBluePlusPlugin.a(scanRecord.getBytes()) : "";
                    int i8 = 0;
                    int i9 = 1;
                    if (!((Boolean) FlutterBluePlusPlugin.this.M.get("continuous_updates")).booleanValue()) {
                        boolean z = FlutterBluePlusPlugin.this.K.containsKey(address) && ((String) FlutterBluePlusPlugin.this.K.get(address)).equals(a);
                        FlutterBluePlusPlugin.this.K.put(address, a);
                        if (z) {
                            return;
                        }
                    }
                    String deviceName = scanRecord != null ? scanRecord.getDeviceName() : "";
                    List list = (List) FlutterBluePlusPlugin.this.M.get("with_keywords");
                    FlutterBluePlusPlugin.this.getClass();
                    if (!list.isEmpty()) {
                        if (deviceName == null) {
                            return;
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (deviceName.contains((String) it.next())) {
                            }
                        }
                        return;
                    }
                    if (((Boolean) FlutterBluePlusPlugin.this.M.get("continuous_updates")).booleanValue()) {
                        ConcurrentHashMap concurrentHashMap = FlutterBluePlusPlugin.this.L;
                        if (concurrentHashMap.get(address) == null) {
                            concurrentHashMap.put(address, 0);
                        }
                        int intValue = ((Integer) concurrentHashMap.get(address)).intValue();
                        concurrentHashMap.put(address, Integer.valueOf(intValue + 1));
                        if (intValue % ((Integer) FlutterBluePlusPlugin.this.M.get("continuous_divisor")).intValue() != 0) {
                            return;
                        }
                    }
                    HashMap hashMap2 = new HashMap();
                    FlutterBluePlusPlugin.this.getClass();
                    ScanRecord scanRecord2 = scanResult.getScanRecord();
                    boolean isConnectable = scanResult.isConnectable();
                    String deviceName2 = scanRecord2 != null ? scanRecord2.getDeviceName() : null;
                    int txPowerLevel = scanRecord2 != null ? scanRecord2.getTxPowerLevel() : Integer.MIN_VALUE;
                    if (scanRecord2 != null) {
                        if (Build.VERSION.SDK_INT < 33) {
                            byte[] bytes = scanRecord2.getBytes();
                            int i10 = 0;
                            while (i10 < bytes.length && (i6 = bytes[i10] & 255) > 0) {
                                i2 = i9;
                                if (i10 + i6 >= bytes.length || (i7 = bytes[i10 + 1] & 255) == 0) {
                                    break;
                                }
                                if (i7 == 25 && i6 == 3) {
                                    i3 = (bytes[i10 + 2] & 255) | ((bytes[i10 + 3] & 255) << 8);
                                    break;
                                } else {
                                    i10 += i6 + 1;
                                    i9 = i2;
                                }
                            }
                        } else {
                            advertisingDataMap = scanRecord2.getAdvertisingDataMap();
                            if (advertisingDataMap.containsKey(25)) {
                                byte[] bArr2 = (byte[]) advertisingDataMap.get(25);
                                if (bArr2.length == 2) {
                                    i3 = ((bArr2[1] & 255) * 256) + (bArr2[0] & 255);
                                    i2 = 1;
                                }
                            }
                            i3 = 0;
                            i2 = 1;
                        }
                        if (scanRecord2 == null) {
                            byte[] bytes2 = scanRecord2.getBytes();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            int i11 = 0;
                            while (i11 < bytes2.length && (i5 = bytes2[i11] & 255) > 0) {
                                i4 = i8;
                                if (i11 + i5 >= bytes2.length) {
                                    break;
                                }
                                if ((bytes2[i11 + 1] & 255) == 255 && i5 >= 2) {
                                    byteArrayOutputStream.write(bytes2, i11 + 2, i5 - 1);
                                }
                                i11 += i5 + 1;
                                i8 = i4;
                            }
                            i4 = i8;
                            bArr = byteArrayOutputStream.toByteArray();
                        } else {
                            i4 = 0;
                            bArr = null;
                        }
                        serviceUuids = scanRecord2 == null ? scanRecord2.getServiceUuids() : null;
                        serviceData = scanRecord2 == null ? scanRecord2.getServiceData() : null;
                        hashMap = new HashMap();
                        if (bArr != null && bArr.length >= 2) {
                            int i12 = ((255 & bArr[i2]) << 8) | (bArr[i4] & 255);
                            int length = bArr.length - 2;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, 2, bArr3, i4, length);
                            hashMap.put(Integer.valueOf(i12), bArr3);
                        }
                        HashMap hashMap3 = new HashMap();
                        if (serviceData != null) {
                            for (Map.Entry<ParcelUuid, byte[]> entry : serviceData.entrySet()) {
                                hashMap3.put(FlutterBluePlusPlugin.v(entry.getKey().getUuid()), entry.getValue());
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        if (serviceUuids != null) {
                            Iterator<ParcelUuid> it2 = serviceUuids.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(FlutterBluePlusPlugin.v(it2.next().getUuid()));
                            }
                        }
                        HashMap hashMap4 = new HashMap();
                        if (device.getAddress() != null) {
                            hashMap4.put("remote_id", device.getAddress());
                        }
                        if (device.getName() != null) {
                            hashMap4.put("platform_name", device.getName());
                        }
                        if (isConnectable) {
                            hashMap4.put("connectable", Integer.valueOf(i2));
                        }
                        if (deviceName2 != null) {
                            hashMap4.put("adv_name", deviceName2);
                        }
                        if (txPowerLevel != Integer.MIN_VALUE) {
                            hashMap4.put("tx_power_level", Integer.valueOf(txPowerLevel));
                        }
                        if (i3 != 0) {
                            hashMap4.put("appearance", Integer.valueOf(i3));
                        }
                        if (hashMap.size() != 0) {
                            hashMap4.put("manufacturer_data", hashMap);
                        }
                        if (serviceData != null) {
                            hashMap4.put("service_data", hashMap3);
                        }
                        if (serviceUuids != null) {
                            hashMap4.put("service_uuids", arrayList);
                        }
                        if (scanResult.getRssi() != 0) {
                            hashMap4.put("rssi", Integer.valueOf(scanResult.getRssi()));
                        }
                        hashMap2.put("advertisements", Arrays.asList(hashMap4));
                        FlutterBluePlusPlugin.this.q("OnScanResponse", hashMap2);
                    }
                    i2 = i9;
                    i3 = 0;
                    if (scanRecord2 == null) {
                    }
                    if (scanRecord2 == null) {
                    }
                    if (scanRecord2 == null) {
                    }
                    hashMap = new HashMap();
                    if (bArr != null) {
                        int i122 = ((255 & bArr[i2]) << 8) | (bArr[i4] & 255);
                        int length2 = bArr.length - 2;
                        byte[] bArr32 = new byte[length2];
                        System.arraycopy(bArr, 2, bArr32, i4, length2);
                        hashMap.put(Integer.valueOf(i122), bArr32);
                    }
                    HashMap hashMap32 = new HashMap();
                    if (serviceData != null) {
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (serviceUuids != null) {
                    }
                    HashMap hashMap42 = new HashMap();
                    if (device.getAddress() != null) {
                    }
                    if (device.getName() != null) {
                    }
                    if (isConnectable) {
                    }
                    if (deviceName2 != null) {
                    }
                    if (txPowerLevel != Integer.MIN_VALUE) {
                    }
                    if (i3 != 0) {
                    }
                    if (hashMap.size() != 0) {
                    }
                    if (serviceData != null) {
                    }
                    if (serviceUuids != null) {
                    }
                    if (scanResult.getRssi() != 0) {
                    }
                    hashMap2.put("advertisements", Arrays.asList(hashMap42));
                    FlutterBluePlusPlugin.this.q("OnScanResponse", hashMap2);
                }
            };
        }
        return this.S;
    }

    @Override // defpackage.nzc0
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 13106) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("user_accepted", Boolean.valueOf(i2 == -1));
        q("OnTurnOnResponse", hashMap);
        return true;
    }

    @Override // defpackage.r30
    public final void onAttachedToActivity(l40 l40Var) {
        t(LogLevel.DEBUG, "onAttachedToActivity");
        this.A = l40Var;
        ((wrr) l40Var).b(this);
        ((wrr) this.A).a(this);
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        t(LogLevel.DEBUG, "onAttachedToEngine");
        this.z = ssrVar;
        this.b = (Application) ssrVar.a;
        ea20 ea20Var = new ea20(ssrVar.c, "flutter_blue_plus/methods");
        this.c = ea20Var;
        ea20Var.b(this);
        this.b.registerReceiver(this.P, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        this.b.registerReceiver(this.Q, new IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST"));
        this.b.registerReceiver(this.R, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivity() {
        t(LogLevel.DEBUG, "onDetachedFromActivity");
        ((HashSet) ((wrr) this.A).w).remove(this);
        this.A = null;
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivityForConfigChanges() {
        t(LogLevel.DEBUG, "onDetachedFromActivityForConfigChanges");
        onDetachedFromActivity();
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        BluetoothLeScanner bluetoothLeScanner;
        LogLevel logLevel = LogLevel.DEBUG;
        t(logLevel, "onDetachedFromEngine");
        q("OnDetachedFromEngine", new HashMap());
        this.z = null;
        BluetoothAdapter bluetoothAdapter = this.x;
        if (bluetoothAdapter != null && this.y && (bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner()) != null) {
            t(logLevel, "calling stopScan (OnDetachedFromEngine)");
            bluetoothLeScanner.stopScan(o());
            this.y = false;
        }
        i("onDetachedFromEngine");
        this.b.unregisterReceiver(this.R);
        this.b.unregisterReceiver(this.Q);
        this.b.unregisterReceiver(this.P);
        this.b = null;
        this.c.b(null);
        this.c = null;
        this.x = null;
        this.w = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0a32  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0a73  */
    @Override // defpackage.ca20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        Semaphore semaphore;
        int i;
        int i2;
        int writeDescriptor;
        int m;
        int length;
        int writeCharacteristic;
        byte[] bArr;
        int writeDescriptor2;
        Semaphore semaphore2;
        ConcurrentHashMap concurrentHashMap = this.D;
        String str = "CCCD descriptor for characteristic not found: ";
        boolean z = false;
        while (true) {
            semaphore = this.B;
            if (z) {
                break;
            }
            try {
                semaphore.acquire();
                z = true;
            } catch (InterruptedException unused) {
                semaphore2 = semaphore;
                try {
                    try {
                        t(LogLevel.ERROR, "failed to acquire mutex, retrying");
                        str = str;
                    } catch (Exception e) {
                        e = e;
                        StringWriter stringWriter = new StringWriter();
                        e.printStackTrace(new PrintWriter(stringWriter));
                        ((ba20) da20Var).error("androidException", e.toString(), stringWriter.toString());
                        semaphore2.release();
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    semaphore2.release();
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                semaphore2 = semaphore;
                StringWriter stringWriter2 = new StringWriter();
                e.printStackTrace(new PrintWriter(stringWriter2));
                ((ba20) da20Var).error("androidException", e.toString(), stringWriter2.toString());
                semaphore2.release();
                return;
            } catch (Throwable th2) {
                th = th2;
                semaphore2 = semaphore;
                semaphore2.release();
                throw th;
            }
        }
        String str2 = str;
        LogLevel logLevel = LogLevel.DEBUG;
        StringBuilder sb = new StringBuilder("onMethodCall: ");
        String str3 = x920Var.a;
        Object obj = x920Var.b;
        sb.append(str3);
        t(logLevel, sb.toString());
        if (this.x == null) {
            t(logLevel, "initializing BluetoothAdapter");
            BluetoothManager bluetoothManager = (BluetoothManager) this.b.getSystemService("bluetooth");
            this.w = bluetoothManager;
            this.x = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
        }
        if (this.x == null && !"flutterRestart".equals(str3) && !"connectedCount".equals(str3) && !"setLogLevel".equals(str3) && !"isSupported".equals(str3) && !"getAdapterName".equals(str3) && !"getAdapterState".equals(str3)) {
            ((ba20) da20Var).error("bluetoothUnavailable", "the device does not support bluetooth", null);
            semaphore.release();
            return;
        }
        int hashCode = str3.hashCode();
        ConcurrentHashMap concurrentHashMap2 = this.J;
        ConcurrentHashMap concurrentHashMap3 = this.C;
        switch (hashCode) {
            case -2129330689:
                if (str3.equals("startScan")) {
                    final HashMap hashMap = (HashMap) x920Var.b();
                    final List list = (List) hashMap.get("with_services");
                    final List list2 = (List) hashMap.get("with_remote_ids");
                    final List list3 = (List) hashMap.get("with_names");
                    final List list4 = (List) hashMap.get("with_keywords");
                    final List list5 = (List) hashMap.get("with_msd");
                    final List list6 = (List) hashMap.get("with_service_data");
                    ((Boolean) hashMap.get("continuous_updates")).getClass();
                    final boolean booleanValue = ((Boolean) hashMap.get("android_legacy")).booleanValue();
                    final int intValue = ((Integer) hashMap.get("android_scan_mode")).intValue();
                    boolean booleanValue2 = ((Boolean) hashMap.get("android_uses_fine_location")).booleanValue();
                    if (((Boolean) hashMap.get("android_check_location_services")).booleanValue() && !r()) {
                        ((ba20) da20Var).error("startScan", "Location services are required for Bluetooth scan", null);
                        semaphore.release();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        arrayList.add("android.permission.BLUETOOTH_SCAN");
                        if (booleanValue2) {
                            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
                        }
                        arrayList.add("android.permission.BLUETOOTH_CONNECT");
                    }
                    if (i3 <= 30) {
                        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
                    }
                    final ba20 ba20Var = (ba20) da20Var;
                    j(arrayList, new srr() { // from class: qrr
                        @Override // defpackage.srr
                        public final void a(String str4, boolean z2) {
                            ScanFilter.Builder advertisingDataType;
                            ScanFilter.Builder advertisingDataType2;
                            FlutterBluePlusPlugin flutterBluePlusPlugin = FlutterBluePlusPlugin.this;
                            ba20 ba20Var2 = ba20Var;
                            if (!z2) {
                                ba20Var2.error("startScan", oyr.p("Permission ", str4, " required to scan devices"), null);
                                return;
                            }
                            try {
                                if (flutterBluePlusPlugin.x.getState() == 12) {
                                    BluetoothLeScanner bluetoothLeScanner = flutterBluePlusPlugin.x.getBluetoothLeScanner();
                                    if (bluetoothLeScanner == null) {
                                        ba20Var2.error("startScan", "getBluetoothLeScanner() is null. Is the Adapter on?", null);
                                        return;
                                    }
                                    ScanSettings.Builder builder = new ScanSettings.Builder();
                                    builder.setScanMode(intValue);
                                    builder.setPhy(255);
                                    builder.setLegacy(booleanValue);
                                    ScanSettings build = builder.build();
                                    ArrayList arrayList2 = new ArrayList();
                                    int i4 = 0;
                                    int i5 = 0;
                                    while (true) {
                                        List list7 = list;
                                        if (i5 >= list7.size()) {
                                            break;
                                        }
                                        arrayList2.add(new ScanFilter.Builder().setServiceUuid(ParcelUuid.fromString(FlutterBluePlusPlugin.u(list7.get(i5)))).build());
                                        i5++;
                                    }
                                    int i6 = 0;
                                    while (true) {
                                        List list8 = list2;
                                        if (i6 >= list8.size()) {
                                            break;
                                        }
                                        arrayList2.add(new ScanFilter.Builder().setDeviceAddress((String) list8.get(i6)).build());
                                        i6++;
                                    }
                                    int i7 = 0;
                                    while (true) {
                                        List list9 = list3;
                                        if (i7 >= list9.size()) {
                                            break;
                                        }
                                        arrayList2.add(new ScanFilter.Builder().setDeviceName((String) list9.get(i7)).build());
                                        i7++;
                                    }
                                    if (Build.VERSION.SDK_INT >= 33 && list4.size() > 0) {
                                        advertisingDataType = new ScanFilter.Builder().setAdvertisingDataType(8);
                                        ScanFilter build2 = advertisingDataType.build();
                                        advertisingDataType2 = new ScanFilter.Builder().setAdvertisingDataType(9);
                                        ScanFilter build3 = advertisingDataType2.build();
                                        arrayList2.add(build2);
                                        arrayList2.add(build3);
                                    }
                                    int i8 = 0;
                                    while (true) {
                                        List list10 = list5;
                                        if (i8 >= list10.size()) {
                                            break;
                                        }
                                        HashMap hashMap2 = (HashMap) list10.get(i8);
                                        int intValue2 = ((Integer) hashMap2.get("manufacturer_id")).intValue();
                                        byte[] bArr2 = (byte[]) hashMap2.get(Constants.KEY_DATA);
                                        byte[] bArr3 = (byte[]) hashMap2.get("mask");
                                        arrayList2.add(bArr3.length == 0 ? new ScanFilter.Builder().setManufacturerData(intValue2, bArr2).build() : new ScanFilter.Builder().setManufacturerData(intValue2, bArr2, bArr3).build());
                                        i8++;
                                    }
                                    while (true) {
                                        List list11 = list6;
                                        if (i4 >= list11.size()) {
                                            flutterBluePlusPlugin.M = hashMap;
                                            flutterBluePlusPlugin.K.clear();
                                            flutterBluePlusPlugin.L.clear();
                                            bluetoothLeScanner.startScan(arrayList2, build, flutterBluePlusPlugin.o());
                                            flutterBluePlusPlugin.y = true;
                                            ba20Var2.success(Boolean.TRUE);
                                            return;
                                        }
                                        HashMap hashMap3 = (HashMap) list11.get(i4);
                                        ParcelUuid fromString = ParcelUuid.fromString(FlutterBluePlusPlugin.u((String) hashMap3.get(Constants.KEY_SERVICE)));
                                        byte[] bArr4 = (byte[]) hashMap3.get(Constants.KEY_DATA);
                                        byte[] bArr5 = (byte[]) hashMap3.get("mask");
                                        arrayList2.add(bArr5.length == 0 ? new ScanFilter.Builder().setServiceData(fromString, bArr4).build() : new ScanFilter.Builder().setServiceData(fromString, bArr4, bArr5).build());
                                        i4++;
                                    }
                                }
                            } catch (Exception unused2) {
                            }
                            ba20Var2.error("startScan", "Bluetooth must be turned on", null);
                        }
                    });
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case -1824027656:
                if (str3.equals("getSystemDevices")) {
                    ArrayList arrayList2 = new ArrayList();
                    if (Build.VERSION.SDK_INT >= 31) {
                        arrayList2.add("android.permission.BLUETOOTH_CONNECT");
                    }
                    final ba20 ba20Var2 = (ba20) da20Var;
                    final int i4 = 0;
                    j(arrayList2, new srr(this) { // from class: rrr
                        public final /* synthetic */ FlutterBluePlusPlugin b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.srr
                        public final void a(String str4, boolean z2) {
                            int i5 = i4;
                            ba20 ba20Var3 = ba20Var2;
                            FlutterBluePlusPlugin flutterBluePlusPlugin = this.b;
                            switch (i5) {
                                case 0:
                                    if (!z2) {
                                        ba20Var3.error("getSystemDevices", oyr.p("Permission ", str4, " required to get system devices"), null);
                                        break;
                                    } else {
                                        List<BluetoothDevice> connectedDevices = flutterBluePlusPlugin.w.getConnectedDevices(7);
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator<BluetoothDevice> it = connectedDevices.iterator();
                                        while (it.hasNext()) {
                                            arrayList3.add(FlutterBluePlusPlugin.f(it.next()));
                                        }
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put("devices", arrayList3);
                                        ba20Var3.success(hashMap2);
                                        break;
                                    }
                                case 1:
                                    BluetoothAdapter bluetoothAdapter = flutterBluePlusPlugin.x;
                                    String name = bluetoothAdapter != null ? bluetoothAdapter.getName() : Depends.NOT_AVAILABLE;
                                    if (name == null) {
                                        name = "";
                                    }
                                    ba20Var3.success(name);
                                    break;
                                case 2:
                                    if (!z2) {
                                        ba20Var3.error("turnOn", oyr.p("Permission ", str4, " required to turn Bluetooth on"), null);
                                        break;
                                    } else if (!flutterBluePlusPlugin.x.isEnabled()) {
                                        ((Activity) ((wrr) flutterBluePlusPlugin.A).b).startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 13106);
                                        ba20Var3.success(Boolean.TRUE);
                                        break;
                                    } else {
                                        ba20Var3.success(Boolean.FALSE);
                                        break;
                                    }
                                default:
                                    if (!z2) {
                                        ba20Var3.error("turnOff", oyr.p("Permission ", str4, " required to turn Bluetooth off"), null);
                                        break;
                                    } else if (!flutterBluePlusPlugin.x.isEnabled()) {
                                        ba20Var3.success(Boolean.TRUE);
                                        break;
                                    } else {
                                        ba20Var3.success(Boolean.valueOf(flutterBluePlusPlugin.x.disable()));
                                        break;
                                    }
                            }
                        }
                    });
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case -1702200072:
                if (str3.equals("getAdapterState")) {
                    try {
                        i = this.x.getState();
                    } catch (Exception unused2) {
                        i = -1;
                    }
                    HashMap hashMap2 = new HashMap();
                    switch (i) {
                        case 10:
                            i2 = 6;
                            break;
                        case 11:
                            i2 = 3;
                            break;
                        case 12:
                            i2 = 4;
                            break;
                        case 13:
                            i2 = 5;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    hashMap2.put("adapter_state", Integer.valueOf(i2));
                    ((ba20) da20Var).success(hashMap2);
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case -1683323867:
                if (str3.equals("getBondedDevices")) {
                    Set<BluetoothDevice> bondedDevices = this.x.getBondedDevices();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<BluetoothDevice> it = bondedDevices.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(f(it.next()));
                    }
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("devices", arrayList3);
                    ((ba20) da20Var).success(hashMap3);
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case -1331239341:
                if (str3.equals("flutterRestart")) {
                    BluetoothAdapter bluetoothAdapter = this.x;
                    if (bluetoothAdapter == null) {
                        ((ba20) da20Var).success(0);
                    } else {
                        BluetoothLeScanner bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner();
                        if (bluetoothLeScanner != null && this.y) {
                            t(logLevel, "calling stopScan (flutterRestart)");
                            bluetoothLeScanner.stopScan(o());
                            this.y = false;
                        }
                        i("flutterRestart");
                        t(logLevel, "connectedPeripherals: " + concurrentHashMap3.size());
                        ((ba20) da20Var).success(Integer.valueOf(concurrentHashMap3.size()));
                    }
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case -1301283666:
                if (str3.equals("writeDescriptor")) {
                    HashMap hashMap4 = (HashMap) x920Var.b();
                    String str4 = (String) hashMap4.get("remote_id");
                    String str5 = (String) hashMap4.get("primary_service_uuid");
                    String str6 = (String) hashMap4.get("service_uuid");
                    String str7 = (String) hashMap4.get("characteristic_uuid");
                    Integer num = (Integer) hashMap4.get("instance_id");
                    String str8 = (String) hashMap4.get("descriptor_uuid");
                    byte[] bArr2 = (byte[]) hashMap4.get("value");
                    BluetoothGatt bluetoothGatt = (BluetoothGatt) concurrentHashMap3.get(str4);
                    if (bluetoothGatt == null) {
                        ((ba20) da20Var).error("writeDescriptor", "device is disconnected", null);
                    } else {
                        u1n s = s(bluetoothGatt, str5, str6, str7, num);
                        String str9 = (String) s.c;
                        if (str9 != null) {
                            ((ba20) da20Var).error("writeDescriptor", str9, null);
                        } else {
                            BluetoothGattDescriptor k = k(str8, ((BluetoothGattCharacteristic) s.b).getDescriptors());
                            if (k == null) {
                                ((ba20) da20Var).error("writeDescriptor", "descriptor not found on characteristic. (desc: " + str8 + " chr: " + str7 + Extension.C_BRAKE, null);
                            } else {
                                int intValue2 = ((Integer) this.G.get(str4)).intValue() - 3;
                                if (intValue2 < bArr2.length) {
                                    ((ba20) da20Var).error("writeDescriptor", "data longer than mtu allows. dataLength: " + bArr2.length + "> max: " + intValue2, null);
                                } else {
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    concurrentHashMap2.put(str4 + ":" + str5 + ":" + str6 + ":" + str7 + ":" + num + ":" + str8, bArr2);
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        writeDescriptor = bluetoothGatt.writeDescriptor(k, bArr2);
                                        if (writeDescriptor != 0) {
                                            ((ba20) da20Var).error("writeDescriptor", "gatt.writeDescriptor() returned " + writeDescriptor + " : " + e(writeDescriptor), null);
                                            semaphore.release();
                                            return;
                                        }
                                    } else if (!k.setValue(bArr2)) {
                                        ((ba20) da20Var).error("writeDescriptor", "descriptor.setValue() returned false", null);
                                    } else if (!bluetoothGatt.writeDescriptor(k)) {
                                        ((ba20) da20Var).error("writeDescriptor", "gatt.writeDescriptor() returned false", null);
                                    }
                                    ((ba20) da20Var).success(Boolean.TRUE);
                                }
                            }
                        }
                    }
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case -1130630310:
                if (str3.equals("writeCharacteristic")) {
                    HashMap hashMap5 = (HashMap) x920Var.b();
                    String str10 = (String) hashMap5.get("remote_id");
                    String str11 = (String) hashMap5.get("primary_service_uuid");
                    String str12 = (String) hashMap5.get("service_uuid");
                    String str13 = (String) hashMap5.get("characteristic_uuid");
                    Integer num2 = (Integer) hashMap5.get("instance_id");
                    byte[] bArr3 = (byte[]) hashMap5.get("value");
                    int intValue3 = ((Integer) hashMap5.get("write_type")).intValue();
                    boolean z2 = ((Integer) hashMap5.get("allow_long_write")).intValue() != 0;
                    int i5 = intValue3 == 0 ? 2 : 1;
                    BluetoothGatt bluetoothGatt2 = (BluetoothGatt) concurrentHashMap3.get(str10);
                    if (bluetoothGatt2 == null) {
                        ((ba20) da20Var).error("writeCharacteristic", "device is disconnected", null);
                    } else {
                        u1n s2 = s(bluetoothGatt2, str11, str12, str13, num2);
                        String str14 = (String) s2.c;
                        if (str14 != null) {
                            ((ba20) da20Var).error("writeCharacteristic", str14, null);
                        } else {
                            BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) s2.b;
                            if (i5 == 1) {
                                if ((bluetoothGattCharacteristic.getProperties() & 4) == 0) {
                                    ((ba20) da20Var).error("writeCharacteristic", "The WRITE_NO_RESPONSE property is not supported by this BLE characteristic", null);
                                }
                                m = m(i5, str10, z2);
                                length = bArr3.length;
                                if (length <= m) {
                                    ((ba20) da20Var).error("writeCharacteristic", "data longer than allowed. dataLen: " + length + " > max: " + m + Extension.O_BRAKE_SPACE + (intValue3 == 0 ? "withResponse" : "withoutResponse") + (intValue3 == 0 ? z2 ? ", allowLongWrite" : ", noLongWrite" : "") + Extension.C_BRAKE, null);
                                } else {
                                    this.I.put(str10 + ":" + (str11 == null ? "" : str11) + ":" + str12 + ":" + str13 + ":" + num2, bArr3);
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        writeCharacteristic = bluetoothGatt2.writeCharacteristic(bluetoothGattCharacteristic, bArr3, i5);
                                        if (writeCharacteristic != 0) {
                                            ((ba20) da20Var).error("writeCharacteristic", "gatt.writeCharacteristic() returned " + writeCharacteristic + " : " + e(writeCharacteristic), null);
                                            semaphore.release();
                                            return;
                                        }
                                    } else if (bluetoothGattCharacteristic.setValue(bArr3)) {
                                        bluetoothGattCharacteristic.setWriteType(i5);
                                        if (!bluetoothGatt2.writeCharacteristic(bluetoothGattCharacteristic)) {
                                            ((ba20) da20Var).error("writeCharacteristic", "gatt.writeCharacteristic() returned false", null);
                                        }
                                    } else {
                                        ((ba20) da20Var).error("writeCharacteristic", "characteristic.setValue() returned false", null);
                                    }
                                    ((ba20) da20Var).success(Boolean.TRUE);
                                }
                            } else {
                                if ((bluetoothGattCharacteristic.getProperties() & 8) == 0) {
                                    ((ba20) da20Var).error("writeCharacteristic", "The WRITE property is not supported by this BLE characteristic", null);
                                }
                                m = m(i5, str10, z2);
                                length = bArr3.length;
                                if (length <= m) {
                                }
                            }
                        }
                    }
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case -965507150:
                if (str3.equals("turnOff")) {
                    ArrayList arrayList4 = new ArrayList();
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 31) {
                        arrayList4.add("android.permission.BLUETOOTH_CONNECT");
                    }
                    if (i6 <= 30) {
                        arrayList4.add("android.permission.BLUETOOTH");
                    }
                    final ba20 ba20Var3 = (ba20) da20Var;
                    final int i7 = 3;
                    j(arrayList4, new srr(this) { // from class: rrr
                        public final /* synthetic */ FlutterBluePlusPlugin b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.srr
                        public final void a(String str42, boolean z22) {
                            int i52 = i7;
                            ba20 ba20Var32 = ba20Var3;
                            FlutterBluePlusPlugin flutterBluePlusPlugin = this.b;
                            switch (i52) {
                                case 0:
                                    if (!z22) {
                                        ba20Var32.error("getSystemDevices", oyr.p("Permission ", str42, " required to get system devices"), null);
                                        break;
                                    } else {
                                        List<BluetoothDevice> connectedDevices = flutterBluePlusPlugin.w.getConnectedDevices(7);
                                        ArrayList arrayList32 = new ArrayList();
                                        Iterator<BluetoothDevice> it2 = connectedDevices.iterator();
                                        while (it2.hasNext()) {
                                            arrayList32.add(FlutterBluePlusPlugin.f(it2.next()));
                                        }
                                        HashMap hashMap22 = new HashMap();
                                        hashMap22.put("devices", arrayList32);
                                        ba20Var32.success(hashMap22);
                                        break;
                                    }
                                case 1:
                                    BluetoothAdapter bluetoothAdapter2 = flutterBluePlusPlugin.x;
                                    String name = bluetoothAdapter2 != null ? bluetoothAdapter2.getName() : Depends.NOT_AVAILABLE;
                                    if (name == null) {
                                        name = "";
                                    }
                                    ba20Var32.success(name);
                                    break;
                                case 2:
                                    if (!z22) {
                                        ba20Var32.error("turnOn", oyr.p("Permission ", str42, " required to turn Bluetooth on"), null);
                                        break;
                                    } else if (!flutterBluePlusPlugin.x.isEnabled()) {
                                        ((Activity) ((wrr) flutterBluePlusPlugin.A).b).startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 13106);
                                        ba20Var32.success(Boolean.TRUE);
                                        break;
                                    } else {
                                        ba20Var32.success(Boolean.FALSE);
                                        break;
                                    }
                                default:
                                    if (!z22) {
                                        ba20Var32.error("turnOff", oyr.p("Permission ", str42, " required to turn Bluetooth off"), null);
                                        break;
                                    } else if (!flutterBluePlusPlugin.x.isEnabled()) {
                                        ba20Var32.success(Boolean.TRUE);
                                        break;
                                    } else {
                                        ba20Var32.success(Boolean.valueOf(flutterBluePlusPlugin.x.disable()));
                                        break;
                                    }
                            }
                        }
                    });
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case -938333999:
                if (str3.equals("readCharacteristic")) {
                    HashMap hashMap6 = (HashMap) x920Var.b();
                    String str15 = (String) hashMap6.get("remote_id");
                    String str16 = (String) hashMap6.get("primary_service_uuid");
                    String str17 = (String) hashMap6.get("service_uuid");
                    String str18 = (String) hashMap6.get("characteristic_uuid");
                    Integer num3 = (Integer) hashMap6.get("instance_id");
                    BluetoothGatt bluetoothGatt3 = (BluetoothGatt) concurrentHashMap3.get(str15);
                    if (bluetoothGatt3 == null) {
                        ((ba20) da20Var).error("readCharacteristic", "device is disconnected", null);
                    } else {
                        u1n s3 = s(bluetoothGatt3, str16, str17, str18, num3);
                        String str19 = (String) s3.c;
                        if (str19 != null) {
                            ((ba20) da20Var).error("readCharacteristic", str19, null);
                        } else {
                            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = (BluetoothGattCharacteristic) s3.b;
                            if ((bluetoothGattCharacteristic2.getProperties() & 2) == 0) {
                                ((ba20) da20Var).error("readCharacteristic", "The READ property is not supported by this BLE characteristic", null);
                            } else if (bluetoothGatt3.readCharacteristic(bluetoothGattCharacteristic2)) {
                                ((ba20) da20Var).success(Boolean.TRUE);
                            } else {
                                ((ba20) da20Var).error("readCharacteristic", "gatt.readCharacteristic() returned false", null);
                            }
                        }
                    }
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case -867589363:
                if (str3.equals("readRssi")) {
                    BluetoothGatt bluetoothGatt4 = (BluetoothGatt) concurrentHashMap3.get((String) obj);
                    if (bluetoothGatt4 == null) {
                        ((ba20) da20Var).error("readRssi", "device is disconnected", null);
                    } else if (bluetoothGatt4.readRemoteRssi()) {
                        ((ba20) da20Var).success(Boolean.TRUE);
                    } else {
                        ((ba20) da20Var).error("readRssi", "gatt.readRemoteRssi() returned false", null);
                    }
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case -862429380:
                if (str3.equals("turnOn")) {
                    ArrayList arrayList5 = new ArrayList();
                    int i8 = Build.VERSION.SDK_INT;
                    if (i8 >= 31) {
                        arrayList5.add("android.permission.BLUETOOTH_CONNECT");
                    }
                    if (i8 <= 30) {
                        arrayList5.add("android.permission.BLUETOOTH");
                    }
                    final ba20 ba20Var4 = (ba20) da20Var;
                    final int i9 = 2;
                    j(arrayList5, new srr(this) { // from class: rrr
                        public final /* synthetic */ FlutterBluePlusPlugin b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.srr
                        public final void a(String str42, boolean z22) {
                            int i52 = i9;
                            ba20 ba20Var32 = ba20Var4;
                            FlutterBluePlusPlugin flutterBluePlusPlugin = this.b;
                            switch (i52) {
                                case 0:
                                    if (!z22) {
                                        ba20Var32.error("getSystemDevices", oyr.p("Permission ", str42, " required to get system devices"), null);
                                        break;
                                    } else {
                                        List<BluetoothDevice> connectedDevices = flutterBluePlusPlugin.w.getConnectedDevices(7);
                                        ArrayList arrayList32 = new ArrayList();
                                        Iterator<BluetoothDevice> it2 = connectedDevices.iterator();
                                        while (it2.hasNext()) {
                                            arrayList32.add(FlutterBluePlusPlugin.f(it2.next()));
                                        }
                                        HashMap hashMap22 = new HashMap();
                                        hashMap22.put("devices", arrayList32);
                                        ba20Var32.success(hashMap22);
                                        break;
                                    }
                                case 1:
                                    BluetoothAdapter bluetoothAdapter2 = flutterBluePlusPlugin.x;
                                    String name = bluetoothAdapter2 != null ? bluetoothAdapter2.getName() : Depends.NOT_AVAILABLE;
                                    if (name == null) {
                                        name = "";
                                    }
                                    ba20Var32.success(name);
                                    break;
                                case 2:
                                    if (!z22) {
                                        ba20Var32.error("turnOn", oyr.p("Permission ", str42, " required to turn Bluetooth on"), null);
                                        break;
                                    } else if (!flutterBluePlusPlugin.x.isEnabled()) {
                                        ((Activity) ((wrr) flutterBluePlusPlugin.A).b).startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 13106);
                                        ba20Var32.success(Boolean.TRUE);
                                        break;
                                    } else {
                                        ba20Var32.success(Boolean.FALSE);
                                        break;
                                    }
                                default:
                                    if (!z22) {
                                        ba20Var32.error("turnOff", oyr.p("Permission ", str42, " required to turn Bluetooth off"), null);
                                        break;
                                    } else if (!flutterBluePlusPlugin.x.isEnabled()) {
                                        ba20Var32.success(Boolean.TRUE);
                                        break;
                                    } else {
                                        ba20Var32.success(Boolean.valueOf(flutterBluePlusPlugin.x.disable()));
                                        break;
                                    }
                            }
                        }
                    });
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case -309915358:
                if (str3.equals("setLogLevel")) {
                    this.a = LogLevel.values()[((Integer) obj).intValue()];
                    ((ba20) da20Var).success(Boolean.TRUE);
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case -129472623:
                if (str3.equals("requestConnectionPriority")) {
                    HashMap hashMap7 = (HashMap) x920Var.b();
                    String str20 = (String) hashMap7.get("remote_id");
                    int intValue4 = ((Integer) hashMap7.get("connection_priority")).intValue();
                    BluetoothGatt bluetoothGatt5 = (BluetoothGatt) concurrentHashMap3.get(str20);
                    if (bluetoothGatt5 == null) {
                        ((ba20) da20Var).error("requestConnectionPriority", "device is disconnected", null);
                    } else if (bluetoothGatt5.requestConnectionPriority(h(intValue4))) {
                        ((ba20) da20Var).success(Boolean.TRUE);
                    } else {
                        ((ba20) da20Var).error("requestConnectionPriority", "gatt.requestConnectionPriority() returned false", null);
                    }
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case -55076540:
                if (str3.equals("getAdapterName")) {
                    ArrayList arrayList6 = new ArrayList();
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 31) {
                        arrayList6.add("android.permission.BLUETOOTH_CONNECT");
                    }
                    if (i10 <= 30) {
                        arrayList6.add("android.permission.BLUETOOTH");
                    }
                    final ba20 ba20Var5 = (ba20) da20Var;
                    final int i11 = 1;
                    j(arrayList6, new srr(this) { // from class: rrr
                        public final /* synthetic */ FlutterBluePlusPlugin b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.srr
                        public final void a(String str42, boolean z22) {
                            int i52 = i11;
                            ba20 ba20Var32 = ba20Var5;
                            FlutterBluePlusPlugin flutterBluePlusPlugin = this.b;
                            switch (i52) {
                                case 0:
                                    if (!z22) {
                                        ba20Var32.error("getSystemDevices", oyr.p("Permission ", str42, " required to get system devices"), null);
                                        break;
                                    } else {
                                        List<BluetoothDevice> connectedDevices = flutterBluePlusPlugin.w.getConnectedDevices(7);
                                        ArrayList arrayList32 = new ArrayList();
                                        Iterator<BluetoothDevice> it2 = connectedDevices.iterator();
                                        while (it2.hasNext()) {
                                            arrayList32.add(FlutterBluePlusPlugin.f(it2.next()));
                                        }
                                        HashMap hashMap22 = new HashMap();
                                        hashMap22.put("devices", arrayList32);
                                        ba20Var32.success(hashMap22);
                                        break;
                                    }
                                case 1:
                                    BluetoothAdapter bluetoothAdapter2 = flutterBluePlusPlugin.x;
                                    String name = bluetoothAdapter2 != null ? bluetoothAdapter2.getName() : Depends.NOT_AVAILABLE;
                                    if (name == null) {
                                        name = "";
                                    }
                                    ba20Var32.success(name);
                                    break;
                                case 2:
                                    if (!z22) {
                                        ba20Var32.error("turnOn", oyr.p("Permission ", str42, " required to turn Bluetooth on"), null);
                                        break;
                                    } else if (!flutterBluePlusPlugin.x.isEnabled()) {
                                        ((Activity) ((wrr) flutterBluePlusPlugin.A).b).startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 13106);
                                        ba20Var32.success(Boolean.TRUE);
                                        break;
                                    } else {
                                        ba20Var32.success(Boolean.FALSE);
                                        break;
                                    }
                                default:
                                    if (!z22) {
                                        ba20Var32.error("turnOff", oyr.p("Permission ", str42, " required to turn Bluetooth off"), null);
                                        break;
                                    } else if (!flutterBluePlusPlugin.x.isEnabled()) {
                                        ba20Var32.success(Boolean.TRUE);
                                        break;
                                    } else {
                                        ba20Var32.success(Boolean.valueOf(flutterBluePlusPlugin.x.disable()));
                                        break;
                                    }
                            }
                        }
                    });
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case 37093023:
                if (str3.equals("requestMtu")) {
                    HashMap hashMap8 = (HashMap) x920Var.b();
                    String str21 = (String) hashMap8.get("remote_id");
                    int intValue5 = ((Integer) hashMap8.get("mtu")).intValue();
                    BluetoothGatt bluetoothGatt6 = (BluetoothGatt) concurrentHashMap3.get(str21);
                    if (bluetoothGatt6 == null) {
                        ((ba20) da20Var).error("requestMtu", "device is disconnected", null);
                    } else if (bluetoothGatt6.requestMtu(intValue5)) {
                        ((ba20) da20Var).success(Boolean.TRUE);
                    } else {
                        ((ba20) da20Var).error("requestMtu", "gatt.requestMtu() returned false", null);
                    }
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case 131459558:
                if (str3.equals("setNotifyValue")) {
                    HashMap hashMap9 = (HashMap) x920Var.b();
                    String str22 = (String) hashMap9.get("remote_id");
                    String str23 = (String) hashMap9.get("primary_service_uuid");
                    String str24 = (String) hashMap9.get("service_uuid");
                    String str25 = (String) hashMap9.get("characteristic_uuid");
                    Integer num4 = (Integer) hashMap9.get("instance_id");
                    boolean booleanValue3 = ((Boolean) hashMap9.get("force_indications")).booleanValue();
                    boolean booleanValue4 = ((Boolean) hashMap9.get("enable")).booleanValue();
                    BluetoothGatt bluetoothGatt7 = (BluetoothGatt) concurrentHashMap3.get(str22);
                    if (bluetoothGatt7 == null) {
                        ((ba20) da20Var).error("setNotifyValue", "device is disconnected", null);
                    } else {
                        u1n s4 = s(bluetoothGatt7, str23, str24, str25, num4);
                        String str26 = (String) s4.c;
                        if (str26 != null) {
                            ((ba20) da20Var).error("setNotifyValue", str26, null);
                        } else {
                            BluetoothGattCharacteristic bluetoothGattCharacteristic3 = (BluetoothGattCharacteristic) s4.b;
                            if (bluetoothGatt7.setCharacteristicNotification(bluetoothGattCharacteristic3, booleanValue4)) {
                                BluetoothGattDescriptor k2 = k("2902", bluetoothGattCharacteristic3.getDescriptors());
                                if (k2 == null) {
                                    t(LogLevel.WARNING, str2.concat(v(bluetoothGattCharacteristic3.getUuid())));
                                    ((ba20) da20Var).success(Boolean.FALSE);
                                    semaphore.release();
                                    return;
                                }
                                if (booleanValue4) {
                                    boolean z3 = (bluetoothGattCharacteristic3.getProperties() & 16) > 0;
                                    boolean z4 = (bluetoothGattCharacteristic3.getProperties() & 32) > 0;
                                    if (!z4 && !z3) {
                                        ((ba20) da20Var).error("setNotifyValue", "neither NOTIFY nor INDICATE properties are supported by this BLE characteristic", null);
                                    } else if (!booleanValue3 || z4) {
                                        bArr = z4 ? BluetoothGattDescriptor.ENABLE_INDICATION_VALUE : null;
                                        if (z3) {
                                            bArr = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
                                        }
                                        if (booleanValue3) {
                                            bArr = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
                                        }
                                    } else {
                                        ((ba20) da20Var).error("setNotifyValue", "INDICATE not supported by this BLE characteristic", null);
                                    }
                                } else {
                                    bArr = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
                                }
                                if (str23 == null) {
                                    str23 = "";
                                }
                                concurrentHashMap2.put(str22 + ":" + str23 + ":" + str24 + ":" + str25 + ":" + num4 + ":2902", bArr);
                                if (Build.VERSION.SDK_INT >= 33) {
                                    writeDescriptor2 = bluetoothGatt7.writeDescriptor(k2, bArr);
                                    if (writeDescriptor2 != 0) {
                                        ((ba20) da20Var).error("setNotifyValue", "gatt.writeDescriptor() returned " + writeDescriptor2 + " : " + e(writeDescriptor2), null);
                                    }
                                    ((ba20) da20Var).success(Boolean.TRUE);
                                } else if (k2.setValue(bArr)) {
                                    if (!bluetoothGatt7.writeDescriptor(k2)) {
                                        ((ba20) da20Var).error("setNotifyValue", "gatt.writeDescriptor() returned false", null);
                                    }
                                    ((ba20) da20Var).success(Boolean.TRUE);
                                } else {
                                    ((ba20) da20Var).error("setNotifyValue", "cccd.setValue() returned false", null);
                                }
                            } else {
                                ((ba20) da20Var).error("setNotifyValue", "gatt.setCharacteristicNotification(" + booleanValue4 + ") returned false", null);
                            }
                        }
                    }
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case 162324162:
                if (str3.equals("setPreferredPhy")) {
                    HashMap hashMap10 = (HashMap) x920Var.b();
                    String str27 = (String) hashMap10.get("remote_id");
                    int intValue6 = ((Integer) hashMap10.get("tx_phy")).intValue();
                    int intValue7 = ((Integer) hashMap10.get("rx_phy")).intValue();
                    int intValue8 = ((Integer) hashMap10.get("phy_options")).intValue();
                    BluetoothGatt bluetoothGatt8 = (BluetoothGatt) concurrentHashMap3.get(str27);
                    if (bluetoothGatt8 == null) {
                        ((ba20) da20Var).error("setPreferredPhy", "device is disconnected", null);
                    } else {
                        bluetoothGatt8.setPreferredPhy(intValue6, intValue7, intValue8);
                        ((ba20) da20Var).success(Boolean.TRUE);
                    }
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case 206669221:
                if (str3.equals("readDescriptor")) {
                    HashMap hashMap11 = (HashMap) x920Var.b();
                    String str28 = (String) hashMap11.get("remote_id");
                    String str29 = (String) hashMap11.get("primary_service_uuid");
                    String str30 = (String) hashMap11.get("service_uuid");
                    String str31 = (String) hashMap11.get("characteristic_uuid");
                    Integer num5 = (Integer) hashMap11.get("instance_id");
                    String str32 = (String) hashMap11.get("descriptor_uuid");
                    BluetoothGatt bluetoothGatt9 = (BluetoothGatt) concurrentHashMap3.get(str28);
                    if (bluetoothGatt9 == null) {
                        ((ba20) da20Var).error("readDescriptor", "device is disconnected", null);
                    } else {
                        u1n s5 = s(bluetoothGatt9, str29, str30, str31, num5);
                        String str33 = (String) s5.c;
                        if (str33 != null) {
                            ((ba20) da20Var).error("readDescriptor", str33, null);
                        } else {
                            BluetoothGattDescriptor k3 = k(str32, ((BluetoothGattCharacteristic) s5.b).getDescriptors());
                            if (k3 == null) {
                                ((ba20) da20Var).error("writeDescriptor", "descriptor not found on characteristic. (desc: " + str32 + " chr: " + str31 + Extension.C_BRAKE, null);
                            } else if (bluetoothGatt9.readDescriptor(k3)) {
                                ((ba20) da20Var).success(Boolean.TRUE);
                            } else {
                                ((ba20) da20Var).error("readDescriptor", "gatt.readDescriptor() returned false", null);
                            }
                        }
                    }
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case 407411460:
                if (str3.equals("getPhySupport")) {
                    HashMap hashMap12 = new HashMap();
                    hashMap12.put("le_2M", Boolean.valueOf(this.x.isLe2MPhySupported()));
                    hashMap12.put("le_coded", Boolean.valueOf(this.x.isLeCodedPhySupported()));
                    ((ba20) da20Var).success(hashMap12);
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case 530405532:
                if (str3.equals("disconnect")) {
                    String str34 = (String) obj;
                    BluetoothGatt bluetoothGatt10 = (BluetoothGatt) concurrentHashMap.get(str34);
                    if (bluetoothGatt10 != null) {
                        t(logLevel, "disconnect: cancelling connection in progress");
                    }
                    if (bluetoothGatt10 == null) {
                        bluetoothGatt10 = (BluetoothGatt) concurrentHashMap3.get(str34);
                    }
                    ConcurrentHashMap concurrentHashMap4 = this.H;
                    if (bluetoothGatt10 == null && (bluetoothGatt10 = (BluetoothGatt) concurrentHashMap4.get(str34)) != null) {
                        t(logLevel, "already disconnected. disabling autoconnect");
                        concurrentHashMap4.remove(str34);
                        bluetoothGatt10.disconnect();
                        bluetoothGatt10.close();
                        ((ba20) da20Var).success(Boolean.FALSE);
                        semaphore.release();
                        return;
                    }
                    if (bluetoothGatt10 == null) {
                        t(logLevel, "already disconnected");
                        ((ba20) da20Var).success(Boolean.FALSE);
                        semaphore.release();
                        return;
                    }
                    concurrentHashMap4.remove(str34);
                    bluetoothGatt10.disconnect();
                    if (concurrentHashMap.get(str34) != null) {
                        concurrentHashMap.remove(str34);
                        bluetoothGatt10.close();
                        HashMap hashMap13 = new HashMap();
                        hashMap13.put("remote_id", str34);
                        hashMap13.put("connection_state", 0);
                        hashMap13.put("disconnect_reason_code", 23789258);
                        hashMap13.put("disconnect_reason_string", "connection canceled");
                        q("OnConnectionStateChanged", hashMap13);
                    }
                    ((ba20) da20Var).success(Boolean.TRUE);
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case 916212952:
                if (str3.equals("getBondState")) {
                    String str35 = (String) obj;
                    BluetoothDevice remoteDevice = this.x.getRemoteDevice(str35);
                    HashMap hashMap14 = new HashMap();
                    hashMap14.put("remote_id", str35);
                    int bondState = remoteDevice.getBondState();
                    hashMap14.put("bond_state", Integer.valueOf(bondState != 11 ? bondState != 12 ? 0 : 2 : 1));
                    hashMap14.put("prev_state", null);
                    ((ba20) da20Var).success(hashMap14);
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case 951351530:
                if (str3.equals("connect")) {
                    HashMap hashMap15 = (HashMap) x920Var.b();
                    final String str36 = (String) hashMap15.get("remote_id");
                    final boolean z5 = ((Integer) hashMap15.get("auto_connect")).intValue() != 0;
                    ArrayList arrayList7 = new ArrayList();
                    if (Build.VERSION.SDK_INT >= 31) {
                        arrayList7.add("android.permission.BLUETOOTH_CONNECT");
                    }
                    final ba20 ba20Var6 = (ba20) da20Var;
                    j(arrayList7, new srr() { // from class: com.lib.flutter_blue_plus.a
                        @Override // defpackage.srr
                        public final void a(String str37, boolean z6) {
                            FlutterBluePlusPlugin flutterBluePlusPlugin = FlutterBluePlusPlugin.this;
                            ConcurrentHashMap concurrentHashMap5 = flutterBluePlusPlugin.D;
                            ba20 ba20Var7 = ba20Var6;
                            if (!z6) {
                                ba20Var7.error("connect", oyr.p("Permission ", str37, " required for new connection"), null);
                                return;
                            }
                            try {
                                if (flutterBluePlusPlugin.x.getState() == 12) {
                                    String str38 = str36;
                                    if (concurrentHashMap5.get(str38) != null) {
                                        flutterBluePlusPlugin.t(FlutterBluePlusPlugin.LogLevel.DEBUG, "already connecting");
                                        ba20Var7.success(Boolean.TRUE);
                                        return;
                                    }
                                    if (flutterBluePlusPlugin.C.get(str38) != null) {
                                        flutterBluePlusPlugin.t(FlutterBluePlusPlugin.LogLevel.DEBUG, "already connected");
                                        ba20Var7.success(Boolean.FALSE);
                                        return;
                                    }
                                    BluetoothDevice remoteDevice2 = flutterBluePlusPlugin.x.getRemoteDevice(str38);
                                    Application application = flutterBluePlusPlugin.b;
                                    BluetoothGattCallback bluetoothGattCallback = flutterBluePlusPlugin.T;
                                    boolean z7 = z5;
                                    BluetoothGatt connectGatt = remoteDevice2.connectGatt(application, z7, bluetoothGattCallback, 2);
                                    if (connectGatt == null) {
                                        ba20Var7.error("connect", "device.connectGatt returned null", null);
                                        return;
                                    }
                                    concurrentHashMap5.put(str38, connectGatt);
                                    ConcurrentHashMap concurrentHashMap6 = flutterBluePlusPlugin.H;
                                    if (z7) {
                                        concurrentHashMap6.put(str38, connectGatt);
                                    } else {
                                        concurrentHashMap6.remove(str38);
                                    }
                                    ba20Var7.success(Boolean.TRUE);
                                    return;
                                }
                            } catch (Exception unused3) {
                            }
                            ba20Var7.error("connect", "Bluetooth must be turned on", null);
                        }
                    });
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case 1098040679:
                if (str3.equals("removeBond")) {
                    BluetoothDevice remoteDevice2 = this.x.getRemoteDevice((String) obj);
                    if (remoteDevice2.getBondState() == 10) {
                        t(LogLevel.WARNING, "already not bonded");
                        ((ba20) da20Var).success(Boolean.FALSE);
                    } else if (((Boolean) remoteDevice2.getClass().getMethod("removeBond", null).invoke(remoteDevice2, null)).booleanValue()) {
                        ((ba20) da20Var).success(Boolean.TRUE);
                    } else {
                        ((ba20) da20Var).error("removeBond", "device.removeBond() returned false", null);
                    }
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case 1158616740:
                if (str3.equals("isSupported")) {
                    ((ba20) da20Var).success(Boolean.valueOf(this.x != null));
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case 1368682975:
                if (str3.equals("createBond")) {
                    HashMap hashMap16 = (HashMap) x920Var.b();
                    String str37 = (String) hashMap16.get("remote_id");
                    if (hashMap16.get("pin") != null) {
                        this.F.put(str37, (byte[]) hashMap16.get("pin"));
                    }
                    if (((BluetoothGatt) concurrentHashMap3.get(str37)) == null) {
                        ((ba20) da20Var).error("createBond", "device is disconnected", null);
                    } else {
                        BluetoothDevice remoteDevice3 = this.x.getRemoteDevice(str37);
                        if (remoteDevice3.getBondState() == 12) {
                            t(LogLevel.WARNING, "already bonded");
                            ((ba20) da20Var).success(Boolean.FALSE);
                        } else if (remoteDevice3.getBondState() == 11) {
                            t(LogLevel.WARNING, "bonding already in progress");
                            ((ba20) da20Var).success(Boolean.TRUE);
                        } else if (remoteDevice3.createBond()) {
                            ((ba20) da20Var).success(Boolean.TRUE);
                        } else {
                            ((ba20) da20Var).error("createBond", "device.createBond() returned false", null);
                        }
                    }
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case 1614410599:
                if (str3.equals("discoverServices")) {
                    BluetoothGatt bluetoothGatt11 = (BluetoothGatt) concurrentHashMap3.get((String) obj);
                    if (bluetoothGatt11 == null) {
                        ((ba20) da20Var).error("discoverServices", "device is disconnected", null);
                    } else if (bluetoothGatt11.discoverServices()) {
                        ((ba20) da20Var).success(Boolean.TRUE);
                    } else {
                        ((ba20) da20Var).error("discoverServices", "gatt.discoverServices() returned false", null);
                    }
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case 1661332358:
                if (str3.equals("connectedCount")) {
                    t(logLevel, "connectedPeripherals: " + concurrentHashMap3.size());
                    if (concurrentHashMap3.size() == 0) {
                        t(logLevel, "Hot Restart: complete");
                    }
                    ((ba20) da20Var).success(Integer.valueOf(concurrentHashMap3.size()));
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case 1714778527:
                if (str3.equals("stopScan")) {
                    BluetoothLeScanner bluetoothLeScanner2 = this.x.getBluetoothLeScanner();
                    if (bluetoothLeScanner2 != null) {
                        bluetoothLeScanner2.stopScan(o());
                        this.y = false;
                    }
                    ((ba20) da20Var).success(Boolean.TRUE);
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case 1724190684:
                if (str3.equals("setOptions")) {
                    ((ba20) da20Var).success(Boolean.TRUE);
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            case 1911397115:
                if (str3.equals("clearGattCache")) {
                    BluetoothGatt bluetoothGatt12 = (BluetoothGatt) concurrentHashMap3.get((String) obj);
                    if (bluetoothGatt12 == null) {
                        ((ba20) da20Var).error("clearGattCache", "device is disconnected", null);
                    } else {
                        Method method = bluetoothGatt12.getClass().getMethod("refresh", null);
                        if (method == null) {
                            ((ba20) da20Var).error("clearGattCache", "unsupported on this android version", null);
                        } else {
                            method.invoke(bluetoothGatt12, null);
                            ((ba20) da20Var).success(Boolean.TRUE);
                        }
                    }
                    semaphore.release();
                    return;
                }
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
            default:
                ((ba20) da20Var).notImplemented();
                semaphore.release();
                return;
        }
    }

    @Override // defpackage.r30
    public final void onReattachedToActivityForConfigChanges(l40 l40Var) {
        t(LogLevel.DEBUG, "onReattachedToActivityForConfigChanges");
        onAttachedToActivity(l40Var);
    }

    @Override // defpackage.ozc0
    public final boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.N;
        srr srrVar = (srr) hashMap.get(valueOf);
        hashMap.remove(Integer.valueOf(i));
        if (srrVar == null || iArr.length <= 0) {
            return false;
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] != 0) {
                srrVar.a(strArr[i2], false);
                return true;
            }
        }
        srrVar.a(null, true);
        return true;
    }

    public final void q(final String str, final HashMap hashMap) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.lib.flutter_blue_plus.b
            @Override // java.lang.Runnable
            public final void run() {
                FlutterBluePlusPlugin flutterBluePlusPlugin = FlutterBluePlusPlugin.this;
                ea20 ea20Var = flutterBluePlusPlugin.c;
                String str2 = str;
                if (ea20Var != null) {
                    ea20Var.a(str2, hashMap, null);
                } else {
                    flutterBluePlusPlugin.t(FlutterBluePlusPlugin.LogLevel.WARNING, "invokeMethodUIThread: tried to call method on closed channel: ".concat(str2));
                }
            }
        });
    }

    public final boolean r() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        LocationManager locationManager = (LocationManager) this.z.a.getSystemService("location");
        return locationManager != null && locationManager.isLocationEnabled();
    }

    public final void t(LogLevel logLevel, String str) {
        if (logLevel.ordinal() <= this.a.ordinal() && logLevel.ordinal() == 1) {
            Log.e("[FBP-Android]", "[FBP] ".concat(str));
        }
    }
}
