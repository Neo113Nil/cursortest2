package xsna;

import com.vk.core.preference.Preference;
import com.vk.core.view.components.cell.VkCell;
import com.vk.stories.StorySettingsActivity;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class dkj0 implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dkj0(StorySettingsActivity storySettingsActivity, boolean z) {
        this.c = z;
        this.d = storySettingsActivity;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                ((izs) obj).invoke(new sx40.q0(z));
                break;
            default:
                StorySettingsActivity storySettingsActivity = (StorySettingsActivity) obj;
                int i2 = StorySettingsActivity.P;
                boolean z2 = !z;
                r870.a().b().getClass();
                Preference.f("clips_camera_settings").edit().putBoolean("camera_grid", z2).apply();
                nf9.f();
                VkCell vkCell = storySettingsActivity.I;
                if (vkCell == null) {
                    vkCell = null;
                }
                vkCell.setRight(StorySettingsActivity.T1(z2, new dkj0(storySettingsActivity, z2)));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ dkj0(izs izsVar, boolean z) {
        this.d = izsVar;
        this.c = z;
    }
}
