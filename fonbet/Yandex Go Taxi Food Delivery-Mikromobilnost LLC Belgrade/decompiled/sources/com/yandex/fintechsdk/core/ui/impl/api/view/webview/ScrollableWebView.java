package com.yandex.fintechsdk.core.ui.impl.api.view.webview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/yandex/fintechsdk/core/ui/impl/api/view/webview/ScrollableWebView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "lastY", "", "isScrollingUp", "", "onTouchEvent", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Landroid/view/MotionEvent;", "impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public class ScrollableWebView extends WebView {
    private boolean isScrollingUp;
    private float lastY;

    public ScrollableWebView(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r0 != 3) goto L33;
     */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        boolean z = true;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    this.isScrollingUp = event.getY() - this.lastY > 0.0f;
                    boolean canScrollVertically = canScrollVertically(1);
                    boolean canScrollVertically2 = canScrollVertically(-1);
                    boolean z2 = this.isScrollingUp;
                    if ((!z2 || !canScrollVertically2) && (z2 || !canScrollVertically)) {
                        z = false;
                    }
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(z);
                    }
                    this.lastY = event.getY();
                }
            }
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
        } else {
            this.lastY = event.getY();
            ViewParent parent3 = getParent();
            if (parent3 != null) {
                parent3.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(event);
    }
}
