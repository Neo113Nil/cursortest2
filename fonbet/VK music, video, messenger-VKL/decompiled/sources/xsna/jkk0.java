package xsna;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.vk.clips.design.view.editor.speed.SpeedView;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: SpeedView.kt */
/* loaded from: classes16.dex */
public final class jkk0 extends View.AccessibilityDelegate {
    public final /* synthetic */ SpeedView a;

    public jkk0(SpeedView speedView) {
        this.a = speedView;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        VkText currentMultiplyValue;
        VkText textAfter;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        SpeedView speedView = this.a;
        currentMultiplyValue = speedView.getCurrentMultiplyValue();
        CharSequence text = currentMultiplyValue.getText();
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char charAt = text.charAt(i);
            if (!Character.isLetter(charAt)) {
                sb.append(charAt);
            }
        }
        textAfter = speedView.getTextAfter();
        accessibilityNodeInfo.setContentDescription(wlb0.t(speedView.getContext(), R.string.clips_editor_speed_content_description, sb, textAfter.getText()));
    }
}
