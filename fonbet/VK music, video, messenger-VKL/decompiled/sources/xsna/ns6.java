package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.stories.StorySettingsActivity;
import ru.ok.android.externcalls.sdk.Conversation;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ns6 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ns6(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                BaseVkSearchView baseVkSearchView = (BaseVkSearchView) obj;
                if (z) {
                    baseVkSearchView.z.setVisibility(0);
                } else {
                    f4m.j(baseVkSearchView.z);
                }
                return s3q0.a;
            case 1:
                hj9 hj9Var = (hj9) obj;
                if (!hj9Var.b.a()) {
                    return s3q0.a;
                }
                Conversation conversation = hj9Var.b.getConversation();
                if (conversation == null) {
                    return s3q0.a;
                }
                conversation.getCameraManager().setCameraEnabled(z);
                return s3q0.a;
            case 2:
                com.vk.im.ui.components.contacts.b bVar = (com.vk.im.ui.components.contacts.b) obj;
                jgq jgqVar = bVar.d().k;
                boolean z2 = jgqVar.a;
                jgqVar.getClass();
                bVar.o.onNext(bVar.i(gdj.a(bVar.d(), null, null, null, null, null, false, new jgq(z2, z), IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)));
                io.reactivex.rxjava3.subjects.d<s3q0> dVar = bVar.q;
                s3q0 s3q0Var = s3q0.a;
                dVar.onNext(s3q0Var);
                return s3q0Var;
            default:
                StorySettingsActivity storySettingsActivity = (StorySettingsActivity) obj;
                int i2 = StorySettingsActivity.P;
                boolean z3 = !z;
                ((evl0) storySettingsActivity.z.getValue()).g(z3);
                nf9.f();
                VkCell vkCell = storySettingsActivity.G;
                if (vkCell == null) {
                    vkCell = null;
                }
                vkCell.setRight(StorySettingsActivity.T1(z3, new ns6(storySettingsActivity, z3, 3)));
                return s3q0.a;
        }
    }

    public /* synthetic */ ns6(boolean z, BaseVkSearchView baseVkSearchView) {
        this.b = 0;
        this.c = z;
        this.d = baseVkSearchView;
    }
}
