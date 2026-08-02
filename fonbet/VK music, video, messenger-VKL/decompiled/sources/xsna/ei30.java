package xsna;

import com.vk.core.preference.Preference;
import com.vk.core.view.components.cell.VkCell;
import com.vk.stories.StorySettingsActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ei30 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ei30(boolean z, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                return "file deleted=" + z + "; path=" + ((String) obj);
            default:
                StorySettingsActivity storySettingsActivity = (StorySettingsActivity) obj;
                int i2 = StorySettingsActivity.P;
                int i3 = 1;
                boolean z2 = !z;
                r870.a().b().getClass();
                Preference.f("clips_camera_settings").edit().putBoolean("clips_camera_60_fps", z2).apply();
                nf9.f();
                VkCell vkCell = storySettingsActivity.H;
                if (vkCell == null) {
                    vkCell = null;
                }
                vkCell.setRight(StorySettingsActivity.T1(z2, new ei30(z2, storySettingsActivity, i3)));
                return s3q0.a;
        }
    }
}
