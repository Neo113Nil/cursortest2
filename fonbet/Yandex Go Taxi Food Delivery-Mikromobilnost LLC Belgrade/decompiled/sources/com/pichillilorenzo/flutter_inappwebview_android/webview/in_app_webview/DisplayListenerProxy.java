package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.hardware.display.DisplayManager;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public class DisplayListenerProxy {
    private static final String TAG = "DisplayListenerProxy";
    private ArrayList<DisplayManager.DisplayListener> listenersBeforeWebView;

    private static ArrayList<DisplayManager.DisplayListener> yoinkDisplayListeners(DisplayManager displayManager) {
        return new ArrayList<>();
    }

    public void onPostWebViewInitialization(final DisplayManager displayManager) {
        final ArrayList<DisplayManager.DisplayListener> yoinkDisplayListeners = yoinkDisplayListeners(displayManager);
        yoinkDisplayListeners.removeAll(this.listenersBeforeWebView);
        if (yoinkDisplayListeners.isEmpty()) {
            return;
        }
        int size = yoinkDisplayListeners.size();
        int i = 0;
        while (i < size) {
            DisplayManager.DisplayListener displayListener = yoinkDisplayListeners.get(i);
            i++;
            displayManager.unregisterDisplayListener(displayListener);
            displayManager.registerDisplayListener(new DisplayManager.DisplayListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.DisplayListenerProxy.1
                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayAdded(int i2) {
                    ArrayList arrayList = yoinkDisplayListeners;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((DisplayManager.DisplayListener) obj).onDisplayAdded(i2);
                    }
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayChanged(int i2) {
                    if (displayManager.getDisplay(i2) == null) {
                        return;
                    }
                    ArrayList arrayList = yoinkDisplayListeners;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((DisplayManager.DisplayListener) obj).onDisplayChanged(i2);
                    }
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayRemoved(int i2) {
                    ArrayList arrayList = yoinkDisplayListeners;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((DisplayManager.DisplayListener) obj).onDisplayRemoved(i2);
                    }
                }
            }, null);
        }
    }

    public void onPreWebViewInitialization(DisplayManager displayManager) {
        this.listenersBeforeWebView = yoinkDisplayListeners(displayManager);
    }
}
