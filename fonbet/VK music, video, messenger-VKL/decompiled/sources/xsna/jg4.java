package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.core.view.components.button.VkButton;
import com.vk.log.L;
import com.vk.stories.StorySettingsActivity;
import xsna.k840;
import xsna.ph4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg4 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jg4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((ng4) obj).j.b(new ph4.e(true));
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(lh4.a);
                break;
            case 1:
                L.e("Draft removed");
                cuz.a((Context) ((hdo) obj).c.b).c(new Intent("draft").putExtra("type", "draftRemoved"));
                break;
            case 2:
                VkButton vkButton = ((u1a0) obj).l1;
                (vkButton != null ? vkButton : null).setLoading(false);
                break;
            case 3:
                y3a0 y3a0Var = (y3a0) ((x3a0) obj).a;
                if (y3a0Var != null) {
                    y3a0Var.S(false);
                    break;
                }
                break;
            case 4:
                int i2 = StorySettingsActivity.P;
                ((StorySettingsActivity) obj).V1();
                break;
            default:
                ((gzs) obj).invoke();
                break;
        }
    }
}
