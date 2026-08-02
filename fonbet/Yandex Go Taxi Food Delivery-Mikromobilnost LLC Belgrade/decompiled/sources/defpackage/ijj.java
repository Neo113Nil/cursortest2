package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ijj {
    public final Context a;
    public final jjj b;
    public VelocityTracker c;
    public float d;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public final int[] h = {Integer.MAX_VALUE, 0};

    public ijj(Context context, jjj jjjVar) {
        this.a = context;
        this.b = jjjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b4, code lost:
    
        if (r4 >= 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x006f, code lost:
    
        if (r10 >= 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MotionEvent motionEvent, int i) {
        char c;
        char c2;
        int i2;
        int i3;
        boolean z;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i4 = this.f;
        int[] iArr = this.h;
        if (i4 == source && this.g == deviceId && this.e == i) {
            z = false;
            c = 1;
            c2 = 0;
        } else {
            Context context = this.a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i5 = Build.VERSION.SDK_INT;
            c = 1;
            c2 = 0;
            if (i5 >= 34) {
                i2 = sg.f(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device != null && device.getMotionRange(i, source2) != null) {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", ConstantDeviceInfo.APP_PLATFORM) : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        i2 = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier != 0) {
                        i2 = resources.getDimensionPixelSize(identifier);
                    }
                }
                i2 = Integer.MAX_VALUE;
            }
            iArr[0] = i2;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i5 >= 34) {
                i3 = sg.e(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 != null && device2.getMotionRange(i, source3) != null) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", ConstantDeviceInfo.APP_PLATFORM) : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        i3 = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 != 0) {
                        i3 = resources2.getDimensionPixelSize(identifier2);
                    }
                }
                i3 = Integer.MIN_VALUE;
            }
            iArr[1] = i3;
            this.f = source;
            this.g = deviceId;
            this.e = i;
            z = true;
        }
        int i6 = iArr[c2];
        VelocityTracker velocityTracker = this.c;
        if (i6 == Integer.MAX_VALUE) {
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.c = null;
                return;
            }
            return;
        }
        if (velocityTracker == null) {
            this.c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.c;
        u631.a(velocityTracker2, motionEvent);
        u631.b(velocityTracker2);
        float c3 = u631.c(velocityTracker2, i);
        jjj jjjVar = this.b;
        float a = jjjVar.a() * c3;
        float signum = Math.signum(a);
        if (z || (signum != Math.signum(this.d) && signum != 0.0f)) {
            jjjVar.c();
        }
        if (Math.abs(a) < iArr[c2]) {
            return;
        }
        float max = Math.max(-r1, Math.min(a, iArr[c]));
        this.d = jjjVar.b(max) ? max : 0.0f;
    }
}
