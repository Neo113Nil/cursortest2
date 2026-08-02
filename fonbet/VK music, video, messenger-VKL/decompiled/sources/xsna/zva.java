package xsna;

import com.vk.stories.StorySettingsActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zva implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zva(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [xsna.j8i, xsna.smb$a] */
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((com.vk.channels.impl.comments.b) obj).q(new g53(6));
                break;
            case 1:
                smb smbVar = (smb) obj;
                smbVar.m = null;
                ?? r0 = smbVar.c;
                if (r0 != 0) {
                    r0.t();
                    break;
                }
                break;
            case 2:
                ((s4f) obj).m = false;
                break;
            default:
                StorySettingsActivity storySettingsActivity = (StorySettingsActivity) obj;
                int i2 = StorySettingsActivity.P;
                storySettingsActivity.V1();
                storySettingsActivity.M = true;
                break;
        }
    }
}
