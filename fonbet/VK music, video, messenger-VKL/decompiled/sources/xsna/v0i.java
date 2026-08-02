package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.vk.clips.design.view.component.video.preview.ClipRectanglePreview;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: CommunityScheduledClipsGridRectanglePreviewHolder.kt */
/* loaded from: classes5.dex */
public final class v0i extends hk {
    public final /* synthetic */ u0i b;

    public v0i(u0i u0iVar) {
        this.b = u0iVar;
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
        u0i u0iVar = this.b;
        ClipRectanglePreview.PreviewItem.b primaryLabel = u0iVar.getClipPreview().getPrimaryLabel();
        if (primaryLabel != null && (hVar = primaryLabel.a) != null && (string = tlo0.b.a(hVar, view.getContext())) != null) {
            if (string.length() <= 0) {
                string = null;
            }
        }
        string = u0iVar.getContext().getString(R.string.community_scheduled_clip_accessibility);
        view.setContentDescription(string);
    }

    @Override // xsna.hk
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getEventType() == 8;
    }
}
