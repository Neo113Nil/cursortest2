package com.yandex.smartcamera.arscene.ar_core.helpers;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import com.google.ar.core.Session;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/yandex/smartcamera/arscene/ar_core/helpers/DisplayRotationHelper;", "Landroid/hardware/display/DisplayManager$DisplayListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "onResume", "()V", "onPause", "", "width", "height", "onSurfaceChanged", "(II)V", "Lcom/google/ar/core/Session;", "session", "updateSessionIfNeeded", "(Lcom/google/ar/core/Session;)V", "displayId", "onDisplayAdded", "(I)V", "onDisplayRemoved", "onDisplayChanged", "", "viewportChanged", "Z", "viewportWidth", CA20Status.STATUS_USER_I, "viewportHeight", "Landroid/view/Display;", "display", "Landroid/view/Display;", "Landroid/hardware/display/DisplayManager;", "displayManager", "Landroid/hardware/display/DisplayManager;", "smartcam-arscene_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DisplayRotationHelper implements DisplayManager.DisplayListener {
    public static final int $stable = 8;
    private final Display display;
    private final DisplayManager displayManager;
    private boolean viewportChanged;
    private int viewportHeight;
    private int viewportWidth;

    public DisplayRotationHelper(Context context) {
        this.displayManager = (DisplayManager) context.getSystemService("display");
        this.display = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int displayId) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int displayId) {
        this.viewportChanged = true;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int displayId) {
    }

    public final void onPause() {
        this.displayManager.unregisterDisplayListener(this);
    }

    public final void onResume() {
        this.displayManager.registerDisplayListener(this, null);
    }

    public final void onSurfaceChanged(int width, int height) {
        this.viewportWidth = width;
        this.viewportHeight = height;
        this.viewportChanged = true;
    }

    public final void updateSessionIfNeeded(Session session) {
        if (this.viewportChanged) {
            session.setDisplayGeometry(this.display.getRotation(), this.viewportWidth, this.viewportHeight);
            this.viewportChanged = false;
        }
    }
}
