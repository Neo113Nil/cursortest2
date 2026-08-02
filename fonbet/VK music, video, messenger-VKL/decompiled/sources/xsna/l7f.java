package xsna;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.vk.clips.editor.templates.impl.views.main.ClipsTemplateEditorFragment;
import com.vkontakte.android.R;

/* compiled from: ClipsTemplateEditorFragment.kt */
/* loaded from: classes16.dex */
public final class l7f extends View.AccessibilityDelegate {
    public final /* synthetic */ ClipsTemplateEditorFragment a;
    public final /* synthetic */ View b;

    public l7f(ClipsTemplateEditorFragment clipsTemplateEditorFragment, View view) {
        this.a = clipsTemplateEditorFragment;
        this.b = view;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        s8f s8fVar = this.a.Z;
        if (s8fVar == null) {
            s8fVar = null;
        }
        boolean h = s8fVar.h();
        View view2 = this.b;
        accessibilityNodeInfo.setContentDescription(h ? view2.getContext().getString(R.string.clips_template_editor_stop_playback_description) : view2.getContext().getString(R.string.clips_template_editor_start_playback_description));
    }
}
