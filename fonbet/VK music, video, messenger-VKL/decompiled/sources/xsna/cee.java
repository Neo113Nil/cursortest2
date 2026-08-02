package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.vk.clips.design.view.component.video.preview.ClipRectanglePreview;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: ClipsGridRectanglePreviewHolder.kt */
/* loaded from: classes17.dex */
public final class cee extends hk {
    public final /* synthetic */ dee b;

    public cee(dee deeVar) {
        this.b = deeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r0 != null) goto L15;
     */
    @Override // xsna.hk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        CharSequence string;
        tlo0.h hVar;
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        dee deeVar = this.b;
        ClipRectanglePreview.PreviewItem.b primaryLabel = deeVar.getClipPreview().getPrimaryLabel();
        if (primaryLabel != null && (hVar = primaryLabel.a) != null && (string = tlo0.b.a(hVar, view.getContext())) != null) {
            if (string.length() <= 0) {
                string = null;
            }
        }
        string = deeVar.getContext().getString(R.string.accessibility_open_clip);
        view.setContentDescription(string);
    }

    @Override // xsna.hk
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getEventType() == 8;
    }
}
