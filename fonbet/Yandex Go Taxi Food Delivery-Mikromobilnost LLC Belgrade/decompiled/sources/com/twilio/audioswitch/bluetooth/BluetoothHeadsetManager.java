package com.twilio.audioswitch.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import defpackage.b66;
import defpackage.c66;
import defpackage.df3;
import defpackage.e66;
import defpackage.f66;
import defpackage.g66;
import defpackage.h66;
import defpackage.i66;
import defpackage.if3;
import defpackage.j0b0;
import defpackage.j66;
import defpackage.jl40;
import defpackage.l66;
import defpackage.m66;
import defpackage.n9f0;
import defpackage.ogz;
import defpackage.p2x0;
import defpackage.qoi0;
import defpackage.vr;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0005jkVPGBs\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u001f¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u001f¢\u0006\u0004\b,\u0010+J\r\u0010-\u001a\u00020\u001f¢\u0006\u0004\b-\u0010+J\r\u0010.\u001a\u00020\u0017¢\u0006\u0004\b.\u0010/J\u0019\u00103\u001a\u0004\u0018\u0001022\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u00020\u0017H\u0000¢\u0006\u0004\b5\u0010/J\u0019\u00108\u001a\u00020\u00172\b\u00107\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u001fH\u0002¢\u0006\u0004\b:\u0010+J\u000f\u0010;\u001a\u00020\u001fH\u0002¢\u0006\u0004\b;\u0010+J\u000f\u0010<\u001a\u00020\u0017H\u0002¢\u0006\u0004\b<\u0010/J\u0011\u0010=\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0017H\u0002¢\u0006\u0004\b?\u0010/J\u000f\u0010@\u001a\u00020\u0017H\u0002¢\u0006\u0004\b@\u0010/J\u0015\u0010B\u001a\u0004\u0018\u00010A*\u00020$H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u00172\u0006\u0010D\u001a\u00020AH\u0002¢\u0006\u0004\bE\u0010FR0\u0010I\u001a\u00020G2\u0006\u0010H\u001a\u00020G8\u0000@@X\u0081\u000e¢\u0006\u0018\n\u0004\bI\u0010J\u0012\u0004\bO\u0010+\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010Q\u001a\u00060PR\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bU\u0010+\u001a\u0004\bS\u0010TR$\u0010W\u001a\u00060VR\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bW\u0010X\u0012\u0004\b[\u0010+\u001a\u0004\bY\u0010ZR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\\R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010]R\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010^\u001a\u0004\b_\u0010`R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010)R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010fR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010gR\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010h¨\u0006l"}, d2 = {"Lcom/twilio/audioswitch/bluetooth/BluetoothHeadsetManager;", "Landroid/bluetooth/BluetoothProfile$ServiceListener;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Logz;", "logger", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "Lif3;", "audioDeviceManager", "Le66;", "headsetListener", "Landroid/os/Handler;", "bluetoothScoHandler", "Lp2x0;", "systemClockWrapper", "Ll66;", "bluetoothIntentProcessor", "Landroid/bluetooth/BluetoothHeadset;", "headsetProxy", "Lj0b0;", "permissionsRequestStrategy", "", "hasRegisteredReceivers", "<init>", "(Landroid/content/Context;Logz;Landroid/bluetooth/BluetoothAdapter;Lif3;Le66;Landroid/os/Handler;Lp2x0;Ll66;Landroid/bluetooth/BluetoothHeadset;Lj0b0;Z)V", "", "profile", "Landroid/bluetooth/BluetoothProfile;", "bluetoothProfile", "Lzy11;", "onServiceConnected", "(ILandroid/bluetooth/BluetoothProfile;)V", "onServiceDisconnected", "(I)V", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "start", "(Le66;)V", "stop", "()V", "activate", "deactivate", "hasActivationError", "()Z", "", "bluetoothHeadsetName", "Ldf3;", "getHeadset", "(Ljava/lang/String;)Ldf3;", "hasPermissions$audioswitch_release", "hasPermissions", "intentAction", "isCorrectIntentAction", "(Ljava/lang/String;)Z", "connect", "disconnect", "hasActiveHeadsetChanged", "getHeadsetName", "()Ljava/lang/String;", "hasActiveHeadset", "hasConnectedDevice", "Lb66;", "getHeadsetDevice", "(Landroid/content/Intent;)Lb66;", "deviceWrapper", "isHeadsetDevice", "(Lb66;)Z", "Lj66;", "value", "headsetState", "Lj66;", "getHeadsetState$audioswitch_release", "()Lj66;", "setHeadsetState$audioswitch_release", "(Lj66;)V", "getHeadsetState$audioswitch_release$annotations", "Lh66;", "enableBluetoothScoJob", "Lh66;", "getEnableBluetoothScoJob$audioswitch_release", "()Lh66;", "getEnableBluetoothScoJob$audioswitch_release$annotations", "Lg66;", "disableBluetoothScoJob", "Lg66;", "getDisableBluetoothScoJob$audioswitch_release", "()Lg66;", "getDisableBluetoothScoJob$audioswitch_release$annotations", "Landroid/content/Context;", "Logz;", "Landroid/bluetooth/BluetoothAdapter;", "getBluetoothAdapter$audioswitch_release", "()Landroid/bluetooth/BluetoothAdapter;", "Le66;", "getHeadsetListener", "()Le66;", "setHeadsetListener", "Ll66;", "Landroid/bluetooth/BluetoothHeadset;", "Lj0b0;", "Z", "Companion", "f66", "vr", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes11.dex */
public final class BluetoothHeadsetManager extends BroadcastReceiver implements BluetoothProfile.ServiceListener {
    public static final f66 Companion = new f66();
    private final BluetoothAdapter bluetoothAdapter;
    private final l66 bluetoothIntentProcessor;
    private final Context context;
    private final g66 disableBluetoothScoJob;
    private final h66 enableBluetoothScoJob;
    private boolean hasRegisteredReceivers;
    private e66 headsetListener;
    private BluetoothHeadset headsetProxy;
    private j66 headsetState;
    private final ogz logger;
    private final j0b0 permissionsRequestStrategy;

    public /* synthetic */ BluetoothHeadsetManager(Context context, ogz ogzVar, BluetoothAdapter bluetoothAdapter, if3 if3Var, e66 e66Var, Handler handler, p2x0 p2x0Var, l66 l66Var, BluetoothHeadset bluetoothHeadset, j0b0 j0b0Var, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, ogzVar, bluetoothAdapter, if3Var, (i & 16) != 0 ? null : e66Var, (i & 32) != 0 ? new Handler(Looper.getMainLooper()) : handler, (i & 64) != 0 ? new p2x0() : p2x0Var, (i & 128) != 0 ? new m66() : l66Var, (i & 256) != 0 ? null : bluetoothHeadset, (i & 512) != 0 ? new vr(context, (char) 0) : j0b0Var, (i & 1024) != 0 ? false : z);
    }

    private final void connect() {
        if (hasActiveHeadset()) {
            return;
        }
        setHeadsetState$audioswitch_release(i66.d);
    }

    private final void disconnect() {
        setHeadsetState$audioswitch_release(hasActiveHeadset() ? i66.a : hasConnectedDevice() ? i66.d : i66.e);
    }

    public static /* synthetic */ void getDisableBluetoothScoJob$audioswitch_release$annotations() {
    }

    public static /* synthetic */ void getEnableBluetoothScoJob$audioswitch_release$annotations() {
    }

    private final b66 getHeadsetDevice(Intent intent) {
        ((m66) this.bluetoothIntentProcessor).getClass();
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        c66 c66Var = bluetoothDevice != null ? new c66(bluetoothDevice) : null;
        if (c66Var == null || !isHeadsetDevice(c66Var)) {
            return null;
        }
        return c66Var;
    }

    private final String getHeadsetName() {
        List<BluetoothDevice> connectedDevices;
        Object obj;
        BluetoothHeadset bluetoothHeadset = this.headsetProxy;
        if (bluetoothHeadset != null && (connectedDevices = bluetoothHeadset.getConnectedDevices()) != null) {
            if (connectedDevices.size() > 1 && hasActiveHeadset()) {
                Iterator<T> it = connectedDevices.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (bluetoothHeadset.isAudioConnected((BluetoothDevice) obj)) {
                        break;
                    }
                }
                BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                String name = bluetoothDevice != null ? bluetoothDevice.getName() : null;
                ((n9f0) this.logger).getClass();
                return name;
            }
            if (connectedDevices.size() == 1) {
                String name2 = ((BluetoothDevice) a.P(connectedDevices)).getName();
                ((n9f0) this.logger).getClass();
                return name2;
            }
            ((n9f0) this.logger).getClass();
        }
        return null;
    }

    public static /* synthetic */ void getHeadsetState$audioswitch_release$annotations() {
    }

    private final boolean hasActiveHeadset() {
        Boolean bool;
        boolean z;
        BluetoothHeadset bluetoothHeadset = this.headsetProxy;
        if (bluetoothHeadset != null) {
            List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
            if (connectedDevices != null) {
                List<BluetoothDevice> list = connectedDevices;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (bluetoothHeadset.isAudioConnected((BluetoothDevice) it.next())) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    private final boolean hasActiveHeadsetChanged() {
        return jl40.l(this.headsetState, i66.a) && hasConnectedDevice() && !hasActiveHeadset();
    }

    private final boolean hasConnectedDevice() {
        BluetoothHeadset bluetoothHeadset = this.headsetProxy;
        if (bluetoothHeadset == null) {
            return false;
        }
        Boolean valueOf = bluetoothHeadset.getConnectedDevices() != null ? Boolean.valueOf(!r0.isEmpty()) : null;
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    private final boolean isCorrectIntentAction(String intentAction) {
        return jl40.l(intentAction, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED") || jl40.l(intentAction, "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
    }

    private final boolean isHeadsetDevice(b66 deviceWrapper) {
        Integer num = ((c66) deviceWrapper).c;
        if (num == null) {
            return false;
        }
        int intValue = num.intValue();
        return intValue == 1032 || intValue == 1028 || intValue == 1056 || intValue == 1048 || intValue == 7936;
    }

    public final void activate() {
        if (!hasPermissions$audioswitch_release()) {
            ((n9f0) this.logger).getClass();
            return;
        }
        if (jl40.l(this.headsetState, i66.d) || jl40.l(this.headsetState, i66.c)) {
            this.enableBluetoothScoJob.c();
            return;
        }
        ogz ogzVar = this.logger;
        qoi0.a(this.headsetState.getClass()).d();
        ((n9f0) ogzVar).getClass();
    }

    public final void deactivate() {
        if (jl40.l(this.headsetState, i66.a)) {
            this.disableBluetoothScoJob.c();
            return;
        }
        ogz ogzVar = this.logger;
        qoi0.a(this.headsetState.getClass()).d();
        ((n9f0) ogzVar).getClass();
    }

    /* renamed from: getBluetoothAdapter$audioswitch_release, reason: from getter */
    public final BluetoothAdapter getBluetoothAdapter() {
        return this.bluetoothAdapter;
    }

    /* renamed from: getDisableBluetoothScoJob$audioswitch_release, reason: from getter */
    public final g66 getDisableBluetoothScoJob() {
        return this.disableBluetoothScoJob;
    }

    /* renamed from: getEnableBluetoothScoJob$audioswitch_release, reason: from getter */
    public final h66 getEnableBluetoothScoJob() {
        return this.enableBluetoothScoJob;
    }

    public final df3 getHeadset(String bluetoothHeadsetName) {
        if (!hasPermissions$audioswitch_release()) {
            ((n9f0) this.logger).getClass();
            return null;
        }
        if (jl40.l(this.headsetState, i66.e)) {
            return null;
        }
        if (bluetoothHeadsetName == null) {
            bluetoothHeadsetName = getHeadsetName();
        }
        return bluetoothHeadsetName != null ? new df3(bluetoothHeadsetName) : new df3(0);
    }

    public final e66 getHeadsetListener() {
        return null;
    }

    /* renamed from: getHeadsetState$audioswitch_release, reason: from getter */
    public final j66 getHeadsetState() {
        return this.headsetState;
    }

    public final boolean hasActivationError() {
        if (hasPermissions$audioswitch_release()) {
            return jl40.l(this.headsetState, i66.c);
        }
        ((n9f0) this.logger).getClass();
        return false;
    }

    public final boolean hasPermissions$audioswitch_release() {
        Context context = ((vr) this.permissionsRequestStrategy).a;
        int i = context.getApplicationInfo().targetSdkVersion;
        if (1 <= i && 30 >= i) {
            if (context.checkPermission("android.permission.BLUETOOTH", Process.myPid(), Process.myUid()) != 0) {
                return false;
            }
        } else if (context.checkPermission("android.permission.BLUETOOTH_CONNECT", Process.myPid(), Process.myUid()) != 0) {
            return false;
        }
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        b66 headsetDevice;
        if (!isCorrectIntentAction(intent.getAction()) || (headsetDevice = getHeadsetDevice(intent)) == null) {
            return;
        }
        int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
        if (intExtra == 0) {
            ogz ogzVar = this.logger;
            headsetDevice.toString();
            ((n9f0) ogzVar).getClass();
            disconnect();
            return;
        }
        if (intExtra == 2) {
            ogz ogzVar2 = this.logger;
            headsetDevice.toString();
            ((n9f0) ogzVar2).getClass();
            connect();
            return;
        }
        if (intExtra != 10) {
            if (intExtra != 12) {
                return;
            }
            ogz ogzVar3 = this.logger;
            headsetDevice.toString();
            ((n9f0) ogzVar3).getClass();
            this.enableBluetoothScoJob.b();
            setHeadsetState$audioswitch_release(i66.a);
            return;
        }
        ogz ogzVar4 = this.logger;
        headsetDevice.toString();
        ((n9f0) ogzVar4).getClass();
        this.disableBluetoothScoJob.b();
        if (hasActiveHeadsetChanged()) {
            this.enableBluetoothScoJob.c();
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceConnected(int profile, BluetoothProfile bluetoothProfile) {
        BluetoothHeadset bluetoothHeadset = (BluetoothHeadset) bluetoothProfile;
        this.headsetProxy = bluetoothHeadset;
        for (BluetoothDevice bluetoothDevice : bluetoothHeadset.getConnectedDevices()) {
            ogz ogzVar = this.logger;
            bluetoothDevice.getName();
            ((n9f0) ogzVar).getClass();
        }
        if (hasConnectedDevice()) {
            connect();
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceDisconnected(int profile) {
        ((n9f0) this.logger).getClass();
        setHeadsetState$audioswitch_release(i66.e);
    }

    public final void setHeadsetListener(e66 e66Var) {
    }

    public final void setHeadsetState$audioswitch_release(j66 j66Var) {
        if (jl40.l(this.headsetState, j66Var)) {
            return;
        }
        this.headsetState = j66Var;
        ogz ogzVar = this.logger;
        qoi0.a(j66Var.getClass()).d();
        ((n9f0) ogzVar).getClass();
        if (j66Var.equals(i66.e)) {
            this.enableBluetoothScoJob.b();
        }
    }

    public final void start(e66 headsetListener) {
        if (!hasPermissions$audioswitch_release()) {
            ((n9f0) this.logger).getClass();
            return;
        }
        this.bluetoothAdapter.getProfileProxy(this.context, this, 1);
        if (this.hasRegisteredReceivers) {
            return;
        }
        this.context.registerReceiver(this, new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"));
        this.context.registerReceiver(this, new IntentFilter("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED"));
        this.hasRegisteredReceivers = true;
    }

    public final void stop() {
        if (!hasPermissions$audioswitch_release()) {
            ((n9f0) this.logger).getClass();
            return;
        }
        this.bluetoothAdapter.closeProfileProxy(1, this.headsetProxy);
        if (this.hasRegisteredReceivers) {
            this.context.unregisterReceiver(this);
            this.hasRegisteredReceivers = false;
        }
    }

    public BluetoothHeadsetManager(Context context, ogz ogzVar, BluetoothAdapter bluetoothAdapter, if3 if3Var, e66 e66Var, Handler handler, p2x0 p2x0Var, l66 l66Var, BluetoothHeadset bluetoothHeadset, j0b0 j0b0Var, boolean z) {
        this.context = context;
        this.logger = ogzVar;
        this.bluetoothAdapter = bluetoothAdapter;
        this.bluetoothIntentProcessor = l66Var;
        this.headsetProxy = bluetoothHeadset;
        this.permissionsRequestStrategy = j0b0Var;
        this.hasRegisteredReceivers = z;
        this.headsetState = i66.e;
        this.enableBluetoothScoJob = new h66(this, ogzVar, if3Var, handler, p2x0Var);
        this.disableBluetoothScoJob = new g66(this, ogzVar, if3Var, handler, p2x0Var);
    }
}
